
const item = document.querySelector(".redSquare")
const item2 = document.querySelector(".pinkSquare")
const item3 = document.querySelector(".square")
const btn = document.querySelector(".changeBtn")
const btn2 = document.querySelector(".changeBtn2")
const btn3 = document.querySelector(".changeSize")


btn.addEventListener("click", function(){
    item.classList.add("click")
})
btn2.addEventListener("click", function(){
    item2.classList.toggle("changeColorOfSquare", console.log("Color: Skyblue"))
})
btn3.addEventListener("click", function(){
    item3.classList.toggle("active")
})

