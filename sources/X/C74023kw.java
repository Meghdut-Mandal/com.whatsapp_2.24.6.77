package X;

import android.text.TextUtils;

@Deprecated
/* renamed from: X.3kw  reason: invalid class name and case insensitive filesystem */
public class C74023kw implements AnonymousClass15z, AnonymousClass160 {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public void B4y(C224114e r3, AnonymousClass38H r4) {
        if (TextUtils.isEmpty(C224614k.A00(r3, "table", "labeled_messages_fts"))) {
            r3.A0D("CREATE VIRTUAL TABLE labeled_messages_fts USING FTS3()", "CREATE_LABELED_MESSAGES_FTS_TABLE");
        }
    }

    public void B7q(AnonymousClass38H r2, C65063Qo r3) {
        r3.A06(this, "labeled_messages_fts");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A05(r6, "message", "labeled_messages_fts", "docid=old._id");
    }
}
