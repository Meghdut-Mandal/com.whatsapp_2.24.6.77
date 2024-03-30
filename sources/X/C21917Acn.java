package X;

import android.content.Context;
import android.net.SSLSessionCache;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.Acn  reason: case insensitive filesystem */
public abstract class C21917Acn extends SSLSocketFactory {
    public SSLSocketFactory A00;
    public final SSLSessionCache A01;
    public final C21260yv A02;
    public final SSLContext A03;
    public volatile String[] A04;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        throw X.AnonymousClass001.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        throw X.AnonymousClass001.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
        throw X.AnonymousClass001.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0072, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0073, code lost:
        com.whatsapp.util.Log.e("fpm/HashCheckingSSLSocketFactory/", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007c, code lost:
        throw X.AnonymousClass001.A0B(r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x0010, B:18:0x0032, B:26:0x004a, B:36:0x0065] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized javax.net.ssl.SSLSocketFactory A01() {
        /*
            r5 = this;
            monitor-enter(r5)
            javax.net.ssl.SSLSocketFactory r1 = r5.A00     // Catch:{ all -> 0x007f }
            if (r1 != 0) goto L_0x007d
            javax.net.ssl.SSLContext r4 = r5.A03     // Catch:{ all -> 0x007f }
            android.net.SSLSessionCache r3 = r5.A01     // Catch:{ all -> 0x007f }
            r2 = r5
            boolean r0 = r5 instanceof X.C183238qR     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x002e
            X.8qR r2 = (X.C183238qR) r2     // Catch:{ all -> 0x007f }
            javax.net.ssl.TrustManager[] r1 = X.C183238qR.A02     // Catch:{ KeyManagementException -> 0x0025 }
            r0 = 0
            r4.init(r0, r1, r0)     // Catch:{ KeyManagementException -> 0x0025 }
            if (r3 == 0) goto L_0x001b
            X.C200669hv.A01(r3, r4)     // Catch:{ KeyManagementException -> 0x0025 }
        L_0x001b:
            javax.net.ssl.SSLSocketFactory r0 = r4.getSocketFactory()     // Catch:{ KeyManagementException -> 0x0025 }
            X.Acm r1 = new X.Acm     // Catch:{ KeyManagementException -> 0x0025 }
            r1.<init>(r3, r2, r4, r0)     // Catch:{ KeyManagementException -> 0x0025 }
            goto L_0x006f
        L_0x0025:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x007f }
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)     // Catch:{ all -> 0x007f }
            throw r0     // Catch:{ all -> 0x007f }
        L_0x002e:
            boolean r0 = r5 instanceof X.C183228qQ     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x0046
            javax.net.ssl.TrustManager[] r1 = X.C183228qQ.A00     // Catch:{ KeyManagementException -> 0x003d }
            r0 = 0
            r4.init(r0, r1, r0)     // Catch:{ KeyManagementException -> 0x003d }
            javax.net.ssl.SSLSocketFactory r1 = r4.getSocketFactory()     // Catch:{ KeyManagementException -> 0x003d }
            goto L_0x006f
        L_0x003d:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x007f }
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)     // Catch:{ all -> 0x007f }
            throw r0     // Catch:{ all -> 0x007f }
        L_0x0046:
            boolean r0 = r5 instanceof X.C183248qS     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x0063
            javax.net.ssl.TrustManager[] r1 = X.C183248qS.A02     // Catch:{ KeyManagementException -> 0x005a }
            r0 = 0
            r4.init(r0, r1, r0)     // Catch:{ KeyManagementException -> 0x005a }
            if (r3 == 0) goto L_0x0055
            X.C200669hv.A01(r3, r4)     // Catch:{ KeyManagementException -> 0x005a }
        L_0x0055:
            javax.net.ssl.SSLSocketFactory r1 = r4.getSocketFactory()     // Catch:{ KeyManagementException -> 0x005a }
            goto L_0x006f
        L_0x005a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x007f }
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r0)     // Catch:{ all -> 0x007f }
            throw r0     // Catch:{ all -> 0x007f }
        L_0x0063:
            X.8qP r2 = (X.C183218qP) r2     // Catch:{ all -> 0x007f }
            javax.net.ssl.TrustManager[] r1 = r2.A01     // Catch:{ KeyManagementException -> 0x0072 }
            r0 = 0
            r4.init(r0, r1, r0)     // Catch:{ KeyManagementException -> 0x0072 }
            javax.net.ssl.SSLSocketFactory r1 = r4.getSocketFactory()     // Catch:{ KeyManagementException -> 0x0072 }
        L_0x006f:
            r5.A00 = r1     // Catch:{ all -> 0x007f }
            goto L_0x007d
        L_0x0072:
            r1 = move-exception
            java.lang.String r0 = "fpm/HashCheckingSSLSocketFactory/"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x007f }
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r1)     // Catch:{ all -> 0x007f }
            throw r0     // Catch:{ all -> 0x007f }
        L_0x007d:
            monitor-exit(r5)
            return r1
        L_0x007f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21917Acn.A01():javax.net.ssl.SSLSocketFactory");
    }

    public void A02(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            String[] strArr = this.A04;
            if (strArr == null) {
                String[] supportedProtocols = sSLSocket.getSupportedProtocols();
                ArrayList A0I = AnonymousClass001.A0I();
                if (supportedProtocols != null) {
                    for (String str : supportedProtocols) {
                        if (str != null && str.startsWith("TLS")) {
                            A0I.add(str);
                        }
                    }
                }
                strArr = C36371kC.A1b(A0I, 0);
                this.A04 = strArr;
            }
            if (strArr.length > 0) {
                sSLSocket.setEnabledProtocols(strArr);
            }
        }
    }

    public C21917Acn(Context context, C21260yv r5) {
        SSLContext A002 = C111605cY.A00();
        this.A03 = A002;
        this.A02 = r5;
        A002.getClientSessionContext().setSessionTimeout(86400);
        A002.getClientSessionContext().setSessionCacheSize(24);
        File cacheDir = context.getCacheDir();
        SSLSessionCache sSLSessionCache = null;
        if (cacheDir != null && cacheDir.exists()) {
            try {
                sSLSessionCache = new SSLSessionCache(C36441kJ.A0w(cacheDir, "SSLSessionCache"));
            } catch (IOException unused) {
            }
        }
        this.A01 = sSLSessionCache;
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = A01().createSocket(inetAddress, i);
        A02(createSocket);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(inetAddress.getHostName(), createSocket);
        }
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return A01().getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return A01().getSupportedCipherSuites();
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = A01().createSocket(inetAddress, i, inetAddress2, i2);
        A02(createSocket);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(inetAddress.getHostName(), createSocket);
        }
        return createSocket;
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = A01().createSocket(str, i, inetAddress, i2);
        A02(createSocket);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(str, createSocket);
        }
        return createSocket;
    }

    public Socket createSocket(String str, int i) {
        Socket createSocket = A01().createSocket(str, i);
        A02(createSocket);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(str, createSocket);
        }
        return createSocket;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = A01().createSocket(socket, str, i, z);
        A02(createSocket);
        if (createSocket instanceof SSLSocket) {
            this.A02.A00(str, createSocket);
        }
        return createSocket;
    }

    public Socket createSocket() {
        Socket createSocket = A01().createSocket();
        A02(createSocket);
        return createSocket;
    }
}
