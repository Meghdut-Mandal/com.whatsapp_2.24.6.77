package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C36431kI;
import X.C36441kJ;
import X.C90484aE;
import X.C90504aG;
import X.C90514aH;
import java.util.Map;

public final class zzig extends zzif {
    public final boolean zzj(zzke zzke) {
        return zzke instanceof zzip;
    }

    public final zzij zzb(Object obj) {
        return ((zzip) obj).zzb;
    }

    public final zzij zzc(Object obj) {
        return ((zzip) obj).zzi();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        r1 = r9.zza.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r1 == null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        r0 = com.google.android.recaptcha.internal.zzjc.zza;
        r2 = ((com.google.android.recaptcha.internal.zzke) r1).zzX().zzc((com.google.android.recaptcha.internal.zzke) r2).zzk();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r3 = r7.zzb;
        r1 = r3.zzb.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r1 == 9) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r1 == 10) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r9.zzi(r7.zzb, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        return r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zze(java.lang.Object r5, com.google.android.recaptcha.internal.zzkq r6, java.lang.Object r7, com.google.android.recaptcha.internal.zzie r8, com.google.android.recaptcha.internal.zzij r9, java.lang.Object r10, com.google.android.recaptcha.internal.zzll r11) {
        /*
            r4 = this;
            com.google.android.recaptcha.internal.zzir r7 = (com.google.android.recaptcha.internal.zzir) r7
            com.google.android.recaptcha.internal.zziq r3 = r7.zzb
            com.google.android.recaptcha.internal.zzmb r1 = r3.zzb
            com.google.android.recaptcha.internal.zzmb r0 = com.google.android.recaptcha.internal.zzmb.ENUM
            r2 = 0
            if (r1 == r0) goto L_0x011f
            int r0 = r1.ordinal()
            switch(r0) {
                case 0: goto L_0x00be;
                case 1: goto L_0x00b4;
                case 2: goto L_0x00aa;
                case 3: goto L_0x00a0;
                case 4: goto L_0x0096;
                case 5: goto L_0x008c;
                case 6: goto L_0x0083;
                case 7: goto L_0x007a;
                case 8: goto L_0x0075;
                case 9: goto L_0x00f0;
                case 10: goto L_0x00c8;
                case 11: goto L_0x0070;
                case 12: goto L_0x0067;
                case 13: goto L_0x0118;
                case 14: goto L_0x005e;
                case 15: goto L_0x0055;
                case 16: goto L_0x004c;
                case 17: goto L_0x0043;
                default: goto L_0x0012;
            }
        L_0x0012:
            com.google.android.recaptcha.internal.zziq r3 = r7.zzb
            com.google.android.recaptcha.internal.zzmb r0 = r3.zzb
            int r1 = r0.ordinal()
            r0 = 9
            if (r1 == r0) goto L_0x0028
            r0 = 10
            if (r1 == r0) goto L_0x0028
        L_0x0022:
            com.google.android.recaptcha.internal.zziq r0 = r7.zzb
            r9.zzi(r0, r2)
            return r10
        L_0x0028:
            com.google.android.recaptcha.internal.zzle r0 = r9.zza
            java.lang.Object r1 = r0.get(r3)
            if (r1 == 0) goto L_0x0022
            java.nio.charset.Charset r0 = com.google.android.recaptcha.internal.zzjc.zza
            com.google.android.recaptcha.internal.zzke r1 = (com.google.android.recaptcha.internal.zzke) r1
            com.google.android.recaptcha.internal.zzkd r0 = r1.zzX()
            com.google.android.recaptcha.internal.zzke r2 = (com.google.android.recaptcha.internal.zzke) r2
            com.google.android.recaptcha.internal.zzkd r0 = r0.zzc(r2)
            com.google.android.recaptcha.internal.zzke r2 = r0.zzk()
            goto L_0x0022
        L_0x0043:
            long r0 = r6.zzn()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            goto L_0x0012
        L_0x004c:
            int r0 = r6.zzi()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x0012
        L_0x0055:
            long r0 = r6.zzm()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            goto L_0x0012
        L_0x005e:
            int r0 = r6.zzh()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x0012
        L_0x0067:
            int r0 = r6.zzj()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x0012
        L_0x0070:
            com.google.android.recaptcha.internal.zzgw r2 = r6.zzp()
            goto L_0x0012
        L_0x0075:
            java.lang.String r2 = r6.zzr()
            goto L_0x0012
        L_0x007a:
            boolean r0 = r6.zzN()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            goto L_0x0012
        L_0x0083:
            int r0 = r6.zzf()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x0012
        L_0x008c:
            long r0 = r6.zzk()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            goto L_0x0012
        L_0x0096:
            int r0 = r6.zzg()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x0012
        L_0x00a0:
            long r0 = r6.zzo()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            goto L_0x0012
        L_0x00aa:
            long r0 = r6.zzl()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            goto L_0x0012
        L_0x00b4:
            float r0 = r6.zzb()
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            goto L_0x0012
        L_0x00be:
            double r0 = r6.zza()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            goto L_0x0012
        L_0x00c8:
            com.google.android.recaptcha.internal.zzle r0 = r9.zza
            java.lang.Object r3 = r0.get(r3)
            boolean r0 = r3 instanceof com.google.android.recaptcha.internal.zzit
            if (r0 == 0) goto L_0x0122
            com.google.android.recaptcha.internal.zzkr r2 = X.C165587tf.A0I(r3)
            r0 = r3
            com.google.android.recaptcha.internal.zzit r0 = (com.google.android.recaptcha.internal.zzit) r0
            boolean r0 = r0.zzG()
            if (r0 != 0) goto L_0x00ec
            java.lang.Object r1 = r2.zze()
            r2.zzg(r1, r3)
            com.google.android.recaptcha.internal.zziq r0 = r7.zzb
            r9.zzi(r0, r1)
            r3 = r1
        L_0x00ec:
            r6.zzu(r3, r2, r8)
            return r10
        L_0x00f0:
            com.google.android.recaptcha.internal.zzle r0 = r9.zza
            java.lang.Object r3 = r0.get(r3)
            boolean r0 = r3 instanceof com.google.android.recaptcha.internal.zzit
            if (r0 == 0) goto L_0x0122
            com.google.android.recaptcha.internal.zzkr r2 = X.C165587tf.A0I(r3)
            r0 = r3
            com.google.android.recaptcha.internal.zzit r0 = (com.google.android.recaptcha.internal.zzit) r0
            boolean r0 = r0.zzG()
            if (r0 != 0) goto L_0x0114
            java.lang.Object r1 = r2.zze()
            r2.zzg(r1, r3)
            com.google.android.recaptcha.internal.zziq r0 = r7.zzb
            r9.zzi(r0, r1)
            r3 = r1
        L_0x0114:
            r6.zzt(r3, r2, r8)
            return r10
        L_0x0118:
            java.lang.String r0 = "Shouldn't reach here."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x011f:
            r6.zzg()
        L_0x0122:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzig.zze(java.lang.Object, com.google.android.recaptcha.internal.zzkq, java.lang.Object, com.google.android.recaptcha.internal.zzie, com.google.android.recaptcha.internal.zzij, java.lang.Object, com.google.android.recaptcha.internal.zzll):java.lang.Object");
    }

    public final void zzf(Object obj) {
        ((zzip) obj).zzb.zzg();
    }

    public final int zza(Map.Entry entry) {
        return ((zziq) entry.getKey()).zza;
    }

    public final Object zzd(zzie zzie, zzke zzke, int i) {
        return zzie.zza(zzke, i);
    }

    public final void zzg(zzkq zzkq, Object obj, zzie zzie, zzij zzij) {
        throw null;
    }

    public final void zzh(zzgw zzgw, Object obj, zzie zzie, zzij zzij) {
        throw null;
    }

    public final void zzi(zzmd zzmd, Map.Entry entry) {
        zziq zziq = (zziq) entry.getKey();
        zzmb zzmb = zzmb.DOUBLE;
        switch (zziq.zzb.ordinal()) {
            case 0:
                zzmd.zzf(zziq.zza, C90504aG.A01(entry.getValue()));
                return;
            case 1:
                zzmd.zzo(zziq.zza, C36441kJ.A03(entry.getValue()));
                return;
            case 2:
                zzmd.zzt(zziq.zza, C36431kI.A09(entry.getValue()));
                return;
            case 3:
                zzmd.zzK(zziq.zza, C36431kI.A09(entry.getValue()));
                return;
            case 4:
            case 13:
                zzmd.zzr(zziq.zza, C90484aE.A0G(entry));
                return;
            case 5:
                zzmd.zzm(zziq.zza, C36431kI.A09(entry.getValue()));
                return;
            case 6:
                zzmd.zzk(zziq.zza, C90484aE.A0G(entry));
                return;
            case 7:
                zzmd.zzb(zziq.zza, AnonymousClass000.A1X(entry.getValue()));
                return;
            case 8:
                zzmd.zzG(zziq.zza, C90514aH.A10(entry));
                return;
            case 9:
                zzmd.zzq(zziq.zza, entry.getValue(), zzkn.zzb.zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzmd.zzv(zziq.zza, entry.getValue(), zzkn.zzb.zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzmd.zzd(zziq.zza, (zzgw) entry.getValue());
                return;
            case 12:
                zzmd.zzI(zziq.zza, C90484aE.A0G(entry));
                return;
            case 14:
                zzmd.zzx(zziq.zza, C90484aE.A0G(entry));
                return;
            case 15:
                zzmd.zzz(zziq.zza, C36431kI.A09(entry.getValue()));
                return;
            case 16:
                zzmd.zzB(zziq.zza, C90484aE.A0G(entry));
                return;
            case 17:
                zzmd.zzD(zziq.zza, C36431kI.A09(entry.getValue()));
                return;
            default:
                return;
        }
    }
}
