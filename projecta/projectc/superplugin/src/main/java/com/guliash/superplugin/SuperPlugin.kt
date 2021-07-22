package com.guliash.superplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class SuperPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        project.afterEvaluate {
            println("Evaluated project: ${project.name}")
        }
    }
}