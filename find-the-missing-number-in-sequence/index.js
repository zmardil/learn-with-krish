const findMissingNumber = (array, actualLength) => {
    
    if(actualLength - array.length != 1) return null;
    
    // const min = array[0];
    // const max = array[array.length - 1];
    
    const max = Math.max(...array);
    const min = Math.min(...array); 
    
    // Summation without the missing value
    let sum = 0;
    for(let number of array) sum += number;
    
    // Summation with the missing value
    const trueSum = Math.floor((max - min + 1) * (min + max) / 2);
    
    // If the start & end value are missing
    if(trueSum - sum == 0) {
        return [min - 1, max + 1];
    } else {
        return trueSum - sum;
    }
}

const log = (output) => console.log(Array.isArray(output) ? `${output[0]} or ${output[1]}` : output);

const numberSeq = [21, 25, 29, 28, 22, 24, 27, 26, 30];

log(findMissingNumber(numberSeq, 10));
log(findMissingNumber([23, 25, 29, 28, 22, 24, 27, 26, 30], 10));
log(findMissingNumber([21, 25, 29, 28, 22, 24, 27, 26, 23], 10));
