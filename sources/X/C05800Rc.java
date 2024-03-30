package X;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.0Rc  reason: invalid class name and case insensitive filesystem */
public abstract class C05800Rc {
    public static final Collection A00;

    static {
        Class<CoroutineExceptionHandler> cls = CoroutineExceptionHandler.class;
        A00 = C15060md.A00(C15080mf.A05(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }
}
