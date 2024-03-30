package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3KV  reason: invalid class name */
public class AnonymousClass3KV {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final AnonymousClass11F A04;
    public final UserJid A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3KV r7 = (AnonymousClass3KV) obj;
            if (!(this.A02 == r7.A02 && this.A09 == r7.A09 && this.A07.equals(r7.A07) && this.A04.equals(r7.A04) && this.A00 == r7.A00 && this.A03 == r7.A03 && this.A06.equals(r7.A06) && this.A05.equals(r7.A05) && this.A01 == r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public String A00() {
        String str = this.A06;
        if (str.length() <= 32) {
            return str;
        }
        return str.substring(0, AnonymousClass14B.A00(str, 32));
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        objArr[0] = Long.valueOf(this.A02);
        C36421kH.A1R(objArr, this.A09);
        objArr[2] = this.A07;
        objArr[3] = this.A04;
        C36341k9.A1U(objArr, this.A00);
        objArr[5] = Long.valueOf(this.A03);
        objArr[6] = this.A06;
        objArr[7] = this.A05;
        return AnonymousClass000.A0M(Long.valueOf(this.A01), objArr, 8);
    }

    public AnonymousClass3KV(AnonymousClass11F r1, UserJid userJid, String str, String str2, int i, long j, long j2, long j3, boolean z, boolean z2) {
        this.A02 = j;
        this.A09 = z;
        this.A07 = str;
        this.A08 = z2;
        this.A04 = r1;
        this.A00 = i;
        this.A03 = j2;
        this.A06 = str2;
        this.A05 = userJid;
        this.A01 = j3;
    }
}
