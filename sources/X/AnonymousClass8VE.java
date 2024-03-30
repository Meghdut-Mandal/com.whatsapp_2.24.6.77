package X;

import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Map;

/* renamed from: X.8VE  reason: invalid class name */
public final class AnonymousClass8VE extends AnonymousClass8VH {
    public final C23024B0u A00;
    public final AnonymousClass19A A01;
    public final C63273Jk A02;
    public final AnonymousClass1KM A03;
    public final AnonymousClass9EE A04;
    public final UserJid A05;
    public final String A06;

    public void BVN(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A02.A01(str);
        A08("error", 440);
    }

    public final void A07(C207109uZ r6) {
        AnonymousClass1KM r4 = this.A03;
        UserJid userJid = this.A00;
        String str = this.A06;
        synchronized (r4) {
            r4.A02 = str;
            Map map = r4.A03;
            List A0o = C90524aI.A0o(userJid, map);
            if (A0o != null) {
                A0o.add(this);
            } else {
                map.put(userJid, AnonymousClass03T.A02(this));
                if (r4.A01(userJid) == null) {
                    new AI6(userJid, r4.A0C).A00(new C21107A8s(r4, r6));
                } else {
                    AnonymousClass1KM.A00(r4, r6, userJid);
                }
            }
        }
    }

    public final void A08(String str, int i) {
        AnonymousClass1KM r2 = this.A03;
        synchronized (r2) {
            r2.A02 = null;
            r2.A01 = null;
            r2.A00 = 0;
        }
        this.A00.Bd9(str, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8VE(AnonymousClass1KK r1, AnonymousClass1KM r2, AnonymousClass9EE r3, C23024B0u b0u, UserJid userJid, AnonymousClass19A r6, C63273Jk r7, String str) {
        super(r1, userJid);
        C36321k7.A11(r1, r6, r2);
        C36341k9.A1F(r7, str);
        this.A01 = r6;
        this.A03 = r2;
        this.A04 = r3;
        this.A02 = r7;
        this.A06 = str;
        this.A05 = userJid;
        this.A00 = b0u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d5, code lost:
        r10.A02.A01(r12);
        A08("error", 1002);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r11, java.lang.String r12) {
        /*
            r10 = this;
            X.C36321k7.A0w(r12, r11)
            com.whatsapp.jid.UserJid r8 = r10.A00
            X.9EE r1 = r10.A04
            r9 = 0
            java.lang.String r0 = "result_code"
            X.9nx r0 = r11.A0c(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.String r5 = r0.A0e()
            if (r5 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r5 = "invalid_postcode"
        L_0x0018:
            java.lang.String r0 = "encrypted_location_name"
            X.9nx r0 = r11.A0c(r0)
            r4 = 0
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = r0.A0e()
            if (r0 == 0) goto L_0x006a
            X.1KN r6 = r1.A00
            byte[] r7 = android.util.Base64.decode(r0, r9)
            X.AnonymousClass00C.A08(r7)
            byte[] r2 = r6.A00     // Catch:{ GeneralSecurityException -> 0x0060 }
            if (r2 == 0) goto L_0x0068
            int r1 = r2.length     // Catch:{ GeneralSecurityException -> 0x0060 }
            java.lang.String r0 = "AES"
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch:{ GeneralSecurityException -> 0x0060 }
            r3.<init>(r2, r9, r1, r0)     // Catch:{ GeneralSecurityException -> 0x0060 }
            byte[] r0 = r6.A01     // Catch:{ GeneralSecurityException -> 0x0060 }
            if (r0 == 0) goto L_0x0068
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec     // Catch:{ GeneralSecurityException -> 0x0060 }
            r2.<init>(r0)     // Catch:{ GeneralSecurityException -> 0x0060 }
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ GeneralSecurityException -> 0x0060 }
            r0 = 2
            r1.init(r0, r3, r2)     // Catch:{ GeneralSecurityException -> 0x0060 }
            byte[] r0 = r1.doFinal(r7)     // Catch:{ GeneralSecurityException -> 0x0060 }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ GeneralSecurityException -> 0x0060 }
            java.lang.String r0 = X.C165607th.A0w(r0)     // Catch:{ GeneralSecurityException -> 0x0060 }
            r6.A00 = r4     // Catch:{ GeneralSecurityException -> 0x0060 }
            r6.A01 = r4     // Catch:{ GeneralSecurityException -> 0x0060 }
            r4 = r0
            goto L_0x006a
        L_0x0060:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0068:
            java.lang.String r5 = "error"
        L_0x006a:
            X.5pA r7 = new X.5pA
            r7.<init>(r5, r4)
            java.lang.String r0 = r7.A00
            if (r0 != 0) goto L_0x0080
            X.3Jk r0 = r10.A02
            r0.A01(r12)
            java.lang.String r1 = r7.A01
            r0 = 1001(0x3e9, float:1.403E-42)
            r10.A08(r1, r0)
            return
        L_0x0080:
            X.1KM r6 = r10.A03
            monitor-enter(r6)
            long r1 = r6.A00     // Catch:{ all -> 0x00e2 }
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00d4
            java.lang.String r5 = r6.A01     // Catch:{ all -> 0x00e2 }
            if (r5 == 0) goto L_0x00d4
            X.0v0 r4 = r6.A0A     // Catch:{ all -> 0x00e2 }
            java.lang.String r3 = r8.getRawString()     // Catch:{ all -> 0x00e2 }
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r4)     // Catch:{ all -> 0x00e2 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = "smb_business_direct_connection_enc_string_"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)     // Catch:{ all -> 0x00e2 }
            X.C36341k9.A0x(r2, r0, r5)     // Catch:{ all -> 0x00e2 }
            java.lang.String r5 = r8.getRawString()     // Catch:{ all -> 0x00e2 }
            long r1 = r6.A00     // Catch:{ all -> 0x00e2 }
            android.content.SharedPreferences$Editor r4 = X.C19420v0.A00(r4)     // Catch:{ all -> 0x00e2 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = "smb_business_direct_connection_enc_string_expired_timestamp_"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r5, r3)     // Catch:{ all -> 0x00e2 }
            X.C36341k9.A0w(r4, r0, r1)     // Catch:{ all -> 0x00e2 }
            r0 = 0
            r6.A02 = r0     // Catch:{ all -> 0x00d2 }
            r6.A01 = r0     // Catch:{ all -> 0x00d2 }
            r0 = 0
            r6.A00 = r0     // Catch:{ all -> 0x00d2 }
            monitor-exit(r6)
            X.3Jk r0 = r10.A02
            r0.A02(r12)
            X.B0u r0 = r10.A00
            r0.BdA(r7)
            return
        L_0x00d2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00e2 }
        L_0x00d4:
            monitor-exit(r6)
            X.3Jk r0 = r10.A02
            r0.A01(r12)
            r1 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r0 = "error"
            r10.A08(r0, r1)
            return
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8VE.BiM(X.9nx, java.lang.String):void");
    }
}
