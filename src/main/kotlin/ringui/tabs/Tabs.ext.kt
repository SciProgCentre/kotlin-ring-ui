package ringui.tabs

import react.RBuilder
import react.RHandler

public fun RBuilder.Tabs(
    active: String? = null,
    handler: RHandler<TabsProps>,
) {
    Tabs {
        active?.let {
            attrs {
                selected = active
            }
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
        attrs {
            this.title = title
            this.id = id
        }
        handler()
    }
}


public fun RBuilder.SmartTabs(
    active: String? = null,
    handler: RHandler<SmartTabsProps>,
) {
    SmartTabs {
        active?.let {
            attrs {
                initSelected = active
            }
        }
        handler()
    }
}
