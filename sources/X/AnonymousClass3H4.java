package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3H4  reason: invalid class name */
public class AnonymousClass3H4 {
    public final int A00;
    public final UserJid A01;
    public final AnonymousClass3T1 A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass3H4 r5 = (AnonymousClass3H4) obj;
            if (!(this.A07 == r5.A07 && this.A09 == r5.A09 && this.A04 == r5.A04 && this.A06 == r5.A06 && this.A08 == r5.A08 && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A02.equals(r5.A02) && C1901797e.A00(this.A01, r5.A01) && this.A05 == r5.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[12];
        objArr[0] = this.A02;
        C36421kH.A1R(objArr, this.A07);
        objArr[2] = Boolean.valueOf(this.A09);
        objArr[3] = Boolean.valueOf(this.A04);
        C36341k9.A1U(objArr, -1);
        objArr[5] = Boolean.valueOf(this.A06);
        objArr[6] = Boolean.valueOf(this.A08);
        objArr[7] = Boolean.valueOf(this.A03);
        objArr[8] = C36381kD.A0j();
        objArr[9] = Integer.valueOf(this.A00);
        objArr[10] = this.A01;
        return AnonymousClass000.A0M(Boolean.valueOf(this.A05), objArr, 11);
    }

    public AnonymousClass3H4(UserJid userJid, AnonymousClass3T1 r2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A02 = r2;
        this.A07 = z;
        this.A09 = z2;
        this.A04 = z3;
        this.A06 = z4;
        this.A08 = z5;
        this.A03 = z6;
        this.A00 = i;
        this.A01 = userJid;
        this.A05 = z7;
    }
}
