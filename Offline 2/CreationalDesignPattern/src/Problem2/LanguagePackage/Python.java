package Problem2.LanguagePackage;

import Problem2.FontsPackage.*;
import Problem2.ParserPackage.*;

public class Python implements Language{
   @Override
    public Parser getParser() {
        return new PythonParser();
    }

    @Override
    public Fonts getFont() {
        return new Consolas();
    }

    @Override
    public String getLanguageName() {
        return "Python";
    }
}
