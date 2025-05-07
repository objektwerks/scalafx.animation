package objektwerks

import scalafx.geometry.Insets
import scalafx.scene.Node
import scalafx.scene.control.Label
import scalafx.scene.layout.GridPane

final class ControlGrid(controls: List[(Label, Node)]) extends GridPane:
  hgap = 12
  vgap = 12
  padding = Insets(top = 12, right = 12, bottom = 12, left = 12)

  var row = 0
  for ((label, node) <- controls)
    add(label, columnIndex = 0, rowIndex = row)
    add(node, columnIndex = 1, rowIndex = row)
    row += 1