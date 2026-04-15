
// 1.
const title = document.querySelector('.title')
title.textContent = 'DOM Training Arena'

// 2.
const item = document.querySelector('.nav-item a')
item.firstChild.textContent = 'Start'

// 3.
const lis = document.querySelector(".menu-list li")
const text = lis.textContent;
console.log(text);

// 4.
const dik = document.querySelector(".card.highlight")
dik.classList.add('active');

// 5.
const karta = document.querySelector(".card .card-header")
karta.textContent = 'Zmieniona karta'

// 6.
const dodatek = document.querySelector("details .info-text")
dodatek.textContent = 'Jan Paweł 2 papież polak'

// 7.
const imie = document.querySelector("label input")
imie.setAttribute("value", 'Jan')
const cos = imie.value
console.log(cos)

// 8.
const wybierz = document.querySelector(".select")
wybierz.value = "de"

// 9.
const content = document.querySelector(".checkbox")
content.checked = true

// 10.
const diki = document.createElement("class")
diki.classList.add('highlight');

const bog = document.querySelector(".deep-text")
bog.appendChild(div)

// 11.
const divi = document.createElement("li")
divi.textContent = "Nowy Element"
const cialas = document.querySelector("#dynamic-list")
cialas.appendChild(div)

// 12.
const li = document.createElement("li")
li.textContent = "Nowy Element"
const li2 = document.createElement("li")
li2.textContent = "Nowy Element"
const li3 = document.createElement("li")
li3.textContent = "Nowy Element"
const goi = document.querySelector(".menu-list")
goi.appendChild(li)
goi.appendChild(li2)
goi.appendChild(li3)

// 13.
const create = document.createElement("div class ='card'")
const baka = document.querySelector(".cards-section")
baka.appendChild(create)

// 14.
const deb = document.createElement(".box")
deb.textContent = "Nowy Element"
const moge = document.querySelector(".boxes-container")
moge.appendChild(div)

// 15.
const para = document.createElement("p")
para.textContent = "Jan Paweł II Papież Polak"
const area = document.querySelector(".dynamic-area")
area.appendChild(p)

// 16.
function addElement() {
  var list = document.querySelector('#insertion-container');
  var newItem = document.createElement('.box');
  newItem.textContent = 'Nowy element';
  list.insertBefore(newItem, list.firstChild);
}

// 17.
const listy = document.createElement("li")
listy.textContent = "Nowy Element"
const dynamic = document.querySelector("#dynamic-list")
dynamic.prepend(list)

// 18.
const s = document.createElement("span")
const karta = document.querySelectorAll(".card-header")
karta.appendChild(s)

// 19.
const pa = document.createElement("p")
pa.textContent = "Jan Paweł II Papież Polak"
const details = document.querySelector("details")
details.appendChild(pa)
// 20.
const przycisk = document.createElement("button")
przycisk.textContent = "przycisk"
const button = document.querySelector(".playground")
button.append(przycisk)

// 21.
const shit = document.querySelectorAll(".removable")
for (let element of shit ){
  element.remove()
}

// 22.
const kit = document.querySelector("#dynamic-list > li:nth-last-child(1)")
const kat = document.querySelector("#dynamic-list")
kat.removeChild(kit)

// 23.
const card = document.querySelector(".card[data-id='1']")
card.remove()

// 24.
const boxerase = document.querySelectorAll(".box")
const wrap = document.querySelector("#insertion-container")
boxerase.forEach((elements)=>
wrap.remove(boxerase))

// 25.
const detale = document.querySelector("details")
detale.remove()

// 26.
const paw = document.querySelectorAll("input")
paw.forEach(inputs => {
  console.log(inputs.name)
})

// 27.
const maile = document.querySelector("input[name='email']")
maile.name = "user-email"

// 28.
const jasne = document.querySelector(".card-highlight")
jasne.setAttribute('data-test', 123)

// 29.
const menus = document.querySelectorAll(".menu-list li")
menus.forEach((elementy)=>
elementy.textContent = "Zmieniono")

// 30.
const kirk = document.querySelector(".card")
kirk.classList.add('processed');
const dwua = document.querySelector(".card")
dwua(data.status) = "done"
  
// 31.
const add_item_btn = document.querySelector('#add-item-btn')
add_item_btn.addEventListener('click', () => {
  const item_input = document.querySelector('#item-input').value

  const li = document.createElement('li')
  li.textContent = item_input

  document.querySelector('#dynamic-list').appendChild(li)
  document.querySelector('#item-input').value = ''
})

// 32.
const item_input = document.querySelector('#item-input')

item_input.addEventListener('input', (event) => {
  console.log(event.target.value)
})

// 33.
const insert_before_btn = document.querySelector('#insert-before-btn')

insert_before_btn.addEventListener('click', () => {
  const box = document.createElement('div')
  box.classList.add('box')
  const insertion_container = document.querySelector('#insertion-container')
  insertion_container.prepend(box)
})
// 34.
const add_box_btn = document.querySelector("#add-box-btn")
add_box_btn.addEventListener("click", () => {
  const box = document.querySelector(".boxes-container")
  box.classList.add("box")
  const insertion_conteiner =  document.querySelector(".boxes-container")
  insertion_conteiner.prepend(box)
})
// 35.
const removable = document.querySelectorAll(".removable")

for(let element of removable){
  element.addEventListener("click", (event)=> {
    event.target.remove();
  })
}


const removable = document.querySelectorAll('.removable')

for(let element of removable){
  element.addEventListener('click', (event) => {
    event.target.remove();
  })
}
// 37.
const select = document.querySelector(".select")
select.addEventListener("change", (event) => {
  console.log(event.target.value)
})

// 38.

// 39.
const cards = document.querySelectorAll('.card')

for (let card of cards){
  card.addEventListener('mouseover', (event) => {
    event.target.style.backgroundColor = 'red'
  })

  card.addEventListener('mouseout', (event) => {
    event.target.style.backgroundColor = 'transparent'
  })
}

// 40.
const input = document.querySelector("input[name='name']")

input.addEventListener('keydown', (event) => {
  if (event.key === 'Enter'){
    console.log(event.target.value)
  }
})
