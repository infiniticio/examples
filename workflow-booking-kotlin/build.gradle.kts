plugins {
    kotlin("jvm")
    application
}

kotlin {
    jvmToolchain(17)
}

application {
    // Define the main class for the application.
    mainClass.set("com.acme.workflows.booking.kotlin.WorkerKt")
}