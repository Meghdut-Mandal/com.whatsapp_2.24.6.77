package androidx.car.app.model;

import X.AnonymousClass000;
import X.C36331k8;
import X.C36441kJ;
import X.C90474aD;
import java.util.Objects;

public final class CarColor {
    public static final CarColor A00 = new CarColor(1);
    public final int mColor = 0;
    public final int mColorDark = 0;
    public final int mType = 1;

    public CarColor(int i) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarColor)) {
            return false;
        }
        CarColor carColor = (CarColor) obj;
        return this.mColor == carColor.mColor && this.mColorDark == carColor.mColorDark && this.mType == carColor.mType;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1J(A1Q, this.mType);
        AnonymousClass000.A1K(A1Q, this.mColor);
        C36331k8.A1V(A1Q, this.mColorDark);
        return Objects.hash(A1Q);
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[type: ");
        switch (this.mType) {
            case 0:
                str = "CUSTOM";
                break;
            case 1:
                str = "DEFAULT";
                break;
            case 2:
                str = "PRIMARY";
                break;
            case 3:
                str = "SECONDARY";
                break;
            case 4:
                str = "RED";
                break;
            case 5:
                str = "GREEN";
                break;
            case 6:
                str = "BLUE";
                break;
            case 7:
                str = "YELLOW";
                break;
            default:
                str = "<unknown>";
                break;
        }
        A0u.append(str);
        A0u.append(", color: ");
        A0u.append(this.mColor);
        A0u.append(", dark: ");
        A0u.append(this.mColorDark);
        return C90474aD.A0g(A0u);
    }

    public CarColor() {
    }
}
