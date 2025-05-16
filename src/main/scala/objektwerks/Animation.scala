package objektwerks

import scalafx.animation.{
  FadeTransition, FillTransition, Interpolator, KeyValue, KeyFrame, ParallelTransition, PathTransition, PauseTransition,
  RotateTransition, ScaleTransition, SequentialTransition, StrokeTransition, Timeline, TranslateTransition
}
import scalafx.scene.paint.Color
import scalafx.scene.shape.{LineTo, MoveTo, Path, Shape}
import scalafx.util.Duration

/**
 * See: https://dev.java/learn/javafx-animations/
 */
object Animation:
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
    val transition = new TranslateTransition(Duration(millis = 5000), shape)
    transition.setToX(10)
    transition.setToY(10)
    transition.setInterpolator(Interpolator.LINEAR)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape

  def path(shape: Shape): Shape =
    val path = new Path()
    path.elements = List( MoveTo(10, 10), LineTo(100, 20) )

    val transition = new PathTransition(Duration(millis = 5000), path, shape)
    transition.setInterpolator(Interpolator.Linear)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape

  def rotate(shape: Shape): Shape =
    val transition = RotateTransition(Duration(millis = 5000), shape)
    transition.setFromAngle(0)
    transition.setToAngle(360)
    transition.setInterpolator(Interpolator.Linear)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape

  def scale(shape: Shape): Shape =
    val transition = ScaleTransition(Duration(millis = 5000), shape)
    transition.setToX(0.1)
    transition.setToY(0.1)
    transition.setInterpolator(Interpolator.Linear)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape

  def stroke(shape: Shape): Shape =
    val transition = new StrokeTransition(Duration(millis = 5000), shape)
    transition.setFromValue(Color.Red)
    transition.setToValue(Color.Blue)
    transition.setInterpolator(Interpolator.Linear)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape

  def pause(shape: Shape): Shape =
    val smaller = ScaleTransition(Duration(millis = 1500))
    smaller.setToX(0.25)
    smaller.setToY(0.25)
    smaller.setInterpolator(Interpolator.Linear)

    val larger = ScaleTransition(Duration(millis = 1500))
    larger.setToX(1)
    larger.setToY(1)
    larger.setInterpolator(Interpolator.Linear)

    val transitions = Seq(smaller, PauseTransition(Duration(millis = 3000)), larger)
    val transition = SequentialTransition(shape, transitions)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape

  def parallel(shape: Shape): Shape =
    val translate = TranslateTransition(Duration(millis = 5000))
    translate.setToX(100)
    translate.setToY(0)
    translate.setInterpolator(Interpolator.Linear)
    
    val rotate = RotateTransition(Duration(millis = 5000))
    rotate.setFromAngle(0)
    rotate.setToAngle(360)
    rotate.setInterpolator(Interpolator.Linear)
    
    val transitions = Seq(translate, rotate)
    val transition = ParallelTransition(shape, transitions)
    transition.setCycleCount(Timeline.Indefinite)
    transition.play()
    shape

  def timeline(shape: Shape): Shape =
    val kv = KeyValue(shape.translateXProperty(), 100)
    val frame = KeyFrame(time = Duration(millis = 5000), values = Set(kv))
    val timeline = Timeline(List(frame))
    timeline.setCycleCount(Timeline.Indefinite)
    timeline.play()
    shape

  def interpolator(shape: Shape): Shape =
    val kv = KeyValue(shape.translateXProperty(), 100, Interpolator.Linear)
    val frame = KeyFrame(Duration(millis = 5000), values = Set(kv))
    val timeline = Timeline(List(frame))
    timeline.setCycleCount(Timeline.Indefinite)
    timeline.play()
    shape

  def timer(): Unit =
    var lastTime = System.nanoTime()

    def handler(now: Long): Unit =
      val currentTime = now / 1_000_000_000
      if (currentTime > lastTime) then
          println("animation timer handler ...")
          lastTime = currentTime

    AnimationTimer(handler).start()