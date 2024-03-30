package X;

import android.os.Looper;

/* renamed from: X.0Ts  reason: invalid class name and case insensitive filesystem */
public class C06470Ts {
    public Looper A00;
    public C15920oE A01;

    public AnonymousClass0WU A00() {
        if (this.A01 == null) {
            this.A01 = new C10270dy();
        }
        Looper looper = this.A00;
        if (looper == null) {
            looper = Looper.getMainLooper();
            this.A00 = looper;
        }
        return new AnonymousClass0WU(looper, this.A01);
    }
}
