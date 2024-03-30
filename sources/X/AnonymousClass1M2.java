package X;

import android.text.TextUtils;
import java.util.Collections;

/* renamed from: X.1M2  reason: invalid class name */
public abstract class AnonymousClass1M2 {
    public static String A01(String str, String[] strArr) {
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".");
            String str2 = strArr[i];
            sb.append(str2);
            sb.append(" AS ");
            sb.append(str2);
            strArr2[i] = sb.toString();
        }
        return TextUtils.join(", ", strArr2);
    }

    public static String A00(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(TextUtils.join(",", Collections.nCopies(i, "?")));
        sb.append(")");
        return sb.toString();
    }
}
