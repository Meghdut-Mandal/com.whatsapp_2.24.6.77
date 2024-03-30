package X;

import android.text.TextUtils;

/* renamed from: X.3hv  reason: invalid class name and case insensitive filesystem */
public class C72153hv implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        r6.A07("call_log_key_index", "CREATE UNIQUE INDEX IF NOT EXISTS call_log_key_index ON call_log (jid_row_id, from_me, call_id, transaction_id)");
        if (r5.A00) {
            r6.A09("call_log", "call_log_ts_index", "CREATE INDEX IF NOT EXISTS call_log_ts_index ON call_log (timestamp)");
        }
    }

    public void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        if (!TextUtils.isEmpty(C224614k.A00(r4, "table", "call_logs"))) {
            C63843Lq.A05(r6, "call_logs", "call_log_participant", "call_logs_row_id=old._id");
        }
    }

    public void B7q(AnonymousClass38H r9, C65063Qo r10) {
        C63573Ko A00 = C63573Ko.A00();
        C64563Om[] r3 = new C64563Om[19];
        C52502pX A01 = C52502pX.A01(A00);
        A00.A00 = A01;
        boolean A0k = C63573Ko.A0k(A00, r3);
        C63573Ko.A0Q(A00, A01, "jid_row_id", r3, 1);
        C63573Ko.A08(A00, A01, "from_me", r3);
        A00.A02 = "call_id";
        C52502pX r2 = C52502pX.TEXT;
        C63573Ko.A0U(A00, r2, r3);
        C63573Ko.A0A(A00, A01, "transaction_id", r3);
        C63573Ko.A0B(A00, A01, "timestamp", r3);
        C63573Ko.A0C(A00, A01, "video_call", r3);
        C63573Ko.A0D(A00, A01, "duration", r3);
        C63573Ko.A0E(A00, A01, "call_result", r3);
        C63573Ko.A0F(A00, A01, "is_dnd_mode_on", r3);
        C63573Ko.A0G(A00, A01, "bytes_transferred", r3);
        r3[11] = C63573Ko.A04(A00, A01, "group_jid_row_id", A0k ? 1 : 0, true);
        C63573Ko.A0I(A00, A01, "is_joinable_group_call", r3);
        r3[13] = C63573Ko.A04(A00, A01, "call_creator_device_jid_row_id", A0k, true);
        C63573Ko.A0K(A00, r2, "call_random_id", r3);
        r3[15] = C63573Ko.A04(A00, A01, "call_link_row_id", A0k, true);
        C63573Ko.A0M(A00, A01, "call_type", r3);
        C63573Ko.A0N(A00, A01, "offer_silence_reason", r3);
        C63573Ko.A0O(A00, r2, "scheduled_id", r3);
        r10.A0B("call_log", r3);
    }
}
