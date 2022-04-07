package com.github.jonesxv.webstormcreatecomponent.services

import com.intellij.openapi.project.Project
import com.github.jonesxv.webstormcreatecomponent.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
