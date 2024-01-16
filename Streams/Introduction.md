### **Functional Interfaces und deren Unterschiede:**

#### Anzahl Argumente/Parameter, Returnwert:

1. **`Consumer<T>`:**
   - Akzeptiert ein Argument (Typ `T`).
   - Rückgabewert ist `void`.

2. **`Function<T, R>`:**
   - Akzeptiert ein Argument (Typ `T`).
   - Gibt einen Wert zurück (Typ `R`).

3. **`Supplier<T>`:**
   - Akzeptiert keine Argumente.
   - Gibt einen Wert zurück (Typ `T`).

4. **`Predicate<T>`:**
   - Akzeptiert ein Argument (Typ `T`).
   - Gibt einen booleschen Wert zurück.

5. **`BinaryOperator<T>`:**
   - Akzeptiert zwei Argumente (Typ `T`).
   - Gibt einen Wert zurück (Typ `T`).

6. **`Comparator<T>`:**
   - Akzeptiert zwei Argumente (Typ `T`) für den Vergleich.
   - Gibt einen Vergleichsint-Wert zurück.

#### Java Interfaces:

- **`Consumer<T>`:** `void accept(T t)`
- **`Function<T, R>`:** `R apply(T t)`
- **`Supplier<T>`:** `T get()`
- **`Predicate<T>`:** `boolean test(T t)`
- **`BinaryOperator<T>`:** `T apply(T t1, T t2)`
- **`Comparator<T>`:** `int compare(T o1, T o2)`

### Auswahl von Functional Interfaces:

- **Consumer:** Wenn Sie ein Argument akzeptieren und keine Rückgabe benötigen, z.B., zum Drucken von Daten.

    Beispiel:
    ```java
    Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
    printUpperCase.accept("hello");
    ```

- **Function:** Wenn Sie ein Argument akzeptieren und einen Wert zurückgeben, z.B., für Berechnungen oder Transformationen.

    Beispiel:
    ```java
    Function<Integer, String> convertToString = i -> "Number: " + i;
    System.out.println(convertToString.apply(42));
    ```

- **Supplier:** Wenn Sie keine Argumente haben und einen Wert bereitstellen, z.B., zum Erzeugen von Instanzen.

    Beispiel:
    ```java
    Supplier<Double> getRandomNumber = () -> Math.random();
    System.out.println(getRandomNumber.get());
    ```

- **Predicate:** Wenn Sie ein Argument überprüfen und einen booleschen Wert zurückgeben, z.B., für Bedingungen.

    Beispiel:
    ```java
    Predicate<Integer> isEven = n -> n % 2 == 0;
    System.out.println(isEven.test(6)); // true
    ```

- **BinaryOperator:** Wenn Sie zwei Werte desselben Typs kombinieren und einen Wert desselben Typs zurückgeben möchten.

    Beispiel:
    ```java
    BinaryOperator<Integer> add = (a, b) -> a + b;
    System.out.println(add.apply(3, 4)); // 7
    ```

- **Comparator:** Wenn Sie die Reihenfolge von Elementen vergleichen müssen.

    Beispiel:
    ```java
    Comparator<String> stringLengthComparator = (s1, s2) -> s1.length() - s2.length();
    System.out.println(stringLengthComparator.compare("apple", "banana")); // -3
    ```

### Warum Functional Interfaces Methoden vorsehen:

Functional Interfaces definieren eine einzige abstrakte Methode, die durch Lambda-Ausdrücke implementiert wird. Dies ermöglicht die Verwendung von Lambda-Ausdrücken und ermöglicht so eine elegante Syntax für das Schreiben von Funktionen als Argumente.

### Eigene Functional Interfaces:

Beispiel für ein eigenes Functional Interface:
```java
@FunctionalInterface
interface MyFunctionalInterface<T, R> {
    R operate(T t);
}

// Anwendung
MyFunctionalInterface<Integer, String> convertToString = i -> "Number: " + i;
System.out.println(convertToString.operate(42));
```