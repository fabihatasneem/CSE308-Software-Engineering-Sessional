package Problem2.LanguagePackage;

import Problem2.FontsPackage.Fonts;
import Problem2.ParserPackage.Parser;

public interface Language {
    Parser getParser();
    Fonts getFont();
    String getLanguageName();
}
