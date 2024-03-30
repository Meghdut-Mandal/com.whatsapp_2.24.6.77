package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165607th;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public abstract class zzmg {
    public static final zzlj zza;
    public static final zzlj zzb;
    public static final zzlj zzc;
    public static final ThreadLocal zzd = new zzmf();
    public static final Method zze = zzd("now");
    public static final Method zzf = zzd("getEpochSecond");
    public static final Method zzg = zzd("getNano");

    public static zzlj zza(zzlj zzlj) {
        long j = zzlj.zzd;
        int i = (j > -62135596800L ? 1 : (j == -62135596800L ? 0 : -1));
        int i2 = zzlj.zze;
        if (i >= 0 && j <= 253402300799L && i2 >= 0 && i2 < 1000000000) {
            return zzlj;
        }
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1M(A0M, 0, j);
        AnonymousClass000.A1L(A0M, i2, 1);
        throw C165607th.A0i("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", A0M);
    }

    public static zzlj zzb(long j) {
        int i = (int) ((j % 1000) * SearchActionVerificationClientService.MS_TO_NS);
        long j2 = j / 1000;
        if (i <= -1000000000 || i >= 1000000000) {
            j2 = zzgb.zza(j2, (long) (i / 1000000000));
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            j2 = zzgb.zzb(j2, 1);
        }
        zzli zzi = zzlj.zzi();
        zzi.zze(j2);
        zzi.zzd(i);
        zzlj zzlj = (zzlj) zzi.zzj();
        zza(zzlj);
        return zzlj;
    }

    public static Method zzd(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static {
        zzli zzi = zzlj.zzi();
        zzi.zze(-62135596800L);
        zzi.zzd(0);
        zza = (zzlj) zzi.zzj();
        zzli zzi2 = zzlj.zzi();
        zzi2.zze(253402300799L);
        zzi2.zzd(999999999);
        zzb = (zzlj) zzi2.zzj();
        zzli zzi3 = zzlj.zzi();
        zzi3.zze(0);
        zzi3.zzd(0);
        zzc = (zzlj) zzi3.zzj();
    }

    public static String zzc(zzlj zzlj) {
        Locale locale;
        Object[] objArr;
        String str;
        zza(zzlj);
        long j = zzlj.zzd;
        int i = zzlj.zze;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(((DateFormat) zzd.get()).format(new Date(j * 1000)));
        if (i != 0) {
            A0u.append(".");
            if (i % 1000000 == 0) {
                locale = Locale.ENGLISH;
                objArr = new Object[1];
                AnonymousClass000.A1L(objArr, i / 1000000, 0);
                str = "%1$03d";
            } else {
                int i2 = i % 1000;
                locale = Locale.ENGLISH;
                objArr = new Object[1];
                if (i2 == 0) {
                    AnonymousClass000.A1L(objArr, i / 1000, 0);
                    str = "%1$06d";
                } else {
                    AnonymousClass000.A1L(objArr, i, 0);
                    str = "%1$09d";
                }
            }
            A0u.append(String.format(locale, str, objArr));
        }
        return AnonymousClass000.A0q("Z", A0u);
    }
}
