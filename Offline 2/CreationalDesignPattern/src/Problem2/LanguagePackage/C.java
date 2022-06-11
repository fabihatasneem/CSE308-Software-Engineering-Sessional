package Problem2.LanguagePackage;

import Problem2.FontsPackage.CourierNew;
import Problem2.FontsPackage.Fonts;
import Problem2.ParserPackage.CParser;
import Problem2.ParserPackage.Parser;

public class C implements Language{
    @Override
    public Parser getParser() {
        return new CParser();
    }

    @Override
    public Fonts getFont() {
        return new CourierNew();
    }

    @Override
    public String getLanguageName() {
        return "C";
    }
}
