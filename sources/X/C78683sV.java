package X;

/* renamed from: X.3sV  reason: invalid class name and case insensitive filesystem */
public final class C78683sV implements C17820s5 {
    public final AnonymousClass005 A00;

    public C78683sV(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BmI(AnonymousClass3T1 r5, C52942qQ r6) {
        AnonymousClass00C.A0D(r5, 0);
        if (r5.A1R(8)) {
            AnonymousClass1F3.A05((AnonymousClass1F3) this.A00.get(), r5, "SELECT element_type, element_content FROM message_ui_elements WHERE message_row_id = ?", r5.A1N);
            if (r6 != null) {
                throw C36321k7.A04(C78683sV.class);
            }
        }
    }
}
