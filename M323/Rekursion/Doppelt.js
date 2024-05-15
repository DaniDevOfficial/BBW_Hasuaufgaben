function multiTable(rows, columns, currentRow = 1, currentCol = 1) {
  if (currentRow > rows) {
    return;
  }

  if (currentCol > columns) {
    console.log(""); 
    multiTable(rows, columns, currentRow + 1, 1);
  } else {
    const result = currentRow * currentCol;
    process.stdout.write(`${result}\t`);
    multiTable(rows, columns, currentRow, currentCol + 1);
  }
}

multiTable(11, 10);
