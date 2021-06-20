@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package ringui

@JsName("null")
public sealed external interface AlertType {
    public companion object
}

public inline val AlertType.Companion.error: AlertType
    get() = "error".unsafeCast<AlertType>()

public inline val AlertType.Companion.message: AlertType
    get() = "message".unsafeCast<AlertType>()

public inline val AlertType.Companion.success: AlertType
    get() = "success".unsafeCast<AlertType>()

public inline val AlertType.Companion.warning: AlertType
    get() = "warning".unsafeCast<AlertType>()

public inline val AlertType.Companion.loading: AlertType
    get() = "loading".unsafeCast<AlertType>()

