package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3px  reason: invalid class name and case insensitive filesystem */
public class C77103px implements C23068B2x {
    public final AnonymousClass17Y A00;
    public final AnonymousClass196 A01;
    public final AnonymousClass16I A02;
    public final C19770wU A03;
    public final AnonymousClass16D A04;

    public void BhP(UserJid userJid, String str, long j) {
        AnonymousClass141 A08 = this.A04.A08(userJid);
        if (A08 != null) {
            A08.A0X = str;
            A08.A0D = j;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("getstatus/received  jid=");
            A0u.append(userJid);
            A0u.append(" status=");
            A0u.append(A08.A0X);
            A0u.append(" timestamp=");
            C36351kA.A1S(A0u, A08.A0D);
            C80273v8.A00(this.A03, this, A08, 26);
        }
    }

    public C77103px(AnonymousClass17Y r1, AnonymousClass196 r2, AnonymousClass16D r3, AnonymousClass16I r4, C19770wU r5) {
        this.A00 = r1;
        this.A03 = r5;
        this.A01 = r2;
        this.A04 = r3;
        this.A02 = r4;
    }

    public void BVG(UserJid userJid) {
        C36321k7.A1K(userJid, "getstatus/delete jid=", AnonymousClass000.A0u());
        AnonymousClass141 A08 = this.A04.A08(userJid);
        if (A08 != null) {
            A08.A0X = null;
            A08.A0D = 0;
            C80273v8.A00(this.A03, this, A08, 26);
        }
    }

    public void BWd(UserJid userJid, int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("getstatus/failed jid=");
        A0u.append(userJid);
        C36321k7.A1U(" code=", A0u, i);
    }

    public void Bbh(UserJid userJid) {
        C36321k7.A1K(userJid, "getstatus/nochange jid=", AnonymousClass000.A0u());
    }
}
