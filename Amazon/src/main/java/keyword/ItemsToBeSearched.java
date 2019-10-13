package keyword;

import common.CommonAPI;
import utility.DataReader;

import java.io.IOException;

public class ItemsToBeSearched extends CommonAPI
{
    DataReader dr = new DataReader();
    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("/Users/fortunecookie/IdeaProjects/WebAutomationFramework_Team2/Amazon/Data/AmazonDataReadFromExcel.xls");
        String [] data = dr.fileReader2(path,0);
        return data;
    }

    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException{
        String path = System.getProperty("user.dir")+"C:\\Users\\tsult\\IdeaProjects\\WebAutomationFramework_Team2\\Geico\\Data\\FileForKeyword";
        String [] data = dr.fileReader2(path,0);
        return data;
    }
}
