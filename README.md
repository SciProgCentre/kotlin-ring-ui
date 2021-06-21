# Ring-ui
[Ring-ui](https://github.com/JetBrains/ring-ui) is an official open-source JetBrains library for writing web interfaces for JetBrains and not-so-JetBrains products and sites. This library provides thin layer wrapper to use it in Kotlin-JS with Kotlin-React framework.

# Artifact

**To be moved to kotlin-wrappers**

# Usage
The wrapper is to be used with Kotlin-JS IR compiler, the LEGACY mode is not supported.

The webpack requires additional configuration to work with this library:
* Kotlin browser css integration must be turned **off** because it creates too broad rules (see https://youtrack.jetbrains.com/issue/KT-47343 for details).
```kotlin
    js(IR) {
        browser {
            commonWebpackConfig {
                //Css support must be turned off not to conflict with ring-ui rules
                cssSupport.enabled = false
            }
        }
        binaries.executable()
    }
```
* The following rule must be added to `webpack.config.d`:
```js
const ringConfig = require('@jetbrains/ring-ui/webpack.config').config;

config.module.rules.push(...ringConfig.module.rules)
```
