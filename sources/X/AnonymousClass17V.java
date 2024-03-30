package X;

import android.content.SharedPreferences;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/* renamed from: X.17V  reason: invalid class name */
public class AnonymousClass17V {
    public SharedPreferences A00;
    public final C19890wg A01;
    public final C19970wo A02;

    public synchronized long A01() {
        SharedPreferences sharedPreferences;
        String str;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            C19890wg r1 = this.A01;
            if (this instanceof C25811Ht) {
                str = "bizIntegrityTelemetry";
            } else {
                str = "chatCounts";
            }
            sharedPreferences = r1.A00(str);
            this.A00 = sharedPreferences;
        }
        return sharedPreferences.getLong("start_time_ms", 0);
    }

    public synchronized long A02(Random random) {
        long A012;
        A012 = A01();
        if (A012 == 0) {
            A012 = C19970wo.A00(this.A02) - ((long) random.nextInt(86400000));
            A04(A012);
        }
        return A012;
    }

    public synchronized void A04(long j) {
        String str;
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            C19890wg r1 = this.A01;
            if (this instanceof C25811Ht) {
                str = "bizIntegrityTelemetry";
            } else {
                str = "chatCounts";
            }
            sharedPreferences = r1.A00(str);
            this.A00 = sharedPreferences;
        }
        sharedPreferences.edit().putLong("start_time_ms", j).apply();
    }

    public synchronized byte[] A05(Random random) {
        SharedPreferences sharedPreferences;
        String str;
        String str2;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            C19890wg r1 = this.A01;
            if (this instanceof C25811Ht) {
                str2 = "bizIntegrityTelemetry";
            } else {
                str2 = "chatCounts";
            }
            sharedPreferences = r1.A00(str2);
            this.A00 = sharedPreferences;
        }
        if (!sharedPreferences.contains("thread_user_secret")) {
            byte[] bArr = new byte[32];
            random.nextBytes(bArr);
            SharedPreferences sharedPreferences2 = this.A00;
            if (sharedPreferences2 == null) {
                C19890wg r12 = this.A01;
                if (this instanceof C25811Ht) {
                    str = "bizIntegrityTelemetry";
                } else {
                    str = "chatCounts";
                }
                sharedPreferences2 = r12.A00(str);
                this.A00 = sharedPreferences2;
            }
            sharedPreferences2.edit().putString("thread_user_secret", Base64.encodeToString(bArr, 2)).apply();
        }
        return Base64.decode(sharedPreferences.getString("thread_user_secret", ""), 2);
    }

    public String A03(String str) {
        String format = new SimpleDateFormat("yyyy/MM/dd", Locale.US).format(new Date(A02(new Random()) - 28800000));
        byte[] A05 = A05(new Random());
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(format);
        return A00(A05, sb.toString());
    }

    public AnonymousClass17V(C19970wo r1, C19890wg r2) {
        this.A02 = r1;
        this.A01 = r2;
    }

    public static String A00(byte[] bArr, String str) {
        byte[] bArr2;
        try {
            bArr2 = C110525ao.A00(new String(str.getBytes(), C19430v1.A0D).getBytes(), bArr);
        } catch (Exception e) {
            Log.e("WamThreadIdManager/computeHash failed to compute hmac", e);
            bArr2 = null;
        }
        if (bArr2 != null) {
            return Base64.encodeToString(bArr2, 2);
        }
        return null;
    }
}
