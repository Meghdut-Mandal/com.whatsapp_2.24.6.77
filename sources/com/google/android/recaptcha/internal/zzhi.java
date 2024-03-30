package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C165567td;
import X.C165577te;
import X.C36351kA;
import X.C36401kF;
import java.nio.charset.Charset;
import java.util.List;

public final class zzhi implements zzmd {
    public final zzhh zza;

    public final void zzA(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            C165577te.A11(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 8;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzi(C165567td.A08(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzh(i, C165567td.A08(list, i2));
            i2++;
        }
    }

    public final void zzC(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            C165577te.A11(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int A06 = C36351kA.A06(list, i4);
                int i5 = (A06 >> 31) ^ (A06 + A06);
                int i6 = zzhh.zzb;
                i3 += C165567td.A00(i5);
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                zzhh zzhh = this.zza;
                int A062 = C36351kA.A06(list, i2);
                zzhh.zzq((A062 >> 31) ^ (A062 + A062));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzhh zzhh2 = this.zza;
            int A063 = C36351kA.A06(list, i2);
            zzhh2.zzp(i, (A063 >> 31) ^ (A063 + A063));
            i2++;
        }
    }

    public final void zzJ(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            C165577te.A11(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int A06 = C36351kA.A06(list, i4);
                int i5 = zzhh.zzb;
                i3 += C165567td.A00(A06);
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzq(C36351kA.A06(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzp(i, C36351kA.A06(list, i2));
            i2++;
        }
    }

    public final void zzL(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            C165577te.A11(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhh.zzz(C165567td.A08(list, i4));
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzs(C165567td.A08(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzr(i, C165567td.A08(list, i2));
            i2++;
        }
    }

    public final void zzc(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            C165577te.A11(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3++;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzb(AnonymousClass000.A1X(list.get(i2)) ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzd(i, AnonymousClass000.A1X(list.get(i2)));
            i2++;
        }
    }

    public final void zze(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zze(i, (zzgw) list.get(i2));
        }
    }

    public final void zzg(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            C165577te.A11(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 8;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzi(C165577te.A0D(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzh(i, C165577te.A0D(list, i2));
            i2++;
        }
    }

    public final void zzj(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            C165577te.A11(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhh.zzu(C36351kA.A06(list, i4));
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzk(C36351kA.A06(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzj(i, C36351kA.A06(list, i2));
            i2++;
        }
    }

    public final void zzl(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            C165577te.A11(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 4;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzg(C36351kA.A06(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzf(i, C36351kA.A06(list, i2));
            i2++;
        }
    }

    public final void zzn(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            C165577te.A11(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 8;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzi(C165567td.A08(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzh(i, C165567td.A08(list, i2));
            i2++;
        }
    }

    public final void zzp(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            C165577te.A11(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 4;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(C165577te.A01(list, i2)));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzf(i, Float.floatToRawIntBits(C165577te.A01(list, i2)));
            i2++;
        }
    }

    public final void zzs(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            C165577te.A11(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhh.zzu(C36351kA.A06(list, i4));
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzk(C36351kA.A06(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzj(i, C36351kA.A06(list, i2));
            i2++;
        }
    }

    public final void zzu(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            C165577te.A11(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzhh.zzz(C165567td.A08(list, i4));
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzs(C165567td.A08(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzr(i, C165567td.A08(list, i2));
            i2++;
        }
    }

    public final void zzy(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            C165577te.A11(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4);
                i3 += 4;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzg(C36351kA.A06(list, i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzf(i, C36351kA.A06(list, i2));
            i2++;
        }
    }

    public static zzhi zza(zzhh zzhh) {
        zzhi zzhi = zzhh.zza;
        if (zzhi == null) {
            return new zzhi(zzhh);
        }
        return zzhi;
    }

    public final void zzB(int i, int i2) {
        this.zza.zzp(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void zzD(int i, long j) {
        zzhh zzhh = this.zza;
        zzhh.zzr(i, (j >> 63) ^ (j + j));
    }

    public final void zzE(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            C165577te.A11(this, i);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long A08 = C165567td.A08(list, i4);
                i3 += zzhh.zzz((A08 >> 63) ^ (A08 + A08));
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                zzhh zzhh = this.zza;
                long A082 = C165567td.A08(list, i2);
                zzhh.zzs((A082 >> 63) ^ (A082 + A082));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzhh zzhh2 = this.zza;
            long A083 = C165567td.A08(list, i2);
            zzhh2.zzr(i, (A083 >> 63) ^ (A083 + A083));
            i2++;
        }
    }

    @Deprecated
    public final void zzF(int i) {
        this.zza.zzq((i << 3) | 3);
    }

    public final void zzG(int i, String str) {
        this.zza.zzm(i, str);
    }

    public final void zzH(int i, List list) {
        int i2 = 0;
        if (list instanceof zzjm) {
            zzjm zzjm = (zzjm) list;
            while (i2 < list.size()) {
                Object zzf = zzjm.zzf(i2);
                boolean z = zzf instanceof String;
                zzhh zzhh = this.zza;
                if (z) {
                    zzhh.zzm(i, (String) zzf);
                } else {
                    zzhh.zze(i, (zzgw) zzf);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzm(i, C36401kF.A0s(list, i2));
            i2++;
        }
    }

    public final void zzI(int i, int i2) {
        this.zza.zzp(i, i2);
    }

    public final void zzK(int i, long j) {
        this.zza.zzr(i, j);
    }

    public final void zzb(int i, boolean z) {
        this.zza.zzd(i, z);
    }

    public final void zzd(int i, zzgw zzgw) {
        this.zza.zze(i, zzgw);
    }

    public final void zzf(int i, double d) {
        this.zza.zzh(i, Double.doubleToRawLongBits(d));
    }

    @Deprecated
    public final void zzh(int i) {
        this.zza.zzq((i << 3) | 4);
    }

    public final void zzi(int i, int i2) {
        this.zza.zzj(i, i2);
    }

    public final void zzk(int i, int i2) {
        this.zza.zzf(i, i2);
    }

    public final void zzm(int i, long j) {
        this.zza.zzh(i, j);
    }

    public final void zzo(int i, float f) {
        this.zza.zzf(i, Float.floatToRawIntBits(f));
    }

    public final void zzq(int i, Object obj, zzkr zzkr) {
        zzhh zzhh = this.zza;
        int i2 = i << 3;
        zzhh.zzq(i2 | 3);
        zzkr.zzj(obj, zzhh.zza);
        zzhh.zzq(i2 | 4);
    }

    public final void zzr(int i, int i2) {
        this.zza.zzj(i, i2);
    }

    public final void zzt(int i, long j) {
        this.zza.zzr(i, j);
    }

    public final void zzv(int i, Object obj, zzkr zzkr) {
        zzke zzke = (zzke) obj;
        zzhh zzhh = this.zza;
        zzhh.zzq((i << 3) | 2);
        zzhh.zzq(((zzgf) zzke).zza(zzkr));
        zzkr.zzj(zzke, zzhh.zza);
    }

    public final void zzw(int i, Object obj) {
        boolean z = obj instanceof zzgw;
        zzhh zzhh = this.zza;
        if (z) {
            zzhh.zzq(11);
            zzhh.zzp(2, i);
            zzhh.zze(3, (zzgw) obj);
        } else {
            zzke zzke = (zzke) obj;
            zzhh.zzq(11);
            zzhh.zzp(2, i);
            zzhh.zzq(26);
            zzhh.zzq(zzke.zzn());
            zzke.zze(zzhh);
        }
        zzhh.zzq(12);
    }

    public final void zzx(int i, int i2) {
        this.zza.zzf(i, i2);
    }

    public final void zzz(int i, long j) {
        this.zza.zzh(i, j);
    }

    public zzhi(zzhh zzhh) {
        Charset charset = zzjc.zza;
        this.zza = zzhh;
        zzhh.zza = this;
    }
}
