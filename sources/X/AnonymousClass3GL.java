package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.3GL  reason: invalid class name */
public class AnonymousClass3GL {
    public final C231417i A00;
    public final AnonymousClass189 A01;
    public final C20320xN A02;

    public void A01(UserJid userJid) {
        HashSet A0B = this.A00.A0B(userJid);
        HashMap A002 = A00(A0B);
        ArrayList A15 = C36441kJ.A15(A0B);
        A15.removeAll(A002.keySet());
        if (!A15.isEmpty()) {
            this.A02.A01(A15);
        }
    }

    public AnonymousClass3GL(AnonymousClass189 r1, C20320xN r2, C231417i r3) {
        this.A01 = r1;
        this.A00 = r3;
        this.A02 = r2;
    }

    public HashMap A00(Iterable iterable) {
        HashMap A0J = AnonymousClass001.A0J();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            AnonymousClass3FZ A0B = this.A01.A0B(C133256Xm.A02(deviceJid));
            if (A0B != null) {
                A0J.put(deviceJid, A0B);
            }
        }
        return A0J;
    }
}
