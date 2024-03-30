package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.82j  reason: invalid class name and case insensitive filesystem */
public final class C1688782j extends AnonymousClass9Y0 {
    public int A00;
    public AnonymousClass9MD A01;
    public C191049Bj A02;
    public C193799Mx A03;
    public boolean A04;

    public boolean A01(AnonymousClass9GG r21, C202309lW r22, long j) {
        int i;
        if (this.A01 != null) {
            return false;
        }
        AnonymousClass9MD r14 = null;
        C202309lW r6 = r22;
        if (this.A03 == null) {
            C1893593j.A00(r6, 1, false);
            r6.A07();
            int A042 = r6.A04();
            long A07 = r6.A07();
            byte[] bArr = r6.A02;
            int i2 = r6.A01 + 1;
            r6.A01 = i2;
            int i3 = i2 + 1;
            r6.A01 = i3;
            int i4 = i3 + 1;
            r6.A01 = i4;
            int i5 = i4 + 1;
            r6.A01 = i5;
            int i6 = i5 + 1;
            r6.A01 = i6;
            int i7 = i6 + 1;
            r6.A01 = i7;
            int A08 = C165597tg.A08(bArr, i6, bArr[i5] & 255);
            int i8 = i7 + 1;
            r6.A01 = i8;
            int A0B = C165607th.A0B(bArr, i7, A08);
            int i9 = i8 + 1;
            r6.A01 = i9;
            int i10 = ((bArr[i8] & 255) << 24) | A0B;
            int i11 = i9 + 1;
            r6.A01 = i11;
            int i12 = i11 + 1;
            r6.A01 = i12;
            int i13 = i12 + 1;
            r6.A01 = i13;
            r6.A01 = i13 + 1;
            int A043 = r6.A04();
            int pow = (int) Math.pow(2.0d, (double) (A043 & 15));
            int pow2 = (int) Math.pow(2.0d, (double) ((A043 & 240) >> 4));
            r6.A04();
            this.A03 = new C193799Mx(Arrays.copyOf(bArr, r6.A00), A042, i10, pow, pow2, A07);
        } else if (this.A02 == null) {
            C1893593j.A00(r6, 3, false);
            r6.A0E((int) r6.A07());
            long A072 = r6.A07();
            String[] strArr = new String[((int) A072)];
            for (int i14 = 0; ((long) i14) < A072; i14++) {
                strArr[i14] = r6.A0E((int) r6.A07());
            }
            if ((r6.A04() & 1) != 0) {
                this.A02 = new C191049Bj(strArr);
            } else {
                throw C187398xn.A00("framing bit expected to be set");
            }
        } else {
            int i15 = r6.A00;
            byte[] bArr2 = new byte[i15];
            byte[] bArr3 = bArr2;
            System.arraycopy(r6.A02, 0, bArr2, 0, i15);
            int i16 = this.A03.A03;
            int i17 = 0;
            C1893593j.A00(r6, 5, false);
            int A044 = r6.A04() + 1;
            AnonymousClass9WS r7 = new AnonymousClass9WS(r6.A02);
            r7.A01(r6.A01 * 8);
            int i18 = 0;
            while (i18 < A044) {
                if (r7.A00(24) == 5653314) {
                    int A002 = r7.A00(16);
                    int A003 = r7.A00(24);
                    long j2 = 0;
                    if (!r7.A02()) {
                        boolean A022 = r7.A02();
                        for (int i19 = 0; i19 < A003; i19++) {
                            if (!A022 || r7.A02()) {
                                r7.A00(5);
                            }
                        }
                    } else {
                        r7.A00(5);
                        int i20 = 0;
                        while (i20 < A003) {
                            int i21 = 0;
                            for (int i22 = A003 - i20; i22 > 0; i22 >>>= 1) {
                                i21++;
                            }
                            int A004 = r7.A00(i21);
                            for (int i23 = 0; i23 < A004 && i20 < A003; i23++) {
                                i20++;
                            }
                        }
                    }
                    int A005 = r7.A00(4);
                    if (A005 <= 2) {
                        if (A005 == 1 || A005 == 2) {
                            r7.A01(32);
                            r7.A01(32);
                            int A006 = r7.A00(4) + 1;
                            r7.A01(1);
                            if (A005 != 1) {
                                j2 = ((long) A003) * ((long) A002);
                            } else if (A002 != 0) {
                                j2 = (long) Math.floor(Math.pow((double) ((long) A003), 1.0d / ((double) ((long) A002))));
                            }
                            r7.A01((int) (j2 * ((long) A006)));
                        }
                        i18++;
                    } else {
                        throw C187398xn.A00(AnonymousClass000.A0r("lookup type greater than 2 not decodable: ", AnonymousClass000.A0u(), A005));
                    }
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                    throw C187398xn.A00(C36381kD.A10(A0u, (r7.A01 * 8) + r7.A00));
                }
            }
            int A007 = r7.A00(6) + 1;
            while (i17 < A007) {
                if (r7.A00(16) == 0) {
                    i17++;
                } else {
                    throw C187398xn.A00("placeholder of time domain transforms not zeroed out");
                }
            }
            int A008 = r7.A00(6) + 1;
            for (int i24 = 0; i24 < A008; i24++) {
                int A009 = r7.A00(16);
                if (A009 == 0) {
                    r7.A01(8);
                    r7.A01(16);
                    r7.A01(16);
                    r7.A01(6);
                    r7.A01(8);
                    int A0010 = r7.A00(4) + 1;
                    for (int i25 = 0; i25 < A0010; i25++) {
                        r7.A01(8);
                    }
                } else if (A009 == 1) {
                    int A0011 = r7.A00(5);
                    int i26 = -1;
                    int[] iArr = new int[A0011];
                    for (int i27 = 0; i27 < A0011; i27++) {
                        int A0012 = r7.A00(4);
                        iArr[i27] = A0012;
                        if (A0012 > i26) {
                            i26 = iArr[i27];
                        }
                    }
                    int i28 = i26 + 1;
                    int[] iArr2 = new int[i28];
                    for (int i29 = 0; i29 < i28; i29++) {
                        iArr2[i29] = r7.A00(3) + 1;
                        int A0013 = r7.A00(2);
                        if (A0013 > 0) {
                            r7.A01(8);
                        }
                        for (int i30 = 0; i30 < (1 << A0013); i30++) {
                            r7.A01(8);
                        }
                    }
                    r7.A01(2);
                    int A0014 = r7.A00(4);
                    int i31 = 0;
                    int i32 = 0;
                    for (int i33 = 0; i33 < A0011; i33++) {
                        i31 += iArr2[iArr[i33]];
                        while (i32 < i31) {
                            r7.A01(A0014);
                            i32++;
                        }
                    }
                } else {
                    throw C187398xn.A00(AnonymousClass000.A0r("floor type greater than 1 not decodable: ", AnonymousClass000.A0u(), A009));
                }
            }
            int A0015 = r7.A00(6) + 1;
            int i34 = 0;
            while (i34 < A0015) {
                if (r7.A00(16) <= 2) {
                    r7.A01(24);
                    r7.A01(24);
                    r7.A01(24);
                    int A0016 = r7.A00(6) + 1;
                    r7.A01(8);
                    int[] iArr3 = new int[A0016];
                    for (int i35 = 0; i35 < A0016; i35++) {
                        int A0017 = r7.A00(3);
                        int i36 = 0;
                        if (r7.A02()) {
                            i36 = r7.A00(5);
                        }
                        iArr3[i35] = (i36 * 8) + A0017;
                    }
                    for (int i37 = 0; i37 < A0016; i37++) {
                        int i38 = 0;
                        do {
                            if ((iArr3[i37] & (1 << i38)) != 0) {
                                r7.A01(8);
                            }
                            i38++;
                        } while (i38 < 8);
                    }
                    i34++;
                } else {
                    throw C187398xn.A00("residueType greater than 2 is not decodable");
                }
            }
            int A0018 = r7.A00(6) + 1;
            for (int i39 = 0; i39 < A0018; i39++) {
                int A0019 = r7.A00(16);
                if (A0019 != 0) {
                    Log.e("VorbisUtil", AnonymousClass000.A0r("mapping type other than 0 not supported: ", AnonymousClass000.A0u(), A0019));
                } else {
                    if (r7.A02()) {
                        i = r7.A00(4) + 1;
                    } else {
                        i = 1;
                    }
                    if (r7.A02()) {
                        int A0020 = r7.A00(8) + 1;
                        for (int i40 = 0; i40 < A0020; i40++) {
                            int i41 = 0;
                            for (int i42 = i16 - 1; i42 > 0; i42 >>>= 1) {
                                i41++;
                            }
                            r7.A01(i41);
                            r7.A01(i41);
                        }
                    }
                    if (r7.A00(2) == 0) {
                        if (i > 1) {
                            for (int i43 = 0; i43 < i16; i43++) {
                                r7.A01(4);
                            }
                        }
                        for (int i44 = 0; i44 < i; i44++) {
                            r7.A01(8);
                            r7.A01(8);
                            r7.A01(8);
                        }
                    } else {
                        throw C187398xn.A00("to reserved bits must be zero after mapping coupling steps");
                    }
                }
            }
            int A0021 = r7.A00(6) + 1;
            C191059Bk[] r3 = new C191059Bk[A0021];
            for (int i45 = 0; i45 < A0021; i45++) {
                boolean A023 = r7.A02();
                r7.A00(16);
                r7.A00(16);
                r7.A00(8);
                r3[i45] = new C191059Bk(A023);
            }
            if (r7.A02()) {
                int i46 = 0;
                for (int i47 = A0021 - 1; i47 > 0; i47 >>>= 1) {
                    i46++;
                }
                r14 = new AnonymousClass9MD(this.A02, this.A03, bArr3, r3, i46);
            } else {
                throw C187398xn.A00("framing bit after modes not set as expected");
            }
        }
        this.A01 = r14;
        if (r14 != null) {
            ArrayList A0I = AnonymousClass001.A0I();
            C193799Mx r1 = r14.A02;
            A0I.add(r1.A05);
            A0I.add(r14.A03);
            int i48 = r1.A00;
            int i49 = r1.A03;
            int i50 = (int) r1.A04;
            AnonymousClass7c0 r0 = C207099uY.CREATOR;
            C199159en r12 = new C199159en();
            r12.A0P = null;
            r12.A0R = "audio/vorbis";
            r12.A0N = null;
            r12.A03 = i48;
            r12.A09 = -1;
            r12.A04 = i49;
            r12.A0E = i50;
            r12.A0S = A0I;
            r12.A0K = null;
            r12.A0F = 0;
            r12.A0Q = null;
            r21.A00 = new C207099uY(r12);
        }
        return true;
    }

    public void A00(boolean z) {
        super.A00(z);
        if (z) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }
}
