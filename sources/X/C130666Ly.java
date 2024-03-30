package X;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/* renamed from: X.6Ly  reason: invalid class name and case insensitive filesystem */
public abstract class C130666Ly {
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ea, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ed, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C162177o9 r11, int r12, int r13) {
        /*
            r10 = this;
            r4 = r10
            X.4oj r4 = (X.C97264oj) r4
            X.5yy r0 = r4.A00
            if (r0 == 0) goto L_0x00ee
            X.609 r7 = r0.A01
            r8 = r12
            if (r12 != r13) goto L_0x0020
            X.09w r5 = X.C023409w.A00
        L_0x000e:
            X.6Nf r4 = r4.A01
            r6 = 0
            X.0k2 r3 = new X.0k2
            r3.<init>()
            java.lang.String r1 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            r0 = r11
            X.6iP r0 = (X.C138616iP) r0
            android.database.Cursor r2 = X.C138616iP.A00(r0, r1)
            goto L_0x007b
        L_0x0020:
            boolean r9 = X.C90474aD.A1T(r13, r12)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
        L_0x0028:
            if (r9 == 0) goto L_0x0078
            if (r8 >= r13) goto L_0x000e
        L_0x002c:
            java.util.Map r0 = r7.A00
            java.lang.Object r6 = X.C36371kC.A0r(r0, r8)
            java.util.TreeMap r6 = (java.util.TreeMap) r6
            if (r6 == 0) goto L_0x00ee
            if (r9 == 0) goto L_0x0073
            java.util.NavigableSet r0 = r6.descendingKeySet()
        L_0x003c:
            java.util.Iterator r3 = r0.iterator()
        L_0x0040:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r2 = r3.next()
            java.lang.Number r2 = (java.lang.Number) r2
            if (r9 == 0) goto L_0x0067
            int r0 = r8 + 1
            X.AnonymousClass00C.A06(r2)
            int r1 = r2.intValue()
            if (r0 > r1) goto L_0x0040
            if (r1 > r13) goto L_0x0040
        L_0x005b:
            java.lang.Object r0 = r6.get(r2)
            X.AnonymousClass00C.A0B(r0)
            r5.add(r0)
            r8 = r1
            goto L_0x0028
        L_0x0067:
            X.AnonymousClass00C.A06(r2)
            int r1 = r2.intValue()
            if (r13 > r1) goto L_0x0040
            if (r1 >= r8) goto L_0x0040
            goto L_0x005b
        L_0x0073:
            java.util.Set r0 = r6.keySet()
            goto L_0x003c
        L_0x0078:
            if (r8 <= r13) goto L_0x000e
            goto L_0x002c
        L_0x007b:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = r2.getString(r6)     // Catch:{ all -> 0x00e7 }
            r3.add(r0)     // Catch:{ all -> 0x00e7 }
            goto L_0x007b
        L_0x0089:
            r2.close()
            X.0k2 r0 = X.AnonymousClass03S.A00(r3)
            java.util.Iterator r3 = r0.iterator()
        L_0x0094:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.String r2 = X.AnonymousClass001.A0C(r3)
            X.AnonymousClass00C.A06(r2)
            java.lang.String r0 = "room_fts_content_sync_"
            boolean r0 = X.AnonymousClass098.A07(r2, r0, r6)
            if (r0 == 0) goto L_0x0094
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "DROP TRIGGER IF EXISTS "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            r11.B6z(r0)
            goto L_0x0094
        L_0x00b7:
            java.util.Iterator r1 = r5.iterator()
        L_0x00bb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r0 = r1.next()
            X.61V r0 = (X.AnonymousClass61V) r0
            r0.A00(r11)
            goto L_0x00bb
        L_0x00cb:
            X.5ns r2 = r4.A02(r11)
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x00d7
            X.C97264oj.A00(r11)
            return
        L_0x00d7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Migration didn't properly handle: "
            r1.append(r0)
            java.lang.String r0 = r2.A00
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)
            throw r0
        L_0x00e7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        L_0x00ee:
            X.5yy r1 = r4.A00
            if (r1 == 0) goto L_0x013e
            if (r12 <= r13) goto L_0x0132
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x0132
        L_0x00f8:
            X.6Nf r4 = r4.A01
            java.lang.String r0 = "DROP TABLE IF EXISTS `Dependency`"
            r11.B6z(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `WorkSpec`"
            r11.B6z(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `WorkTag`"
            r11.B6z(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `SystemIdInfo`"
            r11.B6z(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `WorkName`"
            r11.B6z(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `WorkProgress`"
            r11.B6z(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `Preference`"
            r11.B6z(r0)
            androidx.work.impl.WorkDatabase_Impl r3 = r4.A00
            java.util.List r0 = r3.A01
            if (r0 == 0) goto L_0x0159
            r2 = 0
            int r1 = r0.size()
        L_0x0128:
            if (r2 >= r1) goto L_0x0159
            java.util.List r0 = r3.A01
            r0.get(r2)
            int r2 = r2 + 1
            goto L_0x0128
        L_0x0132:
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x00f8
            java.util.Set r0 = r1.A08
            boolean r0 = X.AnonymousClass000.A1Z(r0, r12)
            if (r0 != 0) goto L_0x00f8
        L_0x013e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "A migration from "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " to "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r1)
            throw r0
        L_0x0159:
            r4.A03(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130666Ly.A02(X.7o9, int, int):void");
    }

    public static final void A01(String str) {
        if (str == null || !str.equalsIgnoreCase(":memory:")) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A1Q = C90484aE.A1Q(AnonymousClass00C.A00(str.charAt(i2), 32));
                if (z) {
                    if (!A1Q) {
                        break;
                    }
                    length--;
                } else if (!A1Q) {
                    z = true;
                } else {
                    i++;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", AnonymousClass000.A0p("deleting the database file: ", str, AnonymousClass000.A0u()));
                try {
                    SQLiteDatabase.deleteDatabase(C90524aI.A0S(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }
}
