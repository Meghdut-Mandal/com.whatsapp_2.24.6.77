package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3dN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69343dN implements C22916AyS {
    public final /* synthetic */ C39471sS A00;
    public final /* synthetic */ UserJid A01;

    public /* synthetic */ C69343dN(C39471sS r1, UserJid userJid) {
        this.A00 = r1;
        this.A01 = userJid;
    }

    public final void Ba4(Bitmap bitmap, C21097A8i a8i, boolean z) {
        C39471sS r4 = this.A00;
        UserJid userJid = this.A01;
        if (r4.A01 != null) {
            C19770wU r2 = r4.A0c;
            r2.Bp1(new C81193wc(r4, bitmap, 3));
            C81193wc.A01(r2, r4, userJid, 4);
        }
    }
}
