package X;

import java.util.Arrays;

/* renamed from: X.4po  reason: invalid class name and case insensitive filesystem */
public final class C97514po extends C109495Xu {
    public final String A00;
    public final float[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C97514po) {
                C97514po r5 = (C97514po) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36421kH.A04(this.A00) + Arrays.hashCode(this.A01);
    }

    public C97514po(String str, float[] fArr) {
        this.A00 = str;
        this.A01 = fArr;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AiOutputFloatArray(type=");
        A0u.append(this.A00);
        A0u.append(", floatArray=");
        return C36321k7.A0E(Arrays.toString(this.A01), A0u);
    }
}
