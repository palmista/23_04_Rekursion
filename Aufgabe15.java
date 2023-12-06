/*
 * Für die folgenden Probleme gäbe es grundsätzlich auch iterative (d.h. schleifenbasierte) Lösungen.
 * Sie sollen aber allesamt mit Rekursion gelöst werden - wenn möglich ohne Hilfsmethoden.
 * Falls nichts Anderes erwähnt, soll das Resultat zurückgegeben werden.
 * Schreibe wie gewohnt Testcode, der die Rückgabewerte ausgibt.
 * Zu erledigendes Minimum: Zwei von a-c) plus d)
 * 
 * a) Programmiere eine Methode fibonacci(), die für eine natürliche Zahl n die n-te Fibonacci-Zahl zurückgibt.
 *    Die Fibonacci-Zahlen sind die Zahlen der Folge 1, 1, 2, 3, 5, 8, 13, 21, 34..., die wie folgt definiert ist:
 *    fibonacci(0) = fibonacci(1) = 1
 *    fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2) für n > 1
 * 
 * b) Programmiere eine Methode countDigits(), die die Anzahl Stellen einer ganzen Zahl zurückgibt.
 * 
 * c) Euklidischer Algorithmus: Damit kann von zwei natürlichen Zahlen x und y der ggT berechnet werden:
 *    ggT(24, 81):
 *    81 / 24 -> Rest 9
 *    24 / 9  -> Rest 6
 *    9 / 6   -> Rest 3 <= ggT
 *    6 / 3   -> Rest 0
 *    => der letzte Rest ungleich 0 ist der ggT
 *    Programmiere eine rekursive Methode gcd() (greatest common divisor), die diesem Algorithmus folgt.
 * 
 * d) Spiegeln einer Zeichenfolge: Schreibe ein Programm verlan(), das eine Zeichenfolge invertiert.
 *    Tipp: Für einen String s kann mit
 *    char c = s.charAt(n)
 *    das Zeichen an der n-ten Stelle ausgelesen werden.
 *    Zeichen vom Typ char können danach ganz normal mit Hilfe von + mit Strings verbunden werden.
 *    Es soll kein Array gebraucht werden.
 * 
 * e) Schreibe eine Methode isPalindrome(), die kontrolliert, ob ein Wort ein Palindrom ist.
 *    Dabei kannst du die Methoden .toLowerCase() und .substring() benutzen.
 * 
 * f) Türme von Hanoi: Mache dich mit dem Problem vertraut und entwickle eine Methode move(height, fromPeg, toPeg, otherPeg),
 *    die Schritt für Schritt ausgibt, welche Scheibe von welchem Stab auf welchen verschoben wird.
 * 
 *    Zusatzaufgabe: Stelle jeden Schritt graphisch auf der Konsole dar.
 * 
 * g) Implementiere ein Sortierverfahren deiner Wahl rekursiv. Für welche Verfahren ist das überhaupt sinnvoll möglich?
 * 
 */

public class Aufgabe15 {

    public static void main(String[] args) {
        // Test-Code zu Aufgabe ...
        System.out.println("Aufgabe ...");

        System.out.println();
        
        // Test-Code zu Aufgabe g)
        System.out.println("Aufgabe g)");
        double[] a = { 5.4, 0.12, -22222, 121, -12.25, 0, 0.75, -5, 0, 500000, -1200 };
    
    }
}
