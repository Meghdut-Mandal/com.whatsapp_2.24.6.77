package X;

import java.util.List;

/* renamed from: X.4iZ  reason: invalid class name and case insensitive filesystem */
public final class C94654iZ extends AnonymousClass6EG {
    public float A00;
    public float A01;
    public float A02;
    public float A03 = 1.0f;
    public float A04 = 1.0f;
    public float A05;
    public float A06;
    public long A07 = C133336Xx.A05;
    public C161177mK A08;
    public String A09 = "";
    public List A0A = C196389Zl.A00;
    public C006302t A0B;
    public boolean A0C = true;
    public boolean A0D = true;
    public boolean A0E = true;
    public float[] A0F;
    public final List A0G = AnonymousClass001.A0I();
    public final C006302t A0H = new AnonymousClass7RM(this);

    private final void A00(long j) {
        if (this.A0E) {
            long j2 = C133336Xx.A05;
            if (j != j2) {
                long j3 = this.A07;
                if (j3 == j2) {
                    this.A07 = j;
                    return;
                }
                List list = C196389Zl.A00;
                if (C133336Xx.A04(j3) != C133336Xx.A04(j) || C133336Xx.A03(j3) != C133336Xx.A03(j) || C133336Xx.A02(j3) != C133336Xx.A02(j)) {
                    this.A0E = false;
                    this.A07 = j2;
                }
            }
        }
    }

    private final void A01(C125185zS r3) {
        if (this.A0E && r3 != null) {
            if (r3 instanceof C94484iI) {
                A00(((C94484iI) r3).A00);
                return;
            }
            this.A0E = false;
            this.A07 = C133336Xx.A05;
        }
    }

    public static final void A02(C94654iZ r2, AnonymousClass6EG r3) {
        if (r3 instanceof C94634iX) {
            C94634iX r32 = (C94634iX) r3;
            r2.A01(r32.A09);
            r2.A01(r32.A0A);
        } else if (r3 instanceof C94654iZ) {
            C94654iZ r33 = (C94654iZ) r3;
            if (!r33.A0E || !r2.A0E) {
                r2.A0E = false;
                r2.A07 = C133336Xx.A05;
                return;
            }
            r2.A00(r33.A07);
        }
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VGroup: ");
        A0u.append(this.A09);
        List list = this.A0G;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            A0u.append("\t");
            C36351kA.A1K(obj, A0u);
            A0u.append("\n");
        }
        return A0u.toString();
    }
}
