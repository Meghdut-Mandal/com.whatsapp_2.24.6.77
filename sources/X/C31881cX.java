package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1cX  reason: invalid class name and case insensitive filesystem */
public class C31881cX {
    public AnonymousClass3XD A00;
    public final C20690y0 A01;
    public final C19970wo A02;
    public final C19420v0 A03;
    public final C29961Yr A04;

    public synchronized int A00() {
        return ((SharedPreferences) this.A03.A00.get()).getInt("business_activity_report_state", 0);
    }

    public synchronized void A02() {
        Log.i("BusinessActivityReportManager/reset");
        this.A00 = null;
        C20690y0 r2 = this.A01;
        File A09 = r2.A09();
        if (A09.exists() && !A09.delete()) {
            Log.e("BusinessActivityReportManager/reset/failed-delete-report-file");
        }
        AnonymousClass6YY.A0E(r2.A0C(), 0);
        this.A03.A0z();
    }

    public synchronized void A03(AnonymousClass3XD r6) {
        this.A00 = r6;
        C19420v0 r3 = this.A03;
        C19420v0.A00(r3).putString("business_activity_report_url", r6.A08).apply();
        C19420v0.A00(r3).putString("business_activity_report_name", r6.A06).apply();
        C19420v0.A00(r3).putLong("business_activity_report_size", r6.A02).apply();
        C19420v0.A00(r3).putLong("business_activity_report_expiration_timestamp", r6.A01).apply();
        C19420v0.A00(r3).putString("business_activity_report_direct_url", r6.A03).apply();
        C19420v0.A00(r3).putString("business_activity_report_media_key", r6.A07).apply();
        C19420v0.A00(r3).putString("business_activity_report_file_sha", r6.A05).apply();
        C19420v0.A00(r3).putString("business_activity_report_file_enc_sha", r6.A04).apply();
        r3.A1h("business_activity_report_timestamp", r6.A00);
        r3.A15(2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0085, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.AnonymousClass3XD A01() {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r1)
            X.3XD r6 = r1.A00     // Catch:{ all -> 0x0086 }
            if (r6 != 0) goto L_0x0084
            X.0v0 r6 = r1.A03     // Catch:{ all -> 0x0086 }
            X.005 r0 = r6.A00     // Catch:{ all -> 0x0086 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x0086 }
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "business_activity_report_url"
            r3 = 0
            java.lang.String r7 = r4.getString(r2, r3)     // Catch:{ all -> 0x0086 }
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x0020
            monitor-exit(r1)
            return r3
        L_0x0020:
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x0086 }
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5     // Catch:{ all -> 0x0086 }
            java.lang.String r4 = "business_activity_report_size"
            r2 = 0
            long r13 = r5.getLong(r4, r2)     // Catch:{ all -> 0x0086 }
            java.lang.String r4 = "business_activity_report_timestamp"
            long r15 = r6.A0V(r4)     // Catch:{ all -> 0x0086 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x0086 }
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5     // Catch:{ all -> 0x0086 }
            java.lang.String r4 = "business_activity_report_expiration_timestamp"
            long r17 = r5.getLong(r4, r2)     // Catch:{ all -> 0x0086 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x0086 }
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "business_activity_report_direct_url"
            r3 = 0
            java.lang.String r8 = r4.getString(r2, r3)     // Catch:{ all -> 0x0086 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x0086 }
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "business_activity_report_name"
            java.lang.String r9 = r4.getString(r2, r3)     // Catch:{ all -> 0x0086 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x0086 }
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "business_activity_report_media_key"
            java.lang.String r10 = r4.getString(r2, r3)     // Catch:{ all -> 0x0086 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x0086 }
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "business_activity_report_file_sha"
            java.lang.String r11 = r4.getString(r2, r3)     // Catch:{ all -> 0x0086 }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x0086 }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "business_activity_report_file_enc_sha"
            java.lang.String r12 = r2.getString(r0, r3)     // Catch:{ all -> 0x0086 }
            X.3XD r6 = new X.3XD     // Catch:{ all -> 0x0086 }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15, r17)     // Catch:{ all -> 0x0086 }
            r1.A00 = r6     // Catch:{ all -> 0x0086 }
        L_0x0084:
            monitor-exit(r1)
            return r6
        L_0x0086:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31881cX.A01():X.3XD");
    }

    public C31881cX(C20690y0 r1, C19970wo r2, C19420v0 r3, C29961Yr r4) {
        this.A02 = r2;
        this.A01 = r1;
        this.A04 = r4;
        this.A03 = r3;
    }
}
