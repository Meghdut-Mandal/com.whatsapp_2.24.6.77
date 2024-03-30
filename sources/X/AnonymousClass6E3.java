package X;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: X.6E3  reason: invalid class name */
public final class AnonymousClass6E3 {
    public long A00;
    public Surface A01;
    public C204359ps A02;
    public C200889iQ A03 = new C200889iQ();
    public C202289lT A04;
    public C117925n3 A05;
    public String A06 = "";
    public String A07;
    public boolean A08;
    public final int A09;
    public final TextureView A0A;
    public final AnonymousClass17Y A0B;

    public final void A00() {
        C204359ps r0 = this.A02;
        if (r0 != null) {
            r0.A0F();
        }
    }

    public final void A01(C195979Xa r3, boolean z) {
        String str = r3.A0F.A0H;
        this.A08 = z;
        C204359ps r0 = this.A02;
        if (r0 != null) {
            r0.A0K(r3);
        }
        this.A07 = str;
        String str2 = r3.A08;
        if (str2 == null) {
            str2 = "";
        }
        this.A06 = str2;
        this.A00 = 0;
        this.A03 = null;
    }

    public AnonymousClass6E3(Context context, AnonymousClass17Y r4, AnonymousClass6KH r5, C19770wU r6, int i) {
        this.A0B = r4;
        this.A09 = i;
        this.A0A = new TextureView(context);
        r6.Boy(new AnonymousClass737(this, r5, context, 19));
    }
}
