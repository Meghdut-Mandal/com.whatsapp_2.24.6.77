package X;

import com.whatsapp.jid.Jid;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6uy  reason: invalid class name and case insensitive filesystem */
public final class C146066uy implements B14 {
    public final AnonymousClass005 A00;

    public C146066uy(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void Bd4(C1275768v r1, AnonymousClass8SU r2, AnonymousClass3T1 r3) {
    }

    public void Bd3(AnonymousClass6CO r10, AnonymousClass8NK r11, AnonymousClass3T1 r12) {
        C36321k7.A0w(r12, r11);
        Set entrySet = ((AnonymousClass1QO) this.A00.get()).A00(r12).A00.entrySet();
        AnonymousClass00C.A08(entrySet);
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(it);
            AnonymousClass3Q6 r6 = (AnonymousClass3Q6) A11.getValue();
            AnonymousClass8NN A0p = C100034uM.DEFAULT_INSTANCE.A0p();
            String rawString = ((Jid) A11.getKey()).getRawString();
            C100034uM r1 = (C100034uM) C90524aI.A0H(A0p);
            rawString.getClass();
            r1.bitField0_ |= 1;
            r1.userJid_ = rawString;
            long j = (long) 1000;
            C100034uM r3 = (C100034uM) C90524aI.A0H(A0p);
            r3.bitField0_ |= 2;
            r3.receiptTimestamp_ = r6.A00 / j;
            C100034uM r32 = (C100034uM) C90524aI.A0H(A0p);
            r32.bitField0_ |= 4;
            r32.readTimestamp_ = r6.A02 / j;
            C100034uM r13 = (C100034uM) C90524aI.A0H(A0p);
            r13.bitField0_ |= 8;
            r13.playedTimestamp_ = r6.A01 / j;
            AnonymousClass8SU r33 = (AnonymousClass8SU) C90524aI.A0H(r11);
            C170918Hz A0R = A0p.A0R();
            AnonymousClass8SU r0 = AnonymousClass8SU.DEFAULT_INSTANCE;
            A0R.getClass();
            C23122B6c b6c = r33.userReceipt_;
            if (!((C21886AcE) b6c).A00) {
                b6c = C170918Hz.A0A(b6c);
                r33.userReceipt_ = b6c;
            }
            b6c.add(A0R);
        }
    }
}
