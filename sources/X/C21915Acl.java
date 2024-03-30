package X;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.Acl  reason: case insensitive filesystem */
public class C21915Acl extends SSLSocketFactory {
    public final int A00 = 3;
    public final int A01 = 3;
    public final C20050ww A02;
    public final SSLSocketFactory A03 = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    public C21915Acl(C20050ww r3) {
        this.A02 = r3;
    }

    public static C21913Acj A00(C21915Acl acl, Object obj) {
        int i = acl.A00;
        return new C21913Acj(acl.A02, (SSLSocket) obj, i, acl.A01);
    }

    public Socket createSocket(String str, int i) {
        return A00(this, this.A03.createSocket(str, i));
    }

    public String[] getDefaultCipherSuites() {
        return this.A03.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.A03.getSupportedCipherSuites();
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return A00(this, this.A03.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return A00(this, this.A03.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        return A00(this, this.A03.createSocket(inetAddress, i));
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return A00(this, this.A03.createSocket(socket, str, i, z));
    }
}
