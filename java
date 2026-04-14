1.
const div = document.createElement("div")
div.textContent = "div"

const xd = document.querySelector("body")
xd.appendChild(div)

2.
const czerwony = document.querySelector("h1")
czerwony.style.color = "red"

3.
const obrazek = document.querySelector("img")
obrazek.src = "https://loremflickr.com/566/320/dog"

4.
const paragraf = document.querySelector("main")
const paragrafRemove = paragraf.querySelector("p")
paragraf.removeChild(paragrafRemove)

5.
const dih = document.createElement("div")
dih.textContent = "div"
dih.classList.add('nowak');

const cialo = document.querySelector("body")
cialo.appendChild(div)


6.
const li = document.createElement("li")
li.textContent = "li"
li.classList.add('active');

const activeListItem = document.querySelector('.active');
activeListItem.classList.remove('.active');


const cielesne = document.querySelector("body")
cielesne.appendChild(li)

7.
const button = document.querySelector("button")
button.textContent = "Przycisk!"

8.
const input = document.querySelector('input');
input.value = '___________________'

9.
const newListElement = document.createElement('li');
const unorderedList = document.querySelector('ul');
unorderedList.appendChild(newListElement);
newListElement.textContent = "div"

10.
const czerwony = document.querySelector("body")
czerwony.style.backgroundColor = "blue"

11.
const newDiv = document.querySelector('div');
newDiv.classList.add('new-div');
const header = document.querySelector('header');
header.appendChild(newDiv);

12.
const h1 = document.createElement("h1")
h1.textContent = "h1"

const ciala = document.querySelector("body")
ciala.appendChild(h1)

const headers = document.querySelectorAll('h1');
if (headers.length > 1) {
  headers[1].style.color = 'green';
}

13.
const obrazek = document.querySelector("img")
obrazek.dataset.src = "https://loremflickr.com/566/320/dog"
obrazek.removeAttribute('src');

14.
const paragraphs = document.querySelectorAll('p');
for (let i = 1; i < paragraphs.length; i += 2) {
  paragraphs[i].style.display = 'none';
}

15.
const listItems = document.querySelectorAll('li');
if (listItems.length >= 3) {
  const thirdListItem = listItems[2];
  thirdListItem.classList.add('selected');
}

16.
function addElement() {
  var list = document.querySelector('details ul');
  var newItem = document.createElement('li');
  newItem.textContent = 'Nowy element';
  list.insertBefore(newItem, list.firstChild);
}

17.
function removeElements() {
  var listItems = document.querySelectorAll('details > ul > li');
  for (var i = 1; i < listItems.length; i += 2) {
    listItems[i].remove()
  }
}

18.
function addParagraph(tekst) {
  event.preventDefault();
  var text = document.querySelector('#newParagraph').value;
  var newParagraph = document.querySelector('details > section > p');
  newParagraph.textContent = text;
  document.querySelector('section').appendChild(newParagraph);
  document.querySelector('#newParagraph').value = ' '
  }




// ZADANIA V2
1.
const title = document.querySelector('.title')
title.textContent = 'DOM Training Arena'

2.
const item = document.querySelector('.nav-item a')
item.firstChild.textContent = 'Start'

3.
const lis = document.querySelector(".menu-list li")
const text = lis.textContent;
console.log(text);

4.
const dik = document.querySelector(".card.highlight")
dik.classList.add('active');

5.
const karta = document.querySelector(".card .card-header")
karta.textContent = 'Zmieniona karta'

6.
const dodatek = document.querySelector("details .info-text")
dodatek.textContent = 'Jan Paweł 2 papież polak'

7.
const imie = document.querySelector("label input")
imie.setAttribute("value", 'Jan')
const cos = imie.value
console.log(cos)

8.
const wybierz = document.querySelector(".select")
wybierz.value = "de"

9.
const content = document.querySelector(".checkbox")
content.checked = true

10.
const diki = document.createElement("class")
diki.classList.add('highlight');

const bog = document.querySelector(".deep-text")
bog.appendChild(div)

11.
const divi = document.createElement("li")
divi.textContent = "Nowy Element"
const cialas = document.querySelector("#dynamic-list")
cialas.appendChild(div)

12.
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

13.
const create = document.createElement("div class ='card'")
const baka = document.querySelector(".cards-section")
baka.appendChild(create)

14.
const deb = document.createElement(".box")
deb.textContent = "Nowy Element"
const moge = document.querySelector(".boxes-container")
moge.appendChild(div)

15.
const para = document.createElement("p")
para.textContent = "Jan Paweł II Papież Polak"
const area = document.querySelector(".dynamic-area")
area.appendChild(p)

16.
function addElement() {
  var list = document.querySelector('#insertion-container');
  var newItem = document.createElement('.box');
  newItem.textContent = 'Nowy element';
  list.insertBefore(newItem, list.firstChild);
}

17.
const listy = document.createElement("li")
listy.textContent = "Nowy Element"
const dynamic = document.querySelector("#dynamic-list")
dynamic.prepend(list)

18.
const s = document.createElement("span")
const karta = document.querySelectorAll(".card-header")
karta.appendChild(s)

19.
const pa = document.createElement("p")
pa.textContent = "Jan Paweł II Papież Polak"
const details = document.querySelector("details")
details.appendChild(pa)
20.
const przycisk = document.createElement("button")
przycisk.textContent = "przycisk"
const button = document.querySelector(".playground")
button.append(przycisk)

21.
const shit = document.querySelectorAll(".removable")
for (let element of shit ){
  element.remove()
}

22.
const kit = document.querySelector("#dynamic-list > li:nth-last-child(1)")
const kat = document.querySelector("#dynamic-list")
kat.removeChild(kit)

23.
const card = document.querySelector(".card[data-id='1']")
card.remove()

24.
const boxerase = document.querySelectorAll(".box")
const wrap = document.querySelector("#insertion-container")
boxerase.forEach((elements)=>
wrap.remove(boxerase))

25.
const detale = document.querySelector("details")
detale.remove()

26.
const paw = document.querySelectorAll("input")
paw.forEach(inputs => {
  console.log(inputs.name)
})

27.
const maile = document.querySelector("input[name='email']")
maile.name = "user-email"

28.
const jasne = document.querySelector(".card-highlight")
jasne.setAttribute('data-test', 123)

29.
const menus = document.querySelectorAll(".menu-list li")
menus.forEach((elementy)=>
elementy.textContent = "Zmieniono")

30.
const kirk = document.querySelector(".card")
kirk.classList.add('processed');
const dwua = document.querySelector(".card")
dwua(data.status) = "done"
  
zad.31
const add_item_btn = document.querySelector('#add-item-btn')
add_item_btn.addEventListener('click', () => {
  const item_input = document.querySelector('#item-input').value

  const li = document.createElement('li')
  li.textContent = item_input

  document.querySelector('#dynamic-list').appendChild(li)
  document.querySelector('#item-input').value = ''
})

//zad 32
const item_input = document.querySelector('#item-input')

item_input.addEventListener('input', (event) => {
  console.log(event.target.value)
})

//zad 33
const insert_before_btn = document.querySelector('#insert-before-btn')

insert_before_btn.addEventListener('click', () => {
  const box = document.createElement('div')
  box.classList.add('box')
  const insertion_container = document.querySelector('#insertion-container')
  insertion_container.prepend(box)
})

//zad 35

const removable = document.querySelectorAll('.removable')

for(let element of removable){
  element.addEventListener('click', (event) => {
    event.target.remove();
  })
}

//zad 39

const cards = document.querySelectorAll('.card')

for (let card of cards){
  card.addEventListener('mouseover', (event) => {
    event.target.style.backgroundColor = 'red'
  })

  card.addEventListener('mouseout', (event) => {
    event.target.style.backgroundColor = 'transparent'
  })
}

//zad 40
const input = document.querySelector("input[name='name']")

input.addEventListener('keydown', (event) => {
  if (event.key === 'Enter'){
    console.log(event.target.value)
  }
})

  
