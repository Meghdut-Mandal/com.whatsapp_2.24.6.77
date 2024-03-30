package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3ER  reason: invalid class name */
public class AnonymousClass3ER {
    public UserJid A00;
    public UserJid A01;
    public UserJid A02;
    public String A03;
    public String A04;

    public C63523Kj A00() {
        C223313w r2;
        PhoneUserJid phoneUserJid;
        UserJid userJid = this.A00;
        C18740tg.A06(userJid);
        String str = this.A04;
        C18740tg.A06(str);
        UserJid userJid2 = this.A01;
        if (AnonymousClass143.A0I(userJid2)) {
            r2 = (C223313w) userJid2;
        } else {
            r2 = null;
        }
        String str2 = this.A03;
        UserJid userJid3 = this.A02;
        if (userJid3 instanceof PhoneUserJid) {
            phoneUserJid = (PhoneUserJid) userJid3;
        } else {
            phoneUserJid = null;
        }
        return new C63523Kj(r2, phoneUserJid, userJid, str, str2);
    }
}
