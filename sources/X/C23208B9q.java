package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob;

/* renamed from: X.B9q  reason: case insensitive filesystem */
public class C23208B9q implements C25711Hj {
    public Object A00;
    public Object A01;
    public final int A02;

    public C23208B9q(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void accept(Object obj) {
        C65013Qj r0;
        byte[] bArr;
        int i = this.A02;
        Object obj2 = this.A00;
        if (i != 0) {
            AnonymousClass1YH r4 = (AnonymousClass1YH) obj2;
            r4.A0A.A09(new C23175B8j(r4, this.A01, 0));
            return;
        }
        AnonymousClass1ST r42 = (AnonymousClass1ST) obj2;
        AnonymousClass2bU r5 = (AnonymousClass2bU) this.A01;
        C64933Qa r3 = r5.A1J;
        r42.A09.A01((C06120Sj) null, r3, 11);
        C19730wQ r2 = r42.A05;
        boolean A0L = r2.A0L();
        AnonymousClass1C4 r1 = r42.A0J;
        if (A0L) {
            PhoneUserJid A0e = C36371kC.A0e(r2);
            if (!(r3.A00 instanceof C177548dy) && (r0 = r5.A01) != null && (bArr = r0.A0a) != null) {
                AnonymousClass164 r22 = r1.A00;
                C18740tg.A06(r0);
                C18740tg.A06(bArr);
                r22.A01(new SendMediaErrorReceiptJob(A0e, r5, (String) null, bArr));
                return;
            }
            return;
        }
        r1.A02(r5);
    }
}
