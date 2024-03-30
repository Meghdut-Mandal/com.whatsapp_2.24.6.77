package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3w5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80863w5 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C31861cV A04;
    public final /* synthetic */ UserJid A05;
    public final /* synthetic */ C80113ur A06;
    public final /* synthetic */ C80113ur A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public /* synthetic */ C80863w5(C31861cV r1, UserJid userJid, C80113ur r3, C80113ur r4, String str, String str2, int i, int i2, int i3, int i4) {
        this.A04 = r1;
        this.A05 = userJid;
        this.A00 = i;
        this.A01 = i2;
        this.A08 = str;
        this.A09 = str2;
        this.A06 = r3;
        this.A07 = r4;
        this.A02 = i3;
        this.A03 = i4;
    }

    public final void run() {
        C31861cV r3 = this.A04;
        UserJid userJid = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        String str = this.A08;
        String str2 = this.A09;
        C80113ur r5 = this.A06;
        C80113ur r6 = this.A07;
        int i3 = this.A02;
        int i4 = this.A03;
        AnonymousClass16D r0 = r3.A00;
        r0.A0D(userJid);
        r0.A0N();
        r3.A01.A0c(userJid, new AnonymousClass3TT(r5, r6, str, str2, i, i2, i3, i4).A02());
    }
}
