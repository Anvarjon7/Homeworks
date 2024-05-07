// const item = document.querySelector(".numbers")
// for(let i = 100; i >= 50; i-=10) {
//     item.insertAdjacentHTML("afterbegin", `<p>${i}</p>`)
// }


// const arr = ["c++", "php", "python", "java", "javascript"]
// const elemDiv = document.querySelector(".strings_container")
// for (let i = 0; i < arr.length; i++) {
//     elemDiv.insertAdjacentHTML("beforeend", `<p>${arr[i]}</p>`)
// }

const objects = [
    {
        first_name: "Jakub",
        last_name: "Ahmedov",
        age: 20
    },
    {
        first_name: "Anwar",
        last_name: "Azimov",
        age: 22
    },
    {
        first_name: "Abror",
        last_name: "Umarov",
        age: 15
    },
    {
        first_name: "David",
        last_name: "Wick",
        age: 30
    },
    {
        first_name: "Musa",
        last_name: "Aliev",
        age: 16
    }
]
const addObj = document.querySelector(".users_container")
for (let i = 0; i < objects.length; i++) {
    if(objects[i].age >= 18) {
        addObj.insertAdjacentHTML("afterbegin", `<p>${objects[i].first_name}</p> <p>${objects[i].last_name}</p> <p>${objects[i].age}</p>`)
    }
}