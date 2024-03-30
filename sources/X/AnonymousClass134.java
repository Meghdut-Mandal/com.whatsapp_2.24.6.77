package X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.security.KeyStore;
import java.security.Signature;
import java.security.cert.Certificate;

/* renamed from: X.134  reason: invalid class name */
public class AnonymousClass134 {
    public final C19420v0 A00;
    public final C21520zN A01;
    public final C20810yC A02;
    public final AnonymousClass12U A03;
    public final C19700wN A04;
    public final C19970wo A05;
    public final C21010yW A06;

    public static String A00(AnonymousClass134 r3) {
        StringBuilder sb = new StringBuilder();
        sb.append(r3.A02.A09(2074));
        sb.append("_static");
        String obj = sb.toString();
        if (obj == null) {
            return "my_personal_mini_pony_static";
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a0, code lost:
        if (r10 == false) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a4 A[Catch:{ Exception -> 0x01b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e7 A[SYNTHETIC, Splitter:B:29:0x00e7] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fa A[Catch:{ Exception -> 0x01b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x013c A[Catch:{ Exception -> 0x01b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x014b A[Catch:{ Exception -> 0x01b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0187 A[Catch:{ Exception -> 0x01b5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(byte[] r20, java.lang.String r21) {
        /*
            r19 = this;
            r6 = r20
            java.lang.String r9 = "AndroidKeyStore"
            java.lang.String r8 = "att-gen"
            r5 = r19
            boolean r0 = r5.A05()
            if (r0 == 0) goto L_0x0217
            X.0wo r12 = r5.A05
            long r17 = android.os.SystemClock.elapsedRealtime()
            java.security.KeyStore r4 = java.security.KeyStore.getInstance(r9)     // Catch:{ Exception -> 0x01b5 }
            r0 = 0
            r4.load(r0)     // Catch:{ Exception -> 0x01b5 }
            r7 = r21
            java.security.KeyStore$Entry r3 = r4.getEntry(r7, r0)     // Catch:{ Exception -> 0x01b5 }
            boolean r10 = r3 instanceof java.security.KeyStore.PrivateKeyEntry     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r0 = A00(r5)     // Catch:{ Exception -> 0x01b5 }
            boolean r2 = r7.equals(r0)     // Catch:{ Exception -> 0x01b5 }
            boolean r0 = r5.A05()     // Catch:{ Exception -> 0x01b5 }
            if (r0 == 0) goto L_0x00a0
            if (r2 == 0) goto L_0x003d
            X.12U r0 = r5.A03     // Catch:{ Exception -> 0x01b5 }
            boolean r0 = r0.A03()     // Catch:{ Exception -> 0x01b5 }
            if (r0 == 0) goto L_0x003d
            goto L_0x00a0
        L_0x003d:
            if (r10 == 0) goto L_0x0059
            X.0yC r1 = r5.A02     // Catch:{ Exception -> 0x01b5 }
            r0 = 2076(0x81c, float:2.909E-42)
            java.lang.String r1 = r1.A09(r0)     // Catch:{ Exception -> 0x01b5 }
            r0 = r3
            java.security.KeyStore$PrivateKeyEntry r0 = (java.security.KeyStore.PrivateKeyEntry) r0     // Catch:{ Exception -> 0x01b5 }
            java.security.PrivateKey r0 = r0.getPrivateKey()     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r0 = r0.getAlgorithm()     // Catch:{ Exception -> 0x01b5 }
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x01b5 }
            if (r0 != 0) goto L_0x0059
            goto L_0x00a2
        L_0x0059:
            X.0v0 r0 = r5.A00     // Catch:{ Exception -> 0x01b5 }
            if (r2 == 0) goto L_0x0085
            X.005 r0 = r0.A00     // Catch:{ Exception -> 0x01b5 }
            java.lang.Object r13 = r0.get()     // Catch:{ Exception -> 0x01b5 }
            android.content.SharedPreferences r13 = (android.content.SharedPreferences) r13     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r11 = "ka_static_refresh_ts"
            r0 = 0
            long r15 = r13.getLong(r11, r0)     // Catch:{ Exception -> 0x01b5 }
            X.0zN r11 = r5.A01     // Catch:{ Exception -> 0x01b5 }
            r1 = 4878(0x130e, float:6.836E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ Exception -> 0x01b5 }
            int r0 = X.C20800yB.A00(r0, r11, r1)     // Catch:{ Exception -> 0x01b5 }
        L_0x0077:
            long r0 = (long) r0     // Catch:{ Exception -> 0x01b5 }
            long r15 = r15 + r0
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01b5 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r0
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x00a0
            goto L_0x00a2
        L_0x0085:
            X.005 r0 = r0.A00     // Catch:{ Exception -> 0x01b5 }
            java.lang.Object r13 = r0.get()     // Catch:{ Exception -> 0x01b5 }
            android.content.SharedPreferences r13 = (android.content.SharedPreferences) r13     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r11 = "ka_refresh_ts"
            r0 = 0
            long r15 = r13.getLong(r11, r0)     // Catch:{ Exception -> 0x01b5 }
            X.0yC r11 = r5.A02     // Catch:{ Exception -> 0x01b5 }
            r1 = 2079(0x81f, float:2.913E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ Exception -> 0x01b5 }
            int r0 = X.C20800yB.A00(r0, r11, r1)     // Catch:{ Exception -> 0x01b5 }
            goto L_0x0077
        L_0x00a0:
            if (r10 != 0) goto L_0x01e4
        L_0x00a2:
            if (r2 != 0) goto L_0x00e5
            X.0v0 r11 = r5.A00     // Catch:{ Exception -> 0x01b5 }
            X.005 r0 = r11.A00     // Catch:{ Exception -> 0x01b5 }
            java.lang.Object r13 = r0.get()     // Catch:{ Exception -> 0x01b5 }
            android.content.SharedPreferences r13 = (android.content.SharedPreferences) r13     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r10 = "ka_retried_ts"
            r0 = 0
            long r15 = r13.getLong(r10, r0)     // Catch:{ Exception -> 0x01b5 }
            X.0yC r13 = r5.A02     // Catch:{ Exception -> 0x01b5 }
            r1 = 2427(0x97b, float:3.401E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ Exception -> 0x01b5 }
            int r0 = X.C20800yB.A00(r0, r13, r1)     // Catch:{ Exception -> 0x01b5 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x01b5 }
            long r15 = r15 + r0
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01b5 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r0
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x01e4
            boolean r0 = r5.A05()     // Catch:{ Exception -> 0x01b5 }
            if (r0 == 0) goto L_0x00e5
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01b5 }
            r13 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r13
            android.content.SharedPreferences$Editor r11 = X.C19420v0.A00(r11)     // Catch:{ Exception -> 0x01b5 }
            android.content.SharedPreferences$Editor r0 = r11.putLong(r10, r0)     // Catch:{ Exception -> 0x01b5 }
            r0.apply()     // Catch:{ Exception -> 0x01b5 }
        L_0x00e5:
            if (r3 == 0) goto L_0x00f0
            r4.deleteEntry(r7)     // Catch:{ Exception -> 0x00eb }
            goto L_0x00f0
        L_0x00eb:
            java.lang.String r0 = "blacknoise/error deleting previous pair"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x01b5 }
        L_0x00f0:
            X.0yC r10 = r5.A02     // Catch:{ Exception -> 0x01b5 }
            r0 = 2076(0x81c, float:2.909E-42)
            java.lang.String r13 = r10.A09(r0)     // Catch:{ Exception -> 0x01b5 }
            if (r13 != 0) goto L_0x00fc
            java.lang.String r13 = "EC"
        L_0x00fc:
            java.security.KeyPairGenerator r9 = java.security.KeyPairGenerator.getInstance(r13, r9)     // Catch:{ Exception -> 0x01b5 }
            java.util.Date r14 = new java.util.Date     // Catch:{ Exception -> 0x01b5 }
            r14.<init>()     // Catch:{ Exception -> 0x01b5 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01b5 }
            r3 = 2079(0x81f, float:2.913E-42)
            X.0yV r11 = X.C21000yV.A02     // Catch:{ Exception -> 0x01b5 }
            int r3 = X.C20800yB.A00(r11, r10, r3)     // Catch:{ Exception -> 0x01b5 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x01b5 }
            r15 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r15
            long r0 = r0 + r3
            r14.setTime(r0)     // Catch:{ Exception -> 0x01b5 }
            r0 = 4
            android.security.keystore.KeyGenParameterSpec$Builder r3 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ Exception -> 0x01b5 }
            r3.<init>(r7, r0)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r1 = "SHA-256"
            java.lang.String r0 = "SHA-512"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}     // Catch:{ Exception -> 0x01b5 }
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r3.setDigests(r0)     // Catch:{ Exception -> 0x01b5 }
            r0 = 0
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r1.setUserAuthenticationRequired(r0)     // Catch:{ Exception -> 0x01b5 }
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r0.setCertificateNotAfter(r14)     // Catch:{ Exception -> 0x01b5 }
            java.lang.String r0 = "RSA"
            boolean r0 = r13.equals(r0)     // Catch:{ Exception -> 0x01b5 }
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = "PKCS1"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x01b5 }
            r3.setSignaturePaddings(r0)     // Catch:{ Exception -> 0x01b5 }
        L_0x0145:
            boolean r0 = X.C19550w8.A02()     // Catch:{ Exception -> 0x01b5 }
            if (r0 == 0) goto L_0x0181
            if (r20 != 0) goto L_0x015c
            java.security.SecureRandom r1 = X.AnonymousClass136.A00()     // Catch:{ Exception -> 0x01b5 }
            r0 = 2078(0x81e, float:2.912E-42)
            int r0 = X.C20800yB.A00(r11, r10, r0)     // Catch:{ Exception -> 0x01b5 }
            byte[] r6 = new byte[r0]     // Catch:{ Exception -> 0x01b5 }
            r1.nextBytes(r6)     // Catch:{ Exception -> 0x01b5 }
        L_0x015c:
            long r0 = X.C19970wo.A00(r12)     // Catch:{ Exception -> 0x01b5 }
            long r0 = r0 / r15
            int r4 = r6.length     // Catch:{ Exception -> 0x01b5 }
            int r4 = r4 + 8
            int r4 = r4 + 1
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r4)     // Catch:{ Exception -> 0x01b5 }
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x01b5 }
            r7.order(r4)     // Catch:{ Exception -> 0x01b5 }
            r7.putLong(r0)     // Catch:{ Exception -> 0x01b5 }
            r0 = 31
            r7.put(r0)     // Catch:{ Exception -> 0x01b5 }
            r7.put(r6)     // Catch:{ Exception -> 0x01b5 }
            byte[] r0 = r7.array()     // Catch:{ Exception -> 0x01b5 }
            r3.setAttestationChallenge(r0)     // Catch:{ Exception -> 0x01b5 }
        L_0x0181:
            boolean r0 = X.C19550w8.A08()     // Catch:{ Exception -> 0x01b5 }
            if (r0 == 0) goto L_0x018b
            r0 = 1
            r3.setDevicePropertiesAttestationIncluded(r0)     // Catch:{ Exception -> 0x01b5 }
        L_0x018b:
            android.security.keystore.KeyGenParameterSpec r0 = r3.build()     // Catch:{ ProviderException -> 0x0196 }
            r9.initialize(r0)     // Catch:{ ProviderException -> 0x0196 }
            r9.generateKeyPair()     // Catch:{ ProviderException -> 0x0196 }
            goto L_0x01ab
        L_0x0196:
            r1 = move-exception
            boolean r0 = X.C19550w8.A08()     // Catch:{ all -> 0x01b0 }
            if (r0 == 0) goto L_0x01af
            r0 = 0
            r3.setDevicePropertiesAttestationIncluded(r0)     // Catch:{ all -> 0x01b0 }
            android.security.keystore.KeyGenParameterSpec r0 = r3.build()     // Catch:{ all -> 0x01b0 }
            r9.initialize(r0)     // Catch:{ all -> 0x01b0 }
            r9.generateKeyPair()     // Catch:{ all -> 0x01b0 }
        L_0x01ab:
            r5.A04(r2)     // Catch:{ Exception -> 0x01b5 }
            goto L_0x01e4
        L_0x01af:
            throw r1     // Catch:{ all -> 0x01b0 }
        L_0x01b0:
            r0 = move-exception
            r5.A04(r2)     // Catch:{ Exception -> 0x01b5 }
            throw r0     // Catch:{ Exception -> 0x01b5 }
        L_0x01b5:
            r4 = move-exception
            java.lang.String r1 = "blacknoise/exception on pair creation"
            java.lang.Throwable r0 = r4.getCause()     // Catch:{ all -> 0x01fd }
            if (r0 == 0) goto L_0x01e2
            java.lang.Throwable r0 = r4.getCause()     // Catch:{ all -> 0x01fd }
        L_0x01c2:
            com.whatsapp.util.Log.e(r1, r0)     // Catch:{ all -> 0x01fd }
            X.0wN r3 = r5.A04     // Catch:{ all -> 0x01fd }
            java.lang.String r2 = "attestation-creation"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fd }
            r1.<init>()     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = "unable to create attestation: "
            r1.append(r0)     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = r4.getMessage()     // Catch:{ all -> 0x01fd }
            r1.append(r0)     // Catch:{ all -> 0x01fd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01fd }
            r3.A0D(r2, r0, r4)     // Catch:{ all -> 0x01fd }
            goto L_0x01e4
        L_0x01e2:
            r0 = r4
            goto L_0x01c2
        L_0x01e4:
            X.135 r2 = new X.135
            r2.<init>()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r17
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A00 = r0
            r2.A02 = r8
            X.0yW r0 = r5.A06
            r0.Bly(r2)
            return
        L_0x01fd:
            r3 = move-exception
            X.135 r2 = new X.135
            r2.<init>()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r17
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A00 = r0
            r2.A02 = r8
            X.0yW r0 = r5.A06
            r0.Bly(r2)
            throw r3
        L_0x0217:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass134.A01(byte[], java.lang.String):void");
    }

    public byte[] A06(byte[] bArr, byte[] bArr2) {
        if (!A05()) {
            return null;
        }
        A01(bArr2, A00(this));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyStore.Entry entry = instance.getEntry(A00(this), (KeyStore.ProtectionParameter) null);
            if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                Log.e("blacknoise/Not an instance of a PKEntry");
                this.A04.A0E("attestation-nosign", "cannot sign payload, att pair missing", true);
                return null;
            }
            Signature instance2 = Signature.getInstance(this.A02.A09(2075));
            instance2.initSign(((KeyStore.PrivateKeyEntry) entry).getPrivateKey());
            instance2.update(bArr);
            byte[] sign = instance2.sign();
            String.format("blacknoise/successfully signed pipe P = %s / S = %s", new Object[]{Base64.encodeToString(bArr, 0), Base64.encodeToString(sign, 0)});
            AnonymousClass135 r2 = new AnonymousClass135();
            r2.A00 = Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
            r2.A02 = "att-sign";
            this.A06.Bly(r2);
            return sign;
        } catch (Exception e) {
            Log.e("blacknoise/exception on pair sign", e);
            C19700wN r22 = this.A04;
            StringBuilder sb = new StringBuilder();
            sb.append("unable to sign payload: ");
            sb.append(e.getMessage());
            r22.A0D("attestation-nosign", sb.toString(), e);
            return null;
        } finally {
            AnonymousClass135 r23 = new AnonymousClass135();
            r23.A00 = Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
            r23.A02 = "att-sign";
            this.A06.Bly(r23);
        }
    }

    public AnonymousClass134(C19700wN r1, C19970wo r2, C19420v0 r3, C21520zN r4, C20810yC r5, C21010yW r6, AnonymousClass12U r7) {
        this.A02 = r5;
        this.A04 = r1;
        this.A00 = r3;
        this.A06 = r6;
        this.A05 = r2;
        this.A03 = r7;
        this.A01 = r4;
    }

    public static byte[] A02(AnonymousClass134 r5, String str, byte[] bArr) {
        if (!r5.A05()) {
            return null;
        }
        r5.A01(bArr, str);
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            Certificate[] certificateChain = instance.getCertificateChain(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (certificateChain != null) {
                for (int length = certificateChain.length - 1; length >= 0; length--) {
                    byteArrayOutputStream.write(certificateChain[length].getEncoded());
                }
            }
            byteArrayOutputStream.size();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            Log.e("blacknoise/exception on certificate chain retrieval", e);
            C19700wN r2 = r5.A04;
            StringBuilder sb = new StringBuilder();
            sb.append("unable to retrieve certificate chain: ");
            sb.append(e.getMessage());
            r2.A0D("attestation-nocertchain", sb.toString(), e);
            return null;
        }
    }

    public void A03() {
        if (A05()) {
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                instance.load((KeyStore.LoadStoreParameter) null);
                String A09 = this.A02.A09(2074);
                if (A09 == null) {
                    A09 = "my_personal_mini_pony";
                }
                instance.deleteEntry(A09);
                instance.deleteEntry(A00(this));
            } catch (Exception e) {
                Log.e("blacknoise/exception on certificate wipe", e);
            } catch (Throwable th) {
                C19420v0 r4 = this.A00;
                C19420v0.A00(r4).putLong("ka_retried_ts", 0).apply();
                C19420v0.A00(r4).putLong("ka_static_refresh_ts", 0).apply();
                C19420v0.A00(r4).putLong("ka_refresh_ts", 0).apply();
                throw th;
            }
            C19420v0 r42 = this.A00;
            C19420v0.A00(r42).putLong("ka_retried_ts", 0).apply();
            C19420v0.A00(r42).putLong("ka_static_refresh_ts", 0).apply();
            C19420v0.A00(r42).putLong("ka_refresh_ts", 0).apply();
        }
    }

    public void A04(boolean z) {
        String str;
        if (A05()) {
            C19420v0 r0 = this.A00;
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor A002 = C19420v0.A00(r0);
            if (z) {
                str = "ka_static_refresh_ts";
            } else {
                str = "ka_refresh_ts";
            }
            A002.putLong(str, currentTimeMillis).apply();
        }
    }

    public boolean A05() {
        if (C19550w8.A01()) {
            if (!C20800yB.A01(C21000yV.A02, this.A02, 1934)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
