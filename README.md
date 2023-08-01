## Rock, Paper, Scissors Game

The goal is to create a rock, paper, scissors game involving two players.
Each player should enter their choice on the terminal. Results of the input should then be
printed on the console.

If an unexpected input is entered on the console, then the player should be provided with an option to
either continue with the game or exit.

### Expected Input

The players can either enter: rock, paper or scissors. Any other input is not allowed.


### Possible Outcomes
1. Rock Wins

One player enters rock while the other enters scissors.

2. Paper Wins

One player enters paper while the other enters rock

3. Scissors Win

One player enters scissors while the other enters paper.

4. Tie

Both players enter the same thing

### Game Simulation
Simulation 1:
```
Enter either Rock, Paper or Scissors

Player A Choice:
Rock

Player B Choice:
Rock

Result -----> It is a Tie
```

Simulation 2:
```
Enter either Rock, Paper or Scissors

Player A Choice:
Rok

Player B Choice:
Paper

Please enter either Rock, Paper or Scissors
Continue? Y/N
n

Game exits
```

Simulation 3:
```
Enter either Rock, Paper or Scissors

Player A Choice:
Rok

Player B Choice:
Paper

Please enter either Rock, Paper or Scissors
Continue? Y/N
Y

Enter either Rock, Paper or Scissors

Player A Choice:
    '
    '
    '
```
### Getting Started

1. Clone the repository

`$ git clone git@github.com:waynemorphic/RPS-Game.git`

`cd RPS-Game`

2. Run the script

Open the Main.java file and run it with your IDE.

Alternatively, navigate into the relative path of Main.java file in your IDE terminal then run:

`java Main.java`

3. Tests

There are no test cases so far as the assumption is that all possible edge cases based on wrong user input
have been covered by the HashSet default elements and the input validation method.

However, if need be, tests can/will be added.

### Technologies

1. Java 8 -> JDK 1.8
2. Maven
3. Git
