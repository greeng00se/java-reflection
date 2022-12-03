package ch08_config;

public class UserInterfaceConfig {
    private String titleColor;
    private String titleText;
    private short titleFontSize;
    private short footerFontSize;

    public String getTitleColor() {
        return titleColor;
    }

    public String getFooterText() {
        return titleText;
    }

    public short getTitleFontSize() {
        return titleFontSize;
    }

    public short getFooterFontSize() {
        return footerFontSize;
    }

    @Override
    public String toString() {
        return "UserInterfaceConfig{" +
                "titleColor='" + titleColor + '\'' +
                ", footerText='" + titleText + '\'' +
                ", titleFontSize=" + titleFontSize +
                ", footerFontSize=" + footerFontSize +
                '}';
    }
}
