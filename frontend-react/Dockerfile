# -------- Build Stage --------
FROM node:18-bullseye AS build
WORKDIR /app

COPY package.json package-lock.json ./
RUN npm install

# 🔑 FIX EXECUTION PERMISSION
RUN chmod 777 node_modules/.bin/react-scripts

COPY . .
RUN npm run build

# -------- Runtime Stage --------
FROM nginx:alpine
COPY --from=build /app/build /usr/share/nginx/html

EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
