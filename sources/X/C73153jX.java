package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3jX  reason: invalid class name and case insensitive filesystem */
public final class C73153jX implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("newsletter_membership_index", "CREATE INDEX IF NOT EXISTS newsletter_membership_index ON newsletter (membership)");
        r5.A07("newsletter_code_index", "CREATE INDEX IF NOT EXISTS newsletter_code_index ON newsletter (invite_code)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        AnonymousClass00C.A0D(r6, 0);
        C63843Lq.A04(r6, "chat", "newsletter", "chat_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r8, C65063Qo r9) {
        C63573Ko A01 = C63573Ko.A01(r9);
        C64563Om[] r2 = new C64563Om[25];
        A01.A02 = "chat_row_id";
        C52502pX r3 = C52502pX.INTEGER;
        boolean A0h = C63573Ko.A0h(A01, r3, r2);
        A01.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        C52502pX r5 = C52502pX.TEXT;
        C63573Ko.A0W(A01, r5, r2, A0h);
        C63573Ko.A0S(A01, r3, "name_id", r2, A0h);
        A01.A02 = "description";
        C63573Ko.A0Z(A01, r5, r2, A0h);
        C63573Ko.A06(A01, r3, "description_id", A0h);
        C63573Ko.A0c(A01, r2);
        C63573Ko.A0B(A01, r5, "picture_url", r2);
        C63573Ko.A06(A01, r3, "picture_id", A0h);
        A01.A04 = A0h;
        r2[6] = A01.A0r();
        C63573Ko.A0D(A01, r5, "preview_url", r2);
        r2[8] = C63573Ko.A05(A01, r3, "preview_id", A0h);
        C63573Ko.A0F(A01, r5, "invite_code", r2);
        C63573Ko.A0G(A01, r5, "handle", r2);
        r2[11] = C63573Ko.A05(A01, r3, "subscribers_count", A0h);
        r2[12] = C63573Ko.A05(A01, r3, "membership", A0h);
        r2[13] = C63573Ko.A05(A01, r3, "privacy", A0h);
        r2[14] = C63573Ko.A05(A01, r3, "verified", A0h);
        r2[15] = C63573Ko.A05(A01, r3, "muted", A0h);
        r2[16] = C63573Ko.A05(A01, r3, "oldest_message_retrieved", A0h);
        C63573Ko.A06(A01, r3, "suspended", A0h);
        A01.A01 = "0";
        r2[17] = A01.A0r();
        C63573Ko.A06(A01, r3, "deleted", A0h);
        A01.A01 = "0";
        r2[18] = A01.A0r();
        C63573Ko.A0P(A01, r3, "show_enforced_update_banner", r2);
        r2[20] = C63573Ko.A02(A01, r3, "reaction_setting");
        A01.A02 = "reaction_setting_blocklist";
        A01.A00 = C52502pX.STRING;
        r2[21] = A01.A0r();
        r2[22] = C63573Ko.A02(A01, r3, "reaction_setting_update_ts");
        r2[23] = C63573Ko.A02(A01, r3, "verification_source");
        r2[24] = C63573Ko.A02(A01, r3, "admin_count");
        r9.A0B("newsletter", r2);
    }
}
