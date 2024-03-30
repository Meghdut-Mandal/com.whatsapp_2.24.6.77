package X;

/* renamed from: X.3kO  reason: invalid class name and case insensitive filesystem */
public class C73683kO implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("group_add_black_list_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_add_black_list_jid_index ON wa_group_add_black_list (jid)");
    }

    public void B7q(AnonymousClass38H r3, C65063Qo r4) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A03 = C52502pX.A03(A00);
        C63573Ko.A0b(A00, A03);
        r4.A0B("wa_group_add_black_list", A03);
    }
}
