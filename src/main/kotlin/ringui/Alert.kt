@file:JsModule("@jetbrains/ring-ui/components/alert/alert")

package ringui

import react.RClass
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/alert/alert.js
public external interface AlertProps : WithClassName {
    public var timeout: Int
    public var onCloseRequest: () -> Unit
    public var onClose: () -> Unit
    public var isShaking: Boolean
    public var isClosing: Boolean
    public var inline: Boolean
    public var showWithAnimation: Boolean
    public var closeable: Boolean
    public var type: AlertType
}

@JsName("default")
public external val Alert: RClass<AlertProps>

