package KotlinDemo_IntelcomTest

import KotlinDemo_IntelcomTest.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "53de5107-5fa8-4b75-8f88-64f0c70471c5"
    extId = "KotlinDemo_IntelcomTest"
    parentId = "KotlinDemo"
    name = "Intelcom_Test"

    buildType(KotlinDemo_IntelcomTest_HelloWorld)
})
