package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.util.Objects;

/* renamed from: X.1QZ  reason: invalid class name */
public final class AnonymousClass1QZ implements C18700tb {
    public final View A00;
    public final Object A01 = new Object();
    public volatile Object A02;

    public Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    Class<C18700tb> cls = C18700tb.class;
                    View view = this.A00;
                    Context context = view.getContext();
                    while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (context == C19560w9.A00(context.getApplicationContext())) {
                        C31111bI.A00("%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", new Object[]{view.getClass()}, false);
                        context = null;
                    }
                    if (context instanceof C18700tb) {
                        C27111My r0 = (C27111My) ((C27101Mx) C19570wA.A00(C27101Mx.class, (C18700tb) context));
                        C18800tq r3 = r0.A5g;
                        C27841Qa r02 = new C27841Qa(r0.A5e, r0.A5f, r3);
                        Objects.requireNonNull(view);
                        r02.A00 = view;
                        C18800tq r32 = r02.A03;
                        this.A02 = new C27861Qc(r02.A01, r02.A02, r32);
                    } else {
                        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", new Object[]{view.getClass()}));
                    }
                }
            }
        }
        return this.A02;
    }

    public AnonymousClass1QZ(View view) {
        this.A00 = view;
    }
}
