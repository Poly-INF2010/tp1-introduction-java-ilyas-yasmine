package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        BaseShape shapeA = new BaseShape();
        Rectangle rectangle1 = new Rectangle(1.0, 120.0);
        Rectangle rectangle2 = rectangle1.clone();
        Rectangle rectangle3 = new Rectangle(30.0, 1.0);

        rectangle1.rotate(rectangle1.getCoords(), Math.PI/16);
        rectangle2.rotate(rectangle2.getCoords(), -Math.PI/16);
        rectangle1.translate(rectangle1.getCoords(), new Point2d(-12.0, 0.0));
        rectangle2.translate(rectangle2.getCoords(), new Point2d(12.0, 0.0));
        rectangle3.translate(rectangle3.getCoords(), new Point2d(2.0, 20.0));

        shapeA.add(rectangle1);
        shapeA.add(rectangle2);
        shapeA.add(rectangle3);
        return shapeA;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape shapeB = new BaseShape();
        Ellipse ellipse1 = new Ellipse(40.0, 30.0);
        Ellipse ellipse2 = ellipse1.clone();
        Rectangle rectangle1 = new Rectangle(20.0, 60.0);

        ellipse2.translate(ellipse2.getCoords(), new Point2d(0.0, 30.0));
        rectangle1.translate(rectangle1.getCoords(), new Point2d(-15.0, 15.0));

        shapeB.add(ellipse1);
        shapeB.add(ellipse2);
        shapeB.add(rectangle1);
        return shapeB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape shapeC = new BaseShape();
        Ellipse ellipse1 = new Ellipse(40.0, 60.0);
        Rectangle square1 = new Square(40.0);

        square1.translate(square1.getCoords(), new Point2d(10.0, 0.0));
        ellipse1.remove(square1);

        shapeC.add(ellipse1);
        return shapeC;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape shapeE = new BaseShape();
        Rectangle rectangle1 = new Rectangle(4.0, 60.0);
        Rectangle rectangle2 = new Rectangle(40.0, 4.0);
        Rectangle rectangle3 = new Rectangle(30.0, 4.0);
        Rectangle rectangle4 = rectangle2.clone();

        rectangle1.translate(rectangle1.getCoords(), new Point2d(-20.0, 0.0));
        rectangle2.translate(rectangle2.getCoords(), new Point2d(0.0, -30.0));
        rectangle4.translate(rectangle4.getCoords(), new Point2d(0.0, 30.0));

        shapeE.add(rectangle1);
        shapeE.add(rectangle2);
        shapeE.add(rectangle3);
        shapeE.add(rectangle4);
        return shapeE;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape shapeH = new BaseShape();
        Rectangle rectangle1 = new Rectangle(4.0, 60.0);
        Rectangle rectangle2 = rectangle1.clone();
        Rectangle rectangle3 = new Rectangle(40.0, 4.0);

        rectangle1.translate(rectangle1.getCoords(), new Point2d(-20.0, 0.0));
        rectangle2.translate(rectangle2.getCoords(), new Point2d(20.0, 0.0));

        shapeH.add(rectangle1);
        shapeH.add(rectangle2);
        shapeH.add(rectangle3);
        return shapeH;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape shapeN = new BaseShape();
        Rectangle rectangle1 = new Rectangle(4.0, 60.0);
        Rectangle rectangle2 = rectangle1.clone();
        Rectangle rectangle3 = rectangle1.clone();

        rectangle1.translate(rectangle1.getCoords(), new Point2d(-20.0, 0.0));
        rectangle2.translate(rectangle2.getCoords(), new Point2d(20.0, 0.0));
        rectangle3.rotate(rectangle3.getCoords(), Math.PI - Math.PI/6);

        shapeN.add(rectangle1);
        shapeN.add(rectangle2);
        shapeN.add(rectangle3);
        return shapeN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        return new Ellipse(40.0, 60.0);
    }

}
