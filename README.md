Note : This repository is an individual project repository I developed locally in February 2024 using java.

# MultiGame Using Java

A desktop game launcher built with Java Swing. One application hosts three classic games: Ping Pong, Brick Breaker, and Snake & Ladders.

**Created by:** Mitul Prajapati

---

## What Is Included

| Game | Description |
|------|-------------|
| **Game 1 — Ping Pong** | Two-player paddle game. First player to let the ball pass their side loses. |
| **Game 2 — Brick Breaker** | Break all bricks with the ball. Move the paddle left and right. |
| **Game 3 — Snake & Ladders** | Board game for 1–3 players. Roll the dice, climb ladders, and avoid snakes. |

---

## Requirements

- **Java JDK 17 or later** (JDK 20+ recommended)
- A graphical desktop environment (Windows, macOS, or Linux)
- No extra libraries — only the standard Java SDK is used

Check your Java version:

```bash
java -version
javac -version
```

---

## Project Structure

```
MultiGameUsingJava/
├── README.md
├── run.bat                    # Windows: compile and run in one step
├── MultiGameUsingJava.iml     # IntelliJ / Cursor module file
└── project/
    └── src/                   # Source root (compile from here)
        ├── project/           # Launcher and Ping Pong
        │   ├── MainClass.java   ← Main entry point
        │   ├── Game1Play.java   ← Splash screen and game menu
        │   └── Game.java        ← Ping Pong logic and window
        ├── demogame/          # Brick Breaker
        │   ├── GamePlay.java
        │   └── MapGenerator.java
        └── src/
            └── GameApplication/   # Snake & Ladders
                ├── SnakeAndLadder.java
                ├── GridPanel.java
                ├── SettingsFrame.java
                └── ... (supporting UI classes)
```

---

## How to Run the Project

### Option 1 — Quick start (Windows)

1. Open the project folder: `MultiGameUsingJava`
2. Double-click **`run.bat`**
3. Wait for the splash screen, then use the game selection menu

The script compiles all source files and starts the launcher automatically.

---

### Option 2 — Command line (all platforms)

**Step 1 — Open a terminal** in the project folder.

**Step 2 — Go to the source directory:**

```bash
cd project/src
```

**Step 3 — Compile:**

```bash
javac -encoding UTF-8 project/MainClass.java project/Game1Play.java project/Game.java demogame/*.java src/GameApplication/*.java
```

**Step 4 — Run:**

```bash
java project.MainClass
```

If compilation succeeds with no errors, the launcher window will open.

---

### Option 3 — IntelliJ IDEA or Cursor

1. Open the **`MultiGameUsingJava`** folder as a project
2. Confirm the source root is set to **`project/src`** (see `MultiGameUsingJava.iml`)
3. Open `project/src/project/MainClass.java`
4. Right-click the file → **Run 'MainClass.main()'**

---

## Using the Launcher

1. **Splash screen** — A short loading bar appears on startup.
2. **Game selection** — Choose Game 1, Game 2, or Game 3, or click **Exit** to close.
3. **In-game buttons** — Most games include **HOME** (return to menu) and **RESTART** / **RESET** where applicable.

---

## Game Controls

### Game 1 — Ping Pong

| Player | Move up | Move down |
|--------|---------|-----------|
| Left   | `Q`     | `A`       |
| Right  | `P`     | `L`       |

- Press **Enter** after game over to restart.
- Use **HOME** or **RESTART** on the title bar as needed.

### Game 2 — Brick Breaker

| Action        | Key              |
|---------------|------------------|
| Move left     | `←` (Left arrow) |
| Move right    | `→` (Right arrow)|
| Restart       | `Enter` (after game over) |

### Game 3 — Snake & Ladders

- Use **Roll Dice** on the game screen.
- Configure players and board options from the **Menu → Settings**.
- Use **Menu → Home Page** to return to the launcher.

---

## Troubleshooting

| Problem | What to try |
|---------|-------------|
| `'javac' is not recognized` | Install a JDK and add it to your system `PATH`. |
| Compilation errors | Use JDK 17+. Run compile commands from `project/src`. |
| Window does not appear | Run on a machine with a desktop GUI; avoid headless-only environments. |
| Game 3 closes immediately | Check the terminal for errors; ensure all `GameApplication` files are present. |

---

## Rebuild After Code Changes

From `project/src`:

```bash
javac -encoding UTF-8 project/MainClass.java project/Game1Play.java project/Game.java demogame/*.java src/GameApplication/*.java
java project.MainClass
```

Or run `run.bat` again on Windows.

---

## License

This project is provided for educational and personal use. See the author credit in the application splash screen.
