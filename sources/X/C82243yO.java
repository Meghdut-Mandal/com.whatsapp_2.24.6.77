package X;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: X.3yO  reason: invalid class name and case insensitive filesystem */
public class C82243yO extends ThreadLocal {
    public final /* synthetic */ String A00;

    public C82243yO(String str) {
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ Object initialValue() {
        return new DecimalFormat(this.A00, DecimalFormatSymbols.getInstance(Locale.US));
    }
}
