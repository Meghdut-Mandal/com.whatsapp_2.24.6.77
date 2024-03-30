package X;

import android.os.ConditionVariable;

/* renamed from: X.74x  reason: invalid class name and case insensitive filesystem */
public class C1503474x implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C1503474x(C133316Xv r1, AnonymousClass6E7 r2, C128716Di r3, C159657ji r4, int i) {
        this.A04 = i;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: X.141} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: X.652} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: X.3hW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v94, resolved type: X.0fG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v105, resolved type: X.27v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v163, resolved type: X.141} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v164, resolved type: X.141} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v106, resolved type: X.141} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v96, resolved type: com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v97, resolved type: com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v108, resolved type: X.3T1} */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:6|7|8|(1:10)|11|(1:13)|14|(1:16)|17|18|19|20|21|22|681) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:23|24|25|26|27|28|682) */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0c38, code lost:
        r1 = new X.C1502474n(r4, r5, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x1119, code lost:
        r2.A0H(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x111c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x1158, code lost:
        r1 = new X.C1503474x((java.lang.Object) r2, r3, r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x115d, code lost:
        r0.A0H(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x1160, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0276, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0277, code lost:
        r0 = "encb/RegisterUserHandler/createEncRegPayload/rsaEncrypt/exception.";
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0080 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00b0 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0276 A[ExcHandler: InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException (e java.lang.Throwable), Splitter:B:65:0x01d3] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0080=Splitter:B:20:0x0080, B:26:0x00b0=Splitter:B:26:0x00b0} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:355:0x0a8b=Splitter:B:355:0x0a8b, B:329:0x0a3e=Splitter:B:329:0x0a3e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r33 = this;
            r0 = r33
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x07e9;
                case 1: goto L_0x0862;
                case 2: goto L_0x090c;
                case 3: goto L_0x0924;
                case 4: goto L_0x093c;
                case 5: goto L_0x0034;
                case 6: goto L_0x0954;
                case 7: goto L_0x0089;
                case 8: goto L_0x0971;
                case 9: goto L_0x098b;
                case 10: goto L_0x00c6;
                case 11: goto L_0x011f;
                case 12: goto L_0x0b22;
                case 13: goto L_0x0b3b;
                case 14: goto L_0x0295;
                case 15: goto L_0x0bbb;
                case 16: goto L_0x0bdd;
                case 17: goto L_0x0c02;
                case 18: goto L_0x0c3f;
                case 19: goto L_0x02e4;
                case 20: goto L_0x0307;
                case 21: goto L_0x0334;
                case 22: goto L_0x0c57;
                case 23: goto L_0x0f36;
                case 24: goto L_0x0f85;
                case 25: goto L_0x0fad;
                case 26: goto L_0x0fe8;
                case 27: goto L_0x1035;
                case 28: goto L_0x111d;
                case 29: goto L_0x1139;
                case 30: goto L_0x036f;
                case 31: goto L_0x1161;
                case 32: goto L_0x040a;
                case 33: goto L_0x1175;
                case 34: goto L_0x0508;
                case 35: goto L_0x1189;
                case 36: goto L_0x119d;
                case 37: goto L_0x11b5;
                case 38: goto L_0x1425;
                case 39: goto L_0x053e;
                case 40: goto L_0x144d;
                case 41: goto L_0x0568;
                case 42: goto L_0x145d;
                case 43: goto L_0x0593;
                case 44: goto L_0x065d;
                case 45: goto L_0x149e;
                case 46: goto L_0x14b5;
                case 47: goto L_0x067c;
                case 48: goto L_0x152c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r0.A00
            X.6WR r4 = (X.AnonymousClass6WR) r4
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A02
            X.54s r2 = (X.C1032954s) r2
            java.lang.Object r1 = r0.A03
            android.view.View r1 = (android.view.View) r1
            X.4me r0 = r4.A08
            if (r0 != 0) goto L_0x0033
            X.4me r0 = new X.4me
            r0.<init>(r3, r2, r4)
            r4.A08 = r0
            androidx.recyclerview.widget.RecyclerView r2 = r4.A0P
            r2.setAdapter(r0)
            r1.getContext()
            r1 = 0
            com.whatsapp.filter.SmoothScrollLinearLayoutManager r0 = new com.whatsapp.filter.SmoothScrollLinearLayoutManager
            r0.<init>(r1)
            r2.setLayoutManager(r0)
        L_0x0033:
            return
        L_0x0034:
            java.lang.Object r4 = r0.A00
            X.6mM r4 = (X.C140906mM) r4
            java.lang.Object r5 = r0.A01
            X.6MU r5 = (X.AnonymousClass6MU) r5
            java.lang.Object r6 = r0.A03
            X.4rU r6 = (X.C98474rU) r6
            java.lang.Object r3 = r0.A02
            java.io.File r3 = (java.io.File) r3
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ JSONException -> 0x0033 }
            X.4rX r0 = r6.A01     // Catch:{ JSONException -> 0x0033 }
            if (r0 == 0) goto L_0x0055
            org.json.JSONObject r1 = r0.Bvk()     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r0 = "size_config"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0033 }
        L_0x0055:
            X.4rV r0 = r6.A02     // Catch:{ JSONException -> 0x0033 }
            if (r0 == 0) goto L_0x0062
            org.json.JSONObject r1 = r0.Bvk()     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r0 = "staleness_config"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0033 }
        L_0x0062:
            java.lang.String r1 = r6.A03     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r0 = "eviction_type"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r1 = r6.A00     // Catch:{ JSONException -> 0x0033 }
            if (r1 == 0) goto L_0x0072
            java.lang.String r0 = "cache_name"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0033 }
        L_0x0072:
            java.lang.String r1 = "feature_name"
            java.lang.String r0 = r5.A00     // Catch:{ JSONException -> 0x0033 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0033 }
            X.6EQ r1 = r4.A02     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r0 = r3.getCanonicalPath()     // Catch:{ IOException -> 0x0080 }
            goto L_0x0084
        L_0x0080:
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ JSONException -> 0x0033 }
        L_0x0084:
            r1.A02(r0, r2)     // Catch:{ JSONException -> 0x0033 }
            goto L_0x1540
        L_0x0089:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Object r8 = r0.A02
            java.io.File r8 = (java.io.File) r8
            r8.setLastModified(r5)
            java.lang.Object r7 = r0.A00
            X.6mK r7 = (X.C140886mK) r7
            java.lang.Object r1 = r0.A01
            X.6MU r1 = (X.AnonymousClass6MU) r1
            java.lang.String r4 = r1.A00
            java.lang.Object r3 = r0.A03
            X.4rV r3 = (X.C98484rV) r3
            long r1 = X.C36391kE.A0B(r5)
            X.4rY r0 = new X.4rY
            r0.<init>(r3, r4, r1)
            java.lang.String r4 = r8.getCanonicalPath()     // Catch:{ IOException -> 0x00b0 }
            goto L_0x00b4
        L_0x00b0:
            java.lang.String r4 = r8.getAbsolutePath()     // Catch:{ JSONException -> 0x0033 }
        L_0x00b4:
            org.json.JSONObject r3 = r0.Bvk()     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r2 = "usage_timestamp_s"
            long r0 = r0.A00     // Catch:{ JSONException -> 0x0033 }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x0033 }
            X.6EQ r0 = r7.A00     // Catch:{ JSONException -> 0x0033 }
            r0.A02(r4, r3)     // Catch:{ JSONException -> 0x0033 }
            goto L_0x1541
        L_0x00c6:
            java.lang.Object r5 = r0.A00
            X.4xo r5 = (X.C101504xo) r5
            java.lang.Object r1 = r0.A01
            X.5mV r1 = (X.C117585mV) r1
            java.lang.Object r6 = r0.A02
            byte[] r6 = (byte[]) r6
            java.lang.Object r11 = r0.A03
            X.7ix r11 = (X.C159187ix) r11
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r4 = r1.A00
            r0 = 87
            long r2 = (long) r0
            r1 = 0
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r1, r2, r4)
            byte[] r0 = (byte[]) r0
            r15 = 0
            r3 = 16
            byte[] r10 = java.util.Arrays.copyOfRange(r0, r1, r3)
            java.lang.String r8 = "encb/LoginUserHandler/retrieveBackupKey/parseLoginPayload/exception."
            X.4u8 r0 = X.C99894u8.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x1597 }
            X.8Hz r1 = X.C170918Hz.A08(r0, r6)     // Catch:{ 186 -> 0x1597 }
            X.4u8 r1 = (X.C99894u8) r1     // Catch:{ 186 -> 0x1597 }
            X.AUx r0 = r1.backupKeyDataEncrypted_     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x158b }
            byte[] r9 = r0.A06()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x158b }
            X.AUx r0 = r1.rkNonce_     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x158b }
            byte[] r2 = r0.A06()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x158b }
            java.lang.String r7 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r7)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x158b }
            java.lang.String r6 = "AES"
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x158b }
            r0.<init>(r10, r6)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x158b }
            byte[] r1 = X.C90484aE.A1a(r0, r1, r2, r9)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x158b }
            X.4u9 r0 = X.C99904u9.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x15a1 }
            X.8Hz r2 = X.C170918Hz.A08(r0, r1)     // Catch:{ 186 -> 0x15a1 }
            X.4u9 r2 = (X.C99904u9) r2     // Catch:{ 186 -> 0x15a1 }
            if (r2 == 0) goto L_0x0033
            goto L_0x1542
        L_0x011f:
            java.lang.Object r6 = r0.A00
            X.4xp r6 = (X.C101514xp) r6
            java.lang.Object r5 = r0.A01
            byte[] r5 = (byte[]) r5
            java.lang.Object r4 = r0.A02
            byte[] r4 = (byte[]) r4
            java.lang.Object r7 = r0.A03
            byte[] r7 = (byte[]) r7
            java.lang.Object r3 = r6.A0B
            monitor-enter(r3)
            byte[] r8 = r6.A05     // Catch:{ all -> 0x15bd }
            X.5ma r9 = r6.A01     // Catch:{ all -> 0x15bd }
            monitor-exit(r3)     // Catch:{ all -> 0x15bd }
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1V(r8)
            X.C18740tg.A0C(r0)
            if (r9 != 0) goto L_0x0142
            r1 = 0
        L_0x0142:
            X.C18740tg.A0C(r1)
            X.5kk r2 = r6.A08
            r0 = 100000(0x186a0, float:1.4013E-40)
            long r0 = (long) r0
            com.facebook.simplejni.NativeHolder r10 = r9.A00
            r9 = 2
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOO(r9, r0, r10, r4)
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1
            X.5mY r0 = new X.5mY
            r0.<init>(r1)
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r9 = r0.A00
            r0 = 97
            long r0 = (long) r0
            r10 = 1
            long r0 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r10, r0, r9)
            int r10 = (int) r0
            if (r10 == 0) goto L_0x0170
            r1 = 4
        L_0x016a:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r2.A00
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel.A01(r0, r1)
            return
        L_0x0170:
            com.whatsapp.wamsys.JniBridge.getInstance()
            r0 = 98
            long r0 = (long) r0
            r11 = 0
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r11, r0, r9)
            byte[] r1 = (byte[]) r1
            r0 = 16
            r16 = 0
            byte[] r15 = java.util.Arrays.copyOfRange(r1, r11, r0)
            com.whatsapp.wamsys.JniBridge.getInstance()
            r0 = 99
            long r0 = (long) r0
            java.lang.Object r10 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r11, r0, r9)
            byte[] r10 = (byte[]) r10
            X.1Ck r0 = r6.A07     // Catch:{ IOException -> 0x0287 }
            X.1Ci r1 = r0.A01     // Catch:{ IOException -> 0x0287 }
            byte[] r14 = r1.A03()     // Catch:{ IOException -> 0x0287 }
            if (r14 != 0) goto L_0x01a4
            r0 = 32
            byte[] r14 = X.C18750th.A0H(r0)     // Catch:{ IOException -> 0x0287 }
            r1.A02(r14)     // Catch:{ IOException -> 0x0287 }
        L_0x01a4:
            r0 = 12
            byte[] r13 = X.C18750th.A0H(r0)
            int r1 = r14.length     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x027e }
            r0 = 32
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            X.C18740tg.A0B(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x027e }
            javax.crypto.Cipher r12 = X.C90514aH.A19()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x027e }
            javax.crypto.spec.SecretKeySpec r9 = X.C90494aF.A0m(r15)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x027e }
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x027e }
            r1.<init>(r13)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x027e }
            r0 = 1
            r12.init(r0, r9, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x027e }
            byte[] r9 = r12.doFinal(r14)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x027e }
            int r1 = r9.length     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x027e }
            r0 = 48
            if (r1 != r0) goto L_0x01d0
            r16 = 1
        L_0x01d0:
            X.C18740tg.A0B(r16)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x027e }
            X.4u9 r0 = X.C99904u9.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.8NN r12 = r0.A0p()     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.8I5 r9 = X.C21674AUx.A01(r9, r11, r1)     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.8Hz r1 = X.C90524aI.A0H(r12)     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.4u9 r1 = (X.C99904u9) r1     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            int r0 = r1.bitField0_     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            r1.aesK_ = r9     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            int r0 = r13.length     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.8I5 r9 = X.C21674AUx.A01(r13, r11, r0)     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.8Hz r1 = X.C90524aI.A0H(r12)     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.4u9 r1 = (X.C99904u9) r1     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            int r0 = r1.bitField0_     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            r0 = r0 | 2
            r1.bitField0_ = r0     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            r1.kNonce_ = r9     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.8Hz r0 = r12.A0R()     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            byte[] r1 = r0.A0o()     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            java.io.ByteArrayOutputStream r9 = X.C90524aI.A0Q()     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            r9.write(r5)     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            r9.write(r4)     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            r9.write(r7)     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.4uF r0 = X.C99964uF.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.8NN r5 = r0.A0p()     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.8I5 r4 = X.C90474aD.A0O(r5, r1)     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.8Hz r1 = r5.A00     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.4uF r1 = (X.C99964uF) r1     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            int r0 = r1.bitField0_     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            r1.backupKeyData_ = r4     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.8I5 r4 = X.C90474aD.A0O(r5, r10)     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.8Hz r1 = r5.A00     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.4uF r1 = (X.C99964uF) r1     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            int r0 = r1.bitField0_     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            r0 = r0 | 2
            r1.bitField0_ = r0     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            r1.r3_ = r4     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.8I5 r4 = X.C90474aD.A0O(r5, r7)     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.8Hz r1 = r5.A00     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.4uF r1 = (X.C99964uF) r1     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            int r0 = r1.bitField0_     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            r0 = r0 | 4
            r1.bitField0_ = r0     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            r1.opaqueChallenge_ = r4     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            byte[] r1 = r9.toByteArray()     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            java.lang.String r0 = "SHA-256"
            byte[] r0 = X.C90504aG.A1a(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0270, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.8I5 r4 = X.C90474aD.A0O(r5, r0)     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.8Hz r1 = r5.A00     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.4uF r1 = (X.C99964uF) r1     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            int r0 = r1.bitField0_     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            r0 = r0 | 8
            r1.bitField0_ = r0     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            r1.transcript_ = r4     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            X.8Hz r0 = r5.A0R()     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            byte[] r0 = r0.A0o()     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            byte[] r0 = X.C132936Vw.A03(r0, r8)     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            goto L_0x0290
        L_0x0270:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
            throw r0     // Catch:{ IOException -> 0x027a, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0276 }
        L_0x0276:
            r1 = move-exception
            java.lang.String r0 = "encb/RegisterUserHandler/createEncRegPayload/rsaEncrypt/exception."
            goto L_0x0281
        L_0x027a:
            r1 = move-exception
            java.lang.String r0 = "encb/RegisterUserHandler/createEncRegPayload/createTranscript/exception."
            goto L_0x028a
        L_0x027e:
            r1 = move-exception
            java.lang.String r0 = "encb/RegisterUserHandler/createEncRegPayload/aesEncrypt/exception."
        L_0x0281:
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 5
            goto L_0x016a
        L_0x0287:
            r1 = move-exception
            java.lang.String r0 = "encb/RegisterUserHandler/createEncRegPayload/getAndSaveRootKey/exception."
        L_0x028a:
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 6
            goto L_0x016a
        L_0x0290:
            if (r0 == 0) goto L_0x0033
            monitor-enter(r3)
            goto L_0x15b0
        L_0x0295:
            java.lang.Object r6 = r0.A00
            X.7tG r6 = (X.C165337tG) r6
            java.lang.Object r4 = r0.A01
            X.5qe r4 = (X.C119905qe) r4
            java.lang.Object r3 = r0.A02
            X.9nx r3 = (X.C203399nx) r3
            java.lang.Object r5 = r0.A03
            X.6C8 r5 = (X.AnonymousClass6C8) r5
            if (r4 == 0) goto L_0x02c7
            java.util.ArrayList r0 = X.AIB.A02(r3)
            java.util.Iterator r2 = r0.iterator()
        L_0x02af:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02c7
            java.lang.Object r0 = r2.next()
            X.9ky r0 = (X.C202059ky) r0
            int r1 = r0.A00
            r0 = 453(0x1c5, float:6.35E-43)
            if (r1 != r0) goto L_0x02af
            X.1C4 r1 = r4.A00
            r0 = 1
            r1.A05(r0)
        L_0x02c7:
            if (r5 == 0) goto L_0x0033
            java.lang.Object r0 = r6.A00
            X.6W0 r0 = (X.AnonymousClass6W0) r0
            java.util.HashMap r4 = X.AnonymousClass6W0.A01(r0, r3)
            java.lang.String r3 = "on_failure"
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0033
            X.61h r2 = r5.A03
            r1 = 23
            X.74l r0 = new X.74l
            r0.<init>(r5, r4, r3, r1)
            r2.A00(r0)
            return
        L_0x02e4:
            java.lang.Object r5 = r0.A00
            X.141 r5 = (X.AnonymousClass141) r5
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A02
            X.652 r3 = (X.AnonymousClass652) r3
            java.lang.Object r2 = r0.A03
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            X.2Lc r1 = new X.2Lc
            r1.<init>(r5)
            java.util.List r0 = X.C36371kC.A11(r4)
            boolean r0 = X.AnonymousClass141.A01(r1, r0)
            if (r0 == 0) goto L_0x0033
            X.1RY r0 = r3.A03
            r0.A08(r2, r5)
            return
        L_0x0307:
            java.lang.Object r7 = r0.A00
            X.6YM r7 = (X.AnonymousClass6YM) r7
            java.lang.Object r6 = r0.A01
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.Object r5 = r0.A02
            com.whatsapp.voipcalling.CallInfo r5 = (com.whatsapp.voipcalling.CallInfo) r5
            java.lang.Object r4 = r0.A03
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.6Ts r3 = r7.A2L
            boolean r2 = r5.isCaller
            java.lang.String r1 = r5.callId
            int r0 = r5.initialGroupTransactionId
            X.5Nh r1 = r3.A03(r6, r1, r0, r2)
            if (r1 == 0) goto L_0x0033
            X.AnonymousClass6Ts.A01(r5, r1)
            X.005 r0 = r7.A3A
            java.lang.Object r0 = r0.get()
            X.6X4 r0 = (X.AnonymousClass6X4) r0
            r0.A0A(r4, r1)
            return
        L_0x0334:
            java.lang.Object r7 = r0.A00
            X.6YM r7 = (X.AnonymousClass6YM) r7
            java.lang.Object r6 = r0.A01
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.Object r5 = r0.A02
            com.whatsapp.voipcalling.CallInfo r5 = (com.whatsapp.voipcalling.CallInfo) r5
            java.lang.Object r4 = r0.A03
            java.util.List r4 = (java.util.List) r4
            X.6Ts r3 = r7.A2L
            boolean r2 = r5.isCaller
            java.lang.String r1 = r5.callId
            int r0 = r5.initialGroupTransactionId
            X.5Nh r3 = r3.A03(r6, r1, r0, r2)
            if (r3 == 0) goto L_0x0033
            X.AnonymousClass6Ts.A01(r5, r3)
            java.util.Iterator r2 = r4.iterator()
        L_0x0359:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0033
            com.whatsapp.jid.UserJid r1 = X.C36441kJ.A0o(r2)
            X.005 r0 = r7.A3A
            java.lang.Object r0 = r0.get()
            X.6X4 r0 = (X.AnonymousClass6X4) r0
            r0.A0A(r1, r3)
            goto L_0x0359
        L_0x036f:
            java.lang.Object r1 = r0.A02
            android.view.View r1 = (android.view.View) r1
            float r11 = X.C36441kJ.A01(r1)
            java.lang.Object r5 = r0.A00
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.text.TextPaint r2 = r5.getPaint()
            java.lang.Object r6 = r0.A01
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r1 = r6.toString()
            float r4 = r2.measureText(r1)
            java.lang.Object r3 = r0.A03
            X.3Qf r3 = (X.C64983Qf) r3
            int r0 = r3.A00
            float r0 = (float) r0
            float r4 = r4 + r0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0033
            java.lang.String r1 = r6.toString()
            java.lang.String r0 = " "
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r8 = 0
            java.util.List r1 = X.AnonymousClass099.A0L(r1, r0, r8)
            boolean r0 = X.C36401kF.A1a(r1)
            if (r0 == 0) goto L_0x03b4
            java.lang.Object r2 = X.C007103b.A0N(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x03b8
        L_0x03b4:
            java.lang.String r2 = r6.toString()
        L_0x03b8:
            android.text.TextPaint r7 = r5.getPaint()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = 32
            java.lang.String r0 = X.C90464aC.A0f(r2, r1, r0)
            float r0 = r7.measureText(r0)
            float r1 = r4 - r0
            r0 = 1
            r3.A04 = r0
            r5.setText(r6)
            r9 = 0
            X.0ts r0 = r3.A07
            boolean r0 = X.C36351kA.A1Y(r0)
            if (r0 == 0) goto L_0x03dc
            float r11 = -r1
        L_0x03dc:
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            android.view.animation.TranslateAnimation r7 = new android.view.animation.TranslateAnimation
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = 2000(0x7d0, double:9.88E-321)
            r7.setDuration(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r7.setStartOffset(r0)
            X.4Vs r0 = new X.4Vs
            r0.<init>(r6, r5, r2, r8)
            r7.setAnimationListener(r0)
            r3.A02 = r7
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            int r0 = (int) r4
            r1.width = r0
            r5.setLayoutParams(r1)
            android.view.animation.Animation r0 = r3.A02
            r5.startAnimation(r0)
            return
        L_0x040a:
            java.lang.Object r1 = r0.A00
            X.2iB r1 = (X.C48862iB) r1
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r6 = r0.A02
            X.3T1 r6 = (X.AnonymousClass3T1) r6
            java.lang.Object r3 = r0.A03
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            java.lang.Object r5 = r1.A00
            X.2IR r5 = (X.AnonymousClass2IR) r5
            boolean r0 = r3 instanceof X.AnonymousClass2c5
            if (r0 == 0) goto L_0x045b
            X.3Qa r0 = r3.A1J
            X.11F r6 = r0.A00
            if (r6 == 0) goto L_0x0443
            X.2c5 r3 = (X.AnonymousClass2c5) r3
            java.lang.String r2 = r3.A01
            java.lang.String r1 = r6.getRawString()
            X.3Sl r0 = X.AnonymousClass147.A01
            X.147 r1 = r0.A06(r1)
            if (r2 == 0) goto L_0x0443
            if (r1 == 0) goto L_0x0443
            X.17X r0 = r5.A1F
            boolean r0 = r0.A0C(r1)
            if (r0 != 0) goto L_0x0443
            return
        L_0x0443:
            X.16D r0 = r5.A0l
            X.141 r0 = r0.A0B(r6)
            if (r0 == 0) goto L_0x0033
            X.1Dv r2 = r5.A0P
            X.190 r0 = X.C36441kJ.A0j()
            android.content.Intent r1 = r0.A1Y(r4, r6)
            java.lang.String r0 = "ConversationRow"
            r2.A08(r4, r1, r0)
            return
        L_0x045b:
            X.1A1 r0 = r5.A1t
            X.3Qa r9 = r3.A1J
            X.3T1 r7 = r0.A03(r9)
            if (r7 != 0) goto L_0x0481
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x047b
            X.1A1 r8 = r5.A1t
            X.8dw r7 = X.C177528dw.A00
            r2 = 1
            java.lang.String r1 = r9.A01
            X.3Qa r0 = new X.3Qa
            r0.<init>(r7, r1, r2)
            X.3T1 r7 = r8.A03(r0)
            if (r7 != 0) goto L_0x0481
        L_0x047b:
            X.1Jf r0 = r5.A1b
            X.3T1 r7 = r0.A00(r9)
        L_0x0481:
            boolean r0 = r3 instanceof X.C46852bm
            if (r0 == 0) goto L_0x049c
            java.lang.String r1 = r9.A01
            java.lang.String r0 = "product_inquiry"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x049c
            X.17Y r2 = r5.A0R
            r0 = 36
            X.3v8 r1 = new X.3v8
            r1.<init>(r5, r3, r0)
        L_0x0498:
            r2.A0H(r1)
            return
        L_0x049c:
            if (r7 == 0) goto L_0x0033
            X.3Qa r3 = r7.A1J
            X.11F r1 = r3.A00
            boolean r0 = r1 instanceof X.C177528dw
            if (r0 == 0) goto L_0x04c7
            X.16E r0 = r5.A1J
            boolean r0 = r0.A0I(r7)
            if (r0 != 0) goto L_0x0033
            com.whatsapp.jid.UserJid r1 = r7.A0L()
            r0 = 0
            android.content.Intent r1 = X.AnonymousClass190.A0b(r4, r1, r0, r0, r0)
            X.AnonymousClass3UJ.A00(r1, r3)
            X.17Y r3 = r5.A0R
            r0 = 35
            X.3v8 r2 = new X.3v8
            r2.<init>(r4, r1, r0)
        L_0x04c3:
            r3.A0H(r2)
            return
        L_0x04c7:
            X.C18740tg.A06(r1)
            X.3Qa r0 = r6.A1J
            X.11F r0 = r0.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x04ff
            X.190 r0 = X.C36441kJ.A0j()
            android.content.Intent r6 = r0.A1Y(r4, r1)
            long r1 = r7.A1N
            java.lang.String r0 = "row_id"
            r6.putExtra(r0, r1)
            long r1 = r7.A1O
            java.lang.String r0 = "sort_id"
            r6.putExtra(r0, r1)
            long r1 = android.os.SystemClock.uptimeMillis()
            java.lang.String r0 = "start_t"
            r6.putExtra(r0, r1)
            X.AnonymousClass3UJ.A00(r6, r3)
            X.17Y r3 = r5.A0R
            r0 = 1
            X.3vL r2 = new X.3vL
            r2.<init>(r5, r4, r6, r0)
            goto L_0x04c3
        L_0x04ff:
            X.17Y r2 = r5.A0R
            r0 = 2
            X.3vL r1 = new X.3vL
            r1.<init>(r5, r4, r7, r0)
            goto L_0x0498
        L_0x0508:
            java.lang.Object r1 = r0.A00
            X.2oN r1 = (X.C51782oN) r1
            java.lang.Object r4 = r0.A01
            X.14u r4 = (X.C225314u) r4
            java.lang.Object r7 = r0.A02
            X.2K6 r7 = (X.AnonymousClass2K6) r7
            java.lang.Object r6 = r0.A03
            X.3T1 r6 = (X.AnonymousClass3T1) r6
            r8 = 1
            r2 = 3
            r0 = 2
            int r1 = r1.ordinal()
            r3 = 0
            if (r1 == r8) goto L_0x1613
            if (r1 == r2) goto L_0x1606
            if (r1 == r0) goto L_0x15c0
            r0 = 0
            if (r1 != r0) goto L_0x0033
            X.0wU r2 = r7.A06
            r1 = 22
            X.3v9 r0 = new X.3v9
            r0.<init>(r7, r6, r1)
            r2.Boy(r0)
            java.lang.String r0 = "PinInChatSelectionAction/execute Can pin directly."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.AnonymousClass2K6.A00(r4, r7, r6)
            return
        L_0x053e:
            java.lang.Object r4 = r0.A00
            X.3AF r4 = (X.AnonymousClass3AF) r4
            java.lang.Object r2 = r0.A01
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            java.lang.Object r3 = r0.A02
            java.lang.Object r5 = r0.A03
            X.1CR r0 = r4.A05
            X.3LI r0 = X.C36361kB.A0d(r2, r0)
            int r1 = r0.A02
            r0 = 1
            if (r1 != r0) goto L_0x0033
            X.17Y r0 = r4.A02
            r6 = 38
            X.74x r1 = new X.74x
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (int) r6)
            r0.A0H(r1)
            X.3Cj r1 = r4.A04
            r0 = 4
            r1.A00(r0)
            return
        L_0x0568:
            java.lang.Object r9 = r0.A01
            X.15r r9 = (X.C227615r) r9
            X.12i r11 = r9.A06
            X.0wo r8 = r9.A02
            long r6 = X.C19970wo.A00(r8)
            java.lang.String r10 = "db_migration_attempt_timestamp"
            r1 = 0
            long r3 = r11.A00(r10, r1)
            long r1 = r6 - r3
            long r4 = java.lang.Math.abs(r1)
            r2 = 43200000(0x2932e00, double:2.1343636E-316)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0033
            r11.A03(r10, r6)
            java.lang.String r1 = "DatabaseMigrationAsyncTask/run/execute async task"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            goto L_0x162c
        L_0x0593:
            java.lang.Object r1 = r0.A00
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            java.lang.Object r8 = r0.A01
            X.6wd r8 = (X.C147076wd) r8
            java.lang.Object r10 = r0.A02
            java.lang.Object r7 = r0.A03
            X.7jQ r7 = (X.C159477jQ) r7
            r0 = 0
            X.C36321k7.A16(r1, r10, r7, r0)
            r0 = 2131626329(0x7f0e0959, float:1.8879891E38)
            r1.setLayoutResource(r0)
            android.view.View r6 = r1.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.glasses.layouts.SupToggle"
            X.AnonymousClass00C.A0E(r6, r0)
            com.whatsapp.glasses.layouts.SupToggle r6 = (com.whatsapp.glasses.layouts.SupToggle) r6
            r8.A05 = r6
            if (r6 == 0) goto L_0x05f2
            X.6T7 r5 = X.AnonymousClass6T7.A00
            java.util.Map r1 = r8.A0E
            X.0wG r0 = r8.A03
            if (r0 == 0) goto L_0x168a
            r5.A02(r6, r0, r1)
            java.util.Set r1 = r8.A0F
            int r0 = X.C36331k8.A01(r1)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r0)
            java.util.Iterator r3 = r1.iterator()
        L_0x05d4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05ef
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.5Tk r0 = (X.C108415Tk) r0
            java.lang.String r1 = r0.id
            X.0wG r0 = r8.A03
            if (r0 == 0) goto L_0x1683
            android.graphics.Bitmap r0 = r5.A01(r0, r1)
            r4.put(r2, r0)
            goto L_0x05d4
        L_0x05ef:
            r6.setImageBitmaps(r4)
        L_0x05f2:
            X.9nR r1 = X.C108915Vl.A00
            if (r1 == 0) goto L_0x05fd
            X.7ME r0 = new X.7ME
            r0.<init>(r8)
            r1.A04 = r0
        L_0x05fd:
            X.C147076wd.A01(r8)
            com.whatsapp.glasses.layouts.SupToggle r2 = r8.A05
            if (r2 == 0) goto L_0x0033
            boolean r0 = r7.BCK()
            if (r0 != 0) goto L_0x0641
            X.0wG r0 = r8.A03
            if (r0 == 0) goto L_0x169f
            com.whatsapp.glasses.SUPBottomSheetView r6 = new com.whatsapp.glasses.SUPBottomSheetView
            r6.<init>(r0)
            r8.A04 = r6
            X.6Nx r5 = r8.A07
            if (r5 == 0) goto L_0x1698
            X.005 r4 = r8.A08
            if (r4 == 0) goto L_0x1691
            r3 = 1
            java.util.Map r0 = r6.A04
            java.util.Set r1 = r0.keySet()
            java.util.Set r0 = r6.A05
            java.util.LinkedHashSet r1 = X.C13640kC.A04(r0, r1)
            X.5Tk r0 = r6.A03
            java.util.Set r0 = X.C36411kG.A15(r0)
            java.util.LinkedHashSet r1 = X.C13640kC.A04(r0, r1)
            X.7MA r0 = new X.7MA
            r0.<init>(r6)
            X.AnonymousClass6T7.A00(r5, r6, r4, r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A06
            r0.set(r3)
        L_0x0641:
            X.9nR r9 = X.C108915Vl.A00
            if (r9 == 0) goto L_0x0033
            android.widget.ImageView r0 = r2.A04
            r11 = 7
            X.3YT r6 = new X.3YT
            r6.<init>(r7, r8, r9, r10, r11)
            r0.setOnClickListener(r6)
            android.widget.ImageView r2 = r2.A03
            r1 = 21
            X.3Y2 r0 = new X.3Y2
            r0.<init>(r9, r1)
            r2.setOnClickListener(r0)
            return
        L_0x065d:
            java.lang.Object r1 = r0.A00
            X.6wd r1 = (X.C147076wd) r1
            java.lang.Object r4 = r0.A01
            X.01z r4 = (X.AnonymousClass01z) r4
            java.lang.Object r3 = r0.A02
            X.7jQ r3 = (X.C159477jQ) r3
            java.lang.Object r2 = r0.A03
            X.9nR r2 = (X.C203169nR) r2
            com.whatsapp.glasses.SUPBottomSheetView r1 = r1.A04
            if (r1 == 0) goto L_0x0033
            X.7O0 r0 = new X.7O0
            r0.<init>(r2, r3)
            r1.A02 = r0
            X.C65443Sb.A01(r1, r4)
            return
        L_0x067c:
            java.lang.Object r1 = r0.A00
            X.12P r1 = (X.AnonymousClass12P) r1
            java.lang.Object r5 = r0.A01
            X.13S r5 = (X.AnonymousClass13S) r5
            java.lang.Object r6 = r0.A02
            X.0yB r6 = (X.C20800yB) r6
            java.lang.Object r7 = r0.A03
            X.5yv r7 = (X.C124865yv) r7
            r1.A06()
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0033
            r0 = 0
            X.1f2[] r0 = new X.C33281f2[r0]
            X.60r r8 = new X.60r
            r8.<init>(r0)
            r3 = 1
            java.lang.String r0 = "DatabaseMigrationManager/processAllRollbacks"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashSet r4 = X.C36441kJ.A16()
            X.13R r0 = r5.A06
            X.0wy r0 = r0.A00()
            X.0y6 r0 = r0.values()
            X.14x r2 = r0.iterator()
        L_0x06b3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06cf
            java.lang.Object r1 = r2.next()
            X.15p r1 = (X.C227415p) r1
            boolean r0 = r1.A09()
            if (r0 != 0) goto L_0x06cb
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x06b3
        L_0x06cb:
            r1.A06()
            goto L_0x06b3
        L_0x06cf:
            r5.A03(r8, r4, r3)
            r0 = 425(0x1a9, float:5.96E-43)
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x06dd
            r5.A02()
        L_0x06dd:
            X.12P r0 = r7.A04
            r0.A06()
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x06f1
            java.lang.String r0 = "AsyncMigrations/shouldRunAsyncMigrations, message store is not ready, skip async migrations."
        L_0x06e8:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "AsyncMigrations/finalizeMigrationsAppAsyncInit, migrations shouldn't be run on async init."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x06f1:
            X.0v0 r10 = r7.A03
            X.005 r12 = r10.A00
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r12)
            java.lang.String r11 = "backup_restore_state"
            r9 = 0
            int r1 = r0.getInt(r11, r9)
            r0 = 512(0x200, float:7.175E-43)
            if (r1 == r0) goto L_0x0743
            long r1 = java.lang.System.currentTimeMillis()
            X.12i r8 = r7.A05
            r4 = 0
            java.lang.String r6 = "async_init_migration_start_time"
            long r13 = r8.A00(r6, r4)
            long r4 = r1 - r13
            long r13 = java.lang.Math.abs(r4)
            r4 = 7200000(0x6ddd00, double:3.5572727E-317)
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0740
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AsyncMigrations/shouldRunAsyncMigrations, skip because of time from last run is equal to "
            r2.append(r0)
            long r0 = X.C36391kE.A0B(r13)
            r2.append(r0)
            java.lang.String r0 = " seconds, should be more then "
            r2.append(r0)
            r0 = 7200(0x1c20, double:3.5573E-320)
            r2.append(r0)
            java.lang.String r0 = " seconds."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
            goto L_0x06e8
        L_0x0740:
            r8.A03(r6, r1)
        L_0x0743:
            X.54g r0 = r7.A07
            r0.A03(r9)
            X.0yf r1 = r7.A00
            X.0yi r0 = X.C21100yf.A0e
            boolean r2 = r1.A09(r0)
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r12)
            int r1 = r0.getInt(r11, r9)
            r0 = 512(0x200, float:7.175E-43)
            boolean r5 = X.AnonymousClass000.A1S(r1, r0)
            if (r2 != 0) goto L_0x0763
            if (r5 != 0) goto L_0x0763
            return
        L_0x0763:
            X.2OT r6 = new X.2OT
            r6.<init>()
            java.lang.String r0 = "OnAsyncInitMigrationRunner/ftsMigration"
            X.14g r8 = new X.14g
            r8.<init>((java.lang.String) r0)
            X.13R r0 = r7.A08
            java.lang.String r1 = "message_fts"
            X.0wy r0 = r0.A00()
            java.lang.Object r11 = r0.get(r1)
            X.15p r11 = (X.C227415p) r11
            if (r11 == 0) goto L_0x07ab
            boolean r0 = r11.A0A()
            if (r0 != 0) goto L_0x07ab
            java.util.HashSet r4 = X.C36441kJ.A16()
            r4.add(r1)
            X.1f2[] r3 = new X.C33281f2[r3]
            X.15t r2 = r7.A01
            X.0wo r1 = r7.A02
            X.6s1 r0 = new X.6s1
            r0.<init>(r2, r1)
            r3[r9] = r0
            X.60r r2 = new X.60r
            r2.<init>(r3)
            X.13S r1 = r7.A06
            r0 = 7
            boolean r0 = r1.A03(r2, r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A00 = r0
        L_0x07ab:
            if (r5 == 0) goto L_0x0033
            if (r11 == 0) goto L_0x0033
            X.199 r5 = r7.A0A
            java.lang.String r4 = "fts_migration_elapsed_time_in_ms"
            r1 = 0
            java.lang.String r0 = r5.A07(r4)
            long r2 = X.AnonymousClass6R8.A01(r0, r1)
            boolean r0 = r11.A0A()
            if (r0 == 0) goto L_0x07df
            r10.A14(r9)
            long r0 = r8.A01()
            long r0 = r0 + r2
            long r0 = X.C36391kE.A0B(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A01 = r0
            X.0yW r0 = r7.A09
            r0.Bly(r6)
            r0 = 0
        L_0x07db:
            X.AnonymousClass199.A04(r5, r4, r0)
            return
        L_0x07df:
            long r0 = r8.A01()
            long r2 = r2 + r0
            java.lang.String r0 = java.lang.String.valueOf(r2)
            goto L_0x07db
        L_0x07e9:
            java.lang.Object r3 = r0.A02     // Catch:{ all -> 0x0859 }
            android.content.Intent r3 = (android.content.Intent) r3     // Catch:{ all -> 0x0859 }
            java.lang.String r1 = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"
            r2 = 0
            boolean r7 = r3.getBooleanExtra(r1, r2)     // Catch:{ all -> 0x0859 }
            java.lang.String r1 = "KEY_BATTERY_CHARGING_PROXY_ENABLED"
            boolean r6 = r3.getBooleanExtra(r1, r2)     // Catch:{ all -> 0x0859 }
            java.lang.String r1 = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"
            boolean r5 = r3.getBooleanExtra(r1, r2)     // Catch:{ all -> 0x0859 }
            java.lang.String r1 = "KEY_NETWORK_STATE_PROXY_ENABLED"
            boolean r4 = r3.getBooleanExtra(r1, r2)     // Catch:{ all -> 0x0859 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0859 }
            java.lang.String r1 = "Updating proxies: (BatteryNotLowProxy ("
            r2.append(r1)     // Catch:{ all -> 0x0859 }
            r2.append(r7)     // Catch:{ all -> 0x0859 }
            java.lang.String r1 = "), BatteryChargingProxy ("
            r2.append(r1)     // Catch:{ all -> 0x0859 }
            r2.append(r6)     // Catch:{ all -> 0x0859 }
            java.lang.String r1 = "), StorageNotLowProxy ("
            r2.append(r1)     // Catch:{ all -> 0x0859 }
            r2.append(r5)     // Catch:{ all -> 0x0859 }
            java.lang.String r1 = "), NetworkStateProxy ("
            r2.append(r1)     // Catch:{ all -> 0x0859 }
            r2.append(r4)     // Catch:{ all -> 0x0859 }
            java.lang.String r1 = "), "
            java.lang.String r3 = X.AnonymousClass000.A0q(r1, r2)     // Catch:{ all -> 0x0859 }
            X.6VD r2 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x0859 }
            java.lang.String r1 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.A00     // Catch:{ all -> 0x0859 }
            r2.A04(r1, r3)     // Catch:{ all -> 0x0859 }
            java.lang.Object r2 = r0.A01     // Catch:{ all -> 0x0859 }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ all -> 0x0859 }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy> r1 = androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy.class
            X.AnonymousClass6I0.A00(r2, r1, r7)     // Catch:{ all -> 0x0859 }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy> r1 = androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy.class
            X.AnonymousClass6I0.A00(r2, r1, r6)     // Catch:{ all -> 0x0859 }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy> r1 = androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy.class
            X.AnonymousClass6I0.A00(r2, r1, r5)     // Catch:{ all -> 0x0859 }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy> r1 = androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy.class
            X.AnonymousClass6I0.A00(r2, r1, r4)     // Catch:{ all -> 0x0859 }
            java.lang.Object r0 = r0.A03
            android.content.BroadcastReceiver$PendingResult r0 = (android.content.BroadcastReceiver.PendingResult) r0
            r0.finish()
            return
        L_0x0859:
            r1 = move-exception
            java.lang.Object r0 = r0.A03
            android.content.BroadcastReceiver$PendingResult r0 = (android.content.BroadcastReceiver.PendingResult) r0
            r0.finish()
            throw r1
        L_0x0862:
            java.lang.Object r4 = r0.A03
            java.lang.String r7 = r4.toString()
            X.6VD r3 = X.AnonymousClass6VD.A00()
            java.lang.String r5 = X.C138786ih.A02
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "Updating progress for "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = " ("
            r2.append(r1)
            java.lang.Object r6 = r0.A01
            X.6X2 r6 = (X.AnonymousClass6X2) r6
            r2.append(r6)
            java.lang.String r1 = ")"
            X.AnonymousClass6VD.A03(r3, r1, r5, r2)
            java.lang.Object r1 = r0.A00
            X.6ih r1 = (X.C138786ih) r1
            androidx.work.impl.WorkDatabase r3 = r1.A00
            r3.A06()
            X.7lt r1 = r3.A0D()     // Catch:{ all -> 0x08f3 }
            X.6QA r1 = r1.BJH(r7)     // Catch:{ all -> 0x08f3 }
            if (r1 == 0) goto L_0x08e7
            java.lang.Integer r2 = r1.A0E     // Catch:{ all -> 0x08f3 }
            java.lang.Integer r1 = X.C023109s.A01     // Catch:{ all -> 0x08f3 }
            if (r2 != r1) goto L_0x08c0
            X.5nv r4 = new X.5nv     // Catch:{ all -> 0x08f3 }
            r4.<init>(r6, r7)     // Catch:{ all -> 0x08f3 }
            X.7eA r1 = r3.A0C()     // Catch:{ all -> 0x08f3 }
            X.6iv r1 = (X.C138926iv) r1     // Catch:{ all -> 0x08f3 }
            X.6Q8 r2 = r1.A01     // Catch:{ all -> 0x08f3 }
            r2.A05()     // Catch:{ all -> 0x08f3 }
            r2.A06()     // Catch:{ all -> 0x08f3 }
            X.4oV r1 = r1.A00     // Catch:{ all -> 0x08ee }
            r1.A04(r4)     // Catch:{ all -> 0x08ee }
            r2.A07()     // Catch:{ all -> 0x08ee }
            goto L_0x08d8
        L_0x08c0:
            X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x08f3 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x08f3 }
            java.lang.String r1 = "Ignoring setProgressAsync(...). WorkSpec ("
            r2.append(r1)     // Catch:{ all -> 0x08f3 }
            r2.append(r7)     // Catch:{ all -> 0x08f3 }
            java.lang.String r1 = ") is not in a RUNNING state."
            r2.append(r1)     // Catch:{ all -> 0x08f3 }
            X.AnonymousClass000.A1A(r2, r5)     // Catch:{ all -> 0x08f3 }
            goto L_0x08db
        L_0x08d8:
            X.AnonymousClass6Q8.A01(r2)     // Catch:{ all -> 0x08f3 }
        L_0x08db:
            java.lang.Object r2 = r0.A02     // Catch:{ all -> 0x08f3 }
            X.4pl r2 = (X.C97484pl) r2     // Catch:{ all -> 0x08f3 }
            r1 = 0
            r2.A06(r1)     // Catch:{ all -> 0x08f3 }
            r3.A07()     // Catch:{ all -> 0x08f3 }
            goto L_0x0903
        L_0x08e7:
            java.lang.String r1 = "Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r1)     // Catch:{ all -> 0x08f3 }
            goto L_0x08f2
        L_0x08ee:
            r1 = move-exception
            X.AnonymousClass6Q8.A01(r2)     // Catch:{ all -> 0x08f3 }
        L_0x08f2:
            throw r1     // Catch:{ all -> 0x08f3 }
        L_0x08f3:
            r2 = move-exception
            X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x0907 }
            java.lang.String r1 = "Error updating Worker progress"
            android.util.Log.e(r5, r1, r2)     // Catch:{ all -> 0x0907 }
            java.lang.Object r0 = r0.A02     // Catch:{ all -> 0x0907 }
            X.4pl r0 = (X.C97484pl) r0     // Catch:{ all -> 0x0907 }
            r0.A07(r2)     // Catch:{ all -> 0x0907 }
        L_0x0903:
            X.AnonymousClass6Q8.A01(r3)
            return
        L_0x0907:
            r0 = move-exception
            X.AnonymousClass6Q8.A01(r3)
            throw r0
        L_0x090c:
            java.lang.Object r4 = r0.A01
            X.7lf r4 = (X.C160837lf) r4
            java.lang.Object r1 = r0.A00
            X.9lP r1 = (X.C202249lP) r1
            int r3 = r1.A00
            X.9WT r2 = r1.A01
            java.lang.Object r1 = r0.A02
            X.9Bl r1 = (X.C191069Bl) r1
            java.lang.Object r0 = r0.A03
            X.9NR r0 = (X.AnonymousClass9NR) r0
            r4.Ba2(r2, r1, r0, r3)
            return
        L_0x0924:
            java.lang.Object r4 = r0.A01
            X.7lf r4 = (X.C160837lf) r4
            java.lang.Object r1 = r0.A00
            X.9lP r1 = (X.C202249lP) r1
            int r3 = r1.A00
            X.9WT r2 = r1.A01
            java.lang.Object r1 = r0.A02
            X.9Bl r1 = (X.C191069Bl) r1
            java.lang.Object r0 = r0.A03
            X.9NR r0 = (X.AnonymousClass9NR) r0
            r4.BZq(r2, r1, r0, r3)
            return
        L_0x093c:
            java.lang.Object r1 = r0.A00
            X.5oC r1 = (X.C118525oC) r1
            X.6NA r1 = r1.A00
            X.62U r3 = r1.A03
            java.lang.Object r2 = r0.A01
            X.6c3 r2 = (X.C135056c3) r2
            java.lang.Object r1 = r0.A03
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r0 = r0.A02
            X.5VK r0 = (X.AnonymousClass5VK) r0
            r3.A00(r2, r0, r1)
            return
        L_0x0954:
            java.lang.Object r4 = r0.A00
            X.6mN r4 = (X.C140916mN) r4
            java.lang.Object r3 = r0.A02
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r1 = r0.A01
            X.6MU r1 = (X.AnonymousClass6MU) r1
            java.lang.String r1 = r1.A00
            java.lang.Object r0 = r0.A03
            X.5za r0 = (X.C125255za) r0
            X.4rZ r2 = new X.4rZ
            r2.<init>(r0, r1)
            r0 = -1
            r4.A00(r2, r3, r0)
            return
        L_0x0971:
            java.lang.Object r5 = r0.A00
            X.1m0 r5 = (X.C37211m0) r5
            java.lang.Object r4 = r0.A01
            X.4Sg[] r4 = (X.C88324Sg[]) r4
            java.lang.Object r3 = r0.A02
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r0.A03
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
            r1 = 0
            r0 = 1
            r5.A00 = r0
            r0 = r4[r1]
            r0.BaO(r2, r3)
            return
        L_0x098b:
            java.lang.Object r7 = r0.A00
            X.5w0 r7 = (X.C123135w0) r7
            java.lang.Object r4 = r0.A01
            X.6c3 r4 = (X.C135056c3) r4
            java.lang.Object r3 = r0.A02
            X.5oC r3 = (X.C118525oC) r3
            java.lang.Object r5 = r0.A03
            java.util.concurrent.atomic.AtomicBoolean r5 = (java.util.concurrent.atomic.AtomicBoolean) r5
            r6 = 2
            X.C36341k9.A1E(r3, r6, r5)
            java.lang.String r2 = r4.A08     // Catch:{ MalformedURLException -> 0x0ab4 }
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0ab4 }
            r0.<init>(r2)     // Catch:{ MalformedURLException -> 0x0ab4 }
            if (r2 == 0) goto L_0x0aaf
            X.13E r1 = r7.A01     // Catch:{ IOException -> 0x0ad6 }
            X.0yd r0 = r7.A02     // Catch:{ IOException -> 0x0ad6 }
            r12 = 0
            X.6v1 r2 = r1.A02(r0, r2, r12)     // Catch:{ IOException -> 0x0ad6 }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ IOException -> 0x0ad6 }
            java.net.HttpURLConnection r8 = r2.A01     // Catch:{ 5VK -> 0x0b1c }
            int r1 = r8.getResponseCode()     // Catch:{ 5VK -> 0x0b1c }
            r0 = 400(0x190, float:5.6E-43)
            if (r1 >= r0) goto L_0x0a90
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r0 = "ARDAssetDownloader Received response from server for asset "
            r8.append(r0)     // Catch:{ 5VK -> 0x0b1c }
            X.6VA r0 = r4.A01     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r1 = r0.A0A     // Catch:{ 5VK -> 0x0b1c }
            r8.append(r1)     // Catch:{ 5VK -> 0x0b1c }
            r0 = 46
            r8.append(r0)     // Catch:{ 5VK -> 0x0b1c }
            X.C36411kG.A1P(r8)     // Catch:{ 5VK -> 0x0b1c }
            java.io.File r0 = r7.A04     // Catch:{ 5VK -> 0x0b1c }
            r0.mkdirs()     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ 5VK -> 0x0b1c }
            java.io.File r10 = X.C90524aI.A0T(r0, r1)     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r1 = r10.getAbsolutePath()     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r0 = r10.getCanonicalPath()     // Catch:{ 5VK -> 0x0b1c }
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ 5VK -> 0x0b1c }
            if (r0 == 0) goto L_0x0aef
            r11 = 0
            X.0ww r1 = r7.A00     // Catch:{ IOException -> 0x0a75 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x0a75 }
            X.5RE r0 = r2.B8D(r1, r12, r0)     // Catch:{ IOException -> 0x0a75 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0a75 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0a75 }
            java.lang.String r7 = "local_io_failure"
            r1 = 1
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0a51, SecurityException -> 0x0a5b }
            r0.<init>(r10, r1)     // Catch:{ FileNotFoundException -> 0x0a51, SecurityException -> 0x0a5b }
            r11 = r0
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r13 = new byte[r0]     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
            long r6 = r10.length()     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
            r0 = 0
        L_0x0a14:
            boolean r8 = r5.get()     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
            if (r8 == 0) goto L_0x0a1e
            r10.delete()     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
            goto L_0x0a3e
        L_0x0a1e:
            int r9 = r2.read(r13)     // Catch:{ IOException | RuntimeException -> 0x0a45 }
            r8 = -1
            if (r9 != r8) goto L_0x0a26
            goto L_0x0a2d
        L_0x0a26:
            r8 = 0
            r11.write(r13, r8, r9)     // Catch:{  }
            long r8 = (long) r9     // Catch:{  }
            long r0 = r0 + r8
            goto L_0x0a14
        L_0x0a2d:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
            java.lang.String r8 = "ARDAssetDownloader Download finished. Start bytes: "
            r9.append(r8)     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
            r9.append(r6)     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
            java.lang.String r6 = ". Bytes saved: "
            X.C36321k7.A1V(r6, r9, r0)     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
        L_0x0a3e:
            X.C129346Go.A01(r11, r2)     // Catch:{ 5VK -> 0x0b1c }
            X.C129346Go.A00(r3, r4, r12, r10, r5)     // Catch:{ 5VK -> 0x0b1c }
            return
        L_0x0a45:
            r1 = move-exception
            X.63o r0 = X.C108395Ti.A00()     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
            r0.A03 = r1     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
            X.5VK r0 = r0.A00()     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
            throw r0     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
        L_0x0a51:
            r6 = move-exception
            X.63o r1 = X.C108395Ti.A00()     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
            r1.A02 = r7     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
            java.lang.String r0 = "Destination file could not be found."
            goto L_0x0a64
        L_0x0a5b:
            r6 = move-exception
            X.63o r1 = X.C108395Ti.A00()     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
            r1.A02 = r7     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
            java.lang.String r0 = "No write access to the destination file."
        L_0x0a64:
            r1.A01 = r0     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
            r1.A03 = r6     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
            X.5VK r0 = r1.A00()     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
            throw r0     // Catch:{ 5VK -> 0x0a71, all -> 0x0a6d }
        L_0x0a6d:
            r0 = move-exception
            r12 = r11
            r11 = r2
            goto L_0x0a8b
        L_0x0a71:
            r0 = move-exception
            r12 = r11
            r11 = r2
            goto L_0x0a86
        L_0x0a75:
            r2 = move-exception
            X.63o r1 = X.C108395Ti.A00()     // Catch:{ 5VK -> 0x0a85 }
            java.lang.String r0 = "downloader_error"
            r1.A02 = r0     // Catch:{ 5VK -> 0x0a85 }
            r1.A03 = r2     // Catch:{ 5VK -> 0x0a85 }
            X.5VK r0 = r1.A00()     // Catch:{ 5VK -> 0x0a85 }
            throw r0     // Catch:{ 5VK -> 0x0a85 }
        L_0x0a85:
            r0 = move-exception
        L_0x0a86:
            r10.delete()     // Catch:{ all -> 0x0a8a }
            throw r0     // Catch:{ all -> 0x0a8a }
        L_0x0a8a:
            r0 = move-exception
        L_0x0a8b:
            X.C129346Go.A01(r12, r11)     // Catch:{ 5VK -> 0x0b1c }
            goto L_0x0b1b
        L_0x0a90:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r0 = "ARDAssetDownloader Download error, code = "
            r1.append(r0)     // Catch:{ 5VK -> 0x0b1c }
            int r0 = r8.getResponseCode()     // Catch:{ 5VK -> 0x0b1c }
            X.C36351kA.A1R(r1, r0)     // Catch:{ 5VK -> 0x0b1c }
            X.63o r2 = X.C108395Ti.A00()     // Catch:{ 5VK -> 0x0b1c }
            int r0 = r8.getResponseCode()     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ 5VK -> 0x0b1c }
            r2.A02 = r0     // Catch:{ 5VK -> 0x0b1c }
            goto L_0x0aea
        L_0x0aaf:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()     // Catch:{ 5VK -> 0x0b1c }
            goto L_0x0b1b
        L_0x0ab4:
            r6 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r0 = "ARDAssetDownloader Invalid URI: "
            r2.append(r0)     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r1 = r4.A08     // Catch:{ 5VK -> 0x0b1c }
            X.C36351kA.A1Q(r1, r2, r6)     // Catch:{ 5VK -> 0x0b1c }
            X.63o r2 = X.C108395Ti.A00()     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r0 = "malformed_url"
            r2.A02 = r0     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r0 = "url"
            java.util.Map r0 = java.util.Collections.singletonMap(r0, r1)     // Catch:{ 5VK -> 0x0b1c }
            r2.A04 = r0     // Catch:{ 5VK -> 0x0b1c }
            r2.A03 = r6     // Catch:{ 5VK -> 0x0b1c }
            goto L_0x0aea
        L_0x0ad6:
            r1 = move-exception
            java.lang.String r0 = "ARDAssetDownloader Runtime exception when downloading."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 5VK -> 0x0b1c }
            X.63o r2 = X.C108395Ti.A00()     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r0 = "local_io_failure"
            r2.A02 = r0     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r0 = "Error in downloading file."
            r2.A01 = r0     // Catch:{ 5VK -> 0x0b1c }
            r2.A03 = r1     // Catch:{ 5VK -> 0x0b1c }
        L_0x0aea:
            X.5VK r0 = r2.A00()     // Catch:{ 5VK -> 0x0b1c }
            goto L_0x0b1b
        L_0x0aef:
            r10.delete()     // Catch:{ 5VK -> 0x0b1c }
            X.63o r2 = X.C108395Ti.A00()     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r0 = "downloader_error"
            r2.A02 = r0     // Catch:{ 5VK -> 0x0b1c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r0 = "The absolute path of temp file: "
            X.C90464aC.A1A(r10, r0, r1)     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r0 = " is different from the canonical path: "
            r1.append(r0)     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r0 = r10.getCanonicalPath()     // Catch:{ 5VK -> 0x0b1c }
            r1.append(r0)     // Catch:{ 5VK -> 0x0b1c }
            java.lang.String r0 = ". This might cause directory traversal."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ 5VK -> 0x0b1c }
            r2.A01 = r0     // Catch:{ 5VK -> 0x0b1c }
            X.5VK r0 = r2.A00()     // Catch:{ 5VK -> 0x0b1c }
        L_0x0b1b:
            throw r0     // Catch:{ 5VK -> 0x0b1c }
        L_0x0b1c:
            r1 = move-exception
            r0 = 0
            X.C129346Go.A00(r3, r4, r1, r0, r5)
            return
        L_0x0b22:
            java.lang.Object r3 = r0.A01
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            java.lang.Object r2 = r0.A02
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            java.lang.Object r1 = r0.A03
            java.io.BufferedInputStream r1 = (java.io.BufferedInputStream) r1
            java.util.concurrent.Executor r0 = X.AnonymousClass6Y6.A00
            r0 = 0
            r3.set(r0)
            r2.disconnect()
            X.AnonymousClass14X.A02(r1)
            return
        L_0x0b3b:
            java.lang.Object r2 = r0.A00
            X.141 r2 = (X.AnonymousClass141) r2
            java.lang.Object r1 = r0.A01
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r7 = r0.A02
            com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment r7 = (com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment) r7
            java.lang.Object r5 = r0.A03
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r2.A0E()
            if (r0 == 0) goto L_0x0b57
            r0 = 2131893562(0x7f121d3a, float:1.9421904E38)
            r1.setText(r0)
        L_0x0b57:
            X.AnonymousClass00C.A0B(r5)
            X.0yC r1 = r7.A02
            X.AnonymousClass00C.A07(r1)
            r0 = 6187(0x182b, float:8.67E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0bab
            X.1e1 r6 = r7.A0C
            if (r6 == 0) goto L_0x0ba4
            android.content.Context r4 = r7.A1D()
            r2 = 2131893337(0x7f121c59, float:1.9421448E38)
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            r0 = 0
            java.lang.String r3 = "learn-more"
            java.lang.String r2 = X.C36401kF.A0q(r7, r3, r1, r0, r2)
            r1 = 23
            X.AVW r0 = new X.AVW
            r0.<init>(r7, r1)
            android.text.SpannableStringBuilder r2 = r6.A02(r4, r0, r2, r3)
            X.0yC r0 = r7.A02
            X.C36331k8.A10(r5, r0)
            android.graphics.Rect r0 = X.AnonymousClass0BN.A0A
            X.0yb r1 = r7.A07
            if (r1 == 0) goto L_0x0b9f
            X.1gJ r0 = new X.1gJ
            r0.<init>(r5, r1)
            X.C012005e.A0V(r5, r0)
            r5.setText(r2)
            return
        L_0x0b9f:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        L_0x0ba4:
            java.lang.String r0 = "linkifier"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0bab:
            boolean r1 = r2.A0E()
            r0 = 2131893568(0x7f121d40, float:1.9421916E38)
            if (r1 == 0) goto L_0x0bb7
            r0 = 2131893563(0x7f121d3b, float:1.9421906E38)
        L_0x0bb7:
            r5.setText(r0)
            return
        L_0x0bbb:
            java.lang.Object r6 = r0.A00
            X.3Kf r6 = (X.C63483Kf) r6
            java.lang.Object r4 = r0.A01
            X.3hW r4 = (X.C71903hW) r4
            java.lang.Object r3 = r0.A02
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            java.lang.Object r5 = r0.A03
            r0 = 3
            X.AnonymousClass00C.A0D(r5, r0)
            X.2of r0 = X.C51962of.TIMED_OUT
            r6.A01 = r0
            X.1XZ r2 = r4.A02
            long r0 = r3.A1N
            r2.A02(r6, r0)
            X.17Y r2 = r4.A01
            r0 = 8
            goto L_0x0c38
        L_0x0bdd:
            java.lang.Object r4 = r0.A00
            X.1KA r4 = (X.AnonymousClass1KA) r4
            java.lang.Object r2 = r0.A01
            X.2p6 r2 = (X.C52232p6) r2
            java.lang.Object r1 = r0.A02
            X.012 r1 = (X.AnonymousClass012) r1
            java.lang.Object r3 = r0.A03
            X.4Sn r3 = (X.C88394Sn) r3
            r0 = 3
            X.AnonymousClass00C.A0D(r3, r0)
            X.AnonymousClass1KA.A00(r2, r4)
            androidx.lifecycle.LifecycleCoroutineScopeImpl r2 = X.C33311f5.A00(r1)
            r1 = 0
            com.whatsapp.bonsai.waitlist.BonsaiWaitlistSyncManager$sendAddToWaitlist$1$onSuccess$1$1 r0 = new com.whatsapp.bonsai.waitlist.BonsaiWaitlistSyncManager$sendAddToWaitlist$1$onSuccess$1$1
            r0.<init>(r3, r1)
            X.C36331k8.A1T(r0, r2)
            return
        L_0x0c02:
            java.lang.Object r4 = r0.A00
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r4 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r4
            java.lang.Object r5 = r0.A01
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.Object r2 = r0.A02
            java.lang.Number r2 = (java.lang.Number) r2
            java.lang.Object r3 = r0.A03
            android.content.Context r1 = r4.getApplicationContext()
            X.0ts r0 = r4.A0D
            double r6 = r5.doubleValue()
            double r8 = r2.doubleValue()
            java.util.Locale r0 = X.C36401kF.A0x(r0)
            android.location.Geocoder r5 = new android.location.Geocoder
            r5.<init>(r1, r0)
            r10 = 1
            java.util.List r5 = r5.getFromLocation(r6, r8, r10)     // Catch:{ Exception -> 0x0c2d }
            goto L_0x0c34
        L_0x0c2d:
            r1 = move-exception
            java.lang.String r0 = "SearchLocationUtil/geoLocateAddress"
            com.whatsapp.util.Log.w(r0, r1)
            r5 = 0
        L_0x0c34:
            X.17Y r2 = r4.A05
            r0 = 20
        L_0x0c38:
            X.74n r1 = new X.74n
            r1.<init>(r4, r5, r3, r0)
            goto L_0x1119
        L_0x0c3f:
            java.lang.Object r2 = r0.A00
            X.652 r2 = (X.AnonymousClass652) r2
            java.lang.Object r1 = r0.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            java.lang.Object r4 = r0.A02
            java.lang.Object r5 = r0.A03
            X.16D r0 = r2.A02
            X.141 r3 = r0.A0D(r1)
            X.17Y r0 = r2.A01
            r6 = 19
            goto L_0x1158
        L_0x0c57:
            java.lang.Object r8 = r0.A00
            X.6XP r8 = (X.AnonymousClass6XP) r8
            java.lang.Object r7 = r0.A01
            java.io.File r7 = (java.io.File) r7
            java.lang.Object r10 = r0.A02
            com.whatsapp.fieldstats.events.WamCall r10 = (com.whatsapp.fieldstats.events.WamCall) r10
            java.lang.Object r9 = r0.A03
            X.2PI r9 = (X.AnonymousClass2PI) r9
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x0f30
            boolean r0 = r7.isDirectory()
            if (r0 == 0) goto L_0x0f30
            java.lang.String r4 = "call_result"
            if (r10 != 0) goto L_0x0c97
            java.lang.String r0 = "app/VoipTimeSeriesLogger: injectAdditionalDataToLogs received null fieldStat, skipping injection"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0c7c:
            X.0wG r0 = r8.A02
            android.content.Context r0 = r0.A00
            java.io.File r2 = X.C34681hT.A05(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r7.getName()
            r1.append(r0)
            java.lang.String r0 = ".zip"
            java.io.File r6 = X.C90464aC.A0K(r2, r0, r1)
            goto L_0x0e48
        L_0x0c97:
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x0e41
            boolean r0 = r7.isDirectory()
            if (r0 == 0) goto L_0x0e41
            java.io.File[] r11 = r7.listFiles()
            if (r11 == 0) goto L_0x0c7c
            X.75u r0 = X.C1505775u.A00
            java.util.Arrays.sort(r11, r0)
            int r6 = r11.length
            r5 = 0
        L_0x0cb0:
            java.lang.String r2 = "app/VoipTimeSeriesLogger: injectAdditionalDataToLogs could not inject into time series file"
            r1 = 1
            if (r5 >= r6) goto L_0x0cd8
            r0 = r11[r5]
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0cd1 }
            r3.<init>(r0, r1)     // Catch:{ IOException -> 0x0cd1 }
            java.lang.String r1 = "user_rating"
            java.lang.Long r0 = r10.userRating     // Catch:{ all -> 0x0cc7 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0cc7 }
            r3.close()     // Catch:{ IOException -> 0x0cd1 }
            goto L_0x0cd5
        L_0x0cc7:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0ccc }
            goto L_0x0cd0
        L_0x0ccc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0cd1 }
        L_0x0cd0:
            throw r1     // Catch:{ IOException -> 0x0cd1 }
        L_0x0cd1:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
        L_0x0cd5:
            int r5 = r5 + 1
            goto L_0x0cb0
        L_0x0cd8:
            int r6 = r6 - r1
            r0 = r11[r6]
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0e3b }
            r3.<init>(r0, r1)     // Catch:{ IOException -> 0x0e3b }
            java.lang.String r1 = "call_t"
            java.lang.Long r0 = r10.callT     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.Integer r0 = r10.callResult     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A02(r3, r0, r4)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "freeze_t"
            java.lang.Long r0 = r10.videoRenderFreezeT     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "freeze_8x"
            java.lang.Long r0 = r10.videoRenderFreeze8xT     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "num_freezes"
            java.lang.Long r0 = r10.videoRenderNumFreezes     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "jb_lost"
            java.lang.Double r0 = r10.jbLost     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A01(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "jb_empties"
            java.lang.Double r0 = r10.jbEmpties     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A01(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "jb_gets"
            java.lang.Double r0 = r10.jbGets     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A01(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "rtt"
            java.lang.Long r0 = r10.callAvgRtt     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "jb_delay"
            java.lang.Double r0 = r10.jbAvgDelay     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A01(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "max_participants"
            java.lang.Long r0 = r10.maxConnectedParticipants     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "num_participants"
            java.lang.Long r0 = r10.numConnectedParticipants     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "vid_rx_bps"
            java.lang.Double r0 = r10.videoRxBitrate     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A01(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "freeze_high_bwe_t"
            java.lang.Long r0 = r10.renderFreezeHighPeerBweT     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "high_bwe_t"
            java.lang.Long r0 = r10.highPeerBweT     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "freeze_mid_bwe_t"
            java.lang.Long r0 = r10.renderFreezeLowToHighPeerBweT     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "mid_bwe_t"
            java.lang.Long r0 = r10.lowToHighPeerBweT     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "freeze_low_bwe_t"
            java.lang.Long r0 = r10.renderFreezeLowPeerBweT     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "low_bwe_t"
            java.lang.Long r0 = r10.lowPeerBweT     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "jb_lostempty_pct_low_bwe"
            java.lang.Double r0 = r10.jbLostEmptyLowPeerBwePerSec     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A01(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "jb_lostempty_pct_mid_bwe"
            java.lang.Double r0 = r10.jbLostEmptyLowToHighPeerBwePerSec     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A01(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "jb_lostempty_pct_high_bwe"
            java.lang.Double r0 = r10.jbLostEmptyHighPeerBwePerSec     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A01(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "new_end_call_survey_version"
            java.lang.Long r0 = r10.newEndCallSurveyVersion     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "user_problems"
            java.lang.Long r0 = r10.userProblems     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "user_description"
            java.lang.String r0 = r10.userDescription     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A04(r3, r1, r0)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_end_reconnecting"
            java.lang.Boolean r0 = r10.callEndReconnecting     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A00(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_end_reconnecting_signaling_accessible"
            java.lang.Boolean r0 = r10.callEndReconnectingSignalingAccessible     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A00(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_end_reconnecting_relay_pingable"
            java.lang.Boolean r0 = r10.callEndReconnectingRelayPingable     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A00(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_reconnecting_probe_state"
            java.lang.Long r0 = r10.callReconnectingProbeState     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_initial_rtt"
            java.lang.Long r0 = r10.callInitialRtt     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_average_rtt"
            java.lang.Long r0 = r10.callAvgRtt     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_last_rtt"
            java.lang.Long r0 = r10.callLastRtt     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_relay_bind_status"
            java.lang.Integer r0 = r10.callRelayBindStatus     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A02(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.Integer r0 = r10.callResult     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A02(r3, r0, r4)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_transport_relay_to_relay_fallback_count"
            java.lang.Long r0 = r10.callTransportRelayToRelayFallbackCount     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_transport_p2p_to_relay_fallback_count"
            java.lang.Long r0 = r10.callTransportP2pToRelayFallbackCount     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_reconnecting_state_count"
            java.lang.Long r0 = r10.callReconnectingStateCount     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_setup_t"
            java.lang.Long r0 = r10.callSetupT     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_test_bucket"
            java.lang.String r0 = r10.callTestBucket     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A04(r3, r1, r0)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_end_reconnecting_expected_bitmap"
            java.lang.Long r0 = r10.callEndReconnectingExpectedBitmap     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_relay_error_code"
            java.lang.Long r0 = r10.callRelayErrorCode     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_transport"
            java.lang.Integer r0 = r10.callTransport     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A02(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_side"
            java.lang.Integer r0 = r10.callSide     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A02(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_network"
            java.lang.Integer r0 = r10.callNetwork     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A02(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "xpop_call_peer_relay_ip"
            java.lang.String r0 = r10.xpopCallPeerRelayIp     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A04(r3, r1, r0)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "max_unbound_relay_count"
            java.lang.Long r0 = r10.maxUnboundRelayCount     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_setup_error_type"
            java.lang.Integer r0 = r10.callSetupErrorType     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A02(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            java.lang.String r1 = "call_transition_count"
            java.lang.Long r0 = r10.callTransitionCount     // Catch:{ all -> 0x0e31 }
            X.AnonymousClass6XP.A03(r3, r0, r1)     // Catch:{ all -> 0x0e31 }
            r3.close()     // Catch:{ IOException -> 0x0e3b }
            goto L_0x0c7c
        L_0x0e31:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0e36 }
            goto L_0x0e3a
        L_0x0e36:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0e3b }
        L_0x0e3a:
            throw r1     // Catch:{ IOException -> 0x0e3b }
        L_0x0e3b:
            r0 = move-exception
            com.whatsapp.util.Log.w(r2, r0)
            goto L_0x0c7c
        L_0x0e41:
            java.lang.String r0 = "app/VoipTimeSeriesLogger: injectAdditionalDataToLogs received bad directory path, skipping injection."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0c7c
        L_0x0e48:
            java.io.FileOutputStream r3 = X.C90524aI.A0W(r6)     // Catch:{ IOException -> 0x0ea4 }
            java.util.zip.ZipOutputStream r5 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x0e9a }
            r5.<init>(r3)     // Catch:{ all -> 0x0e9a }
            java.io.File[] r13 = r7.listFiles()     // Catch:{ all -> 0x0e90 }
            if (r13 == 0) goto L_0x0e89
            int r12 = r13.length     // Catch:{ all -> 0x0e90 }
            r11 = 0
        L_0x0e59:
            if (r11 >= r12) goto L_0x0e89
            r1 = r13[r11]     // Catch:{ all -> 0x0e90 }
            java.io.FileInputStream r4 = X.C90524aI.A0U(r1)     // Catch:{ all -> 0x0e90 }
            X.AnonymousClass6YY.A0F(r1, r4, r5)     // Catch:{ all -> 0x0e7f }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0e7f }
            java.lang.String r0 = "app/VoipTimeSeriesLogger: compressed file "
            X.C90474aD.A16(r1, r0, r2)     // Catch:{ all -> 0x0e7f }
            java.lang.String r0 = " with init size "
            r2.append(r0)     // Catch:{ all -> 0x0e7f }
            long r0 = r1.length()     // Catch:{ all -> 0x0e7f }
            X.C36351kA.A1S(r2, r0)     // Catch:{ all -> 0x0e7f }
            r4.close()     // Catch:{ all -> 0x0e90 }
            int r11 = r11 + 1
            goto L_0x0e59
        L_0x0e7f:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0e84 }
            goto L_0x0e88
        L_0x0e84:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0e90 }
        L_0x0e88:
            throw r1     // Catch:{ all -> 0x0e90 }
        L_0x0e89:
            r5.close()     // Catch:{ all -> 0x0e9a }
            r3.close()     // Catch:{ IOException -> 0x0ea4 }
            goto L_0x0eae
        L_0x0e90:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0e95 }
            goto L_0x0e99
        L_0x0e95:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0e9a }
        L_0x0e99:
            throw r1     // Catch:{ all -> 0x0e9a }
        L_0x0e9a:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0e9f }
            goto L_0x0ea3
        L_0x0e9f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0ea4 }
        L_0x0ea3:
            throw r1     // Catch:{ IOException -> 0x0ea4 }
        L_0x0ea4:
            r1 = move-exception
            java.lang.String r0 = "app/VoipTimeSeriesLogger: could not create compressed time series file"
            com.whatsapp.util.Log.w(r0, r1)
            r6.delete()
            goto L_0x0ee0
        L_0x0eae:
            r0 = 0
            long r4 = X.AnonymousClass6YY.A00(r0, r7)
            long r13 = r6.length()
            r11 = 4636737291354636288(0x4059000000000000, double:100.0)
            long r0 = r4 - r13
            double r2 = (double) r0
            double r2 = r2 * r11
            double r0 = (double) r4
            double r2 = r2 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r9.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r9.A02 = r0
            long r3 = r6.length()
            int r0 = r8.A00
            long r0 = (long) r0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0efa
            boolean r0 = X.AnonymousClass6XP.A05(r8, r10, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A00 = r0
        L_0x0ee0:
            boolean r0 = X.AnonymousClass6YY.A0Q(r7)
            if (r0 != 0) goto L_0x0ef4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "app/VoipTimeSeriesLogger: time series data directory "
            X.C90464aC.A1A(r7, r0, r1)
            java.lang.String r0 = " could not be deleted"
            X.C36341k9.A1O(r1, r0)
        L_0x0ef4:
            X.0yW r0 = r8.A03
            r0.Bly(r9)
            return
        L_0x0efa:
            r3 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r9.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "app/VoipTimeSeriesLogger: aborting upload because file "
            X.C90474aD.A16(r6, r0, r1)
            java.lang.String r0 = " has size "
            X.C90464aC.A19(r6, r0, r1)
            java.lang.String r0 = " which exceeds the threshold "
            r1.append(r0)
            int r0 = r8.A00
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0wN r2 = r8.A01
            long r0 = r6.length()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "voip-time-series-upload-aborted"
            r2.A0E(r0, r1, r3)
            r6.delete()
            goto L_0x0ee0
        L_0x0f30:
            java.lang.String r0 = "app/VoipTimeSeriesLogger: uploadTimeSeries received bad directory path, skipping upload."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0f36:
            java.lang.Object r2 = r0.A00
            X.6LU r2 = (X.AnonymousClass6LU) r2
            java.lang.Object r1 = r0.A01
            X.9iV r1 = (X.C200939iV) r1
            java.lang.Object r6 = r0.A02
            X.02t r6 = (X.C006302t) r6
            java.lang.Object r5 = r0.A03
            X.A8x r5 = (X.C21112A8x) r5
            X.5pr r4 = r2.A04
            com.whatsapp.jid.UserJid r3 = r1.A07
            X.AnonymousClass00C.A07(r3)
            X.9K5 r1 = r1.A00
            if (r1 == 0) goto L_0x0f82
            X.00T r0 = r4.A01
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            java.lang.Object r2 = r0.get()
            java.lang.String r1 = r1.A02
            X.6A4 r0 = new X.6A4
            r0.<init>(r3, r1)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0f82
            X.9VS r0 = r5.A01
            r4.A00 = r0
            java.util.List r0 = r5.A02
            boolean r0 = X.C36401kF.A1a(r0)
            if (r0 == 0) goto L_0x0f7f
            X.8XB r0 = new X.8XB
            r0.<init>(r5)
        L_0x0f7b:
            r6.invoke(r0)
            return
        L_0x0f7f:
            X.8XF r0 = X.AnonymousClass8XF.A00
            goto L_0x0f7b
        L_0x0f82:
            X.8XG r0 = X.AnonymousClass8XG.A00
            goto L_0x0f7b
        L_0x0f85:
            java.lang.Object r5 = r0.A00
            X.2Dq r5 = (X.AnonymousClass2Dq) r5
            java.lang.Object r6 = r0.A01
            X.11F r6 = (X.AnonymousClass11F) r6
            java.lang.Object r3 = r0.A02
            java.lang.Object r2 = r0.A03
            X.C36321k7.A0w(r5, r6)
            r0 = 3
            X.AnonymousClass00C.A0D(r2, r0)
            X.16D r0 = r5.getContactManager$app_product_community_community_non_modified()
            X.141 r4 = r0.A0D(r6)
            X.17Y r0 = r5.getGlobalUI$app_product_community_community_non_modified()
            r7 = 9
            X.753 r1 = new X.753
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x115d
        L_0x0fad:
            java.lang.Object r1 = r0.A00
            X.2ZE r1 = (X.AnonymousClass2ZE) r1
            java.lang.Object r5 = r0.A01
            X.3ty r5 = (X.C79593ty) r5
            java.lang.Object r4 = r0.A02
            X.3ty r4 = (X.C79593ty) r4
            java.lang.Object r3 = r0.A03
            X.3ty r3 = (X.C79593ty) r3
            java.lang.String r0 = "CompanionBootstrapManager/startCriticalBootstrap timed out"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wp r0 = r1.A06
            android.content.SharedPreferences r2 = X.C19980wp.A00(r0)
            java.lang.String r1 = "companion_syncd_critical_bootstrap_state"
            r0 = 0
            int r2 = r2.getInt(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 2
            if (r2 < r0) goto L_0x0fe4
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r5.A0C(r0)
        L_0x0fdd:
            r4.A0C(r1)
            r3.A0C(r1)
            return
        L_0x0fe4:
            r5.A0C(r1)
            goto L_0x0fdd
        L_0x0fe8:
            java.lang.Object r2 = r0.A00
            X.7r6 r2 = (X.C163997r6) r2
            java.lang.Object r1 = r0.A01
            X.6Fp r1 = (X.C129166Fp) r1
            java.lang.Object r10 = r0.A02
            X.6Lp r10 = (X.C130576Lp) r10
            java.lang.Object r9 = r0.A03
            X.36I r9 = (X.AnonymousClass36I) r9
            java.io.File r8 = r1.A03()
            X.C18740tg.A06(r8)
            java.lang.Object r7 = r2.A00
            X.6WD r7 = (X.AnonymousClass6WD) r7
            X.1aT r0 = r7.A0L
            java.lang.String r6 = r10.A08
            java.lang.String r5 = r8.getAbsolutePath()
            X.C18740tg.A00()
            X.18P r0 = r0.A00
            X.1M0 r4 = r0.A04()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x102b }
            java.lang.String r2 = "UPDATE history_sync_companion SET local_path = ? WHERE message_id = ?"
            java.lang.String[] r1 = X.C36441kJ.A1S()     // Catch:{ all -> 0x102b }
            X.C36331k8.A1N(r5, r6, r1)     // Catch:{ all -> 0x102b }
            java.lang.String r0 = "HistorySyncCompanionStore.UPDATE_CHUNK_WITH_LOCAL_PATH"
            r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x102b }
            r4.close()
            X.AnonymousClass6WD.A01(r9, r7, r10, r8)
            return
        L_0x102b:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x1030 }
            throw r1
        L_0x1030:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x1035:
            java.lang.Object r3 = r0.A00
            X.3P7 r3 = (X.AnonymousClass3P7) r3
            java.lang.Object r6 = r0.A01
            X.141 r6 = (X.AnonymousClass141) r6
            java.lang.Object r4 = r0.A02
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r5 = r0.A03
            X.C36321k7.A0x(r6, r4)
            X.16D r7 = r3.A02
            X.16p r2 = r7.A05
            X.16r r0 = r2.A00     // Catch:{ IllegalArgumentException -> 0x10e6 }
            X.1M0 r10 = r0.A04()     // Catch:{ IllegalArgumentException -> 0x10e6 }
            X.71s r14 = r10.B1k()     // Catch:{ all -> 0x10dc }
            r0 = 10
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x10d2 }
            r12.<init>(r0)     // Catch:{ all -> 0x10d2 }
            java.lang.String r1 = "given_name"
            java.lang.String r0 = r6.A0R     // Catch:{ all -> 0x10d2 }
            r12.put(r1, r0)     // Catch:{ all -> 0x10d2 }
            java.lang.String r1 = "family_name"
            java.lang.String r0 = r6.A0Q     // Catch:{ all -> 0x10d2 }
            r12.put(r1, r0)     // Catch:{ all -> 0x10d2 }
            java.lang.String r1 = "display_name"
            java.lang.String r0 = r6.A0J()     // Catch:{ all -> 0x10d2 }
            r12.put(r1, r0)     // Catch:{ all -> 0x10d2 }
            java.lang.String r1 = "is_whatsapp_user"
            r8 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x10d2 }
            r12.put(r1, r0)     // Catch:{ all -> 0x10d2 }
            java.lang.String r1 = "wa_name"
            java.lang.String r0 = r6.A0a     // Catch:{ all -> 0x10d2 }
            r12.put(r1, r0)     // Catch:{ all -> 0x10d2 }
            java.lang.String r1 = "is_wa_created_contact"
            boolean r0 = r6.A0s     // Catch:{ all -> 0x10d2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x10d2 }
            r12.put(r1, r0)     // Catch:{ all -> 0x10d2 }
            java.lang.String r1 = "sync_policy"
            int r0 = r6.A07     // Catch:{ all -> 0x10d2 }
            X.C36341k9.A0o(r12, r1, r0)     // Catch:{ all -> 0x10d2 }
            java.lang.String r9 = "raw_contact_id"
            X.3IL r0 = r6.A0F     // Catch:{ all -> 0x10d2 }
            if (r0 != 0) goto L_0x109e
            r0 = 0
            goto L_0x10a0
        L_0x109e:
            long r0 = r0.A00     // Catch:{ all -> 0x10d2 }
        L_0x10a0:
            X.C36341k9.A0p(r12, r9, r0)     // Catch:{ all -> 0x10d2 }
            java.lang.String r1 = "number"
            X.3IL r0 = r6.A0F     // Catch:{ all -> 0x10d2 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x10d2 }
            r12.put(r1, r0)     // Catch:{ all -> 0x10d2 }
            java.lang.String r1 = "is_contact_synced"
            boolean r0 = r6.A0k     // Catch:{ all -> 0x10d2 }
            r13 = 0
            boolean r0 = X.AnonymousClass000.A1P(r0)
            X.C36341k9.A0o(r12, r1, r0)     // Catch:{ all -> 0x10d2 }
            java.lang.String r11 = "wa_contacts"
            java.lang.String r9 = "_id = ?"
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ all -> 0x10d2 }
            long r0 = r6.A0I()     // Catch:{ all -> 0x10d2 }
            X.C36351kA.A1V(r8, r13, r0)     // Catch:{ all -> 0x10d2 }
            X.C229416o.A01(r12, r10, r11, r9, r8)     // Catch:{ all -> 0x10d2 }
            r14.A00()     // Catch:{ all -> 0x10d2 }
            r14.close()     // Catch:{ all -> 0x10dc }
            r10.close()     // Catch:{ IllegalArgumentException -> 0x10e6 }
            goto L_0x10ec
        L_0x10d2:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x10d7 }
            goto L_0x10db
        L_0x10d7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x10dc }
        L_0x10db:
            throw r1     // Catch:{ all -> 0x10dc }
        L_0x10dc:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x10e1 }
            goto L_0x10e5
        L_0x10e1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalArgumentException -> 0x10e6 }
        L_0x10e5:
            throw r1     // Catch:{ IllegalArgumentException -> 0x10e6 }
        L_0x10e6:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to update contact"
            X.C18740tg.A08(r0, r1)
        L_0x10ec:
            X.005 r0 = r2.A08
            java.lang.Object r1 = r0.get()
            X.2ZF r1 = (X.AnonymousClass2ZF) r1
            java.util.List r0 = java.util.Collections.singletonList(r6)
            r1.A00(r0)
            android.os.Handler r2 = r7.A01
            r1 = 37
            X.1j2 r0 = new X.1j2
            r0.<init>(r7, r6, r1)
            r2.post(r0)
            X.196 r1 = r3.A01
            java.util.List r0 = X.C36371kC.A11(r5)
            r1.A0N(r4, r0)
            X.17Y r2 = r3.A00
            r0 = 39
            X.3v2 r1 = new X.3v2
            r1.<init>(r3, r0)
        L_0x1119:
            r2.A0H(r1)
            return
        L_0x111d:
            java.lang.Object r4 = r0.A00
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r4 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r4
            java.lang.Object r3 = r0.A01
            X.0fG r3 = (X.C10810fG) r3
            java.lang.Object r2 = r0.A02
            X.141 r2 = (X.AnonymousClass141) r2
            java.lang.Object r1 = r0.A03
            X.3Gg r1 = (X.C62463Gg) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)
            java.lang.Object r0 = r3.element
            X.34G r0 = (X.AnonymousClass34G) r0
            com.whatsapp.contact.picker.AddGroupParticipantsSelector.A0x(r4, r1, r0, r2)
            return
        L_0x1139:
            java.lang.Object r4 = r0.A00
            X.0fG r4 = (X.C10810fG) r4
            java.lang.Object r3 = r0.A01
            X.27v r3 = (X.AnonymousClass27v) r3
            java.lang.Object r2 = r0.A02
            X.141 r2 = (X.AnonymousClass141) r2
            java.lang.Object r5 = r0.A03
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.171 r1 = r3.A0B
            r0 = 7
            X.34G r0 = r1.A0C(r2, r0)
            r4.element = r0
            X.17Y r0 = r3.A05
            r6 = 28
        L_0x1158:
            X.74x r1 = new X.74x
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (int) r6)
        L_0x115d:
            r0.A0H(r1)
            return
        L_0x1161:
            java.lang.Object r3 = r0.A00
            X.2HP r3 = (X.AnonymousClass2HP) r3
            java.lang.Object r2 = r0.A01
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r1 = r0.A02
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r0.A03
            X.5Nh r0 = (X.C107265Nh) r0
            X.AnonymousClass2HP.A01(r1, r3, r0, r2)
            return
        L_0x1175:
            java.lang.Object r3 = r0.A00
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r3 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r3
            java.lang.Object r2 = r0.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.Object r1 = r0.A02
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            java.lang.Object r0 = r0.A03
            X.141 r0 = (X.AnonymousClass141) r0
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity.A0x(r3, r0, r2, r1)
            return
        L_0x1189:
            java.lang.Object r3 = r0.A00
            X.6Xv r3 = (X.C133316Xv) r3
            java.lang.Object r2 = r0.A01
            X.6E7 r2 = (X.AnonymousClass6E7) r2
            java.lang.Object r1 = r0.A02
            X.6Di r1 = (X.C128716Di) r1
            java.lang.Object r0 = r0.A03
            X.7ji r0 = (X.C159657ji) r0
            X.C133316Xv.A02(r3, r2, r1, r0)
            return
        L_0x119d:
            java.lang.Object r4 = r0.A00
            X.6Xv r4 = (X.C133316Xv) r4
            java.lang.Object r3 = r0.A01
            X.6E7 r3 = (X.AnonymousClass6E7) r3
            java.lang.Object r2 = r0.A02
            X.6Di r2 = (X.C128716Di) r2
            java.lang.Object r1 = r0.A03
            X.7ji r1 = (X.C159657ji) r1
            r0 = 2
            X.AnonymousClass00C.A0D(r2, r0)
            X.C133316Xv.A02(r4, r3, r2, r1)
            return
        L_0x11b5:
            java.lang.Object r9 = r0.A00
            X.3fk r9 = (X.C70803fk) r9
            java.lang.Object r2 = r0.A01
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r1 = r0.A02
            r32 = r1
            java.lang.Object r0 = r0.A03
            r31 = r0
            X.005 r0 = r9.A5r
            java.lang.Object r0 = r0.get()
            X.3BF r0 = (X.AnonymousClass3BF) r0
            X.005 r0 = r0.A0C
            java.lang.Object r11 = r0.get()
            X.3lC r11 = (X.C74183lC) r11
            java.util.LinkedList r23 = X.C90524aI.A0l()
            java.util.LinkedList r22 = X.C90524aI.A0l()
            X.6Tg r21 = new X.6Tg
            r21.<init>()
            java.util.HashMap r20 = X.AnonymousClass001.A0J()
            java.util.Iterator r19 = r2.iterator()
        L_0x11ea:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x140b
            X.3T1 r10 = X.C36391kE.A0l(r19)
            X.3Qa r0 = r10.A1J
            X.11F r3 = r0.A00
            X.3Ro r0 = X.C28981Uw.A03
            boolean r0 = r3 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x11ea
            X.1Uw r3 = (X.C28981Uw) r3
            if (r3 == 0) goto L_0x11ea
            long r0 = r10.A1O
            int r2 = (int) r0
            X.4V6 r0 = r9.A2l
            X.171 r1 = r0.getWAContactNames()
            X.141 r0 = r9.A3Y
            java.lang.String r15 = r1.A0H(r0)
            if (r15 != 0) goto L_0x1215
            java.lang.String r15 = ""
        L_0x1215:
            boolean r0 = r10 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x13f8
            r0 = r10
            X.2bU r0 = (X.AnonymousClass2bU) r0
            java.lang.String r0 = r0.A02
        L_0x121e:
            X.2pG r14 = X.C52332pG.UPDATE_CARD
            X.3Jw r8 = new X.3Jw
            r12 = r8
            r13 = r3
            r16 = r0
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17)
            X.4V6 r0 = r9.A2l
            X.155 r2 = r0.getActivityNullable()
            X.141 r1 = r9.A3Y
            r13 = 0
            X.AnonymousClass00C.A0D(r2, r13)
            r12 = 1
            r7 = 2
            r18 = 3
            r0 = 3
            X.AnonymousClass00C.A0D(r1, r0)
            X.02b r6 = X.AnonymousClass1RC.A01(r2)
            X.2YX r5 = new X.2YX
            r5.<init>(r6)
            r5.A00(r1, r10)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131167706(0x7f0709da, float:1.7949693E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131167702(0x7f0709d6, float:1.7949685E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            X.C90494aF.A0w(r5, r4, r3)
            com.whatsapp.TextEmojiLabel r0 = r5.A0Q
            r30 = r0
            java.lang.CharSequence r17 = r30.getText()
            int r2 = r17.length()
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "... "
            r14.append(r0)
            android.content.Context r1 = r5.getContext()
            r0 = 2131893350(0x7f121c66, float:1.9421474E38)
            X.C36351kA.A14(r1, r14, r0)
            java.lang.String r16 = r14.toString()
            X.4Cg r1 = new X.4Cg
            r1.<init>(r5)
        L_0x1296:
            android.view.View r0 = r5.A0A
            r24 = r0
            int r14 = r24.getHeight()
            android.view.ViewGroup$LayoutParams r15 = r24.getLayoutParams()
            boolean r0 = r15 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x13f5
            android.view.ViewGroup$MarginLayoutParams r15 = (android.view.ViewGroup.MarginLayoutParams) r15
            if (r15 == 0) goto L_0x13f5
            int r0 = r15.topMargin
        L_0x12ac:
            int r14 = r14 + r0
            android.view.ViewGroup$LayoutParams r15 = r24.getLayoutParams()
            boolean r0 = r15 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x13f2
            android.view.ViewGroup$MarginLayoutParams r15 = (android.view.ViewGroup.MarginLayoutParams) r15
            if (r15 == 0) goto L_0x13f2
            int r0 = r15.bottomMargin
        L_0x12bb:
            int r14 = r14 + r0
            com.whatsapp.settings.chat.wallpaper.WallPaperView r0 = r5.A0T
            int r0 = r0.getHeight()
            if (r14 <= r0) goto L_0x1308
            int r0 = r30.getLineCount()
            if (r0 <= r7) goto L_0x1303
            if (r2 <= r7) goto L_0x1303
            int r2 = r2 + -1
            r0 = r17
            java.lang.CharSequence r0 = r0.subSequence(r13, r2)
            android.text.SpannableStringBuilder r14 = X.C36441kJ.A0P(r0)
            r0 = r16
            android.text.SpannableStringBuilder r14 = r14.append(r0)
            int r15 = r10.A1I
            java.lang.String r27 = r17.toString()
            android.content.Context r24 = r5.getContext()
            X.6Vl r0 = new X.6Vl
            r0.<init>(r1, r12)
            r25 = r14
            r26 = r0
            r28 = r15
            r29 = r2
            X.C65853Ts.A05(r24, r25, r26, r27, r28, r29)
            android.widget.TextView$BufferType r15 = android.widget.TextView.BufferType.SPANNABLE
            r0 = r30
            r0.setText(r14, r15)
            X.C90494aF.A0w(r5, r4, r3)
            goto L_0x1296
        L_0x1303:
            java.lang.String r0 = "Error measuring view"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x1308:
            boolean r0 = r10 instanceof X.C47002cZ
            r1 = 0
            if (r0 == 0) goto L_0x138a
            X.2bU r10 = (X.AnonymousClass2bU) r10
            X.3Qj r0 = r10.A01
            if (r0 == 0) goto L_0x11ea
            java.io.File r1 = r0.A0I
            if (r1 == 0) goto L_0x11ea
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
            X.AnonymousClass00C.A0B(r0)
            X.6QO r3 = new X.6QO
            r3.<init>(r0)
            r3.A0F(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r3.A0G(r0)
            r2 = 720(0x2d0, float:1.009E-42)
            r1 = 1280(0x500, float:1.794E-42)
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            monitor-enter(r3)
            r3.A03 = r0     // Catch:{ all -> 0x1408 }
            monitor-exit(r3)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131167693(0x7f0709cd, float:1.7949667E38)
            float r15 = r1.getDimension(r0)
            com.whatsapp.components.button.ThumbnailButton r14 = r5.A0S
            X.3Qj r0 = r10.A01
            if (r0 == 0) goto L_0x1385
            float r18 = X.C36441kJ.A01(r5)
            float r2 = X.C36441kJ.A02(r5)
            float r17 = X.C36441kJ.A01(r14)
            android.graphics.RectF r0 = X.C54862tg.A00(r14)
            float r10 = (float) r7
            float r4 = r18 / r10
            float r16 = r2 / r10
            float r1 = r0.centerX()
            float r0 = r0.centerY()
            float r4 = r4 - r1
            float r16 = r16 - r0
            float r4 = r4 / r18
            float r16 = r16 / r2
            float r17 = r17 + r10
            float r17 = r17 / r18
            float r4 = r4 * r10
            float r2 = r4 - r17
            float r4 = r4 + r17
            float r10 = r10 * r16
            float r1 = r10 - r17
            float r10 = r10 + r17
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r2, r10, r4, r1)
        L_0x1383:
            monitor-enter(r3)
            goto L_0x1387
        L_0x1385:
            r0 = 0
            goto L_0x1383
        L_0x1387:
            r3.A06 = r0     // Catch:{ all -> 0x1408 }
            goto L_0x13b2
        L_0x138a:
            r0 = 0
            java.io.File r1 = X.C74183lC.A01(r6, r5, r1, r11, r0)
            if (r1 == 0) goto L_0x11ea
            android.net.Uri r0 = android.net.Uri.fromFile(r1)
            X.AnonymousClass00C.A0B(r0)
            X.6QO r3 = new X.6QO
            r3.<init>(r0)
            r3.A0F(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r3.A0G(r0)
            androidx.cardview.widget.CardView r0 = r5.A0O
            X.5Cm r0 = X.C74183lC.A00(r0, r8, r13)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto L_0x13d0
        L_0x13b2:
            monitor-exit(r3)
            java.io.File r0 = X.C74183lC.A01(r6, r5, r14, r11, r15)
            if (r0 == 0) goto L_0x13d6
            java.lang.String r0 = X.C36381kD.A0y(r0)
            X.5Cj r2 = new X.5Cj
            r2.<init>((java.lang.String) r0)
            androidx.cardview.widget.CardView r0 = r5.A0O
            X.5Cm r1 = X.C74183lC.A00(r0, r8, r13)
            X.6Ft[] r0 = new X.C129196Ft[r7]
            r0[r13] = r2
            java.util.List r0 = X.C90524aI.A0p(r1, r0, r12)
        L_0x13d0:
            X.AnonymousClass00C.A08(r0)
            X.C74183lC.A02(r5, r3, r0)
        L_0x13d6:
            android.net.Uri r2 = r3.A0J
            r0 = r23
            r0.add(r2)
            java.io.File r1 = r3.A08()
            r0 = r22
            r0.add(r1)
            r0 = r21
            r0.A06(r3)
            r0 = r20
            r0.put(r2, r8)
            goto L_0x11ea
        L_0x13f2:
            r0 = 0
            goto L_0x12bb
        L_0x13f5:
            r0 = 0
            goto L_0x12ac
        L_0x13f8:
            boolean r0 = r10 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x1405
            r0 = r10
            X.2bV r0 = (X.AnonymousClass2bV) r0
            java.lang.String r0 = r0.A1Y()
            goto L_0x121e
        L_0x1405:
            r0 = 0
            goto L_0x121e
        L_0x1408:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x140b:
            X.17Y r1 = r9.A1U
            r10 = 0
            X.754 r0 = new X.754
            r2 = r0
            r3 = r9
            r4 = r20
            r5 = r32
            r6 = r23
            r7 = r22
            r8 = r21
            r9 = r31
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.A0H(r0)
            return
        L_0x1425:
            java.lang.Object r6 = r0.A00
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r5 = r0.A01
            X.3AF r5 = (X.AnonymousClass3AF) r5
            java.lang.Object r4 = r0.A02
            X.11F r4 = (X.AnonymousClass11F) r4
            java.lang.Object r3 = r0.A03
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2 = 0
            X.1nx r1 = new X.1nx
            r1.<init>(r6)
            r5.A00 = r1
            X.AnonymousClass00C.A0D(r4, r2)
            X.3O5 r0 = r1.getViewModel()
            r0.A00 = r4
            r3.setVisibility(r2)
            r3.addView(r1)
            return
        L_0x144d:
            java.lang.Object r1 = r0.A01
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r0.A02
            X.9un r0 = (X.C207249un) r0
            X.9l8 r0 = r0.A07
            java.lang.String r0 = r0.A03
            r1.get(r0)
            return
        L_0x145d:
            java.lang.Object r3 = r0.A00
            X.1X4 r3 = (X.AnonymousClass1X4) r3
            java.lang.Object r7 = r0.A01
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Object r6 = r0.A02
            X.17Y r6 = (X.AnonymousClass17Y) r6
            java.lang.Object r2 = r0.A03
            android.content.Context r2 = (android.content.Context) r2
            r5 = 0
            r1 = 1
            X.AnonymousClass00C.A0D(r7, r1)
            r3.A0c(r7, r5, r5)
            int r0 = r7.size()
            if (r0 != r1) goto L_0x1482
            r0 = 2131891034(0x7f12135a, float:1.9416777E38)
            r6.A07(r0, r5)
            return
        L_0x1482:
            android.content.res.Resources r4 = r2.getResources()
            r3 = 2131755197(0x7f1000bd, float:1.9141266E38)
            int r2 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r0 = r7.size()
            X.AnonymousClass000.A1L(r1, r0, r5)
            java.lang.String r0 = r4.getQuantityString(r3, r2, r1)
            r6.A0F(r0, r5)
            return
        L_0x149e:
            java.lang.Object r1 = r0.A00
            X.1Cd r1 = (X.C24361Cd) r1
            java.lang.Object r2 = r0.A01
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            r1.A00(r2)
            java.lang.Object r1 = r0.A03
            X.1Lo r1 = (X.C26801Lo) r1
            java.lang.Object r0 = r0.A02
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            r1.A00(r0, r2)
            return
        L_0x14b5:
            java.lang.Object r1 = r0.A00
            X.3P5 r1 = (X.AnonymousClass3P5) r1
            java.lang.Object r9 = r0.A01
            java.lang.String[] r9 = (java.lang.String[]) r9
            java.lang.Object r6 = r0.A02
            byte[][] r6 = (byte[][]) r6
            java.lang.Object r0 = r0.A03
            X.3DG r0 = (X.AnonymousClass3DG) r0
            X.5m5 r8 = r1.A03
            X.62x r7 = new X.62x
            r7.<init>(r0, r1, r6)
            int r5 = r9.length
            int r2 = r6.length
            if (r5 == r2) goto L_0x14f1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "keytransparencyprotocolhelper/sendmultiserializedlookupiq Labels and keys differ in length: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " vs. "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " . Request is canceled. Failing verification"
            X.C36321k7.A1Z(r1, r0)
            r2 = 0
            r1 = -1
            java.lang.String r0 = "Missing identity keys or labels"
            r7.A00(r2, r0, r1)
            return
        L_0x14f1:
            X.19A r12 = r8.A00
            java.lang.String r15 = r12.A09()
            java.util.ArrayList r4 = X.C36441kJ.A14(r2)
            r3 = 0
        L_0x14fc:
            if (r3 >= r5) goto L_0x1516
            r0 = r6[r3]
            X.8uZ r2 = new X.8uZ
            r2.<init>((byte[]) r0)
            r0 = r9[r3]
            byte[] r1 = r0.getBytes()
            X.8uZ r0 = new X.8uZ
            r0.<init>((X.C185648uZ) r2, (byte[]) r1)
            r4.add(r0)
            int r3 = r3 + 1
            goto L_0x14fc
        L_0x1516:
            X.8vH r10 = new X.8vH
            r10.<init>((java.lang.String) r15, (java.util.List) r4)
            r16 = 342(0x156, float:4.79E-43)
            X.9nx r14 = r10.A00
            r11 = 0
            X.7tH r6 = new X.7tH
            r6.<init>(r7, r8, r9, r10, r11)
            r17 = 32000(0x7d00, double:1.581E-319)
            r13 = r6
            r12.A0E(r13, r14, r15, r16, r17)
            return
        L_0x152c:
            java.lang.Object r3 = r0.A00
            com.whatsapp.mediacomposer.VideoComposerFragment r3 = (com.whatsapp.mediacomposer.VideoComposerFragment) r3
            java.lang.Object r2 = r0.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r0.A02
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r0 = r0.A03
            android.net.Uri r0 = (android.net.Uri) r0
            r3.A1o(r0, r1, r2)
            return
        L_0x1540:
            return
        L_0x1541:
            return
        L_0x1542:
            com.whatsapp.wamsys.JniBridge.getInstance()
            r0 = 88
            long r0 = (long) r0
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r15, r0, r4)
            byte[] r0 = (byte[]) r0
            byte[] r4 = java.util.Arrays.copyOfRange(r0, r15, r3)
            X.AUx r0 = r2.aesK_     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x157a }
            byte[] r3 = r0.A06()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x157a }
            X.AUx r0 = r2.kNonce_     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x157a }
            byte[] r2 = r0.A06()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x157a }
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r7)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x157a }
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x157a }
            r0.<init>(r4, r6)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x157a }
            byte[] r14 = X.C90484aE.A1a(r0, r1, r2, r3)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x157a }
            X.1Ck r12 = r5.A09     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x157a }
            java.lang.String r13 = r5.A0C     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x157a }
            X.0wU r0 = r12.A06     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x157a }
            X.73P r10 = new X.73P     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x157a }
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x157a }
            r0.Boy(r10)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x157a }
            return
        L_0x157a:
            r1 = move-exception
            java.lang.String r0 = "encb/LoginUserHandler//retrieveBackupKey/aesDecrypt/exception."
            com.whatsapp.util.Log.e(r0, r1)
            r13 = 5
            r14 = 4
            r15 = -1
            java.lang.String r12 = "Failed to decrypt backup key"
            r16 = -1
            r11.BWr(r12, r13, r14, r15, r16)
            return
        L_0x158b:
            r1 = move-exception
            java.lang.String r0 = "encb/LoginUserHandler/retrieveBackupKey/aesDecrypt/exception."
            com.whatsapp.util.Log.e(r0, r1)
            r13 = 5
            r14 = 4
            r15 = -1
            java.lang.String r12 = "Failed to decrypt aes_k_nonce_k"
            goto L_0x15aa
        L_0x1597:
            r0 = move-exception
            com.whatsapp.util.Log.e(r8, r0)
            r13 = 7
            r14 = 4
            r15 = -1
            java.lang.String r12 = "Failed to parse login payload"
            goto L_0x15aa
        L_0x15a1:
            r0 = move-exception
            com.whatsapp.util.Log.e(r8, r0)
            r13 = 7
            r14 = 4
            r15 = -1
            java.lang.String r12 = "Failed to parse aes_k_nonce_k"
        L_0x15aa:
            r16 = -1
            r11.BWr(r12, r13, r14, r15, r16)
            return
        L_0x15b0:
            r6.A04 = r0     // Catch:{ all -> 0x15ba }
            r0 = 2
            r6.A00 = r0     // Catch:{ all -> 0x15ba }
            monitor-exit(r3)     // Catch:{ all -> 0x15ba }
            r6.A02()
            return
        L_0x15ba:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x15ba }
            throw r0
        L_0x15bd:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x15bd }
            throw r0
        L_0x15c0:
            java.lang.String r0 = "PinInChatSelectionAction/execute Can pin after confirming to replace the pin."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1qm r5 = X.AnonymousClass3LW.A00(r4)
            X.1Ju r2 = r7.A05
            int r1 = r2.A00()
            r0 = 2131893067(0x7f121b4b, float:1.94209E38)
            if (r1 <= r8) goto L_0x15d7
            r0 = 2131893068(0x7f121b4c, float:1.9420902E38)
        L_0x15d7:
            r5.A0d(r0)
            int r1 = r2.A00()
            r0 = 2131893065(0x7f121b49, float:1.9420896E38)
            if (r1 <= r8) goto L_0x15e6
            r0 = 2131893066(0x7f121b4a, float:1.9420898E38)
        L_0x15e6:
            r5.A0c(r0)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            r5.A0l(r4, r3, r0)
            r2 = 2131887154(0x7f120432, float:1.9408907E38)
            r1 = 4
            X.3UX r0 = new X.3UX
            r0.<init>(r4, r7, r6, r1)
            r5.A0m(r4, r0, r2)
            X.C36341k9.A11(r5)
            X.3PQ r1 = r7.A03
            r0 = 38
            r1.A01(r6, r3, r0)
            return
        L_0x1606:
            java.lang.String r0 = "PinInChatSelectionAction/execute Cannot pin message with other error."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1qm r1 = X.AnonymousClass3LW.A00(r4)
            r0 = 2131893063(0x7f121b47, float:1.9420892E38)
            goto L_0x161f
        L_0x1613:
            java.lang.String r0 = "PinInChatSelectionAction/execute Cannot pin message with no connection."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1qm r1 = X.AnonymousClass3LW.A00(r4)
            r0 = 2131893064(0x7f121b48, float:1.9420894E38)
        L_0x161f:
            r1.A0c(r0)
            r0 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1.A0m(r4, r3, r0)
            X.C36341k9.A11(r1)
            return
        L_0x162c:
            java.lang.Object r5 = r0.A03     // Catch:{ all -> 0x167a }
            X.13S r5 = (X.AnonymousClass13S) r5     // Catch:{ all -> 0x167a }
            r1 = 1
            X.1f2[] r4 = new X.C33281f2[r1]     // Catch:{ all -> 0x167a }
            X.15t r1 = r9.A01     // Catch:{ all -> 0x167a }
            X.6s1 r2 = new X.6s1     // Catch:{ all -> 0x167a }
            r2.<init>(r1, r8)     // Catch:{ all -> 0x167a }
            r1 = 0
            r4[r1] = r2     // Catch:{ all -> 0x167a }
            X.60r r3 = new X.60r     // Catch:{ all -> 0x167a }
            r3.<init>(r4)     // Catch:{ all -> 0x167a }
            X.13R r1 = r5.A06     // Catch:{ all -> 0x167a }
            X.0wy r1 = r1.A00()     // Catch:{ all -> 0x167a }
            X.0y7 r2 = r1.keySet()     // Catch:{ all -> 0x167a }
            r1 = 7
            r5.A03(r3, r2, r1)     // Catch:{ all -> 0x167a }
            X.0v0 r2 = r5.A04     // Catch:{ all -> 0x167a }
            X.0wo r1 = r5.A03     // Catch:{ all -> 0x167a }
            long r3 = X.C19970wo.A00(r1)     // Catch:{ all -> 0x167a }
            X.005 r1 = r2.A00     // Catch:{ all -> 0x167a }
            android.content.SharedPreferences$Editor r2 = X.C90464aC.A0C(r1)     // Catch:{ all -> 0x167a }
            java.lang.String r1 = "db_last_all_migrations_attempt_timestamp"
            X.C36341k9.A0w(r2, r1, r3)     // Catch:{ all -> 0x167a }
            java.lang.Object r2 = r0.A00     // Catch:{ all -> 0x167a }
            X.0yC r2 = (X.C20810yC) r2     // Catch:{ all -> 0x167a }
            r1 = 424(0x1a8, float:5.94E-43)
            boolean r1 = r2.A0E(r1)     // Catch:{ all -> 0x167a }
            if (r1 == 0) goto L_0x1672
            r5.A02()     // Catch:{ all -> 0x167a }
        L_0x1672:
            java.lang.Object r0 = r0.A02
            android.os.ConditionVariable r0 = (android.os.ConditionVariable) r0
            r0.open()
            return
        L_0x167a:
            r1 = move-exception
            java.lang.Object r0 = r0.A02
            android.os.ConditionVariable r0 = (android.os.ConditionVariable) r0
            r0.open()
            throw r1
        L_0x1683:
            java.lang.String r0 = "waContext"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x168a:
            java.lang.String r0 = "waContext"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x1691:
            java.lang.String r0 = "networkResourcesManagerLazy"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x1698:
            java.lang.String r0 = "prefs"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x169f:
            java.lang.String r0 = "waContext"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1503474x.run():void");
    }

    public C1503474x(ConditionVariable conditionVariable, C227615r r3, AnonymousClass13S r4, C20810yC r5) {
        this.A04 = 41;
        this.A00 = r5;
        this.A03 = r4;
        this.A01 = r3;
        this.A02 = conditionVariable;
    }

    public C1503474x(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A02 = obj;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A03 = obj4;
    }
}
