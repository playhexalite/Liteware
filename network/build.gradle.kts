dependencies {
    implementation("io.ktor:ktor-network:${Versioning.Ktor}")
    api(project(":protocol"))
    api(project(":api"))
}