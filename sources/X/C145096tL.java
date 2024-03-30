package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.6tL  reason: invalid class name and case insensitive filesystem */
public class C145096tL implements AnonymousClass4QJ {
    public final /* synthetic */ AnonymousClass6WM A00;

    public C145096tL(AnonymousClass6WM r1) {
        this.A00 = r1;
    }

    public void Bk5(UserJid userJid, Set set, Set set2) {
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            C1256060o r2 = this.A00.A02;
            C36321k7.A1K(deviceJid, "VoiceService/notifyDeviceRemoved ", AnonymousClass000.A0u());
            boolean z = false;
            if (deviceJid.getDevice() == 0) {
                z = true;
            }
            C18740tg.A0D(!z, "primary device should never be removed");
            AnonymousClass6YM.A07(r2.A00, deviceJid, true);
        }
    }
}
