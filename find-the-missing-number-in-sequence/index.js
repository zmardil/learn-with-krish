const findMissingNumber = (array) => {
    // min = array[0];
    // max = array[array.length - 1];

    /** 
     * If the start & end numbers are different
     * Alternate: for loop - 0(n) 
     */
    max = Math.max(...array);
    min = Math.min(...array); 

    // Summation without the missing value
    sum = 0;
    for(let number of numberSeq) sum += number;

    // Summation with the missing value
    trueSum = Math.floor((max - min + 1) * (min + max) / 2);

    return trueSum - sum;
}

numberSeq = [21,25,29,28,22,24,27,26,30];

console.log(findMissingNumber(numberSeq));
