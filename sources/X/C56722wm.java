package X;

import android.graphics.BitmapFactory;
import android.os.ConditionVariable;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: X.2wm  reason: invalid class name and case insensitive filesystem */
public abstract class C56722wm {
    public static final BitmapFactory.Options A00;
    public static final DecimalFormat A01 = new DecimalFormat("0000", new DecimalFormatSymbols(Locale.US));

    static {
        ConditionVariable conditionVariable = C18740tg.A00;
        BitmapFactory.Options options = new BitmapFactory.Options();
        A00 = options;
        options.inDither = true;
    }
}
