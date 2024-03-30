package X;

import com.whatsapp.util.Log;

/* renamed from: X.5bJ  reason: invalid class name and case insensitive filesystem */
public abstract class C110835bJ {
    public static final String A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt < 300) {
                return str;
            }
            int i = parseInt / 100;
            StringBuilder A0q = C90504aG.A0q(i);
            A0q.append('.');
            A0q.append(parseInt - (i * 100));
            return A0q.toString();
        } catch (NumberFormatException e) {
            Log.e("convertDataApiVersionToRequiredFormatForDataChannelRequest() -- failed to parse data api version", e);
            return str;
        }
    }
}
