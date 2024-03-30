package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.AAe  reason: case insensitive filesystem */
public final class C21144AAe implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("status_crossposting_v3_state_idx", "CREATE INDEX IF NOT EXISTS status_crossposting_v3_state_idx ON status_crossposting_v3 (state)");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] r3 = new C64563Om[7];
        A01.A02 = "status_message_row_id";
        C52502pX r2 = C52502pX.INTEGER;
        A01.A00 = r2;
        C63573Ko.A0e(A01, r3, 0);
        C52502pX A0T = C165607th.A0T(A01, "crossposting_session_id", r3);
        C63573Ko.A08(A01, A0T, "crossposting_status_unique_id", r3);
        C63573Ko.A09(A01, r2, "state", r3);
        C63573Ko.A0A(A01, A0T, "media_file_path", r3);
        C63573Ko.A0B(A01, A0T, "direct_url_path", r3);
        C63573Ko.A0C(A01, r2, "destination", r3);
        List asList = Arrays.asList(r3);
        AnonymousClass00C.A08(asList);
        r7.A0A("status_crossposting_v3", asList, Collections.singletonList("PRIMARY KEY (status_message_row_id, destination)"));
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        AnonymousClass00C.A0D(r6, 0);
        C63843Lq.A03(r6, "message", "status_crossposting_v3", "status_message_row_id=old._id");
    }
}
