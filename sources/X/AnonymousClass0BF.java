package X;

import java.util.Arrays;

/* renamed from: X.0BF  reason: invalid class name */
public class AnonymousClass0BF implements AnonymousClass0BB {
    public int A00 = 16;
    public int A01 = -1;
    public int A02 = 0;
    public float[] A03 = new float[16];
    public int[] A04 = new int[16];
    public int[] A05 = new int[16];
    public int[] A06 = new int[16];
    public int[] A07 = new int[16];
    public int[] A08 = new int[16];
    public final AnonymousClass0B6 A09;
    public final AnonymousClass0B7 A0A;

    private void A00(AnonymousClass0B4 r3, float f, int i) {
        this.A08[i] = r3.A04;
        this.A03[i] = f;
        this.A07[i] = -1;
        this.A05[i] = -1;
        r3.A02(this.A09);
        r3.A06++;
        this.A02++;
    }

    private void A01(AnonymousClass0B4 r5, int i) {
        int[] iArr;
        int i2 = r5.A04 % 16;
        int[] iArr2 = this.A04;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.A06;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.A06[i] = -1;
    }

    public int A02(AnonymousClass0B4 r7) {
        int[] iArr;
        if (this.A02 != 0) {
            int i = r7.A04;
            int i2 = this.A04[i % 16];
            if (i2 != -1) {
                int[] iArr2 = this.A08;
                if (iArr2[i2] == i) {
                    return i2;
                }
                while (true) {
                    iArr = this.A06;
                    if (iArr[i2] == -1 || iArr2[iArr[i2]] == i) {
                        int i3 = iArr[i2];
                    } else {
                        i2 = iArr[i2];
                    }
                }
                int i32 = iArr[i2];
                if (i32 == -1 || iArr2[i32] != i) {
                    return -1;
                }
                return i32;
            }
        }
        return -1;
    }

    public void B5l(float f) {
        int i = this.A02;
        int i2 = this.A01;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.A03;
            fArr[i2] = fArr[i2] / f;
            i2 = this.A05[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    public AnonymousClass0B4 BIs(int i) {
        int i2 = this.A02;
        if (i2 != 0) {
            int i3 = this.A01;
            int i4 = 0;
            while (i4 < i2) {
                if (i4 != i || i3 == -1) {
                    i3 = this.A05[i3];
                    if (i3 == -1) {
                        break;
                    }
                    i4++;
                } else {
                    return this.A0A.A03[this.A08[i3]];
                }
            }
        }
        return null;
    }

    public float BIt(int i) {
        int i2 = this.A02;
        int i3 = this.A01;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.A03[i3];
            }
            i3 = this.A05[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public void BKr() {
        int i = this.A02;
        int i2 = this.A01;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.A03;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.A05[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    public float BxB(AnonymousClass0B6 r10, boolean z) {
        AnonymousClass0B4 r0 = r10.A02;
        float B7u = B7u(r0);
        Bnb(r0, z);
        AnonymousClass0BF r7 = (AnonymousClass0BF) r10.A01;
        int i = r7.A02;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int[] iArr = r7.A08;
            if (iArr[i3] != -1) {
                B0C(this.A0A.A03[iArr[i3]], r7.A03[i3] * B7u, z);
                i2++;
            }
            i3++;
        }
        return B7u;
    }

    public void clear() {
        int i = this.A02;
        for (int i2 = 0; i2 < i; i2++) {
            AnonymousClass0B4 BIs = BIs(i2);
            if (BIs != null) {
                BIs.A03(this.A09);
            }
        }
        for (int i3 = 0; i3 < this.A00; i3++) {
            this.A08[i3] = -1;
            this.A06[i3] = -1;
        }
        int i4 = 0;
        do {
            this.A04[i4] = -1;
            i4++;
        } while (i4 < 16);
        this.A02 = 0;
        this.A01 = -1;
    }

    public String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append(" { ");
        String obj2 = sb.toString();
        int i = this.A02;
        for (int i2 = 0; i2 < i; i2++) {
            AnonymousClass0B4 BIs = BIs(i2);
            if (BIs != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj2);
                sb2.append(BIs);
                sb2.append(" = ");
                sb2.append(BIt(i2));
                sb2.append(" ");
                String obj3 = sb2.toString();
                int A022 = A02(BIs);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(obj3);
                sb3.append("[p: ");
                String obj4 = sb3.toString();
                int i3 = this.A07[A022];
                StringBuilder sb4 = new StringBuilder();
                if (i3 != -1) {
                    sb4.append(obj4);
                    sb4.append(this.A0A.A03[this.A08[i3]]);
                } else {
                    sb4.append(obj4);
                    sb4.append("none");
                }
                String obj5 = sb4.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(obj5);
                sb5.append(", n: ");
                String obj6 = sb5.toString();
                int i4 = this.A05[A022];
                if (i4 != -1) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(obj6);
                    sb6.append(this.A0A.A03[this.A08[i4]]);
                    obj = sb6.toString();
                } else {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(obj6);
                    sb7.append("none");
                    obj = sb7.toString();
                }
                StringBuilder sb8 = new StringBuilder();
                sb8.append(obj);
                sb8.append("]");
                obj2 = sb8.toString();
            }
        }
        StringBuilder sb9 = new StringBuilder();
        sb9.append(obj2);
        sb9.append(" }");
        return sb9.toString();
    }

    public AnonymousClass0BF(AnonymousClass0B6 r4, AnonymousClass0B7 r5) {
        this.A09 = r4;
        this.A0A = r5;
        clear();
    }

    public void B0C(AnonymousClass0B4 r7, float f, boolean z) {
        float f2 = -0.001f;
        if (f <= f2 || f >= 0.001f) {
            int A022 = A02(r7);
            if (A022 == -1) {
                BmZ(r7, f);
                return;
            }
            float[] fArr = this.A03;
            float f3 = fArr[A022] + f;
            fArr[A022] = f3;
            if (f3 > f2 && f3 < 0.001f) {
                fArr[A022] = 0.0f;
                Bnb(r7, z);
            }
        }
    }

    public boolean B3X(AnonymousClass0B4 r4) {
        if (A02(r4) != -1) {
            return true;
        }
        return false;
    }

    public float B7u(AnonymousClass0B4 r3) {
        int A022 = A02(r3);
        if (A022 != -1) {
            return this.A03[A022];
        }
        return 0.0f;
    }

    public void BmZ(AnonymousClass0B4 r10, float f) {
        int[] iArr;
        if (f <= (-0.001f) || f >= 0.001f) {
            int i = this.A02;
            int i2 = 0;
            if (i == 0) {
                A00(r10, f, 0);
                A01(r10, 0);
                this.A01 = 0;
                return;
            }
            int A022 = A02(r10);
            if (A022 != -1) {
                this.A03[A022] = f;
                return;
            }
            int i3 = i + 1;
            int i4 = this.A00;
            if (i3 >= i4) {
                i4 *= 2;
                this.A08 = Arrays.copyOf(this.A08, i4);
                this.A03 = Arrays.copyOf(this.A03, i4);
                this.A07 = Arrays.copyOf(this.A07, i4);
                this.A05 = Arrays.copyOf(this.A05, i4);
                int[] copyOf = Arrays.copyOf(this.A06, i4);
                this.A06 = copyOf;
                for (int i5 = this.A00; i5 < i4; i5++) {
                    this.A08[i5] = -1;
                    copyOf[i5] = -1;
                }
                this.A00 = i4;
            }
            int i6 = this.A02;
            int i7 = this.A01;
            int i8 = -1;
            while (i2 < i6) {
                int[] iArr2 = this.A08;
                int i9 = iArr2[i7];
                int i10 = r10.A04;
                if (i9 != i10) {
                    if (iArr2[i7] < i10) {
                        i8 = i7;
                    }
                    i7 = this.A05[i7];
                    if (i7 == -1) {
                        break;
                    }
                    i2++;
                } else {
                    this.A03[i7] = f;
                    return;
                }
            }
            int i11 = 0;
            while (true) {
                if (i11 < i4) {
                    if (this.A08[i11] == -1) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            A00(r10, f, i11);
            int[] iArr3 = this.A07;
            if (i8 != -1) {
                iArr3[i11] = i8;
                iArr = this.A05;
                iArr[i11] = iArr[i8];
                iArr[i8] = i11;
            } else {
                iArr3[i11] = -1;
                int i12 = this.A02;
                iArr = this.A05;
                if (i12 > 0) {
                    iArr[i11] = this.A01;
                    this.A01 = i11;
                } else {
                    iArr[i11] = -1;
                }
            }
            int i13 = iArr[i11];
            if (i13 != -1) {
                iArr3[i13] = i11;
            }
            A01(r10, i11);
            return;
        }
        Bnb(r10, true);
    }

    public float Bnb(AnonymousClass0B4 r10, boolean z) {
        int[] iArr;
        int A022 = A02(r10);
        if (A022 == -1) {
            return 0.0f;
        }
        int i = r10.A04;
        int i2 = i % 16;
        int[] iArr2 = this.A04;
        int i3 = iArr2[i2];
        if (i3 != -1) {
            int[] iArr3 = this.A08;
            if (iArr3[i3] == i) {
                int[] iArr4 = this.A06;
                iArr2[i2] = iArr4[i3];
                iArr4[i3] = -1;
            } else {
                while (true) {
                    iArr = this.A06;
                    if (iArr[i3] == -1 || iArr3[iArr[i3]] == i) {
                        int i4 = iArr[i3];
                    } else {
                        i3 = iArr[i3];
                    }
                }
                int i42 = iArr[i3];
                if (i42 != -1 && iArr3[i42] == i) {
                    iArr[i3] = iArr[i42];
                    iArr[i42] = -1;
                }
            }
        }
        float f = this.A03[A022];
        if (this.A01 == A022) {
            this.A01 = this.A05[A022];
        }
        this.A08[A022] = -1;
        int[] iArr5 = this.A07;
        int i5 = iArr5[A022];
        if (i5 != -1) {
            int[] iArr6 = this.A05;
            iArr6[i5] = iArr6[A022];
        }
        int i6 = this.A05[A022];
        if (i6 != -1) {
            iArr5[i6] = iArr5[A022];
        }
        this.A02--;
        r10.A06--;
        if (z) {
            r10.A03(this.A09);
        }
        return f;
    }

    public int BAh() {
        return this.A02;
    }
}
