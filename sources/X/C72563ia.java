package X;

/* renamed from: X.3ia  reason: invalid class name and case insensitive filesystem */
public class C72563ia implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        C63843Lq.A01(r4, "message_location");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r4 = new C64563Om[13];
        C52502pX A02 = C52502pX.A02(A00);
        C63573Ko.A0Q(A00, A02, "chat_row_id", r4, C63573Ko.A0i(A00, A02, r4) ? 1 : 0);
        A00.A02 = "latitude";
        C52502pX r2 = C52502pX.REAL;
        C63573Ko.A0T(A00, r2, r4);
        C63573Ko.A09(A00, r2, "longitude", r4);
        A00.A02 = "place_name";
        C52502pX r1 = C52502pX.TEXT;
        A00.A00 = r1;
        C63573Ko.A0c(A00, r4);
        C63573Ko.A0B(A00, r1, "place_address", r4);
        C63573Ko.A0C(A00, r1, "url", r4);
        C63573Ko.A0D(A00, A02, "live_location_share_duration", r4);
        C63573Ko.A0E(A00, A02, "live_location_sequence_number", r4);
        C63573Ko.A0F(A00, r2, "live_location_final_latitude", r4);
        C63573Ko.A0G(A00, r2, "live_location_final_longitude", r4);
        C63573Ko.A0H(A00, A02, "live_location_final_timestamp", r4);
        C63573Ko.A0I(A00, A02, "map_download_status", r4);
        r8.A0B("message_location", r4);
    }
}
