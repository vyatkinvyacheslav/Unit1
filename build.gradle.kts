import jdk.nashorn.internal.objects.NativeRegExp.test


plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

        //dependencies {
   // testImplementation(platform("org.junit:junit-bom:5.9.1"))
    //testImplementation("org.junit.jupiter:junit-jupiter")
//}

//tasks.test {
    //useJUnitPlatform()
//}
dependencies {
    testImplementation group: 'org.testng', name: 'testng', version: '7.1.0'

}

test {
    useTestNG()
}