package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import android.webkit.ValueCallback;
import android.webkit.WebView;

public final class zzes extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ zzez zza;
    public final /* synthetic */ String zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzes(zzez zzez, String str, C023509x r4) {
        super(2, r4);
        this.zza = zzez;
        this.zzb = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new zzes(this.zza, this.zzb, r5);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzes) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AN.A00(obj);
        WebView webView = this.zza.zzd;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("recaptcha.m.Main.execute(\"");
        A0u.append(this.zzb);
        webView.evaluateJavascript(AnonymousClass000.A0q("\")", A0u), (ValueCallback) null);
        return AnonymousClass0AJ.A00;
    }
}
