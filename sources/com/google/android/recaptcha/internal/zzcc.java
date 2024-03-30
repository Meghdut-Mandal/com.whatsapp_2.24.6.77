package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C006302t;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C36441kJ;
import X.C90474aD;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.ArrayList;

public final class zzcc extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String[] zza;
    public final /* synthetic */ zzcd zzb;
    public final /* synthetic */ String zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcc(String[] strArr, zzcd zzcd, String str, C023509x r5) {
        super(2, r5);
        this.zza = strArr;
        this.zzb = zzcd;
        this.zzc = str;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new zzcc(this.zza, this.zzb, this.zzc, r6);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcc) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AN.A00(obj);
        ArrayList A14 = C36441kJ.A14(r4);
        for (String A0p : this.zza) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("\"");
            A14.add(AnonymousClass000.A0p(A0p, "\"", A0u));
        }
        zzcd zzcd = this.zzb;
        String str = this.zzc;
        WebView webView = zzcd.zza;
        String A0Q = C007103b.A0Q(",", "", "", A14, (C006302t) null);
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append("(");
        A0v.append(A0Q);
        webView.evaluateJavascript(C90474aD.A0f(A0v), (ValueCallback) null);
        return AnonymousClass0AJ.A00;
    }
}
