package X;

import java.security.SecureRandom;
import javax.crypto.BadPaddingException;

/* renamed from: X.AaI  reason: case insensitive filesystem */
public class C21785AaI implements B3W {
    public C200149gj A00;

    public C21785AaI(C200149gj r1) {
        this.A00 = r1;
    }

    public C21785AaI(B35 b35, C23060B2g b2g) {
        this.A00 = new C22694Asy(b35, b2g);
    }

    public int BIi(int i) {
        return this.A00.A00(i);
    }

    public boolean BxX() {
        return !(this.A00 instanceof C22693Asx);
    }

    public int B5n(byte[] bArr, int i) {
        C22694Asy asy;
        int i2;
        C22694Asy asy2;
        Throwable th;
        byte[] bArr2;
        int i3;
        try {
            C200149gj r2 = this.A00;
            if (r2 instanceof C22694Asy) {
                C22694Asy asy3 = (C22694Asy) r2;
                B35 b35 = asy3.A01;
                int B8o = b35.B8o();
                boolean z = asy3.A02;
                int i4 = asy3.A00;
                if (z) {
                    if (i4 != B8o) {
                        i3 = 0;
                    } else if ((B8o * 2) + i <= bArr.length) {
                        i3 = b35.BmM(asy3.A04, bArr, 0, i);
                        asy3.A00 = 0;
                        i4 = 0;
                    } else {
                        asy3.A01();
                        th = C22697At1.A00();
                        throw th;
                    }
                    asy3.A00.B0e(asy3.A04, i4);
                    i2 = i3 + asy3.A01.BmM(asy3.A04, bArr, 0, i + i3);
                    asy2 = asy3;
                } else if (i4 == B8o) {
                    byte[] bArr3 = asy3.A04;
                    int BmM = b35.BmM(bArr3, bArr3, 0, 0);
                    asy3.A00 = 0;
                    try {
                        asy = asy3;
                        i2 = BmM - asy3.A00.BlA(asy3.A04);
                        System.arraycopy(asy3.A04, 0, bArr, i, i2);
                        asy = asy3;
                        asy2 = asy3;
                    } catch (Throwable th2) {
                        th = th2;
                        asy.A01();
                    }
                } else {
                    asy3.A01();
                    th = new C22702At6("last block incomplete in decryption");
                    throw th;
                }
            } else if (r2 instanceof C22693Asx) {
                int i5 = r2.A00;
                if (i5 + i <= bArr.length) {
                    B35 b352 = r2.A01;
                    int B8o2 = b352.B8o();
                    int i6 = i5 - B8o2;
                    byte[] bArr4 = new byte[B8o2];
                    if (r2.A02) {
                        if (i5 >= B8o2) {
                            b352.BmM(r2.A04, bArr4, 0, 0);
                            int i7 = r2.A00;
                            int i8 = i7;
                            if (i7 > B8o2) {
                                while (true) {
                                    bArr2 = r2.A04;
                                    if (i7 == bArr2.length) {
                                        break;
                                    }
                                    C165617ti.A0h(bArr4, bArr2, i7 - B8o2, i7);
                                    i7++;
                                }
                                for (int i9 = B8o2; i9 != i8; i9++) {
                                    C165577te.A1T(bArr4, bArr2, i9 - B8o2, bArr2[i9], i9);
                                }
                                B35 b353 = r2.A01;
                                if (b353 instanceof C21749AZd) {
                                    ((C21749AZd) b353).A01.BmM(bArr2, bArr, B8o2, i);
                                } else {
                                    b353.BmM(bArr2, bArr, B8o2, i);
                                }
                                System.arraycopy(bArr4, 0, bArr, i + B8o2, i6);
                                i2 = r2.A00;
                                asy2 = r2;
                            }
                        } else {
                            th = new C22702At6("need at least one block of input for CTS");
                        }
                    } else if (i5 >= B8o2) {
                        byte[] bArr5 = new byte[B8o2];
                        if (i5 > B8o2) {
                            if (b352 instanceof C21749AZd) {
                                ((C21749AZd) b352).A01.BmM(r2.A04, bArr4, 0, 0);
                            } else {
                                b352.BmM(r2.A04, bArr4, 0, 0);
                            }
                            for (int i10 = B8o2; i10 != r2.A00; i10++) {
                                int i11 = i10 - B8o2;
                                C165577te.A1T(r2.A04, bArr5, i10, bArr4[i11], i11);
                            }
                            System.arraycopy(r2.A04, B8o2, bArr4, 0, i6);
                            r2.A01.BmM(bArr4, bArr, 0, i);
                            System.arraycopy(bArr5, 0, bArr, i + B8o2, i6);
                            i2 = r2.A00;
                            asy2 = r2;
                        } else {
                            b352.BmM(r2.A04, bArr4, 0, 0);
                        }
                    } else {
                        th = new C22702At6("need at least one block of input for CTS");
                    }
                    System.arraycopy(bArr4, 0, bArr, i, B8o2);
                    i2 = r2.A00;
                    asy2 = r2;
                } else {
                    th = new C22697At1("output buffer to small in doFinal");
                }
                throw th;
            } else {
                asy = r2;
                int i12 = r2.A00;
                if (i + i12 <= bArr.length) {
                    i2 = 0;
                    asy2 = r2;
                    if (i12 != 0) {
                        if (r2.A03) {
                            B35 b354 = r2.A01;
                            byte[] bArr6 = r2.A04;
                            b354.BmM(bArr6, bArr6, 0, 0);
                            int i13 = r2.A00;
                            r2.A00 = 0;
                            System.arraycopy(r2.A04, 0, bArr, i, i13);
                            i2 = i13;
                            asy2 = r2;
                        } else {
                            th = new C22702At6("data not block size aligned");
                        }
                    }
                } else {
                    asy = r2;
                    th = new C22697At1("output buffer too short for doFinal()");
                }
                throw th;
            }
            asy2.A01();
            return i2;
        } catch (C22696At0 e) {
            throw new BadPaddingException(e.getMessage());
        }
    }

    public String B8R() {
        return this.A00.A01.B8R();
    }

    public int BEq(int i) {
        C200149gj r2 = this.A00;
        boolean z = r2 instanceof C22694Asy;
        int i2 = i + r2.A00;
        if (!z) {
            return i2;
        }
        int length = r2.A04.length;
        int i3 = i2 % length;
        if (i3 != 0) {
            i2 -= i3;
        } else if (!r2.A02) {
            return i2;
        }
        return i2 + length;
    }

    public B35 BIf() {
        return this.A00.A01;
    }

    public void BKQ(C16590pl r4, boolean z) {
        C22694Asy asy;
        B35 b35;
        C200149gj r2 = this.A00;
        if (r2 instanceof C22694Asy) {
            C22694Asy asy2 = (C22694Asy) r2;
            asy2.A02 = z;
            asy2.A01();
            if (r4 instanceof C21759AZn) {
                C21759AZn aZn = (C21759AZn) r4;
                asy2.A00.BKN(aZn.A00);
                b35 = asy2.A01;
                r4 = aZn.A01;
            } else {
                asy2.A00.BKN((SecureRandom) null);
                asy = asy2;
                b35 = asy.A01;
            }
        } else {
            r2.A02 = z;
            r2.A01();
            asy = r2;
            b35 = asy.A01;
        }
        b35.BKQ(r4, z);
    }

    public int BmN(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        byte[] bArr3;
        int i5;
        C200149gj r4 = this.A00;
        if (r4 instanceof C22694Asy) {
            if (i2 >= 0) {
                int B8o = r4.A01.B8o();
                int A002 = r4.A00(i2);
                if (A002 <= 0 || A002 + i3 <= bArr2.length) {
                    bArr3 = r4.A04;
                    int length = bArr3.length;
                    int i6 = r4.A00;
                    int i7 = length - i6;
                    i4 = 0;
                    if (i2 > i7) {
                        System.arraycopy(bArr, i, bArr3, i6, i7);
                        int BmM = r4.A01.BmM(r4.A04, bArr2, 0, i3);
                        r4.A00 = 0;
                        i2 -= i7;
                        i += i7;
                        i4 = BmM;
                        while (true) {
                            bArr3 = r4.A04;
                            if (i2 <= bArr3.length) {
                                break;
                            }
                            i4 += r4.A01.BmM(bArr, bArr2, i, i3 + i4);
                            i2 -= B8o;
                            i += B8o;
                        }
                    }
                } else {
                    throw C22697At1.A00();
                }
            } else {
                throw AnonymousClass001.A08("Can't have a negative input length!");
            }
        } else if (r4 instanceof C22693Asx) {
            if (i2 >= 0) {
                int B8o2 = r4.A01.B8o();
                int A003 = r4.A00(i2);
                if (A003 <= 0 || A003 + i3 <= bArr2.length) {
                    byte[] bArr4 = r4.A04;
                    int length2 = bArr4.length;
                    int i8 = r4.A00;
                    int i9 = length2 - i8;
                    int i10 = 0;
                    if (i2 > i9) {
                        System.arraycopy(bArr, i, bArr4, i8, i9);
                        int BmM2 = r4.A01.BmM(r4.A04, bArr2, 0, i3);
                        byte[] bArr5 = r4.A04;
                        System.arraycopy(bArr5, B8o2, bArr5, 0, B8o2);
                        r4.A00 = B8o2;
                        r10 = i2 - i9;
                        r9 = i + i9;
                        while (i2 > B8o2) {
                            System.arraycopy(bArr, i, r4.A04, r4.A00, B8o2);
                            BmM2 += r4.A01.BmM(r4.A04, bArr2, 0, i3 + BmM2);
                            byte[] bArr6 = r4.A04;
                            System.arraycopy(bArr6, B8o2, bArr6, 0, B8o2);
                            r10 = i2 - B8o2;
                            r9 = i + B8o2;
                        }
                        i10 = BmM2;
                    }
                    bArr3 = r4.A04;
                } else {
                    throw C22697At1.A00();
                }
            } else {
                throw AnonymousClass001.A08("Can't have a negative input length!");
            }
        } else if (i2 >= 0) {
            int B8o3 = r4.A01.B8o();
            int A004 = r4.A00(i2);
            if (A004 <= 0 || A004 + i3 <= bArr2.length) {
                byte[] bArr7 = r4.A04;
                int length3 = bArr7.length;
                int i11 = r4.A00;
                int i12 = length3 - i11;
                if (i2 > i12) {
                    System.arraycopy(bArr, i, bArr7, i11, i12);
                    i5 = r4.A01.BmM(r4.A04, bArr2, 0, i3);
                    r4.A00 = 0;
                    r10 = i2 - i12;
                    r9 = i + i12;
                    while (true) {
                        bArr7 = r4.A04;
                        if (i2 <= bArr7.length) {
                            break;
                        }
                        i5 += r4.A01.BmM(bArr, bArr2, i, i3 + i5);
                        r10 = i2 - B8o3;
                        r9 = i + B8o3;
                    }
                } else {
                    i5 = 0;
                }
                System.arraycopy(bArr, i, bArr7, r4.A00, i2);
                int i13 = r4.A00 + i2;
                r4.A00 = i13;
                byte[] bArr8 = r4.A04;
                if (i13 != bArr8.length) {
                    return i5;
                }
                int BmM3 = i5 + r4.A01.BmM(bArr8, bArr2, 0, i3 + i5);
                r4.A00 = 0;
                return BmM3;
            }
            throw C22697At1.A00();
        } else {
            throw AnonymousClass001.A08("Can't have a negative input length!");
        }
        System.arraycopy(bArr, i, bArr3, r4.A00, i2);
        r4.A00 += i2;
        return i4;
    }

    public void BwX(byte[] bArr, int i, int i2) {
        throw AnonymousClass001.A0E("AAD is not supported in the current mode.");
    }

    public C21785AaI(B35 b35) {
        this.A00 = new C22694Asy(b35, new C21776Aa9());
    }
}
