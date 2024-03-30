package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;

/* renamed from: X.1iL  reason: invalid class name and case insensitive filesystem */
public class C35221iL implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public boolean A0C;

    public final void run() {
        C30901ax r2 = (C30901ax) this.A02;
        C207209uj r1 = (C207209uj) this.A03;
        C64933Qa r7 = (C64933Qa) this.A06;
        byte[] bArr = (byte[]) this.A07;
        int i = this.A01;
        byte[] bArr2 = (byte[]) this.A08;
        byte[] bArr3 = (byte[]) this.A09;
        C121865tq r8 = (C121865tq) this.A0A;
        C121865tq r9 = (C121865tq) this.A0B;
        boolean z = this.A0C;
        DeviceJid deviceJid = (DeviceJid) this.A04;
        int i2 = this.A00;
        C181018mn r0 = (C181018mn) this.A05;
        if (bArr2 == null || r9 == null || r8 == null || r2.A06.A0E(deviceJid, bArr3, bArr2, (byte) 5, 3)) {
            byte[] A002 = r2.A0A.A00(deviceJid, r7, r8, r9, bArr, bArr2, i, i2, z);
            StringBuilder sb = new StringBuilder();
            sb.append("PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/sending retry for msg = ");
            sb.append(r0);
            sb.append(" device = ");
            sb.append(deviceJid);
            Log.i(sb.toString());
            r2.A01.A01(new SendPeerMessageJob(deviceJid, r0, A002, i));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/adv validation fails, key=");
            sb2.append(r1);
            Log.e(sb2.toString());
        }
        r2.A09.A01(r1);
    }

    public C35221iL(DeviceJid deviceJid, C30901ax r2, C64933Qa r3, C121865tq r4, C121865tq r5, C207209uj r6, C181018mn r7, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, boolean z) {
        this.A02 = r2;
        this.A03 = r6;
        this.A06 = r3;
        this.A07 = bArr;
        this.A01 = i;
        this.A08 = bArr2;
        this.A09 = bArr3;
        this.A0A = r4;
        this.A0B = r5;
        this.A0C = z;
        this.A04 = deviceJid;
        this.A00 = i2;
        this.A05 = r7;
    }
}
