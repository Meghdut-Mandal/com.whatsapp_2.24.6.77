package X;

import android.net.TrafficStats;
import android.text.TextUtils;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* renamed from: X.64l  reason: invalid class name and case insensitive filesystem */
public class C1265464l {
    public final C20050ww A00;
    public final C19600wD A01;
    public final AnonymousClass54K A02;
    public final C21080yd A03;
    public final C20020wt A04;
    public final C19770wU A05;
    public final C19970wo A06;
    public final AnonymousClass1WF A07;

    public AnonymousClass6KG A00(AnonymousClass6VU r18, String str, String str2, String str3, JSONObject jSONObject, int i, int i2) {
        String str4;
        InputStream inflaterInputStream;
        AnonymousClass6VU r9 = r18;
        String str5 = str2;
        if (!this.A01.A09()) {
            return new AnonymousClass6KG(-1, 2);
        }
        TrafficStats.setThreadStatsTag(i);
        if (!str5.startsWith("https://")) {
            str5 = C36321k7.A0D("https://", str5);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        String str6 = str;
        AnonymousClass000.A1D(str5, str3, str6, A0u);
        A0u.append("?");
        A0u.append("access_token");
        A0u.append("=");
        A0u.append(AnonymousClass6JD.A0C);
        A0u.append("|");
        URL A0j = C90524aI.A0j(AnonymousClass000.A0q(AnonymousClass6JD.A0R, A0u));
        URLConnection openConnection = A0j.openConnection();
        if (openConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setSSLSocketFactory(this.A03.A00());
            httpsURLConnection.setRequestMethod("POST");
            C90464aC.A1S(httpsURLConnection);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setRequestProperty("Content-Type", "application/json");
            httpsURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            C20020wt r1 = this.A04;
            synchronized (r1) {
                str4 = r1.A01;
                if (str4 == null) {
                    str4 = C20020wt.A01(r1, (Map) null);
                    r1.A01 = str4;
                }
            }
            httpsURLConnection.setRequestProperty("User-Agent", str4);
            httpsURLConnection.getURL();
            httpsURLConnection.getRequestProperties();
            jSONObject.toString();
            C20050ww r7 = this.A00;
            Integer valueOf = Integer.valueOf(i2);
            JSONObject jSONObject2 = null;
            AnonymousClass5RL A012 = C132776Vf.A01(r7, (Integer) null, valueOf, httpsURLConnection);
            String obj = jSONObject.toString();
            if (TextUtils.isEmpty(obj)) {
                return new AnonymousClass6KG(3, 1);
            }
            A012.write(obj.getBytes(C19430v1.A0B));
            A012.flush();
            long currentTimeMillis = System.currentTimeMillis();
            httpsURLConnection.connect();
            int responseCode = httpsURLConnection.getResponseCode();
            httpsURLConnection.getResponseMessage();
            Integer valueOf2 = Integer.valueOf(responseCode);
            Long valueOf3 = Long.valueOf(C36441kJ.A0A(currentTimeMillis));
            if (!(r9 instanceof C1043959n)) {
                ((C1044059o) r9).A01.BOv(valueOf2, C36411kG.A0t(), valueOf3, (String) null, (String) null, "HttpsUrlConnection", str6);
            }
            if (responseCode / 100 == 2) {
                String contentEncoding = httpsURLConnection.getContentEncoding();
                InputStream A002 = C132776Vf.A00(r7, (Integer) null, valueOf, httpsURLConnection);
                if ("gzip".equalsIgnoreCase(contentEncoding)) {
                    inflaterInputStream = new GZIPInputStream(A002);
                } else {
                    if ("deflate".equalsIgnoreCase(contentEncoding)) {
                        inflaterInputStream = new InflaterInputStream(A002);
                    }
                    jSONObject2 = AnonymousClass14X.A01(A002);
                }
                A002 = inflaterInputStream;
                jSONObject2 = AnonymousClass14X.A01(A002);
            }
            httpsURLConnection.getHeaderFields();
            httpsURLConnection.disconnect();
            return new AnonymousClass6KG(jSONObject2, responseCode);
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("Failed to create a HTTPS connection with ");
        C36351kA.A1K(A0j, A0u2);
        throw C90524aI.A0X(A0u2.toString());
    }

    public C1265464l(C20050ww r1, C19600wD r2, C19970wo r3, AnonymousClass54K r4, AnonymousClass1WF r5, C21080yd r6, C20020wt r7, C19770wU r8) {
        this.A06 = r3;
        this.A05 = r8;
        this.A04 = r7;
        this.A00 = r1;
        this.A03 = r6;
        this.A02 = r4;
        this.A01 = r2;
        this.A07 = r5;
    }
}
