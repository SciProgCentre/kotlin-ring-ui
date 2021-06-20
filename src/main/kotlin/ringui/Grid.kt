@file:JsModule("@jetbrains/ring-ui/components/grid/grid")

package ringui

import react.RClass
import react.RProps
import react.dom.WithClassName

public external interface GridProps : RProps

public external val Grid: RClass<GridProps>

public external interface RowProps : GridProps, WithClassName {
    public var reverse: Boolean
    public var start: RowPosition
    public var center: RowPosition
    public var end: RowPosition
    public var top: RowPosition
    public var middle: RowPosition
    public var baseline: RowPosition
    public var bottom: RowPosition
    public var around: RowPosition
    public var between: RowPosition
    public var first: RowPosition
    public var last: RowPosition
}

public external val Row: RClass<RowProps>

public external interface ColProps : GridProps, WithClassName {
    public var xs: Int // number or boolean
    public var sm: Int // number or boolean
    public var md: Int // number or boolean
    public var lg: Int // number or boolean
    public var xsOffset: Int
    public var smOffset: Int
    public var mdOffset: Int
    public var lgOffset: Int
    public var reverse: Boolean
}

public external val Col: RClass<ColProps>
