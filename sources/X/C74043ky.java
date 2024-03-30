package X;

import android.text.TextUtils;

/* renamed from: X.3ky  reason: invalid class name and case insensitive filesystem */
public class C74043ky implements AnonymousClass15z, AnonymousClass160 {
    public /* synthetic */ void B7s(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public void B4y(C224114e r7, AnonymousClass38H r8) {
        String A00 = C224614k.A00(r7, "table", "receipt_orphaned");
        if (!TextUtils.isEmpty(A00)) {
            if (!C224614k.A06(A00, "receipt_recipient_jid_row_id", "INTEGER")) {
                C224614k.A03(r7, "ReceiptOrphanedTable", "receipt_orphaned");
            } else {
                return;
            }
        }
        r7.A0D("CREATE TABLE receipt_orphaned (_id INTEGER PRIMARY KEY AUTOINCREMENT, chat_row_id INTEGER NOT NULL, from_me INTEGER NOT NULL, key_id TEXT NOT NULL, receipt_device_jid_row_id INTEGER NOT NULL, receipt_recipient_jid_row_id INTEGER, status INTEGER, timestamp INTEGER)", "CREATE_RECEIPT_ORPHANED_TABLE");
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("receipt_orphaned_index", "CREATE UNIQUE INDEX IF NOT EXISTS receipt_orphaned_index ON receipt_orphaned (chat_row_id, from_me, key_id, receipt_device_jid_row_id, receipt_recipient_jid_row_id, status)");
    }

    public void B7q(AnonymousClass38H r2, C65063Qo r3) {
        r3.A06(this, "receipt_orphaned");
    }
}
