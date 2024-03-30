package X;

import com.whatsapp.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.6Qu  reason: invalid class name and case insensitive filesystem */
public abstract class C131826Qu {
    public static Date A00(int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(1, i);
        instance.set(2, i2);
        instance.set(5, i3);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTime();
    }

    public static Date A01(String str) {
        C18740tg.A05(str);
        try {
            return new SimpleDateFormat("dd/MM/yyyy", Locale.US).parse(str);
        } catch (ParseException e) {
            Log.e("Couldn't parse the date", e);
            return null;
        }
    }

    public static int[] A02(String str) {
        Date A01 = A01(str);
        int[] iArr = {-1, -1, -1};
        if (A01 == null) {
            return iArr;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(A01);
        return new int[]{instance.get(5), instance.get(2), instance.get(1)};
    }
}
