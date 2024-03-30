package X;

import android.content.Context;
import android.os.Environment;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.54X  reason: invalid class name */
public class AnonymousClass54X extends AnonymousClass1CP {
    public final C20690y0 A00;
    public final C19730wQ A01;
    public final C24341Cb A02;
    public final C19630wG A03;
    public final C20830yE A04;
    public final AnonymousClass1CY A05;
    public final C24891Ee A06;
    public final C20810yC A07;
    public final C29931Yo A08;
    public final C24391Cg A09;
    public final AnonymousClass1CS A0A;

    public String A0J() {
        return "payment-backgrounds";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r11 == null) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0N(android.content.Context r16, java.io.File r17) {
        /*
            r15 = this;
            monitor-enter(r15)
            r13 = r17
            boolean r0 = r13.exists()     // Catch:{ all -> 0x006e }
            r2 = 1
            if (r0 != 0) goto L_0x0014
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "PaymentBackgroundsBackup/restore/backup-file-not-found "
            X.C36321k7.A1K(r13, r0, r1)     // Catch:{ all -> 0x006e }
            goto L_0x006c
        L_0x0014:
            X.0y0 r0 = r15.A00     // Catch:{ all -> 0x006e }
            java.io.File r3 = r0.A0F()     // Catch:{ all -> 0x006e }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x002a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "PaymentBackgroundsBackup/restore/failed to get internal payment backgrounds folder "
            X.C36321k7.A1J(r3, r0, r1)     // Catch:{ all -> 0x006e }
            goto L_0x006c
        L_0x002a:
            r2 = 0
            java.lang.String r1 = r13.getName()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r0 = "payment_backgrounds.backup"
            int r1 = X.AnonymousClass6YO.A01(r1, r0)     // Catch:{ Exception -> 0x0066 }
            if (r1 <= 0) goto L_0x0061
            X.5U6 r11 = X.AnonymousClass5U6.CRYPT14     // Catch:{ Exception -> 0x0066 }
            int r0 = r11.version     // Catch:{ Exception -> 0x0066 }
            if (r1 < r0) goto L_0x0043
            X.5U6 r11 = X.AnonymousClass5U6.A02(r1)     // Catch:{ Exception -> 0x0066 }
            if (r11 == 0) goto L_0x0061
        L_0x0043:
            X.1CS r12 = r15.A0A     // Catch:{ Exception -> 0x0066 }
            X.0wQ r4 = r15.A01     // Catch:{ Exception -> 0x0066 }
            X.1CY r8 = r15.A05     // Catch:{ Exception -> 0x0066 }
            X.1Ck r6 = r15.A01     // Catch:{ Exception -> 0x0066 }
            X.1Cb r7 = r15.A02     // Catch:{ Exception -> 0x0066 }
            X.1Cg r10 = r15.A09     // Catch:{ Exception -> 0x0066 }
            X.0yF r9 = r15.A04     // Catch:{ Exception -> 0x0066 }
            r5 = 0
            r14 = r5
            X.6QE r1 = X.C109765Za.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0066 }
            X.7rv r0 = new X.7rv     // Catch:{ Exception -> 0x0066 }
            r0.<init>(r3, r2)     // Catch:{ Exception -> 0x0066 }
            boolean r0 = r1.A09(r0)     // Catch:{ Exception -> 0x0066 }
            goto L_0x0064
        L_0x0061:
            X.5U6 r11 = X.AnonymousClass5U6.UNENCRYPTED     // Catch:{ Exception -> 0x0066 }
            goto L_0x0043
        L_0x0064:
            monitor-exit(r15)
            return r0
        L_0x0066:
            r1 = move-exception
            java.lang.String r0 = "PaymentBackgroundsBackup/restore failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x006e }
        L_0x006c:
            monitor-exit(r15)
            return r2
        L_0x006e:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54X.A0N(android.content.Context, java.io.File):boolean");
    }

    public boolean A0I(Context context, File file) {
        if (this.A07.A0E(1084)) {
            return super.A0I(context, file);
        }
        Log.i("PaymentBackgroundsBackup/restore/encrypted backgrounds not enabled");
        return true;
    }

    public ArrayList A0K(File file) {
        return AnonymousClass6YO.A07(file, "payment_backgrounds.backup", AnonymousClass6YO.A06(AnonymousClass5U6.CRYPT14));
    }

    public AnonymousClass6PN A0O(AnonymousClass5U6 r18) {
        C162157o7 A062;
        String str;
        if (!this.A07.A0E(1084)) {
            str = "PaymentBackgroundsBackup/backup/encrypted backgrounds not enabled";
        } else if (!this.A04.A0I(Environment.getExternalStorageState())) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("PaymentBackgroundsBackup/backup/sdcard_unavailable ");
            C36321k7.A1a(A0u, Environment.getExternalStorageState());
            return new AnonymousClass6PN("payment-backgrounds");
        } else {
            C24891Ee r2 = this.A06;
            Log.i("PAY: PaymentBackgroundStore/getStoredPaymentBackgrounds");
            ArrayList A012 = C24891Ee.A01(r2, "SELECT payment_background.background_id, file_size, width, height, mime_type, placeholder_color, text_color, subtext_color, media_key, media_key_timestamp, file_sha256, file_enc_sha256, direct_path, fullsize_url, description, lg FROM payment_background", "payments/QUERY_PAYMENT_BACKGROUNDS");
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("PAY: PaymentBackgroundStore/getStoredPaymentBackgrounds/result size=");
            C36321k7.A1Y(A0u2, A012.size());
            if (A012.isEmpty()) {
                str = "PaymentBackgroundsBackup/backup no backgrounds to backup";
            } else {
                HashSet hashSet = new HashSet(A012.size());
                for (int i = 0; i < A012.size(); i++) {
                    C135106c9 r4 = (C135106c9) A012.get(i);
                    File A022 = r4.A02(this.A08.A03.A0F());
                    if (!A022.exists()) {
                        StringBuilder A0u3 = AnonymousClass000.A0u();
                        A0u3.append("PaymentBackgroundsBackup/backup/file_not_found for:  ");
                        C36321k7.A1a(A0u3, r4.A0F);
                    } else {
                        hashSet.add(A022);
                    }
                }
                AnonymousClass5U6 r13 = r18;
                File A032 = AnonymousClass5U6.A03(this, r13, "payment_backgrounds.backup.crypt", AnonymousClass000.A0u());
                Iterator it = A0K(AnonymousClass5U6.A03(this, r13, "payment_backgrounds.backup.crypt", AnonymousClass000.A0u())).iterator();
                while (it.hasNext()) {
                    File A0a = C90504aG.A0a(it);
                    if (!A0a.equals(A032)) {
                        C90464aC.A18(A0a);
                    }
                }
                if (hashSet.isEmpty()) {
                    str = "PaymentBackgroundsBackup/backup no background files found to backup";
                } else {
                    try {
                        AnonymousClass1CS r14 = this.A0A;
                        C19730wQ r6 = this.A01;
                        AnonymousClass1CY r10 = this.A05;
                        long j = 0;
                        A062 = C109765Za.A00(r6, (C132716Uy) null, this.A01, this.A02, r10, this.A04, this.A09, r13, r14, A032, (Boolean) null).A06(this.A03.A00);
                        if (A062 == null) {
                            Log.e("PaymentBackgroundsBackup/backup failed to create writer");
                            return new AnonymousClass6PN("payment-backgrounds");
                        }
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            File A0a2 = C90504aG.A0a(it2);
                            A062.BxY(A0a2);
                            j += A0a2.length();
                        }
                        A062.close();
                        return new AnonymousClass6PN(A032, Long.valueOf(j), "payment-backgrounds", C90514aH.A0K(this, r13), true);
                    } catch (Exception e) {
                        Log.e("sticker-db-storage/backup failed", e);
                        return new AnonymousClass6PN("payment-backgrounds");
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
        }
        Log.i(str);
        return null;
        throw th;
    }

    public AnonymousClass54X(C20690y0 r1, C19730wQ r2, C24341Cb r3, C19630wG r4, C20830yE r5, AnonymousClass1CY r6, C24421Cj r7, C24891Ee r8, C20810yC r9, C29931Yo r10, C24391Cg r11, AnonymousClass1CS r12) {
        super(r7);
        this.A07 = r9;
        this.A0A = r12;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
        this.A06 = r8;
        this.A09 = r11;
        this.A08 = r10;
    }

    public void A0L(C1042758y r2, double d) {
        r2.A0L = Double.valueOf(d);
    }

    public void A0M(C1042758y r2, double d) {
        r2.A0K = Double.valueOf(d);
    }
}
