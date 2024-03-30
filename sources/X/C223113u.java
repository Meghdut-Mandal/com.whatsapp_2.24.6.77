package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.13u  reason: invalid class name and case insensitive filesystem */
public final class C223113u {
    public final DeviceJid A01(UserJid userJid, int i) {
        String server;
        AnonymousClass00C.A0D(userJid, 0);
        boolean z = false;
        if (i == 99) {
            z = true;
        }
        boolean z2 = userJid instanceof C223313w;
        if (!z) {
            server = userJid.getServer();
        } else if (z2) {
            server = "hosted.lid";
        } else {
            server = "hosted";
        }
        return A02(A00(userJid.user, server, userJid.getAgent(), i));
    }

    public static final String A00(String str, String str2, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        sb.append(i);
        sb.append(':');
        sb.append(i2);
        sb.append('@');
        sb.append(str2);
        return sb.toString();
    }

    public final DeviceJid A02(String str) {
        DeviceJid primaryDevice;
        C222613p r0 = Jid.JID_FACTORY;
        Jid A00 = C222513o.A00(str);
        if (A00 instanceof DeviceJid) {
            return (DeviceJid) A00;
        }
        if (A00 instanceof UserJid) {
            UserJid userJid = (UserJid) A00;
            if (userJid != null && (primaryDevice = userJid.getPrimaryDevice()) != null) {
                return primaryDevice;
            }
            throw new C19740wR(str);
        }
        throw new C19740wR(str);
    }
}
