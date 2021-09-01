import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm")
}

java.targetCompatibility = JavaVersion.VERSION_11

tasks.withType<KotlinCompile>().configureEach {
	kotlinOptions {
		apiVersion = "1.5"
		languageVersion = "1.5"
		jvmTarget = java.targetCompatibility.majorVersion
	}
}

repositories {
	mavenLocal()
	mavenCentral()
}

dependencies {
	implementation(kotlin("stdlib-jdk8"))
}
