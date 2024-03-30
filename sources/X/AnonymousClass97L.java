package X;

import android.text.TextUtils;
import java.text.MessageFormat;

/* renamed from: X.97L  reason: invalid class name */
public abstract class AnonymousClass97L {
    public static String A00(String str) {
        MessageFormat messageFormat;
        String[] strArr;
        int i;
        String substring;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String replaceAll = str.replaceAll("[^\\d]", "");
        int length = replaceAll.length();
        int i2 = 4;
        if (replaceAll.startsWith("0800") && length == 11) {
            messageFormat = new MessageFormat("{0}-{1}-{2}");
            strArr = new String[3];
            strArr[0] = replaceAll.substring(0, 4);
            i = 7;
            substring = replaceAll.substring(4, 7);
        } else if (length == 10 || length == 11) {
            messageFormat = new MessageFormat("{0} {1}-{2}");
            strArr = new String[3];
            strArr[0] = replaceAll.substring(0, 2);
            i = 6;
            substring = replaceAll.substring(2, 6);
        } else {
            if (length == 12) {
                messageFormat = new MessageFormat("{0}-{1}-{2}-{3}");
                strArr = new String[]{replaceAll.substring(0, 2), replaceAll.substring(2, 4), replaceAll.substring(4, 8), replaceAll.substring(8)};
            } else if (length != 8 && length != 9) {
                return str;
            } else {
                messageFormat = new MessageFormat("{0}-{1}");
                strArr = new String[2];
                int i3 = 4;
                if (length == 9) {
                    i3 = 5;
                }
                strArr[0] = replaceAll.substring(0, i3);
                if (length == 9) {
                    i2 = 5;
                }
                strArr[1] = replaceAll.substring(i2);
            }
            return messageFormat.format(strArr);
        }
        strArr[1] = substring;
        strArr[2] = replaceAll.substring(i);
        return messageFormat.format(strArr);
    }
}
