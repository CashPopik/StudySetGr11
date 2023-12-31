import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class App {
    private static Scanner scan;
  private static int category;
  private static int[][] userDataSet = new int[12][2];
  private static int[][] prevUserDataSet = new int[12][2] ;
  static FileReader reader;
  static FileWriter writer;
  
  public static void main(String[] args) {
    File f = new File("UserData.txt");
    if(!(f.exists() && f.isFile()))
    {
      //sets the values for data to defaults
      for (int i = 0; i < prevUserDataSet.length; i++) {
            prevUserDataSet[i][0] = 1;
            prevUserDataSet[i][1] = 0;
        }
      for (int i = 0; i < userDataSet.length; i++) {
            for (int j = 0; j < userDataSet[i].length; j++) {
                userDataSet[i][j] = 0;
            }
        }
      //initializes user data
      try {
        if (f.createNewFile()) {
          System.out.println("File created: " + f.getName());
        } else {
          System.out.println("File already exists.");
        }
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
      //Writes the information to file
      try {
    
      String line1 = "";
      String line2 = "";
      for (int i = 0; i < prevUserDataSet.length; i ++)
      {
          line1 = line1 + (prevUserDataSet[i][0] + userDataSet[i][0]) + " "; 
      }
      for (int i = 0; i < prevUserDataSet.length; i ++)
      {
          line2 = line2 + (prevUserDataSet[i][1] + userDataSet[i][1]) + " ";
      }
      writer = new FileWriter("UserData.txt");
      writer.write(line1,0,(line1.length()));
      writer.write("\n",0,1);
      writer.write(line2,0,(line2.length()));
      writer.close();
    }catch( IOException ex2 ){
      System.out.println("file not loaded");
    }
    }
    scan = new Scanner(System.in);
    System.out.println("Boot complete");
    System.out.println("Version 1.1.1");
    //System.out.println(ElementData.lookupElement("130", "Atomic #").matterState.equals(ElementData.getRealName(matterState)));
    //System.out.println((ElementData.lookupElement("130", "Atomic #").state()).equals("Polyatomic"));
    //System.out.println(ElementData.lookupElement("120", "Atomic #").symbol);
    //System.out.println(ElementData.lookupElement("8", "Atomic #").atomicCharge);
    //System.out.println(randMetal());
    //System.out.println(randNonMetal());
    //String m = randMetal();
    //String nm = randNonMetal();
    //String m2 = randMetal();
    //String nm2 = randNonMetal();
    //System.out.println(m);
    //System.out.println(nm);
    //System.out.println(ionicCompound("11", "142") + solublePrint(m, nm));
    //System.out.println(ionicCompound("20", "17") + solublePrint(m, nm));
   // System.out.println(ionicCompoundCount(m, nm, 0));
    //System.out.println(ionicCompoundCount(m, nm, 1));
    //System.out.println(calculateLCM(2,3));
    //System.out.println(ionicCompound("11","142"));
    //String[] balance = balancing(m, nm, m2, nm2);
    //System.out.println(balance[0]);
    //System.out.println(ionicCompoundMass(m,nm));
    //System.out.println(soluble("120","142"));
    //String[] balance = balancing("21", "133", false);
    //System.out.println(balance[0]);
    //balance = balancing("1", "17", "12");
    //System.out.println(balance[0]);
    //balance = balancing("11", "17", "16");
    //System.out.println(balance[0]);
    
    boot();
  }

  private static void boot()
  {
    System.out.println("");
    System.out.println("   -------------");
    System.out.println("Please select course:" );
    System.out.println("   -------------");
    System.out.println("1. Physics");
    System.out.println("2. Chemistry");
    System.out.println("3. Weakpoints in Physics");
    System.out.println("4. Weakpoints in Chemistry");
    System.out.println("5. Stats");
    System.out.println("7. Exit Program");
    System.out.println("0. Reset Stats");
    String command = getCommand();
    if (command.equals("1"))
    {
      physics();
    }
    else if (command.equals("2"))
    {
      chemistry();
    }
    else if (command.equals("3"))
    {
      save();
      weakPointsP();
    }
    else if (command.equals("4"))
    {
      save();
      weakPointsC();
    }
    else if (command.equals("5"))
    {
      save();
      stats();
    }
    else if (command.equals("7"))
    {
      save();
      System.exit(0);
    }
    else if (command.equals("0"))
    {
      resetStats();
    }
    boot();
    
  }

  //SUBJECTS
  private static void physics()
  {
    System.out.println("...");
    System.out.println("You selected physics");
    System.out.println("   -------------");
    System.out.println("Please select subject:");
    System.out.println("   -------------");
    System.out.println("1. Kinematics");
    System.out.println("2. Forces");
    System.out.println("3. Forces: Gravitational Field Theory");
    System.out.println("4. Circular Motion");
    System.out.println("5. Circular Motion: Satellite Motion");
    System.out.println("6. Work and Energy");
    System.out.println("7. Simple Harmonic Motion");
    System.out.println("8. Mechanical Waves");
    String command = getCommand();
    if (command.equals("1"))
    {
      category = 0;
      kinematics();
    }
    else if (command.equals("2"))
    {
      category = 1;
      forces();
    }
    else if (command.equals("3"))
    {
      category = 2;
      gravitation();
    }
    else if (command.equals("4"))
    {
      category = 3;
      circularMotion();
    }
    else if (command.equals("5"))
    {
      category = 4;
      satelliteMotion();
    }
    else if (command.equals("6"))
    {
      category = 5;
      energy();
    }
    else if (command.equals("7"))
    {
      category = 6;
      harmonicMotion();
    }
    else if (command.equals("8"))
    {
      category = 7;
      mechanicalWaves();
    }
    else{
      boot();
    }
    
  }

  private static void chemistry()
  {
    System.out.println("...");
    System.out.println("You selected chemistry");
    System.out.println("   -------------");
    System.out.println("Please select subject:");
    System.out.println("   -------------");
    System.out.println("1. Bonding");
    System.out.println("2. Gasses");
    System.out.println("3. Solutions");
    System.out.println("4. Stoichiometry");
    String command = getCommand();
    if (command.equals("1"))
    {
      category = 8;
      bonding();
    }
    else if (command.equals("2"))
    {
      category = 9;
      gasses();
    }
    else if (command.equals("3"))
    {
      category = 10;
      solutions();
    }
    else if (command.equals("4"))
    {
      category = 11;
      stoich();
    }else{
      boot();
    }
  }
  private static void weakPointsP()
  {
    System.out.println("You chose to improve on your physics weakpoints, questions will be from categories you struggle at, remember sig digs are not accounted for");
    int min = findMin(buildArray(
      ((Double.valueOf(prevUserDataSet[0][0])) / (Double.valueOf(prevUserDataSet[0][1] + prevUserDataSet[0][0])) * 100),   
      ((Double.valueOf(prevUserDataSet[1][0])) / (Double.valueOf(prevUserDataSet[1][1] + prevUserDataSet[1][0])) * 100),  
      ((Double.valueOf(prevUserDataSet[2][0])) / (Double.valueOf(prevUserDataSet[2][1] + prevUserDataSet[2][0])) * 100),   
      ((Double.valueOf(prevUserDataSet[3][0])) / (Double.valueOf(prevUserDataSet[3][1] + prevUserDataSet[3][0])) * 100) ,   
      ((Double.valueOf(prevUserDataSet[4][0])) / (Double.valueOf(prevUserDataSet[4][1] + prevUserDataSet[4][0])) * 100), 
      ((Double.valueOf(prevUserDataSet[5][0])) / (Double.valueOf(prevUserDataSet[5][1] + prevUserDataSet[5][0])) * 100), 
      ((Double.valueOf(prevUserDataSet[6][0])) / (Double.valueOf(prevUserDataSet[6][1] + prevUserDataSet[6][0])) * 100), 
      ((Double.valueOf(prevUserDataSet[7][0])) / (Double.valueOf(prevUserDataSet[7][1] + prevUserDataSet[7][0])) * 100)));

    switch(min)
      {
        case 0:
          category = 0;
          kp();
          break;
        case 1:
          category = 1;
          fp();
          break;
        case 2:
          category = 2;
          gp();
          break;
        case 3:
          category = 3;
          ucmp();
          break;
        case 4:
          category = 4;
          smp();
          break;
        case 5:
          category = 5;
          ep();
          break;
        case 6:
          category = 6;
          SHMp();
          break;
        case 7:
          category = 7;
          mwp();
          break;
      }
  }
  private static void weakPointsC()
  {
    System.out.println("You chose to improve on your chemistry weakpoints, questions will be from categories you struggle at, remember sig digs are not accounted for");
    int min = findMin(buildArray(
      ((Double.valueOf(prevUserDataSet[8][0])) / (Double.valueOf(prevUserDataSet[8][1] + prevUserDataSet[8][0])) * 100),   
      ((Double.valueOf(prevUserDataSet[9][0])) / (Double.valueOf(prevUserDataSet[9][1] + prevUserDataSet[9][0])) * 100),  
      ((Double.valueOf(prevUserDataSet[10][0])) / (Double.valueOf(prevUserDataSet[10][1] + prevUserDataSet[10][0])) * 100),   
      ((Double.valueOf(prevUserDataSet[11][0])) / (Double.valueOf(prevUserDataSet[11][1] + prevUserDataSet[11][0])) * 100) ))  ;
    switch(min)
      {
        case 0:
          category = 8;
          bc();
          break;
        case 1:
          category = 9;
          gc();
          break;
        case 2:
          category = 10;
          sc();
          break;
        case 3:
          category = 11;
          stc();
          break;
      }
  }
  private static void stats()
  {
    try
    {
      reader = new FileReader("UserData.txt");
      Scanner sc = new Scanner(reader);
      for (int i = 0; i < prevUserDataSet.length; i++)
       {
          prevUserDataSet[i][0] = sc.nextInt();
       }
      
      for (int i = 0; i < prevUserDataSet.length; i++)
       {
          prevUserDataSet[i][1] = sc.nextInt();
       }
      sc.close();
      reader.close();
    }catch(FileNotFoundException ex){
      System.out.println("file not found");
    }catch( IOException ex2 ){
      System.out.println("file not loaded");
    }
    System.out.println("Here are your current stats: ");
    System.out.println("");
    System.out.println("Chemistry Correct: " + (prevUserDataSet[8][0] + prevUserDataSet[9][0] + prevUserDataSet[10][0] + prevUserDataSet[11][0] - 4));
    System.out.println("Chemistry Incorrect: " + (prevUserDataSet[8][1] + prevUserDataSet[9][1] + prevUserDataSet[10][1] + prevUserDataSet[11][1]));
    System.out.println("Chemistry Percent: " + truncate((Double.valueOf(prevUserDataSet[8][0]) + prevUserDataSet[9][0] + prevUserDataSet[10][0] + prevUserDataSet[11][0]) / (Double.valueOf(prevUserDataSet[8][1] + prevUserDataSet[9][1] + prevUserDataSet[10][1] + prevUserDataSet[11][1] + prevUserDataSet[8][0] + prevUserDataSet[9][0] + prevUserDataSet[10][0] + prevUserDataSet[11][0])) * 100) + "%");
    System.out.println("Chemistry Bonding Correct: " + (prevUserDataSet[8][0] - 1));
    System.out.println("Chemistry Bonding Incorrect: " + (prevUserDataSet[8][1] ));
    System.out.println("Chemistry Bonding Percent: " + truncate((Double.valueOf(prevUserDataSet[8][0])) / (Double.valueOf(prevUserDataSet[8][1] + prevUserDataSet[8][0])) * 100) + "%");
    System.out.println("Chemistry Gasses Correct: " + (prevUserDataSet[9][0] - 1));
    System.out.println("Chemistry Gasses Incorrect: " + (prevUserDataSet[9][1] ));
    System.out.println("Chemistry Gasses Percent: " + truncate((Double.valueOf(prevUserDataSet[9][0])) / (Double.valueOf(prevUserDataSet[9][1] + prevUserDataSet[9][0])) * 100) + "%");
    System.out.println("Chemistry Solutions Correct: " + (prevUserDataSet[10][0] - 1));
    System.out.println("Chemistry Solutions Incorrect: " + (prevUserDataSet[10][1] ));
    System.out.println("Chemistry Solutions Percent: " + truncate((Double.valueOf(prevUserDataSet[10][0])) / (Double.valueOf(prevUserDataSet[10][1] + prevUserDataSet[10][0])) * 100) + "%");
    System.out.println("Chemistry Stoichiometry Correct: " + (prevUserDataSet[11][0] - 1));
    System.out.println("Chemistry Stoichiometry Incorrect: " + (prevUserDataSet[11][1] ));
    System.out.println("Chemistry Stoichiometry Percent: " + truncate((Double.valueOf(prevUserDataSet[11][0])) / (Double.valueOf(prevUserDataSet[11][1] + prevUserDataSet[11][0])) * 100) + "%");
    System.out.println("");
    System.out.println("Physics Correct: " + (prevUserDataSet[0][0] + prevUserDataSet[1][0] + prevUserDataSet[2][0] + prevUserDataSet[3][0] + prevUserDataSet[4][0] + prevUserDataSet[5][0] + prevUserDataSet[6][0] + prevUserDataSet[7][0] - 8));
    System.out.println("Physics Incorrect: " + (prevUserDataSet[0][1] + prevUserDataSet[1][1] + prevUserDataSet[2][1] + prevUserDataSet[3][1] + prevUserDataSet[4][1] + prevUserDataSet[5][1] + prevUserDataSet[6][1] + prevUserDataSet[7][1]));
    System.out.println("Physics Percent: " + truncate((Double.valueOf(prevUserDataSet[0][0]) + prevUserDataSet[1][0] + prevUserDataSet[2][0] + prevUserDataSet[3][0] + prevUserDataSet[4][0] + prevUserDataSet[5][0] + prevUserDataSet[6][0] + prevUserDataSet[7][0]) / (Double.valueOf(prevUserDataSet[0][1] + prevUserDataSet[1][1] + prevUserDataSet[2][1] + prevUserDataSet[3][1] + prevUserDataSet[4][1] + prevUserDataSet[5][1] + prevUserDataSet[6][1] + prevUserDataSet[7][1] + prevUserDataSet[0][0] + prevUserDataSet[1][0] + prevUserDataSet[2][0] + prevUserDataSet[3][0] + prevUserDataSet[4][0] + prevUserDataSet[5][0] + prevUserDataSet[6][0] + prevUserDataSet[7][0])) * 100) + "%");
    System.out.println("Physics Kinematics Correct: " + (prevUserDataSet[0][0] - 1));
    System.out.println("Physics Kinematics Incorrect: " + (prevUserDataSet[0][1] ));
    System.out.println("Physics Kinematics Percent: " + truncate((Double.valueOf(prevUserDataSet[0][0])) / (Double.valueOf(prevUserDataSet[0][1] + prevUserDataSet[0][0])) * 100) + "%");
    System.out.println("Physics Forces Correct: " + (prevUserDataSet[1][0] - 1));
    System.out.println("Physics Forces Incorrect: " + (prevUserDataSet[1][1] ));
    System.out.println("Physics Forces Percent: " + truncate((Double.valueOf(prevUserDataSet[1][0])) / (Double.valueOf(prevUserDataSet[1][1] + prevUserDataSet[1][0])) * 100) + "%");
    System.out.println("Physics Gravitation Correct: " + (prevUserDataSet[2][0] - 1));
    System.out.println("Physics Gravitation Incorrect: " + (prevUserDataSet[2][1]));
    System.out.println("Physics Gravitation Percent: " + truncate((Double.valueOf(prevUserDataSet[2][0])) / (Double.valueOf(prevUserDataSet[2][1] + prevUserDataSet[2][0])) * 100) + "%");
    System.out.println("Physics Uniform Circular Motion Correct: " + (prevUserDataSet[3][0] - 1));
    System.out.println("Physics Uniform Circular Motion Incorrect: " + (prevUserDataSet[3][1]));
    System.out.println("Physics Uniform Circular Motion Percent: " + truncate((Double.valueOf(prevUserDataSet[3][0])) / (Double.valueOf(prevUserDataSet[3][1] + prevUserDataSet[3][0])) * 100) + "%");
    System.out.println("Physics Satellite Motion Correct: " + (prevUserDataSet[4][0] - 1));
    System.out.println("Physics Satellite Motion Incorrect: " + (prevUserDataSet[4][1] ));
    System.out.println("Physics Satellite Motion Percent: " + truncate((Double.valueOf(prevUserDataSet[4][0])) / (Double.valueOf(prevUserDataSet[4][1] + prevUserDataSet[4][0])) * 100) + "%");
    System.out.println("Physics Energy Correct: " + (prevUserDataSet[5][0] - 1));
    System.out.println("Physics Energy Incorrect: " + (prevUserDataSet[5][1] ));
    System.out.println("Physics Energy Percent: " + truncate((Double.valueOf(prevUserDataSet[5][0])) / (Double.valueOf(prevUserDataSet[5][1] + prevUserDataSet[5][0])) * 100) + "%");
    System.out.println("Physics Simple Harmonic Motion Correct: " + (prevUserDataSet[6][0] - 1));
    System.out.println("Physics Simple Harmonic Motion Incorrect: " + (prevUserDataSet[6][1] ));
    System.out.println("Physics Simple Harmonic Motion Percent: " + truncate((Double.valueOf(prevUserDataSet[6][0])) / (Double.valueOf(prevUserDataSet[6][1] + prevUserDataSet[6][0])) * 100) + "%");
    System.out.println("Physics Mechanical Waves Correct: " + (prevUserDataSet[7][0] - 1));
    System.out.println("Physics Mechanical Waves Incorrect: " + (prevUserDataSet[7][1] ));
    System.out.println("Physics Mechanical Waves Percent: " + truncate((Double.valueOf(prevUserDataSet[7][0])) / (Double.valueOf(prevUserDataSet[7][1] + prevUserDataSet[7][0])) * 100) + "%");
    boot();
  }
  // resets all stats back to one
  private static void resetStats()
  {
    for (int i = 0; i < prevUserDataSet.length; i++) {
          prevUserDataSet[i][0] = 1;
          prevUserDataSet[i][1] = 0;
      }
    for (int i = 0; i < userDataSet.length; i++) {
          for (int j = 0; j < userDataSet[i].length; j++) {
              userDataSet[i][j] = 0;
          }
      }
    //writes the default totals to normal
    try
    {
      String line1 = "";
      String line2 = "";
      for (int i = 0; i < prevUserDataSet.length; i ++)
      {
          line1 = line1 + (prevUserDataSet[i][0] + userDataSet[i][0]) + " "; 
        
      }
      for (int i = 0; i < prevUserDataSet.length; i ++)
      {
          line2 = line2 + (prevUserDataSet[i][1] + userDataSet[i][1]) + " ";
      }
      writer = new FileWriter("UserData.txt");
      writer.write(line1,0,(line1.length()));
      writer.write("\n",0,1);
      writer.write(line2,0,(line2.length()));
      writer.close();
    }catch( IOException ex2 ){
      System.out.println("file not loaded");
    }
    System.out.println("Stats reset.");
    
    boot();
  }
  //PHYSICS CATEGORIES
  private static void kinematics()
  {
    System.out.println("...");
    System.out.println("You selected kinematics");
    System.out.println("note that questions will have absurdly innacurate proportions to reality. Sig digs not accounted for. Vector addition is not present");
    System.out.println("Here is your provided problem:");
    kp();
  }
  private static void forces()
  {
    System.out.println("...");
    System.out.println("You selected forces");
    System.out.println("Sig digs not accounted for");
    System.out.println("kinematics problems merged with forces problems will be absent");
    System.out.println("Here is your provided problem:");
    fp();
  
  }
  private static void gravitation()
  {
    System.out.println("...");
    System.out.println("You selected Forces: Gravitational Field Theory");
    System.out.println("Sig digs not accounted for");
    System.out.println("kinematics problems merged with forces problems will be absent");
    System.out.println("Here is your provided problem:");
    gp();
  
  }
  private static void circularMotion()
  {
    System.out.println("...");
    System.out.println("You selected circular motion");
    System.out.println("Sig digs not accounted for");
    System.out.println("Here is your provided problem:");
    ucmp();
  
  }
  private static void satelliteMotion()
  {
    System.out.println("...");
    System.out.println("You selected satellite motion");
    System.out.println("Sig digs not accounted for");
    System.out.println("Here is your provided problem:");
    smp();
  
  }
  private static void energy()
  {
    System.out.println("...");
    System.out.println("You selected Work and Kinds of Energy");
    System.out.println("Sig digs not accounted for");
    System.out.println("Here is your provided problem:");
    ep();
  
  }
  private static void harmonicMotion()
  {
    System.out.println("...");
    System.out.println("You selected Simple Harmonic Motion");
    System.out.println("Sig digs not accounted for. Questions will not include repeat formulas from previous topics");
    System.out.println("Here is your provided problem:");
    SHMp();
  
  }
  private static void mechanicalWaves()
  {
    System.out.println("...");
    System.out.println("You selected Mechanical Waves");
    System.out.println("Sig digs not accounted for. Questions will not include repeat formulas from previous topics");
    System.out.println("Here is your provided problem:");
    mwp();
  
  }
  //CHEM CATEGORIES
  private static void bonding()
  {
    System.out.println("...");
    System.out.println("You selected bonding. It is reccommended to use external resources for this category as it is missing in most sections");
    System.out.println("sig digs not accounted for");
    System.out.println("Here is your provided problem:");
    bc();
  }
  private static void gasses()
  {
    System.out.println("...");
    System.out.println("You selected gasses");
    System.out.println("sig digs not accounted for");
    System.out.println("Here is your provided problem:");
    gc();
  }
  private static void solutions()
  {
    System.out.println("...");
    System.out.println("You selected solutions");
    System.out.println("sig digs not accounted for");
    System.out.println("Here is your provided problem:");
    sc();
  }
  private static void stoich()
  {
    System.out.println("...");
    System.out.println("You selected stoichiometry");
    System.out.println("sig digs not accounted for, for gas stoich assume all elements are gasses, for solution stoich assume all elements are soluable.");
    System.out.println("Here is your provided problem:");
    stc();
  }




//physics paths
private static void kp()
  {
    //kinematics path
    System.out.println("");
    int problem = random(1, 17);
    double solution = 0;
    String command = "";
    //define acceleration
    double a = 0.0;
    a = randomD (0, 10);
    a = truncate(a);
    
    //define initial velocity
    double vi = 0;
    vi = randomD (0, 10);
    vi = truncate(vi);
    double viy = 0;
    double vix = 0;
    //define distance
    double d = 0;
    d = randomD (0, 1000);
    d = truncate(d);
    
    //define final velocity
    double vf = 0;
    vf = randomD (0, 100);
    vf = truncate(vf);

    //define time
    double t = 0;
    t = randomD (0, 100);
    t= truncate(t);

    //define angles
    double theta = 0.0;
    theta = random(10, 80);
    
    //define context
    // accelerated motion problems:
    //NO t FIND a
    switch(problem){
      case 1:
      
        System.out.println("an object is fired from a rifle leaving the barrel at " + vi + "m/s. It travels " + d + "m. and ends at a speed of " + vf + "m/s. Find the accelleration of the object.");
        solution =  ((Math.pow(vf, 2) - Math.pow(vi, 2)) / (2*(d)));
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " m/s^2");
        break;
      
      // NO d FIND a
      case 2:
      
        System.out.println("an object is fired from a rifle leaving the barrel at " + vi + "m/s. It travels for " + t + "s. and ends at a speed of " + vf + "m/s. Find the average accelleration of the object.");
        solution =  ((vf - vi) / (t));
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " m/s^2");
        break;
      
      // NO a FIND t
      case 3:
      
        System.out.println("an object is fired from a rifle leaving the barrel at " + vi + "m/s. and goes " + d + "m.  the final velocity is " + vf + "m/s. How long did the object take to reach this speed?");
        solution =  (d / ((vf + vi) / 2));
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " s");
        break;
      
      //NO vi FIND vf
      case 4:
      
        System.out.println("an object is fired from a rifle leaving the barrel at " + "an unknown speed. and goes " + d + "m. It took the object " + t + "s. It accellerated at " + a + "m/s^2. How fast was the object going at the end of that time");
        solution =  ((d + 0.5*a*(Math.pow(t,2))) / t);
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " m/s");
        break;
      
      //NO vf FIND d
      case 5:
      
        System.out.println("an object is fired from a rifle leaving the barrel at " + vi + "m/s. it ends at an unknown speed. It accellerated at " + a + "m/s^2. How far did the object go after " + t + "s? ");
        solution =  ((vi*t) + (0.5*a*(Math.pow(t, 2))));
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " m");
        break;
      
      //Starting from rest, find a
        case 6:
      
        System.out.println("an object is shot from rest, it travels " + d + "m. It took " + t + "s to cover this distance. What was it's accelleration? ");
        solution =  (d/ (0.5*(Math.pow(t,2))));
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " m/s^2");
        break;

        case 7:
        // stopping
        System.out.println("a car is going " + vi + " m/s. How far must the car go in order to stop when the decelleration rate is " + (a*-1) + "m/s^2?");
        solution =  ((-1*(Math.pow(vi, 2))) / (-2*a));
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " m");
        break;
        
        case 8:
        // Gravity and rest and time 
        System.out.println("a ball falls " + d + "m toward the earth. How long does it take to land?");
        solution =  (Math.pow(((d*-1)/(0.5*-9.81)), 0.5));
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " s");
        break;

        case 9:
        // Gravity and rest and distance
        System.out.println("a ball falls " + t + "s toward the earth. from how high did it fall?");
        solution =  (-1*0.5*-9.81*(Math.pow(t, 2)));
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " m");
        break;

        case 10:
        // height thrown up
        System.out.println("a ball is thrown in the air at " + vi + "m/s. How high does it go?");
        solution =  ((-1*Math.pow(vi,2)) / (2*-9.81));
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " m");
        break;

        case 11:
        // full time trickery case
        System.out.println("a ball is thrown in the air at " + vi + "m/s. How long is it in the air?");
        solution =  (2*((-vi)/-9.81));
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " s");
        break;

        case 12:
        // half time trickery case
        System.out.println("a ball is thrown in the air at " + vi + "m/s. How long was it in the air at its peak?");
        solution =  ((-vi)/-9.81);
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " s");
        break;

        //PROJECTILE MOTION
        case 13:
        // basic projectile motion
        System.out.println("a projectile is shot off of a " + d + "m tall cliff. It goes " + vi + "m/s to the horizontal. How far does it go?");
        t = (Math.pow(((-d)/(0.5*-9.81)),0.5));
        solution =  (vi*t);
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " m");
        break;

        case 14:
        // reverse projectile motion
        System.out.println("a projectile is travels " + d + "m horizontal when shot of a cliff. It was fired at " + vi + "m/s. How high is the cliff?");
        t = (d / vi);
        solution =  (-1)*(0.5*-9.81*(Math.pow(t, 2)));
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " m");
        break;

        case 15:
        // uniform motion
        System.out.println("a box slides across a room at a uniform velocity of " + vi + " how long does it take to reach a distance of " + d + "m? ");
        solution =  (d / vi);
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " s");
        break;

        case 16:
        // uniform motion
        System.out.println("a box slides across a room at a uniform velocity of " + vi + " m/s, what distance does it reach in " + t + "s? ");
        solution =  (t * vi);
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " m");
        break;

        case 17:
        // projectile motion II
        System.out.println("a basketball is passed at a speed of " + vi + "m/s at an angle of " + theta + " degrees. How far horizontally does the ball travel before hitting the ground?");
        theta = Math.toRadians(theta);
        viy = vi*Math.sin(theta);
        t = -2*viy/-9.81;
        vix = vi*Math.cos(theta);
        solution =  (vix*t);
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " m");
        break;

        case 18:
        // projectile motion II (reversed) THIS ONE IS INACTIVE DUE TO RANDOMIZED NUMBERS BEING BAD it can be reactivated with a precalculated solution
        System.out.println("a basketball is passed at an angle of " + theta + " degrees. It goes " + d + "m. Taking " + t + "s. what is the peak height the ball reached");
        theta = Math.toRadians(theta);
        vix = d/t;
        viy = vix*Math.tan(theta);
        solution =  (viy*(t/2) + 0.5*-9.81*(Math.pow((t/2), 2)));
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(solution)  + " m");
        break;

        
        
      default:
        break;
    }
    System.out.println("");
    checkCorrect();
    System.out.println("press 1 for another kinematics problem.");
    command = getCommand();
    if (command.equals("1"))
    {
      kp();
    }else{
     
    }
    
  }
  private static void fp()
  {
      //forces
      System.out.println("");
      int problem = random(1, 8);
      double solution = 0;
      String command = "";
      //define acceleration
      double a = 0.0;
      a = randomD (0, 9);
      a = truncate(a);
      
      //define initial velocity
      double vi = 0;
      vi = randomD (0, 10);
      vi = truncate(vi);
      //define distance
      double d = 0;
      d = randomD (0, 1000);
      d = truncate(d);
      
      //define final velocity
      double vf = 0;
      vf = randomD (0, 100);
      vf = truncate(vf);

      //define force
      double f = 0;
      f = randomD (0, 100);
      f = truncate(f);

      //define mass
      double m = 0;
      m = randomD (0, 100);
      m = truncate(m);

      //define mass2
      double m2 = 0;
      m2 = randomD (0, 100);
      m2 = truncate(m2);
  
      //define time
      double t = 0;
      t = randomD (0, 100);
      t= truncate(t);
  
      //define angles
      double theta = 0.0;
      theta = random(20, 60);


      //define mew
      double mew = 0.0;
      mew = randomD(0, 0);
      mew = truncate(mew);
    
      switch(problem){
        case 1:
          //f = ma base
          System.out.println("a " + m + " kg object is accelerated at " + a + "m/s^2. What is the magnitude of the net force acting on the object.");
          solution =  (a*m);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " N");
          break;
        case 2:
          //f = ma for a 
          System.out.println(f + "N of force is applied to a " + m + "kg object. what is it's acceleration. ");
          solution =  (f/m);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " m/s^2");
          break;
        case 3:
          //f = ma for m
          System.out.println(f + "N of force is applied to an object. It's acceleration is " + a + " m/s^2. What is the object's mass. ");
          solution =  (f/a);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " kg");
          break;
          
        case 4:
          //pulley problem for tension
          System.out.println("A frictionless pulley has a mass of " + m + " kg on one side and a mass of " + m2 + " kg on the other. What is the tension on the rope.");
          a = ( (Math.abs((m*9.81)-(m2*9.81))) / (m + m2));
          if (m > m2)
          {
            solution =  ((m2*9.81)+(m2*a));
          }
          else if (m < m2)
          {
            solution =  ((m*9.81)+(m*a));
          }
          else
          {
            solution = 0;
          }
          
          System.out.println("Press enter to see solution");
          command = getCommand();
        System.out.println(round(solution)  + " N");
          break;
        case 5:
          //fletcher trolley problem for tension (for forces problems tension involves a knowledge in all aspects of the problem so tension is the only problem required)
          System.out.println("A " + m + " kg object rests on a surface with a mew value of " + mew + ". It is attatched to a frictionless pulley with an object having a mass of " + m2 + " kg. What is the tension of the system?");
          f = m*9.81;
          vi = mew*f;
          a = ((m2*9.81) - vi);
          if (a < 0)
          {
            a =  0;
            f = (m2*9.81);
          }
          else
          {
            a = a/(m + m2);
            f = (m*a) + vi;
          }
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(f)  + " N");
          break;
        case 6:
          //inclined plane slide (i did not change variable names so it is unreadable but it works)
          System.out.println("A " + m + " kg object rests on an inclined plane at a  " + theta + " degree angle. The coefficient of friction is " + mew + ". What is the accelleration of the object down the slope?");
          t = (m*9.81);
          theta = Math.toRadians(theta);
          vi = t*(Math.sin(theta));
          vf = t*(Math.cos(theta));
          vf = vf*mew;
          vi = vi - vf;
          a = (vi/m);
          if (a < 0)
          {
            a =  0;
          }
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(a)  + " m/s^2");
          break;
        //missing friciton formulae
          
        case 7:
          //The elevator problem
          System.out.println("a man on an elevator weighing " + m + "kg accellerates at " + a + "m/s^2 [up], what is his apparent weight?");
          solution =  (m*9.81) + (m*a);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(-1*solution)  + " N");
          break;

        case 8:
          //The elevator problem (down)
          System.out.println("a man on an elevator weighing " + m + "kg accellerates at " + a + "m/s^2 [down], what is his apparent weight?");
          solution =  (m*9.81) + (m*-a);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(-1*solution)  + " N");
          break;

      }
      System.out.println("");
      checkCorrect();
      System.out.println("press 1 for another forces problem.");
      command = getCommand();
      if (command.equals("1"))
      {
        fp();
      }else{
       
      }
  }



   private static void gp()
  {
      //forces
      System.out.println("");
      int problem = random(1, 9);
      double solution = 0;
      String command = "";
    
      //define acceleration
      double a = 0.0;
      a = randomD (1, 10);
      a = truncate(a);

      //define distance
      double d = 0;
      d = randomD (1, 10);
      d = truncate(d);
      
      //define force
      double f = 0;
      f = randomD (0, 100);
      f = truncate(f);

      //define mass
      double m = 0;
      m = randomD (1, 10);
      m = truncate(m);

      //define mass2
      double m2 = 0;
      m2 = randomD (1, 10);
      m2 = truncate(m2);
  
      //define exponent
      int e = 0;
      e = random (10, 30);

      //define exponent2
      int e2 = 0;
      e2 = random (0, 5);

      //define exponent3
      int e3 = 0;
      e3 = random (0, 2);

      //define mew
      double mew = 0.0;
      mew = randomD(0, 0);
      mew = truncate(mew);
    
      switch(problem){
          
        case 1:
          //gravitational field of a single object
          System.out.println("what is the gravitational field strength of a hypothetical planet the mass of " + m + "E" + e + "kg, and a radius of " + d + "E" + e2 + "m?");
          solution =  ((6.67*(Math.pow(10,-11))) * (m*(Math.pow(10,e))))/(Math.pow((d*(Math.pow(10,e2))), 2));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((solution)  + " N/kg");
          break;
          
        case 2:
          //gravitational field of a single object for radius
          solution =  ((6.67*(Math.pow(10,-11))) * (m*(Math.pow(10,e))))/(Math.pow((d*(Math.pow(10,e2))), 2));
          System.out.println("what is the radius of a hypothetical planet the mass of " + m + "E" + e + "kg, and a gravitational field strength of " + solution + " N/Kg?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((d)  + "E" + e2 + "m");
          break;
          
        case 3:
          //gravitational field of a single object for mass
          solution =  ((6.67*(Math.pow(10,-11))) * (m*(Math.pow(10,e))))/(Math.pow((d*(Math.pow(10,e2))), 2));
          System.out.println("what is the mass of a hypothetical planet the radius of " + d + "E" + e2 + "m, and a gravitational field strength of " + solution + " N/Kg?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((m)  + "E" + e + "kg");
          break;
          
        case 4:
          //gravitational force of attraction between two objects
          System.out.println("what is the gravitational force of attraction between a hypothetical planet the mass of " + m + "E" + e + "kg, an object of " + m2 + "E" + e3 + "kg and a distance of " + d + "E" + e2 + "m?");
          solution =  ((6.67*(Math.pow(10,-11))) * (m*(Math.pow(10,e))) * (m2*(Math.pow(10,e3))))/(Math.pow((d*(Math.pow(10,e2))), 2));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((solution)  + " N");
          break;

        case 5:
          //gravitational force of attraction between two objects for distance
          solution =  ((6.67*(Math.pow(10,-11))) * (m*(Math.pow(10,e))) * (m2*(Math.pow(10,e3))))/(Math.pow((d*(Math.pow(10,e2))), 2));
          System.out.println("what is the distance between a hypothetical planet the mass of " + m + "E" + e + "kg, an object of " + m2 + "E" + e3 + "kg and a gravitational attraction of " + solution + " N?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((d)  + "E" + e2 + "m");
          break;

        case 6:
          //gravitational force of attraction between two objects for a mass
          solution =  ((6.67*(Math.pow(10,-11))) * (m*(Math.pow(10,e))) * (m2*(Math.pow(10,e3))))/(Math.pow((d*(Math.pow(10,e2))), 2));
          System.out.println("what is the other mass between a hypothetical planet the mass of " + m + "E" + e + "kg, an a distance of " + d + "E" + e2 + "m and a gravitational attraction of " + solution + " N?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((m2)  + "E" + e3 + "kg");
          break;
          
          //proportionality
          
        case 7:
          //proportionality basic
          e2 = e2 + 1;
          e3 = e3 + 1;
          solution =  ((6.67*(Math.pow(10,-11))) * (m*(Math.pow(10,e))) * (m2*(Math.pow(10,e3))))/(Math.pow((d*(Math.pow(10,e2))), 2));
          solution = solution / e;
          System.out.println("Two objects have a force of attraction of " + solution + " N. If the distance between the objects was " + e2 + " times as far and the mass of the first object is " + e + " times as big and the mass of the second object is " + e3 + " times as massive. What is the new force of attraction");
          solution = solution*((e*e3) / (Math.pow(e2,2)));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((solution)  + " N");
          break;

        case 8:
          //proportionality  fractional
          e2 = e2 + 1;
          e3 = e3 + 1;
          solution =  ((6.67*(Math.pow(10,-11))) * (m*(Math.pow(10,e))) * (m2*(Math.pow(10,e3))))/(Math.pow((d*(Math.pow(10,e2))), 2));
          solution = solution / e;
          System.out.println("Two objects have a force of attraction of " + solution + " N. If the distance between the objects was " + e2 + " times smaller and the mass of the first object is " + e + " times as big and the mass of the second object is " + e3 + " times as massive. What is the new force of attraction");
          solution = solution*((e*e3) * (Math.pow(e2,2)));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((solution)  + " N");
          break;
        
        case 9:
          //proportionality  distance and gravitation
          e2 = e2 + 1;
          e3 = e3 + 1;
          solution =  ((6.67*(Math.pow(10,-11))) * (m*(Math.pow(10,e))) * (m2*(Math.pow(10,e3))))/(Math.pow((d*(Math.pow(10,e2))), 2));
          solution = solution / e;
          System.out.println("Two objects have a distance of " + d + "E" + e2 + " m. If the force of attraction between the objects was " + e + " times stronger what would the new distance between the objects be ");
          f = (double)(1.0/e);
          solution = ((d*(Math.pow(10,e2)))*(Math.sqrt(f)) );
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((solution)  + " m");
          break;
        
      }
    
      System.out.println("");
      checkCorrect();
      System.out.println("press 1 for another gravitation problem.");
      command = getCommand();
      if (command.equals("1"))
      {
        gp();
      }else{
       
      }
  }
  private static void ucmp()
  {
      // circular motion
      System.out.println("");
      int problem = random(1,6);
      double solution = 0;
      String command = "";
      //define acceleration
      double a = 0.0;
      a = randomD (0, 9);
      a = truncate(a);
      
      //define  velocity
      double v = 0;
      v = randomD (5, 100);
      v = truncate(v);
    
      //define radius
      double r = 0;
      r = randomD (0, 1000);
      r = truncate(r);
      
      //define final velocity
      double vf = 0;
      vf = randomD (0, 100);
      vf = truncate(vf);

      //define force
      double f = 0;
      f = randomD (49.05, 100);
      f = truncate(f);

      //define mass
      double m = 0;
      m = randomD (0, 100);
      m = truncate(m);

      //define mass2
      double m2 = 0;
      m2 = randomD (0, 5);
      m2 = truncate(m2);
  
      //define time
      double t = 0;
      t = randomD (0, 100);
      t= truncate(t);
  


      //define mew
      double mew = 0.0;
      mew = randomD(0, 0);
      mew = truncate(mew);
    
      switch(problem){
        //this end is seriously lacking in variance
        case 1:
          //horizontal circles force calc
         System.out.println("a " + m + " Kg mass is swung in a horizontal circle of diameter " + (r*2) + " m, and takes " + t + " s to complete a full rotation. Determine the centripital force acting on the system?");
          solution =  (m*(4*Math.pow(Math.PI, 2)*r) / (Math.pow(t,2)));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " N");
          break;
          
        case 2:
          //horizontal circles force for time in rpm
          solution =  (m*(4*Math.pow(Math.PI, 2)*r) / (Math.pow(t,2)));
         System.out.println("a " + m + "Kg mass is swung in a horizontal circle of diameter " + (r*2) + " m, and the highest force the string connecting the mass to the centre can support is " + solution + " N. Determine the frequency the system spins in rpm?");
          solution =  (1/t)*60;
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " RPM");
          break;
        case 3:
          //horizontal circles force for velocity
          solution =  (m*(4*Math.pow(Math.PI, 2)*r) / (Math.pow(t,2)));
         System.out.println("a " + m + " Kg mass is swung in a horizontal circle of diameter " + (r*2) + " m, and the highest force the string connecting the mass to the centre can support is " + solution + " N. Determine the maximum velocity the system can spin at in m/s?");
          solution =  Math.sqrt((solution / m) * r);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " m/s");
          break;
        case 4:
          //horizontal circles car turn force for velocity
          solution =  (9.81*m*mew);
         System.out.println("a " + m + " Kg car makes a turn of radius " + r + " m, if the mew force between the ground and the car is " + mew + " what is the max speed the driver can take the turn at?");
          solution =  Math.sqrt((solution / m) * r);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " m/s");
          break;
        case 5:
          //vertical circular motion top of motion
          solution =  (9.81*m*mew);
         System.out.println("a " + m + " Kg car goes through a loop-de-loop of radius " + (r*100) + " cm, how fast in m/s must the car be moving in order to stay in the loop? ");
          solution =  Math.sqrt(9.81 * r);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " m/s");
          break;
        case 6:
          //vertical circular motion bottom of motion
          solution =  ((-9.81*m2) + f);
         System.out.println("a " + m2 + " Kg object is swung vertically from a " + r + " m string that can support " + f + "N, at what speed will the string snap?");
          solution =  Math.sqrt(solution*r/m2);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " m/s");
          break;

          //SATELLITE MOTION GETS A SEPERATE CATEGORY
          //NEEDS VARIANCE TO EACH EQUATIONS
      }
      System.out.println("");
      checkCorrect();
      System.out.println("press 1 for another circular motion problem.");
      command = getCommand();
      if (command.equals("1"))
      {
        ucmp();
      }else{
       
      }
  }
  private static void smp()
  {
      //forces
      System.out.println("");
      int problem = random(1,8);
      double solution = 0;
      String command = "";
    
      //define acceleration
      double a = 0.0;
      a = randomD (1, 10);
      a = truncate(a);

      //define radius
      double r = 0;
      r = randomD (1, 10);
      r = truncate(r);
      
      //define force
      double f = 0;
      f = randomD (0, 100);
      f = truncate(f);

      //define mass
      double m = 0;
      m = randomD (1, 10);
      m = truncate(m);

      //define mass2
      double m2 = 0;
      m2 = randomD (1, 10);
      m2 = truncate(m2);
  
      //define exponent
      int e = 0;
      e = random (16, 30);

      //define exponent2
      int e2 = 0;
      e2 = random (3, 8);

      //define exponent3
      int e3 = 0;
      e3 = random (0, 2);

      //define period
      double t = 0.0;
      t = randomD(0, 700);
      t = truncate(t);
    
      switch(problem){
        //could perhaps use more variance in the variable that is being solved for 
        
        case 1:
          //satellite motion speed for orbit
          System.out.println("what is the neccissary speed for a satellite orbiting a celestial body at a orbital distance of " + r + "E" + e2 + " km, the planet has a mass of " + m + "E" + e + " kg?");
          solution =  ((6.67*(Math.pow(10,-11))) * (m*(Math.pow(10,e))))/(Math.pow(((r*(Math.pow(10,e2))*1000)), 2));
          solution = solution * ((r*(Math.pow(10,e2))*1000));
          solution = Math.sqrt(solution);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((solution)  + " m/s");
          break;
        
        case 2:
          //satellite motion speed for orbit radius
          solution =  ((6.67*(Math.pow(10,-11))) * (m*(Math.pow(10,e))))/(Math.pow(((r*(Math.pow(10,e2))*1000)), 2));
          solution = solution * ((r*(Math.pow(10,e2))*1000));
          solution = Math.sqrt(solution);
          System.out.println("what is the orbital radius in m for a satellite orbiting a celestial body at a orbital speed of " + solution + " m/s, the planet has a mass of " + m + "E" + e + " kg? ");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((r*(Math.pow(10,e2))*1000)  + " m");
          break;
        
        case 3:
          //satellite motion speed for orbit mass
          solution =  ((6.67*(Math.pow(10,-11))) * (m*(Math.pow(10,e))))/(Math.pow(((r*(Math.pow(10,e2))*1000)), 2));
          solution = solution * ((r*(Math.pow(10,e2))*1000));
          solution = Math.sqrt(solution);
          System.out.println("what is the orbital mass in kg of a celestial body for a satellite orbiting at a orbital speed of " + solution + " m/s,  and an orbital radius of " + r + "E" + e2 + " km? ");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println( (m*(Math.pow(10,e))) + " kg");
          break;
          
        case 4:
          //satellite motion period for orbit
          System.out.println("what is the period of orbit in days for a satellite orbiting a celestial body at a orbital distance of " + r + "E" + e2 + "m, the planet has a mass of " + m + "E" + e + " kg.");
          solution =  ((6.67*(Math.pow(10,-11))) * (m*(Math.pow(10,e))))/(Math.pow((r*(Math.pow(10,e2))), 2));
          solution = (4*(Math.pow(Math.PI, 2))*(r*(Math.pow(10,e2)))) / (solution);
          solution = Math.sqrt(solution);
          solution = solution/60.0/60.0/24.0;
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((solution)  + " days");
          break;

        case 5:
          //satellite motion period for orbit for radius
          solution =  ((6.67*(Math.pow(10,-11))) * (m*(Math.pow(10,e))))/(Math.pow((r*(Math.pow(10,e2))), 2));
          solution = (4*(Math.pow(Math.PI, 2))*(r*(Math.pow(10,e2)))) / (solution);
          solution = Math.sqrt(solution);
          solution = solution/60.0/60.0/24.0;
          System.out.println("what is the radius of orbit in metres for a satellite orbiting a celestial body at a orbital period of " + solution + " days, the planet has a mass of " + m + "E" + e + " kg.");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((r*(Math.pow(10,e2)))  + " m");
          break;
          
        case 6:
          //satellite motion period for orbit for mass
          solution =  ((6.67*(Math.pow(10,-11))) * (m*(Math.pow(10,e))))/(Math.pow((r*(Math.pow(10,e2))), 2));
          solution = (4*(Math.pow(Math.PI, 2))*(r*(Math.pow(10,e2)))) / (solution);
          solution = Math.sqrt(solution);
          solution = solution/60.0/60.0/24.0;
          System.out.println("a satellite orbits for a period of " + solution + " days, the radius of this orbit is " + r + "E" + e2 + " m, what is the mass of the planet being orbited in kg?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((m*(Math.pow(10,e)))  + " kg");
          break;

        case 7:
          //satellite motion Kepler's Third Law
          System.out.println("a planet has an orbital period of " + t + " days and an orbital radius of " + r + " AU, another planet in the same system has an orbital radius of " + m + "AU. what is the orbital period of the other planet in days");
          r = r*149597870691.0;
          m = m*149597870691.0;
          t = t*86400;
          solution =  (Math.pow(t,2)) / (Math.pow(r,3));
          solution = solution*(Math.pow(m,3));
          solution = Math.sqrt(solution);
          solution = solution / 86400;
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((solution)  + " days");
          break;
        
        case 8:
          //satellite motion Kepler's Third Law
          r = r*149597870691.0;
          m = m*149597870691.0;
          t = t*86400;
          solution =  (Math.pow(t,2)) / (Math.pow(r,3));
          solution = solution*(Math.pow(m,3));
          solution = Math.sqrt(solution);
          solution = solution / 86400;
          System.out.println("a planet has an orbital period of " + (t/86400) + " days and an orbital radius of " + (r/149597870691.0) + " AU, another planet in the same system has an orbital period of " + solution + " days. what is the orbital radius of the other planet in AU");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((m/149597870691.0)  + " AU");
          break;

        case 10:
          //proportionality basic (WIP})
          e2 = e2 + 1;
          e3 = e3 + 1;
          solution =  ((6.67*(Math.pow(10,-11))) * (m*(Math.pow(10,e))) * (m2*(Math.pow(10,e3))))/(Math.pow((r*(Math.pow(10,e2))), 2));
          solution = solution / e;
          System.out.println("Two objects have a force of attraction of " + solution + " N. If the distance between the objects was " + e2 + " times as far and the mass of the first object is " + e + " times as big and the mass of the second object is " + e3 + " times as massive. What is the new force of attraction");
          solution = solution*((e*e3) / (Math.pow(e2,2)));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((solution)  + " N");
          break;    
          //could add geocentric motion
      }
    
      System.out.println("");
      checkCorrect();
      System.out.println("press 1 for another satellite motion problem.");
      command = getCommand();
      if (command.equals("1"))
      {
        smp();
      }else{
       
      }
  }
  private static void ep()
  {
      // circular motion
      System.out.println("");
      int problem = random(1,18);
      double solution = 0;
      String command = "";
      //define acceleration
      double a = 0.0;
      a = randomD (0, 9);
      a = truncate(a);
      
      //define  velocity
      double v = 0;
      v = randomD (5, 100);
      v = truncate(v);
    
      //define distance
      double d = 0;
      d = randomD (10, 200);
      d = truncate(d);
      
      //define final velocity
      double vf = 0;
      vf = randomD (5, 10);
      vf = truncate(vf);

     //define initial velocity
      double vi = 0;
      vi = randomD (0, 5);
      vi = truncate(vi);

      //define force
      double f = 0;
      f = randomD (49.05, 700);
      f = truncate(f);

      //define mass
      double m = 0;
      m = randomD (10, 100);
      m = truncate(m);

      //define mass2
      double m2 = 0;
      m2 = randomD (0, 5);
      m2 = truncate(m2);
  
      //define time
      double t = 0;
      t = randomD (0, 100);
      t= truncate(t);
  
      //define angles
      double theta = 0.0;
      theta = random(20, 60);


      //define mew
      double mew = 0.0;
      mew = randomD(0, 0);
      mew = truncate(mew);

      //define elastic constant
      double k = 0.0;
      k = randomD(1, 5);
      k = truncate(k);
    
      switch(problem){
          
        case 1:
          //Newtons and Joules conversion with distance for joules
         System.out.println(f + "N of force is applied at a " + theta + " degree angle from the horizontal, the object moves " + d + "m, how much work was done in Joules?");
          solution = Math.toRadians(theta);
          solution = d*f*(Math.cos(solution));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " J");
          break;

        case 2:
          //Newtons and Joules conversion with distance for force
          solution = Math.toRadians(theta);
          solution = d*f*(Math.cos(solution));
          System.out.println(solution + "J of energy is used when an unknown force applies at a " + theta + " degree angle from the horizontal, the object moves " + d + "m, what is the force applied in N?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(f)  + " N");
          break;

        case 3:
          //Newtons and Joules conversion with distance for angle
          solution = Math.toRadians(theta);
          solution = d*f*(Math.cos(solution));
          System.out.println(solution + "J of energy is used when a force of " + f + "N applies at an unknown degree angle from the horizontal, the object moves " + d + "m, what is the angle in degrees?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(theta)  + " degrees");
          break;

        case 4:
          //consevation of energy in a slope for friction
          d = round(d*5/100);
          solution = (m*9.81*d) + (0.5*m*(Math.pow(vi,2)));
          solution = solution - (0.5*m*(Math.pow(vf,2)));
          System.out.println("A car of mass " + m + "kg is dropped down a " + (d*100) + "cm tall slope, the velocity of the car before the slope is " + vi + "m/s, by the end of the slope the velocity is " + vf + "m/s, what is the work done by friction on the system?" );
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(-1*round(solution)  + "J");
          break;

        case 5:
          //consevation of energy in a slope
          d = round(d*5/100);
          solution = (m*9.81*d) + (0.5*m*(Math.pow(vi,2)));
          solution = Math.sqrt(solution / (0.5*m));
          System.out.println("A car of mass " + m + "kg is dropped down a " + (d*100) + "cm tall slope, the velocity of the car before the slope is " + vi + "m/s, what is the theoretical velocity at the end of the slope?" );
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + "m/s");
          break;

        case 6:
          //consevation of energy in a spring
          d = round(d/100);
          solution = 0.5*k*(Math.pow(d,2));
          solution = Math.sqrt(solution / 0.5 / m2);
          System.out.println("a cart of mass " + m2 + "kg is launched by a spring of elastic constant " + k + "N/m, the displacement of the spring's compression is " + (d*100) + "cm, friction is negligable, what is the final velocity of the cart" );
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + "m/s");
          break;

        case 7:
          //consevation of energy in a spring for friction
          d = round(d/100);
          solution = 0.5*k*(Math.pow(d,2));
          solution = Math.abs(solution - (0.5*m2*Math.pow(vf,2)));
          System.out.println("a cart of mass " + m2 + "kg is launched by a spring of elastic constant " + k + "N/m, the displacement of the spring's compression is " + (d*100) + "cm, the final velocity expirimentally is " + vf + "m/s, a magnet is used experimentally to pull the cart faster, what is the work done by the cart?" );
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + "J");
          break;

        case 8:
          //spring constant understanding
          solution = k*d;
          System.out.println("a spring exerts a force of " + solution + "N, when stretched " + round(d*100) + "cm, what is the spring constant?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(k)  + "N/m");
          break;

        case 9:
          //spring constant understanding for F
          solution = k*d;
          System.out.println("a spring with constant of " + k + "N/m, is stretched " + round(d*100) + "cm, what is the force outputted by the spring?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + "N");
          break;

        case 10:
          //spring constant understanding for x
          solution = k*d;
          System.out.println("a spring with constant of " + k + "N/m, is stretched to output a force of " + solution + "N, what is the distance the string was stretched in m?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(d)  + "m");
          break;

        case 11:
          //consevation of energy in a pendulum 
          d = round(d/10*2);
          solution = Math.sqrt((Math.pow(d,2)-(Math.pow(vf,2))));
          solution = Math.sqrt(solution*2*9.81);
          System.out.println("a pendulum is swung from a " + d + "m long string, it is pulled " + vf + "m from the centre, what is the velocity when the mass touches the ground ?" );
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + "m/s");
          break;

        case 12:
          //power-velocity problems
          solution = v*(m*9.81);
          System.out.println("a rocket shoots up at a speed of " + v + "m/s in uniform motion against gravity. It's mass is " + m + "kg, what is it's power output?" );
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + "W");
          break;

        case 13:
          //power-velocity problems for mass
          solution = v*(m*9.81);
          System.out.println("a rocket shoots up at a speed of " + v + "m/s in uniform motion against gravity. It's power output is " + solution + " watts, what is it's mass ?" );
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(m  + "kg");
          break;

        case 14:
          //power-velocity problems for velocity
          solution = v*(m*9.81);
          System.out.println("a rocket shoots up with a mass of " + m + "kg. It is in uniform motion against gravity. It outputs " + solution + "watts, what is it's velocity?" );
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(v  + "m/s");
          break;

        case 15:
          //power problems 
          solution = f*d/t;
          System.out.println("a car generates " + f + "N of friction in order to maintain a constant speed over " + d + "m in " + t + "s, what power is generated by the car?" );
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + "W");
          break;

        case 16:
          //power problems for distance
          solution = f*d/t;
          System.out.println("a car generates " + f + "N of friction in order to maintain a constant speed over an unknown distance in " + t + "s, it generates " + solution + " watts, what is the distance traveled in this time?" );
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(d  + "m");
          break;

        case 17:
          //power problems for time
          solution = f*d/t;
          System.out.println("a car generates " + f + "N of friction in order to maintain a constant speed over " + d + "m generating " + solution + " watts of power. What is the time it took to generate this amount of power?" );
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(t  + "s");
          break;

        case 18:
          //power problems for force
          solution = f*d/t;
          System.out.println("a car maintains a constant speed over " + d + "m in " + t + "s, generating " + solution + " watts of power. What is the force of friction created by the car?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(f  + "N");
          break;

        //still needs efficiency problems
        
      }
      System.out.println("");
      checkCorrect();
      System.out.println("press 1 for another Work and Energy problem.");
      command = getCommand();
      if (command.equals("1"))
      {
        ep();
      }else{
       
      }
  }
  private static void SHMp()
  {
      // circular motion
      System.out.println("");
      int problem = random(1,15);
      double solution = 0;
      String command = "";
      //define acceleration
      double a = 0.0;
      a = randomD (1, 18);
      a = truncate(a);
      
      //define  velocity
      double v = 0;
      v = randomD (5, 100);
      v = truncate(v);
    
      //define distance
      double d = 0;
      d = randomD (0, 3);
      d = truncate(d);
      
      //define final velocity
      double vf = 0;
      vf = randomD (5, 10);
      vf = truncate(vf);

     //define initial velocity
      double vi = 0;
      vi = randomD (0, 5);
      vi = truncate(vi);

      //define force
      double f = 0;
      f = randomD (49.05, 700);
      f = truncate(f);

      //define mass
      double m = 0;
      m = randomD (10, 100);
      m = truncate(m);

      //define mass2
      double m2 = 0;
      m2 = randomD (0, 5);
      m2 = truncate(m2);
  
      //define time
      double t = 0;
      t = randomD (0, 100);
      t= truncate(t);
  
      //define angles
      double theta = 0.0;
      theta = random(1, 14);


      //define mew
      double mew = 0.0;
      mew = randomD(0, 0);
      mew = truncate(mew);

      //define elastic constant
      double k = 0.0;
      k = randomD(1, 25);
      k = truncate(k);
    
      switch(problem){
          
        case 1:
          //period of a spring
         System.out.println("A spring in simple harmonic motion has a spring constant of " + k + " N/m. The mass attatched is " + m + " kg, the mass is displaced by an amplitude of " + d + "cm. What is the period of motion for the spring?");
          solution = 2*(Math.PI)*(Math.sqrt((m/k)));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " s");
          break;

        case 2:
          //period of a spring for mass
          solution = 2*(Math.PI)*(Math.sqrt((m/k)));
         System.out.println("A spring in simple harmonic motion has a spring constant of " + k + " N/m. The system has an oscillatory period of " + solution + " seconds, the mass is displaced by an amplitude of " + d + "cm. What is the mass attached to the spring?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(m  + " kg");
          break;

        case 3:
          //period of a spring for spring constant
          solution = 2*(Math.PI)*(Math.sqrt((m/k)));
         System.out.println("A spring in simple harmonic motion has a mass attached of " + m + " kg. The system has an oscillatory period of " + solution + " seconds, the mass is displaced by an amplitude of " + d + "m. What is the spring constant?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(k  + " N/m");
          break;

        case 4:
          //period of a pendulum
         System.out.println("A pendulum in simple harmonic motion has a string length of " + (d*100) + " cm. The gravitational accelleration is " + a + " m/s^2, the mass is pulled an angle of " + theta + " degrees. What is the period of motion for the pendulum?");
          solution = 2*(Math.PI)*(Math.sqrt((d/a)));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " s");
          break;

        case 5:
          //period of a pendulum for length
          solution = 2*(Math.PI)*(Math.sqrt((d/a)));
         System.out.println("A pendulum in simple harmonic motion has a period of " + solution + " seconds. The gravitational accelleration is " + a + " m/s^2, the mass is pulled an angle of " + theta + " degrees. What is the length string for the pendulum?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(d  + " m");
          break;

        case 6:
          //period of a pendulum for gravitation
          solution = 2*(Math.PI)*(Math.sqrt((d/a)));
         System.out.println("A pendulum in simple harmonic motion has a period of " + solution + " seconds. The length of string is " + d + " m, the mass is pulled an angle of " + theta + " degrees. What is the gravitational field strength for the pendulum?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(a  + " N/kg");
          break;

        case 7:
          //period of a pendulum on earth
         System.out.println("A pendulum in simple harmonic motion has a string length of " + (d*100) + " cm. The mass is pulled an angle of " + theta + " degrees. What is the period of motion for the pendulum?");
          solution = 2*(Math.PI)*(Math.sqrt((d/9.81)));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " s");
          break;

        case 8:
          //period of a pendulum for length on earth
          solution = 2*(Math.PI)*(Math.sqrt((d/9.81)));
         System.out.println("A pendulum in simple harmonic motion has a period of " + solution + " seconds. The mass is pulled an angle of " + theta + " degrees. What is the length string for the pendulum?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(d  + " m");
          break;

        case 9:
          //circular motion mirroring
          solution = (2*(Math.PI)*(d)) / t;
         System.out.println("a spring in SHM expands to an amplitude of " + d + "m and has a period of " + t + "s, what is the maximum velocity of the system?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " m/s");
          break;

        case 10:
          //circular motion mirroring for time
          solution = (2*(Math.PI)*(d)) / t;
         System.out.println("a spring in SHM expands to an amplitude of " + d + "m and has a max velocity of " + solution + "m/s, what is the period of the system?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(t  + " s");
          break;

        case 11:
          //circular motion mirroring for distance
          solution = (2*(Math.PI)*(d)) / t;
         System.out.println("a spring in SHM expands with a period of " + t + "s and has a max velocity of " + solution + "m/s, what is the amplitude of the system?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(d  + " m");
          break;

        case 12:
          //circular motion mirroring type b 
          solution = d*(Math.sqrt((k/m)));
         System.out.println("a spring in SHM expands with an amplitude of " + d + "m and has a spring constant of " + k + "N/m, with a mass of " + m + "kg. What is the max velocity of the system?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " m/s");
          break;

        case 13:
          //circular motion mirroring type b for mass
          solution = d*(Math.sqrt((k/m)));
         System.out.println("a spring in SHM expands with an amplitude of " + d + "m and has a spring constant of " + k + "N/m, with a max speed of " + solution + "m/s. What is the mass attatched to the system?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(m  + " kg");
          break;

        case 14:
          //circular motion mirroring type b for spring constant
          solution = d*(Math.sqrt((k/m)));
         System.out.println("a spring in SHM expands with an amplitude of " + d + "m and has a mass of " + m + "kg, with a max speed of " + solution + "m/s. What is the spring constant?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(k  + " N/m");
          break;

        case 15:
          //circular motion mirroring type b for amplitude
          solution = d*(Math.sqrt((k/m)));
         System.out.println("a spring in SHM expands with a spring constant of " + k + "N/m and has a mass of " + m + "kg, with a max speed of " + solution + "m/s. What is the amplitude of the system?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(d  + " m");
          break;
          
        
      }
      System.out.println("");
      checkCorrect();
      System.out.println("press 1 for another Simple Harmonic Motion problem.");
      command = getCommand();
      if (command.equals("1"))
      {
        SHMp();
      }else{
       
      }
  }
  private static void mwp()
  {
      // circular motion
      System.out.println("");
      int problem = random(1,7);
      double solution = 0;
      String command = "";
      //define acceleration
      double a = 0.0;
      a = randomD (1, 18);
      a = truncate(a);
    
      //define wavelength
      double lambda = 0;
      lambda = randomD (0, 3);
      lambda = truncate(lambda);
      
      //define  velocity
      double v = 0;
      v = randomD (5, 329);
      v = truncate(v);

     //define frequency
      double f = 0;
      f = randomD (0, 22000);
      f = truncate(f);

      //define mass
      double m = 0;
      m = randomD (10, 100);
      m = truncate(m);

      //define mass2
      double m2 = 0;
      m2 = randomD (0, 5);
      m2 = truncate(m2);
  
      //define time
      double t = 0;
      t = randomD (0, 100);
      t= truncate(t);


      //define mew
      double mew = 0.0;
      mew = randomD(0, 0);
      mew = truncate(mew);

      //define elastic constant
      double k = 0.0;
      k = randomD(1, 25);
      k = truncate(k);
    
      switch(problem){
          
        case 1:
          //universal wave formula 
         System.out.println("a wave oscellates at " + f + "Hz with a wavelength of " + lambda + "m, what is the speed of the wave?");
          solution = f*lambda;
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " m/s");
          break;

        case 2:
          //universal wave formula 
          solution = f*lambda;
         System.out.println("a wave oscellates at " + f + "Hz with a speed of " + solution + "m/s, what is the wavelength?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(lambda  + " m");
          break;  
        
        case 3:
          //universal wave formula 
          solution = f*lambda;
         System.out.println("a wave oscellates with a wavelength of " + lambda + "m with a speed of " + solution + "m/s, what is the frequency of the wave?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(f  + " Hz");
          break; 

        case 4:
          //doppler shift toward the observer
          solution = (343/(343 - v))*f;
         System.out.println("a siren has a frequency of " + f + "Hz, it moves toward an observer at " + v + "m/s, what is the observer's percieved frequency if the speed of sound in air is assumed to be 343 m/s?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " Hz");
          break; 

        case 5:
          //doppler shift toward the observer for velocity
          solution = (343/(343 - v))*f;
         System.out.println("a siren has a frequency of " + f + "Hz, it has a percieved frequency of " + solution +  "Hz, what is the velocity of the moving siren if the speed of sound in air is assumed to be 343 m/s?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(v  + " m/s");
          break; 

        case 6:
          //doppler shift away the observer for velocity
          solution = (343/(343 + v))*f;
         System.out.println("a siren has a frequency of " + f + "Hz, it has a percieved frequency of " + solution +  "Hz, what is the velocity of the moving siren if the speed of sound in air is assumed to be 343 m/s?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(v  + " m/s");
          break; 

        case 7:
          //doppler shift away the observer
          solution = (343/(343 + v))*f;
         System.out.println("a siren has a frequency of " + f + "Hz, it moves away from an observer at " + v + "m/s, what is the observer's percieved frequency if the speed of sound in air is assumed to be 343 m/s?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " Hz");
          break; 

        //could add harmonics questions
      }
      System.out.println("");
      checkCorrect();
      System.out.println("press 1 for another Mechanical Waves problem.");
      command = getCommand();
      if (command.equals("1"))
      {
        mwp();
      }else{
       
      }
  }
  
  //CHEMISTRY PATHS
  private static void bc()
  {
      
    //bonding
    System.out.println("");
    int problem = random(1, 1);
    double solution = 0;
    String name = "";
    String command = "";

    //metal
    String m = randMetal();


    //nonmetal
    String nm = randNonMetal();

    //mm mercury
    double mmhg = 0.0;
    mmhg = randomD (0, 10000);
    mmhg = truncate(mmhg);

    //kilo pascals
    double kpa = 0.0;
    kpa = randomD (0, 500);
    kpa = truncate(kpa);

    //kilo pascals 2
    double kpa2 = 0.0;
    kpa2 = randomD (0, 500);
    kpa2 = truncate(kpa2);

    //atmos
    double atm = 0.0;
    atm = randomD (0, 5);
    atm = truncate(atm);

    //litres
    double L = 0.0;
    L = randomD (0, 5);
    L = truncate(L);

    //litres2
    double L2 = 0.0;
    L2 = randomD (0, 5);
    L2 = truncate(L2);

    switch(problem)
    {
        case 1:
          //ionic naming
          System.out.println("Name the following compound: " + ionicCompound(m,nm));
          name = ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name ;
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((name));
        break;
       
    }
    System.out.println("");
    checkCorrect();
    System.out.println("press 1 for another bonding problem.");
    command = getCommand();
    if (command.equals("1"))
    {
      bonding();
    }else{
      
    }
    
      
  }
  private static void gc()
  {
      
    //gasses
    System.out.println("");
    int problem = random(1, 12);
    double solution = 0;
    String command = "";

    //Kelvin
    double k = 0.0;
    k = randomD (0, 2000);
    k = truncate(k);

    //celcius
    double c = 0.0;
    c = randomD (-273.15, 1000);
    c = truncate(c);

    //mm mercury
    double mmhg = 0.0;
    mmhg = randomD (0, 10000);
    mmhg = truncate(mmhg);

    //kilo pascals
    double kpa = 0.0;
    kpa = randomD (0, 500);
    kpa = truncate(kpa);

    //kilo pascals 2
    double kpa2 = 0.0;
    kpa2 = randomD (0, 500);
    kpa2 = truncate(kpa2);

    //atmos
    double atm = 0.0;
    atm = randomD (0, 5);
    atm = truncate(atm);

    //litres
    double L = 0.0;
    L = randomD (0, 5);
    L = truncate(L);

    //litres2
    double L2 = 0.0;
    L2 = randomD (0, 5);
    L2 = truncate(L2);

    switch(problem)
    {
        case 1:
          //kelvin to c
          System.out.println("convert " + k + " degrees K to celcius.");
          solution =  (k - 273.15);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " degrees c");
        break;
        case 2:
          //c to k
          System.out.println("convert " + c + " degrees C to kelvin.");
          solution =  (c + 273.15);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " degrees K");
        break;
      case 3:
        //mmHg to kPa and atm
        System.out.println("convert " + mmhg + " mmhgs to kPa and atms.");
        atm =  (mmhg / 760);
        kpa =  (atm * 101.325);
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(atm)  + " atm and " + round(kpa) + " kilo pascals");
        break;
      case 4:
        //kPa to mmhg and atm
        System.out.println("convert " + kpa + " kilo pascals to mmhg and atms.");
        atm =  (kpa / 101.325);
        mmhg =  (atm * 760);
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(atm)  + " atm and " + round(mmhg) + " mmhgs");
        break;
      case 5:
        //atm to kpa and mmhg
        System.out.println("convert " + atm + " atms to kilo pascals and mmhg.");
        kpa =  (atm * 101.325);
        mmhg =  (atm * 760);
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(kpa)  + " kilo pascals and " + round(mmhg) + " mmhgs");
        break;

      case 6:
        //boyles law for volume
        System.out.println(L + " L of gas is subjected to " + kpa + " kPa. What is the new volume at " + kpa2 + " kPa. Temperature remains constant");
        L = ((kpa*L)/kpa2);
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(L)  + " L");
        break;

      case 7:
        //boyles law for pressure
        System.out.println(L + " L of gas is subjected to " + kpa + " kPa. What is the new pressure at " + L2 + " L. Temperature remains constant");
        kpa = ((kpa*L)/L2);
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(kpa)  + " kpa");
        break;

      case 8:
        //Charles' law for volume
        System.out.println(L + " L of gas is subjected to " + c + " degrees celcius. What is the new volume at " + k + " degrees kelvin. Pressure remains constant");
        L = (L / (c + 273.15)*k);
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(L)  + " L");
        break;

      case 9:
        //Charles' law for temp
        System.out.println(L + " L of gas is subjected to " + c + " degrees celcius. The volume changes to " + L2 + " L, What is the new temperature in degrees kelvin. Pressure remains constant");
        k = (L2 / (L/(c + 273.15)));
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(k)  + " degrees kelvin");
        break;
        
      case 10: 
        //combined gas for temp
        System.out.println(L + " L of gas is subjected to " + c + " degrees celcius at a pressure of " + kpa + " kPa. The volume changes to " + L2 + " L and a pressure of " + kpa2 + " kPa. What is the new temperature in degrees kelvin");
        k = ((kpa2*L2) / ((kpa*L)/(c + 273.15)));
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(k)  + " degrees kelvin");
        break;
        
      case 11:
        //combined law for volume
        System.out.println(L + " L of gas is subjected to " + c + " degrees celcius at a pressure of " + kpa + " kPa. The temperature changes to " + k + " degrees kelvin and a pressure of " + kpa2 +  " What is the new volume in L.");
        L = ((kpa*L*k) / ((c + 273.15)*kpa2));
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(L)  + " L");
        break;
        
      case 12:
        //combined law for pressure
        System.out.println(L + " L of gas is subjected to " + c + " degrees celcius at a pressure of " + kpa + " kPa. The temperature changes to " + k + " degrees kelvin and a volume of " + L2 + " What is the new pressure in kpa.");
        kpa = ((kpa*L*k) / ((c + 273.15)*L2));
        System.out.println("Press enter to see solution");
        command = getCommand();
        System.out.println(round(kpa)  + " kpa");
        break;
        // Still needs pv = nrt questions!!!

        
    }
    System.out.println("");
    checkCorrect();
    System.out.println("press 1 for another gasses problem.");
    command = getCommand();
    if (command.equals("1"))
    {
      gasses();
    }else{
      
    }
    
      
  }
private static void sc()
  {
      
    //solutions
    System.out.println("");
    int problem = random(1, 20);
    double solution = 0;
    double M = 0;
    String command = "";

    //moles
    double n = 0.0;
    n = randomD (0, 15);
    n = truncate(n);

    //mass solute
    double gs = 0.0;
    gs = randomD (0, 999);
    gs = truncate(gs);

    //mass total 
    double gt = 0.0;
    gt = randomD (999, 2000);
    gt = truncate(gt);

    //filler
    double kpa = 0.0;
    kpa = randomD (0, 500);
    kpa = truncate(kpa);

    //filler
    double kpa2 = 0.0;
    kpa2 = randomD (0, 500);
    kpa2 = truncate(kpa2);

    //filler
    double atm = 0.0;
    atm = randomD (0, 5);
    atm = truncate(atm);

    //litres (total)
    double lt = 0.0;
    lt = randomD (5, 55);
    lt = truncate(lt);

    //litres (solute)
    double ls = 0.0;
    ls = randomD (0, 5);
    ls = truncate(ls);

    //pH 
    double pH = 0.0;
    pH = randomD (0, 13);
    pH = truncate(pH);

    //metal 
    String m = randMetal();

    //nonmetal 
    String nm = randNonMetal();

    switch(problem)
    {
        case 1:
          //molar concentration
          System.out.println("what is the amount concentration of " + n + " mol in " + round(ls*1000) + "mL of solution?");
          solution =  (n/(ls));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " mol/L");
        break;

        case 2:
          //molar concentration from answer for mols
          solution =  (n/(ls));
          System.out.println("How many moles is in a " + ls + "L of " + solution + " M solution?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((n)  + " mol");
        break;

        case 3:
          //molar concentration from answer for volume
          solution =  (n/(ls));
          System.out.println("what volume is " + n + "mols of " + solution + " M solution?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((ls)  + " L");
        break;

        case 4:
          //percent concentration m/v
          System.out.println(gs + "g of solute is dissolved in " + lt + "L of solution. What is the percent concentration?");
          solution =  (((gs)/(lt*1000))*100);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + "%");
        break;

        case 5:
          //percent concentration m/v backwards for b volume total 
          solution =  (((gs)/(lt*1000))*100);
          System.out.println(gs + "g of solute makes up " + solution + "% of a solution. What is the total volume in litres?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((lt)  + "L");
        break;

        case 6:
          //percent concentration m/v backwards for volume of solute
          solution =  (((gs)/(lt*1000))*100);
          System.out.println(lt + "L of solution has an unknown mass of solute making up " + solution + "% of the solution. What is the mass of solute in grams?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((gs)  + "g");
        break;

        case 7:
          //percent concentration m/m
          System.out.println(gs + "g of solute is dissolved in " + gt + "g of solution. What is the percent concentration?");
          solution =  (((gs)/(gt))*100);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + "%");
        break;

        case 8:
          //percent concentration m/m backwards for the total mass
          solution =  (((gs)/(gt))*100);
          System.out.println(gs + "g of solute makes up " + solution + "% of a solution. What is the total weight in grams?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((gt)  + "g");
        break;

        case 9:
          //percent concentration m/m backwards for the solute
          solution =  (((gs)/(gt))*100);
          System.out.println(gt + "g solution has " + solution + "% solute. What is the weight of solute in grams?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((gs)  + "g");
        break;

        case 10:
          //percent concentration v/v
          System.out.println(ls + "L of solute is dissolved in " + lt + "L of solution. What is the percent concentration?");
          solution =  (((ls)/(lt))*100);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + "%");
        break;

        case 11:
          //percent concentration v/v backwards for total
          solution =  (((ls)/(lt))*100);
          System.out.println(ls + "L of solute makes up " + solution + "% of a solution. What is the total volume in litres?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((lt)  + "L");
        break;

        case 12:
          //percent concentration v/v backwards for solute volume
          solution =  (((ls)/(lt))*100);
          System.out.println(lt + "L of solution has " + solution + "% of a solute. What is the total volume of solute in litres?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((ls)  + "L");
        break;
        
        case 13:
        //dilution
          M =  (n/(ls));
          System.out.println(gs + "mL of " + M + " M solution is changed to a final volume that is " + gt + "mL greater. What is the new amount concentration?");
          solution =  ((M*gs)/(gs + gt));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " M");
        break;

        case 14:
        //dilution b
          M =  (n/(ls));
          System.out.println(gs + "mL of " + M + " M solution is changed to a final concentration that is " + ls + "mol/L . What is the new volume in mL?");
          solution =  ((M*gs)/(ls));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " mL");
        break;
        
      case 15:
          //pH for hydronium concentration
          solution =  (Math.pow(10, (pH*-1)));
          System.out.println(" what is the hydronium concentration of a substance with a pH of " + pH + "?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((solution)  + " M");
        break;

        case 16:
          //pH for hydroxide concentration
          M = (14 - pH);
          solution =  (Math.pow(10,(-1*M)));
          System.out.println(" what is the hydroxide concentration of a substance with a pH of " + pH + "?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((solution)  + " M");
        break;

        case 17:
          //hydroxide concentration for pH
          pH = (14 - pH);
          solution =  (Math.pow(10,(pH*-1)));
          System.out.println(" what is the pH of a substance with a hydroxide concentration of " + solution + "?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          pH = (14 - pH);
          System.out.println((pH)  + " ");
        break;

        case 18:
          //hydronium concentration for pH
          solution =  (Math.pow(10, (pH*-1)));
          System.out.println(" what is the pH of a substance with a hydronium concentration of " + solution + "?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((pH)  + " ");
        break;

        case 19:
          //molar mass
          solution =  gs/(ionicCompoundMass(m,nm));
          System.out.println(" what is the amount of mols of " + gs + "g of " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + "?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution)  + " mol");
        break;

        case 20:
          //molar mass for mass
          solution =  gs/(ionicCompoundMass(m,nm));
          System.out.println(" what is the mass of " + solution + "mol of " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + "?");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println((gs)  + " g");
        break;
        //Would need very small numbers for ppm, so it is skipped. still missing pv = nrt but that is covered in the stoich unit
        

        
    }
    System.out.println("");
    checkCorrect();
    System.out.println("press 1 for another solutions problem.");
    command = getCommand();
    if (command.equals("1"))
    {
      solutions();
    }else{
      
    }
    
      
  }
  private static void stc()
  {
    //stoicheometry
    System.out.println("");
    int problem = random(1, 40);
    double solution = 0;
    String name = "";
    String command = "";
    String[] info = {};
    //need a element pair that is not polyatomic
    //String poly = randPolyatomic();
    //String em = randElementMetal();
    //String enm = randElementNonMetal();
    info = randChemKit();
    //non conflicting metal 1
    String m = info[0];
    
    //non conflicting nonmetal 1
    String nm = info[1];

    //metal 2
    String m2 = randMetal();

    //nonmetal 2
    String nm2 = randNonMetal();

    //element 1, does not conflict with m or nm
    String e = info[2];

    //element 2 
    String e2 = info[3];

    //element 3
    String e3 = info[4];

    //kilo pascals 
    double kpa = 0.0;
    kpa = randomD (0, 500);
    kpa = truncate(kpa);

    //temperature celcius
    double c = 0.0;
    c = randomD (-273.15, 1000);
    c = truncate(c);

    //litres
    double L = 0.0;
    L = randomD (0, 5);
    L = truncate(L);

    //litres2
    double L2 = 0.0;
    L2 = randomD (0, 5);
    L2 = truncate(L2);

    //concentration
    double M = 0.0;
    M = randomD (0,1);
    M = truncate(M);

    //mass
    double g = 0.0;
    g = randomD (600, 2000);
    g = truncate(g);

    //second mass
    double g2 = 0.0;
    g2 = randomD (600, 2000);
    g2 = truncate(g2);

    switch(problem)
    {
        case 1:
          //balancing double replace
          System.out.println("Write and balance a chemical equation for " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " reacting with " + ElementData.lookupElement(m2, "Atomic #").name + " " + ElementData.lookupElement(nm2, "Atomic #").name);
          info = balancing(m,nm,m2,nm2);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
        break;

        case 2:
          //balancing single replace 
          info = balancing(m,nm,e);
          System.out.println("Write and balance a chemical equation for " + ElementData.lookupElement(e, "Atomic #").name + " reacting with " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
        break;

        case 3:
          //balancing formation
          info = balancing(e2,e3,true);
          System.out.println("Write and balance a chemical equation for " + ElementData.lookupElement(e2, "Atomic #").name + " reacting with " + ElementData.lookupElement(e3, "Atomic #").name + " to create a compound");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
        break;

        case 4:
          //balancing decomposition
          info = balancing(e2,e3,false);
          System.out.println("Write and balance a chemical equation for " + ionicCompound(e2,e3) + " Decomposing.");
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
        break;

        case 5:
          //Gravimetric stoich dr
          System.out.println("You have  " + g + "g of " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " reacting with " + ElementData.lookupElement(m2, "Atomic #").name + " " + ElementData.lookupElement(nm2, "Atomic #").name + " How many grams of " + ElementData.lookupElement(m, "Atomic #" ).name + " " + ElementData.lookupElement(nm2, "Atomic #").name + " are created?");
          info = balancing(m,nm,m2,nm2);
          solution = (g)/(ionicCompoundMass(m, nm));
          solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[1]));
          solution = solution * ionicCompoundMass(m, nm2);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 6:
          //Gravimetric stoich dr type 2
          System.out.println("You have  " + g + "g of " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " reacting with " + ElementData.lookupElement(m2, "Atomic #").name + " " + ElementData.lookupElement(nm2, "Atomic #").name + " How many grams of " + ElementData.lookupElement(m2, "Atomic #" ).name + " " + ElementData.lookupElement(nm, "Atomic #").name + " are created?");
          info = balancing(m,nm,m2,nm2);
          solution = (g)/(ionicCompoundMass(m, nm));
          solution = solution * (Double.valueOf(info[4]) / Double.valueOf(info[1]));
          solution = solution * ionicCompoundMass(m2, nm);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 7:
          //Gravimetric stoich sr type 1 has compound looking for compound
          info = balancing(m,nm,e);
          System.out.println("You have  " + g + "g of " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " reacting with " + ElementData.lookupElement(e, "Atomic #").name + " How many grams of " + ElementData.lookupElement(info[5], "Atomic #" ).name + " " + ElementData.lookupElement(info[6], "Atomic #").name + " are created?");
          solution = (g)/(ionicCompoundMass(m, nm));
          solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[2]));
          solution = solution * ionicCompoundMass(info[5], info[6]);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
          break;

        case 8:
          //Gravimetric stoich sr type 2 has element looking for compound
          info = balancing(m,nm,e);
          System.out.println("You have  " + g + "g of " + ElementData.lookupElement(e, "Atomic #").name + " reacting with " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " How many grams of " + ElementData.lookupElement(info[5], "Atomic #" ).name + " " + ElementData.lookupElement(info[6], "Atomic #").name + " are created?");
          solution = (g)/((ElementData.lookupElement(e,"Atomic #").atomicMass)*elementCount(e));
          solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[1]));
          solution = solution * ionicCompoundMass(info[5], info[6]);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 9:
          //Gravimetric stoich sr  type 3 has compound looking for element
          info = balancing(m,nm,e);
          System.out.println("You have  " + g + "g of " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " reacting with " + ElementData.lookupElement(e, "Atomic #").name +  " How many grams of " + ElementData.lookupElement(info[7], "Atomic #" ).name + " are created?");
          solution = (g)/(ionicCompoundMass(m, nm));
          solution = solution * (Double.valueOf(info[4]) / Double.valueOf(info[2]));
          solution = solution * (ElementData.lookupElement(info[7], "Atomic #").atomicMass*elementCount(info[7]));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 10:
          //Gravimetric stoich sr  type 4 has element looking for element SEEMS DYSFUNCTIONAL
          info = balancing(m,nm,e);
          System.out.println("You have  " + g + "g of " + ElementData.lookupElement(e, "Atomic #").name  + " reacting with " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " How many grams of " + ElementData.lookupElement(info[7], "Atomic #" ).name + " are created?");
          solution = (g)/((ElementData.lookupElement(m,"Atomic #").atomicMass)*elementCount(m));
          solution = solution * (Double.valueOf(info[4]) / Double.valueOf(info[1]));
          solution = solution * (ElementData.lookupElement(info[7], "Atomic #").atomicMass*elementCount(info[7]));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 11:
          //Gravimetric stoich formation type 1
          info = balancing(e2,e3,true);
          System.out.println("You have  " + g + "g of " + ElementData.lookupElement(e3, "Atomic #").name  + " reacting with " + ElementData.lookupElement(e2, "Atomic #").name + " "  + " How many grams of " + ElementData.lookupElement(e2, "Atomic #").name + " " + ElementData.lookupElement(e3, "Atomic #").name + " are created?");
          solution = (g)/((ElementData.lookupElement(e3,"Atomic #").atomicMass)*elementCount(e3));
          solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[2]));
          solution = solution * (ionicCompoundMass(e2,e3));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 12:
          //Gravimetric stoich formation type 2
          info = balancing(e2,e3,true);
          System.out.println("You have  " + g + "g of " + ElementData.lookupElement(e2, "Atomic #").name  + " reacting with " + ElementData.lookupElement(e3, "Atomic #").name + " "  + " How many grams of " + ElementData.lookupElement(e2, "Atomic #").name + " " + ElementData.lookupElement(e3, "Atomic #").name + " are created?");
          solution = (g)/((ElementData.lookupElement(e2,"Atomic #").atomicMass)*elementCount(e2));
          solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[1]));
          solution = solution * (ionicCompoundMass(e2,e3));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 13:
          //Gravimetric stoich decomposition type 1
          info = balancing(e2,e3,true);
          System.out.println("You have  " + g + "g of " + ElementData.lookupElement(e2, "Atomic #").name + " " + ElementData.lookupElement(e3, "Atomic #").name  + " decomposing. How many grams of " + ElementData.lookupElement(e2, "Atomic #").name + " are created?");
          solution = (g)/(ionicCompoundMass(e2,e3));
          solution = solution * (Double.valueOf(info[1]) / Double.valueOf(info[3]));
          solution = solution * (ElementData.lookupElement(e2,"Atomic #").atomicMass)*elementCount(e2);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 14:
          //Gravimetric stoich decomposition type 1
          info = balancing(e2,e3,true);
          System.out.println("You have  " + g + "g of " + ElementData.lookupElement(e2, "Atomic #").name + " " + ElementData.lookupElement(e3, "Atomic #").name  + " decomposing. How many grams of " + ElementData.lookupElement(e3, "Atomic #").name + " are created?");
          solution = (g)/(ionicCompoundMass(e2,e3));
          solution = solution * (Double.valueOf(info[2]) / Double.valueOf(info[3]));
          solution = solution * (ElementData.lookupElement(e3,"Atomic #").atomicMass)*elementCount(e3);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 15:
          //GAS stoich dr
          info = balancing(m,nm,m2,nm2);
          System.out.println("You have  " + L + "L of " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " at " + kpa + "kPa and " + c + " degrees celcius reacting with " + ElementData.lookupElement(m2, "Atomic #").name + " " + ElementData.lookupElement(nm2, "Atomic #").name + " How many grams of " + ElementData.lookupElement(m, "Atomic #" ).name + " " + ElementData.lookupElement(nm2, "Atomic #").name + " are created?");
          solution = (kpa*L)/(8.314*(c + 273.15));
          solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[1]));
          solution = solution * ionicCompoundMass(m, nm2);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 16:
          //gas stoich dr type 2
          info = balancing(m,nm,m2,nm2);
          System.out.println("You have  " + L + "L of " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " at " + kpa + "kPa and " + c + " degrees celcius reacting with " + ElementData.lookupElement(m2, "Atomic #").name + " " + ElementData.lookupElement(nm2, "Atomic #").name + " How many grams of " + ElementData.lookupElement(m2, "Atomic #" ).name + " " + ElementData.lookupElement(nm, "Atomic #").name + " are created?");
          solution = (kpa*L)/(8.314*(c + 273.15));
          solution = solution * (Double.valueOf(info[4]) / Double.valueOf(info[1]));
          solution = solution * ionicCompoundMass(m2, nm);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 17:
          //gas stoich sr  type 1
          info = balancing(m,nm,e);
          System.out.println("You have  " + L + "L of " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " at " + kpa + "kPa and " + c + " degrees celcius reacting with " + ElementData.lookupElement(e, "Atomic #").name + " How many grams of " + ElementData.lookupElement(info[5], "Atomic #" ).name + " " + ElementData.lookupElement(info[6], "Atomic #").name + " are created?");
          solution = (kpa*L)/(8.314*(c + 273.15));
          solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[2]));
          solution = solution * ionicCompoundMass(info[5], info[6]);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
          break;

        case 18:
          //gas stoich sr  type 2
          info = balancing(m,nm,e);
          System.out.println("You have  " + L + "L of " + ElementData.lookupElement(e, "Atomic #").name + " at " + kpa + "kPa and " + c + " degrees celcius reacting with " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " How many grams of " + ElementData.lookupElement(info[5], "Atomic #" ).name + " " + ElementData.lookupElement(info[6], "Atomic #").name + " are created?");
          solution = (kpa*L)/(8.314*(c + 273.15));
          solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[1]));
          solution = solution * ionicCompoundMass(info[5], info[6]);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 19:
          //gas stoich sr  type 3
          info = balancing(m,nm,e);
          System.out.println("You have  " + L + "L of " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " at " + kpa + "kPa and " + c + " degrees celcius reacting with " + ElementData.lookupElement(e, "Atomic #").name +  " How many grams of " + ElementData.lookupElement(info[7], "Atomic #" ).name + " are created?");
          solution = (kpa*L)/(8.314*(c + 273.15));
          solution = solution * (Double.valueOf(info[4]) / Double.valueOf(info[1]));
          solution = solution * (ElementData.lookupElement(info[7], "Atomic #").atomicMass*elementCount(info[7]));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 20:
          //gas stoich sr  type 4
          info = balancing(m,nm,e);
          System.out.println("You have  " + L + "L of " + ElementData.lookupElement(e, "Atomic #").name  + " at " + kpa + "kPa and " + c + " degrees celcius reacting with " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " How many grams of " + ElementData.lookupElement(info[7], "Atomic #" ).name + " are created?");
          solution = (kpa*L)/(8.314*(c + 273.15));
          solution = solution * (Double.valueOf(info[4]) / Double.valueOf(info[1]));
          solution = solution * (ElementData.lookupElement(info[7], "Atomic #").atomicMass*elementCount(info[7]));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 21:
          //gas stoich formation type 1
          info = balancing(e2,e3,true);
          System.out.println("You have  " + L + "L of " + ElementData.lookupElement(e3, "Atomic #").name  + " reacting with " + ElementData.lookupElement(e2, "Atomic #").name + " "  + " How many grams of " + ElementData.lookupElement(e2, "Atomic #").name + " " + ElementData.lookupElement(e3, "Atomic #").name + " are created at " + kpa + " kpa and " + c + " degrees celcius?");
          solution = (kpa*L)/(8.314*(c + 273.15));
          solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[2]));
          solution = solution * (ionicCompoundMass(e2,e3));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 22:
          //gas stoich formation type 2
          info = balancing(e2,e3,true);
          System.out.println("You have  " + L + "L of " + ElementData.lookupElement(e2, "Atomic #").name  + " reacting with " + ElementData.lookupElement(e3, "Atomic #").name + " "  + " How many grams of " + ElementData.lookupElement(e2, "Atomic #").name + " " + ElementData.lookupElement(e3, "Atomic #").name + " are created at " + kpa + " kpa and " + c + " degrees celcius?");
          solution = (kpa*L)/(8.314*(c + 273.15));
          solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[1]));
          solution = solution * (ionicCompoundMass(e2,e3));
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 23:
          //gas stoich decomposition type 1
          info = balancing(e2,e3,true);
          System.out.println("You have  " + L + "L of " + ElementData.lookupElement(e2, "Atomic #").name + " " + ElementData.lookupElement(e3, "Atomic #").name  + " decomposing. How many grams of " + ElementData.lookupElement(e2, "Atomic #").name + " are created at " + kpa + " kpa and " + c + " degrees celcius?");
          solution = (kpa*L)/(8.314*(c + 273.15));
          solution = solution * (Double.valueOf(info[1]) / Double.valueOf(info[3]));
          solution = solution * (ElementData.lookupElement(e2,"Atomic #").atomicMass)*elementCount(e2);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 24:
          //gas stoich decomposition type 1
          info = balancing(e2,e3,true);
          System.out.println("You have  " + L + "L of " + ElementData.lookupElement(e2, "Atomic #").name + " " + ElementData.lookupElement(e3, "Atomic #").name  + " decomposing. How many grams of " + ElementData.lookupElement(e3, "Atomic #").name + " are created at " + kpa + " kpa and " + c + " degrees celcius?");
          solution = (kpa*L)/(8.314*(c + 273.15));
          solution = solution * (Double.valueOf(info[2]) / Double.valueOf(info[3]));
          solution = solution * (ElementData.lookupElement(e3,"Atomic #").atomicMass)*elementCount(e3);
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;


        case 25:
          //SOLUTION stoich dr
          System.out.println("You have  " + L + "L of " + M + " mol/L " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " reacting with " + ElementData.lookupElement(m2, "Atomic #").name + " " + ElementData.lookupElement(nm2, "Atomic #").name + " what is the concentration of " + L2 + "L of " + ElementData.lookupElement(m, "Atomic #" ).name + " " + ElementData.lookupElement(nm2, "Atomic #").name + "?");
          info = balancing(m,nm,m2,nm2);
          solution = (L*M);
          solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[1]));
          solution = solution / L2;
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + " mol/L");
        break;

        case 26:
          //Solution stoich dr type 2
          System.out.println("You have  " + L + "L of " + M + " mol/L " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " reacting with " + ElementData.lookupElement(m2, "Atomic #").name + " " + ElementData.lookupElement(nm2, "Atomic #").name + " what is the concentration of " + L2 + "L of " + ElementData.lookupElement(m2, "Atomic #" ).name + " " + ElementData.lookupElement(nm, "Atomic #").name + "?");
          info = balancing(m,nm,m2,nm2);
          solution = (L*M);
          solution = solution * (Double.valueOf(info[4]) / Double.valueOf(info[1]));
          solution = solution / L2;
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + " mol/L");
        break;

        case 27:
          //Solution stoich sr type 1
          info = balancing(m,nm,e);
          System.out.println("You have  " + L + "L of " + M + " mol/L " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " reacting with " + ElementData.lookupElement(e, "Atomic #").name + " what is the concentration of " + L2 + "L of " + ElementData.lookupElement(info[5], "Atomic #" ).name + " " + ElementData.lookupElement(info[6], "Atomic #").name + "?");
          solution = (L*M);
          solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[2]));
          solution = solution / L2;
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + " mol/L");
          break;

        case 28:
          //Solution stoich sr type 2
          info = balancing(m,nm,e);
          System.out.println("You have  " + L + "L of " + M + " mol/L " + ElementData.lookupElement(e, "Atomic #").name + " reacting with " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " what is the concentration of " + L2 + "L of " + ElementData.lookupElement(info[5], "Atomic #" ).name + " " + ElementData.lookupElement(info[6], "Atomic #").name + "?");
          solution = (L*M);
          solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[1]));
          solution = solution / L2;
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + " mol/L");
        break;

        case 29:
          //Solution stoich sr  type 3
          info = balancing(m,nm,e);
          System.out.println("You have  " + L + "L of " + M + " mol/L " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " reacting with " + ElementData.lookupElement(e, "Atomic #").name + " what is the concentration of " + L2 + "L of " + ElementData.lookupElement(info[7], "Atomic #" ).name + "?");
          solution = (L*M);
          solution = solution * (Double.valueOf(info[4]) / Double.valueOf(info[2]));
          solution = solution / L2;
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + " mol/L");
        break;

        case 30:
          //Solution stoich sr  type 4
          info = balancing(m,nm,e);
          System.out.println("You have  " + L + "L of " + M + " mol/L " + ElementData.lookupElement(e, "Atomic #").name  + " reacting with " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " what is the concentration of " + L2 + "L of " + ElementData.lookupElement(info[7], "Atomic #" ).name + "?");
          solution = (L*M);
          solution = solution * (Double.valueOf(info[4]) / Double.valueOf(info[1]));
          solution = solution / L2;
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + " mol/L");
        break;

        case 31:
          //Solution stoich formation type 1
          info = balancing(e2,e3,true);
          System.out.println("You have  " + L + "L of " + M + " mol/L " + ElementData.lookupElement(e3, "Atomic #").name  + " reacting with " + ElementData.lookupElement(e2, "Atomic #").name + " "  + " what is the concentration of " + L2 + "L of " + ElementData.lookupElement(e2, "Atomic #").name + " " + ElementData.lookupElement(e3, "Atomic #").name + "?");
          solution = (L*M);
          solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[2]));
          solution = solution / L2;
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + " mol/L");
        break;

        case 32:
          //Solution stoich formation type 2
          info = balancing(e2,e3,true);
          System.out.println("You have  " + L + "L of " + M + " mol/L " + ElementData.lookupElement(e2, "Atomic #").name  + " reacting with " + ElementData.lookupElement(e3, "Atomic #").name + " "  + " what is the concentration of " + L2 + "L of " + ElementData.lookupElement(e2, "Atomic #").name + " " + ElementData.lookupElement(e3, "Atomic #").name + "?");
          solution = (L*M);
          solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[1]));
          solution = solution / L2;
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + " mol/L");
        break;

        case 33:
          //Solution stoich decomposition type 1
          info = balancing(e2,e3,true);
          System.out.println("You have  " + L + "L of " + M + " mol/L " + ElementData.lookupElement(e2, "Atomic #").name + " " + ElementData.lookupElement(e3, "Atomic #").name  + " decomposing. What is the concentration of " + L2 + "L of " + ElementData.lookupElement(e2, "Atomic #").name + "?");
          solution = (L*M);
          solution = solution * (Double.valueOf(info[1]) / Double.valueOf(info[3]));
          solution = solution / L2;
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + " mol/L");
        break;

        case 34:
          //Solution stoich decomposition type 1
          info = balancing(e2,e3,true);
          System.out.println("You have  " + L + "L of " + M + " mol/L " + ElementData.lookupElement(e2, "Atomic #").name + " " + ElementData.lookupElement(e3, "Atomic #").name  + " decomposing. What is the concentration of " + L2 + "L of " + ElementData.lookupElement(e3, "Atomic #").name + "?");
          solution = (L*M);
          solution = solution * (Double.valueOf(info[2]) / Double.valueOf(info[3]));
          solution = solution / L2;
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + " mol/L");
        break;

        case 35:
          //Gravimetric stoich dr with limiting reagent TEST FROM HERE
          System.out.println("You have  " + g + "g of " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " reacting with " + g2 + " grams of " + ElementData.lookupElement(m2, "Atomic #").name + " " + ElementData.lookupElement(nm2, "Atomic #").name + " How many grams of " + ElementData.lookupElement(m, "Atomic #" ).name + " " + ElementData.lookupElement(nm2, "Atomic #").name + " are created considering the limiting reagent?");
          info = balancing(m,nm,m2,nm2);
          solution = (g)/(ionicCompoundMass(m, nm));
          if(( solution * (Double.valueOf(info[2]) / Double.valueOf(info[1]))) < (g2/(ionicCompoundMass(m2,nm2))))
          {
            solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[1]));
            solution = solution * ionicCompoundMass(m, nm2);
          }
          else
          {
            solution = (g2)/(ionicCompoundMass(m2, nm2));
            solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[2]));
            solution = solution * ionicCompoundMass(m, nm2);
          }
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
          break;

        case 36:
          //Gravimetric stoich dr with limiting reagent type 2
          System.out.println("You have  " + g + "g of " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " reacting with " + g2 + " grams of " + ElementData.lookupElement(m2, "Atomic #").name + " " + ElementData.lookupElement(nm2, "Atomic #").name + " How many grams of " + ElementData.lookupElement(m2, "Atomic #" ).name + " " + ElementData.lookupElement(nm, "Atomic #").name + " are created considering the limiting reagent?");
          info = balancing(m,nm,m2,nm2);
          solution = (g)/(ionicCompoundMass(m, nm));
          if(( solution * (Double.valueOf(info[2]) / Double.valueOf(info[1]))) < (g2/(ionicCompoundMass(m2,nm2))))
          {
            solution = solution * (Double.valueOf(info[4]) / Double.valueOf(info[1]));
            solution = solution * ionicCompoundMass(m2, nm);
          }
        else
          {
            solution = (g2)/(ionicCompoundMass(m2, nm2));
            solution = solution * (Double.valueOf(info[4]) / Double.valueOf(info[2]));
            solution = solution * ionicCompoundMass(m2, nm);
          }
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
          break;
        
      case 37:
          //Gravimetric stoich sr type 1 with a limiting reagent looking for compound
          info = balancing(m,nm,e);
          System.out.println("You have  " + g + "g of " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " reacting with " + g2 + "g of " + ElementData.lookupElement(e, "Atomic #").name + " How many grams of " + ElementData.lookupElement(info[5], "Atomic #" ).name + " " + ElementData.lookupElement(info[6], "Atomic #").name + " are created considering the limiting reagent?");
          solution = (g)/(ionicCompoundMass(m, nm));
          if ((solution * (Double.valueOf(info[1]) / Double.valueOf(info[2]))) < ((g2)/((ElementData.lookupElement(e,"Atomic #").atomicMass)*elementCount(e))))
          {
            solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[2]));
            solution = solution * ionicCompoundMass(info[5], info[6]);
          }
          else
          {
            solution = ((g2)/((ElementData.lookupElement(m,"Atomic #").atomicMass)*elementCount(e)));
            solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[1]));
            solution = solution * ionicCompoundMass(info[5], info[6]);
          }
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
          break;

        case 38:
          //Gravimetric stoich sr with a limiting reagent type 2 looking for element
          info = balancing(m,nm,e);
          System.out.println("You have  " + g + "g of " + ElementData.lookupElement(e, "Atomic #").name  + " reacting with " + g2 + "g of " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " How many grams of " + ElementData.lookupElement(info[7], "Atomic #" ).name + " are created considering the limiting reagent?");
          solution = (g)/((ElementData.lookupElement(e,"Atomic #").atomicMass)*elementCount(e));
          if((Double.valueOf(info[2]) / Double.valueOf(info[1])) < ((g2)/(ionicCompoundMass(m, nm))))
          {
            solution = solution * (Double.valueOf(info[4]) / Double.valueOf(info[1]));
            solution = solution * (ElementData.lookupElement(info[7], "Atomic #").atomicMass*elementCount(info[7]));
          }
          else
          {
            solution = (g2)/(ionicCompoundMass(m, nm));
            solution = solution * (Double.valueOf(info[4]) / Double.valueOf(info[2]));
            solution = solution * (ElementData.lookupElement(info[7], "Atomic #").atomicMass*elementCount(info[7]));
          }
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(round(solution) + "g");
        break;

        case 39:
          //Gravimetric stoich formation type 1 with limiting reagent
          info = balancing(e2,e3,true);
          System.out.println("You have  " + g + "g of " + ElementData.lookupElement(e3, "Atomic #").name  + " reacting with " + g2 + "g of " + ElementData.lookupElement(e2, "Atomic #").name + " "  + " How many grams of " + ElementData.lookupElement(e2, "Atomic #").name + " " + ElementData.lookupElement(e3, "Atomic #").name + " are created considering the limiting reagent?");
          solution = (g)/((ElementData.lookupElement(e3,"Atomic #").atomicMass)*elementCount(e3));
          if ((solution * (Double.valueOf(info[1]) / Double.valueOf(info[2]))) < ((g2)/((ElementData.lookupElement(e2,"Atomic #").atomicMass)*elementCount(e2))))
          {
            solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[2]));
            solution = solution * (ionicCompoundMass(e2,e3));
          }
          else
          {
            solution = (g2)/((ElementData.lookupElement(e2,"Atomic #").atomicMass)*elementCount(e2));
            solution = solution * (Double.valueOf(info[3]) / Double.valueOf(info[1]));
            solution = solution * (ionicCompoundMass(e2,e3));
          }
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + "g");
        break;

        case 40:
          //titration stoich dr
          System.out.println("Titration of  " + (L*1000) + "mL " + ElementData.lookupElement(m, "Atomic #").name + " " + ElementData.lookupElement(nm, "Atomic #").name + " with " + M + "mol/L  " + ElementData.lookupElement(m2, "Atomic #").name + " " + ElementData.lookupElement(nm2, "Atomic #").name + ". " + (L2*1000) + "mL of titrant is added to meet stoichiometric reaction quantities. what is the concentration of sample?");
          info = balancing(m,nm,m2,nm2);
          solution = (L2*M);
          solution = solution * (Double.valueOf(info[1]) / Double.valueOf(info[2]));
          solution = solution / L;
          System.out.println("Press enter to see solution");
          command = getCommand();
          System.out.println(info[0]);
          System.out.println(round(solution) + " mol/L");
        break;



        //still needs the non-zero-net equations, solution stoichiometry and all forms of equation for, testing for each individual case and hydrocarbon-combustion reactions.
        //conceptual notes for non-zero net (Psuedocode): 1. create and balance an equation (easy, done already) 2. check solubility of each compound (a function already exists for this) 3. seperate aqueos mixtures into their ions (this will be slightly challenging) 4. eliminate any aspects that are equal on either side of the equation (this is the largest problem to treat properly) 5. write a final statement of the simplified equation (once all aspects are present this should be somewhat easy, will need a new function to print ionic charges).
        //solution stoich is not learned yet
        //for hydrocarbon combustion use only one input and multiply the elements by that keeping a realistic ratio
        //for formation or decomposition use two inputs and just do a formation reaction as you can simply reverse it through the question
       
    }
    System.out.println("");
    checkCorrect();
    System.out.println("press 1 for another stoichiometry problem.");
    command = getCommand();
    if (command.equals("1"))
    {
      stoich();
    }else{
      
    }
    
      
  }
  //REPEAT USE FUNCTIONS
  //shortens number without rounding
  private static double truncate(double x )
  {
    x = x*1000;
    x = Math.floor(x);
    x= x/1000;
    return x;
  }
  //rounds a given number
  private static double round(double x)
  {
    return (Math.round(x * 100.0) / 100.0);
  }
  //generates a printed ionic compound given two elements
  private static String ionicCompound(String metalNumber, String nonMetalNumber)
  {
    int m = 1;
    int nm = 1;
    int mCharge = ElementData.lookupElement(metalNumber, "Atomic #").atomicCharge;
    int nmCharge = ElementData.lookupElement(nonMetalNumber, "Atomic #").atomicCharge;
    while(Math.abs(mCharge) != Math.abs(nmCharge))
      {
        if (Math.abs(mCharge) > Math.abs(nmCharge))
        {
          nm ++;
          nmCharge = nmCharge + ElementData.lookupElement(nonMetalNumber, "Atomic #").atomicCharge;
        }
        else if (Math.abs(mCharge) < Math.abs(nmCharge))
        {
          m ++;
          mCharge = mCharge + ElementData.lookupElement(metalNumber, "Atomic #").atomicCharge;
        }
      }
    nm = nm + 2080;
    m = m + 2080;
    String ms = "";
    String nms = "";
    if (nm > 2081)
    {
      nms = Integer.toString(nm);
      nms = String.valueOf(Character.toChars(Integer.parseInt(nms, 16)));
    }
    if (m > 2081)
    {
      ms = Integer.toString(m);
      ms = String.valueOf(Character.toChars(Integer.parseInt(ms, 16)));
    }
    if (ElementData.lookupElement(metalNumber, "Atomic #").state().equals("Polyatomic") && nm > 2081 && m >2081 && ElementData.lookupElement(nonMetalNumber, "Atomic #").state().equals("Polyatomic"))
    {
      return ("(" + ElementData.lookupElement(metalNumber, "Atomic #").symbol + ")" + ms + "(" + ElementData.lookupElement(nonMetalNumber, "Atomic #").symbol + ")" + nms);
    }
    else if (ElementData.lookupElement(metalNumber, "Atomic #").state().equals("Polyatomic") && m > 2081)
    {
      return ("(" + ElementData.lookupElement(metalNumber, "Atomic #").symbol + ")" + ms + ElementData.lookupElement(nonMetalNumber, "Atomic #").symbol + nms);
    }
    else if (nm >2081 && ElementData.lookupElement(nonMetalNumber, "Atomic #").state().equals("Polyatomic"))
    {
      return (ElementData.lookupElement(metalNumber, "Atomic #").symbol  + ms + "(" + ElementData.lookupElement(nonMetalNumber, "Atomic #").symbol + ")" + nms);
    }
    else
    {
      
      return (ElementData.lookupElement(metalNumber, "Atomic #").symbol  + ms + ElementData.lookupElement(nonMetalNumber, "Atomic #").symbol + nms);
    }
  
  }
  //returns the amount of an element in a compound at the provided digit
  private static int ionicCompoundCount(String metalNumber, String nonMetalNumber, int digit)
  {
    int m = 1;
    int nm = 1;
    int mCharge = ElementData.lookupElement(metalNumber, "Atomic #").atomicCharge;
    int nmCharge = ElementData.lookupElement(nonMetalNumber, "Atomic #").atomicCharge;
    while(Math.abs(mCharge) != Math.abs(nmCharge))
      {
        if (Math.abs(mCharge) > Math.abs(nmCharge))
        {
          nm ++;
          nmCharge = nmCharge + ElementData.lookupElement(nonMetalNumber, "Atomic #").atomicCharge;
        }
        else if (Math.abs(mCharge) < Math.abs(nmCharge))
        {
          m ++;
          mCharge = mCharge + ElementData.lookupElement(metalNumber, "Atomic #").atomicCharge;
        }
      }
    String nms = String.valueOf(nm);
    String ms = String.valueOf(m);
    //returns first digit metal count, second digit non-metal count
    return Character.getNumericValue((ms + nms).charAt(digit));
    
  }
  private static boolean soluble(String metalNumber, String nonMetalNumber)
  {
    //solubility chart, y axis is used in switch statements, x axis is used through if else statements to create a clear seperation when reading
    switch(nonMetalNumber)
      {
        case "120":
        case "127":
        case "126":
        case "119":
          return true;
        

        case "9":
          if (metalNumber.equals("3") || metalNumber.equals("12") || metalNumber.equals("20") || metalNumber.equals("38") || metalNumber.equals("56") || metalNumber.equals("26") || metalNumber.equals("80") || metalNumber.equals("82") )
          {
            return false;
          }
          else
          {
            return true;
          }
        case "17":
        case "35":
        case "53":
          if (metalNumber.equals("29") || metalNumber.equals("47") || metalNumber.equals("80") || metalNumber.equals("82") || metalNumber.equals("81") )
          {
            return false;
          }
          else
          {
            return true;
          }

          
        case "146":
          if (metalNumber.equals("20") || metalNumber.equals("38") || metalNumber.equals("56") || metalNumber.equals("47") || metalNumber.equals("80") || metalNumber.equals("82") || metalNumber.equals("88") )
          {
            return false;
          }
          else
          {
            return true;
          }

        case "124":
        case "142":
        case "148":
          if (metalNumber.equals("1") || metalNumber.equals("3") ||  metalNumber.equals("11") || metalNumber.equals("19") || metalNumber.equals("37") || metalNumber.equals("55") || metalNumber.equals("87") || metalNumber.equals("120") )
          {
            return true;
          }
          else
          {
            return false;
          }


        case "134":
        case "137":
          if (metalNumber.equals("1") || metalNumber.equals("3") ||  metalNumber.equals("11") || metalNumber.equals("19") || metalNumber.equals("37") || metalNumber.equals("55") || metalNumber.equals("87") || metalNumber.equals("120") )
          //this is missing 3 specific compounds add later
          {
            return true;
          }
          else
          {
            return false;
          }

        case "133":
          if (metalNumber.equals("1") || metalNumber.equals("3") ||  metalNumber.equals("11") || metalNumber.equals("19") || metalNumber.equals("37") || metalNumber.equals("55") || metalNumber.equals("87") || metalNumber.equals("120") )
          {
            return true;
          }
          else
          {
            return false;
          }
      }
      switch(metalNumber)
        {
          case "1":
          case "3":
          case "11":
          case "19":
          case "37":
          case "55":
          case "87":
          case "120":
            return true;
        }
    return false;
  }
  //returns a random periodic table number for a metal
  private static String randMetal()
  {
    int Metal = 0;
    String MetalS = "";
    while (!(ElementData.lookupElement(MetalS, "Atomic #").metallic().equalsIgnoreCase("Metallic")))
    {
      Metal = random(1,152);
      MetalS = String.valueOf(Metal);
      if (ElementData.lookupElement(MetalS, "Atomic #").metallic().equalsIgnoreCase("Metallic"))
      {
        return (MetalS);
      }
    }
    return ("oops");
  }
  //returns a metal, nonmetal, and an element that does not conflict with polyatomics and an element that pairs with the other
  private static String[] randChemKit()
  {
    String[] MetalS = {"","","","","","",""};
    MetalS[0] = randMetal();
    MetalS[1] = randNonMetal();
    while (MetalS[2] == "" || ElementData.lookupElement(MetalS[2], "Atomic #").state().equalsIgnoreCase("Polyatomic") )
      {
        if (ElementData.lookupElement(MetalS[0], "Atomic #").state().equalsIgnoreCase("Polyatomic"))
        {
          MetalS[2] = randNonMetal();
        }
        else if (ElementData.lookupElement(MetalS[1], "Atomic #").state().equalsIgnoreCase("Polyatomic"))
        {
          MetalS[2] = randMetal();
        }
        else
        {
          MetalS[2] = randMetal();
        }
      }
    while (MetalS[3] == "" || ElementData.lookupElement(MetalS[3], "Atomic #").state().equalsIgnoreCase("Polyatomic") )
      {
        MetalS[3] = randMetal();
      }
    while (MetalS[4] == "" || ElementData.lookupElement(MetalS[4], "Atomic #").state().equalsIgnoreCase("Polyatomic") )
      {
        MetalS[4] = randNonMetal();
      }
    
    return MetalS;
  }

  //returns a random periodic table number for a non metal
  private static String randNonMetal()
 {
    int NonMetal = 0;
    String NonMetalS = "";
    while (!(ElementData.lookupElement(NonMetalS, "Atomic #").metallic().equalsIgnoreCase("NonMetallic")))
    {
      NonMetal = random(1,152);
      NonMetalS = String.valueOf(NonMetal);
      if (ElementData.lookupElement(NonMetalS, "Atomic #").metallic().equalsIgnoreCase("NonMetallic"))
      {
        return (NonMetalS);
      }
    }
    return ("oops");
  }
  //balances double replacement questions 
  private static String[] balancing(String m, String nm, String m2, String nm2 )
  {
    int mc = ionicCompoundCount(m,nm,0);
    int nmc = ionicCompoundCount(m,nm,1);
    int mc2 = ionicCompoundCount(m2,nm2,0);
    int nmc2 = ionicCompoundCount(m2,nm2,1);
    int mc3 = ionicCompoundCount(m,nm2,0);
    int nmc3 = ionicCompoundCount(m,nm2,1);
    int mc4 = ionicCompoundCount(m2,nm,0);
    int nmc4 = ionicCompoundCount(m2,nm,1);
    int c = 1;
    int c2 = 1;
    int c3 = 1;
    int c4 = 1;

    String[] info = new String[5];
    while (1 != 2)
      {
        if((mc*c) == (mc3*c3) && (nmc*c) == (nmc4*c4) && (mc2*c2) == (mc4*c4) && (nmc2*c2) == (nmc3*c3))
        {
          info[0] = Integer.toString(c) + ionicCompound(m,nm) + solublePrint(m, nm) + " + " + Integer.toString(c2) + ionicCompound(m2, nm2) + solublePrint(m2, nm2) + " \u2192 " + Integer.toString(c3) + ionicCompound(m, nm2) + solublePrint(m, nm2) + " + " + Integer.toString(c4) + ionicCompound(m2, nm) + solublePrint(m2, nm);
          info[1] = Integer.toString(c);
          info[2] = Integer.toString(c2);
          info[3] = Integer.toString(c3);
          info[4] = Integer.toString(c4);
          return (info);
        }else{
          //nonmetal 1 and 4
          if ((nmc*c) < (nmc4*c4))
          {
            c = (calculateLCM((c*nmc),(c4*nmc4))) / nmc;
          }
          else if ((nmc*c) > (nmc4*c4))
          {
            c4 = (calculateLCM((c*nmc),(c4*nmc4))) / nmc4;
          }
          //metal 1 and 3
          if ((mc*c) < (mc3*c3))
          {
            c = (calculateLCM((c*mc),(c3*mc3))) / mc;
          }
          else if ((mc*c) > (mc3*c3))
          {
            c3 = (calculateLCM((c*mc),(c3*mc3))) / mc3;
          }
          //nonmetal 2 and 3
          if ((nmc2*c2) < (nmc3*c3))
          {
            c2 = (calculateLCM((c2*nmc2),(c3*nmc3))) / nmc2;
          }
          else if ((nmc2*c2) > (nmc3*c3))
          {
            c3 = (calculateLCM((c2*nmc2),(c3*nmc3))) / nmc3;
          }
          //metal 2 and 4
          if ((mc2*c2) < (mc4*c4))
          {
            c2 = (calculateLCM((c2*mc2),(c4*mc4))) / mc2;
          }
          else if ((mc2*c2) > (mc4*c4))
          {
            c4 = (calculateLCM((c2*mc2),(c4*mc4))) / mc4;
          }
        } // end of else
      } //end of while
  } 
  //balances single replacement equations, with the third input being the element that is alone
  private static String[] balancing(String m, String nm, String element)
  {
    int mc3 = 0;
    int nmc3 = 0;
    int elementPosition = 0;
    int mc4 = 0;
    int nmc4 = 0;
    int singleElement = elementCount(element);
    int mc2 = ionicCompoundCount(m,nm,0);
    int nmc2 = ionicCompoundCount(m,nm,1);
    if (ElementData.lookupElement(element, "Atomic #").metallic().equalsIgnoreCase("Metallic"))
    {
      mc3 = ionicCompoundCount(element,nm,0);
      nmc3 = ionicCompoundCount(element,nm,1);
      elementPosition = 0;
      mc4 = elementCount(m);
    }
    else
    {
      mc3 = ionicCompoundCount(m,element,0);
      nmc3 = ionicCompoundCount(m,element,1);
      elementPosition = 1;
      nmc4 = elementCount(nm);
    }
    int c = 1;
    int c2 = 1;
    int c3 = 1;
    int c4 = 1;
    String[] info = {"","","","","","","",""};
    while (1 != 2)
      {
        if(((c*singleElement) == (mc3*c3) && (mc2*c2) == (c4*mc4) && (nmc2*c2) == (nmc3*c3)) && ElementData.lookupElement(element, "Atomic #").metallic().equalsIgnoreCase("Metallic"))
        {
          info[0] = Integer.toString(c) + ElementData.lookupElement(element, "Atomic #").symbol + elementCountPrint(element) + elementStatePrint(element) + " + " + Integer.toString(c2) + ionicCompound(m, nm) + solublePrint(m, nm) + " \u2192 " + Integer.toString(c3) + ionicCompound(element, nm) + solublePrint(element, nm) + " + " + Integer.toString(c4) + ElementData.lookupElement(m, "Atomic #").symbol + elementCountPrint(m) + elementStatePrint(m);
          info[1] = Integer.toString(c);
          info[2] = Integer.toString(c2);
          info[3] = Integer.toString(c3);
          info[4] = Integer.toString(c4);
          info[5] = element;
          info[6] = nm;
          info[7] = m;
          return (info);
        }
        if (((c*singleElement) == (nmc3*c3)) && ((mc2*c2) == (mc3*c3)) && ((nmc2*c2) == (c4*nmc4)) && !(ElementData.lookupElement(element, "Atomic #").metallic().equalsIgnoreCase("Metallic")))
        {
          info[0] = Integer.toString(c) + ElementData.lookupElement(element, "Atomic #").symbol + elementCountPrint(element) + elementStatePrint(element) + " + " + Integer.toString(c2) + ionicCompound(m, nm) + solublePrint(m, nm) + " \u2192 " + Integer.toString(c3) + ionicCompound(m, element) + solublePrint(m, element) + " + " + Integer.toString(c4) + ElementData.lookupElement(nm, "Atomic #").symbol + elementCountPrint(nm) + elementStatePrint(nm);
          info[1] = Integer.toString(c);
          info[2] = Integer.toString(c2);
          info[3] = Integer.toString(c3);
          info[4] = Integer.toString(c4);
          info[5] = m;
          info[6] = element;
          info[7] = nm;
          return (info);
        }else{
          if (elementPosition == 0)
          {
            //metal single replacement 
            //metal in and out of compound
            if ((singleElement*c) < (mc3*c3))
            {
              c = (calculateLCM((c*singleElement),(c3*mc3))) / singleElement;
            }
            else if ((singleElement*c) > (mc3*c3))
            {
              c3 = (calculateLCM((c*singleElement),(c3*mc3))) / mc3;
            }
            //metal in first compound and out second
            if ((mc2*c2) < (mc4*c4))
            {
              c2 = (calculateLCM((c2*mc2),(c4*mc4))) / mc2;
            }
            else if ((mc2*c2) > (mc4*c4))
            {
              c4 = (calculateLCM((c2*mc2),(c4*mc4))) / mc4;
            }
            //nonmetal in first and second
            if ((nmc2*c2) < (nmc3*c3))
            {
              c2 = (calculateLCM((c2*nmc2),(c3*nmc3))) / nmc2;
            }
            else if ((nmc2*c2) > (nmc3*c3))
            {
              c3 = (calculateLCM((c2*nmc2),(c3*nmc3))) / nmc3;
            }
            
          }else{
            //nonmetal single replacement (Not working)
            //non in and out of compound
            if ((singleElement*c) < (nmc3*c3))
            {
              c = (calculateLCM((c*singleElement),(c3*nmc3))) / singleElement;
            }
            else if ((singleElement*c) > (nmc3*c3))
            {
              c3 = (calculateLCM((c*singleElement),(c3*nmc3))) / nmc3;
            }
            //metal in first compound and in second
            if ((mc2*c2) < (mc3*c3))
            {
              c2 = (calculateLCM((c2*mc2),(c3*mc3))) / mc2;
            }
            else if ((mc2*c2) > (mc3*c3))
            {
              c3 = (calculateLCM((c2*mc2),(c3*mc3))) / mc3;
            }
            //nonmetal in first out second
            if ((nmc2*c2) < (nmc4*c4))
            {
              c2 = (calculateLCM((c2*nmc2),(c4*nmc4))) / nmc2;
            }
            else if ((nmc2*c2) > (nmc4*c4))
            {
              c4 = (calculateLCM((c2*nmc2),(c4*nmc4))) / nmc4;
            }
          }//end of metal check
        } // end of else
      } //end of while
  } 
  //creates a balanced formation or decomposition reaction based on the boolean at the end
  private static String[] balancing(String metal, String nonMetal, boolean isFormation)
  {
    int elementPosition = 0;
    int elementc1 = elementCount(metal);
    int elementc2 = elementCount(nonMetal);
    int mc3 = ionicCompoundCount(metal,nonMetal,0);
    int nmc3 = ionicCompoundCount(metal,nonMetal,1);
    int c = 1;
    int c2 = 1;
    int c3 = 1;
    String[] info = new String[4];
    while (1 != 2)
      {
        
          if(((c*elementc1) == (mc3*c3) && (c2*elementc2) == (c3*nmc3)) && isFormation == true)
          {
            info[0] = Integer.toString(c) + ElementData.lookupElement(metal, "Atomic #").symbol + elementCountPrint(metal) + elementStatePrint(metal) + " + " + Integer.toString(c2) + ElementData.lookupElement(nonMetal, "Atomic #").symbol + elementStatePrint(nonMetal) + " \u2192 " + Integer.toString(c3) + ionicCompound(metal, nonMetal) + solublePrint(metal, nonMetal);
            info[1] = Integer.toString(c);
            info[2] = Integer.toString(c2);
            info[3] = Integer.toString(c3);
            return (info);
          }
          else if(((c*elementc1) == (mc3*c3) && (c2*elementc2) == (c3*nmc3)) && isFormation == false)
          {
            info[0] = Integer.toString(c3) + ionicCompound(metal, nonMetal) + solublePrint(metal, nonMetal) + " \u2192 " + Integer.toString(c) + ElementData.lookupElement(metal, "Atomic #").symbol + elementCountPrint(metal) + elementStatePrint(metal) + " + " + Integer.toString(c2) + ElementData.lookupElement(nonMetal, "Atomic #").symbol + elementStatePrint(nonMetal);
            info[1] = Integer.toString(c);
            info[2] = Integer.toString(c2);
            info[3] = Integer.toString(c3);
            return (info);
          }else{
              //metal single replacement 
              //metal in and out of compound
              if ((elementc1*c) < (mc3*c3))
              {
                c = (calculateLCM((c*elementc1),(c3*mc3))) / elementc1;
              }
              else if ((elementc1*c) > (mc3*c3))
              {
                c3 = (calculateLCM((c*elementc1),(c3*mc3))) / mc3;
              }
              //nonmetal 
              if ((elementc2*c2) < (nmc3*c3))
              {
                c2 = (calculateLCM((c2*elementc2),(c3*nmc3))) / elementc2;
              }
              else if ((elementc2*c2) > (nmc3*c3))
              {
                c3 = (calculateLCM((c2*elementc2),(c3*nmc3))) / nmc3;
              }
        } // end of else
      } //end of while
  } 
  //gives an int for the amount of an element in a single molecule
  private static int elementCount(String element)
  {
    switch(element)
      {
        case "1":
        case "7":
        case "8":
        case "9":
        case "17":
        case "35":
        case "53":
          return 2;

        case "16":
          return 8;

        case "15":
          return 4;
      }
      return 1;
  }
  //prints the amount of a single element in unicode subscript
  private static String elementCountPrint(String element)
  {
    switch(element)
      {
        case "1":
        case "7":
        case "8":
        case "9":
        case "17":
        case "35":
        case "53":
          return ("\u2082");

        case "16":
          return ("\u2088");

        case "15":
          return ("\u2084");
      }
      return "";
  }
  //prints state of given element
  private static String elementStatePrint(String element)
  {
    if(ElementData.lookupElement(element, "Atomic #").state().equalsIgnoreCase("SOLID"))
    {
      return ("\u208D\u0073\u208E");
    }
    else if (ElementData.lookupElement(element, "Atomic #").state().equalsIgnoreCase("LIQUID"))
    {
      return ("\u208D\u029F\u208E");
    }
    else if (ElementData.lookupElement(element, "Atomic #").state().equalsIgnoreCase("GAS"))
    {
      return ("\u208D\u0067\u208E");
    }
    else
    {
      return ("");
    }
  }
  //prints solubility of given compound
  private static String solublePrint(String m, String nm)
  {
    if (soluble(m,nm) == true)
    {
      return ("\u208D\u2090q\u208E");
    }
    else
    {
      return ("\u208D\u0073\u208E");
    }
  }
  //provides a random integer between two numbers
  private static int random(int min, int max)
  {
    Random rand = new Random();
    return (rand.nextInt((max - min) + 1) + min);
  }
  //provides a random double between two numbers
  private static double randomD(double min, double max)
  {
    Random rand = new Random();
    return (rand.nextDouble((max - min) + 1) + min);
  }
  //finds the lowest common multiple of two numbers
  private static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }
  //finds the greatest common denomenator between two numbers
  private static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return calculateGCD(b, a % b);
  }
  //gives the mass of an ionic compound as a double
  private static double ionicCompoundMass(String a, String b)
  {
    //System.out.println(ionicCompoundCount(a,b,0));
    //System.out.println(ElementData.lookupElement(a, "Atomic #").atomicMass);
    //System.out.println(ionicCompoundCount(a,b,1));
    //System.out.println(ElementData.lookupElement(b, "Atomic #").atomicMass);
    return (ionicCompoundCount(a,b,0)*(ElementData.lookupElement(a, "Atomic #").atomicMass)) + (ionicCompoundCount(a,b,1)*(ElementData.lookupElement(b, "Atomic #").atomicMass));
  }
  //gets a command
  private static String getCommand()
  {
  String command = scan.nextLine();
  return command;
  }
  private static double[] buildArray(double a, double b, double c, double d, double e, double f, double g, double h)
  {
    double[] ary = {a,b,c,d,e,f,g,h};
    return ary;
  }
  private static double[] buildArray(double a, double b, double c, double d)
  {
    double[] ary = {a,b,c,d};
    return ary;
  }
  //finds minimum in an array
  private static int findMin(double[] ary)
  {
    int minDex = 0;
    for (int i = 1; i < ary.length; i++)
      {
        if(ary[i] < ary[minDex])
        {
          minDex = i;
        }
      }
    return minDex;
  }
  //adds correct questions to a total 
  private static void correct()
  {
    userDataSet[category][0] = (userDataSet[category][0]) + 1;
  }
  //adds incorrect questions to a total 
  private static void incorrect()
  {
    userDataSet[category][1] = (userDataSet[category][1]) + 1;
  }
  private static void checkCorrect()
  {
    System.out.println("Input 2 for incorrect, 1 for correct, empty to skip");
    String command = getCommand();
    if (command.equals("2"))
    {
      incorrect();
    }
    if (command.equals("1"))
    {
      correct();
    }
    else
    {
      
    }
  }
  //saves data gained
  private static void save()
  {
    //reads the data stored
    try
    {
      reader = new FileReader("UserData.txt");
      Scanner sc = new Scanner(reader);
      for (int i = 0; i < prevUserDataSet.length; i++)
       {
          prevUserDataSet[i][0] = sc.nextInt();
       }
      
      for (int i = 0; i < prevUserDataSet.length; i++)
       {
          prevUserDataSet[i][1] = sc.nextInt();
       }
      sc.close();
      reader.close();
    }catch(FileNotFoundException ex){
      System.out.println("file not found");
    }catch( IOException ex2 ){
      System.out.println("file not loaded");
    }
    //updates the data with the new totals (wip)
    try
    {
      String line1 = "";
      String line2 = "";
      for (int i = 0; i < prevUserDataSet.length; i ++)
      {
          line1 = line1 + (prevUserDataSet[i][0] + userDataSet[i][0]) + " "; 
        
      }
      for (int i = 0; i < prevUserDataSet.length; i ++)
      {
          line2 = line2 + (prevUserDataSet[i][1] + userDataSet[i][1]) + " ";
      }
      //THE LENGTH HAS TO BE EXACT, THEREFOR LEN MUST BE VARIABLE FOR THE FUNCTION TO WORK FULLY
      writer = new FileWriter("UserData.txt");
      writer.write(line1,0,(line1.length()));
      writer.write("\n",0,1);
      writer.write(line2,0,(line2.length()));
      writer.close();
      for (int i = 0; i < userDataSet.length; i++) {
          for (int j = 0; j < userDataSet[i].length; j++) {
              userDataSet[i][j] = 0;
          }
      }
    }catch( IOException ex2 ){
      System.out.println("file not loaded");
    }
  }
  
}
