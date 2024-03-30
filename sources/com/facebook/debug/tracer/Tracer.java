package com.facebook.debug.tracer;

import X.AnonymousClass00C;
import X.AnonymousClass6YR;
import X.C1510978f;
import X.C201899kg;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.systrace.Systrace;
import java.util.IllegalFormatException;

public abstract class Tracer {
    public static final ThreadLocal A00 = new C1510978f();

    public static final void A00(String str) {
        String[][] strArr = Systrace.A02;
        if ((32 & C201899kg.A02) != 0) {
            try {
                str = StringFormatUtil.formatStrLocaleSafe(str);
            } catch (IllegalFormatException e) {
                AnonymousClass6YR.A0C("Tracer", "Bad format string", e);
            }
            AnonymousClass00C.A0B(str);
            Systrace.A01(str);
        }
    }
}
