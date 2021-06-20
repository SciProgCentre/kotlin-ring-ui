@file:JsModule("@jetbrains/ring-ui/components/icon/icon")

package ringui

import react.RClass
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/icon/icon.js
public external interface IconProps : WithClassName {
    public var color: String
    public var glyph: String /* string | func */
    public var height: Double
    public var size: Double
    public var width: Double
    public var loading: Boolean
}

@JsName("default")
public external val Icon: RClass<IconProps>
