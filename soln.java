import java.util.*;
import java.util.Scanner;

public class soln{

    // Player class representing each player in the game
    static class Player {
        int health;
        int strength;
        int attack;
        char name;

        public Player(int health, int strength, int attack, char name) {
            this.health = health;
            this.strength = strength;
            this.attack = attack;
            this.name = name;
        }
    }

        // Method to simulate a dice roll 
      /* static int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1; // Rolling a 6-sided dice
    } */ 
    
    // Method to perform a battle between two players A & B
    static void battle(Player playerA, Player playerB, Scanner scanner) {
        // Execution of Loop until one of the players' health reaches 0
        while (playerA.health > 0 && playerB.health > 0) {
            // Player A attacks first since they have lower health
            
            System.out.println(playerA.name + "'s turn to attack -> Enter the attack roll: ");
            int attackRollA = scanner.nextInt(); // Input attacking dice roll for Player A 
            
            /* int attackRollA = rollDice();  */ // when the dice value is taken randomly 
            
            while(attackRollA <= 0 || attackRollA >= 7){ // checking whether the roll is inbetween 0&7
                System.out.println("The attack roll should be greater than 0 and less than 7 -> Re-enter attack roll: ");
                 attackRollA = scanner.nextInt(); // re-enter the roll if the value is <=0 and >=7
            }
            
            int attackDamageA = playerA.attack * attackRollA; // Calculating the attack damage for Player A

            System.out.println(playerB.name + "'s turn to defend ->   Enter the defend roll: ");
            int defendRollB = scanner.nextInt(); // Input defending dice roll for Player B
            
            /* int defendRollB = rollDice(); */ // when the dice value is taken randomly 
            
            while(defendRollB <= 0 || defendRollB >= 7){ // checking whether the roll is inbetween 0&7
                System.out.println("The defend roll should be greater than 0 and less than 7 -> Re-enter defend roll: ");
                 defendRollB = scanner.nextInt(); // re-enter the roll if the value is <=0 and >=7
            } 
            
            
            int defendStrengthB = playerB.strength * defendRollB; // Calculating the defending strength for Player B

            int damageTakenB = Math.max(0, attackDamageA - defendStrengthB); // Calculating the damage taken by Player B
            playerB.health -= damageTakenB; // Reduce Player B's health
            System.out.println();
            // getting the current health of the player and Checking if Player B's health has reached 0
            if(playerB.health <= 0){
                System.out.println("The current health of "+ playerB.name + " is 0" );
                System.out.println("Player " + playerA.name + " wins!"); // playerA wins the game 
                break; // Exit the loop if Player A is defeated
            }
            else{
            System.out.println("The current health of "+ playerB.name + " is " + playerB.health); // getting the current health of playerB
            } 
            System.out.println();


            // Player B attacks
            System.out.println(playerB.name + "'s turn to attack -> Enter the attack roll: ");
            int attackRollB = scanner.nextInt(); // Input attacking dice roll for Player B 
            
            /* int attackRollB = rollDice(); */ // when the dice value is taken randomly
            
            while(attackRollB <= 0 || attackRollB >= 7){ // checking whether the roll is inbetween 0&7
                System.out.println("The attack roll should be greater than 0 and less than 7 -> Re-enter attack roll: ");
                 attackRollB = scanner.nextInt(); // re-enter the roll if the value is <=0 and >=7
            }
           
            
            int attackDamageB = playerB.attack * attackRollB; // Calculating the attack damage for Player B

            System.out.println(playerA.name + "'s turn to defend -> Enter the defend roll:");
            int defendRollA = scanner.nextInt(); // Input defending dice roll for Player A
            
            /* int defendRollA = rollDice(); */ // when the dice value is taken randomly 
            
            while(defendRollA <= 0 || defendRollA >= 7){ // checking whether the roll is inbetween 0&7
                System.out.println("The defend roll should be greater than 0 and less than 7 -> Re-enter defend roll: ");
                 defendRollA = scanner.nextInt(); // re-enter the roll if the value is <=0 and >=7
            }
           
            
            int defendStrengthA = playerA.strength * defendRollA; // Calculating the defending strength for Player A

            int damageTakenA = Math.max(0, attackDamageB - defendStrengthA); // Calculating the damage taken by Player A
            playerA.health -= damageTakenA; // Reducing Player A's health
            System.out.println();
            // getting the current health of the player and Checking if Player A's health has reached 0
            if(playerA.health <= 0){
                System.out.println("The current health of "+ playerA.name + " is 0" );
                System.out.println();
                System.out.println("Player " + playerB.name + " wins!"); // playerB wins the game 
                break; // Exit the loop if Player A is defeated
            }
            else{
            System.out.println("The current health of "+ playerA.name + " is " + playerA.health); // getting the current health of playerA
            } 
            System.out.println();

        }
    }

    public static void main(String[] args) {
        // Defining players A and B with their attributes from the users
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter health for playerA");
        int healthA = scanner.nextInt(); // Health of playerA 
        
        while(healthA <= 0){ // checking if the healthA is >0 or not
            System.out.println("The healthA should be positive Integer -> Re-enter: ");
            healthA = scanner.nextInt(); // re-enter the health if value is <=0
        }
        
        System.out.println("Enter strength for playerA");
        int strengthA = scanner.nextInt(); // Strength of playerA
        
         while(strengthA <= 0){ // checking if the strengthA is >0 or not
             System.out.println("The strengthA should be positive Integer -> Re-enter: ");
            strengthA = scanner.nextInt(); // re-enter the strength if value is <=0
        }
        
        System.out.println("Enter attack for playerA");
        int attackA = scanner.nextInt(); // Attack of playerA 
        
         while(attackA <= 0){ // checking if the attackA is >0 or not
             System.out.println("The attackA should be positive Integer -> Re-enter: ");
            attackA = scanner.nextInt(); // re-enter the attack if value is <=0
        }
        
        Player playerA = new Player(healthA, strengthA, attackA, 'A');

        System.out.println("Enter health playerB");
        int healthB = scanner.nextInt(); // Health of playerB 
        
         while(healthB <= 0){ // checking if the healthB is >0 or not 
             System.out.println("The healthB should be positive Integer -> Re-enter: ");
            healthB = scanner.nextInt(); // re-enter the health if value is <=0
        }
        
        System.out.println("Enter strength for playerB");
        int strengthB = scanner.nextInt(); // Strength of playerB 
        
         while(strengthB <= 0){ // checking if the strengthB is >0 or not 
             System.out.println("The strengthB should be positive Integer -> Re-enter: ");
            strengthB = scanner.nextInt(); // re-enter the strength if value is <=0
        }
        
        System.out.println("Enter attack for playerB");
        int attackB = scanner.nextInt(); // Attack of playerB 
        
         while(attackB <= 0){  // checking if the attackB is >0 or not
             System.out.println("The attackB should be positive Integer -> Re-enter: ");
            attackB = scanner.nextInt(); // re-enter the attack if value is <=0
        }
        
        Player playerB = new Player(healthB, strengthB, attackB, 'B');  
        
        // checking is the entered values results in a tie 
        if((playerA.attack * 6 < playerB.strength) && (playerB.attack * 6 < playerA.strength)){
            System.out.println(" This will be a tie!! -> play Again"); // none of the players can damage each other 
        }
        // Starting a battle between players A and B based on whose health is low
        else if (playerA.health <= playerB.health) {// If playerA health is less than or equal to playerB
            System.out.println(playerA.name + " is Attacking First");
            battle(playerA, playerB, scanner);
        } else { // If playerB health is less than playerA
            System.out.println(playerB.name + " is Attacking First");
            battle(playerB, playerA, scanner);
        }

        scanner.close(); // Close the scanner after usage
    } 
} 