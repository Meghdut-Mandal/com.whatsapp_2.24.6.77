package X;

import android.net.Uri;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Objects;

/* renamed from: X.9fY  reason: invalid class name and case insensitive filesystem */
public final class C199579fY {
    public static final AnonymousClass7c0 A0B = C208879yz.A00;
    public static final C199539fU A0C;
    public static final Object A0D = C36441kJ.A11();
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C199539fU A07 = A0C;
    public Object A08 = A0D;
    public boolean A09;
    public boolean A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            C199579fY r7 = (C199579fY) obj;
            if (!(Util.A0E(this.A08, r7.A08) && Util.A0E(this.A07, r7.A07) && this.A05 == r7.A05 && this.A06 == r7.A06 && this.A04 == r7.A04 && this.A0A == r7.A0A && this.A09 == r7.A09 && this.A02 == r7.A02 && this.A03 == r7.A03 && this.A00 == r7.A00 && this.A01 == r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((C165577te.A04(this.A03, C165577te.A04(this.A02, (((C165577te.A04(this.A04, C165577te.A04(this.A06, C165577te.A04(this.A05, C36351kA.A05(this.A07, (217 + this.A08.hashCode()) * 31) * 31 * 31))) + (this.A0A ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31 * 31)) + this.A00) * 31) + this.A01) * 31) + ((int) (0 ^ (0 >>> 32)));
    }

    static {
        AnonymousClass9SM r1 = new AnonymousClass9SM();
        Objects.requireNonNull("com.facebook.android.exoplayer2.Timeline");
        r1.A01 = "com.facebook.android.exoplayer2.Timeline";
        r1.A00 = Uri.EMPTY;
        A0C = r1.A00();
    }
}
