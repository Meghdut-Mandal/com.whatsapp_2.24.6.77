package X;

import android.net.SSLSessionCache;
import java.net.InetAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.Acm  reason: case insensitive filesystem */
public class C21916Acm extends SSLSocketFactory {
    public final /* synthetic */ SSLSocketFactory A00;
    public final /* synthetic */ SSLSessionCache A01;
    public final /* synthetic */ C183238qR A02;
    public final /* synthetic */ SSLContext A03;

    public C21916Acm(SSLSessionCache sSLSessionCache, C183238qR r2, SSLContext sSLContext, SSLSocketFactory sSLSocketFactory) {
        this.A02 = r2;
        this.A00 = sSLSocketFactory;
        this.A03 = sSLContext;
        this.A01 = sSLSessionCache;
    }

    public static void A00(C21916Acm acm, String str, Socket socket, int i) {
        C183238qR r2 = acm.A02;
        r2.A02(socket);
        C200669hv.A00(acm.A01, str, acm.A03, i);
        X509Certificate[] x509CertificateArr = C183238qR.A01;
        r2.A00.incrementAndGet();
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.A00.createSocket(inetAddress, i);
        C183238qR r3 = this.A02;
        r3.A02(createSocket);
        C200669hv.A00(this.A01, inetAddress.getHostName(), this.A03, i);
        X509Certificate[] x509CertificateArr = C183238qR.A01;
        r3.A00.incrementAndGet();
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return this.A00.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.A00.getSupportedCipherSuites();
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.A00.createSocket(inetAddress, i, inetAddress2, i2);
        C183238qR r3 = this.A02;
        r3.A02(createSocket);
        C200669hv.A00(this.A01, inetAddress2.getHostName(), this.A03, i);
        X509Certificate[] x509CertificateArr = C183238qR.A01;
        r3.A00.incrementAndGet();
        return createSocket;
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.A00.createSocket(str, i, inetAddress, i2);
        A00(this, str, createSocket, i);
        return createSocket;
    }

    public Socket createSocket(String str, int i) {
        Socket createSocket = this.A00.createSocket(str, i);
        A00(this, str, createSocket, i);
        return createSocket;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.A00.createSocket(socket, str, i, z);
        A00(this, str, createSocket, i);
        return createSocket;
    }
}
