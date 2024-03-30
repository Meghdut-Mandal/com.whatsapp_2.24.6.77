package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.8bK  reason: invalid class name and case insensitive filesystem */
public final class C175948bK extends C201669k5 {
    public final int A00;
    public final Set A01;

    public C175948bK(C199769fw r10, C201539jo r11, String str, Set set, int i, long j) {
        super(r10, r11, str, "regular_high", 7, j, false);
        this.A00 = i;
        this.A01 = set;
    }

    public AnonymousClass8LN A04() {
        AnonymousClass90h r0;
        int i = this.A00;
        if (i == 3) {
            Log.e("StatusPrivacySyncMutation invalid status setting");
            return super.A04();
        }
        AnonymousClass8NN A0p = AnonymousClass8PR.DEFAULT_INSTANCE.A0p();
        if (i == 1) {
            r0 = AnonymousClass90h.ALLOW_LIST;
        } else if (i != 2) {
            r0 = AnonymousClass90h.CONTACTS;
        } else {
            r0 = AnonymousClass90h.DENY_LIST;
        }
        AnonymousClass8PR r1 = (AnonymousClass8PR) C90524aI.A0H(A0p);
        r1.mode_ = r0.value;
        r1.bitField0_ |= 1;
        for (Jid A0K : this.A01) {
            String A0K2 = AnonymousClass8NN.A0K(A0p, A0K);
            AnonymousClass8PR r2 = (AnonymousClass8PR) A0p.A00;
            A0K2.getClass();
            C23122B6c b6c = r2.userJid_;
            if (!((C21886AcE) b6c).A00) {
                b6c = C170918Hz.A0A(b6c);
                r2.userJid_ = b6c;
            }
            b6c.add(A0K2);
        }
        AnonymousClass8PR r22 = (AnonymousClass8PR) A0p.A0R();
        AnonymousClass8LN A04 = super.A04();
        if (A04 == null) {
            return null;
        }
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(A04);
        int i2 = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r22.getClass();
        A0H.statusPrivacy_ = r22;
        A0H.bitField1_ |= 64;
        return A04;
    }
}
