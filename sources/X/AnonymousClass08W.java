package X;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.util.List;

/* renamed from: X.08W  reason: invalid class name */
public final class AnonymousClass08W extends AnonymousClass08J implements AnonymousClass04G {
    public Application A00;
    public Bundle A01;
    public AnonymousClass01M A02;
    public AnonymousClass01U A03;
    public final AnonymousClass04G A04;

    public final AnonymousClass04R A02(Class cls, String str) {
        List list;
        Object[] objArr;
        Application application;
        AnonymousClass01M r7 = this.A02;
        if (r7 != null) {
            boolean isAssignableFrom = AnonymousClass08X.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.A00 == null) {
                list = C07410Xo.A01;
            } else {
                list = C07410Xo.A00;
            }
            Constructor A012 = C07410Xo.A01(cls, list);
            if (A012 != null) {
                AnonymousClass01U r2 = this.A03;
                SavedStateHandleController savedStateHandleController = new SavedStateHandleController(AnonymousClass08L.A00(r2.A00(str), this.A01), str);
                savedStateHandleController.A00(r7, r2);
                AnonymousClass08O.A01(r7, r2);
                if (!isAssignableFrom || (application = this.A00) == null) {
                    AnonymousClass08M r0 = savedStateHandleController.A01;
                    AnonymousClass00C.A08(r0);
                    objArr = new Object[]{r0};
                } else {
                    AnonymousClass08M r02 = savedStateHandleController.A01;
                    AnonymousClass00C.A08(r02);
                    objArr = new Object[]{application, r02};
                }
                AnonymousClass04R A002 = C07410Xo.A00(cls, A012, objArr);
                A002.A0Q(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
                return A002;
            } else if (this.A00 != null) {
                return this.A04.B3o(cls);
            } else {
                AnonymousClass04N r03 = AnonymousClass04N.A00;
                if (r03 == null) {
                    r03 = new AnonymousClass04N();
                    AnonymousClass04N.A00 = r03;
                }
                return r03.B3o(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public AnonymousClass04R B3o(Class cls) {
        AnonymousClass00C.A0D(cls, 0);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return A02(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public AnonymousClass04R B46(AnonymousClass04K r7, Class cls) {
        List list;
        AnonymousClass00C.A0D(cls, 0);
        AnonymousClass00C.A0D(r7, 1);
        String str = (String) r7.A00(AnonymousClass04N.A01);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (r7.A00(C003301m.A01) != null && r7.A00(C003301m.A02) != null) {
            Object A002 = r7.A00(AnonymousClass04O.A02);
            boolean isAssignableFrom = AnonymousClass08X.class.isAssignableFrom(cls);
            if (!isAssignableFrom || A002 == null) {
                list = C07410Xo.A01;
            } else {
                list = C07410Xo.A00;
            }
            Constructor A012 = C07410Xo.A01(cls, list);
            if (A012 == null) {
                return this.A04.B46(r7, cls);
            }
            if (!isAssignableFrom || A002 == null) {
                return C07410Xo.A00(cls, A012, C003301m.A00(r7));
            }
            return C07410Xo.A00(cls, A012, A002, C003301m.A00(r7));
        } else if (this.A02 != null) {
            return A02(cls, str);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    public void A01(AnonymousClass04R r3) {
        AnonymousClass01M r1 = this.A02;
        if (r1 != null) {
            AnonymousClass08O.A00(r1, r3, this.A03);
        }
    }

    public AnonymousClass08W(Application application, Bundle bundle, AnonymousClass017 r4) {
        AnonymousClass04O r0;
        this.A03 = r4.BGx();
        this.A02 = r4.getLifecycle();
        this.A01 = bundle;
        this.A00 = application;
        if (application != null) {
            r0 = AnonymousClass04O.A01;
            if (r0 == null) {
                r0 = new AnonymousClass04O(application);
                AnonymousClass04O.A01 = r0;
            }
        } else {
            r0 = new AnonymousClass04O();
        }
        this.A04 = r0;
    }

    public AnonymousClass08W() {
        this.A04 = new AnonymousClass04O();
    }
}
