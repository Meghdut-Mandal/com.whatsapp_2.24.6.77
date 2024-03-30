package X;

/* renamed from: X.AAa  reason: case insensitive filesystem */
public class C21140AAa implements AnonymousClass15z {
    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko r5 = new C63573Ko();
        C64563Om[] r4 = new C64563Om[5];
        C52502pX A0C = C165567td.A0C(r5, "message_row_id", r4);
        r5.A02 = "amount";
        C52502pX r2 = C52502pX.TEXT;
        r5.A00 = r2;
        r5.A04 = true;
        C63573Ko.A0e(r5, r4, 1);
        r5.A02 = "note";
        C63573Ko.A0Y(r5, r2, r4, true);
        C63573Ko.A09(r5, A0C, "status", r4);
        r5.A02 = "attachment_jpeg_thumbnail";
        r5.A00 = C52502pX.BLOB;
        r4[4] = r5.A0r();
        r8.A0B("message_quote_invoice", r4);
    }

    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }
}
