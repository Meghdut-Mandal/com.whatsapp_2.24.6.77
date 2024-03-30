package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: X.9fT  reason: invalid class name and case insensitive filesystem */
public class C199529fT {
    public static final Comparator A06 = AXW.A00;
    public static final Comparator A07 = AXX.A00;
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public final ArrayList A04 = AnonymousClass001.A0I();
    public final AnonymousClass9J4[] A05 = new AnonymousClass9J4[5];

    public float A00() {
        if (this.A00 != 0) {
            Collections.sort(this.A04, A07);
            this.A00 = 0;
        }
        float f = 0.5f * ((float) this.A03);
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A04;
            if (i < arrayList.size()) {
                AnonymousClass9J4 r1 = (AnonymousClass9J4) arrayList.get(i);
                i2 += r1.A02;
                if (((float) i2) >= f) {
                    return r1.A00;
                }
                i++;
            } else if (arrayList.isEmpty()) {
                return Float.NaN;
            } else {
                return ((AnonymousClass9J4) arrayList.get(arrayList.size() - 1)).A00;
            }
        }
    }

    public void A01(int i, float f) {
        AnonymousClass9J4 r2;
        if (this.A00 != 1) {
            Collections.sort(this.A04, A06);
            this.A00 = 1;
        }
        int i2 = this.A02;
        if (i2 > 0) {
            AnonymousClass9J4[] r0 = this.A05;
            i2--;
            this.A02 = i2;
            r2 = r0[i2];
        } else {
            r2 = new AnonymousClass9J4();
        }
        int i3 = this.A01;
        this.A01 = i3 + 1;
        r2.A01 = i3;
        r2.A02 = i;
        r2.A00 = f;
        ArrayList arrayList = this.A04;
        arrayList.add(r2);
        int i4 = this.A03 + i;
        while (true) {
            this.A03 = i4;
            while (i4 > 2000 && !arrayList.isEmpty()) {
                int i5 = i4 - 2000;
                AnonymousClass9J4 r22 = (AnonymousClass9J4) arrayList.get(0);
                int i6 = r22.A02;
                if (i6 <= i5) {
                    i4 -= i6;
                    this.A03 = i4;
                    arrayList.remove(0);
                    int i7 = i2;
                    if (i2 < 5) {
                        AnonymousClass9J4[] r02 = this.A05;
                        i2++;
                        this.A02 = i2;
                        r02[i7] = r22;
                    }
                } else {
                    r22.A02 = i6 - i5;
                    i4 -= i5;
                }
            }
            return;
        }
    }
}
