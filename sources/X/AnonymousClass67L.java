package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.67L  reason: invalid class name */
public final class AnonymousClass67L {
    public final AnonymousClass189 A00;
    public final Set A01;
    public final AnonymousClass1XT A02;
    public final C27301Nr A03;

    public final HashSet A00(Collection collection, boolean z) {
        AnonymousClass00C.A0D(collection, 0);
        HashSet A16 = C36441kJ.A16();
        HashSet A162 = C36441kJ.A16();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (deviceJid.getDevice() != 0) {
                UserJid userJid = deviceJid.userJid;
                DeviceJid primaryDevice = userJid.getPrimaryDevice();
                if (!this.A00.A0Z(C133256Xm.A02(primaryDevice)) && !this.A01.contains(primaryDevice)) {
                    C36321k7.A1K(userJid, "voip/encryption/schedule usync for ", AnonymousClass000.A0u());
                    this.A03.A01(new UserJid[]{userJid}, 4);
                    A162.add(primaryDevice);
                    A16.add(deviceJid);
                }
            }
            if (!this.A00.A0Z(C133256Xm.A02(deviceJid)) && !this.A01.contains(deviceJid)) {
                A162.add(deviceJid);
                A16.add(deviceJid);
            }
        }
        if (!A162.isEmpty()) {
            DeviceJid[] deviceJidArr = (DeviceJid[]) A162.toArray(new DeviceJid[0]);
            AnonymousClass1XT r1 = this.A02;
            int i = 6;
            if (z) {
                i = 10;
            }
            r1.A04(deviceJidArr, i, false);
        }
        return A16;
    }

    public final void A01(DeviceJid deviceJid) {
        boolean add = this.A01.add(deviceJid);
        StringBuilder A0u = AnonymousClass000.A0u();
        if (add) {
            C36321k7.A1K(deviceJid, "voip/encryption/startGetPreKeyJobForE2EFail for ", A0u);
            this.A02.A04(new DeviceJid[]{deviceJid}, 7, false);
            return;
        }
        C36321k7.A1K(deviceJid, "voip/encryption/startGetPreKeyJobForE2EFail do nothing, PreKey already sent for ", A0u);
    }

    public AnonymousClass67L(AnonymousClass1XT r2, C27301Nr r3, AnonymousClass189 r4) {
        C36321k7.A11(r3, r4, r2);
        this.A03 = r3;
        this.A00 = r4;
        this.A02 = r2;
        Set newSetFromMap = Collections.newSetFromMap(C90524aI.A0s());
        AnonymousClass00C.A08(newSetFromMap);
        this.A01 = newSetFromMap;
    }
}
