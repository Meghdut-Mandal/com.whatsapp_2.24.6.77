package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C36371kC;
import android.app.Application;
import android.os.Build;
import com.facebook.msys.mci.DefaultCrypto;
import java.net.URLEncoder;
import java.nio.charset.Charset;

public final class zzal extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Application zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzbd zzc;
    public final /* synthetic */ zzbq zzd;
    public final /* synthetic */ zzab zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzal(Application application, String str, zzbd zzbd, zzbq zzbq, zzab zzab, C023509x r7) {
        super(2, r7);
        this.zza = application;
        this.zzb = str;
        this.zzc = zzbd;
        this.zzd = zzbq;
        this.zze = zzab;
    }

    public final C023509x create(Object obj, C023509x r9) {
        return new zzal(this.zza, this.zzb, this.zzc, this.zzd, this.zze, r9);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AN.A00(obj);
        zzbd zzbd = this.zzc;
        Application application = this.zza;
        String zza2 = zzaf.zza(application);
        String packageName = application.getPackageName();
        String str = zzbd.zzc;
        zzq zzq = new zzq(application);
        int i = Build.VERSION.SDK_INT;
        String A0t = C36371kC.A0t(zzq.zza, "_GRECAPTCHA_KC");
        if (A0t == null) {
            A0t = "";
        }
        String encode = URLEncoder.encode(this.zzb, DefaultCrypto.UTF_8);
        String encode2 = URLEncoder.encode(packageName, DefaultCrypto.UTF_8);
        String encode3 = URLEncoder.encode(zza2, DefaultCrypto.UTF_8);
        String encode4 = URLEncoder.encode("18.4.0", DefaultCrypto.UTF_8);
        String encode5 = URLEncoder.encode(str, DefaultCrypto.UTF_8);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("k=");
        A0u.append(encode);
        A0u.append("&pk=");
        A0u.append(encode2);
        A0u.append("&mst=");
        A0u.append(encode3);
        A0u.append("&msv=");
        A0u.append(encode4);
        A0u.append("&msi=");
        A0u.append(encode5);
        A0u.append("&mov=");
        A0u.append(i);
        byte[] bytes = AnonymousClass000.A0p("&mkc=", A0t, A0u).getBytes(Charset.forName(DefaultCrypto.UTF_8));
        zzbq zzbq = this.zzd;
        zzab zzab = this.zze;
        return zzbq.zza(zzab.zzb, bytes, this.zzc);
    }
}
