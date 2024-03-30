package X;

import com.whatsapp.util.Log;

/* renamed from: X.6xn  reason: invalid class name and case insensitive filesystem */
public class C147796xn implements C236119d {
    public final AnonymousClass130 A00;
    public final AZA A01;
    public final /* synthetic */ C29241Vw A02;

    public C147796xn(AnonymousClass130 r1, C29241Vw r2, AZA aza) {
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = aza;
    }

    private void A00() {
        AnonymousClass130 r6 = this.A00;
        long A002 = C19970wo.A00(r6.A05);
        C19890wg r5 = r6.A0A;
        C36341k9.A0w(C36381kD.A0G(r5, "keystore"), "last_failed_auth_key_rotation_attempt", A002);
        r6.A0H(C36371kC.A01(r5.A00("keystore"), "remaining_auth_key_rotation_attempts") - 1);
    }

    public void BVN(String str) {
        Log.w("AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onDeliveryFailure");
    }

    public void BWw(C203399nx r2, String str) {
        Log.w("AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onError: 500 IQ error");
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        if (r9 > ((long) r11)) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r16, java.lang.String r17) {
        /*
            r15 = this;
            X.130 r3 = r15.A00
            X.AZA r2 = r15.A01
            monitor-enter(r3)
            X.AnonymousClass130.A07(r3)     // Catch:{ all -> 0x0118 }
            X.0wg r5 = r3.A0A     // Catch:{ all -> 0x0118 }
            java.lang.String r4 = "keystore"
            android.content.SharedPreferences r7 = r5.A00(r4)     // Catch:{ all -> 0x0118 }
            X.0yC r1 = r3.A08     // Catch:{ all -> 0x0118 }
            r0 = 831(0x33f, float:1.164E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x00c3
            X.137 r0 = r3.A01     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x00c3
            java.lang.String r0 = "can_user_android_key_store"
            r6 = 0
            boolean r0 = r7.getBoolean(r0, r6)     // Catch:{ all -> 0x0118 }
            if (r0 == 0) goto L_0x00c3
            android.content.SharedPreferences r9 = r5.A00(r4)     // Catch:{ all -> 0x0118 }
            r0 = 375(0x177, float:5.25E-43)
            int r14 = r1.A07(r0)     // Catch:{ all -> 0x0118 }
            r0 = 384(0x180, float:5.38E-43)
            int r11 = r1.A07(r0)     // Catch:{ all -> 0x0118 }
            java.lang.String r8 = "client_static_keypair_enc_success"
            r0 = 0
            long r12 = r9.getLong(r8, r0)     // Catch:{ all -> 0x0118 }
            java.lang.String r8 = "client_static_keypair_enc_failed"
            long r9 = r9.getLong(r8, r0)     // Catch:{ all -> 0x0118 }
            long r0 = (long) r14     // Catch:{ all -> 0x0118 }
            int r8 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0050
            long r0 = (long) r11     // Catch:{ all -> 0x0118 }
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r0 = 1
            if (r8 <= 0) goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            java.lang.String r9 = "AuthKeyStore/mismatch after rotation"
            if (r0 == 0) goto L_0x008c
            android.content.SharedPreferences r0 = r5.A00(r4)     // Catch:{ all -> 0x0118 }
            X.AnonymousClass130.A05(r0)     // Catch:{ all -> 0x0118 }
            byte[] r0 = r2.A02()     // Catch:{ all -> 0x0118 }
            boolean r0 = X.AnonymousClass130.A0B(r3, r0)     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = "authkeystore/overwriteExistingKeypairKeyStore: failed to write the new authkey, lost the old authkey"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0118 }
            r1 = 0
            goto L_0x006e
        L_0x006d:
            r1 = 1
        L_0x006e:
            java.lang.String r0 = "client_static_keypair_pwd_enc"
            boolean r0 = r7.contains(r0)     // Catch:{ all -> 0x0118 }
            if (r1 == 0) goto L_0x0079
            if (r0 == 0) goto L_0x00d7
            goto L_0x00ca
        L_0x0079:
            if (r0 != 0) goto L_0x00f2
            X.0wN r8 = r3.A04     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = "AuthKeyStore/failed to rotate KeyStore key"
            java.lang.String r0 = "Failed to update new authkey to KeyStore"
            r8.A0E(r1, r0, r6)     // Catch:{ all -> 0x0118 }
            byte[] r0 = r2.A02()     // Catch:{ all -> 0x0118 }
            X.AnonymousClass130.A06(r7, r3, r0)     // Catch:{ all -> 0x0118 }
            goto L_0x00f2
        L_0x008c:
            android.content.SharedPreferences r0 = r5.A00(r4)     // Catch:{ all -> 0x0118 }
            X.AnonymousClass130.A05(r0)     // Catch:{ all -> 0x0118 }
            byte[] r0 = r2.A02()     // Catch:{ all -> 0x0118 }
            boolean r0 = X.AnonymousClass130.A0B(r3, r0)     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x00a4
            java.lang.String r0 = "authkeystore/overwriteExistingKeypairKeyStore: failed to write the new authkey, lost the old authkey"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0118 }
            r8 = 0
            goto L_0x00a5
        L_0x00a4:
            r8 = 1
        L_0x00a5:
            boolean r10 = X.AnonymousClass130.A0A(r3, r2)     // Catch:{ all -> 0x0118 }
            if (r8 == r10) goto L_0x00c7
            X.0wN r7 = r3.A04     // Catch:{ all -> 0x0118 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = "KeyStoreKeyIsSuccessfullyRotated: "
            r1.append(r0)     // Catch:{ all -> 0x0118 }
            r1.append(r8)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = ", PwdKeyIsSuccessfullyRotated: "
            java.lang.String r0 = X.C36371kC.A0z(r0, r1, r10)     // Catch:{ all -> 0x0118 }
            r7.A0E(r9, r0, r6)     // Catch:{ all -> 0x0118 }
            goto L_0x00c7
        L_0x00c3:
            boolean r10 = X.AnonymousClass130.A0A(r3, r2)     // Catch:{ all -> 0x0118 }
        L_0x00c7:
            if (r10 == 0) goto L_0x00f2
            goto L_0x00d7
        L_0x00ca:
            boolean r0 = X.AnonymousClass130.A0A(r3, r2)     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x00d7
            X.0wN r1 = r3.A04     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = "KeyStore key was rotated, PWD key was not rotated"
            r1.A0E(r9, r0, r6)     // Catch:{ all -> 0x0118 }
        L_0x00d7:
            r1 = 7
            X.5q4 r0 = new X.5q4     // Catch:{ all -> 0x0118 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0118 }
            r3.A00 = r0     // Catch:{ all -> 0x0118 }
            X.0v0 r0 = r3.A06     // Catch:{ all -> 0x0118 }
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r0)     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = "connection_lc"
            r0 = 0
            X.C36341k9.A0v(r2, r1, r0)     // Catch:{ all -> 0x0118 }
            X.134 r0 = r3.A07     // Catch:{ all -> 0x0118 }
            r0.A03()     // Catch:{ all -> 0x0118 }
            r0 = 1
            goto L_0x00f3
        L_0x00f2:
            r0 = 0
        L_0x00f3:
            monitor-exit(r3)
            if (r0 == 0) goto L_0x010f
            java.lang.String r0 = "AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onSuccess: success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r3.A0H(r0)
            X.0wo r0 = r3.A05
            long r2 = X.C19970wo.A00(r0)
            android.content.SharedPreferences$Editor r1 = X.C36381kD.A0G(r5, r4)
            java.lang.String r0 = "last_succeeded_auth_key_rotation_attempt"
            X.C36341k9.A0w(r1, r0, r2)
            return
        L_0x010f:
            java.lang.String r0 = "AuthkeyRotationManager/SetAuthkeyIqResponseCallBack/onSuccess: failed to overwrite existing authkey"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r15.A00()
            return
        L_0x0118:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147796xn.BiM(X.9nx, java.lang.String):void");
    }
}
