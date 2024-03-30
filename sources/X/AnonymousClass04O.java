package X;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.04O  reason: invalid class name */
public class AnonymousClass04O extends AnonymousClass04N {
    public static AnonymousClass04O A01;
    public static final C003401n A02 = AnonymousClass04Q.A00;
    public final Application A00;

    public AnonymousClass04R B3o(Class cls) {
        AnonymousClass00C.A0D(cls, 0);
        Application application = this.A00;
        if (application != null) {
            return A00(application, cls);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public AnonymousClass04R B46(AnonymousClass04K r3, Class cls) {
        AnonymousClass00C.A0D(cls, 0);
        AnonymousClass00C.A0D(r3, 1);
        if (this.A00 != null) {
            return B3o(cls);
        }
        Application application = (Application) r3.A00(A02);
        if (application != null) {
            return A00(application, cls);
        }
        if (!AnonymousClass08X.class.isAssignableFrom(cls)) {
            return super.B3o(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    private final AnonymousClass04R A00(Application application, Class cls) {
        if (!AnonymousClass08X.class.isAssignableFrom(cls)) {
            return super.B3o(cls);
        }
        try {
            AnonymousClass04R r0 = (AnonymousClass04R) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
            AnonymousClass00C.A06(r0);
            return r0;
        } catch (NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create an instance of ");
            sb.append(cls);
            throw new RuntimeException(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot create an instance of ");
            sb2.append(cls);
            throw new RuntimeException(sb2.toString(), e2);
        } catch (InstantiationException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot create an instance of ");
            sb3.append(cls);
            throw new RuntimeException(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Cannot create an instance of ");
            sb4.append(cls);
            throw new RuntimeException(sb4.toString(), e4);
        }
    }

    public AnonymousClass04O(Application application) {
        this.A00 = application;
    }

    public AnonymousClass04O() {
        this.A00 = null;
    }
}
