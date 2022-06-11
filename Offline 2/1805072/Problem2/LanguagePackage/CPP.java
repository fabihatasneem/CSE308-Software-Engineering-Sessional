package Problem2.LanguagePackage;

import Problem2.FontsPackage.Fonts;
import Problem2.FontsPackage.Monaco;
import Problem2.ParserPackage.CPPParser;
import Problem2.ParserPackage.Parser;

public class CPP implements Language{
    @Override
    public Parser getParser() {
        return new CPPParser();
    }

    @Override
    public Fonts getFont() {
        return new Monaco();
    }

    @Override
    public String getLanguageName() {
        return "CPP";
    }
}
