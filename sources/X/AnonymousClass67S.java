package X;

import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.67S  reason: invalid class name */
public final class AnonymousClass67S {
    public final AnonymousClass1KR A00;
    public final AnonymousClass1KY A01;
    public final C20810yC A02;
    public final C19770wU A03;

    public AnonymousClass67S(AnonymousClass1KR r2, AnonymousClass1KY r3, C20810yC r4, C19770wU r5) {
        C36331k8.A1G(r5, 3, r4);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }

    public final String A00(String str, SecretKey secretKey, byte[] bArr, int i, boolean z, boolean z2) {
        String str2;
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass1KY r6 = this.A01;
        if (z) {
            AnonymousClass1KT r1 = r6.A05;
            if (z2) {
                str2 = "decryption_1_start";
            } else {
                str2 = "decryption_start";
            }
            C90494aF.A0x(r1, str2, i);
        }
        try {
            byte[] encoded = secretKey.getEncoded();
            byte[] decode = Base64.decode(str, 2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(encoded, 0, encoded.length, "AES");
            AnonymousClass00C.A0B(decode);
            AnonymousClass00C.A0D(decode, 2);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            Cipher A19 = C90514aH.A19();
            A19.init(2, secretKeySpec, ivParameterSpec);
            byte[] doFinal = A19.doFinal(decode);
            AnonymousClass00C.A0B(doFinal);
            return new String(doFinal, AnonymousClass0S4.A05);
        } catch (Exception e) {
            if (z) {
                AnonymousClass1KT r3 = r6.A05;
                String message = e.getMessage();
                if (!r6.A06.A0E(3178)) {
                    message = null;
                }
                r3.A0B(i, "extensions-decryption-failed-exception", message);
            }
            Log.w(C36331k8.A0i("FlowsLogger/FlowsDataCryptoProcessor/decryptGalaxyFlowData() - Issue while decrypting data", AnonymousClass000.A0u(), e));
            C19700wN r32 = r6.A00;
            String message2 = e.getMessage();
            if (!r6.A06.A0E(3178)) {
                message2 = null;
            }
            r32.A0E("extensions-decryption-failed-exception", message2, true);
            return null;
        }
    }

    public final void A01(C160037kM r22, UserJid userJid, String str, String str2, String str3, SecretKey secretKey, byte[] bArr, boolean z, boolean z2, boolean z3) {
        String str4;
        String str5;
        String str6;
        String str7;
        UserJid userJid2 = userJid;
        String str8 = str2;
        C36341k9.A1E(userJid2, 0, str8);
        String str9 = str3;
        AnonymousClass00C.A0D(str9, 9);
        int hashCode = str9.hashCode();
        C160037kM r4 = r22;
        if (str8.equals("2") || str8.equals("3")) {
            AnonymousClass1KR r3 = this.A00;
            boolean z4 = z2;
            boolean z5 = z3;
            if (z2) {
                AnonymousClass1KT r2 = r3.A03;
                if (z3) {
                    str6 = "encryption_1_start";
                } else {
                    str6 = "encryption_start";
                }
                Integer valueOf = Integer.valueOf(hashCode);
                r2.A08(valueOf, str6);
                if (z3) {
                    str7 = "fetch_key_1_start";
                } else {
                    str7 = "fetch_key_start";
                }
                r2.A08(valueOf, str7);
            }
            String str10 = str;
            SecretKey secretKey2 = secretKey;
            byte[] bArr2 = bArr;
            if (!z) {
                AnonymousClass1KY r12 = r3.A00;
                if (!r12.A04(userJid2)) {
                    if (z2) {
                        AnonymousClass1KT r23 = r3.A03;
                        if (z3) {
                            str5 = "fetch_key_1_cache_hit";
                        } else {
                            str5 = "fetch_key_cache_hit";
                        }
                        r23.A04(hashCode, str5, true);
                    }
                    r12.A03(r4, userJid2, str10, secretKey2, bArr2, hashCode, z4, z5);
                    return;
                }
            }
            if (z2) {
                AnonymousClass1KT r24 = r3.A03;
                if (z3) {
                    str4 = "fetch_key_1_cache_hit";
                } else {
                    str4 = "fetch_key_cache_hit";
                }
                r24.A04(hashCode, str4, false);
            }
            r3.A01(r4, userJid2, str10, secretKey2, bArr2, hashCode, z4, z5);
            return;
        }
        r4.BV7("extensions-invalid-business-profile");
    }
}
