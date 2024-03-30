package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.1FM  reason: invalid class name */
public class AnonymousClass1FM extends AnonymousClass1FJ {
    public final AnonymousClass163 A00;

    public AnonymousClass1FM(C19700wN r7, AnonymousClass163 r8, C219712j r9, C220612s r10, AnonymousClass12P r11, AnonymousClass1FL r12) {
        super(r7, r9, r10, r11, r12);
        this.A00 = r8;
    }

    public static C587931b A00(AnonymousClass1FM r10, C64933Qa r11) {
        String str;
        Cursor A09;
        C587931b r7 = new C587931b();
        AnonymousClass11F r1 = r11.A00;
        C18740tg.A06(r1);
        String[] strArr = new String[3];
        strArr[0] = String.valueOf(r10.A00.A08(r1));
        if (r11.A02) {
            str = "1";
        } else {
            str = "0";
        }
        strArr[1] = str;
        strArr[2] = r11.A01;
        AnonymousClass1M0 A04 = r10.A04.get();
        try {
            A09 = A04.A02.A09("SELECT receipt_device_jid_row_id, receipt_device_timestamp FROM message_add_on JOIN message_add_on_receipt_device ON message_add_on._id = message_add_on_receipt_device.message_add_on_row_id WHERE chat_row_id = ? AND from_me = ? AND key_id = ?", "GET_MESSAGE_ADD_ON_DEVICE_RECEIPTS_SQL", strArr);
            int columnIndexOrThrow = A09.getColumnIndexOrThrow("receipt_device_jid_row_id");
            int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("receipt_device_timestamp");
            while (A09.moveToNext()) {
                long j = A09.getLong(columnIndexOrThrow);
                C219712j r9 = r10.A02;
                DeviceJid deviceJid = (DeviceJid) r9.A0C(DeviceJid.class, j);
                if (deviceJid != null) {
                    r7.A00.put(deviceJid, new AnonymousClass3CX(A09.getLong(columnIndexOrThrow2)));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MessageAddOnReceiptDeviceStore//getmessagedevicereceipts: got a null deviceJid for ");
                    sb.append(r11);
                    sb.append(", deviceJidRowId=");
                    sb.append(j);
                    sb.append(", jid=");
                    sb.append(r9.A09(j));
                    Log.e(sb.toString());
                }
            }
            A09.close();
            A04.close();
            return r7;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
