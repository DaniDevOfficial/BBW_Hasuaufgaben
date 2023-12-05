function reverseString(str) {
  if (str === "") {
    return "";
  }
  return reverseString(str.substr(1)) + str.charAt(0);
}

const input = "123"
const reversed = reverseString(input);
console.log(reversed);
