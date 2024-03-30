package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.3Gq  reason: invalid class name and case insensitive filesystem */
public final class C62563Gq {
    public final C20810yC A00;
    public final AnonymousClass17Y A01;
    public final C21060yb A02;
    public final C19970wo A03;
    public final C21010yW A04;
    public final AnonymousClass1C6 A05;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r4.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0009
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r2 = 0
            if (r0 != 0) goto L_0x003d
            boolean r0 = X.AnonymousClass098.A06(r4)
            if (r0 != 0) goto L_0x003d
            X.0yC r1 = r3.A00
            r0 = 3631(0xe2f, float:5.088E-42)
            java.lang.String r1 = r1.A09(r0)
            if (r1 == 0) goto L_0x003d
            r0 = 0
            boolean r0 = X.AnonymousClass098.A07(r4, r1, r0)
            if (r0 == 0) goto L_0x003d
            android.net.Uri r1 = com.whatsapp.wamsys.SecureUriParser.parseEncodedRFC2396(r4)
            java.lang.String r0 = "code"
            java.lang.String r1 = r1.getQueryParameter(r0)
            if (r1 == 0) goto L_0x003d
            int r0 = r1.length()
            if (r0 == 0) goto L_0x003d
            boolean r0 = X.AnonymousClass098.A06(r1)
            if (r0 != 0) goto L_0x003d
            return r1
        L_0x003d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62563Gq.A00(java.lang.String):java.lang.String");
    }

    public final void A01(String str) {
        try {
            ClipData newPlainText = ClipData.newPlainText(str, str);
            ClipboardManager A09 = this.A02.A09();
            if (A09 != null) {
                A09.setPrimaryClip(newPlainText);
            }
            this.A01.A07(R.string.f12nameremoved, 1);
        } catch (NullPointerException | SecurityException e) {
            Log.e("CouponMessageService/copycode", e);
        }
    }

    public C62563Gq(AnonymousClass17Y r2, C21060yb r3, C19970wo r4, C20810yC r5, C21010yW r6, AnonymousClass1C6 r7) {
        C36321k7.A1B(r5, r2, r7, r6, r3);
        AnonymousClass00C.A0D(r4, 6);
        this.A00 = r5;
        this.A01 = r2;
        this.A05 = r7;
        this.A04 = r6;
        this.A02 = r3;
        this.A03 = r4;
    }
}
