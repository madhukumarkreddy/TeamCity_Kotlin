package KotlinDemo_IntelcomTest

import KotlinDemo_IntelcomTest.buildTypes.*
import KotlinDemo_IntelcomTest.vcsRoots.*
import KotlinDemo_IntelcomTest.vcsRoots.KotlinDemo_IntelcomTest_KotlinIDE
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "53de5107-5fa8-4b75-8f88-64f0c70471c5"
    extId = "KotlinDemo_IntelcomTest"
    parentId = "KotlinDemo"
    name = "Intelcom_Test"

    vcsRoot(KotlinDemo_IntelcomTest_KotlinIDE)

    buildType(KotlinDemo_IntelcomTest_HelloWorld)

    features {
        versionedSettings {
            id = "PROJECT_EXT_3"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = KotlinDemo_IntelcomTest_KotlinIDE.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
