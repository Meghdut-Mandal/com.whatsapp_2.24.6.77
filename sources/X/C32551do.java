package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.Objects;

/* renamed from: X.1do  reason: invalid class name and case insensitive filesystem */
public class C32551do implements C18700tb {
    public final AnonymousClass02E A00;
    public final Object A01 = new Object();
    public volatile Object A02;

    public static final Context A00(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public Object generatedComponent() {
        AnonymousClass01I r1;
        AnonymousClass01I r12;
        AnonymousClass01I r13;
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    AnonymousClass02E r5 = this.A00;
                    C004401y r0 = r5.A0K;
                    if (r0 == null) {
                        r1 = null;
                    } else {
                        r1 = r0.A04;
                    }
                    Objects.requireNonNull(r1, "Hilt Fragments must be attached before creating the component.");
                    C004401y r02 = r5.A0K;
                    if (r02 == null) {
                        r12 = null;
                    } else {
                        r12 = r02.A04;
                    }
                    Object[] objArr = {r12.getClass()};
                    C31111bI.A00("Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", objArr, r12 instanceof C18700tb);
                    C004401y r03 = r5.A0K;
                    if (r03 == null) {
                        r13 = null;
                    } else {
                        r13 = r03.A04;
                    }
                    C27111My r04 = (C27111My) ((C27101Mx) C19570wA.A00(C27101Mx.class, r13));
                    C18800tq r3 = r04.A5g;
                    C32561dp r05 = new C32561dp(r04.A5e, r04.A5f, r3);
                    Objects.requireNonNull(r5);
                    r05.A00 = r5;
                    C18800tq r32 = r05.A03;
                    this.A02 = new C32581dr(r05.A01, r05.A02, r32);
                }
            }
        }
        return this.A02;
    }

    public C32551do(AnonymousClass02E r2) {
        this.A00 = r2;
    }
}
