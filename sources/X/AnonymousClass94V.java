package X;

import android.content.Context;
import java.util.Objects;

/* renamed from: X.94V  reason: invalid class name */
public abstract class AnonymousClass94V {
    public static C23082B3p A00(Context context, AnonymousClass5RY r4) {
        if (r4 == AnonymousClass5RY.CAMERA1) {
            if (A29.A0h == null) {
                synchronized (A29.class) {
                    if (A29.A0h == null) {
                        A29.A0h = new A29(context.getApplicationContext());
                    }
                }
            }
            A29 a29 = A29.A0h;
            a29.A0C = true;
            return a29;
        } else if (r4 == AnonymousClass5RY.CAMERA2) {
            Objects.requireNonNull(context, "Context must be provided for Camera2.");
            if (A28.A0r == null) {
                synchronized (A28.class) {
                    if (A28.A0r == null) {
                        A28.A0r = new A28(context);
                    }
                }
            }
            A28 a28 = A28.A0r;
            a28.A0H = true;
            return a28;
        } else {
            throw C90514aH.A0s(AnonymousClass000.A0l(r4, "Invalid Camera API: ", AnonymousClass000.A0u()));
        }
    }
}
