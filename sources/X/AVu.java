package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

public final /* synthetic */ class AVu implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass16X A01;
    public final /* synthetic */ AnonymousClass11F A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ C203269nh A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public /* synthetic */ AVu(AnonymousClass16X r1, AnonymousClass11F r2, UserJid userJid, C203269nh r4, String str, List list, long j) {
        this.A04 = r4;
        this.A05 = str;
        this.A06 = list;
        this.A02 = r2;
        this.A03 = userJid;
        this.A00 = j;
        this.A01 = r1;
    }

    public final void run() {
        AnonymousClass3T1 r9;
        C203269nh r6 = this.A04;
        String str = this.A05;
        List list = this.A06;
        AnonymousClass11F r8 = this.A02;
        UserJid userJid = this.A03;
        long j = this.A00;
        AnonymousClass16X r3 = this.A01;
        C29121Vk r2 = r6.A03;
        C29551Xb r7 = r6.A04;
        C18740tg.A06(r8);
        C79963uZ r10 = C79963uZ.A00;
        if (j != 0) {
            r9 = C36421kH.A0R(r6.A05, j);
        } else {
            r9 = null;
        }
        AnonymousClass2bV A002 = r7.A00(r8, r9, r10, str, list, 0);
        if (!AnonymousClass143.A0G(r8)) {
            userJid = C36401kF.A0b(r8);
        } else if (userJid != null) {
            A002.A0q(userJid);
        }
        r2.A08(r3, (C135106c9) null, userJid, A002);
    }
}
