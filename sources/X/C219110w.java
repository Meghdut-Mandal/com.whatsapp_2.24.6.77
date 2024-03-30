package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.10w  reason: invalid class name and case insensitive filesystem */
public interface C219110w {
    byte[] WCIAPIGcmAesCreateEncryptedCiphertext(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i);

    C192009Fi WCMMessageSecretAPICreateWithSerialized(byte[] bArr);

    C192019Fj WcmBotMessageSecretAPICreateWithMessageSecret(C192009Fi r1);

    AnonymousClass33W WcmMsmsgSecretAPICreateFromBotMessageSecret(C192019Fj r1, String str, UserJid userJid, UserJid userJid2);
}
