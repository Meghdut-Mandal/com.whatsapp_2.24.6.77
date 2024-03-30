package X;

import com.whatsapp.R;
import java.util.List;

/* renamed from: X.AGr  reason: case insensitive filesystem */
public final /* synthetic */ class C21313AGr implements C22987Azd {
    public final /* synthetic */ AnonymousClass155 A00;
    public final /* synthetic */ C207119ua A01;
    public final /* synthetic */ AH2 A02;
    public final /* synthetic */ C23043B1o A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C21313AGr(AnonymousClass155 r1, C207119ua r2, AH2 ah2, C23043B1o b1o, String str) {
        this.A02 = ah2;
        this.A03 = b1o;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = str;
    }

    public final void Azh(String str) {
        AH2 ah2 = this.A02;
        C23043B1o b1o = this.A03;
        AnonymousClass155 r6 = this.A00;
        C207119ua r2 = this.A01;
        String str2 = this.A04;
        C21302AGg aGg = ah2.A02;
        aGg.A08 = str;
        aGg.A0O.A03(b1o, str, 10);
        aGg.A01(C188008yt.NONE, aGg.A06.A02(r6, (C202319lY) null, b1o, (List) null));
        if ("WhatsappPay".equals(str) || "p2m_lite".equals(str)) {
            r6.Bu1(R.string.f12nameremoved);
            C19770wU r10 = aGg.A0P;
            C20310xM r5 = aGg.A0I;
            AnonymousClass1XC r8 = aGg.A0L;
            C202449lr.A02(aGg.A0F, r5, aGg.A0J, new C21156AAq(r2, ah2, b1o, str2), r8, b1o, r10);
        }
    }
}
