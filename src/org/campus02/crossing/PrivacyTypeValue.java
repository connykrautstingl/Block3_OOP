package org.campus02.crossing;

public class PrivacyTypeValue<TYPE> {
    private TYPE value;
    private int status; // 1 .. anzeigen, 2 .. nicht anzeigen, 3 ... anzeigen dass es einen gibt

    public PrivacyTypeValue(TYPE value) {
        this.value = value;
        status = 1;
    }

    public void setStatus(int status) {
        if (status >= 1 && status <= 3)
            this.status = status;
        else
            this.status = 1;
    }

    public void setValue(TYPE value) {
        this.value = value;
    }

    public String toString() {
        String result = "";
        if (status == 1)
            result = "Value: " + value;
        else if (status == 2)
            result = "Value: forbidden";
        else if (status == 3)
            result = "Value: value set, but not visible";
        return result;
    }
}
