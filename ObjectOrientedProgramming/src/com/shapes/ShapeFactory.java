package com.shapes;

public class ShapeFactory {

    public static void main(String[] args) {
        System.out.println("Inheritance........");
        Square square = new Square("SquareOne");
        Rhombus rhombus = new Rhombus("Rhombus");

        System.out.println(square.getNumberOfSides());
        System.out.println(rhombus.getNumberOfSides());


        ObtuseTriangle obtuseTriangle = new ObtuseTriangle();
        obtuseTriangle.setName("ObtuseOne");
        obtuseTriangle.setNumberOfSides(3);

        System.out.println("Polymorphism.... Abstact");

        Shape square2 = new Square("SquareTwo");
        Shape rectangle = new Rectangle("Rectangle");
        Shape acuteTriangle = new AcuteTriangle();

        draw(square2);
        draw(rectangle);
        draw(acuteTriangle);

        /**draw(square2);
        draw(rectangle);
        draw(acuteTriangle);*/

        System.out.println("Polymorphism.... Interface");
        Square square3 = new Square("Square3");
        bounce(square3);

        Bouncable obtuseTriangle2 = new ObtuseTriangle();
        bounce(obtuseTriangle2);

        System.out.println("Exercise....");
        PaintTool paintTool = new PaintTool();
        Square square4 = new Square("SquareFour");
        Shape acuteTriangle2 = new AcuteTriangle();
        Shape obtuseTriangle3 = new ObtuseTriangle();
        paintTool.paint(square4);
        paintTool.paint(acuteTriangle2);
        paintTool.paint(obtuseTriangle3);

    }

    public static void draw(Shape shape) {
        shape.draw();
    }

    /**
    public static void draw(Square square) {
        square.draw();
    }

    public static void draw(Rectangle rectangle) {
        rectangle.draw();
    }

    public static void draw(AcuteTriangle acuteTriangle) {
        acuteTriangle.draw();
    }*/

    public static void bounce(Bouncable bouncable) {
        bouncable.bounce();
    }

    /*
    public static void bounce(ObtuseTriangle obtuseTriangle) {
        obtuseTriangle.bounce();
    }

    public static void bounce(Square square) {
        square.bounce();
    }*/
}
