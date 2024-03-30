package X;

import android.content.Context;
import android.content.pm.FeatureInfo;
import com.whatsapp.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1Iw  reason: invalid class name and case insensitive filesystem */
public final class C26101Iw extends C26041Iq {
    public static Pattern A01;
    public float A00 = -1.0f;

    public static float A00(Context context, C26101Iw r5) {
        float f = r5.A00;
        if (f >= 0.0f) {
            return f;
        }
        r5.A00 = 0.0f;
        FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
        int length = systemAvailableFeatures.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            try {
                String str = systemAvailableFeatures[i].name;
                if (str != null && str.startsWith("com.htc.software.Sense")) {
                    Pattern pattern = A01;
                    if (pattern == null) {
                        pattern = Pattern.compile("com\\.htc\\.software\\.Sense(\\d+(?:\\.\\d+)?).*");
                        A01 = pattern;
                    }
                    Matcher matcher = pattern.matcher(str);
                    if (matcher.matches()) {
                        float parseFloat = Float.parseFloat(matcher.group(1));
                        if (Float.valueOf(parseFloat) != null) {
                            r5.A00 = parseFloat;
                            break;
                        }
                    } else {
                        throw new NumberFormatException("could not find version");
                    }
                }
            } catch (NumberFormatException unused) {
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("badger/htc/sense ");
        sb.append(r5.A00);
        Log.i(sb.toString());
        return r5.A00;
    }
}
