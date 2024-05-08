

1. This solution file, `soln.java`, addresses the problem statement for the Magical Arena.
2. It primarily focuses on three attributes: health, strength, and attack, along with two players.
3. Initially, the user is prompted to input values for health, strength, and attack.
4. NOTE: that the entered values must be positive integers.
5. If the user provides non-positive values, the code prompts them to re-enter the correct values.
6. The user must input all three attribute values for both players.
7. After obtaining the inputs, the code assesses which player has lower health, and that player attacks first.
8. Each player can attack their opponent by rolling a die.
9. The user needs to input the value of the die.
10. Similarly, the opponent also has a chance to roll a die to defend themselves.
11. NOTE: The entered values of the dice must be strictly greater than 0 and less than 7.
12. The damage inflicted by the attacker to the defender is calculated.
13. Both players take turns attacking until one player's health reaches 0.

The unit test case file will include scenarios such as prompting the user to enter correct values for health, strength, and attack attributes, as well as ensuring valid input for the die. Additionally, scenarios where a player's maximum attack is less than the opponent's minimum defense will result in a tie.