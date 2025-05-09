package objektwerks

import scalafx.Includes.*
import scalafx.application.Platform
import scalafx.event.ActionEvent
import scalafx.scene.control.{Menu => MenuRoot, MenuBar, MenuItem}

final class Menu extends MenuBar:
  val menuItemExit = new MenuItem:
    text = "Exit"
    onAction = (_: ActionEvent) => Platform.exit()

  val menuRoot = new MenuRoot():
    text = "Menu"
    items = List(menuItemExit)

  menus = List(menuRoot)