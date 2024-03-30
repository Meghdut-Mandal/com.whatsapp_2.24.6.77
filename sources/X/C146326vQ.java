package X;

import android.graphics.Bitmap;

/* renamed from: X.6vQ  reason: invalid class name and case insensitive filesystem */
public class C146326vQ implements C87924Qs {
    public final C64933Qa A00;
    public final /* synthetic */ AnonymousClass3T1 A01;
    public final /* synthetic */ C1491570b A02;
    public final /* synthetic */ Bitmap[] A03;

    public C146326vQ(AnonymousClass3T1 r1, C64933Qa r2, C1491570b r3, Bitmap[] bitmapArr) {
        this.A02 = r3;
        this.A03 = bitmapArr;
        this.A01 = r1;
        this.A00 = r2;
    }

    public void Bc9(C145166tS r9, boolean z) {
        C64933Qa r5 = this.A00;
        C1491570b r1 = this.A02;
        if (r5 == r1.A06) {
            int i = r1.A03;
            Bitmap[] bitmapArr = this.A03;
            r1.A02(r9, r9.A06, this.A01, r5, bitmapArr, i);
        }
    }
}
