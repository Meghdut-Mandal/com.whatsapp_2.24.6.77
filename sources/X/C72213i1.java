package X;

/* renamed from: X.3i1  reason: invalid class name and case insensitive filesystem */
public class C72213i1 implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("deleted_chat_job_index", "CREATE INDEX IF NOT EXISTS deleted_chat_job_index ON deleted_chat_job (chat_row_id, _id)");
    }

    public void B7q(AnonymousClass38H r8, C65063Qo r9) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r4 = new C64563Om[12];
        C52502pX A01 = C52502pX.A01(A00);
        C63573Ko.A0R(A00, A01, "chat_row_id", r4, C63573Ko.A0g(A00, A01, r4));
        C63573Ko.A08(A00, A01, "block_size", r4);
        A00.A02 = "singular_message_delete_rows_id";
        C52502pX r3 = C52502pX.TEXT;
        C63573Ko.A0U(A00, r3, r4);
        C63573Ko.A0A(A00, A01, "deleted_message_row_id", r4);
        C63573Ko.A0B(A00, A01, "deleted_starred_message_row_id", r4);
        A00.A02 = "deleted_messages_remove_files";
        C52502pX r2 = C52502pX.BOOLEAN;
        A00.A00 = r2;
        r4[6] = A00.A0r();
        C63573Ko.A0D(A00, A01, "deleted_categories_message_row_id", r4);
        C63573Ko.A0E(A00, A01, "deleted_categories_starred_message_row_id", r4);
        C63573Ko.A0F(A00, r2, "deleted_categories_remove_files", r4);
        C63573Ko.A0G(A00, r3, "deleted_message_categories", r4);
        C63573Ko.A0H(A00, r2, "delete_files_singular_delete", r4);
        r9.A0B("deleted_chat_job", r4);
    }
}
