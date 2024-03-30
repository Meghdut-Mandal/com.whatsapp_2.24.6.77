package X;

import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.1BV  reason: invalid class name */
public class AnonymousClass1BV {
    public final AnonymousClass1BW A00;
    public final C20810yC A01;
    public final C24081Ba A02;
    public final C20020wt A03;
    public final C19600wD A04;
    public final AnonymousClass17Z A05;
    public final AnonymousClass1BU A06;
    public final C21080yd A07;

    public int A01(C1265864p r3, boolean z) {
        if (z && r3.A00 == 0) {
            this.A00.A00();
        }
        if (this.A06.A02()) {
            return 4;
        }
        return 0;
    }

    public C146096v1 A02(C1265864p r16, String str, URL url, long j, long j2, boolean z) {
        AnonymousClass7hZ r13;
        AnonymousClass5RB r6;
        boolean A012 = C20800yB.A01(C21000yV.A02, this.A01, 72);
        C1265864p r3 = r16;
        if (z && r3.A00 == 0) {
            this.A00.A00();
        }
        AnonymousClass1BU r0 = this.A06;
        boolean A022 = r0.A02();
        boolean A013 = r0.A01();
        String A023 = this.A03.A02();
        C21080yd r02 = this.A07;
        C19600wD r62 = this.A04;
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
            boolean z2 = false;
            if (A022) {
                r13 = r02.A01(false);
                if (A013) {
                    httpsURLConnection.setHostnameVerifier(new C1508877d(r3.A06, HttpsURLConnection.getDefaultHostnameVerifier()));
                }
            } else {
                r13 = r02.A02();
            }
            int BA4 = r13.BA4();
            httpsURLConnection.setSSLSocketFactory((SSLSocketFactory) r13);
            httpsURLConnection.setConnectTimeout(15000);
            httpsURLConnection.setReadTimeout(30000);
            httpsURLConnection.setRequestProperty("User-Agent", A023);
            httpsURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpsURLConnection.setRequestProperty("Host", r3.A06);
            long j3 = j;
            long j4 = j2;
            if (!(j == 0 && j2 == -1)) {
                StringBuilder sb = new StringBuilder();
                sb.append("bytes=");
                sb.append(j3);
                sb.append("-");
                String obj = sb.toString();
                if (j2 != -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obj);
                    sb2.append(j4);
                    obj = sb2.toString();
                }
                httpsURLConnection.setRequestProperty("Range", obj);
            }
            if (A012) {
                httpsURLConnection.setRequestProperty("X-FB-Socket-Option", "TCP_CONGESTION=bbr");
            }
            String str2 = str;
            if (str != null) {
                httpsURLConnection.setRequestProperty("X-FB-Request-Analytics-Tags", str2);
            }
            try {
                int responseCode = httpsURLConnection.getResponseCode();
                if (r13.BA4() == BA4) {
                    z2 = true;
                }
                AnonymousClass17Z r03 = AnonymousClass17Z.$redex_init_class;
                if (!(responseCode == 200 || responseCode == 206)) {
                    String str3 = null;
                    if (httpsURLConnection.getErrorStream() != null) {
                        try {
                            InputStream errorStream = httpsURLConnection.getErrorStream();
                            try {
                                r6 = new AnonymousClass5RB(errorStream, 1024);
                                str3 = AnonymousClass14X.A00(r6);
                                if (!"".isEmpty()) {
                                    str3 = "";
                                }
                                r6.close();
                                if (errorStream != null) {
                                    errorStream.close();
                                }
                            } catch (Throwable th) {
                                if (errorStream != null) {
                                    errorStream.close();
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            Log.e("MediaDownloadConnection/download/can't get string from error stream", e);
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("MediaDownloadConnection/download failed; url=");
                    sb3.append(AnonymousClass6H5.A01(url));
                    sb3.append(" responseCode=");
                    sb3.append(responseCode);
                    sb3.append(" responseBody=");
                    sb3.append(str3);
                    Log.w(sb3.toString());
                    if (responseCode == 416) {
                        String headerField = httpsURLConnection.getHeaderField("Content-Range");
                        if (TextUtils.isEmpty(headerField) || !headerField.contains("*/")) {
                            throw new AnonymousClass5BM(responseCode, str3);
                        }
                    } else {
                        throw new AnonymousClass5BM(responseCode, str3);
                    }
                }
                Pair pair = new Pair(httpsURLConnection, Boolean.valueOf(z2));
                return new C146096v1((Boolean) pair.second, (HttpURLConnection) pair.first);
                throw th;
            } catch (IllegalArgumentException e2) {
                throw new AnonymousClass5BN("failed with IllegalArgumentException while retrieving response", e2);
            } catch (IOException e3) {
                Log.w("MediaDownloadConnection/exception while getting response code", e3);
                if (!r62.A09()) {
                    throw new AnonymousClass5BN();
                }
                throw new AnonymousClass5BN("failed with IOException while retrieving response", e3);
            }
        } catch (IOException e4) {
            if (!r62.A09()) {
                throw new AnonymousClass5BN();
            }
            throw new AnonymousClass5BN("failed to open http url connection", e4);
        }
    }

    public AnonymousClass1BV(C19600wD r1, AnonymousClass17Z r2, AnonymousClass1BW r3, C20810yC r4, AnonymousClass1BU r5, C24081Ba r6, C21080yd r7, C20020wt r8) {
        this.A01 = r4;
        this.A03 = r8;
        this.A00 = r3;
        this.A07 = r7;
        this.A02 = r6;
        this.A06 = r5;
        this.A04 = r1;
        this.A05 = r2;
    }

    public static C146096v1 A00(AnonymousClass1BV r6, String str, String str2, URL url) {
        AnonymousClass7hZ A022;
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        AnonymousClass1BU r2 = r6.A06;
        boolean A023 = r2.A02();
        boolean z = false;
        C21080yd r0 = r6.A07;
        if (A023) {
            A022 = r0.A01(false);
            if (r2.A01()) {
                httpsURLConnection.setHostnameVerifier(new C1508877d(str, HttpsURLConnection.getDefaultHostnameVerifier()));
            }
        } else {
            A022 = r0.A02();
        }
        int BA4 = A022.BA4();
        httpsURLConnection.setSSLSocketFactory((SSLSocketFactory) A022);
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setReadTimeout(30000);
        httpsURLConnection.setRequestMethod(str2);
        httpsURLConnection.setRequestProperty("Host", str);
        httpsURLConnection.setRequestProperty("User-Agent", r6.A03.A02());
        try {
            httpsURLConnection.connect();
            if (A022.BA4() == BA4) {
                z = true;
            }
            return new C146096v1(Boolean.valueOf(z), httpsURLConnection);
        } catch (IllegalArgumentException e) {
            throw new IOException(e);
        }
    }
}
