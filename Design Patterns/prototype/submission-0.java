interface Shape {
    Shape clone();
}

class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle){
         this(rectangle.getWidth(),rectangle.getHeight());
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public Shape clone() {
        // Write your code here
        return new Rectangle(this);

    }
}

class Square implements Shape {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public Square(Square square){
        this(square.getLength());
    }

    public int getLength() {
        return this.length;
    }

    @Override
    public Shape clone() {
        // Write your code here
        return new Square(this);
    }
}

class Test {
    public List<Shape> cloneShapes(List<Shape> shapes) {
        // Write your code here
        List<Shape> res=new ArrayList<>();
        for(Shape s:shapes){
            res.add(s.clone());
        }
        return res;
    }
}
