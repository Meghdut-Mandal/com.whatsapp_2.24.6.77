package X;

import java.util.List;

/* renamed from: X.6E5  reason: invalid class name */
public final class AnonymousClass6E5 {
    public long A00 = C133206Xf.A03;
    public C129946Jc A01;
    public List A02;
    public final float A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean A00() {
        C129946Jc r1 = this.A01;
        if (r1.A00 || r1.A01) {
            return true;
        }
        return false;
    }

    public AnonymousClass6E5(float f, int i, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3) {
        this.A05 = j;
        this.A0A = j2;
        this.A06 = j3;
        this.A0B = z;
        this.A03 = f;
        this.A08 = j4;
        this.A07 = j5;
        this.A0C = z2;
        this.A04 = i;
        this.A09 = j6;
        boolean z4 = z3;
        this.A01 = new C129946Jc(z4, z4);
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PointerInputChange(id=");
        long j = this.A05;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("PointerId(value=");
        A0u.append(C36331k8.A0j(A0u2, j));
        A0u.append(", uptimeMillis=");
        A0u.append(this.A0A);
        A0u.append(", position=");
        A0u.append(C133206Xf.A04(this.A06));
        A0u.append(", pressed=");
        A0u.append(this.A0B);
        A0u.append(", pressure=");
        A0u.append(this.A03);
        A0u.append(", previousUptimeMillis=");
        A0u.append(this.A08);
        A0u.append(", previousPosition=");
        A0u.append(C133206Xf.A04(this.A07));
        A0u.append(", previousPressed=");
        A0u.append(this.A0C);
        A0u.append(", isConsumed=");
        A0u.append(A00());
        A0u.append(", type=");
        int i = this.A04;
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
        A0u.append(", historical=");
        Object obj = this.A02;
        if (obj == null) {
            obj = C023409w.A00;
        }
        A0u.append(obj);
        A0u.append(",scrollDelta=");
        return AnonymousClass000.A0m(C133206Xf.A04(this.A09), A0u);
    }
}
