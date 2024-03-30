package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import java.util.concurrent.Callable;

/* renamed from: X.7qg  reason: invalid class name and case insensitive filesystem */
public class C163737qg implements Callable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C163737qg(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final Object call() {
        DeviceJid deviceJid;
        switch (this.A03) {
            case 0:
                DeviceJid deviceJid2 = (DeviceJid) this.A01;
                AnonymousClass189 r2 = ((AnonymousClass6WM) this.A00).A06;
                C18740tg.A0D(r2.A0Z(C133256Xm.A02(deviceJid2)), "no session with deviceJid");
                return C110545aq.A01(C133256Xm.A02(deviceJid2), r2, ((AnonymousClass8SX) this.A02).A0o());
            case 1:
                SendLiveLocationKeyJob sendLiveLocationKeyJob = (SendLiveLocationKeyJob) this.A00;
                AnonymousClass8SX r3 = (AnonymousClass8SX) this.A01;
                UserJid userJid = (UserJid) this.A02;
                C223113u r0 = DeviceJid.Companion;
                if (userJid != null) {
                    deviceJid = userJid.getPrimaryDevice();
                } else {
                    deviceJid = null;
                }
                return C110545aq.A01(C133256Xm.A02(deviceJid), sendLiveLocationKeyJob.A01, r3.A0o());
            default:
                return C110545aq.A01(C133256Xm.A02((DeviceJid) this.A01), ((SendPeerMessageJob) this.A00).A01, (byte[]) this.A02);
        }
    }
}
