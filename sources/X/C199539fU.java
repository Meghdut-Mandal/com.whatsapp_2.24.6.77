package X;

import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.9fU  reason: invalid class name and case insensitive filesystem */
public final class C199539fU {
    public static final AnonymousClass7c0 A07 = C208829yu.A00;
    public static final C199539fU A08 = new AnonymousClass9SM().A00();
    public final C199219ev A00;
    @Deprecated
    public final AnonymousClass82H A01;
    public final C199199et A02;
    public final AnonymousClass678 A03;
    @Deprecated
    public final C97594px A04;
    public final C199229ew A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C199539fU)) {
            return false;
        }
        C199539fU r4 = (C199539fU) obj;
        return Util.A0E(this.A06, r4.A06) && this.A00.equals(r4.A00) && Util.A0E(this.A03, r4.A03) && Util.A0E(this.A02, r4.A02) && Util.A0E(this.A05, r4.A05);
    }

    public int hashCode() {
        return C36401kF.A02(this.A05, C36351kA.A05(this.A00, C36351kA.A05(this.A02, (C36421kH.A04(this.A06) + AnonymousClass000.A0J(this.A03)) * 31)));
    }

    public C199539fU(AnonymousClass82H r1, C199199et r2, C97594px r3, C199229ew r4, String str) {
        this.A06 = str;
        this.A03 = r3;
        this.A04 = r3;
        this.A02 = r2;
        this.A05 = r4;
        this.A00 = r1;
        this.A01 = r1;
    }
}
