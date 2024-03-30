package X;

import com.facebook.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.82u  reason: invalid class name and case insensitive filesystem */
public final class C1689882u extends C1690082w {
    public int A00 = -1;
    public Timeline A01;
    public C187278xa A02;
    public Object A03;
    public final C1893793l A04;
    public final ArrayList A05;
    public final B38[] A06;

    public C1689882u(B38... b38Arr) {
        C1893793l r0 = new C1893793l();
        this.A06 = b38Arr;
        this.A04 = r0;
        this.A05 = C36351kA.A10(b38Arr);
    }

    public B5S B4q(AnonymousClass9WT r6, C195899Ws r7, long j) {
        B38[] b38Arr = this.A06;
        B5S[] b5sArr = new B5S[2];
        int i = 0;
        do {
            b5sArr[i] = b38Arr[i].B4q(r6, r7, j);
            i++;
        } while (i < 2);
        return new C209339zq(this.A04, b5sArr);
    }

    public void BPf() {
        C187278xa r0 = this.A02;
        if (r0 == null) {
            super.BPf();
            return;
        }
        throw r0;
    }

    public void BnT(B5S b5s) {
        C209339zq r4 = (C209339zq) b5s;
        int i = 0;
        while (true) {
            B38[] b38Arr = this.A06;
            if (i < 2) {
                b38Arr[i].BnT(r4.A04[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public void A05() {
        super.A05();
        this.A01 = null;
        this.A03 = null;
        this.A00 = -1;
        this.A02 = null;
        ArrayList arrayList = this.A05;
        arrayList.clear();
        Collections.addAll(arrayList, this.A06);
    }

    public void A06(C202709mU r5, boolean z) {
        super.A06(r5, z);
        int i = 0;
        while (true) {
            B38[] b38Arr = this.A06;
            if (i < 2) {
                A07(b38Arr[i], Integer.valueOf(i));
                i++;
            } else {
                return;
            }
        }
    }
}
