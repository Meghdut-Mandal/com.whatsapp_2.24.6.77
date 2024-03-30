package X;

import com.whatsapp.jid.UserJid;
import java.util.LinkedHashMap;

/* renamed from: X.3Dn  reason: invalid class name and case insensitive filesystem */
public final class C61813Dn {
    public final AnonymousClass3AH A00;
    public final AnonymousClass39F A01;
    public final C65573Sp A02;

    public final void A00(C225014r r13, C63363Jt r14, int i) {
        String str;
        C45092Qa.A00(new C45092Qa(), this.A02, r14, 3, i);
        AnonymousClass39F r2 = this.A01;
        AnonymousClass16D r0 = r2.A02;
        UserJid userJid = r14.A02;
        AnonymousClass141 A08 = r0.A08(userJid);
        if (A08 != null) {
            AnonymousClass3L0 r02 = A08.A0E;
            if (r02 == null || (str = r02.A08) == null) {
                str = "";
            }
            String str2 = r14.A04;
            AnonymousClass691 r5 = new AnonymousClass691(str2);
            AnonymousClass011[] r6 = new AnonymousClass011[4];
            C36341k9.A1J("survey_session_id", str2, r6, 0);
            r6[1] = C36441kJ.A19("business_jid", userJid.user);
            r6[2] = C36441kJ.A19("business_survey_session_id", r14.A03);
            r6[3] = C36441kJ.A19("business_name", str);
            LinkedHashMap A07 = C000400e.A07(r6);
            C203639oR A002 = r2.A01.A00(r5);
            r2.A00 = A002;
            AnonymousClass011[] r1 = new AnonymousClass011[1];
            C36341k9.A1J("action", (Object) null, r1, 0);
            A002.A0B(new C76443os(r2, r14, i), new C76473ov(r13, r2, r14, i), new C128166Be("biz_survey", (String) null, C000400e.A08(r1)), "biz_survey", (String) null, A07);
        }
        this.A00.A00.A04(61, (String) null, "");
    }

    public C61813Dn(AnonymousClass3AH r1, AnonymousClass39F r2, C65573Sp r3) {
        C36321k7.A0y(r3, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
