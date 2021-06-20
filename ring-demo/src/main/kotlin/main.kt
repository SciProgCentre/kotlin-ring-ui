import kotlinx.browser.document
import react.dom.p
import react.dom.render
import ringui.*

fun main() {
    render(document.getElementById("root")) {
        Grid {
            Row {
                Col {
                    attrs {
                        xs = 6
                    }
                    Island {
                        Header {
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
