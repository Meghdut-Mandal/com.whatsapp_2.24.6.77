package com.google.android.recaptcha.internal;

import X.C05250Oz;
import android.content.Context;
import java.util.Locale;
import java.util.MissingResourceException;

public final class zzbf {
    public static final zzbe zza = new zzbe((C05250Oz) null);
    public static zzmo zzb;
    public final String zzc;
    public final zzac zzd;
    public final zznc zze;
    public final long zzf = System.currentTimeMillis();

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a A[Catch:{ NameNotFoundException -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065 A[Catch:{ NameNotFoundException -> 0x0091 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.android.recaptcha.internal.zzmo zzb(android.content.Context r8) {
        /*
            java.lang.String r3 = "unknown"
            r5 = 33
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x0045 }
            java.lang.String r7 = "com.google.android.gms.version"
            r4 = -1
            if (r0 < r5) goto L_0x002a
            android.content.pm.PackageManager r6 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0045 }
            java.lang.String r2 = r8.getPackageName()     // Catch:{ NameNotFoundException -> 0x0045 }
            r0 = 128(0x80, double:6.32E-322)
            android.content.pm.PackageManager$ApplicationInfoFlags r0 = android.content.pm.PackageManager.ApplicationInfoFlags.of(r0)     // Catch:{ NameNotFoundException -> 0x0045 }
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0045 }
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0045 }
            int r0 = r0.getInt(r7, r4)     // Catch:{ NameNotFoundException -> 0x0045 }
            if (r0 == r4) goto L_0x0045
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x0045 }
            goto L_0x0046
        L_0x002a:
            android.content.pm.PackageManager r2 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0045 }
            java.lang.String r1 = r8.getPackageName()     // Catch:{ NameNotFoundException -> 0x0045 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x0045 }
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0045 }
            int r0 = r0.getInt(r7, r4)     // Catch:{ NameNotFoundException -> 0x0045 }
            if (r0 == r4) goto L_0x0045
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x0045 }
            goto L_0x0046
        L_0x0045:
            r4 = r3
        L_0x0046:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x0091 }
            if (r1 < r5) goto L_0x0065
            android.content.pm.PackageManager r5 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0091 }
            java.lang.String r2 = r8.getPackageName()     // Catch:{ NameNotFoundException -> 0x0091 }
            r0 = 0
            android.content.pm.PackageManager$PackageInfoFlags r0 = android.content.pm.PackageManager.PackageInfoFlags.of(r0)     // Catch:{ NameNotFoundException -> 0x0091 }
            android.content.pm.PackageInfo r0 = r5.getPackageInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0091 }
            long r0 = r0.getLongVersionCode()     // Catch:{ NameNotFoundException -> 0x0091 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x0091 }
            goto L_0x0091
        L_0x0065:
            r0 = 28
            r2 = 0
            if (r1 < r0) goto L_0x007f
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0091 }
            java.lang.String r0 = r8.getPackageName()     // Catch:{ NameNotFoundException -> 0x0091 }
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0091 }
            long r0 = r0.getLongVersionCode()     // Catch:{ NameNotFoundException -> 0x0091 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x0091 }
            goto L_0x0091
        L_0x007f:
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0091 }
            java.lang.String r0 = r8.getPackageName()     // Catch:{ NameNotFoundException -> 0x0091 }
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0091 }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x0091 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x0091 }
        L_0x0091:
            com.google.android.recaptcha.internal.zzmn r1 = com.google.android.recaptcha.internal.zzmo.zzf()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1.zzd(r0)
            r1.zzq(r4)
            java.lang.String r0 = "18.4.0"
            r1.zzs(r0)
            java.lang.String r0 = android.os.Build.MODEL
            r1.zzp(r0)
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r1.zzr(r0)
            r1.zze(r3)
            com.google.android.recaptcha.internal.zzit r0 = r1.zzj()
            com.google.android.recaptcha.internal.zzmo r0 = (com.google.android.recaptcha.internal.zzmo) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbf.zzb(android.content.Context):com.google.android.recaptcha.internal.zzmo");
    }

    public final zznf zza(int i, zzmr zzmr, Context context) {
        String str;
        String str2 = "";
        long currentTimeMillis = System.currentTimeMillis() - this.zzf;
        zznc zznc = this.zze;
        zznc.zze(currentTimeMillis);
        zznc.zzv(i);
        if (zzmr != null) {
            this.zze.zzq(zzmr);
        }
        if (zzb == null) {
            zzb = zzb(context);
        }
        try {
            str = Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused) {
            str = str2;
        }
        try {
            str2 = Locale.getDefault().getISO3Country();
        } catch (MissingResourceException unused2) {
        }
        zznc zznc2 = this.zze;
        String str3 = this.zzc;
        zznq zzf2 = zznr.zzf();
        zzf2.zzq(str3);
        zzmo zzmo = zzb;
        if (zzmo == null) {
            zzmo = zzb(context);
        }
        zzf2.zzd(zzmo);
        zzf2.zzp(str);
        zzf2.zze(str2);
        zznc2.zzs((zznr) zzf2.zzj());
        return (zznf) this.zze.zzj();
    }

    public zzbf(zzbb zzbb, String str, zzac zzac) {
        this.zzc = str;
        this.zzd = zzac;
        zznc zzi = zznf.zzi();
        this.zze = zzi;
        zzi.zzp(zzbb.zza);
        zzi.zzd(zzbb.zzb);
        zzi.zzr(zzbb.zzc);
        String str2 = zzbb.zzd;
        if (str2 != null) {
            zzi.zzu(str2);
        }
        zzi.zzt(zzmg.zzc(zzmg.zzb(System.currentTimeMillis())));
    }
}
