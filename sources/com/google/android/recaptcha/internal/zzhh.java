package com.google.android.recaptcha.internal;

import X.AnonymousClass001;
import X.C165567td;
import X.C165587tf;
import X.C165607th;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzhh extends zzgm {
    public static final /* synthetic */ int zzb = 0;
    public static final Logger zzc = C165587tf.A0p(zzhh.class);
    public static final boolean zzd = zzlv.zzh;
    public zzhi zza;

    public zzhh() {
    }

    public /* synthetic */ zzhh(zzhg zzhg) {
    }

    public static zzhh zzA(byte[] bArr, int i, int i2) {
        return new zzhe(bArr, 0, i2);
    }

    public static int zzz(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i = 2;
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        }
        if ((-2097152 & j) != 0) {
            j >>>= 14;
            i += 2;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public final void zzB() {
        zzhe zzhe = (zzhe) this;
        if (zzhe.zzd - zzhe.zze != 0) {
            throw AnonymousClass001.A09("Did not write as much data as expected.");
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b);

    public abstract void zzd(int i, boolean z);

    public abstract void zze(int i, zzgw zzgw);

    public abstract void zzf(int i, int i2);

    public abstract void zzg(int i);

    public abstract void zzh(int i, long j);

    public abstract void zzi(long j);

    public abstract void zzj(int i, int i2);

    public abstract void zzk(int i);

    public abstract void zzl(byte[] bArr, int i, int i2);

    public abstract void zzm(int i, String str);

    public abstract void zzo(int i, int i2);

    public abstract void zzp(int i, int i2);

    public abstract void zzq(int i);

    public abstract void zzr(int i, long j);

    public abstract void zzs(long j);

    @Deprecated
    public static int zzt(int i, zzke zzke, zzkr zzkr) {
        int zza2 = ((zzgf) zzke).zza(zzkr);
        int A01 = C165607th.A01(i);
        return A01 + A01 + zza2;
    }

    public static int zzu(int i) {
        if (i >= 0) {
            return C165567td.A00(i);
        }
        return 10;
    }

    public static int zzw(zzke zzke, zzkr zzkr) {
        int zza2 = ((zzgf) zzke).zza(zzkr);
        return C165567td.A00(zza2) + zza2;
    }

    public final void zzC(String str, zzlz zzlz) {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzlz);
        byte[] bytes = str.getBytes(zzjc.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzhf(e);
        }
    }

    public static int zzv(zzke zzke) {
        int zzn = zzke.zzn();
        return C165567td.A00(zzn) + zzn;
    }

    public static int zzx(String str) {
        int i;
        String str2;
        try {
            str2 = str;
            int zzc2 = zzma.zzc(str);
            str2 = zzc2;
            i = zzc2;
        } catch (zzlz unused) {
            i = str2.getBytes(zzjc.zzb).length;
        }
        return C165567td.A00(i) + i;
    }

    public static int zzy(int i) {
        return C165567td.A00(i);
    }
}
