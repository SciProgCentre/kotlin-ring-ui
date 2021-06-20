@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package ringui

public sealed external interface RowPosition {
    public companion object
}

public inline val RowPosition.Companion.xs: RowPosition
    get() = "xs".unsafeCast<RowPosition>()

public inline val RowPosition.Companion.sm: RowPosition
    get() = "sm".unsafeCast<RowPosition>()

public inline val RowPosition.Companion.md: RowPosition
    get() = "md".unsafeCast<RowPosition>()

public inline val RowPosition.Companion.lg: RowPosition
    get() = "lg".unsafeCast<RowPosition>()
