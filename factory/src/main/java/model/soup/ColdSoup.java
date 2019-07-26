package model.soup;

import model.Soup;

public class ColdSoup extends Soup {
    public ColdSoup() {
        name = "ColdSoup";
        kcal = 200;
        seasonal = true;
    }

    @Override
    public String order() {
        return "COLD SOUP ORDERED";
    }
}
