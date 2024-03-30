package com.google.android.recaptcha.internal;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import com.google.android.recaptcha.RecaptchaAction;

public final class zzav extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ zzbd zza;
    public final /* synthetic */ zzaw zzb;
    public final /* synthetic */ RecaptchaAction zzc;
    public final /* synthetic */ zzog zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzav(zzbd zzbd, zzaw zzaw, RecaptchaAction recaptchaAction, zzog zzog, C023509x r6) {
        super(2, r6);
        this.zza = zzbd;
        this.zzb = zzaw;
        this.zzc = recaptchaAction;
        this.zzd = zzog;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new zzav(this.zza, this.zzb, this.zzc, this.zzd, r8);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzav) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = com.google.android.recaptcha.internal.zzp.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00c9, code lost:
        throw X.C165617ti.A0K(com.google.android.recaptcha.internal.zzl.zzR, com.google.android.recaptcha.internal.zzn.zzc, (java.lang.String) null);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x00bf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.AnonymousClass0AN.A00(r7)
            com.google.android.recaptcha.internal.zzbd r1 = r6.zza
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.FETCH_TOKEN
            com.google.android.recaptcha.internal.zzbb r3 = r1.zza(r0)
            com.google.android.recaptcha.internal.zzaw r0 = r6.zzb
            com.google.android.recaptcha.internal.zzbg r1 = r0.zzi
            r2 = 0
            r0 = 2
            r1.zze.put(r3, new com.google.android.recaptcha.internal.zzbf(r3, r1.zza, new com.google.android.recaptcha.internal.zzac()))
            com.google.android.recaptcha.internal.zzob r4 = com.google.android.recaptcha.internal.zzoc.zzf()
            com.google.android.recaptcha.internal.zzaw r1 = r6.zzb
            java.lang.String r0 = r1.zze
            r4.zzr(r0)
            com.google.android.recaptcha.RecaptchaAction r0 = r6.zzc
            java.lang.String r0 = r0.action
            r4.zzd(r0)
            com.google.android.recaptcha.internal.zzoe r0 = r1.zzg
            java.lang.String r0 = r0.zzi
            r4.zzq(r0)
            com.google.android.recaptcha.internal.zzoe r0 = r1.zzg
            java.lang.String r0 = r0.zzg
            r4.zzp(r0)
            com.google.android.recaptcha.internal.zzog r1 = r6.zzd
            java.lang.String r0 = r1.zzf
            r4.zzt(r0)
            java.lang.String r0 = r1.zzh
            r4.zze(r0)
            java.lang.String r0 = r1.zzg
            r4.zzs(r0)
            com.google.android.recaptcha.internal.zzit r5 = r4.zzj()
            com.google.android.recaptcha.internal.zzoc r5 = (com.google.android.recaptcha.internal.zzoc) r5
            com.google.android.recaptcha.internal.zzaw r0 = r6.zzb     // Catch:{ Exception -> 0x00e6 }
            com.google.android.recaptcha.internal.zzab r0 = r0.zzf     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r0 = r0.zze     // Catch:{ Exception -> 0x00e6 }
            java.net.URLConnection r4 = X.C90504aG.A0r(r0)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r0 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            X.AnonymousClass00C.A0E(r4, r0)     // Catch:{ Exception -> 0x00e6 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r0 = "POST"
            r4.setRequestMethod(r0)     // Catch:{ Exception -> 0x00e6 }
            r0 = 1
            r4.setDoOutput(r0)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r1 = "application/x-protobuffer"
            java.lang.String r0 = "Content-Type"
            r4.setRequestProperty(r0, r1)     // Catch:{ Exception -> 0x00e6 }
            r4.connect()     // Catch:{ Exception -> 0x00d3 }
            com.google.android.recaptcha.internal.zzoi r1 = com.google.android.recaptcha.internal.zzoj.zzf()     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r0 = r5.zzi     // Catch:{ Exception -> 0x00d3 }
            r1.zzd(r0)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r0 = r5.zzg     // Catch:{ Exception -> 0x00d3 }
            r1.zzq(r0)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r0 = r5.zzh     // Catch:{ Exception -> 0x00d3 }
            r1.zzt(r0)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r0 = r5.zzf     // Catch:{ Exception -> 0x00d3 }
            r1.zzp(r0)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r0 = r5.zzk     // Catch:{ Exception -> 0x00d3 }
            r1.zzr(r0)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r0 = r5.zzj     // Catch:{ Exception -> 0x00d3 }
            r1.zzs(r0)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r0 = r5.zzl     // Catch:{ Exception -> 0x00d3 }
            r1.zze(r0)     // Catch:{ Exception -> 0x00d3 }
            com.google.android.recaptcha.internal.zzit r0 = r1.zzj()     // Catch:{ Exception -> 0x00d3 }
            com.google.android.recaptcha.internal.zzoj r0 = (com.google.android.recaptcha.internal.zzoj) r0     // Catch:{ Exception -> 0x00d3 }
            byte[] r1 = r0.zzd()     // Catch:{ Exception -> 0x00d3 }
            java.io.OutputStream r0 = r4.getOutputStream()     // Catch:{ Exception -> 0x00d3 }
            r0.write(r1)     // Catch:{ Exception -> 0x00d3 }
            int r1 = r4.getResponseCode()     // Catch:{ Exception -> 0x00d3 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x00ca
            java.io.InputStream r0 = r4.getInputStream()     // Catch:{ Exception -> 0x00d3 }
            com.google.android.recaptcha.internal.zzol r1 = com.google.android.recaptcha.internal.zzol.zzg(r0)     // Catch:{ Exception -> 0x00bf }
            com.google.android.recaptcha.internal.zzaw r0 = r6.zzb
            com.google.android.recaptcha.internal.zzbg r0 = r0.zzi
            r0.zza(r3)
            return r1
        L_0x00bf:
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza     // Catch:{ Exception -> 0x00d3 }
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zzc     // Catch:{ Exception -> 0x00d3 }
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzR     // Catch:{ Exception -> 0x00d3 }
            com.google.android.recaptcha.internal.zzp r0 = X.C165617ti.A0K(r0, r1, r2)     // Catch:{ Exception -> 0x00d3 }
            throw r0     // Catch:{ Exception -> 0x00d3 }
        L_0x00ca:
            int r0 = r4.getResponseCode()     // Catch:{ Exception -> 0x00d3 }
            com.google.android.recaptcha.internal.zzp r0 = com.google.android.recaptcha.internal.zzbr.zza(r0)     // Catch:{ Exception -> 0x00d3 }
            throw r0     // Catch:{ Exception -> 0x00d3 }
        L_0x00d3:
            r1 = move-exception
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzp     // Catch:{ Exception -> 0x00e6 }
            if (r0 == 0) goto L_0x00db
            com.google.android.recaptcha.internal.zzp r1 = (com.google.android.recaptcha.internal.zzp) r1     // Catch:{ Exception -> 0x00e6 }
        L_0x00da:
            throw r1     // Catch:{ Exception -> 0x00e6 }
        L_0x00db:
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza     // Catch:{ Exception -> 0x00e6 }
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zze     // Catch:{ Exception -> 0x00e6 }
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzQ     // Catch:{ Exception -> 0x00e6 }
            com.google.android.recaptcha.internal.zzp r1 = X.C165617ti.A0K(r0, r1, r2)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00da
        L_0x00e6:
            r1 = move-exception
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzp
            if (r0 == 0) goto L_0x00f5
            com.google.android.recaptcha.internal.zzp r1 = (com.google.android.recaptcha.internal.zzp) r1
        L_0x00ed:
            com.google.android.recaptcha.internal.zzaw r0 = r6.zzb
            com.google.android.recaptcha.internal.zzbg r0 = r0.zzi
            r0.zzb(r3, r1, r2)
            throw r1
        L_0x00f5:
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zzc
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzam
            com.google.android.recaptcha.internal.zzp r1 = X.C165617ti.A0K(r0, r1, r2)
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzav.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
