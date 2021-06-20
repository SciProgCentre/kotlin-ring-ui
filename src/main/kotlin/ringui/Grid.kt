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
    public var xs: dynamic // number or boolean
    public var sm: dynamic // number or boolean
    public var md: dynamic // number or boolean
    public var lg: dynamic // number or boolean
    public var xsOffset: Number
    public var smOffset: Number
    public var mdOffset: Number
    public var lgOffset: Number
    public var reverse: Boolean
}

public external val Col: RClass<ColProps>
