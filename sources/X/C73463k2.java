package X;

/* renamed from: X.3k2  reason: invalid class name and case insensitive filesystem */
public class C73463k2 implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        r6.A08("suggest_as_you_type_delete_oldest_trigger", "CREATE TRIGGER IF NOT EXISTS suggest_as_you_type_delete_oldest_trigger BEFORE INSERT ON suggest_as_you_type FOR EACH ROW WHEN (SELECT COUNT(*) FROM suggest_as_you_type ) > 2000 BEGIN DELETE FROM suggest_as_you_type WHERE message_row_id = (SELECT MIN(message_row_id) FROM suggest_as_you_type); END;");
        C63843Lq.A03(r6, "message", "suggest_as_you_type", "message_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r4, C65063Qo r5) {
        C63573Ko A00 = C63573Ko.A00();
        A00.A00 = C52502pX.A02(A00);
        A00.A05 = true;
        r5.A0B("suggest_as_you_type", A00.A0r());
    }
}
