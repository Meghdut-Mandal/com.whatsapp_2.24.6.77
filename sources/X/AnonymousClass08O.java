package X;

import androidx.lifecycle.LegacySavedStateHandleController$1;
import androidx.lifecycle.SavedStateHandleController;
import java.util.Map;

/* renamed from: X.08O  reason: invalid class name */
public abstract class AnonymousClass08O {
    public static void A01(AnonymousClass01M r2, AnonymousClass01U r3) {
        AnonymousClass01P r1 = ((AnonymousClass01N) r2).A02;
        if (r1 == AnonymousClass01P.INITIALIZED || r1.compareTo(AnonymousClass01P.STARTED) >= 0) {
            r3.A02();
        } else {
            r2.A04(new LegacySavedStateHandleController$1(r2, r3));
        }
    }

    public static void A00(AnonymousClass01M r3, AnonymousClass04R r4, AnonymousClass01U r5) {
        Object obj;
        Map map = r4.A00;
        synchronized (map) {
            obj = map.get("androidx.lifecycle.savedstate.vm.tag");
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !savedStateHandleController.A00) {
            savedStateHandleController.A00(r3, r5);
            A01(r3, r5);
        }
    }
}
