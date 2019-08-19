package org.gradle

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test
import static org.junit.Assert.*

class GreetingTaskTest {
    @Test
    public void canAddTaskToProject() {
        Project project = ProjectBuilder.builder().build();
        def task = project.task('greeting', type: GreetingTask) {
            greeting = 'hello from JUnit testcase'
        }
        assertTrue(task instanceof GreetingTask)
    }
}
