package X;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.3jI  reason: invalid class name and case insensitive filesystem */
public class C73003jI implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        C63843Lq.A02(r5, "message_system", "message_system_with_group_nodes");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[5];
        C52502pX A02 = C52502pX.A02(A00);
        A00.A00 = A02;
        C63573Ko.A0b(A00, r3);
        C63573Ko.A0R(A00, A02, "group_jid_row_id", r3, true);
        C63573Ko.A0S(A00, A02, "group_node_type", r3, true);
        A00.A02 = "group_subject";
        C63573Ko.A0U(A00, C52502pX.TEXT, r3);
        C63573Ko.A0A(A00, A02, "version", r3);
        r7.A0A("message_system_with_group_nodes", Arrays.asList(r3), Collections.singletonList("PRIMARY KEY (message_row_id, group_jid_row_id, group_node_type)"));
    }
}
