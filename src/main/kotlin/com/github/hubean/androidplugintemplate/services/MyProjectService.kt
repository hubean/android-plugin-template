package com.github.hubean.androidplugintemplate.services

import com.github.hubean.androidplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
