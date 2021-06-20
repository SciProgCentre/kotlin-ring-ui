import kotlinx.browser.document
import react.dom.p
import react.dom.render
import ringui.*
import ringui.header.Header
import ringui.header.TrayIcon
import ringui.Header as IslandHeader

// language=SVG
const val ICON_CONTENT = """<svg width="40" height="40"><rect fill="red" width="40" height="40"/></svg>"""

fun main() {
    render(document.getElementById("root")) {
        Header {
            TrayIcon {
                attrs.icon = ICON_CONTENT
            }
        }

        Grid {
            Row {
                Col {
                    attrs {
                        xs = 6
                    }
                    Island {
                        IslandHeader {
                            +"This is island header"
                        }
                        Content {
                            p { +"This is island content" }
                        }
                    }
                }
            }
        }
    }
}
