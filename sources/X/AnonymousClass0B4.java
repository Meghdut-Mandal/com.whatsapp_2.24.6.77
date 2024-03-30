package X;

import java.util.Arrays;

/* renamed from: X.0B4  reason: invalid class name */
public class AnonymousClass0B4 {
    public static int A0C = 1;
    public int A00 = 0;
    public AnonymousClass0B6[] A01 = new AnonymousClass0B6[16];
    public float A02;
    public int A03 = -1;
    public int A04 = -1;
    public int A05 = 0;
    public int A06 = 0;
    public Integer A07;
    public boolean A08;
    public boolean A09 = false;
    public float[] A0A = new float[9];
    public float[] A0B = new float[9];

    public void A00() {
        this.A07 = C023109s.A0R;
        this.A05 = 0;
        this.A04 = -1;
        this.A03 = -1;
        this.A02 = 0.0f;
        this.A09 = false;
        int i = this.A00;
        for (int i2 = 0; i2 < i; i2++) {
            this.A01[i2] = null;
        }
        this.A00 = 0;
        this.A06 = 0;
        this.A08 = false;
        Arrays.fill(this.A0A, 0.0f);
    }

    public final void A02(AnonymousClass0B6 r4) {
        int i = 0;
        while (true) {
            int i2 = this.A00;
            if (i >= i2) {
                AnonymousClass0B6[] r1 = this.A01;
                int length = r1.length;
                if (i2 >= length) {
                    r1 = (AnonymousClass0B6[]) Arrays.copyOf(r1, length * 2);
                    this.A01 = r1;
                }
                int i3 = this.A00;
                r1[i3] = r4;
                this.A00 = i3 + 1;
                return;
            } else if (this.A01[i] != r4) {
                i++;
            } else {
                return;
            }
        }
    }

    public void A01(float f) {
        this.A02 = f;
        this.A09 = true;
        int i = this.A00;
        for (int i2 = 0; i2 < i; i2++) {
            AnonymousClass0B6 r3 = this.A01[i2];
            AnonymousClass0BB r2 = r3.A01;
            r3.A00 += r2.B7u(this) * f;
            r2.Bnb(this, false);
        }
        this.A00 = 0;
    }

    public final void A03(AnonymousClass0B6 r6) {
        int i = this.A00;
        int i2 = 0;
        while (i2 < i) {
            AnonymousClass0B6[] r2 = this.A01;
            if (r2[i2] != r6) {
                i2++;
            } else {
                while (true) {
                    int i3 = i - 1;
                    if (i2 < i3) {
                        int i4 = i2 + 1;
                        r2[i2] = r2[i4];
                        i2 = i4;
                    } else {
                        this.A00 = i3;
                        return;
                    }
                }
            }
        }
    }

    public final void A04(AnonymousClass0B6 r5) {
        int i = this.A00;
        for (int i2 = 0; i2 < i; i2++) {
            this.A01[i2].A06(r5, false);
        }
        this.A00 = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.A04);
        return sb.toString();
    }

    public AnonymousClass0B4(Integer num) {
        this.A07 = num;
    }
}
