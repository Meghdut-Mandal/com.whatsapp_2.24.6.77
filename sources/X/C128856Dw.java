package X;

import java.util.List;

/* renamed from: X.6Dw  reason: invalid class name and case insensitive filesystem */
public final class C128856Dw {
    public final float A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128856Dw) {
                C128856Dw r9 = (C128856Dw) obj;
                if (this.A02 == r9.A02 && this.A07 == r9.A07) {
                    long j = this.A05;
                    long j2 = r9.A05;
                    long j3 = C133206Xf.A03;
                    if (!(j == j2 && this.A04 == r9.A04 && this.A09 == r9.A09 && Float.compare(this.A00, r9.A00) == 0 && this.A01 == r9.A01 && this.A0A == r9.A0A && AnonymousClass00C.A0J(this.A08, r9.A08) && this.A06 == r9.A06 && this.A03 == r9.A03)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A002 = C36321k7.A00(this.A07, C90464aC.A08(this.A02));
        long j = this.A05;
        long j2 = C133206Xf.A03;
        int A003 = C36321k7.A00(j, A002);
        return C36341k9.A02(this.A03, C36321k7.A00(this.A06, C36351kA.A05(this.A08, (((C90474aD.A02((C36321k7.A00(this.A04, A003) + C36341k9.A01(this.A09 ? 1 : 0)) * 31, this.A00) + this.A01) * 31) + C36341k9.A01(this.A0A ? 1 : 0)) * 31)));
    }

    public C128856Dw(List list, float f, int i, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2) {
        this.A02 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A04 = j4;
        this.A09 = z;
        this.A00 = f;
        this.A01 = i;
        this.A0A = z2;
        this.A08 = list;
        this.A06 = j5;
        this.A03 = j6;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PointerInputEventData(id=");
        long j = this.A02;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("PointerId(value=");
        A0u.append(C36331k8.A0j(A0u2, j));
        A0u.append(", uptime=");
        A0u.append(this.A07);
        A0u.append(", positionOnScreen=");
        A0u.append(C133206Xf.A04(this.A05));
        A0u.append(", position=");
        A0u.append(C133206Xf.A04(this.A04));
        A0u.append(", down=");
        A0u.append(this.A09);
        A0u.append(", pressure=");
        A0u.append(this.A00);
        A0u.append(", type=");
        int i = this.A01;
        if (i == 1) {
            str = "Touch";
        } else if (i == 2) {
            str = "Mouse";
        } else if (i == 3) {
            str = "Stylus";
        } else if (i != 4) {
            str = "Unknown";
        } else {
            str = "Eraser";
        }
        A0u.append(str);
        A0u.append(", issuesEnterExit=");
        A0u.append(this.A0A);
        A0u.append(", historical=");
        A0u.append(this.A08);
        A0u.append(", scrollDelta=");
        A0u.append(C133206Xf.A04(this.A06));
        A0u.append(", originalEventPosition=");
        return AnonymousClass000.A0m(C133206Xf.A04(this.A03), A0u);
    }
}
