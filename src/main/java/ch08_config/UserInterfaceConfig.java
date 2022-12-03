package ch08_config;

import java.util.Arrays;

public class UserInterfaceConfig {
    private String titleColor;
    private String[] titleFonts;
    private short[] titleTextSizes;

    public String getTitleColor() {
        return titleColor;
    }

    public String[] getTitleFonts() {
        return titleFonts;
    }

    public short[] getTitleTextSizes() {
        return titleTextSizes;
    }

    @Override
    public String toString() {
        return "UserInterfaceConfig{" +
                "titleColor='" + titleColor + '\'' +
                ", titleFonts=" + Arrays.toString(titleFonts) +
                ", titleTextSizes=" + Arrays.toString(titleTextSizes) +
                '}';
    }
}
