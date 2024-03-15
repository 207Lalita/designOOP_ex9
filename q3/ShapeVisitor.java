public interface ShapeVisitor {
    void visitCircleVecter(Circle circle);
    void visitTriangleVecter(Triangle triangle);
    void visitRectangleVecter(Rectangle rectangle);

    void visitCircleRaster(Circle circle);
    void visitTriangleRaster(Triangle triangle);
    void visitRectangleRaster(Rectangle rectangle);
}
