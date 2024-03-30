package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6HP  reason: invalid class name */
public abstract class AnonymousClass6HP {
    public static boolean A00(AnonymousClass3T1 r1) {
        if (!r1.A1L() || (r1 instanceof AnonymousClass2bK)) {
            return false;
        }
        return true;
    }

    public static byte[] A01(UserJid userJid, UserJid userJid2, String str, String str2, byte[] bArr) {
        StringBuilder A0v = AnonymousClass000.A0v(str2);
        A0v.append(userJid.getRawString());
        return AnonymousClass6R0.A00(bArr, AnonymousClass000.A0p(userJid2.getRawString(), str, A0v).getBytes(AnonymousClass0S4.A05), 32);
    }
}
