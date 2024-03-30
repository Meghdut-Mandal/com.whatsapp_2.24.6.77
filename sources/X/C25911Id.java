package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1Id  reason: invalid class name and case insensitive filesystem */
public class C25911Id {
    public String A00;
    public final C19970wo A01;
    public final C20060wx A02;
    public final C21010yW A03;
    public final C19730wQ A04;
    public final AnonymousClass1AB A05;
    public final AnonymousClass189 A06;

    public static String A00(C25911Id r3) {
        String str = r3.A00;
        if (str != null) {
            return str;
        }
        C19730wQ r0 = r3.A04;
        r0.A0G();
        PhoneUserJid phoneUserJid = r0.A03;
        C18740tg.A06(phoneUserJid);
        DeviceJid primaryDevice = phoneUserJid.getPrimaryDevice();
        AnonymousClass1AB r2 = r3.A05;
        String A042 = AnonymousClass1AB.A04(r2.A03.A00.A04().A01, r3.A06.A0B(C133256Xm.A02(primaryDevice)));
        r3.A00 = A042;
        if (A042 == null) {
            Log.w("CompanionSyncStatsLogger/getBootstrapSessionId MD session ID is null");
        }
        return r3.A00;
    }

    public void A01(C100024uL r7, C173408Ro r8, String str, long j, boolean z) {
        C45572Rw r4 = new C45572Rw();
        int i = 1;
        int i2 = 2;
        if (z) {
            i2 = 1;
        }
        r4.A01 = Integer.valueOf(i2);
        r4.A07 = A00(this);
        long j2 = 0;
        if (r7 != null) {
            j2 = 0 + r7.fileSizeBytes_;
        }
        if (r8 != null) {
            j2 += (long) r8.A0k((C23073B3d) null);
            if ((r8.bitField0_ & 2) != 0) {
                C100024uL r0 = r8.externalMutations_;
                if (r0 == null) {
                    r0 = C100024uL.DEFAULT_INSTANCE;
                }
                j2 += r0.fileSizeBytes_;
            }
        }
        r4.A02 = Long.valueOf(j2);
        if (!C201669k5.A09.contains(str)) {
            i = 2;
        }
        r4.A00 = Integer.valueOf(i);
        long A002 = C19970wo.A00(this.A01);
        r4.A06 = Long.valueOf(A002);
        r4.A03 = Long.valueOf(A002 - j);
        C20060wx r1 = this.A02;
        long A042 = r1.A04();
        r4.A04 = Long.valueOf(A042);
        r4.A05 = Long.valueOf(A042 - r1.A02());
        this.A03.Bly(r4);
    }

    public C25911Id(C19730wQ r1, AnonymousClass1AB r2, C19970wo r3, C20060wx r4, AnonymousClass189 r5, C21010yW r6) {
        this.A01 = r3;
        this.A04 = r1;
        this.A03 = r6;
        this.A02 = r4;
        this.A05 = r2;
        this.A06 = r5;
    }
}
