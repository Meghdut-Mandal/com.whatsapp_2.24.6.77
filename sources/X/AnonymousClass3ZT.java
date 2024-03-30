package X;

import android.graphics.Bitmap;
import android.view.ViewTreeObserver;

/* renamed from: X.3ZT  reason: invalid class name */
public class AnonymousClass3ZT implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass31H A01;
    public final /* synthetic */ C70803fk A02;
    public final /* synthetic */ AnonymousClass3T1 A03;
    public final /* synthetic */ C64933Qa A04;
    public final /* synthetic */ AnonymousClass3DS A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ Bitmap[] A08;

    public AnonymousClass3ZT(AnonymousClass31H r1, C70803fk r2, AnonymousClass3T1 r3, C64933Qa r4, AnonymousClass3DS r5, String str, String str2, Bitmap[] bitmapArr, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A07 = str;
        this.A06 = str2;
        this.A04 = r4;
        this.A05 = r5;
        this.A00 = i;
        this.A08 = bitmapArr;
        this.A03 = r3;
    }

    public void onGlobalLayout() {
        C70803fk r4 = this.A02;
        if (r4.A5U != null) {
            C36351kA.A1C(r4.A5T, this);
            r4.A5T.setVisibility(0);
            r4.A5U.Bux(this.A01, r4.A5T, r4.A1V.getWidth());
            C88974Ut r3 = r4.A5U;
            String str = this.A07;
            String str2 = this.A06;
            C64933Qa r6 = this.A04;
            AnonymousClass3DS r7 = this.A05;
            int i = this.A00;
            Bitmap[] bitmapArr = this.A08;
            r3.B7D(new C145166tS(r4.A1b, r4.A46, str), this.A03, r6, r7, str, str2, bitmapArr, i);
        }
    }
}
