package X;

import android.text.TextUtils;
import java.io.Serializable;

/* renamed from: X.9eV  reason: invalid class name and case insensitive filesystem */
public class C198979eV {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public static C198979eV A00(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        String[] split = str.split(",");
        Long A042 = C202339lc.A04(split, 0);
        int length = split.length;
        if (length > 1) {
            z = Boolean.parseBoolean(split[1]);
            if (length > 2) {
                z2 = Boolean.parseBoolean(split[2]);
            }
            z2 = false;
        } else {
            z = false;
            z2 = false;
        }
        Long A043 = C202339lc.A04(split, 3);
        if (length > 4) {
            z3 = Boolean.parseBoolean(split[4]);
        } else {
            z3 = false;
        }
        return new C198979eV(A042, A043, C202339lc.A04(split, 5), C202339lc.A04(split, 6), C202339lc.A04(split, 7), C202339lc.A04(split, 8), C202339lc.A04(split, 9), z, z2, z3);
    }

    public String toString() {
        Serializable[] serializableArr = new Serializable[10];
        serializableArr[0] = this.A06;
        C36421kH.A1R(serializableArr, this.A07);
        C165587tf.A1X(serializableArr, this.A09);
        serializableArr[3] = this.A03;
        serializableArr[4] = Boolean.valueOf(this.A08);
        serializableArr[5] = this.A05;
        serializableArr[6] = this.A04;
        serializableArr[7] = this.A02;
        serializableArr[8] = this.A01;
        return TextUtils.join(",", C90524aI.A0p(this.A00, serializableArr, 9));
    }

    public C198979eV(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, boolean z, boolean z2, boolean z3) {
        this.A06 = l;
        this.A07 = z;
        this.A09 = z2;
        this.A03 = l2;
        this.A08 = z3;
        this.A05 = l3;
        this.A04 = l4;
        this.A02 = l5;
        this.A01 = l6;
        this.A00 = l7;
    }
}
