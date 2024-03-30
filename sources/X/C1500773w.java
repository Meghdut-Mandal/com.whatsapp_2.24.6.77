package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.73w  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1500773w implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C99424tL A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ C80113ur A04;
    public final /* synthetic */ AnonymousClass65C A05;
    public final /* synthetic */ byte[] A06;

    public /* synthetic */ C1500773w(C99424tL r1, UserJid userJid, C80113ur r3, AnonymousClass65C r4, byte[] bArr, int i, long j) {
        this.A05 = r4;
        this.A03 = userJid;
        this.A06 = bArr;
        this.A00 = i;
        this.A04 = r3;
        this.A01 = j;
        this.A02 = r1;
    }

    public final void run() {
        Object obj;
        AnonymousClass65C r3 = this.A05;
        UserJid userJid = this.A03;
        byte[] bArr = this.A06;
        int i = this.A00;
        C80113ur r5 = this.A04;
        long j = this.A01;
        C99424tL r2 = this.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BizVNameXmppMethods/recvmessagelistener/on-get-biz-vname-cert jid=");
        A0u.append(userJid);
        A0u.append(" certBlob=[");
        if (bArr != null) {
            obj = Integer.valueOf(bArr.length);
        } else {
            obj = "null";
        }
        A0u.append(obj);
        A0u.append("] vlevel=");
        A0u.append(i);
        C36321k7.A1a(A0u, C90494aF.A0c(r5, ". privactMode=", A0u));
        try {
            ((C31861cV) r3.A00.get()).A00(userJid, r5, bArr, i, j);
        } finally {
            r2.A04((Object) null);
        }
    }
}
