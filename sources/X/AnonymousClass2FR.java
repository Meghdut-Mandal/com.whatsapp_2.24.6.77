package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2FR  reason: invalid class name */
public class AnonymousClass2FR extends AnonymousClass1LZ {
    public final C19730wQ A00;
    public final C19970wo A01;
    public final C18820ts A02;

    public String A0B() {
        return "regular_low";
    }

    public String A0C() {
        return "time_format";
    }

    public boolean A0H() {
        return true;
    }

    public C201669k5 A0A(C202599mH r12, String str, boolean z) {
        String[] strArr = r12.A06;
        C199769fw r3 = r12.A01;
        AnonymousClass8SS r2 = r12.A03;
        if (strArr.length != 1 || !"time_format".equals(strArr[0]) || !C199769fw.A03.equals(r3) || r2 == null || !r2.A0u() || (r2.bitField0_ & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 0) {
            return null;
        }
        AnonymousClass8OQ r0 = r2.timeFormatAction_;
        AnonymousClass8OQ r1 = r0;
        if (r0 == null) {
            r0 = AnonymousClass8OQ.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 1) == 0) {
            return null;
        }
        if (r1 == null) {
            r1 = AnonymousClass8OQ.DEFAULT_INSTANCE;
        }
        boolean z2 = r1.isTwentyFourHourFormatEnabled_;
        return new AnonymousClass2Li(r12.A02, str, r2.timestamp_, z2);
    }

    public List A0D(boolean z) {
        C18740tg.A0C(C36441kJ.A1J(this.A00));
        return Collections.singletonList(new AnonymousClass2Li((C201539jo) null, (String) null, C19970wo.A00(this.A01), C18820ts.A00(this.A02).A00));
    }

    public /* bridge */ /* synthetic */ void A0E(C201669k5 r3) {
        C18740tg.A0D(false, "Android shouldn't process TimeFormatMutation with dependencies missing");
        A05(r3);
    }

    public AnonymousClass2FR(C19730wQ r1, C19970wo r2, C18820ts r3, AnonymousClass1AC r4) {
        super(r4);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r1) {
        A06(r1);
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r1, C201669k5 r2) {
        A07(r1);
    }
}
