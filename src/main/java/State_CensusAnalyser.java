import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class State_CensusAnalyser {
    public void analyseCensusData() throws FileNotFoundException {
        String path = "C:\\Users\\sunil\\IdeaProjects\\IndianStates_CensusAnalyser\\src\\main\\resources\\IndianstateCensusData.CSV";
        String line = "";
        String splits = ",";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(splits);
                System.out.println("State: " + data[0] + ", Population: " + data[1] + ", Area: " + data[2] + ", Density: " + data[3]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    Method to analyse data from the indian states and its code comma separated file
     */
    public void analyseIndianStateCode() throws FileNotFoundException {
        String path = "C:\\Users\\sunil\\IdeaProjects\\IndianStates_CensusAnalyser\\src\\main\\resources\\IndianStateCodes.CSV";
        String line = "";
        String splits = ",";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(splits);
                System.out.println("Serial Number: " + data[0] + ", State Name: " + data[1] + ", TIN: " + data[2] + ",State Code: " + data[3]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(" Welcome to Indian State Census Analyser");

    }
}
