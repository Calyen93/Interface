//Scrivere un programmache contenga una interfaccia
//Forma ed un metodo chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che implementano
//Forma ed implementano il metodo per il calcolo dell'area.

class Rectangle implements Shape {

    private double length;
    private double width;

    //Costruttore
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }
}
