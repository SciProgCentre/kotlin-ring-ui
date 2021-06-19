plugins {
    id("ru.mipt.npm.gradle.js")
}

kotlin {
    explicitApi = null
    js(IR) {
        browser {
            commonWebpackConfig {
                //Css support must be turned off not to conflict with ring-ui rules
                cssSupport.enabled = false
            }
            testTask {
                useKarma {
                    useChromeHeadless()
                }
            }
        }
        binaries.executable()
    }
}

dependencies{
    implementation(rootProject)
}