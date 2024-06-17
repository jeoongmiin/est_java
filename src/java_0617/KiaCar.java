package java_0617;

public class KiaCar implements Car {
    @Override
    public String getTier() {
        return "KiaTier";
    }

    @Override
    public String ShowEngine() {
        return "KiaEngine";
    }

    @Override
    public int amountNavi() {
        return 10000;
    }
}