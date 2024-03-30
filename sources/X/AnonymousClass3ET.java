package X;

import android.widget.ImageView;
import java.util.Map;

/* renamed from: X.3ET  reason: invalid class name */
public final class AnonymousClass3ET {
    public final AnonymousClass17Y A00;
    public final C119895qd A01;
    public final C123385wP A02;
    public final Map A03 = C36431kI.A1G();
    public final C19770wU A04;

    public final void A00(ImageView imageView, String str) {
        AnonymousClass00C.A0D(imageView, 1);
        String A042 = C18750th.A04(str);
        if (A042 != null) {
            Map map = this.A03;
            synchronized (map) {
                imageView.setTag(-1641051461, A042);
                map.put(A042, AnonymousClass001.A0F(imageView));
            }
            this.A04.Boy(new C80393vK(this, str, A042, 11));
            return;
        }
        throw C36381kD.A0k();
    }

    public AnonymousClass3ET(AnonymousClass17Y r2, C119895qd r3, C123385wP r4, C19770wU r5) {
        C36321k7.A18(r4, r5, r3, r2);
        this.A02 = r4;
        this.A04 = r5;
        this.A01 = r3;
        this.A00 = r2;
    }
}
