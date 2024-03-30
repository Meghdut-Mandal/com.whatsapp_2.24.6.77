package X;

import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob;
import java.util.List;

/* renamed from: X.ADc  reason: case insensitive filesystem */
public final class C21220ADc implements B3V {
    public final int A00;
    public final Jid A01;
    public final C64933Qa A02;
    public final C80113ur A03;
    public final C207209uj A04;
    public final List A05;

    public DeviceJid BlJ(int i) {
        return (DeviceJid) ((Pair) this.A05.get(i)).first;
    }

    public void BpO(AnonymousClass164 r7, int i) {
        List list = this.A05;
        List subList = list.subList(i, list.size());
        C64933Qa r2 = this.A02;
        r7.A01(new ReceiptMultiTargetProcessingJob(this.A01, r2, this.A03, subList, this.A00));
    }

    public long Bvd(int i) {
        return C36431kI.A09(((Pair) this.A05.get(i)).second);
    }

    public int size() {
        return this.A05.size();
    }

    public C21220ADc(Jid jid, C64933Qa r2, C80113ur r3, C207209uj r4, List list, int i) {
        this.A02 = r2;
        this.A01 = jid;
        this.A00 = i;
        this.A05 = list;
        this.A04 = r4;
        this.A03 = r3;
    }

    public C80113ur Bmw() {
        return this.A03;
    }

    public Jid Bna() {
        return this.A01;
    }

    public C207209uj BuJ() {
        return this.A04;
    }

    public int Bv2() {
        return this.A00;
    }

    public C64933Qa BNu(int i) {
        return this.A02;
    }
}
