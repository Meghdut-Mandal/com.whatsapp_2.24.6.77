package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3ja  reason: invalid class name and case insensitive filesystem */
public class C73183ja implements AnonymousClass15z {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_payment_transaction_id_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_payment_transaction_id_index ON pay_transaction (id)");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r2 = new C64563Om[26];
        C52502pX A01 = C52502pX.A01(A00);
        C63573Ko.A0Q(A00, A01, "message_row_id", r2, C63573Ko.A0g(A00, A01, r2) ? 1 : 0);
        C63573Ko.A08(A00, A01, "remote_jid_row_id", r2);
        A00.A02 = "key_id";
        C52502pX r5 = C52502pX.TEXT;
        C63573Ko.A0U(A00, r5, r2);
        C63573Ko.A0A(A00, r5, "interop_id", r2);
        C63573Ko.A0B(A00, r5, PublicKeyCredentialControllerUtility.JSON_KEY_ID, r2);
        C63573Ko.A0C(A00, A01, "timestamp", r2);
        C63573Ko.A0D(A00, A01, "status", r2);
        C63573Ko.A0E(A00, r5, "error_code", r2);
        C63573Ko.A0F(A00, A01, "sender_jid_row_id", r2);
        C63573Ko.A0G(A00, A01, "receiver_jid_row_id", r2);
        C63573Ko.A0H(A00, A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r2);
        C63573Ko.A0I(A00, r5, "currency_code", r2);
        A00.A02 = "amount_1000";
        A00.A00 = C52502pX.UNSPECIFIED;
        r2[13] = A00.A0r();
        C63573Ko.A0K(A00, r5, "credential_id", r2);
        C63573Ko.A0L(A00, r5, "methods", r2);
        C63573Ko.A0M(A00, r5, "bank_transaction_id", r2);
        C63573Ko.A0N(A00, r5, "metadata", r2);
        C63573Ko.A0O(A00, A01, "init_timestamp", r2);
        C63573Ko.A0P(A00, r5, "request_key_id", r2);
        r2[20] = C63573Ko.A02(A00, r5, "country");
        r2[21] = C63573Ko.A02(A00, A01, "version");
        r2[22] = C52502pX.A00(A00, "future_data");
        r2[23] = C63573Ko.A02(A00, A01, "service_id");
        r2[24] = C63573Ko.A02(A00, r5, "background_id");
        r2[25] = C63573Ko.A02(A00, A01, "purchase_initiator");
        r8.A0B("pay_transaction", r2);
    }
}
