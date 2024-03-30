package X;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* renamed from: X.Abj  reason: case insensitive filesystem */
public class C21859Abj extends URLStreamHandler {
    public byte[] A00;

    public URLConnection openConnection(URL url) {
        return new C21858Abi(url, this.A00);
    }

    public C21859Abj(byte[] bArr) {
        this.A00 = bArr;
    }
}
