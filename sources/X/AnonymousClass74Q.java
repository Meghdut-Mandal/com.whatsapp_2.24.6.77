package X;

/* renamed from: X.74Q  reason: invalid class name */
public abstract class AnonymousClass74Q implements Runnable {
    public final C138776ig A00 = new C138776ig();

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d8, code lost:
        r2.close();
        r8.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0195, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0196, code lost:
        X.AnonymousClass6Q8.A01(r3);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x000e, B:29:0x00a0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            r5 = r9
            boolean r0 = r9 instanceof X.C97444ph     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x007a
            X.4ph r5 = (X.C97444ph) r5     // Catch:{ all -> 0x019a }
            X.6VR r7 = r5.A00     // Catch:{ all -> 0x019a }
            androidx.work.impl.WorkDatabase r3 = r7.A04     // Catch:{ all -> 0x019a }
            r3.A06()     // Catch:{ all -> 0x019a }
            X.7lt r2 = r3.A0D()     // Catch:{ all -> 0x0195 }
            X.6iw r2 = (X.C138936iw) r2     // Catch:{ all -> 0x0195 }
            java.lang.String r1 = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)"
            r8 = 0
            java.util.TreeMap r0 = X.C138686iW.A08     // Catch:{ all -> 0x0195 }
            X.6iW r6 = X.C109355Xg.A00(r1, r8)     // Catch:{ all -> 0x0195 }
            X.6Q8 r0 = r2.A02     // Catch:{ all -> 0x0195 }
            r0.A05()     // Catch:{ all -> 0x0195 }
            r4 = 0
            android.database.Cursor r2 = X.C109365Xh.A00(r0, r6, r8)     // Catch:{ all -> 0x0195 }
            java.util.ArrayList r1 = X.C90474aD.A0n(r2)     // Catch:{ all -> 0x00df }
        L_0x002b:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x0041
            boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x0039
            r0 = r4
            goto L_0x003d
        L_0x0039:
            java.lang.String r0 = r2.getString(r8)     // Catch:{ all -> 0x00df }
        L_0x003d:
            r1.add(r0)     // Catch:{ all -> 0x00df }
            goto L_0x002b
        L_0x0041:
            r2.close()     // Catch:{ all -> 0x0195 }
            r6.A00()     // Catch:{ all -> 0x0195 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0195 }
        L_0x004b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)     // Catch:{ all -> 0x0195 }
            r5.A00(r7, r0)     // Catch:{ all -> 0x0195 }
            goto L_0x004b
        L_0x0059:
            X.5hK r4 = new X.5hK     // Catch:{ all -> 0x0195 }
            r4.<init>(r3)     // Catch:{ all -> 0x0195 }
            java.lang.Long r2 = X.C90484aE.A0g()     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "last_cancel_all_time_ms"
            X.69K r1 = new X.69K     // Catch:{ all -> 0x0195 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0195 }
            androidx.work.impl.WorkDatabase r0 = r4.A00     // Catch:{ all -> 0x0195 }
            X.7iW r0 = r0.A09()     // Catch:{ all -> 0x0195 }
            r0.BKj(r1)     // Catch:{ all -> 0x0195 }
            r3.A07()     // Catch:{ all -> 0x0195 }
            X.AnonymousClass6Q8.A01(r3)     // Catch:{ all -> 0x019a }
            goto L_0x0188
        L_0x007a:
            boolean r0 = r9 instanceof X.C97474pk     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x00e7
            X.4pk r5 = (X.C97474pk) r5     // Catch:{ all -> 0x019a }
            X.6VR r7 = r5.A00     // Catch:{ all -> 0x019a }
            androidx.work.impl.WorkDatabase r3 = r7.A04     // Catch:{ all -> 0x019a }
            r3.A06()     // Catch:{ all -> 0x019a }
            X.7lt r2 = r3.A0D()     // Catch:{ all -> 0x0195 }
            java.lang.String r1 = r5.A01     // Catch:{ all -> 0x0195 }
            X.6iw r2 = (X.C138936iw) r2     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)"
            X.6iW r8 = X.C109355Xg.A01(r0, r1)     // Catch:{ all -> 0x0195 }
            X.6Q8 r0 = r2.A02     // Catch:{ all -> 0x0195 }
            r0.A05()     // Catch:{ all -> 0x0195 }
            r6 = 0
            r4 = 0
            android.database.Cursor r2 = X.C109365Xh.A00(r0, r8, r6)     // Catch:{ all -> 0x0195 }
            java.util.ArrayList r1 = X.C90474aD.A0n(r2)     // Catch:{ all -> 0x00d7 }
        L_0x00a4:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r2.isNull(r6)     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x00b2
            r0 = r4
            goto L_0x00b6
        L_0x00b2:
            java.lang.String r0 = r2.getString(r6)     // Catch:{ all -> 0x00d7 }
        L_0x00b6:
            r1.add(r0)     // Catch:{ all -> 0x00d7 }
            goto L_0x00a4
        L_0x00ba:
            r2.close()     // Catch:{ all -> 0x0195 }
            r8.A00()     // Catch:{ all -> 0x0195 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0195 }
        L_0x00c4:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)     // Catch:{ all -> 0x0195 }
            r5.A00(r7, r0)     // Catch:{ all -> 0x0195 }
            goto L_0x00c4
        L_0x00d2:
            r3.A07()     // Catch:{ all -> 0x0195 }
            goto L_0x017a
        L_0x00d7:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0195 }
            r8.A00()     // Catch:{ all -> 0x0195 }
            goto L_0x00e6
        L_0x00df:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0195 }
            r6.A00()     // Catch:{ all -> 0x0195 }
        L_0x00e6:
            throw r0     // Catch:{ all -> 0x0195 }
        L_0x00e7:
            boolean r0 = r9 instanceof X.C97464pj     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x015a
            X.4pj r5 = (X.C97464pj) r5     // Catch:{ all -> 0x019a }
            X.6VR r7 = r5.A00     // Catch:{ all -> 0x019a }
            androidx.work.impl.WorkDatabase r4 = r7.A04     // Catch:{ all -> 0x019a }
            r4.A06()     // Catch:{ all -> 0x019a }
            X.7lt r2 = r4.A0D()     // Catch:{ all -> 0x0155 }
            java.lang.String r1 = r5.A01     // Catch:{ all -> 0x0155 }
            X.6iw r2 = (X.C138936iw) r2     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)"
            X.6iW r8 = X.C109355Xg.A01(r0, r1)     // Catch:{ all -> 0x0155 }
            X.6Q8 r0 = r2.A02     // Catch:{ all -> 0x0155 }
            r0.A05()     // Catch:{ all -> 0x0155 }
            r6 = 0
            r3 = 0
            android.database.Cursor r2 = X.C109365Xh.A00(r0, r8, r6)     // Catch:{ all -> 0x0155 }
            java.util.ArrayList r1 = X.C90474aD.A0n(r2)     // Catch:{ all -> 0x014d }
        L_0x0111:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x0127
            boolean r0 = r2.isNull(r6)     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x011f
            r0 = r3
            goto L_0x0123
        L_0x011f:
            java.lang.String r0 = r2.getString(r6)     // Catch:{ all -> 0x014d }
        L_0x0123:
            r1.add(r0)     // Catch:{ all -> 0x014d }
            goto L_0x0111
        L_0x0127:
            r2.close()     // Catch:{ all -> 0x0155 }
            r8.A00()     // Catch:{ all -> 0x0155 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0155 }
        L_0x0131:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x013f
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)     // Catch:{ all -> 0x0155 }
            r5.A00(r7, r0)     // Catch:{ all -> 0x0155 }
            goto L_0x0131
        L_0x013f:
            r4.A07()     // Catch:{ all -> 0x0155 }
            X.AnonymousClass6Q8.A01(r4)     // Catch:{ all -> 0x019a }
            X.0tv r1 = r7.A02     // Catch:{ all -> 0x019a }
            java.util.List r0 = r7.A07     // Catch:{ all -> 0x019a }
            X.AnonymousClass6RH.A01(r1, r4, r0)     // Catch:{ all -> 0x019a }
            goto L_0x0188
        L_0x014d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0155 }
            r8.A00()     // Catch:{ all -> 0x0155 }
            throw r0     // Catch:{ all -> 0x0155 }
        L_0x0155:
            r0 = move-exception
            X.AnonymousClass6Q8.A01(r4)     // Catch:{ all -> 0x019a }
            goto L_0x0199
        L_0x015a:
            X.4pi r5 = (X.C97454pi) r5     // Catch:{ all -> 0x019a }
            X.6VR r3 = r5.A00     // Catch:{ all -> 0x019a }
            androidx.work.impl.WorkDatabase r2 = r3.A04     // Catch:{ all -> 0x019a }
            r2.A06()     // Catch:{ all -> 0x019a }
            java.util.UUID r0 = r5.A01     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0190 }
            r5.A00(r3, r0)     // Catch:{ all -> 0x0190 }
            r2.A07()     // Catch:{ all -> 0x0190 }
            X.AnonymousClass6Q8.A01(r2)     // Catch:{ all -> 0x019a }
            X.0tv r1 = r3.A02     // Catch:{ all -> 0x019a }
            java.util.List r0 = r3.A07     // Catch:{ all -> 0x019a }
            X.AnonymousClass6RH.A01(r1, r2, r0)     // Catch:{ all -> 0x019a }
            goto L_0x0188
        L_0x017a:
            X.AnonymousClass6Q8.A01(r3)     // Catch:{ all -> 0x019a }
            boolean r0 = r5.A02     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x0188
            X.0tv r1 = r7.A02     // Catch:{ all -> 0x019a }
            java.util.List r0 = r7.A07     // Catch:{ all -> 0x019a }
            X.AnonymousClass6RH.A01(r1, r3, r0)     // Catch:{ all -> 0x019a }
        L_0x0188:
            X.6ig r1 = r9.A00     // Catch:{ all -> 0x019a }
            X.4pC r0 = X.C161147mG.A01     // Catch:{ all -> 0x019a }
            r1.A00(r0)     // Catch:{ all -> 0x019a }
            return
        L_0x0190:
            r0 = move-exception
            X.AnonymousClass6Q8.A01(r2)     // Catch:{ all -> 0x019a }
            goto L_0x0199
        L_0x0195:
            r0 = move-exception
            X.AnonymousClass6Q8.A01(r3)     // Catch:{ all -> 0x019a }
        L_0x0199:
            throw r0     // Catch:{ all -> 0x019a }
        L_0x019a:
            r2 = move-exception
            X.6ig r1 = r9.A00
            X.4pD r0 = new X.4pD
            r0.<init>(r2)
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74Q.run():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        if (r2 != null) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass6VR r7, java.lang.String r8) {
        /*
            r6 = this;
            androidx.work.impl.WorkDatabase r0 = r7.A04
            X.7lt r5 = r0.A0D()
            X.7e9 r4 = r0.A08()
            java.util.LinkedList r3 = X.C90524aI.A0l()
            r3.add(r8)
        L_0x0011:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0036
            java.lang.Object r2 = r3.remove()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Integer r1 = r5.BHw(r2)
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 == r0) goto L_0x002e
            java.lang.Integer r0 = X.C023109s.A0G
            if (r1 == r0) goto L_0x002e
            java.lang.Integer r0 = X.C023109s.A0S
            r5.BsK(r0, r2)
        L_0x002e:
            java.util.ArrayList r0 = r4.BAz(r2)
            r3.addAll(r0)
            goto L_0x0011
        L_0x0036:
            X.6im r5 = r7.A03
            java.lang.Object r4 = r5.A0A
            monitor-enter(r4)
            X.6VD r3 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x008d }
            java.lang.String r2 = X.C138836im.A0C     // Catch:{ all -> 0x008d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "Processor cancelling "
            r1.append(r0)     // Catch:{ all -> 0x008d }
            X.AnonymousClass6VD.A03(r3, r8, r2, r1)     // Catch:{ all -> 0x008d }
            java.util.Set r0 = r5.A07     // Catch:{ all -> 0x008d }
            r0.add(r8)     // Catch:{ all -> 0x008d }
            java.util.Map r0 = r5.A05     // Catch:{ all -> 0x008d }
            java.lang.Object r2 = r0.remove(r8)     // Catch:{ all -> 0x008d }
            X.758 r2 = (X.AnonymousClass758) r2     // Catch:{ all -> 0x008d }
            r1 = 1
            if (r2 != 0) goto L_0x0068
            r1 = 0
            java.util.Map r0 = r5.A04     // Catch:{ all -> 0x008d }
            java.lang.Object r2 = r0.remove(r8)     // Catch:{ all -> 0x008d }
            X.758 r2 = (X.AnonymousClass758) r2     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x006d
        L_0x0068:
            java.util.Map r0 = r5.A06     // Catch:{ all -> 0x008d }
            r0.remove(r8)     // Catch:{ all -> 0x008d }
        L_0x006d:
            monitor-exit(r4)     // Catch:{ all -> 0x008d }
            X.C138836im.A01(r2, r8)
            if (r1 == 0) goto L_0x0076
            X.C138836im.A00(r5)
        L_0x0076:
            java.util.List r0 = r7.A07
            java.util.Iterator r1 = r0.iterator()
        L_0x007c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r1.next()
            X.7k7 r0 = (X.C159907k7) r0
            r0.B2R(r8)
            goto L_0x007c
        L_0x008c:
            return
        L_0x008d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74Q.A00(X.6VR, java.lang.String):void");
    }
}
