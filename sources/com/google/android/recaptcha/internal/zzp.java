package com.google.android.recaptcha.internal;

import X.AnonymousClass00C;
import X.AnonymousClass011;
import X.C000400e;
import X.C05250Oz;
import X.C165587tf;
import X.C165617ti;
import X.C36341k9;
import X.C36441kJ;
import X.C90464aC;
import X.C90474aD;
import X.C90484aE;
import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;

public final class zzp extends Exception {
    public static final zzo zza = new zzo((C05250Oz) null);
    public static final Map zzb;
    public final zzn zzc;
    public final zzl zzd;
    public final String zze;
    public final Map zzf;

    static {
        AnonymousClass011[] r3 = new AnonymousClass011[7];
        C90464aC.A1E(zzpb.JS_NETWORK_ERROR, C165617ti.A0K(zzl.zzm, zzn.zze, (String) null), r3);
        C90464aC.A1F(zzpb.JS_INTERNAL_ERROR, C165617ti.A0K(zzl.zzk, zzn.zzc, (String) null), r3);
        C90474aD.A1F(zzpb.JS_INVALID_SITE_KEY, C165617ti.A0K(zzl.zzn, zzn.zzf, (String) null), r3);
        C90474aD.A1G(zzpb.JS_INVALID_SITE_KEY_TYPE, C165617ti.A0K(zzl.zzo, zzn.zzg, (String) null), r3);
        C90484aE.A1H(zzpb.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, C165617ti.A0K(zzl.zzp, zzn.zzh, (String) null), r3);
        r3[5] = C36441kJ.A19(zzpb.JS_INVALID_ACTION, C165617ti.A0K(zzl.zzq, zzn.zzi, (String) null));
        r3[6] = C36441kJ.A19(zzpb.JS_PROGRAM_ERROR, C165617ti.A0K(zzl.zzu, zzn.zzc, (String) null));
        zzb = C000400e.A07(r3);
    }

    public final zzl zza() {
        return this.zzd;
    }

    public final zzn zzb() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zze;
    }

    public final RecaptchaException zzc() {
        if (AnonymousClass00C.A0J(this.zzd, zzl.zzT)) {
            return C165587tf.A0F(RecaptchaErrorCode.INVALID_TIMEOUT);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        if (recaptchaException == null) {
            return C165587tf.A0F(RecaptchaErrorCode.INTERNAL_ERROR);
        }
        return recaptchaException;
    }

    public zzp(zzn zzn, zzl zzl, String str) {
        this.zzc = zzn;
        this.zzd = zzl;
        this.zze = str;
        AnonymousClass011[] r2 = new AnonymousClass011[7];
        zzn zzn2 = zzn.zze;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        C90464aC.A1E(zzn2, C165587tf.A0F(recaptchaErrorCode), r2);
        C90464aC.A1F(zzn.zzk, C165587tf.A0F(recaptchaErrorCode), r2);
        C36341k9.A1J(zzn.zzf, C165587tf.A0F(RecaptchaErrorCode.INVALID_SITEKEY), r2, 2);
        C90474aD.A1G(zzn.zzg, C165587tf.A0F(RecaptchaErrorCode.INVALID_KEYTYPE), r2);
        C90484aE.A1H(zzn.zzh, C165587tf.A0F(RecaptchaErrorCode.INVALID_PACKAGE_NAME), r2);
        r2[5] = C36441kJ.A19(zzn.zzi, C165587tf.A0F(RecaptchaErrorCode.INVALID_ACTION));
        r2[6] = C36441kJ.A19(zzn.zzc, C165587tf.A0F(RecaptchaErrorCode.INTERNAL_ERROR));
        this.zzf = C000400e.A07(r2);
    }
}
