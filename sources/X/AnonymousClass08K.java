package X;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;

/* renamed from: X.08K  reason: invalid class name */
public abstract class AnonymousClass08K extends AnonymousClass08J implements AnonymousClass04G {
    public Bundle A00;
    public AnonymousClass01M A01;
    public AnonymousClass01U A02;

    public abstract AnonymousClass04R A02(AnonymousClass08M r1, Class cls, String str);

    private AnonymousClass04R A00(Class cls, String str) {
        AnonymousClass01U r4 = this.A02;
        AnonymousClass01M r3 = this.A01;
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(AnonymousClass08L.A00(r4.A00(str), this.A00), str);
        savedStateHandleController.A00(r3, r4);
        AnonymousClass08O.A01(r3, r4);
        AnonymousClass04R A022 = A02(savedStateHandleController.A01, cls, str);
        A022.A0Q(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
        return A022;
    }

    public void A01(AnonymousClass04R r3) {
        AnonymousClass01U r1 = this.A02;
        if (r1 != null) {
            AnonymousClass08O.A00(this.A01, r3, r1);
        }
    }

    public final AnonymousClass04R B46(AnonymousClass04K r3, Class cls) {
        String str = (String) r3.A00(AnonymousClass04N.A01);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (this.A02 != null) {
            return A00(cls, str);
        } else {
            return A02(C003301m.A00(r3), cls, str);
        }
    }

    public AnonymousClass08K(Bundle bundle, AnonymousClass017 r3) {
        this.A02 = r3.BGx();
        this.A01 = r3.getLifecycle();
        this.A00 = bundle;
    }

    public final AnonymousClass04R B3o(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else if (this.A01 != null) {
            return A00(cls, canonicalName);
        } else {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public AnonymousClass08K() {
    }
}
