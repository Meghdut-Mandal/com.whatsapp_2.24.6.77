package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.3s2  reason: invalid class name and case insensitive filesystem */
public final class C78393s2 implements C17810s4 {
    public final AnonymousClass005 A00;

    public C78393s2(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BmI(AnonymousClass3T1 r5, C52942qQ r6) {
        AnonymousClass00C.A0D(r5, 0);
        AnonymousClass3L1 r3 = r5.A0a;
        if (AnonymousClass000.A1S(r5.A0A & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) && r3 != null && r3.A07 == null) {
            ((C29671Xn) this.A00.get()).A00(r3, r5.A1N);
            if (r6 != null) {
                throw C36321k7.A04(C78393s2.class);
            }
        }
    }
}
