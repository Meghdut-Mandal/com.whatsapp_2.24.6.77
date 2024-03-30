package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.14g  reason: invalid class name and case insensitive filesystem */
public class C224214g {
    public long A00;
    public long A01;
    public String A02;
    public boolean A03;
    public final boolean A04;

    public C224214g(String str) {
        this(false);
        A04(str);
    }

    public long A00() {
        StringBuilder sb;
        String str;
        long uptimeMillis;
        long j = this.A00;
        long j2 = this.A01;
        long j3 = 0;
        if (j2 != 0) {
            if (this.A04) {
                uptimeMillis = SystemClock.elapsedRealtime();
            } else {
                uptimeMillis = SystemClock.uptimeMillis();
            }
            j3 = uptimeMillis - j2;
        }
        long j4 = j + j3;
        if (this.A03) {
            String str2 = this.A02;
            if (str2 != null) {
                sb.append(str2);
                str = "/timer/elapsed: ";
            } else {
                sb = new StringBuilder();
                str = "timer/elapsed: ";
            }
            sb.append(str);
            sb.append(j4);
            Log.i(sb.toString());
        }
        return j4;
    }

    public long A01() {
        long uptimeMillis;
        StringBuilder sb;
        String str;
        long j = this.A01;
        if (j != 0) {
            long j2 = this.A00;
            if (this.A04) {
                uptimeMillis = SystemClock.elapsedRealtime();
            } else {
                uptimeMillis = SystemClock.uptimeMillis();
            }
            long j3 = j2 + (uptimeMillis - j);
            this.A00 = j3;
            if (this.A03) {
                String str2 = this.A02;
                if (str2 != null) {
                    sb.append(str2);
                    str = "/timer/stop: ";
                } else {
                    sb = new StringBuilder();
                    str = "timer/stop: ";
                }
                sb.append(str);
                sb.append(j3);
                Log.i(sb.toString());
            }
            this.A01 = 0;
        }
        return this.A00;
    }

    public long A02(String str) {
        long uptimeMillis;
        long j = this.A00;
        long j2 = this.A01;
        long j3 = 0;
        if (j2 != 0) {
            if (this.A04) {
                uptimeMillis = SystemClock.elapsedRealtime();
            } else {
                uptimeMillis = SystemClock.uptimeMillis();
            }
            j3 = uptimeMillis - j2;
        }
        long j4 = j + j3;
        if (this.A03) {
            StringBuilder sb = new StringBuilder();
            sb.append("timer/mark/");
            sb.append(str);
            sb.append(": ");
            sb.append(j4);
            String obj = sb.toString();
            String str2 = this.A02;
            if (str2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append("/");
                sb2.append(obj);
                obj = sb2.toString();
            }
            Log.i(obj);
        }
        return j4;
    }

    public void A03() {
        long uptimeMillis;
        if (this.A01 == 0) {
            if (this.A04) {
                uptimeMillis = SystemClock.elapsedRealtime();
            } else {
                uptimeMillis = SystemClock.uptimeMillis();
            }
            this.A01 = uptimeMillis;
        }
    }

    public void A04(String str) {
        this.A02 = str;
        this.A03 = true;
        A03();
    }

    public C224214g(boolean z) {
        this.A04 = z;
    }

    public C224214g() {
        this(false);
    }
}
