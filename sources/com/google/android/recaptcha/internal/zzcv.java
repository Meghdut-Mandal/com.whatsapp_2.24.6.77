package com.google.android.recaptcha.internal;

import X.AnonymousClass02R;
import X.C006302t;
import X.C007103b;
import X.C165567td;
import X.C165577te;
import X.C165607th;
import X.C165617ti;
import X.C36341k9;
import X.C36381kD;
import java.util.Collection;

public final class zzcv implements zzdd {
    public static final zzcv zza = new zzcv();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        StringBuilder sb;
        String A0y;
        String str;
        String str2;
        StringBuilder A0i;
        if (zzpqArr.length == 1) {
            Object A0S = C165567td.A0S(zzcj, zzpqArr);
            if (true != (A0S instanceof Object)) {
                A0S = null;
            }
            if (A0S != null) {
                if (A0S instanceof int[]) {
                    int[] iArr = (int[]) A0S;
                    str = "]";
                    sb = C36341k9.A0i(iArr);
                    sb.append("[");
                    int i2 = 0;
                    for (int i3 : iArr) {
                        i2++;
                        if (i2 > 1) {
                            sb.append(",");
                        }
                        sb.append(String.valueOf(i3));
                    }
                    sb.append(str);
                    A0y = C36381kD.A0y(sb);
                } else if (A0S instanceof byte[]) {
                    A0y = C165607th.A0w((byte[]) A0S);
                } else {
                    if (A0S instanceof long[]) {
                        long[] jArr = (long[]) A0S;
                        str2 = "]";
                        A0i = C36341k9.A0i(jArr);
                        A0i.append("[");
                        int i4 = 0;
                        for (long j : jArr) {
                            i4++;
                            if (i4 > 1) {
                                A0i.append(",");
                            }
                            A0i.append(String.valueOf(j));
                        }
                    } else {
                        if (A0S instanceof short[]) {
                            short[] sArr = (short[]) A0S;
                            str = "]";
                            sb = C36341k9.A0i(sArr);
                            sb.append("[");
                            int i5 = 0;
                            for (short s : sArr) {
                                i5++;
                                if (i5 > 1) {
                                    sb.append(",");
                                }
                                sb.append(String.valueOf(s));
                            }
                        } else if (A0S instanceof float[]) {
                            float[] fArr = (float[]) A0S;
                            str = "]";
                            sb = C36341k9.A0i(fArr);
                            sb.append("[");
                            int i6 = 0;
                            for (float f : fArr) {
                                i6++;
                                if (i6 > 1) {
                                    sb.append(",");
                                }
                                sb.append(String.valueOf(f));
                            }
                        } else if (A0S instanceof double[]) {
                            double[] dArr = (double[]) A0S;
                            str2 = "]";
                            A0i = C36341k9.A0i(dArr);
                            A0i.append("[");
                            int i7 = 0;
                            for (double d : dArr) {
                                i7++;
                                if (i7 > 1) {
                                    A0i.append(",");
                                }
                                A0i.append(String.valueOf(d));
                            }
                        } else if (A0S instanceof char[]) {
                            A0y = new String((char[]) A0S);
                        } else if (A0S instanceof Object[]) {
                            A0y = AnonymousClass02R.A09(",", "[", "]", (Object[]) A0S);
                        } else if (A0S instanceof Collection) {
                            A0y = C007103b.A0Q(",", "[", "]", (Iterable) A0S, (C006302t) null);
                        } else {
                            throw C165617ti.A0E((Throwable) null, 4, 5);
                        }
                        sb.append(str);
                        A0y = C36381kD.A0y(sb);
                    }
                    sb.append(str2);
                    A0y = C36381kD.A0y(sb);
                }
                zzcj.zze.zzf(i, A0y);
                return;
            }
            throw C165617ti.A0E((Throwable) null, 4, 5);
        }
        throw C165577te.A0N();
    }
}
