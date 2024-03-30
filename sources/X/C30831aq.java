package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.1aq  reason: invalid class name and case insensitive filesystem */
public class C30831aq {
    public final C19700wN A00;
    public final AnonymousClass19J A01;
    public final C20810yC A02;
    public final AnonymousClass19A A03;
    public final AnonymousClass1DT A04;

    public void A00(C194079Oa r8) {
        int i = r8.A01;
        StringBuilder sb = new StringBuilder();
        sb.append("MessageReceiptXmppMethod/message-retry; message.key=");
        sb.append(r8.A0B);
        sb.append("; jid=");
        Jid jid = r8.A05;
        sb.append(jid);
        sb.append("; retryCount=");
        sb.append(i);
        Log.i(sb.toString());
        if (i > 4) {
            this.A00.A0E("retry-count-too-high", String.valueOf(i), false);
            AnonymousClass1DT r4 = this.A04;
            C45332Qy r3 = new C45332Qy();
            r3.A04 = Long.valueOf((long) i);
            Jid jid2 = r8.A07;
            if (jid2 == null) {
                jid2 = jid;
            }
            r3.A03 = Integer.valueOf(AnonymousClass3UK.A04(jid2));
            C19730wQ r1 = r4.A02;
            Jid jid3 = r8.A06;
            if (jid3 == null) {
                jid3 = jid;
            }
            r3.A01 = C203229nZ.A05(r1, DeviceJid.of(jid3));
            C177808eP r0 = (C177808eP) AnonymousClass19L.A00(r4.A0M, 0, r8.A03);
            if (r0 != null) {
                r3.A02 = Integer.valueOf(r0.A00);
            }
            r4.A0V.Boy(new C35321iV(r4, r8, r3, 2));
        }
    }

    public C30831aq(C19700wN r1, AnonymousClass1DT r2, AnonymousClass19J r3, C20810yC r4, AnonymousClass19A r5) {
        this.A02 = r4;
        this.A00 = r1;
        this.A03 = r5;
        this.A04 = r2;
        this.A01 = r3;
    }
}
