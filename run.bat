@echo off
title MultiGame Using Java
cd /d "%~dp0project\src"
echo Compiling...
javac -encoding UTF-8 project\MainClass.java project\Game1Play.java project\Game.java demogame\*.java src\GameApplication\*.java
if errorlevel 1 (
    echo.
    echo Compilation failed. Install JDK 17+ and ensure you run this from the project root.
    pause
    exit /b 1
)
echo Starting game launcher...
java project.MainClass

