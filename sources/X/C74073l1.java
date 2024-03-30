package X;

import android.text.TextUtils;

/* renamed from: X.3l1  reason: invalid class name and case insensitive filesystem */
public class C74073l1 implements AnonymousClass15z, AnonymousClass160 {
    public void B4y(C224114e r9, AnonymousClass38H r10) {
        String A00 = C224614k.A00(r9, "table", "message_add_on_receipt_device");
        if (!TextUtils.isEmpty(A00)) {
            if (!C224614k.A06(A00, "receipt_device_id", "INTEGER")) {
                r9.A0D(AnonymousClass000.A0p("DROP INDEX IF EXISTS ", "message_add_on_receipt_device_index", AnonymousClass000.A0u()), C63853Lr.A01("MessageAddOnReceiptDeviceTable", "createTable", C63853Lr.A00("message_add_on_receipt_device")));
                r9.A0D(C36321k7.A0D("DROP INDEX IF EXISTS ", "message_add_on_receipt_device_jid_index"), C63853Lr.A01("MessageAddOnReceiptDeviceTable", "createTable", C63853Lr.A00("message_add_on_receipt_device")));
                r9.A0D(C54162sV.A00("message_add_on_receipt_device"), C63853Lr.A01("MessageAddOnReceiptDeviceTable", "createTable", C63853Lr.A00("message_add_on_receipt_device")));
            } else {
                return;
            }
        }
        r9.A0D("CREATE TABLE message_add_on_receipt_device (receipt_device_id INTEGER PRIMARY KEY AUTOINCREMENT, message_add_on_row_id INTEGER, receipt_device_jid_row_id INTEGER, receipt_device_timestamp INTEGER, primary_device_version INTEGER)", "MessageAddOnReceiptDeviceTable/createMessageAddOnReceiptDeviceTable/CREATE_MESSAGE_ADD_ON_RECEIPT_DEVICE_TABLE");
    }

    public /* synthetic */ void B7n(C224114e r3, AnonymousClass38H r4, C65063Qo r5) {
        r5.A07("message_add_on_receipt_device_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_add_on_receipt_device_index ON message_add_on_receipt_device (message_add_on_row_id, receipt_device_jid_row_id)");
        r5.A07("message_add_on_receipt_device_jid_index", "CREATE INDEX IF NOT EXISTS message_add_on_receipt_device_jid_index ON message_add_on_receipt_device (receipt_device_jid_row_id)");
    }

    public void B7q(AnonymousClass38H r2, C65063Qo r3) {
        r3.A06(this, "message_add_on_receipt_device");
    }

    public /* synthetic */ void B7s(C224114e r4, AnonymousClass38H r5, C65063Qo r6) {
        C63843Lq.A03(r6, "message_add_on", "message_add_on_receipt_device", "message_add_on_row_id=old._id");
    }
}
