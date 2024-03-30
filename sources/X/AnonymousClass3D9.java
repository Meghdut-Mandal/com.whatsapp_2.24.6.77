package X;

/* renamed from: X.3D9  reason: invalid class name */
public class AnonymousClass3D9 {
    public final AnonymousClass163 A00;
    public final AnonymousClass12P A01;

    public int A00(C02680Bk r7, AnonymousClass11F r8) {
        C36721lC A0B;
        AnonymousClass1M0 A04 = this.A01.get();
        try {
            C224114e r5 = A04.A02;
            String[] A1R = C36441kJ.A1R();
            A1R[0] = String.valueOf(this.A00.A08(r8));
            A0B = r5.A0B(r7, "SELECT COUNT(*) as count FROM available_message_view WHERE message_type IN ('9', '26' ) AND origin != 7 AND chat_row_id = ?", "GET_DOCUMENT_MESSAGES_COUNT", A1R);
            if (A0B.moveToFirst()) {
                int i = A0B.getInt(A0B.getColumnIndexOrThrow("count"));
                A0B.close();
                A04.close();
                return i;
            }
            A0B.close();
            A04.close();
            return 0;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass3D9(AnonymousClass163 r1, AnonymousClass12P r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
