package X;

/* renamed from: X.6Mg  reason: invalid class name and case insensitive filesystem */
public class C130746Mg {
    public static final C130746Mg A02 = new C130746Mg(C023109s.A0C, 1.0E21f);
    public final float A00;
    public final Integer A01;

    public String toString() {
        int intValue = this.A01.intValue();
        if (intValue == 0) {
            return Float.toString(this.A00);
        }
        if (intValue != 1) {
            return "auto";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00);
        return AnonymousClass000.A0q("%", A0u);
    }

    public C130746Mg(Integer num, float f) {
        this.A00 = f;
        this.A01 = num;
    }
}
