package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.0yg  reason: invalid class name and case insensitive filesystem */
public abstract class C21110yg {
    public final String A00;
    public final String A01;

    public void A00(SharedPreferences.Editor editor, Map map) {
        String str;
        String str2;
        StringBuilder sb;
        String str3;
        String str4;
        if (this instanceof C21140yj) {
            String str5 = (String) map.get(this.A01);
            if (!TextUtils.isEmpty(str5)) {
                editor.putString(this.A00, str5);
                return;
            }
            str = this.A00;
        } else if (this instanceof C21120yh) {
            C21120yh r5 = (C21120yh) this;
            str2 = (String) map.get(r5.A01);
            if (TextUtils.isEmpty(str2)) {
                str = r5.A00;
            } else {
                try {
                    int parseInt = Integer.parseInt(str2);
                    Integer num = r5.A02;
                    if (num != null) {
                        parseInt = Math.max(num.intValue(), parseInt);
                    }
                    Integer num2 = r5.A01;
                    if (num2 != null) {
                        parseInt = Math.min(num2.intValue(), parseInt);
                    }
                    editor.putInt(r5.A00, parseInt);
                    return;
                } catch (NumberFormatException e) {
                    e = e;
                    sb = new StringBuilder();
                    sb.append("ServerPropInteger/invalid number format for property; prefKey=");
                    str3 = r5.A00;
                    sb.append(str3);
                    sb.append("; value=");
                    sb.append(str2);
                    Log.w(sb.toString(), e);
                    editor.remove(str3);
                    return;
                }
            }
        } else {
            boolean z = this instanceof C21150yk;
            str2 = (String) map.get(this.A01);
            boolean isEmpty = TextUtils.isEmpty(str2);
            if (z) {
                if (!isEmpty) {
                    try {
                        editor.putFloat(this.A00, Float.parseFloat(str2));
                        return;
                    } catch (NumberFormatException e2) {
                        e = e2;
                        sb = new StringBuilder();
                        str4 = "ServerPropFloat/invalid number format for property; prefKey=";
                        sb.append(str4);
                        str3 = this.A00;
                        sb.append(str3);
                        sb.append("; value=");
                        sb.append(str2);
                        Log.w(sb.toString(), e);
                        editor.remove(str3);
                        return;
                    }
                }
                str = this.A00;
            } else {
                if (!isEmpty) {
                    try {
                        boolean z2 = false;
                        if (Integer.parseInt(str2) != 0) {
                            z2 = true;
                        }
                        editor.putBoolean(this.A00, z2);
                        return;
                    } catch (NumberFormatException e3) {
                        e = e3;
                        sb = new StringBuilder();
                        str4 = "ServerPropBoolean/invalid number format for property; prefKey=";
                        sb.append(str4);
                        str3 = this.A00;
                        sb.append(str3);
                        sb.append("; value=");
                        sb.append(str2);
                        Log.w(sb.toString(), e);
                        editor.remove(str3);
                        return;
                    }
                }
                str = this.A00;
            }
        }
        editor.remove(str);
    }

    public C21110yg(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
