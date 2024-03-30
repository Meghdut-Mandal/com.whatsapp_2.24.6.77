package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8al  reason: invalid class name and case insensitive filesystem */
public class C175608al extends C183388qi {
    public final /* synthetic */ AnonymousClass9YB A00;
    public final /* synthetic */ C175728ax A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175608al(AnonymousClass9YB r2, C175728ax r3) {
        super((Runnable) null);
        this.A00 = r2;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C175728ax A05;
        C175728ax r2 = this.A01;
        UserJid userJid = r2.A04;
        if (!(userJid == null || (A05 = this.A00.A01.A05(userJid)) == null)) {
            r2.A02 = A05.A02;
            r2.A03 = A05.A03;
        }
        return Boolean.valueOf(this.A00.A01.A0H(r2));
    }
}
