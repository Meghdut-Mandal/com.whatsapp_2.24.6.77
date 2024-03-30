package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;

/* renamed from: X.1CP  reason: invalid class name */
public abstract class AnonymousClass1CP {
    public final C24461Cn A00;
    public final C24431Ck A01;
    public final AnonymousClass179 A02;
    public final C24421Cj A03;
    public final C20840yF A04;

    public final File A0E(AnonymousClass5U6 r2) {
        File A022;
        AnonymousClass00C.A0D(r2, 0);
        if (r2 == AnonymousClass5U6.UNENCRYPTED) {
            C20850yG r0 = this.A04.A00;
            C20850yG.A00(r0);
            A022 = r0.A03;
        } else {
            A022 = this.A02.A02();
        }
        AnonymousClass00C.A0B(A022);
        return A022;
    }

    public void A0F() {
    }

    public void A0H(C1042758y r1, double d) {
    }

    public boolean A0I(Context context, File file) {
        File file2 = (File) C007103b.A0M(A0K(file));
        if (file2 == null) {
            return false;
        }
        return A0N(context, file2);
    }

    public abstract AnonymousClass6PN A0O(AnonymousClass5U6 r1);

    public final AnonymousClass6PN A0D() {
        AnonymousClass5U6 r0;
        if (this.A01.A03.A2I()) {
            r0 = AnonymousClass5U6.CRYPT15;
        } else {
            r0 = AnonymousClass5U6.CRYPT14;
        }
        AnonymousClass6PN A0O = A0O(r0);
        if (A0O == null) {
            return null;
        }
        C24461Cn r3 = this.A00;
        String str = A0O.A03;
        boolean z = A0O.A04;
        if (Boolean.valueOf(z) != null) {
            SharedPreferences.Editor edit = ((SharedPreferences) r3.A01.getValue()).edit();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_backup_success");
            edit.putBoolean(sb.toString(), z).apply();
        }
        C24461Cn.A01(r3, Long.valueOf(A0O.A00), str, "_backup_size");
        C24461Cn.A01(r3, A0O.A02, str, "_backup_media_size");
        return A0O;
    }

    public final void A0G(C1042758y r14) {
        C24461Cn r0 = this.A00;
        String A0J = A0J();
        AnonymousClass00C.A0D(A0J, 0);
        AnonymousClass00T r4 = r0.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(A0J);
        sb.append("_backup_success");
        boolean z = ((SharedPreferences) r4.getValue()).getBoolean(sb.toString(), false);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A0J);
        sb2.append("_backup_size");
        long j = ((SharedPreferences) r4.getValue()).getLong(sb2.toString(), -1);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(A0J);
        sb3.append("_backup_media_size");
        AnonymousClass6PN r6 = new AnonymousClass6PN((File) null, Long.valueOf(((SharedPreferences) r4.getValue()).getLong(sb3.toString(), -1)), A0J, j, z);
        long j2 = r6.A00;
        if (-1 != ((int) j2)) {
            double d = (double) j2;
            A0L(r14, d);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(A0J);
            sb4.append("_backup_google_saved_size");
            A0M(r14, d - ((double) ((SharedPreferences) r4.getValue()).getLong(sb4.toString(), 0)));
            Long l = r6.A02;
            if (l != null) {
                A0H(r14, (double) l.longValue());
            }
        }
    }

    public ArrayList A0K(File file) {
        ArrayList A06 = AnonymousClass6YO.A06(AnonymousClass5U6.CRYPT13);
        A06.add(".crypt1");
        File file2 = new File(file, "chatsettingsbackup.db");
        ArrayList A08 = AnonymousClass6YO.A08(file2, A06);
        AnonymousClass6YO.A0E(file2, A08);
        return A08;
    }

    public void A0L(C1042758y r2, double d) {
        if (this instanceof AnonymousClass1CR) {
            r2.A0H = Double.valueOf(d);
        }
    }

    public void A0M(C1042758y r2, double d) {
        if (this instanceof AnonymousClass1CR) {
            r2.A0G = Double.valueOf(d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r8 == null) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0N(android.content.Context r19, java.io.File r20) {
        /*
            r18 = this;
            r0 = r18
            X.1CR r0 = (X.AnonymousClass1CR) r0
            monitor-enter(r0)
            r0.A0a()     // Catch:{ all -> 0x008b }
            X.0wG r12 = r0.A07     // Catch:{ all -> 0x008b }
            android.content.Context r2 = r12.A00     // Catch:{ all -> 0x008b }
            java.lang.String r1 = "chatsettings.db"
            java.io.File r14 = r2.getDatabasePath(r1)     // Catch:{ all -> 0x008b }
            r15 = 0
            r10 = r20
            boolean r1 = r10.exists()     // Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "chatsettingsbackup.db"
            java.io.File r2 = r2.getDatabasePath(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = r2.exists()     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x0089
            java.lang.String r1 = "chat-settings-store/restore/plain text backup"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x008b }
            X.0yF r1 = r0.A04     // Catch:{ all -> 0x008b }
            boolean r15 = X.AnonymousClass6YY.A0O(r1, r2, r14)     // Catch:{ all -> 0x008b }
            boolean r1 = r2.delete()     // Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = "chat-settings-store/restore/unable to delete temp backup file"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x008b }
        L_0x003d:
            if (r15 == 0) goto L_0x0089
            goto L_0x0079
        L_0x0040:
            java.lang.String r2 = r10.getName()     // Catch:{ Exception -> 0x0083 }
            java.lang.String r1 = "chatsettingsbackup.db"
            int r2 = X.AnonymousClass6YO.A01(r2, r1)     // Catch:{ Exception -> 0x0083 }
            if (r2 <= 0) goto L_0x0075
            X.5U6 r8 = X.AnonymousClass5U6.CRYPT13     // Catch:{ Exception -> 0x0083 }
            int r1 = r8.version     // Catch:{ Exception -> 0x0083 }
            if (r2 < r1) goto L_0x0058
            X.5U6 r8 = X.AnonymousClass5U6.A02(r2)     // Catch:{ Exception -> 0x0083 }
            if (r8 == 0) goto L_0x0075
        L_0x0058:
            X.1CS r9 = r0.A0H     // Catch:{ Exception -> 0x0083 }
            X.0wQ r1 = r0.A04     // Catch:{ Exception -> 0x0083 }
            X.1CY r5 = r0.A09     // Catch:{ Exception -> 0x0083 }
            X.1Ck r3 = r0.A01     // Catch:{ Exception -> 0x0083 }
            X.1Cb r4 = r0.A06     // Catch:{ Exception -> 0x0083 }
            X.1Cg r7 = r0.A0G     // Catch:{ Exception -> 0x0083 }
            X.0yF r6 = r0.A04     // Catch:{ Exception -> 0x0083 }
            r2 = 0
            r11 = r2
            X.6QE r11 = X.C109765Za.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0083 }
            r16 = 0
            r17 = 0
            r13 = r2
            r11.A05(r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0083 }
            goto L_0x0078
        L_0x0075:
            X.5U6 r8 = X.AnonymousClass5U6.UNENCRYPTED     // Catch:{ Exception -> 0x0083 }
            goto L_0x0058
        L_0x0078:
            r15 = 1
        L_0x0079:
            boolean r1 = X.C24501Cr.A00     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x0089
            X.1Cp r1 = r0.A00     // Catch:{ all -> 0x008b }
            r1.A08()     // Catch:{ all -> 0x008b }
            goto L_0x0089
        L_0x0083:
            r2 = move-exception
            java.lang.String r1 = "chat-settings-store/restore failed"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x008b }
        L_0x0089:
            monitor-exit(r0)
            return r15
        L_0x008b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CP.A0N(android.content.Context, java.io.File):boolean");
    }

    public AnonymousClass1CP(C24421Cj r2) {
        this.A03 = r2;
        this.A02 = r2.A02;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A04 = r2.A03;
    }

    public String A0J() {
        return "chat-settings";
    }
}
