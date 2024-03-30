package com.google.android.recaptcha.internal;

import X.AnonymousClass040;
import X.C023509x;
import X.C36331k8;
import android.webkit.WebView;
import java.util.Arrays;

public final class zzcd {
    public final WebView zza;
    public final AnonymousClass040 zzb;

    public zzcd(WebView webView, AnonymousClass040 r2) {
        this.zza = webView;
        this.zzb = r2;
    }

    public final void zzb(String str, String... strArr) {
        C36331k8.A1T(new zzcc((String[]) Arrays.copyOf(strArr, strArr.length), this, str, (C023509x) null), this.zzb);
    }
}
