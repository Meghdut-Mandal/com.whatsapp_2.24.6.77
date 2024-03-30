package X;

import java.io.Closeable;
import java.net.HttpURLConnection;

/* renamed from: X.ATn  reason: case insensitive filesystem */
public class C21647ATn implements Closeable {
    public final HttpURLConnection A00;

    public void close() {
        this.A00.disconnect();
    }

    public C21647ATn(HttpURLConnection httpURLConnection) {
        this.A00 = httpURLConnection;
    }
}
