package X;

import com.whatsapp.jid.UserJid;
import java.util.Objects;

/* renamed from: X.6EE  reason: invalid class name */
public class AnonymousClass6EE {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final UserJid A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass6EE r5 = (AnonymousClass6EE) obj;
            if (!(this.A02 == r5.A02 && this.A0J == r5.A0J && this.A0F == r5.A0F && this.A0C == r5.A0C && this.A0G == r5.A0G && this.A0D == r5.A0D && this.A0O == r5.A0O && this.A0N == r5.A0N && this.A0M == r5.A0M && this.A0L == r5.A0L && this.A06 == r5.A06 && this.A07 == r5.A07 && this.A04 == r5.A04 && this.A05 == r5.A05 && this.A09 == r5.A09 && this.A0A == r5.A0A && this.A0K == r5.A0K && this.A0H == r5.A0H && this.A0P == r5.A0P && this.A0E == r5.A0E && this.A00 == r5.A00 && this.A03 == r5.A03 && this.A0I == r5.A0I && this.A01 == r5.A01 && this.A0B == r5.A0B && this.A08.equals(r5.A08))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[26];
        objArr[0] = this.A08;
        AnonymousClass000.A1K(objArr, this.A02);
        objArr[2] = Boolean.valueOf(this.A0J);
        objArr[3] = Boolean.valueOf(this.A0F);
        objArr[4] = Boolean.valueOf(this.A0C);
        objArr[5] = Boolean.valueOf(this.A0G);
        objArr[6] = Boolean.valueOf(this.A0D);
        objArr[7] = Boolean.valueOf(this.A0O);
        objArr[8] = Boolean.valueOf(this.A0N);
        objArr[9] = Boolean.valueOf(this.A0M);
        objArr[10] = Boolean.valueOf(this.A0L);
        objArr[11] = Integer.valueOf(this.A06);
        objArr[12] = Integer.valueOf(this.A07);
        objArr[13] = Integer.valueOf(this.A04);
        objArr[14] = Integer.valueOf(this.A05);
        objArr[15] = Boolean.valueOf(this.A09);
        objArr[16] = Boolean.valueOf(this.A0A);
        objArr[17] = Boolean.valueOf(this.A0K);
        objArr[18] = Boolean.valueOf(this.A0H);
        objArr[19] = Boolean.valueOf(this.A0P);
        objArr[20] = Boolean.valueOf(this.A0E);
        objArr[21] = Integer.valueOf(this.A00);
        objArr[22] = Integer.valueOf(this.A03);
        objArr[23] = Boolean.valueOf(this.A0I);
        objArr[24] = Integer.valueOf(this.A01);
        objArr[25] = Boolean.valueOf(this.A0B);
        return Objects.hash(objArr);
    }

    public AnonymousClass6EE(UserJid userJid, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, boolean z6, boolean z7, boolean z8, boolean z9, int i3, int i4, int i5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i6, int i7, boolean z16, int i8, boolean z17) {
        this.A08 = userJid;
        this.A02 = i;
        this.A0J = z;
        this.A0F = z2;
        this.A0C = z3;
        this.A0G = z4;
        this.A0D = z5;
        this.A0O = z6;
        this.A0N = z7;
        this.A0M = z8;
        this.A0L = z9;
        this.A06 = i2;
        this.A07 = i3;
        this.A04 = i4;
        this.A05 = i5;
        this.A09 = z10;
        this.A0A = z11;
        this.A0K = z12;
        this.A0H = z13;
        this.A0P = z14;
        this.A0E = z15;
        this.A00 = i6;
        this.A03 = i7;
        this.A0I = z16;
        this.A01 = i8;
        this.A0B = z17;
    }
}
