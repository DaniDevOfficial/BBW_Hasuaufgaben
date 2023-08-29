function fibonacci(n) {
    if (n <= 1) {
      return n;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
  
  const value = 10;
  console.log(`First ${value}  Fibonacci numbers: `);
  for (let i = 0; i < value; i++) {
    console.log(fibonacci(i));
  }
  