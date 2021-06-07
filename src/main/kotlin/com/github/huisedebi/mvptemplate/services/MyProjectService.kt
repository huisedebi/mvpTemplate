package com.github.huisedebi.mvptemplate.services

import com.github.huisedebi.mvptemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
