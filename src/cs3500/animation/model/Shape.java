package cs3500.animation.model;

/**
 * represent a immutable shape.
 */
public interface Shape {
  /**
   * Only change the color of this shape.
   * @param color the desired color
   */
  void changeColor(Color color);

  /**
   * only change the position of this shape.
   * @param position the desired posn
   */
  void changePosn(Posn position);

  /**
   * Only change the deminsion of the shape to the given value.
   * @param width as x value
   * @param height as y value
   * @throws IllegalArgumentException if the given width and height is smaller than 0
   */
  void changeSize(int width, int height);

  /**
   * get the position of the shape.
   *
   * @return Posn as the position of the shape.
   */
  Posn getPosition();

  /**
   * get the color of the shape.
   *
   * @return Color as the color of the shape.
   */
  Color getColor();

  /**
   * get the width of the shape.
   *
   * @return int as the width of the shape.
   */
  int getWidth();

  /**
   * get the height of the shape.
   *
   * @return int as the height of the shape.
   */
  int getHeight();

  /**
   * make a copy of the this shape.
   * * @return Shape as the copy
   */
  Shape copyShape();


}