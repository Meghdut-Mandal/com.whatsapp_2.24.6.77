package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.5M7  reason: invalid class name */
public class AnonymousClass5M7 extends C132446Tt {
    public final C18820ts A00;
    public final WeakReference A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C129196Ft r3 = (C129196Ft) obj;
        C96184mv r1 = (C96184mv) this.A02.get();
        if (r3 != null && r1 != null) {
            if (r3.A0N()) {
                r3.A0G(r1.A05.A01);
            }
            AnonymousClass6XN r12 = r1.A05;
            r3.A0F(r12.A00);
            r12.A0H.BgS(r3);
        }
    }

    public AnonymousClass5M7(Context context, C18820ts r3, C96184mv r4) {
        this.A00 = r3;
        this.A01 = AnonymousClass001.A0F(context);
        this.A02 = AnonymousClass001.A0F(r4);
    }
}
