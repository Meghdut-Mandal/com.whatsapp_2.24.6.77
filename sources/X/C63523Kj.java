package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Kj  reason: invalid class name and case insensitive filesystem */
public class C63523Kj {
    public final C223313w A00;
    public final PhoneUserJid A01;
    public final UserJid A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C63523Kj r5 = (C63523Kj) obj;
            if (!this.A02.equals(r5.A02) || !this.A04.equals(r5.A04)) {
                return false;
            }
        }
        return true;
    }

    public boolean A00() {
        if (!(this.A02 instanceof PhoneUserJid) || this.A00 == null) {
            return false;
        }
        return true;
    }

    public C63523Kj(C223313w r1, PhoneUserJid phoneUserJid, UserJid userJid, String str, String str2) {
        this.A02 = userJid;
        this.A04 = str;
        this.A00 = r1;
        this.A03 = str2;
        this.A01 = phoneUserJid;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A02;
        return AnonymousClass000.A0L(this.A04, A0M);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ParticipantProtocolModel{jid=");
        A0u.append(this.A02);
        A0u.append(", type='");
        A0u.append(this.A04);
        A0u.append('\'');
        A0u.append(", lid=");
        A0u.append(this.A00);
        A0u.append(", displayName='");
        A0u.append(this.A03);
        A0u.append('\'');
        A0u.append(", phoneNumber='");
        A0u.append(this.A01);
        A0u.append('\'');
        return AnonymousClass000.A0s(A0u);
    }
}
