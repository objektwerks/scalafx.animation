package objektwerks

import scalafx.geometry.Insets
import scalafx.scene.Node
import scalafx.scene.control.Label
import scalafx.scene.layout.{Pane, Priority, VBox}
import scalafx.scene.paint.Color
import scalafx.scene.shape.{Circle, Rectangle}

import Animation.*

final class AnimationPane extends VBox:
  padding = Insets(6)

  val fadeLabel = Label("Fade:")
  val fadePane = new Pane:
    children = List( fade( Circle(10, 10, 10, Color.Red) ) )

  val fillLabel = Label("Fill:")
  val fillPane = new Pane:
    children = List( fill( Circle(10, 10, 10, Color.Red) ) )

  val translateLabel = Label("Translate:")
  val translatePane = new Pane:
    children = List( translate( Circle(10, 10, 10, Color.Red) ) )

  val pathLabel = Label("Path:")
  val pathPane = new Pane:
    children = List( path( Circle(10, 10, 10, Color.Red) ) )

  val rotateLabel = Label("Rotate:")
  val rectangle = Rectangle(0, 0, 20, 20)
  rectangle.setFill(Color.Red)
  val rotatePane = new Pane:
    children = List( Animation.rotate(rectangle) ) // conflicting rotate exists in ScalaFx.ObservableValue?

  val scaleLabel = Label("Scale:")
  val scalePane = new Pane:
    children = List( scale( Circle(10, 10, 10, Color.Red) ) )

  val strokeLabel = Label("Stroke:")
  val strokePane = new Pane:
    val circle = Circle(10, 10, 10, Color.Red)
    circle.setStrokeWidth(3.0)
    children = List( stroke(circle) )

  val pauseLabel = Label("Pause:")
  val pausePane = new Pane:
    val circle = Circle(10, 10, 10, Color.Red)
    circle.setStrokeWidth(3.0)
    children = List( pause(circle) )

  val parallelLabel = Label("Parallel:")
  val parallelPane = new Pane:
    val rectangle = Rectangle(0, 0, 10, 10)
    rectangle.setFill(Color.Red)
    children = List( parallel(rectangle) )

  val timelineLabel = Label("Timeline:")
  val timelinePane = new Pane:
    val circle = Circle(10, 10, 10, Color.Red)
    children = List( timeline(circle) )

  val interpolatorLabel = Label("Interpolator:")
  val interpolatorPane = new Pane:
    val circle = Circle(10, 10, 10, Color.Red)
    children = List( interpolator(circle) )

  val animationTimerLabel = Label("Animation Timer:")
  val animationTimerText = StringBuilder()
  animationTimer(animationTimerText )
  val animationTimerPane = new Label:
    text = animationTimerText.result()

  val controls = List[(Label, Node)](
    fadeLabel -> fadePane,
    fillLabel -> fillPane,
    translateLabel -> translatePane,
    pathLabel -> pathPane,
    rotateLabel -> rotatePane,
    scaleLabel -> scalePane,
    strokeLabel -> strokePane,
    pauseLabel -> pausePane,
    parallelLabel -> parallelPane,
    timelineLabel -> timelinePane,
    interpolatorLabel -> interpolatorPane,
    animationTimerLabel -> animationTimerPane
  )
  val controlGrid = ControlGrid(controls)

  children = List(controlGrid)
  VBox.setVgrow(this, Priority.Always)