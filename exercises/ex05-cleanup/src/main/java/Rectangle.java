/**
 * A rectangle with a width and height that can be scaled.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle with the given dimensions.
   *
   * @param width the rectangle's width
   * @param height the rectangle's height
   */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Returns the rectangle's area.
   *
   * @return the width multiplied by the height
   */
  public double area() {
    return width * height;
  }

  /**
   * Multiplies both dimensions by the given factor.
   *
   * @param factor the scale factor applied to the width and height
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Compares this rectangle's area with another rectangle's area.
   *
   * @param other the rectangle to compare with
   * @return true if this rectangle has a greater area than the other rectangle
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
