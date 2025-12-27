
import { render, screen } from '@testing-library/react';
import App from './App';

test('renders clothing store heading', () => {
  render(<App />);
  const heading = screen.getByText(/Clothing Store/i);
  expect(heading).toBeInTheDocument();
});
