package objektwerks

import scalafx.animation.{
  FadeTransition, FillTransition, Interpolator, PathTransition, RotateTransition, Timeline, TranslateTransition
}
import scalafx.scene.paint.Color
import scalafx.scene.shape.{LineTo, MoveTo, Path, Shape}
import scalafx.util.Duration

/**
  * See: https://dev.java/learn/javafx-animations/
  */
object Transition:
  def fade(shape: Shape): Shape =
    val transition = FadeTransition(Duration(millis = 5000), shape)
    transition.setFromValue(1.0)
    transition.setToValue(0)
    transition.setInterpolator(Interpolator.Linear)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape

  def fill(shape: Shape): Shape =
    val transition = FillTransition(Duration(millis = 5000), shape)
    transition.setFromValue(Color.Red)
    transition.setToValue(Color.Blue)
    transition.setInterpolator(Interpolator.Linear)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape

  def translate(shape: Shape): Shape =
    val transition = new TranslateTransition(Duration(5000), shape)
    transition.setToX(10)
    transition.setToY(10)
    transition.setInterpolator(Interpolator.LINEAR)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape

  def path(shape: Shape): Shape =
    val path = new Path()
    path.getElements().add( MoveTo(10, 10) )
    path.getElements().add( LineTo(200, 20) )

    val transition = new PathTransition(Duration(5000), path, shape)
    transition.setInterpolator(Interpolator.Linear)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape

  def rotate(shape: Shape): Shape =
    val transition = RotateTransition(Duration(5000), shape)
    transition.setFromAngle(0)
    transition.setToAngle(360)
    transition.setInterpolator(Interpolator.Linear)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape