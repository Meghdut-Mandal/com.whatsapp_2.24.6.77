package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import org.json.JSONObject;

/* renamed from: X.14X  reason: invalid class name */
public abstract class AnonymousClass14X {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005b, code lost:
        r4.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(java.io.InputStream r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x005e
            r0 = 8192(0x2000, float:1.14794E-41)
            char[] r5 = new char[r0]
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            r4.<init>(r6)
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0051 }
            r3.<init>(r4)     // Catch:{ all -> 0x0051 }
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ all -> 0x0047 }
            r2.<init>()     // Catch:{ all -> 0x0047 }
        L_0x0016:
            int r1 = r3.read(r5)     // Catch:{ all -> 0x003d }
            if (r1 >= 0) goto L_0x0021
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x003d }
            goto L_0x0030
        L_0x0021:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003d }
            boolean r0 = r0.isInterrupted()     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x0037
            r0 = 0
            r2.write(r5, r0, r1)     // Catch:{ all -> 0x003d }
            goto L_0x0016
        L_0x0030:
            r2.close()     // Catch:{ all -> 0x0047 }
            r3.close()     // Catch:{ all -> 0x0051 }
            goto L_0x005b
        L_0x0037:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x003d }
            r0.<init>()     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0047 }
        L_0x0046:
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x004c }
            goto L_0x0050
        L_0x004c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0051 }
        L_0x0050:
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0056 }
            throw r1
        L_0x0056:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x005b:
            r4.close()
        L_0x005e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass14X.A00(java.io.InputStream):java.lang.String");
    }

    public static void A02(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                Log.e(th);
            }
        }
    }

    public static void A03(InputStream inputStream, long j) {
        while (j > 0) {
            long skip = inputStream.skip(j);
            if (skip > 0) {
                j -= skip;
            } else if (inputStream.read() != -1) {
                j--;
            } else {
                return;
            }
        }
    }

    public static byte[] A04(InputStream inputStream) {
        byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, DefaultCrypto.BUFFER_SIZE);
                if (read < 0) {
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public static JSONObject A01(InputStream inputStream) {
        String A00 = A00(inputStream);
        if (A00 != null) {
            return new JSONObject(A00);
        }
        return null;
    }
}
