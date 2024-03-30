package X;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: X.9zQ  reason: invalid class name and case insensitive filesystem */
public class C209079zQ implements B2h {
    public static final C207099uY A0U = C207099uY.A00("application/x-emsg");
    public static final B4V A0V = C209099zS.A00;
    public static final byte[] A0W = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public SparseArray A0C;
    public C199569fX A0D;
    public C209379zu A0E;
    public C202309lW A0F;
    public boolean A0G;
    public boolean A0H;
    public C23061B2i[] A0I;
    public C23061B2i[] A0J;
    public final C198649dy A0K = new C198649dy();
    public final C202309lW A0L = new C202309lW(16);
    public final C202309lW A0M = new C202309lW();
    public final C202309lW A0N = new C202309lW(5);
    public final C202309lW A0O = new C202309lW(C190949Ay.A02);
    public final C202309lW A0P;
    public final ArrayDeque A0Q;
    public final ArrayDeque A0R;
    public final List A0S = Collections.unmodifiableList(Collections.emptyList());
    public final byte[] A0T;

    public boolean BuG(C201519jm r2) {
        return C196449Zr.A00(r2, true);
    }

    private void A01(long j) {
        String str;
        C21709AXg aXg;
        Object obj;
        int i;
        int i2;
        int i3;
        int i4;
        String str2;
        long A0A2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Object obj2;
        Object obj3;
        AnonymousClass9OI A032;
        while (true) {
            ArrayDeque arrayDeque = this.A0Q;
            if (arrayDeque.isEmpty() || ((C1688582h) arrayDeque.peek()).A00 != j) {
                this.A02 = 0;
                this.A00 = 0;
            } else {
                C1688582h r12 = (C1688582h) arrayDeque.pop();
                int i11 = r12.A00;
                if (i11 == 1836019574) {
                    boolean z = true;
                    int i12 = 0;
                    C21709AXg A002 = A00(r12.A02);
                    C1688582h A003 = r12.A00(1836475768);
                    Objects.requireNonNull(A003);
                    SparseArray sparseArray = new SparseArray();
                    List list = A003.A02;
                    int size = list.size();
                    long j2 = -9223372036854775807L;
                    for (int i13 = 0; i13 < size; i13++) {
                        C1688482g r3 = (C1688482g) list.get(i13);
                        if (r3.A00 == 1953654136) {
                            C202309lW r1 = r3.A00;
                            Pair create = Pair.create(Integer.valueOf(C202309lW.A02(r1, 12)), new AnonymousClass9LA(r1.A05() - 1, r1.A05(), r1.A05(), r1.A03()));
                            sparseArray.put(C36381kD.A04(create), create.second);
                        } else if (r3.A00 == 1835362404) {
                            C202309lW r2 = r3.A00;
                            if (C202309lW.A00(r2) == 0) {
                                j2 = r2.A09();
                            } else {
                                j2 = r2.A0A();
                            }
                        }
                    }
                    SparseArray sparseArray2 = new SparseArray();
                    List list2 = r12.A01;
                    int size2 = list2.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        C1688582h r13 = (C1688582h) list2.get(i14);
                        if (r13.A00 == 1953653099 && (A032 = C201799kP.A03(A002, r13, r12.A01(1836476516), j2, false)) != null) {
                            sparseArray2.put(A032.A00, A032);
                        }
                    }
                    int size3 = sparseArray2.size();
                    SparseArray sparseArray3 = this.A0C;
                    if (sparseArray3.size() != 0) {
                        if (sparseArray3.size() != size3) {
                            z = false;
                        }
                        C200319h9.A02(z);
                        while (i12 < size3) {
                            AnonymousClass9OI r4 = (AnonymousClass9OI) sparseArray2.valueAt(i12);
                            int i15 = r4.A00;
                            C199569fX r22 = (C199569fX) sparseArray3.get(i15);
                            if (sparseArray.size() == 1) {
                                obj3 = sparseArray.valueAt(0);
                            } else {
                                obj3 = sparseArray.get(i15);
                                Objects.requireNonNull(obj3);
                            }
                            AnonymousClass9LA r0 = (AnonymousClass9LA) obj3;
                            Objects.requireNonNull(r4);
                            r22.A05 = r4;
                            Objects.requireNonNull(r0);
                            r22.A04 = r0;
                            r22.A06.B7a(r4.A07);
                            r22.A01();
                            i12++;
                        }
                    } else {
                        while (i12 < size3) {
                            AnonymousClass9OI r11 = (AnonymousClass9OI) sparseArray2.valueAt(i12);
                            C199569fX r42 = new C199569fX(this.A0E.A05(i12));
                            int i16 = r11.A00;
                            if (sparseArray.size() == 1) {
                                obj2 = sparseArray.valueAt(0);
                            } else {
                                obj2 = sparseArray.get(i16);
                                Objects.requireNonNull(obj2);
                            }
                            AnonymousClass9LA r14 = (AnonymousClass9LA) obj2;
                            Objects.requireNonNull(r11);
                            r42.A05 = r11;
                            Objects.requireNonNull(r14);
                            r42.A04 = r14;
                            r42.A06.B7a(r11.A07);
                            r42.A01();
                            sparseArray3.put(i16, r42);
                            this.A08 = Math.max(this.A08, r11.A04);
                            i12++;
                        }
                        if (this.A0J == null) {
                            C23061B2i[] b2iArr = new C23061B2i[2];
                            this.A0J = b2iArr;
                            C23061B2i[] b2iArr2 = (C23061B2i[]) Arrays.copyOf(b2iArr, 0);
                            this.A0J = b2iArr2;
                            for (C23061B2i B7a : b2iArr2) {
                                B7a.B7a(A0U);
                            }
                        }
                        if (this.A0I == null) {
                            List list3 = this.A0S;
                            C23061B2i[] b2iArr3 = new C23061B2i[list3.size()];
                            this.A0I = b2iArr3;
                            for (int i17 = 0; i17 < b2iArr3.length; i17++) {
                                C23061B2i A052 = this.A0E.A05(sparseArray3.size() + 1 + i17);
                                A052.B7a((C207099uY) list3.get(i17));
                                b2iArr3 = this.A0I;
                                b2iArr3[i17] = A052;
                            }
                        }
                        C209379zu r02 = this.A0E;
                        r02.A0G = true;
                        r02.A0P.post(r02.A0V);
                    }
                } else if (i11 == 1836019558) {
                    SparseArray sparseArray4 = this.A0C;
                    byte[] bArr = this.A0T;
                    List list4 = r12.A01;
                    int size4 = list4.size();
                    for (int i18 = 0; i18 < size4; i18++) {
                        C1688582h r7 = (C1688582h) list4.get(i18);
                        if (r7.A00 == 1953653094) {
                            C202309lW r32 = r7.A01(1952868452).A00;
                            int A022 = C202309lW.A02(r32, 8) & 16777215;
                            int A033 = r32.A03();
                            if (sparseArray4.size() == 1) {
                                obj = sparseArray4.valueAt(0);
                            } else {
                                obj = sparseArray4.get(A033);
                            }
                            C199569fX r6 = (C199569fX) obj;
                            if (r6 == null) {
                                continue;
                            } else {
                                if ((A022 & 1) != 0) {
                                    long A0A3 = r32.A0A();
                                    C194089Ob r43 = r6.A07;
                                    r43.A03 = A0A3;
                                    r43.A02 = A0A3;
                                }
                                AnonymousClass9LA r23 = r6.A04;
                                if ((A022 & 2) != 0) {
                                    i = r32.A05() - 1;
                                } else {
                                    i = r23.A02;
                                }
                                if ((A022 & 8) != 0) {
                                    i2 = r32.A05();
                                } else {
                                    i2 = r23.A00;
                                }
                                if ((A022 & 16) != 0) {
                                    i3 = r32.A05();
                                } else {
                                    i3 = r23.A03;
                                }
                                if ((A022 & 32) != 0) {
                                    i4 = r32.A05();
                                } else {
                                    i4 = r23.A01;
                                }
                                C194089Ob r33 = r6.A07;
                                r33.A05 = new AnonymousClass9LA(i, i2, i3, i4);
                                long j3 = r33.A04;
                                r6.A01();
                                if (r7.A01(1952867444) != null) {
                                    C202309lW r44 = r7.A01(1952867444).A00;
                                    if (C202309lW.A00(r44) == 1) {
                                        j3 = r44.A0A();
                                    } else {
                                        j3 = r44.A09();
                                    }
                                }
                                List list5 = r7.A02;
                                int size5 = list5.size();
                                int i19 = 0;
                                int i20 = 0;
                                int i21 = 0;
                                for (int i22 = 0; i22 < size5; i22++) {
                                    C1688482g r9 = (C1688482g) list5.get(i22);
                                    if (r9.A00 == 1953658222) {
                                        C202309lW r8 = r9.A00;
                                        r8.A0I(12);
                                        int A053 = r8.A05();
                                        if (A053 > 0) {
                                            i21 += A053;
                                            i20++;
                                        }
                                    }
                                }
                                r6.A02 = 0;
                                r6.A00 = 0;
                                r6.A01 = 0;
                                r33.A01 = i20;
                                r33.A00 = i21;
                                if (r33.A0A.length < i20) {
                                    r33.A0C = new long[i20];
                                    r33.A0A = new int[i20];
                                }
                                if (r33.A09.length < i21) {
                                    int i23 = (i21 * 125) / 100;
                                    r33.A09 = new int[i23];
                                    r33.A0B = new long[i23];
                                    r33.A0E = new boolean[i23];
                                    r33.A0D = new boolean[i23];
                                }
                                int i24 = 0;
                                for (int i25 = 0; i25 < size5; i25++) {
                                    C1688482g r45 = (C1688482g) list5.get(i25);
                                    if (r45.A00 == 1953658222) {
                                        int i26 = i19 + 1;
                                        C202309lW r15 = r45.A00;
                                        C202309lW r39 = r15;
                                        long j4 = j3;
                                        int A023 = C202309lW.A02(r15, 8) & 16777215;
                                        AnonymousClass9OI r142 = r6.A05;
                                        AnonymousClass9LA r38 = r33.A05;
                                        int[] iArr = r33.A0A;
                                        int A054 = r39.A05();
                                        iArr[i19] = A054;
                                        long[] jArr = r33.A0C;
                                        long[] jArr2 = jArr;
                                        long j5 = r33.A03;
                                        jArr[i19] = j5;
                                        if ((A023 & 1) != 0) {
                                            jArr2[i19] = j5 + ((long) r39.A03());
                                        }
                                        boolean A1P = AnonymousClass000.A1P(A023 & 4);
                                        int i27 = r38.A01;
                                        int i28 = i27;
                                        int i29 = i27;
                                        if (A1P) {
                                            i28 = r39.A05();
                                        }
                                        boolean A1P2 = AnonymousClass000.A1P(A023 & 256);
                                        boolean A1P3 = AnonymousClass000.A1P(A023 & 512);
                                        boolean A1P4 = AnonymousClass000.A1P(A023 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                                        boolean A1P5 = AnonymousClass000.A1P(A023 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                                        long[] jArr3 = r142.A08;
                                        long j6 = 0;
                                        if (jArr3 != null && jArr3.length == 1 && jArr3[0] == 0) {
                                            j6 = r142.A09[0];
                                        }
                                        int[] iArr2 = r33.A09;
                                        long[] jArr4 = r33.A0B;
                                        boolean[] zArr = r33.A0E;
                                        int i30 = i24 + A054;
                                        long j7 = r142.A06;
                                        if (i19 > 0) {
                                            j4 = r33.A04;
                                        }
                                        while (true) {
                                            i6 = i30;
                                            if (i24 >= i6) {
                                                break;
                                            }
                                            if (A1P2) {
                                                i7 = r39.A05();
                                            } else {
                                                i7 = r38.A00;
                                            }
                                            if (A1P3) {
                                                i8 = r39.A05();
                                            } else {
                                                i8 = r38.A03;
                                            }
                                            if (i24 == 0 && A1P) {
                                                A1P = true;
                                                i9 = i28;
                                            } else if (A1P4) {
                                                i9 = r39.A03();
                                            } else {
                                                i9 = i29;
                                            }
                                            if (A1P5) {
                                                i10 = r39.A03();
                                                A1P5 = true;
                                            } else {
                                                A1P5 = false;
                                                i10 = 0;
                                            }
                                            jArr4[i24] = Util.A06((((long) i10) + j4) - j6, j7);
                                            zArr[i24] = AnonymousClass000.A1Q((i9 >> 16) & 1);
                                            iArr2[i24] = i8;
                                            j4 += (long) i7;
                                            i24++;
                                        }
                                        r33.A04 = j4;
                                        i24 = i6;
                                        i19 = i26;
                                    }
                                }
                                AnonymousClass9MC r46 = r6.A05.A0A[r33.A05.A02];
                                C1688482g A012 = r7.A01(1935763834);
                                if (A012 != null) {
                                    C202309lW r10 = A012.A00;
                                    int i31 = r46.A00;
                                    boolean z2 = true;
                                    if ((C202309lW.A02(r10, 8) & 16777215 & 1) == 1) {
                                        r10.A0J(8);
                                    }
                                    int A042 = r10.A04();
                                    int A055 = r10.A05();
                                    int i32 = r33.A00;
                                    if (A055 == i32) {
                                        if (A042 == 0) {
                                            boolean[] zArr2 = r33.A0D;
                                            i5 = 0;
                                            for (int i33 = 0; i33 < A055; i33++) {
                                                int A043 = r10.A04();
                                                i5 += A043;
                                                zArr2[i33] = C90474aD.A1T(A043, i31);
                                            }
                                        } else {
                                            if (A042 <= i31) {
                                                z2 = false;
                                            }
                                            i5 = A042 * A055;
                                            Arrays.fill(r33.A0D, 0, A055, z2);
                                        }
                                        r33.A0F.A0G(i5);
                                        r33.A07 = true;
                                        r33.A08 = true;
                                    } else {
                                        StringBuilder A0u = AnonymousClass000.A0u();
                                        A0u.append("Length mismatch: ");
                                        A0u.append(A055);
                                        throw C187398xn.A00(AnonymousClass000.A0r(", ", A0u, i32));
                                    }
                                }
                                C1688482g A013 = r7.A01(1935763823);
                                if (A013 != null) {
                                    C202309lW r62 = A013.A00;
                                    int A024 = C202309lW.A02(r62, 8);
                                    if ((16777215 & A024 & 1) == 1) {
                                        r62.A0J(8);
                                    }
                                    int A056 = r62.A05();
                                    if (A056 == 1) {
                                        int i34 = (A024 >> 24) & 255;
                                        long j8 = r33.A02;
                                        if (i34 == 0) {
                                            A0A2 = r62.A09();
                                        } else {
                                            A0A2 = r62.A0A();
                                        }
                                        r33.A02 = j8 + A0A2;
                                    } else {
                                        throw C187398xn.A00(AnonymousClass000.A0r("Unexpected saio entry count: ", AnonymousClass000.A0u(), A056));
                                    }
                                }
                                C1688482g A014 = r7.A01(1936027235);
                                if (A014 != null) {
                                    A02(r33, A014.A00, 0);
                                }
                                C1688482g A015 = r7.A01(1935828848);
                                C1688482g A016 = r7.A01(1936158820);
                                if (!(A015 == null || A016 == null)) {
                                    C202309lW r92 = A015.A00;
                                    C202309lW r5 = A016.A00;
                                    if (r46 != null) {
                                        str2 = r46.A02;
                                    } else {
                                        str2 = null;
                                    }
                                    int A025 = C202309lW.A02(r92, 8);
                                    if (r92.A03() == 1936025959) {
                                        if (((A025 >> 24) & 255) == 1) {
                                            r92.A0J(4);
                                        }
                                        if (r92.A03() == 1) {
                                            int A026 = C202309lW.A02(r5, 8);
                                            if (r5.A03() == 1936025959) {
                                                int i35 = (A026 >> 24) & 255;
                                                if (i35 == 1) {
                                                    if (r5.A09() == 0) {
                                                        throw C187398xn.A00("Variable length description in sgpd found (unsupported)");
                                                    }
                                                } else if (i35 >= 2) {
                                                    r5.A0J(4);
                                                }
                                                if (r5.A09() == 1) {
                                                    int A017 = C202309lW.A01(r5, 1);
                                                    int i36 = (A017 & 240) >> 4;
                                                    int i37 = A017 & 15;
                                                    if (r5.A04() == 1) {
                                                        int A044 = r5.A04();
                                                        byte[] bArr2 = new byte[16];
                                                        r5.A0K(bArr2, 0, 16);
                                                        byte[] bArr3 = null;
                                                        if (A044 == 0) {
                                                            int A045 = r5.A04();
                                                            bArr3 = new byte[A045];
                                                            r5.A0K(bArr3, 0, A045);
                                                        }
                                                        r33.A07 = true;
                                                        r33.A06 = new AnonymousClass9MC(str2, bArr2, bArr3, A044, i36, i37, true);
                                                    }
                                                } else {
                                                    throw C187398xn.A00("Entry count in sgpd != 1 (unsupported).");
                                                }
                                            }
                                        } else {
                                            throw C187398xn.A00("Entry count in sbgp != 1 (unsupported).");
                                        }
                                    }
                                }
                                int size6 = list5.size();
                                for (int i38 = 0; i38 < size6; i38++) {
                                    C1688482g r47 = (C1688482g) list5.get(i38);
                                    if (r47.A00 == 1970628964) {
                                        C202309lW r52 = r47.A00;
                                        r52.A0I(8);
                                        byte[] bArr4 = bArr;
                                        r52.A0K(bArr4, 0, 16);
                                        if (Arrays.equals(bArr4, A0W)) {
                                            A02(r33, r52, 16);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C21709AXg A004 = A00(r12.A02);
                    if (A004 != null) {
                        int size7 = sparseArray4.size();
                        for (int i39 = 0; i39 < size7; i39++) {
                            C199569fX r48 = (C199569fX) sparseArray4.valueAt(i39);
                            AnonymousClass9OI r34 = r48.A05;
                            AnonymousClass9MC r16 = r34.A0A[r48.A07.A05.A02];
                            if (r16 != null) {
                                str = r16.A02;
                            } else {
                                str = null;
                            }
                            C23061B2i b2i = r48.A06;
                            C207099uY r49 = r34.A07;
                            if (Util.A0E(A004.A02, str)) {
                                aXg = A004;
                            } else {
                                aXg = new C21709AXg(str, A004.A03);
                            }
                            C199159en r24 = new C199159en(r49);
                            r24.A00(aXg);
                            b2i.B7a(new C207099uY(r24));
                        }
                    }
                    long j9 = this.A0A;
                    if (j9 != -9223372036854775807L) {
                        int size8 = sparseArray4.size();
                        for (int i40 = 0; i40 < size8; i40++) {
                            C199569fX r112 = (C199569fX) sparseArray4.valueAt(i40);
                            int i41 = r112.A01;
                            while (true) {
                                C194089Ob r122 = r112.A07;
                                if (i41 >= r122.A00 || r122.A0B[i41] >= j9) {
                                } else {
                                    if (r122.A0E[i41]) {
                                        r112.A03 = i41;
                                    }
                                    i41++;
                                }
                            }
                        }
                        this.A0A = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((C1688582h) arrayDeque.peek()).A01.add(r12);
                }
            }
        }
        this.A02 = 0;
        this.A00 = 0;
    }

    public static void A02(C194089Ob r5, C202309lW r6, int i) {
        int A022 = C202309lW.A02(r6, i + 8) & 16777215;
        if ((A022 & 1) == 0) {
            boolean A1P = AnonymousClass000.A1P(A022 & 2);
            int A052 = r6.A05();
            int i2 = r5.A00;
            if (A052 == i2) {
                Arrays.fill(r5.A0D, 0, A052, A1P);
                C202309lW r2 = r5.A0F;
                r2.A0G(r6.A00 - r6.A01);
                r5.A07 = true;
                r5.A08 = true;
                r6.A0K(r2.A02, 0, r2.A00);
                r2.A0I(0);
                r5.A08 = false;
                return;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Length mismatch: ");
            A0u.append(A052);
            throw C187398xn.A00(AnonymousClass000.A0r(", ", A0u, i2));
        }
        throw C187398xn.A00("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03f5, code lost:
        if (r6 == 1701671783) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05cf, code lost:
        if (r14 != 3) goto L_0x05d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0764, code lost:
        if (r9.A0D[r4] == false) goto L_0x0766;
     */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x07d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int Bmm(X.C201519jm r30, X.C191039Bi r31) {
        /*
            r29 = this;
        L_0x0000:
            r0 = r29
            int r3 = r0.A02
            r1 = r30
            if (r3 == 0) goto L_0x02a7
            r9 = 1
            if (r3 == r9) goto L_0x00a6
            r11 = 2
            if (r3 == r11) goto L_0x005a
            r8 = 0
            r7 = 3
            r10 = 4
            r12 = 1
            r2 = 0
            if (r3 != r7) goto L_0x046a
            X.9fX r9 = r0.A0D
            if (r9 != 0) goto L_0x06f2
            android.util.SparseArray r15 = r0.A0C
            int r14 = r15.size()
            r9 = 0
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = 0
        L_0x0026:
            if (r13 >= r14) goto L_0x0048
            java.lang.Object r6 = r15.valueAt(r13)
            X.9fX r6 = (X.C199569fX) r6
            int r4 = r6.A02
            X.9Ob r3 = r6.A07
            int r3 = r3.A01
            if (r4 == r3) goto L_0x0045
            X.9Ob r3 = r6.A07
            long[] r4 = r3.A0C
            int r3 = r6.A02
            r4 = r4[r3]
            int r3 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x0045
            r9 = r6
            r16 = r4
        L_0x0045:
            int r13 = r13 + 1
            goto L_0x0026
        L_0x0048:
            if (r9 != 0) goto L_0x06d7
            long r5 = r0.A09
            long r3 = r1.A02
            long r5 = r5 - r3
            int r3 = (int) r5
            if (r3 < 0) goto L_0x0441
            r1.A02(r3)
            r0.A02 = r2
            r0.A00 = r2
            goto L_0x0000
        L_0x005a:
            android.util.SparseArray r11 = r0.A0C
            int r10 = r11.size()
            r4 = 0
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 0
        L_0x0067:
            if (r9 >= r10) goto L_0x0085
            java.lang.Object r2 = r11.valueAt(r9)
            X.9fX r2 = (X.C199569fX) r2
            X.9Ob r3 = r2.A07
            boolean r2 = r3.A08
            if (r2 == 0) goto L_0x0082
            long r7 = r3.A02
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0082
            java.lang.Object r4 = r11.valueAt(r9)
            X.9fX r4 = (X.C199569fX) r4
            r5 = r7
        L_0x0082:
            int r9 = r9 + 1
            goto L_0x0067
        L_0x0085:
            if (r4 != 0) goto L_0x008a
            r1 = 3
            goto L_0x0361
        L_0x008a:
            long r2 = r1.A02
            long r5 = r5 - r2
            int r0 = (int) r5
            if (r0 < 0) goto L_0x07b0
            r1.A02(r0)
            X.9Ob r5 = r4.A07
            X.9lW r4 = r5.A0F
            byte[] r3 = r4.A02
            int r2 = r4.A00
            r0 = 0
            r1.A05(r3, r0, r2, r0)
            r4.A0I(r0)
            r5.A08 = r0
            goto L_0x0000
        L_0x00a6:
            long r2 = r0.A07
            int r5 = (int) r2
            int r2 = r0.A00
            int r5 = r5 - r2
            X.9lW r2 = r0.A0F
            if (r2 == 0) goto L_0x02a2
            byte[] r4 = r2.A02
            r3 = 8
            r2 = 0
            r1.A05(r4, r3, r5, r2)
            int r3 = r0.A01
            X.9lW r2 = r0.A0F
            X.82g r4 = new X.82g
            r4.<init>(r2, r3)
            java.util.ArrayDeque r3 = r0.A0Q
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x00db
            java.lang.Object r2 = r3.peek()
            X.82h r2 = (X.C1688582h) r2
            java.util.List r2 = r2.A02
            r2.add(r4)
        L_0x00d4:
            long r1 = r1.A02
            r0.A01(r1)
            goto L_0x0000
        L_0x00db:
            int r3 = r4.A00
            r2 = 1936286840(0x73696478, float:1.8491255E31)
            if (r3 != r2) goto L_0x0178
            X.9lW r8 = r4.A00
            long r2 = r1.A02
            int r5 = X.C202309lW.A00(r8)
            r4 = 4
            r8.A0J(r4)
            long r24 = r8.A09()
            if (r5 != 0) goto L_0x0147
            long r20 = r8.A09()
            long r4 = r8.A09()
        L_0x00fc:
            long r2 = r2 + r4
            r22 = 1000000(0xf4240, double:4.940656E-318)
            long r18 = com.facebook.android.exoplayer2.util.Util.A07(r20, r22, r24)
            r4 = 2
            r8.A0J(r4)
            int r7 = r8.A06()
            int[] r6 = new int[r7]
            long[] r11 = new long[r7]
            long[] r10 = new long[r7]
            long[] r5 = new long[r7]
            r16 = r18
            r4 = 0
        L_0x0117:
            if (r4 >= r7) goto L_0x0150
            int r15 = r8.A03()
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r12 & r15
            if (r12 != 0) goto L_0x07b7
            long r13 = r8.A09()
            r12 = 2147483647(0x7fffffff, float:NaN)
            r15 = r15 & r12
            r6[r4] = r15
            r11[r4] = r2
            r5[r4] = r16
            long r20 = r20 + r13
            long r14 = com.facebook.android.exoplayer2.util.Util.A07(r20, r22, r24)
            long r12 = r14 - r16
            r10[r4] = r12
            r12 = 4
            r8.A0J(r12)
            r12 = r6[r4]
            long r12 = (long) r12
            long r2 = r2 + r12
            int r4 = r4 + 1
            r16 = r14
            goto L_0x0117
        L_0x0147:
            long r20 = r8.A0A()
            long r4 = r8.A0A()
            goto L_0x00fc
        L_0x0150:
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            X.9zX r2 = new X.9zX
            r2.<init>(r6, r11, r10, r5)
            android.util.Pair r5 = android.util.Pair.create(r3, r2)
            java.lang.Object r2 = r5.first
            long r2 = X.C36431kI.A09(r2)
            r0.A0B = r2
            X.9zu r4 = r0.A0E
            java.lang.Object r2 = r5.second
            X.B29 r2 = (X.B29) r2
            r4.A07 = r2
            android.os.Handler r3 = r4.A0P
            java.lang.Runnable r2 = r4.A0V
            r3.post(r2)
            r0.A0G = r9
            goto L_0x00d4
        L_0x0178:
            r2 = 1701671783(0x656d7367, float:7.0083103E22)
            if (r3 != r2) goto L_0x00d4
            X.B39 r2 = r1.A05
            android.net.Uri r10 = r2.BIj()
            if (r10 == 0) goto L_0x00d4
            X.9lW r6 = r4.A00
            X.B2i[] r2 = r0.A0J
            if (r2 == 0) goto L_0x00d4
            int r2 = r2.length
            if (r2 == 0) goto L_0x00d4
            int r4 = X.C202309lW.A00(r6)
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x01dc
            if (r4 == r9) goto L_0x01ac
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "Skipping unsupported emsg version: "
            java.lang.String r3 = X.AnonymousClass000.A0r(r2, r3, r4)
            java.lang.String r2 = "FragmentedMp4Extractor"
            android.util.Log.w(r2, r3)
            goto L_0x00d4
        L_0x01ac:
            long r4 = r6.A09()
            long r2 = r6.A0A()
            long r2 = com.facebook.android.exoplayer2.util.Util.A06(r2, r4)
            long r17 = r6.A09()
            r19 = 1000(0x3e8, double:4.94E-321)
            r21 = r4
            long r21 = com.facebook.android.exoplayer2.util.Util.A07(r17, r19, r21)
            long r23 = r6.A09()
            java.lang.String r18 = r6.A0B()
            java.util.Objects.requireNonNull(r18)
            java.lang.String r19 = r6.A0B()
            java.util.Objects.requireNonNull(r19)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x020d
        L_0x01dc:
            java.lang.String r18 = r6.A0B()
            java.util.Objects.requireNonNull(r18)
            java.lang.String r19 = r6.A0B()
            java.util.Objects.requireNonNull(r19)
            long r4 = r6.A09()
            long r2 = r6.A09()
            long r8 = com.facebook.android.exoplayer2.util.Util.A06(r2, r4)
            long r2 = r0.A0B
            int r7 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r7 == 0) goto L_0x0229
            long r2 = r2 + r8
        L_0x01fd:
            long r20 = r6.A09()
            r22 = 1000(0x3e8, double:4.94E-321)
            r24 = r4
            long r21 = com.facebook.android.exoplayer2.util.Util.A07(r20, r22, r24)
            long r23 = r6.A09()
        L_0x020d:
            int r7 = r6.A00
            int r4 = r6.A01
            int r7 = r7 - r4
            byte[] r5 = new byte[r7]
            r4 = 0
            r6.A0K(r5, r4, r7)
            X.9zo r7 = new X.9zo
            r20 = r5
            r17 = r7
            r17.<init>(r18, r19, r20, r21, r23)
            X.9dy r5 = r0.A0K
            java.io.ByteArrayOutputStream r12 = r5.A00
            r12.reset()
            goto L_0x022f
        L_0x0229:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01fd
        L_0x022f:
            java.io.DataOutputStream r11 = r5.A01     // Catch:{ IOException -> 0x07be }
            java.lang.String r5 = r7.A03     // Catch:{ IOException -> 0x07be }
            r11.writeBytes(r5)     // Catch:{ IOException -> 0x07be }
            r11.writeByte(r4)     // Catch:{ IOException -> 0x07be }
            java.lang.String r5 = r7.A04     // Catch:{ IOException -> 0x07be }
            if (r5 != 0) goto L_0x023f
            java.lang.String r5 = ""
        L_0x023f:
            r11.writeBytes(r5)     // Catch:{ IOException -> 0x07be }
            r11.writeByte(r4)     // Catch:{ IOException -> 0x07be }
            long r5 = r7.A01     // Catch:{ IOException -> 0x07be }
            X.C198649dy.A00(r11, r5)     // Catch:{ IOException -> 0x07be }
            long r5 = r7.A02     // Catch:{ IOException -> 0x07be }
            X.C198649dy.A00(r11, r5)     // Catch:{ IOException -> 0x07be }
            byte[] r5 = r7.A05     // Catch:{ IOException -> 0x07be }
            r11.write(r5)     // Catch:{ IOException -> 0x07be }
            r11.flush()     // Catch:{ IOException -> 0x07be }
            byte[] r5 = r12.toByteArray()     // Catch:{ IOException -> 0x07be }
            X.9lW r14 = new X.9lW
            r14.<init>((byte[]) r5)
            int r7 = r14.A00
            int r5 = r14.A01
            int r7 = r7 - r5
            X.B2i[] r13 = r0.A0J
            int r12 = r13.length
            r11 = 0
        L_0x0269:
            if (r11 >= r12) goto L_0x027b
            r6 = r13[r11]
            r14.A0I(r4)
            r5 = r6
            X.9za r5 = (X.C209179za) r5
            r5.A01 = r10
            r6.BpC(r14, r7)
            int r11 = r11 + 1
            goto L_0x0269
        L_0x027b:
            int r5 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r5 != 0) goto L_0x0290
            java.util.ArrayDeque r3 = r0.A0R
            X.9GF r2 = new X.9GF
            r2.<init>(r8, r7)
            r3.addLast(r2)
            int r2 = r0.A03
            int r2 = r2 + r7
            r0.A03 = r2
            goto L_0x00d4
        L_0x0290:
            X.B2i[] r6 = r0.A0J
            int r5 = r6.length
        L_0x0293:
            if (r4 >= r5) goto L_0x00d4
            r8 = r6[r4]
            r12 = 0
            r9 = 0
            r10 = 1
            r11 = r7
            r13 = r2
            r8.BpD(r9, r10, r11, r12, r13)
            int r4 = r4 + 1
            goto L_0x0293
        L_0x02a2:
            r1.A02(r5)
            goto L_0x00d4
        L_0x02a7:
            int r2 = r0.A00
            r10 = 8
            r9 = 0
            r11 = 1
            if (r2 != 0) goto L_0x02cc
            X.9lW r4 = r0.A0L
            byte[] r2 = r4.A02
            boolean r2 = r1.A05(r2, r9, r10, r11)
            if (r2 != 0) goto L_0x02bb
            r0 = -1
            return r0
        L_0x02bb:
            r0.A00 = r10
            r4.A0I(r9)
            long r2 = r4.A09()
            r0.A07 = r2
            int r2 = r4.A03()
            r0.A01 = r2
        L_0x02cc:
            long r2 = r0.A07
            r5 = 1
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0313
            X.9lW r3 = r0.A0L
            byte[] r2 = r3.A02
            r1.A05(r2, r10, r10, r9)
            int r2 = r0.A00
            int r2 = r2 + 8
            r0.A00 = r2
            long r4 = r3.A0A()
        L_0x02e5:
            r0.A07 = r4
        L_0x02e7:
            long r7 = r0.A07
            int r12 = r0.A00
            long r5 = (long) r12
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x07d9
            long r3 = r1.A02
            long r1 = r3 - r5
            int r6 = r0.A01
            r5 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r6 != r5) goto L_0x033d
            android.util.SparseArray r12 = r0.A0C
            int r11 = r12.size()
            r10 = 0
        L_0x0302:
            if (r10 >= r11) goto L_0x041f
            java.lang.Object r5 = r12.valueAt(r10)
            X.9fX r5 = (X.C199569fX) r5
            X.9Ob r5 = r5.A07
            r5.A02 = r1
            r5.A03 = r1
            int r10 = r10 + 1
            goto L_0x0302
        L_0x0313:
            r5 = 0
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x02e7
            long r4 = r1.A04
            r6 = -1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0331
            java.util.ArrayDeque r3 = r0.A0Q
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x0331
            java.lang.Object r2 = r3.peek()
            X.82h r2 = (X.C1688582h) r2
            long r4 = r2.A00
        L_0x0331:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x02e7
            long r2 = r1.A02
            long r4 = r4 - r2
            int r2 = r0.A00
            long r2 = (long) r2
            long r4 = r4 + r2
            goto L_0x02e5
        L_0x033d:
            r13 = 1835295092(0x6d646174, float:4.4175247E27)
            r5 = 0
            if (r6 != r13) goto L_0x0365
            r0.A0D = r5
            long r7 = r7 + r1
            r0.A09 = r7
            boolean r3 = r0.A0G
            if (r3 != 0) goto L_0x0360
            X.9zu r6 = r0.A0E
            long r4 = r0.A08
            X.9zW r3 = new X.9zW
            r3.<init>(r4, r1)
            r6.A07 = r3
            android.os.Handler r2 = r6.A0P
            java.lang.Runnable r1 = r6.A0V
            r2.post(r1)
            r0.A0G = r11
        L_0x0360:
            r1 = 2
        L_0x0361:
            r0.A02 = r1
            goto L_0x0000
        L_0x0365:
            r1 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r6 == r1) goto L_0x041f
            r1 = 1953653099(0x7472616b, float:7.681346E31)
            if (r6 == r1) goto L_0x041f
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r6 == r1) goto L_0x041f
            r1 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r6 == r1) goto L_0x041f
            r1 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r6 == r1) goto L_0x041f
            r1 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r6 == r1) goto L_0x041f
            r1 = 1953653094(0x74726166, float:7.6813435E31)
            if (r6 == r1) goto L_0x041f
            r1 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r6 == r1) goto L_0x041f
            r1 = 1701082227(0x65647473, float:6.742798E22)
            if (r6 == r1) goto L_0x041f
            r1 = 1751411826(0x68646c72, float:4.3148E24)
            if (r6 == r1) goto L_0x03f7
            r1 = 1835296868(0x6d646864, float:4.418049E27)
            if (r6 == r1) goto L_0x03f7
            r1 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r6 == r1) goto L_0x03f7
            r1 = 1936286840(0x73696478, float:1.8491255E31)
            if (r6 == r1) goto L_0x03f7
            r1 = 1937011556(0x73747364, float:1.9367383E31)
            if (r6 == r1) goto L_0x03f7
            r1 = 1952867444(0x74666474, float:7.3014264E31)
            if (r6 == r1) goto L_0x03f7
            r1 = 1952868452(0x74666864, float:7.301914E31)
            if (r6 == r1) goto L_0x03f7
            r1 = 1953196132(0x746b6864, float:7.46037E31)
            if (r6 == r1) goto L_0x03f7
            r1 = 1953654136(0x74726578, float:7.6818474E31)
            if (r6 == r1) goto L_0x03f7
            r1 = 1953658222(0x7472756e, float:7.683823E31)
            if (r6 == r1) goto L_0x03f7
            r1 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 == r1) goto L_0x03f7
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            if (r6 == r1) goto L_0x03f7
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r6 == r1) goto L_0x03f7
            r1 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r6 == r1) goto L_0x03f7
            r1 = 1970628964(0x75756964, float:3.1109627E32)
            if (r6 == r1) goto L_0x03f7
            r1 = 1935828848(0x73626770, float:1.7937577E31)
            if (r6 == r1) goto L_0x03f7
            r1 = 1936158820(0x73677064, float:1.8336489E31)
            if (r6 == r1) goto L_0x03f7
            r1 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r6 == r1) goto L_0x03f7
            r1 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r6 == r1) goto L_0x03f7
            r2 = 1701671783(0x656d7367, float:7.0083103E22)
            r1 = 0
            if (r6 != r2) goto L_0x03f8
        L_0x03f7:
            r1 = 1
        L_0x03f8:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 == 0) goto L_0x0418
            if (r12 != r10) goto L_0x07cb
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x07c4
            int r1 = (int) r7
            X.9lW r3 = new X.9lW
            r3.<init>((int) r1)
            r0.A0F = r3
            X.9lW r1 = r0.A0L
            byte[] r2 = r1.A02
            byte[] r1 = r3.A02
            java.lang.System.arraycopy(r2, r9, r1, r9, r10)
        L_0x0414:
            r0.A02 = r11
            goto L_0x0000
        L_0x0418:
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x07d2
            r0.A0F = r5
            goto L_0x0414
        L_0x041f:
            long r3 = r3 + r7
            r1 = 8
            long r3 = r3 - r1
            java.util.ArrayDeque r2 = r0.A0Q
            X.82h r1 = new X.82h
            r1.<init>(r6, r3)
            r2.push(r1)
            long r7 = r0.A07
            int r1 = r0.A00
            long r5 = (long) r1
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x043b
            r0.A01(r3)
            goto L_0x0000
        L_0x043b:
            r0.A02 = r9
            r0.A00 = r9
            goto L_0x0000
        L_0x0441:
            java.lang.String r0 = "Offset to end of mdat was negative."
            X.8xn r0 = X.C187398xn.A00(r0)
            throw r0
        L_0x0448:
            X.9OI r3 = r9.A05
            int r3 = r3.A02
            if (r3 != r12) goto L_0x0456
            r3 = 8
            int r4 = r4 - r3
            r0.A06 = r4
            r1.A02(r3)
        L_0x0456:
            X.9fX r6 = r0.A0D
            X.9MC r3 = X.C199569fX.A00(r6)
            if (r3 != 0) goto L_0x074f
            r3 = 0
        L_0x045f:
            r0.A04 = r3
            int r4 = r0.A06
            int r4 = r4 + r3
            r0.A06 = r4
            r0.A02 = r10
            r0.A05 = r2
        L_0x046a:
            X.9fX r4 = r0.A0D
            X.9Ob r3 = r4.A07
            r28 = r3
            X.9OI r3 = r4.A05
            r27 = r3
            X.B2i r7 = r4.A06
            int r3 = r4.A01
            r19 = r3
            r3 = r28
            long[] r3 = r3.A0B
            r25 = r3[r19]
            r3 = r27
            int r3 = r3.A01
            if (r3 == 0) goto L_0x0645
            X.9lW r9 = r0.A0N
            byte[] r8 = r9.A02
            r8[r2] = r2
            r8[r12] = r2
            r8[r11] = r2
            int r18 = r3 + 1
            int r17 = 4 - r3
        L_0x0494:
            int r3 = r0.A04
            int r4 = r0.A06
            if (r3 >= r4) goto L_0x0656
            int r4 = r0.A05
            if (r4 != 0) goto L_0x04f5
            r4 = r17
            r3 = r18
            r1.A05(r8, r4, r3, r2)
            int r3 = X.C202309lW.A02(r9, r2)
            if (r3 < r12) goto L_0x07a6
            int r3 = r3 + -1
            r0.A05 = r3
            X.9lW r3 = r0.A0O
            r3.A0I(r2)
            r7.BpC(r3, r10)
            r7.BpC(r9, r12)
            X.B2i[] r3 = r0.A0I
            int r3 = r3.length
            if (r3 <= 0) goto L_0x04f3
            r3 = r27
            X.9uY r3 = r3.A07
            java.lang.String r5 = r3.A0S
            byte r6 = r8[r10]
            java.lang.String r3 = "video/avc"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x04d4
            r4 = r6 & 31
            r3 = 6
            if (r4 == r3) goto L_0x04e3
        L_0x04d4:
            java.lang.String r3 = "video/hevc"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x04f3
            r4 = r6 & 126(0x7e, float:1.77E-43)
            int r4 = r4 >> r12
            r3 = 39
            if (r4 != r3) goto L_0x04f3
        L_0x04e3:
            r3 = 1
        L_0x04e4:
            r0.A0H = r3
            int r3 = r0.A04
            int r3 = r3 + 5
            r0.A04 = r3
            int r3 = r0.A06
            int r3 = r3 + r17
            r0.A06 = r3
            goto L_0x0494
        L_0x04f3:
            r3 = 0
            goto L_0x04e4
        L_0x04f5:
            boolean r3 = r0.A0H
            if (r3 == 0) goto L_0x0633
            X.9lW r6 = r0.A0M
            r6.A0G(r4)
            byte[] r3 = r6.A02
            r11 = 0
            r1.A05(r3, r2, r4, r2)
            int r2 = r0.A05
            r7.BpC(r6, r2)
            int r10 = r0.A05
            byte[] r12 = r6.A02
            int r4 = r6.A00
            java.lang.Object r16 = X.C190949Ay.A01
            monitor-enter(r16)
            r15 = 0
            r5 = 0
            r13 = 0
        L_0x0515:
            if (r5 < r4) goto L_0x0533
            int r4 = r4 - r13
            r5 = 0
            r3 = 0
        L_0x051a:
            if (r5 >= r13) goto L_0x0564
            int[] r2 = X.C190949Ay.A00     // Catch:{ all -> 0x07ad }
            r2 = r2[r5]     // Catch:{ all -> 0x07ad }
            int r2 = r2 - r3
            java.lang.System.arraycopy(r12, r3, r12, r11, r2)     // Catch:{ all -> 0x07ad }
            int r11 = r11 + r2
            int r14 = r11 + 1
            r12[r11] = r15     // Catch:{ all -> 0x07ad }
            int r11 = r14 + 1
            r12[r14] = r15     // Catch:{ all -> 0x07ad }
            int r2 = r2 + 3
            int r3 = r3 + r2
            int r5 = r5 + 1
            goto L_0x051a
        L_0x0533:
            int r2 = r4 + -2
            if (r5 >= r2) goto L_0x054c
            byte r2 = r12[r5]     // Catch:{ all -> 0x07ad }
            if (r2 != 0) goto L_0x0549
            int r2 = r5 + 1
            byte r2 = r12[r2]     // Catch:{ all -> 0x07ad }
            if (r2 != 0) goto L_0x0549
            int r2 = r5 + 2
            byte r3 = r12[r2]     // Catch:{ all -> 0x07ad }
            r2 = 3
            if (r3 != r2) goto L_0x0549
            goto L_0x054d
        L_0x0549:
            int r5 = r5 + 1
            goto L_0x0533
        L_0x054c:
            r5 = r4
        L_0x054d:
            if (r5 >= r4) goto L_0x0515
            int[] r3 = X.C190949Ay.A00     // Catch:{ all -> 0x07ad }
            int r2 = r3.length     // Catch:{ all -> 0x07ad }
            if (r2 > r13) goto L_0x055c
            int r2 = r2 * 2
            int[] r3 = java.util.Arrays.copyOf(r3, r2)     // Catch:{ all -> 0x07ad }
            X.C190949Ay.A00 = r3     // Catch:{ all -> 0x07ad }
        L_0x055c:
            int r2 = r13 + 1
            r3[r13] = r5     // Catch:{ all -> 0x07ad }
            int r5 = r5 + 3
            r13 = r2
            goto L_0x0515
        L_0x0564:
            int r2 = r4 - r11
            java.lang.System.arraycopy(r12, r3, r12, r11, r2)     // Catch:{ all -> 0x07ad }
            monitor-exit(r16)     // Catch:{ all -> 0x07ad }
            r2 = r27
            X.9uY r2 = r2.A07
            java.lang.String r3 = r2.A0S
            java.lang.String r2 = "video/hevc"
            boolean r2 = r2.equals(r3)
            r6.A0I(r2)
            r6.A0H(r4)
            X.B2i[] r2 = r0.A0I
            r16 = r2
        L_0x0580:
            int r11 = r6.A00
            int r2 = r6.A01
            int r2 = r11 - r2
            r12 = 1
            if (r2 <= r12) goto L_0x0637
            r4 = 0
        L_0x058a:
            int r2 = r6.A01
            int r2 = r11 - r2
            if (r2 != 0) goto L_0x0628
            r4 = -1
        L_0x0591:
            r13 = 0
        L_0x0592:
            int r2 = r6.A01
            int r2 = r11 - r2
            if (r2 != 0) goto L_0x061d
            r13 = -1
        L_0x0599:
            int r3 = r6.A01
            int r5 = r3 + r13
            r2 = -1
            if (r13 == r2) goto L_0x060f
            int r11 = r11 - r3
            if (r13 > r11) goto L_0x060f
            r2 = 4
            if (r4 != r2) goto L_0x0618
            r2 = 8
            if (r13 < r2) goto L_0x0618
            int r15 = r6.A04()
            int r13 = r6.A06()
            r11 = 49
            if (r13 != r11) goto L_0x060d
            int r4 = r6.A03()
        L_0x05ba:
            int r14 = r6.A04()
            r3 = 47
            if (r13 != r3) goto L_0x05c5
            r6.A0J(r12)
        L_0x05c5:
            r2 = 181(0xb5, float:2.54E-43)
            if (r15 != r2) goto L_0x05d1
            if (r13 == r11) goto L_0x05cd
            if (r13 != r3) goto L_0x05d1
        L_0x05cd:
            r2 = 3
            r3 = 1
            if (r14 == r2) goto L_0x05d2
        L_0x05d1:
            r3 = 0
        L_0x05d2:
            if (r13 != r11) goto L_0x05db
            r2 = 1195456820(0x47413934, float:49465.203)
            if (r4 == r2) goto L_0x05da
            r12 = 0
        L_0x05da:
            r3 = r3 & r12
        L_0x05db:
            if (r3 == 0) goto L_0x0618
            int r11 = r6.A04()
            r2 = r11 & 64
            r4 = 0
            r3 = 1
            if (r2 == 0) goto L_0x0618
            r2 = r11 & 31
            r6.A0J(r3)
            int r12 = r2 * 3
            int r11 = r6.A01
            r2 = r16
            int r3 = r2.length
        L_0x05f3:
            if (r4 >= r3) goto L_0x0618
            r2 = r16[r4]
            r6.A0I(r11)
            r2.BpC(r6, r12)
            r22 = 1
            r24 = 0
            r21 = 0
            r20 = r2
            r23 = r12
            r20.BpD(r21, r22, r23, r24, r25)
            int r4 = r4 + 1
            goto L_0x05f3
        L_0x060d:
            r4 = 0
            goto L_0x05ba
        L_0x060f:
            java.lang.String r3 = "CeaUtil"
            java.lang.String r2 = "Skipping remainder of malformed SEI NAL unit."
            android.util.Log.w(r3, r2)
            int r5 = r6.A00
        L_0x0618:
            r6.A0I(r5)
            goto L_0x0580
        L_0x061d:
            int r3 = r6.A04()
            int r13 = r13 + r3
            r2 = 255(0xff, float:3.57E-43)
            if (r3 == r2) goto L_0x0592
            goto L_0x0599
        L_0x0628:
            int r3 = r6.A04()
            int r4 = r4 + r3
            r2 = 255(0xff, float:3.57E-43)
            if (r3 == r2) goto L_0x058a
            goto L_0x0591
        L_0x0633:
            int r10 = r7.BpB(r1, r4, r2)
        L_0x0637:
            int r2 = r0.A04
            int r2 = r2 + r10
            r0.A04 = r2
            int r2 = r0.A05
            int r2 = r2 - r10
            r0.A05 = r2
            r10 = 4
            r2 = 0
            goto L_0x0494
        L_0x0645:
            int r3 = r0.A04
            int r4 = r0.A06
            if (r3 >= r4) goto L_0x0656
            int r4 = r4 - r3
            int r4 = r7.BpB(r1, r4, r2)
            int r3 = r0.A04
            int r3 = r3 + r4
            r0.A04 = r3
            goto L_0x0645
        L_0x0656:
            r1 = r28
            boolean[] r1 = r1.A0E
            boolean r22 = r1[r19]
            X.9fX r6 = r0.A0D
            X.9MC r3 = X.C199569fX.A00(r6)
            if (r3 == 0) goto L_0x06b0
            r1 = 1073741824(0x40000000, float:2.0)
            r22 = r22 | r1
            X.9UL r5 = r3.A01
        L_0x066a:
            if (r6 == 0) goto L_0x067a
            X.9OI r1 = r6.A05
            if (r1 == 0) goto L_0x067a
            X.9uY r1 = r1.A07
            java.lang.String r3 = r1.A0S
            java.lang.String r1 = "application/x-mp4-vtt"
            if (r3 != r1) goto L_0x067a
            r22 = r22 | 1
        L_0x067a:
            r24 = 0
            r20 = r7
            r21 = r5
            r23 = r4
            r20.BpD(r21, r22, r23, r24, r25)
        L_0x0685:
            java.util.ArrayDeque r3 = r0.A0R
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x06b2
            java.lang.Object r3 = r3.removeFirst()
            X.9GF r3 = (X.AnonymousClass9GF) r3
            int r1 = r0.A03
            int r8 = r3.A00
            int r1 = r1 - r8
            r0.A03 = r1
            long r10 = r3.A01
            long r10 = r10 + r25
            X.B2i[] r4 = r0.A0J
            int r3 = r4.length
            r1 = 0
        L_0x06a2:
            if (r1 >= r3) goto L_0x0685
            r5 = r4[r1]
            int r9 = r0.A03
            r6 = 0
            r7 = 1
            r5.BpD(r6, r7, r8, r9, r10)
            int r1 = r1 + 1
            goto L_0x06a2
        L_0x06b0:
            r5 = 0
            goto L_0x066a
        L_0x06b2:
            X.9fX r5 = r0.A0D
            int r1 = r5.A01
            int r1 = r1 + 1
            r5.A01 = r1
            int r1 = r5.A00
            int r4 = r1 + 1
            r5.A00 = r4
            X.9Ob r1 = r5.A07
            int[] r1 = r1.A0A
            int r3 = r5.A02
            r1 = r1[r3]
            if (r4 != r1) goto L_0x06d3
            int r1 = r3 + 1
            r5.A02 = r1
            r5.A00 = r2
            r1 = 0
            r0.A0D = r1
        L_0x06d3:
            r1 = 3
            r0.A02 = r1
            goto L_0x074d
        L_0x06d7:
            X.9Ob r3 = r9.A07
            long[] r4 = r3.A0C
            int r3 = r9.A02
            r5 = r4[r3]
            long r3 = r1.A02
            long r5 = r5 - r3
            int r3 = (int) r5
            if (r3 >= 0) goto L_0x06ed
            java.lang.String r4 = "FragmentedMp4Extractor"
            java.lang.String r3 = "Ignoring negative offset to sample data."
            android.util.Log.w(r4, r3)
            r3 = 0
        L_0x06ed:
            r1.A02(r3)
            r0.A0D = r9
        L_0x06f2:
            X.9Ob r3 = r9.A07
            int[] r3 = r3.A09
            int r5 = r9.A01
            r4 = r3[r5]
            r0.A06 = r4
            int r3 = r9.A03
            if (r5 >= r3) goto L_0x0448
            r1.A02(r4)
            X.9fX r3 = r0.A0D
            X.9MC r1 = X.C199569fX.A00(r3)
            if (r1 == 0) goto L_0x072b
            X.9Ob r5 = r3.A07
            X.9lW r4 = r5.A0F
            int r1 = r1.A00
            if (r1 == 0) goto L_0x0716
            r4.A0J(r1)
        L_0x0716:
            int r3 = r3.A01
            boolean r1 = r5.A07
            if (r1 == 0) goto L_0x072b
            boolean[] r1 = r5.A0D
            boolean r1 = r1[r3]
            if (r1 == 0) goto L_0x072b
            int r1 = r4.A06()
            int r1 = r1 * 6
            r4.A0J(r1)
        L_0x072b:
            X.9fX r5 = r0.A0D
            int r1 = r5.A01
            int r1 = r1 + 1
            r5.A01 = r1
            int r1 = r5.A00
            int r4 = r1 + 1
            r5.A00 = r4
            X.9Ob r1 = r5.A07
            int[] r1 = r1.A0A
            int r3 = r5.A02
            r1 = r1[r3]
            if (r4 != r1) goto L_0x074b
            int r1 = r3 + 1
            r5.A02 = r1
            r5.A00 = r2
            r0.A0D = r8
        L_0x074b:
            r0.A02 = r7
        L_0x074d:
            r0 = 0
            return r0
        L_0x074f:
            int r7 = r3.A00
            if (r7 == 0) goto L_0x0784
            X.9Ob r3 = r6.A07
            X.9lW r13 = r3.A0F
        L_0x0757:
            X.9Ob r9 = r6.A07
            int r4 = r6.A01
            boolean r3 = r9.A07
            if (r3 == 0) goto L_0x0766
            boolean[] r3 = r9.A0D
            boolean r3 = r3[r4]
            r8 = 1
            if (r3 != 0) goto L_0x0767
        L_0x0766:
            r8 = 0
        L_0x0767:
            X.9lW r5 = r6.A09
            byte[] r4 = r5.A02
            r3 = 0
            if (r8 == 0) goto L_0x0770
            r3 = 128(0x80, float:1.794E-43)
        L_0x0770:
            X.C165587tf.A1T(r4, r3, r7, r2)
            r5.A0I(r2)
            X.B2i r6 = r6.A06
            r6.BpC(r5, r12)
            r6.BpC(r13, r7)
            if (r8 != 0) goto L_0x0790
            int r3 = r7 + 1
            goto L_0x045f
        L_0x0784:
            byte[] r3 = r3.A04
            X.9lW r13 = r6.A08
            int r7 = r3.length
            r13.A02 = r3
            r13.A00 = r7
            r13.A01 = r2
            goto L_0x0757
        L_0x0790:
            X.9lW r5 = r9.A0F
            int r4 = r5.A06()
            r3 = -2
            r5.A0J(r3)
            int r3 = r4 * 6
            int r4 = r3 + 2
            r6.BpC(r5, r4)
            int r3 = r7 + 1
            int r3 = r3 + r4
            goto L_0x045f
        L_0x07a6:
            java.lang.String r0 = "Invalid NAL length"
            X.8xn r0 = X.C187398xn.A00(r0)
            throw r0
        L_0x07ad:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x07ad }
            throw r0
        L_0x07b0:
            java.lang.String r0 = "Offset to encryption data was negative."
            X.8xn r0 = X.C187398xn.A00(r0)
            throw r0
        L_0x07b7:
            java.lang.String r0 = "Unhandled indirect reference"
            X.8xn r0 = X.C187398xn.A00(r0)
            throw r0
        L_0x07be:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)
            throw r0
        L_0x07c4:
            java.lang.String r0 = "Leaf atom with length > 2147483647 (unsupported)."
            X.8xn r0 = X.C187398xn.A00(r0)
            throw r0
        L_0x07cb:
            java.lang.String r0 = "Leaf atom defines extended atom size (unsupported)."
            X.8xn r0 = X.C187398xn.A00(r0)
            throw r0
        L_0x07d2:
            java.lang.String r0 = "Skipping atom with length > 2147483647 (unsupported)."
            X.8xn r0 = X.C187398xn.A00(r0)
            throw r0
        L_0x07d9:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            X.8xn r0 = X.C187398xn.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209079zQ.Bmm(X.9jm, X.9Bi):int");
    }

    public void BpY(long j, long j2) {
        SparseArray sparseArray = this.A0C;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((C199569fX) sparseArray.valueAt(i)).A01();
        }
        this.A0R.clear();
        this.A03 = 0;
        this.A0A = j2;
        this.A0Q.clear();
        this.A02 = 0;
        this.A00 = 0;
    }

    public C209079zQ() {
        byte[] bArr = new byte[16];
        this.A0T = bArr;
        this.A0P = new C202309lW(bArr);
        this.A0Q = new ArrayDeque();
        this.A0R = new ArrayDeque();
        this.A0C = new SparseArray();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A02 = 0;
        this.A00 = 0;
    }

    public static C21709AXg A00(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C1688482g r2 = (C1688482g) list.get(i);
            if (r2.A00 == 1886614376) {
                if (arrayList == null) {
                    arrayList = AnonymousClass001.A0I();
                }
                byte[] bArr = r2.A00.A02;
                C192899Iz A002 = C1893493i.A00(bArr);
                if (A002 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C207069uV((String) null, A002.A01, bArr));
                }
            }
        }
        if (arrayList != null) {
            return new C21709AXg((String) null, (C207069uV[]) arrayList.toArray(new C207069uV[arrayList.size()]));
        }
        return null;
    }

    public void BKL(C209379zu r1) {
        this.A0E = r1;
    }
}
