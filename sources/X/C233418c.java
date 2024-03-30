package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.18c  reason: invalid class name and case insensitive filesystem */
public class C233418c extends C19580wB {
    public final AnonymousClass18I A00;
    public final AnonymousClass187 A01;

    public void A00(DeviceJid deviceJid) {
        AnonymousClass79X A08 = this.A00.A08(deviceJid);
        try {
            for (AnonymousClass4UK BZ2 : getObservers()) {
                BZ2.BZ2(deviceJid);
            }
            if (A08 != null) {
                A08.close();
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C233418c(AnonymousClass187 r1, AnonymousClass18I r2, AnonymousClass005 r3) {
        super(r3);
        this.A00 = r2;
        this.A01 = r1;
    }
}
