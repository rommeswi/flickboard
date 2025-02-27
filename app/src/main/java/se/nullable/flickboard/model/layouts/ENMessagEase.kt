package se.nullable.flickboard.model.layouts

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import se.nullable.flickboard.model.Action
import se.nullable.flickboard.model.Direction
import se.nullable.flickboard.model.KeyM
import se.nullable.flickboard.model.Layer
import se.nullable.flickboard.model.Layout
import se.nullable.flickboard.ui.FlickBoardParent
import se.nullable.flickboard.ui.Keyboard

val EN_MESSAGEASE_MAIN_LAYER = Layer(
    keyRows = listOf(
        listOf(
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("a"),
                    Direction.BOTTOM_RIGHT to Action.Text("v")
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("n"),
                    Direction.BOTTOM to Action.Text("l")
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("i"),
                    Direction.BOTTOM_LEFT to Action.Text("x")
                )
            ),
        ),
        listOf(
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("h"),
                    Direction.RIGHT to Action.Text("k")
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("o"),
                    Direction.TOP_LEFT to Action.Text("q"),
                    Direction.TOP to Action.Text("u"),
                    Direction.TOP_RIGHT to Action.Text("p"),
                    Direction.LEFT to Action.Text("c"),
                    Direction.RIGHT to Action.Text("b"),
                    Direction.BOTTOM_LEFT to Action.Text("g"),
                    Direction.BOTTOM to Action.Text("d"),
                    Direction.BOTTOM_RIGHT to Action.Text("j"),
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("r"),
                    Direction.LEFT to Action.Text("m"),
                )
            ),
        ),
        listOf(
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("t"),
                    Direction.TOP_RIGHT to Action.Text("y")
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("e"),
                    Direction.TOP to Action.Text("w"),
                    Direction.RIGHT to Action.Text("z")
                )
            ),
            KeyM(
                actions = mapOf(
                    Direction.CENTER to Action.Text("s"),
                    Direction.TOP_LEFT to Action.Text("f")
                )
            ),
        ),
        listOf(SPACE)
    )
)

val EN_MESSAGEASE = Layout(
    mainLayer = EN_MESSAGEASE_MAIN_LAYER,
    controlLayer = CONTROL_MESSAGEASE_LAYER
)

@Composable
@Preview
fun EnKeyboardPreview() {
    FlickBoardParent {
        Keyboard(layout = Layout(EN_MESSAGEASE_MAIN_LAYER), onAction = {})
    }
}

@Composable
@Preview
fun EnFullKeyboardPreview() {
    FlickBoardParent {
        Keyboard(layout = EN_MESSAGEASE, onAction = {})
    }
}
