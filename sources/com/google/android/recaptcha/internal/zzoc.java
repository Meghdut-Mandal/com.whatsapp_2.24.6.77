package com.google.android.recaptcha.internal;

import X.C165567td;
import X.C165577te;
import X.C165617ti;

public final class zzoc extends zzit implements zzkf {
    public static final zzoc zzb;
    public int zzd;
    public String zze = "";
    public String zzf = "";
    public String zzg = "";
    public String zzh = "";
    public String zzi = "";
    public String zzj = "";
    public String zzk = "";
    public String zzl = "";

    public final String zzH() {
        return this.zzf;
    }

    public final String zzI() {
        return this.zzh;
    }

    public final String zzJ() {
        return this.zzk;
    }

    public final String zzK() {
        return this.zzj;
    }

    public final String zzi() {
        return this.zzi;
    }

    public final String zzj() {
        return this.zzl;
    }

    public final String zzk() {
        return this.zzg;
    }

    static {
        zzoc zzoc = new zzoc();
        zzb = zzoc;
        zzit.zzD(zzoc.class, zzoc);
    }

    public static zzob zzf() {
        return (zzob) zzb.zzp();
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            Object[] objArr = new Object[9];
            C165567td.A1W(objArr);
            C165577te.A1U(objArr);
            objArr[7] = "zzk";
            objArr[8] = "zzl";
            return C165617ti.A0I(zzb, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007", objArr);
        } else if (i2 == 3) {
            return new zzoc();
        } else {
            if (i2 == 4) {
                return new zzob((zzoa) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public static /* synthetic */ void zzL(zzoc zzoc, String str) {
        str.getClass();
        zzoc.zzd |= 8;
        zzoc.zzh = str;
    }

    public static /* synthetic */ void zzM(zzoc zzoc, String str) {
        str.getClass();
        zzoc.zzd |= 16;
        zzoc.zzi = str;
    }

    public static /* synthetic */ void zzN(zzoc zzoc, String str) {
        str.getClass();
        zzoc.zzd |= 32;
        zzoc.zzj = str;
    }

    public static /* synthetic */ void zzO(zzoc zzoc, String str) {
        str.getClass();
        zzoc.zzd |= 64;
        zzoc.zzk = str;
    }

    public static /* synthetic */ void zzP(zzoc zzoc, String str) {
        str.getClass();
        zzoc.zzd |= 128;
        zzoc.zzl = str;
    }

    public static /* synthetic */ void zzQ(zzoc zzoc, String str) {
        str.getClass();
        zzoc.zzd |= 2;
        zzoc.zzf = str;
    }

    public static /* synthetic */ void zzR(zzoc zzoc, String str) {
        str.getClass();
        zzoc.zzd |= 4;
        zzoc.zzg = str;
    }
}
