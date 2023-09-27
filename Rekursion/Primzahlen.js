function nextNumber(n, current = 2, primes = []) {
    if (current > n) {
      return primes;
    }
  
    let isPrime = true;
    for (let i = 2; i <= Math.sqrt(current); i++) {
      if (current % i === 0) {
        isPrime = false;
        break;
      }
    }
  
    if (isPrime) {
      primes.push(current);
    }
  
    return nextNumber(n, current + 1, primes);
  }
  
  const n = 50;
  const primeNumbers = nextNumber(n);
  
  console.log(primeNumbers);
  