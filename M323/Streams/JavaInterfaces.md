
### **Consumer<T>:**
- **Beschreibung:** Akzeptiert ein Argument vom Typ `T` und führt eine Aktion aus, gibt jedoch nichts zurück (Rückgabewert ist `void`).
- **Beispiel:** Ein `Consumer<String>` könnte einen Text ausdrucken, aber es gibt keinen Wert, der zurückgegeben wird.

```java
Consumer<String> printMessage = message -> System.out.println(message);
printMessage.accept("Hello, World!");
```

### **Function<T, R>:**
- **Beschreibung:** Akzeptiert ein Argument vom Typ `T` und gibt einen Wert vom Typ `R` zurück. Es ermöglicht Transformationen oder Berechnungen.
- **Beispiel:** Ein `Function<Integer, String>` könnte eine Zahl in einen formatierten String umwandeln.

```java
Function<Integer, String> convertToString = number -> "Number: " + number;
System.out.println(convertToString.apply(42));
```

### **Supplier<T>:**
- **Beschreibung:** Akzeptiert keine Argumente und gibt einen Wert vom Typ `T` zurück. Wird oft für die Erzeugung von Instanzen verwendet.
- **Beispiel:** Ein `Supplier<Double>` könnte eine zufällige Dezimalzahl liefern.

```java
Supplier<Double> getRandomNumber = () -> Math.random();
System.out.println(getRandomNumber.get());
```

### **Predicate<T>:**
- **Beschreibung:** Akzeptiert ein Argument vom Typ `T` und gibt einen booleschen Wert zurück. Wird für Bedingungsprüfungen verwendet.
- **Beispiel:** Ein `Predicate<Integer>` könnte prüfen, ob eine Zahl gerade ist.

```java
Predicate<Integer> isEven = number -> number % 2 == 0;
System.out.println(isEven.test(6)); // true
```

### **BinaryOperator<T>:**
- **Beschreibung:** Akzeptiert zwei Argumente vom Typ `T` und gibt einen Wert vom Typ `T` zurück. Wird für binäre Operationen verwendet.
- **Beispiel:** Ein `BinaryOperator<Integer>` könnte zwei Zahlen addieren.

```java
BinaryOperator<Integer> add = (a, b) -> a + b;
System.out.println(add.apply(3, 4)); // 7
```

### **Comparator<T>:**
- **Beschreibung:** Akzeptiert zwei Argumente vom Typ `T` für den Vergleich und gibt einen Vergleichsint-Wert zurück.
- **Beispiel:** Ein `Comparator<String>` könnte die Länge von zwei Strings vergleichen.

```java
Comparator<String> stringLengthComparator = (s1, s2) -> s1.length() - s2.length();
System.out.println(stringLengthComparator.compare("apple", "banana")); // -3
```


### **Funktionalität als Argument:**
In der funktionalen Programmierung ist es ein zentrales Konzept, Funktionen als Argumente an andere Funktionen zu übergeben. Functional Interfaces in Java sind so konzipiert, dass sie dieses Konzept unterstützen. Die verschiedenen Methoden wie `accept`, `apply`, `get`, `test` usw. repräsentieren unterschiedliche Arten von Funktionalität, die an andere Teile des Codes übergeben werden können.

1. **`accept` - Consumer<T>:**
   - Diese Methode repräsentiert eine Funktion, die ein Argument vom Typ `T` akzeptiert und eine Aktion darauf ausführt, jedoch keinen Wert zurückgibt. Ein `Consumer` wird häufig für nebenläufige oder ausgabeorientierte Operationen verwendet.

    ```java
    Consumer<String> printMessage = message -> System.out.println(message);
    ```

2. **`apply` - Function<T, R>:**
   - Diese Methode repräsentiert eine Funktion, die ein Argument vom Typ `T` akzeptiert und einen Wert vom Typ `R` zurückgibt. Eine `Function` wird oft für Transformationen oder Berechnungen verwendet.

    ```java
    Function<Integer, String> convertToString = number -> "Number: " + number;
    ```

3. **`get` - Supplier<T>:**
   - Diese Methode repräsentiert eine Funktion, die keine Argumente hat, aber einen Wert vom Typ `T` zurückgibt. Ein `Supplier` wird oft verwendet, um Werte zu erzeugen.

    ```java
    Supplier<Double> getRandomNumber = () -> Math.random();
    ```

4. **`test` - Predicate<T>:**
   - Diese Methode repräsentiert eine Funktion, die ein Argument vom Typ `T` akzeptiert und einen booleschen Wert zurückgibt. Ein `Predicate` wird häufig für Bedingungsprüfungen verwendet.

    ```java
    Predicate<Integer> isEven = number -> number % 2 == 0;
    ```

Durch diese Funktionalität als Argument können Sie nun beispielsweise einen `Consumer`, der eine Aktion definiert, an eine Methode übergeben, die diese Aktion auf eine Liste von Elementen anwendet. Dies fördert eine modularere und flexible Struktur im Code, da Sie die Funktionalität dynamisch ändern können, indem Sie verschiedene Implementierungen der entsprechenden Functional Interfaces übergeben.