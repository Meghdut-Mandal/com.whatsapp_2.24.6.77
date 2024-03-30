package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass040;
import X.AnonymousClass08S;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C005102h;
import X.C007403e;
import X.C007703h;
import X.C008803t;
import X.C009003v;
import X.C009403z;
import X.C023109s;
import X.C023509x;
import X.C36391kE;
import X.C36401kF;
import X.C607539f;
import X.C82533yr;
import X.C830747z;
import java.util.concurrent.CancellationException;

public final class CoroutineLiveData extends AnonymousClass08S {
    public C607539f A00;

    public final AnonymousClass0AJ A0G(C023509x r5) {
        C82533yr r3;
        int i;
        if (r5 instanceof C82533yr) {
            r3 = (C82533yr) r5;
            int i2 = r3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r3.label = i2 - Integer.MIN_VALUE;
                Object obj = r3.result;
                i = r3.label;
                if (i != 0 || i == 1) {
                    AnonymousClass0AN.A00(obj);
                    return AnonymousClass0AJ.A00;
                }
                throw AnonymousClass000.A0e();
            }
        }
        r3 = new C82533yr(this, r5);
        Object obj2 = r3.result;
        i = r3.label;
        if (i != 0) {
        }
        AnonymousClass0AN.A00(obj2);
        return AnonymousClass0AJ.A00;
    }

    public CoroutineLiveData(C005102h r4, C009003v r5) {
        this.A00 = new C607539f(this, new C830747z(this), r5, C009403z.A02(C008803t.A02(C36401kF.A0y(), r4).plus(new C007703h((C007403e) r4.get(C007403e.A00)))));
    }

    public void A05() {
        super.A05();
        C607539f r3 = this.A00;
        if (r3 != null) {
            C007403e r0 = r3.A00;
            if (r0 != null) {
                r0.B2S((CancellationException) null);
            }
            r3.A00 = null;
            if (r3.A01 == null) {
                r3.A01 = C36391kE.A12(new BlockRunner$maybeRun$1(r3, (C023509x) null), r3.A05);
            }
        }
    }

    public void A06() {
        super.A06();
        C607539f r4 = this.A00;
        if (r4 == null) {
            return;
        }
        if (r4.A00 == null) {
            AnonymousClass040 r3 = r4.A05;
            r4.A00 = AnonymousClass0A2.A02(C023109s.A00, C36401kF.A0y(), new BlockRunner$cancel$1(r4, (C023509x) null), r3);
            return;
        }
        throw AnonymousClass001.A09("Cancel call cannot happen without a maybeRun");
    }
}
