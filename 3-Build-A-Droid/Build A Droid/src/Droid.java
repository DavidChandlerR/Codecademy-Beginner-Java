/*
We’ve set up a robot workshop to build some droids. All that’s missing are the instructions on how to create the robots and what they’ll do.

Can we write a Java class to help?

We’ll need to define the state and behavior of the droids using instance fields and methods. Let’s get to work!
 */

/*
We want a Droid object that has the following state:
    name
    battery level
and the following behavior:
    performing a task
    stating its battery level
 */
public class Droid{
    int batteryLevel;
    String name;


    public Droid(String droidName){

        batteryLevel = 100;
        name = droidName;

    }

    /*
Define a toString() method within Droid.
The return type is String.
Inside toString(), return a string that introduces the Droid using their name.
Something like “Hello, I’m the droid: droidNameHere”
     */
    public String toString(){
        return "Hello, I'm the Droid: " + name;
    }

/*
Create a energyReport() method that prints the instance’s batteryLevel.
Create another instance.
Create a method energyTransfer() that exchanges batteryLevel between instances.
 */
    public void batteryTransfer(Droid robot1, int energyTransfer, Droid robot2) {

        robot1.batteryLevel = robot1.batteryLevel + energyTransfer;
        robot2.batteryLevel = robot2.batteryLevel - energyTransfer;
    }

/*
Performing tasks is hard work. After the print statement, set batteryLevel to be 10 less than it was before.
We’ll need to reassign the instance field to be the current value minus 10.
 */
    public void performTask(String task){

        System.out.println( name +" is performing the task " + task + "!");
        batteryLevel -= 10;
        System.out.println("My new battery level is: " + batteryLevel);
    }


    public static void main(String[] args){
        Droid r2d2 = new Droid("Codey");
        Droid r2d3 = new Droid("Codey2");

        System.out.println(r2d2);
        r2d2.performTask("Cleaning");
        r2d2.performTask("Shopping");
        r2d2.performTask("Jumping");
        r2d2.performTask("Running");
        r2d2.performTask("Working");

        if (r2d2.batteryLevel <= 50) {
            r2d2.batteryTransfer(r2d2, 50, r2d3);
            System.out.println("Current reserves at " + r2d3.batteryLevel);
            System.out.println(r2d3.name + " is performing an energy transfer!");
            System.out.println(r2d2.name + " energy reserves are currently at " + r2d2.batteryLevel);
        }
    }
}