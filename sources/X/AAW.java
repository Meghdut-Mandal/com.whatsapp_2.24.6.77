package X;

import android.util.Pair;

public final class AAW implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        AnonymousClass00C.A0D(r5, 0);
        r5.A07("message_bot_feedback_index", "CREATE INDEX IF NOT EXISTS message_bot_feedback_index ON message_bot_feedback (bot_feedback_key_remote_jid, bot_feedback_key_from_me, bot_feedback_key_id)");
    }

    public void B7q(AnonymousClass38H r9, C65063Qo r10) {
        C63573Ko A01 = C63573Ko.A01(r10);
        C64563Om[] r3 = new C64563Om[8];
        A01.A02 = "message_row_id";
        C52502pX r4 = C52502pX.INTEGER;
        A01.A00 = r4;
        A01.A0t();
        C63573Ko.A0e(A01, r3, 0);
        A01.A02 = "bot_feedback_kind";
        A01.A00 = r4;
        A01.A04 = true;
        C63573Ko.A0e(A01, r3, 1);
        A01.A02 = "bot_feedback_text";
        C52502pX r7 = C52502pX.TEXT;
        C63573Ko.A0Y(A01, r7, r3, true);
        A01.A02 = "bot_feedback_key_remote_jid";
        C63573Ko.A0Z(A01, r7, r3, true);
        r3[4] = C63573Ko.A05(A01, r4, "bot_feedback_key_from_me", true);
        r3[5] = C63573Ko.A05(A01, r7, "bot_feedback_key_id", true);
        r3[6] = C63573Ko.A04(A01, r4, "bot_feedback_kind_positive", 0, true);
        r3[7] = C63573Ko.A04(A01, r4, "bot_feedback_kind_negative", 0, true);
        r10.A0B("message_bot_feedback", r3);
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        AnonymousClass00C.A0D(r6, 0);
        Pair A00 = C63843Lq.A00("message", "message_bot_feedback", "message_row_id=old._id");
        AnonymousClass00C.A0B(A00);
        r6.A08((String) A00.first, (String) A00.second);
    }
}
