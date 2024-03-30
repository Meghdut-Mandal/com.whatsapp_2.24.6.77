package X;

import android.content.Context;

/* renamed from: X.2J1  reason: invalid class name */
public abstract class AnonymousClass2J1 extends C70613fR {
    public int A00;

    public void Bwf(Context context) {
        float f;
        int A01 = (AnonymousClass000.A0X(context).widthPixels - C65103Qt.A01(context, 480.0f)) / 2;
        if (this instanceof AnonymousClass2J4) {
            f = 16.0f;
        } else {
            f = 0.0f;
        }
        this.A00 = Math.max(A01, C65103Qt.A01(context, f));
        super.Bwf(context);
    }

    public AnonymousClass2J1(C19630wG r1, C18820ts r2, C20810yC r3) {
        super(r1, r2, r3);
    }
}
