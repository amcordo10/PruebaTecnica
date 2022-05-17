package co.com.pruebaTecnica.model;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class Data {

    private String search;


    public Data(DataTable stayFilters) {
        List<Map<String, String>> stayFilter = stayFilters.asMaps(String.class, String.class);
        this.search = stayFilter.get(0).get("search");

}

    public String getSearch() {
        return search;
    }
}
