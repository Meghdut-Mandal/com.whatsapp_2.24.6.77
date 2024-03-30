package X;

/* renamed from: X.6gu  reason: invalid class name and case insensitive filesystem */
public abstract class C137896gu implements C158857iM {
    public String A00;
    public final int[] A01 = C36441kJ.A1O();

    public final String A02() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        throw C36331k8.A0d("text");
    }

    public final int[] A03(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.A01;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public static int A01(C137896gu r0) {
        return r0.A02().length();
    }
}
