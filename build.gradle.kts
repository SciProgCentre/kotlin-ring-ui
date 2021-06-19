plugins {
    id("ru.mipt.npm.gradle.project")
    id("ru.mipt.npm.gradle.js")
    `maven-publish`
}

group = "ru.mipt.npm"
version = "0.1.0"

dependencies {
    api("org.jetbrains.kotlin-wrappers:kotlin-react-dom")

    implementation(npm("@jetbrains/icons", "3.14.1"))
    implementation(npm("@jetbrains/ring-ui", "4.0.7"))

    implementation(npm("core-js","3.12.1"))
    compileOnly(npm("url-loader","4.1.1"))
    compileOnly(npm("postcss-loader","5.2.0"))
    compileOnly(npm("source-map-loader","2.0.1"))

    testImplementation(kotlin("test"))
}

kotlin {
    js(IR) {
        browser {
            useCommonJs()
            commonWebpackConfig {
                cssSupport.enabled = false
            }
        }
    }
}

ksciencePublish{
    github("ring-ui-kotlin")
    space()
//    sonatype()
}