package X;

/* renamed from: X.74l  reason: invalid class name and case insensitive filesystem */
public class C1502274l implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C1502274l(C133076Wo r2, String str, Throwable th) {
        this.A03 = 5;
        this.A00 = r2;
        this.A01 = th;
        this.A02 = str;
    }

    public static void A00(C19770wU r1, Object obj, Object obj2, String str, int i) {
        r1.Boy(new C1502274l(obj, obj2, str, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: com.whatsapp.backup.google.SettingsGoogleDrive} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v51, resolved type: com.whatsapp.backup.google.SettingsGoogleDrive} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v55, resolved type: X.4y9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v56, resolved type: com.whatsapp.backup.google.SettingsGoogleDrive} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v57, resolved type: com.whatsapp.backup.google.SettingsGoogleDrive} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v58, resolved type: com.whatsapp.backup.google.SettingsGoogleDrive} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v59, resolved type: com.whatsapp.backup.google.SettingsGoogleDrive} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        X.C1273868b.A07(r3.A01, r2, r3.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0cc6, code lost:
        if (r1 != 403) goto L_0x0cc8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0d73, code lost:
        if (r4 == 1) goto L_0x0d75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r2 = r21
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x073d;
                case 1: goto L_0x074b;
                case 2: goto L_0x076e;
                case 3: goto L_0x0589;
                case 4: goto L_0x07b0;
                case 5: goto L_0x0da8;
                case 6: goto L_0x05a4;
                case 7: goto L_0x080e;
                case 8: goto L_0x081e;
                case 9: goto L_0x082f;
                case 10: goto L_0x001f;
                case 11: goto L_0x0881;
                case 12: goto L_0x007e;
                case 13: goto L_0x08e3;
                case 14: goto L_0x096b;
                case 15: goto L_0x096b;
                case 16: goto L_0x05c0;
                case 17: goto L_0x05cc;
                case 18: goto L_0x05f3;
                case 19: goto L_0x0979;
                case 20: goto L_0x0997;
                case 21: goto L_0x0617;
                case 22: goto L_0x0007;
                case 23: goto L_0x0007;
                case 24: goto L_0x09dd;
                case 25: goto L_0x00e4;
                case 26: goto L_0x0a2c;
                case 27: goto L_0x0a4d;
                case 28: goto L_0x0180;
                case 29: goto L_0x0a6c;
                case 30: goto L_0x062f;
                case 31: goto L_0x0652;
                case 32: goto L_0x06bd;
                case 33: goto L_0x04f0;
                case 34: goto L_0x0a88;
                case 35: goto L_0x0ae8;
                case 36: goto L_0x0dcb;
                case 37: goto L_0x0b06;
                case 38: goto L_0x0b18;
                case 39: goto L_0x06de;
                case 40: goto L_0x06f2;
                case 41: goto L_0x0b4f;
                case 42: goto L_0x0b6e;
                case 43: goto L_0x0bd7;
                case 44: goto L_0x0c3e;
                case 45: goto L_0x0c5f;
                case 46: goto L_0x0542;
                case 47: goto L_0x0c87;
                case 48: goto L_0x0ccd;
                case 49: goto L_0x0716;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r2.A00
            X.6C8 r3 = (X.AnonymousClass6C8) r3
            java.lang.String r0 = r2.A02
            java.lang.Object r1 = r2.A01
            X.68b r2 = X.C1273868b.A03(r0)
            r0 = 1
            r2.A0A(r1, r0)
        L_0x0017:
            X.4vP r1 = r3.A01
            X.7ku r0 = r3.A02
            X.C1273868b.A07(r1, r2, r0)
        L_0x001e:
            return
        L_0x001f:
            java.lang.Object r4 = r2.A00
            X.4y9 r4 = (X.C101704y9) r4
            java.lang.String r5 = r2.A02
            java.lang.Object r6 = r2.A01
            java.lang.String r8 = "settings-gdrive/auth-request/user-cancelled"
            java.lang.String r3 = "settings-gdrive/auth-request"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 0Im -> 0x0875, UserRecoverableAuthException -> 0x085f, IOException -> 0x006d, 0OD | SecurityException -> 0x0848 }
            java.lang.String r0 = "settings-gdrive/auth-request asking GoogleAuthUtil for token for "
            X.C90464aC.A1I(r0, r5, r1)     // Catch:{ 0Im -> 0x0875, UserRecoverableAuthException -> 0x085f, IOException -> 0x006d, 0OD | SecurityException -> 0x0848 }
            java.lang.String r1 = "com.google"
            android.accounts.Account r0 = new android.accounts.Account     // Catch:{ 0Im -> 0x0875, UserRecoverableAuthException -> 0x085f, IOException -> 0x006d, 0OD | SecurityException -> 0x0848 }
            r0.<init>(r5, r1)     // Catch:{ 0Im -> 0x0875, UserRecoverableAuthException -> 0x085f, IOException -> 0x006d, 0OD | SecurityException -> 0x0848 }
            java.lang.String r7 = X.AnonymousClass0Z2.A03(r0, r4)     // Catch:{ 0Im -> 0x0875, UserRecoverableAuthException -> 0x085f, IOException -> 0x006d, 0OD | SecurityException -> 0x0848 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 0Im -> 0x0875, UserRecoverableAuthException -> 0x085f, IOException -> 0x006d, 0OD | SecurityException -> 0x0848 }
            java.lang.String r0 = "settings-gdrive/auth-request for account "
            X.C90474aD.A1J(r0, r5, r1)     // Catch:{ 0Im -> 0x0875, UserRecoverableAuthException -> 0x085f, IOException -> 0x006d, 0OD | SecurityException -> 0x0848 }
            java.lang.String r0 = ", token has been received."
            X.C36321k7.A1a(r1, r0)     // Catch:{ 0Im -> 0x0875, UserRecoverableAuthException -> 0x085f, IOException -> 0x006d, 0OD | SecurityException -> 0x0848 }
            boolean r0 = r4.A0S     // Catch:{ 0Im -> 0x0875, UserRecoverableAuthException -> 0x085f, IOException -> 0x006d, 0OD | SecurityException -> 0x0848 }
            if (r0 != 0) goto L_0x0063
            X.17Y r2 = r4.A05     // Catch:{ 0Im -> 0x0875, UserRecoverableAuthException -> 0x085f, IOException -> 0x006d, 0OD | SecurityException -> 0x0848 }
            r1 = 2
            X.3vK r0 = new X.3vK     // Catch:{ 0Im -> 0x0875, UserRecoverableAuthException -> 0x085f, IOException -> 0x006d, 0OD | SecurityException -> 0x0848 }
            r0.<init>(r4, r7, r5, r1)     // Catch:{ 0Im -> 0x0875, UserRecoverableAuthException -> 0x085f, IOException -> 0x006d, 0OD | SecurityException -> 0x0848 }
            r2.A0H(r0)     // Catch:{ 0Im -> 0x0875, UserRecoverableAuthException -> 0x085f, IOException -> 0x006d, 0OD | SecurityException -> 0x0848 }
        L_0x005c:
            android.os.ConditionVariable r0 = r4.A0P     // Catch:{ 0Im -> 0x0875, UserRecoverableAuthException -> 0x085f, IOException -> 0x006d, 0OD | SecurityException -> 0x0848 }
            r0.open()     // Catch:{ 0Im -> 0x0875, UserRecoverableAuthException -> 0x085f, IOException -> 0x006d, 0OD | SecurityException -> 0x0848 }
            goto L_0x0847
        L_0x0063:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 0Im -> 0x0875, UserRecoverableAuthException -> 0x085f, IOException -> 0x006d, 0OD | SecurityException -> 0x0848 }
            java.lang.String r0 = "settings-gdrive/auth-request/received-token-but-user-cancelled-the-request/"
            X.C90464aC.A1I(r0, r5, r1)     // Catch:{ 0Im -> 0x0875, UserRecoverableAuthException -> 0x085f, IOException -> 0x006d, 0OD | SecurityException -> 0x0848 }
            goto L_0x005c
        L_0x006d:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            android.os.ConditionVariable r0 = r4.A0P
            r0.open()
            boolean r0 = r4.A0S
            if (r0 != 0) goto L_0x08a7
            X.17Y r7 = r4.A05
            r0 = 5
            goto L_0x00dd
        L_0x007e:
            java.lang.Object r4 = r2.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r4 = (com.whatsapp.backup.google.SettingsGoogleDrive) r4
            java.lang.String r5 = r2.A02
            java.lang.Object r6 = r2.A01
            java.lang.String r8 = "settings-gdrive/auth-request/user-cancelled"
            java.lang.String r3 = "settings-gdrive/auth-request"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 0Im -> 0x08c6, UserRecoverableAuthException -> 0x08ab, IOException -> 0x00cc, 0OD | SecurityException -> 0x0890 }
            java.lang.String r0 = "settings-gdrive/auth-request asking GoogleAuthUtil for token for "
            X.C90464aC.A1I(r0, r5, r1)     // Catch:{ 0Im -> 0x08c6, UserRecoverableAuthException -> 0x08ab, IOException -> 0x00cc, 0OD | SecurityException -> 0x0890 }
            java.lang.String r1 = "com.google"
            android.accounts.Account r0 = new android.accounts.Account     // Catch:{ 0Im -> 0x08c6, UserRecoverableAuthException -> 0x08ab, IOException -> 0x00cc, 0OD | SecurityException -> 0x0890 }
            r0.<init>(r5, r1)     // Catch:{ 0Im -> 0x08c6, UserRecoverableAuthException -> 0x08ab, IOException -> 0x00cc, 0OD | SecurityException -> 0x0890 }
            java.lang.String r7 = X.AnonymousClass0Z2.A03(r0, r4)     // Catch:{ 0Im -> 0x08c6, UserRecoverableAuthException -> 0x08ab, IOException -> 0x00cc, 0OD | SecurityException -> 0x0890 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 0Im -> 0x08c6, UserRecoverableAuthException -> 0x08ab, IOException -> 0x00cc, 0OD | SecurityException -> 0x0890 }
            java.lang.String r0 = "settings-gdrive/auth-request for account "
            X.C90474aD.A1J(r0, r5, r1)     // Catch:{ 0Im -> 0x08c6, UserRecoverableAuthException -> 0x08ab, IOException -> 0x00cc, 0OD | SecurityException -> 0x0890 }
            java.lang.String r0 = ", token has been received."
            X.C36321k7.A1a(r1, r0)     // Catch:{ 0Im -> 0x08c6, UserRecoverableAuthException -> 0x08ab, IOException -> 0x00cc, 0OD | SecurityException -> 0x0890 }
            boolean r0 = r4.A0y     // Catch:{ 0Im -> 0x08c6, UserRecoverableAuthException -> 0x08ab, IOException -> 0x00cc, 0OD | SecurityException -> 0x0890 }
            if (r0 != 0) goto L_0x00c2
            X.17Y r2 = r4.A05     // Catch:{ 0Im -> 0x08c6, UserRecoverableAuthException -> 0x08ab, IOException -> 0x00cc, 0OD | SecurityException -> 0x0890 }
            r1 = 3
            X.3vK r0 = new X.3vK     // Catch:{ 0Im -> 0x08c6, UserRecoverableAuthException -> 0x08ab, IOException -> 0x00cc, 0OD | SecurityException -> 0x0890 }
            r0.<init>(r4, r7, r5, r1)     // Catch:{ 0Im -> 0x08c6, UserRecoverableAuthException -> 0x08ab, IOException -> 0x00cc, 0OD | SecurityException -> 0x0890 }
            r2.A0H(r0)     // Catch:{ 0Im -> 0x08c6, UserRecoverableAuthException -> 0x08ab, IOException -> 0x00cc, 0OD | SecurityException -> 0x0890 }
        L_0x00bb:
            android.os.ConditionVariable r0 = r4.A0w     // Catch:{ 0Im -> 0x08c6, UserRecoverableAuthException -> 0x08ab, IOException -> 0x00cc, 0OD | SecurityException -> 0x0890 }
            r0.open()     // Catch:{ 0Im -> 0x08c6, UserRecoverableAuthException -> 0x08ab, IOException -> 0x00cc, 0OD | SecurityException -> 0x0890 }
            goto L_0x088f
        L_0x00c2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 0Im -> 0x08c6, UserRecoverableAuthException -> 0x08ab, IOException -> 0x00cc, 0OD | SecurityException -> 0x0890 }
            java.lang.String r0 = "settings-gdrive/auth-request/received-token-but-user-cancelled-the-request/"
            X.C90464aC.A1I(r0, r5, r1)     // Catch:{ 0Im -> 0x08c6, UserRecoverableAuthException -> 0x08ab, IOException -> 0x00cc, 0OD | SecurityException -> 0x0890 }
            goto L_0x00bb
        L_0x00cc:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            android.os.ConditionVariable r0 = r4.A0w
            r0.open()
            boolean r0 = r4.A0y
            if (r0 != 0) goto L_0x08a7
            X.17Y r7 = r4.A05
            r0 = 24
        L_0x00dd:
            X.72l r2 = new X.72l
            r2.<init>(r4, r0)
            goto L_0x064e
        L_0x00e4:
            java.lang.Object r8 = r2.A00
            X.6Kc r8 = (X.C130196Kc) r8
            java.lang.String r7 = r2.A02
            java.lang.Object r6 = r2.A01
            r9 = 1
            r5 = 2
            X.AnonymousClass00C.A0D(r6, r5)
            X.67k r1 = r8.A01
            X.66j r0 = new X.66j
            r0.<init>(r1)
            java.util.List r0 = r0.A00()
            java.util.ArrayList r4 = X.C36411kG.A13(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r10 = r0.iterator()
        L_0x0108:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0175
            java.lang.Object r2 = r10.next()
            X.7g1 r2 = (X.AnonymousClass7g1) r2
            boolean r0 = r2 instanceof X.C135136cC
            if (r0 == 0) goto L_0x0138
            int r0 = r4.size()
            if (r0 >= r5) goto L_0x0108
            X.AnonymousClass00C.A0B(r2)
            boolean r0 = X.C130196Kc.A00(r2, r4)
            if (r0 != 0) goto L_0x0108
            r0 = r2
            X.6cC r0 = (X.C135136cC) r0
            java.lang.String r1 = r0.A02
        L_0x012c:
            X.0ts r0 = r8.A02
            boolean r0 = X.C53382rE.A00(r0, r1, r7)
            if (r0 == 0) goto L_0x0108
            r4.add(r2)
            goto L_0x0108
        L_0x0138:
            boolean r0 = r2 instanceof X.C135116cA
            if (r0 == 0) goto L_0x0151
            int r0 = r4.size()
            if (r0 >= r5) goto L_0x0108
            X.AnonymousClass00C.A0B(r2)
            boolean r0 = X.C130196Kc.A00(r2, r4)
            if (r0 != 0) goto L_0x0108
            r0 = r2
            X.6cA r0 = (X.C135116cA) r0
            java.lang.String r1 = r0.A01
            goto L_0x012c
        L_0x0151:
            boolean r0 = r2 instanceof X.C135126cB
            if (r0 == 0) goto L_0x0108
            int r0 = r3.size()
            if (r0 >= r9) goto L_0x0108
            boolean r0 = r3.contains(r2)
            if (r0 != 0) goto L_0x0108
            r0 = r2
            X.6cB r0 = (X.C135126cB) r0
            java.lang.String r1 = r0.A01
            X.0ts r0 = r8.A02
            boolean r0 = X.C53382rE.A00(r0, r1, r7)
            if (r0 == 0) goto L_0x0108
            X.AnonymousClass00C.A0B(r2)
            r3.add(r2)
            goto L_0x0108
        L_0x0175:
            X.17Y r7 = r8.A00
            r0 = 19
            X.74n r2 = new X.74n
            r2.<init>(r6, r4, r3, r0)
            goto L_0x064e
        L_0x0180:
            java.lang.Object r6 = r2.A00
            X.6Mq r6 = (X.C130846Mq) r6
            java.lang.Object r5 = r2.A01
            X.6DV r5 = (X.AnonymousClass6DV) r5
            java.lang.String r7 = r2.A02
            java.util.List r0 = r5.A04
            java.util.Iterator r20 = r0.iterator()
        L_0x0190:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x04e5
            java.lang.Object r4 = r20.next()
            java.util.List r4 = (java.util.List) r4
            X.6QG r1 = r5.A01
            r8 = 1
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x01b0
            java.lang.String r0 = "DirectoryBusinessRankerValueModel/fallbackToSortByDistance Falling back to ranking by distance."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 78L -> 0x04c4 }
            X.75n r0 = X.C1505075n.A00     // Catch:{ 78L -> 0x04c4 }
            java.util.Collections.sort(r4, r0)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x0190
        L_0x01b0:
            java.lang.String r2 = "server_score"
            java.lang.String r0 = "distance"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}     // Catch:{ 78L -> 0x04c4 }
            java.util.ArrayList r19 = X.C36351kA.A10(r0)     // Catch:{ 78L -> 0x04c4 }
            r11 = 0
            X.AnonymousClass00C.A0D(r7, r11)     // Catch:{ 78L -> 0x04c4 }
            X.6W9 r10 = new X.6W9     // Catch:{ 78L -> 0x04c4 }
            r10.<init>(r7)     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r2 = "_comment"
            org.json.JSONObject r0 = r10.A02     // Catch:{ 78L -> 0x04c4 }
            java.lang.Object r0 = r0.opt(r2)     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x01de
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 78L -> 0x04c4 }
            if (r0 != 0) goto L_0x01de
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r2)     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r0 = "'s value is not a String."
            X.78L r0 = X.AnonymousClass78L.A00(r0, r1)     // Catch:{ 78L -> 0x04c4 }
            throw r0     // Catch:{ 78L -> 0x04c4 }
        L_0x01de:
            java.lang.String r2 = "_version"
            org.json.JSONObject r0 = r10.A02     // Catch:{ 78L -> 0x04c4 }
            java.lang.Object r0 = r0.opt(r2)     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x01f7
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 78L -> 0x04c4 }
            if (r0 != 0) goto L_0x01f7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r2)     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r0 = "'s value is not a String."
            X.78L r0 = X.AnonymousClass78L.A00(r0, r1)     // Catch:{ 78L -> 0x04c4 }
            throw r0     // Catch:{ 78L -> 0x04c4 }
        L_0x01f7:
            org.json.JSONObject r9 = r10.A02     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r0 = "biz_value_features"
            org.json.JSONObject r13 = r9.optJSONObject(r0)     // Catch:{ 78L -> 0x04c4 }
            if (r13 == 0) goto L_0x04a0
            X.6YB r3 = r10.A04     // Catch:{ 78L -> 0x04c4 }
            java.util.ArrayList r18 = X.AnonymousClass001.A0I()     // Catch:{ 78L -> 0x04c4 }
            java.util.HashMap r14 = X.AnonymousClass001.A0J()     // Catch:{ 78L -> 0x04c4 }
            java.util.Iterator r17 = r13.keys()     // Catch:{ 78L -> 0x04c4 }
            X.AnonymousClass00C.A08(r17)     // Catch:{ 78L -> 0x04c4 }
        L_0x0212:
            boolean r0 = r17.hasNext()     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x027b
            java.lang.String r12 = X.AnonymousClass001.A0C(r17)     // Catch:{ 78L -> 0x04c4 }
            boolean r0 = r14.containsKey(r12)     // Catch:{ 78L -> 0x04c4 }
            if (r0 != 0) goto L_0x0228
            X.AnonymousClass00C.A0B(r12)     // Catch:{ 78L -> 0x04c4 }
            X.C90514aH.A1P(r12, r14)     // Catch:{ 78L -> 0x04c4 }
        L_0x0228:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r0 = "\\b"
            r2.append(r0)     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r0 = X.AnonymousClass000.A0p(r12, r0, r2)     // Catch:{ 78L -> 0x04c4 }
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r0)     // Catch:{ 78L -> 0x04c4 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ 78L -> 0x04c4 }
            java.util.Iterator r16 = r13.keys()     // Catch:{ 78L -> 0x04c4 }
            X.AnonymousClass00C.A08(r16)     // Catch:{ 78L -> 0x04c4 }
        L_0x0243:
            boolean r0 = r16.hasNext()     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x0212
            java.lang.String r15 = X.AnonymousClass001.A0C(r16)     // Catch:{ 78L -> 0x04c4 }
            java.lang.Object r0 = r13.get(r15)     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r0 = r0.toString()     // Catch:{ 78L -> 0x04c4 }
            java.util.regex.Matcher r0 = r2.matcher(r0)     // Catch:{ 78L -> 0x04c4 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ 78L -> 0x04c4 }
            boolean r0 = r0.find()     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x0243
            boolean r0 = r14.containsKey(r15)     // Catch:{ 78L -> 0x04c4 }
            if (r0 != 0) goto L_0x026e
            X.AnonymousClass00C.A0B(r15)     // Catch:{ 78L -> 0x04c4 }
            X.C90514aH.A1P(r15, r14)     // Catch:{ 78L -> 0x04c4 }
        L_0x026e:
            java.util.List r0 = X.C90524aI.A0n(r15, r14)     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x0243
            X.AnonymousClass00C.A0B(r12)     // Catch:{ 78L -> 0x04c4 }
            r0.add(r12)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x0243
        L_0x027b:
            java.util.Iterator r15 = X.C90484aE.A0s(r14)     // Catch:{ 78L -> 0x04c4 }
        L_0x027f:
            boolean r0 = r15.hasNext()     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x0296
            java.lang.String r12 = X.AnonymousClass001.A0C(r15)     // Catch:{ 78L -> 0x04c4 }
            X.AnonymousClass00C.A0B(r12)     // Catch:{ 78L -> 0x04c4 }
            java.util.HashSet r2 = X.C36441kJ.A16()     // Catch:{ 78L -> 0x04c4 }
            r0 = r18
            X.C110195aH.A00(r12, r14, r2, r0)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x027f
        L_0x0296:
            java.util.Iterator r17 = r18.iterator()     // Catch:{ 78L -> 0x04c4 }
        L_0x029a:
            boolean r0 = r17.hasNext()     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x030f
            java.lang.String r2 = X.AnonymousClass001.A0C(r17)     // Catch:{ 78L -> 0x04c4 }
            java.lang.Object r15 = r13.get(r2)     // Catch:{ 78L -> 0x04c4 }
            boolean r0 = r15 instanceof java.lang.Integer     // Catch:{ 78L -> 0x04c4 }
            if (r0 != 0) goto L_0x02b0
            boolean r0 = r15 instanceof java.lang.Double     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x02b4
        L_0x02b0:
            java.lang.String r15 = r15.toString()     // Catch:{ 78L -> 0x04c4 }
        L_0x02b4:
            boolean r0 = r15 instanceof java.lang.String     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x02fb
            boolean r0 = r2.equals(r15)     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x02c2
            X.AnonymousClass6YB.A01(r3, r2, r8)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x029a
        L_0x02c2:
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ 78L -> 0x04c4 }
            X.AnonymousClass00C.A0D(r15, r8)     // Catch:{ 78L -> 0x04c4 }
            int r16 = X.AnonymousClass6YB.A01(r3, r2, r11)     // Catch:{ 78L -> 0x04c4 }
            java.util.HashMap r12 = r3.A02     // Catch:{ 78L -> 0x04c4 }
            java.util.Vector r14 = r3.A06     // Catch:{ 78L -> 0x04c4 }
            int r0 = r14.size()     // Catch:{ 78L -> 0x04c4 }
            X.C36341k9.A1K(r2, r12, r0)     // Catch:{ 78L -> 0x04c4 }
            java.util.Vector r12 = r3.A08     // Catch:{ 78L -> 0x04c4 }
            java.util.Vector r0 = new java.util.Vector     // Catch:{ 78L -> 0x04c4 }
            r0.<init>()     // Catch:{ 78L -> 0x04c4 }
            r12.addElement(r0)     // Catch:{ 78L -> 0x04c4 }
            X.69l r12 = new X.69l     // Catch:{ 78L -> 0x04c4 }
            r12.<init>(r15)     // Catch:{ 78L -> 0x04c4 }
            int r15 = X.AnonymousClass6YB.A00(r3, r12, r2)     // Catch:{ 78L -> 0x04c4 }
            char r0 = r12.A02()     // Catch:{ 78L -> 0x04c4 }
            if (r0 != 0) goto L_0x04a8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ 78L -> 0x04c4 }
            X.011 r0 = X.C36421kH.A0j(r0, r15)     // Catch:{ 78L -> 0x04c4 }
            r14.add(r0)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x029a
        L_0x02fb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r0 = "Feature "
            r1.append(r0)     // Catch:{ 78L -> 0x04c4 }
            r1.append(r2)     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r0 = " has unexpected type."
            X.78L r1 = X.AnonymousClass78L.A00(r0, r1)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x04c3
        L_0x030f:
            java.lang.String r0 = "biz_multiply_values"
            org.json.JSONObject r12 = r9.optJSONObject(r0)     // Catch:{ 78L -> 0x04c4 }
            if (r12 == 0) goto L_0x0498
            java.lang.String r0 = "base_values"
            org.json.JSONObject r2 = r12.optJSONObject(r0)     // Catch:{ 78L -> 0x04c4 }
            if (r2 == 0) goto L_0x0490
            java.util.HashMap r0 = r10.A05     // Catch:{ 78L -> 0x04c4 }
            java.util.Vector r0 = X.AnonymousClass6W9.A00(r10, r0, r2)     // Catch:{ 78L -> 0x04c4 }
            r10.A00 = r0     // Catch:{ 78L -> 0x04c4 }
            java.util.Vector r0 = X.AnonymousClass6W9.A01(r10, r12, r8)     // Catch:{ 78L -> 0x04c4 }
            r10.A01 = r0     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r0 = "sort_strategy"
            java.lang.Object r2 = r9.opt(r0)     // Catch:{ 78L -> 0x04c4 }
            if (r2 == 0) goto L_0x0488
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x0480
            java.lang.String r0 = "asc"
            boolean r0 = r2.equals(r0)     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x0343
            r0 = 0
            goto L_0x034c
        L_0x0343:
            java.lang.String r0 = "desc"
            boolean r0 = r2.equals(r0)     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x0470
            r0 = 1
        L_0x034c:
            r10.A03 = r0     // Catch:{ 78L -> 0x04c4 }
            java.util.HashSet r9 = X.C36441kJ.A16()     // Catch:{ 78L -> 0x04c4 }
            java.util.Vector r12 = r3.A09     // Catch:{ 78L -> 0x04c4 }
            r12.clear()     // Catch:{ 78L -> 0x04c4 }
            java.util.Iterator r15 = r19.iterator()     // Catch:{ 78L -> 0x04c4 }
            r13 = 0
        L_0x035c:
            boolean r0 = r15.hasNext()     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x03ad
            int r14 = r13 + 1
            java.lang.String r2 = X.AnonymousClass001.A0C(r15)     // Catch:{ 78L -> 0x04c4 }
            java.util.HashSet r0 = r3.A04     // Catch:{ 78L -> 0x04c4 }
            boolean r0 = r0.contains(r2)     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x039c
            boolean r0 = r9.contains(r2)     // Catch:{ 78L -> 0x04c4 }
            if (r0 != 0) goto L_0x038b
            java.util.HashMap r0 = r3.A03     // Catch:{ 78L -> 0x04c4 }
            X.AnonymousClass00C.A0D(r0, r11)     // Catch:{ 78L -> 0x04c4 }
            java.lang.Object r0 = X.C000200c.A00(r2, r0)     // Catch:{ 78L -> 0x04c4 }
            X.011 r0 = X.C36421kH.A0j(r0, r13)     // Catch:{ 78L -> 0x04c4 }
            r12.add(r0)     // Catch:{ 78L -> 0x04c4 }
            r9.add(r2)     // Catch:{ 78L -> 0x04c4 }
            r13 = r14
            goto L_0x035c
        L_0x038b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r0 = "inputOrder contains multiple occurrences of extracted feature "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)     // Catch:{ 78L -> 0x04c4 }
            X.78L r1 = new X.78L     // Catch:{ 78L -> 0x04c4 }
            r1.<init>(r0)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x04c3
        L_0x039c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r0 = "inputOrder contains undeclared symbol "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)     // Catch:{ 78L -> 0x04c4 }
            X.78L r1 = new X.78L     // Catch:{ 78L -> 0x04c4 }
            r1.<init>(r0)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x04c3
        L_0x03ad:
            java.util.HashSet r0 = r3.A05     // Catch:{ 78L -> 0x04c4 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ 78L -> 0x04c4 }
        L_0x03b3:
            boolean r0 = r3.hasNext()     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x03d7
            java.lang.String r2 = X.AnonymousClass001.A0C(r3)     // Catch:{ 78L -> 0x04c4 }
            boolean r0 = r9.contains(r2)     // Catch:{ 78L -> 0x04c4 }
            if (r0 != 0) goto L_0x03b3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r0 = "Required extracted feature "
            r1.append(r0)     // Catch:{ 78L -> 0x04c4 }
            r1.append(r2)     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r0 = " is not provided in inputOrder"
            X.78L r1 = X.AnonymousClass78L.A00(r0, r1)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x04c3
        L_0x03d7:
            boolean r0 = r1.A04()     // Catch:{ 78L -> 0x04c4 }
            r12 = 2
            if (r0 == 0) goto L_0x040a
            java.util.Iterator r3 = r4.iterator()     // Catch:{ 78L -> 0x04c4 }
        L_0x03e2:
            boolean r0 = r3.hasNext()     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x045e
            java.lang.Object r2 = r3.next()     // Catch:{ 78L -> 0x04c4 }
            X.7lL r2 = (X.C160637lL) r2     // Catch:{ 78L -> 0x04c4 }
            java.lang.Double[] r1 = new java.lang.Double[r12]     // Catch:{ 78L -> 0x04c4 }
            java.lang.Double r0 = r2.BG8()     // Catch:{ 78L -> 0x04c4 }
            r1[r11] = r0     // Catch:{ 78L -> 0x04c4 }
            java.lang.Double r0 = X.C130846Mq.A03     // Catch:{ 78L -> 0x04c4 }
            r1[r8] = r0     // Catch:{ 78L -> 0x04c4 }
            java.util.ArrayList r0 = X.C36351kA.A10(r1)     // Catch:{ 78L -> 0x04c4 }
            double r0 = r10.A03(r0)     // Catch:{ 78L -> 0x04c4 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ 78L -> 0x04c4 }
            r2.Brg(r0)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x03e2
        L_0x040a:
            java.lang.Double r0 = r1.A03     // Catch:{ 78L -> 0x04c4 }
            X.C18740tg.A06(r0)     // Catch:{ 78L -> 0x04c4 }
            double r2 = r0.doubleValue()     // Catch:{ 78L -> 0x04c4 }
            java.lang.Double r0 = r1.A04     // Catch:{ 78L -> 0x04c4 }
            X.C18740tg.A06(r0)     // Catch:{ 78L -> 0x04c4 }
            double r0 = r0.doubleValue()     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r13 = ""
            android.location.Location r9 = new android.location.Location     // Catch:{ 78L -> 0x04c4 }
            r9.<init>(r13)     // Catch:{ 78L -> 0x04c4 }
            r9.setLatitude(r2)     // Catch:{ 78L -> 0x04c4 }
            r9.setLongitude(r0)     // Catch:{ 78L -> 0x04c4 }
            java.util.Iterator r13 = r4.iterator()     // Catch:{ 78L -> 0x04c4 }
        L_0x042d:
            boolean r0 = r13.hasNext()     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x045e
            java.lang.Object r2 = r13.next()     // Catch:{ 78L -> 0x04c4 }
            X.7lL r2 = (X.C160637lL) r2     // Catch:{ 78L -> 0x04c4 }
            r2.B2B(r9)     // Catch:{ 78L -> 0x04c4 }
            java.lang.Double[] r3 = new java.lang.Double[r12]     // Catch:{ 78L -> 0x04c4 }
            java.lang.Double r0 = r2.BG8()     // Catch:{ 78L -> 0x04c4 }
            r3[r11] = r0     // Catch:{ 78L -> 0x04c4 }
            double r0 = r2.BBC()     // Catch:{ 78L -> 0x04c4 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ 78L -> 0x04c4 }
            r3[r8] = r0     // Catch:{ 78L -> 0x04c4 }
            java.util.ArrayList r0 = X.C36351kA.A10(r3)     // Catch:{ 78L -> 0x04c4 }
            double r0 = r10.A03(r0)     // Catch:{ 78L -> 0x04c4 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ 78L -> 0x04c4 }
            r2.Brg(r0)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x042d
        L_0x045e:
            boolean r0 = r10.A03     // Catch:{ 78L -> 0x04c4 }
            if (r0 == 0) goto L_0x0469
            X.75o r0 = X.C1505175o.A00     // Catch:{ 78L -> 0x04c4 }
            java.util.Collections.sort(r4, r0)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x0190
        L_0x0469:
            X.75p r0 = X.C1505275p.A00     // Catch:{ 78L -> 0x04c4 }
            java.util.Collections.sort(r4, r0)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x0190
        L_0x0470:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r0 = "sort_strategy has unexpected value: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)     // Catch:{ 78L -> 0x04c4 }
            X.78L r1 = new X.78L     // Catch:{ 78L -> 0x04c4 }
            r1.<init>(r0)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x04c3
        L_0x0480:
            java.lang.String r0 = "sort_strategy's value is not a String."
            X.78L r1 = new X.78L     // Catch:{ 78L -> 0x04c4 }
            r1.<init>(r0)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x04c3
        L_0x0488:
            java.lang.String r0 = "sort_strategy missing from config file."
            X.78L r1 = new X.78L     // Catch:{ 78L -> 0x04c4 }
            r1.<init>(r0)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x04c3
        L_0x0490:
            java.lang.String r0 = "base_values missing in biz_multiply_values in config file."
            X.78L r1 = new X.78L     // Catch:{ 78L -> 0x04c4 }
            r1.<init>(r0)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x04c3
        L_0x0498:
            java.lang.String r0 = "biz_multiply_values missing from config file."
            X.78L r1 = new X.78L     // Catch:{ 78L -> 0x04c4 }
            r1.<init>(r0)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x04c3
        L_0x04a0:
            java.lang.String r0 = "biz_value_features missing from config file."
            X.78L r1 = new X.78L     // Catch:{ 78L -> 0x04c4 }
            r1.<init>(r0)     // Catch:{ 78L -> 0x04c4 }
            goto L_0x04c3
        L_0x04a8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r0 = "Unexpected character '"
            r1.append(r0)     // Catch:{ 78L -> 0x04c4 }
            char r0 = r12.A02()     // Catch:{ 78L -> 0x04c4 }
            r1.append(r0)     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r0 = "' found at index "
            X.C1277369l.A01(r12, r0, r2, r1)     // Catch:{ 78L -> 0x04c4 }
            java.lang.String r0 = "'s expression"
            X.78L r1 = X.AnonymousClass78L.A00(r0, r1)     // Catch:{ 78L -> 0x04c4 }
        L_0x04c3:
            throw r1     // Catch:{ 78L -> 0x04c4 }
        L_0x04c4:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "DirectoryBusinessRankerValueModel/rankUsingConfig Failed with exception message: "
            X.C36321k7.A1W(r0, r1, r3)
            X.0wN r2 = r6.A00
            java.lang.String r1 = r3.getMessage()
            java.lang.String r0 = "DirectoryBusinessRankerValueModel/rankUsingConfig Value model parsing failed"
            r2.A0E(r0, r1, r8)
            java.lang.String r0 = "DirectoryBusinessRankerValueModel/fallbackToSortByDistance Falling back to ranking by distance."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.75n r0 = X.C1505075n.A00
            java.util.Collections.sort(r4, r0)
            goto L_0x0190
        L_0x04e5:
            X.17Y r7 = r6.A01
            r0 = 22
            X.72m r2 = new X.72m
            r2.<init>(r5, r0)
            goto L_0x064e
        L_0x04f0:
            java.lang.Object r5 = r2.A00
            X.6YM r5 = (X.AnonymousClass6YM) r5
            java.lang.Object r4 = r2.A01
            X.11F r4 = (X.AnonymousClass11F) r4
            java.lang.String r6 = r2.A02
            X.1Jh r1 = r5.A2q
            X.12P r0 = r1.A04
            X.1M0 r2 = r0.A05()
            X.163 r0 = r1.A02     // Catch:{ all -> 0x0e27 }
            long r0 = r0.A08(r4)     // Catch:{ all -> 0x0e27 }
            r9 = 1
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x0e27 }
            r11.<init>(r9)     // Catch:{ all -> 0x0e27 }
            java.lang.String r8 = "is_upcoming"
            r7 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0e27 }
            r11.put(r8, r3)     // Catch:{ all -> 0x0e27 }
            java.lang.String r13 = "key_chat_row_id = ? AND key_id = ?"
            X.14e r10 = r2.A02     // Catch:{ all -> 0x0e27 }
            java.lang.String r12 = "scheduled_calls"
            java.lang.String[] r15 = X.C36441kJ.A1S()     // Catch:{ all -> 0x0e27 }
            X.C36351kA.A1V(r15, r7, r0)     // Catch:{ all -> 0x0e27 }
            r15[r9] = r6     // Catch:{ all -> 0x0e27 }
            java.lang.String r14 = "ScheduledCallsStore/UPDATE_IS_UPCOMING_SCHEDULED_CALL_BY_KEY_ID_CHAT_JID"
            int r0 = r10.A01(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0e27 }
            if (r0 != 0) goto L_0x0534
            java.lang.String r0 = "ScheduledCallsStore/updateScheduledCallIsUpcomingToFalse (by key ID and chat JID) failed to update"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0e27 }
        L_0x0534:
            r2.close()
            X.17Y r7 = r5.A28
            r0 = 32
            X.74l r2 = new X.74l
            r2.<init>(r5, r4, r6, r0)
            goto L_0x064e
        L_0x0542:
            java.lang.Object r3 = r2.A00
            com.whatsapp.deeplink.DeepLinkActivity r3 = (com.whatsapp.deeplink.DeepLinkActivity) r3
            java.lang.String r1 = r2.A02
            java.lang.Object r2 = r2.A01
            android.net.Uri r2 = (android.net.Uri) r2
            if (r1 == 0) goto L_0x057c
            X.16E r0 = r3.A0c
            int r7 = r0.A05()
            X.16E r0 = r3.A0c
            java.util.ArrayList r5 = r0.A0A()
            X.16E r0 = r3.A0c
            java.util.ArrayList r6 = r0.A0B()
            r8 = 0
            X.3XT r4 = new X.3XT
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r0 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.content.Intent r1 = X.AnonymousClass190.A0V(r3, r4, r0, r1)
        L_0x0571:
            X.17Y r7 = r3.A05
            r0 = 26
            X.3wc r2 = new X.3wc
            r2.<init>(r3, r1, r0)
            goto L_0x064e
        L_0x057c:
            android.content.Intent r1 = X.AnonymousClass190.A07(r3)
            java.lang.String r0 = "android.intent.action.VIEW"
            r1.setAction(r0)
            r1.setData(r2)
            goto L_0x0571
        L_0x0589:
            java.lang.Object r3 = r2.A00
            X.74w r3 = (X.C1503374w) r3
            java.lang.Object r0 = r3.A00
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r0 = (androidx.sharetarget.ShortcutInfoCompatSaverImpl) r0
            java.util.Map r1 = r0.A03
            java.lang.String r0 = r2.A02
            r1.remove(r0)
            java.lang.Object r1 = r2.A01
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            boolean r0 = r1.isCancelled()
            if (r0 != 0) goto L_0x001e
            goto L_0x0db9
        L_0x05a4:
            java.lang.Object r0 = r2.A00
            java.util.Iterator r4 = X.C90494aF.A0h(r0)
        L_0x05aa:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r3 = r4.next()
            X.7m6 r3 = (X.C161067m6) r3
            java.lang.Object r1 = r2.A01
            X.9ug r1 = (X.C207179ug) r1
            java.lang.String r0 = r2.A02
            r3.BdP(r1, r0)
            goto L_0x05aa
        L_0x05c0:
            java.lang.Object r0 = r2.A00
            X.AI7 r0 = (X.AI7) r0
            X.1cK r0 = r0.A00
            if (r0 == 0) goto L_0x001e
            r0.BYZ()
            return
        L_0x05cc:
            java.lang.Object r4 = r2.A00
            X.9dH r4 = (X.C198329dH) r4
            java.lang.Object r3 = r2.A01
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            java.lang.String r2 = r2.A02
            X.6VE r1 = r4.A0E     // Catch:{ Exception -> 0x05e9 }
            r1.A07(r3, r2)     // Catch:{ Exception -> 0x05e9 }
            X.00s r0 = r4.A03     // Catch:{ Exception -> 0x05e9 }
            if (r0 == 0) goto L_0x05e2
            r0.A0C(r2)     // Catch:{ Exception -> 0x05e9 }
        L_0x05e2:
            X.6MH r0 = r4.A0D     // Catch:{ Exception -> 0x05e9 }
            X.C129356Gp.A01(r0, r1, r3)     // Catch:{ Exception -> 0x05e9 }
            goto L_0x0dc7
        L_0x05e9:
            X.00s r1 = r4.A06
            if (r1 == 0) goto L_0x001e
            java.lang.Boolean r0 = X.C36371kC.A0m()
            goto L_0x0e20
        L_0x05f3:
            java.lang.Object r1 = r2.A00
            X.9lS r1 = (X.C202279lS) r1
            java.lang.Object r3 = r2.A01
            X.9NZ r3 = (X.AnonymousClass9NZ) r3
            java.lang.String r2 = r2.A02
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.util.List r0 = r1.A0N
            java.util.Iterator r1 = X.C90474aD.A0r(r0)
        L_0x0607:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r1.next()
            X.7j1 r0 = (X.C159227j1) r0
            r0.BXo(r3, r2)
            goto L_0x0607
        L_0x0617:
            java.lang.Object r3 = r2.A00
            X.6C8 r3 = (X.AnonymousClass6C8) r3
            java.lang.String r1 = r2.A02
            java.lang.Object r0 = r2.A01
            java.util.Map r0 = (java.util.Map) r0
            X.68b r2 = X.C1273868b.A03(r1)
            r1 = 1
            java.util.HashMap r0 = X.C129386Gs.A01(r0)
            r2.A0A(r0, r1)
            goto L_0x0017
        L_0x062f:
            java.lang.Object r4 = r2.A00
            com.whatsapp.calling.callhistory.CallLogActivity r4 = (com.whatsapp.calling.callhistory.CallLogActivity) r4
            java.lang.String r3 = r2.A02
            java.lang.Object r0 = r2.A01
            X.5Nh r0 = (X.C107265Nh) r0
            X.1Jh r1 = r4.A0P
            com.whatsapp.jid.GroupJid r0 = r0.A0D
            X.3KV r0 = r1.A02(r0, r3)
            r4.A0O = r0
            if (r0 == 0) goto L_0x001e
            X.17Y r7 = r4.A05
            r0 = 11
            X.74e r2 = new X.74e
            r2.<init>(r4, r0)
        L_0x064e:
            r7.A0H(r2)
            return
        L_0x0652:
            java.lang.Object r4 = r2.A00
            X.6Ts r4 = (X.AnonymousClass6Ts) r4
            java.lang.Object r3 = r2.A01
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            java.lang.String r1 = r2.A02
            X.1HO r0 = r4.A07
            X.5Ng r6 = r0.A03(r3)
            if (r6 == 0) goto L_0x001e
            java.lang.String r5 = r6.A00
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L_0x001e
            X.0wN r2 = r4.A00
            r1 = 0
            java.lang.String r0 = "linked-group-call/downgrade-ongoing-call"
            r3 = 0
            r2.A0E(r0, r3, r1)
            X.1HJ r2 = r4.A06
            long r0 = r6.A02()
            X.5Nh r1 = r2.A06(r0)
            if (r1 == 0) goto L_0x001e
            monitor-enter(r6)
            com.whatsapp.jid.GroupJid r0 = r6.A02     // Catch:{ all -> 0x0dc8 }
            boolean r0 = X.C1901797e.A00(r0, r3)     // Catch:{ all -> 0x0dc8 }
            if (r0 != 0) goto L_0x068f
            r6.A02 = r3     // Catch:{ all -> 0x0dc8 }
            r6.A03()     // Catch:{ all -> 0x0dc8 }
        L_0x068f:
            monitor-exit(r6)
            r1.A0J(r3)
            r1.A0L(r6)
            r2.A09(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoiceService/maybeClearCallLogWithSameGroupJid Cleaning up zombie call: "
            X.C36321k7.A1Q(r0, r5, r1)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.lang.String r0 = X.C34681hT.A08(r5)
            r3.add(r0)
            X.6YM r0 = r4.A03
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r0.A1E
            if (r2 == 0) goto L_0x001e
            r1 = 4
            X.74i r0 = new X.74i
            r0.<init>(r4, r3, r1)
            r2.execute(r0)
            return
        L_0x06bd:
            java.lang.Object r0 = r2.A00
            X.6YM r0 = (X.AnonymousClass6YM) r0
            java.lang.Object r4 = r2.A01
            X.11F r4 = (X.AnonymousClass11F) r4
            java.lang.String r3 = r2.A02
            X.1bA r0 = r0.A30
            r2 = 1
            java.util.Iterator r1 = X.C36361kB.A0s(r0)
        L_0x06ce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r1.next()
            X.1hR r0 = (X.C34661hR) r0
            r0.Azj(r4, r3, r2)
            goto L_0x06ce
        L_0x06de:
            java.lang.Object r0 = r2.A00
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r3 = r2.A01
            X.07B r3 = (X.AnonymousClass07B) r3
            java.lang.String r1 = r2.A02
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x001e
            r3.A0Q(r1)
            return
        L_0x06f2:
            java.lang.Object r4 = r2.A00
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r4 = (com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel) r4
            java.lang.Object r3 = r2.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            java.lang.String r0 = r2.A02
            X.1A1 r1 = r4.A05
            X.3Qa r0 = X.C90504aG.A0T(r3, r0)
            X.3T1 r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x001e
            X.60t r2 = r4.A04
            long r0 = r0.A1N
            java.lang.Integer r1 = r2.A00(r0)
            X.00s r0 = r4.A01
            r0.A0C(r1)
            return
        L_0x0716:
            java.lang.Object r0 = r2.A00
            X.3pB r0 = (X.C76623pB) r0
            java.lang.String r4 = r2.A02
            java.lang.Object r3 = r2.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            X.36w r2 = r0.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ChatSupportTicketManager/contactSupport/onSuccess called, ticketId="
            X.C36321k7.A1Q(r0, r4, r1)
            X.4U7 r0 = r2.A00
            r0.BTT(r3)
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x001e
            X.3E6 r0 = r2.A01
            X.0wU r1 = r0.A01
            r0 = 1
            X.C36421kH.A1H(r1, r2, r4, r0)
            return
        L_0x073d:
            java.lang.Object r3 = r2.A00
            androidx.car.app.CarAppBinder r3 = (androidx.car.app.CarAppBinder) r3
            java.lang.String r1 = r2.A02
            java.lang.Object r0 = r2.A01
            androidx.car.app.IOnDoneCallback r0 = (androidx.car.app.IOnDoneCallback) r0
            r3.m19lambda$getManager$7$androidxcarappCarAppBinder(r1, r0)
            return
        L_0x074b:
            java.lang.Object r4 = r2.A00
            androidx.car.app.IOnDoneCallback r4 = (androidx.car.app.IOnDoneCallback) r4
            java.lang.String r3 = r2.A02
            java.lang.Object r0 = r2.A01
            X.7dU r0 = (X.AnonymousClass7dU) r0
            r0.B5f()     // Catch:{ RuntimeException -> 0x0765, 5VC -> 0x0760 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ RuntimeException -> 0x0765, 5VC -> 0x0760 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0765, 5VC -> 0x0760 }
            throw r1     // Catch:{ RuntimeException -> 0x0765, 5VC -> 0x0760 }
        L_0x0760:
            r0 = move-exception
            X.C132496Ty.A02(r4, r3, r0)
            return
        L_0x0765:
            r0 = move-exception
            X.C132496Ty.A02(r4, r3, r0)
            java.lang.RuntimeException r1 = X.AnonymousClass001.A0B(r0)
            throw r1
        L_0x076e:
            java.lang.Object r0 = r2.A00
            X.01M r0 = (X.AnonymousClass01M) r0
            java.lang.Object r5 = r2.A01
            X.7dU r5 = (X.AnonymousClass7dU) r5
            java.lang.String r4 = r2.A02
            java.lang.String r3 = "CarApp.Dispatch"
            if (r0 == 0) goto L_0x0793
            X.01N r0 = (X.AnonymousClass01N) r0     // Catch:{ 5VC -> 0x07a1 }
            X.01P r1 = r0.A02     // Catch:{ 5VC -> 0x07a1 }
            X.01P r0 = X.AnonymousClass01P.CREATED     // Catch:{ 5VC -> 0x07a1 }
            int r0 = r1.compareTo(r0)     // Catch:{ 5VC -> 0x07a1 }
            if (r0 < 0) goto L_0x0793
            r5.B5f()     // Catch:{ 5VC -> 0x07a1 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ 5VC -> 0x07a1 }
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)     // Catch:{ 5VC -> 0x07a1 }
            throw r1     // Catch:{ 5VC -> 0x07a1 }
        L_0x0793:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5VC -> 0x07a1 }
            java.lang.String r0 = "Lifecycle is not at least created when dispatching "
            java.lang.String r0 = X.AnonymousClass000.A0l(r5, r0, r1)     // Catch:{ 5VC -> 0x07a1 }
            android.util.Log.w(r3, r0)     // Catch:{ 5VC -> 0x07a1 }
            return
        L_0x07a1:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Serialization failure in "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r1)
            android.util.Log.e(r3, r0, r2)
            return
        L_0x07b0:
            java.lang.Object r5 = r2.A01
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.lang.String r3 = r2.A02
            java.lang.String r4 = "ShortcutInfoCompatSaver"
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0807
            java.io.File r0 = X.C90524aI.A0S(r3)     // Catch:{ IOException | OutOfMemoryError | RuntimeException -> 0x07f2 }
            java.io.FileOutputStream r2 = X.C90524aI.A0W(r0)     // Catch:{ IOException | OutOfMemoryError | RuntimeException -> 0x07f2 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x07e8 }
            r0 = 100
            boolean r0 = r5.compress(r1, r0, r2)     // Catch:{ all -> 0x07e8 }
            if (r0 == 0) goto L_0x07d4
            r2.close()     // Catch:{ IOException | OutOfMemoryError | RuntimeException -> 0x07f2 }
            return
        L_0x07d4:
            java.lang.String r0 = "Unable to compress bitmap"
            android.util.Log.wtf(r4, r0)     // Catch:{ all -> 0x07e8 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x07e8 }
            java.lang.String r0 = "Unable to compress bitmap for saving "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)     // Catch:{ all -> 0x07e8 }
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)     // Catch:{ all -> 0x07e8 }
            throw r0     // Catch:{ all -> 0x07e8 }
        L_0x07e8:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x07ed }
            goto L_0x07f1
        L_0x07ed:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | OutOfMemoryError | RuntimeException -> 0x07f2 }
        L_0x07f1:
            throw r1     // Catch:{ IOException | OutOfMemoryError | RuntimeException -> 0x07f2 }
        L_0x07f2:
            r2 = move-exception
            java.lang.String r0 = "Unable to write bitmap to file"
            android.util.Log.wtf(r4, r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unable to write bitmap to file "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)
            java.lang.RuntimeException r1 = X.C90524aI.A0e(r0, r2)
            throw r1
        L_0x0807:
            java.lang.String r0 = "path is empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x080e:
            java.lang.Object r0 = r2.A00
            X.4rb r0 = (X.C98544rb) r0
            java.lang.Object r3 = r2.A01
            X.9ug r3 = (X.C207179ug) r3
            java.lang.String r1 = r2.A02
            X.A2g r0 = r0.A00
            r0.BdP(r3, r1)
            return
        L_0x081e:
            java.lang.Object r4 = r2.A00
            X.6WZ r4 = (X.AnonymousClass6WZ) r4
            java.lang.String r3 = r2.A02
            java.lang.Object r1 = r2.A01
            X.69S r0 = new X.69S
            r0.<init>(r3, r1)
            r4.A07(r0)
            return
        L_0x082f:
            java.lang.Object r1 = r2.A00
            com.whatsapp.VoiceMessagingService r1 = (com.whatsapp.VoiceMessagingService) r1
            java.lang.Object r0 = r2.A01
            java.lang.String r5 = r2.A02
            X.1X4 r1 = r1.A06
            java.util.List r6 = java.util.Collections.singletonList(r0)
            r2 = 0
            r8 = 0
            r4 = r2
            r7 = r2
            r9 = 0
            r3 = r2
            r1.A0I(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0847:
            return
        L_0x0848:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            android.os.ConditionVariable r0 = r4.A0P
            r0.open()
            boolean r0 = r4.A0S
            if (r0 != 0) goto L_0x08a7
            X.17Y r3 = r4.A05
            r0 = 13
            X.751 r2 = new X.751
            r2.<init>(r0, r5, r4)
            goto L_0x0871
        L_0x085f:
            r1 = move-exception
            boolean r0 = r4.A0S
            android.os.ConditionVariable r2 = r4.A0P
            if (r0 != 0) goto L_0x08c2
            r2.close()
            X.17Y r3 = r4.A05
            r0 = 6
            X.AVa r2 = new X.AVa
            r2.<init>(r4, r1, r0)
        L_0x0871:
            r3.A0H(r2)
            return
        L_0x0875:
            r3 = move-exception
            boolean r0 = r4.A0S
            if (r0 == 0) goto L_0x087d
            android.os.ConditionVariable r0 = r4.A0P
            goto L_0x08cd
        L_0x087d:
            X.17Y r2 = r4.A05
            r1 = 4
            goto L_0x08da
        L_0x0881:
            java.lang.Object r3 = r2.A00
            X.4y9 r3 = (X.C101704y9) r3
            java.lang.String r1 = r2.A02
            java.lang.Object r0 = r2.A01
            com.whatsapp.backup.google.BaseNewUserSetupActivity$AuthRequestDialogFragment r0 = (com.whatsapp.backup.google.BaseNewUserSetupActivity$AuthRequestDialogFragment) r0
            X.C101704y9.A0I(r0, r3, r1)
            return
        L_0x088f:
            return
        L_0x0890:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            android.os.ConditionVariable r0 = r4.A0w
            r0.open()
            boolean r0 = r4.A0y
            if (r0 != 0) goto L_0x08a7
            X.17Y r3 = r4.A05
            r0 = 19
            X.751 r2 = new X.751
            r2.<init>(r0, r5, r4)
            goto L_0x08be
        L_0x08a7:
            com.whatsapp.util.Log.i((java.lang.String) r8)
            return
        L_0x08ab:
            r1 = move-exception
            boolean r0 = r4.A0y
            android.os.ConditionVariable r2 = r4.A0w
            if (r0 != 0) goto L_0x08c2
            r2.close()
            X.17Y r3 = r4.A05
            r0 = 12
            X.AVa r2 = new X.AVa
            r2.<init>(r4, r1, r0)
        L_0x08be:
            r3.A0H(r2)
            return
        L_0x08c2:
            r2.open()
            return
        L_0x08c6:
            r3 = move-exception
            boolean r0 = r4.A0y
            if (r0 == 0) goto L_0x08d6
            android.os.ConditionVariable r0 = r4.A0w
        L_0x08cd:
            r0.open()
        L_0x08d0:
            java.lang.String r0 = "settings-gdrive/gps-unavailable"
            com.whatsapp.util.Log.e(r0, r3)
            return
        L_0x08d6:
            X.17Y r2 = r4.A05
            r1 = 14
        L_0x08da:
            X.AVa r0 = new X.AVa
            r0.<init>(r4, r6, r1)
            r2.A0H(r0)
            goto L_0x08d0
        L_0x08e3:
            java.lang.Object r12 = r2.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r12 = (com.whatsapp.backup.google.SettingsGoogleDrive) r12
            java.lang.String r3 = r2.A02
            java.lang.Object r5 = r2.A01
            com.whatsapp.backup.google.SettingsGoogleDrive$AuthRequestDialogFragment r5 = (com.whatsapp.backup.google.SettingsGoogleDrive.AuthRequestDialogFragment) r5
            java.lang.String r4 = "authAccount"
            android.accounts.AccountManager r0 = android.accounts.AccountManager.get(r12)
            java.lang.String r8 = "com.google"
            android.accounts.Account[] r7 = r0.getAccountsByType(r8)
            int r6 = r7.length
            r1 = 0
            r2 = 0
        L_0x08fc:
            if (r2 >= r6) goto L_0x0915
            r0 = r7[r2]
            java.lang.String r0 = r0.name
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L_0x0912
            r0 = 1
        L_0x0909:
            X.C18740tg.A06(r3)
            if (r0 == 0) goto L_0x0917
            com.whatsapp.backup.google.SettingsGoogleDrive.A0G(r5, r12, r3)
            return
        L_0x0912:
            int r2 = r2 + 1
            goto L_0x08fc
        L_0x0915:
            r0 = 0
            goto L_0x0909
        L_0x0917:
            android.accounts.AccountManager r7 = android.accounts.AccountManager.get(r12)
            r9 = 0
            r11 = r9
            r13 = r9
            r14 = r9
            r10 = r9
            android.accounts.AccountManagerFuture r0 = r7.addAccount(r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r2 = r0.getResult()     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0964 }
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0964 }
            boolean r0 = r2.containsKey(r4)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0964 }
            if (r0 != 0) goto L_0x0936
            java.lang.String r0 = "settings-gdrive/error-during-media-restore/account-manager-returned-with-no-account-name"
        L_0x0932:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0964 }
            goto L_0x0957
        L_0x0936:
            java.lang.Object r0 = r2.get(r4)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0964 }
            boolean r0 = r3.equals(r0)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0964 }
            if (r0 != 0) goto L_0x0958
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0964 }
            java.lang.String r0 = "settings-gdrive/error-during-media-restore/account-manager user added "
            r1.append(r0)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0964 }
            java.lang.Object r0 = r2.get(r4)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0964 }
            r1.append(r0)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0964 }
            java.lang.String r0 = " instead of "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0964 }
            goto L_0x0932
        L_0x0957:
            return
        L_0x0958:
            int r1 = com.whatsapp.backup.google.SettingsGoogleDrive.A01(r12, r1)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0964 }
            r0 = 1
            com.whatsapp.backup.google.SettingsGoogleDrive.A0M(r12, r9, r9, r1, r0)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0964 }
            com.whatsapp.backup.google.SettingsGoogleDrive.A0G(r5, r12, r3)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0964 }
            return
        L_0x0964:
            r1 = move-exception
            java.lang.String r0 = "settings-gdrive/error-during-media-restore"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x096b:
            java.lang.Object r3 = r2.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r3 = (com.whatsapp.backup.google.SettingsGoogleDrive) r3
            java.lang.String r1 = r2.A02
            java.lang.Object r0 = r2.A01
            com.whatsapp.backup.google.SettingsGoogleDrive$AuthRequestDialogFragment r0 = (com.whatsapp.backup.google.SettingsGoogleDrive.AuthRequestDialogFragment) r0
            com.whatsapp.backup.google.SettingsGoogleDrive.A0G(r0, r3, r1)
            return
        L_0x0979:
            java.lang.Object r5 = r2.A00
            X.9HK r5 = (X.AnonymousClass9HK) r5
            java.lang.Object r4 = r2.A01
            java.util.concurrent.Future r4 = (java.util.concurrent.Future) r4
            java.lang.String r3 = r2.A02
            r1 = 32000(0x7d00, double:1.581E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x098a, all -> 0x0990 }
            r4.get(r1, r0)     // Catch:{ Exception -> 0x098a, all -> 0x0990 }
        L_0x098a:
            java.util.Hashtable r0 = r5.A00
            r0.remove(r3)
            return
        L_0x0990:
            r1 = move-exception
            java.util.Hashtable r0 = r5.A00
            r0.remove(r3)
            throw r1
        L_0x0997:
            java.lang.Object r3 = r2.A00
            com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment r3 = (com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment) r3
            java.lang.String r1 = r2.A02
            java.lang.Object r2 = r2.A01
            android.view.View r2 = (android.view.View) r2
            X.AnonymousClass00C.A0B(r2)
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r1 = X.C222813r.A01(r1)
            X.16D r0 = r3.A04
            if (r0 == 0) goto L_0x09d6
            X.141 r4 = r0.A0D(r1)
            r0 = 2131433290(0x7f0b174a, float:1.8488362E38)
            android.view.View r6 = r2.findViewById(r0)
            r0 = 2131433292(0x7f0b174c, float:1.8488366E38)
            android.view.View r5 = r2.findViewById(r0)
            X.17Y r0 = r3.A02
            if (r0 == 0) goto L_0x09cf
            r7 = 13
            X.74x r2 = new X.74x
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (int) r7)
            r0.A0H(r2)
            return
        L_0x09cf:
            java.lang.String r0 = "globalUi"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x09d6:
            java.lang.String r0 = "contactManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x09dd:
            java.lang.Object r5 = r2.A00
            X.5ub r5 = (X.C122285ub) r5
            java.lang.String r4 = r2.A02
            java.lang.Object r3 = r2.A01
            X.7j4 r3 = (X.C159257j4) r3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = java.io.File.separator
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ".json"
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.C1033354w.A0H
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)
            X.0wG r0 = r5.A01     // Catch:{ IOException -> 0x0a27 }
            java.io.File r0 = X.C90514aH.A0j(r0)     // Catch:{ IOException -> 0x0a27 }
            java.io.File r0 = X.C36441kJ.A0w(r0, r1)     // Catch:{ IOException -> 0x0a27 }
            java.io.FileInputStream r2 = X.C90524aI.A0U(r0)     // Catch:{ IOException -> 0x0a27 }
            java.lang.String r1 = X.AnonymousClass14X.A00(r2)     // Catch:{ all -> 0x0a1d }
            r0 = 0
            X.C131816Qt.A01(r3, r0, r1)     // Catch:{ all -> 0x0a1d }
            r2.close()     // Catch:{ IOException -> 0x0a27 }
            return
        L_0x0a1d:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0a22 }
            goto L_0x0a26
        L_0x0a22:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0a27 }
        L_0x0a26:
            throw r1     // Catch:{ IOException -> 0x0a27 }
        L_0x0a27:
            r0 = move-exception
            r0.printStackTrace()
            return
        L_0x0a2c:
            java.lang.Object r0 = r2.A00
            com.whatsapp.businessdirectory.util.BaseGPSLocationManager r0 = (com.whatsapp.businessdirectory.util.BaseGPSLocationManager) r0
            java.lang.Object r1 = r2.A01
            android.location.Location r1 = (android.location.Location) r1
            java.lang.String r2 = r2.A02
            X.00s r0 = r0.A04
            double r3 = r1.getLatitude()
            double r5 = r1.getLongitude()
            float r7 = r1.getAccuracy()
            X.5t3 r1 = new X.5t3
            r1.<init>(r2, r3, r5, r7)
            r0.A0D(r1)
            return
        L_0x0a4d:
            java.lang.Object r1 = r2.A00
            X.00r r1 = (X.C001600r) r1
            java.lang.Object r0 = r2.A01
            android.location.Location r0 = (android.location.Location) r0
            java.lang.String r3 = r2.A02
            double r4 = r0.getLatitude()
            double r6 = r0.getLongitude()
            float r8 = r0.getAccuracy()
            X.5t3 r2 = new X.5t3
            r2.<init>(r3, r4, r6, r8)
            r1.A0D(r2)
            return
        L_0x0a6c:
            java.lang.Object r4 = r2.A00
            X.4kp r4 = (X.C95404kp) r4
            java.lang.Object r1 = r2.A01
            X.6bv r1 = (X.C134976bv) r1
            java.lang.String r6 = r2.A02
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.67j r2 = r4.A0K
            com.google.android.gms.maps.model.LatLng r3 = X.C134976bv.A03(r1)
            r8 = 0
            java.lang.String r7 = "pin_on_map"
            r5 = 0
            r2.A01(r3, r4, r5, r6, r7, r8)
            return
        L_0x0a88:
            java.lang.Object r5 = r2.A00
            X.6YM r5 = (X.AnonymousClass6YM) r5
            java.lang.String r6 = r2.A02
            java.lang.Object r2 = r2.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/actionStartNewOutgoingCall async start for callId "
            X.C36321k7.A1Q(r0, r6, r1)
            long r3 = android.os.SystemClock.elapsedRealtime()
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            boolean r0 = X.C34681hT.A0T(r1)
            if (r0 == 0) goto L_0x0acb
            java.lang.String r0 = r1.callId
            boolean r0 = android.text.TextUtils.equals(r6, r0)
            if (r0 == 0) goto L_0x0acb
            X.0ww r1 = r5.A2A
            r0 = 1
            r1.A07(r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x0abb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0ace
            com.whatsapp.jid.UserJid r1 = X.C36441kJ.A0o(r2)
            X.1ay r0 = r5.A2x
            r0.A02(r1)
            goto L_0x0abb
        L_0x0acb:
            java.lang.String r0 = "voip/actionStartNewOutgoingCall async operation canceled"
            goto L_0x0ae4
        L_0x0ace:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/actionStartNewOutgoingCall async operation elapsed "
            r2.append(r0)
            long r0 = X.C90514aH.A0J(r3)
            r2.append(r0)
            java.lang.String r0 = " ms"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
        L_0x0ae4:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0ae8:
            java.lang.Object r0 = r2.A00
            com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel r0 = (com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel) r0
            java.lang.String r5 = r2.A02
            java.lang.Object r4 = r2.A01
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.67M r3 = r0.A05
            X.7UH r2 = new X.7UH
            r2.<init>(r0, r4)
            java.util.Set r1 = X.C36411kG.A15(r5)
            X.7UG r0 = new X.7UG
            r0.<init>(r5, r2)
            r3.A00(r4, r1, r0)
            return
        L_0x0b06:
            java.lang.Object r0 = r2.A00
            X.3QX r0 = (X.AnonymousClass3QX) r0
            java.lang.Object r3 = r2.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.String r1 = r2.A02
            X.16y r0 = r0.A07
            X.13v r3 = (X.C223213v) r3
            r0.A03(r3, r1)
            return
        L_0x0b18:
            java.lang.Object r5 = r2.A00
            com.whatsapp.contact.picker.ContactPickerFragment r5 = (com.whatsapp.contact.picker.ContactPickerFragment) r5
            java.lang.String r4 = r2.A02
            java.lang.Object r3 = r2.A01
            android.content.DialogInterface$OnClickListener r3 = (android.content.DialogInterface.OnClickListener) r3
            android.content.Context r0 = r5.A1D()
            X.1qm r2 = X.AnonymousClass3LW.A00(r0)
            android.content.Context r1 = r5.A1D()
            X.1H2 r0 = r5.A1f
            java.lang.CharSequence r0 = X.AnonymousClass3UG.A05(r1, r0, r4)
            r2.A0q(r0)
            r0 = 2131891399(0x7f1214c7, float:1.9417517E38)
            r2.A0c(r0)
            r0 = 2131891397(0x7f1214c5, float:1.9417513E38)
            r2.A0h(r3, r0)
            r1 = 2131896389(0x7f122845, float:1.9427638E38)
            X.6Z6 r0 = X.AnonymousClass6Z6.A00
            r2.A0f(r0, r1)
            r2.A0b()
            return
        L_0x0b4f:
            java.lang.Object r0 = r2.A00
            X.2KL r0 = (X.AnonymousClass2KL) r0
            java.lang.Object r4 = r2.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r3 = r2.A02
            X.1Dv r2 = r0.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "tel:"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)
            android.net.Uri r1 = android.net.Uri.parse(r0)
            r0 = 0
            r2.Bp7(r4, r1, r0)
            return
        L_0x0b6e:
            java.lang.Object r7 = r2.A00
            X.5ur r7 = (X.C122445ur) r7
            java.lang.Object r6 = r2.A01
            X.3Qa r6 = (X.C64933Qa) r6
            java.lang.String r3 = r2.A02
            r15 = 1
            X.67N r5 = r7.A00
            X.1A1 r0 = r5.A01
            X.3T1 r4 = r0.A03(r6)
            if (r4 != 0) goto L_0x0b8c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CatalogNFMStructuredMessageLoggingDelegate/logInteraction: unable to find FMessageInteractive with key="
            X.C36321k7.A1J(r6, r0, r1)
        L_0x0b8c:
            X.1an r7 = r7.A01
            if (r4 == 0) goto L_0x0bd5
            boolean r0 = r4.A1T(r15)
            if (r0 != 0) goto L_0x0bd5
            X.1EP r2 = r5.A00
            long r0 = r4.A1N
            X.6A5 r0 = r2.A00(r0)
            if (r0 != 0) goto L_0x0bd0
            java.lang.Integer r0 = X.C36381kD.A0m()
        L_0x0ba4:
            java.lang.String r10 = r5.A01(r6, r0)
            r8 = 0
            if (r4 == 0) goto L_0x0bce
            X.11F r8 = r6.A00
            boolean r0 = r4.A1T(r15)
            int r0 = r5.A00(r8, r3, r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            boolean r0 = r4.A1T(r15)
            if (r0 == 0) goto L_0x0bc5
            X.13s r0 = com.whatsapp.jid.PhoneUserJid.Companion
            com.whatsapp.jid.PhoneUserJid r8 = X.C222913s.A00(r3)
        L_0x0bc5:
            r11 = 0
            r13 = 4
            r14 = 22
            r12 = 0
            r7.A00(r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0bce:
            r9 = r8
            goto L_0x0bc5
        L_0x0bd0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            goto L_0x0ba4
        L_0x0bd5:
            r0 = 0
            goto L_0x0ba4
        L_0x0bd7:
            java.lang.Object r3 = r2.A00
            X.3fk r3 = (X.C70803fk) r3
            java.lang.Object r11 = r2.A01
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            java.lang.String r12 = r2.A02
            X.9Y1 r1 = r3.A1v
            r0 = 17
            r1.A01(r0)
            X.005 r0 = r3.A5k
            java.lang.Object r0 = r0.get()
            X.9R0 r0 = (X.AnonymousClass9R0) r0
            r0.A00()
            X.0wQ r0 = r3.A1W
            boolean r13 = r0.A0M(r11)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r4 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            if (r0 != 0) goto L_0x0c27
            X.4V6 r0 = r3.A2l
            X.155 r5 = r0.getActivityNullable()
            X.4V6 r0 = r3.A2l
            X.155 r1 = r0.getActivityNullable()
            r0 = 0
            android.content.Intent r6 = X.AnonymousClass190.A1S(r1, r0, r4)
            X.17Y r7 = r3.A1U
            X.005 r0 = r3.A5m
            java.lang.Object r10 = r0.get()
            X.9lS r10 = (X.C202279lS) r10
            X.1Ws r8 = r3.A1u
            X.9Y1 r9 = r3.A1v
            X.AnonymousClass3SM.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0c27:
            X.0wQ r0 = r3.A1W
            r0.A0M(r11)
            r1 = 11
            X.4V6 r0 = r3.A2l
            X.155 r0 = r0.getActivityNullable()
            android.content.Intent r1 = X.AnonymousClass190.A0m(r0, r11, r2, r1)
            X.4V6 r0 = r3.A2l
            r0.startActivity(r1)
            return
        L_0x0c3e:
            java.lang.Object r5 = r2.A00
            X.3fk r5 = (X.C70803fk) r5
            java.lang.Object r4 = r2.A01
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.String r1 = r2.A02
            r0 = 43
            X.74l r3 = new X.74l
            r3.<init>(r5, r4, r1, r0)
            X.9XI r0 = r5.A1o
            X.3ty r2 = r0.A01(r4)
            r1 = 2
            X.7sg r0 = new X.7sg
            r0.<init>(r3, r1)
            r2.A0A(r0)
            return
        L_0x0c5f:
            java.lang.Object r0 = r2.A00
            X.9YB r0 = (X.AnonymousClass9YB) r0
            java.lang.String r3 = r2.A02
            java.lang.Object r2 = r2.A01
            X.3ty r2 = (X.C79593ty) r2
            X.16S r0 = r0.A01
            X.9un r0 = r0.A07(r3)
            if (r0 == 0) goto L_0x0c75
            r2.A0C(r0)
            return
        L_0x0c75:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Payments: failed to read payment method from credId: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            r2.A0D(r0)
            return
        L_0x0c87:
            java.lang.Object r3 = r2.A00
            com.whatsapp.email.UpdateEmailActivity r3 = (com.whatsapp.email.UpdateEmailActivity) r3
            java.lang.String r0 = r2.A02
            java.lang.Object r2 = r2.A01
            java.lang.Number r2 = (java.lang.Number) r2
            r1 = 1
            X.AnonymousClass00C.A0D(r0, r1)
            X.9Pi r4 = r3.A3i()
            java.lang.String r5 = r3.A09
            int r7 = r3.A00
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0cbe
            r8 = 4
        L_0x0ca4:
            r9 = 2
            java.lang.String r6 = java.lang.String.valueOf(r2)
            r10 = 2
            r4.A00(r5, r6, r7, r8, r9, r10)
            X.AnonymousClass3SJ.A00(r3, r1)
            if (r2 == 0) goto L_0x0cc8
            int r1 = r2.intValue()
            r0 = 533(0x215, float:7.47E-43)
            if (r1 != r0) goto L_0x0cc3
            com.whatsapp.email.UpdateEmailActivity.A07(r3)
            return
        L_0x0cbe:
            int r8 = com.whatsapp.email.UpdateEmailActivity.A01(r3)
            goto L_0x0ca4
        L_0x0cc3:
            r0 = 403(0x193, float:5.65E-43)
            r2 = 4
            if (r1 == r0) goto L_0x0cc9
        L_0x0cc8:
            r2 = 3
        L_0x0cc9:
            X.AnonymousClass3SJ.A01(r3, r2)
            return
        L_0x0ccd:
            java.lang.Object r9 = r2.A00
            X.6PZ r9 = (X.AnonymousClass6PZ) r9
            java.lang.String r8 = r2.A02
            java.lang.Object r7 = r2.A01
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            X.0v0 r2 = r9.A06
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r2)
            java.lang.String r1 = "flows_analytics_ic"
            java.lang.String r4 = X.C36371kC.A0t(r0, r1)
            if (r4 != 0) goto L_0x0cf0
            java.lang.String r4 = X.C36361kB.A0l()
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r2)
            X.C36341k9.A0x(r0, r1, r4)
        L_0x0cf0:
            X.6EA r0 = r9.A01
            r6 = 0
            if (r0 == 0) goto L_0x0d27
            java.lang.String r0 = r0.A0C
            X.6M8 r1 = X.AnonymousClass6M8.A00
            byte[] r0 = X.C36351kA.A1b(r0)
            long r14 = r1.A01(r0)
            r0 = 53
            long r0 = r14 >>> r0
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            r5 = 0
        L_0x0d0a:
            r12 = 1
            long r12 = r12 & r14
            r2 = 0
            r1 = 1
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0d1c
            r0 = 53
            if (r5 >= r0) goto L_0x0d1c
            int r5 = r5 + 1
            long r14 = r14 >>> r1
            goto L_0x0d0a
        L_0x0d1c:
            r0 = 31
            int r0 = java.lang.Math.min(r5, r0)
            java.lang.Long r10 = X.C36441kJ.A0y(r0)
            goto L_0x0d29
        L_0x0d27:
            r11 = r6
            r10 = r6
        L_0x0d29:
            X.6M8 r1 = X.AnonymousClass6M8.A00
            byte[] r0 = X.C36351kA.A1b(r4)
            long r15 = r1.A01(r0)
            r0 = 53
            long r13 = r15 >>> r0
            r12 = 0
        L_0x0d38:
            r4 = 1
            long r4 = r4 & r15
            r2 = 0
            r1 = 1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0d4a
            r0 = 53
            if (r12 >= r0) goto L_0x0d4a
            int r12 = r12 + 1
            long r15 = r15 >>> r1
            goto L_0x0d38
        L_0x0d4a:
            r0 = 31
            int r0 = java.lang.Math.min(r12, r0)
            long r2 = (long) r0
            X.58Q r5 = new X.58Q
            r5.<init>()
            r5.A06 = r8
            java.lang.String r0 = r9.A05
            r5.A08 = r0
            X.6EA r1 = r9.A01
            if (r1 == 0) goto L_0x0da6
            java.lang.String r0 = r1.A07
        L_0x0d62:
            r5.A07 = r0
            if (r1 == 0) goto L_0x0da4
            X.6BP r0 = r1.A03
            if (r0 == 0) goto L_0x0da4
            int r4 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0 = 1
            if (r1 == 0) goto L_0x0da4
            if (r4 != r0) goto L_0x0da4
        L_0x0d75:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A01 = r0
            if (r8 != 0) goto L_0x0da2
            java.lang.Boolean r0 = r9.A03
        L_0x0d7f:
            r5.A00 = r0
            r5.A04 = r11
            r5.A05 = r10
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r5.A02 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A03 = r0
            if (r8 == 0) goto L_0x0d9d
            r9.A05 = r8
            r9.A03 = r7
        L_0x0d97:
            X.0yW r0 = r9.A09
            r0.Blv(r5)
            return
        L_0x0d9d:
            r9.A05 = r6
            r9.A03 = r6
            goto L_0x0d97
        L_0x0da2:
            r0 = r7
            goto L_0x0d7f
        L_0x0da4:
            r0 = 2
            goto L_0x0d75
        L_0x0da6:
            r0 = r6
            goto L_0x0d62
        L_0x0da8:
            java.lang.Object r1 = r2.A00
            X.6Wo r1 = (X.C133076Wo) r1
            java.lang.Object r0 = r2.A01
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.A00 = r0
            java.lang.String r0 = "onSharedPreferenceChanged"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0db9:
            r1.get()     // Catch:{ Exception -> 0x0dbd }
            goto L_0x0dc6
        L_0x0dbd:
            r1 = move-exception
            java.lang.Object r0 = r3.A02
            X.0f7 r0 = (X.AnonymousClass0f7) r0
            r0.A05(r1)
            return
        L_0x0dc6:
            return
        L_0x0dc7:
            return
        L_0x0dc8:
            r1 = move-exception
            monitor-exit(r6)
            throw r1
        L_0x0dcb:
            java.lang.Object r5 = r2.A00
            com.whatsapp.companiondevice.LinkedDeviceEnterNicknameViewModel r5 = (com.whatsapp.companiondevice.LinkedDeviceEnterNicknameViewModel) r5
            java.lang.Object r6 = r2.A01
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
            java.lang.String r7 = r2.A02
            X.19g r4 = r5.A00
            X.17j r0 = r4.A0I
            X.17n r3 = r0.A04
            android.content.ContentValues r9 = X.C36441kJ.A0E()
            java.lang.String r0 = "nickname"
            r9.put(r0, r7)
            X.17o r0 = r3.A02
            X.1M0 r2 = r0.A04()
            X.14e r8 = r2.A02     // Catch:{ all -> 0x0e27 }
            java.lang.String r10 = "devices"
            java.lang.String r11 = "device_id = ?"
            java.lang.String[] r13 = X.C36441kJ.A1R()     // Catch:{ all -> 0x0e27 }
            r1 = 0
            java.lang.String r0 = r6.getRawString()     // Catch:{ all -> 0x0e27 }
            r13[r1] = r0     // Catch:{ all -> 0x0e27 }
            java.lang.String r12 = "setDeviceNickname/UPDATE_DEVICES"
            r8.A01(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0e27 }
            monitor-enter(r3)     // Catch:{ all -> 0x0e27 }
            X.0wy r0 = r3.A00     // Catch:{ all -> 0x0e24 }
            if (r0 == 0) goto L_0x0e0f
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0e24 }
            X.3SB r0 = (X.AnonymousClass3SB) r0     // Catch:{ all -> 0x0e24 }
            if (r0 == 0) goto L_0x0e0f
            r0.A02 = r7     // Catch:{ all -> 0x0e24 }
        L_0x0e0f:
            monitor-exit(r3)     // Catch:{ all -> 0x0e24 }
            r2.close()
            X.3SB r0 = X.C236419g.A00(r4, r6)
            if (r0 == 0) goto L_0x0e1c
            X.C236419g.A05(r0, r4)
        L_0x0e1c:
            X.1Rs r1 = r5.A01
            X.0AJ r0 = X.AnonymousClass0AJ.A00
        L_0x0e20:
            r1.A0C(r0)
            return
        L_0x0e24:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0e24 }
            throw r0     // Catch:{ all -> 0x0e27 }
        L_0x0e27:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0e2c }
            throw r1
        L_0x0e2c:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1502274l.run():void");
    }

    public C1502274l(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = obj2;
    }
}
