# 🎮 Guess Number Game

A simple console-based Java game where the player tries to guess a random number between **1 and 100** with limited attempts.

---

## 📌 Features

* Random number generation using `Random`
* Input validation using `Scanner`
* Handles invalid inputs with `InputMismatchException`
* Limited attempts system
* Score tracking
* Play again option
* Clean console messages and game flow

---

## 🛠 Technologies Used

* Java
* OOP Concepts
* Exception Handling
* Loops & Conditions

---

## 🚀 How to Run

1. Clone the repository:

```bash
git clone https://github.com/AdhamMohamed90/DecodeLabs-Internship.git
```

2. Open the project in your IDE
   (Apache NetBeans, Eclipse, VS Code, etc.)

3. Run the `Main` class.

---

## 🎲 Game Rules

* The computer generates a random number from **1 to 100**
* You have **5 attempts** to guess the correct number
* After each guess:

  * If your number is bigger → `"Too High"`
  * If your number is smaller → `"Too Low"`
* If you guess correctly:

  * Your score increases
  * You can choose to play again
* If attempts become zero:

  * Game Over

---

## 📷 Example Gameplay

```text
========================
WELCOME TO GUESS GAME
========================

please guess the number from 1 to 100

50
Too High

25
Too Low

37
true because your number is 37 and the target is 37
```

---

## 📚 Concepts Practiced

* `Scanner`
* `Random`
* `while` loops
* Nested loops
* Exception handling
* Methods
* User input validation

---

## 👨‍💻 Author

Created by Adham Mohamed

---

## ⭐ Future Improvements

* Add difficulty levels
* Add leaderboard system
* GUI version using Java Swing or JavaFX
* Multiplayer mode
* Save scores to file/database
