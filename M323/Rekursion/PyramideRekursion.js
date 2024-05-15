const val = 20

 function Pyramid(height) {
  const maxNum = val;

  if (height > 0) {
    let amountOfStars = maxNum - height + 1;
    console.log("*".repeat(amountOfStars));
    Pyramid(height - 1);
  }
}

function reversePyramid(width) {  
  if (  width > 0  ) {
    console.log("*".repeat(width))
    reversePyramid(width - 1)
  }

}

Pyramid(val)
reversePyramid(val)