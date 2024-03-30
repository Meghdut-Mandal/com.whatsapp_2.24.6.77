package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6UD  reason: invalid class name */
public abstract class AnonymousClass6UD {
    public static C20760y7 A01(C20070wy r5, C20070wy r6) {
        C227315o r4 = new C227315o();
        C225614x it = r5.keySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!r6.containsKey(next) || r6.get(next) != r5.get(next)) {
                r4.add(next);
            }
        }
        return r4.build();
    }

    public static C20760y7 A02(C20070wy r5, C20070wy r6) {
        C227315o r4 = new C227315o();
        C225614x it = r6.keySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!r5.containsKey(next) || r5.get(next) != r6.get(next)) {
                r5.get(next);
                r6.get(next);
                r4.add(next);
            }
        }
        return r4.build();
    }

    public static C20070wy A00(C20070wy r6, UserJid userJid) {
        HashMap A0J = AnonymousClass001.A0J();
        C225614x it = r6.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(it);
            DeviceJid fromUserJidAndDeviceIdNullable = DeviceJid.getFromUserJidAndDeviceIdNullable(userJid, ((Jid) A11.getKey()).getDevice());
            C18740tg.A0D(AnonymousClass000.A1V(fromUserJidAndDeviceIdNullable), "DeviceJid must not be null");
            if (fromUserJidAndDeviceIdNullable != null) {
                A0J.put(fromUserJidAndDeviceIdNullable, A11.getValue());
            }
        }
        return C20070wy.copyOf((Map) A0J);
    }

    public static String A03(Collection collection) {
        String rawString;
        ArrayList A14 = C36441kJ.A14(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Jid jid = (Jid) it.next();
            if (jid instanceof C177508du) {
                rawString = C223113u.A00(jid.user, jid.getServer(), 0, jid.getDevice());
            } else {
                rawString = jid.getRawString();
            }
            A14.add(rawString);
        }
        Collections.sort(A14);
        try {
            MessageDigest A0s = C90504aG.A0s();
            Iterator it2 = A14.iterator();
            while (it2.hasNext()) {
                A0s.update(AnonymousClass001.A0C(it2).getBytes());
            }
            byte[] digest = A0s.digest();
            byte[] bArr = new byte[6];
            System.arraycopy(digest, 0, bArr, 0, 6);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("2:");
            return AnonymousClass000.A0q(C36441kJ.A13(bArr), A0u);
        } catch (NoSuchAlgorithmException e) {
            throw AnonymousClass001.A0B(e);
        }
    }
}
