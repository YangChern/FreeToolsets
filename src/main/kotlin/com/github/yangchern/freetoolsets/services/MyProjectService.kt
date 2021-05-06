package com.github.yangchern.freetoolsets.services

import com.github.yangchern.freetoolsets.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
