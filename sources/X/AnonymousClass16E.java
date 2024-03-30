package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.16E  reason: invalid class name */
public class AnonymousClass16E {
    public final C19700wN A00;
    public final C19970wo A01;
    public final C219712j A02;
    public final AnonymousClass12P A03;
    public final C219612i A04;
    public final AnonymousClass16F A05;
    public final AnonymousClass16G A06;
    public final AnonymousClass005 A07;
    public final Object A08 = new Object();
    public final C20810yC A09;
    public final Object A0A = new Object();
    public volatile ConcurrentHashMap A0B;

    public static String[] A04(AnonymousClass16E r3, UserJid userJid) {
        long j;
        String[] strArr = new String[1];
        if (userJid != null) {
            j = r3.A02.A07(userJid);
        } else {
            j = -1;
        }
        strArr[0] = String.valueOf(j);
        return strArr;
    }

    public C65663Sz A08(UserJid userJid) {
        if (userJid == null) {
            this.A00.A0E("StatusStore/getStatusInfo for null UserJid", (String) null, true);
        }
        A03(this);
        if (userJid == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.A0B;
        C18740tg.A06(concurrentHashMap);
        return (C65663Sz) concurrentHashMap.get(userJid);
    }

    public static String A00(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append("status".toUpperCase(Locale.ROOT));
        return sb.toString();
    }

    public static void A02(ContentValues contentValues, AnonymousClass16E r16, UserJid userJid, AnonymousClass3T1 r18, boolean z) {
        C1495671s B1k;
        AnonymousClass16E r3 = r16;
        AnonymousClass1M0 A052 = r3.A03.A05();
        try {
            B1k = A052.B1k();
            C224114e r9 = A052.A02;
            UserJid userJid2 = userJid;
            if (r9.A01(contentValues, "status", "jid_row_id=?", A00("updateStatusesListForNewMessage/UPDATE"), A04(r3, userJid2)) == 0) {
                contentValues.put("jid_row_id", Long.valueOf(r3.A02.A07(userJid2)));
                long A042 = r9.A04("status", A00("updateStatusesListForNewMessage/INSERT"), contentValues);
                if (z && r3.A0B != null && r3.A0B.size() == 1) {
                    r3.A04.A03("earliest_status_time", r18.A0I);
                }
                if (A042 == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("statusmsgstore/addmsg/statuslist/insert/failed gid=");
                    sb.append(userJid2);
                    sb.append(";");
                    Log.e(sb.toString());
                }
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

    public static void A03(AnonymousClass16E r23) {
        AnonymousClass16E r1 = r23;
        if (r1.A0B == null) {
            AnonymousClass1M0 A052 = r1.A03.A05();
            try {
                synchronized (r1.A0A) {
                    if (r1.A0B == null) {
                        Cursor A092 = A052.A02.A09("SELECT jid_row_id, message_table_id, last_read_message_table_id, last_read_receipt_sent_message_table_id, first_unread_message_table_id, autodownload_limit_message_table_id, timestamp, unseen_count, total_count FROM status", "SELECT_STATUS_LIST_V2", (String[]) null);
                        try {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            while (A092.moveToNext()) {
                                UserJid userJid = (UserJid) r1.A02.A0C(UserJid.class, A092.getLong(A092.getColumnIndexOrThrow("jid_row_id")));
                                if (userJid != null) {
                                    C65663Sz r7 = new C65663Sz(r1.A01, userJid, A092.getInt(A092.getColumnIndexOrThrow("unseen_count")), A092.getInt(A092.getColumnIndexOrThrow("total_count")), A092.getLong(A092.getColumnIndexOrThrow("message_table_id")), A092.getLong(A092.getColumnIndexOrThrow("last_read_message_table_id")), A092.getLong(A092.getColumnIndexOrThrow("last_read_receipt_sent_message_table_id")), A092.getLong(A092.getColumnIndexOrThrow("first_unread_message_table_id")), A092.getLong(A092.getColumnIndexOrThrow("autodownload_limit_message_table_id")), A092.getLong(A092.getColumnIndexOrThrow("timestamp")));
                                    concurrentHashMap.put(r7.A09, r7);
                                }
                            }
                            A092.close();
                            r1.A0B = concurrentHashMap;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                }
                A052.close();
                return;
            } catch (Throwable th2) {
                try {
                    A052.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public int A05() {
        String A012 = this.A04.A01("status_distribution");
        if (A012 == null) {
            return 0;
        }
        return Integer.parseInt(A012);
    }

    public int A06(UserJid userJid) {
        AnonymousClass1M0 A052 = this.A03.A05();
        try {
            int A032 = A052.A02.A03("status", "jid_row_id=?", A00("deleteStatus/DELETE"), A04(this, userJid));
            A03(this);
            ConcurrentHashMap concurrentHashMap = this.A0B;
            C18740tg.A06(concurrentHashMap);
            concurrentHashMap.remove(userJid);
            A052.close();
            return A032;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public ArrayList A0A() {
        String A012 = this.A04.A01("status_white_list");
        if (TextUtils.isEmpty(A012)) {
            return new ArrayList();
        }
        return AnonymousClass143.A06(AnonymousClass11F.class, Arrays.asList(A012.split(",")));
    }

    public ArrayList A0B() {
        String A012 = this.A04.A01("status_black_list");
        if (TextUtils.isEmpty(A012)) {
            return new ArrayList();
        }
        return AnonymousClass143.A06(AnonymousClass11F.class, Arrays.asList(A012.split(",")));
    }

    public void A0D(C65663Sz r10, UserJid userJid) {
        AnonymousClass1M0 A052 = this.A03.A05();
        try {
            ContentValues contentValues = new ContentValues(8);
            A01(contentValues, r10);
            if (A052.A02.A01(contentValues, "status", "jid_row_id=?", A00("updateStatus/UPDATE"), A04(this, userJid)) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("StatusStore/updateStatus/failed jid=");
                sb.append(userJid);
                sb.append(";");
                Log.e(sb.toString());
            }
            A03(this);
            ConcurrentHashMap concurrentHashMap = this.A0B;
            C18740tg.A06(concurrentHashMap);
            concurrentHashMap.put(userJid, r10);
            A052.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A0E(UserJid userJid, int i, int i2) {
        AnonymousClass1M0 A052 = this.A03.A05();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("unseen_count", Integer.valueOf(i));
            contentValues.put("total_count", Integer.valueOf(i2));
            if (A052.A02.A01(contentValues, "status", "jid_row_id=?", A00("updateStatusCount/UPDATE"), A04(this, userJid)) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("StatusStore/updateStatusCount/update count failed jid=");
                sb.append(userJid);
                sb.append("; ");
                Log.e(sb.toString());
            }
            A052.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A0F(Collection collection, int i) {
        ArrayList A072;
        String join;
        String str;
        if (collection == null) {
            A072 = null;
        } else {
            A072 = AnonymousClass143.A07(collection);
        }
        C219612i r2 = this.A04;
        r2.A04("status_distribution", String.valueOf(i));
        if (A072 != null) {
            if (i == 2) {
                join = TextUtils.join(",", A072);
                str = "status_black_list";
            } else if (i == 1) {
                join = TextUtils.join(",", A072);
                str = "status_white_list";
            } else {
                return;
            }
            r2.A04(str, join);
        }
    }

    public boolean A0H() {
        if (this.A04.A01("status_distribution") != null) {
            return true;
        }
        return false;
    }

    public boolean A0I(AnonymousClass3T1 r11) {
        int i;
        C18740tg.A0D(r11.A1J.A00 instanceof C177528dw, "isStatusExpired should be called for statuses only");
        if (r11.A0J() instanceof C177638e7) {
            AnonymousClass3SA A002 = this.A05.A00(r11);
            if (!A002.A00()) {
                StringBuilder sb = new StringBuilder();
                sb.append("StatusStore/isStatusExpired/is new status psa/campaign id: ");
                sb.append(A002.A04);
                sb.append(", campaign first seen time: ");
                sb.append(A002.A01);
                sb.append(", campaign expiration time:");
                sb.append(A002.A00);
                Log.i(sb.toString());
                if (!A002.A01(C19970wo.A00(this.A01)) || A002.A04 == null) {
                    return false;
                }
                return true;
            }
            C219612i r3 = this.A04;
            long A003 = r3.A00("status_psa_viewed_time", 0);
            long A004 = r3.A00("status_psa_exipration_time", 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("StatusStore/isStatusExpired/is legacy status psa/psa seen ts: ");
            sb2.append(A003);
            sb2.append(", psa expire ts: ");
            sb2.append(A004);
            Log.i(sb2.toString());
            if (r11.A0I >= A003 || A004 == 0) {
                return false;
            }
            i = (A004 > C19970wo.A00(this.A01) ? 1 : (A004 == C19970wo.A00(this.A01) ? 0 : -1));
        } else {
            i = (r11.A0I > (C19970wo.A00(this.A01) - 86400000) ? 1 : (r11.A0I == (C19970wo.A00(this.A01) - 86400000) ? 0 : -1));
        }
        if (i < 0) {
            return true;
        }
        return false;
    }

    public boolean A0J(AnonymousClass3T1 r3) {
        C65663Sz A082;
        if (r3.A1J.A02) {
            A082 = A07();
        } else {
            A082 = A08(r3.A0L());
        }
        if (A082 != null) {
            return A082.A0D(r3);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("statusmsgstore/isstatusunseen/no status for ");
        sb.append(r3.A0L());
        Log.w(sb.toString());
        return false;
    }

    public AnonymousClass16E(C19700wN r2, C19970wo r3, C219712j r4, AnonymousClass12P r5, C219612i r6, AnonymousClass16F r7, C20810yC r8, AnonymousClass16G r9, AnonymousClass005 r10) {
        this.A09 = r8;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
        this.A04 = r6;
        this.A07 = r10;
        this.A03 = r5;
        this.A05 = r7;
        this.A06 = r9;
    }

    public static void A01(ContentValues contentValues, C65663Sz r3) {
        long j;
        long j2;
        long j3;
        long j4;
        contentValues.put("message_table_id", Long.valueOf(r3.A04()));
        synchronized (r3) {
            j = r3.A05;
        }
        contentValues.put("last_read_message_table_id", Long.valueOf(j));
        synchronized (r3) {
            j2 = r3.A06;
        }
        contentValues.put("last_read_receipt_sent_message_table_id", Long.valueOf(j2));
        synchronized (r3) {
            j3 = r3.A03;
        }
        contentValues.put("first_unread_message_table_id", Long.valueOf(j3));
        synchronized (r3) {
            j4 = r3.A02;
        }
        contentValues.put("autodownload_limit_message_table_id", Long.valueOf(j4));
        contentValues.put("timestamp", Long.valueOf(r3.A05()));
        contentValues.put("unseen_count", Integer.valueOf(r3.A03()));
        contentValues.put("total_count", Integer.valueOf(r3.A02()));
    }

    public C65663Sz A07() {
        A03(this);
        ConcurrentHashMap concurrentHashMap = this.A0B;
        C18740tg.A06(concurrentHashMap);
        return (C65663Sz) concurrentHashMap.get(C223613z.A00);
    }

    public ArrayList A09() {
        A03(this);
        ConcurrentHashMap concurrentHashMap = this.A0B;
        C18740tg.A06(concurrentHashMap);
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        for (C65663Sz r1 : concurrentHashMap.values()) {
            if (!r1.A0C()) {
                arrayList.add(r1.A06());
            }
        }
        return arrayList;
    }

    public Map A0C() {
        A03(this);
        ConcurrentHashMap concurrentHashMap = this.A0B;
        C18740tg.A06(concurrentHashMap);
        if (concurrentHashMap.isEmpty()) {
            Log.e("StatusStore is empty");
        }
        ConcurrentHashMap concurrentHashMap2 = this.A0B;
        C18740tg.A06(concurrentHashMap2);
        return Collections.unmodifiableMap(concurrentHashMap2);
    }

    public boolean A0G() {
        if (A05() != 1 || !A0A().isEmpty()) {
            return false;
        }
        return true;
    }
}
