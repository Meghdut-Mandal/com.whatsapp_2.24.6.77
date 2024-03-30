package X;

import android.database.Cursor;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.18e  reason: invalid class name and case insensitive filesystem */
public final class C233618e {
    public static final C233718f A04 = new C233718f();
    public final C19970wo A00;
    public final C233918h A01;
    public final AnonymousClass18M A02;
    public final C20810yC A03;

    public C233618e(C19970wo r2, C233918h r3, AnonymousClass18M r4, C20810yC r5) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r3, 4);
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass6EZ r9) {
        /*
            r8 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            java.lang.Long r7 = A00(r8, r9)
            X.18f r1 = A04
            if (r7 == 0) goto L_0x0015
            java.lang.String r6 = "recipient_lid_identifier = ? AND recipient_type = ? AND device_id = ? "
        L_0x000e:
            X.18M r0 = r8.A02
            X.1M0 r4 = r0.A04()
            goto L_0x0018
        L_0x0015:
            java.lang.String r6 = "recipient_id = ? AND recipient_type = ? AND device_id = ? "
            goto L_0x000e
        L_0x0018:
            X.14e r5 = r4.A02     // Catch:{ all -> 0x005d }
            java.lang.String r3 = "sessions"
            java.lang.String[] r2 = r1.A00(r9, r7)     // Catch:{ all -> 0x005d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r1.<init>()     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "SignalSessionStore/removeSession"
            r1.append(r0)     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x002f
            java.lang.String r0 = "_lid_identifier"
            goto L_0x0031
        L_0x002f:
            java.lang.String r0 = ""
        L_0x0031:
            r1.append(r0)     // Catch:{ all -> 0x005d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005d }
            int r0 = r5.A03(r3, r6, r0, r2)     // Catch:{ all -> 0x005d }
            long r2 = (long) r0     // Catch:{ all -> 0x005d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r1.<init>()     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "axolotl deleted "
            r1.append(r0)     // Catch:{ all -> 0x005d }
            r1.append(r2)     // Catch:{ all -> 0x005d }
            java.lang.String r0 = " sessions with "
            r1.append(r0)     // Catch:{ all -> 0x005d }
            r1.append(r9)     // Catch:{ all -> 0x005d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x005d }
            r4.close()
            return
        L_0x005d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233618e.A02(X.6EZ):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d3, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d6, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass6EZ r13, byte[] r14) {
        /*
            r12 = this;
            r0 = 1
            X.AnonymousClass00C.A0D(r14, r0)
            java.lang.Long r2 = A00(r12, r13)
            X.18f r1 = A04
            if (r2 == 0) goto L_0x0015
            java.lang.String r9 = "recipient_lid_identifier = ? AND recipient_type = ? AND device_id = ? "
        L_0x000e:
            X.18M r0 = r12.A02
            X.1M0 r4 = r0.A04()
            goto L_0x0018
        L_0x0015:
            java.lang.String r9 = "recipient_id = ? AND recipient_type = ? AND device_id = ? "
            goto L_0x000e
        L_0x0018:
            X.71s r5 = r4.B1k()     // Catch:{ all -> 0x00d0 }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x00c9 }
            r7.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "record"
            r7.put(r0, r14)     // Catch:{ all -> 0x00c9 }
            X.14e r6 = r4.A02     // Catch:{ all -> 0x00c9 }
            java.lang.String r8 = "sessions"
            java.lang.String[] r11 = r1.A00(r13, r2)     // Catch:{ all -> 0x00c9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            r1.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "SignalSessionStore/saveSessionUpdate"
            r1.append(r0)     // Catch:{ all -> 0x00c9 }
            if (r2 == 0) goto L_0x003d
            java.lang.String r0 = "_lid_identifier"
            goto L_0x003f
        L_0x003d:
            java.lang.String r0 = ""
        L_0x003f:
            r1.append(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x00c9 }
            int r0 = r6.A01(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x00ab
            X.0wo r0 = r12.A00     // Catch:{ all -> 0x00c9 }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x00c9 }
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2     // Catch:{ all -> 0x00c9 }
            long r0 = r0 / r2
            java.lang.String r3 = r13.A02     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = "recipient_id"
            r7.put(r2, r3)     // Catch:{ all -> 0x00c9 }
            int r2 = r13.A01     // Catch:{ all -> 0x00c9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = "recipient_type"
            r7.put(r2, r3)     // Catch:{ all -> 0x00c9 }
            int r2 = r13.A00     // Catch:{ all -> 0x00c9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = "device_id"
            r7.put(r2, r3)     // Catch:{ all -> 0x00c9 }
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = "timestamp"
            r7.put(r2, r3)     // Catch:{ all -> 0x00c9 }
            X.18h r3 = r12.A01     // Catch:{ all -> 0x00c9 }
            r2 = 5
            java.lang.Long r3 = r3.A00(r13, r2)     // Catch:{ all -> 0x00c9 }
            if (r3 == 0) goto L_0x008a
            java.lang.String r2 = "recipient_lid_identifier"
            r7.put(r2, r3)     // Catch:{ all -> 0x00c9 }
        L_0x008a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            r3.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = "axolotl inserting new session for "
            r3.append(r2)     // Catch:{ all -> 0x00c9 }
            r3.append(r13)     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = " at "
            r3.append(r2)     // Catch:{ all -> 0x00c9 }
            r3.append(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00c9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "SignalSessionStore/saveSession"
            r6.A04(r8, r0, r7)     // Catch:{ all -> 0x00c9 }
        L_0x00ab:
            r5.A00()     // Catch:{ all -> 0x00c9 }
            r5.close()     // Catch:{ all -> 0x00d0 }
            r4.close()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "axolotl stored session for "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00c9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x00d0 }
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233618e.A03(X.6EZ, byte[]):void");
    }

    public static final Long A00(C233618e r3, AnonymousClass6EZ r4) {
        if (C20800yB.A01(C21000yV.A02, r3.A03, 6485)) {
            return r3.A01.A00(r4, 5);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007f, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0082, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A04(X.AnonymousClass6EZ r15) {
        /*
            r14 = this;
            java.lang.String r4 = "record"
            java.lang.Long r3 = A00(r14, r15)
            X.18f r1 = A04
            if (r3 == 0) goto L_0x0013
            java.lang.String r8 = "recipient_lid_identifier = ? AND recipient_type = ? AND device_id = ? "
        L_0x000c:
            X.18M r0 = r14.A02
            X.1M0 r2 = r0.get()
            goto L_0x0016
        L_0x0013:
            java.lang.String r8 = "recipient_id = ? AND recipient_type = ? AND device_id = ? "
            goto L_0x000c
        L_0x0016:
            X.14e r5 = r2.A02     // Catch:{ all -> 0x007c }
            java.lang.String r6 = "sessions"
            java.lang.String[] r7 = new java.lang.String[]{r4}     // Catch:{ all -> 0x007c }
            java.lang.String[] r9 = r1.A00(r15, r3)     // Catch:{ all -> 0x007c }
            r10 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
            r1.<init>()     // Catch:{ all -> 0x007c }
            java.lang.String r0 = "SignalSessionStore/getSession"
            r1.append(r0)     // Catch:{ all -> 0x007c }
            if (r3 == 0) goto L_0x0032
            java.lang.String r0 = "_lid_identifier"
            goto L_0x0034
        L_0x0032:
            java.lang.String r0 = ""
        L_0x0034:
            r1.append(r0)     // Catch:{ all -> 0x007c }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x007c }
            r12 = r10
            r11 = r10
            android.database.Cursor r3 = r5.A0A(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x007c }
            if (r3 == 0) goto L_0x0058
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0058
            int r0 = r3.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0075 }
            byte[] r0 = r3.getBlob(r0)     // Catch:{ all -> 0x0075 }
            r3.close()     // Catch:{ all -> 0x007c }
            r2.close()
            return r0
        L_0x0058:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r1.<init>()     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "axolotl cant load a session record for "
            r1.append(r0)     // Catch:{ all -> 0x0075 }
            r1.append(r15)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0075 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0075 }
            if (r3 == 0) goto L_0x0071
            r3.close()     // Catch:{ all -> 0x007c }
        L_0x0071:
            r2.close()
            return r10
        L_0x0075:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007e }
        L_0x007e:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233618e.A04(X.6EZ):byte[]");
    }

    public final Cursor A01(Set set) {
        int size = set.size();
        boolean z = false;
        if (1 <= size && size < 101) {
            z = true;
        }
        C18740tg.A0B(z);
        C224114e BJK = this.A02.BJK();
        int size2 = set.size();
        StringBuilder sb = new StringBuilder("SELECT record, recipient_id, recipient_type, device_id FROM sessions INNER JOIN (SELECT ? AS r, ? AS t, ? AS d");
        Iterator it = C15040mb.A05(1, size2).iterator();
        while (it.hasNext()) {
            ((C12260hl) it).A00();
            sb.append(" UNION ALL SELECT ? AS r, ? AS t, ? AS d");
        }
        sb.append(") AS joined ON joined.r = sessions.recipient_id AND joined.t = sessions.recipient_type AND joined.d = sessions.device_id");
        String obj = sb.toString();
        AnonymousClass00C.A08(obj);
        Cursor A09 = BJK.A09(obj, "SignalSessionStore/getSessionsCursor", C110585au.A00(set));
        AnonymousClass00C.A08(A09);
        return A09;
    }
}
