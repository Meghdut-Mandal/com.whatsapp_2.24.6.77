package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1HK  reason: invalid class name */
public class AnonymousClass1HK {
    public final AnonymousClass1HM A00;
    public final AnonymousClass12g A01;
    public final C219712j A02;
    public final AnonymousClass1HO A03;
    public final AnonymousClass12P A04;
    public final C20810yC A05;
    public final C19970wo A06;

    public static void A03(C26911Lz r3, String[] strArr) {
        int length = strArr.length;
        C224114e r32 = ((AnonymousClass1M0) r3).A02;
        StringBuilder sb = new StringBuilder();
        sb.append("_id IN ");
        sb.append(AnonymousClass1M2.A00(length));
        r32.A03("call_log_participant_v2", sb.toString(), "insertOrUpdateOrDeleteCallLogParticipants/DELETE_CALL_LOG_PARTICIPANT", strArr);
    }

    public synchronized void A07(C107265Nh r10) {
        String str;
        AnonymousClass1M0 A052 = this.A04.A05();
        try {
            C224114e r6 = A052.A02;
            String[] strArr = new String[4];
            C219712j r1 = this.A02;
            C135006by r7 = r10.A04;
            strArr[0] = Long.toString(r1.A07(r7.A01));
            if (r7.A03) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[1] = str;
            strArr[2] = r7.A02;
            strArr[3] = Integer.toString(r7.A00);
            int A032 = r6.A03("call_log", "jid_row_id = ? AND from_me = ? AND call_id = ? AND transaction_id = ?", "deleteCallLog/DELETE_CALL_LOG", strArr);
            StringBuilder sb = new StringBuilder();
            sb.append("CallLogStore/deleteCallLog/rowId=");
            sb.append(r10.A02());
            sb.append("; count=");
            sb.append(A032);
            Log.i(sb.toString());
            A052.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return;
        throw th;
    }

    public static ContentValues A00(AnonymousClass1HK r5, C135006by r6, C107265Nh r7) {
        long j;
        long j2;
        String str;
        ContentValues contentValues = new ContentValues();
        C219712j r52 = r5.A02;
        contentValues.put("jid_row_id", Long.valueOf(r52.A07(r6.A01)));
        contentValues.put("from_me", Integer.valueOf(r6.A03 ? 1 : 0));
        contentValues.put("call_id", r6.A02);
        contentValues.put("transaction_id", Integer.valueOf(r6.A00));
        contentValues.put("timestamp", Long.valueOf(r7.A01));
        contentValues.put("video_call", Boolean.valueOf(r7.A0K));
        contentValues.put("duration", Integer.valueOf(r7.A09));
        contentValues.put("call_result", Integer.valueOf(r7.A07));
        contentValues.put("is_dnd_mode_on", Integer.valueOf(r7.A0B().databaseValue));
        contentValues.put("bytes_transferred", Long.valueOf(r7.A0B));
        long j3 = 0;
        if (r7.A0D != null) {
            j = r52.A07(r7.A0D);
        } else {
            j = 0;
        }
        contentValues.put("group_jid_row_id", Long.valueOf(j));
        contentValues.put("is_joinable_group_call", Boolean.valueOf(r7.A0J));
        DeviceJid deviceJid = r7.A02;
        if (deviceJid != null) {
            j2 = r52.A07(deviceJid);
        } else {
            j2 = 0;
        }
        contentValues.put("call_creator_device_jid_row_id", Long.valueOf(j2));
        contentValues.put("call_random_id", r7.A0H);
        C107265Nh.A01(r7);
        contentValues.put("offer_silence_reason", Integer.valueOf(r7.A0A));
        if (r7.A0C != null) {
            j3 = r7.A0C.A00;
        }
        contentValues.put("call_link_row_id", Long.valueOf(j3));
        contentValues.put("call_type", Integer.valueOf(r7.A08));
        if (r7.A0G != null) {
            str = r7.A0G.A00;
        } else {
            str = null;
        }
        contentValues.put("scheduled_id", str);
        return contentValues;
    }

    public static C107265Nh A01(Cursor cursor, Cursor cursor2, AnonymousClass1HK r44) {
        int i;
        int i2;
        String string;
        AnonymousClass661 r5;
        Cursor cursor3 = cursor;
        long j = cursor3.getLong(cursor3.getColumnIndexOrThrow("_id"));
        String string2 = cursor3.getString(cursor3.getColumnIndexOrThrow("call_id"));
        long j2 = cursor3.getLong(cursor3.getColumnIndexOrThrow("jid_row_id"));
        AnonymousClass1HK r13 = r44;
        C219712j r2 = r13.A02;
        Jid A09 = r2.A09(j2);
        C222813r r1 = UserJid.Companion;
        UserJid A002 = C222813r.A00(A09);
        if (A002 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("CallLogStore/readCallLogFromCursors/error getting jid; log jidRowId=");
            sb.append(j2);
            Log.e(sb.toString());
            return null;
        }
        boolean z = false;
        if (cursor3.getInt(cursor3.getColumnIndexOrThrow("from_me")) > 0) {
            z = true;
        }
        C135006by r12 = new C135006by(cursor3.getInt(cursor3.getColumnIndexOrThrow("transaction_id")), A002, string2, z);
        long j3 = cursor3.getLong(cursor3.getColumnIndexOrThrow("timestamp"));
        boolean z2 = false;
        if (cursor3.getInt(cursor3.getColumnIndexOrThrow("video_call")) > 0) {
            z2 = true;
        }
        int i3 = cursor3.getInt(cursor3.getColumnIndexOrThrow("duration"));
        int i4 = cursor3.getInt(cursor3.getColumnIndexOrThrow("call_result"));
        int i5 = cursor3.getInt(cursor3.getColumnIndexOrThrow("is_dnd_mode_on"));
        long j4 = cursor3.getLong(cursor3.getColumnIndexOrThrow("bytes_transferred"));
        int i6 = cursor3.getInt(cursor3.getColumnIndexOrThrow("group_jid_row_id"));
        boolean z3 = false;
        if (cursor3.getInt(cursor3.getColumnIndexOrThrow("is_joinable_group_call")) > 0) {
            z3 = true;
        }
        int columnIndexOrThrow = cursor3.getColumnIndexOrThrow("offer_silence_reason");
        if (cursor3.isNull(columnIndexOrThrow)) {
            i = 0;
        } else {
            i = cursor3.getInt(columnIndexOrThrow);
        }
        long j5 = cursor3.getLong(cursor3.getColumnIndexOrThrow("call_creator_device_jid_row_id"));
        int columnIndexOrThrow2 = cursor3.getColumnIndexOrThrow("call_type");
        if (cursor3.isNull(columnIndexOrThrow2)) {
            i2 = 0;
        } else {
            i2 = cursor3.getInt(columnIndexOrThrow2);
        }
        int columnIndexOrThrow3 = cursor3.getColumnIndexOrThrow("scheduled_id");
        if (cursor3.isNull(columnIndexOrThrow3)) {
            string = null;
        } else {
            string = cursor3.getString(columnIndexOrThrow3);
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            Cursor cursor4 = cursor2;
            try {
                if (!cursor4.moveToNext()) {
                    break;
                }
                long j6 = cursor4.getLong(cursor4.getColumnIndexOrThrow("_id"));
                int i7 = cursor4.getInt(cursor4.getColumnIndexOrThrow("jid_row_id"));
                UserJid A003 = C222813r.A00(r2.A09((long) i7));
                if (A003 != null) {
                    arrayList.add(new C107255Nf(A003, cursor4.getInt(cursor4.getColumnIndexOrThrow("call_result")), j6));
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CallLogStore/readCallLogFromCursors/error getting jid; participantJidRowId=");
                    sb2.append(i7);
                    Log.e(sb2.toString());
                }
            } catch (RuntimeException e) {
                Log.e("CallLogStore/readCallLogFromCursors/exception", e);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("CallLogStore/readCallLogFromCursors/exception logCursorCount");
                sb3.append(cursor3.getCount());
                sb3.append(" position:");
                sb3.append(cursor3.getPosition());
                Log.e(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("CallLogStore/readCallLogFromCursors/exception participantsCursorCount");
                sb4.append(cursor4.getCount());
                sb4.append(" position:");
                sb4.append(cursor4.getPosition());
                Log.e(sb4.toString());
                throw e;
            }
        }
        String string3 = cursor3.getString(cursor3.getColumnIndexOrThrow("call_random_id"));
        if (string != null) {
            r5 = new AnonymousClass661(string);
        } else {
            r5 = null;
        }
        C108555Tz r14 = C108555Tz.A04;
        C108555Tz A004 = C111845cw.A00(i5);
        Jid A092 = r2.A09((long) i6);
        AnonymousClass6SZ r15 = GroupJid.Companion;
        GroupJid A005 = AnonymousClass6SZ.A00(A092);
        return new C107265Nh(r13.A00.A01(cursor3), DeviceJid.of(r2.A09(j5)), A005, (C106255Iy) null, r12, A004, r13.A03.A01(cursor3), r5, string3, arrayList, i3, i4, i, i2, j, j3, j4, z2, false, false, z3);
    }

    public static void A02(AnonymousClass1HK r21, C107265Nh r22) {
        int i;
        boolean A052;
        int i2;
        C107265Nh r4 = r22;
        int i3 = 0;
        boolean z = false;
        if (r4.A02() != -1) {
            z = true;
        }
        C18740tg.A0E(z, "CallLog row_id is not set");
        AnonymousClass1HK r8 = r21;
        AnonymousClass1M0 A053 = r8.A04.A05();
        try {
            C1495671s B1k = A053.B1k();
            try {
                Iterator it = r4.A0C().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    C107255Nf r5 = (C107255Nf) next;
                    synchronized (next) {
                        try {
                            A052 = r5.A05();
                            i2 = r5.A01;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    if (A052) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("call_log_row_id", Long.valueOf(r4.A02()));
                        contentValues.put("jid_row_id", Long.valueOf(r8.A02.A07(r5.A00)));
                        contentValues.put("call_result", Integer.valueOf(r5.A01));
                        if (r5.A02() != -1) {
                            A053.A02.A01(contentValues, "call_log_participant_v2", "_id = ?", "insertOrUpdateOrDeleteCallLogParticipants/UPDATE_CALL_LOG_PARTICIPANT", new String[]{Long.toString(r5.A02())});
                        } else {
                            r5.A04(A053.A02.A07("call_log_participant_v2", "insertOrUpdateOrDeleteCallLogParticipants/REPLACE_CALL_LOG_PARTICIPANT", contentValues));
                        }
                        synchronized (next) {
                            int i4 = r5.A01;
                            if (i2 == i4) {
                                r5.A02 = false;
                                r5.A01 = i4 + 1;
                            }
                        }
                    }
                }
                if (!r4.A0E().isEmpty()) {
                    int size = r4.A0E().size();
                    String[] strArr = new String[Math.min(size, 975)];
                    while (i3 < r4.A0E().size() && i3 < size) {
                        if (i3 == 975) {
                            A03(A053, strArr);
                            strArr = new String[(size - 975)];
                        } else {
                            i = i3;
                            if (i3 < 975) {
                                strArr[i] = Long.toString(((C107255Nf) r4.A0E().get(i3)).A02());
                                i3++;
                            }
                        }
                        i = i3 - 975;
                        strArr[i] = Long.toString(((C107255Nf) r4.A0E().get(i3)).A02());
                        i3++;
                    }
                    A03(A053, strArr);
                    r4.A0E().size();
                }
                synchronized (r4) {
                    r4.A0L.clear();
                }
                r4.A02();
                B1k.A00();
                B1k.close();
                A053.close();
            } catch (Throwable th2) {
                B1k.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A053.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public C107265Nh A04(long j) {
        Cursor A09;
        AnonymousClass1M0 A042 = this.A04.get();
        try {
            C224114e r8 = A042.A02;
            String l = Long.toString(j);
            Cursor A092 = r8.A09("SELECT call_log._id, call_log.call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_type, offer_silence_reason, scheduled_id, call_log_row_id, joinable_video_call, call_link._id AS call_link_id, token, creator_jid_row_id FROM call_log LEFT JOIN joinable_call_log ON joinable_call_log.call_log_row_id = call_log._id LEFT JOIN call_link ON call_link._id = call_link_row_id WHERE call_log._id = ?", "GET_CALL_LOG_BY_CALL_ID", new String[]{l});
            try {
                if (A092.moveToLast()) {
                    A09 = r8.A09("SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id", "GET_CALL_LOG_PARTICIPANTS_BY_CALL_LOG_GET_CALL_LOG_BY_ROW_ID", new String[]{l});
                    C107265Nh A012 = A01(A092, A09, this);
                    if (A09 != null) {
                        A09.close();
                    }
                    A092.close();
                    A042.close();
                    return A012;
                }
                A092.close();
                A042.close();
                return null;
            } catch (Throwable th) {
                if (A092 != null) {
                    A092.close();
                }
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public C107265Nh A05(C135006by r47) {
        String str;
        Cursor A09;
        int i;
        int i2;
        String str2;
        AnonymousClass1M0 A042 = this.A04.get();
        try {
            C224114e r8 = A042.A02;
            String[] strArr = new String[4];
            C135006by r13 = r47;
            strArr[0] = r13.A02;
            C219712j r4 = this.A02;
            strArr[1] = Long.toString(r4.A07(r13.A01));
            if (r13.A03) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[2] = str;
            strArr[3] = Integer.toString(r13.A00);
            Cursor A092 = r8.A09("SELECT call_log._id, call_log.call_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_type, offer_silence_reason, scheduled_id, call_log_row_id, joinable_video_call, call_link._id AS call_link_id, token, creator_jid_row_id FROM call_log LEFT JOIN joinable_call_log ON joinable_call_log.call_log_row_id = call_log._id LEFT JOIN call_link ON call_link._id = call_link_row_id WHERE call_log.call_id = ? AND jid_row_id = ? AND from_me = ? AND transaction_id = ?", "GET_CALL_LOG_BY_KEY", strArr);
            try {
                if (A092.moveToLast()) {
                    A09 = r8.A09("SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id", "GET_CALL_LOG_PARTICIPANTS_BY_CALL_LOG_GET_CALL_LOG_BY_KEY", new String[]{Long.toString(A092.getLong(A092.getColumnIndexOrThrow("_id")))});
                    long j = A092.getLong(A092.getColumnIndexOrThrow("_id"));
                    long j2 = A092.getLong(A092.getColumnIndexOrThrow("timestamp"));
                    boolean z = false;
                    if (A092.getInt(A092.getColumnIndexOrThrow("video_call")) > 0) {
                        z = true;
                    }
                    int i3 = A092.getInt(A092.getColumnIndexOrThrow("duration"));
                    int i4 = A092.getInt(A092.getColumnIndexOrThrow("call_result"));
                    int i5 = A092.getInt(A092.getColumnIndexOrThrow("is_dnd_mode_on"));
                    long j3 = A092.getLong(A092.getColumnIndexOrThrow("bytes_transferred"));
                    int i6 = A092.getInt(A092.getColumnIndexOrThrow("group_jid_row_id"));
                    boolean z2 = false;
                    if (A092.getInt(A092.getColumnIndexOrThrow("is_joinable_group_call")) > 0) {
                        z2 = true;
                    }
                    long j4 = A092.getLong(A092.getColumnIndexOrThrow("call_creator_device_jid_row_id"));
                    int columnIndexOrThrow = A092.getColumnIndexOrThrow("call_type");
                    if (A092.isNull(columnIndexOrThrow)) {
                        i = 0;
                    } else {
                        i = A092.getInt(columnIndexOrThrow);
                    }
                    int columnIndexOrThrow2 = A092.getColumnIndexOrThrow("offer_silence_reason");
                    if (A092.isNull(columnIndexOrThrow2)) {
                        i2 = 0;
                    } else {
                        i2 = A092.getInt(columnIndexOrThrow2);
                    }
                    int columnIndexOrThrow3 = A092.getColumnIndexOrThrow("scheduled_id");
                    AnonymousClass661 r14 = null;
                    if (A092.isNull(columnIndexOrThrow3)) {
                        str2 = null;
                    } else {
                        str2 = A092.getString(columnIndexOrThrow3);
                    }
                    ArrayList arrayList = new ArrayList();
                    while (A09.moveToNext()) {
                        long j5 = A09.getLong(A09.getColumnIndexOrThrow("_id"));
                        int i7 = A09.getInt(A09.getColumnIndexOrThrow("jid_row_id"));
                        Jid A093 = r4.A09((long) i7);
                        C222813r r0 = UserJid.Companion;
                        UserJid A002 = C222813r.A00(A093);
                        if (A002 != null) {
                            arrayList.add(new C107255Nf(A002, A09.getInt(A09.getColumnIndexOrThrow("call_result")), j5));
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("CallLogStore/readCallLogFromCursors/error getting jid; participantJidRowId=");
                            sb.append(i7);
                            Log.e(sb.toString());
                        }
                    }
                    String string = A092.getString(A092.getColumnIndexOrThrow("call_random_id"));
                    if (str2 != null) {
                        r14 = new AnonymousClass661(str2);
                    }
                    C108555Tz r02 = C108555Tz.A04;
                    C108555Tz A003 = C111845cw.A00(i5);
                    Jid A094 = r4.A09((long) i6);
                    AnonymousClass6SZ r03 = GroupJid.Companion;
                    C107265Nh r21 = new C107265Nh(this.A00.A01(A092), DeviceJid.of(r4.A09(j4)), AnonymousClass6SZ.A00(A094), (C106255Iy) null, r13, A003, this.A03.A01(A092), r14, string, arrayList, i3, i4, i2, i, j, j2, j3, z, false, false, z2);
                    A09.close();
                    A092.close();
                    A042.close();
                    return r21;
                }
                A092.close();
                A042.close();
                return null;
            } catch (Throwable th) {
                if (A092 != null) {
                    A092.close();
                }
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public C107265Nh A06(String str) {
        Cursor A09;
        AnonymousClass1M0 A042 = this.A04.get();
        try {
            C224114e r8 = A042.A02;
            Cursor A092 = r8.A09("SELECT call_log._id, call_log.call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_type, offer_silence_reason, scheduled_id, call_log_row_id, joinable_video_call, call_link._id AS call_link_id, token, creator_jid_row_id FROM call_log LEFT JOIN joinable_call_log ON joinable_call_log.call_log_row_id = call_log._id LEFT JOIN call_link ON call_link._id = call_link_row_id WHERE call_log.call_id = ?", "GET_CALL_LOG_BY_CALL_ID", new String[]{str});
            try {
                C107265Nh r1 = null;
                if (A092.moveToLast()) {
                    int columnIndex = A092.getColumnIndex("_id");
                    if (columnIndex < 0) {
                        C18740tg.A0D(false, "CallLogStore/getColumnIndexOrThrow _id column not found");
                    } else {
                        A09 = r8.A09("SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id", "GET_CALL_LOG_PARTICIPANTS_BY_CALL_LOG_GET_CALL_LOG_BY_ROW_ID", new String[]{Long.toString((long) A092.getInt(columnIndex))});
                        r1 = A01(A092, A09, this);
                        if (A09 != null) {
                            A09.close();
                        }
                    }
                }
                A092.close();
                A042.close();
                return r1;
            } catch (Throwable th) {
                if (A092 != null) {
                    A092.close();
                }
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public AnonymousClass1HK(AnonymousClass1HM r1, C19970wo r2, AnonymousClass12g r3, C219712j r4, AnonymousClass1HO r5, AnonymousClass12P r6, C20810yC r7) {
        this.A06 = r2;
        this.A05 = r7;
        this.A02 = r4;
        this.A00 = r1;
        this.A04 = r6;
        this.A01 = r3;
        this.A03 = r5;
    }
}
