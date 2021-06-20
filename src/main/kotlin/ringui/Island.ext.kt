package ringui

import react.RBuilder
import react.RHandler

public fun RBuilder.Island(
    header: String,
    handler: RHandler<IslandContentProps>,
) {
    Island {
        Header {
            attrs.border = true

            +header
        }
        Content(handler)
    }
}
