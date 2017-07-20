package KotlinDemo_IntelcomTest.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object KotlinDemo_IntelcomTest_KotlinIDE : GitVcsRoot({
    uuid = "0eac9176-fa92-40eb-8c04-b65e99b4befc"
    extId = "KotlinDemo_IntelcomTest_KotlinIDE"
    name = "KotlinIDE"
    url = "https://github.com/madhukumarkreddy/TeamCity_Kotlin"
    authMethod = password {
        userName = "madhukumarkreddy"
        password = "zxx820f0e3e9d8b22b9c8e28099b58a0211"
    }
})
