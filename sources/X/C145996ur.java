package X;

import com.whatsapp.jid.UserJid;
import java.io.IOException;

/* renamed from: X.6ur  reason: invalid class name and case insensitive filesystem */
public final class C145996ur implements C160087kR {
    public final /* synthetic */ C158247gc A00;
    public final /* synthetic */ C26461Kg A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public void B2J(C123815x8 r10) {
        AnonymousClass00C.A0D(r10, 0);
        C26461Kg r1 = this.A01;
        Integer num = this.A03;
        UserJid userJid = this.A02;
        boolean z = this.A07;
        String str = this.A05;
        String str2 = this.A06;
        C26461Kg.A00(this.A00, r1, r10, userJid, num, str, str2, this.A04, z);
    }

    public void BVL(IOException iOException) {
        AnonymousClass00C.A0D(iOException, 0);
        C26461Kg.A01(this.A00, this.A01, this.A03, this.A04, iOException);
    }

    public void BWk(Exception exc) {
        AnonymousClass00C.A0D(exc, 0);
        C26461Kg.A01(this.A00, this.A01, this.A03, this.A04, exc);
    }

    public C145996ur(C158247gc r1, C26461Kg r2, UserJid userJid, Integer num, String str, String str2, String str3, boolean z) {
        this.A01 = r2;
        this.A03 = num;
        this.A02 = userJid;
        this.A07 = z;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = r1;
        this.A04 = str3;
    }
}
