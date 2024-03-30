package X;

import android.graphics.Bitmap;

/* renamed from: X.97z  reason: invalid class name and case insensitive filesystem */
public class C1903397z implements C22916AyS {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public C1903397z(Object obj, Object obj2, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void Ba4(Bitmap bitmap, C21097A8i a8i, boolean z) {
        if (this.A02) {
            return;
        }
        if (a8i.A04 == 3) {
            this.A02 = true;
            C21097A8i a8i2 = (C21097A8i) this.A01;
            a8i2.A08.Ba4(bitmap, a8i2, z);
            return;
        }
        ((C21097A8i) this.A01).A08.Ba4(bitmap, a8i, z);
    }
}
