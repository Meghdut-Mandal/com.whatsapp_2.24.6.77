package X;

import android.text.TextUtils;

/* renamed from: X.161  reason: invalid class name */
public class AnonymousClass161 implements AnonymousClass15z, AnonymousClass160 {
    public static final String[] A00 = {""};

    public void B4y(C224114e r5, AnonymousClass38H r6) {
        if (TextUtils.isEmpty(C224614k.A00(r5, "table", "message_ftsv2"))) {
            r5.A0D("CREATE VIRTUAL TABLE message_ftsv2 USING FTS4(content, fts_jid, fts_namespace)", "CREATE_MESSAGE_FTS_TABLE");
            AnonymousClass14m.A02(r5, "fts_index_start", "FtsTable", 0);
        }
    }

    public void B7q(AnonymousClass38H r2, C65063Qo r3) {
        r3.A06(this, "message_ftsv2");
    }

    public void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        if (!TextUtils.isEmpty(C224614k.A00(r4, "table", "message_ftsv2"))) {
            r6.A01(C63843Lq.A00("message", "message_ftsv2", "docid=old._id"));
        }
    }

    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }
}
