package X;

import android.os.StrictMode;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Random;

/* renamed from: X.78g  reason: invalid class name and case insensitive filesystem */
public class C1511078g extends ThreadLocal {
    public /* bridge */ /* synthetic */ Object initialValue() {
        FileInputStream fileInputStream;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileInputStream = new FileInputStream("/dev/urandom");
            ByteBuffer allocate = ByteBuffer.allocate(8);
            fileInputStream.read(allocate.array());
            Random random = new Random(allocate.getLong());
            fileInputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return random;
        } catch (IOException e) {
            try {
                throw C90524aI.A0e("Cannot read from /dev/urandom", e);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th;
            }
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
