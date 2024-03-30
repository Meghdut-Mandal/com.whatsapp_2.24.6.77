package com.google.android.recaptcha.internal;

import X.AnonymousClass00C;
import X.C165607th;
import X.C165617ti;
import X.C36371kC;
import X.C90524aI;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.concurrent.TimeUnit;

public final class zzeu extends WebViewClient {
    public final /* synthetic */ zzez zza;

    public zzeu(zzez zzez) {
        this.zza = zzez;
    }

    public final void onPageFinished(WebView webView, String str) {
        zzez zzez = this.zza;
        zzez.zzi.zza(zzez.zzp.zza(zzne.INIT_NETWORK));
        zzv.zza(zzx.zzl.zzn, this.zza.zzn.zza(TimeUnit.MICROSECONDS));
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        zzo zzo = zzp.zza;
        zzn zzn = zzn.zze;
        zzl zzl = (zzl) C36371kC.A0r(this.zza.zzk, i);
        if (zzl == null) {
            zzl = zzl.zzY;
        }
        zzp A0K = C165617ti.A0K(zzl, zzn, (String) null);
        C165607th.A13(this.zza).hashCode();
        A0K.getMessage();
        C165607th.A13(this.zza).B3F(A0K);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        zzfb zzfb = zzfb.zza;
        AnonymousClass00C.A0B(parse);
        if (!zzfb.zzd(parse) || zzfb.zza(parse)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzp A0K = C165617ti.A0K(zzl.zzac, zzn.zzc, (String) null);
        C165607th.A13(this.zza).hashCode();
        parse.toString();
        C165607th.A13(this.zza).B3F(A0K);
        return new WebResourceResponse("text/plain", DefaultCrypto.UTF_8, C90524aI.A0P(new byte[0]));
    }

    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }
}
