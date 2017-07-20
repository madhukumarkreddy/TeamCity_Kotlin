package KotlinDemo_IntelcomTest.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object KotlinDemo_IntelcomTest_HelloWorld : BuildType({
    uuid = "a584c094-14a2-41ac-a847-ea5afe4a55e3"
    extId = "KotlinDemo_IntelcomTest_HelloWorld"
    name = "HelloWorld"

    steps {
        script {
            scriptContent = """echo "Hello World!""""
        }
    }
})
