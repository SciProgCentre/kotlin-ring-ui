package ringui

import react.RBuilder
import react.RHandler

public fun RBuilder.Island(
    header: String,
    handler: RHandler<IslandContentProps>,
) {
    Island {
        IslandHeader {
            attrs.border = true

            +header
        }
        IslandContent(handler)
    }
}
