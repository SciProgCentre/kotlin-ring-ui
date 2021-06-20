@file:JsModule("@jetbrains/ring-ui/components/icon/icon")

package ringui

import react.RClass
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/icon/icon.js
public external interface IconProps : WithClassName {
    public var color: String
    public var glyph: dynamic /* string | func */
    public var height: Number
    public var size: Number
    public var width: Number
    public var loading: Boolean
}

@JsName("default")
public external val Icon: RClass<IconProps>
