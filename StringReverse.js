function reverseString(str) {
  if (str === "") {
    return "";
  } else {
    return reverseString(str.substr(1)) + str.charAt(0);
  }
}

const input = "Hello World"
const reversed = reverseString(input);
console.log("Reversed string:", reversed);
