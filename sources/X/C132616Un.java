package X;

import android.util.LongSparseArray;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.6Un  reason: invalid class name and case insensitive filesystem */
public final class C132616Un {
    public final LongSparseArray A00 = new LongSparseArray(0);
    public final AnonymousClass005 A01;
    public volatile boolean A02;

    public C132616Un(AnonymousClass005 r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
    }

    public static final Integer A00(C108475Tq r1, C132616Un r2, long j) {
        AnonymousClass6A8 r3 = (AnonymousClass6A8) r2.A00.get(j);
        if (r1.ordinal() != 0) {
            if (r3 != null) {
                return r3.A01;
            }
            return null;
        } else if (r3 != null) {
            return r3.A00;
        } else {
            return null;
        }
    }

    public static final void A01(C108475Tq r4, C132616Un r5, Integer num, long j) {
        LongSparseArray longSparseArray = r5.A00;
        Object r2 = new AnonymousClass6A8();
        Object obj = longSparseArray.get(j);
        if (obj != null) {
            r2 = obj;
        }
        AnonymousClass6A8 r22 = (AnonymousClass6A8) r2;
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            r22.A00 = num;
        } else if (ordinal == 1) {
            r22.A01 = num;
        }
        longSparseArray.put(j, r22);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C132616Un r12) {
        /*
            boolean r0 = r12.A02
            if (r0 != 0) goto L_0x00b1
            monitor-enter(r12)
            boolean r0 = r12.A02     // Catch:{ all -> 0x00ad }
            if (r0 != 0) goto L_0x00b0
            X.005 r0 = r12.A01     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00ad }
            X.6VF r0 = (X.AnonymousClass6VF) r0     // Catch:{ all -> 0x00ad }
            android.util.LongSparseArray r6 = new android.util.LongSparseArray     // Catch:{ all -> 0x00ad }
            r6.<init>()     // Catch:{ all -> 0x00ad }
            X.12P r0 = r0.A00     // Catch:{ all -> 0x00ad }
            X.1M0 r4 = r0.get()     // Catch:{ all -> 0x00ad }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x00a3 }
            java.lang.String r2 = "SELECT status_message_row_id, state, destination FROM status_crossposting_v3"
            java.lang.String r1 = "SELECT_STATE_LIST"
            r0 = 0
            android.database.Cursor r7 = r3.A09(r2, r1, r0)     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "status_message_row_id"
            int r9 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "state"
            int r8 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "destination"
            int r5 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009c }
        L_0x0039:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0076
            long r1 = r7.getLong(r9)     // Catch:{ all -> 0x009c }
            int r11 = r7.getInt(r8)     // Catch:{ all -> 0x009c }
            int r10 = r7.getInt(r5)     // Catch:{ all -> 0x009c }
            X.6A8 r3 = new X.6A8     // Catch:{ all -> 0x009c }
            r3.<init>()     // Catch:{ all -> 0x009c }
            java.lang.Object r0 = r6.get(r1)     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0057
            r3 = r0
        L_0x0057:
            X.6A8 r3 = (X.AnonymousClass6A8) r3     // Catch:{ all -> 0x009c }
            X.5Tq r0 = X.C108475Tq.FACEBOOK     // Catch:{ all -> 0x009c }
            int r0 = r0.databaseValue     // Catch:{ all -> 0x009c }
            if (r10 != r0) goto L_0x0069
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x009c }
            r3.A00 = r0     // Catch:{ all -> 0x009c }
        L_0x0065:
            r6.put(r1, r3)     // Catch:{ all -> 0x009c }
            goto L_0x0039
        L_0x0069:
            X.5Tq r0 = X.C108475Tq.INSTAGRAM     // Catch:{ all -> 0x009c }
            int r0 = r0.databaseValue     // Catch:{ all -> 0x009c }
            if (r10 != r0) goto L_0x0065
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x009c }
            r3.A01 = r0     // Catch:{ all -> 0x009c }
            goto L_0x0065
        L_0x0076:
            r7.close()     // Catch:{ all -> 0x00a3 }
            r4.close()     // Catch:{ all -> 0x00ad }
            android.util.LongSparseArray r5 = r12.A00     // Catch:{ all -> 0x00ad }
            monitor-enter(r5)     // Catch:{ all -> 0x00ad }
            r5.clear()     // Catch:{ all -> 0x00aa }
            int r4 = r6.size()     // Catch:{ all -> 0x00aa }
            r3 = 0
        L_0x0087:
            if (r3 >= r4) goto L_0x0097
            long r1 = r6.keyAt(r3)     // Catch:{ all -> 0x00aa }
            java.lang.Object r0 = r6.valueAt(r3)     // Catch:{ all -> 0x00aa }
            r5.put(r1, r0)     // Catch:{ all -> 0x00aa }
            int r3 = r3 + 1
            goto L_0x0087
        L_0x0097:
            monitor-exit(r5)     // Catch:{ all -> 0x00ad }
            r0 = 1
            r12.A02 = r0     // Catch:{ all -> 0x00ad }
            goto L_0x00b0
        L_0x009c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x00a3 }
            throw r0     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x00ad }
            goto L_0x00ac
        L_0x00aa:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ad }
        L_0x00ac:
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x00b0:
            monitor-exit(r12)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132616Un.A02(X.6Un):void");
    }

    public final void A03(C108475Tq r6, Collection collection, int i) {
        A02(this);
        synchronized (this.A00) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                A01(r6, this, Integer.valueOf(i), C36391kE.A0D(it));
            }
        }
    }
}
