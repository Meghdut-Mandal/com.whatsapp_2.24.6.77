package X;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.3jF  reason: invalid class name and case insensitive filesystem */
public class C72973jF implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        C63843Lq.A02(r5, "message_system", "message_system_sibling_group_link_change");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] A0q = C63573Ko.A0q(A00);
        C52502pX r3 = C52502pX.INTEGER;
        A00.A00 = r3;
        C63573Ko.A0b(A00, A0q);
        A00.A02 = "subgroup_raw_jid";
        C52502pX r1 = C52502pX.TEXT;
        C63573Ko.A0W(A00, r1, A0q, true);
        C63573Ko.A0S(A00, r1, "subgroup_subject", A0q, true);
        C63573Ko.A09(A00, r3, "parent_group_jid_row_id", A0q);
        r8.A0A("message_system_sibling_group_link_change", Arrays.asList(A0q), Collections.singletonList("PRIMARY KEY (message_row_id, subgroup_raw_jid)"));
    }
}
