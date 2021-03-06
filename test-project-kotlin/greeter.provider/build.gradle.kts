import org.javamodularity.moduleplugin.tasks.ModuleOptions

dependencies {
    implementation(project(":greeter.api"))
    compile("javax.annotation:javax.annotation-api:1.3.2")
    compile("com.google.code.findbugs:jsr305:3.0.2")

    testImplementation("org.hamcrest:hamcrest:2.1+")
}

patchModules.config = listOf(
        "java.annotation=jsr305-3.0.2.jar"
)

tasks.javadoc {
    extensions.configure<ModuleOptions> {
        addModules = listOf("java.sql")
    }
}
