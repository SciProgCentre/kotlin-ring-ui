package ringui.header

import react.RBuilder
import react.RElementBuilder
import react.RHandler
import ringui.IconProps

public external interface HeaderLogoProps : IconProps

public fun RBuilder.ringLogo(handler: RHandler<HeaderLogoProps>) {
    HeaderModule.Logo {
        handler()
    }
}

public fun RElementBuilder<HeaderProps>.ringLogo(handler: RHandler<HeaderLogoProps>) {
    HeaderModule.Logo {
        handler()
    }
}
