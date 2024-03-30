package X;

import android.database.sqlite.SQLiteConstraintException;
import android.util.Pair;
import com.whatsapp.util.Log;

/* renamed from: X.1Ji  reason: invalid class name and case insensitive filesystem */
public class C26221Ji {
    public final AnonymousClass12P A00;
    public final AnonymousClass1FN A01;
    public final C20170x8 A02;

    public long A00(AnonymousClass3T1 r12) {
        C36721lC A0B;
        C20170x8 r10 = this.A02;
        long j = r12.A1N;
        try {
            AnonymousClass1M0 A04 = r10.A03.get();
            try {
                A0B = A04.A02.A0B((C02680Bk) null, "SELECT _id FROM message_add_on WHERE parent_message_row_id = ? AND message_add_on_type = ? AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", "SELECT_MESSAGE_ADD_ON_ROW_ID_FOR_PARENT_ROW_ID_AND_TYPE", new String[]{String.valueOf(j), String.valueOf(74), String.valueOf(C19970wo.A00(r10.A00))});
                if (A0B.moveToFirst()) {
                    long j2 = (long) A0B.getInt(A0B.getColumnIndexOrThrow("_id"));
                    A0B.close();
                    A04.close();
                    return j2;
                }
                A0B.close();
                A04.close();
                return -1;
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to get message_add_on_row_id for parent_message_row_id=");
            sb.append(j);
            sb.append(" and message_add_on_type=");
            sb.append(74);
            Log.e(sb.toString(), e);
            return -1;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public Pair A01(AnonymousClass3T1 r14) {
        AnonymousClass1M0 A05;
        if (r14 instanceof AnonymousClass2bK) {
            return new Pair(7, -1L);
        }
        if (!r14.A1T(C132986Wc.A0F) || r14.A0X() == null) {
            return new Pair(6, -1L);
        }
        C46732ba r6 = new C46732ba(r14.A0X().A02, r14.A0X().A00);
        C64933Qa r1 = r14.A1J;
        r6.A04 = new C195759Vv(r14.A0J(), r1);
        long j = r14.A1N;
        r6.A01 = j;
        r6.A0q(r14.A0J());
        try {
            AnonymousClass1M0 A052 = this.A00.A05();
            try {
                C1495671s B1k = A052.B1k();
                try {
                    long A002 = this.A02.A00(r6);
                    if (A002 == -1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MessageAddOnEditManager/storeEditOriginalAndCopyReceipts duplicate addon message ");
                        sb.append(r6.A1J.A01);
                        Log.i(sb.toString());
                        Pair pair = new Pair(7, -1L);
                        B1k.close();
                        A052.close();
                        return pair;
                    }
                    if (r1.A02) {
                        A05 = this.A01.A02.A05();
                        A05.A02.A0E("INSERT INTO message_add_on_receipt_device(message_add_on_row_id, receipt_device_jid_row_id, primary_device_version, receipt_device_timestamp)SELECT ?, receipt_device_jid_row_id, primary_device_version, receipt_device_timestamp FROM receipt_device WHERE message_row_id = ?", "RECEIPT_COPY_QUERY", new String[]{String.valueOf(A002), String.valueOf(j)});
                        A05.close();
                    }
                    B1k.A00();
                    B1k.close();
                    A052.close();
                    return new Pair(1, Long.valueOf(A002));
                } catch (Throwable th) {
                    B1k.close();
                    throw th;
                }
            } catch (Throwable th2) {
                A052.close();
                throw th2;
            }
        } catch (SQLiteConstraintException unused) {
            return new Pair(5, -1L);
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
        throw th;
    }

    public C26221Ji(AnonymousClass12P r1, AnonymousClass1FN r2, C20170x8 r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
