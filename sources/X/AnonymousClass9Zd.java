package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.9Zd  reason: invalid class name */
public abstract class AnonymousClass9Zd {
    public static final AnonymousClass9IR A00(UserJid userJid, UserJid userJid2, C000100b r9, String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String str3;
        int length;
        C000100b r4 = r9;
        C36331k8.A1I(r9, str);
        C36321k7.A17(bArr, userJid, userJid2, 2);
        int length2 = bArr.length;
        if (length2 != 32) {
            str3 = AnonymousClass000.A0r("MessageEncUtils/encryptEncMessage: invalid message_secret secretSize=", AnonymousClass000.A0u(), length2);
        } else {
            byte[] bArr4 = new byte[12];
            AnonymousClass136.A00().nextBytes(bArr4);
            byte[] A01 = AnonymousClass6HP.A01(userJid, userJid2, str2, str, bArr);
            AnonymousClass00C.A08(A01);
            byte[] WCIAPIGcmAesCreateEncryptedCiphertext = r4.WCIAPIGcmAesCreateEncryptedCiphertext(A01, bArr4, bArr3, bArr2, 16);
            if (WCIAPIGcmAesCreateEncryptedCiphertext != null && (length = WCIAPIGcmAesCreateEncryptedCiphertext.length) != 0) {
                return new AnonymousClass9IR(C21674AUx.A01(bArr4, 0, 12), C21674AUx.A01(WCIAPIGcmAesCreateEncryptedCiphertext, 0, length));
            }
            str3 = "MessageEncUtils/encryptEncMessage encryption values are invalid";
        }
        Log.e(str3);
        return null;
    }

    public static final byte[] A01(UserJid userJid, UserJid userJid2, C000100b r8, String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        StringBuilder A0u;
        String str3;
        AnonymousClass00C.A0D(r8, 3);
        int length = bArr4.length;
        if (length != 32) {
            A0u = AnonymousClass000.A0u();
            str3 = "MessageEncUtils/decryptEncMessage: invalid message_secret secretSize=";
        } else {
            byte[] bArr5 = bArr;
            length = bArr.length;
            if (length != 12) {
                A0u = AnonymousClass000.A0u();
                str3 = "MessageEncUtils/decryptEncMessage: invalid encIv ivSize=";
            } else {
                byte[] A01 = AnonymousClass6HP.A01(userJid, userJid2, str2, str, bArr4);
                AnonymousClass00C.A08(A01);
                return (byte[]) JniBridge.jvidispatchOIOOOOO(3, (long) 16, ((JniBridge) r8).wajContext.get(), A01, bArr5, bArr2, bArr3);
            }
        }
        C36321k7.A1S(str3, A0u, length);
        return null;
    }
}
