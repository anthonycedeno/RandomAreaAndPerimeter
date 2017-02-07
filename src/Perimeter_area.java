import java.util.Random;

public class Perimeter_area {

	public static void main(String[] args) {
		Random generator = new Random();
		
		int rectangleWidth = generator.nextInt(100);
		int rectangleHeight = generator.nextInt(100);
		
		int rectangleArea = rectangleWidth * rectangleHeight;
		int rectanglePerimeter = 2 * (rectangleWidth + rectangleHeight);
		
		System.out.println("The rectangle has height of " + rectangleHeight);
		
		System.out.println("The rectangle has width of " + rectangleWidth);
		
		System.out.println("The rectangle has Area of " + rectangleArea);
		
		System.out.println("The rectangle has Perimeter of " + rectanglePerimeter);
	}

}
