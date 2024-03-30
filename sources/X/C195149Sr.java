package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendRetryReceiptJob;

/* renamed from: X.9Sr  reason: invalid class name and case insensitive filesystem */
public final class C195149Sr {
    public final C30571aQ A00;
    public final int A01;
    public final C20300xL A02;
    public final AnonymousClass164 A03;
    public final AnonymousClass1C7 A04;
    public final C231417i A05;
    public final C30831aq A06;
    public final C23084B3s A07;
    public final C121865tq A08;
    public final C121865tq A09;
    public final boolean A0A;
    public final byte[] A0B;
    public final byte[] A0C;

    public C195149Sr(C20300xL r2, AnonymousClass164 r3, AnonymousClass189 r4, AnonymousClass1C7 r5, C231417i r6, C30571aQ r7, C30831aq r8, C23084B3s b3s, C121865tq r10, C121865tq r11, byte[] bArr, byte[] bArr2, boolean z) {
        this.A06 = r8;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r5;
        this.A00 = r7;
        this.A07 = b3s;
        this.A01 = r4.A04();
        this.A05 = r6;
        this.A0C = bArr;
        this.A09 = r10;
        this.A08 = r11;
        this.A0B = bArr2;
        this.A0A = z;
    }

    public void A00(int i) {
        AnonymousClass1C7 r4;
        int i2;
        C52772q9 r2;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("need to send retry receipt; message.key=");
        C23084B3s b3s = this.A07;
        A0u.append(b3s.BE4());
        A0u.append(" participant = ");
        C36321k7.A1N(b3s.BFE(), A0u);
        b3s.BsC(true);
        int i3 = this.A01;
        byte[] A022 = C203239na.A02(i3);
        if (b3s.BGp() > 1) {
            this.A02.A06();
        }
        if (b3s instanceof C21337AHp) {
            C21337AHp aHp = (C21337AHp) b3s;
            AnonymousClass3QO A052 = this.A05.A05(b3s.BHK());
            if (A052 != null) {
                if (A052.A00 == 1) {
                    r2 = C52772q9.HOSTED;
                } else {
                    r2 = C52772q9.E2EE;
                }
                if (r2 == C52772q9.HOSTED) {
                    aHp.A03 = 134217728 | aHp.A03;
                }
            }
            int i4 = aHp.A01;
            if (i4 == 0) {
                if (aHp.A00 == 0) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("recording local placeholder for retry receipt; message.key=");
                    C36321k7.A1a(A0u2, C21337AHp.A00(aHp).toString());
                    r4 = this.A04;
                    i2 = 14;
                }
            } else if (i4 == 2) {
                r4 = this.A04;
                i2 = 15;
            }
            r4.A01(new C1502074j(this, aHp, i2), 50);
        }
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append(C165607th.A0g(b3s, "axolotl sending retry receipt; message.key=", A0u3));
        C36321k7.A1T("; localRegistrationId=", A0u3, i3);
        int i5 = i;
        if (!this.A0A) {
            C30831aq r0 = this.A06;
            Jid BGc = b3s.BGc();
            String id = b3s.getId();
            Jid BFE = b3s.BFE();
            UserJid BGZ = b3s.BGZ();
            long BIM = b3s.BIM();
            int BGp = b3s.BGp() + 1;
            byte[] bArr = this.A0C;
            C121865tq r8 = this.A09;
            C121865tq r9 = this.A08;
            byte[] bArr2 = this.A0B;
            long BDf = b3s.BDf();
            String B9T = b3s.B9T();
            if (r0.A01.A06) {
                C194079Oa r42 = new C194079Oa(BGc, BFE, BGZ, r8, r9, id, B9T, A022, bArr, bArr2, (byte) 5, BGp, i5, BIM, BDf);
                C20810yC r6 = r0.A02;
                C19700wN r5 = r0.A00;
                if (!(r6 == null || r5 == null)) {
                    C203429o0.A0B(r5, r6, "message", "retry-receipt", r42.A0B, r42.A03, true);
                }
                Message obtain = Message.obtain((Handler) null, 0, 11, 0, r42);
                r0.A00(r42);
                r0.A03.A0J(obtain);
                return;
            }
            return;
        }
        this.A03.A01(new SendRetryReceiptJob(b3s, i3, i5));
    }
}
