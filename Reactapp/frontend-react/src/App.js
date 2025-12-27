
import React, { useEffect, useState } from 'react';

function App() {
  const [clothes, setClothes] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/clothes")
      .then(res => res.json())
      .then(data => setClothes(data));
  }, []);

  return (
    <div style={{padding:'20px'}}>
      <h1>Clothing Store</h1>
      <ul>
        {clothes.map(item => (
          <li key={item.id}>
            {item.name} - ₹{item.price}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
