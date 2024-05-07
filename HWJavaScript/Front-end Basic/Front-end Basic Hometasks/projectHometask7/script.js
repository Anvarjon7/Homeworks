
// function numbers (a, b) {
//     if(a > b) {
//         return a
//     }else {
//         return b
//     }
// }
// const result = numbers(50, 30)
// console.log(result)

// function getArrayFromRange(a, b) {
//     if (a === b) {
//       return null
//     }
//     let min = a
//     let max = b
//     if (a > b) {
//       min = b
//       max = a
//     }
  
//     const array = []
  
//     for (let i = min; i <= max; i+=2) {
//       array.push(i)
//     }
//     return array
//   }
  
//   console.log(getArrayFromRange(10, 20))
  
// function power(a, b = 2) {
//     return a ** b
// }
// console.log(power(3))
// console.log(power(4, 4))


// function getArg (n) {
//     let sum = 0
//     for ( let i = 0; i <= n; i++) {
//         sum += i
//     } 
//     return sum
// }
// console.log(getArg(20))


// function getOddEven (n, m) {
//     let oddNum = 0
//     let evenNum = 0
//     for(let i = n; i <= m; i++ ) {
//         if (i % 2 === 0) {
//             evenNum += i
//         }else {
//             oddNum += i
//         }
//     }
//     console.log(oddNum)
//     console.log(evenNum)
// }
// getOddEven(3, 23)

function getLongerElem(arr) {
    if(arr.length === 0) {
        return null
    }
    let longerText = arr[0]
    for(let i = 0; i < arr.length; i++) {
        if(arr[i].length > longerText.length) {
            longerText = arr[i]
        }
    }
    return longerText
}
const arr = ['helloo', 'world', 'company', 'lessons']
console.log(getLongerElem(arr))