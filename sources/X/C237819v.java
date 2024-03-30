package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Iterator;

/* renamed from: X.19v  reason: invalid class name and case insensitive filesystem */
public final class C237819v {
    public final C236419g A00;
    public final C19730wQ A01;
    public final C19420v0 A02;
    public final C232117p A03;

    public C237819v(C19730wQ r2, C19420v0 r3, C236419g r4, C232117p r5) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r5, 4);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r4;
        this.A03 = r5;
    }

    public final boolean A00() {
        C19960wn r0;
        Iterator it = this.A00.A09().iterator();
        while (true) {
            if (!it.hasNext()) {
                r0 = C19960wn.A01;
                break;
            }
            DeviceJid deviceJid = ((AnonymousClass3SB) it.next()).A07;
            AnonymousClass00C.A08(deviceJid);
            if (AnonymousClass9ZV.A00(deviceJid)) {
                r0 = new C19960wn(deviceJid);
                break;
            }
        }
        AnonymousClass00C.A08(r0);
        if (r0.A00 != null) {
            return true;
        }
        return false;
    }
}
