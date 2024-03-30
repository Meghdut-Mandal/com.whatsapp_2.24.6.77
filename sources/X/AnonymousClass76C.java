package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Comparator;

/* renamed from: X.76C  reason: invalid class name */
public final /* synthetic */ class AnonymousClass76C implements Comparator {
    public static final /* synthetic */ AnonymousClass76C A00 = new AnonymousClass76C();

    public final int compare(Object obj, Object obj2) {
        C203399nx r7 = (C203399nx) obj2;
        Class<DeviceJid> cls = DeviceJid.class;
        try {
            boolean z = false;
            if (((DeviceJid) ((C203399nx) obj).A0Y(cls, "jid")).getDevice() == 0) {
                z = true;
            }
            boolean z2 = false;
            if (((DeviceJid) r7.A0Y(cls, "jid")).getDevice() == 0) {
                z2 = true;
            }
            if (z == z2) {
                return 0;
            }
            if (z) {
                return -1;
            }
            return 1;
        } catch (C235919b unused) {
            return 0;
        }
    }
}
