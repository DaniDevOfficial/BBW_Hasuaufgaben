function Dani(currentNumber, numberFunction, sum) {
    if (currentNumber < 0) {
        console.log(sum);
    } else {
        sum = numberFunction - currentNumber + sum;
        currentNumber = currentNumber - 1;
        Dani(currentNumber, numberFunction, sum);
    }
}

Dani(4, 4, 0);
