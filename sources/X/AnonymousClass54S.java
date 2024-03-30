package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: X.54S  reason: invalid class name */
public final class AnonymousClass54S extends AnonymousClass1CP {
    public final C19730wQ A00;
    public final C24341Cb A01;
    public final C19630wG A02;
    public final AnonymousClass1CY A03;
    public final AnonymousClass1XW A04;
    public final C24391Cg A05;
    public final AnonymousClass1CS A06;

    public String A0J() {
        return "avatar-token";
    }

    public ArrayList A0K(File file) {
        AnonymousClass00C.A0D(file, 0);
        return AnonymousClass6YO.A07(file, "avatar-password.bkup", AnonymousClass6YO.A06(AnonymousClass5U6.CRYPT14));
    }

    public void A0L(C1042758y r2, double d) {
        AnonymousClass00C.A0D(r2, 0);
        r2.A04 = Double.valueOf(d);
    }

    public void A0M(C1042758y r2, double d) {
        AnonymousClass00C.A0D(r2, 0);
        r2.A03 = Double.valueOf(d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ad, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass6PN A0O(X.AnonymousClass5U6 r23) {
        /*
            r22 = this;
            r0 = 0
            r14 = r23
            X.AnonymousClass00C.A0D(r14, r0)
            r3 = r22
            X.1XW r0 = r3.A04
            X.6OQ r1 = r0.A00()
            r8 = 0
            if (r1 != 0) goto L_0x0012
            return r8
        L_0x0012:
            X.6c7 r0 = r1.A05
            java.lang.Object r7 = X.C135086c7.A00(r0)
            X.6c7 r0 = r1.A04
            java.lang.String r6 = X.C135086c7.A01(r0)
            X.0yF r12 = r3.A04
            java.lang.String r0 = "avatar_password.json"
            java.io.File r2 = r12.A00(r0)
            java.io.FileOutputStream r5 = X.C90524aI.A0W(r2)     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ all -> 0x00ae }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ae }
            r4.<init>(r5, r0)     // Catch:{ all -> 0x00ae }
            org.json.JSONObject r1 = X.C36441kJ.A1B()     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = "avatar_password"
            r1.put(r0, r7)     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = "avatar_fbid"
            r1.put(r0, r6)     // Catch:{ all -> 0x00a7 }
            r0 = 2
            java.lang.String r0 = r1.toString(r0)     // Catch:{ all -> 0x00a7 }
            r4.write(r0)     // Catch:{ all -> 0x00a7 }
            r4.close()     // Catch:{ all -> 0x00ae }
            r5.close()     // Catch:{ IOException -> 0x00b5 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0095 }
            java.lang.String r0 = "avatar-password.bkup.crypt"
            java.io.File r16 = X.AnonymousClass5U6.A03(r3, r14, r0, r1)     // Catch:{ IOException -> 0x0095 }
            X.1CS r15 = r3.A06     // Catch:{ IOException -> 0x0095 }
            X.0wQ r7 = r3.A00     // Catch:{ IOException -> 0x0095 }
            X.1CY r11 = r3.A03     // Catch:{ IOException -> 0x0095 }
            X.1Ck r9 = r3.A01     // Catch:{ IOException -> 0x0095 }
            X.1Cb r10 = r3.A01     // Catch:{ IOException -> 0x0095 }
            X.1Cg r13 = r3.A05     // Catch:{ IOException -> 0x0095 }
            r17 = r8
            X.6QE r1 = X.C109765Za.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ IOException -> 0x0095 }
            X.0wG r0 = r3.A02     // Catch:{ IOException -> 0x0095 }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x0095 }
            boolean r0 = r1.A08(r0)     // Catch:{ IOException -> 0x0095 }
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "AvatarBackup/backup prepare for backup failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0095 }
            java.lang.String r10 = "avatar-token"
            r11 = 0
            X.6PN r7 = new X.6PN     // Catch:{ IOException -> 0x0095 }
            r9 = r8
            r13 = 0
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ IOException -> 0x0095 }
            return r7
        L_0x0084:
            r1.A07(r8, r2)     // Catch:{ IOException -> 0x0095 }
            long r19 = X.C90514aH.A0K(r3, r14)
            java.lang.String r18 = "avatar-token"
            r21 = 1
            X.6PN r15 = new X.6PN
            r15.<init>(r16, r17, r18, r19, r21)
            return r15
        L_0x0095:
            r1 = move-exception
            java.lang.String r0 = "AvatarBackup/backup backup failed"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r10 = "avatar-token"
            r11 = 0
            X.6PN r7 = new X.6PN
            r9 = r8
            r13 = 0
            r7.<init>(r8, r9, r10, r11, r13)
            return r7
        L_0x00a7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x00ae }
            throw r0     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ IOException -> 0x00b5 }
            throw r0     // Catch:{ IOException -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            java.lang.String r0 = "AvatarBackup/backup exception while writing to temp file"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r10 = "avatar-token"
            r11 = 0
            X.6PN r7 = new X.6PN
            r9 = r8
            r13 = 0
            r7.<init>(r8, r9, r10, r11, r13)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54S.A0O(X.5U6):X.6PN");
    }

    public boolean A0N(Context context, File file) {
        AnonymousClass5U6 r17;
        String str;
        String str2;
        Object obj;
        File file2 = file;
        C36331k8.A1I(context, file2);
        try {
            C20840yF r15 = this.A04;
            File A002 = r15.A00("avatar_password.json");
            int A012 = AnonymousClass6YO.A01(file2.getName(), "avatar_password.json");
            if (A012 <= 0 || (r17 = AnonymousClass5U6.A02(A012)) == null) {
                r17 = AnonymousClass5U6.UNENCRYPTED;
            }
            C109765Za.A00(this.A00, (C132716Uy) null, this.A01, this.A01, this.A03, r15, this.A05, r17, this.A06, file2, (Boolean) null).A05(this.A02, (C158587hk) null, A002, 0, 0, false);
            StringBuilder A0u = AnonymousClass000.A0u();
            BufferedReader A0Z = C90504aG.A0Z(A002);
            while (true) {
                String readLine = A0Z.readLine();
                if (readLine == null) {
                    break;
                }
                A0u.append(readLine);
            }
            if (A0u.length() > 0) {
                JSONObject A1C = C36441kJ.A1C(A0u.toString());
                Boolean bool = null;
                if (A1C.has("avatar_fbid")) {
                    str = A1C.getString("avatar_fbid");
                } else {
                    str = null;
                }
                if (A1C.has("avatar_password")) {
                    str2 = A1C.getString("avatar_password");
                } else {
                    str2 = null;
                }
                if (!(str == null || str.length() == 0 || str2 == null || str2.length() == 0)) {
                    AnonymousClass6AZ r4 = new AnonymousClass6AZ(new C135086c7(C146356vT.A00(), Long.TYPE, C36431kI.A15(str), "WaFbid"), new C135086c7(C146356vT.A00(), String.class, str2, "WaFbPassword"));
                    try {
                        AnonymousClass777 r3 = new AnonymousClass777();
                        this.A04.A02(r4, new C111985dA(r3, 0));
                        obj = (Boolean) r3.get();
                    } catch (Throwable th) {
                        obj = C90524aI.A0t(th);
                    }
                    Throwable A003 = AnonymousClass0AK.A00(obj);
                    if (A003 != null) {
                        Log.e(A003);
                    }
                    if (!(obj instanceof AnonymousClass03N)) {
                        bool = obj;
                    }
                    Boolean bool2 = bool;
                    if (bool2 != null) {
                        return bool2.booleanValue();
                    }
                    return false;
                }
            } else {
                Log.w("AvatarBackup/restore could not read JSON metadata from backup file");
            }
            return false;
        } catch (IOException e) {
            Log.e("AvatarBackup/restore failed", e);
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass54S(C19730wQ r1, C24341Cb r2, C19630wG r3, AnonymousClass1CY r4, C24421Cj r5, AnonymousClass1XW r6, C24391Cg r7, AnonymousClass1CS r8) {
        super(r5);
        C36321k7.A1B(r3, r8, r1, r4, r2);
        C36321k7.A10(r7, r6);
        this.A02 = r3;
        this.A06 = r8;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = r7;
        this.A04 = r6;
    }
}
