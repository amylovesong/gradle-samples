package org.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        // Add the 'greeting' extension object
        def extension = project.extensions.create('greeting', GreetingPluginExtension)
        // Add a task that uses configuration from the extension object
        project.task('hello') {
            doLast {
//                println 'Hello from the GreetingPlugin'
//                println extension.message
                println "${extension.message} from ${extension.greeter}"
            }
        }
    }

    static class GreetingPluginExtension {
        String message = 'Hello from GreetingPlugin'
        String greeter
    }
}
