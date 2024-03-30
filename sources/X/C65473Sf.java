package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.3Sf  reason: invalid class name and case insensitive filesystem */
public abstract class C65473Sf {
    public static final C88514Sz A00 = new C70113ec();

    public static AnonymousClass141 A00(AnonymousClass16D r2, C20350xQ r3, AnonymousClass1C6 r4, C107265Nh r5) {
        UserJid userJid;
        AnonymousClass141 A01;
        if (r5.A0D != null && (A01 = AnonymousClass3UL.A01(r2, r3, r5.A0D, r4, AnonymousClass000.A1S(r5.A08, 2))) != null) {
            return A01;
        }
        if (r5.A0C == null || r5.A0C.A01 == null) {
            DeviceJid deviceJid = r5.A02;
            if (deviceJid == null) {
                return null;
            }
            userJid = deviceJid.userJid;
        } else {
            userJid = r5.A0C.A01;
        }
        return r2.A0D(userJid);
    }

    public static ArrayList A01(C107265Nh r5) {
        ArrayList A0C = r5.A0C();
        UserJid userJid = r5.A04.A01;
        int i = 0;
        while (i < A0C.size() && !((C107255Nf) A0C.get(i)).A00.equals(userJid)) {
            i++;
        }
        if (i != 0 && i < A0C.size()) {
            Object obj = A0C.get(i);
            A0C.remove(i);
            A0C.add(0, obj);
        }
        return A0C;
    }
}
