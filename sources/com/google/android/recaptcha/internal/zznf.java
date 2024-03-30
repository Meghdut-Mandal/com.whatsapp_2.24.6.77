package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C165617ti;

public final class zznf extends zzit implements zzkf {
    public static final zznf zzb;
    public int zzd;
    public int zze = 0;
    public Object zzf;
    public int zzg;
    public String zzh = "";
    public String zzi = "";
    public String zzj = "";
    public String zzk = "";
    public long zzl;
    public zzib zzm;
    public int zzn;
    public zzmr zzo;
    public zznr zzp;
    public String zzq = "";
    public zzlj zzr;
    public zzib zzs;

    public static zznf zzH() {
        return zzb;
    }

    public static /* synthetic */ void zzN(zznf zznf, zzmr zzmr) {
        zznf.zzo = zzmr;
        zznf.zzd |= 2;
    }

    public final String zzJ() {
        return this.zzi;
    }

    public final String zzK() {
        return this.zzj;
    }

    public final int zzU() {
        int i = this.zzn;
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 1 : 4;
        }
        return 3;
    }

    @Deprecated
    public final long zzf() {
        return this.zzl;
    }

    static {
        zznf zznf = new zznf();
        zzb = zznf;
        zzit.zzD(zznf.class, zznf);
    }

    public static zznf zzI(byte[] bArr) {
        return (zznf) zzit.zzu(zzb, bArr);
    }

    public static zznc zzi() {
        return (zznc) zzb.zzp();
    }

    public final boolean zzT() {
        return AnonymousClass000.A1P(this.zzd & 2);
    }

    public final zzmr zzg() {
        zzmr zzmr = this.zzo;
        if (zzmr == null) {
            return zzmr.zzb;
        }
        return zzmr;
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C165617ti.A0I(zzb, "\u0000\u000e\u0001\u0001\u0001\u000f\u000e\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzi", "zzl", "zzn", "zzo", "zzp", "zzq", "zzj", "zzk", "zzm", "zzr", "zzs", "zzh", zzml.class});
        } else if (i2 == 3) {
            return new zznf();
        } else {
            if (i2 == 4) {
                return new zznc((zznb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzne zzj() {
        switch (this.zzg) {
            case 0:
                return zzne.UNKNOWN;
            case 1:
                return zzne.INIT_NATIVE;
            case 2:
                return zzne.INIT_NETWORK;
            case 3:
                return zzne.INIT_JS;
            case 4:
                return zzne.INIT_TOTAL;
            case 5:
                return zzne.EXECUTE_NATIVE;
            case 6:
                return zzne.EXECUTE_JS;
            case 7:
                return zzne.EXECUTE_TOTAL;
            case 8:
                return zzne.CHALLENGE_ACCOUNT_NATIVE;
            case 9:
                return zzne.CHALLENGE_ACCOUNT_JS;
            case 10:
                return zzne.CHALLENGE_ACCOUNT_TOTAL;
            case 11:
                return zzne.VERIFY_PIN_NATIVE;
            case 12:
                return zzne.VERIFY_PIN_JS;
            case 13:
                return zzne.VERIFY_PIN_TOTAL;
            case 14:
                return zzne.RUN_PROGRAM;
            case 15:
                return zzne.FETCH_ALLOWLIST;
            case 16:
                return zzne.JS_LOAD;
            case 17:
                return zzne.WEB_VIEW_RELOAD_JS;
            case 18:
                return zzne.INIT_NETWORK_MRI_ACTION;
            case 19:
                return zzne.INIT_DOWNLOAD_JS;
            case 20:
                return zzne.VALIDATE_INPUT;
            case 21:
                return zzne.DOWNLOAD_JS;
            case 22:
                return zzne.SAVE_CACHE_JS;
            case 23:
                return zzne.LOAD_CACHE_JS;
            case 24:
                return zzne.LOAD_WEBVIEW;
            case 25:
                return zzne.COLLECT_SIGNALS;
            case 26:
                return zzne.FETCH_TOKEN;
            case 27:
                return zzne.POST_EXECUTE;
            default:
                return zzne.UNRECOGNIZED;
        }
    }

    public static /* synthetic */ void zzL(zznf zznf, String str) {
        str.getClass();
        zznf.zzj = str;
    }

    public static /* synthetic */ void zzO(zznf zznf, zznr zznr) {
        zznr.getClass();
        zznf.zzp = zznr;
        zznf.zzd |= 4;
    }

    public static /* synthetic */ void zzR(zznf zznf, String str) {
        str.getClass();
        zznf.zzh = str;
    }

    public static /* synthetic */ void zzS(zznf zznf, String str) {
        str.getClass();
        zznf.zzi = str;
    }
}
