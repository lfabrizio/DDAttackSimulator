# DDAttackSimulator

This is a basic Dungeons and Dragons console application. Multiple classes are created such as Die, Character, Player, Game, Console, and attributes.

The D&D program will first determines if a player/enemy lands a hit (including potential criticals) then determine the damage dealt.
The user will be allowed the ability to select gear(attire colors), classType(Barbarian, Fighter, Wizard, other), background(Noble, Folk hero, Acolyte), Alignment(Lawful, Chaotic).

Basic rules to determine if an attack results in a hit:
1. roll a d20
2. if a 20 is rolled this is considered an Natural 20 -> the attack lands and is considered critical (roll damage twice)
3. if a 1 is rolled this is a natural 1 and is considered a critical miss.
4. after the roll add the attack modifier
5. if total is above targets AC + defense modifier then the attack lands and damage should be calculated by rolling the damage dice of the attack
