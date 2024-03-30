package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.6E9  reason: invalid class name */
public class AnonymousClass6E9 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final AnonymousClass3I3 A0C;
    public final DeviceJid A0D;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass6E9 r7 = (AnonymousClass6E9) obj;
            if (!(this.A02 == r7.A02 && this.A04 == r7.A04 && this.A0A == r7.A0A && this.A0B == r7.A0B && this.A08 == r7.A08 && this.A00 == r7.A00 && this.A07 == r7.A07 && this.A03 == r7.A03 && this.A0D.equals(r7.A0D) && this.A01 == r7.A01 && this.A05 == r7.A05 && this.A09 == r7.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[12];
        objArr[0] = this.A0D;
        AnonymousClass000.A1K(objArr, this.A02);
        C36361kB.A1W(objArr, this.A04);
        objArr[3] = Long.valueOf(this.A0A);
        objArr[4] = Long.valueOf(this.A0B);
        objArr[5] = Long.valueOf(this.A08);
        C36381kD.A1T(objArr, this.A00);
        objArr[7] = Long.valueOf(this.A07);
        objArr[8] = Long.valueOf(this.A03);
        objArr[9] = Integer.valueOf(this.A01);
        objArr[10] = Long.valueOf(this.A05);
        return AnonymousClass000.A0M(Long.valueOf(this.A09), objArr, 11);
    }

    public AnonymousClass6E9(AnonymousClass3I3 r3, DeviceJid deviceJid, int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.A06 = j;
        this.A0D = deviceJid;
        this.A02 = i;
        this.A04 = j2;
        this.A0A = j3;
        this.A0B = j4;
        this.A08 = j5;
        this.A00 = i2;
        this.A07 = j6;
        this.A03 = j7;
        this.A01 = i3;
        this.A05 = j8;
        this.A0C = r3;
        this.A09 = j9;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SyncDatum{deviceJid=");
        A0u.append(this.A0D);
        A0u.append(", syncType=");
        A0u.append(this.A02);
        A0u.append(", latestMsgId=");
        A0u.append(this.A04);
        A0u.append(", stageOldestMsgId=");
        A0u.append(this.A0A);
        A0u.append(", syncOldestMsgId=");
        A0u.append(this.A0B);
        A0u.append(", sendMsgsCount=");
        A0u.append(this.A08);
        A0u.append(", chunkOrder=");
        A0u.append(this.A00);
        A0u.append(", sentBytes=");
        A0u.append(this.A07);
        A0u.append(", lastChunkTimestamp=");
        A0u.append(this.A03);
        A0u.append(", status=");
        A0u.append(this.A01);
        A0u.append(", peerMsgRowId=");
        A0u.append(this.A05);
        A0u.append(", bootstrapId=");
        A0u.append(this.A0C);
        A0u.append(", sizeLimitBytes=");
        A0u.append(this.A09);
        return AnonymousClass000.A0s(A0u);
    }
}
