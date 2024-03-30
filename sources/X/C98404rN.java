package X;

import android.content.res.TypedArray;

/* renamed from: X.4rN  reason: invalid class name and case insensitive filesystem */
public class C98404rN extends C129106Fe {
    public C98404rN() {
        this.A00.A0F = false;
    }

    public /* bridge */ /* synthetic */ C129106Fe A00(TypedArray typedArray) {
        super.A00(typedArray);
        if (typedArray.hasValue(2)) {
            C125045zE r3 = this.A00;
            r3.A05 = (typedArray.getColor(2, r3.A05) & 16777215) | (r3.A05 & -16777216);
        }
        if (typedArray.hasValue(12)) {
            C125045zE r1 = this.A00;
            r1.A09 = typedArray.getColor(12, r1.A09);
        }
        return this;
    }
}
