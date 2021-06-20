package ringui

import react.RBuilder
import react.RHandler
import react.ReactElement

public fun RBuilder.Dropdown(
    anchor: dynamic,
    handler: RHandler<DropdownProps>,
): ReactElement =
    Dropdown {
        attrs.anchor = anchor

        handler()
    }
