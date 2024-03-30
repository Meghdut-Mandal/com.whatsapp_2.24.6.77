package X;

import java.util.List;

/* renamed from: X.8bN  reason: invalid class name and case insensitive filesystem */
public class C175978bN extends C201669k5 {
    public final List A00;

    public C175978bN(C201539jo r10, String str, List list, long j) {
        super(C199769fw.A03, r10, str, "regular", 7, j, false);
        this.A00 = list;
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8LN A04 = super.A04();
        C18740tg.A06(A04);
        AnonymousClass8NN A0p = C172228Na.DEFAULT_INSTANCE.A0p();
        List list = this.A00;
        C172228Na r2 = (C172228Na) C90524aI.A0H(A0p);
        C23122B6c b6c = r2.flags_;
        if (!((C21886AcE) b6c).A00) {
            b6c = C170918Hz.A0A(b6c);
            r2.flags_ = b6c;
        }
        C21071A7i.A0O(list, b6c);
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(A04);
        C172228Na r1 = (C172228Na) A0p.A0R();
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r1.getClass();
        A0H.primaryFeature_ = r1;
        A0H.bitField0_ |= 524288;
        return A04;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PrimaryFeatureMutation{");
        A0u.append("featureFlags=");
        A0u.append(this.A00);
        C201669k5.A01(this, ", rowId='", A0u);
        C201669k5.A03(this, A0u);
        A0u.append(", operation=");
        A0u.append(this.A05);
        A0u.append(", collectionName='");
        A0u.append(this.A06);
        A0u.append(", version=");
        A0u.append(this.A03);
        A0u.append(", keyId=");
        return C90464aC.A0X(this.A00, A0u);
    }
}
