# Kotlincraft
## Bukkot and BungeeKot
Kotlin stdlib, reflect and coroutines in a minecraft plugin. \
This plugin does not add any game features. It just provides Kotlin libraries.



# How to build
Use Maven to build: `mvn clean package`

# How to use

Do not include this plugin as a dependency in your own plugin.\
Include the kotlin libraries.\
The scope should be set to `Provided`\
Use the normal Spigot/BungeeCord API classes. (JavaPlugin etc)\
Add the appropiate plugin to the plugin folders.

```xml
<dependencies>
    <dependency>
        <groupId>org.jetbrains.kotlin</groupId>
        <artifactId>kotlin-reflect</artifactId>
        <version>${kotlin.version}</version>
        <scope>provided</scope>
    </dependency>
    <dependency>
        <groupId>org.jetbrains.kotlin</groupId>
        <artifactId>kotlin-stdlib-jdk8</artifactId>
        <version>${kotlin.version}</version>
        <scope>provided</scope>
    </dependency>
    <dependency>
        <groupId>org.jetbrains.kotlinx</groupId>
        <artifactId>kotlinx-coroutines-core</artifactId>
        <version>${kotlinx.coroutines.version}</version>
        <scope>provided</scope>
    </dependency>
    <dependency>
        <groupId>org.jetbrains.kotlinx</groupId>
        <artifactId>kotlinx-coroutines-jdk8</artifactId>
        <version>${kotlinx.coroutines.version}</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```
