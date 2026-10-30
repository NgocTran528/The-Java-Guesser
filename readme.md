## Guesser

### main
```
public static void main(String[] args)
    make a new Guesser
```

### Guesser (constructor)
```
    make a Scanner called input on System.in
    make a string called choice and set it to ""
    make a bool called keepGoing and set it to true
    while keepGoing is true:
        choice = menu()
        if choice equals "1": call humanGuesser
        else if choice equals "2": call computerGuesser
        else if choice equals "0": set keepGoing to false
        else print "not a valid choice"
```

### menu
```
String menu()
    print the three choices 0 to 2
    print "Please enter 0-2: "
    read a line from input into choice
    return choice
```

### humanGuesser
```
void humanGuesser()
    print "human guesser"
    make an int called answer = a random number from 1 to 100
    make an int called tries = 0
    make an int called guess = 0 
    while guess is not answer:
        add 1 to tries
        print tries and ") Please enter a number: "
        read a line and convert it to an int, put it in guess
        if guess < answer: print "too low"
        else if guess > answer: print "too high"
        print "got it!"
    print "Very good!"
```
### computerGuesser
```
void computerGuesser()
    print "computer guesser"
    make int low = 1, high = 100, tries = 0
    make a string called response and set it to ""
    while response does not equal "c":
        add 1 to tries
        guess = (low + high) / 2
        print tries and ") I guess " and guess
        print "Too (H)igh, too (L)ow, or (C)orrect?"
        read a line, make it lowercase, put it in response
        if response equals "h": high = guess - 1
        else if response equals "l": low = guess + 1
```
## Blackbelt

Black belt version is in Blackbelt.java, run with `make runbb`


### humanGuesser and computerGuesser (blackbelt)
```
    same as before, but return tries at the end
```

### race (blackbelt)
```
    print the rules
    humanTries = humanGuesser()
    computerTries = computerGuesser()
    print both counts
    if humanTries < computerTries print "Human wins!"
    else if computerTries < humanTries print "Computer wins"
    else print "It's a tie"
```
## Pushing the envelope
Added a Race option in Blackbelt.java. The human guesses a random number then the computer guesses one, and whoever used fewer tries wins. humanGuesser and computerGuesser return their try count so race can compare them.

