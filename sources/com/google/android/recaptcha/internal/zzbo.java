package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.C36381kD;
import X.C90504aG;
import android.net.TrafficStats;
import android.webkit.URLUtil;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public final class zzbo implements zzbn {
    public final String zza;

    public zzbo(String str) {
        this.zza = str;
    }

    public final boolean zza(byte[] bArr) {
        HttpURLConnection httpURLConnection;
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            zzb(bArr);
            if (URLUtil.isHttpUrl(this.zza)) {
                URLConnection A0r = C90504aG.A0r(this.zza);
                AnonymousClass00C.A0E(A0r, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection = (HttpURLConnection) A0r;
            } else if (URLUtil.isHttpsUrl(this.zza)) {
                URLConnection A0r2 = C90504aG.A0r(this.zza);
                AnonymousClass00C.A0E(A0r2, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                httpURLConnection = (HttpsURLConnection) A0r2;
            } else {
                throw new MalformedURLException("Recaptcha server url only allows using Http or Https.");
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
            httpURLConnection.connect();
            httpURLConnection.getOutputStream().write(bArr);
            return httpURLConnection.getResponseCode() == 200;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public static final void zzb(byte[] bArr) {
        for (zznf zznf : zzni.zzk(bArr).zzd) {
            if (!C36381kD.A13("INIT_TOTAL", "EXECUTE_TOTAL").contains(zznf.zzj().name()) || AnonymousClass000.A1P(zznf.zzd & 2)) {
            }
        }
    }
}
