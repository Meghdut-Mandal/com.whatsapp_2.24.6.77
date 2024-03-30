package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Map;

/* renamed from: X.9Ta  reason: invalid class name */
public class AnonymousClass9Ta {
    public final Map A00;

    public synchronized int A00(DeviceJid deviceJid) {
        int A01;
        A01 = A01(deviceJid) + 1;
        C36421kH.A1M(deviceJid.getRawString(), this.A00, A01);
        return A01;
    }

    public synchronized int A01(DeviceJid deviceJid) {
        int i;
        String rawString = deviceJid.getRawString();
        Map map = this.A00;
        if (map.containsKey(rawString)) {
            i = C90514aH.A0H(map.get(rawString));
        } else {
            i = 0;
        }
        return i;
    }

    public AnonymousClass9Ta(Map map) {
        this.A00 = map;
    }
}
