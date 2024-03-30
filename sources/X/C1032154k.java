package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.54k  reason: invalid class name and case insensitive filesystem */
public class C1032154k extends C201669k5 {
    public final String A00;

    public String A07() {
        return "setting_locale";
    }

    public C1032154k(C201539jo r10, String str, String str2, long j) {
        super(C199769fw.A03, r10, str, "critical_block", 3, j, false);
        this.A00 = str2;
    }

    public String[] A0A() {
        return new String[]{"setting_locale"};
    }

    public AnonymousClass8LN A04() {
        AnonymousClass8LN A04 = super.A04();
        C18740tg.A06(A04);
        AnonymousClass8NN A0p = C99814u0.DEFAULT_INSTANCE.A0p();
        String str = this.A00;
        C99814u0 r1 = (C99814u0) C90524aI.A0H(A0p);
        str.getClass();
        r1.bitField0_ |= 1;
        r1.locale_ = str;
        AnonymousClass8SS r2 = (AnonymousClass8SS) C90524aI.A0H(A04);
        C99814u0 r12 = (C99814u0) A0p.A0R();
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        r2.localeSetting_ = r12;
        r2.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        return A04;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LocaleSyncMutation{rowId=");
        A0u.append(this.A07);
        A0u.append(", locale=");
        A0u.append(this.A00);
        A0u.append(", timestamp=");
        A0u.append(this.A04);
        A0u.append(", operation=");
        A0u.append(this.A05);
        A0u.append(", collectionName=");
        A0u.append(this.A06);
        A0u.append(", keyId=");
        return C90464aC.A0X(this.A00, A0u);
    }
}
