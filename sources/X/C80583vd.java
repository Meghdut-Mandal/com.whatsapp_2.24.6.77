package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3vd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80583vd implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C20350xQ A01;
    public final /* synthetic */ AnonymousClass147 A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C80583vd(C20350xQ r1, AnonymousClass147 r2, UserJid userJid, long j, boolean z) {
        this.A01 = r1;
        this.A04 = z;
        this.A03 = userJid;
        this.A00 = j;
        this.A02 = r2;
    }

    public final void run() {
        C20350xQ r0 = this.A01;
        boolean z = this.A04;
        r0.A0e(this.A02, this.A03, this.A00, z);
    }
}
