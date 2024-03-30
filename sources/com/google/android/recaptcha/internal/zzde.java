package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass02R;
import X.C023409w;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165607th;
import X.C165617ti;
import X.C36351kA;
import X.C36371kC;
import X.C36441kJ;
import X.C90504aG;
import java.util.ArrayList;
import java.util.List;

public final class zzde implements zzdd {
    public static final zzde zza = new zzde();

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

    public static final List zzc(Object obj) {
        Object obj2;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int i = 0;
            AnonymousClass00C.A0D(bArr, 0);
            int length = bArr.length;
            if (length != 0) {
                if (length == 1) {
                    return C36371kC.A11(Byte.valueOf(bArr[0]));
                }
                ArrayList A14 = C36441kJ.A14(length);
                do {
                    A14.add(Byte.valueOf(bArr[i]));
                    i++;
                } while (i < length);
                return A14;
            }
        } else {
            if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int i2 = 0;
                AnonymousClass00C.A0D(sArr, 0);
                int length2 = sArr.length;
                if (length2 != 0) {
                    if (length2 != 1) {
                        ArrayList A142 = C36441kJ.A14(length2);
                        do {
                            A142.add(Short.valueOf(sArr[i2]));
                            i2++;
                        } while (i2 < length2);
                        return A142;
                    }
                    obj2 = Short.valueOf(sArr[0]);
                }
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int i3 = 0;
                AnonymousClass00C.A0D(iArr, 0);
                int length3 = iArr.length;
                if (length3 != 0) {
                    if (length3 != 1) {
                        ArrayList A143 = C36441kJ.A14(length3);
                        do {
                            AnonymousClass000.A1F(A143, iArr[i3]);
                            i3++;
                        } while (i3 < length3);
                        return A143;
                    }
                    obj2 = Integer.valueOf(iArr[0]);
                }
            } else if (obj instanceof long[]) {
                return AnonymousClass02R.A0B((long[]) obj);
            } else {
                if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    int i4 = 0;
                    AnonymousClass00C.A0D(fArr, 0);
                    int length4 = fArr.length;
                    if (length4 != 0) {
                        if (length4 != 1) {
                            ArrayList A144 = C36441kJ.A14(length4);
                            do {
                                C165587tf.A1Q(A144, fArr[i4]);
                                i4++;
                            } while (i4 < length4);
                            return A144;
                        }
                        obj2 = Float.valueOf(fArr[0]);
                    }
                } else if (!(obj instanceof double[])) {
                    return null;
                } else {
                    double[] dArr = (double[]) obj;
                    AnonymousClass00C.A0D(dArr, 0);
                    int length5 = dArr.length;
                    if (length5 != 0) {
                        if (length5 != 1) {
                            ArrayList A145 = C36441kJ.A14(length5);
                            int i5 = 0;
                            do {
                                A145.add(Double.valueOf(dArr[i5]));
                                i5++;
                            } while (i5 < length5);
                            return A145;
                        }
                        obj2 = Double.valueOf(dArr[0]);
                    }
                }
            }
            return C36371kC.A11(obj2);
        }
        return C023409w.A00;
    }

    public final Object zzb(Object obj, Object obj2) {
        ArrayList arrayList;
        List<Object> zzc = zzc(obj);
        List<Object> zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(C90504aG.A01(obj), C90504aG.A01(obj2)));
            }
            if (zzc2 != null) {
                arrayList = C36351kA.A0z(zzc2);
                for (Object A01 : zzc2) {
                    arrayList.add(Double.valueOf(Math.pow(C90504aG.A01(A01), C90504aG.A01(obj))));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null) {
            if (obj2 instanceof Number) {
                arrayList = C36351kA.A0z(zzc);
                for (Object A012 : zzc) {
                    arrayList.add(Double.valueOf(Math.pow(C90504aG.A01(A012), C90504aG.A01(obj2))));
                }
                return arrayList.toArray(new Double[0]);
            } else if (zzc2 != null) {
                zzdc.zza(this, zzc.size(), zzc2.size());
                int size = zzc.size();
                Double[] dArr = new Double[size];
                for (int i = 0; i < size; i++) {
                    dArr[i] = Double.valueOf(Math.pow(C90504aG.A01(zzc.get(i)), C90504aG.A01(zzc2.get(i))));
                }
                return dArr;
            }
        }
        throw C165607th.A0M(4, 5);
    }
}
