@file:JsModule("@jetbrains/ring-ui/components/island/island")

package ringui

import react.RClass
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/island/island.js
public external interface IslandProps : WithClassName {
    public val narrow: Boolean
    public val withoutPaddings: Boolean
}

@JsName("default")
public external val Island: RClass<IslandProps>

public external val AdaptiveIsland: RClass<IslandProps>

// https://github.com/JetBrains/ring-ui/blob/master/components/island/header.js
public external interface IslandHeaderProps : WithClassName {
    public var border: Boolean
    public var wrapWithTitle: Boolean
    public var phase: Number
}

@JsName("Header")
public external val IslandHeader: RClass<IslandHeaderProps>

// https://github.com/JetBrains/ring-ui/blob/master/components/island/content.js
public external interface IslandContentProps : WithClassName {
    public var scrollableWrapperClassName: String
    public var fade: Boolean
    public var bottomBorder: Boolean
    public var onScroll: () -> Unit
    public var onScrollToBottom: () -> Unit
}

@JsName("Content")
public external val IslandContent: RClass<IslandContentProps>
