
# Wie die Sortierun in Java funktioniert
Autor: David Bischof

## Die Natural Order einer Klasse in Java

In Java wird die Natural Order einer Klasse beim Sortieren durch die erstellen eines `Comparable` Interface erreicht. Hier deffiniert das `Comparable` Interface  die Methode `compareTo`, die angibt, wie Objekte der Klasse miteinander verglichen werden sollten. Dies hilft dabei die Natural Order zu erreichen
<br />
<br />

### Beispiel: Klasse `Person`

Hier ein Beispiel mit der Klasse `Person`. Diese Klasse hat Attribute für den Namen und das Alter. Die Klasse erstellt ein `Comparable` Interface, um eine angepasste Natural Order zu ermöglichen.

```java
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    // Logic

    @Override
    public int compareTo(Person otherPerson) {

        return this.name.compareTo(otherPerson.name);
        // Hier vergleich basierend auf dem namen der Person
    }

  
}

```

Nehmen wir an wir haben diese Daten:
````java
List<Person> persons = new ArrayList<>();
persons.add(new Person("Bob", 25));
persons.add(new Person("Charlie", 35));
persons.add(new Person("Alice", 30));
persons.add(new Person("Jake", 31));
persons.add(new Person("Batuan", 69));

// Liste mit personen Sortieren und das in die Natural order
Collections.sort(persons);
````

Wenn wir dies nun Sortern erhalten wir folgende reihenfolge: 
1. Alice
2. Batuan
3. Bob
4. Charlie
5. Jake

 Das ist deshalb, da wir zufor die natural order mit dem namen definiert haben und nun alle Personen nach dem Namen und ABC sortiert werden. Wir könnent auch nach Alter sortieren, wobei wir den return zu: `return Integer.compare(this.age, otherPerson.age);` anpassen müssten. Dabei hätten wir dann dementsprechend folgende Resultate: 
1. Bob (25 Jahre alt)
2. Alice (30 Jahre alt)
3. Jake (31 Jahre alt)
4. Charlie (35 Jahre alt)
5. Batuan(69 Jahre alt) 

Dies zeigt uns genau, wie dei Natural Order definiert und wie mit dieser Sortiert werden kann. (Für das Sortieren mit IDs sehr wichtig).

## Reverse Order in Java

Wie der Name `Reverse Order` schon Verraten könnte, handelte es sich hier um die umgedrehte `Normal Order`. Um dies Zu erreichen kann man entweder die `Collections.reverseOrder()` Methode verwenden oder die `Comparator.reverseOrder()` Methode zusammen mit der `Collections.sort()` Methode un dieses Ziel zu erreichen. 

### Beispiel: Klasse `Person`


Gegeben ist wieder die `Natural Order` von oben und wir müssen nur das sort verändern:

````Java
// Hier verwenden wir Collections.sort
Collections.sort(persons, Collections.reverseOrder());

// und hier Comparator.reverseOrder()
persons.sort(Comparator.reverseOrder());

````

Diese Beiden Sorts geben den Selben Folgenden Output:

1. Jake (31 Jahre alt)
2. Charlie (35 Jahre alt)
3. Bob (25 Jahre alt)
4. Batuan (69 Jahre alt)
5. Alice (30 Jahre alt)

Dies Kann man mit dem Obrigen vergleichen und Feststellen, dass es einfach umgedreht wurde.

## Wie Java Sortiert

In Java kann man mit verschiedensten Arten verschiedenste Dinge Sortieren. Hier sind die Wichtigsten:

1. Natural und Reverse Order mit `Comparable`
2. Benutzerdefinierte Ordnung mit `Comparators`
3. `Array.sort` für Arrays


Das erste Verfahren haben wir weiter Oben schon genauer Angeschaut nun zu den Anderen

### Benutzerdefinierte Ordnung mit `Comparators`

````Java
List<Person> persons = // Von oben

// Sortieren nach dem Alter in absteigender Reihenfolge
persons.sort(Comparator.comparingInt(Person::getAge).reversed());

````

Dies ermöglicht ein Flexibles und schnelles sortieren Von Daten. Dies ist nur ein sehr einfaches Beispiel `Comparators` können auch für benuzerdefinierte Vergleiche verwendet werden. Die `Collections.sort` Methode und die `List.sort` Methode mit einem spezifischen Comparator-Objekt können verwendet werden, um eine Liste zu sortieren.

### `Array.sort` für Arrays

Für Arrays kann die Arrays.sort-Methode verwendet werden. Sie verwendet die "Dual-Pivot Quicksort" Algorythmus für primitive Datentypen und den "TimSort"-Algorithmus für Objekte.

````Java


int[] numbers = // ...

Arrays.sort(numbers);
`````

## Die Logik Dahinter


Hier werde ich nur das Sortieren eines Arrays Darstellen. 
### Bubble Sort
<br />

![Bubble Sort Diagramm](https://www.computersciencebytes.com/wp-content/uploads/2016/10/bubble_sort.png)


Wie mann gut im Diagramm sehen kann, überprüft Bubble sort ob die Zahl auf dem momentanen Platzt grösser ist als die auf dem eins weiteren Platz. Falls dies der Fall ist wird diese Zahl auf diesen Platz gelegt und dann zum nächsten weitergegeangen. Nach dem Ersten durchgang ist mindestens die Grössste Zahl sortiert usw.

### TimSort

Comparable verwendent einen Speziel für Java Erstelleten Algorithmus names TimSort, der jedoch relativ Komplex und dadurch auch effizienter als Bubble sort ist und ich diesen leider nicht erklären kann. 

## Zusammenfassung

In Java können verschiedene `Sortieralgorithmen` je nach Bedarf verwendet werden. Die Natural Order von Objekten wird durch das Implementieren des `Comparable` Interfaces und die Definition der `compareTo` Methode erreicht. Benutzerdefinierte Ordnungen können mithilfe von `Comparators` erstellt werden. Für Arrays gibt es die `Arrays.sort` Methode, welche den `TimSort` Algorithmus für Objekte und den `Dual-Pivot Quicksort` Algorithmus für primitive Datentypen verwendet.
