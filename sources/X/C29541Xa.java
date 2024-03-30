package X;

import com.whatsapp.jid.PhoneUserJid;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Xa  reason: invalid class name and case insensitive filesystem */
public final class C29541Xa {
    public final C19970wo A00;
    public final C220412q A01;
    public final C24931Ei A02;
    public final C20810yC A03;
    public final C237919w A04;
    public final C19730wQ A05;
    public final AnonymousClass1A1 A06;

    public C29541Xa(C19730wQ r2, C19970wo r3, C220412q r4, C24931Ei r5, C20810yC r6, C237919w r7, AnonymousClass1A1 r8) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r4, 4);
        AnonymousClass00C.A0D(r8, 5);
        AnonymousClass00C.A0D(r5, 6);
        AnonymousClass00C.A0D(r7, 7);
        this.A00 = r3;
        this.A03 = r6;
        this.A05 = r2;
        this.A01 = r4;
        this.A06 = r8;
        this.A02 = r5;
        this.A04 = r7;
    }

    public final C46762bd A01(AnonymousClass2bT r4) {
        Map A1Y;
        AnonymousClass00C.A0D(r4, 0);
        C19730wQ r0 = this.A05;
        r0.A0G();
        PhoneUserJid phoneUserJid = r0.A03;
        if (phoneUserJid == null || (A1Y = r4.A1Y()) == null) {
            return null;
        }
        return (C46762bd) A1Y.get(phoneUserJid);
    }

    public final String A02(AnonymousClass2bT r9) {
        AnonymousClass00C.A0D(r9, 0);
        AnonymousClass3J7 r2 = r9.A01;
        if (r2 != null) {
            String str = r2.A02;
            if ((str != null && str.length() != 0) || ((str = r2.A01) != null && str.length() != 0)) {
                return str;
            }
            AnonymousClass3IM r0 = r2.A00;
            if (r0 != null) {
                double d = r0.A00;
                Double valueOf = Double.valueOf(d);
                double d2 = r0.A01;
                Double valueOf2 = Double.valueOf(d2);
                if (!(valueOf == null || valueOf2 == null || (d == 0.0d && d2 == 0.0d))) {
                    DecimalFormat decimalFormat = new DecimalFormat("###.######");
                    StringBuilder sb = new StringBuilder();
                    sb.append(decimalFormat.format(d));
                    sb.append(", ");
                    sb.append(decimalFormat.format(d2));
                    return sb.toString();
                }
            }
        }
        return null;
    }

    public final boolean A04(AnonymousClass2bT r7) {
        AnonymousClass00C.A0D(r7, 0);
        if (r7.A00 < C19970wo.A00(this.A00)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r6.A03, 7258) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r6.A03, 5562) == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.AnonymousClass11F r7) {
        /*
            r6 = this;
            r1 = 0
            X.AnonymousClass00C.A0D(r7, r1)
            boolean r0 = X.AnonymousClass143.A0G(r7)
            r5 = 0
            if (r0 != 0) goto L_0x000c
            return r1
        L_0x000c:
            X.12q r1 = r6.A01
            android.os.Parcelable$Creator r0 = X.AnonymousClass147.CREATOR
            X.147 r0 = X.C65533Sl.A03(r7)
            int r4 = r1.A05(r0)
            r0 = 2
            if (r4 == r0) goto L_0x001e
            r0 = 6
            if (r4 != r0) goto L_0x002b
        L_0x001e:
            X.0yC r2 = r6.A03
            r1 = 5562(0x15ba, float:7.794E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r3 = 1
            if (r0 != 0) goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r4 != 0) goto L_0x003b
            X.0yC r2 = r6.A03
            r1 = 7258(0x1c5a, float:1.017E-41)
            X.0yV r0 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r0, r2, r1)
            r0 = 1
            if (r1 != 0) goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            if (r3 != 0) goto L_0x0040
            if (r0 == 0) goto L_0x0041
        L_0x0040:
            r5 = 1
        L_0x0041:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29541Xa.A05(X.11F):boolean");
    }

    public static final ArrayList A00(C29541Xa r5, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A012 = r5.A06.A01.A01(((Number) it.next()).longValue());
            if (A012 != null) {
                arrayList.add(A012);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A03() {
        /*
            r8 = this;
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            X.1Ei r5 = r8.A02
            X.0wo r7 = r8.A00
            long r1 = X.C19970wo.A00(r7)
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0 = 0
            r3[r0] = r1
            X.12P r6 = r5.A02
            X.1M0 r5 = r6.get()
            X.14e r2 = r5.A02     // Catch:{ all -> 0x007f }
            java.lang.String r1 = "SELECT message_row_id\nFROM message_event\nJOIN message_add_on\nON message_event.message_row_id = message_add_on.parent_message_row_id\nJOIN message_add_on_event_response\nON message_add_on._id = message_add_on_event_response.message_add_on_row_id\nWHERE \n    message_event.start_time > ?\n    AND\n    message_event.is_canceled = 0\n    AND\n    message_add_on_event_response.response = 1\n    AND\n    message_add_on.from_me = 1\nORDER BY start_time\nASC\nLIMIT 20"
            java.lang.String r0 = "GET_UPCOMING_EVENTS_WHERE_I_RESPONDING_GOING_QUERY_ID"
            android.database.Cursor r2 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x007f }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x0078 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0078 }
            r0.<init>()     // Catch:{ all -> 0x0078 }
            X.C24931Ei.A00(r2, r0)     // Catch:{ all -> 0x0078 }
            if (r2 == 0) goto L_0x0037
            r2.close()     // Catch:{ all -> 0x007f }
        L_0x0037:
            r5.close()
            r4.addAll(r0)
            long r1 = X.C19970wo.A00(r7)
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0 = 0
            r3[r0] = r1
            X.1M0 r5 = r6.get()
            X.14e r2 = r5.A02     // Catch:{ all -> 0x007f }
            java.lang.String r1 = "SELECT message_row_id\nFROM message_event\nJOIN message\nON message_event.message_row_id  = message._id\nWHERE \n    message_event.start_time > ?\n    AND\n    message_event.is_canceled = 0\n    AND\n    message.from_me = 1\n    AND\n    message.message_type = 92\nORDER BY start_time\nASC\nLIMIT 20"
            java.lang.String r0 = "GET_UPCOMING_EVENTS_CREATED_BY_ME_QUERY_ID"
            android.database.Cursor r2 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x007f }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x0078 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0078 }
            r0.<init>()     // Catch:{ all -> 0x0078 }
            X.C24931Ei.A00(r2, r0)     // Catch:{ all -> 0x0078 }
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ all -> 0x007f }
        L_0x0069:
            r5.close()
            r4.addAll(r0)
            java.util.List r0 = X.C007103b.A0Y(r4)
            java.util.ArrayList r0 = A00(r8, r0)
            return r0
        L_0x0078:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007a }
        L_0x007a:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x007f }
            throw r0     // Catch:{ all -> 0x007f }
        L_0x007f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29541Xa.A03():java.util.ArrayList");
    }
}
