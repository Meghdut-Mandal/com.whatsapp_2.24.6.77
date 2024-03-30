package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass0S4;
import X.C007103b;
import X.C15020mZ;
import X.C15040mb;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165607th;
import X.C165617ti;
import X.C36351kA;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C90504aG;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

public final class zzdn implements zzdd {
    public static final zzdn zza = new zzdn();

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
                try {
                    zzcj.zze.zzf(i, zzb(A0S, A0e));
                } catch (ArithmeticException e) {
                    throw C165617ti.A0E(e, 4, 6);
                }
            } else {
                throw C165617ti.A0E((Throwable) null, 4, 5);
            }
        } else {
            throw C165577te.A0N();
        }
    }

    private final Object zzb(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z3 = obj instanceof Byte;
        if ((z3 && (obj2 instanceof Byte)) || ((((z = obj instanceof Short)) && (obj2 instanceof Short)) || (((z2 = obj instanceof Integer)) && (obj2 instanceof Integer)))) {
            return Integer.valueOf(AnonymousClass000.A0I(obj) % AnonymousClass000.A0I(obj2));
        }
        boolean z4 = obj instanceof Long;
        if (z4 && (obj2 instanceof Long)) {
            return Long.valueOf(C36431kI.A09(obj) % C36431kI.A09(obj2));
        }
        boolean z5 = obj instanceof Float;
        if (z5 && (obj2 instanceof Float)) {
            return Float.valueOf(C36441kJ.A03(obj) % C36441kJ.A03(obj2));
        }
        boolean z6 = obj instanceof Double;
        if (z6 && (obj2 instanceof Double)) {
            return Double.valueOf(C90504aG.A01(obj) % C90504aG.A01(obj2));
        }
        int i = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                Charset charset = AnonymousClass0S4.A05;
                byte[] bytes = ((String) obj).getBytes(charset);
                int length = bytes.length;
                ArrayList A14 = C36441kJ.A14(length);
                while (i < length) {
                    A14.add(Byte.valueOf((byte) (bytes[i] % AnonymousClass000.A0I(obj2))));
                    i++;
                }
                return new String(C007103b.A0l(A14), charset);
            } else if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                arrayList = C36441kJ.A14(length2);
                while (i < length2) {
                    AnonymousClass000.A1F(arrayList, charArray[i] % AnonymousClass000.A0I(obj2));
                    i++;
                }
                return C007103b.A0m(arrayList);
            }
        }
        if (z3 && (obj2 instanceof byte[])) {
            ArrayList A142 = C36441kJ.A14(r4);
            for (byte A0I : (byte[]) obj2) {
                AnonymousClass000.A1F(A142, A0I % AnonymousClass000.A0I(obj));
            }
            return A142.toArray(new Integer[0]);
        } else if (z && (obj2 instanceof short[])) {
            ArrayList A143 = C36441kJ.A14(r4);
            for (short A0I2 : (short[]) obj2) {
                AnonymousClass000.A1F(A143, A0I2 % AnonymousClass000.A0I(obj));
            }
            return A143.toArray(new Integer[0]);
        } else if (!z2 || !(obj2 instanceof int[])) {
            if (z4 && (obj2 instanceof long[])) {
                arrayList2 = C36441kJ.A14(r7);
                for (long A09 : (long[]) obj2) {
                    C36391kE.A1W(arrayList2, A09 % C36431kI.A09(obj));
                }
            } else if (!z5 || !(obj2 instanceof float[])) {
                if (!z6 || !(obj2 instanceof double[])) {
                    boolean z7 = obj instanceof byte[];
                    if (!z7 || !(obj2 instanceof Byte)) {
                        boolean z8 = obj instanceof short[];
                        if (!z8 || !(obj2 instanceof Short)) {
                            boolean z9 = obj instanceof int[];
                            if (!z9 || !(obj2 instanceof Integer)) {
                                boolean z10 = obj instanceof long[];
                                if (!z10 || !(obj2 instanceof Long)) {
                                    boolean z11 = obj instanceof float[];
                                    if (!z11 || !(obj2 instanceof Float)) {
                                        boolean z12 = obj instanceof double[];
                                        if (z12 && (obj2 instanceof Double)) {
                                            arrayList3 = C36441kJ.A14(r7);
                                            for (double A01 : (double[]) obj) {
                                                arrayList3.add(Double.valueOf(A01 % C90504aG.A01(obj2)));
                                            }
                                        } else if (z7 && (obj2 instanceof byte[])) {
                                            byte[] bArr = (byte[]) obj;
                                            int length3 = bArr.length;
                                            byte[] bArr2 = (byte[]) obj2;
                                            zzdc.zza(this, length3, bArr2.length);
                                            C15020mZ A05 = C15040mb.A05(0, length3);
                                            ArrayList A0z = C36351kA.A0z(A05);
                                            Iterator it = A05.iterator();
                                            while (it.hasNext()) {
                                                int A052 = C165617ti.A05(it);
                                                AnonymousClass000.A1F(A0z, bArr[A052] % bArr2[A052]);
                                            }
                                            return A0z.toArray(new Integer[0]);
                                        } else if (z8 && (obj2 instanceof short[])) {
                                            short[] sArr = (short[]) obj;
                                            int length4 = sArr.length;
                                            short[] sArr2 = (short[]) obj2;
                                            zzdc.zza(this, length4, sArr2.length);
                                            C15020mZ A053 = C15040mb.A05(0, length4);
                                            ArrayList A0z2 = C36351kA.A0z(A053);
                                            Iterator it2 = A053.iterator();
                                            while (it2.hasNext()) {
                                                int A054 = C165617ti.A05(it2);
                                                AnonymousClass000.A1F(A0z2, sArr[A054] % sArr2[A054]);
                                            }
                                            return A0z2.toArray(new Integer[0]);
                                        } else if (z9 && (obj2 instanceof int[])) {
                                            int[] iArr = (int[]) obj;
                                            int length5 = iArr.length;
                                            int[] iArr2 = (int[]) obj2;
                                            zzdc.zza(this, length5, iArr2.length);
                                            C15020mZ A055 = C15040mb.A05(0, length5);
                                            ArrayList A0z3 = C36351kA.A0z(A055);
                                            Iterator it3 = A055.iterator();
                                            while (it3.hasNext()) {
                                                int A056 = C165617ti.A05(it3);
                                                AnonymousClass000.A1F(A0z3, iArr[A056] % iArr2[A056]);
                                            }
                                            return A0z3.toArray(new Integer[0]);
                                        } else if (z10 && (obj2 instanceof long[])) {
                                            long[] jArr = (long[]) obj;
                                            int length6 = jArr.length;
                                            long[] jArr2 = (long[]) obj2;
                                            zzdc.zza(this, length6, jArr2.length);
                                            C15020mZ A057 = C15040mb.A05(0, length6);
                                            arrayList2 = C36351kA.A0z(A057);
                                            Iterator it4 = A057.iterator();
                                            while (it4.hasNext()) {
                                                int A058 = C165617ti.A05(it4);
                                                C36391kE.A1W(arrayList2, jArr[A058] % jArr2[A058]);
                                            }
                                        } else if (z11 && (obj2 instanceof float[])) {
                                            float[] fArr = (float[]) obj;
                                            int length7 = fArr.length;
                                            float[] fArr2 = (float[]) obj2;
                                            zzdc.zza(this, length7, fArr2.length);
                                            C15020mZ A059 = C15040mb.A05(0, length7);
                                            ArrayList A0z4 = C36351kA.A0z(A059);
                                            Iterator it5 = A059.iterator();
                                            while (it5.hasNext()) {
                                                int A0510 = C165617ti.A05(it5);
                                                C165587tf.A1Q(A0z4, fArr[A0510] % fArr2[A0510]);
                                            }
                                            return A0z4.toArray(new Float[0]);
                                        } else if (!z12 || !(obj2 instanceof double[])) {
                                            throw C165607th.A0M(4, 5);
                                        } else {
                                            double[] dArr = (double[]) obj;
                                            int length8 = dArr.length;
                                            double[] dArr2 = (double[]) obj2;
                                            zzdc.zza(this, length8, dArr2.length);
                                            C15020mZ A0511 = C15040mb.A05(0, length8);
                                            arrayList3 = C36351kA.A0z(A0511);
                                            Iterator it6 = A0511.iterator();
                                            while (it6.hasNext()) {
                                                int A0512 = C165617ti.A05(it6);
                                                arrayList3.add(Double.valueOf(dArr[A0512] % dArr2[A0512]));
                                            }
                                        }
                                    } else {
                                        ArrayList A144 = C36441kJ.A14(r4);
                                        for (float A03 : (float[]) obj) {
                                            C165587tf.A1Q(A144, A03 % C36441kJ.A03(obj2));
                                        }
                                        return A144.toArray(new Float[0]);
                                    }
                                } else {
                                    arrayList2 = C36441kJ.A14(r7);
                                    for (long A092 : (long[]) obj) {
                                        C36391kE.A1W(arrayList2, A092 % C36431kI.A09(obj2));
                                    }
                                }
                            } else {
                                int[] iArr3 = (int[]) obj;
                                int length9 = iArr3.length;
                                arrayList = C36441kJ.A14(length9);
                                while (i < length9) {
                                    AnonymousClass000.A1F(arrayList, iArr3[i] % AnonymousClass000.A0I(obj2));
                                    i++;
                                }
                                return C007103b.A0m(arrayList);
                            }
                        } else {
                            ArrayList A145 = C36441kJ.A14(r4);
                            for (short A0I3 : (short[]) obj) {
                                AnonymousClass000.A1F(A145, A0I3 % AnonymousClass000.A0I(obj2));
                            }
                            return A145.toArray(new Integer[0]);
                        }
                    } else {
                        ArrayList A146 = C36441kJ.A14(r4);
                        for (byte A0I4 : (byte[]) obj) {
                            AnonymousClass000.A1F(A146, A0I4 % AnonymousClass000.A0I(obj2));
                        }
                        return A146.toArray(new Integer[0]);
                    }
                } else {
                    arrayList3 = C36441kJ.A14(r7);
                    for (double A012 : (double[]) obj2) {
                        arrayList3.add(Double.valueOf(A012 % C90504aG.A01(obj)));
                    }
                }
                return arrayList3.toArray(new Double[0]);
            } else {
                ArrayList A147 = C36441kJ.A14(r4);
                for (float A032 : (float[]) obj2) {
                    C165587tf.A1Q(A147, A032 % C36441kJ.A03(obj));
                }
                return A147.toArray(new Float[0]);
            }
            return arrayList2.toArray(new Long[0]);
        } else {
            ArrayList A148 = C36441kJ.A14(r4);
            for (int A0I5 : (int[]) obj2) {
                AnonymousClass000.A1F(A148, A0I5 % AnonymousClass000.A0I(obj));
            }
            return A148.toArray(new Integer[0]);
        }
    }
}
