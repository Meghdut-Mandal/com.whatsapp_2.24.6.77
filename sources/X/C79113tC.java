package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3tC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79113tC implements AnonymousClass4SB {
    public final /* synthetic */ C69403dT A00;
    public final /* synthetic */ UserJid A01;

    public /* synthetic */ C79113tC(C69403dT r1, UserJid userJid) {
        this.A00 = r1;
        this.A01 = userJid;
    }

    public final void BTn() {
        C69403dT r6 = this.A00;
        UserJid userJid = this.A01;
        C87034Nf r0 = r6.A01.A04;
        if (r0 != null) {
            C69273dG.A03(((C69383dR) r0).A00, 6);
        }
        String A002 = r6.A0A.A00(r6.A02);
        if ("UNBLOCKED".equals(A002)) {
            r6.A0F.A00();
            C24801Dv r4 = r6.A07;
            Context context = r6.A00;
            int i = 9;
            if (r6.A04) {
                i = 13;
            }
            r4.A06(context, AnonymousClass190.A0m(context, userJid, (Integer) null, i));
            return;
        }
        r6.A0E.A02(r6.A00, A002);
    }
}
