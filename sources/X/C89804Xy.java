package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Xy  reason: invalid class name and case insensitive filesystem */
public class C89804Xy implements AnonymousClass4SB {
    public Object A00;
    public final int A01;

    public C89804Xy(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BTn() {
        UserJid userJid;
        switch (this.A01) {
            case 0:
                C69393dS r3 = (C69393dS) this.A00;
                C32691e2 r2 = r3.A02;
                Context context = r3.A04.getContext();
                C207109uZ r0 = r3.A00;
                C18740tg.A06(r0);
                C36331k8.A0t(context, r2, r0.A0J);
                if (r3.A06.A00()) {
                    AnonymousClass2Q2 r1 = new AnonymousClass2Q2();
                    r1.A01 = C36371kC.A0n();
                    r1.A00 = C36361kB.A0i();
                    C207109uZ r02 = r3.A00;
                    if (!(r02 == null || (userJid = r02.A08) == null)) {
                        r1.A02 = AnonymousClass3U8.A06(userJid);
                    }
                    r3.A05.Bly(r1);
                    return;
                }
                return;
            case 1:
                C75543nP.A00((C75543nP) this.A00);
                return;
            default:
                AnonymousClass3HB r03 = (AnonymousClass3HB) this.A00;
                AnonymousClass155 r4 = r03.A03;
                AnonymousClass11F r32 = r03.A09;
                Intent A0D = C36431kI.A0D();
                C36331k8.A0v(A0D, r32, r4.getPackageName(), "com.whatsapp.gallery.MediaGalleryActivity");
                r4.startActivity(A0D);
                return;
        }
    }
}
