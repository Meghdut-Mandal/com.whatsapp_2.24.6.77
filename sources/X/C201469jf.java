package X;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.9jf  reason: invalid class name and case insensitive filesystem */
public class C201469jf {
    public C104895Bw A00;
    public AnonymousClass9KY A01;
    public final C20690y0 A02;
    public final C20050ww A03;
    public final C19970wo A04;
    public final C20060wx A05;
    public final C20810yC A06;
    public final AnonymousClass1BV A07;
    public final C24601Db A08;
    public final AnonymousClass1BS A09;
    public final C21100yf A0A;
    public final C19630wG A0B;

    public static AnonymousClass9KY A00(byte[] bArr, long j) {
        String str;
        long j2;
        try {
            AnonymousClass8SX A0i = AnonymousClass8SX.A0i(bArr);
            if ((A0i.bitField0_ & 64) != 0) {
                AnonymousClass8SC r2 = A0i.documentMessage_;
                if (r2 == null) {
                    r2 = AnonymousClass8SC.DEFAULT_INSTANCE;
                }
                if ((r2.bitField0_ & 1) != 0) {
                    str = r2.url_;
                    if (TextUtils.isEmpty(str)) {
                        Log.e("dyiReportManager/create-report-info failed : url is empty");
                        return null;
                    } else if (!"https".equalsIgnoreCase(Uri.parse(str).getScheme())) {
                        C36321k7.A1P("dyiReportManager/create-report-info failed : invalid scheme; url =", str, AnonymousClass000.A0u());
                        return null;
                    }
                } else {
                    str = null;
                }
                if ((r2.bitField0_ & 16) != 0) {
                    j2 = r2.fileLength_;
                } else {
                    j2 = 0;
                }
                return new AnonymousClass9KY(j2, str, j);
            }
            Log.e("dyiReportManager/create-report-info failed : invalid e2eMessage -> no document message found");
            return null;
        } catch (AnonymousClass186 e) {
            Log.e("dyiReportManager/create-report-info", e);
            return null;
        }
    }

    public synchronized int A02(String str) {
        SharedPreferences A032;
        String str2;
        A032 = this.A08.A03();
        if ("personal".equals(str)) {
            str2 = "payment_dyi_report_state";
        } else {
            str2 = "business_payment_dyi_report_state";
        }
        return A032.getInt(str2, -1);
    }

    public synchronized AnonymousClass9KY A03(String str) {
        byte[] A0J;
        String str2;
        String str3;
        if (this.A01 == null && (A0J = C18750th.A0J(A01(this, str))) != null) {
            C24601Db r7 = this.A08;
            SharedPreferences A032 = r7.A03();
            boolean equals = "personal".equals(str);
            if (equals) {
                str2 = "payment_dyi_report_timestamp";
            } else {
                str2 = "business_payment_dyi_report_timestamp";
            }
            long j = A032.getLong(str2, -1);
            SharedPreferences A033 = r7.A03();
            if (equals) {
                str3 = "payment_dyi_report_expiration_timestamp";
            } else {
                str3 = "business_payment_dyi_report_expiration_timestamp";
            }
            A033.getLong(str3, -1);
            this.A01 = A00(A0J, j);
        }
        return this.A01;
    }

    public synchronized void A04(String str) {
        Log.i("dyiReportManager/reset");
        this.A01 = null;
        File A012 = A01(this, str);
        if (A012.exists() && !A012.delete()) {
            Log.e("dyiReportManager/reset/failed-delete-report-info");
        }
        C20690y0 r2 = this.A02;
        File A0Q = r2.A0Q(str);
        if (A0Q.exists() && !A0Q.delete()) {
            Log.e("dyiReportManager/reset/failed-delete-report-file");
        }
        AnonymousClass6YY.A0E(r2.A0U(str), 0);
        this.A08.A0J(str);
    }

    public static File A01(C201469jf r1, String str) {
        String str2;
        File filesDir = r1.A0B.A00.getFilesDir();
        if ("personal".equals(str)) {
            str2 = "dyi.info";
        } else {
            str2 = "business_dyi.info";
        }
        return C36441kJ.A0w(filesDir, str2);
    }

    public C201469jf(C20690y0 r1, C21100yf r2, C20050ww r3, C19970wo r4, C19630wG r5, C20060wx r6, C20810yC r7, AnonymousClass1BV r8, C24601Db r9, AnonymousClass1BS r10) {
        this.A04 = r4;
        this.A06 = r7;
        this.A0B = r5;
        this.A03 = r3;
        this.A02 = r1;
        this.A0A = r2;
        this.A05 = r6;
        this.A09 = r10;
        this.A08 = r9;
        this.A07 = r8;
    }
}
