package X;

/* renamed from: X.3jB  reason: invalid class name and case insensitive filesystem */
public class C72933jB implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        C63843Lq.A02(r5, "message_system", "message_system_photo_change");
    }

    public void B7q(AnonymousClass38H r5, C65063Qo r6) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0q = C63573Ko.A0q(A00);
        boolean A0i = C63573Ko.A0i(A00, C52502pX.INTEGER, A0q);
        A00.A02 = "new_photo_id";
        C63573Ko.A0V(A00, C52502pX.TEXT, A0q, A0i ? 1 : 0);
        A00.A02 = "old_photo";
        C52502pX r1 = C52502pX.BLOB;
        C63573Ko.A0T(A00, r1, A0q);
        C63573Ko.A09(A00, r1, "new_photo", A0q);
        r6.A0B("message_system_photo_change", A0q);
    }
}
