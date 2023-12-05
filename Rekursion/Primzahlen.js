let Primes = []
function nextNumber(n, primes = []) {
  if (n == 1) {
    return [1, ...primes];
  }

  if (checkIfPrime(n, n))
    return [...nextNumber(n - 1, primes), n];
  return nextNumber(n - 1, primes);
}

function checkIfPrime(n, current) {
  if (n == current) {
    return checkIfPrime(n - 1, current)
  }
  if (n === 1) {
    return true;
  }
  if (current % n === 0) {
    return false;
  }
  return checkIfPrime(n - 1, current);
}
const n = 10;
const primeNumbers = nextNumber(n);

console.log(primeNumbers);
