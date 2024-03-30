package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.1FK  reason: invalid class name */
public class AnonymousClass1FK extends AnonymousClass1FJ {
    public final C19730wQ A00;
    public final AnonymousClass1A1 A01;
    public final C219612i A02;

    public AnonymousClass1FK(C19700wN r7, C19730wQ r8, C219712j r9, C220612s r10, AnonymousClass12P r11, C219612i r12, AnonymousClass1FL r13, AnonymousClass1A1 r14) {
        super(r7, r9, r10, r11, r13);
        this.A00 = r8;
        this.A01 = r14;
        this.A02 = r12;
    }

    public static C587931b A00(AnonymousClass1FK r10, C64933Qa r11, long j) {
        Cursor A09;
        C587931b r3 = new C587931b();
        if (j != -1) {
            String[] strArr = {String.valueOf(j)};
            try {
                AnonymousClass1M0 A04 = r10.A04.get();
                try {
                    A09 = A04.A02.A09("SELECT receipt_device_jid_row_id, receipt_device_timestamp FROM receipt_device WHERE message_row_id = ?", "MessageReceiptDeviceStore/`GET_DEVICE_RECEIPTS_SQL`", strArr);
                    int columnIndexOrThrow = A09.getColumnIndexOrThrow("receipt_device_timestamp");
                    int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("receipt_device_jid_row_id");
                    while (A09.moveToNext()) {
                        long j2 = A09.getLong(columnIndexOrThrow2);
                        C219712j r9 = r10.A02;
                        DeviceJid deviceJid = (DeviceJid) r9.A0C(DeviceJid.class, j2);
                        if (deviceJid != null) {
                            r3.A00.put(deviceJid, new AnonymousClass3CX(A09.getLong(columnIndexOrThrow)));
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("receiptsmessagestore/getmessagedevicereceipts: got a null deviceJid for key=");
                            sb.append(r11);
                            sb.append(", deviceJidRowId=");
                            sb.append(j2);
                            sb.append(", jid=");
                            sb.append(r9.A09(j2));
                            Log.e(sb.toString());
                        }
                    }
                    A09.close();
                    A04.close();
                    return r3;
                } catch (Throwable th) {
                    A04.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                Log.e((Throwable) e);
                r10.A03.A03();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return r3;
        throw th;
    }
}
