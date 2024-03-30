package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.8Y5  reason: invalid class name */
public class AnonymousClass8Y5 extends AnonymousClass1LZ {
    public final C21100yf A00;
    public final C19970wo A01;

    public String A0B() {
        return "regular_low";
    }

    public String A0C() {
        return "android_unsupported_actions";
    }

    public /* bridge */ /* synthetic */ void A0E(C201669k5 r2) {
        A09(r2, (C201669k5) null);
    }

    public C201669k5 A0A(C202599mH r12, String str, boolean z) {
        String[] strArr = r12.A06;
        C199769fw r3 = r12.A01;
        AnonymousClass8SS r2 = r12.A03;
        if (strArr.length != 1 || !"android_unsupported_actions".equals(C165617ti.A0a(strArr)) || !C199769fw.A03.equals(r3) || r2 == null || !C165577te.A1W(r2.bitField0_) || (r2.bitField0_ & 1048576) == 0) {
            return null;
        }
        AnonymousClass8O4 r0 = r2.androidUnsupportedActions_;
        if (r0 == null) {
            r0 = AnonymousClass8O4.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 1) == 0) {
            return null;
        }
        return new C175968bM(r12.A02, str, r2.timestamp_, z);
    }

    public List A0D(boolean z) {
        return Collections.singletonList(new C175968bM((C201539jo) null, (String) null, C19970wo.A00(this.A01), false));
    }

    public boolean A0H() {
        return this.A00.A09(C21100yf.A0W);
    }

    public AnonymousClass8Y5(C21100yf r1, C19970wo r2, AnonymousClass1AC r3) {
        super(r3);
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r1) {
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r1, C201669k5 r2) {
        A09(r1, r2);
    }
}
