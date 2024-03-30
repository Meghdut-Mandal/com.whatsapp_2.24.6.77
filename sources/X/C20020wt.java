package X;

import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

/* renamed from: X.0wt  reason: invalid class name and case insensitive filesystem */
public class C20020wt implements C20010ws {
    public static final String A07 = "2.24.6.77".replace(' ', '_');
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final C19630wG A05;
    public final C18820ts A06;

    public synchronized String A02() {
        String str;
        str = this.A02;
        if (str == null) {
            C19630wG r1 = this.A05;
            Objects.requireNonNull("2.24.6.77");
            str = A00(r1, this, "2.24.6.77");
            this.A02 = str;
        }
        return str;
    }

    public synchronized String A03() {
        String str;
        str = this.A04;
        if (str == null) {
            C131166Nz r3 = new C131166Nz(false);
            Map map = r3.A01;
            map.put("FBAN", "WhatsAppAndroid");
            map.put("FBAV", A07);
            map.put("FBLC", this.A06.A07());
            str = r3.A00();
            this.A04 = str;
        }
        return str;
    }

    public synchronized String A04(Map map) {
        String str;
        str = this.A03;
        if (str == null) {
            str = A01(this, map);
            this.A03 = str;
        }
        return str;
    }

    public void BaC() {
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
    }

    static {
        Objects.requireNonNull("2.24.6.77");
    }

    public static String A00(C19630wG r11, C20020wt r12, String str) {
        String str2;
        String str3;
        String str4 = "unknown";
        Pattern compile = Pattern.compile("[^,\\.\\w\\-\\(\\)]");
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(' ', '_'));
        sb.append("");
        String obj = sb.toString();
        String replace = "Android".replace(' ', '_');
        Boolean bool = C18750th.A03;
        synchronized (r12) {
        }
        String replace2 = r11.A00.getString(R.string.f12nameremoved).replace(' ', '_');
        try {
            str2 = compile.matcher(Build.VERSION.RELEASE).replaceAll("_");
        } catch (NoSuchFieldError e) {
            Log.e("app/user-agent/release", e);
            str2 = str4;
        }
        try {
            str3 = compile.matcher(Build.MANUFACTURER).replaceAll("_");
        } catch (NoSuchFieldError e2) {
            Log.e("app/user-agent/manufacturer", e2);
            str3 = str4;
        }
        try {
            str4 = compile.matcher(Build.MODEL).replaceAll("_");
        } catch (NoSuchFieldError e3) {
            Log.e("app/user-agent/model", e3);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(replace2);
        sb2.append("/");
        sb2.append(obj);
        sb2.append(" ");
        sb2.append(replace);
        sb2.append("/");
        sb2.append(str2);
        sb2.append(" Device/");
        sb2.append(str3);
        sb2.append("-");
        sb2.append(str4);
        sb2.append("");
        return sb2.toString();
    }

    public static String A01(C20020wt r4, Map map) {
        C131166Nz r3 = new C131166Nz(true);
        r3.A00 = r4.A02();
        Map map2 = r3.A01;
        map2.put("FBAN", "WhatsAppAndroid");
        map2.put("FBAV", A07);
        map2.put("FBBV", String.valueOf(240677001));
        map2.put("FBLC", r4.A06.A0J(map));
        map2.put("FBPN", r4.A05.A00.getPackageName());
        return r3.A00();
    }

    public C20020wt(C19630wG r1, C18820ts r2) {
        this.A05 = r1;
        this.A06 = r2;
    }
}
