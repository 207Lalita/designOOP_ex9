public class SaveVecterVisitor implements ShapeVisitor {

    @Override
    public void visitCircleVecter(Circle circle) {
        System.out.println("Saving the circle as raster with radius= "+circle.getRadius()+" at position "+circle.getxPos()+", "+circle.getyPos());
    }

    @Override
    public void visitTriangleVecter(Triangle triangle) {
        System.out.println("Saving the triangle as raster with base= "+triangle.getBase()+" height= "+triangle.getHeight()+" at position "+triangle.getxPos()+", "+triangle.getyPos());
    }

    @Override
    public void visitRectangleVecter(Rectangle rectangle) {
        System.out.println("Saving the rectangle as raster with width= "+rectangle.getWidth()+" height= "+rectangle.getHeight()+" at position "+rectangle.getxPos()+", "+rectangle.getyPos());
    }

    @Override
    public void visitCircleRaster(Circle circle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visitRectangleVecter'");
    }

    @Override
    public void visitTriangleRaster(Triangle triangle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visitRectangleVecter'");
    }

    @Override
    public void visitRectangleRaster(Rectangle rectangle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visitRectangleVecter'");
    }
    
}
