package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.H26xSupportResult;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.1Pa  reason: invalid class name and case insensitive filesystem */
public class C27631Pa {
    public SharedPreferences A00;
    public final C20810yC A01;
    public final AnonymousClass13J A02;
    public final C19890wg A03;

    public static synchronized SharedPreferences A00(C27631Pa r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A03.A00("voip_prefs");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public static String A01(int i, int i2) {
        if (i2 == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("voip_camera_info_");
            sb.append(i);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("voip_camera_info_");
        sb2.append(i);
        sb2.append("_api_");
        sb2.append(i2);
        return sb2.toString();
    }

    public C27631Pa(C20810yC r1, C19890wg r2, AnonymousClass13J r3) {
        this.A01 = r1;
        this.A03 = r2;
        this.A02 = r3;
    }

    public UserJid A02(String str) {
        SharedPreferences A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append("ad_hoc_call_invitor_");
        sb.append(str);
        return UserJid.Companion.A02(A002.getString(sb.toString(), (String) null));
    }

    public ArrayList A03() {
        Map<String, ?> all = A00(this).getAll();
        ArrayList arrayList = new ArrayList();
        for (String next : all.keySet()) {
            if (next.startsWith("joinable_")) {
                arrayList.add(next.substring(9));
            }
        }
        return arrayList;
    }

    public void A04(UserJid userJid, String str) {
        SharedPreferences.Editor edit = A00(this).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("ad_hoc_call_invitor_");
        sb.append(str);
        edit.putString(sb.toString(), userJid.getRawString()).apply();
    }

    public void A05(H26xSupportResult h26xSupportResult) {
        A00(this).edit().putBoolean("video_codec_h264_hw_supported", h26xSupportResult.isH264HwSupported).putBoolean("video_codec_h264_sw_supported", h26xSupportResult.isH264SwSupported).putBoolean("video_codec_h265_hw_supported", h26xSupportResult.isH265HwSupported).putBoolean("video_codec_h265_sw_supported", h26xSupportResult.isH265SwSupported).apply();
    }

    public void A06(String str) {
        SharedPreferences.Editor edit = A00(this).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("joinable_");
        sb.append(str);
        edit.remove(sb.toString()).apply();
    }
}
