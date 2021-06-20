@file:JsModule("@jetbrains/ring-ui/components/dialog/dialog")

package ringui

import react.RClass
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/dialog/dialog.js
public external interface DialogProps : WithClassName {
    public var contentClassName: String
    public var show: Boolean
    public var showCloseButton: Boolean
    public var onOverlayClick: () -> Unit
    public var onEscPress: () -> Unit
    public var onCloseClick: () -> Unit

    // onCloseAttempt is a common callback for ESC pressing and overlay clicking.
    // Use it if you don't need different behaviors for this cases.
    public var onCloseAttempt: () -> Unit

    // focusTrap may break popups inside dialog, so use it carefully
    public var trapFocus: Boolean
    public var autoFocusFirst: Boolean
}

@JsName("default")
public external val Dialog: RClass<DialogProps>
