package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Iterator;

/* renamed from: X.9Ze  reason: invalid class name */
public abstract class AnonymousClass9Ze {
    public static long A00(C203399nx r3) {
        String A0x = C36391kE.A0x(r3, "last");
        if (A0x == null) {
            return System.currentTimeMillis();
        }
        if ("deny".equals(A0x) || "error".equals(A0x) || "none".equals(A0x)) {
            return 0;
        }
        return Long.parseLong(A0x) * 1000;
    }

    public static C20070wy A01(C203399nx r9) {
        C20090x0 r8 = new C20090x0();
        if (r9 != null) {
            Iterator A08 = C203399nx.A08(r9, "device");
            while (A08.hasNext()) {
                C203399nx A0s = C36431kI.A0s(A08);
                Class<DeviceJid> cls = DeviceJid.class;
                DeviceJid deviceJid = (DeviceJid) A0s.A0Y(cls, "jid");
                r8.put(deviceJid, new AnonymousClass9WJ(deviceJid, (DeviceJid) A0s.A0X(cls, "lid"), A0s.A0V("key-index", 0)));
            }
        }
        return r8.build();
    }
}
