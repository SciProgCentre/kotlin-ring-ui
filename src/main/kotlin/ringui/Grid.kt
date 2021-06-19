package ringui

import react.RClass
import react.RElementBuilder
import react.RProps
import react.dom.WithClassName

public external interface GridProps: RProps

public enum class RowPosition {
    xs,
    sm,
    md,
    lg
}

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


@JsModule("@jetbrains/ring-ui/components/grid/grid")
@PublishedApi
internal external object GridModule {
    val Grid: RClass<GridProps>
    val Row: RClass<RowProps>
    val Col: RClass<ColProps>
}

public inline val Grid: RClass<GridProps> get() = GridModule.Grid

public inline val RElementBuilder<GridProps>.Row: RClass<RowProps> get() = GridModule.Row

public inline val RElementBuilder<GridProps>.Col: RClass<ColProps> get() = GridModule.Col


