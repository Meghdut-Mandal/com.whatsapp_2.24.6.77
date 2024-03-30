package X;

import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.19I  reason: invalid class name */
public class AnonymousClass19I {
    public final List A00 = new ArrayList();
    public final Map A01 = new HashMap();
    public final Set A02 = new HashSet();

    public void A00(Message message, String str, boolean z) {
        List list = this.A00;
        synchronized (list) {
            list.add(new AnonymousClass376(message, str, z));
        }
    }

    public void A01(DeviceJid deviceJid, AnonymousClass3T1 r7) {
        Set set;
        DeviceJid deviceJid2;
        Map map = this.A01;
        synchronized (map) {
            C64933Qa r4 = r7.A1J;
            Pair pair = (Pair) map.get(r4);
            if (pair == null) {
                set = new HashSet();
                map.put(r4, new Pair(set, r7));
            } else {
                set = (Set) pair.first;
            }
            if (deviceJid != null) {
                deviceJid2 = deviceJid;
            } else {
                AnonymousClass11F r1 = r4.A00;
                if (r1 instanceof UserJid) {
                    deviceJid2 = DeviceJid.of(r1);
                    C18740tg.A06(deviceJid2);
                } else {
                    deviceJid2 = null;
                }
            }
            if (!set.add(deviceJid2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("in-flight-messages/duplicate in flight message: ");
                sb.append(r4);
                sb.append(" : ");
                sb.append(deviceJid);
                Log.w(sb.toString());
            }
        }
    }

    public void A02(DeviceJid deviceJid, C64933Qa r6) {
        DeviceJid deviceJid2;
        Map map = this.A01;
        synchronized (map) {
            Pair pair = (Pair) map.get(r6);
            if (pair == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("in-flight-messages/no message to remove: ");
                sb.append(r6);
                sb.append(" : ");
                sb.append(deviceJid);
                Log.w(sb.toString());
            } else {
                Set set = (Set) pair.first;
                if (set == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("in-flight-messages/no message to remove: ");
                    sb2.append(r6);
                    sb2.append(" : ");
                    sb2.append(deviceJid);
                    Log.w(sb2.toString());
                } else {
                    if (deviceJid != null) {
                        deviceJid2 = deviceJid;
                    } else {
                        AnonymousClass11F r1 = r6.A00;
                        if (r1 instanceof UserJid) {
                            deviceJid2 = DeviceJid.of(r1);
                            C18740tg.A06(deviceJid2);
                        } else {
                            deviceJid2 = null;
                        }
                    }
                    if (!set.remove(deviceJid2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("in-flight-messages/no message to remove for target: ");
                        sb3.append(r6);
                        sb3.append(" : ");
                        sb3.append(deviceJid);
                        Log.w(sb3.toString());
                    }
                    if (set.isEmpty()) {
                        map.remove(r6);
                    }
                }
            }
        }
    }
}
