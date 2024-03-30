package X;

import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.crypto.KeyAgreement;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5Fl  reason: invalid class name and case insensitive filesystem */
public class C105635Fl extends AnonymousClass66T {
    public String A00;
    public final C000100b A01;
    public final JSONObject A02;
    public final JSONObject A03;
    public final byte[] A04 = C18750th.A0H(12);
    public final AnonymousClass61A A05;

    public AnonymousClass66T A00(PublicKey... publicKeyArr) {
        C18740tg.A0B(AnonymousClass000.A1W(this.A00));
        super.A00(publicKeyArr);
        try {
            String obj = this.A03.toString();
            String str = C19430v1.A0B;
            String A0o = C90504aG.A0o(obj.getBytes(str));
            byte[] bArr = this.A04;
            byte[] bArr2 = bArr;
            String encodeToString = Base64.encodeToString(bArr, 11);
            ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256r1");
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(eCGenParameterSpec);
            KeyPair generateKeyPair = instance.generateKeyPair();
            PublicKey publicKey = generateKeyPair.getPublic();
            JSONObject A1B = C36441kJ.A1B();
            JSONObject put = A1B.put(PublicKeyCredentialControllerUtility.JSON_KEY_ALG, "ECDH-ES").put("enc", "A256GCM");
            List list = this.A00;
            C18740tg.A06(list);
            Collections.sort(list);
            put.put("apu", C90504aG.A0o(TextUtils.join(";", list).getBytes(str))).put("apv", C90504aG.A0o(AnonymousClass6HB.A00((PublicKey) null).getBytes(str))).put("epk", C36441kJ.A1B().put("kty", "EC").put("crv", "P-256").put("der", C36441kJ.A13(publicKey.getEncoded())));
            String A0o2 = C90504aG.A0o(A1B.toString().getBytes(str));
            byte[] bytes = TextUtils.join(".", new String[]{A0o2, A0o}).getBytes();
            PrivateKey privateKey = generateKeyPair.getPrivate();
            KeyAgreement instance2 = KeyAgreement.getInstance("ECDH");
            instance2.init(privateKey);
            instance2.doPhase((Key) null, true);
            byte[] generateSecret = instance2.generateSecret();
            List list2 = this.A00;
            C18740tg.A06(list2);
            Collections.sort(list2);
            byte[] bytes2 = TextUtils.join(";", list2).getBytes();
            byte[] bytes3 = AnonymousClass6HB.A00((PublicKey) null).getBytes();
            boolean z = true;
            byte[] A022 = C203239na.A02(1);
            byte[] bytes4 = "A256GCM".getBytes(str);
            byte[] A023 = C203239na.A02(256);
            int length = generateSecret.length;
            int i = length;
            int i2 = length + 4;
            int i3 = i2 + 4;
            int length2 = bytes4.length;
            int i4 = length2;
            int i5 = i3 + length2;
            int i6 = i5 + 4;
            int length3 = bytes2.length;
            int i7 = i6 + length3;
            int i8 = i7 + 4;
            int length4 = bytes3.length;
            int i9 = i8 + length4;
            int i10 = i9 + 4;
            byte[] bArr3 = new byte[i10];
            System.arraycopy(A022, 0, bArr3, 0, 4);
            System.arraycopy(generateSecret, 0, bArr3, 4, i);
            System.arraycopy(C203239na.A02(i4), 0, bArr3, i2, 4);
            System.arraycopy(bytes4, 0, bArr3, i3, i4);
            System.arraycopy(C203239na.A02(length3), 0, bArr3, i5, 4);
            System.arraycopy(bytes2, 0, bArr3, i6, length3);
            System.arraycopy(C203239na.A02(length4), 0, bArr3, i7, 4);
            System.arraycopy(bytes3, 0, bArr3, i8, length4);
            System.arraycopy(A023, 0, bArr3, i9, 4);
            if (i10 != i10) {
                z = false;
            }
            C18740tg.A0E(z, "length doesn't match");
            byte[] WCIAPIGcmAesCreateEncryptedCiphertext = this.A01.WCIAPIGcmAesCreateEncryptedCiphertext(C90504aG.A0s().digest(bArr3), bArr2, this.A02.toString().getBytes(), bytes, 16);
            if (WCIAPIGcmAesCreateEncryptedCiphertext == null) {
                throw new AnonymousClass5VA(AnonymousClass001.A09("cipher failed"));
            }
            int length5 = WCIAPIGcmAesCreateEncryptedCiphertext.length;
            int i11 = length5 - 16;
            AnonymousClass00I A0W = C36441kJ.A0W(Arrays.copyOfRange(WCIAPIGcmAesCreateEncryptedCiphertext, 0, i11), Arrays.copyOfRange(WCIAPIGcmAesCreateEncryptedCiphertext, i11, length5));
            Object obj2 = A0W.A00;
            C18740tg.A06(obj2);
            String encodeToString2 = Base64.encodeToString((byte[]) obj2, 11);
            Object obj3 = A0W.A01;
            C18740tg.A06(obj3);
            String encodeToString3 = Base64.encodeToString((byte[]) obj3, 11);
            String[] strArr = new String[6];
            strArr[0] = A0o;
            strArr[1] = A0o2;
            C90514aH.A1O("", encodeToString, strArr);
            strArr[4] = encodeToString2;
            strArr[5] = encodeToString3;
            this.A00 = TextUtils.join(".", strArr);
            return this;
        } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | JSONException e) {
            Log.w("PAY: EncryptedTrustTokenBuilder/declareSigningKeys", e);
            throw new AnonymousClass5VA(e);
        }
    }

    public C105635Fl(AnonymousClass61A r2, C000100b r3, JSONObject jSONObject, JSONObject jSONObject2) {
        C18740tg.A0B(AnonymousClass000.A1R(jSONObject2.length()));
        this.A01 = r3;
        this.A05 = r2;
        this.A03 = jSONObject;
        this.A02 = jSONObject2;
    }
}
