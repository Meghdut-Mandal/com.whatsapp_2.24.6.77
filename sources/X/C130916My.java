package X;

import com.whatsapp.jid.UserJid;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.6My  reason: invalid class name and case insensitive filesystem */
public class C130916My {
    public final C1262162z A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public static String A00(UserJid userJid) {
        String str = userJid.user;
        try {
            MessageDigest A0s = C90504aG.A0s();
            A0s.update(str.getBytes(C114085gc.A05));
            return C36441kJ.A13(A0s.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new IOException(e);
        }
    }

    public C130916My(C1262162z r1, String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EncMetadata{scheme='");
        char A002 = C90484aE.A00(this.A02, A0u);
        A0u.append(", dataId='");
        A0u.append(this.A01);
        A0u.append(A002);
        A0u.append(", sourceId='");
        A0u.append(this.A03);
        A0u.append(A002);
        A0u.append(", keyInfo=");
        return C90464aC.A0X(this.A00, A0u);
    }
}
