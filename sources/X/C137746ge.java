package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6ge  reason: invalid class name and case insensitive filesystem */
public final class C137746ge implements C160287kl, C156927bB {
    public float A00;
    public int A01;
    public boolean A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C136766ex A07;
    public final List A08;
    public final boolean A09;
    public final /* synthetic */ C160287kl A0A;

    public Map B8T() {
        return this.A0A.B8T();
    }

    public void Bld() {
        this.A0A.Bld();
    }

    public int getHeight() {
        return this.A0A.getHeight();
    }

    public int getWidth() {
        return this.A0A.getWidth();
    }

    public final boolean A00(int i, boolean z) {
        C136766ex r0;
        if (this.A09) {
            return false;
        }
        List list = this.A08;
        if (list.isEmpty() || (r0 = this.A07) == null) {
            return false;
        }
        int i2 = r0.A05;
        int i3 = this.A01 - i;
        if (i3 < 0 || i3 >= i2) {
            return false;
        }
        C136766ex r02 = (C136766ex) C007103b.A0L(list);
        C136766ex r6 = (C136766ex) C007103b.A0N(list);
        if (i < 0) {
            if (Math.min((r02.A00 + r02.A05) - this.A06, (r6.A00 + r6.A05) - this.A05) <= (-i)) {
                return false;
            }
        } else if (Math.min(this.A06 - r02.A00, this.A05 - r6.A00) <= i) {
            return false;
        }
        this.A01 -= i;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            C136766ex r7 = (C136766ex) list.get(i4);
            r7.A00 += i;
            int[] iArr = r7.A0A;
            int length = iArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = i5 % 2;
                if (r7.A09) {
                    if (i6 != 1) {
                    }
                    iArr[i5] = iArr[i5] + i;
                } else {
                    if (i6 != 0) {
                    }
                    iArr[i5] = iArr[i5] + i;
                }
            }
            if (z) {
                int size2 = r7.A08.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    r7.A06.A01.get(r7.A07);
                }
            }
        }
        this.A00 = (float) i;
        if (!this.A02 && i > 0) {
            this.A02 = true;
        }
        return true;
    }

    public C137746ge(C136766ex r1, C160287kl r2, List list, float f, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A07 = r1;
        this.A01 = i;
        this.A02 = z;
        this.A00 = f;
        this.A03 = f2;
        this.A09 = z2;
        this.A08 = list;
        this.A06 = i2;
        this.A05 = i3;
        this.A04 = i4;
        this.A0A = r2;
    }
}
