package X;

import java.util.Arrays;

/* renamed from: X.9Xy  reason: invalid class name and case insensitive filesystem */
public final class C196159Xy {
    public final AnonymousClass8NL A00;
    public final AnonymousClass8N8 A01;
    public final C80103un A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final byte[] A0B;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C196159Xy) {
                C196159Xy r5 = (C196159Xy) obj;
                if (!(AnonymousClass00C.A0J(this.A00, r5.A00) && AnonymousClass00C.A0J(this.A01, r5.A01) && this.A06 == r5.A06 && this.A05 == r5.A05 && this.A04 == r5.A04 && AnonymousClass00C.A0J(this.A02, r5.A02) && AnonymousClass00C.A0J(this.A0B, r5.A0B) && this.A08 == r5.A08 && this.A03 == r5.A03 && this.A07 == r5.A07 && this.A09 == r5.A09 && this.A0A == r5.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static AnonymousClass8SG A00(C202029kv r1, C196159Xy r2, C80103un r3, AnonymousClass3T1 r4, byte[] bArr) {
        return r1.A03(r3, r4, bArr, r2.A04);
    }

    public static void A01(C196159Xy r4, AC0 ac0, C172138Mr r6, AnonymousClass3T1 r7) {
        C80103un r3 = r4.A02;
        byte[] bArr = r4.A0B;
        if (C202029kv.A02(r3, r7, bArr)) {
            r6.A0U(ac0.A00.A03(r3, r7, bArr, r4.A04));
        }
    }

    public final boolean A02() {
        if (this.A05 || this.A06) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int A052 = (((((((C36351kA.A05(this.A01, C36391kE.A0A(this.A00)) + C36341k9.A01(this.A06 ? 1 : 0)) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + AnonymousClass000.A0H(this.A02)) * 31;
        byte[] bArr = this.A0B;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        }
        return ((((((((((A052 + i) * 31) + C36341k9.A01(this.A08 ? 1 : 0)) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A07 ? 1 : 0)) * 31) + C36341k9.A01(this.A09 ? 1 : 0)) * 31) + C36341k9.A01(this.A0A ? 1 : 0);
    }

    public C196159Xy(AnonymousClass8NL r1, AnonymousClass8N8 r2, C80103un r3, byte[] bArr, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = z3;
        this.A02 = r3;
        this.A0B = bArr;
        this.A08 = z4;
        this.A03 = z5;
        this.A07 = z6;
        this.A09 = z7;
        this.A0A = z8;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BuildE2EMessageParams(e2eMessageBuilder=");
        A0u.append(this.A00);
        A0u.append(", e2eMessageContextInfoBuilder=");
        A0u.append(this.A01);
        A0u.append(", isQuoted=");
        A0u.append(this.A06);
        A0u.append(", isHistorySync=");
        A0u.append(this.A05);
        A0u.append(", ignoreThumbnail=");
        A0u.append(this.A04);
        A0u.append(", ephemeralInfo=");
        A0u.append(this.A02);
        A0u.append(", ephemeralSharedSecret=");
        C90474aD.A1O(A0u, this.A0B);
        A0u.append(", isSpamReport=");
        A0u.append(this.A08);
        A0u.append(", abortOnError=");
        A0u.append(this.A03);
        A0u.append(", isRegularLidGroup=");
        A0u.append(this.A07);
        A0u.append(", skipCommentFlagProcessing=");
        A0u.append(this.A09);
        A0u.append(", skipSecretEncMessageFlagProcessing=");
        return C36321k7.A0H(A0u, this.A0A);
    }
}
