@file:JsModule("@jetbrains/ring-ui/components/user-card/user-card")

package ringui

import react.RClass
import react.RProps

public external val UserCard: RClass<UserCardProps>

// https://github.com/JetBrains/ring-ui/blob/master/components/user-card/card.js
public external interface UserCardProps : RProps {
    public var user: UserCardModel
    public var wording: UserCardWording
}

public external interface UserCardModel {
    public val name: String
    public val login: String
    public val avatarUrl: String
    public val email: String?
    public val href: String?
}

public external interface UserCardWording {
    public val banned: String
    public val online: String
    public val offline: String
}
