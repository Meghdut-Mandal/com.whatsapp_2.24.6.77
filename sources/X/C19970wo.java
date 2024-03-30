package X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.0wo  reason: invalid class name and case insensitive filesystem */
public class C19970wo {
    public final C19900wh A00;
    public final C19760wT A01;
    public volatile long A02;
    public volatile long A03;
    public volatile long A04;

    public long A04() {
        if (this.A04 != 0) {
            return this.A04 + SystemClock.elapsedRealtime();
        }
        return System.currentTimeMillis() - this.A03;
    }

    public long A06() {
        if (this.A02 != 0) {
            long elapsedRealtime = this.A02 + SystemClock.elapsedRealtime();
            if (elapsedRealtime != 0) {
                return elapsedRealtime;
            }
        }
        return System.currentTimeMillis();
    }

    public C19970wo(C19760wT r10, C19900wh r11) {
        this.A01 = r10;
        this.A00 = r11;
        SharedPreferences sharedPreferences = r11.A01;
        this.A03 = sharedPreferences.getLong("client_server_time_diff", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("last_ntp_client_time", 0);
        if (sharedPreferences.contains("client_ntp_time_diff") && j > 0 && Math.abs(currentTimeMillis - j) < 86400000) {
            A01(this, sharedPreferences.getLong("client_ntp_time_diff", 0));
        }
    }

    public static long A00(C19970wo r7) {
        long j;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (r7.A02 != 0) {
            j = r7.A02;
        } else if (r7.A04 == 0) {
            return System.currentTimeMillis() - r7.A03;
        } else {
            j = r7.A04;
        }
        return j + elapsedRealtime;
    }

    public static void A01(C19970wo r9, long j) {
        System.currentTimeMillis();
        A00(r9);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis + j;
        r9.A02 = j2 - SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder();
        sb.append("app/time ntp update processed; diffClientNtp:");
        sb.append(j);
        sb.append(" device time: ");
        sb.append(currentTimeMillis);
        sb.append(" ntp time: ");
        sb.append(j2);
        Log.i(sb.toString());
        System.currentTimeMillis();
        A00(r9);
    }

    public long A02() {
        return A00(this);
    }

    public long A03() {
        return System.currentTimeMillis();
    }

    public long A05() {
        return SystemClock.elapsedRealtime();
    }

    public long A07() {
        return SystemClock.uptimeMillis();
    }

    public long A08(long j) {
        return (j + System.currentTimeMillis()) - A00(this);
    }

    public void A09(long j, long j2) {
        System.currentTimeMillis();
        A00(this);
        if (j > 0) {
            this.A04 = j - SystemClock.elapsedRealtime();
            this.A03 = j2 - j;
            StringBuilder sb = new StringBuilder();
            sb.append("app/time server update processed; diffClientWaServer:");
            sb.append(this.A03);
            sb.append(" device time: ");
            sb.append(j2);
            sb.append(" server time: ");
            sb.append(j);
            Log.i(sb.toString());
            C19900wh r0 = this.A00;
            r0.A01.edit().putLong("client_server_time_diff", this.A03).apply();
        }
        System.currentTimeMillis();
        A00(this);
    }
}
