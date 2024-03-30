package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3va  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80553va implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass141 A02;
    public final /* synthetic */ C30311a0 A03;
    public final /* synthetic */ UserJid A04;

    public /* synthetic */ C80553va(AnonymousClass141 r1, C30311a0 r2, UserJid userJid, int i, long j) {
        this.A03 = r2;
        this.A04 = userJid;
        this.A00 = i;
        this.A01 = j;
        this.A02 = r1;
    }

    public final void run() {
        C30311a0 r0 = this.A03;
        UserJid userJid = this.A04;
        int i = this.A00;
        long j = this.A01;
        AnonymousClass141 r1 = this.A02;
        r0.A01.A0e(userJid, i, j);
        r1.A01 = i;
        r1.A09 = j;
    }
}
