package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0x8  reason: invalid class name and case insensitive filesystem */
public class C20170x8 implements AnonymousClass00M {
    public final C19970wo A00;
    public final AnonymousClass163 A01;
    public final C219712j A02;
    public final AnonymousClass12P A03;
    public final AnonymousClass17E A04;
    public final C231017e A05;

    public Cursor A01(C26901Ly r5, int i, long j) {
        String[] strArr = {String.valueOf(j), String.valueOf(i), String.valueOf(C19970wo.A00(this.A00))};
        C224114e r2 = ((AnonymousClass1M0) r5).A02;
        String str = AnonymousClass3TN.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass3TN.A00(i));
        sb.append(" WHERE message_add_on.parent_message_row_id = ? AND message_add_on.message_add_on_type = ? AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)");
        return r2.A09(sb.toString(), "GET_MESSAGE_ADD_ON_FOR_PARENT_MESSAGE_SQL", strArr);
    }

    public Cursor A03(C26901Ly r7, int i, long j, long j2, boolean z) {
        String str;
        String[] strArr = new String[5];
        strArr[0] = String.valueOf(j);
        strArr[1] = String.valueOf(i);
        strArr[2] = String.valueOf(C19970wo.A00(this.A00));
        strArr[3] = String.valueOf(j2);
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        strArr[4] = str;
        C224114e r4 = ((AnonymousClass1M0) r7).A02;
        String str2 = AnonymousClass3TN.A01;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AnonymousClass3TN.A00(i));
        sb2.append(" WHERE message_add_on.parent_message_row_id = ? AND message_add_on.message_add_on_type = ? AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)");
        sb.append(sb2.toString());
        sb.append(" AND ");
        sb.append("message_add_on");
        sb.append(".");
        sb.append("sender_jid_row_id");
        sb.append(" = ? AND ");
        sb.append("message_add_on");
        sb.append(".");
        sb.append("from_me");
        sb.append(" = ? ");
        return r4.A09(sb.toString(), "MessageAddOnStore/getMessageAddOnCursorForMessage", strArr);
    }

    public Cursor A04(C26901Ly r5, C64933Qa r6) {
        AnonymousClass163 r1 = this.A01;
        AnonymousClass11F r0 = r6.A00;
        C18740tg.A06(r0);
        return ((AnonymousClass1M0) r5).A02.A09(AnonymousClass3TN.A05, "MessageAddOnStore/getSelectMessageAddOnForMessageKeyWithoutExtraTables", new String[]{String.valueOf(r1.A08(r0)), r6.A01, String.valueOf(r6.A02 ? 1 : 0), String.valueOf(C19970wo.A00(this.A00))});
    }

    public long A00(AnonymousClass2bM r23) {
        long j;
        Cursor A09;
        long j2;
        long j3;
        Integer num;
        Integer valueOf;
        long j4;
        String str;
        AnonymousClass2bM r5 = r23;
        C64933Qa r0 = r5.A1J;
        String str2 = r0.A01;
        boolean z = r0.A02;
        String valueOf2 = String.valueOf(z ? 1 : 0);
        AnonymousClass163 r3 = this.A01;
        AnonymousClass11F r2 = r0.A00;
        C18740tg.A06(r2);
        String valueOf3 = String.valueOf(r3.A08(r2));
        AnonymousClass11F A0J = r5.A0J();
        if (A0J != null) {
            j = this.A02.A07(A0J);
        } else {
            j = -1;
        }
        String valueOf4 = String.valueOf(j);
        AnonymousClass12P r6 = this.A03;
        AnonymousClass1M0 A042 = r6.get();
        try {
            A09 = A042.A02.A09(AnonymousClass3TN.A01, "SELECT_ROW_ID_OF_PLACEHOLDER", new String[]{str2, valueOf2, valueOf3, valueOf4});
            if (A09.moveToNext()) {
                j2 = A09.getLong(A09.getColumnIndexOrThrow("_id"));
                A09.close();
                A042.close();
            } else {
                A09.close();
                A042.close();
                j2 = -1;
            }
            if (j2 > 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("parent_message_row_id", Long.valueOf(r5.A01));
                contentValues.put("status", Integer.valueOf(r5.A0D));
                contentValues.put("message_add_on_type", Integer.valueOf(r5.A1I));
                contentValues.put("received_timestamp", Long.valueOf(r5.A0G));
                int A1X = r5.A1X();
                Long l = null;
                if (A1X <= 0) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(A1X);
                }
                contentValues.put("expiry_duration_in_secs", valueOf);
                if (r5.A1d()) {
                    long j5 = r5.A00;
                    if (j5 > 0) {
                        l = Long.valueOf(j5);
                    }
                }
                contentValues.put("expiry_timestamp", l);
                AnonymousClass11F A0J2 = r5.A0J();
                if (A0J2 != null) {
                    j4 = this.A02.A07(A0J2);
                } else {
                    j4 = -1;
                }
                String[] strArr = new String[4];
                strArr[0] = str2;
                if (z) {
                    str = "1";
                } else {
                    str = "0";
                }
                strArr[1] = str;
                C18740tg.A06(r2);
                strArr[2] = String.valueOf(r3.A08(r2));
                strArr[3] = String.valueOf(j4);
                AnonymousClass1M0 A052 = r6.A05();
                try {
                    A052.A02.A01(contentValues, "message_add_on", "message_add_on_type=11 AND key_id = ? AND from_me = ? AND chat_row_id = ? AND sender_jid_row_id = ?", "MessageAddOnStore/updateMessageAddOnAfterRetry", strArr);
                    A052.close();
                    return j2;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            } else {
                A042 = r6.A05();
                ContentValues contentValues2 = new ContentValues(15);
                C18740tg.A06(r2);
                contentValues2.put("chat_row_id", Long.valueOf(r3.A08(r2)));
                contentValues2.put("from_me", Boolean.valueOf(z));
                contentValues2.put("key_id", str2);
                AnonymousClass11F A0J3 = r5.A0J();
                if (A0J3 != null) {
                    j3 = this.A02.A07(A0J3);
                } else {
                    j3 = -1;
                }
                contentValues2.put("sender_jid_row_id", Long.valueOf(j3));
                contentValues2.put("parent_message_row_id", Long.valueOf(r5.A01));
                contentValues2.put("timestamp", Long.valueOf(r5.A0I));
                contentValues2.put("status", Integer.valueOf(r5.A0D));
                contentValues2.put("message_add_on_type", Integer.valueOf(r5.A1I));
                contentValues2.put("received_timestamp", Long.valueOf(r5.A0G));
                int A1X2 = r5.A1X();
                Long l2 = null;
                if (A1X2 <= 0) {
                    num = null;
                } else {
                    num = Integer.valueOf(A1X2);
                }
                contentValues2.put("expiry_duration_in_secs", num);
                if (r5.A1d()) {
                    long j6 = r5.A00;
                    if (j6 > 0) {
                        l2 = Long.valueOf(j6);
                    }
                }
                contentValues2.put("expiry_timestamp", l2);
                contentValues2.put("server_timestamp", Long.valueOf(r5.A02));
                long A08 = A042.A02.A08("message_add_on", "MessageAddOnStore/insertMessageAddOn", contentValues2, 4);
                r5.A1N = A08;
                A042.close();
                return A08;
            }
        } catch (Throwable th2) {
            th = th2;
            A042.close();
            throw th;
        }
        throw th;
    }

    public Cursor A02(C26901Ly r6, int i, long j) {
        C224114e r4 = ((AnonymousClass1M0) r6).A02;
        String str = AnonymousClass3TN.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass3TN.A00(i));
        sb.append(" WHERE message_add_on._id = ? AND message_add_on.message_add_on_type = ? AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)");
        return r4.A09(sb.toString(), "MessageAddOnStore/getMessageAddOnCursorForAddOnRowId", new String[]{String.valueOf(j), String.valueOf(i), String.valueOf(C19970wo.A00(this.A00))});
    }

    public AnonymousClass2bM A05(Cursor cursor, HashMap hashMap) {
        String str;
        int A002 = C224014d.A00("from_me", hashMap);
        int A003 = C224014d.A00("key_id", hashMap);
        int A004 = C224014d.A00("chat_row_id", hashMap);
        int i = 0;
        boolean z = true;
        if (cursor.getInt(A002) != 1) {
            z = false;
        }
        String string = cursor.getString(A003);
        AnonymousClass11F BQG = this.A05.BQG(this.A01.A0A(cursor.getLong(A004)));
        if (BQG == null) {
            str = "MessageAddOnStore/createFMessageFromCursor unexpected jid for MessageAddOn";
        } else {
            C64933Qa r8 = new C64933Qa(BQG, string, z);
            int A005 = C224014d.A00("timestamp", hashMap);
            int A006 = C224014d.A00("received_timestamp", hashMap);
            int A007 = C224014d.A00("message_add_on_type", hashMap);
            int A008 = C224014d.A00("server_timestamp", hashMap);
            int A009 = C224014d.A00("expiry_duration_in_secs", hashMap);
            long j = cursor.getLong(A005);
            long j2 = cursor.getLong(A006);
            long j3 = 0;
            if (j2 == 0) {
                j2 = j;
            }
            int i2 = cursor.getInt(A007);
            if (!cursor.isNull(A008)) {
                j3 = cursor.getLong(A008);
            }
            if (!cursor.isNull(A009)) {
                i = cursor.getInt(A009);
            }
            AnonymousClass3T1 A0010 = this.A04.A00(r8, i2, j);
            if (!(A0010 instanceof AnonymousClass2bM)) {
                str = "MessageAddOnStore/createFMessageFromCursor read fMessage with not supported messageAddOnType";
            } else {
                if (!r8.A02) {
                    A0010.A0G = j2;
                }
                AnonymousClass2bM r5 = (AnonymousClass2bM) A0010;
                r5.A1a(i);
                r5.A1b(j3);
                return r5;
            }
        }
        Log.e(str);
        return null;
    }

    public AnonymousClass2bM A06(AnonymousClass3T1 r7, int i) {
        Cursor A012;
        long j = r7.A1N;
        AnonymousClass1M0 A042 = this.A03.get();
        try {
            A012 = A01(A042, i, j);
            if (!A012.moveToNext()) {
                A012.close();
                A042.close();
                return null;
            }
            HashMap A013 = C65733Tg.A01(A012, i);
            AnonymousClass2bM A052 = A05(A012, A013);
            if (A052 != null) {
                A052.A1c(A012, this.A02, A013);
                A052.A04 = new C195759Vv(r7.A0J(), r7.A1J);
            }
            A012.close();
            A042.close();
            return A052;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public ArrayList A07(int i, long j) {
        String obj;
        Cursor A09;
        AnonymousClass1M0 A042 = this.A03.get();
        try {
            String[] strArr = {String.valueOf(j), String.valueOf(C19970wo.A00(this.A00))};
            C224114e r3 = A042.A02;
            String str = AnonymousClass3TN.A01;
            if (i <= -1) {
                obj = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(" LIMIT ");
                sb.append(i);
                obj = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AnonymousClass3TN.A00(79));
            sb2.append(" WHERE message_add_on.chat_row_id = ? AND message_add_on.message_add_on_type = 79 AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0) AND message_add_on_pin_in_chat.pin_in_chat_state = 1");
            sb2.append(" ORDER BY CASE WHEN server_timestamp > 0 THEN server_timestamp ELSE timestamp END DESC");
            sb2.append(obj);
            A09 = r3.A09(sb2.toString(), "MessageAddOnStore/getMessageAddOnCursorForPinnedMessagesInChat", strArr);
            ArrayList arrayList = new ArrayList(A09.getCount());
            while (A09.moveToNext()) {
                HashMap A012 = C65733Tg.A01(A09, 79);
                AnonymousClass2bM A052 = A05(A09, A012);
                if (!(A052 instanceof AnonymousClass5J2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("MessageAddOnStore/getMessageAddOnsForPinnedMessagesInChat Unexpected FMessage ");
                    sb3.append(A052);
                    Log.e(sb3.toString());
                } else {
                    A052.A1c(A09, this.A02, A012);
                    arrayList.add((AnonymousClass5J2) A052);
                }
            }
            A09.close();
            A042.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A08(long j) {
        AnonymousClass1M0 A052 = this.A03.A05();
        try {
            A052.A02.A03("message_add_on", "_id = ?", "MessageAddOnStore/deleteMessageAddOn", new String[]{String.valueOf(j)});
            A052.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A09(Set set, int i) {
        C1495671s B1k;
        String str;
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(i));
        AnonymousClass1M0 A052 = this.A03.A05();
        try {
            B1k = A052.B1k();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C64933Qa r4 = (C64933Qa) it.next();
                String[] strArr = new String[3];
                AnonymousClass163 r1 = this.A01;
                AnonymousClass11F r0 = r4.A00;
                C18740tg.A06(r0);
                strArr[0] = String.valueOf(r1.A08(r0));
                if (r4.A02) {
                    str = "1";
                } else {
                    str = "0";
                }
                strArr[1] = str;
                strArr[2] = r4.A01;
                A052.A02.A01(contentValues, "message_add_on", "chat_row_id = ? AND from_me = ? AND key_id = ?", "MessageAddOnStore/updateMessageAddOnsStatusForKeys", strArr);
            }
            B1k.A00();
            B1k.close();
            A052.close();
            return;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C20170x8(C19970wo r1, AnonymousClass163 r2, C219712j r3, AnonymousClass12P r4, AnonymousClass17E r5, C231017e r6) {
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r4;
        this.A00 = r1;
    }
}
