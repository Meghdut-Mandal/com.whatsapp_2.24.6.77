package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.7uw  reason: invalid class name and case insensitive filesystem */
public class C166047uw extends Handler {
    public final /* synthetic */ C209059zO A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166047uw(Looper looper, C209059zO r2) {
        super(looper);
        this.A00 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.Exception} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r10) {
        /*
            r9 = this;
            int r1 = r10.what     // Catch:{ Exception -> 0x00da }
            if (r1 == 0) goto L_0x0010
            r0 = 1
            if (r1 != r0) goto L_0x0009
            goto L_0x00aa
        L_0x0009:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x00da }
            r2.<init>()     // Catch:{ Exception -> 0x00da }
            goto L_0x00d9
        L_0x0010:
            X.9zO r0 = r9.A00     // Catch:{ Exception -> 0x00da }
            X.9MN r5 = r0.A08     // Catch:{ Exception -> 0x00da }
            java.lang.Object r1 = r10.obj     // Catch:{ Exception -> 0x00da }
            X.9GE r1 = (X.AnonymousClass9GE) r1     // Catch:{ Exception -> 0x00da }
            boolean r4 = r5.A03     // Catch:{ Exception -> 0x00da }
            r8 = 1
            r7 = 0
            java.lang.String r6 = "DrmSessionManagerHelper"
            r2 = 0
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x00da }
            java.lang.String r0 = r1.A00     // Catch:{ Exception -> 0x00da }
            r3.append(r0)     // Catch:{ Exception -> 0x00da }
            java.lang.String r0 = "&signedRequest="
            r3.append(r0)     // Catch:{ Exception -> 0x00da }
            byte[] r1 = r1.A01     // Catch:{ Exception -> 0x00da }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x00da }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00da }
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r3)     // Catch:{ Exception -> 0x00da }
            if (r4 == 0) goto L_0x0059
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00da }
            r0.getQuery()     // Catch:{ Exception -> 0x00da }
            boolean r0 = r5.A02     // Catch:{ Exception -> 0x00da }
            java.lang.String r1 = "Failed to get provision data"
            if (r0 != 0) goto L_0x0052
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00da }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ Exception -> 0x00da }
            android.util.Log.e(r6, r0)     // Catch:{ Exception -> 0x00da }
            goto L_0x00fc
        L_0x0052:
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ Exception -> 0x00da }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00da }
            goto L_0x00d9
        L_0x0059:
            java.util.Set r0 = X.C200589hg.A00     // Catch:{ Exception -> 0x00da }
            java.net.URLConnection r5 = X.C90504aG.A0r(r1)     // Catch:{ all -> 0x00a8 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "POST"
            r5.setRequestMethod(r0)     // Catch:{ all -> 0x00a1 }
            r5.setDoOutput(r7)     // Catch:{ all -> 0x00a1 }
            r5.setDoInput(r8)     // Catch:{ all -> 0x00a1 }
            java.io.InputStream r4 = r5.getInputStream()     // Catch:{ all -> 0x00a1 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r0]     // Catch:{ all -> 0x009c }
            java.io.ByteArrayOutputStream r2 = X.C90524aI.A0Q()     // Catch:{ all -> 0x009c }
        L_0x0078:
            int r1 = r4.read(r3)     // Catch:{ all -> 0x009c }
            r0 = -1
            if (r1 == r0) goto L_0x0083
            r2.write(r3, r7, r1)     // Catch:{ all -> 0x009c }
            goto L_0x0078
        L_0x0083:
            byte[] r2 = r2.toByteArray()     // Catch:{ all -> 0x009c }
            r4.close()     // Catch:{ all -> 0x00a1 }
            r5.disconnect()     // Catch:{ Exception -> 0x00da }
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x00da }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x00da }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00da }
            r1[r7] = r0     // Catch:{ Exception -> 0x00da }
            java.lang.String r0 = "Provisioning data from http is %s"
            X.C131916Rh.A01(r6, r0, r1)     // Catch:{ Exception -> 0x00da }
            goto L_0x00fc
        L_0x009c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00a1 }
            throw r0     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r2 = move-exception
            if (r5 == 0) goto L_0x00d9
            r5.disconnect()     // Catch:{ Exception -> 0x00da }
            goto L_0x00d9
        L_0x00a8:
            r2 = move-exception
            goto L_0x00d9
        L_0x00aa:
            X.9zO r0 = r9.A00     // Catch:{ Exception -> 0x00da }
            X.9MN r3 = r0.A08     // Catch:{ Exception -> 0x00da }
            java.lang.Object r0 = r10.obj     // Catch:{ Exception -> 0x00da }
            X.9GD r0 = (X.AnonymousClass9GD) r0     // Catch:{ Exception -> 0x00da }
            byte[] r1 = r0.A01     // Catch:{ Exception -> 0x00da }
            r0 = 0
            android.util.Base64.encodeToString(r1, r0)     // Catch:{ Exception -> 0x00da }
            java.lang.String r2 = r3.A01     // Catch:{ Exception -> 0x00da }
            boolean r0 = r3.A04     // Catch:{ Exception -> 0x00da }
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = "GIF:"
            boolean r0 = r2.startsWith(r0)     // Catch:{ Exception -> 0x00da }
            if (r0 == 0) goto L_0x00ca
            r0 = 4
            r2.substring(r0)     // Catch:{ Exception -> 0x00da }
        L_0x00ca:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x00da }
            java.lang.String r0 = "Failed to get license for video "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)     // Catch:{ Exception -> 0x00da }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ Exception -> 0x00da }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00da }
        L_0x00d9:
            throw r2     // Catch:{ Exception -> 0x00da }
        L_0x00da:
            r2 = move-exception
            int r1 = r10.arg1
            r0 = 1
            if (r1 != r0) goto L_0x00fc
            int r0 = r10.arg2
            int r1 = r0 + 1
            r0 = 3
            if (r1 > r0) goto L_0x00fc
            android.os.Message r2 = android.os.Message.obtain(r10)
            r2.arg2 = r1
            int r0 = r1 + -1
            int r1 = r0 * 1000
            r0 = 5000(0x1388, float:7.006E-42)
            int r0 = java.lang.Math.min(r1, r0)
            long r0 = (long) r0
            r9.sendMessageDelayed(r2, r0)
            return
        L_0x00fc:
            X.9zO r0 = r9.A00
            X.7ux r1 = r0.A09
            int r0 = r10.what
            X.C165577te.A0w(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166047uw.handleMessage(android.os.Message):void");
    }
}
