package X;

import java.util.Arrays;

/* renamed from: X.0BC  reason: invalid class name */
public class AnonymousClass0BC implements AnonymousClass0BB {
    public int A00 = 0;
    public int A01 = 8;
    public int A02 = -1;
    public int A03 = -1;
    public boolean A04 = false;
    public float[] A05 = new float[8];
    public int[] A06 = new int[8];
    public int[] A07 = new int[8];
    public final AnonymousClass0B6 A08;
    public final AnonymousClass0B7 A09;

    public final void BmZ(AnonymousClass0B4 r10, float f) {
        int length;
        if (f == 0.0f) {
            Bnb(r10, true);
            return;
        }
        int i = this.A02;
        if (i == -1) {
            this.A02 = 0;
            this.A05[0] = f;
            this.A06[0] = r10.A04;
            this.A07[0] = -1;
            r10.A06++;
            r10.A02(this.A08);
            this.A00++;
            if (!this.A04) {
                int i2 = this.A03 + 1;
                this.A03 = i2;
                length = this.A06.length;
                if (i2 < length) {
                    return;
                }
            } else {
                return;
            }
        } else {
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.A00) {
                int[] iArr = this.A06;
                int i5 = iArr[i];
                int i6 = r10.A04;
                if (i5 == i6) {
                    this.A05[i] = f;
                    return;
                }
                if (iArr[i] < i6) {
                    i4 = i;
                }
                i = this.A07[i];
                i3++;
            }
            int i7 = this.A03;
            int i8 = i7 + 1;
            if (this.A04) {
                int[] iArr2 = this.A06;
                if (iArr2[i7] != -1) {
                    i7 = iArr2.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr3 = this.A06;
            int length2 = iArr3.length;
            if (i7 >= length2 && this.A00 < length2) {
                int i9 = 0;
                while (true) {
                    if (i9 >= length2) {
                        break;
                    } else if (iArr3[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            if (i7 >= length2) {
                i7 = length2;
                int i10 = this.A01 * 2;
                this.A01 = i10;
                this.A04 = false;
                this.A03 = length2 - 1;
                this.A05 = Arrays.copyOf(this.A05, i10);
                this.A06 = Arrays.copyOf(this.A06, this.A01);
                this.A07 = Arrays.copyOf(this.A07, this.A01);
            }
            this.A06[i7] = r10.A04;
            this.A05[i7] = f;
            int[] iArr4 = this.A07;
            if (i4 != -1) {
                iArr4[i7] = iArr4[i4];
                iArr4[i4] = i7;
            } else {
                iArr4[i7] = this.A02;
                this.A02 = i7;
            }
            r10.A06++;
            r10.A02(this.A08);
            int i11 = this.A00 + 1;
            this.A00 = i11;
            if (!this.A04) {
                this.A03++;
            }
            length = this.A06.length;
            if (i11 >= length) {
                this.A04 = true;
            }
            if (this.A03 < length) {
                return;
            }
        }
        this.A04 = true;
        this.A03 = length - 1;
    }

    public boolean B3X(AnonymousClass0B4 r7) {
        int i = this.A02;
        if (i != -1) {
            int i2 = 0;
            while (i != -1 && i2 < this.A00) {
                if (this.A06[i] == r7.A04) {
                    return true;
                }
                i = this.A07[i];
                i2++;
            }
        }
        return false;
    }

    public void B5l(float f) {
        int i = this.A02;
        int i2 = 0;
        while (i != -1 && i2 < this.A00) {
            float[] fArr = this.A05;
            fArr[i] = fArr[i] / f;
            i = this.A07[i];
            i2++;
        }
    }

    public final float B7u(AnonymousClass0B4 r5) {
        int i = this.A02;
        int i2 = 0;
        while (i != -1 && i2 < this.A00) {
            if (this.A06[i] == r5.A04) {
                return this.A05[i];
            }
            i = this.A07[i];
            i2++;
        }
        return 0.0f;
    }

    public AnonymousClass0B4 BIs(int i) {
        int i2 = this.A02;
        int i3 = 0;
        while (i2 != -1 && i3 < this.A00) {
            if (i3 == i) {
                return this.A09.A03[this.A06[i2]];
            }
            i2 = this.A07[i2];
            i3++;
        }
        return null;
    }

    public float BIt(int i) {
        int i2 = this.A02;
        int i3 = 0;
        while (i2 != -1 && i3 < this.A00) {
            if (i3 == i) {
                return this.A05[i2];
            }
            i2 = this.A07[i2];
            i3++;
        }
        return 0.0f;
    }

    public void BKr() {
        int i = this.A02;
        int i2 = 0;
        while (i != -1 && i2 < this.A00) {
            float[] fArr = this.A05;
            fArr[i] = fArr[i] * -1.0f;
            i = this.A07[i];
            i2++;
        }
    }

    public final float Bnb(AnonymousClass0B4 r11, boolean z) {
        int i = this.A02;
        int i2 = i;
        if (i != -1) {
            int i3 = 0;
            int i4 = -1;
            while (i != -1) {
                int i5 = this.A00;
                if (i3 >= i5) {
                    break;
                }
                int[] iArr = this.A06;
                if (iArr[i] == r11.A04) {
                    int[] iArr2 = this.A07;
                    int i6 = iArr2[i];
                    if (i == i2) {
                        this.A02 = i6;
                    } else {
                        iArr2[i4] = i6;
                    }
                    if (z) {
                        r11.A03(this.A08);
                    }
                    r11.A06--;
                    this.A00 = i5 - 1;
                    iArr[i] = -1;
                    if (this.A04) {
                        this.A03 = i;
                    }
                    return this.A05[i];
                }
                i3++;
                i4 = i;
                i = this.A07[i];
            }
        }
        return 0.0f;
    }

    public float BxB(AnonymousClass0B6 r7, boolean z) {
        AnonymousClass0B4 r0 = r7.A02;
        float B7u = B7u(r0);
        Bnb(r0, z);
        AnonymousClass0BB r4 = r7.A01;
        int BAh = r4.BAh();
        for (int i = 0; i < BAh; i++) {
            AnonymousClass0B4 BIs = r4.BIs(i);
            B0C(BIs, r4.B7u(BIs) * B7u, z);
        }
        return B7u;
    }

    public final void clear() {
        int i = this.A02;
        int i2 = 0;
        while (i != -1 && i2 < this.A00) {
            AnonymousClass0B4 r1 = this.A09.A03[this.A06[i]];
            if (r1 != null) {
                r1.A03(this.A08);
            }
            i = this.A07[i];
            i2++;
        }
        this.A02 = -1;
        this.A03 = -1;
        this.A04 = false;
        this.A00 = 0;
    }

    public String toString() {
        int i = this.A02;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.A00) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(this.A05[i]);
            sb2.append(" : ");
            String obj2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj2);
            sb3.append(this.A09.A03[this.A06[i]]);
            str = sb3.toString();
            i = this.A07[i];
            i2++;
        }
        return str;
    }

    public AnonymousClass0BC(AnonymousClass0B6 r4, AnonymousClass0B7 r5) {
        this.A08 = r4;
        this.A09 = r5;
    }

    public void B0C(AnonymousClass0B4 r14, float f, boolean z) {
        int i;
        float f2 = -0.001f;
        if (f <= f2 || f >= 0.001f) {
            int i2 = this.A02;
            int i3 = i2;
            if (i2 == -1) {
                this.A02 = 0;
                this.A05[0] = f;
                this.A06[0] = r14.A04;
                this.A07[0] = -1;
                r14.A06++;
                r14.A02(this.A08);
                this.A00++;
                if (!this.A04) {
                    i = this.A03 + 1;
                    this.A03 = i;
                } else {
                    return;
                }
            } else {
                int i4 = 0;
                int i5 = -1;
                while (i2 != -1) {
                    int i6 = this.A00;
                    if (i4 >= i6) {
                        break;
                    }
                    int[] iArr = this.A06;
                    int i7 = iArr[i2];
                    int i8 = r14.A04;
                    if (i7 == i8) {
                        float[] fArr = this.A05;
                        float f3 = fArr[i2] + f;
                        if (f3 > f2 && f3 < 0.001f) {
                            f3 = 0.0f;
                        }
                        fArr[i2] = f3;
                        if (f3 == 0.0f) {
                            int[] iArr2 = this.A07;
                            int i9 = iArr2[i2];
                            if (i2 == i3) {
                                this.A02 = i9;
                            } else {
                                iArr2[i5] = i9;
                            }
                            if (z) {
                                r14.A03(this.A08);
                            }
                            if (this.A04) {
                                this.A03 = i2;
                            }
                            r14.A06--;
                            this.A00 = i6 - 1;
                            return;
                        }
                        return;
                    }
                    if (iArr[i2] < i8) {
                        i5 = i2;
                    }
                    i2 = this.A07[i2];
                    i4++;
                }
                int i10 = this.A03;
                int i11 = i10 + 1;
                if (this.A04) {
                    int[] iArr3 = this.A06;
                    if (iArr3[i10] != -1) {
                        i10 = iArr3.length;
                    }
                } else {
                    i10 = i11;
                }
                int[] iArr4 = this.A06;
                int length = iArr4.length;
                if (i10 >= length && this.A00 < length) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            break;
                        } else if (iArr4[i12] == -1) {
                            i10 = i12;
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (i10 >= length) {
                    i10 = length;
                    int i13 = this.A01 * 2;
                    this.A01 = i13;
                    this.A04 = false;
                    this.A03 = length - 1;
                    this.A05 = Arrays.copyOf(this.A05, i13);
                    this.A06 = Arrays.copyOf(this.A06, this.A01);
                    this.A07 = Arrays.copyOf(this.A07, this.A01);
                }
                this.A06[i10] = r14.A04;
                this.A05[i10] = f;
                int[] iArr5 = this.A07;
                if (i5 != -1) {
                    iArr5[i10] = iArr5[i5];
                    iArr5[i5] = i10;
                } else {
                    iArr5[i10] = this.A02;
                    this.A02 = i10;
                }
                r14.A06++;
                r14.A02(this.A08);
                this.A00++;
                if (!this.A04) {
                    this.A03++;
                }
                i = this.A03;
            }
            int length2 = this.A06.length;
            if (i >= length2) {
                this.A04 = true;
                this.A03 = length2 - 1;
            }
        }
    }

    public int BAh() {
        return this.A00;
    }
}
