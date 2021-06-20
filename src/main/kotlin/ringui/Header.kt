@file:JsModule("@jetbrains/ring-ui/components/header/header")

package ringui

import react.RClass
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/header/header.js
public external interface HeaderProps : WithClassName {
    public var spaced: Boolean
    public var theme: String
}

@JsName("default")
public external val Header: RClass<HeaderProps>
public external val RerenderableHeader: RClass<HeaderProps>

// Logo
public external interface HeaderLogoProps : IconProps

public external val Logo: RClass<HeaderLogoProps>

// Tray
// https://github.com/JetBrains/ring-ui/blob/master/components/header/tray.js
public external interface TrayProps : WithClassName

public external val Tray: RClass<TrayProps>

// TrayIcon
// https://github.com/JetBrains/ring-ui/blob/master/components/header/tray-icon.js
public external interface TrayIconProps : ButtonProps {
    public var rotatable: Boolean
}

public external val TrayIcon: RClass<TrayIconProps>


public external val Profile: RClass<WithClassName>
public external val SmartProfile: RClass<WithClassName>
public external val Services: RClass<WithClassName>
public external val SmartServices: RClass<WithClassName>
