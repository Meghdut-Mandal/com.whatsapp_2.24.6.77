package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165567td;
import X.C165587tf;
import X.C165607th;
import X.C36401kF;
import X.C36431kI;
import java.util.Arrays;

public final class zzlm {
    public static final zzlm zza = new zzlm(0, new int[0], new Object[0], false);
    public int zzb;
    public int[] zzc;
    public Object[] zzd;
    public int zze;
    public boolean zzf;

    public zzlm(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzlm zzc() {
        return zza;
    }

    public static zzlm zzf() {
        return new zzlm(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof zzlm)) {
                zzlm zzlm = (zzlm) obj;
                int i = this.zzb;
                if (i == zzlm.zzb) {
                    int[] iArr = this.zzc;
                    int[] iArr2 = zzlm.zzc;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.zzd;
                            Object[] objArr2 = zzlm.zzd;
                            int i3 = 0;
                            while (i3 < i) {
                                if (objArr[i3].equals(objArr2[i3])) {
                                    i3++;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzkg.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzk(zzmd zzmd) {
        for (int i = 0; i < this.zzb; i++) {
            zzmd.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public zzlm() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzlm zze(zzlm zzlm, zzlm zzlm2) {
        int i = zzlm.zzb + zzlm2.zzb;
        int[] copyOf = Arrays.copyOf(zzlm.zzc, i);
        System.arraycopy(zzlm2.zzc, 0, copyOf, zzlm.zzb, zzlm2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzlm.zzd, i);
        System.arraycopy(zzlm2.zzd, 0, copyOf2, zzlm.zzb, zzlm2.zzb);
        return new zzlm(i, copyOf, copyOf2, true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.zzd;
        for (int i7 = 0; i7 < i; i7++) {
            i3 = C36401kF.A02(objArr[i7], i3 * 31);
        }
        return i6 + i3;
    }

    public final int zza() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.zze;
        if (i5 != -1) {
            return i5;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.zzb; i7++) {
            int i8 = this.zzc[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 == 0) {
                i4 = i9 << 3;
                i = zzhh.zzz(C165587tf.A0C(this.zzd, i7));
                i2 = C165567td.A00(i4);
                i3 = i2 + i;
            } else if (i10 == 1) {
                i3 = C165607th.A01(i9) + 8;
            } else if (i10 == 2) {
                i4 = i9 << 3;
                int i11 = zzhh.zzb;
                int zzd2 = ((zzgw) this.zzd[i7]).zzd();
                i = C165567td.A00(zzd2) + zzd2;
                i2 = C165567td.A00(i4);
                i3 = i2 + i;
            } else if (i10 == 3) {
                int i12 = i9 << 3;
                int i13 = zzhh.zzb;
                i = ((zzlm) this.zzd[i7]).zza();
                int A00 = C165567td.A00(i12);
                i2 = A00 + A00;
                i3 = i2 + i;
            } else if (i10 == 5) {
                i3 = C165607th.A01(i9) + 4;
            } else {
                throw new IllegalStateException(C165587tf.A0H());
            }
            i6 += i3;
        }
        this.zze = i6;
        return i6;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3] >>> 3;
            int i5 = zzhh.zzb;
            int zzd2 = ((zzgw) this.zzd[i3]).zzd();
            i2 += 2 + 1 + C165567td.A00(i4) + 1 + C165567td.A00(zzd2) + zzd2;
        }
        this.zze = i2;
        return i2;
    }

    public final zzlm zzd(zzlm zzlm) {
        if (!zzlm.equals(zza)) {
            zzg();
            int i = this.zzb + zzlm.zzb;
            zzm(i);
            System.arraycopy(zzlm.zzc, 0, this.zzc, this.zzb, zzlm.zzb);
            System.arraycopy(zzlm.zzd, 0, this.zzd, this.zzb, zzlm.zzb);
            this.zzb = i;
        }
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw AnonymousClass001.A0D();
        }
    }

    public final void zzl(zzmd zzmd) {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzmd.zzt(i4, C36431kI.A09(obj));
                } else if (i3 == 1) {
                    zzmd.zzm(i4, C36431kI.A09(obj));
                } else if (i3 == 2) {
                    zzmd.zzd(i4, (zzgw) obj);
                } else if (i3 == 3) {
                    zzmd.zzF(i4);
                    ((zzlm) obj).zzl(zzmd);
                    zzmd.zzh(i4);
                } else if (i3 == 5) {
                    zzmd.zzk(i4, AnonymousClass000.A0I(obj));
                } else {
                    throw AnonymousClass001.A0B(C165587tf.A0H());
                }
            }
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }
}
