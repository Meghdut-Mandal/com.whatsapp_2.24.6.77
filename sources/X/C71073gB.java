package X;

import android.icu.text.DisplayContext;
import android.icu.text.SimpleDateFormat;
import java.text.Format;

/* renamed from: X.3gB  reason: invalid class name and case insensitive filesystem */
public class C71073gB implements AnonymousClass4QB {
    public Format BC3(C18820ts r4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL yyyy", C36401kF.A0x(r4));
        simpleDateFormat.setContext(DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE);
        return simpleDateFormat;
    }
}
