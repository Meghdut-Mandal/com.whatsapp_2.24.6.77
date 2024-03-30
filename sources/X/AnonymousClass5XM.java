package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.5XM  reason: invalid class name */
public abstract class AnonymousClass5XM {
    public static final long A00(C161337ma r2, int i) {
        Context context = (Context) AnonymousClass6G0.A01((C136916fF) r2, C131966Ro.A01);
        if (Build.VERSION.SDK_INT >= 23) {
            return AnonymousClass5XL.A00(context, i);
        }
        long color = ((long) context.getResources().getColor(i)) << 32;
        long j = C133336Xx.A01;
        return color;
    }
}
