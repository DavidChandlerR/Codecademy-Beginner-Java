/*
Write a DNA.java program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

    It begins with a “start codon”: ATG.
    It ends with a “stop codon”: TGA.
    In between, each additional codon is a sequence of three nucleotides.

So for example:

    ATGCGATACTGA is a protein because it has the start codon ATG, the stop codon TGA, and the length is divisible by 3.
    ATGCGATAGA is not a protein because the sequence length is not divisible by 3, so the third condition is not satisfied.

 */

public class DNA{

    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-


        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

//Condition 4 to 6
        String dna = dna1;
        System.out.println(dna.length());
        int lengthOfDna = dna.length();
        System.out.println(lengthOfDna);

//Conditions 7 to
//Checking if ATG starts, and if TGA ends for each dna strand.
        int dna1Start = dna1.indexOf("ATG");
        int dna1Stop = dna1.indexOf("TGA");
        System.out.println("Start: " + dna1.indexOf("ATG"));
        System.out.println("Stop: " + dna1.indexOf("TGA"));

        int dna2Start = dna2.indexOf("ATG");
        int dna2Stop = dna2.indexOf("TGA");
        System.out.println(dna2.indexOf("ATG"));
        System.out.println(dna2.indexOf("TGA"));

        int dna3Start = dna3.indexOf("ATG");
        int dna3Stop = dna3.indexOf("TGA");
        System.out.println(dna3.indexOf("ATG"));
        System.out.println(dna3.indexOf("TGA"));

//This if statement checks where the variable ATG and TGA are located.
//We can create the same condition check for each DNA chain.
        if (dna1Start == 0 && dna1Stop  != 0 && (dna1.length() % 3) == 0) {
            System.out.println("This is a protein.");
        } else {
            System.out.println("This is not a protein.");
        }

        if (dna2Start == 0 && dna2Stop == 12 && (dna2.length() % 3) == 0) {
            System.out.println("This is a protein.");
        } else {
            System.out.println("This is not a protein.");
        }

        if (dna3Start == 0 && dna3Stop == 12 && (dna3.length() % 3) == 0) {
            System.out.println("This is a protein.");
        } else {
            System.out.println("This is not a protein.");
        }
    }
}