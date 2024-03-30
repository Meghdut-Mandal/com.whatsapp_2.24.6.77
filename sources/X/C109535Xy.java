package X;

import com.whatsapp.voipcalling.CallLinkInfo;

/* renamed from: X.5Xy  reason: invalid class name and case insensitive filesystem */
public abstract class C109535Xy {
    public static Integer A00(String str) {
        String str2;
        for (Integer num : C023109s.A00(3)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "fade";
                    break;
                case 2:
                    str2 = "none";
                    break;
                default:
                    str2 = CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return C023109s.A00;
    }
}
