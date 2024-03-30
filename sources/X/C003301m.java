package X;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleAttacher;
import java.util.Map;

/* renamed from: X.01m  reason: invalid class name and case insensitive filesystem */
public abstract class C003301m {
    public static final C003401n A00 = new C18550tL(0);
    public static final C003401n A01 = new C18550tL(1);
    public static final C003401n A02 = new C18550tL(2);

    public static final AnonymousClass08M A00(AnonymousClass04K r8) {
        C003901s r4;
        AnonymousClass017 r1 = (AnonymousClass017) r8.A00(A01);
        if (r1 != null) {
            AnonymousClass016 r7 = (AnonymousClass016) r8.A00(A02);
            if (r7 != null) {
                Bundle bundle = (Bundle) r8.A00(A00);
                String str = (String) r8.A00(AnonymousClass04N.A01);
                if (str != null) {
                    C003801r A012 = r1.BGx().A01();
                    if (!(A012 instanceof C003901s) || (r4 = (C003901s) A012) == null) {
                        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                    }
                    AnonymousClass08Y r3 = new AnonymousClass08Y();
                    Class<C018808a> cls = C018808a.class;
                    r3.A01(AnonymousClass08Z.A00, new C019308f(cls));
                    Map map = ((C018808a) new AnonymousClass04H(r3.A00(), r7).A01(cls, "androidx.lifecycle.internal.SavedStateHandlesVM")).A00;
                    AnonymousClass08M r0 = (AnonymousClass08M) map.get(str);
                    if (r0 != null) {
                        return r0;
                    }
                    AnonymousClass08M A002 = AnonymousClass08L.A00(r4.A00(str), bundle);
                    map.put(str, A002);
                    return A002;
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final void A01(AnonymousClass017 r4) {
        AnonymousClass01P r1 = ((AnonymousClass01N) r4.getLifecycle()).A02;
        AnonymousClass00C.A08(r1);
        if (r1 != AnonymousClass01P.INITIALIZED && r1 != AnonymousClass01P.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (r4.BGx().A01() == null) {
            C003901s r2 = new C003901s((AnonymousClass016) r4, r4.BGx());
            r4.BGx().A03(r2, "androidx.lifecycle.internal.SavedStateHandlesProvider");
            r4.getLifecycle().A04(new SavedStateHandleAttacher(r2));
        }
    }
}
