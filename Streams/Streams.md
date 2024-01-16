### Funktionales Programmieren mit Java Streams:

#### 1. **Streams auf Collection von Objekten anwenden:**
   - Streams bieten eine moderne und funktionale Möglichkeit, Operationen auf Datenstrukturen durchzuführen. Sie können auf Collection von Objekten angewendet werden, wie z.B. auf Listen.

   Beispiel:

   ```java
   List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

   // Stream erstellen
   Stream<String> nameStream = names.stream();

   // Beispiel: Anwendung der forEach-Methode auf dem Stream
   nameStream.forEach(System.out::println);
   ```

#### 2. **Methoden von Streams erklären und anwenden:**

   - **`Filter`:** Filtert Elemente basierend auf einer Bedingung.

     Beispiel:

     ```java
     List<String> filteredNames = names.stream()
                                      .filter(name -> name.startsWith("A"))
                                      .collect(Collectors.toList());
     ```

   - **`Map`:** Transformiert jedes Element des Streams.

     Beispiel:

     ```java
     List<Integer> nameLengths = names.stream()
                                     .map(String::length)
                                     .collect(Collectors.toList());
     ```

   - **`Collect`:** Sammelt die Elemente des Streams in einer bestimmten Form, z.B. in einer Liste.

     Beispiel:

     ```java
     List<String> collectedNames = names.stream()
                                       .collect(Collectors.toList());
     ```

   - **`Reduce`:** Reduziert die Elemente des Streams zu einem einzigen Wert.

     Beispiel:

     ```java
     Optional<String> concatenatedNames = names.stream()
                                              .reduce((name1, name2) -> name1 + " - " + name2);
     ```

   - **`Optional`:** Eine spezielle Klasse für potenziell fehlende Werte, die dazu dient, NullPointerExceptions zu vermeiden.

     Beispiel:

     ```java
     Optional<String> firstElement = names.stream().findFirst();
     ```

#### 3. **Interpretation einer bestehenden Umsetzung mit Streams:**
   Bei der Interpretation einer bestehenden Umsetzung mit Streams sollten Sie jeden Schritt durchgehen und verstehen, was bei jedem Schritt passiert:

   Beispiel:

   ```java
   List<String> result = names.stream()
                              .filter(name -> name.length() > 3)
                              .map(String::toUpperCase)
                              .collect(Collectors.toList());
   ```

   - **Input:** Liste von Strings (`names`).
   - **Schritt 1 (`filter`):** Filtert Namen mit einer Länge größer als 3.
   - **Schritt 2 (`map`):** Wandelt jeden verbleibenden Namen in Großbuchstaben um.
   - **Schritt 3 (`collect`):** Sammelt die verarbeiteten Namen in einer Liste.
   - **Output:** Liste von Namen mit einer Länge größer als 3, in Großbuchstaben.

Dieses Beispiel zeigt die Verwendung von `filter`, `map` und `collect` in einem Stream, um eine Liste von Namen zu filtern und zu transformieren. Es ist wichtig, jeden Schritt im Stream zu verstehen, um die Gesamtfunktionalität zu begreifen.
