package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: X.0xu  reason: invalid class name and case insensitive filesystem */
public class C20650xu implements AnonymousClass00M {
    public static final int[] A0P = {105, 118, 103, 97, 100, C65953Uc.A03, 111};
    public static final Pattern A0Q = Pattern.compile("((?<= )|(?= ))");
    public Map A00;
    public final C19700wN A01;
    public final C19730wQ A02;
    public final AnonymousClass171 A03;
    public final C18820ts A04;
    public final AnonymousClass1A3 A05;
    public final AnonymousClass163 A06;
    public final AnonymousClass1A5 A07;
    public final AnonymousClass1A4 A08;
    public final C219712j A09;
    public final AnonymousClass168 A0A;
    public final C220612s A0B;
    public final AnonymousClass12P A0C;
    public final AnonymousClass161 A0D;
    public final C20810yC A0E;
    public final C21690ze A0F;
    public final boolean A0G;
    public final AnonymousClass164 A0H;
    public final AnonymousClass16D A0I;
    public final C220412q A0J;
    public final C219612i A0K;
    public final AnonymousClass1A2 A0L;
    public final AnonymousClass1AW A0M;
    public final AnonymousClass1A1 A0N;
    public final AnonymousClass005 A0O;

    private synchronized Map A06() {
        if (this.A00 == null) {
            this.A00 = new HashMap();
            for (C23057B2d b2d : (Set) this.A0O.get()) {
                String BER = b2d.BER();
                if (this.A00.containsKey(BER)) {
                    C18740tg.A0D(false, "Namespace already registered");
                }
                this.A00.put(BER, b2d);
            }
        }
        return this.A00;
    }

    public AnonymousClass3T1 A0C(Cursor cursor, int i, int i2) {
        try {
            long j = cursor.getLong(i2);
            AnonymousClass11F A0A2 = this.A06.A0A(cursor.getLong(i));
            if ((A0A2 instanceof C177528dw) || A0A2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/missing cursor chatjid; rowId=");
                sb.append(j);
                Log.e(sb.toString());
                return null;
            }
            try {
                AnonymousClass3T1 A012 = this.A0N.A01(cursor, A0A2);
                if (A012 != null) {
                    return A012;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/null message; rowId=");
                sb2.append(j);
                Log.e(sb2.toString());
                return null;
            } catch (AssertionError | ClassCastException e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/bad message; rowId=");
                sb3.append(j);
                Log.e(sb3.toString(), e);
                return null;
            }
        } catch (Exception e2) {
            Log.e("FtsMessageStore/FtsMessageStoreMigration/getMessageForFtsFromCursor/failed on cursor", e2);
            return null;
        }
    }

    public void A0K(AnonymousClass3T1 r7) {
        AnonymousClass3T1 r1 = r7;
        A0B(r1, Collections.emptyMap(), A09(), false);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        r14 = new X.C64203Nb(1, r2.A02.A05("messages_fts", "INSERT_FTS_DEPRECATED_MESSAGE", r7), r14.A01);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0031 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C64203Nb A00(X.C64203Nb r14, X.C20650xu r15, java.lang.String r16) {
        /*
            java.lang.String r6 = "docid"
            X.12P r0 = r15.A0C
            X.1M0 r2 = r0.A05()
            r0 = 2
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x004f }
            r7.<init>(r0)     // Catch:{ all -> 0x004f }
            long r0 = r14.A02     // Catch:{ all -> 0x004f }
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x004f }
            r7.put(r6, r3)     // Catch:{ all -> 0x004f }
            java.lang.String r3 = "content"
            r4 = r16
            r7.put(r3, r4)     // Catch:{ all -> 0x004f }
            X.14e r5 = r2.A02     // Catch:{ SQLiteConstraintException -> 0x0031 }
            java.lang.String r4 = "messages_fts"
            java.lang.String r3 = "INSERT_FTS_DEPRECATED_MESSAGE"
            long r10 = r5.A05(r4, r3, r7)     // Catch:{ SQLiteConstraintException -> 0x0031 }
            long r12 = r14.A01     // Catch:{ SQLiteConstraintException -> 0x0031 }
            r9 = 1
            X.3Nb r8 = new X.3Nb     // Catch:{ SQLiteConstraintException -> 0x0031 }
            r8.<init>(r9, r10, r12)     // Catch:{ SQLiteConstraintException -> 0x0031 }
            goto L_0x004a
        L_0x0031:
            r7.remove(r6)     // Catch:{ all -> 0x004f }
            X.14e r6 = r2.A02     // Catch:{ all -> 0x004f }
            java.lang.String r8 = "messages_fts"
            java.lang.String r9 = "docid = ?"
            r3 = 1
            java.lang.String[] r11 = new java.lang.String[r3]     // Catch:{ all -> 0x004f }
            r3 = 0
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x004f }
            r11[r3] = r0     // Catch:{ all -> 0x004f }
            java.lang.String r10 = "UPDATE_FTS_DEPRECATED_MESSAGE"
            r6.A01(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x004f }
            goto L_0x004b
        L_0x004a:
            r14 = r8
        L_0x004b:
            r2.close()
            return r14
        L_0x004f:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0054 }
            throw r1
        L_0x0054:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20650xu.A00(X.3Nb, X.0xu, java.lang.String):X.3Nb");
    }

    public static C64203Nb A01(C20650xu r8, String str, String str2, String[] strArr) {
        int i;
        Cursor A092;
        try {
            AnonymousClass1M0 A042 = r8.A0C.get();
            try {
                A092 = A042.A02.A09(str, str2, strArr);
                if (A092.moveToNext()) {
                    C64203Nb r4 = new C64203Nb(1, A092.getLong(A092.getColumnIndexOrThrow("docid")), A092.getLong(A092.getColumnIndexOrThrow("_id")));
                    A092.close();
                    A042.close();
                    return r4;
                }
                A092.close();
                A042.close();
                i = -4;
                return C64203Nb.A00(i);
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
            throw th;
        } catch (SQLiteException e) {
            if (e.getMessage() == null || !e.getMessage().contains("FTS expression tree is too large")) {
                StringBuilder sb = new StringBuilder();
                sb.append("FtsMessageStore/getRowIdForJidSearch/error/");
                sb.append(str2);
                Log.e(sb.toString(), e);
                i = -3;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FtsMessageStore/getRowIdForJidSearch/too-large/");
                sb2.append(str2);
                Log.e(sb2.toString(), e);
                i = -2;
            }
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public static String A02(C02680Bk r10, C20650xu r11, AnonymousClass1S3 r12, String str) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        for (Map.Entry entry : r11.A06().entrySet()) {
            if (A07(r10)) {
                break;
            }
            String str2 = (String) entry.getKey();
            AnonymousClass9IU BES = ((C23057B2d) entry.getValue()).BES(r12);
            if (BES != null) {
                for (String str3 : BES.A00) {
                    if (A07(r10)) {
                        break;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("fts_namespace:");
                    sb.append(str2);
                    sb.append(str3);
                    arrayList.add(sb.toString());
                    z2 = true;
                }
                for (String str4 : BES.A01) {
                    if (A07(r10)) {
                        break;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fts_namespace:-");
                    sb2.append(str2);
                    sb2.append(str4);
                    arrayList.add(sb2.toString());
                    z = true;
                }
            }
        }
        if (A07(r10) || !z || z2 || !TextUtils.isEmpty(str)) {
            String join = TextUtils.join(" ", arrayList);
            if (TextUtils.isEmpty(join)) {
                return str;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(" ");
            sb3.append(join);
            return sb3.toString();
        }
        throw new IllegalStateException("Compiled FTS query comprised entirely of NOTs");
    }

    public static String A03(C20650xu r6, AnonymousClass3T1 r7) {
        Set<String> BE3;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : r6.A06().entrySet()) {
            if (!(entry == null || entry.getValue() == null || (BE3 = ((C23057B2d) entry.getValue()).BE3(r7)) == null)) {
                String str = (String) entry.getKey();
                for (String str2 : BE3) {
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(str2);
                        arrayList.add(sb.toString());
                    }
                }
            }
        }
        return TextUtils.join(" ", arrayList);
    }

    public static String A04(AnonymousClass37E r4, String str) {
        String str2;
        String str3 = "";
        if (r4 == null) {
            str2 = str3;
        } else {
            str2 = r4.A00;
            str3 = r4.A01;
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            str2 = sb.toString();
        }
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(" ");
        sb2.append(str3);
        return sb2.toString();
    }

    public static String A05(List list, List list2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT ");
        sb2.append(C56842wy.A01);
        sb2.append(" FROM ");
        sb2.append("message_view AS message JOIN ( ");
        sb.append(sb2.toString());
        sb.append("SELECT message_row_id FROM labeled_messages JOIN labels ON labeled_messages.label_id = labels._id WHERE label_name = ?");
        list2.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sb.append(" INTERSECT ");
            sb.append("SELECT message_row_id FROM labeled_messages JOIN labels ON labeled_messages.label_id = labels._id WHERE label_name = ?");
            list2.add(list.get(i));
        }
        sb.append(") ON message._id = message_row_id");
        return sb.toString();
    }

    public static boolean A07(C02680Bk r1) {
        if (r1 == null || !r1.A06()) {
            return false;
        }
        return true;
    }

    public static boolean A08(AnonymousClass3T1 r2, boolean z) {
        AnonymousClass11F r1 = r2.A1J.A00;
        if (r1 == null || (r1 instanceof C177528dw) || (r1 instanceof C28981Uw) || (r2 instanceof AnonymousClass5J9) || (r2 instanceof C106255Iy) || (r2 instanceof AnonymousClass2bH) || (r2 instanceof AnonymousClass2bY) || ((!z && (r2 instanceof C46962bx)) || (r2 instanceof AnonymousClass2bI) || (r2 instanceof C46892bq) || (r2 instanceof C47012ca) || (r2 instanceof AnonymousClass2cX) || (r2 instanceof C46802bh))) {
            return true;
        }
        return false;
    }

    public long A09() {
        long A002 = this.A0K.A00("fts_ready", 0);
        long j = 1;
        if (!(A002 == 1 || A002 == 3)) {
            j = 5;
            if (!(A002 == 0 || A002 == 2 || A002 == 5)) {
                C18740tg.A0D(false, "Unknown Fts version, using V2");
            }
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006c, code lost:
        if (r0.isEmpty() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04a2, code lost:
        if ((r1 instanceof android.os.OperationCanceledException) == false) goto L_0x04de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A0A(X.C02680Bk r22, X.AnonymousClass1S3 r23, java.lang.Integer r24) {
        /*
            r21 = this;
            java.lang.String r7 = "fts_done"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r10 = r23
            X.11F r1 = r10.A04
            r0 = 0
            if (r1 == 0) goto L_0x000f
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0388
            java.lang.String r0 = "FtsMessageStore/search-with-jid/"
        L_0x0013:
            r2.append(r0)
            java.lang.String r0 = r10.A02()
            int r0 = r0.length()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            X.14g r6 = new X.14g
            r6.<init>((java.lang.String) r0)
            r9 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.util.Pair r5 = new android.util.Pair
            r5.<init>(r1, r0)
            r4 = r21
            boolean r0 = r4.A0N()
            r8 = r24
            if (r0 != 0) goto L_0x0053
            X.0ze r1 = r4.A0F
            java.lang.String r0 = "fts_not_ready"
            X.AnonymousClass6R7.A01(r1, r8, r0)
            java.lang.String r0 = "FtsMessageStore not ready"
        L_0x004c:
            r6.A02(r0)
            r6.A01()
            return r5
        L_0x0053:
            r20 = r22
            boolean r0 = A07(r20)
            java.lang.String r18 = "cancelled"
            java.lang.String r3 = "fts_cancelled"
            if (r0 != 0) goto L_0x037f
            long r14 = r4.A09()
            java.util.List r0 = r10.A0C
            if (r0 == 0) goto L_0x006e
            boolean r0 = r0.isEmpty()
            r2 = 1
            if (r0 == 0) goto L_0x006f
        L_0x006e:
            r2 = 0
        L_0x006f:
            java.lang.String r13 = "FTS_QUERY"
            r11 = 1
            java.util.List r0 = r10.A03()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r2 != 0) goto L_0x009b
            if (r0 != 0) goto L_0x0296
            int r1 = r10.A02
            r0 = 0
            if (r1 == 0) goto L_0x0087
            r0 = 1
        L_0x0087:
            if (r0 != 0) goto L_0x0296
            X.11F r1 = r10.A04
            r0 = 0
            if (r1 == 0) goto L_0x008f
            r0 = 1
        L_0x008f:
            if (r0 != 0) goto L_0x0296
            X.0ze r1 = r4.A0F
            java.lang.String r0 = "fts_empty"
            X.AnonymousClass6R7.A01(r1, r8, r0)
            java.lang.String r0 = "empty"
            goto L_0x004c
        L_0x009b:
            if (r0 != 0) goto L_0x00cf
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.List r0 = r10.A0C
            if (r0 != 0) goto L_0x00b0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x00b0:
            java.lang.String r0 = A05(r0, r11)
            r1.append(r0)
            java.lang.String r0 = " ORDER BY message._id DESC"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String[] r0 = new java.lang.String[r9]
            java.lang.Object[] r0 = r11.toArray(r0)
            android.util.Pair r14 = new android.util.Pair
            r14.<init>(r1, r0)
            java.lang.String r13 = "FTS_QUERY_WITH_LABEL"
            goto L_0x02d5
        L_0x00cf:
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0261
            X.168 r11 = r4.A0A
            java.util.List r1 = r10.A0C
            if (r1 != 0) goto L_0x00de
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x00de:
            java.lang.String[] r0 = new java.lang.String[r9]
            java.lang.Object[] r13 = r1.toArray(r0)
            java.lang.String[] r13 = (java.lang.String[]) r13
            java.util.HashSet r17 = new java.util.HashSet
            r17.<init>()
            X.12P r0 = r11.A01
            X.1M0 r16 = r0.get()
            r0 = r16
            X.14e r0 = r0.A02     // Catch:{ all -> 0x0398 }
            r19 = r0
            int r15 = r1.size()     // Catch:{ all -> 0x0398 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0398 }
            r14.<init>()     // Catch:{ all -> 0x0398 }
            java.lang.String r12 = "SELECT jid_row_id FROM labeled_jid JOIN labels ON labeled_jid.label_id = labels._id WHERE label_name = ?"
            r14.append(r12)     // Catch:{ all -> 0x0398 }
            r1 = 1
        L_0x0106:
            if (r1 >= r15) goto L_0x0113
            java.lang.String r0 = " INTERSECT "
            r14.append(r0)     // Catch:{ all -> 0x0398 }
            r14.append(r12)     // Catch:{ all -> 0x0398 }
            int r1 = r1 + 1
            goto L_0x0106
        L_0x0113:
            java.lang.String r12 = r14.toString()     // Catch:{ all -> 0x0398 }
            java.lang.String r1 = "ASSEMBLE_MULTIPLE_SEARCH_LABELED_JID"
            r0 = r19
            android.database.Cursor r12 = r0.A09(r12, r1, r13)     // Catch:{ all -> 0x0398 }
            java.lang.String r0 = "jid_row_id"
            int r13 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x038c }
        L_0x0125:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x038c }
            if (r0 == 0) goto L_0x0141
            long r0 = r12.getLong(r13)     // Catch:{ all -> 0x038c }
            X.12j r15 = r11.A00     // Catch:{ all -> 0x038c }
            java.lang.Class<X.11F> r14 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r1 = r15.A0C(r14, r0)     // Catch:{ all -> 0x038c }
            X.11F r1 = (X.AnonymousClass11F) r1     // Catch:{ all -> 0x038c }
            if (r1 == 0) goto L_0x0125
            r0 = r17
            r0.add(r1)     // Catch:{ all -> 0x038c }
            goto L_0x0125
        L_0x0141:
            r12.close()     // Catch:{ all -> 0x0398 }
            r16.close()
            int r0 = r17.size()
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>(r0)
            java.util.Iterator r11 = r17.iterator()
        L_0x0154:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x016e
            java.lang.Object r1 = r11.next()
            X.11F r1 = (X.AnonymousClass11F) r1
            X.163 r0 = r4.A06
            long r0 = r0.A08(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r14.add(r0)
            goto L_0x0154
        L_0x016e:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List r0 = r10.A0C
            if (r0 != 0) goto L_0x017c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x017c:
            java.lang.String r13 = A05(r0, r11)
            java.util.List r0 = r10.A03()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0228
            java.lang.String r0 = r10.A02()
            java.lang.String r12 = r4.A0H(r0)
        L_0x0194:
            X.C18740tg.A06(r12)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            java.lang.String r0 = " JOIN messages_fts ON docid = message._id WHERE messages_fts.content MATCH ?"
            r1.append(r0)
            java.lang.String r13 = r1.toString()
            r11.add(r12)
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x0242
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            java.lang.String r0 = " UNION "
            r1.append(r0)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "SELECT "
            r13.append(r0)
            java.lang.String r0 = X.C56842wy.A01
            r13.append(r0)
            java.lang.String r0 = " FROM "
            r13.append(r0)
            java.lang.String r0 = "available_message_view AS message JOIN messages_fts AS messages_fts ON messages_fts.docid = message.sort_id"
            r13.append(r0)
            java.lang.String r0 = " WHERE content MATCH ?"
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            r11.add(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r0)
            java.lang.String r0 = " AND chat_row_id in ("
            r12.append(r0)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.util.Iterator r0 = r14.iterator()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x022b
            r16 = 1
            java.util.Iterator r15 = r14.iterator()
        L_0x0205:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x022b
            java.lang.Object r14 = r15.next()
            if (r14 == 0) goto L_0x0205
            if (r16 == 0) goto L_0x0222
            r16 = 0
        L_0x0215:
            java.lang.String r0 = "?"
            r13.append(r0)
            java.lang.String r0 = java.lang.String.valueOf(r14)
            r11.add(r0)
            goto L_0x0205
        L_0x0222:
            java.lang.String r0 = ", "
            r13.append(r0)
            goto L_0x0215
        L_0x0228:
            r12 = 0
            goto L_0x0194
        L_0x022b:
            java.lang.String r0 = r13.toString()
            r12.append(r0)
            java.lang.String r0 = ")"
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            r1.append(r0)
            java.lang.String r13 = r1.toString()
        L_0x0242:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            java.lang.String r0 = " ORDER BY message._id DESC"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String[] r0 = new java.lang.String[r9]
            java.lang.Object[] r0 = r11.toArray(r0)
            android.util.Pair r14 = new android.util.Pair
            r14.<init>(r1, r0)
            java.lang.String r13 = "FTS_DEPRECATED_QUERY_WITH_LABEL"
            goto L_0x02d5
        L_0x0261:
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r0 = r20
            java.lang.String r0 = r4.A0E(r0, r10, r8)
            r1[r9] = r0
            X.0yC r12 = r4.A0E
            r11 = 6261(0x1875, float:8.774E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r12, r11)
            if (r0 == 0) goto L_0x037b
            java.lang.String r0 = X.AnonymousClass2x9.A07
        L_0x027a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r0)
            X.0wQ r0 = r4.A02
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x0377
            java.lang.String r0 = " ORDER BY timestamp DESC"
        L_0x0289:
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            android.util.Pair r14 = new android.util.Pair
            r14.<init>(r0, r1)
            goto L_0x02d5
        L_0x0296:
            X.11F r0 = r10.A04
            r1 = 0
            if (r0 == 0) goto L_0x029c
            r1 = 1
        L_0x029c:
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x030c
            if (r0 != 0) goto L_0x0261
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.AnonymousClass2x9.A05
            r1.append(r0)
            java.lang.String r0 = " ORDER BY docid DESC"
            r1.append(r0)
            java.lang.String r11 = r1.toString()
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            java.util.List r0 = r10.A03()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x030a
            java.lang.String r0 = r10.A02()
            java.lang.String r0 = r4.A0H(r0)
        L_0x02cc:
            r1[r9] = r0
            android.util.Pair r14 = new android.util.Pair
            r14.<init>(r11, r1)
            java.lang.String r13 = "FTS_DEPRECATED_QUERY"
        L_0x02d5:
            boolean r0 = A07(r20)
            if (r0 != 0) goto L_0x037f
            java.lang.Object r1 = r14.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r14 = r14.second
            java.lang.String[] r14 = (java.lang.String[]) r14
            java.lang.String r0 = "compiled"
            r6.A02(r0)
            X.0ze r11 = r4.A0F
            X.AnonymousClass6R7.A01(r11, r8, r0)
            boolean r0 = r1.isEmpty()
            r12 = 1
            r15 = r0 ^ 1
            java.lang.String r0 = "FtsMessageStore/search/sql empty"
            X.C18740tg.A0D(r15, r0)
            int r0 = r10.A01
            if (r0 != 0) goto L_0x02fe
            r12 = 0
        L_0x02fe:
            java.lang.String r0 = "FtsMessageStore/refusing to query unbounded search"
            X.C18740tg.A0D(r12, r0)
            int r0 = r10.A01
            int r12 = r10.A00
            int r0 = r0 * r12
            goto L_0x039d
        L_0x030a:
            r0 = 0
            goto L_0x02cc
        L_0x030c:
            if (r0 != 0) goto L_0x0261
            java.util.List r0 = r10.A03()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x031e
            java.lang.String r0 = "no jid v1"
            goto L_0x004c
        L_0x031e:
            X.11F r1 = r10.A04
            r13 = 1
            r0 = 0
            if (r1 == 0) goto L_0x0325
            r0 = 1
        L_0x0325:
            X.C18740tg.A0C(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.AnonymousClass2x9.A04
            r1.append(r0)
            java.lang.String r0 = " ORDER BY "
            r1.append(r0)
            java.lang.String r0 = "_id"
            r1.append(r0)
            java.lang.String r0 = " DESC"
            r1.append(r0)
            java.lang.String r12 = r1.toString()
            r0 = 2
            java.lang.String[] r11 = new java.lang.String[r0]
            java.util.List r0 = r10.A03()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0375
            java.lang.String r0 = r10.A02()
            java.lang.String r0 = r4.A0H(r0)
        L_0x035c:
            r11[r9] = r0
            X.163 r1 = r4.A06
            X.11F r0 = r10.A04
            long r0 = r1.A08(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11[r13] = r0
            android.util.Pair r14 = new android.util.Pair
            r14.<init>(r12, r11)
            java.lang.String r13 = "FTS_DEPRECATED_QUERY_WITH_JID"
            goto L_0x02d5
        L_0x0375:
            r0 = 0
            goto L_0x035c
        L_0x0377:
            java.lang.String r0 = " ORDER BY docid DESC"
            goto L_0x0289
        L_0x037b:
            java.lang.String r0 = X.AnonymousClass2x9.A06
            goto L_0x027a
        L_0x037f:
            X.0ze r0 = r4.A0F
            X.AnonymousClass6R7.A01(r0, r8, r3)
            r0 = r18
            goto L_0x004c
        L_0x0388:
            java.lang.String r0 = "FtsMessageStore/search/"
            goto L_0x0013
        L_0x038c:
            r1 = move-exception
            if (r12 == 0) goto L_0x0397
            r12.close()     // Catch:{ all -> 0x0393 }
            goto L_0x0397
        L_0x0393:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0398 }
        L_0x0397:
            throw r1     // Catch:{ all -> 0x0398 }
        L_0x0398:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x04da }
            throw r1
        L_0x039d:
            X.12P r12 = r4.A0C     // Catch:{ SQLiteDatabaseCorruptException -> 0x0495, 02S -> 0x04a4, SQLiteException -> 0x044c, Exception -> 0x049f }
            X.1M0 r12 = r12.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0495, 02S -> 0x04a4, SQLiteException -> 0x044c, Exception -> 0x049f }
            X.14e r9 = r12.A02     // Catch:{ all -> 0x0441 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0441 }
            r15.<init>()     // Catch:{ all -> 0x0441 }
            r15.append(r1)     // Catch:{ all -> 0x0441 }
            java.lang.String r1 = "  LIMIT "
            r15.append(r1)     // Catch:{ all -> 0x0441 }
            int r1 = r10.A01     // Catch:{ all -> 0x0441 }
            r15.append(r1)     // Catch:{ all -> 0x0441 }
            java.lang.String r1 = " OFFSET "
            r15.append(r1)     // Catch:{ all -> 0x0441 }
            r15.append(r0)     // Catch:{ all -> 0x0441 }
            java.lang.String r1 = r15.toString()     // Catch:{ all -> 0x0441 }
            r0 = r20
            X.1lC r10 = r9.A0B(r0, r1, r13, r14)     // Catch:{ all -> 0x0441 }
            r9 = 0
        L_0x03ca:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0435 }
            if (r0 == 0) goto L_0x042e
            boolean r0 = A07(r20)     // Catch:{ all -> 0x0435 }
            if (r0 == 0) goto L_0x03ef
            X.AnonymousClass6R7.A01(r11, r8, r3)     // Catch:{ all -> 0x0435 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0435 }
            java.lang.Object r0 = r5.second     // Catch:{ all -> 0x0435 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0435 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0435 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x0435 }
            r0 = r18
            r6.A02(r0)     // Catch:{ all -> 0x0435 }
            r6.A01()     // Catch:{ all -> 0x0435 }
            goto L_0x0427
        L_0x03ef:
            X.1A1 r0 = r4.A0N     // Catch:{ all -> 0x0435 }
            X.3T1 r13 = r0.A00(r10)     // Catch:{ all -> 0x0435 }
            int r9 = r9 + 1
            if (r13 == 0) goto L_0x03ca
            int r0 = r13.A0E()     // Catch:{ all -> 0x0435 }
            r14 = 1
            if (r0 == r14) goto L_0x040b
            X.1A4 r0 = r4.A08     // Catch:{ all -> 0x0435 }
            long r0 = r0.A00     // Catch:{ all -> 0x0435 }
            boolean r0 = X.C66013Ui.A0v(r13, r0)     // Catch:{ all -> 0x0435 }
            if (r0 == 0) goto L_0x040b
            r14 = 0
        L_0x040b:
            if (r14 == 0) goto L_0x03ca
            X.12q r1 = r4.A0J     // Catch:{ all -> 0x0435 }
            X.3Qa r0 = r13.A1J     // Catch:{ all -> 0x0435 }
            X.11F r0 = r0.A00     // Catch:{ all -> 0x0435 }
            boolean r0 = r1.A0Q(r0)     // Catch:{ all -> 0x0435 }
            if (r0 != 0) goto L_0x03ca
            boolean r0 = A08(r13, r2)     // Catch:{ all -> 0x0435 }
            if (r0 != 0) goto L_0x03ca
            java.lang.Object r0 = r5.second     // Catch:{ all -> 0x0435 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0435 }
            r0.add(r13)     // Catch:{ all -> 0x0435 }
            goto L_0x03ca
        L_0x0427:
            r10.close()     // Catch:{ all -> 0x043f }
            r12.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0495, 02S -> 0x04a4, SQLiteException -> 0x044c, Exception -> 0x049f }
            return r3
        L_0x042e:
            r10.close()     // Catch:{ all -> 0x043f }
            r12.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0495, 02S -> 0x04a4, SQLiteException -> 0x044c, Exception -> 0x049f }
            goto L_0x04a4
        L_0x0435:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x043a }
            goto L_0x043e
        L_0x043a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x043f }
        L_0x043e:
            throw r1     // Catch:{ all -> 0x043f }
        L_0x043f:
            r1 = move-exception
            goto L_0x0443
        L_0x0441:
            r1 = move-exception
            r9 = 0
        L_0x0443:
            r12.close()     // Catch:{ all -> 0x0447 }
            goto L_0x044b
        L_0x0447:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0495, 02S -> 0x04a4, SQLiteException -> 0x044c, Exception -> 0x049f }
        L_0x044b:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0495, 02S -> 0x04a4, SQLiteException -> 0x044c, Exception -> 0x049f }
        L_0x044c:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x047e
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "FTS expression tree is too large"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x047e
            java.lang.String r0 = "FtsMessageStore/search/error/query-too-large"
            com.whatsapp.util.Log.e(r0, r2)
            java.lang.String r0 = "fts_query_too_large"
            X.AnonymousClass6R7.A01(r11, r8, r0)
            r0 = -2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r5.second
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r1, r0)
            java.lang.String r0 = "query-too-large"
        L_0x0477:
            r6.A02(r0)
            r6.A01()
            return r3
        L_0x047e:
            java.lang.String r0 = "FtsMessageStore/search/error"
            com.whatsapp.util.Log.e(r0, r2)
            X.AnonymousClass6R7.A01(r11, r8, r7)
            r0 = -3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r5.second
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r1, r0)
            java.lang.String r0 = "error"
            goto L_0x0477
        L_0x0495:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.12s r0 = r4.A0B
            r0.A03()
            goto L_0x04a4
        L_0x049f:
            r1 = move-exception
            boolean r0 = r1 instanceof android.os.OperationCanceledException
            if (r0 == 0) goto L_0x04de
        L_0x04a4:
            X.AnonymousClass6R7.A01(r11, r8, r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "found: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "|:"
            r1.append(r0)
            java.lang.Object r0 = r5.second
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r5.second
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r1, r0)
            r6.A02(r2)
            r6.A01()
            return r3
        L_0x04da:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x04de:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20650xu.A0A(X.0Bk, X.1S3, java.lang.Integer):android.util.Pair");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:9|(2:11|(1:23)(1:15))|16|(1:(1:19)(1:21))(1:22)|20|24|25|26|27|28|29|30|32|(1:47)(2:36|37)) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f7, code lost:
        r11 = new X.C64203Nb(1, r3.A02.A05("message_ftsv2", "INSERT_FTS_MESSAGE", r13), r12.A01);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00dc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C64203Nb A0B(X.AnonymousClass3T1 r21, java.util.Map r22, long r23, boolean r25) {
        /*
            r20 = this;
            r2 = r20
            if (r25 != 0) goto L_0x0010
            boolean r0 = r2.A0N()
            if (r0 != 0) goto L_0x0010
            r0 = -5
        L_0x000b:
            X.3Nb r11 = X.C64203Nb.A00(r0)
        L_0x000f:
            return r11
        L_0x0010:
            r3 = r21
            X.3Qa r8 = r3.A1J
            X.11F r9 = r8.A00
            r0 = 0
            boolean r0 = A08(r3, r0)
            if (r0 == 0) goto L_0x001f
            r0 = -6
            goto L_0x000b
        L_0x001f:
            java.lang.String r4 = r2.A0G(r3)
            long r0 = r3.A1O
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = r22
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x004f
            int r1 = r4.length()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 >= r0) goto L_0x0089
            java.util.regex.Pattern r0 = X.C1906699v.A00
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r0 = r0.find()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0089
            X.0ts r0 = r2.A04
            java.lang.String r1 = X.C202859mm.A01(r0, r4)
        L_0x004f:
            X.11F r4 = r3.A0J()
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r10 = X.C222813r.A00(r4)
            java.lang.String r7 = A03(r2, r3)
            long r5 = r3.A1O
            long r3 = r3.A1N
            r13 = 1
            X.3Nb r0 = new X.3Nb
            r11 = r0
            r12 = r0
            r14 = r5
            r16 = r3
            r12.<init>(r13, r14, r16)
            boolean r3 = r8.A02
            java.lang.String r8 = "docid"
            if (r10 != 0) goto L_0x0084
            if (r3 == 0) goto L_0x0081
            java.lang.String r10 = "1"
        L_0x0076:
            java.lang.String r9 = r2.A0F(r9)
            X.12P r3 = r2.A0C
            X.1M0 r3 = r3.A05()
            goto L_0x0095
        L_0x0081:
            java.lang.String r10 = "0"
            goto L_0x0076
        L_0x0084:
            java.lang.String r10 = r2.A0F(r10)
            goto L_0x0076
        L_0x0089:
            X.164 r1 = r2.A0H
            com.whatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob r0 = new com.whatsapp.jobqueue.job.messagejob.AsyncMessageTokenizationJob
            r0.<init>(r3)
            r1.A01(r0)
            r1 = r4
            goto L_0x004f
        L_0x0095:
            r4 = 4
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x010c }
            r13.<init>(r4)     // Catch:{ all -> 0x010c }
            java.lang.String r4 = "content"
            r13.put(r4, r1)     // Catch:{ all -> 0x010c }
            java.lang.String r6 = "fts_jid"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x010c }
            r5.<init>()     // Catch:{ all -> 0x010c }
            r5.append(r10)     // Catch:{ all -> 0x010c }
            java.lang.String r4 = " "
            r5.append(r4)     // Catch:{ all -> 0x010c }
            r5.append(r9)     // Catch:{ all -> 0x010c }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x010c }
            r13.put(r6, r4)     // Catch:{ all -> 0x010c }
            java.lang.String r4 = "fts_namespace"
            r13.put(r4, r7)     // Catch:{ all -> 0x010c }
            long r6 = r0.A02     // Catch:{ all -> 0x010c }
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x010c }
            r13.put(r8, r4)     // Catch:{ all -> 0x010c }
            X.14e r9 = r3.A02     // Catch:{ SQLiteConstraintException -> 0x00dc }
            java.lang.String r5 = "message_ftsv2"
            java.lang.String r4 = "INSERT_FTS_MESSAGE"
            long r16 = r9.A05(r5, r4, r13)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            long r4 = r0.A01     // Catch:{ SQLiteConstraintException -> 0x00dc }
            r15 = 1
            X.3Nb r14 = new X.3Nb     // Catch:{ SQLiteConstraintException -> 0x00dc }
            r18 = r4
            r14.<init>(r15, r16, r18)     // Catch:{ SQLiteConstraintException -> 0x00dc }
            goto L_0x00f7
        L_0x00dc:
            r13.remove(r8)     // Catch:{ all -> 0x010c }
            X.14e r12 = r3.A02     // Catch:{ all -> 0x010c }
            java.lang.String r14 = "message_ftsv2"
            java.lang.String r15 = "docid = ?"
            r4 = 1
            java.lang.String[] r8 = new java.lang.String[r4]     // Catch:{ all -> 0x010c }
            r5 = 0
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x010c }
            r8[r5] = r4     // Catch:{ all -> 0x010c }
            java.lang.String r16 = "UPDATE_FTS_MESSAGE"
            r17 = r8
            r12.A01(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x010c }
            goto L_0x00f8
        L_0x00f7:
            r11 = r14
        L_0x00f8:
            r3.close()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x000f
            r4 = 1
            int r3 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x000f
            X.3Nb r11 = A00(r0, r2, r1)
            return r11
        L_0x010c:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0111 }
            throw r1
        L_0x0111:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20650xu.A0B(X.3T1, java.util.Map, long, boolean):X.3Nb");
    }

    public AnonymousClass1S3 A0D(AnonymousClass11F r4) {
        AnonymousClass1S3 r2 = new AnonymousClass1S3(this.A04);
        r2.A04 = r4;
        if (AnonymousClass143.A0G(r4)) {
            List singletonList = Collections.singletonList(new C70893ft());
            if (r2.A0A != null) {
                Log.e("FtsQuery/cannot re-set contactPreFilter");
                return r2;
            }
            r2.A0A = singletonList;
            return r2;
        }
        r2.A0B = Collections.emptyList();
        return r2;
    }

    public String A0F(AnonymousClass11F r5) {
        return Long.toString(this.A09.A07(r5) + 10, 36);
    }

    public String A0G(AnonymousClass3T1 r10) {
        String A042;
        StringBuilder sb;
        BigDecimal bigDecimal;
        AnonymousClass11F r1;
        int i;
        UserJid userJid;
        AnonymousClass16X r0;
        String str;
        if (r10 instanceof C23043B1o) {
            C200259gz A012 = this.A0M.A01((C23043B1o) r10);
            if (A012 != null) {
                A042 = A012.A0A();
            }
        } else if (r10 instanceof C88854Uh) {
            A042 = ((C88854Uh) r10).BC7();
        } else if (r10 instanceof AnonymousClass2bV) {
            AnonymousClass2bV r102 = (AnonymousClass2bV) r10;
            boolean A1R = r102.A1R(8);
            A042 = r102.A0b();
            if (A1R) {
                A042 = A04(r102.A0T().A00, A042);
            } else {
                if (!TextUtils.isEmpty(r102.A05)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(A042);
                    sb2.append(" ");
                    sb2.append(r102.A05);
                    A042 = sb2.toString();
                }
                if (!TextUtils.isEmpty(r102.A04)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(A042);
                    sb3.append(" ");
                    sb3.append(r102.A04);
                    A042 = sb3.toString();
                }
                if (!TextUtils.isEmpty(r102.A06)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(A042);
                    sb4.append(" ");
                    sb4.append(r102.A06);
                    A042 = sb4.toString();
                }
                C202319lY r12 = r102.A0M;
                if (!(r12 == null || (r0 = r12.A08) == null)) {
                    BigDecimal bigDecimal2 = r0.A00;
                    String str2 = r12.A0I;
                    if (bigDecimal2 == null || TextUtils.isEmpty(bigDecimal2.toPlainString()) || TextUtils.isEmpty(str2)) {
                        str = null;
                    } else {
                        str = bigDecimal2.toPlainString();
                        try {
                            C132386Tk r4 = new C132386Tk(str2);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(str);
                            sb5.append(" ");
                            sb5.append(r4.A03(this.A04, bigDecimal2, true));
                            str = sb5.toString();
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(A042);
                        sb6.append(" ");
                        sb6.append(str);
                        A042 = sb6.toString();
                    }
                }
            }
        } else if (r10 instanceof AnonymousClass2bI) {
            AnonymousClass2bI r103 = (AnonymousClass2bI) r10;
            String A0b = TextUtils.isEmpty(r103.A0b()) ? "" : r103.A0b();
            if ((r103 instanceof C181248nA) && (userJid = ((C181248nA) r103).A01) != null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(A0b);
                sb7.append(" ");
                sb7.append(userJid.getRawString());
                A0b = sb7.toString();
            }
            if (r103 instanceof AnonymousClass2cG) {
                AnonymousClass2cG r42 = (AnonymousClass2cG) r103;
                if (!TextUtils.isEmpty(r42.A00) && (r1 = r103.A1J.A00) != null) {
                    AnonymousClass141 A0D2 = this.A0I.A0D(r1);
                    boolean z = true;
                    if (!A0D2.A0C() || !((i = A0D2.A08) == 2 || i == 1)) {
                        z = false;
                    }
                    if (!z) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(A042);
                        sb8.append(" ");
                        sb8.append(r42.A00);
                        A042 = sb8.toString();
                    }
                }
            }
        } else {
            if ((r10 instanceof C46882bp) || (r10 instanceof C47002cZ)) {
                if (r10 instanceof C46852bm) {
                    C46852bm r104 = (C46852bm) r10;
                    String str3 = r104.A09;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "";
                    }
                    String str4 = r104.A02;
                    if (!TextUtils.isEmpty(str4)) {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(str3);
                        sb9.append(" ");
                        sb9.append(str4);
                        str3 = sb9.toString();
                    }
                    String str5 = r104.A05;
                    if (!TextUtils.isEmpty(str5)) {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(str3);
                        sb10.append(" ");
                        sb10.append(str5);
                        str3 = sb10.toString();
                    }
                    if (!TextUtils.isEmpty(r104.A04)) {
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append(str3);
                        sb11.append(" ");
                        sb11.append(r104.A04);
                        str3 = sb11.toString();
                    }
                    if (r104.A0A != null && !TextUtils.isEmpty(r104.A03)) {
                        C132386Tk r7 = new C132386Tk(r104.A03);
                        C18820ts r5 = this.A04;
                        String A032 = r7.A03(r5, r104.A0A, true);
                        BigDecimal bigDecimal3 = r104.A0B;
                        if (!(bigDecimal3 == null || BigDecimal.ZERO.compareTo(bigDecimal3) == 0)) {
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append(A032);
                            sb12.append(" ");
                            sb12.append(r7.A03(r5, r104.A0B, true));
                            A032 = sb12.toString();
                        }
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append(A042);
                        sb13.append(" ");
                        sb13.append(A032);
                        A042 = sb13.toString();
                    }
                } else if (!r10.A1R(8)) {
                    A042 = ((AnonymousClass2bU) r10).A1a();
                }
            } else if (r10 instanceof C46902br) {
                A042 = ((C46902br) r10).A03;
            } else if (r10 instanceof C46972by) {
                if (!r10.A1R(8)) {
                    A042 = ((C46972by) r10).A1j();
                }
            } else if (r10 instanceof C46912bs) {
                if (!r10.A1R(8)) {
                    A042 = ((C46912bs) r10).A1a();
                }
            } else if (r10 instanceof AnonymousClass2bX) {
                A042 = ((AnonymousClass2bX) r10).A00;
            } else {
                if (r10 instanceof AnonymousClass2bW) {
                    List<AnonymousClass363> list = ((AnonymousClass2bW) r10).A01;
                    if (list == null) {
                        A042 = null;
                    } else {
                        sb = new StringBuilder();
                        for (AnonymousClass363 r02 : list) {
                            sb.append(r02.A01.A03());
                            sb.append(" ");
                        }
                    }
                } else if (r10 instanceof AnonymousClass2bQ) {
                    A042 = r10.A0c();
                } else if (r10 instanceof C46952bw) {
                    C46952bw r105 = (C46952bw) r10;
                    C18820ts r43 = this.A04;
                    String str6 = !TextUtils.isEmpty(r105.A08) ? r105.A08 : "";
                    if (!TextUtils.isEmpty(r105.A06)) {
                        StringBuilder sb14 = new StringBuilder();
                        sb14.append(str6);
                        sb14.append(" ");
                        sb14.append(r105.A06);
                        str6 = sb14.toString();
                    }
                    String str7 = r105.A05;
                    if (!(str7 == null || (bigDecimal = r105.A0A) == null)) {
                        sb = new StringBuilder();
                        sb.append(A042);
                        sb.append(" ");
                        sb.append(new C132386Tk(str7).A03(r43, bigDecimal, true));
                    }
                } else {
                    if (r10 instanceof AnonymousClass2bS) {
                        AnonymousClass2bS r106 = (AnonymousClass2bS) r10;
                        StringBuilder sb15 = new StringBuilder();
                        sb15.append(r106.A03);
                        if (this.A0G) {
                            for (AnonymousClass3PS r03 : r106.A05) {
                                sb15.append(" ");
                                sb15.append(r03.A03);
                            }
                        }
                        A042 = sb15.toString();
                    }
                }
                A042 = sb.toString();
            }
            A042 = A04(r10.A0T().A00, r10.A0b());
        }
        return A042 != null ? A042 : "";
    }

    @Deprecated
    public String A0H(String str) {
        boolean z;
        String obj;
        StringBuilder sb;
        String trim = C202859mm.A01(this.A04, str).trim();
        int length = trim.length();
        if (length == 0) {
            return trim;
        }
        if (!trim.startsWith("\"") || !trim.endsWith("\"") || length <= 2) {
            z = false;
        } else {
            z = true;
            trim = trim.substring(1, length - 1);
        }
        String trim2 = C202859mm.A01.matcher(trim).replaceAll(" ").trim();
        if (trim2.length() == 0) {
            return trim2;
        }
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\"");
            sb2.append(trim2);
            sb2.append("\"");
            obj = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(trim2);
            sb3.append("*");
            obj = sb3.toString();
        }
        if (obj.indexOf(105) == -1) {
            return obj;
        }
        if (z) {
            sb = new StringBuilder();
            sb.append(obj);
            sb.append(" OR ");
            sb.append(obj.replace('i', 305));
        } else {
            String[] split = A0Q.split(obj);
            sb = new StringBuilder();
            for (String str2 : split) {
                if (str2.indexOf(105) != -1) {
                    sb.append(str2);
                    sb.append(" OR ");
                    str2 = str2.replace('i', 305);
                }
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r9v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0I(X.C02680Bk r22, X.AnonymousClass1S3 r23, java.lang.Integer r24) {
        /*
            r21 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4 = r23
            java.util.List r20 = r4.A03()
            r3 = 0
        L_0x000c:
            int r0 = r20.size()
            if (r3 >= r0) goto L_0x011a
            boolean r0 = A07(r22)
            if (r0 != 0) goto L_0x011a
            r0 = r20
            java.lang.Object r6 = r0.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0110
            int r0 = r20.size()
            r13 = 1
            int r0 = r0 - r13
            r19 = 0
            if (r3 != r0) goto L_0x002e
            r19 = 1
        L_0x002e:
            monitor-enter(r4)
            java.util.Map r12 = r4.A0D     // Catch:{ all -> 0x0117 }
            if (r12 != 0) goto L_0x003a
            java.util.concurrent.ConcurrentHashMap r12 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0117 }
            r12.<init>()     // Catch:{ all -> 0x0117 }
            r4.A0D = r12     // Catch:{ all -> 0x0117 }
        L_0x003a:
            monitor-exit(r4)
            java.lang.Object r10 = r4.A0H
            monitor-enter(r10)
            java.lang.Object r8 = r12.get(r6)     // Catch:{ all -> 0x0114 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0114 }
            r11 = r21
            r7 = r24
            if (r8 == 0) goto L_0x0053
            X.0ze r2 = r11.A0F     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "fts_cached_jids"
            X.AnonymousClass6R7.A01(r2, r7, r0)     // Catch:{ all -> 0x0114 }
        L_0x0051:
            monitor-exit(r10)     // Catch:{ all -> 0x0114 }
            goto L_0x00cc
        L_0x0053:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0114 }
            r8.<init>()     // Catch:{ all -> 0x0114 }
            java.util.List r18 = java.util.Collections.singletonList(r6)     // Catch:{ all -> 0x0114 }
            r11.A0M(r4)     // Catch:{ all -> 0x0114 }
            X.0ze r2 = r11.A0F     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "fts_warm_cache"
            X.AnonymousClass6R7.A01(r2, r7, r0)     // Catch:{ all -> 0x0114 }
            java.util.List r0 = r4.A0B     // Catch:{ all -> 0x0114 }
            r1 = 0
            if (r0 == 0) goto L_0x006c
            r1 = 1
        L_0x006c:
            java.lang.String r0 = "contact list null after warming"
            X.C18740tg.A0D(r1, r0)     // Catch:{ all -> 0x0114 }
            java.lang.String r1 = "FtsMessageStore/filter"
            X.14g r17 = new X.14g     // Catch:{ all -> 0x0114 }
            r0 = r17
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0114 }
            java.util.List r0 = r4.A0B     // Catch:{ all -> 0x0114 }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x0114 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x0114 }
        L_0x0083:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r15 = r16.next()     // Catch:{ all -> 0x0114 }
            X.141 r15 = (X.AnonymousClass141) r15     // Catch:{ all -> 0x0114 }
            boolean r0 = A07(r22)     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x0098
            if (r19 == 0) goto L_0x0098
            goto L_0x00f1
        L_0x0098:
            java.lang.Class<X.11F> r0 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r14 = r15.A06(r0)     // Catch:{ all -> 0x0114 }
            X.11F r14 = (X.AnonymousClass11F) r14     // Catch:{ all -> 0x0114 }
            if (r14 == 0) goto L_0x0083
            boolean r0 = r14 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x0114 }
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r14 instanceof com.whatsapp.jid.GroupJid     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x0083
        L_0x00aa:
            X.171 r9 = r11.A03     // Catch:{ all -> 0x0114 }
            int r0 = r6.length()     // Catch:{ all -> 0x0114 }
            r1 = 0
            if (r0 <= r13) goto L_0x00b4
            r1 = 1
        L_0x00b4:
            r0 = r18
            boolean r0 = r9.A0h(r15, r0, r1)     // Catch:{ all -> 0x0114 }
            if (r0 == 0) goto L_0x0083
            r8.add(r14)     // Catch:{ all -> 0x0114 }
            goto L_0x0083
        L_0x00c0:
            r12.put(r6, r8)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "fts_search"
            X.AnonymousClass6R7.A01(r2, r7, r0)     // Catch:{ all -> 0x0114 }
            r17.A01()     // Catch:{ all -> 0x0114 }
            goto L_0x0051
        L_0x00cc:
            java.util.List r0 = r4.A09
            if (r0 == 0) goto L_0x00f8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x00d9:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r1 = r8.next()
            X.11F r1 = (X.AnonymousClass11F) r1
            java.util.List r0 = r4.A09
            boolean r0 = X.AnonymousClass1A5.A00(r1, r0)
            if (r0 == 0) goto L_0x00d9
            r9.add(r1)
            goto L_0x00d9
        L_0x00f1:
            java.lang.String r0 = "fts_last_cancel"
            X.AnonymousClass6R7.A01(r2, r7, r0)     // Catch:{ all -> 0x0114 }
            monitor-exit(r10)     // Catch:{ all -> 0x0114 }
            goto L_0x00fd
        L_0x00f8:
            java.lang.String r0 = "fts_unfiltered"
            X.AnonymousClass6R7.A01(r2, r7, r0)
        L_0x00fd:
            r9 = r8
            goto L_0x0104
        L_0x00ff:
            java.lang.String r0 = "fts_filtered"
            X.AnonymousClass6R7.A01(r2, r7, r0)
        L_0x0104:
            java.lang.String r0 = "fts_token_jids"
            X.AnonymousClass6R7.A01(r2, r7, r0)
            android.util.Pair r0 = android.util.Pair.create(r6, r9)
            r5.add(r0)
        L_0x0110:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0114:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0114 }
            throw r0
        L_0x0117:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x011a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20650xu.A0I(X.0Bk, X.1S3, java.lang.Integer):java.util.ArrayList");
    }

    public void A0J() {
        C1495671s B1k;
        C224214g r5 = new C224214g("FtsMessageStore/drop");
        AnonymousClass12P r3 = this.A0C;
        AnonymousClass1M0 A052 = r3.A05();
        try {
            B1k = A052.B1k();
            C224114e r2 = A052.A02;
            r2.A0D(C54162sV.A00("messages_fts"), "DROP_TABLE_MESSAGES_FTS_DEPRECATED");
            r2.A0D(C54162sV.A00("message_ftsv2"), "DROP_TABLE_MESSAGE_FTS");
            r3.A06();
            r3.A02.A04(A052);
            C219612i r32 = this.A0K;
            r32.A02("migration_fts_index");
            r32.A02("migration_fts_retry");
            r32.A04("fts_index_start", String.valueOf(0));
            r32.A03("fts_ready", 0);
            B1k.A00();
            B1k.close();
            A052.close();
            r5.A01();
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

    public void A0M(AnonymousClass1S3 r12) {
        if (r12.A0B == null) {
            synchronized (r12.A0H) {
                if (r12.A0B == null) {
                    C224214g r3 = new C224214g("FtsMessageStore/getSearchableContacts");
                    AnonymousClass1A2 r0 = this.A0L;
                    C18950u5 r6 = AnonymousClass1A2.A01;
                    C21010yW r5 = r0.A00;
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    LinkedList linkedList = new LinkedList(this.A07.A04().values());
                    r12.A0B = linkedList;
                    if (r12.A0A != null) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            AnonymousClass11F r1 = (AnonymousClass11F) ((AnonymousClass141) it.next()).A06(AnonymousClass11F.class);
                            if (r1 == null || !AnonymousClass1A5.A00(r1, r12.A0A)) {
                                it.remove();
                            }
                        }
                    }
                    C54992tt.A00(r5, r6, "warm-contact", atomicBoolean, elapsedRealtime);
                    List list = r12.A0B;
                    if (list != null) {
                        list.size();
                    }
                    r3.A01();
                }
            }
        }
    }

    public boolean A0N() {
        if (this.A0K.A00("fts_ready", 0) % 2 != 0) {
            return true;
        }
        return false;
    }

    public C20650xu(C19700wN r4, C19730wQ r5, AnonymousClass164 r6, AnonymousClass16D r7, AnonymousClass171 r8, C18820ts r9, AnonymousClass1A3 r10, AnonymousClass163 r11, C220412q r12, AnonymousClass1A5 r13, AnonymousClass1A4 r14, C219712j r15, AnonymousClass168 r16, C220612s r17, AnonymousClass12P r18, C219612i r19, AnonymousClass161 r20, C20810yC r21, AnonymousClass1A2 r22, AnonymousClass1AW r23, C21690ze r24, AnonymousClass1A1 r25, AnonymousClass005 r26) {
        C20810yC r2 = r21;
        this.A0E = r2;
        this.A09 = r15;
        this.A0D = r20;
        this.A06 = r11;
        this.A01 = r4;
        this.A02 = r5;
        this.A0J = r12;
        this.A0H = r6;
        this.A0A = r16;
        this.A0I = r7;
        this.A03 = r8;
        this.A04 = r9;
        this.A0N = r25;
        this.A0L = r22;
        this.A0K = r19;
        this.A05 = r10;
        this.A0C = r18;
        this.A08 = r14;
        this.A0O = r26;
        this.A0F = r24;
        this.A07 = r13;
        this.A0B = r17;
        this.A0M = r23;
        this.A0G = C20800yB.A01(C21000yV.A02, r2, 2822);
    }

    public String A0E(C02680Bk r13, AnonymousClass1S3 r14, Integer num) {
        StringBuilder sb;
        String str = "";
        if (!r14.A03().isEmpty()) {
            String A022 = r14.A02();
            if (!A022.startsWith("\"") || !A022.endsWith("\"") || A022.length() <= 2) {
                if (!r14.A0E || !C55362uV.A00(this)) {
                    sb = new StringBuilder();
                    sb.append(str);
                    List<String> A032 = r14.A03();
                    ArrayList arrayList = new ArrayList(A032.size());
                    for (String append : A032) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("content:");
                        sb2.append(append);
                        arrayList.add(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(TextUtils.join(" ", arrayList));
                    sb3.append("*");
                    str = sb3.toString();
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    if (!r14.A03().isEmpty()) {
                        ArrayList A0I2 = A0I(r13, r14, num);
                        StringBuilder sb4 = new StringBuilder();
                        int size = A0I2.size();
                        for (int i = 0; i < size && !A07(r13); i++) {
                            boolean z = false;
                            if (i == size - 1) {
                                z = true;
                            }
                            sb4.append(" ");
                            Pair pair = (Pair) A0I2.get(i);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("content:");
                            sb5.append((String) pair.first);
                            if (z) {
                                sb5.append('*');
                            }
                            for (int i2 = 0; i2 < ((List) pair.second).size(); i2++) {
                                AnonymousClass11F r11 = (AnonymousClass11F) ((List) pair.second).get(i2);
                                if ((r11 instanceof PhoneUserJid) || AnonymousClass143.A0G(r11)) {
                                    sb5.append(" OR ");
                                    sb5.append("fts_jid:");
                                    sb5.append(A0F(r11));
                                }
                            }
                            sb4.append(sb5.toString());
                        }
                        str = sb4.toString().trim();
                    }
                }
                sb.append(str);
                str = sb.toString();
            } else {
                str = A022;
            }
        }
        AnonymousClass11F r5 = r14.A04;
        if (r5 != null) {
            C18740tg.A06(r5);
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            sb6.append(" ");
            boolean z2 = r14.A0F;
            StringBuilder sb7 = new StringBuilder();
            sb7.append("fts_jid:");
            sb7.append(A0F(r5));
            String obj = sb7.toString();
            if (z2 && !AnonymousClass143.A0G(r5)) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(obj);
                sb8.append(" fts_jid:0 OR fts_jid:1");
                obj = sb8.toString();
            }
            sb6.append(obj);
            str = sb6.toString();
        }
        return A02(r13, this, r14, str);
    }

    public void A0L(AnonymousClass1S3 r3) {
        try {
            A0M(r3);
        } catch (IllegalStateException e) {
            Log.e("FtsMessageStore/safeWarm/failed to warm contact list", e);
        }
    }
}
