package X;

import android.text.TextUtils;

/* renamed from: X.3l0  reason: invalid class name and case insensitive filesystem */
public class C74063l0 implements AnonymousClass15z, AnonymousClass160 {
    public void B4y(C224114e r9, AnonymousClass38H r10) {
        C224114e r2 = r9;
        String A00 = C224614k.A00(r9, "table", "message_vcard_jid");
        if (TextUtils.isEmpty(A00)) {
            r9.A0D("CREATE TABLE message_vcard_jid(_id INTEGER PRIMARY KEY AUTOINCREMENT, vcard_jid_row_id INTEGER, vcard_row_id INTEGER, message_row_id INTEGER)", "CREATE_MESSAGE_VCARD_JID_TABLE");
        } else if (C224614k.A04(r2, A00, "message_vcard_jid", "message_row_id", "INTEGER", "VCardJidTable")) {
            C224614k.A02(r9, "DROP_MESSAGE_VCARD_JID_INDEX", "message_vcard_jid_index");
        }
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_vcard_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_vcard_jid_index ON message_vcard_jid(vcard_jid_row_id, vcard_row_id, message_row_id)");
    }

    public void B7q(AnonymousClass38H r2, C65063Qo r3) {
        r3.A06(this, "message_vcard_jid");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A05(r6, "message_vcard", "message_vcard_jid", "vcard_row_id=old._id");
        C63843Lq.A01(r6, "message_vcard_jid");
    }
}
