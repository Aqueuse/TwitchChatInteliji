package com.github.aqueuse.twitchchatinteliji.services

import com.intellij.openapi.project.Project
import com.github.aqueuse.twitchchatinteliji.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
