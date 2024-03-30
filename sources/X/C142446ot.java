package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.usernames.observers.UsernameChangeSystemMessageObserver$onUsernameChanged$1;

/* renamed from: X.6ot  reason: invalid class name and case insensitive filesystem */
public final class C142446ot implements AnonymousClass194 {
    public final C220412q A00;
    public final C20780y9 A01;
    public final C20810yC A02;
    public final C237919w A03;
    public final AnonymousClass17K A04;
    public final AnonymousClass00T A05 = C36431kI.A1I(new C153087Mz(this));
    public final C005502l A06;
    public final C19970wo A07;
    public final AnonymousClass040 A08;

    public void BkB(UserJid userJid, String str, String str2) {
        UserJid userJid2 = userJid;
        if ((userJid instanceof C223313w) || (userJid instanceof PhoneUserJid)) {
            String str3 = str;
            if (str.length() > 0) {
                String str4 = str2;
                if (str2.length() > 0) {
                    if (this.A02.A0E(4746)) {
                        C36331k8.A1T(new UsernameChangeSystemMessageObserver$onUsernameChanged$1(userJid2, this, str3, str4, (C023509x) null), this.A08);
                    }
                }
            }
        }
    }

    public C142446ot(C19970wo r2, C220412q r3, C20780y9 r4, C20810yC r5, C237919w r6, AnonymousClass17K r7, C005502l r8, AnonymousClass040 r9) {
        C36321k7.A1B(r9, r8, r5, r3, r4);
        C36321k7.A13(r6, r7, r2);
        this.A08 = r9;
        this.A06 = r8;
        this.A02 = r5;
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = r6;
        this.A04 = r7;
        this.A07 = r2;
    }
}
