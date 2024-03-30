package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.1ah  reason: invalid class name and case insensitive filesystem */
public class C30741ah {
    public final C19730wQ A00;
    public final AnonymousClass164 A01;
    public final C19970wo A02;
    public final AnonymousClass1AI A03;
    public final C237919w A04;
    public final C25761Ho A05;
    public final C20810yC A06;

    public void A00(DeviceJid deviceJid, Set set) {
        StringBuilder sb = new StringBuilder();
        sb.append("NonMessageDataRequestSendMethod/sendDataRequestMessage type=");
        sb.append(0);
        sb.append("; size=");
        sb.append(set.size());
        Log.i(sb.toString());
        if (!set.isEmpty()) {
            if (!C20800yB.A01(C21000yV.A02, this.A06, 2155)) {
                Log.w("NonMessageDataRequestSendMethod/sendDataRequestMessage gate is not enabled");
                return;
            }
            C19730wQ r0 = this.A00;
            r0.A0G();
            PhoneUserJid phoneUserJid = r0.A03;
            C237919w r3 = this.A04;
            AnonymousClass5J8 r6 = new AnonymousClass5J8(r3.A02(phoneUserJid, true), C19970wo.A00(this.A02));
            r6.A00 = deviceJid;
            r6.A00 = 0;
            r6.A01 = set;
            if (this.A03.A01(r6) < 0) {
                Log.e("NonMessageDataRequestSendMethod/sendDataRequestMessage unable to add peer message");
                return;
            }
            this.A01.A01(new SendPeerMessageJob(deviceJid, r6));
            C25761Ho r4 = this.A05;
            int size = set.size();
            String str = r6.A1J.A01;
            C44872Pe r2 = new C44872Pe();
            r2.A00 = 0;
            r2.A01 = Long.valueOf((long) size);
            r2.A02 = str;
            r4.A00.Bly(r2);
        }
    }

    public C30741ah(C19730wQ r1, AnonymousClass164 r2, C25761Ho r3, C19970wo r4, AnonymousClass1AI r5, C20810yC r6, C237919w r7) {
        this.A02 = r4;
        this.A06 = r6;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r5;
        this.A04 = r7;
        this.A05 = r3;
    }
}
