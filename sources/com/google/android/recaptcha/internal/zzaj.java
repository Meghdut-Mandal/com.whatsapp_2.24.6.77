package com.google.android.recaptcha.internal;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import android.app.Application;
import android.webkit.WebView;

public final class zzaj extends AnonymousClass0A1 implements C009003v {
    public Object zza;
    public int zzb;
    public final /* synthetic */ Application zzc;
    public final /* synthetic */ zzab zzd;
    public final /* synthetic */ String zze;
    public final /* synthetic */ zzbq zzf;
    public final /* synthetic */ zzbd zzg;
    public final /* synthetic */ zzbg zzh;
    public final /* synthetic */ long zzi;
    public final /* synthetic */ zzt zzj;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzaj(Application application, zzab zzab, String str, zzbq zzbq, zzbd zzbd, zzt zzt, WebView webView, zzbg zzbg, long j, C023509x r12) {
        super(2, r12);
        this.zzc = application;
        this.zzd = zzab;
        this.zze = str;
        this.zzf = zzbq;
        this.zzg = zzbd;
        this.zzj = zzt;
        this.zzh = zzbg;
        this.zzi = j;
    }

    public final C023509x create(Object obj, C023509x r14) {
        return new zzaj(this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzj, (WebView) null, this.zzh, this.zzi, r14);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r1 = r25
            X.0AO r13 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r5 = r24
            int r0 = r5.zzb
            r7 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0051
            if (r0 == r3) goto L_0x004d
            if (r0 != r7) goto L_0x00e8
            java.lang.Object r6 = r5.zza
            com.google.android.recaptcha.internal.zzoe r6 = (com.google.android.recaptcha.internal.zzoe) r6
            X.AnonymousClass0AN.A00(r1)
            X.0AK r1 = (X.AnonymousClass0AK) r1
            java.lang.Object r0 = r1.value
        L_0x001b:
            com.google.android.recaptcha.internal.zzt r7 = r5.zzj
            java.lang.Throwable r2 = X.AnonymousClass0AK.A00(r0)
            if (r2 != 0) goto L_0x00c1
            android.app.Application r14 = r5.zzc
            java.lang.String r4 = r5.zze
            com.google.android.recaptcha.internal.zzab r3 = r5.zzd
            com.google.android.recaptcha.internal.zzbd r2 = r5.zzg
            com.google.android.recaptcha.internal.zzbg r1 = r5.zzh
            com.google.android.recaptcha.internal.zzg r15 = com.google.android.recaptcha.internal.zzam.zzf
            com.google.android.recaptcha.internal.zzq r0 = new com.google.android.recaptcha.internal.zzq
            r0.<init>(r14)
            com.google.android.recaptcha.internal.zzbs r23 = new com.google.android.recaptcha.internal.zzbs
            r23.<init>()
            com.google.android.recaptcha.internal.zzaw r13 = new com.google.android.recaptcha.internal.zzaw
            r20 = r2
            r21 = r1
            r22 = r0
            r17 = r7
            r18 = r3
            r19 = r6
            r16 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x004c:
            return r13
        L_0x004d:
            X.AnonymousClass0AN.A00(r1)
            goto L_0x007f
        L_0x0051:
            X.AnonymousClass0AN.A00(r1)
            com.google.android.recaptcha.internal.zzam r0 = com.google.android.recaptcha.internal.zzam.zza
            android.app.Application r15 = r5.zzc
            com.google.android.recaptcha.internal.zzab r6 = r5.zzd
            java.lang.String r4 = r5.zze
            com.google.android.recaptcha.internal.zzbq r2 = r5.zzf
            com.google.android.recaptcha.internal.zzbd r1 = r5.zzg
            com.google.android.recaptcha.internal.zzt r0 = r5.zzj
            r5.zzb = r3
            X.040 r0 = r0.zzd
            X.02h r0 = r0.BAE()
            r20 = 0
            com.google.android.recaptcha.internal.zzal r14 = new com.google.android.recaptcha.internal.zzal
            r17 = r1
            r18 = r2
            r19 = r6
            r16 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.Object r1 = X.AnonymousClass0A2.A00(r5, r0, r14)
            if (r1 == r13) goto L_0x004c
        L_0x007f:
            android.app.Application r0 = r5.zzc
            r6 = r1
            com.google.android.recaptcha.internal.zzoe r6 = (com.google.android.recaptcha.internal.zzoe) r6
            android.webkit.WebView r12 = new android.webkit.WebView
            r12.<init>(r0)
            java.lang.String r11 = r5.zze
            android.app.Application r10 = r5.zzc
            com.google.android.recaptcha.internal.zzab r9 = r5.zzd
            com.google.android.recaptcha.internal.zzbd r8 = r5.zzg
            com.google.android.recaptcha.internal.zzt r4 = r5.zzj
            com.google.android.recaptcha.internal.zzbg r2 = r5.zzh
            com.google.android.recaptcha.internal.zzbq r0 = r5.zzf
            com.google.android.recaptcha.internal.zzez r1 = new com.google.android.recaptcha.internal.zzez
            r17 = r10
            r18 = r9
            r19 = r8
            r20 = r4
            r21 = r2
            r22 = r0
            r14 = r1
            r15 = r12
            r16 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            com.google.android.recaptcha.internal.zzg r0 = com.google.android.recaptcha.internal.zzam.zzf
            r0.zzd(r1)
            long r1 = r5.zzi
            com.google.android.recaptcha.internal.zzg r0 = com.google.android.recaptcha.internal.zzam.zzf
            r5.zza = r6
            r5.zzb = r7
            java.lang.Object r0 = r0.zzb(r1, r6, r5)
            if (r0 == r13) goto L_0x004c
            goto L_0x001b
        L_0x00c1:
            X.040 r0 = r7.zzc
            X.02h r0 = r0.BAE()
            X.C07570Yj.A03(r0)
            X.040 r0 = r7.zzc
            X.02h r0 = r0.BAE()
            X.03e r0 = X.C07570Yj.A01(r0)
            X.0tV r0 = r0.B9e()
            java.util.List r1 = X.C15060md.A00(r0)
            r5.zza = r2
            r0 = 3
            r5.zzb = r0
            java.lang.Object r0 = X.C06800Vd.A01(r1, r5)
            if (r0 != r13) goto L_0x00ef
            return r13
        L_0x00e8:
            java.lang.Object r2 = r5.zza
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            X.AnonymousClass0AN.A00(r1)
        L_0x00ef:
            com.google.android.recaptcha.internal.zzam r0 = com.google.android.recaptcha.internal.zzam.zza
            r1 = 0
            com.google.android.recaptcha.internal.zzg r0 = new com.google.android.recaptcha.internal.zzg
            r0.<init>(r1, r3, r1)
            com.google.android.recaptcha.internal.zzam.zzf = r0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaj) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
