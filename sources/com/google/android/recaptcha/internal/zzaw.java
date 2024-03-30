package com.google.android.recaptcha.internal;

import X.AnonymousClass03U;
import X.AnonymousClass040;
import X.AnonymousClass0A2;
import X.C000300d;
import X.C008903u;
import X.C023109s;
import X.C023509x;
import X.C05250Oz;
import X.C10880fN;
import X.C165617ti;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.LinkedHashMap;

public final class zzaw implements RecaptchaTasksClient, RecaptchaClient {
    public static final zzan zza = new zzan((C05250Oz) null);
    public static final C10880fN zzb = new C10880fN("^[a-zA-Z0-9/_]{0,100}$");
    public final Application zzc;
    public final zzg zzd;
    public final String zze;
    public final zzab zzf;
    public final zzoe zzg;
    public final zzbd zzh;
    public final zzbg zzi;
    public final zzq zzj;
    public final zzbs zzk;
    public final zzt zzl;

    public zzaw(Application application, zzg zzg2, String str, zzt zzt, zzab zzab, zzoe zzoe, zzbd zzbd, zzbg zzbg, zzq zzq, zzbs zzbs) {
        this.zzc = application;
        this.zzd = zzg2;
        this.zze = str;
        this.zzl = zzt;
        this.zzf = zzab;
        this.zzg = zzoe;
        this.zzh = zzbd;
        this.zzi = zzbg;
        this.zzj = zzq;
        this.zzk = zzbs;
    }

    public final Task executeTask(RecaptchaAction recaptchaAction, long j) {
        AnonymousClass040 r2 = this.zzl.zzb;
        zzau zzau = new zzau(this, recaptchaAction, j, (C023509x) null);
        return zzj.zza(AnonymousClass0A2.A01(C023109s.A00, C008903u.A00, zzau, r2));
    }

    public final String zzg() {
        return this.zze;
    }

    public static final /* synthetic */ void zzi(zzaw zzaw, long j, RecaptchaAction recaptchaAction, zzbd zzbd) {
        zzp zzp;
        zzbb zza2 = zzbd.zza(zzne.EXECUTE_NATIVE);
        zzaw.zzi.zze.put(zza2, new zzbf(zza2, zzaw.zzi.zza, new zzac()));
        if (!zzb.A03(recaptchaAction.action)) {
            zzp = C165617ti.A0K(zzl.zzq, zzn.zzi, (String) null);
        } else {
            zzp = null;
        }
        if (j < 5000) {
            zzp = C165617ti.A0K(zzl.zzT, zzn.zzc, (String) null);
        } else if (zzp == null) {
            zzaw.zzi.zza(zza2);
            return;
        }
        zzaw.zzi.zzb(zza2, zzp, (String) null);
        throw zzp;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzj(long r8, java.lang.String r10, com.google.android.recaptcha.internal.zzbd r11, X.C023509x r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzao
            if (r0 == 0) goto L_0x0023
            r6 = r12
            com.google.android.recaptcha.internal.zzao r6 = (com.google.android.recaptcha.internal.zzao) r6
            int r2 = r6.zzc
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0023
            int r2 = r2 - r1
            r6.zzc = r2
        L_0x0012:
            java.lang.Object r1 = r6.zza
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.zzc
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002e
            if (r0 != r3) goto L_0x0029
            com.google.android.recaptcha.internal.zzbb r4 = r6.zze
            com.google.android.recaptcha.internal.zzaw r3 = r6.zzd
            goto L_0x004d
        L_0x0023:
            com.google.android.recaptcha.internal.zzao r6 = new com.google.android.recaptcha.internal.zzao
            r6.<init>(r7, r12)
            goto L_0x0012
        L_0x0029:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x002e:
            X.AnonymousClass0AN.A00(r1)
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.COLLECT_SIGNALS
            com.google.android.recaptcha.internal.zzbb r4 = r11.zza(r0)
            com.google.android.recaptcha.internal.zzbg r1 = r7.zzi
            r0 = 2
            r1.zze.put(r4, new com.google.android.recaptcha.internal.zzbf(r4, r1.zza, new com.google.android.recaptcha.internal.zzac()))
            com.google.android.recaptcha.internal.zzg r0 = r7.zzd     // Catch:{ Exception -> 0x0059 }
            r6.zzd = r7     // Catch:{ Exception -> 0x0059 }
            r6.zze = r4     // Catch:{ Exception -> 0x0059 }
            r6.zzc = r3     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r1 = r0.zza(r10, r8, r6)     // Catch:{ Exception -> 0x0059 }
            if (r1 == r5) goto L_0x0058
            r3 = r7
            goto L_0x0050
        L_0x004d:
            X.AnonymousClass0AN.A00(r1)     // Catch:{ Exception -> 0x005c }
        L_0x0050:
            com.google.android.recaptcha.internal.zzog r1 = (com.google.android.recaptcha.internal.zzog) r1     // Catch:{ Exception -> 0x005c }
            com.google.android.recaptcha.internal.zzbg r0 = r3.zzi     // Catch:{ Exception -> 0x005c }
            r0.zza(r4)     // Catch:{ Exception -> 0x005c }
            return r1
        L_0x0058:
            return r5
        L_0x0059:
            r1 = move-exception
            r3 = r7
            goto L_0x005d
        L_0x005c:
            r1 = move-exception
        L_0x005d:
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzp
            if (r0 == 0) goto L_0x0069
            com.google.android.recaptcha.internal.zzp r1 = (com.google.android.recaptcha.internal.zzp) r1
        L_0x0063:
            com.google.android.recaptcha.internal.zzbg r0 = r3.zzi
            r0.zzb(r4, r1, r2)
            throw r1
        L_0x0069:
            com.google.android.recaptcha.internal.zzn r1 = com.google.android.recaptcha.internal.zzn.zzc
            com.google.android.recaptcha.internal.zzl r0 = com.google.android.recaptcha.internal.zzl.zzan
            com.google.android.recaptcha.internal.zzp r1 = X.C165617ti.A0K(r0, r1, r2)
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaw.zzj(long, java.lang.String, com.google.android.recaptcha.internal.zzbd, X.09x):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzk(com.google.android.recaptcha.RecaptchaAction r15, long r16, X.C023509x r18) {
        /*
            r14 = this;
            r3 = r18
            boolean r0 = r3 instanceof com.google.android.recaptcha.internal.zzas
            r7 = r14
            if (r0 == 0) goto L_0x0026
            r5 = r3
            com.google.android.recaptcha.internal.zzas r5 = (com.google.android.recaptcha.internal.zzas) r5
            int r2 = r5.zzc
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r5.zzc = r2
        L_0x0015:
            java.lang.Object r1 = r5.zza
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.zzc
            r3 = 1
            r13 = 0
            if (r0 == 0) goto L_0x0031
            if (r0 != r3) goto L_0x002c
            com.google.android.recaptcha.internal.zzbd r11 = r5.zze
            com.google.android.recaptcha.internal.zzaw r7 = r5.zzd
            goto L_0x0062
        L_0x0026:
            com.google.android.recaptcha.internal.zzas r5 = new com.google.android.recaptcha.internal.zzas
            r5.<init>(r14, r3)
            goto L_0x0015
        L_0x002c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0031:
            X.AnonymousClass0AN.A00(r1)
            java.lang.String r12 = X.C36361kB.A0l()
            com.google.android.recaptcha.internal.zzbd r0 = r14.zzh
            com.google.android.recaptcha.internal.zzbd r11 = new com.google.android.recaptcha.internal.zzbd
            r11.<init>(r0)
            r11.zzd = r12
            com.google.android.recaptcha.internal.zzbg r2 = r14.zzi
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.EXECUTE_TOTAL
            com.google.android.recaptcha.internal.zzbb r1 = r11.zza(r0)
            r0 = 2
            r2.zze.put(r1, new com.google.android.recaptcha.internal.zzbf(r1, r2.zza, new com.google.android.recaptcha.internal.zzac()))
            com.google.android.recaptcha.internal.zzat r6 = new com.google.android.recaptcha.internal.zzat     // Catch:{ Exception -> 0x006c }
            r10 = r15
            r8 = r16
            r6.<init>(r7, r8, r10, r11, r12, r13)     // Catch:{ Exception -> 0x006c }
            r5.zzd = r14     // Catch:{ Exception -> 0x006c }
            r5.zze = r11     // Catch:{ Exception -> 0x006c }
            r5.zzc = r3     // Catch:{ Exception -> 0x006c }
            java.lang.Object r1 = X.C07340Xg.A00(r5, r6, r8)     // Catch:{ Exception -> 0x006c }
            if (r1 != r4) goto L_0x0065
            return r4
        L_0x0062:
            X.AnonymousClass0AN.A00(r1)     // Catch:{ Exception -> 0x006a }
        L_0x0065:
            X.0AK r1 = (X.AnonymousClass0AK) r1     // Catch:{ Exception -> 0x006a }
            java.lang.Object r0 = r1.value     // Catch:{ Exception -> 0x006a }
            return r0
        L_0x006a:
            r2 = move-exception
            goto L_0x006d
        L_0x006c:
            r2 = move-exception
        L_0x006d:
            boolean r0 = r2 instanceof com.google.android.recaptcha.internal.zzp
            if (r0 == 0) goto L_0x0087
            com.google.android.recaptcha.internal.zzp r2 = (com.google.android.recaptcha.internal.zzp) r2
        L_0x0073:
            com.google.android.recaptcha.internal.zzbg r1 = r7.zzi
            com.google.android.recaptcha.internal.zzne r0 = com.google.android.recaptcha.internal.zzne.EXECUTE_TOTAL
            com.google.android.recaptcha.internal.zzbb r0 = r11.zza(r0)
            r1.zzb(r0, r2, r13)
            com.google.android.recaptcha.RecaptchaException r0 = r2.zzc()
            X.03N r0 = X.AnonymousClass00C.A02(r0)
            return r0
        L_0x0087:
            java.lang.Class r3 = r2.getClass()
            com.google.android.recaptcha.internal.zzo r0 = com.google.android.recaptcha.internal.zzp.zza
            com.google.android.recaptcha.internal.zzn r2 = com.google.android.recaptcha.internal.zzn.zzc
            com.google.android.recaptcha.internal.zzl r1 = com.google.android.recaptcha.internal.zzl.zzaj
            java.lang.String r0 = r3.getSimpleName()
            com.google.android.recaptcha.internal.zzp r2 = X.C165617ti.A0K(r1, r2, r0)
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaw.zzk(com.google.android.recaptcha.RecaptchaAction, long, X.09x):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void zzl(zzol zzol, zzbd zzbd) {
        zzp A0K;
        zzbb zza2 = zzbd.zza(zzne.POST_EXECUTE);
        this.zzi.zze.put(zza2, new zzbf(zza2, this.zzi.zza, new zzac()));
        try {
            zzjb<zzon> zzjb = zzol.zzh;
            int A02 = C000300d.A02(AnonymousClass03U.A06(zzjb, 10));
            if (A02 < 16) {
                A02 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A02);
            for (zzon zzon : zzjb) {
                linkedHashMap.put(zzon.zze, zzon.zzf);
            }
            this.zzj.zzb(linkedHashMap);
            this.zzi.zza(zza2);
        } catch (Exception e) {
            if (e instanceof zzp) {
                A0K = (zzp) e;
            } else {
                A0K = C165617ti.A0K(zzl.zzan, zzn.zzc, (String) null);
            }
            this.zzi.zzb(zza2, A0K, (String) null);
            throw A0K;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: execute-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m68execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction r7, long r8, X.C023509x r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzap
            if (r0 == 0) goto L_0x003f
            r4 = r10
            com.google.android.recaptcha.internal.zzap r4 = (com.google.android.recaptcha.internal.zzap) r4
            int r2 = r4.zzc
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003f
            int r2 = r2 - r1
            r4.zzc = r2
        L_0x0012:
            java.lang.Object r3 = r4.zza
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.zzc
            r1 = 1
            if (r0 == 0) goto L_0x0025
            if (r0 != r1) goto L_0x0045
            X.AnonymousClass0AN.A00(r3)
        L_0x0020:
            X.0AK r3 = (X.AnonymousClass0AK) r3
            java.lang.Object r0 = r3.value
            return r0
        L_0x0025:
            X.AnonymousClass0AN.A00(r3)
            com.google.android.recaptcha.internal.zzt r0 = r6.zzl
            X.040 r0 = r0.zzb
            X.02h r0 = r0.BAE()
            r10 = 0
            com.google.android.recaptcha.internal.zzaq r5 = new com.google.android.recaptcha.internal.zzaq
            r5.<init>(r6, r7, r8, r10)
            r4.zzc = r1
            java.lang.Object r3 = X.AnonymousClass0A2.A00(r4, r0, r5)
            if (r3 != r2) goto L_0x0020
            return r2
        L_0x003f:
            com.google.android.recaptcha.internal.zzap r4 = new com.google.android.recaptcha.internal.zzap
            r4.<init>(r6, r10)
            goto L_0x0012
        L_0x0045:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaw.m68execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction, long, X.09x):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: execute-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m69executegIAlus(com.google.android.recaptcha.RecaptchaAction r6, X.C023509x r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzar
            if (r0 == 0) goto L_0x0033
            r4 = r7
            com.google.android.recaptcha.internal.zzar r4 = (com.google.android.recaptcha.internal.zzar) r4
            int r2 = r4.zzc
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0033
            int r2 = r2 - r1
            r4.zzc = r2
        L_0x0012:
            java.lang.Object r3 = r4.zza
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r4.zzc
            r0 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 != r0) goto L_0x0039
            X.AnonymousClass0AN.A00(r3)
            X.0AK r3 = (X.AnonymousClass0AK) r3
            java.lang.Object r0 = r3.value
        L_0x0024:
            return r0
        L_0x0025:
            X.AnonymousClass0AN.A00(r3)
            r4.zzc = r0
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r0 = r5.m68execute0E7RQCE(r6, r0, r4)
            if (r0 != r2) goto L_0x0024
            return r2
        L_0x0033:
            com.google.android.recaptcha.internal.zzar r4 = new com.google.android.recaptcha.internal.zzar
            r4.<init>(r5, r7)
            goto L_0x0012
        L_0x0039:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzaw.m69executegIAlus(com.google.android.recaptcha.RecaptchaAction, X.09x):java.lang.Object");
    }

    public final Task executeTask(RecaptchaAction recaptchaAction) {
        AnonymousClass040 r2 = this.zzl.zzb;
        zzau zzau = new zzau(this, recaptchaAction, 10000, (C023509x) null);
        return zzj.zza(AnonymousClass0A2.A01(C023109s.A00, C008903u.A00, zzau, r2));
    }
}
