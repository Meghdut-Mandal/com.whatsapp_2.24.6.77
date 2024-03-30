package X;

import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;

/* renamed from: X.71n  reason: invalid class name and case insensitive filesystem */
public final class C1495171n implements Closeable {
    public Task A00;
    public final URL A01;
    public volatile InputStream A02;

    public final void close() {
        InputStream inputStream = this.A02;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    AnonymousClass6IH.A00.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e);
                } catch (IOException e2) {
                    throw C90524aI.A0Y(e2);
                }
            }
        }
    }

    public C1495171n(URL url) {
        this.A01 = url;
    }
}
