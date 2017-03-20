package tests;

import com.company.DetailedData;
import com.company.JsonDataFilter;
import com.company.JsonLoaderClass;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;
import java.util.Map;
import static org.junit.Assert.assertEquals;

/**
 * Created by nermin on 19/03/2017.
 */
public class JsonDataFilterTest {
    JsonDataFilter jsonDataFilter = new JsonDataFilter();
    Map<String, DetailedData> detailsFromJson = new Gson().fromJson(new JsonLoaderClass().LoadJsonFromLocalFile("data/snowdata.json"), new TypeToken<Map<String, DetailedData>>() {}.getType());

    @Test
    public void testOnInvalidID() {
        String a = jsonDataFilter.getDataFromJson(detailsFromJson,"neno");
        assertEquals(a,"No resort with that ID found.");
    }

    @Test
    public void testOnValidID() {
        String a = jsonDataFilter.getDataFromJson(detailsFromJson,"121");
        boolean b;
        if(a instanceof String && !a.equals("No resort with that ID found.")){
            b = true;
        } else {
            b = false;
        }
        assertEquals(b,true);
    }

    @Test
    public void testOnNullList() {
        String a = jsonDataFilter.getDataFromJson(null,"neno");
        assertEquals(a,"No valid values send");
    }

    @Test
    public void testOnEmptyResortId() {
        String a = jsonDataFilter.getDataFromJson(detailsFromJson,"");
        assertEquals(a,"No valid values send");
    }

    @Test
    public void testOnNullResortID() {
        String a = jsonDataFilter.getDataFromJson(detailsFromJson,null);
        assertEquals(a,"No valid values send");
    }

    @Test
    public void testOnAllNull() {
        String a = jsonDataFilter.getDataFromJson(null,null);
        assertEquals(a,"No valid values send");
    }
}