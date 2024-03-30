package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C165577te;
import X.C165597tg;
import X.C165617ti;
import X.C36431kI;
import X.C36441kJ;
import X.C90464aC;
import X.C90504aG;
import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

public final class zzkh implements zzkr {
    public static final int[] zza = new int[0];
    public static final Unsafe zzb = zzlv.zzg();
    public final int[] zzc;
    public final Object[] zzd;
    public final int zze;
    public final int zzf;
    public final zzke zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int[] zzj;
    public final int zzk;
    public final int zzl;
    public final zzjs zzm;
    public final zzll zzn;
    public final zzif zzo;
    public final zzkk zzp;
    public final zzjz zzq;

    public static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        r4 = java.lang.Double.doubleToLongBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d3, code lost:
        r6 = r6 * 53;
        r0 = ((java.lang.String) com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0110, code lost:
        r6 = r6 * 53;
        r0 = X.AnonymousClass000.A0I(com.google.android.recaptcha.internal.zzlv.zzf(r9, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0121, code lost:
        r6 = r6 * 53;
        r4 = X.C36431kI.A09(com.google.android.recaptcha.internal.zzlv.zzf(r9, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012b, code lost:
        r0 = com.google.android.recaptcha.internal.zzjc.zza;
        r0 = (int) (r4 ^ (r4 >>> 32));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0138, code lost:
        r6 = r6 * 53;
        r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0142, code lost:
        r6 = r6 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.Object r9) {
        /*
            r8 = this;
            r3 = 0
            r6 = 0
        L_0x0002:
            int[] r2 = r8.zzc
            int r0 = r2.length
            if (r3 >= r0) goto L_0x0145
            int r0 = r3 + 1
            r0 = r2[r0]
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            int r0 = r0 >>> 20
            r5 = r0 & 255(0xff, float:3.57E-43)
            r0 = r2[r3]
            long r1 = (long) r1
            r4 = 37
            r7 = 32
            switch(r5) {
                case 0: goto L_0x0020;
                case 1: goto L_0x0029;
                case 2: goto L_0x0037;
                case 3: goto L_0x0037;
                case 4: goto L_0x003f;
                case 5: goto L_0x0037;
                case 6: goto L_0x003f;
                case 7: goto L_0x0047;
                case 8: goto L_0x00d3;
                case 9: goto L_0x0057;
                case 10: goto L_0x0138;
                case 11: goto L_0x003f;
                case 12: goto L_0x003f;
                case 13: goto L_0x003f;
                case 14: goto L_0x0037;
                case 15: goto L_0x003f;
                case 16: goto L_0x0037;
                case 17: goto L_0x0057;
                case 18: goto L_0x0138;
                case 19: goto L_0x0138;
                case 20: goto L_0x0138;
                case 21: goto L_0x0138;
                case 22: goto L_0x0138;
                case 23: goto L_0x0138;
                case 24: goto L_0x0138;
                case 25: goto L_0x0138;
                case 26: goto L_0x0138;
                case 27: goto L_0x0138;
                case 28: goto L_0x0138;
                case 29: goto L_0x0138;
                case 30: goto L_0x0138;
                case 31: goto L_0x0138;
                case 32: goto L_0x0138;
                case 33: goto L_0x0138;
                case 34: goto L_0x0138;
                case 35: goto L_0x0138;
                case 36: goto L_0x0138;
                case 37: goto L_0x0138;
                case 38: goto L_0x0138;
                case 39: goto L_0x0138;
                case 40: goto L_0x0138;
                case 41: goto L_0x0138;
                case 42: goto L_0x0138;
                case 43: goto L_0x0138;
                case 44: goto L_0x0138;
                case 45: goto L_0x0138;
                case 46: goto L_0x0138;
                case 47: goto L_0x0138;
                case 48: goto L_0x0138;
                case 49: goto L_0x0138;
                case 50: goto L_0x0138;
                case 51: goto L_0x0065;
                case 52: goto L_0x007b;
                case 53: goto L_0x0091;
                case 54: goto L_0x0099;
                case 55: goto L_0x00a1;
                case 56: goto L_0x00a8;
                case 57: goto L_0x00af;
                case 58: goto L_0x00b6;
                case 59: goto L_0x00cd;
                case 60: goto L_0x00e0;
                case 61: goto L_0x00e7;
                case 62: goto L_0x00ee;
                case 63: goto L_0x00f5;
                case 64: goto L_0x00fc;
                case 65: goto L_0x0103;
                case 66: goto L_0x010a;
                case 67: goto L_0x011b;
                case 68: goto L_0x0132;
                default: goto L_0x001d;
            }
        L_0x001d:
            int r3 = r3 + 3
            goto L_0x0002
        L_0x0020:
            int r6 = r6 * 53
            com.google.android.recaptcha.internal.zzlu r0 = com.google.android.recaptcha.internal.zzlv.zzf
            double r0 = r0.zza(r9, r1)
            goto L_0x0075
        L_0x0029:
            int r6 = r6 * 53
            com.google.android.recaptcha.internal.zzlu r0 = com.google.android.recaptcha.internal.zzlv.zzf
            float r0 = r0.zzb(r9, r1)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0142
        L_0x0037:
            int r6 = r6 * 53
            long r4 = com.google.android.recaptcha.internal.zzlv.zzd(r9, r1)
            goto L_0x012b
        L_0x003f:
            int r6 = r6 * 53
            int r0 = com.google.android.recaptcha.internal.zzlv.zzc(r9, r1)
            goto L_0x0142
        L_0x0047:
            int r6 = r6 * 53
            com.google.android.recaptcha.internal.zzlu r0 = com.google.android.recaptcha.internal.zzlv.zzf
            boolean r1 = r0.zzg(r9, r1)
            java.nio.charset.Charset r0 = com.google.android.recaptcha.internal.zzjc.zza
            int r0 = X.C36341k9.A01(r1)
            goto L_0x0142
        L_0x0057:
            int r6 = r6 * 53
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)
            if (r0 == 0) goto L_0x0063
            int r4 = r0.hashCode()
        L_0x0063:
            int r6 = r6 + r4
            goto L_0x001d
        L_0x0065:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
            int r6 = r6 * 53
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)
            double r0 = X.C90504aG.A01(r0)
        L_0x0075:
            long r4 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x012b
        L_0x007b:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
            int r6 = r6 * 53
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)
            float r0 = X.C36441kJ.A03(r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0142
        L_0x0091:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
            goto L_0x0121
        L_0x0099:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
            goto L_0x0121
        L_0x00a1:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
            goto L_0x0110
        L_0x00a8:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
            goto L_0x0121
        L_0x00af:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
            goto L_0x0110
        L_0x00b6:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
            int r6 = r6 * 53
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)
            boolean r1 = X.AnonymousClass000.A1X(r0)
            java.nio.charset.Charset r0 = com.google.android.recaptcha.internal.zzjc.zza
            int r0 = X.C36341k9.A01(r1)
            goto L_0x0142
        L_0x00cd:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
        L_0x00d3:
            int r6 = r6 * 53
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x0142
        L_0x00e0:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
            goto L_0x0138
        L_0x00e7:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
            goto L_0x0138
        L_0x00ee:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
            goto L_0x0110
        L_0x00f5:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
            goto L_0x0110
        L_0x00fc:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
            goto L_0x0110
        L_0x0103:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
            goto L_0x0121
        L_0x010a:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
        L_0x0110:
            int r6 = r6 * 53
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)
            int r0 = X.AnonymousClass000.A0I(r0)
            goto L_0x0142
        L_0x011b:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
        L_0x0121:
            int r6 = r6 * 53
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)
            long r4 = X.C36431kI.A09(r0)
        L_0x012b:
            java.nio.charset.Charset r0 = com.google.android.recaptcha.internal.zzjc.zza
            long r0 = r4 >>> r7
            long r4 = r4 ^ r0
            int r0 = (int) r4
            goto L_0x0142
        L_0x0132:
            boolean r0 = r8.zzR(r9, r0, r3)
            if (r0 == 0) goto L_0x001d
        L_0x0138:
            int r6 = r6 * 53
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r9, r1)
            int r0 = r0.hashCode()
        L_0x0142:
            int r6 = r6 + r0
            goto L_0x001d
        L_0x0145:
            int r1 = r6 * 53
            r0 = r9
            com.google.android.recaptcha.internal.zzit r0 = (com.google.android.recaptcha.internal.zzit) r0
            com.google.android.recaptcha.internal.zzlm r0 = r0.zzc
            int r1 = X.C36401kF.A02(r0, r1)
            boolean r0 = r8.zzh
            if (r0 == 0) goto L_0x0160
            int r1 = r1 * 53
            com.google.android.recaptcha.internal.zzip r9 = (com.google.android.recaptcha.internal.zzip) r9
            com.google.android.recaptcha.internal.zzij r0 = r9.zzb
            com.google.android.recaptcha.internal.zzle r0 = r0.zza
            int r1 = X.C36401kF.A02(r0, r1)
        L_0x0160:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzb(java.lang.Object):int");
    }

    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgj zzgj) {
        zzc(obj, bArr, i, i2, 0, zzgj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        if (r4 != r0) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        if (r6 != r1) goto L_0x00d6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzk(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            r8 = 0
            r5 = 0
        L_0x0002:
            int[] r6 = r9.zzc
            int r0 = r6.length
            if (r5 >= r0) goto L_0x0097
            int r0 = r5 + 1
            r0 = r6[r0]
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r0 & r4
            int r0 = r0 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r2 = (long) r1
            switch(r0) {
                case 0: goto L_0x007a;
                case 1: goto L_0x005f;
                case 2: goto L_0x0050;
                case 3: goto L_0x0050;
                case 4: goto L_0x0041;
                case 5: goto L_0x0050;
                case 6: goto L_0x0041;
                case 7: goto L_0x0030;
                case 8: goto L_0x001b;
                case 9: goto L_0x001b;
                case 10: goto L_0x001b;
                case 11: goto L_0x0041;
                case 12: goto L_0x0041;
                case 13: goto L_0x0041;
                case 14: goto L_0x0050;
                case 15: goto L_0x0041;
                case 16: goto L_0x0050;
                case 17: goto L_0x001b;
                case 18: goto L_0x00c8;
                case 19: goto L_0x00c8;
                case 20: goto L_0x00c8;
                case 21: goto L_0x00c8;
                case 22: goto L_0x00c8;
                case 23: goto L_0x00c8;
                case 24: goto L_0x00c8;
                case 25: goto L_0x00c8;
                case 26: goto L_0x00c8;
                case 27: goto L_0x00c8;
                case 28: goto L_0x00c8;
                case 29: goto L_0x00c8;
                case 30: goto L_0x00c8;
                case 31: goto L_0x00c8;
                case 32: goto L_0x00c8;
                case 33: goto L_0x00c8;
                case 34: goto L_0x00c8;
                case 35: goto L_0x00c8;
                case 36: goto L_0x00c8;
                case 37: goto L_0x00c8;
                case 38: goto L_0x00c8;
                case 39: goto L_0x00c8;
                case 40: goto L_0x00c8;
                case 41: goto L_0x00c8;
                case 42: goto L_0x00c8;
                case 43: goto L_0x00c8;
                case 44: goto L_0x00c8;
                case 45: goto L_0x00c8;
                case 46: goto L_0x00c8;
                case 47: goto L_0x00c8;
                case 48: goto L_0x00c8;
                case 49: goto L_0x00c8;
                case 50: goto L_0x00c8;
                case 51: goto L_0x00b8;
                case 52: goto L_0x00b8;
                case 53: goto L_0x00b8;
                case 54: goto L_0x00b8;
                case 55: goto L_0x00b8;
                case 56: goto L_0x00b8;
                case 57: goto L_0x00b8;
                case 58: goto L_0x00b8;
                case 59: goto L_0x00b8;
                case 60: goto L_0x00b8;
                case 61: goto L_0x00b8;
                case 62: goto L_0x00b8;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00b8;
                case 65: goto L_0x00b8;
                case 66: goto L_0x00b8;
                case 67: goto L_0x00b8;
                case 68: goto L_0x00b8;
                default: goto L_0x0018;
            }
        L_0x0018:
            int r5 = r5 + 3
            goto L_0x0002
        L_0x001b:
            boolean r0 = r9.zzL(r10, r11, r5)
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r1 = com.google.android.recaptcha.internal.zzlv.zzf(r10, r2)
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r11, r2)
            boolean r0 = com.google.android.recaptcha.internal.zzkt.zzH(r1, r0)
            if (r0 == 0) goto L_0x00d6
            goto L_0x0018
        L_0x0030:
            boolean r0 = r9.zzL(r10, r11, r5)
            if (r0 == 0) goto L_0x00d6
            com.google.android.recaptcha.internal.zzlu r0 = com.google.android.recaptcha.internal.zzlv.zzf
            boolean r4 = r0.zzg(r10, r2)
            boolean r0 = r0.zzg(r11, r2)
            goto L_0x0077
        L_0x0041:
            boolean r0 = r9.zzL(r10, r11, r5)
            if (r0 == 0) goto L_0x00d6
            int r4 = com.google.android.recaptcha.internal.zzlv.zzc(r10, r2)
            int r0 = com.google.android.recaptcha.internal.zzlv.zzc(r11, r2)
            goto L_0x0077
        L_0x0050:
            boolean r0 = r9.zzL(r10, r11, r5)
            if (r0 == 0) goto L_0x00d6
            long r6 = com.google.android.recaptcha.internal.zzlv.zzd(r10, r2)
            long r1 = com.google.android.recaptcha.internal.zzlv.zzd(r11, r2)
            goto L_0x0092
        L_0x005f:
            boolean r0 = r9.zzL(r10, r11, r5)
            if (r0 == 0) goto L_0x00d6
            com.google.android.recaptcha.internal.zzlu r1 = com.google.android.recaptcha.internal.zzlv.zzf
            float r0 = r1.zzb(r10, r2)
            int r4 = java.lang.Float.floatToIntBits(r0)
            float r0 = r1.zzb(r11, r2)
            int r0 = java.lang.Float.floatToIntBits(r0)
        L_0x0077:
            if (r4 != r0) goto L_0x00d6
            goto L_0x0018
        L_0x007a:
            boolean r0 = r9.zzL(r10, r11, r5)
            if (r0 == 0) goto L_0x00d6
            com.google.android.recaptcha.internal.zzlu r4 = com.google.android.recaptcha.internal.zzlv.zzf
            double r0 = r4.zza(r10, r2)
            long r6 = java.lang.Double.doubleToLongBits(r0)
            double r0 = r4.zza(r11, r2)
            long r1 = java.lang.Double.doubleToLongBits(r0)
        L_0x0092:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00d6
            goto L_0x0018
        L_0x0097:
            r0 = r10
            com.google.android.recaptcha.internal.zzit r0 = (com.google.android.recaptcha.internal.zzit) r0
            com.google.android.recaptcha.internal.zzlm r1 = r0.zzc
            r0 = r11
            com.google.android.recaptcha.internal.zzit r0 = (com.google.android.recaptcha.internal.zzit) r0
            com.google.android.recaptcha.internal.zzlm r0 = r0.zzc
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d6
            boolean r0 = r9.zzh
            if (r0 == 0) goto L_0x00d7
            com.google.android.recaptcha.internal.zzip r10 = (com.google.android.recaptcha.internal.zzip) r10
            com.google.android.recaptcha.internal.zzij r1 = r10.zzb
            com.google.android.recaptcha.internal.zzip r11 = (com.google.android.recaptcha.internal.zzip) r11
            com.google.android.recaptcha.internal.zzij r0 = r11.zzb
            boolean r0 = r1.equals(r0)
            return r0
        L_0x00b8:
            int r0 = r5 + 2
            r0 = r6[r0]
            r0 = r0 & r4
            long r0 = (long) r0
            int r4 = com.google.android.recaptcha.internal.zzlv.zzc(r10, r0)
            int r0 = com.google.android.recaptcha.internal.zzlv.zzc(r11, r0)
            if (r4 != r0) goto L_0x00d6
        L_0x00c8:
            java.lang.Object r1 = com.google.android.recaptcha.internal.zzlv.zzf(r10, r2)
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r11, r2)
            boolean r0 = com.google.android.recaptcha.internal.zzkt.zzH(r1, r0)
            if (r0 != 0) goto L_0x0018
        L_0x00d6:
            return r8
        L_0x00d7:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzk(java.lang.Object, java.lang.Object):boolean");
    }

    public final boolean zzl(Object obj) {
        boolean z;
        Object obj2 = obj;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        loop0:
        while (true) {
            if (i3 < this.zzk) {
                int[] iArr = this.zzj;
                int[] iArr2 = this.zzc;
                int i4 = iArr[i3];
                int i5 = iArr2[i4];
                int i6 = iArr2[i4 + 1];
                int i7 = iArr2[i4 + 2];
                int i8 = i7 & 1048575;
                int i9 = 1 << (i7 >>> 20);
                if (i8 == i) {
                    i8 = i;
                } else if (i8 != 1048575) {
                    i2 = zzb.getInt(obj, (long) i8);
                }
                if ((268435456 & i6) != 0 && !zzO(obj2, i4, i8, i2, i9)) {
                    break;
                }
                int i10 = (i6 >>> 20) & 255;
                if (i10 == 9 || i10 == 17) {
                    z = zzO(obj2, i4, i8, i2, i9);
                } else {
                    if (i10 != 27) {
                        if (i10 == 60 || i10 == 68) {
                            z = zzR(obj, i5, i4);
                        } else if (i10 != 49) {
                            if (i10 == 50 && !((AbstractMap) zzlv.zzf(obj, (long) (i6 & 1048575))).isEmpty()) {
                                throw null;
                            }
                            i3++;
                            i = i8;
                        }
                    }
                    List list = (List) zzlv.zzf(obj, (long) (i6 & 1048575));
                    if (!list.isEmpty()) {
                        zzkr zzx = zzx(i4);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (!zzx.zzl(list.get(i11))) {
                                break loop0;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                    i3++;
                    i = i8;
                }
                if (z && !zzP(obj, i6, zzx(i4))) {
                    break;
                }
                i3++;
                i = i8;
            } else if (!this.zzh || ((zzip) obj2).zzb.zzk()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            Unsafe unsafe = zzb;
            long j = (long) (this.zzc[i + 1] & 1048575);
            Object object = unsafe.getObject(obj2, j);
            if (object != null) {
                zzkr zzx = zzx(i);
                if (!zzR(obj, i2, i)) {
                    if (!zzQ(object)) {
                        unsafe.putObject(obj, j, object);
                    } else {
                        Object zze2 = zzx.zze();
                        zzx.zzg(zze2, object);
                        unsafe.putObject(obj, j, zze2);
                    }
                    zzI(obj, i2, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, j);
                if (!zzQ(object2)) {
                    Object zze3 = zzx.zze();
                    zzx.zzg(zze3, object2);
                    unsafe.putObject(obj, j, zze3);
                    object2 = zze3;
                }
                zzx.zzg(object2, object);
                return;
            }
            int i3 = this.zzc[i];
            String obj3 = obj2.toString();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Source subfield ");
            A0u.append(i3);
            A0u.append(" is present but null: ");
            throw AnonymousClass000.A0g(obj3, A0u);
        }
    }

    private final void zzH(Object obj, int i) {
        int i2 = this.zzc[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            zzlv.zzq(obj, j, (1 << (i2 >>> 20)) | zzlv.zzc(obj, j));
        }
    }

    private final void zzI(Object obj, int i, int i2) {
        zzlv.zzq(obj, C165577te.A0H(this.zzc, i2), i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, C165577te.A0G(this.zzc, i), obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, C165577te.A0G(this.zzc, i2), obj2);
        zzI(obj, i, i2);
    }

    public static boolean zzM(int i) {
        return AnonymousClass000.A1P(i & 536870912);
    }

    private final boolean zzN(Object obj, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i + 2];
        long j = (long) (i2 & 1048575);
        if (j == 1048575) {
            int i3 = iArr[i + 1];
            long j2 = (long) (1048575 & i3);
            switch ((i3 >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(zzlv.zzf.zza(obj, j2)) != 0) {
                        return true;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(zzlv.zzf.zzb(obj, j2)) != 0) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (zzlv.zzd(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (zzlv.zzc(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    return zzlv.zzf.zzg(obj, j2);
                case 8:
                    Object zzf2 = zzlv.zzf(obj, j2);
                    if (zzf2 instanceof String) {
                        if (!((String) zzf2).isEmpty()) {
                            return true;
                        }
                    } else if (!(zzf2 instanceof zzgw)) {
                        throw C165617ti.A0U();
                    } else if (!zzgw.zzb.equals(zzf2)) {
                        return true;
                    }
                    break;
                case 9:
                case 17:
                    if (zzlv.zzf(obj, j2) != null) {
                        return true;
                    }
                    break;
                case 10:
                    if (!zzgw.zzb.equals(zzlv.zzf(obj, j2))) {
                        return true;
                    }
                    break;
                default:
                    throw C165617ti.A0U();
            }
        } else {
            if ((zzlv.zzc(obj, j) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzit) {
            return ((zzit) obj).zzG();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return AnonymousClass000.A1S(zzlv.zzc(obj, C165577te.A0H(this.zzc, i2)), i);
    }

    public static final void zzT(int i, Object obj, zzmd zzmd) {
        if (obj instanceof String) {
            zzmd.zzG(i, (String) obj);
        } else {
            zzmd.zzd(i, (zzgw) obj);
        }
    }

    public static zzlm zzd(Object obj) {
        zzit zzit = (zzit) obj;
        zzlm zzlm = zzit.zzc;
        if (zzlm != zzlm.zza) {
            return zzlm;
        }
        zzlm zzf2 = zzlm.zzf();
        zzit.zzc = zzf2;
        return zzf2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x016d, code lost:
        if (r8 == 0) goto L_0x0181;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x023d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.recaptcha.internal.zzkh zzm(java.lang.Class r30, com.google.android.recaptcha.internal.zzkb r31, com.google.android.recaptcha.internal.zzkk r32, com.google.android.recaptcha.internal.zzjs r33, com.google.android.recaptcha.internal.zzll r34, com.google.android.recaptcha.internal.zzif r35, com.google.android.recaptcha.internal.zzjz r36) {
        /*
            r29 = r31
            r0 = r29
            boolean r0 = r0 instanceof com.google.android.recaptcha.internal.zzkp
            if (r0 == 0) goto L_0x0377
            r0 = r29
            com.google.android.recaptcha.internal.zzkp r0 = (com.google.android.recaptcha.internal.zzkp) r0
            r29 = r0
            java.lang.String r14 = r0.zzb
            int r28 = r14.length()
            char r0 = X.C165597tg.A00(r14)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r1) goto L_0x0028
            r0 = 1
        L_0x001e:
            int r2 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r1) goto L_0x0029
            r0 = r2
            goto L_0x001e
        L_0x0028:
            r2 = 1
        L_0x0029:
            int r13 = r2 + 1
            char r4 = r14.charAt(r2)
            if (r4 < r1) goto L_0x0048
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x0035:
            int r2 = r13 + 1
            char r0 = r14.charAt(r13)
            if (r0 < r1) goto L_0x0045
            int r4 = X.C165597tg.A04(r0, r3, r4)
            int r3 = r3 + 13
            r13 = r2
            goto L_0x0035
        L_0x0045:
            int r0 = r0 << r3
            r4 = r4 | r0
            r13 = r2
        L_0x0048:
            if (r4 != 0) goto L_0x0256
            int[] r16 = zza
            r5 = 0
            r6 = 0
            r7 = 0
            r4 = 0
            r3 = 0
            r17 = 0
            r2 = 0
        L_0x0054:
            sun.misc.Unsafe r27 = zzb
            r0 = r29
            java.lang.Object[] r12 = r0.zzc
            com.google.android.recaptcha.internal.zzke r0 = r29.zza()
            java.lang.Class r26 = r0.getClass()
            int r31 = r2 + r7
            int r7 = r6 + r6
            int r0 = r6 * 3
            int[] r0 = new int[r0]
            r25 = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r24 = r0
            r23 = r2
            r22 = r31
            r21 = 0
            r20 = 0
        L_0x0078:
            r0 = r28
            if (r13 >= r0) goto L_0x035b
            int r0 = r13 + 1
            char r11 = r14.charAt(r13)
            if (r11 < r1) goto L_0x0098
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x0088:
            int r6 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r1) goto L_0x009a
            int r11 = X.C165597tg.A04(r0, r7, r11)
            int r7 = r7 + 13
            r0 = r6
            goto L_0x0088
        L_0x0098:
            r6 = r0
            goto L_0x009c
        L_0x009a:
            int r0 = r0 << r7
            r11 = r11 | r0
        L_0x009c:
            int r0 = r6 + 1
            char r10 = r14.charAt(r6)
            if (r10 < r1) goto L_0x00b8
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x00a8:
            int r13 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r1) goto L_0x00ba
            int r10 = X.C165597tg.A04(r0, r6, r10)
            int r6 = r6 + 13
            r0 = r13
            goto L_0x00a8
        L_0x00b8:
            r13 = r0
            goto L_0x00bc
        L_0x00ba:
            int r0 = r0 << r6
            r10 = r10 | r0
        L_0x00bc:
            r0 = r10 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00c6
            int r0 = r21 + 1
            r16[r21] = r20
            r21 = r0
        L_0x00c6:
            r9 = r10 & 255(0xff, float:3.57E-43)
            r8 = r10 & 2048(0x800, float:2.87E-42)
            r0 = 51
            if (r9 < r0) goto L_0x00ed
            int r0 = r13 + 1
            char r6 = r14.charAt(r13)
            if (r6 < r1) goto L_0x00ea
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x00da:
            int r13 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r1) goto L_0x01c9
            int r6 = X.C165597tg.A04(r0, r7, r6)
            int r7 = r7 + 13
            r0 = r13
            goto L_0x00da
        L_0x00ea:
            r13 = r0
            goto L_0x01cb
        L_0x00ed:
            int r19 = r17 + 1
            r1 = r12[r17]
            java.lang.String r1 = (java.lang.String) r1
            r0 = r26
            java.lang.reflect.Field r1 = zzC(r0, r1)
            r0 = 9
            if (r9 == r0) goto L_0x0183
            r0 = 17
            if (r9 == r0) goto L_0x0183
            r0 = 27
            if (r9 == r0) goto L_0x016f
            r0 = 49
            if (r9 == r0) goto L_0x016f
            r0 = 12
            if (r9 == r0) goto L_0x0166
            r0 = 30
            if (r9 == r0) goto L_0x0166
            r0 = 44
            if (r9 == r0) goto L_0x0166
            r0 = 50
            if (r9 != r0) goto L_0x0132
            int r15 = r19 + 1
            int r7 = r23 + 1
            r16[r23] = r20
            int r6 = r20 / 3
            r0 = r12[r19]
            int r6 = r6 + r6
            r24[r6] = r0
            if (r8 == 0) goto L_0x017d
            int r6 = r6 + 1
            int r19 = r15 + 1
            r0 = r12[r15]
            r24[r6] = r0
            r23 = r7
        L_0x0132:
            r0 = r27
            long r0 = r0.objectFieldOffset(r1)
            int r7 = (int) r0
            r0 = r10 & 4096(0x1000, float:5.74E-42)
            r15 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 == 0) goto L_0x0191
            r0 = 17
            if (r9 > r0) goto L_0x0191
            int r0 = r13 + 1
            char r6 = r14.charAt(r13)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r1) goto L_0x018f
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0153:
            int r13 = r0 + 1
            char r1 = r14.charAt(r0)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r0) goto L_0x01a1
            int r6 = X.C165597tg.A04(r1, r15, r6)
            int r15 = r15 + 13
            r0 = r13
            goto L_0x0153
        L_0x0166:
            int r6 = r29.zzc()
            r0 = 1
            if (r6 == r0) goto L_0x016f
            if (r8 == 0) goto L_0x0181
        L_0x016f:
            int r7 = r19 + 1
            int r0 = r20 / 3
            int r0 = r0 + r0
            int r6 = r0 + 1
            r0 = r12[r19]
            r24[r6] = r0
            r19 = r7
            goto L_0x0132
        L_0x017d:
            r19 = r15
            r23 = r7
        L_0x0181:
            r8 = 0
            goto L_0x0132
        L_0x0183:
            int r0 = r20 / 3
            int r0 = r0 + r0
            int r6 = r0 + 1
            java.lang.Class r0 = r1.getType()
            r24[r6] = r0
            goto L_0x0132
        L_0x018f:
            r13 = r0
            goto L_0x01a3
        L_0x0191:
            r1 = 0
            r0 = 18
            if (r9 < r0) goto L_0x01bb
            r0 = 49
            if (r9 > r0) goto L_0x01bb
            int r0 = r22 + 1
            r16[r22] = r7
            r22 = r0
            goto L_0x01bb
        L_0x01a1:
            int r1 = r1 << r15
            r6 = r6 | r1
        L_0x01a3:
            int r15 = r5 + r5
            int r0 = r6 / 32
            int r15 = r15 + r0
            r1 = r12[r15]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x01be
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x01b0:
            r0 = r27
            long r17 = r0.objectFieldOffset(r1)
            r0 = r17
            int r15 = (int) r0
            int r1 = r6 % 32
        L_0x01bb:
            r17 = r19
            goto L_0x0205
        L_0x01be:
            java.lang.String r1 = (java.lang.String) r1
            r0 = r26
            java.lang.reflect.Field r1 = zzC(r0, r1)
            r12[r15] = r1
            goto L_0x01b0
        L_0x01c9:
            int r0 = r0 << r7
            r6 = r6 | r0
        L_0x01cb:
            int r1 = r9 + -51
            r0 = 9
            if (r1 == r0) goto L_0x0248
            r0 = 17
            if (r1 == r0) goto L_0x0248
            r0 = 12
            if (r1 != r0) goto L_0x01e3
            int r1 = r29.zzc()
            r0 = 1
            if (r1 == r0) goto L_0x0248
            if (r8 != 0) goto L_0x0248
            r8 = 0
        L_0x01e3:
            int r6 = r6 + r6
            r1 = r12[r6]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x023d
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x01ec:
            r0 = r27
            long r0 = r0.objectFieldOffset(r1)
            int r7 = (int) r0
            int r6 = r6 + 1
            r1 = r12[r6]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0232
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x01fd:
            r0 = r27
            long r0 = r0.objectFieldOffset(r1)
            int r15 = (int) r0
            r1 = 0
        L_0x0205:
            int r19 = r20 + 1
            r25[r20] = r11
            int r18 = r19 + 1
            r0 = r10 & 512(0x200, float:7.175E-43)
            r11 = 0
            if (r0 == 0) goto L_0x0212
            r11 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0212:
            r0 = r10 & 256(0x100, float:3.59E-43)
            r10 = 0
            if (r0 == 0) goto L_0x0219
            r10 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0219:
            r6 = 0
            if (r8 == 0) goto L_0x021e
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x021e:
            int r0 = r9 << 20
            r10 = r10 | r11
            r10 = r10 | r6
            r10 = r10 | r0
            r7 = r7 | r10
            r25[r19] = r7
            int r20 = r18 + 1
            int r0 = r1 << 20
            r0 = r0 | r15
            r25[r18] = r0
            r1 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0078
        L_0x0232:
            java.lang.String r1 = (java.lang.String) r1
            r0 = r26
            java.lang.reflect.Field r1 = zzC(r0, r1)
            r12[r6] = r1
            goto L_0x01fd
        L_0x023d:
            java.lang.String r1 = (java.lang.String) r1
            r0 = r26
            java.lang.reflect.Field r1 = zzC(r0, r1)
            r12[r6] = r1
            goto L_0x01ec
        L_0x0248:
            int r7 = r17 + 1
            int r0 = r20 / 3
            int r0 = r0 + r0
            int r1 = r0 + 1
            r0 = r12[r17]
            r24[r1] = r0
            r17 = r7
            goto L_0x01e3
        L_0x0256:
            int r0 = r13 + 1
            char r5 = r14.charAt(r13)
            if (r5 < r1) goto L_0x0275
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x0262:
            int r2 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r1) goto L_0x0272
            int r5 = X.C165597tg.A04(r0, r3, r5)
            int r3 = r3 + 13
            r0 = r2
            goto L_0x0262
        L_0x0272:
            int r0 = r0 << r3
            r5 = r5 | r0
            r0 = r2
        L_0x0275:
            int r4 = r0 + 1
            char r10 = r14.charAt(r0)
            if (r10 < r1) goto L_0x0294
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x0281:
            int r2 = r4 + 1
            char r0 = r14.charAt(r4)
            if (r0 < r1) goto L_0x0291
            int r10 = X.C165597tg.A04(r0, r3, r10)
            int r3 = r3 + 13
            r4 = r2
            goto L_0x0281
        L_0x0291:
            int r0 = r0 << r3
            r10 = r10 | r0
            r4 = r2
        L_0x0294:
            int r0 = r4 + 1
            char r4 = r14.charAt(r4)
            if (r4 < r1) goto L_0x02b3
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x02a0:
            int r2 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r1) goto L_0x02b0
            int r4 = X.C165597tg.A04(r0, r3, r4)
            int r3 = r3 + 13
            r0 = r2
            goto L_0x02a0
        L_0x02b0:
            int r0 = r0 << r3
            r4 = r4 | r0
            r0 = r2
        L_0x02b3:
            int r7 = r0 + 1
            char r3 = r14.charAt(r0)
            if (r3 < r1) goto L_0x02d2
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x02bf:
            int r2 = r7 + 1
            char r0 = r14.charAt(r7)
            if (r0 < r1) goto L_0x02cf
            int r3 = X.C165597tg.A04(r0, r6, r3)
            int r6 = r6 + 13
            r7 = r2
            goto L_0x02bf
        L_0x02cf:
            int r0 = r0 << r6
            r3 = r3 | r0
            r7 = r2
        L_0x02d2:
            int r0 = r7 + 1
            char r6 = r14.charAt(r7)
            if (r6 < r1) goto L_0x02f1
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x02de:
            int r2 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r1) goto L_0x02ee
            int r6 = X.C165597tg.A04(r0, r7, r6)
            int r7 = r7 + 13
            r0 = r2
            goto L_0x02de
        L_0x02ee:
            int r0 = r0 << r7
            r6 = r6 | r0
            r0 = r2
        L_0x02f1:
            int r9 = r0 + 1
            char r7 = r14.charAt(r0)
            if (r7 < r1) goto L_0x0310
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x02fd:
            int r2 = r9 + 1
            char r0 = r14.charAt(r9)
            if (r0 < r1) goto L_0x030d
            int r7 = X.C165597tg.A04(r0, r8, r7)
            int r8 = r8 + 13
            r9 = r2
            goto L_0x02fd
        L_0x030d:
            int r0 = r0 << r8
            r7 = r7 | r0
            r9 = r2
        L_0x0310:
            int r0 = r9 + 1
            char r11 = r14.charAt(r9)
            if (r11 < r1) goto L_0x032f
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x031c:
            int r2 = r0 + 1
            char r0 = r14.charAt(r0)
            if (r0 < r1) goto L_0x032c
            int r11 = X.C165597tg.A04(r0, r8, r11)
            int r8 = r8 + 13
            r0 = r2
            goto L_0x031c
        L_0x032c:
            int r0 = r0 << r8
            r11 = r11 | r0
            r0 = r2
        L_0x032f:
            int r13 = r0 + 1
            char r2 = r14.charAt(r0)
            if (r2 < r1) goto L_0x034e
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x033b:
            int r8 = r13 + 1
            char r0 = r14.charAt(r13)
            if (r0 < r1) goto L_0x034b
            int r2 = X.C165597tg.A04(r0, r9, r2)
            int r9 = r9 + 13
            r13 = r8
            goto L_0x033b
        L_0x034b:
            int r0 = r0 << r9
            r2 = r2 | r0
            r13 = r8
        L_0x034e:
            int r0 = r2 + r7
            int r0 = r0 + r11
            int r17 = r5 + r5
            int r17 = r17 + r10
            int[] r0 = new int[r0]
            r16 = r0
            goto L_0x0054
        L_0x035b:
            com.google.android.recaptcha.internal.zzke r26 = r29.zza()
            int r27 = r29.zzc()
            r28 = 0
            com.google.android.recaptcha.internal.zzkh r21 = new com.google.android.recaptcha.internal.zzkh
            r22 = r25
            r23 = r24
            r24 = r4
            r25 = r3
            r29 = r16
            r30 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return r21
        L_0x0377:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzkb, com.google.android.recaptcha.internal.zzkk, com.google.android.recaptcha.internal.zzjs, com.google.android.recaptcha.internal.zzll, com.google.android.recaptcha.internal.zzif, com.google.android.recaptcha.internal.zzjz):com.google.android.recaptcha.internal.zzkh");
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private final zzix zzw(int i) {
        int i2 = i / 3;
        return (zzix) this.zzd[i2 + i2 + 1];
    }

    private final zzkr zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzkr zzkr = (zzkr) objArr[i3];
        if (zzkr != null) {
            return zzkr;
        }
        zzkr zzb2 = zzkn.zzb.zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzll zzll, Object obj3) {
        if (zzlv.zzf(obj, C165577te.A0G(this.zzc, i)) == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0364, code lost:
        r0 = com.google.android.recaptcha.internal.zzhh.zzb;
        r2 = r2 * X.C165567td.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04df, code lost:
        r0 = (r0 + r2) + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04e1, code lost:
        r13 = r13 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0550, code lost:
        r8 = r8 << 3;
        r2 = com.google.android.recaptcha.internal.zzhh.zzz(X.C36431kI.A09(com.google.android.recaptcha.internal.zzlv.zzf(r3, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x058a, code lost:
        r12 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x059c, code lost:
        if ((r1 instanceof com.google.android.recaptcha.internal.zzgw) != false) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x059e, code lost:
        r2 = com.google.android.recaptcha.internal.zzhh.zzx((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05c5, code lost:
        r0 = com.google.android.recaptcha.internal.zzhh.zzb;
        r1 = ((com.google.android.recaptcha.internal.zzgw) r1).zzd();
        r12 = X.C165567td.A00(r8) + (X.C165567td.A00(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05f6, code lost:
        r8 = r8 << 3;
        r2 = com.google.android.recaptcha.internal.zzhh.zzu(X.AnonymousClass000.A0I(com.google.android.recaptcha.internal.zzlv.zzf(r3, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0604, code lost:
        r12 = X.C165567td.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0613, code lost:
        r12 = r0 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0620, code lost:
        r12 = r0 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0633, code lost:
        r2 = r0 + r0;
        r1 = r0 >> 31;
        r0 = com.google.android.recaptcha.internal.zzhh.zzb;
        r12 = X.C165567td.A00(r8);
        r2 = X.C165567td.A00(r1 ^ r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0653, code lost:
        r0 = com.google.android.recaptcha.internal.zzhh.zzb;
        r12 = X.C165567td.A00(r8);
        r2 = com.google.android.recaptcha.internal.zzhh.zzz((r10 >> 63) ^ (r10 + r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0661, code lost:
        r12 = r12 + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(java.lang.Object r21) {
        /*
            r20 = this;
            r3 = r21
            sun.misc.Unsafe r7 = zzb
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r4 = 0
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r18 = 0
            r5 = 0
            r13 = 0
        L_0x000f:
            r14 = r20
            int[] r1 = r14.zzc
            int r0 = r1.length
            if (r5 >= r0) goto L_0x0685
            int r0 = r5 + 1
            r10 = r1[r0]
            int r0 = r10 >>> 20
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r5 + 2
            r8 = r1[r5]
            r12 = r1[r0]
            r11 = r12 & r6
            r0 = 17
            r19 = 1
            if (r2 > r0) goto L_0x0681
            if (r11 == r9) goto L_0x0033
            if (r11 != r6) goto L_0x067a
            r18 = 0
        L_0x0032:
            r9 = r11
        L_0x0033:
            int r0 = r12 >>> 20
            int r19 = r19 << r0
        L_0x0037:
            r10 = r10 & r6
            com.google.android.recaptcha.internal.zzik r0 = com.google.android.recaptcha.internal.zzik.zzA
            long r0 = (long) r10
            r12 = 63
            switch(r2) {
                case 0: goto L_0x0043;
                case 1: goto L_0x0054;
                case 2: goto L_0x0065;
                case 3: goto L_0x007c;
                case 4: goto L_0x0093;
                case 5: goto L_0x00aa;
                case 6: goto L_0x00bb;
                case 7: goto L_0x00cc;
                case 8: goto L_0x00f0;
                case 9: goto L_0x0103;
                case 10: goto L_0x00dd;
                case 11: goto L_0x011c;
                case 12: goto L_0x0135;
                case 13: goto L_0x014c;
                case 14: goto L_0x015d;
                case 15: goto L_0x016e;
                case 16: goto L_0x0181;
                case 17: goto L_0x0194;
                case 18: goto L_0x01af;
                case 19: goto L_0x01bb;
                case 20: goto L_0x01c7;
                case 21: goto L_0x01e7;
                case 22: goto L_0x01fb;
                case 23: goto L_0x020f;
                case 24: goto L_0x021b;
                case 25: goto L_0x0227;
                case 26: goto L_0x023c;
                case 27: goto L_0x0299;
                case 28: goto L_0x02d1;
                case 29: goto L_0x0301;
                case 30: goto L_0x0314;
                case 31: goto L_0x0327;
                case 32: goto L_0x0333;
                case 33: goto L_0x033f;
                case 34: goto L_0x0352;
                case 35: goto L_0x036d;
                case 36: goto L_0x0389;
                case 37: goto L_0x03a5;
                case 38: goto L_0x03bf;
                case 39: goto L_0x03d9;
                case 40: goto L_0x03f3;
                case 41: goto L_0x040f;
                case 42: goto L_0x042b;
                case 43: goto L_0x0445;
                case 44: goto L_0x045f;
                case 45: goto L_0x0478;
                case 46: goto L_0x0493;
                case 47: goto L_0x04ae;
                case 48: goto L_0x04c7;
                case 49: goto L_0x04e4;
                case 50: goto L_0x0509;
                case 51: goto L_0x052b;
                case 52: goto L_0x0537;
                case 53: goto L_0x0543;
                case 54: goto L_0x054a;
                case 55: goto L_0x0560;
                case 56: goto L_0x0568;
                case 57: goto L_0x0574;
                case 58: goto L_0x0580;
                case 59: goto L_0x058e;
                case 60: goto L_0x05a5;
                case 61: goto L_0x05b9;
                case 62: goto L_0x05d9;
                case 63: goto L_0x05f0;
                case 64: goto L_0x0609;
                case 65: goto L_0x0616;
                case 66: goto L_0x0623;
                case 67: goto L_0x0643;
                case 68: goto L_0x0663;
                default: goto L_0x0040;
            }
        L_0x0040:
            int r5 = r5 + 3
            goto L_0x000f
        L_0x0043:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r0 = r14.zzO(r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0040
            int r0 = X.C165607th.A01(r8)
            goto L_0x0620
        L_0x0054:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r0 = r14.zzO(r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0040
            int r0 = X.C165607th.A01(r8)
            goto L_0x0613
        L_0x0065:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            long r0 = r7.getLong(r3, r0)
            int r2 = com.google.android.recaptcha.internal.zzhh.zzz(r0)
            goto L_0x0604
        L_0x007c:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            long r0 = r7.getLong(r3, r0)
            int r2 = com.google.android.recaptcha.internal.zzhh.zzz(r0)
            goto L_0x0604
        L_0x0093:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            int r0 = r7.getInt(r3, r0)
            int r2 = com.google.android.recaptcha.internal.zzhh.zzu(r0)
            goto L_0x0604
        L_0x00aa:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r0 = r14.zzO(r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0040
            int r0 = X.C165607th.A01(r8)
            goto L_0x0620
        L_0x00bb:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r0 = r14.zzO(r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0040
            int r0 = X.C165607th.A01(r8)
            goto L_0x0613
        L_0x00cc:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r0 = r14.zzO(r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0040
            int r0 = X.C165607th.A01(r8)
            goto L_0x058a
        L_0x00dd:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            java.lang.Object r1 = r7.getObject(r3, r0)
            goto L_0x05c5
        L_0x00f0:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            java.lang.Object r1 = r7.getObject(r3, r0)
            goto L_0x059a
        L_0x0103:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            java.lang.Object r1 = r7.getObject(r3, r0)
            com.google.android.recaptcha.internal.zzkr r0 = r14.zzx(r5)
            int r12 = com.google.android.recaptcha.internal.zzkt.zzh(r8, r1, r0)
            goto L_0x0677
        L_0x011c:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            int r1 = r7.getInt(r3, r0)
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.C165567td.A00(r1)
            goto L_0x0604
        L_0x0135:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            int r0 = r7.getInt(r3, r0)
            int r2 = com.google.android.recaptcha.internal.zzhh.zzu(r0)
            goto L_0x0604
        L_0x014c:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r0 = r14.zzO(r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0040
            int r0 = X.C165607th.A01(r8)
            goto L_0x0613
        L_0x015d:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r0 = r14.zzO(r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x0040
            int r0 = X.C165607th.A01(r8)
            goto L_0x0620
        L_0x016e:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            int r0 = r7.getInt(r3, r0)
            goto L_0x0633
        L_0x0181:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            long r10 = r7.getLong(r3, r0)
            goto L_0x0653
        L_0x0194:
            r17 = r9
            r16 = r5
            r15 = r3
            boolean r2 = r14.zzO(r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0040
            java.lang.Object r1 = r7.getObject(r3, r0)
            com.google.android.recaptcha.internal.zzke r1 = (com.google.android.recaptcha.internal.zzke) r1
            com.google.android.recaptcha.internal.zzkr r0 = r14.zzx(r5)
            int r12 = com.google.android.recaptcha.internal.zzhh.zzt(r8, r1, r0)
            goto L_0x0677
        L_0x01af:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = com.google.android.recaptcha.internal.zzkt.zzd(r8, r0, r4)
            goto L_0x0677
        L_0x01bb:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = com.google.android.recaptcha.internal.zzkt.zzb(r8, r0, r4)
            goto L_0x0677
        L_0x01c7:
            java.lang.Object r1 = r7.getObject(r3, r0)
            java.util.List r1 = (java.util.List) r1
            int r0 = X.C165617ti.A06(r1)
            if (r0 == 0) goto L_0x0506
            int r2 = r8 << 3
            int r12 = com.google.android.recaptcha.internal.zzkt.zzg(r1)
            int r1 = r1.size()
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r0 = X.C165567td.A00(r2)
            int r1 = r1 * r0
            int r12 = r12 + r1
            goto L_0x0677
        L_0x01e7:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C165617ti.A06(r0)
            if (r2 == 0) goto L_0x0506
            int r1 = r8 << 3
            int r12 = com.google.android.recaptcha.internal.zzkt.zzl(r0)
            goto L_0x0364
        L_0x01fb:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C165617ti.A06(r0)
            if (r2 == 0) goto L_0x0506
            int r1 = r8 << 3
            int r12 = com.google.android.recaptcha.internal.zzkt.zzf(r0)
            goto L_0x0364
        L_0x020f:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = com.google.android.recaptcha.internal.zzkt.zzd(r8, r0, r4)
            goto L_0x0677
        L_0x021b:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = com.google.android.recaptcha.internal.zzkt.zzb(r8, r0, r4)
            goto L_0x0677
        L_0x0227:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = X.C165617ti.A06(r0)
            if (r12 == 0) goto L_0x0506
            int r0 = X.C165607th.A01(r8)
            int r0 = r0 + 1
            int r12 = r12 * r0
            goto L_0x0677
        L_0x023c:
            java.lang.Object r11 = r7.getObject(r3, r0)
            java.util.List r11 = (java.util.List) r11
            int r10 = X.C165617ti.A06(r11)
            if (r10 == 0) goto L_0x0506
            int r2 = r8 << 3
            boolean r1 = r11 instanceof com.google.android.recaptcha.internal.zzjm
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r12 = X.C165567td.A00(r2)
            int r12 = r12 * r10
            if (r1 == 0) goto L_0x0278
            com.google.android.recaptcha.internal.zzjm r11 = (com.google.android.recaptcha.internal.zzjm) r11
            r2 = 0
        L_0x0258:
            if (r2 >= r10) goto L_0x0677
            java.lang.Object r1 = r11.zzf(r2)
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzgw
            if (r0 == 0) goto L_0x0271
            com.google.android.recaptcha.internal.zzgw r1 = (com.google.android.recaptcha.internal.zzgw) r1
            int r1 = r1.zzd()
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
        L_0x026d:
            int r12 = r12 + r0
            int r2 = r2 + 1
            goto L_0x0258
        L_0x0271:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = com.google.android.recaptcha.internal.zzhh.zzx(r1)
            goto L_0x026d
        L_0x0278:
            r2 = 0
        L_0x0279:
            if (r2 >= r10) goto L_0x0677
            java.lang.Object r1 = r11.get(r2)
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzgw
            if (r0 == 0) goto L_0x0292
            com.google.android.recaptcha.internal.zzgw r1 = (com.google.android.recaptcha.internal.zzgw) r1
            int r1 = r1.zzd()
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
        L_0x028e:
            int r12 = r12 + r0
            int r2 = r2 + 1
            goto L_0x0279
        L_0x0292:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = com.google.android.recaptcha.internal.zzhh.zzx(r1)
            goto L_0x028e
        L_0x0299:
            java.lang.Object r10 = r7.getObject(r3, r0)
            java.util.List r10 = (java.util.List) r10
            com.google.android.recaptcha.internal.zzkr r11 = r14.zzx(r5)
            int r2 = X.C165617ti.A06(r10)
            if (r2 == 0) goto L_0x0506
            int r12 = X.C165607th.A01(r8)
            int r12 = r12 * r2
            r8 = 0
        L_0x02af:
            if (r8 >= r2) goto L_0x0677
            java.lang.Object r1 = r10.get(r8)
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzjk
            if (r0 == 0) goto L_0x02ca
            com.google.android.recaptcha.internal.zzjk r1 = (com.google.android.recaptcha.internal.zzjk) r1
            int r1 = r1.zza()
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
        L_0x02c6:
            int r12 = r12 + r0
            int r8 = r8 + 1
            goto L_0x02af
        L_0x02ca:
            com.google.android.recaptcha.internal.zzke r1 = (com.google.android.recaptcha.internal.zzke) r1
            int r0 = com.google.android.recaptcha.internal.zzhh.zzw(r1, r11)
            goto L_0x02c6
        L_0x02d1:
            java.lang.Object r10 = r7.getObject(r3, r0)
            java.util.List r10 = (java.util.List) r10
            int r0 = X.C165617ti.A06(r10)
            if (r0 != 0) goto L_0x02e0
            r0 = 0
            goto L_0x04e1
        L_0x02e0:
            int r1 = X.C165607th.A01(r8)
            int r0 = r0 * r1
            r8 = 0
        L_0x02e6:
            int r1 = r10.size()
            if (r8 >= r1) goto L_0x04e1
            java.lang.Object r1 = r10.get(r8)
            com.google.android.recaptcha.internal.zzgw r1 = (com.google.android.recaptcha.internal.zzgw) r1
            int r2 = r1.zzd()
            int r1 = com.google.android.recaptcha.internal.zzhh.zzb
            int r1 = X.C165567td.A00(r2)
            int r1 = r1 + r2
            int r0 = r0 + r1
            int r8 = r8 + 1
            goto L_0x02e6
        L_0x0301:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C165617ti.A06(r0)
            if (r2 == 0) goto L_0x0506
            int r1 = r8 << 3
            int r12 = com.google.android.recaptcha.internal.zzkt.zzk(r0)
            goto L_0x0364
        L_0x0314:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C165617ti.A06(r0)
            if (r2 == 0) goto L_0x0506
            int r1 = r8 << 3
            int r12 = com.google.android.recaptcha.internal.zzkt.zza(r0)
            goto L_0x0364
        L_0x0327:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = com.google.android.recaptcha.internal.zzkt.zzb(r8, r0, r4)
            goto L_0x0677
        L_0x0333:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = com.google.android.recaptcha.internal.zzkt.zzd(r8, r0, r4)
            goto L_0x0677
        L_0x033f:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C165617ti.A06(r0)
            if (r2 == 0) goto L_0x0506
            int r1 = r8 << 3
            int r12 = com.google.android.recaptcha.internal.zzkt.zzi(r0)
            goto L_0x0364
        L_0x0352:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C165617ti.A06(r0)
            if (r2 == 0) goto L_0x0506
            int r1 = r8 << 3
            int r12 = com.google.android.recaptcha.internal.zzkt.zzj(r0)
        L_0x0364:
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r0 = X.C165567td.A00(r1)
            int r2 = r2 * r0
            goto L_0x0661
        L_0x036d:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r0 = X.C165617ti.A06(r0)
            int r10 = r0 * 8
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.C165567td.A00(r10)
            int r0 = X.C165567td.A00(r1)
            goto L_0x04df
        L_0x0389:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r0 = X.C165617ti.A06(r0)
            int r10 = r0 * 4
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.C165567td.A00(r10)
            int r0 = X.C165567td.A00(r1)
            goto L_0x04df
        L_0x03a5:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r10 = com.google.android.recaptcha.internal.zzkt.zzg(r0)
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.C165567td.A00(r10)
            int r0 = X.C165567td.A00(r1)
            goto L_0x04df
        L_0x03bf:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r10 = com.google.android.recaptcha.internal.zzkt.zzl(r0)
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.C165567td.A00(r10)
            int r0 = X.C165567td.A00(r1)
            goto L_0x04df
        L_0x03d9:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r10 = com.google.android.recaptcha.internal.zzkt.zzf(r0)
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.C165567td.A00(r10)
            int r0 = X.C165567td.A00(r1)
            goto L_0x04df
        L_0x03f3:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r0 = X.C165617ti.A06(r0)
            int r10 = r0 * 8
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.C165567td.A00(r10)
            int r0 = X.C165567td.A00(r1)
            goto L_0x04df
        L_0x040f:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r0 = X.C165617ti.A06(r0)
            int r10 = r0 * 4
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.C165567td.A00(r10)
            int r0 = X.C165567td.A00(r1)
            goto L_0x04df
        L_0x042b:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r10 = X.C165617ti.A06(r0)
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.C165567td.A00(r10)
            int r0 = X.C165567td.A00(r1)
            goto L_0x04df
        L_0x0445:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r10 = com.google.android.recaptcha.internal.zzkt.zzk(r0)
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.C165567td.A00(r10)
            int r0 = X.C165567td.A00(r1)
            goto L_0x04df
        L_0x045f:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r10 = com.google.android.recaptcha.internal.zzkt.zza(r0)
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.C165567td.A00(r10)
            int r0 = X.C165567td.A00(r1)
            goto L_0x04df
        L_0x0478:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r0 = X.C165617ti.A06(r0)
            int r10 = r0 * 4
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.C165567td.A00(r10)
            int r0 = X.C165567td.A00(r1)
            goto L_0x04df
        L_0x0493:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r0 = X.C165617ti.A06(r0)
            int r10 = r0 * 8
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.C165567td.A00(r10)
            int r0 = X.C165567td.A00(r1)
            goto L_0x04df
        L_0x04ae:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r10 = com.google.android.recaptcha.internal.zzkt.zzi(r0)
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.C165567td.A00(r10)
            int r0 = X.C165567td.A00(r1)
            goto L_0x04df
        L_0x04c7:
            java.lang.Object r0 = r7.getObject(r3, r0)
            java.util.List r0 = (java.util.List) r0
            int r10 = com.google.android.recaptcha.internal.zzkt.zzj(r0)
            if (r10 <= 0) goto L_0x0040
            int r1 = r8 << 3
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.C165567td.A00(r10)
            int r0 = X.C165567td.A00(r1)
        L_0x04df:
            int r0 = r0 + r2
            int r0 = r0 + r10
        L_0x04e1:
            int r13 = r13 + r0
            goto L_0x0040
        L_0x04e4:
            java.lang.Object r11 = r7.getObject(r3, r0)
            java.util.List r11 = (java.util.List) r11
            com.google.android.recaptcha.internal.zzkr r10 = r14.zzx(r5)
            int r2 = X.C165617ti.A06(r11)
            if (r2 == 0) goto L_0x0506
            r1 = 0
            r12 = 0
        L_0x04f6:
            if (r1 >= r2) goto L_0x0677
            java.lang.Object r0 = r11.get(r1)
            com.google.android.recaptcha.internal.zzke r0 = (com.google.android.recaptcha.internal.zzke) r0
            int r0 = com.google.android.recaptcha.internal.zzhh.zzt(r8, r0, r10)
            int r12 = r12 + r0
            int r1 = r1 + 1
            goto L_0x04f6
        L_0x0506:
            r12 = 0
            goto L_0x0677
        L_0x0509:
            java.lang.Object r1 = r7.getObject(r3, r0)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0040
            java.util.Iterator r1 = X.C36371kC.A10(r1)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0040
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r1)
            r0.getKey()
            r0.getValue()
            r0 = 0
            throw r0
        L_0x052b:
            boolean r0 = r14.zzR(r3, r8, r5)
            if (r0 == 0) goto L_0x0040
            int r0 = X.C165607th.A01(r8)
            goto L_0x0620
        L_0x0537:
            boolean r0 = r14.zzR(r3, r8, r5)
            if (r0 == 0) goto L_0x0040
            int r0 = X.C165607th.A01(r8)
            goto L_0x0613
        L_0x0543:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            goto L_0x0550
        L_0x054a:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
        L_0x0550:
            int r8 = r8 << 3
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r3, r0)
            long r0 = X.C36431kI.A09(r0)
            int r2 = com.google.android.recaptcha.internal.zzhh.zzz(r0)
            goto L_0x0604
        L_0x0560:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            goto L_0x05f6
        L_0x0568:
            boolean r0 = r14.zzR(r3, r8, r5)
            if (r0 == 0) goto L_0x0040
            int r0 = X.C165607th.A01(r8)
            goto L_0x0620
        L_0x0574:
            boolean r0 = r14.zzR(r3, r8, r5)
            if (r0 == 0) goto L_0x0040
            int r0 = X.C165607th.A01(r8)
            goto L_0x0613
        L_0x0580:
            boolean r0 = r14.zzR(r3, r8, r5)
            if (r0 == 0) goto L_0x0040
            int r0 = X.C165607th.A01(r8)
        L_0x058a:
            int r12 = r0 + 1
            goto L_0x0677
        L_0x058e:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            java.lang.Object r1 = r7.getObject(r3, r0)
        L_0x059a:
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzgw
            if (r0 != 0) goto L_0x05c5
            java.lang.String r1 = (java.lang.String) r1
            int r2 = com.google.android.recaptcha.internal.zzhh.zzx(r1)
            goto L_0x0604
        L_0x05a5:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            java.lang.Object r1 = r7.getObject(r3, r0)
            com.google.android.recaptcha.internal.zzkr r0 = r14.zzx(r5)
            int r12 = com.google.android.recaptcha.internal.zzkt.zzh(r8, r1, r0)
            goto L_0x0677
        L_0x05b9:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            java.lang.Object r1 = r7.getObject(r3, r0)
        L_0x05c5:
            com.google.android.recaptcha.internal.zzgw r1 = (com.google.android.recaptcha.internal.zzgw) r1
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r1 = r1.zzd()
            int r0 = X.C165567td.A00(r1)
            int r0 = r0 + r1
            int r12 = X.C165567td.A00(r8)
            int r12 = r12 + r0
            goto L_0x0677
        L_0x05d9:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r3, r0)
            int r1 = X.AnonymousClass000.A0I(r0)
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r2 = X.C165567td.A00(r1)
            goto L_0x0604
        L_0x05f0:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
        L_0x05f6:
            int r8 = r8 << 3
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r3, r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            int r2 = com.google.android.recaptcha.internal.zzhh.zzu(r0)
        L_0x0604:
            int r12 = X.C165567td.A00(r8)
            goto L_0x0661
        L_0x0609:
            boolean r0 = r14.zzR(r3, r8, r5)
            if (r0 == 0) goto L_0x0040
            int r0 = X.C165607th.A01(r8)
        L_0x0613:
            int r12 = r0 + 4
            goto L_0x0677
        L_0x0616:
            boolean r0 = r14.zzR(r3, r8, r5)
            if (r0 == 0) goto L_0x0040
            int r0 = X.C165607th.A01(r8)
        L_0x0620:
            int r12 = r0 + 8
            goto L_0x0677
        L_0x0623:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r3, r0)
            int r0 = X.AnonymousClass000.A0I(r0)
        L_0x0633:
            int r2 = r0 + r0
            int r1 = r0 >> 31
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r12 = X.C165567td.A00(r8)
            r1 = r1 ^ r2
            int r2 = X.C165567td.A00(r1)
            goto L_0x0661
        L_0x0643:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            int r8 = r8 << 3
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r3, r0)
            long r10 = X.C36431kI.A09(r0)
        L_0x0653:
            long r1 = r10 + r10
            long r10 = r10 >> r12
            int r0 = com.google.android.recaptcha.internal.zzhh.zzb
            int r12 = X.C165567td.A00(r8)
            long r10 = r10 ^ r1
            int r2 = com.google.android.recaptcha.internal.zzhh.zzz(r10)
        L_0x0661:
            int r12 = r12 + r2
            goto L_0x0677
        L_0x0663:
            boolean r2 = r14.zzR(r3, r8, r5)
            if (r2 == 0) goto L_0x0040
            java.lang.Object r1 = r7.getObject(r3, r0)
            com.google.android.recaptcha.internal.zzke r1 = (com.google.android.recaptcha.internal.zzke) r1
            com.google.android.recaptcha.internal.zzkr r0 = r14.zzx(r5)
            int r12 = com.google.android.recaptcha.internal.zzhh.zzt(r8, r1, r0)
        L_0x0677:
            int r13 = r13 + r12
            goto L_0x0040
        L_0x067a:
            long r0 = (long) r11
            int r18 = r7.getInt(r3, r0)
            goto L_0x0032
        L_0x0681:
            r19 = 0
            goto L_0x0037
        L_0x0685:
            r0 = r3
            com.google.android.recaptcha.internal.zzit r0 = (com.google.android.recaptcha.internal.zzit) r0
            com.google.android.recaptcha.internal.zzlm r0 = r0.zzc
            int r0 = r0.zza()
            int r13 = r13 + r0
            boolean r0 = r14.zzh
            if (r0 == 0) goto L_0x06dd
            com.google.android.recaptcha.internal.zzip r3 = (com.google.android.recaptcha.internal.zzip) r3
            com.google.android.recaptcha.internal.zzij r2 = r3.zzb
            r3 = 0
        L_0x0698:
            com.google.android.recaptcha.internal.zzle r0 = r2.zza
            java.util.List r0 = r0.zzb
            int r1 = r0.size()
            com.google.android.recaptcha.internal.zzle r0 = r2.zza
            if (r4 >= r1) goto L_0x06ba
            java.util.Map$Entry r0 = r0.zzg(r4)
            java.lang.Object r1 = r0.getKey()
            com.google.android.recaptcha.internal.zzii r1 = (com.google.android.recaptcha.internal.zzii) r1
            java.lang.Object r0 = r0.getValue()
            int r0 = com.google.android.recaptcha.internal.zzij.zza(r1, r0)
            int r3 = r3 + r0
            int r4 = r4 + 1
            goto L_0x0698
        L_0x06ba:
            java.lang.Iterable r0 = r0.zzc()
            java.util.Iterator r2 = r0.iterator()
        L_0x06c2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06dc
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r2)
            java.lang.Object r1 = r0.getKey()
            com.google.android.recaptcha.internal.zzii r1 = (com.google.android.recaptcha.internal.zzii) r1
            java.lang.Object r0 = r0.getValue()
            int r0 = com.google.android.recaptcha.internal.zzij.zza(r1, r0)
            int r3 = r3 + r0
            goto L_0x06c2
        L_0x06dc:
            int r13 = r13 + r3
        L_0x06dd:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zza(java.lang.Object):int");
    }

    public final Object zze() {
        return ((zzit) this.zzg).zzs();
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void zzh(java.lang.Object r23, com.google.android.recaptcha.internal.zzkq r24, com.google.android.recaptcha.internal.zzie r25) {
        /*
            r22 = this;
            r11 = r25
            java.util.Objects.requireNonNull(r11)
            r8 = r23
            zzD(r8)
            r15 = r22
            com.google.android.recaptcha.internal.zzll r14 = r15.zzn
            com.google.android.recaptcha.internal.zzif r7 = r15.zzo
            r6 = 0
            r12 = r6
            r13 = r6
        L_0x0013:
            r9 = r24
            int r3 = r9.zzc()     // Catch:{ all -> 0x04c3 }
            int r2 = r15.zzq(r3)     // Catch:{ all -> 0x04c3 }
            if (r2 >= 0) goto L_0x0063
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r0) goto L_0x003c
            int r1 = r15.zzk
        L_0x0026:
            int r0 = r15.zzl
            if (r1 >= r0) goto L_0x04bd
            int[] r0 = r15.zzj
            r17 = r0[r1]
            r20 = r8
            r16 = r8
            r18 = r13
            r19 = r14
            r15.zzy(r16, r17, r18, r19, r20)
            int r1 = r1 + 1
            goto L_0x0026
        L_0x003c:
            boolean r0 = r15.zzh     // Catch:{ all -> 0x04c3 }
            if (r0 == 0) goto L_0x0055
            com.google.android.recaptcha.internal.zzke r0 = r15.zzg     // Catch:{ all -> 0x04c3 }
            com.google.android.recaptcha.internal.zzir r10 = r11.zza(r0, r3)     // Catch:{ all -> 0x04c3 }
            if (r10 == 0) goto L_0x0055
            if (r12 != 0) goto L_0x0051
            r0 = r8
            com.google.android.recaptcha.internal.zzip r0 = (com.google.android.recaptcha.internal.zzip) r0     // Catch:{ all -> 0x04c3 }
            com.google.android.recaptcha.internal.zzij r12 = r0.zzi()     // Catch:{ all -> 0x04c3 }
        L_0x0051:
            r7.zze(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x04c3 }
            goto L_0x0013
        L_0x0055:
            if (r13 != 0) goto L_0x005b
            java.lang.Object r13 = r14.zzc(r8)     // Catch:{ all -> 0x04c3 }
        L_0x005b:
            boolean r0 = r14.zzr(r13, r9)     // Catch:{ all -> 0x04c3 }
            if (r0 != 0) goto L_0x0013
            goto L_0x0475
        L_0x0063:
            int[] r1 = r15.zzc     // Catch:{ all -> 0x04c3 }
            int r0 = r2 + 1
            r0 = r1[r0]     // Catch:{ all -> 0x04c3 }
            int r1 = r0 >>> 20
            r1 = r1 & 255(0xff, float:3.57E-43)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r1) {
                case 0: goto L_0x0423;
                case 1: goto L_0x0415;
                case 2: goto L_0x0407;
                case 3: goto L_0x03f9;
                case 4: goto L_0x03eb;
                case 5: goto L_0x03dd;
                case 6: goto L_0x03cf;
                case 7: goto L_0x03c1;
                case 8: goto L_0x03b9;
                case 9: goto L_0x03a7;
                case 10: goto L_0x0399;
                case 11: goto L_0x038b;
                case 12: goto L_0x036b;
                case 13: goto L_0x035d;
                case 14: goto L_0x034f;
                case 15: goto L_0x0341;
                case 16: goto L_0x0333;
                case 17: goto L_0x0321;
                case 18: goto L_0x0318;
                case 19: goto L_0x030f;
                case 20: goto L_0x0306;
                case 21: goto L_0x02fd;
                case 22: goto L_0x02f4;
                case 23: goto L_0x02eb;
                case 24: goto L_0x02e2;
                case 25: goto L_0x02d9;
                case 26: goto L_0x02b9;
                case 27: goto L_0x02a8;
                case 28: goto L_0x029f;
                case 29: goto L_0x0296;
                case 30: goto L_0x027b;
                case 31: goto L_0x0272;
                case 32: goto L_0x0269;
                case 33: goto L_0x0260;
                case 34: goto L_0x0257;
                case 35: goto L_0x024e;
                case 36: goto L_0x0245;
                case 37: goto L_0x023c;
                case 38: goto L_0x0233;
                case 39: goto L_0x022a;
                case 40: goto L_0x0221;
                case 41: goto L_0x0218;
                case 42: goto L_0x020f;
                case 43: goto L_0x0206;
                case 44: goto L_0x01eb;
                case 45: goto L_0x01e2;
                case 46: goto L_0x01d9;
                case 47: goto L_0x01d0;
                case 48: goto L_0x01c7;
                case 49: goto L_0x01b6;
                case 50: goto L_0x0443;
                case 51: goto L_0x01a4;
                case 52: goto L_0x0192;
                case 53: goto L_0x0180;
                case 54: goto L_0x016e;
                case 55: goto L_0x015c;
                case 56: goto L_0x014a;
                case 57: goto L_0x0138;
                case 58: goto L_0x0126;
                case 59: goto L_0x011e;
                case 60: goto L_0x010c;
                case 61: goto L_0x00fe;
                case 62: goto L_0x00ec;
                case 63: goto L_0x00c8;
                case 64: goto L_0x00b6;
                case 65: goto L_0x00a4;
                case 66: goto L_0x0092;
                case 67: goto L_0x0081;
                case 68: goto L_0x0431;
                default: goto L_0x0073;
            }     // Catch:{ all -> 0x04c3 }
        L_0x0073:
            if (r13 != 0) goto L_0x0079
            java.lang.Object r13 = r14.zzc(r8)     // Catch:{ zzjd -> 0x0468 }
        L_0x0079:
            boolean r0 = r14.zzr(r13, r9)     // Catch:{ zzjd -> 0x0468 }
            if (r0 != 0) goto L_0x0013
            goto L_0x048d
        L_0x0081:
            r0 = r0 & r5
            long r4 = r9.zzn()     // Catch:{ zzjd -> 0x0468 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0468 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0092:
            r0 = r0 & r5
            int r1 = r9.zzi()     // Catch:{ zzjd -> 0x0468 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0468 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x00a4:
            r0 = r0 & r5
            long r4 = r9.zzm()     // Catch:{ zzjd -> 0x0468 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0468 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x00b6:
            r0 = r0 & r5
            int r1 = r9.zzh()     // Catch:{ zzjd -> 0x0468 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0468 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x00c8:
            int r4 = r9.zze()     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzix r1 = r15.zzw(r2)     // Catch:{ zzjd -> 0x0468 }
            if (r1 == 0) goto L_0x00de
            boolean r1 = r1.zza(r4)     // Catch:{ zzjd -> 0x0468 }
            if (r1 != 0) goto L_0x00de
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzkt.zzp(r8, r3, r4, r13, r14)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x00de:
            r0 = r0 & r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0468 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x00ec:
            r0 = r0 & r5
            int r1 = r9.zzj()     // Catch:{ zzjd -> 0x0468 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0468 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x00fe:
            r0 = r0 & r5
            com.google.android.recaptcha.internal.zzgw r4 = r9.zzp()     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0468 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x010c:
            java.lang.Object r1 = r15.zzB(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzke r1 = (com.google.android.recaptcha.internal.zzke) r1     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzkr r0 = r15.zzx(r2)     // Catch:{ zzjd -> 0x0468 }
            r9.zzu(r1, r0, r11)     // Catch:{ zzjd -> 0x0468 }
            r15.zzK(r8, r3, r2, r1)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x011e:
            r15.zzG(r8, r0, r9)     // Catch:{ zzjd -> 0x0468 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0126:
            r0 = r0 & r5
            boolean r1 = r9.zzN()     // Catch:{ zzjd -> 0x0468 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0468 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0138:
            r0 = r0 & r5
            int r1 = r9.zzf()     // Catch:{ zzjd -> 0x0468 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0468 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x014a:
            r0 = r0 & r5
            long r4 = r9.zzk()     // Catch:{ zzjd -> 0x0468 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0468 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x015c:
            r0 = r0 & r5
            int r1 = r9.zzg()     // Catch:{ zzjd -> 0x0468 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0468 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x016e:
            r0 = r0 & r5
            long r4 = r9.zzo()     // Catch:{ zzjd -> 0x0468 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0468 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0180:
            r0 = r0 & r5
            long r4 = r9.zzl()     // Catch:{ zzjd -> 0x0468 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0468 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0192:
            r0 = r0 & r5
            float r1 = r9.zzb()     // Catch:{ zzjd -> 0x0468 }
            java.lang.Float r4 = java.lang.Float.valueOf(r1)     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0468 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x01a4:
            r0 = r0 & r5
            double r4 = r9.zza()     // Catch:{ zzjd -> 0x0468 }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r4)     // Catch:{ zzjd -> 0x0468 }
            r15.zzI(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x01b6:
            r0 = r0 & r5
            com.google.android.recaptcha.internal.zzkr r3 = r15.zzx(r2)     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzjs r2 = r15.zzm     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            java.util.List r0 = r2.zza(r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzC(r0, r3, r11)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x01c7:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzJ(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x01d0:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzI(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x01d9:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzH(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x01e2:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzG(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x01eb:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzy(r0)     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzix r19 = r15.zzw(r2)     // Catch:{ zzjd -> 0x0468 }
            r16 = r8
            r17 = r3
            r18 = r0
            r20 = r13
            r21 = r14
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzkt.zzo(r16, r17, r18, r19, r20, r21)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0206:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzL(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x020f:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzv(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0218:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzz(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0221:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzA(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x022a:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzD(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0233:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzM(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x023c:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzE(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0245:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzB(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x024e:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzx(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0257:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzJ(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0260:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzI(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0269:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzH(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0272:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzG(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x027b:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzy(r0)     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzix r19 = r15.zzw(r2)     // Catch:{ zzjd -> 0x0468 }
            r16 = r8
            r17 = r3
            r18 = r0
            r20 = r13
            r21 = r14
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzkt.zzo(r16, r17, r18, r19, r20, r21)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0296:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzL(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x029f:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzw(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x02a8:
            com.google.android.recaptcha.internal.zzkr r3 = r15.zzx(r2)     // Catch:{ zzjd -> 0x0468 }
            r0 = r0 & r5
            com.google.android.recaptcha.internal.zzjs r2 = r15.zzm     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            java.util.List r0 = r2.zza(r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzF(r0, r3, r11)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x02b9:
            boolean r1 = zzM(r0)     // Catch:{ zzjd -> 0x0468 }
            if (r1 == 0) goto L_0x02cc
            java.util.List r2 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r1 = r9
            com.google.android.recaptcha.internal.zzhd r1 = (com.google.android.recaptcha.internal.zzhd) r1     // Catch:{ zzjd -> 0x0468 }
            r0 = 1
            r1.zzK(r2, r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x02cc:
            java.util.List r2 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r1 = r9
            com.google.android.recaptcha.internal.zzhd r1 = (com.google.android.recaptcha.internal.zzhd) r1     // Catch:{ zzjd -> 0x0468 }
            r0 = 0
            r1.zzK(r2, r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x02d9:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzv(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x02e2:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzz(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x02eb:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzA(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x02f4:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzD(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x02fd:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzM(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0306:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzE(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x030f:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzB(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0318:
            java.util.List r0 = X.C165577te.A0p(r15, r8, r0)     // Catch:{ zzjd -> 0x0468 }
            r9.zzx(r0)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0321:
            java.lang.Object r1 = r15.zzA(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzke r1 = (com.google.android.recaptcha.internal.zzke) r1     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzkr r0 = r15.zzx(r2)     // Catch:{ zzjd -> 0x0468 }
            r9.zzt(r1, r0, r11)     // Catch:{ zzjd -> 0x0468 }
            r15.zzJ(r8, r2, r1)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0333:
            r0 = r0 & r5
            long r3 = r9.zzn()     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzr(r8, r0, r3)     // Catch:{ zzjd -> 0x0468 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0341:
            r0 = r0 & r5
            int r3 = r9.zzi()     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzq(r8, r0, r3)     // Catch:{ zzjd -> 0x0468 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x034f:
            r0 = r0 & r5
            long r3 = r9.zzm()     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzr(r8, r0, r3)     // Catch:{ zzjd -> 0x0468 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x035d:
            r0 = r0 & r5
            int r3 = r9.zzh()     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzq(r8, r0, r3)     // Catch:{ zzjd -> 0x0468 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x036b:
            int r4 = r9.zze()     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzix r1 = r15.zzw(r2)     // Catch:{ zzjd -> 0x0468 }
            if (r1 == 0) goto L_0x0381
            boolean r1 = r1.zza(r4)     // Catch:{ zzjd -> 0x0468 }
            if (r1 != 0) goto L_0x0381
            java.lang.Object r13 = com.google.android.recaptcha.internal.zzkt.zzp(r8, r3, r4, r13, r14)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0381:
            r0 = r0 & r5
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzq(r8, r0, r4)     // Catch:{ zzjd -> 0x0468 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x038b:
            r0 = r0 & r5
            int r3 = r9.zzj()     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzq(r8, r0, r3)     // Catch:{ zzjd -> 0x0468 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0399:
            r0 = r0 & r5
            com.google.android.recaptcha.internal.zzgw r3 = r9.zzp()     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r3)     // Catch:{ zzjd -> 0x0468 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x03a7:
            java.lang.Object r1 = r15.zzA(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzke r1 = (com.google.android.recaptcha.internal.zzke) r1     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzkr r0 = r15.zzx(r2)     // Catch:{ zzjd -> 0x0468 }
            r9.zzu(r1, r0, r11)     // Catch:{ zzjd -> 0x0468 }
            r15.zzJ(r8, r2, r1)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x03b9:
            r15.zzG(r8, r0, r9)     // Catch:{ zzjd -> 0x0468 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x03c1:
            r0 = r0 & r5
            boolean r3 = r9.zzN()     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzm(r8, r0, r3)     // Catch:{ zzjd -> 0x0468 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x03cf:
            r0 = r0 & r5
            int r3 = r9.zzf()     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzq(r8, r0, r3)     // Catch:{ zzjd -> 0x0468 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x03dd:
            r0 = r0 & r5
            long r3 = r9.zzk()     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzr(r8, r0, r3)     // Catch:{ zzjd -> 0x0468 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x03eb:
            r0 = r0 & r5
            int r3 = r9.zzg()     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzq(r8, r0, r3)     // Catch:{ zzjd -> 0x0468 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x03f9:
            r0 = r0 & r5
            long r3 = r9.zzo()     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzr(r8, r0, r3)     // Catch:{ zzjd -> 0x0468 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0407:
            r0 = r0 & r5
            long r3 = r9.zzl()     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzr(r8, r0, r3)     // Catch:{ zzjd -> 0x0468 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0415:
            r0 = r0 & r5
            float r3 = r9.zzb()     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzp(r8, r0, r3)     // Catch:{ zzjd -> 0x0468 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0423:
            r0 = r0 & r5
            double r3 = r9.zza()     // Catch:{ zzjd -> 0x0468 }
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzo(r8, r0, r3)     // Catch:{ zzjd -> 0x0468 }
            r15.zzH(r8, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0431:
            java.lang.Object r1 = r15.zzB(r8, r3, r2)     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzke r1 = (com.google.android.recaptcha.internal.zzke) r1     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzkr r0 = r15.zzx(r2)     // Catch:{ zzjd -> 0x0468 }
            r9.zzt(r1, r0, r11)     // Catch:{ zzjd -> 0x0468 }
            r15.zzK(r8, r3, r2, r1)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x0013
        L_0x0443:
            r0 = r0 & r5
            long r0 = (long) r0     // Catch:{ zzjd -> 0x0468 }
            java.lang.Object r3 = com.google.android.recaptcha.internal.zzlv.zzf(r8, r0)     // Catch:{ zzjd -> 0x0468 }
            if (r3 == 0) goto L_0x045e
            boolean r2 = com.google.android.recaptcha.internal.zzjz.zza(r3)     // Catch:{ zzjd -> 0x0468 }
            if (r2 == 0) goto L_0x045d
            com.google.android.recaptcha.internal.zzjy r2 = com.google.android.recaptcha.internal.zzjy.zza     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzjy r2 = r2.zzb()     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzjz.zzb(r2, r3)     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r2)     // Catch:{ zzjd -> 0x0468 }
        L_0x045d:
            throw r6     // Catch:{ zzjd -> 0x0468 }
        L_0x045e:
            com.google.android.recaptcha.internal.zzjy r2 = com.google.android.recaptcha.internal.zzjy.zza     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzjy r2 = r2.zzb()     // Catch:{ zzjd -> 0x0468 }
            com.google.android.recaptcha.internal.zzlv.zzs(r8, r0, r2)     // Catch:{ zzjd -> 0x0468 }
            goto L_0x045d
        L_0x0468:
            if (r13 != 0) goto L_0x046e
            java.lang.Object r13 = r14.zzc(r8)     // Catch:{ all -> 0x04c3 }
        L_0x046e:
            boolean r0 = r14.zzr(r13, r9)     // Catch:{ all -> 0x04c3 }
            if (r0 != 0) goto L_0x0013
            goto L_0x04a5
        L_0x0475:
            int r1 = r15.zzk
        L_0x0477:
            int r0 = r15.zzl
            if (r1 >= r0) goto L_0x04bd
            int[] r0 = r15.zzj
            r17 = r0[r1]
            r20 = r8
            r16 = r8
            r18 = r13
            r19 = r14
            r15.zzy(r16, r17, r18, r19, r20)
            int r1 = r1 + 1
            goto L_0x0477
        L_0x048d:
            int r1 = r15.zzk
        L_0x048f:
            int r0 = r15.zzl
            if (r1 >= r0) goto L_0x04bd
            int[] r0 = r15.zzj
            r17 = r0[r1]
            r20 = r8
            r16 = r8
            r18 = r13
            r19 = r14
            r15.zzy(r16, r17, r18, r19, r20)
            int r1 = r1 + 1
            goto L_0x048f
        L_0x04a5:
            int r1 = r15.zzk
        L_0x04a7:
            int r0 = r15.zzl
            if (r1 >= r0) goto L_0x04bd
            int[] r0 = r15.zzj
            r17 = r0[r1]
            r20 = r8
            r16 = r8
            r18 = r13
            r19 = r14
            r15.zzy(r16, r17, r18, r19, r20)
            int r1 = r1 + 1
            goto L_0x04a7
        L_0x04bd:
            if (r13 == 0) goto L_0x04c2
            r14.zzn(r8, r13)
        L_0x04c2:
            return
        L_0x04c3:
            r2 = move-exception
            int r1 = r15.zzk
        L_0x04c6:
            int r0 = r15.zzl
            if (r1 >= r0) goto L_0x04d8
            int[] r0 = r15.zzj
            r5 = r0[r1]
            r4 = r8
            r3 = r15
            r6 = r13
            r7 = r14
            r3.zzy(r4, r5, r6, r7, r8)
            int r1 = r1 + 1
            goto L_0x04c6
        L_0x04d8:
            if (r13 == 0) goto L_0x04dd
            r14.zzn(r8, r13)
        L_0x04dd:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzh(java.lang.Object, com.google.android.recaptcha.internal.zzkq, com.google.android.recaptcha.internal.zzie):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0246, code lost:
        com.google.android.recaptcha.internal.zzkt.zzD(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0256, code lost:
        com.google.android.recaptcha.internal.zzkt.zzC(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0266, code lost:
        com.google.android.recaptcha.internal.zzkt.zzB(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0276, code lost:
        com.google.android.recaptcha.internal.zzkt.zzv(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0286, code lost:
        com.google.android.recaptcha.internal.zzkt.zzF(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0304, code lost:
        com.google.android.recaptcha.internal.zzkt.zzw(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0314, code lost:
        com.google.android.recaptcha.internal.zzkt.zzx(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0324, code lost:
        com.google.android.recaptcha.internal.zzkt.zzz(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0334, code lost:
        com.google.android.recaptcha.internal.zzkt.zzG(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0344, code lost:
        com.google.android.recaptcha.internal.zzkt.zzA(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0354, code lost:
        com.google.android.recaptcha.internal.zzkt.zzy(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0364, code lost:
        com.google.android.recaptcha.internal.zzkt.zzu(r12.zzc[r14], (java.util.List) r3.getObject(r13, r0), r5, r7);
     */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04a0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzj(java.lang.Object r19, com.google.android.recaptcha.internal.zzmd r20) {
        /*
            r18 = this;
            r13 = r19
            r12 = r18
            boolean r0 = r12.zzh
            if (r0 == 0) goto L_0x049c
            r0 = r13
            com.google.android.recaptcha.internal.zzip r0 = (com.google.android.recaptcha.internal.zzip) r0
            com.google.android.recaptcha.internal.zzij r1 = r0.zzb
            com.google.android.recaptcha.internal.zzle r0 = r1.zza
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x049c
            java.util.Iterator r11 = r1.zzf()
            java.util.Map$Entry r4 = X.AnonymousClass000.A11(r11)
        L_0x001d:
            int[] r6 = r12.zzc
            sun.misc.Unsafe r3 = zzb
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r16 = 0
            r14 = 0
        L_0x0027:
            int r0 = r6.length
            r5 = r20
            if (r14 >= r0) goto L_0x04a0
            int[] r1 = r12.zzc
            int r0 = r14 + 1
            r10 = r1[r0]
            int r0 = r10 >>> 20
            r7 = r0 & 255(0xff, float:3.57E-43)
            r2 = r1[r14]
            r0 = 17
            if (r7 > r0) goto L_0x0498
            int r0 = r14 + 2
            r9 = r1[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r9 & r0
            if (r8 == r15) goto L_0x004c
            if (r8 != r0) goto L_0x0491
            r16 = 0
        L_0x004b:
            r15 = r8
        L_0x004c:
            int r0 = r9 >>> 20
            r17 = 1
            int r17 = r17 << r0
        L_0x0052:
            if (r4 == 0) goto L_0x006f
            java.lang.Object r0 = r4.getKey()
            com.google.android.recaptcha.internal.zziq r0 = (com.google.android.recaptcha.internal.zziq) r0
            int r0 = r0.zza
            if (r0 > r2) goto L_0x006f
            com.google.android.recaptcha.internal.zzif r0 = r12.zzo
            r0.zzi(r5, r4)
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x006e
            java.util.Map$Entry r4 = X.AnonymousClass000.A11(r11)
            goto L_0x0052
        L_0x006e:
            r4 = 0
        L_0x006f:
            long r0 = X.C165597tg.A0D(r10)
            switch(r7) {
                case 0: goto L_0x0480;
                case 1: goto L_0x046f;
                case 2: goto L_0x0460;
                case 3: goto L_0x0451;
                case 4: goto L_0x0442;
                case 5: goto L_0x0433;
                case 6: goto L_0x0424;
                case 7: goto L_0x0413;
                case 8: goto L_0x0404;
                case 9: goto L_0x03f1;
                case 10: goto L_0x03e0;
                case 11: goto L_0x03d1;
                case 12: goto L_0x03c2;
                case 13: goto L_0x03b3;
                case 14: goto L_0x03a4;
                case 15: goto L_0x0395;
                case 16: goto L_0x0386;
                case 17: goto L_0x0373;
                case 18: goto L_0x0363;
                case 19: goto L_0x0353;
                case 20: goto L_0x0343;
                case 21: goto L_0x0333;
                case 22: goto L_0x0323;
                case 23: goto L_0x0313;
                case 24: goto L_0x0303;
                case 25: goto L_0x02f3;
                case 26: goto L_0x02da;
                case 27: goto L_0x02ae;
                case 28: goto L_0x0295;
                case 29: goto L_0x0285;
                case 30: goto L_0x0275;
                case 31: goto L_0x0265;
                case 32: goto L_0x0255;
                case 33: goto L_0x0245;
                case 34: goto L_0x0235;
                case 35: goto L_0x0232;
                case 36: goto L_0x022f;
                case 37: goto L_0x022c;
                case 38: goto L_0x0229;
                case 39: goto L_0x0226;
                case 40: goto L_0x0223;
                case 41: goto L_0x0220;
                case 42: goto L_0x0210;
                case 43: goto L_0x020e;
                case 44: goto L_0x020c;
                case 45: goto L_0x020a;
                case 46: goto L_0x0208;
                case 47: goto L_0x0206;
                case 48: goto L_0x01ca;
                case 49: goto L_0x01da;
                case 50: goto L_0x01c2;
                case 51: goto L_0x01af;
                case 52: goto L_0x019c;
                case 53: goto L_0x0189;
                case 54: goto L_0x0176;
                case 55: goto L_0x0163;
                case 56: goto L_0x0150;
                case 57: goto L_0x013d;
                case 58: goto L_0x012a;
                case 59: goto L_0x011b;
                case 60: goto L_0x0108;
                case 61: goto L_0x00f7;
                case 62: goto L_0x00e5;
                case 63: goto L_0x00d3;
                case 64: goto L_0x00c1;
                case 65: goto L_0x00af;
                case 66: goto L_0x009d;
                case 67: goto L_0x008b;
                case 68: goto L_0x0079;
                default: goto L_0x0076;
            }
        L_0x0076:
            int r14 = r14 + 3
            goto L_0x0027
        L_0x0079:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r1 = r3.getObject(r13, r0)
            com.google.android.recaptcha.internal.zzkr r0 = r12.zzx(r14)
            r5.zzq(r2, r1, r0)
            goto L_0x0076
        L_0x008b:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            long r0 = X.C36431kI.A09(r0)
            r5.zzD(r2, r0)
            goto L_0x0076
        L_0x009d:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            r5.zzB(r2, r0)
            goto L_0x0076
        L_0x00af:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            long r0 = X.C36431kI.A09(r0)
            r5.zzz(r2, r0)
            goto L_0x0076
        L_0x00c1:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            r5.zzx(r2, r0)
            goto L_0x0076
        L_0x00d3:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            r5.zzi(r2, r0)
            goto L_0x0076
        L_0x00e5:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            r5.zzI(r2, r0)
            goto L_0x0076
        L_0x00f7:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = r3.getObject(r13, r0)
            com.google.android.recaptcha.internal.zzgw r0 = (com.google.android.recaptcha.internal.zzgw) r0
            r5.zzd(r2, r0)
            goto L_0x0076
        L_0x0108:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r1 = r3.getObject(r13, r0)
            com.google.android.recaptcha.internal.zzkr r0 = r12.zzx(r14)
            r5.zzv(r2, r1, r0)
            goto L_0x0076
        L_0x011b:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = r3.getObject(r13, r0)
            zzT(r2, r0, r5)
            goto L_0x0076
        L_0x012a:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            r5.zzb(r2, r0)
            goto L_0x0076
        L_0x013d:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            r5.zzk(r2, r0)
            goto L_0x0076
        L_0x0150:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            long r0 = X.C36431kI.A09(r0)
            r5.zzm(r2, r0)
            goto L_0x0076
        L_0x0163:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            r5.zzr(r2, r0)
            goto L_0x0076
        L_0x0176:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            long r0 = X.C36431kI.A09(r0)
            r5.zzK(r2, r0)
            goto L_0x0076
        L_0x0189:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            long r0 = X.C36431kI.A09(r0)
            r5.zzt(r2, r0)
            goto L_0x0076
        L_0x019c:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            float r0 = X.C36441kJ.A03(r0)
            r5.zzo(r2, r0)
            goto L_0x0076
        L_0x01af:
            boolean r7 = r12.zzR(r13, r2, r14)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r13, r0)
            double r0 = X.C90504aG.A01(r0)
            r5.zzf(r2, r0)
            goto L_0x0076
        L_0x01c2:
            java.lang.Object r0 = r3.getObject(r13, r0)
            if (r0 == 0) goto L_0x0076
            r0 = 0
            throw r0
        L_0x01ca:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            com.google.android.recaptcha.internal.zzkt.zzE(r2, r1, r5, r0)
            goto L_0x0076
        L_0x01da:
            int[] r2 = r12.zzc
            r7 = r2[r14]
            java.lang.Object r9 = r3.getObject(r13, r0)
            java.util.List r9 = (java.util.List) r9
            com.google.android.recaptcha.internal.zzkr r8 = r12.zzx(r14)
            int r0 = com.google.android.recaptcha.internal.zzkt.zza
            if (r9 == 0) goto L_0x0076
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0076
            r2 = 0
        L_0x01f3:
            int r0 = r9.size()
            if (r2 >= r0) goto L_0x0076
            java.lang.Object r1 = r9.get(r2)
            r0 = r5
            com.google.android.recaptcha.internal.zzhi r0 = (com.google.android.recaptcha.internal.zzhi) r0
            r0.zzq(r7, r1, r8)
            int r2 = r2 + 1
            goto L_0x01f3
        L_0x0206:
            r7 = 1
            goto L_0x0246
        L_0x0208:
            r7 = 1
            goto L_0x0256
        L_0x020a:
            r7 = 1
            goto L_0x0266
        L_0x020c:
            r7 = 1
            goto L_0x0276
        L_0x020e:
            r7 = 1
            goto L_0x0286
        L_0x0210:
            r7 = 1
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzt(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0220:
            r7 = 1
            goto L_0x0304
        L_0x0223:
            r7 = 1
            goto L_0x0314
        L_0x0226:
            r7 = 1
            goto L_0x0324
        L_0x0229:
            r7 = 1
            goto L_0x0334
        L_0x022c:
            r7 = 1
            goto L_0x0344
        L_0x022f:
            r7 = 1
            goto L_0x0354
        L_0x0232:
            r7 = 1
            goto L_0x0364
        L_0x0235:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            com.google.android.recaptcha.internal.zzkt.zzE(r2, r1, r5, r0)
            goto L_0x0076
        L_0x0245:
            r7 = 0
        L_0x0246:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzD(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0255:
            r7 = 0
        L_0x0256:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzC(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0265:
            r7 = 0
        L_0x0266:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzB(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0275:
            r7 = 0
        L_0x0276:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzv(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0285:
            r7 = 0
        L_0x0286:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzF(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0295:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            int r0 = com.google.android.recaptcha.internal.zzkt.zza
            if (r1 == 0) goto L_0x0076
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0076
            r5.zze(r2, r1)
            goto L_0x0076
        L_0x02ae:
            int[] r2 = r12.zzc
            r7 = r2[r14]
            java.lang.Object r9 = r3.getObject(r13, r0)
            java.util.List r9 = (java.util.List) r9
            com.google.android.recaptcha.internal.zzkr r8 = r12.zzx(r14)
            int r0 = com.google.android.recaptcha.internal.zzkt.zza
            if (r9 == 0) goto L_0x0076
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0076
            r2 = 0
        L_0x02c7:
            int r0 = r9.size()
            if (r2 >= r0) goto L_0x0076
            java.lang.Object r1 = r9.get(r2)
            r0 = r5
            com.google.android.recaptcha.internal.zzhi r0 = (com.google.android.recaptcha.internal.zzhi) r0
            r0.zzv(r7, r1, r8)
            int r2 = r2 + 1
            goto L_0x02c7
        L_0x02da:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            int r0 = com.google.android.recaptcha.internal.zzkt.zza
            if (r1 == 0) goto L_0x0076
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0076
            r5.zzH(r2, r1)
            goto L_0x0076
        L_0x02f3:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r1 = r3.getObject(r13, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            com.google.android.recaptcha.internal.zzkt.zzt(r2, r1, r5, r0)
            goto L_0x0076
        L_0x0303:
            r7 = 0
        L_0x0304:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzw(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0313:
            r7 = 0
        L_0x0314:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzx(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0323:
            r7 = 0
        L_0x0324:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzz(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0333:
            r7 = 0
        L_0x0334:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzG(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0343:
            r7 = 0
        L_0x0344:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzA(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0353:
            r7 = 0
        L_0x0354:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzy(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0363:
            r7 = 0
        L_0x0364:
            int[] r2 = r12.zzc
            r2 = r2[r14]
            java.lang.Object r0 = r3.getObject(r13, r0)
            java.util.List r0 = (java.util.List) r0
            com.google.android.recaptcha.internal.zzkt.zzu(r2, r0, r5, r7)
            goto L_0x0076
        L_0x0373:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r1 = r3.getObject(r13, r0)
            com.google.android.recaptcha.internal.zzkr r0 = r12.zzx(r14)
            r5.zzq(r2, r1, r0)
            goto L_0x0076
        L_0x0386:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            long r0 = r3.getLong(r13, r0)
            r5.zzD(r2, r0)
            goto L_0x0076
        L_0x0395:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            int r0 = r3.getInt(r13, r0)
            r5.zzB(r2, r0)
            goto L_0x0076
        L_0x03a4:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            long r0 = r3.getLong(r13, r0)
            r5.zzz(r2, r0)
            goto L_0x0076
        L_0x03b3:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            int r0 = r3.getInt(r13, r0)
            r5.zzx(r2, r0)
            goto L_0x0076
        L_0x03c2:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            int r0 = r3.getInt(r13, r0)
            r5.zzi(r2, r0)
            goto L_0x0076
        L_0x03d1:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            int r0 = r3.getInt(r13, r0)
            r5.zzI(r2, r0)
            goto L_0x0076
        L_0x03e0:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = r3.getObject(r13, r0)
            com.google.android.recaptcha.internal.zzgw r0 = (com.google.android.recaptcha.internal.zzgw) r0
            r5.zzd(r2, r0)
            goto L_0x0076
        L_0x03f1:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r1 = r3.getObject(r13, r0)
            com.google.android.recaptcha.internal.zzkr r0 = r12.zzx(r14)
            r5.zzv(r2, r1, r0)
            goto L_0x0076
        L_0x0404:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            java.lang.Object r0 = r3.getObject(r13, r0)
            zzT(r2, r0, r5)
            goto L_0x0076
        L_0x0413:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            com.google.android.recaptcha.internal.zzlu r7 = com.google.android.recaptcha.internal.zzlv.zzf
            boolean r0 = r7.zzg(r13, r0)
            r5.zzb(r2, r0)
            goto L_0x0076
        L_0x0424:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            int r0 = r3.getInt(r13, r0)
            r5.zzk(r2, r0)
            goto L_0x0076
        L_0x0433:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            long r0 = r3.getLong(r13, r0)
            r5.zzm(r2, r0)
            goto L_0x0076
        L_0x0442:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            int r0 = r3.getInt(r13, r0)
            r5.zzr(r2, r0)
            goto L_0x0076
        L_0x0451:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            long r0 = r3.getLong(r13, r0)
            r5.zzK(r2, r0)
            goto L_0x0076
        L_0x0460:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            long r0 = r3.getLong(r13, r0)
            r5.zzt(r2, r0)
            goto L_0x0076
        L_0x046f:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            com.google.android.recaptcha.internal.zzlu r7 = com.google.android.recaptcha.internal.zzlv.zzf
            float r0 = r7.zzb(r13, r0)
            r5.zzo(r2, r0)
            goto L_0x0076
        L_0x0480:
            boolean r7 = r12.zzO(r13, r14, r15, r16, r17)
            if (r7 == 0) goto L_0x0076
            com.google.android.recaptcha.internal.zzlu r7 = com.google.android.recaptcha.internal.zzlv.zzf
            double r0 = r7.zza(r13, r0)
            r5.zzf(r2, r0)
            goto L_0x0076
        L_0x0491:
            long r0 = (long) r8
            int r16 = r3.getInt(r13, r0)
            goto L_0x004b
        L_0x0498:
            r17 = 0
            goto L_0x0052
        L_0x049c:
            r4 = 0
            r11 = 0
            goto L_0x001d
        L_0x04a0:
            if (r4 == 0) goto L_0x04b2
            com.google.android.recaptcha.internal.zzif r0 = r12.zzo
            r0.zzi(r5, r4)
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x04b2
            java.util.Map$Entry r4 = X.AnonymousClass000.A11(r11)
            goto L_0x04a0
        L_0x04b2:
            com.google.android.recaptcha.internal.zzit r13 = (com.google.android.recaptcha.internal.zzit) r13
            com.google.android.recaptcha.internal.zzlm r0 = r13.zzc
            r0.zzl(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzmd):void");
    }

    public zzkh(int[] iArr, Object[] objArr, int i, int i2, zzke zzke, int i3, boolean z, int[] iArr2, int i4, int i5, zzkk zzkk, zzjs zzjs, zzll zzll, zzif zzif, zzjz zzjz) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzke instanceof zzit;
        boolean z2 = false;
        zzif zzif2 = zzif;
        if (zzif != null && (zzke instanceof zzip)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzkk;
        this.zzm = zzjs;
        this.zzn = zzll;
        this.zzo = zzif2;
        this.zzg = zzke;
        this.zzq = zzjz;
    }

    private final Object zzA(Object obj, int i) {
        zzkr zzx = zzx(i);
        int i2 = this.zzc[i + 1] & 1048575;
        if (!zzN(obj, i)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, (long) i2);
        if (zzQ(object)) {
            return object;
        }
        Object zze2 = zzx.zze();
        if (object != null) {
            zzx.zzg(zze2, object);
        }
        return zze2;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzkr zzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, C165577te.A0G(this.zzc, i2));
        if (zzQ(object)) {
            return object;
        }
        Object zze2 = zzx.zze();
        if (object != null) {
            zzx.zzg(zze2, object);
        }
        return zze2;
    }

    public static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder A0u = AnonymousClass000.A0u();
            C165597tg.A1G(str, name, A0u);
            throw C90464aC.A0U(arrays, A0u);
        }
    }

    public static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw AnonymousClass001.A08("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            Unsafe unsafe = zzb;
            long j = (long) (this.zzc[i + 1] & 1048575);
            Object object = unsafe.getObject(obj2, j);
            if (object != null) {
                zzkr zzx = zzx(i);
                if (!zzN(obj, i)) {
                    if (!zzQ(object)) {
                        unsafe.putObject(obj, j, object);
                    } else {
                        Object zze2 = zzx.zze();
                        zzx.zzg(zze2, object);
                        unsafe.putObject(obj, j, zze2);
                    }
                    zzH(obj, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, j);
                if (!zzQ(object2)) {
                    Object zze3 = zzx.zze();
                    zzx.zzg(zze3, object2);
                    unsafe.putObject(obj, j, zze3);
                    object2 = zze3;
                }
                zzx.zzg(object2, object);
                return;
            }
            int i2 = this.zzc[i];
            String obj3 = obj2.toString();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Source subfield ");
            A0u.append(i2);
            A0u.append(" is present but null: ");
            throw AnonymousClass000.A0g(obj3, A0u);
        }
    }

    private final void zzG(Object obj, int i, zzkq zzkq) {
        Object zzp2;
        boolean zzM = zzM(i);
        long A0D = C165597tg.A0D(i);
        if (zzM) {
            zzp2 = zzkq.zzs();
        } else if (this.zzi) {
            zzp2 = zzkq.zzr();
        } else {
            zzp2 = zzkq.zzp();
        }
        zzlv.zzs(obj, A0D, zzp2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return AnonymousClass000.A1S(zzN(obj, i) ? 1 : 0, zzN(obj2, i) ? 1 : 0);
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzN(obj, i);
        }
        return AnonymousClass000.A1P(i3 & i4);
    }

    public static boolean zzP(Object obj, int i, zzkr zzkr) {
        return zzkr.zzl(zzlv.zzf(obj, C165597tg.A0D(i)));
    }

    public static boolean zzS(Object obj, long j) {
        return AnonymousClass000.A1X(zzlv.zzf(obj, j));
    }

    public static double zzn(Object obj, long j) {
        return C90504aG.A01(zzlv.zzf(obj, j));
    }

    public static float zzo(Object obj, long j) {
        return C36441kJ.A03(zzlv.zzf(obj, j));
    }

    public static int zzp(Object obj, long j) {
        return AnonymousClass000.A0I(zzlv.zzf(obj, j));
    }

    public static long zzv(Object obj, long j) {
        return C36431kI.A09(zzlv.zzf(obj, j));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x003c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = zzQ(r9)
            if (r0 == 0) goto L_0x0080
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzit
            r7 = 0
            if (r0 == 0) goto L_0x0019
            r1 = r9
            com.google.android.recaptcha.internal.zzit r1 = (com.google.android.recaptcha.internal.zzit) r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.zzE(r0)
            r1.zza = r7
            r1.zzC()
        L_0x0019:
            int[] r6 = r8.zzc
        L_0x001b:
            int r0 = r6.length
            if (r7 >= r0) goto L_0x0072
            int[] r4 = r8.zzc
            int r0 = r7 + 1
            r0 = r4[r0]
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            int r0 = r0 >>> 20
            r1 = r0 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            r0 = 9
            if (r1 == r0) goto L_0x005e
            r0 = 60
            if (r1 == r0) goto L_0x0057
            r0 = 68
            if (r1 == r0) goto L_0x0057
            switch(r1) {
                case 17: goto L_0x005e;
                case 18: goto L_0x003f;
                case 19: goto L_0x003f;
                case 20: goto L_0x003f;
                case 21: goto L_0x003f;
                case 22: goto L_0x003f;
                case 23: goto L_0x003f;
                case 24: goto L_0x003f;
                case 25: goto L_0x003f;
                case 26: goto L_0x003f;
                case 27: goto L_0x003f;
                case 28: goto L_0x003f;
                case 29: goto L_0x003f;
                case 30: goto L_0x003f;
                case 31: goto L_0x003f;
                case 32: goto L_0x003f;
                case 33: goto L_0x003f;
                case 34: goto L_0x003f;
                case 35: goto L_0x003f;
                case 36: goto L_0x003f;
                case 37: goto L_0x003f;
                case 38: goto L_0x003f;
                case 39: goto L_0x003f;
                case 40: goto L_0x003f;
                case 41: goto L_0x003f;
                case 42: goto L_0x003f;
                case 43: goto L_0x003f;
                case 44: goto L_0x003f;
                case 45: goto L_0x003f;
                case 46: goto L_0x003f;
                case 47: goto L_0x003f;
                case 48: goto L_0x003f;
                case 49: goto L_0x003f;
                case 50: goto L_0x0045;
                default: goto L_0x003c;
            }
        L_0x003c:
            int r7 = r7 + 3
            goto L_0x001b
        L_0x003f:
            com.google.android.recaptcha.internal.zzjs r0 = r8.zzm
            r0.zzb(r9, r2)
            goto L_0x003c
        L_0x0045:
            sun.misc.Unsafe r5 = zzb
            java.lang.Object r4 = r5.getObject(r9, r2)
            if (r4 == 0) goto L_0x003c
            r1 = r4
            com.google.android.recaptcha.internal.zzjy r1 = (com.google.android.recaptcha.internal.zzjy) r1
            r0 = 0
            r1.zzb = r0
            r5.putObject(r9, r2, r4)
            goto L_0x003c
        L_0x0057:
            r0 = r4[r7]
            boolean r0 = r8.zzR(r9, r0, r7)
            goto L_0x0062
        L_0x005e:
            boolean r0 = r8.zzN(r9, r7)
        L_0x0062:
            if (r0 == 0) goto L_0x003c
            com.google.android.recaptcha.internal.zzkr r1 = r8.zzx(r7)
            sun.misc.Unsafe r0 = zzb
            java.lang.Object r0 = r0.getObject(r9, r2)
            r1.zzf(r0)
            goto L_0x003c
        L_0x0072:
            com.google.android.recaptcha.internal.zzll r0 = r8.zzn
            r0.zzm(r9)
            boolean r0 = r8.zzh
            if (r0 == 0) goto L_0x0080
            com.google.android.recaptcha.internal.zzif r0 = r8.zzo
            r0.zzf(r9)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzf(java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        com.google.android.recaptcha.internal.zzlv.zzs(r6, r2, com.google.android.recaptcha.internal.zzlv.zzf(r7, r2));
        zzI(r6, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b2, code lost:
        zzH(r6, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            zzD(r6)
            java.util.Objects.requireNonNull(r7)
            r4 = 0
        L_0x0007:
            int[] r1 = r5.zzc
            int r0 = r1.length
            if (r4 >= r0) goto L_0x00b7
            int r0 = r4 + 1
            r0 = r1[r0]
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            int r0 = r0 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1[r4]
            long r2 = (long) r2
            switch(r0) {
                case 0: goto L_0x00a3;
                case 1: goto L_0x0093;
                case 2: goto L_0x0085;
                case 3: goto L_0x0085;
                case 4: goto L_0x0077;
                case 5: goto L_0x0085;
                case 6: goto L_0x0077;
                case 7: goto L_0x0067;
                case 8: goto L_0x0059;
                case 9: goto L_0x0055;
                case 10: goto L_0x0059;
                case 11: goto L_0x0077;
                case 12: goto L_0x0077;
                case 13: goto L_0x0077;
                case 14: goto L_0x0085;
                case 15: goto L_0x0077;
                case 16: goto L_0x0085;
                case 17: goto L_0x0055;
                case 18: goto L_0x004f;
                case 19: goto L_0x004f;
                case 20: goto L_0x004f;
                case 21: goto L_0x004f;
                case 22: goto L_0x004f;
                case 23: goto L_0x004f;
                case 24: goto L_0x004f;
                case 25: goto L_0x004f;
                case 26: goto L_0x004f;
                case 27: goto L_0x004f;
                case 28: goto L_0x004f;
                case 29: goto L_0x004f;
                case 30: goto L_0x004f;
                case 31: goto L_0x004f;
                case 32: goto L_0x004f;
                case 33: goto L_0x004f;
                case 34: goto L_0x004f;
                case 35: goto L_0x004f;
                case 36: goto L_0x004f;
                case 37: goto L_0x004f;
                case 38: goto L_0x004f;
                case 39: goto L_0x004f;
                case 40: goto L_0x004f;
                case 41: goto L_0x004f;
                case 42: goto L_0x004f;
                case 43: goto L_0x004f;
                case 44: goto L_0x004f;
                case 45: goto L_0x004f;
                case 46: goto L_0x004f;
                case 47: goto L_0x004f;
                case 48: goto L_0x004f;
                case 49: goto L_0x004f;
                case 50: goto L_0x003d;
                case 51: goto L_0x002c;
                case 52: goto L_0x002c;
                case 53: goto L_0x002c;
                case 54: goto L_0x002c;
                case 55: goto L_0x002c;
                case 56: goto L_0x002c;
                case 57: goto L_0x002c;
                case 58: goto L_0x002c;
                case 59: goto L_0x002c;
                case 60: goto L_0x0028;
                case 61: goto L_0x0021;
                case 62: goto L_0x0021;
                case 63: goto L_0x0021;
                case 64: goto L_0x0021;
                case 65: goto L_0x0021;
                case 66: goto L_0x0021;
                case 67: goto L_0x0021;
                case 68: goto L_0x0028;
                default: goto L_0x001e;
            }
        L_0x001e:
            int r4 = r4 + 3
            goto L_0x0007
        L_0x0021:
            boolean r0 = r5.zzR(r7, r1, r4)
            if (r0 == 0) goto L_0x001e
            goto L_0x0032
        L_0x0028:
            r5.zzF(r6, r7, r4)
            goto L_0x001e
        L_0x002c:
            boolean r0 = r5.zzR(r7, r1, r4)
            if (r0 == 0) goto L_0x001e
        L_0x0032:
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r7, r2)
            com.google.android.recaptcha.internal.zzlv.zzs(r6, r2, r0)
            r5.zzI(r6, r1, r4)
            goto L_0x001e
        L_0x003d:
            int r0 = com.google.android.recaptcha.internal.zzkt.zza
            java.lang.Object r1 = com.google.android.recaptcha.internal.zzlv.zzf(r6, r2)
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r7, r2)
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzjz.zzb(r1, r0)
            com.google.android.recaptcha.internal.zzlv.zzs(r6, r2, r0)
            goto L_0x001e
        L_0x004f:
            com.google.android.recaptcha.internal.zzjs r0 = r5.zzm
            r0.zzc(r6, r7, r2)
            goto L_0x001e
        L_0x0055:
            r5.zzE(r6, r7, r4)
            goto L_0x001e
        L_0x0059:
            boolean r0 = r5.zzN(r7, r4)
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = com.google.android.recaptcha.internal.zzlv.zzf(r7, r2)
            com.google.android.recaptcha.internal.zzlv.zzs(r6, r2, r0)
            goto L_0x00b2
        L_0x0067:
            boolean r0 = r5.zzN(r7, r4)
            if (r0 == 0) goto L_0x001e
            com.google.android.recaptcha.internal.zzlu r0 = com.google.android.recaptcha.internal.zzlv.zzf
            boolean r0 = r0.zzg(r7, r2)
            com.google.android.recaptcha.internal.zzlv.zzm(r6, r2, r0)
            goto L_0x00b2
        L_0x0077:
            boolean r0 = r5.zzN(r7, r4)
            if (r0 == 0) goto L_0x001e
            int r0 = com.google.android.recaptcha.internal.zzlv.zzc(r7, r2)
            com.google.android.recaptcha.internal.zzlv.zzq(r6, r2, r0)
            goto L_0x00b2
        L_0x0085:
            boolean r0 = r5.zzN(r7, r4)
            if (r0 == 0) goto L_0x001e
            long r0 = com.google.android.recaptcha.internal.zzlv.zzd(r7, r2)
            com.google.android.recaptcha.internal.zzlv.zzr(r6, r2, r0)
            goto L_0x00b2
        L_0x0093:
            boolean r0 = r5.zzN(r7, r4)
            if (r0 == 0) goto L_0x001e
            com.google.android.recaptcha.internal.zzlu r0 = com.google.android.recaptcha.internal.zzlv.zzf
            float r0 = r0.zzb(r7, r2)
            com.google.android.recaptcha.internal.zzlv.zzp(r6, r2, r0)
            goto L_0x00b2
        L_0x00a3:
            boolean r0 = r5.zzN(r7, r4)
            if (r0 == 0) goto L_0x001e
            com.google.android.recaptcha.internal.zzlu r0 = com.google.android.recaptcha.internal.zzlv.zzf
            double r0 = r0.zza(r7, r2)
            com.google.android.recaptcha.internal.zzlv.zzo(r6, r2, r0)
        L_0x00b2:
            r5.zzH(r6, r4)
            goto L_0x001e
        L_0x00b7:
            com.google.android.recaptcha.internal.zzll r0 = r5.zzn
            com.google.android.recaptcha.internal.zzkt.zzr(r0, r6, r7)
            boolean r0 = r5.zzh
            if (r0 == 0) goto L_0x00c5
            com.google.android.recaptcha.internal.zzif r0 = r5.zzo
            com.google.android.recaptcha.internal.zzkt.zzq(r0, r6, r7)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzg(java.lang.Object, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v65, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v71, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v73, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v76, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v77, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v79, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v81, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v82, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v83, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v85, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v86, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v87, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v88, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v89, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v93, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v94, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v97, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v100, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v101, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v102, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v106, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v107, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v108, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v109, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v110, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v111, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v112, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v114, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v115, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v116, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v117, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v118, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v120, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v122, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v124, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v117, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v125, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v134, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v135, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v127, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: byte} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0253, code lost:
        r19.putObject(r12, r5, r1.zzc);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0295, code lost:
        r19.putInt(r12, r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (r1 == 1048575) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        r19.putInt(r12, (long) r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        r3 = r9.zzk;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        if (r3 >= r9.zzl) goto L_0x0830;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        r2 = r9.zzj;
        zzy(r12, r2[r3], (java.lang.Object) null, r9.zzn, r12);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0603, code lost:
        if (r7 != r6) goto L_0x085b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x063f, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x065c, code lost:
        if (r7 != r5) goto L_0x081d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x065e, code lost:
        r0 = r7;
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06a9, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x06aa, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x06ab, code lost:
        if (r7 != r0) goto L_0x081d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x06ad, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x06fe, code lost:
        r19.putObject(r12, r5, r4);
        r19.putInt(r12, r23, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x072d, code lost:
        r19.putObject(r12, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x07c0, code lost:
        r4 = java.lang.Integer.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x07d5, code lost:
        r19.putObject(r12, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        r9.zzi(r7.zzb, r13);
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x07da, code lost:
        r19.putInt(r12, r23, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0803, code lost:
        zzK(r12, r18, r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0808, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0824, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0830, code lost:
        r1 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0832, code lost:
        if (r35 != 0) goto L_0x0837;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0834, code lost:
        if (r0 != r1) goto L_0x083e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0836, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0837, code lost:
        if (r0 > r1) goto L_0x083e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x083b, code lost:
        if (r15 != r21) goto L_0x083e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x083d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0844, code lost:
        throw X.C165617ti.A0H("Failed to parse the message.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x085a, code lost:
        throw X.C165607th.A0N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x085f, code lost:
        throw X.C165597tg.A0K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f7, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0112, code lost:
        r13 = r1.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d4, code lost:
        r19.putLong(r12, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0244, code lost:
        r3 = r18;
        r8 = r22;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzc(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.recaptcha.internal.zzgj r36) {
        /*
            r30 = this;
            r12 = r31
            r7 = r33
            zzD(r12)
            sun.misc.Unsafe r19 = zzb
            r4 = -1
            r3 = -1
            r10 = 0
            r15 = 0
            r8 = 0
            r20 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0011:
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r7
            r9 = r30
            r29 = r34
            r1 = r29
            r21 = r35
            if (r7 >= r1) goto L_0x0052
            int r0 = r7 + 1
            r2 = r32
            byte r15 = r32[r7]
            r1 = r36
            if (r15 >= 0) goto L_0x002f
            int r0 = com.google.android.recaptcha.internal.zzgk.zzj(r15, r2, r0, r1)
            int r15 = r1.zza
        L_0x002f:
            int r18 = r15 >>> 3
            r6 = 3
            r5 = r18
            if (r5 <= r3) goto L_0x082a
            int r10 = r10 / r6
            int r5 = r9.zze
            r3 = r18
            if (r3 < r5) goto L_0x0827
            int r5 = r9.zzf
            if (r3 > r5) goto L_0x0827
            int r10 = r9.zzs(r3, r10)
        L_0x0045:
            r13 = 0
            r16 = 0
            if (r10 != r4) goto L_0x0147
            r11 = 1
            r10 = 0
        L_0x004c:
            r3 = r21
            if (r15 != r3) goto L_0x007b
            if (r35 == 0) goto L_0x007b
        L_0x0052:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r20
            if (r1 == r2) goto L_0x005f
            long r1 = (long) r1
            r3 = r19
            r3.putInt(r12, r1, r8)
        L_0x005f:
            int r3 = r9.zzk
        L_0x0061:
            int r1 = r9.zzl
            if (r3 >= r1) goto L_0x0830
            int[] r2 = r9.zzj
            com.google.android.recaptcha.internal.zzll r1 = r9.zzn
            r24 = r2[r3]
            r25 = 0
            r27 = r12
            r22 = r9
            r23 = r12
            r26 = r1
            r22.zzy(r23, r24, r25, r26, r27)
            int r3 = r3 + 1
            goto L_0x0061
        L_0x007b:
            boolean r3 = r9.zzh
            if (r3 == 0) goto L_0x0138
            com.google.android.recaptcha.internal.zzie r4 = r1.zzd
            com.google.android.recaptcha.internal.zzie r3 = com.google.android.recaptcha.internal.zzie.zza
            if (r4 == r3) goto L_0x0138
            com.google.android.recaptcha.internal.zzke r3 = r9.zzg
            r5 = r18
            com.google.android.recaptcha.internal.zzir r7 = r4.zza(r3, r5)
            if (r7 == 0) goto L_0x0138
            r3 = r12
            com.google.android.recaptcha.internal.zzip r3 = (com.google.android.recaptcha.internal.zzip) r3
            r3.zzi()
            com.google.android.recaptcha.internal.zzij r9 = r3.zzb
            com.google.android.recaptcha.internal.zziq r3 = r7.zzb
            com.google.android.recaptcha.internal.zzmb r4 = r3.zzb
            com.google.android.recaptcha.internal.zzmb r3 = com.google.android.recaptcha.internal.zzmb.ENUM
            if (r4 == r3) goto L_0x0852
            int r3 = r4.ordinal()
            switch(r3) {
                case 0: goto L_0x00ae;
                case 1: goto L_0x00bd;
                case 2: goto L_0x00cc;
                case 3: goto L_0x00cc;
                case 4: goto L_0x00d7;
                case 5: goto L_0x00e2;
                case 6: goto L_0x00ed;
                case 7: goto L_0x00f9;
                case 8: goto L_0x0109;
                case 9: goto L_0x0845;
                case 10: goto L_0x0848;
                case 11: goto L_0x010e;
                case 12: goto L_0x00d7;
                case 13: goto L_0x084b;
                case 14: goto L_0x00ed;
                case 15: goto L_0x00e2;
                case 16: goto L_0x0115;
                case 17: goto L_0x0126;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            com.google.android.recaptcha.internal.zziq r1 = r7.zzb
            r9.zzi(r1, r13)
            r7 = r0
            goto L_0x081d
        L_0x00ae:
            int r3 = r0 + 8
            long r0 = com.google.android.recaptcha.internal.zzgk.zzp(r2, r0)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r13 = java.lang.Double.valueOf(r0)
            goto L_0x00f7
        L_0x00bd:
            int r3 = r0 + 4
            int r0 = X.C165577te.A0A(r2, r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r13 = java.lang.Float.valueOf(r0)
            goto L_0x00f7
        L_0x00cc:
            int r0 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r0, r1)
            long r1 = r1.zzb
            java.lang.Long r13 = java.lang.Long.valueOf(r1)
            goto L_0x00a6
        L_0x00d7:
            int r0 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r1 = r1.zza
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            goto L_0x00a6
        L_0x00e2:
            int r3 = r0 + 8
            long r0 = com.google.android.recaptcha.internal.zzgk.zzp(r2, r0)
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            goto L_0x00f7
        L_0x00ed:
            int r3 = r0 + 4
            int r0 = X.C165577te.A0A(r2, r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
        L_0x00f7:
            r0 = r3
            goto L_0x00a6
        L_0x00f9:
            int r0 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r0, r1)
            long r1 = r1.zzb
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r3 != 0) goto L_0x0104
            r11 = 0
        L_0x0104:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r11)
            goto L_0x00a6
        L_0x0109:
            int r0 = com.google.android.recaptcha.internal.zzgk.zzg(r2, r0, r1)
            goto L_0x0112
        L_0x010e:
            int r0 = com.google.android.recaptcha.internal.zzgk.zza(r2, r0, r1)
        L_0x0112:
            java.lang.Object r13 = r1.zzc
            goto L_0x00a6
        L_0x0115:
            int r0 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r2 = r1.zza
            r1 = r2 & 1
            int r2 = r2 >>> 1
            int r1 = -r1
            r2 = r2 ^ r1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            goto L_0x00a6
        L_0x0126:
            int r0 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r0, r1)
            long r3 = r1.zzb
            r1 = 1
            long r1 = r1 & r3
            long r3 = r3 >>> r11
            long r5 = -r1
            long r3 = r3 ^ r5
            java.lang.Long r13 = java.lang.Long.valueOf(r3)
            goto L_0x00a6
        L_0x0138:
            com.google.android.recaptcha.internal.zzlm r5 = zzd(r12)
            r4 = r29
            r6 = r1
            r1 = r15
            r3 = r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzh(r1, r2, r3, r4, r5, r6)
            goto L_0x081d
        L_0x0147:
            r7 = r15 & 7
            int[] r4 = r9.zzc
            int r3 = r10 + 1
            r11 = r4[r3]
            int r3 = r11 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            r26 = r3
            r3 = r11 & r27
            long r5 = (long) r3
            java.lang.String r25 = ""
            r3 = 17
            r14 = r3
            r3 = r26
            if (r3 > r14) goto L_0x02d7
            int r3 = r10 + 2
            r24 = r4[r3]
            int r3 = r24 >>> 20
            r23 = 1
            int r22 = r23 << r3
            r24 = r24 & r27
            r4 = r20
            r3 = r24
            if (r3 == r4) goto L_0x0188
            r3 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 == r3) goto L_0x017e
            long r3 = (long) r4
            r14 = r19
            r14.putInt(r12, r3, r8)
        L_0x017e:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r24
            if (r3 != r4) goto L_0x02ce
            r8 = 0
        L_0x0186:
            r20 = r24
        L_0x0188:
            switch(r26) {
                case 0: goto L_0x02ba;
                case 1: goto L_0x080b;
                case 2: goto L_0x01b2;
                case 3: goto L_0x01b2;
                case 4: goto L_0x01bd;
                case 5: goto L_0x01c9;
                case 6: goto L_0x01e0;
                case 7: goto L_0x01ed;
                case 8: goto L_0x0202;
                case 9: goto L_0x022b;
                case 10: goto L_0x024a;
                case 11: goto L_0x01bd;
                case 12: goto L_0x025c;
                case 13: goto L_0x01e0;
                case 14: goto L_0x01c9;
                case 15: goto L_0x0285;
                case 16: goto L_0x029c;
                default: goto L_0x018b;
            }
        L_0x018b:
            r3 = 3
            if (r7 != r3) goto L_0x0824
            r8 = r8 | r22
            java.lang.Object r4 = r9.zzA(r12, r10)
            int r3 = r18 << 3
            r26 = r3 | 4
            com.google.android.recaptcha.internal.zzkr r22 = r9.zzx(r10)
            r3 = r18
            r23 = r2
            r25 = r29
            r27 = r1
            r24 = r0
            r21 = r4
            int r7 = com.google.android.recaptcha.internal.zzgk.zzm(r21, r22, r23, r24, r25, r26, r27)
            r9.zzJ(r12, r10, r4)
        L_0x01af:
            r4 = -1
            goto L_0x0011
        L_0x01b2:
            if (r7 != 0) goto L_0x0824
            r22 = r22 | r8
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r0, r1)
            long r0 = r1.zzb
            goto L_0x01d4
        L_0x01bd:
            if (r7 != 0) goto L_0x0824
            r8 = r8 | r22
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r1 = r1.zza
            goto L_0x0295
        L_0x01c9:
            r3 = 1
            if (r7 != r3) goto L_0x0824
            int r7 = r0 + 8
            r22 = r22 | r8
            long r0 = com.google.android.recaptcha.internal.zzgk.zzp(r2, r0)
        L_0x01d4:
            r23 = r19
            r24 = r12
            r25 = r5
            r27 = r0
            r23.putLong(r24, r25, r27)
            goto L_0x0244
        L_0x01e0:
            r3 = 5
            if (r7 != r3) goto L_0x0824
            int r7 = r0 + 4
            r8 = r8 | r22
            int r1 = X.C165577te.A0A(r2, r0)
            goto L_0x0295
        L_0x01ed:
            if (r7 != 0) goto L_0x0824
            r8 = r8 | r22
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r0, r1)
            long r0 = r1.zzb
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r2)
            com.google.android.recaptcha.internal.zzlv.zzm(r12, r5, r0)
            goto L_0x081d
        L_0x0202:
            r3 = 2
            if (r7 != r3) goto L_0x0824
            boolean r3 = zzM(r11)
            if (r3 == 0) goto L_0x0224
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r3 = r1.zza
            if (r3 < 0) goto L_0x0856
            r8 = r8 | r22
            if (r3 != 0) goto L_0x021c
            r0 = r25
            r1.zzc = r0
            goto L_0x0253
        L_0x021c:
            java.lang.String r0 = com.google.android.recaptcha.internal.zzma.zzd(r2, r7, r3)
            r1.zzc = r0
            int r7 = r7 + r3
            goto L_0x0253
        L_0x0224:
            r8 = r8 | r22
            int r7 = com.google.android.recaptcha.internal.zzgk.zzg(r2, r0, r1)
            goto L_0x0253
        L_0x022b:
            r3 = 2
            if (r7 != r3) goto L_0x0824
            r22 = r22 | r8
            java.lang.Object r3 = r9.zzA(r12, r10)
            com.google.android.recaptcha.internal.zzkr r4 = r9.zzx(r10)
            r5 = r2
            r7 = r29
            r8 = r1
            r6 = r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzn(r3, r4, r5, r6, r7, r8)
            r9.zzJ(r12, r10, r3)
        L_0x0244:
            r3 = r18
            r8 = r22
            goto L_0x01af
        L_0x024a:
            r3 = 2
            if (r7 != r3) goto L_0x0824
            r8 = r8 | r22
            int r7 = com.google.android.recaptcha.internal.zzgk.zza(r2, r0, r1)
        L_0x0253:
            java.lang.Object r1 = r1.zzc
            r0 = r19
            r0.putObject(r12, r5, r1)
            goto L_0x081d
        L_0x025c:
            if (r7 != 0) goto L_0x0824
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r1 = r1.zza
            com.google.android.recaptcha.internal.zzix r2 = r9.zzw(r10)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r11 & r0
            if (r11 == 0) goto L_0x0282
            if (r2 == 0) goto L_0x0282
            boolean r0 = r2.zza(r1)
            if (r0 != 0) goto L_0x0282
            com.google.android.recaptcha.internal.zzlm r2 = zzd(r12)
            java.lang.Long r0 = X.C36441kJ.A0y(r1)
            r2.zzj(r15, r0)
            goto L_0x081d
        L_0x0282:
            r8 = r8 | r22
            goto L_0x0295
        L_0x0285:
            if (r7 != 0) goto L_0x0824
            r8 = r8 | r22
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r1 = r1.zza
            r0 = r1 & 1
            int r1 = r1 >>> 1
            int r0 = -r0
            r1 = r1 ^ r0
        L_0x0295:
            r0 = r19
            r0.putInt(r12, r5, r1)
            goto L_0x081d
        L_0x029c:
            if (r7 != 0) goto L_0x0824
            r8 = r8 | r22
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r0, r1)
            long r2 = r1.zzb
            r13 = 1
            long r13 = r13 & r2
            long r2 = r2 >>> r23
            long r0 = -r13
            long r2 = r2 ^ r0
            r21 = r19
            r22 = r12
            r23 = r5
            r25 = r2
            r21.putLong(r22, r23, r25)
            goto L_0x081d
        L_0x02ba:
            r3 = 1
            if (r7 != r3) goto L_0x0824
            int r7 = r0 + 8
            r8 = r8 | r22
            long r0 = com.google.android.recaptcha.internal.zzgk.zzp(r2, r0)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.recaptcha.internal.zzlv.zzo(r12, r5, r0)
            goto L_0x081d
        L_0x02ce:
            long r3 = (long) r3
            r8 = r19
            int r8 = r8.getInt(r12, r3)
            goto L_0x0186
        L_0x02d7:
            r3 = 27
            r14 = r3
            r3 = r26
            if (r3 != r14) goto L_0x031a
            r3 = 2
            if (r7 != r3) goto L_0x0821
            r3 = r19
            java.lang.Object r4 = r3.getObject(r12, r5)
            com.google.android.recaptcha.internal.zzjb r4 = (com.google.android.recaptcha.internal.zzjb) r4
            boolean r3 = r4.zzc()
            if (r3 != 0) goto L_0x0302
            int r7 = r4.size()
            int r3 = r7 + r7
            if (r7 != 0) goto L_0x02f9
            r3 = 10
        L_0x02f9:
            com.google.android.recaptcha.internal.zzjb r4 = r4.zzd(r3)
            r3 = r19
            r3.putObject(r12, r5, r4)
        L_0x0302:
            com.google.android.recaptcha.internal.zzkr r21 = r9.zzx(r10)
            r3 = r18
            r23 = r2
            r25 = r29
            r27 = r1
            r22 = r15
            r24 = r0
            r26 = r4
            int r7 = com.google.android.recaptcha.internal.zzgk.zze(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x01af
        L_0x031a:
            r3 = 49
            r14 = r3
            r3 = r26
            if (r3 > r14) goto L_0x0678
            long r3 = (long) r11
            r22 = r3
            r3 = r19
            java.lang.Object r3 = r3.getObject(r12, r5)
            com.google.android.recaptcha.internal.zzjb r3 = (com.google.android.recaptcha.internal.zzjb) r3
            boolean r4 = r3.zzc()
            if (r4 != 0) goto L_0x0345
            int r11 = r3.size()
            int r4 = r11 + r11
            if (r11 != 0) goto L_0x033c
            r4 = 10
        L_0x033c:
            com.google.android.recaptcha.internal.zzjb r3 = r3.zzd(r4)
            r4 = r19
            r4.putObject(r12, r5, r3)
        L_0x0345:
            switch(r26) {
                case 18: goto L_0x038f;
                case 19: goto L_0x03d7;
                case 20: goto L_0x041f;
                case 21: goto L_0x041f;
                case 22: goto L_0x0372;
                case 23: goto L_0x0455;
                case 24: goto L_0x0491;
                case 25: goto L_0x04cd;
                case 26: goto L_0x050f;
                case 27: goto L_0x0628;
                case 28: goto L_0x056d;
                case 29: goto L_0x0372;
                case 30: goto L_0x0641;
                case 31: goto L_0x0491;
                case 32: goto L_0x0455;
                case 33: goto L_0x05a5;
                case 34: goto L_0x05e7;
                case 35: goto L_0x038f;
                case 36: goto L_0x03d7;
                case 37: goto L_0x041f;
                case 38: goto L_0x041f;
                case 39: goto L_0x0372;
                case 40: goto L_0x0455;
                case 41: goto L_0x0491;
                case 42: goto L_0x04cd;
                case 43: goto L_0x0372;
                case 44: goto L_0x0641;
                case 45: goto L_0x0491;
                case 46: goto L_0x0455;
                case 47: goto L_0x05a5;
                case 48: goto L_0x05e7;
                default: goto L_0x0348;
            }
        L_0x0348:
            r4 = 3
            if (r7 != r4) goto L_0x0675
            r4 = r15 & -8
            r26 = r4 | 4
            com.google.android.recaptcha.internal.zzkr r22 = r9.zzx(r10)
            r5 = r0
        L_0x0354:
            r23 = r2
            r25 = r29
            r27 = r1
            r24 = r0
            int r7 = com.google.android.recaptcha.internal.zzgk.zzc(r22, r23, r24, r25, r26, r27)
            java.lang.Object r0 = r1.zzc
            r3.add(r0)
            r0 = r29
            if (r7 >= r0) goto L_0x065c
            int r0 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r7, r1)
            int r4 = r1.zza
            if (r15 != r4) goto L_0x065c
            goto L_0x0354
        L_0x0372:
            r4 = 2
            if (r7 != r4) goto L_0x037b
            int r7 = com.google.android.recaptcha.internal.zzgk.zzf(r2, r0, r3, r1)
            goto L_0x063f
        L_0x037b:
            if (r7 != 0) goto L_0x0675
            r23 = r2
            r25 = r29
            r27 = r1
            r22 = r15
            r24 = r0
            r26 = r3
            int r7 = com.google.android.recaptcha.internal.zzgk.zzk(r22, r23, r24, r25, r26, r27)
            goto L_0x063f
        L_0x038f:
            r5 = 2
            r4 = 1
            if (r7 != r5) goto L_0x03ac
            com.google.android.recaptcha.internal.zzhy r3 = (com.google.android.recaptcha.internal.zzhy) r3
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r6 = r1.zza
            int r6 = r6 + r7
        L_0x039c:
            if (r7 >= r6) goto L_0x0603
            long r4 = com.google.android.recaptcha.internal.zzgk.zzp(r2, r7)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r3.zze(r4)
            int r7 = r7 + 8
            goto L_0x039c
        L_0x03ac:
            if (r7 != r4) goto L_0x0675
            int r7 = r0 + 8
            com.google.android.recaptcha.internal.zzhy r3 = (com.google.android.recaptcha.internal.zzhy) r3
            long r4 = com.google.android.recaptcha.internal.zzgk.zzp(r2, r0)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r3.zze(r4)
        L_0x03bd:
            r4 = r29
            if (r7 >= r4) goto L_0x063f
            int r6 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r7, r1)
            int r4 = r1.zza
            if (r15 != r4) goto L_0x063f
            long r4 = com.google.android.recaptcha.internal.zzgk.zzp(r2, r6)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r3.zze(r4)
            int r7 = r6 + 8
            goto L_0x03bd
        L_0x03d7:
            r4 = 2
            if (r7 != r4) goto L_0x03f3
            com.google.android.recaptcha.internal.zzil r3 = (com.google.android.recaptcha.internal.zzil) r3
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r6 = r1.zza
            int r6 = r6 + r7
        L_0x03e3:
            if (r7 >= r6) goto L_0x0603
            int r4 = X.C165577te.A0A(r2, r7)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r3.zze(r4)
            int r7 = r7 + 4
            goto L_0x03e3
        L_0x03f3:
            r4 = 5
            if (r7 != r4) goto L_0x0675
            int r7 = r0 + 4
            com.google.android.recaptcha.internal.zzil r3 = (com.google.android.recaptcha.internal.zzil) r3
            int r4 = X.C165577te.A0A(r2, r0)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r3.zze(r4)
        L_0x0405:
            r4 = r29
            if (r7 >= r4) goto L_0x063f
            int r5 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r7, r1)
            int r4 = r1.zza
            if (r15 != r4) goto L_0x063f
            int r4 = X.C165577te.A0A(r2, r5)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r3.zze(r4)
            int r7 = r5 + 4
            goto L_0x0405
        L_0x041f:
            r4 = 2
            if (r7 != r4) goto L_0x0437
            com.google.android.recaptcha.internal.zzjt r3 = (com.google.android.recaptcha.internal.zzjt) r3
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r6 = r1.zza
            int r6 = r6 + r7
        L_0x042b:
            if (r7 >= r6) goto L_0x0603
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r7, r1)
            long r4 = r1.zzb
            r3.zzg(r4)
            goto L_0x042b
        L_0x0437:
            if (r7 != 0) goto L_0x0675
            com.google.android.recaptcha.internal.zzjt r3 = (com.google.android.recaptcha.internal.zzjt) r3
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r0, r1)
        L_0x043f:
            long r4 = r1.zzb
            r3.zzg(r4)
            r4 = r29
            if (r7 >= r4) goto L_0x063f
            int r5 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r7, r1)
            int r4 = r1.zza
            if (r15 != r4) goto L_0x063f
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r5, r1)
            goto L_0x043f
        L_0x0455:
            r5 = 1
            r4 = 2
            if (r7 != r4) goto L_0x046e
            com.google.android.recaptcha.internal.zzjt r3 = (com.google.android.recaptcha.internal.zzjt) r3
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r6 = r1.zza
            int r6 = r6 + r7
        L_0x0462:
            if (r7 >= r6) goto L_0x0603
            long r4 = com.google.android.recaptcha.internal.zzgk.zzp(r2, r7)
            r3.zzg(r4)
            int r7 = r7 + 8
            goto L_0x0462
        L_0x046e:
            if (r7 != r5) goto L_0x0675
            int r7 = r0 + 8
            com.google.android.recaptcha.internal.zzjt r3 = (com.google.android.recaptcha.internal.zzjt) r3
            long r4 = com.google.android.recaptcha.internal.zzgk.zzp(r2, r0)
            r3.zzg(r4)
        L_0x047b:
            r4 = r29
            if (r7 >= r4) goto L_0x063f
            int r6 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r7, r1)
            int r4 = r1.zza
            if (r15 != r4) goto L_0x063f
            long r4 = com.google.android.recaptcha.internal.zzgk.zzp(r2, r6)
            r3.zzg(r4)
            int r7 = r6 + 8
            goto L_0x047b
        L_0x0491:
            r4 = 2
            if (r7 != r4) goto L_0x04a9
            com.google.android.recaptcha.internal.zziu r3 = (com.google.android.recaptcha.internal.zziu) r3
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r6 = r1.zza
            int r6 = r6 + r7
        L_0x049d:
            if (r7 >= r6) goto L_0x0603
            int r4 = X.C165577te.A0A(r2, r7)
            r3.zzg(r4)
            int r7 = r7 + 4
            goto L_0x049d
        L_0x04a9:
            r4 = 5
            if (r7 != r4) goto L_0x0675
            int r7 = r0 + 4
            com.google.android.recaptcha.internal.zziu r3 = (com.google.android.recaptcha.internal.zziu) r3
            int r4 = X.C165577te.A0A(r2, r0)
            r3.zzg(r4)
        L_0x04b7:
            r4 = r29
            if (r7 >= r4) goto L_0x063f
            int r5 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r7, r1)
            int r4 = r1.zza
            if (r15 != r4) goto L_0x063f
            int r4 = X.C165577te.A0A(r2, r5)
            r3.zzg(r4)
            int r7 = r5 + 4
            goto L_0x04b7
        L_0x04cd:
            r4 = 2
            if (r7 != r4) goto L_0x04eb
            com.google.android.recaptcha.internal.zzgl r3 = (com.google.android.recaptcha.internal.zzgl) r3
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r6 = r1.zza
            int r6 = r6 + r7
        L_0x04d9:
            if (r7 >= r6) goto L_0x0603
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r7, r1)
            long r4 = r1.zzb
            int r11 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1P(r11)
            r3.zze(r4)
            goto L_0x04d9
        L_0x04eb:
            if (r7 != 0) goto L_0x0675
            com.google.android.recaptcha.internal.zzgl r3 = (com.google.android.recaptcha.internal.zzgl) r3
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r0, r1)
        L_0x04f3:
            long r4 = r1.zzb
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1P(r6)
            r3.zze(r4)
            r4 = r29
            if (r7 >= r4) goto L_0x063f
            int r5 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r7, r1)
            int r4 = r1.zza
            if (r15 != r4) goto L_0x063f
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r5, r1)
            goto L_0x04f3
        L_0x050f:
            r4 = 2
            if (r7 != r4) goto L_0x0675
            r4 = 536870912(0x20000000, double:2.652494739E-315)
            long r22 = r22 & r4
            int r4 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            if (r4 != 0) goto L_0x0542
        L_0x051f:
            int r5 = r1.zza
            if (r5 < 0) goto L_0x0856
            if (r5 != 0) goto L_0x053b
            r4 = r25
            r3.add(r4)
        L_0x052a:
            r4 = r29
            if (r7 >= r4) goto L_0x063f
            int r5 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r7, r1)
            int r4 = r1.zza
            if (r15 != r4) goto L_0x063f
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r5, r1)
            goto L_0x051f
        L_0x053b:
            java.nio.charset.Charset r4 = com.google.android.recaptcha.internal.zzjc.zzb
            X.C165597tg.A1L(r4, r3, r2, r7, r5)
            int r7 = r7 + r5
            goto L_0x052a
        L_0x0542:
            int r6 = r1.zza
            if (r6 < 0) goto L_0x0856
            if (r6 != 0) goto L_0x055e
            r4 = r25
            r3.add(r4)
        L_0x054d:
            r4 = r29
            if (r7 >= r4) goto L_0x063f
            int r5 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r7, r1)
            int r4 = r1.zza
            if (r15 != r4) goto L_0x063f
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r5, r1)
            goto L_0x0542
        L_0x055e:
            int r5 = r7 + r6
            boolean r4 = com.google.android.recaptcha.internal.zzma.zzf(r2, r7, r5)
            if (r4 == 0) goto L_0x0860
            java.nio.charset.Charset r4 = com.google.android.recaptcha.internal.zzjc.zzb
            X.C165597tg.A1L(r4, r3, r2, r7, r6)
            r7 = r5
            goto L_0x054d
        L_0x056d:
            r4 = 2
            if (r7 != r4) goto L_0x0675
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r6 = r1.zza
            if (r6 < 0) goto L_0x0856
            int r5 = r2.length
        L_0x0579:
            int r4 = r5 - r7
            if (r6 > r4) goto L_0x085b
            if (r6 != 0) goto L_0x0599
            com.google.android.recaptcha.internal.zzgw r4 = com.google.android.recaptcha.internal.zzgw.zzb
            r3.add(r4)
        L_0x0584:
            r4 = r29
            if (r7 >= r4) goto L_0x05a2
            int r6 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r7, r1)
            int r4 = r1.zza
            if (r15 != r4) goto L_0x05a2
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r6, r1)
            int r6 = r1.zza
            if (r6 < 0) goto L_0x0856
            goto L_0x0579
        L_0x0599:
            com.google.android.recaptcha.internal.zzgw r4 = com.google.android.recaptcha.internal.zzgw.zzm(r2, r7, r6)
            r3.add(r4)
            int r7 = r7 + r6
            goto L_0x0584
        L_0x05a2:
            r5 = r0
            goto L_0x065c
        L_0x05a5:
            r4 = 2
            if (r7 != r4) goto L_0x05c3
            com.google.android.recaptcha.internal.zziu r3 = (com.google.android.recaptcha.internal.zziu) r3
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r6 = r1.zza
            int r6 = r6 + r7
        L_0x05b1:
            if (r7 >= r6) goto L_0x0603
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r7, r1)
            int r5 = r1.zza
            r4 = r5 & 1
            int r5 = r5 >>> 1
            int r4 = -r4
            r5 = r5 ^ r4
            r3.zzg(r5)
            goto L_0x05b1
        L_0x05c3:
            if (r7 != 0) goto L_0x0675
            com.google.android.recaptcha.internal.zziu r3 = (com.google.android.recaptcha.internal.zziu) r3
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
        L_0x05cb:
            int r5 = r1.zza
            r4 = r5 & 1
            int r5 = r5 >>> 1
            int r4 = -r4
            r5 = r5 ^ r4
            r3.zzg(r5)
            r4 = r29
            if (r7 >= r4) goto L_0x063f
            int r5 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r7, r1)
            int r4 = r1.zza
            if (r15 != r4) goto L_0x063f
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r5, r1)
            goto L_0x05cb
        L_0x05e7:
            r4 = 2
            if (r7 != r4) goto L_0x0606
            com.google.android.recaptcha.internal.zzjt r3 = (com.google.android.recaptcha.internal.zzjt) r3
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r6 = r1.zza
            int r6 = r6 + r7
        L_0x05f3:
            if (r7 >= r6) goto L_0x0603
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r7, r1)
            long r4 = r1.zzb
            long r4 = X.C165577te.A0C(r4)
            r3.zzg(r4)
            goto L_0x05f3
        L_0x0603:
            if (r7 != r6) goto L_0x085b
            goto L_0x063f
        L_0x0606:
            if (r7 != 0) goto L_0x0675
            com.google.android.recaptcha.internal.zzjt r3 = (com.google.android.recaptcha.internal.zzjt) r3
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r0, r1)
        L_0x060e:
            long r4 = r1.zzb
            long r4 = X.C165577te.A0C(r4)
            r3.zzg(r4)
            r4 = r29
            if (r7 >= r4) goto L_0x063f
            int r5 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r7, r1)
            int r4 = r1.zza
            if (r15 != r4) goto L_0x063f
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r5, r1)
            goto L_0x060e
        L_0x0628:
            r4 = 2
            if (r7 != r4) goto L_0x0675
            com.google.android.recaptcha.internal.zzkr r22 = r9.zzx(r10)
            r24 = r2
            r26 = r29
            r28 = r1
            r23 = r15
            r25 = r0
            r27 = r3
            int r7 = com.google.android.recaptcha.internal.zzgk.zze(r22, r23, r24, r25, r26, r27, r28)
        L_0x063f:
            r5 = r0
            goto L_0x065c
        L_0x0641:
            r4 = 2
            if (r7 != r4) goto L_0x0662
            int r7 = com.google.android.recaptcha.internal.zzgk.zzf(r2, r0, r3, r1)
        L_0x0648:
            com.google.android.recaptcha.internal.zzix r25 = r9.zzw(r10)
            com.google.android.recaptcha.internal.zzll r4 = r9.zzn
            r22 = r12
            r23 = r18
            r24 = r3
            r26 = r13
            r27 = r4
            com.google.android.recaptcha.internal.zzkt.zzo(r22, r23, r24, r25, r26, r27)
            r5 = r0
        L_0x065c:
            if (r7 != r5) goto L_0x081d
            r0 = r7
            r11 = 1
            goto L_0x004c
        L_0x0662:
            if (r7 != 0) goto L_0x0675
            r23 = r2
            r25 = r29
            r27 = r1
            r22 = r15
            r24 = r0
            r26 = r3
            int r7 = com.google.android.recaptcha.internal.zzgk.zzk(r22, r23, r24, r25, r26, r27)
            goto L_0x0648
        L_0x0675:
            r5 = r0
            r7 = r0
            goto L_0x065c
        L_0x0678:
            r3 = 50
            r14 = r3
            r3 = r26
            if (r3 != r14) goto L_0x069d
            r3 = 2
            if (r7 != r3) goto L_0x0821
            r0 = r19
            java.lang.Object r2 = r0.getObject(r12, r5)
            boolean r0 = com.google.android.recaptcha.internal.zzjz.zza(r2)
            if (r0 == 0) goto L_0x069c
            com.google.android.recaptcha.internal.zzjy r0 = com.google.android.recaptcha.internal.zzjy.zza
            com.google.android.recaptcha.internal.zzjy r1 = r0.zzb()
            com.google.android.recaptcha.internal.zzjz.zzb(r1, r2)
            r0 = r19
            r0.putObject(r12, r5, r1)
        L_0x069c:
            throw r13
        L_0x069d:
            int r3 = r10 + 2
            r3 = r4[r3]
            r3 = r3 & r27
            long r3 = (long) r3
            r23 = r3
            switch(r26) {
                case 51: goto L_0x06b0;
                case 52: goto L_0x06c2;
                case 53: goto L_0x06d5;
                case 54: goto L_0x06d5;
                case 55: goto L_0x06e3;
                case 56: goto L_0x06f1;
                case 57: goto L_0x070d;
                case 58: goto L_0x071b;
                case 59: goto L_0x0734;
                case 60: goto L_0x0766;
                case 61: goto L_0x0783;
                case 62: goto L_0x06e3;
                case 63: goto L_0x0792;
                case 64: goto L_0x070d;
                case 65: goto L_0x06f1;
                case 66: goto L_0x07b2;
                case 67: goto L_0x07c5;
                case 68: goto L_0x07e4;
                default: goto L_0x06a9;
            }
        L_0x06a9:
            r11 = 1
        L_0x06aa:
            r7 = r0
        L_0x06ab:
            if (r7 != r0) goto L_0x081d
            r0 = r7
            goto L_0x004c
        L_0x06b0:
            r11 = 1
            if (r7 != r11) goto L_0x06aa
            int r7 = r0 + 8
            long r3 = com.google.android.recaptcha.internal.zzgk.zzp(r2, r0)
            double r3 = java.lang.Double.longBitsToDouble(r3)
            java.lang.Double r4 = java.lang.Double.valueOf(r3)
            goto L_0x06fe
        L_0x06c2:
            r11 = 1
            r3 = 5
            if (r7 != r3) goto L_0x06aa
            int r7 = r0 + 4
            int r3 = X.C165577te.A0A(r2, r0)
            float r3 = java.lang.Float.intBitsToFloat(r3)
            java.lang.Float r4 = java.lang.Float.valueOf(r3)
            goto L_0x06fe
        L_0x06d5:
            r11 = 1
            if (r7 != 0) goto L_0x06aa
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r0, r1)
            long r3 = r1.zzb
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
            goto L_0x06fe
        L_0x06e3:
            r11 = 1
            if (r7 != 0) goto L_0x06aa
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r3 = r1.zza
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            goto L_0x06fe
        L_0x06f1:
            r11 = 1
            if (r7 != r11) goto L_0x06aa
            int r7 = r0 + 8
            long r3 = com.google.android.recaptcha.internal.zzgk.zzp(r2, r0)
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
        L_0x06fe:
            r3 = r19
            r3.putObject(r12, r5, r4)
            r3 = r23
            r6 = r18
            r5 = r19
            r5.putInt(r12, r3, r6)
            goto L_0x06ab
        L_0x070d:
            r3 = 5
            if (r7 != r3) goto L_0x06a9
            int r7 = r0 + 4
            int r3 = X.C165577te.A0A(r2, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            goto L_0x072d
        L_0x071b:
            if (r7 != 0) goto L_0x06a9
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r0, r1)
            long r3 = r1.zzb
            int r11 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1P(r11)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
        L_0x072d:
            r3 = r19
            r3.putObject(r12, r5, r4)
            goto L_0x07da
        L_0x0734:
            r3 = 2
            if (r7 != r3) goto L_0x06a9
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r14 = r1.zza
            if (r14 != 0) goto L_0x0748
            r4 = r25
            r3 = r19
            r3.putObject(r12, r5, r4)
            goto L_0x07da
        L_0x0748:
            int r22 = r7 + r14
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r11 = r11 & r3
            if (r11 == 0) goto L_0x0757
            r3 = r22
            boolean r3 = com.google.android.recaptcha.internal.zzma.zzf(r2, r7, r3)
            if (r3 == 0) goto L_0x0860
        L_0x0757:
            java.nio.charset.Charset r3 = com.google.android.recaptcha.internal.zzjc.zzb
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2, r7, r14, r3)
            r3 = r19
            r3.putObject(r12, r5, r4)
            r7 = r22
            goto L_0x07da
        L_0x0766:
            r3 = 2
            if (r7 != r3) goto L_0x06a9
            r3 = r18
            java.lang.Object r3 = r9.zzB(r12, r3, r10)
            com.google.android.recaptcha.internal.zzkr r23 = r9.zzx(r10)
            r24 = r2
            r26 = r29
            r27 = r1
            r25 = r0
            r22 = r3
            int r7 = com.google.android.recaptcha.internal.zzgk.zzn(r22, r23, r24, r25, r26, r27)
            goto L_0x0803
        L_0x0783:
            r3 = 2
            if (r7 != r3) goto L_0x06a9
            int r7 = com.google.android.recaptcha.internal.zzgk.zza(r2, r0, r1)
            java.lang.Object r4 = r1.zzc
            r3 = r19
            r3.putObject(r12, r5, r4)
            goto L_0x07da
        L_0x0792:
            if (r7 != 0) goto L_0x06a9
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r4 = r1.zza
            com.google.android.recaptcha.internal.zzix r3 = r9.zzw(r10)
            if (r3 == 0) goto L_0x07c0
            boolean r3 = r3.zza(r4)
            if (r3 != 0) goto L_0x07c0
            com.google.android.recaptcha.internal.zzlm r5 = zzd(r12)
            java.lang.Long r3 = X.C36441kJ.A0y(r4)
            r5.zzj(r15, r3)
            goto L_0x0808
        L_0x07b2:
            if (r7 != 0) goto L_0x06a9
            int r7 = com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            int r4 = r1.zza
            r3 = r4 & 1
            int r4 = r4 >>> 1
            int r3 = -r3
            r4 = r4 ^ r3
        L_0x07c0:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x07d5
        L_0x07c5:
            if (r7 != 0) goto L_0x06a9
            int r7 = com.google.android.recaptcha.internal.zzgk.zzl(r2, r0, r1)
            long r3 = r1.zzb
            long r3 = X.C165577te.A0C(r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
        L_0x07d5:
            r3 = r19
            r3.putObject(r12, r5, r4)
        L_0x07da:
            r3 = r23
            r6 = r18
            r5 = r19
            r5.putInt(r12, r3, r6)
            goto L_0x0808
        L_0x07e4:
            r3 = 3
            if (r7 != r3) goto L_0x06a9
            r3 = r15 & -8
            r27 = r3 | 4
            r3 = r18
            java.lang.Object r3 = r9.zzB(r12, r3, r10)
            com.google.android.recaptcha.internal.zzkr r23 = r9.zzx(r10)
            r24 = r2
            r26 = r29
            r28 = r1
            r25 = r0
            r22 = r3
            int r7 = com.google.android.recaptcha.internal.zzgk.zzm(r22, r23, r24, r25, r26, r27, r28)
        L_0x0803:
            r4 = r18
            r9.zzK(r12, r4, r10, r3)
        L_0x0808:
            r11 = 1
            goto L_0x06ab
        L_0x080b:
            r3 = 5
            if (r7 != r3) goto L_0x0824
            int r7 = r0 + 4
            r8 = r8 | r22
            int r0 = X.C165577te.A0A(r2, r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.recaptcha.internal.zzlv.zzp(r12, r5, r0)
        L_0x081d:
            r3 = r18
            goto L_0x01af
        L_0x0821:
            r11 = 1
            goto L_0x004c
        L_0x0824:
            r11 = 1
            goto L_0x004c
        L_0x0827:
            r10 = -1
            goto L_0x0045
        L_0x082a:
            int r10 = r9.zzq(r5)
            goto L_0x0045
        L_0x0830:
            r1 = r29
            if (r35 != 0) goto L_0x0837
            if (r0 != r1) goto L_0x083e
            return r0
        L_0x0837:
            if (r0 > r1) goto L_0x083e
            r1 = r21
            if (r15 != r1) goto L_0x083e
            return r0
        L_0x083e:
            java.lang.String r0 = "Failed to parse the message."
            com.google.android.recaptcha.internal.zzje r0 = X.C165617ti.A0H(r0)
            throw r0
        L_0x0845:
            int r0 = com.google.android.recaptcha.internal.zzkn.zza
            throw r13
        L_0x0848:
            int r0 = com.google.android.recaptcha.internal.zzkn.zza
            throw r13
        L_0x084b:
            java.lang.String r0 = "Shouldn't reach here."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0852:
            com.google.android.recaptcha.internal.zzgk.zzi(r2, r0, r1)
            throw r13
        L_0x0856:
            com.google.android.recaptcha.internal.zzje r0 = X.C165607th.A0N()
            throw r0
        L_0x085b:
            com.google.android.recaptcha.internal.zzje r0 = X.C165597tg.A0K()
            throw r0
        L_0x0860:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            com.google.android.recaptcha.internal.zzje r0 = X.C165617ti.A0H(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkh.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzgj):int");
    }
}
