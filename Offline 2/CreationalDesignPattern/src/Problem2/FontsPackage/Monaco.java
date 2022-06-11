package Problem2.FontsPackage;

public class Monaco implements Fonts{
    private static String fontName = null;

    public Monaco() {
        fontName = "Monaco";
    }

    @Override
    public String getFontName() {
        return fontName;
    }
}
