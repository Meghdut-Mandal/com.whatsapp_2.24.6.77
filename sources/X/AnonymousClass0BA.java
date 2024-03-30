package X;

import java.util.Arrays;

/* renamed from: X.0BA  reason: invalid class name */
public class AnonymousClass0BA extends AnonymousClass0B6 {
    public AnonymousClass0B7 A00;
    public AnonymousClass0BD A01 = new AnonymousClass0BD(this, this);
    public int A02 = 0;
    public AnonymousClass0B4[] A03 = new AnonymousClass0B4[128];
    public AnonymousClass0B4[] A04 = new AnonymousClass0B4[128];

    public static final void A01(AnonymousClass0BA r6, AnonymousClass0B4 r7) {
        int i = 0;
        while (true) {
            int i2 = r6.A02;
            if (i < i2) {
                AnonymousClass0B4[] r2 = r6.A03;
                if (r2[i] != r7) {
                    i++;
                } else {
                    while (true) {
                        int i3 = i2 - 1;
                        if (i < i3) {
                            int i4 = i + 1;
                            r2[i] = r2[i4];
                            i = i4;
                        } else {
                            r6.A02 = i3;
                            r7.A08 = false;
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public AnonymousClass0B4 BFw(AnonymousClass0B3 r10, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.A02; i2++) {
            AnonymousClass0B4[] r1 = this.A03;
            AnonymousClass0B4 r8 = r1[i2];
            if (!zArr[r8.A04]) {
                this.A01.A01 = r8;
                if (i == -1) {
                    int i3 = 8;
                    while (true) {
                        float f = r8.A0A[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                break;
                            }
                            i3--;
                            if (i3 < 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    AnonymousClass0B4 r4 = r1[i];
                    int i4 = 8;
                    while (true) {
                        float f2 = r4.A0A[i4];
                        float f3 = r8.A0A[i4];
                        if (f3 == f2) {
                            i4--;
                            if (i4 < 0) {
                                break;
                            }
                        } else if (f3 >= f2) {
                        }
                    }
                }
                i = i2;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.A03[i];
    }

    public void clear() {
        this.A02 = 0;
        this.A00 = 0.0f;
    }

    private final void A02(AnonymousClass0B4 r8) {
        AnonymousClass0B4[] r1;
        int i = this.A02 + 1;
        AnonymousClass0B4[] r12 = this.A03;
        int length = r12.length;
        if (i > length) {
            AnonymousClass0B4[] r13 = (AnonymousClass0B4[]) Arrays.copyOf(r12, length * 2);
            this.A03 = r13;
            this.A04 = (AnonymousClass0B4[]) Arrays.copyOf(r13, r13.length * 2);
        }
        AnonymousClass0B4[] r6 = this.A03;
        int i2 = this.A02;
        r6[i2] = r8;
        int i3 = i2 + 1;
        this.A02 = i3;
        if (i3 > 1 && r6[i3 - 1].A04 > r8.A04) {
            int i4 = 0;
            do {
                r1 = this.A04;
                r1[i4] = r6[i4];
                i4++;
            } while (i4 < i3);
            Arrays.sort(r1, 0, i3, new C12130hY(this));
            for (int i5 = 0; i5 < this.A02; i5++) {
                this.A03[i5] = this.A04[i5];
            }
        }
        r8.A08 = true;
        r8.A02(this);
    }

    public void A06(AnonymousClass0B6 r18, boolean z) {
        AnonymousClass0B6 r7 = r18;
        AnonymousClass0B4 r6 = r7.A02;
        if (r6 != null) {
            AnonymousClass0BB r5 = r7.A01;
            int BAh = r5.BAh();
            int i = 0;
            while (true) {
                if (i < BAh) {
                    AnonymousClass0B4 BIs = r5.BIs(i);
                    float BIt = r5.BIt(i);
                    AnonymousClass0BD r11 = this.A01;
                    r11.A01 = BIs;
                    boolean z2 = true;
                    int i2 = 0;
                    if (BIs.A08) {
                        int i3 = 0;
                        do {
                            float[] fArr = BIs.A0A;
                            float f = fArr[i3] + (r6.A0A[i3] * BIt);
                            fArr[i3] = f;
                            if (Math.abs(f) < 1.0E-4f) {
                                fArr[i3] = 0.0f;
                            } else {
                                z2 = false;
                            }
                            i3++;
                        } while (i3 < 9);
                        if (z2) {
                            A01(r11.A02, BIs);
                        }
                    } else {
                        do {
                            float f2 = r6.A0A[i2];
                            if (f2 != 0.0f) {
                                float f3 = f2 * BIt;
                                if (Math.abs(f3) < 1.0E-4f) {
                                    f3 = 0.0f;
                                }
                                BIs.A0A[i2] = f3;
                            } else {
                                BIs.A0A[i2] = 0.0f;
                            }
                            i2++;
                        } while (i2 < 9);
                        A02(BIs);
                    }
                    this.A00 += r7.A00 * BIt;
                    i++;
                } else {
                    A01(this, r6);
                    return;
                }
            }
        }
    }

    public void B0N(AnonymousClass0B4 r4) {
        this.A01.A01 = r4;
        float[] fArr = r4.A0A;
        Arrays.fill(fArr, 0.0f);
        fArr[r4.A05] = 1.0f;
        A02(r4);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(" goal -> (");
        sb.append(this.A00);
        sb.append(") : ");
        String obj = sb.toString();
        for (int i = 0; i < this.A02; i++) {
            AnonymousClass0B4 r1 = this.A03[i];
            AnonymousClass0BD r0 = this.A01;
            r0.A01 = r1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(r0);
            sb2.append(" ");
            obj = sb2.toString();
        }
        return obj;
    }

    public AnonymousClass0BA(AnonymousClass0B7 r3) {
        super(r3);
        this.A00 = r3;
    }
}
