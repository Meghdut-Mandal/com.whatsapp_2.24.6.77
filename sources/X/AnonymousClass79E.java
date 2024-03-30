package X;

import java.util.TimerTask;
import org.npci.upi.security.pinactivitycomponent.s;
import org.npci.upi.security.pinactivitycomponent.u;

/* renamed from: X.79E  reason: invalid class name */
public class AnonymousClass79E extends TimerTask {
    public long A00 = (System.currentTimeMillis() - 45000);
    public final /* synthetic */ int A01;
    public final /* synthetic */ u A02;
    public final /* synthetic */ s A03;

    public AnonymousClass79E(s sVar, u uVar, int i) {
        this.A03 = sVar;
        this.A02 = uVar;
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012f, code lost:
        if (r6 == null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0131, code lost:
        r6.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            org.npci.upi.security.pinactivitycomponent.u r5 = r15.A02
            int r8 = r15.A01
            long r0 = r15.A00
            r2 = 2000(0x7d0, double:9.88E-321)
            long r0 = r0 - r2
            java.lang.String r2 = "content://sms/inbox"
            android.net.Uri r10 = android.net.Uri.parse(r2)
            java.lang.String r7 = "_id"
            java.lang.String r4 = "address"
            java.lang.String r3 = "body"
            java.lang.String r2 = "date"
            java.lang.String[] r11 = new java.lang.String[]{r7, r4, r3, r2}
            r4 = 0
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = "date > ?"
            java.lang.String r12 = java.lang.String.format(r2, r3)
            java.lang.String r14 = "date DESC"
            android.content.Context r2 = r5.A01     // Catch:{ Exception | SecurityException -> 0x0134, all -> 0x013b }
            android.content.ContentResolver r9 = r2.getContentResolver()     // Catch:{ Exception | SecurityException -> 0x0134, all -> 0x013b }
            r3 = 1
            java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ Exception | SecurityException -> 0x0134, all -> 0x013b }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ Exception | SecurityException -> 0x0134, all -> 0x013b }
            java.lang.String r2 = ""
            java.lang.String r0 = X.C36381kD.A0z(r2, r6, r0)     // Catch:{ Exception | SecurityException -> 0x0134, all -> 0x013b }
            r13[r4] = r0     // Catch:{ Exception | SecurityException -> 0x0134, all -> 0x013b }
            android.database.Cursor r6 = r9.query(r10, r11, r12, r13, r14)     // Catch:{ Exception | SecurityException -> 0x0134, all -> 0x013b }
        L_0x003f:
            boolean r0 = r6.moveToNext()     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r0 == 0) goto L_0x0131
            java.lang.String r1 = r6.getString(r3)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            r0 = 2
            java.lang.String r0 = r6.getString(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            X.63A r4 = r5.A01(r1, r0, r8)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r4 == 0) goto L_0x003f
            int r0 = r6.getColumnIndex(r7)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.Long r0 = X.C36361kB.A0k(r6, r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            r4.A02 = r9     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.util.List r0 = r5.A02     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r0 != 0) goto L_0x007c
            X.5nS r0 = r5.A03     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r1 = "msgID"
            android.content.SharedPreferences r0 = r0.A00     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r1 = r0.getString(r1, r2)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            r5.A02 = r0     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
        L_0x007c:
            boolean r0 = r0.contains(r9)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r0 != 0) goto L_0x003f
            java.lang.String r0 = r4.A00     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r9 = org.npci.upi.security.pinactivitycomponent.u.A00(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.util.List r0 = r5.A02     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r0 != 0) goto L_0x00a2
            X.5nS r0 = r5.A03     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r1 = "msgID"
            android.content.SharedPreferences r0 = r0.A00     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r1 = r0.getString(r1, r2)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            r5.A02 = r0     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
        L_0x00a2:
            boolean r0 = r0.contains(r9)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r0 != 0) goto L_0x003f
            java.lang.String r9 = r4.A02     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r9 != 0) goto L_0x00b5
            java.lang.String r0 = r4.A00     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r9 = org.npci.upi.security.pinactivitycomponent.u.A00(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r9 != 0) goto L_0x00b5
            goto L_0x0116
        L_0x00b5:
            X.5nS r0 = r5.A03     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r7 = "msgID"
            android.content.SharedPreferences r8 = r0.A00     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r0 = r8.getString(r7, r2)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r5 = ","
            java.lang.String[] r0 = r0.split(r5)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.util.ArrayList r3 = X.C36351kA.A10(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            boolean r0 = r3.contains(r9)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r0 != 0) goto L_0x0116
            int r1 = r3.size()     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            r0 = 10
            if (r1 < r0) goto L_0x00db
            r0 = 0
            r3.remove(r0)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
        L_0x00db:
            r3.add(r9)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            int r0 = r3.size()     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r0 > 0) goto L_0x00e6
            r1 = 0
            goto L_0x010c
        L_0x00e6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r2)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.Object r0 = X.C36441kJ.A12(r3)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            r2 = 1
        L_0x00f5:
            int r0 = r3.size()     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            if (r2 >= r0) goto L_0x010c
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r1, r5)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.Object r0 = r3.get(r2)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            int r2 = r2 + 1
            goto L_0x00f5
        L_0x010c:
            android.content.SharedPreferences$Editor r0 = r8.edit()     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            r0.putString(r7, r1)     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
            r0.commit()     // Catch:{ Exception | SecurityException -> 0x012f, all -> 0x0128 }
        L_0x0116:
            r6.close()
            android.os.Handler r2 = X.C36341k9.A0H()
            r1 = 14
            X.72x r0 = new X.72x
            r0.<init>(r15, r4, r1)
            r2.post(r0)
            goto L_0x0134
        L_0x0128:
            r0 = move-exception
            if (r6 == 0) goto L_0x012e
            r6.close()
        L_0x012e:
            throw r0
        L_0x012f:
            if (r6 == 0) goto L_0x0134
        L_0x0131:
            r6.close()
        L_0x0134:
            long r0 = java.lang.System.currentTimeMillis()
            r15.A00 = r0
            return
        L_0x013b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass79E.run():void");
    }
}
