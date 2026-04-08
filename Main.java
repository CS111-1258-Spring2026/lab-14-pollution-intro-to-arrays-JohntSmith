// YOUR NAME: Jonathan Smith
// COLLABORATORS:
// LAST MODIFIED DATE: 4/8/2026
/*
Yearly Global Atmospheric CO₂ Levels (parts per million)
(Data from: https://www.esrl.noaa.gov/gmd/webdata/ccgg/trends/co2/co2_annmean_mlo.txt)
*/

class Main 
{
	//CONSTANTS SECTION

  public static void main(String[] args) 
  {
		// DECLARATION SECTION
    int [] years;
    double [] co2Levels;

   
   // INITIALIZATION SECTION
    co2Levels = new double[] {371.32, 373.45, 375.98, 377.70, 379.98, 382.09, 384.03, 385.83, 387.64, 390.10, 391.85, 
    394.06, 396.74, 398.87, 401.01, 404.41, 406.76, 408.72, 411.66, 414.24};
     
     
    years = new int[20];
    int currentYear = 2001;
    years [0] = currentYear;
    for(int i = 0; i < years.length; i++){
      years[i] = currentYear;
      currentYear++;
    }

		// INPUT SECTION 



		// PROCESSING SECTION
    double growth = co2Levels[co2Levels.length - 1]-co2Levels[0];


		// OUTPUT SECTION
  


    //Explanation of oil drum units
    System.out.println("\nData displayed for each year begins at 360 ppm.\nEach additional oil drum (🛢 ) represents an additional 10 ppm.\n");



    //Column titles of graph
    //System.out.print("Year");
    //System.out.println("CO2 in Atmosphere (ppm)");
    //UtilityBelt.printCentered(50,"CO₂ in Atmosphere (ppm)");
    //System.out.println();
    System.out.println("Year                CO₂ in Atmosphere (ppm)                ");
    
    printGraph(co2Levels, years);

   
    System.out.println("From 2001 to 2020, the average atmospheric CO₂ levels across the globe has grown " + String.format("%.2f", growth) + " ppm.");
    

  }

  public static void printBar(double co2Value){
  int numDrums = (int) (co2Value - 360) ; 
  for (int i = 0; i < numDrums; i++){
    System.out.print ("🛢");
   }
   System.out.printf(" %.2f\n", co2Value);
  }


  public static void printGraph(double[] data, int[] years) {
    for (int i= 0; i < data.length; i++){
      System.out.print( years[i] + " ");
      printBar(data[i]);
    }
    
  }
}