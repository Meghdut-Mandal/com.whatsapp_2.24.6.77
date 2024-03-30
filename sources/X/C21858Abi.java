package X;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: X.Abi  reason: case insensitive filesystem */
public class C21858Abi extends URLConnection {
    public byte[] A00;

    public void connect() {
    }

    public InputStream getInputStream() {
        return C90524aI.A0P(this.A00);
    }

    public C21858Abi(URL url, byte[] bArr) {
        super(url);
        this.A00 = bArr;
    }
}
