let num = 1;
for (i = 1; i <= 3; i++) {

    num = num * i
}

console.log(num)

function recursive(n) {

    if (n == 1) {
        return n
    } else {
        return n * recursive(n - 1)
    }

}

let output = recursive(5)
console.log(output)

// search Array index for specific item
let arr = [1, 2, 3, 4, 5]
let searchingNum = 1
function searchArray(n) {

    if(n < 0){
        return "Item was not found in Array"
    }
    if (arr[n] == searchingNum){
        return `Der Index von dem gesuchten Item ist: ${n} `
    }
    return searchArray(n - 1)

}
let outputSearch = searchArray(arr.length)

console.log(outputSearch)

// Star Tree 

function Tree (n, maxN) {

    if(n == maxN){
        return "*".repeat(maxN)
    } else {
        console.log("*".repeat(n))
        return Tree(n+1, maxN)
    }
} 
let amountOfMax = 5
let OutputTree = Tree(1, amountOfMax)
console.log(OutputTree)