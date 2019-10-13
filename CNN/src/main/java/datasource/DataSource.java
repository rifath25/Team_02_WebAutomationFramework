package datasource;

import databases.ConnectToSqlDB;
import utility.DataReader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static DataReader excelReader = new DataReader();


    public static List<String> getSearchValueList() {
        List<String> searchValueList = new ArrayList<String>();
        searchValueList.add("Donald Trump");
        searchValueList.add("Style");
        searchValueList.add("Entertainment");
        searchValueList.add("Tv Shows");
        searchValueList.add("Tech");

        return searchValueList;
    }

    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Weather");
        itemsList.add("Tech");
        itemsList.add("Sports");
        itemsList.add("US ");
        itemsList.add("Entertainment");
        itemsList.add("Health");
        itemsList.add("Businness");
        itemsList.add("Style");

        return itemsList;
    }

    public static List<String> insertDataIntoDB() {
        List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list, "searchList", "topics");
        return list;
    }

    public static List<String> getItemsListFromDB() throws Exception {
        List<String> list = getSearchValueList();
        list = connectToSqlDB.readDataBase("searchList", "topics");
        return list;
    }
    //Excel file
    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException{

        String path = "../CNN/Data/CNNExcelFile.xlsx";
        String[] myStringArray = DataReader.fileReader2(path, 0);
        for(int i=1;i<myStringArray.length; i++)
            System.out.print(myStringArray[i] + " ");
        ArrayList<String> list = new ArrayList<String>();

        // Using add() method to add elements in array_list
        //System.out.println();
        for (int i = 0; i < myStringArray.length; i++) {
            list.add(myStringArray[i]);
            //System.out.print(list.get(i+1) + " ");
        }
        return list;
    }
    public static String[] getDataFromExcelFileForFeaturesChoice() throws IOException{
        String path = "../CNN/Data/CNNExcelFile.xlsx";
        String [] data = DataReader.fileReader2(path,1);
        return data;
    }
    public static void main(String[] args) throws Exception {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("searchList", "topics");
        for (String st : list) {
            System.out.println(st);
        }
    }
}