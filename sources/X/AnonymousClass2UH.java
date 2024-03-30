package X;

import android.net.Uri;
import java.util.HashMap;

/* renamed from: X.2UH  reason: invalid class name */
public final class AnonymousClass2UH extends C74863mI {
    public static final Uri A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2UH(X.C21060yb r10, X.C20810yC r11, X.AnonymousClass1A2 r12, java.lang.String r13, int r14) {
        /*
            r9 = this;
            r3 = 1
            r4 = r11
            X.AnonymousClass00C.A0D(r11, r3)
            r7 = 2
            r0 = 3
            r5 = r12
            X.AnonymousClass00C.A0D(r12, r0)
            android.net.Uri r0 = A00
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = "bucketId"
            r6 = r13
            android.net.Uri$Builder r2 = r1.appendQueryParameter(r0, r13)
            java.lang.String r1 = "include"
            if (r14 == r3) goto L_0x0037
            if (r14 == r7) goto L_0x0034
            r0 = 4
            if (r14 != r0) goto L_0x0026
            java.lang.String r0 = "video"
        L_0x0023:
            r2.appendQueryParameter(r1, r0)
        L_0x0026:
            android.net.Uri r2 = r2.build()
            X.AnonymousClass00C.A08(r2)
            r8 = 0
            r1 = r9
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0034:
            java.lang.String r0 = "gif"
            goto L_0x0023
        L_0x0037:
            java.lang.String r0 = "images"
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2UH.<init>(X.0yb, X.0yC, X.1A2, java.lang.String, int):void");
    }

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("content://");
        A0u.append("com.whatsapp");
        Uri parse = Uri.parse(AnonymousClass000.A0q(".provider.media/items", A0u));
        AnonymousClass00C.A08(parse);
        A00 = parse;
    }

    public HashMap B90() {
        return AnonymousClass001.A0J();
    }
}
