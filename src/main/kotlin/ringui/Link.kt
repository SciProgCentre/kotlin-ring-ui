@file:JsModule("@jetbrains/ring-ui/components/link/link")

package ringui

import org.w3c.dom.events.MouseEvent
import react.RClass
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/link/link.js
public external interface LinkProps : WithClassName {
    public var innerClassName: String
    public var active: Boolean
    public var inherit: Boolean
    public var pseudo: Boolean
    public var hover: Boolean
    public var href: String
    public var onPlainLeftClick: (MouseEvent) -> Unit
    public var onClick: (MouseEvent) -> Unit
}

@JsName("default")
public external val Link: RClass<LinkProps>
