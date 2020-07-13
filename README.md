# Citybuild
 A plugin for Minecraft Spigot which allows you to create and manage cities.


## Diary

<details>
<summary>Day 1</summary>
 
**Basic Project Setup**
- Create new IntelliJ Java Project "mc-spigot--citybuild" with JDK 1.8 (minimum required version for running the plugin)
- Build current version of Spigot API with [BuildTools](https://www.spigotmc.org/wiki/buildtools/)
- Setup basic Spigot server for testing
- Setup Project Structure
  - Add Spigot API as Library
  - Create new Artifact "Citybuild-1.16.jar" (Jar from modules with dependencies) and remove "Extracted 'spigot-1.16.jar/'"
  - Make sure SDK 1.8 is selected

**First Code**
- Create package inside src folder (janfr.citybuild)
- Create Main.java inside citybuild and extend from JavaPlugin
  - Add logs for onEnable and onDisable
  - Set command executor for first command
- Create package inside janfr.citybuild (commands)
- Create CmdCity.java inside commands and implement from CommandExecutor
  - Override onCommand
- Create plugin.yml inside src folder
  - Add basic information (main, name, description, version, author, commands)
  
**Testing**
- Build artifact
- Move built plugin to plugin folder of Spigot server
- Run Spigot server and test
</details>
