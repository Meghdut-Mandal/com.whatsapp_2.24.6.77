package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.1HO  reason: invalid class name */
public class AnonymousClass1HO {
    public AnonymousClass1HN A00;
    public final AnonymousClass12P A01;
    public final C219712j A02;
    public final C19770wU A03;

    public AnonymousClass5Ng A04(String str) {
        boolean containsKey;
        AnonymousClass5Ng A012;
        AnonymousClass5Ng r0;
        if (str == null) {
            return null;
        }
        AnonymousClass1HN r6 = this.A00;
        HashMap hashMap = r6.A00;
        synchronized (hashMap) {
            containsKey = hashMap.containsKey(str);
        }
        if (containsKey) {
            synchronized (hashMap) {
                r0 = (AnonymousClass5Ng) hashMap.get(str);
            }
            return r0;
        }
        AnonymousClass1M0 A04 = this.A01.get();
        try {
            Cursor A09 = A04.A02.A09("SELECT call_id, call_log_row_id, joinable_video_call, group_jid_row_id FROM joinable_call_log WHERE call_id = ? ", "joinable_call_log_store/GET_JOINABLE_CALL_LOG_BY_CALL_ID", new String[]{str});
            try {
                if (!A09.moveToLast() || (A012 = A01(A09)) == null) {
                    synchronized (hashMap) {
                        hashMap.put(str, (Object) null);
                    }
                    A09.close();
                    A04.close();
                    return null;
                }
                r6.A00(A012);
                A09.close();
                A04.close();
                return A012;
            } catch (Throwable th) {
                if (A09 != null) {
                    A09.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A04.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static ContentValues A00(AnonymousClass1HO r3, AnonymousClass5Ng r4) {
        long j;
        ContentValues contentValues = new ContentValues();
        contentValues.put("call_log_row_id", Long.valueOf(r4.A02()));
        contentValues.put("call_id", r4.A00);
        contentValues.put("joinable_video_call", Boolean.valueOf(r4.A01));
        if (r4.A02 != null) {
            j = r3.A02.A07(r4.A02);
        } else {
            j = 0;
        }
        contentValues.put("group_jid_row_id", Long.valueOf(j));
        return contentValues;
    }

    public AnonymousClass5Ng A01(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("call_log_row_id");
        if (columnIndex == -1 || cursor.isNull(columnIndex)) {
            return null;
        }
        long j = cursor.getLong(columnIndex);
        String string = cursor.getString(cursor.getColumnIndexOrThrow("call_id"));
        boolean z = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("joinable_video_call")) > 0) {
            z = true;
        }
        Jid A09 = this.A02.A09(cursor.getLong(cursor.getColumnIndexOrThrow("group_jid_row_id")));
        AnonymousClass6SZ r0 = GroupJid.Companion;
        return new AnonymousClass5Ng(AnonymousClass6SZ.A00(A09), string, j, z);
    }

    public AnonymousClass5Ng A02(GroupJid groupJid) {
        AnonymousClass5Ng r0;
        HashMap hashMap = this.A00.A01;
        synchronized (hashMap) {
            r0 = (AnonymousClass5Ng) hashMap.get(groupJid);
        }
        return r0;
    }

    public AnonymousClass5Ng A03(GroupJid groupJid) {
        boolean containsKey;
        AnonymousClass5Ng r0;
        AnonymousClass5Ng r02;
        AnonymousClass1HN r7 = this.A00;
        HashMap hashMap = r7.A01;
        synchronized (hashMap) {
            containsKey = hashMap.containsKey(groupJid);
        }
        if (containsKey) {
            synchronized (hashMap) {
                r02 = (AnonymousClass5Ng) hashMap.get(groupJid);
            }
            return r02;
        }
        AnonymousClass1M0 A04 = this.A01.get();
        try {
            Cursor A09 = A04.A02.A09("SELECT call_id, call_log_row_id, joinable_video_call, group_jid_row_id FROM joinable_call_log WHERE group_jid_row_id = ? ", "joinable_call_log_store/GET_JOINABLE_CALL_LOG_BY_GROUP_JID", new String[]{String.valueOf(this.A02.A07(groupJid))});
            try {
                if (!A09.moveToLast() || (r0 = A01(A09)) == null) {
                    synchronized (hashMap) {
                        r0 = null;
                        hashMap.put(groupJid, (Object) null);
                    }
                } else {
                    r7.A00(r0);
                }
                A09.close();
                A04.close();
                return r0;
            } catch (Throwable th) {
                if (A09 != null) {
                    A09.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A04.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public ArrayList A05() {
        Cursor A09;
        ArrayList arrayList = new ArrayList();
        AnonymousClass1M0 A04 = this.A01.get();
        try {
            A09 = A04.A02.A09("SELECT call_id, call_log_row_id, joinable_video_call, group_jid_row_id FROM joinable_call_log", "joinable_call_log_store/GET_ALL_JOINABLE_CALL_LOG", (String[]) null);
            while (A09.moveToNext()) {
                arrayList.add(C34681hT.A08(A09.getString(A09.getColumnIndexOrThrow("call_id"))));
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

    public void A06(AnonymousClass5Ng r8) {
        int i;
        AnonymousClass1M0 A05 = this.A01.A05();
        try {
            C1495671s B1k = A05.B1k();
            try {
                synchronized (r8) {
                    r8.A05();
                    i = r8.A01;
                }
                A05.A02.A05("joinable_call_log", "joinable_call_log_store/insert", A00(this, r8));
                this.A00.A00(r8);
                synchronized (r8) {
                    int i2 = r8.A01;
                    if (i == i2) {
                        r8.A02 = false;
                        r8.A01 = i2 + 1;
                    }
                }
                B1k.A00();
                StringBuilder sb = new StringBuilder();
                sb.append("JoinableCallLogStore/insertOnCurrentThread/inserted; joinableCallLog.callId=");
                sb.append(r8.A00);
                Log.i(sb.toString());
                B1k.close();
                A05.close();
            } catch (Throwable th) {
                B1k.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A05.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public boolean A07(GroupJid groupJid) {
        boolean containsKey;
        HashMap hashMap = this.A00.A01;
        synchronized (hashMap) {
            containsKey = hashMap.containsKey(groupJid);
        }
        return containsKey;
    }

    public AnonymousClass1HO(C219712j r1, AnonymousClass1HN r2, AnonymousClass12P r3, C19770wU r4) {
        this.A02 = r1;
        this.A03 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }
}
