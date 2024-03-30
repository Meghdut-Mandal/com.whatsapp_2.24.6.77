package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.3so  reason: invalid class name and case insensitive filesystem */
public final class C78873so implements AnonymousClass4S6 {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    public void BmK(AnonymousClass3T1 r4, C52942qQ r5, int i) {
        AnonymousClass00C.A0D(r4, 0);
        if (i == 6 && AnonymousClass000.A1S(r4.A0A & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING, EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING)) {
            ((C24561Cx) this.A01.get()).A03(r4);
            ((AnonymousClass1FZ) this.A00.get()).A02(r4, false);
            if (r5 != null) {
                throw C36321k7.A04(C78873so.class);
            }
        }
    }

    public C78873so(AnonymousClass005 r1, AnonymousClass005 r2) {
        C36321k7.A0x(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
