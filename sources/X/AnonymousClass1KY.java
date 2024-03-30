package X;

import android.content.SharedPreferences;
import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.SecretKey;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1KY  reason: invalid class name */
public final class AnonymousClass1KY {
    public final C19700wN A00;
    public final C19970wo A01;
    public final C19420v0 A02;
    public final AnonymousClass189 A03;
    public final C26401Ka A04;
    public final AnonymousClass1KT A05;
    public final C20810yC A06;
    public final AnonymousClass1KW A07;
    public final AnonymousClass1KZ A08;

    public AnonymousClass1KY(C19700wN r2, C19970wo r3, AnonymousClass1KW r4, C19420v0 r5, AnonymousClass189 r6, AnonymousClass1KZ r7, C26401Ka r8, AnonymousClass1KT r9, C20810yC r10) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r10, 4);
        AnonymousClass00C.A0D(r7, 5);
        AnonymousClass00C.A0D(r6, 6);
        AnonymousClass00C.A0D(r3, 7);
        this.A02 = r5;
        this.A07 = r4;
        this.A00 = r2;
        this.A06 = r10;
        this.A08 = r7;
        this.A03 = r6;
        this.A01 = r3;
        this.A05 = r9;
        this.A04 = r8;
    }

    public static final void A01(AnonymousClass1KY r9, C160037kM r10, UserJid userJid, String str, String str2, SecretKey secretKey, byte[] bArr, int i, boolean z) {
        byte[] decode = Base64.decode(str, 2);
        AnonymousClass00C.A0B(decode);
        String str3 = new String(decode, AnonymousClass0S4.A05);
        AnonymousClass1KY r7 = r9;
        AnonymousClass1KW r1 = r9.A07;
        UserJid userJid2 = userJid;
        String str4 = userJid.user;
        AnonymousClass00C.A0D(str4, 0);
        C18910u1 r4 = r1.A00;
        SharedPreferences.Editor edit = ((SharedPreferences) r4.get()).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("flows_biz_public_key_pem_");
        sb.append(str4);
        edit.putString(sb.toString(), str).apply();
        String str5 = userJid.user;
        AnonymousClass00C.A0D(str5, 0);
        SharedPreferences.Editor edit2 = ((SharedPreferences) r4.get()).edit();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("extensions_biz_public_key_");
        sb2.append(str5);
        edit2.putString(sb2.toString(), str3).apply();
        String str6 = userJid.user;
        long A002 = C19970wo.A00(r7.A01);
        AnonymousClass00C.A0D(str6, 0);
        SharedPreferences.Editor edit3 = ((SharedPreferences) r4.get()).edit();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("extensions_biz_fetch_time_");
        sb3.append(str6);
        edit3.putLong(sb3.toString(), A002).apply();
        C160037kM r8 = r10;
        if (r10 != null) {
            r10.BZU(true, (String) null);
        }
        String str7 = str2;
        if (str2 != null && r8 != null) {
            SecretKey secretKey2 = secretKey;
            if (secretKey != null) {
                byte[] bArr2 = bArr;
                if (bArr != null) {
                    r7.A03(r8, userJid2, str7, secretKey2, bArr2, i, true, z);
                }
            }
        }
    }

    public final void A02(C160037kM r21, UserJid userJid, String str, String str2, String str3, SecretKey secretKey, byte[] bArr, int i, boolean z) {
        UserJid userJid2 = userJid;
        AnonymousClass00C.A0D(userJid2, 0);
        C160037kM r7 = r21;
        String str4 = str;
        if (!(str == null || str4.length() == 0)) {
            String str5 = str2;
            if (!(str2 == null || str5.length() == 0)) {
                String str6 = str3;
                SecretKey secretKey2 = secretKey;
                byte[] bArr2 = bArr;
                int i2 = i;
                boolean z2 = z;
                if (C20800yB.A01(C21000yV.A02, this.A06, 5994)) {
                    C26401Ka r15 = this.A04;
                    C1266564x r5 = new C1266564x(this, r7, userJid2, str4, str6, secretKey2, bArr2, i2, z2);
                    if (C26401Ka.A00(r15, userJid2, str4, str5)) {
                        r5.A00(true);
                        return;
                    }
                    C26411Kb r6 = r15.A00;
                    C145136tP r14 = new C145136tP(r15, r5, userJid2, str4, str5);
                    Map map = r6.A03;
                    synchronized (map) {
                        List list = (List) map.get(userJid2);
                        if (list == null) {
                            map.put(userJid2, AnonymousClass03T.A03(r14));
                            C99424tL r52 = new C99424tL();
                            C68763cQ r72 = new C68763cQ(r52, userJid2);
                            r6.A00.registerObserver(r72);
                            r6.A01.registerObserver(r72);
                            List singletonList = Collections.singletonList(userJid2.getPrimaryDevice());
                            AnonymousClass00C.A08(singletonList);
                            ((C20320xN) r6.A04.getValue()).A01(singletonList);
                            r6.A02.Boy(new C35371ia(r52, r6, r72, userJid2, 15));
                        } else {
                            list.add(r14);
                        }
                    }
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(C133256Xm.A02(userJid2.getPrimaryDevice()), userJid2);
                for (Map.Entry value : this.A03.A0J(linkedHashMap.keySet()).entrySet()) {
                    if (C133256Xm.A06(((AnonymousClass3FZ) value.getValue()).A00, Base64.decode(str4, 2), Base64.decode(str5, 2))) {
                        A01(this, r7, userJid2, str4, str6, secretKey2, bArr2, i2, z2);
                        return;
                    }
                }
                A00(this, r7, userJid2, i2, z2);
                return;
            }
        }
        if (r21 != null) {
            r7.BZU(false, "extensions-invalid-public-key");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003a, code lost:
        if (r5.length() == 0) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C160037kM r21, com.whatsapp.jid.UserJid r22, java.lang.String r23, javax.crypto.SecretKey r24, byte[] r25, int r26, boolean r27, boolean r28) {
        /*
            r20 = this;
            r3 = 0
            r9 = 1
            r8 = r20
            r14 = r21
            r11 = r26
            r18 = r27
            r10 = r28
            X.1KW r0 = r8.A07     // Catch:{ GeneralSecurityException -> 0x012c }
            r15 = r22
            java.lang.String r4 = r15.user     // Catch:{ GeneralSecurityException -> 0x012c }
            X.AnonymousClass00C.A0D(r4, r3)     // Catch:{ GeneralSecurityException -> 0x012c }
            X.0u1 r0 = r0.A00     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.Object r2 = r0.get()     // Catch:{ GeneralSecurityException -> 0x012c }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ GeneralSecurityException -> 0x012c }
            r1.<init>()     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.String r0 = "extensions_biz_public_key_"
            r1.append(r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            r1.append(r4)     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.String r0 = r1.toString()     // Catch:{ GeneralSecurityException -> 0x012c }
            r12 = 0
            java.lang.String r5 = r2.getString(r0, r12)     // Catch:{ GeneralSecurityException -> 0x012c }
            if (r5 == 0) goto L_0x003c
            int r1 = r5.length()     // Catch:{ GeneralSecurityException -> 0x012c }
            r0 = 0
            if (r1 != 0) goto L_0x003d
        L_0x003c:
            r0 = 1
        L_0x003d:
            r4 = 0
            if (r0 != 0) goto L_0x006e
            X.AnonymousClass00C.A0D(r5, r3)     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.String r0 = "-----BEGIN PUBLIC KEY-----"
            java.lang.String r2 = ""
            java.lang.String r1 = X.AnonymousClass098.A05(r5, r0, r2, r3)     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.String r0 = "-----END PUBLIC KEY-----"
            java.lang.String r1 = X.AnonymousClass098.A05(r1, r0, r2, r3)     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.String r0 = "\n"
            java.lang.String r1 = X.AnonymousClass098.A05(r1, r0, r2, r3)     // Catch:{ GeneralSecurityException -> 0x012c }
            r0 = 2
            byte[] r0 = android.util.Base64.decode(r1, r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec     // Catch:{ GeneralSecurityException -> 0x012c }
            r1.<init>(r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            java.security.PublicKey r12 = r0.generatePublic(r1)     // Catch:{ GeneralSecurityException -> 0x012c }
            X.AnonymousClass00C.A08(r12)     // Catch:{ GeneralSecurityException -> 0x012c }
        L_0x006e:
            if (r27 == 0) goto L_0x0075
            X.1KT r0 = r8.A05     // Catch:{ GeneralSecurityException -> 0x012c }
            r0.A0F(r10, r11)     // Catch:{ GeneralSecurityException -> 0x012c }
        L_0x0075:
            if (r12 != 0) goto L_0x0090
            java.lang.String r2 = "extensions-failed-to-load-certificate-from-preferences"
            if (r27 == 0) goto L_0x0080
            X.1KT r0 = r8.A05     // Catch:{ GeneralSecurityException -> 0x012c }
            r0.A0B(r11, r2, r4)     // Catch:{ GeneralSecurityException -> 0x012c }
        L_0x0080:
            java.lang.String r0 = "FlowsLogger/FlowsDataCryptoProcessor/encryptGalaxyFlowData - null certificate"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            X.0wN r1 = r8.A00     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.String r0 = ""
            r1.A0E(r2, r0, r3)     // Catch:{ GeneralSecurityException -> 0x012c }
            r14.BV7(r2)     // Catch:{ GeneralSecurityException -> 0x012c }
            return
        L_0x0090:
            r3 = 2
            r2 = 3
            javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec     // Catch:{ GeneralSecurityException -> 0x012c }
            r0 = r25
            r4.<init>(r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            java.nio.charset.Charset r0 = X.AnonymousClass0S4.A05     // Catch:{ GeneralSecurityException -> 0x012c }
            r1 = r23
            byte[] r1 = r1.getBytes(r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            X.AnonymousClass00C.A08(r1)     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            r13 = r24
            r0.init(r9, r13, r4)     // Catch:{ GeneralSecurityException -> 0x012c }
            byte[] r7 = r0.getIV()     // Catch:{ GeneralSecurityException -> 0x012c }
            byte[] r6 = r0.doFinal(r1)     // Catch:{ GeneralSecurityException -> 0x012c }
            X.AnonymousClass00C.A0B(r6)     // Catch:{ GeneralSecurityException -> 0x012c }
            X.AnonymousClass00C.A0B(r7)     // Catch:{ GeneralSecurityException -> 0x012c }
            X.AnonymousClass00C.A0D(r6, r3)     // Catch:{ GeneralSecurityException -> 0x012c }
            X.AnonymousClass00C.A0D(r7, r2)     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.String r0 = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            java.security.spec.MGF1ParameterSpec r4 = java.security.spec.MGF1ParameterSpec.SHA256     // Catch:{ GeneralSecurityException -> 0x012c }
            javax.crypto.spec.PSource$PSpecified r3 = javax.crypto.spec.PSource.PSpecified.DEFAULT     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.String r2 = "SHA-256"
            java.lang.String r1 = "MGF1"
            javax.crypto.spec.OAEPParameterSpec r0 = new javax.crypto.spec.OAEPParameterSpec     // Catch:{ GeneralSecurityException -> 0x012c }
            r0.<init>(r2, r1, r4, r3)     // Catch:{ GeneralSecurityException -> 0x012c }
            r5.init(r9, r12, r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            byte[] r0 = r13.getEncoded()     // Catch:{ GeneralSecurityException -> 0x012c }
            byte[] r0 = r5.doFinal(r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            X.AnonymousClass00C.A08(r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            X.5tL r2 = new X.5tL     // Catch:{ GeneralSecurityException -> 0x012c }
            r2.<init>(r0, r6, r7)     // Catch:{ GeneralSecurityException -> 0x012c }
            if (r27 == 0) goto L_0x00f0
            X.1KT r0 = r8.A05     // Catch:{ GeneralSecurityException -> 0x012c }
            r0.A0E(r10, r11)     // Catch:{ GeneralSecurityException -> 0x012c }
        L_0x00f0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ GeneralSecurityException -> 0x012c }
            r1.<init>()     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.String r0 = "AesKey="
            r1.append(r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            byte[] r0 = r2.A01     // Catch:{ GeneralSecurityException -> 0x012c }
            r3 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)     // Catch:{ GeneralSecurityException -> 0x012c }
            r1.append(r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.String r0 = ";IV="
            r1.append(r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            byte[] r0 = r2.A02     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)     // Catch:{ GeneralSecurityException -> 0x012c }
            r1.append(r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.String r0 = ";Data="
            r1.append(r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            byte[] r0 = r2.A00     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)     // Catch:{ GeneralSecurityException -> 0x012c }
            r1.append(r0)     // Catch:{ GeneralSecurityException -> 0x012c }
            java.lang.String r16 = r1.toString()     // Catch:{ GeneralSecurityException -> 0x012c }
            r19 = r10
            r17 = r11
            r14.BV8(r15, r16, r17, r18, r19)     // Catch:{ GeneralSecurityException -> 0x012c }
            return
        L_0x012c:
            r6 = move-exception
            java.lang.String r5 = "extensions-encryption-failed-exception"
            if (r27 == 0) goto L_0x014d
            X.1KT r4 = r8.A05
            r4.A0F(r10, r11)
            r4.A0E(r10, r11)
            java.lang.String r3 = r6.getMessage()
            X.0yC r2 = r8.A06
            r1 = 3178(0xc6a, float:4.453E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 != 0) goto L_0x014a
            r3 = 0
        L_0x014a:
            r4.A0B(r11, r5, r3)
        L_0x014d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FlowsLogger/FlowsDataCryptoProcessor/encryptGalaxyFlowData() - error while encrypting data"
            r1.append(r0)
            java.lang.String r0 = r6.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r14.BV7(r5)
            X.0wN r4 = r8.A00
            java.lang.String r3 = r6.getMessage()
            X.0yC r2 = r8.A06
            r1 = 3178(0xc6a, float:4.453E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 != 0) goto L_0x017b
            r3 = 0
        L_0x017b:
            r4.A0E(r5, r3, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KY.A03(X.7kM, com.whatsapp.jid.UserJid, java.lang.String, javax.crypto.SecretKey, byte[], int, boolean, boolean):void");
    }

    public final boolean A04(UserJid userJid) {
        String string;
        C18910u1 r4;
        boolean z;
        AnonymousClass00C.A0D(userJid, 0);
        C20810yC r5 = this.A06;
        C21000yV r6 = C21000yV.A02;
        boolean A012 = C20800yB.A01(r6, r5, 5936);
        AnonymousClass1KW r3 = this.A07;
        String str = userJid.user;
        if (A012) {
            string = r3.A01(str);
        } else {
            AnonymousClass00C.A0D(str, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("extensions_biz_public_key_");
            sb.append(str);
            string = ((SharedPreferences) r3.A00.get()).getString(sb.toString(), (String) null);
        }
        boolean z2 = true;
        if (!(string == null || string.length() == 0)) {
            String str2 = userJid.user;
            AnonymousClass00C.A0D(str2, 0);
            r4 = r3.A00;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("extensions_biz_fetch_time_");
            sb2.append(str2);
            long j = ((SharedPreferences) r4.get()).getLong(sb2.toString(), 0);
            int A002 = C20800yB.A00(r6, r5, 3329);
            if (A002 < 0 || A002 >= 43200) {
                A002 = 10080;
            }
            long j2 = j + (((long) A002) * 60000);
            String A09 = r5.A09(1695);
            AnonymousClass00C.A08(A09);
            try {
                JSONArray jSONArray = new JSONObject(A09).getJSONArray("galaxy_allowed_list");
                int length = jSONArray.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String string2 = jSONArray.getString(i);
                    String str3 = userJid.user;
                    if (string2 == null) {
                        if (str3 == null) {
                            break;
                        }
                    } else if (string2.equalsIgnoreCase(str3)) {
                        break;
                    }
                    i++;
                }
                z = true;
            } catch (JSONException e) {
                Log.e("FlowsLogger/FlowsDataCryptoProcessor/isTrustedTestNumber()", e);
            }
            z2 = false;
            if (!z && C19970wo.A00(this.A01) > j2) {
                r3.A03(userJid.user);
                String str4 = userJid.user;
                AnonymousClass00C.A0D(str4, 0);
                SharedPreferences.Editor edit = ((SharedPreferences) r4.get()).edit();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("flows_biz_public_key_pem_");
                sb3.append(str4);
                edit.remove(sb3.toString()).apply();
                return true;
            }
        }
        return z2;
        z = false;
        z2 = false;
        r3.A03(userJid.user);
        String str42 = userJid.user;
        AnonymousClass00C.A0D(str42, 0);
        SharedPreferences.Editor edit2 = ((SharedPreferences) r4.get()).edit();
        StringBuilder sb32 = new StringBuilder();
        sb32.append("flows_biz_public_key_pem_");
        sb32.append(str42);
        edit2.remove(sb32.toString()).apply();
        return true;
    }

    public static final void A00(AnonymousClass1KY r2, C160037kM r3, UserJid userJid, int i, boolean z) {
        r2.A07.A03(userJid.user);
        Log.e("FlowsLogger/FlowsDataCryptoProcessor/handleSignedPublicKey() - public key signature could not be verified");
        AnonymousClass1KT r22 = r2.A05;
        r22.A0F(z, i);
        r22.A0E(z, i);
        r22.A0B(i, "extensions-public-key-signature-verification-exception", (String) null);
        if (r3 != null) {
            r3.BZU(false, "extensions-public-key-signature-verification-exception");
            r3.BV7("extensions-public-key-signature-verification-exception");
        }
    }
}
