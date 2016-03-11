/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmonical_readingmethods;


//Name: Michael J Monical
//Class: 1400-003
//Program #: 3
//Due Date : February  3, 2016
//Colleagues: None






import java.util.Scanner;

public class mmonical_ReadingMethods {
    static Scanner get = new Scanner (System.in);
    public static void main ( String args [] ) {

        

        double a, b, c, d, gfa, gfb, gff, ffa, ffb, ffc, grade;
        
        
        
        a = getWords();
        b = getSentences();
        c = getBigWords();
                
        d = getSyllables();
        ffc = FleschREScore(a,b,d);
        gff = GunningFog(a,b,c); //gff stands for gunning fox final
        grade = FleschGL(a,b,d);
        

        //The Flesch Grade Level
        System.out.printf ( "\nThe Gunning Fog Index of this sample is: %.2f\n", gff);  
        System.out.printf ( "The Reading Ease Score is: %.2f\n", ffc);
        System.out.print( "The Flesch Grade Level is: ");
        

        if(grade > 100)
            System.out.println ( "Not defined\n" );
        else if ( grade >= 90)
            System.out.println ( "4th to 5th grade\n" );
        else if ( grade >= 80 )
            System.out.println ( "5th to 6th grade\n" );
        else if (grade >= 70 ) 
            System.out.println ( "7th grade\n" );
        else if (grade >= 60 )
            System.out.println ( "8th to 9th grade\n" );
        else if (grade >= 50 )
            System.out.println ( "High School\n" );
        else if (grade >= 30)
            System.out.println ( "College\n" );
        else if (grade >= 0)
            System.out.println ( "Post Graduate\n" );
        else
            System.out.println ( "Not defined\n");

//I did place an extra new line (\n) at the bottom for easier readability!!
    }
    public static double getWords(){
       double x;
        do{
        System.out.print( "Please enter the number of words in the sample: " );
        x = get.nextDouble();
        }while (1 < x );
        return x;
    }
    public static double getSentences(){
       System.out.print( "Please enter the number of sentences in the sample: " );
        return get.nextDouble();
    } 
    public static double getBigWords(){
       System.out.print( "Please enter the number of big words in the sample: " );
        return get.nextDouble( );
    }
    public static double getSyllables(){
     System.out.print( "Please enter the number of syllables in the sample: ");
        return get.nextDouble( );  
    } 
    public static double GunningFog(double a, double b, double c){
            double gfa, gfb;
        //The Gunning Fog Index
        gfa = a / b; //gfa stands for gunning fox a
        //System.out.printf ( "The average sentence length is %.2f\n", gfa);
        gfb = (c / a) * 100.0; // gfb stand for gunning fox b
        //System.out.printf ( "The percentage of \"big words\" is %.2f\n", gfb);
        return (gfa + gfb) * 0.40; //gff stands for gunning fox final 
    }
    public static double FleschREScore(double a,double b,double c){
             double ffa, ffb;
        ffa = (a / b) * 1.015; //Flesch Formula variable a step 3
        ffb = (c / a) * 84.6; //Flesch formula b step 4
        return 206.835 - (ffa + ffb);
    }
    public static double FleschGL(double a, double b, double d){
        double ffa, ffb;
        ffa = (a / b) * 1.015; //Flesch Formula variable a step 3
        ffb = (d / a) * 84.6; //Flesch formula b step 4
        return 206.835 - (ffa + ffb);
    }
    public static void displayResults(double gff, double ffc){
        double grade;
        System.out.printf ( "\nThe Gunning Fog Index of this sample is: %.2f\n", gff);  
        System.out.printf ( "The Reading Ease Score is: %.2f\n", ffc);
        System.out.print( "The Flesch Grade Level is: ");
        grade = ffc;

        if(grade > 100)
            System.out.println ( "Not defined\n" );
        else if ( grade >= 90)
            System.out.println ( "4th to 5th grade\n" );
        else if ( grade >= 80 )
            System.out.println ( "5th to 6th grade\n" );
        else if (grade >= 70 ) 
            System.out.println ( "7th grade\n" );
        else if (grade >= 60 )
            System.out.println ( "8th to 9th grade\n" );
        else if (grade >= 50 )
            System.out.println ( "High School\n" );
        else if (grade >= 30)
            System.out.println ( "College\n" );
        else if (grade >= 0)
            System.out.println ( "Post Graduate\n" );
        else
            System.out.println ( "Not defined\n");
    }


    
}
    

