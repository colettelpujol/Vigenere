import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class VigenereDecrypt {

  public static void main(String[] args) {
    Scanner fscan = null; //reads in the file containing the ciphertext
    try{
      fscan = new Scanner(new File("vigtest.txt"));
    } catch (FileNotFoundException e){
      System.out.println("File not found");
    }

    String Cyphertext = fscan.nextLine(); //converts the ciphertext from the file to a String
    char[] Ctxt = Cyphertext.toCharArray(); //converts the String to a char array


    int count = 0;
    int keylength=0;
    for(int i = 1; i<Ctxt.length; i++){ //uses the shift method and the count to do find key length
      int temp = count(Ctxt, shift(Ctxt,i));
      if(temp>count){
        count = temp;
        keylength=i;
        System.out.println(count + " " + keylength);
      }

    }


    System.out.println("enter key length");
    Scanner kbd = new Scanner(System.in);
    int size = kbd.nextInt();
    int[] key = new int[size];
    int[] freq = new int[26];
    initialize(freq);
    int ii = 0;
    while(ii<size){
      for(int ij = ii; ij<Ctxt.length; ij+=5){ //prints out the frequency count to find the first element. Repeated 4 more times
        if(Ctxt[ij] == 'a'){
          freq[0]++;
        }else if(Ctxt[ij] == 'b'){
          freq[1]++;
        }else if(Ctxt[ij] == 'c'){
          freq[2]++;
        }else if(Ctxt[ij] == 'd'){
          freq[3]++;
        }else if(Ctxt[ij] == 'e'){
          freq[4]++;
        }else if(Ctxt[ij] == 'f'){
          freq[5]++;
        }else if(Ctxt[ij] == 'g'){
          freq[6]++;
        }else if(Ctxt[ij] == 'h'){
          freq[7]++;
        }else if(Ctxt[ij] == 'i'){
          freq[8]++;
        }else if(Ctxt[ij] == 'j'){
          freq[9]++;
        }else if(Ctxt[ij] == 'k'){
          freq[10]++;
        }else if(Ctxt[ij] == 'l'){
          freq[11]++;
        }else if(Ctxt[ij] == 'm'){
          freq[12]++;
        }else if(Ctxt[ij] == 'n'){
          freq[13]++;
        }else if(Ctxt[ij] == 'o'){
          freq[14]++;
        }else if(Ctxt[ij] == 'p'){
          freq[15]++;
        }else if(Ctxt[ij] == 'q'){
          freq[16]++;
        }else if(Ctxt[ij] == 'r'){
          freq[17]++;
        }else if(Ctxt[ij] == 's'){
          freq[18]++;
        }else if(Ctxt[ij] == 't'){
          freq[19]++;
        }else if(Ctxt[ij] == 'u'){
          freq[20]++;
        }else if(Ctxt[ij] == 'v'){
          freq[21]++;
        }else if(Ctxt[ij] == 'w'){
          freq[22]++;
        }else if(Ctxt[ij] == 'x'){
          freq[23]++;
        }else if(Ctxt[ij] == 'y'){
          freq[24]++;
        }else {
          freq[25]++;
        }

      }
      System.out.println("a " + freq[0] + " b " + freq[1] + " c " + freq[2] + " d " + freq[3] +
          " e " + freq[4] + " f " + freq[5] + " g " + freq[6] + " h " + freq[7] + " i " + freq[8] 
              + " j " + freq[9] + " k " + freq[10] + " l " + freq[11] + " m " + freq[12] + " n " + freq[13]
                  + " o " + freq[14] + " p " + freq[15] + " q " + freq[16] + " r " + freq[17] + " s " +
                  freq[18] + " t " + freq[19] + " u " + freq[20] + " v " + freq[21] + " w " + freq[22] + 
                  " x " + freq[23] + " y " + freq[24] + " z " + freq[25]);
      System.out.println("enter the next element of the key as an integer");
      key[ii] = kbd.nextInt();
      initialize(freq);
      ii++;
      //f has highest count
      //f = e so first element of key is 1 which is b


    }  

    System.out.println("the key is: ");
    for(int ik = 0; ik <key.length; ik++){
      System.out.print(key[ik]);

    }

  }
  /**
   * Shifts the character array by a certain number of spaces
   * @param Ctxt the character array to be shifted
   * @param shft the number of spaces to shift the array
   * @return the shifted array
   */
  public static char[] shift (char[] Ctxt, int shft){
    char[] shifted = new char[(Ctxt.length)+shft];
    for(int i=0; i<shft; i++){
      shifted[i] = ' ';
    }
    for(int j=shft; j<shifted.length; j++){
      shifted[j] = Ctxt[j-shft];
    }
    return shifted;
  }
  /**
   * Counts the number of times that the original character array lines up with the shifted character array.
   * @param orig the original character array
   * @param shift the shifted character array
   * @return the number of times that the 2 arrays line up
   */
  public static int count(char[] orig, char[] shift){
    int same=0;
    for(int i=0; i<orig.length; i++){
      if(orig[i] == shift[i]){
        same++;
      }
    }
    return same;
  }
  /**
   * initializes an array by populating it with zeros
   * @param freq the integer array to be initialized
   */
  public static void initialize(int[] freq){
    for(int i =0; i<freq.length; i++){
      freq[i] = 0;
    }
  }


}
