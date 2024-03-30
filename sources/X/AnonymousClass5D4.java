package X;

import java.net.Socket;

/* renamed from: X.5D4  reason: invalid class name */
public class AnonymousClass5D4 extends AnonymousClass5N2 {
    public final String A00;
    public final Socket A01;

    public AnonymousClass5D4(C159567jZ r1, String str, Socket socket) {
        super(r1);
        this.A01 = socket;
        this.A00 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        r5.A00.BWY();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        X.AnonymousClass14X.A02(r5.A01);
        interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        com.whatsapp.util.Log.e("fpm/SendIpThread/Failed to connect, retrying");
        java.lang.Thread.sleep((long) 1000);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r3 >= 3) goto L_0x0033;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            super.run()
            java.net.Socket r4 = r5.A01     // Catch:{ IOException | InterruptedException -> 0x0039 }
            r0 = 0
            r4.bind(r0)     // Catch:{ IOException | InterruptedException -> 0x0039 }
            java.lang.String r0 = "fpm/SendIpThread/Trying to connect to server socket"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException | InterruptedException -> 0x0039 }
            r3 = 0
        L_0x000f:
            java.lang.String r2 = r5.A00     // Catch:{ ConnectException -> 0x0023, IOException | InterruptedException -> 0x0039 }
            r0 = 8988(0x231c, float:1.2595E-41)
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch:{ ConnectException -> 0x0023, IOException | InterruptedException -> 0x0039 }
            r1.<init>(r2, r0)     // Catch:{ ConnectException -> 0x0023, IOException | InterruptedException -> 0x0039 }
            r0 = 5000(0x1388, float:7.006E-42)
            r4.connect(r1, r0)     // Catch:{ ConnectException -> 0x0023, IOException | InterruptedException -> 0x0039 }
            X.7jZ r0 = r5.A00     // Catch:{ ConnectException -> 0x0023, IOException | InterruptedException -> 0x0039 }
            r0.BiD(r2)     // Catch:{ ConnectException -> 0x0023, IOException | InterruptedException -> 0x0039 }
            goto L_0x0044
        L_0x0023:
            java.lang.String r0 = "fpm/SendIpThread/Failed to connect, retrying"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException | InterruptedException -> 0x0039 }
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0     // Catch:{ IOException | InterruptedException -> 0x0039 }
            java.lang.Thread.sleep(r0)     // Catch:{ IOException | InterruptedException -> 0x0039 }
            int r3 = r3 + 1
            r0 = 3
            if (r3 < r0) goto L_0x000f
            X.7jZ r0 = r5.A00     // Catch:{ IOException | InterruptedException -> 0x0039 }
            r0.BWY()     // Catch:{ IOException | InterruptedException -> 0x0039 }
            goto L_0x0044
        L_0x0039:
            r1 = move-exception
            java.lang.String r0 = "fpm/SendIpThread/Failure while sending IP"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x004d }
            X.7jZ r0 = r5.A00     // Catch:{ all -> 0x004d }
            r0.BWY()     // Catch:{ all -> 0x004d }
        L_0x0044:
            java.net.Socket r0 = r5.A01
            X.AnonymousClass14X.A02(r0)
            r5.interrupt()
            return
        L_0x004d:
            r1 = move-exception
            java.net.Socket r0 = r5.A01
            X.AnonymousClass14X.A02(r0)
            r5.interrupt()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5D4.run():void");
    }
}
