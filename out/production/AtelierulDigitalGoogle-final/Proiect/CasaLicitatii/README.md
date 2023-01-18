# CasaLicitatii

Acest program implementeaza design pattern-ul `Iterator` pentru a simula o casa de licitatii. Programul permite cumpararea unuia sau mai multe obiecte, iar apoi se afiseaza lista actualizata de obiecte ramase.

## Clasa: Item

In interfata `Item` sunt definite 2 metode, `getName()` si `getPrice()`.

## Clasa: CasaLicitatii

Clasa `CasaLicitatii` implementeaza interfata `Iterable<Item>` si foloseste un `ArrayList` pentru a stoca obiecte de tipul `Item`. Metoda `addItem(Item item)` este folosita pentru a adauga un obiect la licitatie, metoda `removeItem(Item item)` este folosita pentru a elimina un obiect de la licitatie, metoda `purchaseItem(Item item)` este utilizata pentru cumpararea unui obiect de la licitatie si afiseaza de asemenea numele si pretul obiectului cumparat.

Metoda `iterator()` este folosita pentru a returna un obiect de tipul `Iterator` pentru array-ul de elemente, permitand obiectelor sa fie iterate cu ajutorul unei structuri repetitive de tip `for`.

## Clasa: Tablou si Sculptura

Clasele `Tablou` si `Sculptura` implementeaza interfata `Item` si implementeaza propriile metode `getName()` si `getPrice()`.

## Clasa: Main

In clasa Main se realizeaza testarea.
