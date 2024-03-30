package X;

import java.util.ArrayList;

/* renamed from: X.0GI  reason: invalid class name */
public class AnonymousClass0GI extends AnonymousClass0GJ {
    public float A00 = 0.5f;
    public float A01 = 0.5f;
    public float A02 = 0.5f;
    public float A03 = 0.5f;
    public float A04 = 0.5f;
    public float A05 = 0.5f;
    public int A06 = 0;
    public int A07 = -1;
    public int A08 = -1;
    public int A09 = 2;
    public int A0A = 0;
    public int A0B = -1;
    public int A0C = -1;
    public int A0D = -1;
    public int A0E = -1;
    public int A0F = 0;
    public int A0G = 2;
    public int A0H = 0;
    public int A0I = -1;
    public int A0J = 0;
    public ArrayList A0K = AnonymousClass001.A0I();
    public int[] A0L = null;
    public C02500Aq[] A0M = null;
    public C02500Aq[] A0N = null;
    public C02500Aq[] A0O;

    public static final int A00(C02500Aq r9, AnonymousClass0GI r10, int i) {
        C02500Aq r5 = r9;
        if (r9 != null) {
            Integer[] numArr = r9.A0q;
            if (numArr[1] == C023109s.A0C) {
                int i2 = r9.A0C;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (r9.A03 * ((float) i));
                        if (i3 != r5.A02()) {
                            AnonymousClass0GI r4 = r10;
                            r4.A0K(r5, numArr[0], C023109s.A00, r5.A03(), i3);
                        }
                        return i3;
                    } else if (i2 != 1 && i2 == 3) {
                        return (int) ((((float) r9.A03()) * r9.A01) + 0.5f);
                    }
                }
            }
            return r9.A02();
        }
        return 0;
    }

    public static final int A01(C02500Aq r8, AnonymousClass0GI r9, int i) {
        C02500Aq r4 = r8;
        if (r8 != null) {
            Integer[] numArr = r8.A0q;
            if (numArr[0] == C023109s.A0C) {
                int i2 = r8.A0D;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (r8.A04 * ((float) i));
                        if (i3 != r8.A03()) {
                            r9.A0K(r4, C023109s.A00, numArr[1], i3, r8.A02());
                        }
                        return i3;
                    } else if (i2 != 1 && i2 == 3) {
                        return (int) ((((float) r8.A02()) * r8.A01) + 0.5f);
                    }
                }
            }
            return r8.A03();
        }
        return 0;
    }

    public void A0J(AnonymousClass0B3 r13) {
        boolean z;
        C02500Aq r2;
        super.A0J(r13);
        C02500Aq r0 = this.A0Z;
        if (r0 != null) {
            z = ((C02520As) r0).A09;
        } else {
            z = false;
        }
        int i = this.A0J;
        if (i == 0) {
            ArrayList arrayList = this.A0K;
            if (arrayList.size() > 0) {
                ((AnonymousClass0UZ) arrayList.get(0)).A00(0, z, true);
            }
        } else if (i == 1) {
            ArrayList arrayList2 = this.A0K;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((AnonymousClass0UZ) arrayList2.get(i2)).A00(i2, z, AnonymousClass000.A1S(i2, size - 1));
            }
        } else if (!(i != 2 || this.A0L == null || this.A0M == null || this.A0N == null)) {
            for (int i3 = 0; i3 < this.A06; i3++) {
                ArrayList arrayList3 = this.A0O[i3].A0g;
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((AnonymousClass0Az) arrayList3.get(i4)).A02();
                }
            }
            int[] iArr = this.A0L;
            int i5 = iArr[0];
            int i6 = iArr[1];
            C02500Aq r4 = null;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = i7;
                if (z) {
                    i8 = (i5 - i7) - 1;
                }
                C02500Aq r3 = this.A0M[i8];
                if (!(r3 == null || r3.A0N == 8)) {
                    if (i7 == 0) {
                        r3.A0D(r3.A0W, this.A0W, this.A07);
                        r3.A0A = this.A0B;
                        r3.A02 = this.A02;
                    }
                    if (i7 == i5 - 1) {
                        r3.A0D(r3.A0X, this.A0X, this.A08);
                    }
                    if (i7 > 0) {
                        AnonymousClass0Az r22 = r3.A0W;
                        AnonymousClass0Az r1 = r4.A0X;
                        r3.A0D(r22, r1, this.A0A);
                        r4.A0D(r1, r22, 0);
                    }
                    r4 = r3;
                }
            }
            for (int i9 = 0; i9 < i6; i9++) {
                C02500Aq r32 = this.A0N[i9];
                if (!(r32 == null || r32.A0N == 8)) {
                    if (i9 == 0) {
                        r32.A0D(r32.A0Y, this.A0Y, this.A06);
                        r32.A0L = this.A0I;
                        r32.A06 = this.A05;
                    }
                    if (i9 == i6 - 1) {
                        r32.A0D(r32.A0S, this.A0S, this.A03);
                    }
                    if (i9 > 0) {
                        AnonymousClass0Az r23 = r32.A0Y;
                        AnonymousClass0Az r12 = r4.A0S;
                        r32.A0D(r23, r12, this.A0H);
                        r4.A0D(r12, r23, 0);
                    }
                    r4 = r32;
                }
            }
            for (int i10 = 0; i10 < i5; i10++) {
                for (int i11 = 0; i11 < i6; i11++) {
                    int i12 = (i11 * i5) + i10;
                    if (this.A0F == 1) {
                        i12 = (i10 * i6) + i11;
                    }
                    C02500Aq[] r14 = this.A0O;
                    if (!(i12 >= r14.length || (r2 = r14[i12]) == null || r2.A0N == 8)) {
                        C02500Aq r11 = this.A0M[i10];
                        C02500Aq r10 = this.A0N[i11];
                        if (r2 != r11) {
                            r2.A0D(r2.A0W, r11.A0W, 0);
                            r2.A0D(r2.A0X, r11.A0X, 0);
                        }
                        if (r2 != r10) {
                            r2.A0D(r2.A0Y, r10.A0Y, 0);
                            r2.A0D(r2.A0S, r10.A0S, 0);
                        }
                    }
                }
            }
        }
        this.A0A = false;
    }
}
