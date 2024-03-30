package X;

/* renamed from: X.6Mw  reason: invalid class name */
public class AnonymousClass6Mw {
    public final C19970wo A00;
    public final C132196Sp A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass9P1 A03;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass6P0 r11, X.C160077kQ r12, X.AnonymousClass6Mw r13, java.lang.Integer r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            X.9P1 r1 = r13.A03     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            java.lang.String r0 = "CN=WhatsApp WWW Channel"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            java.security.cert.X509Certificate r6 = r1.A00(r15, r0)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            java.lang.String r0 = "CN=WhatsApp WWW Channel Signature"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            r2 = r16
            java.security.cert.X509Certificate r7 = r1.A00(r2, r0)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            r4 = 0
            r5 = r17
            if (r17 == 0) goto L_0x0022
            java.security.PublicKey r2 = X.AnonymousClass6UE.A05(r5)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            goto L_0x0023
        L_0x0022:
            r2 = r4
        L_0x0023:
            if (r18 == 0) goto L_0x002d
            int r0 = java.lang.Integer.parseInt(r18)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
        L_0x002d:
            X.6Sp r1 = r13.A01     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            java.util.Set r0 = r1.A01     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            boolean r0 = r0.contains(r11)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            if (r0 == 0) goto L_0x0064
            if (r14 == 0) goto L_0x005c
            int r8 = r14.intValue()     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            X.0wo r0 = r13.A00     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            long r9 = X.C36371kC.A09(r0)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            monitor-enter(r1)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            java.util.HashMap r0 = X.C132196Sp.A00(r1)     // Catch:{  }
            X.6LK r3 = new X.6LK     // Catch:{ all -> 0x0059 }
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0059 }
            r0.put(r11, r3)     // Catch:{ all -> 0x0059 }
            X.C132196Sp.A01(r1, r0)     // Catch:{ CertificateException | JSONException -> 0x0054 }
            goto L_0x0063
        L_0x0054:
            r0 = move-exception
            X.C18740tg.A0A(r0)     // Catch:{ all -> 0x0059 }
            goto L_0x0063
        L_0x0059:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            goto L_0x0062
        L_0x005c:
            java.lang.String r0 = "cacheable certs should have ttl"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
        L_0x0062:
            throw r0     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
        L_0x0063:
            monitor-exit(r1)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
        L_0x0064:
            r12.BiT(r4, r2, r6, r7)     // Catch:{ CertificateExpiredException -> 0x006d, UnsupportedEncodingException | NumberFormatException | GeneralSecurityException -> 0x0068 }
            return
        L_0x0068:
            r0 = move-exception
            r12.BWk(r0)
            return
        L_0x006d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Mw.A00(X.6P0, X.7kQ, X.6Mw, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.6LK} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.security.PublicKey] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass6P0 r12, X.C160077kQ r13) {
        /*
            r11 = this;
            X.6Sp r7 = r11.A01
            java.util.Set r0 = r7.A01
            boolean r0 = r0.contains(r12)
            r2 = 0
            if (r0 == 0) goto L_0x0064
            java.util.HashMap r0 = X.C132196Sp.A00(r7)     // Catch:{ CertificateException | JSONException -> 0x005a }
            java.lang.Object r5 = r0.get(r12)     // Catch:{ CertificateException | JSONException -> 0x005a }
            X.6LK r5 = (X.AnonymousClass6LK) r5     // Catch:{ CertificateException | JSONException -> 0x005a }
            if (r5 == 0) goto L_0x005f
            java.security.cert.X509Certificate r6 = r5.A04
            int r10 = r5.A00
            long r3 = r5.A01
            X.0wo r0 = r11.A00
            long r0 = X.C19970wo.A00(r0)
            java.util.Date r8 = new java.util.Date     // Catch:{ CertificateExpiredException | CertificateNotYetValidException -> 0x0061 }
            r8.<init>(r0)     // Catch:{ CertificateExpiredException | CertificateNotYetValidException -> 0x0061 }
            r6.checkValidity(r8)     // Catch:{ CertificateExpiredException | CertificateNotYetValidException -> 0x0061 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            X.C18740tg.A06(r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            X.C18740tg.A06(r8)
            long r8 = X.C36391kE.A0B(r0)
            int r0 = r10 / 2
            long r0 = (long) r0
            long r3 = r3 + r0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0061
            java.security.cert.X509Certificate r1 = r5.A05     // Catch:{ GeneralSecurityException -> 0x0055 }
            java.lang.String r0 = r5.A03     // Catch:{ GeneralSecurityException -> 0x0055 }
            if (r0 == 0) goto L_0x004f
            java.security.PublicKey r2 = X.AnonymousClass6UE.A05(r0)     // Catch:{ GeneralSecurityException -> 0x0055 }
        L_0x004f:
            java.lang.Integer r0 = r5.A02     // Catch:{ GeneralSecurityException -> 0x0055 }
            r13.BiT(r0, r2, r6, r1)     // Catch:{ GeneralSecurityException -> 0x0055 }
            return
        L_0x0055:
            r0 = move-exception
            X.C18740tg.A0A(r0)
            goto L_0x005f
        L_0x005a:
            r0 = move-exception
            X.C18740tg.A0A(r0)
            r5 = 0
        L_0x005f:
            r2 = r5
            goto L_0x0064
        L_0x0061:
            r7.A02(r12)
        L_0x0064:
            X.005 r0 = r11.A02
            java.lang.Object r0 = r0.get()
            X.5lw r0 = (X.C117245lw) r0
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = X.C90514aH.A0p(r12, r0)
            X.004 r0 = (X.AnonymousClass004) r0
            java.lang.Object r1 = r0.get()
            X.6CN r1 = (X.AnonymousClass6CN) r1
            X.6u9 r0 = new X.6u9
            r0.<init>(r2, r12, r13, r11)
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Mw.A01(X.6P0, X.7kQ):void");
    }

    public AnonymousClass6Mw(AnonymousClass9P1 r1, C19970wo r2, C132196Sp r3, AnonymousClass005 r4) {
        this.A00 = r2;
        this.A03 = r1;
        this.A01 = r3;
        this.A02 = r4;
    }
}
