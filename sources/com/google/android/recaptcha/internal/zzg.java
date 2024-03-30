package com.google.android.recaptcha.internal;

import X.AnonymousClass001;
import X.C009403z;
import X.C023409w;
import X.C023509x;
import X.C05250Oz;
import java.util.ArrayList;
import java.util.List;

public final class zzg {
    public final List zza;

    public zzg() {
        this((List) null, 1, (C05250Oz) null);
    }

    public final Object zza(String str, long j, C023509x r10) {
        return C009403z.A00(r10, new zzc(this, str, j, (C023509x) null));
    }

    public final List zzc() {
        return this.zza;
    }

    public /* synthetic */ zzg(List list, int i, C05250Oz r5) {
        C023409w r1 = C023409w.A00;
        ArrayList A0I = AnonymousClass001.A0I();
        this.zza = A0I;
        A0I.addAll(r1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzb(long r7, com.google.android.recaptcha.internal.zzoe r9, X.C023509x r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzd
            if (r0 == 0) goto L_0x0037
            r4 = r10
            com.google.android.recaptcha.internal.zzd r4 = (com.google.android.recaptcha.internal.zzd) r4
            int r2 = r4.zzc
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0037
            int r2 = r2 - r1
            r4.zzc = r2
        L_0x0012:
            java.lang.Object r3 = r4.zza
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r4.zzc
            r0 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 != r0) goto L_0x003d
            X.AnonymousClass0AN.A00(r3)
        L_0x0020:
            X.0AK r3 = (X.AnonymousClass0AK) r3
            java.lang.Object r0 = r3.value
            return r0
        L_0x0025:
            X.AnonymousClass0AN.A00(r3)
            r10 = 0
            com.google.android.recaptcha.internal.zzf r5 = new com.google.android.recaptcha.internal.zzf
            r5.<init>(r6, r7, r9, r10)
            r4.zzc = r0
            java.lang.Object r3 = X.C009403z.A00(r4, r5)
            if (r3 != r2) goto L_0x0020
            return r2
        L_0x0037:
            com.google.android.recaptcha.internal.zzd r4 = new com.google.android.recaptcha.internal.zzd
            r4.<init>(r6, r10)
            goto L_0x0012
        L_0x003d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzg.zzb(long, com.google.android.recaptcha.internal.zzoe, X.09x):java.lang.Object");
    }

    public final void zzd(zza zza2) {
        this.zza.add(zza2);
    }
}
