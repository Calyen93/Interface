//Scrivere un programmache contenga una interfaccia
//Forma ed un metodo chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che implementano
//Forma ed implementano il metodo per il calcolo dell'area.

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 10);
        double areaRectangle = rectangle.calculateArea();
        System.out.println("L'area del rettangolo è: " + areaRectangle);

        Triangle triangle = new Triangle(2, 9);
        double areaTriangle = triangle.calculateArea();
        System.out.println("L'area del triangolo è: " + areaTriangle);
    }
}