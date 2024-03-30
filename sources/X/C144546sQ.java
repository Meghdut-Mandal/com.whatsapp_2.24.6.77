package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6sQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C144546sQ implements AnonymousClass4Q9 {
    public final /* synthetic */ AnonymousClass6WM A00;

    public /* synthetic */ C144546sQ(AnonymousClass6WM r1) {
        this.A00 = r1;
    }

    public final void BRl(List list) {
        AnonymousClass6WM r3 = this.A00;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (deviceJid != null) {
                r3.A03.A01.remove(deviceJid);
                r3.A02.A00(deviceJid);
            }
        }
    }
}
