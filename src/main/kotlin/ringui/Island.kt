package ringui

import react.RBuilder
import react.RClass
import react.RElementBuilder
import react.RHandler
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/island/header.js
public external interface IslandHeaderProps : WithClassName {
    public var border: Boolean
    public var wrapWithTitle: Boolean
    public var phase: Number
}

// https://github.com/JetBrains/ring-ui/blob/master/components/island/content.js
public external interface IslandContentProps : WithClassName {
    public var scrollableWrapperClassName: String
    public var fade: Boolean
    public var bottomBorder: Boolean
    public var onScroll: () -> Unit
    public var onScrollToBottom: () -> Unit
}

@JsModule("@jetbrains/ring-ui/components/island/island")
@PublishedApi
internal external object IslandModule {
    @JsName("default")
    val Island: RClass<IslandProps>
    val Content: RClass<IslandContentProps>
    val Header: RClass<IslandHeaderProps>
    val AdaptiveIsland: RClass<IslandProps>
}

// https://github.com/JetBrains/ring-ui/blob/master/components/island/island.js
public external interface IslandProps : WithClassName {
    public val narrow: Boolean
    public val withoutPaddings: Boolean
}

public inline val Island: RClass<IslandProps> get() = IslandModule.Island

public inline val AdaptiveIsland: RClass<IslandProps> get() = IslandModule.AdaptiveIsland


public inline val RElementBuilder<IslandProps>.Header: RClass<IslandHeaderProps>
    get() = IslandModule.Header

public inline val RElementBuilder<IslandProps>.Content: RClass<IslandContentProps>
    get() = IslandModule.Content


public fun RBuilder.islandWithContent(header: String, handler: RHandler<IslandContentProps>) {
    Island {
        Header {
            attrs {
                border = true
            }
            +header
        }
        Content(handler)
    }
}