package Problem2.FontsPackage;

public class Consolas implements Fonts{
    private static String fontName = null;

    public Consolas() {
        fontName = "Consolas";
    }

    @Override
    public String getFontName() {
        return fontName;
    }
}
