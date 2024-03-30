package X;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9jQ  reason: invalid class name and case insensitive filesystem */
public class C201379jQ {
    public AnonymousClass5RZ A00;
    public boolean A01;
    public final C187698yO A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final AtomicBoolean A08;
    public final boolean A09;
    public final boolean A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C201379jQ r5 = (C201379jQ) obj;
            if (!Objects.equals(this.A07, r5.A07) || !Objects.equals(this.A03, r5.A03) || !Objects.equals(this.A04, r5.A04) || !Objects.equals(this.A08, r5.A08) || this.A02 != r5.A02 || this.A00 != r5.A00 || this.A09 != r5.A09) {
                return false;
            }
        }
        return true;
    }

    public C201379jQ(AnonymousClass5RZ r5, String str) {
        C187698yO r3 = C187698yO.GENERAL;
        this.A07 = str;
        this.A03 = null;
        this.A04 = null;
        this.A08 = null;
        this.A00 = r5;
        this.A02 = r3;
        this.A09 = false;
        this.A01 = false;
        this.A06 = "unknown";
        this.A05 = "unknown";
        this.A0A = false;
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        objArr[0] = this.A07;
        objArr[1] = this.A03;
        objArr[2] = this.A04;
        objArr[3] = this.A08;
        objArr[4] = this.A00;
        objArr[5] = this.A02;
        objArr[6] = Boolean.valueOf(this.A09);
        return C165597tg.A06(Boolean.valueOf(this.A01), objArr, 7);
    }

    public C201379jQ(AnonymousClass5RZ r1, C187698yO r2, String str, String str2, String str3, String str4, String str5, AtomicBoolean atomicBoolean, boolean z, boolean z2, boolean z3) {
        this.A07 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A08 = atomicBoolean;
        this.A00 = r1;
        this.A02 = r2;
        this.A09 = z;
        this.A01 = z2;
        this.A06 = str4;
        this.A05 = str5;
        this.A0A = z3;
    }

    public C201379jQ(AnonymousClass5RZ r3, C187698yO r4, String str, String str2, String str3, AtomicBoolean atomicBoolean, boolean z) {
        this.A07 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A08 = atomicBoolean;
        this.A00 = r3;
        this.A02 = r4;
        this.A09 = z;
        this.A01 = false;
        this.A06 = "unknown";
        this.A05 = "unknown";
        this.A0A = false;
    }
}
