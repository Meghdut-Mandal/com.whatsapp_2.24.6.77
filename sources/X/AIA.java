package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public final class AIA implements C236119d {
    public C193009Jm A00;
    public final UserJid A01;
    public final AnonymousClass19A A02;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        if (r2.A2W(r0.getRawString(), r27.getRawString()) == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0225, code lost:
        r1 = r4.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        com.whatsapp.util.Log.e("DirectConnectionManager/generateEncryptionStringFromSignedInfo/Null certificate");
        r4.A04.A0E("direct-connection-failed-to-load-certificate-from-preferences", "", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x025c, code lost:
        r4.A05(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x025f, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x027b A[EDGE_INSN: B:104:0x027b->B:93:0x027b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r29, java.lang.String r30) {
        /*
            r28 = this;
            r0 = 1
            r1 = r29
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.String r0 = "signed_user_info"
            X.9nx r5 = r1.A0c(r0)
            r2 = r28
            if (r5 == 0) goto L_0x0288
            java.lang.String r24 = "phone_number"
            r0 = r24
            X.9nx r4 = r5.A0c(r0)
            java.lang.String r23 = "ttl_timestamp"
            r0 = r23
            X.9nx r3 = r5.A0c(r0)
            java.lang.String r22 = "phone_number_signature"
            r0 = r22
            X.9nx r1 = r5.A0c(r0)
            java.lang.String r0 = "business_domain"
            X.9nx r0 = r5.A0c(r0)
            if (r4 == 0) goto L_0x0288
            if (r3 == 0) goto L_0x0288
            if (r1 == 0) goto L_0x0288
            if (r0 == 0) goto L_0x0288
            java.lang.String r10 = r4.A0e()
            java.lang.String r9 = r3.A0e()
            java.lang.String r8 = r1.A0e()
            java.lang.String r7 = r0.A0e()
            if (r10 == 0) goto L_0x0288
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0288
            if (r9 == 0) goto L_0x0288
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0288
            if (r8 == 0) goto L_0x0288
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0288
            if (r7 == 0) goto L_0x0288
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0288
            X.9Jm r1 = r2.A00
            if (r1 == 0) goto L_0x028b
            com.whatsapp.jid.UserJid r6 = r2.A01
            r5 = 0
            java.lang.String r0 = "DirectConnectionManager/loadPhoneNumberSignature/onGetPhoneNumberSignatureSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1KM r4 = r1.A00
            com.whatsapp.jid.UserJid r0 = r1.A02
            r27 = r0
            X.9uZ r3 = r1.A01
            X.1KP r2 = r4.A09
            java.lang.String r21 = "postcode"
            r1 = 1
            r0 = r21
            boolean r0 = X.AnonymousClass1KP.A00(r2, r3, r0, r1)
            if (r0 != 0) goto L_0x021b
            r3 = 0
        L_0x0088:
            r20 = 0
        L_0x008a:
            X.0wQ r0 = r4.A05
            r26 = r0
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r26)
            if (r0 == 0) goto L_0x00a6
            X.0v0 r2 = r4.A0A
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = r27.getRawString()
            boolean r0 = r2.A2W(r1, r0)
            r19 = 1
            if (r0 != 0) goto L_0x0214
        L_0x00a6:
            r19 = 0
            X.0v0 r2 = r4.A0A
            java.lang.String r0 = r27.getRawString()
            java.lang.String r0 = r2.A0l(r0)
            if (r0 != 0) goto L_0x0214
            r0 = 0
            X.9WZ r12 = new X.9WZ
            r12.<init>(r0, r9, r0, r3)
        L_0x00ba:
            X.0yC r0 = r4.A0B
            r25 = r0
            r1 = 1867(0x74b, float:2.616E-42)
            boolean r0 = r0.A0E(r1)
            if (r0 == 0) goto L_0x00ee
            X.1KO r0 = r4.A08
            X.0v0 r14 = r0.A00
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r14)
            java.lang.String r13 = "latest_biz_backend_request_id"
            java.lang.String r11 = X.C36371kC.A0t(r0, r13)
            r1 = 0
            if (r11 == 0) goto L_0x00ee
            java.lang.String r0 = "252"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x00e4
            X.9WZ r1 = new X.9WZ
            r1.<init>(r10, r9, r8, r3)
        L_0x00e4:
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r14)
            X.C36341k9.A0u(r0, r13)
            if (r1 == 0) goto L_0x00ee
            r12 = r1
        L_0x00ee:
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ ParseException -> 0x0275 }
            java.lang.String r1 = "yyyyMMdd'T'HHmmss'Z'"
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x0275 }
            r0.<init>(r1, r11)     // Catch:{ ParseException -> 0x0275 }
            java.lang.String r14 = r12.A03     // Catch:{ ParseException -> 0x0275 }
            java.util.Date r18 = r0.parse(r14)     // Catch:{ ParseException -> 0x0275 }
            if (r18 == 0) goto L_0x027b
            java.lang.String r17 = "direct-connection-fail-to-generate-encryption-string"
            java.lang.String r16 = "DirectConnectionManager/generateEncryptionStringFromSignedInfo/"
            r15 = 2
            java.lang.String r13 = r4.A01(r6)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            java.lang.String r11 = ""
            if (r13 != 0) goto L_0x010e
            goto L_0x024f
        L_0x010e:
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            byte[] r0 = android.util.Base64.decode(r13, r15)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            java.io.ByteArrayInputStream r0 = X.C90524aI.A0P(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            java.security.cert.Certificate r13 = r1.generateCertificate(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            X.AnonymousClass00C.A0E(r13, r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            java.security.cert.X509Certificate r13 = (java.security.cert.X509Certificate) r13     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            javax.security.auth.x500.X500Principal r0 = r13.getSubjectX500Principal()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            java.lang.String r0 = r0.getName()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            java.lang.String r0 = X.C109845Zi.A00(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            boolean r0 = r7.equals(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            if (r0 != 0) goto L_0x0151
            java.lang.String r0 = "DirectConnectionManager/generateEncryptionStringFromSignedInfo/Incorrect CN in certificate"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            X.0wN r1 = r4.A04     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            java.lang.String r0 = "direct-connection-certificate-common-name-mismatch"
            r1.A0E(r0, r11, r5)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            java.lang.String r0 = r6.getRawString()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            r2.A1M(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            goto L_0x0271
        L_0x0151:
            X.1KN r11 = r4.A07     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            org.json.JSONObject r1 = X.C36441kJ.A1B()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            java.lang.String r0 = r12.A00     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            r15 = r24
            r1.put(r15, r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            r0 = r23
            r1.put(r0, r14)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            java.lang.String r14 = r12.A01     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            r0 = r22
            r1.put(r0, r14)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            java.lang.String r12 = r12.A02     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            r0 = r21
            r1.put(r0, r12)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            java.lang.String r0 = X.C36381kD.A0y(r1)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            java.security.PublicKey r1 = r13.getPublicKey()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            X.9Jn r13 = X.AnonymousClass1KN.A00(r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            javax.crypto.SecretKey r0 = r13.A00     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            byte[] r12 = X.AnonymousClass1KN.A01(r1, r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            byte[] r0 = r0.getEncoded()     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            r11.A00 = r0     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            byte[] r1 = r13.A02     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            r11.A01 = r1     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            byte[] r0 = r13.A01     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            java.lang.String r13 = X.C109855Zj.A00(r0, r12, r1)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            if (r13 == 0) goto L_0x0271
            java.lang.String r12 = r6.getRawString()
            android.content.SharedPreferences$Editor r11 = X.C19420v0.A00(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "dc_business_domain_"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r12, r1)
            X.C36341k9.A0x(r11, r0, r7)
            java.lang.String r0 = r4.A02
            if (r0 != 0) goto L_0x020b
            java.lang.String r12 = r6.getRawString()
            android.content.SharedPreferences$Editor r11 = X.C19420v0.A00(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "smb_business_direct_connection_enc_string_"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r12, r1)
            X.C36341k9.A0x(r11, r0, r13)
            java.lang.String r14 = r6.getRawString()
            long r0 = r18.getTime()
            android.content.SharedPreferences$Editor r13 = X.C19420v0.A00(r2)
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0u()
            java.lang.String r11 = "smb_business_direct_connection_enc_string_expired_timestamp_"
            java.lang.String r11 = X.AnonymousClass000.A0p(r11, r14, r12)
            X.C36341k9.A0w(r13, r11, r0)
        L_0x01df:
            r1 = 3760(0xeb0, float:5.269E-42)
            r0 = r25
            boolean r0 = r0.A0E(r1)
            if (r0 == 0) goto L_0x025c
            if (r19 != 0) goto L_0x025c
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r26)
            if (r0 == 0) goto L_0x025c
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = r27.getRawString()
            boolean r0 = r2.A2W(r1, r0)
            if (r0 == 0) goto L_0x025c
            int r0 = r20 + 1
            byte r2 = (byte) r0
            r1 = 1
            r0 = r20
            if (r0 >= r1) goto L_0x025c
            r20 = r2
            goto L_0x008a
        L_0x020b:
            r4.A01 = r13
            long r0 = r18.getTime()
            r4.A00 = r0
            goto L_0x01df
        L_0x0214:
            X.9WZ r12 = new X.9WZ
            r12.<init>(r10, r9, r8, r3)
            goto L_0x00ba
        L_0x021b:
            java.lang.String r3 = r4.A02
            if (r3 == 0) goto L_0x0225
            int r0 = r3.length()
            if (r0 != 0) goto L_0x0088
        L_0x0225:
            X.0v0 r1 = r4.A0A
            java.lang.String r0 = r27.getRawString()
            java.lang.String r3 = r1.A0l(r0)
            if (r3 == 0) goto L_0x0237
            int r0 = r3.length()
            if (r0 != 0) goto L_0x0088
        L_0x0237:
            java.lang.String r3 = r27.getRawString()
            android.content.SharedPreferences r2 = X.C36341k9.A0E(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "dc_default_postcode_"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)
            java.lang.String r3 = X.C36371kC.A0t(r2, r0)
            goto L_0x0088
        L_0x024f:
            java.lang.String r0 = "DirectConnectionManager/generateEncryptionStringFromSignedInfo/Null certificate"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            X.0wN r1 = r4.A04     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            java.lang.String r0 = "direct-connection-failed-to-load-certificate-from-preferences"
            r1.A0E(r0, r11, r5)     // Catch:{ IllegalArgumentException | GeneralSecurityException | JSONException -> 0x0260 }
            goto L_0x0271
        L_0x025c:
            r4.A05(r6)
            return
        L_0x0260:
            r1 = move-exception
            r0 = r16
            com.whatsapp.util.Log.e(r0, r1)
            X.0wN r2 = r4.A04
            java.lang.String r1 = r1.toString()
            r0 = r17
            r2.A0E(r0, r1, r5)
        L_0x0271:
            r4.A04(r6)
            return
        L_0x0275:
            r1 = move-exception
            java.lang.String r0 = "DirectConnectionManager/getExpirationDateFromSignedUserInfo/Invalid timestamp"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x027b:
            r4.A04(r6)
            X.0wN r2 = r4.A04
            java.lang.String r1 = "direct-connection-invalid-expiration-date"
            java.lang.String r0 = ""
            r2.A0E(r1, r0, r5)
            return
        L_0x0288:
            r2.A00()
        L_0x028b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIA.BiM(X.9nx, java.lang.String):void");
    }

    private final void A00() {
        C193009Jm r2 = this.A00;
        if (r2 != null) {
            UserJid userJid = this.A01;
            Log.e("DirectConnectionManager/loadPhoneNumberSignature/onGetPhoneNumberSignatureError");
            AnonymousClass1KM r0 = r2.A00;
            r0.A04(userJid);
            r0.A04.A0E("direct-connection-get-phone-signature-error-response", "", false);
        }
    }

    public AIA(UserJid userJid, AnonymousClass19A r2) {
        this.A01 = userJid;
        this.A02 = r2;
    }

    public void BWw(C203399nx r3, String str) {
        C36321k7.A1R("GetPhoneNumberSignature/delivery-error with iqId ", str, C36341k9.A0i(str));
        A00();
    }

    public void BVN(String str) {
        A00();
    }
}
