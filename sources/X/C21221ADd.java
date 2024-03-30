package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.ReceiptProcessingJob;

/* renamed from: X.ADd  reason: case insensitive filesystem */
public final class C21221ADd implements B3V {
    public final int A00;
    public final long A01;
    public final DeviceJid A02;
    public final Jid A03;
    public final C80113ur A04;
    public final C207209uj A05;
    public final C64933Qa[] A06;

    public C64933Qa BNu(int i) {
        return this.A06[i];
    }

    public void BpO(AnonymousClass164 r9, int i) {
        C64933Qa[] r2 = this.A06;
        int length = r2.length - i;
        C64933Qa[] r4 = new C64933Qa[length];
        System.arraycopy(r2, i, r4, 0, length);
        Jid jid = this.A03;
        r9.A01(new ReceiptProcessingJob(this.A02, jid, this.A04, r4, this.A00, this.A01));
    }

    public int size() {
        return this.A06.length;
    }

    public C21221ADd(DeviceJid deviceJid, Jid jid, C80113ur r3, C207209uj r4, C64933Qa[] r5, int i, long j) {
        this.A06 = r5;
        this.A03 = jid;
        this.A02 = deviceJid;
        this.A00 = i;
        this.A01 = j;
        this.A05 = r4;
        this.A04 = r3;
    }

    public C80113ur Bmw() {
        return this.A04;
    }

    public Jid Bna() {
        return this.A03;
    }

    public C207209uj BuJ() {
        return this.A05;
    }

    public int Bv2() {
        return this.A00;
    }

    public DeviceJid BlJ(int i) {
        return this.A02;
    }

    public long Bvd(int i) {
        return this.A01;
    }
}
