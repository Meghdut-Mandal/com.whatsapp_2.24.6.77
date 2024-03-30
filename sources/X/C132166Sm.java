package X;

import android.text.TextUtils;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: X.6Sm  reason: invalid class name and case insensitive filesystem */
public final class C132166Sm {
    public static final Charset A03 = Charset.forName(DefaultCrypto.UTF_8);
    public final C19730wQ A00;
    public final C26181Je A01;
    public final C19770wU A02;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass6AK A00(X.C132166Sm r4, X.AnonymousClass3T1 r5) {
        /*
            X.0wQ r2 = r4.A00
            com.whatsapp.jid.PhoneUserJid r4 = X.C36441kJ.A0n(r2)
            X.3Qa r1 = r5.A1J
            X.11F r3 = r1.A00
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0041
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0050
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
        L_0x0014:
            if (r3 == 0) goto L_0x0055
            if (r4 == 0) goto L_0x0055
            java.lang.String r2 = r1.A01
            byte[] r1 = r5.A1b
            if (r1 == 0) goto L_0x0055
            java.lang.String r0 = "Rcat"
            byte[] r1 = X.AnonymousClass6HP.A01(r3, r4, r0, r2, r1)
            if (r1 == 0) goto L_0x0055
            r0 = 10
            java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)
        L_0x002c:
            boolean r0 = r5 instanceof X.AnonymousClass2bV
            r1 = 0
            if (r0 == 0) goto L_0x003f
            X.2bV r5 = (X.AnonymousClass2bV) r5
            java.lang.String r0 = r5.A03
        L_0x0035:
            if (r2 == 0) goto L_0x003e
            if (r0 == 0) goto L_0x003e
            X.6AK r1 = new X.6AK
            r1.<init>(r2, r0)
        L_0x003e:
            return r1
        L_0x003f:
            r0 = r1
            goto L_0x0035
        L_0x0041:
            boolean r0 = X.AnonymousClass143.A0G(r3)
            if (r0 == 0) goto L_0x0055
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0050
            com.whatsapp.jid.UserJid r3 = r5.A0L()
            goto L_0x0014
        L_0x0050:
            com.whatsapp.jid.PhoneUserJid r3 = X.C36441kJ.A0n(r2)
            goto L_0x0014
        L_0x0055:
            r2 = 0
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132166Sm.A00(X.6Sm, X.3T1):X.6AK");
    }

    public byte[] A01(UserJid userJid, AnonymousClass2bV r8, String str) {
        byte[] A012;
        if (str == null) {
            str = r8.A0b();
        }
        PhoneUserJid A0n = C36441kJ.A0n(this.A00);
        if (!TextUtils.isEmpty(str) && C66013Ui.A0q(r8) && A0n != null) {
            byte[] bytes = str.getBytes(A03);
            String str2 = r8.A1J.A01;
            byte[] bArr = r8.A1b;
            if (bArr == null) {
                A012 = null;
            } else {
                A012 = AnonymousClass6HP.A01(A0n, userJid, "Rcat", str2, bArr);
            }
            if (A012 != null) {
                try {
                    return Arrays.copyOf(C110525ao.A00(bytes, A012), 8);
                } catch (Exception e) {
                    throw C90524aI.A0e("Failed to calculate hmac-sha256", e);
                }
            }
        }
        return null;
    }

    public C132166Sm(C19730wQ r1, C26181Je r2, C19770wU r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
