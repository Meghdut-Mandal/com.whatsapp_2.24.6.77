package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3jR  reason: invalid class name and case insensitive filesystem */
public final class C73093jR implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("newsletter_linked_account_chat_index", "CREATE INDEX IF NOT EXISTS newsletter_linked_account_chat_index ON newsletter_linked_account (chat_row_id)");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        AnonymousClass00C.A0D(r6, 0);
        C63843Lq.A04(r6, "chat", "newsletter_linked_account", "chat_row_id=old._id");
    }

    public void B7q(AnonymousClass38H r6, C65063Qo r7) {
        C63573Ko A01 = C63573Ko.A01(r7);
        C64563Om[] A0m = C63573Ko.A0m(A01);
        C52502pX r1 = C52502pX.INTEGER;
        boolean A0f = C63573Ko.A0f(A01, r1, A0m);
        C63573Ko.A0R(A01, r1, "chat_row_id", A0m, A0f);
        A01.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        C52502pX r12 = C52502pX.TEXT;
        C63573Ko.A0Y(A01, r12, A0m, A0f);
        A01.A02 = "link";
        C63573Ko.A0Z(A01, r12, A0m, A0f);
        r7.A0B("newsletter_linked_account", A0m);
    }
}
