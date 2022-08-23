public class MadLibs {
    /*
    we have provided the story, but it will be up to you to complete the following:
    Create all the variables needed for the story.
    Print the story with the variables in the right places.
    */

    /*
     String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
     */
    public static void main(String[] args){
        String name1 = "David";
        String adjective1 = "tired";
        String adjective2 = "windy";
        String adjective3 = "Rainy";
        String verb1 = "run";
        String verb2 = "jump";
        String noun1 = "Toolbar";
        String noun2 = "computer";
        String noun3 = "Roter";
        String noun4 = "Howitzer";
        String noun5 = "Socks";
        String noun6 = "Mic";

        String name2 = "Mikal";

        int number = 5;
        String place1 = "downtown";

        //The template with variables added.
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}
