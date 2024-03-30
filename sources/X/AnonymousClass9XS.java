package X;

import com.whatsapp.jid.Jid;
import java.util.Arrays;

/* renamed from: X.9XS  reason: invalid class name */
public final class AnonymousClass9XS {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Jid A03;
    public final Jid A04;
    public final C64933Qa A05;
    public final C64933Qa A06;
    public final Long A07;
    public final byte[] A08;
    public final byte[] A09;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (java.util.Arrays.equals(r1, r0) != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r7 == r8) goto L_0x0084
            java.lang.Class r1 = r7.getClass()
            java.lang.Class r0 = X.C90474aD.A0W(r8)
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            r5 = 0
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.orphan.MessageOrphan"
            X.AnonymousClass00C.A0E(r8, r0)
            X.9XS r8 = (X.AnonymousClass9XS) r8
            java.lang.Long r1 = r7.A07
            java.lang.Long r0 = r8.A07
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0061
            X.3Qa r1 = r7.A05
            X.3Qa r0 = r8.A05
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0061
            com.whatsapp.jid.Jid r1 = r7.A04
            com.whatsapp.jid.Jid r0 = r8.A04
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0061
            X.3Qa r1 = r7.A06
            X.3Qa r0 = r8.A06
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0061
            com.whatsapp.jid.Jid r1 = r7.A03
            com.whatsapp.jid.Jid r0 = r8.A03
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0061
            long r3 = r7.A02
            long r1 = r8.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0061
            byte[] r1 = r7.A08
            byte[] r0 = r8.A08
            if (r1 == 0) goto L_0x0062
            if (r0 == 0) goto L_0x0061
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0065
        L_0x0061:
            return r5
        L_0x0062:
            if (r0 == 0) goto L_0x0065
            return r5
        L_0x0065:
            int r1 = r7.A01
            int r0 = r8.A01
            if (r1 != r0) goto L_0x0061
            byte[] r1 = r7.A09
            byte[] r0 = r8.A09
            if (r1 == 0) goto L_0x007a
            if (r0 == 0) goto L_0x0061
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x007d
            return r5
        L_0x007a:
            if (r0 == 0) goto L_0x007d
            return r5
        L_0x007d:
            int r1 = r7.A00
            int r0 = r8.A00
            if (r1 == r0) goto L_0x0084
            return r5
        L_0x0084:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9XS.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        int A0J = AnonymousClass000.A0J(this.A07) * 31;
        int A002 = C36321k7.A00(this.A02, (((((C36351kA.A05(this.A05, A0J) + AnonymousClass000.A0J(this.A04)) * 31) + AnonymousClass000.A0J(this.A06)) * 31) + AnonymousClass000.A0J(this.A03)) * 31);
        byte[] bArr = this.A08;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        } else {
            i = 0;
        }
        int i3 = (((A002 + i) * 31) + this.A01) * 31;
        byte[] bArr2 = this.A09;
        if (bArr2 != null) {
            i2 = Arrays.hashCode(bArr2);
        }
        return ((i3 + i2) * 31) + this.A00;
    }

    public AnonymousClass9XS(Jid jid, Jid jid2, C64933Qa r3, C64933Qa r4, Long l, byte[] bArr, byte[] bArr2, int i, int i2, long j) {
        this.A07 = l;
        this.A05 = r3;
        this.A04 = jid;
        this.A06 = r4;
        this.A03 = jid2;
        this.A02 = j;
        this.A08 = bArr;
        this.A01 = i;
        this.A09 = bArr2;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MessageOrphan(rowId=");
        A0u.append(this.A07);
        A0u.append(", key=");
        A0u.append(this.A05);
        A0u.append(", senderJid=");
        A0u.append(this.A04);
        A0u.append(", parentMessageKey=");
        A0u.append(this.A06);
        A0u.append(", parentMessageSenderJid=");
        A0u.append(this.A03);
        A0u.append(", timestamp=");
        A0u.append(this.A02);
        A0u.append(", orphanMessageData=");
        C90474aD.A1O(A0u, this.A08);
        A0u.append(", orphanMessageType=");
        A0u.append(this.A01);
        A0u.append(", orphanMessageStanzaData=");
        C90474aD.A1O(A0u, this.A09);
        A0u.append(", orphanMessageReason=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
