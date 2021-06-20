package ringui.tabs

import react.RBuilder
import react.RHandler

public fun RBuilder.Tabs(
    active: String? = null,
    handler: RHandler<TabsProps>,
) {
    Tabs {
        if (active != null) {
            attrs.selected = active
        }

        handler()
    }
}

public fun RBuilder.Tab(
    title: dynamic,
    id: String = title.toString(),
    handler: RHandler<TabProps>,
) {
    Tab {
        attrs.title = title
        attrs.id = id

        handler()
    }
}


public fun RBuilder.SmartTabs(
    active: String? = null,
    handler: RHandler<SmartTabsProps>,
) {
    SmartTabs {
        if (active != null) {
            attrs.initSelected = active
        }
        handler()
    }
}
