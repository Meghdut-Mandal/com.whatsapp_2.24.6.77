package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3QL  reason: invalid class name */
public class AnonymousClass3QL {
    public static final AnonymousClass3QL A05 = new AnonymousClass3QL((PhoneUserJid) null, (UserJid) null, (String) null, (String) null, 0);
    public final long A00;
    public final PhoneUserJid A01;
    public final UserJid A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3QL r7 = (AnonymousClass3QL) obj;
            if (this.A00 != r7.A00 || !C1901797e.A00(this.A04, r7.A04) || !C1901797e.A00(this.A02, r7.A02) || !C1901797e.A00(this.A03, r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A04;
        C36421kH.A1P(objArr, this.A00);
        objArr[2] = this.A02;
        return AnonymousClass000.A0M(this.A03, objArr, 3);
    }

    public AnonymousClass3QL(PhoneUserJid phoneUserJid, UserJid userJid, String str, String str2, long j) {
        this.A04 = str;
        this.A00 = j;
        this.A02 = userJid;
        this.A03 = str2;
        this.A01 = phoneUserJid;
    }

    public String toString() {
        Object valueOf;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupDescription{id=");
        A0u.append(this.A04);
        A0u.append(", time=");
        A0u.append(this.A00);
        A0u.append(", setterJid='");
        A0u.append(this.A02);
        A0u.append('\'');
        A0u.append(", len(description)='");
        String str = this.A03;
        if (str == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(str.length());
        }
        A0u.append(valueOf);
        A0u.append('\'');
        return AnonymousClass000.A0s(A0u);
    }
}
