package se.nullable.flickboard.model.layouts

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import se.nullable.flickboard.model.Action
import se.nullable.flickboard.model.Direction
import se.nullable.flickboard.model.KeyM
import se.nullable.flickboard.model.Layer
import se.nullable.flickboard.model.Layout
import se.nullable.flickboard.model.layouts.RU_MESSAGEASE_MAIN_LAYER
import se.nullable.flickboard.ui.FlickBoardParent
import se.nullable.flickboard.ui.Keyboard

val UK_MESSAGEASE_MAIN_LAYER = Layer(
    keyRows = listOf(
        listOf(
            KeyM(actions = mapOf()),
            KeyM(actions = mapOf()),
            KeyM(actions = mapOf()),
        ),
        listOf(
            KeyM(
                actions = mapOf(
                    Direction.RIGHT to Action.Text("і"),
                    Direction.BOTTOM to Action.Text("ґ")
                )
            ),
            KeyM(actions = mapOf()),
            KeyM(actions = mapOf()),
        ),
        listOf(
            KeyM(
                actions = mapOf(
                    Direction.TOP to Action.Text("ї"),
                    Direction.RIGHT to Action.Text("є")
                )
            ),
            KeyM(actions = mapOf()),
            KeyM(actions = mapOf()),
        ),
        listOf(SPACE)
    )
).mergeFallback(RU_MESSAGEASE_MAIN_LAYER)

val UK_MESSAGEASE = Layout(
    mainLayer = UK_MESSAGEASE_MAIN_LAYER,
    controlLayer = CONTROL_MESSAGEASE_LAYER
)

@Composable
@Preview
fun UkKeyboardPreview() {
    FlickBoardParent {
        Keyboard(layout = Layout(UK_MESSAGEASE_MAIN_LAYER), onAction = {})
    }
}

@Composable
@Preview
fun UkFullKeyboardPreview() {
    FlickBoardParent {
        Keyboard(layout = UK_MESSAGEASE, onAction = {})
    }
}
