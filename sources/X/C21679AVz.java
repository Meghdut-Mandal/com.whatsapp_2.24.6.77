package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.AVz  reason: case insensitive filesystem */
public final /* synthetic */ class C21679AVz implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass16X A01;
    public final /* synthetic */ C135106c9 A02;
    public final /* synthetic */ AnonymousClass11F A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ C203269nh A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public /* synthetic */ C21679AVz(AnonymousClass16X r1, C135106c9 r2, AnonymousClass11F r3, UserJid userJid, C203269nh r5, String str, List list, long j) {
        this.A05 = r5;
        this.A06 = str;
        this.A07 = list;
        this.A03 = r3;
        this.A04 = userJid;
        this.A00 = j;
        this.A01 = r1;
        this.A02 = r2;
    }

    public final void run() {
        AnonymousClass3T1 r10;
        C203269nh r7 = this.A05;
        String str = this.A06;
        List list = this.A07;
        AnonymousClass11F r9 = this.A03;
        UserJid userJid = this.A04;
        long j = this.A00;
        AnonymousClass16X r4 = this.A01;
        C135106c9 r3 = this.A02;
        C29121Vk r2 = r7.A03;
        C29551Xb r8 = r7.A04;
        C18740tg.A06(r9);
        C79963uZ r11 = C79963uZ.A00;
        if (j != 0) {
            r10 = C36421kH.A0R(r7.A05, j);
        } else {
            r10 = null;
        }
        AnonymousClass2bV A002 = r8.A00(r9, r10, r11, str, list, 0);
        if (!AnonymousClass143.A0G(r9)) {
            userJid = C36401kF.A0b(r9);
        } else if (userJid != null) {
            A002.A0q(userJid);
        }
        r2.A08(r4, r3, userJid, A002);
    }
}
