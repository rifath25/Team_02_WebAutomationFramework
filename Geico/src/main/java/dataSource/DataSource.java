package dataSource;

import databases.ConnectToSqlDB;
import utility.DataReader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static DataReader excelReader = new DataReader();

    // Insert Data from into Database
    public static List<String> insertDataIntoDB(){
        List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list,"ItemList","items");
        return list;
    }

    //  From Class
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Home insurance");
        itemsList.add("life insurance");
        itemsList.add("car insurance");
        itemsList.add("auto insurance");
        itemsList.add("motorcycle insurance");
        itemsList.add("individual insurance");
        return itemsList;
    }

    //Database
    public static List<String> getItemsListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("ItemList", "items");
        return list;
    }

    //Excel file
    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException{

        String path = "../Geico/Data/GeicoDataReadFromExcel.xls";
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
        String path = "..\\Geico\\Data\\file2Key.xls";
        String [] data = DataReader.fileReader2(path,0);
        return data;
    }
    }


