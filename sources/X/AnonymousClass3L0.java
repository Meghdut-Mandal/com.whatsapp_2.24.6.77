package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3L0  reason: invalid class name */
public class AnonymousClass3L0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final UserJid A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3L0 r7 = (AnonymousClass3L0) obj;
            if (!(C1901797e.A00(this.A06, r7.A06) && this.A05 == r7.A05 && C1901797e.A00(this.A07, r7.A07) && C1901797e.A00(this.A08, r7.A08) && this.A03 == r7.A03 && this.A02 == r7.A02 && this.A01 == r7.A01 && this.A00 == r7.A00 && this.A04 == r7.A04)) {
                return false;
            }
        }
        return true;
    }

    public C80113ur A00() {
        return new C80113ur(this.A01, this.A04, this.A00);
    }

    public boolean A01() {
        String str = this.A07;
        if (str == null || !str.startsWith("ent:")) {
            return false;
        }
        return true;
    }

    public boolean A02() {
        String str = this.A07;
        if (str == null || !str.startsWith("smb:")) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        objArr[0] = this.A06;
        C36421kH.A1P(objArr, this.A05);
        objArr[2] = this.A07;
        objArr[3] = this.A08;
        C36341k9.A1U(objArr, this.A03);
        C36371kC.A1S(objArr, this.A02);
        C36381kD.A1T(objArr, this.A01);
        C36361kB.A1V(objArr, this.A00);
        return AnonymousClass000.A0M(Long.valueOf(this.A04), objArr, 8);
    }

    public AnonymousClass3L0(UserJid userJid, C80113ur r4, String str, String str2, int i, int i2, long j, boolean z) {
        this.A09 = z;
        this.A06 = userJid;
        this.A05 = j;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = r4.hostStorage;
        this.A00 = r4.actualActors;
        this.A04 = r4.privacyModeTs;
    }
}
