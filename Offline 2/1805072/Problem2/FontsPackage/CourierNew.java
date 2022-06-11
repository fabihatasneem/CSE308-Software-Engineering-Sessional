package Problem2.FontsPackage;

public class CourierNew implements Fonts{
    private static String fontName = null;

    public CourierNew() {
        fontName = "Courier New";
    }

    @Override
    public String getFontName() {
        return fontName;
    }
}
