package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.1KV  reason: invalid class name */
public final class AnonymousClass1KV {
    public C1496071z A00;
    public final C19630wG A01;
    public final AnonymousClass1KW A02;

    public AnonymousClass1KV(C19630wG r2, AnonymousClass1KW r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A01 = r2;
        this.A02 = r3;
    }

    public static final C1496071z A00(AnonymousClass1KV r4) {
        C1496071z r0;
        synchronized (r4) {
            r0 = r4.A00;
            if (r0 == null) {
                try {
                    r0 = C1496071z.A01((C117715mi) null, new File(r4.A01.A00.getCacheDir(), "FLOWS_ENTRYPOINT_METADATA_CACHE"), 1048576);
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("FlowsLogger/FlowsEntrypointMetadataCache/init: ");
                    sb.append(e.getMessage());
                    Log.e(sb.toString());
                    r0 = null;
                }
                r4.A00 = r0;
            }
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6BP A01(java.lang.String r6) {
        /*
            r5 = this;
            X.71z r0 = A00(r5)
            if (r0 == 0) goto L_0x0079
            X.71l r0 = r0.A0B(r6)
            if (r0 == 0) goto L_0x0079
            r1 = 0
            java.io.InputStream[] r0 = r0.A00
            r4 = r0[r1]
            int r0 = r4.available()     // Catch:{ all -> 0x0072 }
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0072 }
            r4.read(r1)     // Catch:{ all -> 0x0072 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0072 }
            r0.<init>(r1)     // Catch:{ all -> 0x0072 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0072 }
            r2.<init>(r0)     // Catch:{ all -> 0x0072 }
            java.lang.Object r3 = r2.readObject()     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>"
            X.AnonymousClass00C.A0E(r3, r0)     // Catch:{ all -> 0x006b }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x006b }
            r2.close()     // Catch:{ all -> 0x0072 }
            r4.close()
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            java.lang.String r0 = "FLOW_ENTRY_POINT"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 0
            if (r0 == 0) goto L_0x006a
            java.lang.Integer r0 = X.AnonymousClass097.A03(r0)
            if (r0 == 0) goto L_0x006a
            int r1 = r0.intValue()
            java.lang.String r0 = "CLICK_SEQUENCE_NUMBER"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x005c
            java.lang.Integer r2 = X.AnonymousClass097.A03(r0)
        L_0x005c:
            java.lang.String r0 = "AD_CONTEXT"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.6BP r3 = new X.6BP
            r3.<init>(r2, r0, r1)
            return r3
        L_0x006a:
            return r2
        L_0x006b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0072 }
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        L_0x0079:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KV.A01(java.lang.String):X.6BP");
    }
}
