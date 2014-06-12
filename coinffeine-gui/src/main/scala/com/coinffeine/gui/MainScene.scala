package com.coinffeine.gui

import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.control.Label
import scalafx.scene.image.{Image, ImageView}
import scalafx.scene.layout.StackPane
import scalafx.scene.text.Font

class MainScene extends Scene(width = 600, height = 400) {
  root = new StackPane {
    prefWidth = 200
    prefHeight = 150
    content = Seq(
      new ImageView(new Image(getClass.getResourceAsStream("logo-128x128.png"))) {
        preserveRatio = true
        margin = Insets(top = 0, right = 0, bottom = 40, left = 0)
      },
      new Label("Welcome to Coinffeine") {
        font = Font(18)
        margin = Insets(top = 128, right = 0, bottom = 0, left = 0)
      }
    )
  }
}