package com.google.android.recaptcha.internal;

import X.AnonymousClass040;
import X.AnonymousClass0A2;
import X.C008903u;
import X.C023109s;
import X.C023509x;
import X.C05250Oz;
import X.C15590na;
import X.C17170qq;
import X.C36361kB;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import java.util.List;

public final class zzam {
    public static final zzam zza = new zzam();
    public static zzaw zzb;
    public static final String zzc = C36361kB.A0l();
    public static final C17170qq zzd = new C15590na();
    public static final zzt zze = new zzt();
    public static zzg zzf = new zzg((List) null, 1, (C05250Oz) null);

    public static final zzg zze() {
        return zzf;
    }

    public static final void zzf(zzg zzg) {
        zzf = zzg;
    }

    public static final Object zzc(Application application, String str, long j, zzbq zzbq, C023509x r13) {
        return AnonymousClass0A2.A00(r13, zze.zzb.BAE(), new zzah(application, str, j, (zzbq) null, (C023509x) null));
    }

    public static final Task zzd(Application application, String str, long j) {
        AnonymousClass040 r2 = zze.zzb;
        zzak zzak = new zzak(application, str, j, (C023509x) null);
        return zzj.zza(AnonymousClass0A2.A01(C023109s.A00, C008903u.A00, zzak, r2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0075, code lost:
        if (r2.BOV((java.lang.Object) null, r10) != r9) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0174, code lost:
        throw X.C165587tf.A0F(com.google.android.recaptcha.RecaptchaErrorCode.INTERNAL_ERROR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0177, code lost:
        r0 = th;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x016e */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b1 A[Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0150 A[Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016e A[PHI: r2 
      PHI: (r2v6 X.0qq) = (r2v9 X.0qq), (r2v9 X.0qq), (r2v9 X.0qq), (r2v13 X.0qq) binds: [B:16:0x0077, B:39:0x0136, B:29:0x0101, B:33:0x0120] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:46:0x016e] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:50:0x0176=Splitter:B:50:0x0176, B:46:0x016e=Splitter:B:46:0x016e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zza(android.app.Application r27, java.lang.String r28, long r29, com.google.android.recaptcha.internal.zzab r31, android.webkit.WebView r32, com.google.android.recaptcha.internal.zzbq r33, com.google.android.recaptcha.internal.zzt r34, X.C023509x r35) {
        /*
            r26 = this;
            r5 = r35
            r13 = r27
            r8 = r28
            r12 = r31
            r11 = r34
            r0 = r29
            boolean r2 = r5 instanceof com.google.android.recaptcha.internal.zzai
            if (r2 == 0) goto L_0x003b
            r10 = r5
            com.google.android.recaptcha.internal.zzai r10 = (com.google.android.recaptcha.internal.zzai) r10
            int r4 = r10.zzg
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x003b
            int r4 = r4 - r3
            r10.zzg = r4
        L_0x001e:
            java.lang.Object r7 = r10.zze
            X.0AO r9 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r5 = r10.zzg
            r4 = 1
            r2 = 2
            r3 = 0
            if (r5 == 0) goto L_0x005e
            if (r5 == r4) goto L_0x0048
            if (r5 != r2) goto L_0x0043
            java.lang.Object r5 = r10.zzc
            com.google.android.recaptcha.internal.zzbg r5 = (com.google.android.recaptcha.internal.zzbg) r5
            java.lang.Object r4 = r10.zzb
            com.google.android.recaptcha.internal.zzbd r4 = (com.google.android.recaptcha.internal.zzbd) r4
            java.lang.Object r2 = r10.zza
            X.0qq r2 = (X.C17170qq) r2
            goto L_0x0120
        L_0x003b:
            com.google.android.recaptcha.internal.zzai r10 = new com.google.android.recaptcha.internal.zzai
            r2 = r26
            r10.<init>(r2, r5)
            goto L_0x001e
        L_0x0043:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0048:
            long r0 = r10.zzd
            X.0qq r2 = r10.zzh
            com.google.android.recaptcha.internal.zzt r11 = r10.zzi
            java.lang.Object r12 = r10.zzc
            com.google.android.recaptcha.internal.zzab r12 = (com.google.android.recaptcha.internal.zzab) r12
            java.lang.Object r8 = r10.zzb
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r13 = r10.zza
            android.app.Application r13 = (android.app.Application) r13
            X.AnonymousClass0AN.A00(r7)
            goto L_0x0077
        L_0x005e:
            X.AnonymousClass0AN.A00(r7)
            X.0qq r2 = zzd
            r10.zza = r13
            r10.zzb = r8
            r10.zzc = r12
            r10.zzi = r11
            r10.zzh = r2
            r10.zzd = r0
            r10.zzg = r4
            java.lang.Object r4 = r2.BOV(r3, r10)
            if (r4 == r9) goto L_0x017e
        L_0x0077:
            java.lang.String r6 = X.C36361kB.A0l()     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            java.lang.String r5 = zzc     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            com.google.android.recaptcha.internal.zzbd r4 = new com.google.android.recaptcha.internal.zzbd     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            r4.<init>(r5, r6)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            r4.zzd = r6     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            java.lang.String r5 = r12.zzc     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            com.google.android.recaptcha.internal.zzbo r7 = new com.google.android.recaptcha.internal.zzbo     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            r7.<init>(r5)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            X.040 r5 = r11.zzd     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            com.google.android.recaptcha.internal.zzbm r6 = new com.google.android.recaptcha.internal.zzbm     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            r6.<init>(r13, r7, r5)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            com.google.android.recaptcha.internal.zzbg r5 = new com.google.android.recaptcha.internal.zzbg     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            r15 = r8
            r16 = r13
            r17 = r12
            r18 = r11
            r19 = r6
            r14 = r5
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            com.google.android.recaptcha.internal.zzne r6 = com.google.android.recaptcha.internal.zzne.INIT_TOTAL     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            com.google.android.recaptcha.internal.zzbb r6 = r4.zza(r6)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            r14 = 2
            r5.zze.put(r6, new com.google.android.recaptcha.internal.zzbf(r6, r5.zza, new com.google.android.recaptcha.internal.zzac()))     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            r15 = 5000(0x1388, double:2.4703E-320)
            int r6 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r6 < 0) goto L_0x0150
            java.lang.String r6 = "android.permission.INTERNET"
            int r6 = X.AnonymousClass00F.A01(r13, r6)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            if (r6 != 0) goto L_0x0136
            com.google.android.recaptcha.internal.zzy r7 = new com.google.android.recaptcha.internal.zzy     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            r7.<init>(r13)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            com.google.android.recaptcha.internal.zzbq r6 = new com.google.android.recaptcha.internal.zzbq     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            r6.<init>(r7, r5)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            com.google.android.recaptcha.internal.zzaw r7 = zzb     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            if (r7 == 0) goto L_0x00f5
            java.lang.String r0 = r7.zze     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r8)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            if (r0 == 0) goto L_0x00d9
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.INIT_TOTAL     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            com.google.android.recaptcha.internal.zzbb r0 = r4.zza(r0)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            r5.zza(r0)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            goto L_0x0130
        L_0x00d9:
            com.google.android.recaptcha.RecaptchaErrorCode r5 = com.google.android.recaptcha.RecaptchaErrorCode.INVALID_SITEKEY     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            java.lang.String r4 = r7.zze     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            java.lang.String r0 = "Only one site key can be used per runtime. The site key you provided "
            r1.append(r0)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            r1.append(r8)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            java.lang.String r0 = " is different than "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r4, r1)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            com.google.android.recaptcha.RecaptchaException r0 = new com.google.android.recaptcha.RecaptchaException     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            r0.<init>(r5, r1)     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            throw r0     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
        L_0x00f5:
            r10.zza = r2     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            r10.zzb = r4     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            r10.zzc = r5     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            r10.zzi = r3     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            r10.zzh = r3     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            r10.zzg = r14     // Catch:{ RecaptchaException -> 0x0175, Exception -> 0x016e, all -> 0x016c }
            com.google.android.recaptcha.internal.zzaj r14 = new com.google.android.recaptcha.internal.zzaj     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            r21 = r3
            r23 = r0
            r25 = r3
            r22 = r5
            r19 = r4
            r20 = r11
            r18 = r6
            r17 = r8
            r16 = r12
            r15 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r25)     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            java.lang.Object r7 = X.C07340Xg.A00(r10, r14, r0)     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            if (r7 == r9) goto L_0x017e
            goto L_0x0123
        L_0x0120:
            X.AnonymousClass0AN.A00(r7)     // Catch:{ RecaptchaException -> 0x0134, Exception -> 0x016e }
        L_0x0123:
            com.google.android.recaptcha.internal.zzaw r7 = (com.google.android.recaptcha.internal.zzaw) r7     // Catch:{ RecaptchaException -> 0x0134, Exception -> 0x016e }
            zzb = r7     // Catch:{ RecaptchaException -> 0x0134, Exception -> 0x016e }
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.INIT_TOTAL     // Catch:{ RecaptchaException -> 0x0134, Exception -> 0x016e }
            com.google.android.recaptcha.internal.zzbb r0 = r4.zza(r0)     // Catch:{ RecaptchaException -> 0x0134, Exception -> 0x016e }
            r5.zza(r0)     // Catch:{ RecaptchaException -> 0x0134, Exception -> 0x016e }
        L_0x0130:
            r2.BwJ(r3)
            return r7
        L_0x0134:
            r0 = move-exception
            goto L_0x0176
        L_0x0136:
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.INIT_TOTAL     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzbb r4 = r4.zza(r0)     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zze     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzv     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzp r0 = X.C165617ti.A0K(r0, r1, r3)     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            r5.zzb(r4, r0, r3)     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.RecaptchaErrorCode r0 = com.google.android.recaptcha.RecaptchaErrorCode.NETWORK_ERROR     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.RecaptchaException r0 = X.C165587tf.A0F(r0)     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            throw r0     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
        L_0x0150:
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zzm     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzT     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzp r1 = X.C165617ti.A0K(r0, r1, r3)     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.INIT_TOTAL     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.internal.zzbb r0 = r4.zza(r0)     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            r5.zzb(r0, r1, r3)     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.RecaptchaErrorCode r0 = com.google.android.recaptcha.RecaptchaErrorCode.INVALID_TIMEOUT     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            com.google.android.recaptcha.RecaptchaException r0 = X.C165587tf.A0F(r0)     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
            throw r0     // Catch:{ RecaptchaException -> 0x016a, Exception -> 0x016e, all -> 0x0179 }
        L_0x016a:
            r0 = move-exception
            goto L_0x0176
        L_0x016c:
            r0 = move-exception
            goto L_0x017a
        L_0x016e:
            com.google.android.recaptcha.RecaptchaErrorCode r0 = com.google.android.recaptcha.RecaptchaErrorCode.INTERNAL_ERROR     // Catch:{ all -> 0x0177 }
            com.google.android.recaptcha.RecaptchaException r0 = X.C165587tf.A0F(r0)     // Catch:{ all -> 0x0177 }
            throw r0     // Catch:{ all -> 0x0177 }
        L_0x0175:
            r0 = move-exception
        L_0x0176:
            throw r0     // Catch:{ all -> 0x0177 }
        L_0x0177:
            r0 = move-exception
            goto L_0x017a
        L_0x0179:
            r0 = move-exception
        L_0x017a:
            r2.BwJ(r3)
            throw r0
        L_0x017e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzam.zza(android.app.Application, java.lang.String, long, com.google.android.recaptcha.internal.zzab, android.webkit.WebView, com.google.android.recaptcha.internal.zzbq, com.google.android.recaptcha.internal.zzt, X.09x):java.lang.Object");
    }
}
