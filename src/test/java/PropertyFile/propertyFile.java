package PropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class propertyFile {

    public Properties property;
    public FileInputStream fileInputStream;

    public propertyFile(String file){
        loadFile(file);
    }

    public void loadFile(String name){
        property = new Properties();
        try {
            fileInputStream = new FileInputStream("src/main/resources/inputData/"+name+"Data.properties");
            property.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public HashMap<String, String> getAllValues(){
        HashMap<String, String> keyValue = new HashMap<>();
        for (Object key: property.keySet()) {
            keyValue.put(key.toString(), property.getProperty(key.toString()));
        }
        return keyValue;
    }

}
