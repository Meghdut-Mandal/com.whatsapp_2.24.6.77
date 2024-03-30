package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8r0  reason: invalid class name and case insensitive filesystem */
public class C183568r0 extends C132446Tt {
    public final AnonymousClass16S A00;
    public final UserJid A01;
    public final C193669Mj A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A00.A05(this.A01);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C175728ax r7 = (C175728ax) obj;
        C193669Mj r0 = this.A02;
        C199549fV r5 = r0.A03;
        C23036B1h b1h = r0.A02;
        UserJid userJid = r0.A00;
        String str = r0.A04;
        if (b1h != null) {
            b1h.BZL();
        }
        if (r7 == null || r7.A04 == null || TextUtils.isEmpty(r7.A08())) {
            C199549fV.A00(r5, str, C90484aE.A0r(userJid), true);
            return;
        }
        Runnable runnable = r5.A02;
        if (runnable != null) {
            if (b1h != null) {
                b1h.BrW(r7.A08());
            }
            runnable.run();
        }
    }

    public C183568r0(AnonymousClass16S r1, UserJid userJid, C193669Mj r3) {
        this.A00 = r1;
        this.A01 = userJid;
        this.A02 = r3;
    }
}
