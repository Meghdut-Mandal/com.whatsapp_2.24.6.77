package X;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: X.9ga  reason: invalid class name and case insensitive filesystem */
public final class C200089ga {
    public int A00;
    public int A01;
    public boolean A02;
    public float[] A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C200089ga r5 = (C200089ga) obj;
            if (!(this.A04 == r5.A04 && this.A05 == r5.A05)) {
                return false;
            }
        }
        return true;
    }

    private void A00() {
        int A062;
        int A063;
        if (!this.A02) {
            int i = this.A05;
            int A042 = C018107s.A04(4.5f, -1, i);
            int A043 = C018107s.A04(3.0f, -1, i);
            if (A042 == -1 || A043 == -1) {
                int A044 = C018107s.A04(4.5f, -16777216, i);
                int A045 = C018107s.A04(3.0f, -16777216, i);
                if (A044 == -1 || A045 == -1) {
                    if (A042 != -1) {
                        A062 = C018107s.A06(-1, A042);
                    } else {
                        A062 = C018107s.A06(-16777216, A044);
                    }
                    this.A00 = A062;
                    if (A043 != -1) {
                        A063 = C018107s.A06(-1, A043);
                    } else {
                        A063 = C018107s.A06(-16777216, A045);
                    }
                } else {
                    this.A00 = C018107s.A06(-16777216, A044);
                    A063 = C018107s.A06(-16777216, A045);
                }
            } else {
                this.A00 = C018107s.A06(-1, A042);
                A063 = C018107s.A06(-1, A043);
            }
            this.A01 = A063;
            this.A02 = true;
        }
    }

    public float[] A01() {
        float[] fArr = this.A03;
        if (fArr == null) {
            fArr = new float[3];
            this.A03 = fArr;
        }
        C018107s.A07(this.A08, this.A07, fArr, this.A06);
        return fArr;
    }

    public int hashCode() {
        return (this.A05 * 31) + this.A04;
    }

    public C200089ga(int i, int i2) {
        this.A08 = Color.red(i);
        this.A07 = Color.green(i);
        this.A06 = Color.blue(i);
        this.A05 = i;
        this.A04 = i2;
    }

    public String toString() {
        StringBuilder A0i = C90524aI.A0i(C90484aE.A0k(this));
        A0i.append(" [RGB: #");
        C90504aG.A0z(this.A05, A0i);
        A0i.append(']');
        A0i.append(" [HSL: ");
        A0i.append(Arrays.toString(A01()));
        A0i.append(']');
        A0i.append(" [Population: ");
        A0i.append(this.A04);
        A0i.append(']');
        A0i.append(" [Title Text: #");
        A00();
        C90504aG.A0z(this.A01, A0i);
        A0i.append(']');
        A0i.append(" [Body Text: #");
        A00();
        C90504aG.A0z(this.A00, A0i);
        return AnonymousClass000.A0t(A0i, ']');
    }
}
