package X;

import android.content.SharedPreferences;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1E0  reason: invalid class name */
public class AnonymousClass1E0 {
    public SharedPreferences A00;
    public final C19890wg A01;

    public static String A00(int i, int i2, int i3, long j, boolean z) {
        if (!(i == 2 || i == 3 || i == 5)) {
            i = 1;
        }
        return String.format(Locale.US, "%d_%d_%d_%d_%b", new Object[]{Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z)});
    }

    public C200979iZ A01(int i, int i2, int i3, long j, boolean z) {
        C200979iZ A002;
        int i4 = i2;
        int i5 = i3;
        long j2 = j;
        boolean z2 = z;
        int i6 = i;
        String A003 = A00(i6, i4, i5, j2, z2);
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A00("media_daily_usage_preferences_v1");
            this.A00 = sharedPreferences;
        }
        String string = sharedPreferences.getString(A003, (String) null);
        if (string != null && !string.isEmpty() && (A002 = C200979iZ.A00(string)) != null) {
            return A002;
        }
        if (!(i == 2 || i == 3 || i == 5)) {
            i6 = 1;
        }
        return new C200979iZ(i6, i4, i5, j2, z2);
    }

    public void A02(C200979iZ r7, int i, int i2, int i3, long j, boolean z) {
        String A002 = A00(i, i2, i3, j, z);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bytesSent", r7.A01);
            jSONObject.put("bytesReceived", r7.A00);
            jSONObject.put("countMessageSent", r7.A05);
            jSONObject.put("countMessageReceived", r7.A04);
            jSONObject.put("countUploaded", r7.A07);
            jSONObject.put("countDownloaded", r7.A02);
            jSONObject.put("countForward", r7.A03);
            jSONObject.put("countShared", r7.A06);
            jSONObject.put("countViewed", r7.A08);
            jSONObject.put("transferDate", r7.A0C);
            jSONObject.put("mediaType", r7.A0A);
            jSONObject.put("transferRadio", r7.A0B);
            jSONObject.put("mediaTransferOrigin", r7.A09);
            jSONObject.put("isAutoDownload", r7.A0D);
            String obj = jSONObject.toString();
            SharedPreferences sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A01.A00("media_daily_usage_preferences_v1");
                this.A00 = sharedPreferences;
            }
            sharedPreferences.edit().putString(A002, obj).apply();
        } catch (JSONException e) {
            e.getMessage();
        }
    }

    public AnonymousClass1E0(C19890wg r1) {
        this.A01 = r1;
    }
}
