package Problem2;

import Problem2.LanguagePackage.Language;
import Problem2.LanguagePackage.LanguageFactory;

public class Editor {
    private static Editor editor = new Editor();
    LanguageFactory languageFactory = new LanguageFactory();

    private Editor(){
    }

    public static Editor getInstance(){
        return editor;
    }

    public void getLanguageInfo(String lang){
        Language language = languageFactory.getLanguage(lang);
        System.out.println("Language: " + language.getLanguageName());
        language.getParser().parse();
        System.out.println("Font : " + language.getFont().getFontName());
    }
}
