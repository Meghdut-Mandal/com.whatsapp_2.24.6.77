package X;

import android.text.TextUtils;

/* renamed from: X.6TI  reason: invalid class name */
public class AnonymousClass6TI {
    public static final AnonymousClass7c0 A06 = C139126jH.A00;
    public static final AnonymousClass6TI A07 = new AnonymousClass6TI("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final CharSequence A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass6TI r5 = (AnonymousClass6TI) obj;
            if (!(TextUtils.equals(this.A05, r5.A05) && this.A00 == r5.A00 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A04 == r5.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[17];
        objArr[0] = this.A05;
        objArr[1] = null;
        objArr[2] = null;
        objArr[3] = null;
        objArr[4] = Float.valueOf(this.A00);
        C36371kC.A1S(objArr, this.A03);
        C36381kD.A1T(objArr, this.A02);
        objArr[7] = Float.valueOf(this.A01);
        objArr[8] = Integer.valueOf(this.A04);
        Float valueOf = Float.valueOf(-3.4028235E38f);
        objArr[9] = valueOf;
        objArr[10] = valueOf;
        objArr[11] = C36381kD.A0j();
        objArr[12] = -16777216;
        objArr[13] = Integer.MIN_VALUE;
        objArr[14] = valueOf;
        objArr[15] = Integer.MIN_VALUE;
        return AnonymousClass000.A0M(Float.valueOf(0.0f), objArr, 16);
    }

    @Deprecated
    public AnonymousClass6TI(CharSequence charSequence) {
        this(charSequence, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public AnonymousClass6TI(CharSequence charSequence, float f, float f2, int i, int i2, int i3) {
        this.A05 = charSequence;
        this.A00 = f;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = f2;
        this.A04 = i3;
    }
}
