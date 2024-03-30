package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.6Xm  reason: invalid class name and case insensitive filesystem */
public abstract class C133256Xm {
    public static AnonymousClass3IG A01(byte[] bArr) {
        if (bArr.length >= 33) {
            byte b = bArr[0] & 255;
            if (b == 5) {
                byte[] bArr2 = new byte[32];
                System.arraycopy(bArr, 1, bArr2, 0, 32);
                return new AnonymousClass3IG(bArr2, (byte) 5);
            }
            throw new AnonymousClass110(AnonymousClass000.A0r("Bad key type: ", AnonymousClass000.A0u(), b));
        }
        throw new AnonymousClass110("Invalid byte array");
    }

    public static byte[] A07(AnonymousClass66J r3, AnonymousClass3IG r4) {
        if (r3.A00 == 5) {
            return C131336Oq.A00().A02(r4.A01, r3.A01);
        }
        throw C90524aI.A0Y("PublicKey or PrivateKey type is invalid");
    }

    public static AnonymousClass6EZ A02(DeviceJid deviceJid) {
        int i;
        C18740tg.A07(deviceJid, "Provided jid must not be null");
        String str = deviceJid.user;
        C18740tg.A07(str, "User part of provided jid must not be null");
        if (deviceJid instanceof C177508du) {
            i = 1;
        } else {
            i = 0;
            if (deviceJid instanceof AnonymousClass14A) {
                i = 2;
            }
        }
        return new AnonymousClass6EZ(str, i, deviceJid.getDevice());
    }

    public static DeviceJid A03(AnonymousClass6EZ r3) {
        UserJid A00;
        try {
            boolean A1Q = AnonymousClass000.A1Q(r3.A01);
            String str = r3.A02;
            if (A1Q) {
                C222913s r0 = PhoneUserJid.Companion;
                A00 = C222913s.A00(str);
            } else {
                C130946Nb r02 = C223313w.A01;
                A00 = C130946Nb.A00(str);
            }
            return DeviceJid.Companion.A01(A00, r3.A00);
        } catch (C19740wR unused) {
            C36321k7.A1J(r3, "Invalid signal protocol address: ", AnonymousClass000.A0u());
            return null;
        }
    }

    public static boolean A06(AnonymousClass3IG r2, byte[] bArr, byte[] bArr2) {
        if (r2.A00 == 5) {
            return C131336Oq.A00().A01(r2.A01, bArr, bArr2);
        }
        throw C90524aI.A0Y("PublicKey type is invalid");
    }

    public static byte[] A08(AnonymousClass66J r2, byte[] bArr) {
        if (r2.A00 == 5) {
            return C131336Oq.A00().A03(r2.A01, bArr);
        }
        throw C90524aI.A0Y("PrivateKey type is invalid");
    }

    public static C119545pz A00() {
        C160777lZ r0 = C131336Oq.A00().A00;
        byte[] B7p = r0.B7p();
        return new C119545pz(new AnonymousClass66J(B7p, (byte) 5), new AnonymousClass3IG(r0.generatePublicKey(B7p), (byte) 5));
    }

    public static ArrayList A04(Collection collection) {
        ArrayList A14 = C36441kJ.A14(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DeviceJid A03 = A03((AnonymousClass6EZ) it.next());
            if (A03 != null) {
                A14.add(A03);
            }
        }
        return A14;
    }

    public static ArrayList A05(Collection collection) {
        ArrayList A14 = C36441kJ.A14(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A14.add(A02((DeviceJid) it.next()));
        }
        return A14;
    }
}
