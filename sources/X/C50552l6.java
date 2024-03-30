package X;

import java.util.ArrayList;

/* renamed from: X.2l6  reason: invalid class name and case insensitive filesystem */
public final class C50552l6 extends C592133b {
    public static final ArrayList A00 = C36351kA.A10(new String[]{"biz_profile", "broadcast_list_context_menu", "catalog_link", "click_to_chat_link", "contact_card", "contact_search", "ctwa", "global_search_new_chat", "group_participant_list", "message_short_link", "other_qbm", "otp_qbm", "phone_number_hyperlink", "product_link", "promotional_qbm", "qr_code", "status", "transactional_qbm", "unknown"});
    public static final ArrayList A01 = C36351kA.A10(new String[]{"false", "none", "true"});
    public static final ArrayList A02 = C36351kA.A10(new String[]{"inappropriate", "none", "spam"});

    public C50552l6(Long l, String str, String str2) {
        AnonymousClass6QB A0q = C36441kJ.A0q("biz_opt_out");
        Long l2 = l;
        if (l != null && C203539oF.A0L(l2, 0, 9007199254740991L, true)) {
            C36411kG.A1K(A0q, "business_discovery_timestamp", l.longValue());
        }
        String str3 = str;
        if (str != null && C203539oF.A0P(str3, 0, 9007199254740991L, true)) {
            C36331k8.A1D(A0q, "business_discovery_id", str);
        }
        AnonymousClass00C.A0D(A02, 2);
        A0q.A08(str2, "business_discovery_entry_point", A00);
        AnonymousClass00C.A0D(A01, 2);
        C592133b.A00(A0q, this);
    }
}
