package X;

import android.view.View;
import java.util.Arrays;

/* renamed from: X.680  reason: invalid class name */
public class AnonymousClass680 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass680)) {
            return false;
        }
        AnonymousClass680 r4 = (AnonymousClass680) obj;
        if (r4.A00 == this.A00 && r4.A01 == this.A01 && r4.A04 == this.A04 && r4.A05 == this.A05 && r4.A09 == this.A09 && r4.A06 == this.A06 && r4.A02 == this.A02 && r4.A03 == this.A03 && r4.A08 == this.A08 && r4.A07 == this.A07) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = Float.valueOf(this.A00);
        objArr[1] = Float.valueOf(this.A01);
        objArr[2] = Float.valueOf(this.A04);
        objArr[3] = Float.valueOf(this.A05);
        C36341k9.A1U(objArr, this.A09);
        C36371kC.A1S(objArr, this.A06);
        C36381kD.A1T(objArr, this.A02);
        C36361kB.A1V(objArr, this.A03);
        return Arrays.hashCode(objArr);
    }

    public AnonymousClass680(View view) {
        int[] A1O = C36441kJ.A1O();
        view.getLocationInWindow(A1O);
        this.A02 = A1O[0];
        this.A03 = A1O[1];
        this.A00 = view.getTranslationX();
        this.A01 = view.getTranslationY();
        this.A04 = view.getScaleX();
        this.A05 = view.getScaleY();
        this.A09 = view.getWidth();
        this.A06 = view.getHeight();
        this.A08 = view.getMeasuredWidth();
        this.A07 = view.getMeasuredHeight();
    }
}
