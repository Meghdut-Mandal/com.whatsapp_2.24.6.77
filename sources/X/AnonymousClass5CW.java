package X;

import android.content.Context;

/* renamed from: X.5CW  reason: invalid class name */
public abstract class AnonymousClass5CW extends C104945Cb {
    public final Context A00;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        com.whatsapp.util.Log.e(X.C36321k7.A0D("failed to load SVG from ", r5), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002e */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[ExcHandler: Auz | IOException (r1v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0002] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Picture A0P(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r3 = "failed to load SVG from "
            android.content.Context r0 = r4.A00     // Catch:{ Auz | IOException -> 0x002f }
            android.content.res.AssetManager r2 = r0.getAssets()     // Catch:{ Auz | IOException -> 0x002f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Auz | IOException -> 0x002f }
            java.lang.String r0 = "graphics/"
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r5, r1)     // Catch:{ Auz | IOException -> 0x002f }
            X.9ou r0 = new X.9ou     // Catch:{ Auz | IOException -> 0x002f }
            r0.<init>()     // Catch:{ Auz | IOException -> 0x002f }
            java.io.InputStream r2 = r2.open(r1)     // Catch:{ Auz | IOException -> 0x002f }
            X.9gS r1 = r0.A0T(r2)     // Catch:{ all -> 0x002a }
            r2.close()     // Catch:{ IOException -> 0x0022, Auz | IOException -> 0x002f }
        L_0x0022:
            if (r1 == 0) goto L_0x0037
            r0 = 0
            android.graphics.Picture r0 = r1.A01(r0)     // Catch:{ Auz | IOException -> 0x002f }
            return r0
        L_0x002a:
            r0 = move-exception
            r2.close()     // Catch:{ IOException -> 0x002e, Auz | IOException -> 0x002f }
        L_0x002e:
            throw r0     // Catch:{ Auz | IOException -> 0x002f }
        L_0x002f:
            r1 = move-exception
            java.lang.String r0 = X.C36321k7.A0D(r3, r5)
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0037:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5CW.A0P(java.lang.String):android.graphics.Picture");
    }

    public AnonymousClass5CW(Context context) {
        this.A00 = context;
    }
}
