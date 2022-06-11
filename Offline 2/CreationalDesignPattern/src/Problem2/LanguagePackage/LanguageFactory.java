package Problem2.LanguagePackage;

public class LanguageFactory {
    public Language getLanguage(String lang){
        if(lang.equalsIgnoreCase("c")){
            return new C();
        } else if(lang.equalsIgnoreCase("cpp")){
            return new CPP();
        }else if(lang.equalsIgnoreCase("py")){
            return new Python();
        }
        return null;
    }
}
