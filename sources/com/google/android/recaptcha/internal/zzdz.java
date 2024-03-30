package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass0S4;
import X.C007103b;
import X.C15020mZ;
import X.C15040mb;
import X.C165567td;
import X.C165577te;
import X.C165607th;
import X.C165617ti;
import X.C36351kA;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import java.util.ArrayList;
import java.util.Iterator;

public final class zzdz implements zzdd {
    public static final zzdz zza = new zzdz();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 2) {
            Object A0S = C165567td.A0S(zzcj, zzpqArr);
            if (true != (A0S instanceof Object)) {
                A0S = null;
            }
            if (A0S != null) {
                Object A0e = C165577te.A0e(zzcj, zzpqArr, 1);
                if (true != (A0e instanceof Object) || A0e == null) {
                    throw C165617ti.A0E((Throwable) null, 4, 5);
                }
                zzcj.zze.zzf(i, zzb(A0S, A0e));
                return;
            }
            throw C165617ti.A0E((Throwable) null, 4, 5);
        }
        throw C165577te.A0N();
    }

    public final Object zzb(Object obj, Object obj2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z = obj instanceof Byte;
        if (z && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z2 = obj instanceof Short;
        if (z2 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z3 = obj instanceof Integer;
        if (z3 && (obj2 instanceof Integer)) {
            return Integer.valueOf(AnonymousClass000.A0I(obj) ^ AnonymousClass000.A0I(obj2));
        }
        boolean z4 = obj instanceof Long;
        if (!z4 || !(obj2 instanceof Long)) {
            int i = 0;
            if (obj instanceof String) {
                if (obj2 instanceof Byte) {
                    byte[] bytes = ((String) obj).getBytes(AnonymousClass0S4.A05);
                    int length = bytes.length;
                    ArrayList A14 = C36441kJ.A14(length);
                    while (i < length) {
                        C165607th.A1K(obj2, A14, bytes, i);
                        i++;
                    }
                    return C007103b.A0l(A14);
                } else if (obj2 instanceof Integer) {
                    char[] charArray = ((String) obj).toCharArray();
                    int length2 = charArray.length;
                    ArrayList A142 = C36441kJ.A14(length2);
                    while (i < length2) {
                        AnonymousClass000.A1F(A142, charArray[i] ^ AnonymousClass000.A0I(obj2));
                        i++;
                    }
                    return C007103b.A0m(A142);
                }
            }
            if (z && (obj2 instanceof byte[])) {
                byte[] bArr = (byte[]) obj2;
                int length3 = bArr.length;
                arrayList = C36441kJ.A14(length3);
                for (int i2 = 0; i2 < length3; i2++) {
                    C165607th.A1K(obj, arrayList, bArr, i2);
                }
            } else if (z2 && (obj2 instanceof short[])) {
                ArrayList A143 = C36441kJ.A14(r4);
                for (short shortValue : (short[]) obj2) {
                    A143.add(Short.valueOf((short) (shortValue ^ ((Number) obj).shortValue())));
                }
                return A143.toArray(new Short[0]);
            } else if (!z3 || !(obj2 instanceof int[])) {
                if (!z4 || !(obj2 instanceof long[])) {
                    boolean z5 = obj instanceof byte[];
                    if (!z5 || !(obj2 instanceof Byte)) {
                        boolean z6 = obj instanceof short[];
                        if (!z6 || !(obj2 instanceof Short)) {
                            boolean z7 = obj instanceof int[];
                            if (!z7 || !(obj2 instanceof Integer)) {
                                boolean z8 = obj instanceof long[];
                                if (z8 && (obj2 instanceof Long)) {
                                    arrayList2 = C36441kJ.A14(r7);
                                    for (long A09 : (long[]) obj) {
                                        C36391kE.A1W(arrayList2, A09 ^ C36431kI.A09(obj2));
                                    }
                                } else if (z5 && (obj2 instanceof byte[])) {
                                    byte[] bArr2 = (byte[]) obj;
                                    int length4 = bArr2.length;
                                    byte[] bArr3 = (byte[]) obj2;
                                    zzdc.zza(this, length4, bArr3.length);
                                    C15020mZ A05 = C15040mb.A05(0, length4);
                                    ArrayList A0z = C36351kA.A0z(A05);
                                    Iterator it = A05.iterator();
                                    while (it.hasNext()) {
                                        int A052 = C165617ti.A05(it);
                                        A0z.add(Byte.valueOf((byte) (bArr3[A052] ^ bArr2[A052])));
                                    }
                                    return A0z.toArray(new Byte[0]);
                                } else if (z6 && (obj2 instanceof short[])) {
                                    short[] sArr = (short[]) obj;
                                    int length5 = sArr.length;
                                    short[] sArr2 = (short[]) obj2;
                                    zzdc.zza(this, length5, sArr2.length);
                                    C15020mZ A053 = C15040mb.A05(0, length5);
                                    ArrayList A0z2 = C36351kA.A0z(A053);
                                    Iterator it2 = A053.iterator();
                                    while (it2.hasNext()) {
                                        int A054 = C165617ti.A05(it2);
                                        A0z2.add(Short.valueOf((short) (sArr2[A054] ^ sArr[A054])));
                                    }
                                    return A0z2.toArray(new Short[0]);
                                } else if (z7 && (obj2 instanceof int[])) {
                                    int[] iArr = (int[]) obj;
                                    int length6 = iArr.length;
                                    int[] iArr2 = (int[]) obj2;
                                    zzdc.zza(this, length6, iArr2.length);
                                    C15020mZ A055 = C15040mb.A05(0, length6);
                                    ArrayList A0z3 = C36351kA.A0z(A055);
                                    Iterator it3 = A055.iterator();
                                    while (it3.hasNext()) {
                                        int A056 = C165617ti.A05(it3);
                                        AnonymousClass000.A1F(A0z3, iArr2[A056] ^ iArr[A056]);
                                    }
                                    return A0z3.toArray(new Integer[0]);
                                } else if (!z8 || !(obj2 instanceof long[])) {
                                    throw C165607th.A0M(4, 5);
                                } else {
                                    long[] jArr = (long[]) obj;
                                    int length7 = jArr.length;
                                    long[] jArr2 = (long[]) obj2;
                                    zzdc.zza(this, length7, jArr2.length);
                                    C15020mZ A057 = C15040mb.A05(0, length7);
                                    arrayList2 = C36351kA.A0z(A057);
                                    Iterator it4 = A057.iterator();
                                    while (it4.hasNext()) {
                                        int A058 = C165617ti.A05(it4);
                                        C36391kE.A1W(arrayList2, jArr[A058] ^ jArr2[A058]);
                                    }
                                }
                            } else {
                                ArrayList A144 = C36441kJ.A14(r4);
                                for (int A0I : (int[]) obj) {
                                    AnonymousClass000.A1F(A144, A0I ^ AnonymousClass000.A0I(obj2));
                                }
                                return A144.toArray(new Integer[0]);
                            }
                        } else {
                            ArrayList A145 = C36441kJ.A14(r4);
                            for (short shortValue2 : (short[]) obj) {
                                A145.add(Short.valueOf((short) (shortValue2 ^ ((Number) obj2).shortValue())));
                            }
                            return A145.toArray(new Short[0]);
                        }
                    } else {
                        byte[] bArr4 = (byte[]) obj;
                        int length8 = bArr4.length;
                        arrayList = C36441kJ.A14(length8);
                        for (int i3 = 0; i3 < length8; i3++) {
                            C165607th.A1K(obj2, arrayList, bArr4, i3);
                        }
                    }
                } else {
                    arrayList2 = C36441kJ.A14(r7);
                    for (long A092 : (long[]) obj2) {
                        C36391kE.A1W(arrayList2, A092 ^ C36431kI.A09(obj));
                    }
                }
                return arrayList2.toArray(new Long[0]);
            } else {
                ArrayList A146 = C36441kJ.A14(r4);
                for (int A0I2 : (int[]) obj2) {
                    AnonymousClass000.A1F(A146, A0I2 ^ AnonymousClass000.A0I(obj));
                }
                return A146.toArray(new Integer[0]);
            }
            return arrayList.toArray(new Byte[0]);
        }
        return Long.valueOf(C36431kI.A09(obj2) ^ C36431kI.A09(obj));
    }
}
