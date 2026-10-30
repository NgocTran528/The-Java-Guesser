Guesser.class: Guesser.java
	javac -g Guesser.java

Blackbelt.class: Blackbelt.java
	javac -g Blackbelt.java

run: Guesser.class
	java Guesser

runbb: Blackbelt.class
	java Blackbelt

clean:
	rm -f *.class
