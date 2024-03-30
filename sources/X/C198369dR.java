package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9dR  reason: invalid class name and case insensitive filesystem */
public final class C198369dR {
    public final C21888AcG A01(C21671AUq... aUqArr) {
        int i;
        C21671AUq[] aUqArr2 = aUqArr;
        int length = aUqArr2.length;
        int i2 = 0;
        ArrayList A15 = C36441kJ.A15(new AnonymousClass0CN(aUqArr2, false));
        AnonymousClass00C.A0D(A15, 0);
        if (A15.size() > 1) {
            Collections.sort(A15);
        }
        ArrayList A14 = C36441kJ.A14(length);
        for (int i3 = 0; i3 < length; i3++) {
            AnonymousClass000.A1F(A14, -1);
        }
        Object[] array = A14.toArray(new Integer[0]);
        if (array != null) {
            Integer[] numArr = (Integer[]) array;
            ArrayList A03 = AnonymousClass03T.A03(Arrays.copyOf(numArr, numArr.length));
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                A03.set(AnonymousClass03T.A01(aUqArr[i4], A15, A15.size()), Integer.valueOf(i5));
                i4++;
                i5++;
            }
            if (((C21671AUq) A15.get(0)).A01() > 0) {
                int i6 = 0;
                while (i6 < A15.size()) {
                    C21671AUq aUq = (C21671AUq) A15.get(i6);
                    int i7 = i6 + 1;
                    int i8 = i7;
                    while (i8 < A15.size()) {
                        C21671AUq aUq2 = (C21671AUq) A15.get(i8);
                        AnonymousClass00C.A0C(aUq, 0);
                        C21671AUq aUq3 = C196989at.A00;
                        if (!aUq2.A03(aUq, aUq.A01())) {
                            continue;
                            break;
                        } else if (aUq2.A01() == aUq.A01()) {
                            throw C90464aC.A0P(aUq2, "duplicate option: ", AnonymousClass000.A0u());
                        } else if (AnonymousClass000.A0I(A03.get(i8)) > AnonymousClass000.A0I(A03.get(i6))) {
                            A15.remove(i8);
                            A03.remove(i8);
                        } else {
                            i8++;
                        }
                    }
                    i6 = i7;
                }
                AU1 au1 = new AU1();
                ArrayList arrayList = A15;
                ArrayList arrayList2 = A03;
                A00(arrayList, arrayList2, au1, 0, 0, A15.size(), 0);
                int[] iArr = new int[((int) (au1.A00 / ((long) 4)))];
                while (true) {
                    long j = au1.A00;
                    if (j == 0) {
                        return new C21888AcG(iArr, (C21671AUq[]) aUqArr2.clone());
                    }
                    int i9 = i2 + 1;
                    if (j >= 4) {
                        C200069gY r4 = au1.A01;
                        if (r4 == null) {
                            throw C165567td.A0T();
                        }
                        int i10 = r4.A01;
                        int i11 = r4.A00;
                        if (((long) (i11 - i10)) < 4) {
                            i = ((au1.A00() & 255) << 24) | ((au1.A00() & 255) << 16) | ((au1.A00() & 255) << 8) | (au1.A00() & 255);
                        } else {
                            byte[] bArr = r4.A06;
                            int i12 = i10 + 1;
                            int i13 = i12 + 1;
                            int i14 = i13 + 1;
                            int A08 = C165597tg.A08(bArr, i13, C165607th.A0B(bArr, i12, (bArr[i10] & 255) << 24));
                            int i15 = i14 + 1;
                            i = A08 | (bArr[i14] & 255);
                            au1.A00 = j - 4;
                            if (i15 == i11) {
                                C200069gY.A00(au1, r4);
                            } else {
                                r4.A01 = i15;
                            }
                        }
                        iArr[i2] = i;
                        i2 = i9;
                    } else {
                        throw C165617ti.A0T();
                    }
                }
            } else {
                throw AnonymousClass001.A08("the empty byte string is not a supported option");
            }
        } else {
            throw new AnonymousClass0Nc("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    private final void A00(List list, List list2, AU1 au1, int i, int i2, int i3, long j) {
        int i4;
        int i5 = i3;
        int i6 = i;
        int i7 = i2;
        if (AnonymousClass000.A1T(i7, i5)) {
            int i8 = i7;
            while (true) {
                List list3 = list;
                if (i8 >= i5) {
                    C21671AUq aUq = (C21671AUq) list3.get(i7);
                    C21671AUq aUq2 = (C21671AUq) list3.get(i3 - 1);
                    List list4 = list2;
                    if (i6 == aUq.A01()) {
                        i4 = C36351kA.A06(list4, i7);
                        i7 = i2 + 1;
                        aUq = (C21671AUq) list3.get(i7);
                    } else {
                        i4 = -1;
                    }
                    AU1 au12 = au1;
                    if (aUq.A00(i6) != aUq2.A00(i6)) {
                        int i9 = 1;
                        for (int i10 = i7 + 1; i10 < i5; i10++) {
                            if (((C21671AUq) list3.get(i10 - 1)).A00(i6) != ((C21671AUq) list3.get(i10)).A00(i6)) {
                                i9++;
                            }
                        }
                        long j2 = (long) 4;
                        long j3 = j + (au12.A00 / j2) + ((long) 2) + ((long) (i9 * 2));
                        au12.A05(i9);
                        au12.A05(i4);
                        for (int i11 = i7; i11 < i5; i11++) {
                            byte A00 = ((C21671AUq) list3.get(i11)).A00(i6);
                            if (i11 == i7 || A00 != ((C21671AUq) list3.get(i11 - 1)).A00(i6)) {
                                au12.A05(A00 & 255);
                            }
                        }
                        AU1 au13 = new AU1();
                        while (i7 < i5) {
                            byte A002 = ((C21671AUq) list3.get(i7)).A00(i6);
                            int i12 = i7 + 1;
                            int i13 = i12;
                            while (true) {
                                if (i13 < i5) {
                                    if (A002 != ((C21671AUq) list3.get(i13)).A00(i6)) {
                                        break;
                                    }
                                    i13++;
                                } else {
                                    i13 = i5;
                                    break;
                                }
                            }
                            if (i12 == i13 && i + 1 == ((C21671AUq) list3.get(i7)).A01()) {
                                au12.A05(C36351kA.A06(list4, i7));
                            } else {
                                au12.A05(-((int) (j3 + (au13.A00 / j2))));
                                A00(list3, list4, au13, i + 1, i7, i13, j3);
                            }
                            i7 = i13;
                        }
                        do {
                        } while (au13.Bmp(au12, (long) DefaultCrypto.BUFFER_SIZE) != -1);
                        return;
                    }
                    int min = Math.min(aUq.A01(), aUq2.A01());
                    int i14 = i6;
                    int i15 = 0;
                    while (i14 < min && aUq.A00(i14) == aUq2.A00(i14)) {
                        i15++;
                        i14++;
                    }
                    long j4 = (long) 4;
                    long j5 = j + (au12.A00 / j4) + ((long) 2) + ((long) i15) + 1;
                    au12.A05(-i15);
                    au12.A05(i4);
                    int i16 = i + i15;
                    while (i6 < i16) {
                        au12.A05(aUq.A00(i6) & 255);
                        i6++;
                    }
                    if (i7 + 1 != i5) {
                        AU1 au14 = new AU1();
                        au12.A05(-((int) ((au14.A00 / j4) + j5)));
                        A00(list3, list4, au14, i16, i7, i5, j5);
                        do {
                        } while (au14.Bmp(au12, (long) DefaultCrypto.BUFFER_SIZE) != -1);
                        return;
                    } else if (i16 == ((C21671AUq) list3.get(i7)).A01()) {
                        au12.A05(C36351kA.A06(list4, i7));
                        return;
                    } else {
                        throw AnonymousClass001.A09("Check failed.");
                    }
                } else if (((C21671AUq) list3.get(i8)).A01() >= i6) {
                    i8++;
                } else {
                    throw AnonymousClass001.A08("Failed requirement.");
                }
            }
        } else {
            throw AnonymousClass001.A08("Failed requirement.");
        }
    }
}
