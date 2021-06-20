@file:JsModule("@jetbrains/ring-ui/components/tabs/tabs")

package ringui.tabs

import react.RClass
import react.dom.WithClassName

//https://github.com/JetBrains/ring-ui/blob/master/components/tabs/tabs.js
public external interface TabsProps : WithClassName {
    public var theme: String
    public var selected: String
    public var onSelect: (String) -> Unit
    public var href: String
    public var autoCollapse: Boolean
}

public external val Tabs: RClass<TabsProps>

public external interface TabProps : WithClassName {
    public var title: dynamic // PropTypes.oneOfType([PropTypes.node, PropTypes.func]).isRequired,
    public var id: String
}

public external val Tab: RClass<TabProps>

public external interface SmartTabsProps : WithClassName {
    public var initSelected: String
}

public external val SmartTabs: RClass<SmartTabsProps>

public external interface CustomItemProps : WithClassName

public external val CustomItem: RClass<CustomItemProps>
