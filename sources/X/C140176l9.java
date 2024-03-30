package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DataTaskListener;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.UrlRequest;
import com.facebook.msys.mci.UrlResponse;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.6l9  reason: invalid class name and case insensitive filesystem */
public class C140176l9 implements AnonymousClass7cC {
    public int A00;
    public final DataTaskListener A01;
    public final C20050ww A02;
    public final C19770wU A03;
    public final File A04;
    public final Map A05 = Collections.synchronizedMap(AnonymousClass001.A0J());
    public final C21520zN A06;
    public final AnonymousClass13E A07;
    public final C21080yd A08;
    public final C20020wt A09;

    public static UrlResponse A00(NetworkSession networkSession, UrlRequest urlRequest, C140176l9 r14, FileInputStream fileInputStream, OutputStream outputStream, String str, boolean z, boolean z2) {
        DataOutputStream dataOutputStream;
        int read;
        UrlRequest urlRequest2 = urlRequest;
        urlRequest.getUrl();
        urlRequest.getHttpMethod();
        urlRequest.getHttpBody().toString();
        urlRequest.getHttpHeaders().toString();
        Boolean bool = C18750th.A01;
        byte[] httpBody = urlRequest.getHttpBody();
        C140176l9 r9 = r14;
        FileInputStream fileInputStream2 = fileInputStream;
        HttpsURLConnection A012 = A01(urlRequest, r14, fileInputStream, httpBody);
        try {
            NetworkSession networkSession2 = networkSession;
            String str2 = str;
            if (A012.getDoOutput()) {
                try {
                    dataOutputStream = new DataOutputStream(new AnonymousClass5RL(r14.A02, A012.getOutputStream(), (Integer) null, 29));
                    int i = 0;
                    if (fileInputStream2 != null) {
                        int available = fileInputStream2.available();
                        int min = Math.min(10240, available);
                        byte[] bArr = new byte[min];
                        do {
                            read = fileInputStream2.read(bArr, 0, min);
                            dataOutputStream.write(bArr, 0, read);
                            int available2 = fileInputStream2.available();
                            min = Math.min(10240, available2);
                            int i2 = available - available2;
                            if (z) {
                                networkSession2.executeInNetworkContext(new C98044qk(networkSession2, r9, str2, read, i2, available, 1));
                                continue;
                            }
                        } while (read > 0);
                    } else {
                        int length = httpBody.length;
                        int i3 = length;
                        while (i < i3) {
                            int min2 = Math.min(10240, length);
                            dataOutputStream.write(httpBody, i, min2);
                            length -= min2;
                            i += min2;
                            if (z) {
                                networkSession2.executeInNetworkContext(new C98024qi(networkSession2, r9, str2, httpBody, min2, i));
                            }
                        }
                    }
                    dataOutputStream.close();
                } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
                    throw new IOException("Failed to setup connection", e);
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            A02(networkSession2, r9, outputStream, str2, A012, z2);
            UrlResponse urlResponse = new UrlResponse(urlRequest2, A012.getResponseCode(), NetworkUtils.flattenHeaders((Map) A012.getHeaderFields()));
            A012.getResponseCode();
            return urlResponse;
            throw th;
        } finally {
            A012.disconnect();
        }
    }

    public static void A02(NetworkSession networkSession, C140176l9 r12, OutputStream outputStream, String str, HttpURLConnection httpURLConnection, boolean z) {
        AnonymousClass5RE A002;
        C140176l9 r5 = r12;
        try {
            A002 = AnonymousClass5RE.A00(r12.A02, httpURLConnection, 29);
            int contentLength = httpURLConnection.getContentLength();
            byte[] bArr = new byte[10240];
            int i = 0;
            while (true) {
                int read = A002.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                    i += read;
                    if (z) {
                        networkSession.executeInNetworkContext(new C98044qk(networkSession, r5, str, read, i, contentLength, 0));
                    }
                } else {
                    A002.close();
                    return;
                }
            }
        } catch (IOException unused) {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 400 && responseCode <= 500) {
                Object[] A0L = AnonymousClass001.A0L();
                C36331k8.A1W(A0L, responseCode);
                String format = String.format((Locale) null, "[HTTP status=%d] Error Content = ", A0L);
                try {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream != null) {
                        try {
                            StringBuilder A0v = AnonymousClass000.A0v(format);
                            ByteArrayOutputStream A0Q = C90524aI.A0Q();
                            byte[] bArr2 = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                            while (true) {
                                int read2 = errorStream.read(bArr2);
                                if (read2 == -1) {
                                    break;
                                }
                                A0Q.write(bArr2, 0, read2);
                            }
                            C36351kA.A1K(A0Q, A0v);
                            format = A0v.toString();
                            errorStream.close();
                        } catch (Throwable th) {
                            errorStream.close();
                            throw th;
                        }
                    }
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw C90524aI.A0X(format);
            }
            return;
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new IOException("Malformed Http Response", e);
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
        throw th;
    }

    public C140176l9(C20050ww r2, C21520zN r3, AnonymousClass13E r4, C21080yd r5, C20020wt r6, C19770wU r7, File file) {
        this.A09 = r6;
        this.A03 = r7;
        this.A02 = r2;
        this.A07 = r4;
        this.A06 = r3;
        this.A08 = r5;
        this.A04 = file;
        this.A01 = new C140156l7(this);
    }

    public static HttpsURLConnection A01(UrlRequest urlRequest, C140176l9 r7, FileInputStream fileInputStream, byte[] bArr) {
        SSLSocketFactory A022;
        int length;
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) C90504aG.A0r(urlRequest.getUrl());
        Map httpHeaders = urlRequest.getHttpHeaders();
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setRequestMethod(urlRequest.getHttpMethod());
        httpsURLConnection.setRequestProperty("User-Agent", r7.A09.A02());
        httpsURLConnection.setRequestProperty("WaMsysRequest", "1");
        if (httpHeaders.containsKey("X-Forwarded-Host")) {
            A022 = (SSLSocketFactory) SSLSocketFactory.getDefault();
        } else {
            if (httpHeaders.containsKey("Host")) {
                httpsURLConnection.setHostnameVerifier(new C1508877d(C36431kI.A1A("Host", httpHeaders), HttpsURLConnection.getDefaultHostnameVerifier()));
            }
            A022 = r7.A08.A02();
        }
        httpsURLConnection.setSSLSocketFactory(A022);
        int i = r7.A00;
        if (i > 0) {
            httpsURLConnection.setConnectTimeout(i);
            httpsURLConnection.setReadTimeout(r7.A00);
        }
        if (!(bArr == null && fileInputStream == null)) {
            httpsURLConnection.setDoOutput(true);
            if (fileInputStream != null) {
                length = fileInputStream.available();
            } else {
                C18740tg.A06(bArr);
                length = bArr.length;
            }
            httpsURLConnection.setFixedLengthStreamingMode(length);
        }
        Iterator A0y = AnonymousClass000.A0y(httpHeaders);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            httpsURLConnection.setRequestProperty(C90494aF.A0f(A11), C90514aH.A10(A11));
        }
        return httpsURLConnection;
    }
}
