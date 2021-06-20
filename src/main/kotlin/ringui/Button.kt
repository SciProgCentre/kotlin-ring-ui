@file:JsModule("@jetbrains/ring-ui/components/button/button")

package ringui

import org.w3c.dom.events.MouseEvent
import react.RClass
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/button/button.js
public external interface ButtonProps : WithClassName {
    public var theme: String
    public var active: Boolean
    public var danger: Boolean
    public var delayed: Boolean
    public var loader: Boolean
    public var primary: Boolean

    public var short: Boolean
    public var text: Boolean
    public var inline: Boolean
    public var dropdown: Boolean

    public var href: String

    public var icon: dynamic /* string | func */
    public var iconSize: Number
    public var iconClassName: String

    public var onMouseDown: (MouseEvent) -> Unit
}

@JsName("default")
public external val Button: RClass<ButtonProps>
