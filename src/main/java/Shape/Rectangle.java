package Shape;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        Double halfWidth = width / 2.0;
        Double halfHeight = height / 2.0;

        Collection<Point2d> rectangleCoords = new ArrayList<>();
        rectangleCoords.add(new Point2d(-halfWidth, -halfHeight));
        rectangleCoords.add(new Point2d(halfWidth, -halfHeight));
        rectangleCoords.add(new Point2d(halfWidth, halfHeight));
        rectangleCoords.add(new Point2d(-halfWidth, halfHeight));


        double stepX = 0.5  ;
        double stepY = 0.5  ;

        for (double x = -halfWidth + stepX; x < halfWidth; x += stepX) {
            for (double y = -halfHeight + stepY; y < halfHeight; y += stepY) {
                rectangleCoords.add(new Point2d(x, y));
            }
        }

        super.addAll(rectangleCoords);

    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(this.getCoords());
    }
}
