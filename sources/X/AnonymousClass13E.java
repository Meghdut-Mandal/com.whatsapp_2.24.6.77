package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.13E  reason: invalid class name */
public class AnonymousClass13E {
    public final C20050ww A00;
    public final C20020wt A01;

    public C146096v1 A01(C21080yd r2, String str) {
        return A02(r2, str, (String) null);
    }

    public C146096v1 A03(Integer num, String str, String str2, String str3, Map map, boolean z, boolean z2) {
        String str4 = str3;
        if (str3 == null) {
            C20020wt r1 = this.A01;
            synchronized (r1) {
                str4 = r1.A01;
                if (str4 == null) {
                    str4 = C20020wt.A01(r1, (Map) null);
                    r1.A01 = str4;
                }
            }
        }
        return A00(this, num, str, str2, str4, map, z, z2, false);
    }

    public C146096v1 A05(String str) {
        return A00(this, 5, str, (String) null, (String) null, (Map) null, false, false, false);
    }

    public static C146096v1 A00(AnonymousClass13E r5, Integer num, String str, String str2, String str3, Map map, boolean z, boolean z2, boolean z3) {
        GZIPOutputStream gZIPOutputStream;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(30000);
        if (str3 == null) {
            str3 = r5.A01.A02();
        }
        httpURLConnection.setRequestProperty("User-Agent", str3);
        if (z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        }
        if (str2 != null) {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            if (z2) {
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
        } else if (z3) {
            httpURLConnection.setRequestMethod("DELETE");
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (str2 != null) {
            AnonymousClass5RL r4 = new AnonymousClass5RL(r5.A00, httpURLConnection.getOutputStream(), (Integer) null, num);
            if (z2) {
                try {
                    gZIPOutputStream = new GZIPOutputStream(r4);
                    gZIPOutputStream.write(str2.getBytes(C19430v1.A0B));
                    gZIPOutputStream.close();
                } catch (Throwable th) {
                    try {
                        r4.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                r4.write(str2.getBytes(C19430v1.A0B));
            }
            r4.close();
        }
        httpURLConnection.connect();
        return new C146096v1((Boolean) null, httpURLConnection);
        throw th;
    }

    public C146096v1 A02(C21080yd r5, String str, String str2) {
        try {
            try {
                URLConnection openConnection = new URL(Uri.parse(str).toString()).openConnection();
                if (openConnection instanceof HttpsURLConnection) {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setSSLSocketFactory(r5.A02());
                    httpsURLConnection.setConnectTimeout(15000);
                    httpsURLConnection.setReadTimeout(30000);
                    if (str2 != null) {
                        httpsURLConnection.addRequestProperty("If-None-Match", str2);
                    }
                    httpsURLConnection.setRequestProperty("User-Agent", this.A01.A02());
                    return new C146096v1((Boolean) null, httpsURLConnection);
                }
                throw new IOException("WaHttpUrlConnectionClient/createDownloadableFilesConnection/failed to open http url connection");
            } catch (IOException e) {
                throw new IOException("WaHttpUrlConnectionClient/createDownloadableFilesConnection/failed to open http url connection", e);
            }
        } catch (MalformedURLException e2) {
            Log.e("WaHttpUrlConnectionClient/createDownloadableFilesConnection/malformed-url : ", e2);
            throw e2;
        }
    }

    public C146096v1 A04(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.connect();
        return new C146096v1((Boolean) null, httpURLConnection);
    }

    public AnonymousClass13E(C20050ww r1, C20020wt r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public AnonymousClass13E() {
    }
}
