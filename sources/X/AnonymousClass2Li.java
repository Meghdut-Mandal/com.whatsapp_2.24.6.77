package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.2Li  reason: invalid class name */
public class AnonymousClass2Li extends C201669k5 {
    public final boolean A00;

    public String A07() {
        return "time_format";
    }

    public AnonymousClass2Li(C201539jo r10, String str, long j, boolean z) {
        super(C199769fw.A03, r10, str, "regular_low", 7, j, false);
        this.A00 = z;
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8NN A0p = AnonymousClass8OQ.DEFAULT_INSTANCE.A0p();
        boolean z = this.A00;
        A0p.A0S();
        AnonymousClass8OQ r1 = (AnonymousClass8OQ) A0p.A00;
        r1.bitField0_ |= 1;
        r1.isTwentyFourHourFormatEnabled_ = z;
        AnonymousClass8LN A04 = super.A04();
        C18740tg.A06(A04);
        A04.A0S();
        AnonymousClass8SS r2 = (AnonymousClass8SS) A04.A00;
        AnonymousClass8OQ r12 = (AnonymousClass8OQ) A0p.A0R();
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        r2.timeFormatAction_ = r12;
        r2.bitField0_ |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
        return A04;
    }

    public String[] A0A() {
        return new String[]{"time_format"};
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TimeFormatMutation{rowId=");
        A0u.append(this.A07);
        A0u.append(", is24HourFormat=");
        A0u.append(this.A00);
        A0u.append(", timestamp=");
        A0u.append(this.A04);
        C36361kB.A1G(this, A0u);
        return AnonymousClass000.A0s(A0u);
    }
}
