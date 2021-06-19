plugins {
    id("ru.mipt.npm.gradle.js")
}

kotlin {
    explicitApi = null
    js {
        browser {
            webpackTask {
                cssSupport.enabled = false
            }

            runTask {
                cssSupport.enabled = false
            }

            testTask {
                useKarma {
                    useChromeHeadless()
                    webpackConfig.cssSupport.enabled = true
                }
            }
        }
        binaries.executable()
    }
}