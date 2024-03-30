package X;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: X.0Xo  reason: invalid class name and case insensitive filesystem */
public abstract class C07410Xo {
    public static final List A00;
    public static final List A01;

    static {
        Class<AnonymousClass08M> cls = AnonymousClass08M.class;
        List asList = Arrays.asList(new Class[]{Application.class, cls});
        AnonymousClass00C.A08(asList);
        A00 = asList;
        List<AnonymousClass08M> singletonList = Collections.singletonList(cls);
        AnonymousClass00C.A08(singletonList);
        A01 = singletonList;
    }

    public static final AnonymousClass04R A00(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AnonymousClass04R) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(AnonymousClass000.A0l(cls, "Failed to access ", AnonymousClass000.A0u()), e);
        } catch (InstantiationException e2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("A ");
            A0u.append(cls);
            throw new RuntimeException(AnonymousClass000.A0q(" cannot be instantiated.", A0u), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(AnonymousClass000.A0l(cls, "An exception happened in constructor of ", AnonymousClass000.A0u()), e3.getCause());
        }
    }

    public static final Constructor A01(Class cls, List list) {
        Constructor[] constructors = cls.getConstructors();
        AnonymousClass00C.A08(constructors);
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor constructor = constructors[i];
            Class[] parameterTypes = constructor.getParameterTypes();
            AnonymousClass00C.A08(parameterTypes);
            List A0D = AnonymousClass02R.A0D(parameterTypes);
            if (AnonymousClass00C.A0J(list, A0D)) {
                Objects.requireNonNull(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            } else if (list.size() != A0D.size() || !A0D.containsAll(list)) {
                i++;
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Class ");
                A0u.append(cls.getSimpleName());
                throw AnonymousClass001.A0E(AnonymousClass000.A0l(list, " must have parameters in the proper order: ", A0u));
            }
        }
        return null;
    }
}
