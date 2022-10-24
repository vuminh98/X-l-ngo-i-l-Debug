package EX4;

public class IllegalTriangleException extends Exception{
    @Override
    public String getMessage() {
        return "Error: There are not 3 sides of the triangle!";
    }
}
