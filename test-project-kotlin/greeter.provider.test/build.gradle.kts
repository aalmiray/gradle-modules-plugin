dependencies {
    implementation(project(":greeter.api"))
    runtimeOnly(project(":greeter.provider"))
}

patchModules.config = listOf(
        "java.annotation=jsr305-3.0.2.jar"
)
