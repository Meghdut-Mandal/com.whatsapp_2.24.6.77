package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.A8u  reason: case insensitive filesystem */
public final /* synthetic */ class C21109A8u implements C22911AyN {
    public final /* synthetic */ C195799Wb A00;
    public final /* synthetic */ AnonymousClass8VB A01;
    public final /* synthetic */ UserJid A02;

    public /* synthetic */ C21109A8u(C195799Wb r1, AnonymousClass8VB r2, UserJid userJid) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = userJid;
    }

    public final void BfK(boolean z) {
        AnonymousClass8VB r5 = this.A01;
        C195799Wb r4 = this.A00;
        UserJid userJid = this.A02;
        if (z) {
            C36341k9.A0x(C19420v0.A00(r5.A03), "latest_biz_backend_request_id", "252");
            r5.A01.A0D(new C21102A8n(r4, r5), userJid, true);
            return;
        }
        AnonymousClass8VB.A00(r4, r5);
    }
}
