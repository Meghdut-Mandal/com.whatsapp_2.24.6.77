package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.1TN  reason: invalid class name */
public class AnonymousClass1TN {
    public final C19970wo A00;
    public final AnonymousClass163 A01;
    public final C219712j A02;
    public final AnonymousClass12P A03;

    public void A01(C64933Qa r7) {
        AnonymousClass163 r1 = this.A01;
        AnonymousClass11F r0 = r7.A00;
        C18740tg.A06(r0);
        String[] strArr = {String.valueOf(r1.A08(r0)), String.valueOf(r7.A02 ? 1 : 0), r7.A01};
        AnonymousClass1M0 A05 = this.A03.A05();
        try {
            A05.A02.A03("receipt_orphaned", "chat_row_id = ? AND from_me = ? AND key_id = ?", "DELETE_ORPHANED_RECEIPTS_SQL", strArr);
            StringBuilder sb = new StringBuilder();
            sb.append("orphanedreceiptstore/deleteOrphanedReceipts/key:");
            sb.append(r7);
            Log.i(sb.toString());
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public ArrayList A00(C64933Qa r18) {
        Cursor A09;
        ArrayList arrayList = new ArrayList();
        AnonymousClass163 r1 = this.A01;
        C64933Qa r2 = r18;
        AnonymousClass11F r0 = r2.A00;
        C18740tg.A06(r0);
        String[] strArr = {String.valueOf(r1.A08(r0)), String.valueOf(r2.A02 ? 1 : 0), r2.A01};
        AnonymousClass1M0 A04 = this.A03.get();
        try {
            A09 = A04.A02.A09("SELECT receipt_device_jid_row_id, receipt_recipient_jid_row_id, status, timestamp FROM receipt_orphaned WHERE chat_row_id = ? AND from_me = ? AND key_id = ? ORDER BY _id ASC", "GET_ORPHANED_RECEIPTS_SQL", strArr);
            int columnIndexOrThrow = A09.getColumnIndexOrThrow("receipt_device_jid_row_id");
            int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("receipt_recipient_jid_row_id");
            int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("status");
            int columnIndexOrThrow4 = A09.getColumnIndexOrThrow("timestamp");
            while (A09.moveToNext()) {
                C219712j r11 = this.A02;
                DeviceJid deviceJid = (DeviceJid) r11.A0C(DeviceJid.class, A09.getLong(columnIndexOrThrow));
                if (deviceJid != null) {
                    arrayList.add(new C63223Jf(deviceJid, (UserJid) r11.A0C(UserJid.class, A09.getLong(columnIndexOrThrow2)), A09.getInt(columnIndexOrThrow3), A09.getLong(columnIndexOrThrow4)));
                }
            }
            A09.close();
            A04.close();
            return arrayList;
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

    public AnonymousClass1TN(C19970wo r1, AnonymousClass163 r2, C219712j r3, AnonymousClass12P r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }
}
