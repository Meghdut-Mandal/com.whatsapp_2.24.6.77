package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: X.03O  reason: invalid class name */
public abstract class AnonymousClass03O {
    public static final AnonymousClass03Q A00;
    public static volatile Choreographer choreographer;

    static {
        Object obj;
        Object obj2 = null;
        try {
            obj = new AnonymousClass03R(A00(Looper.getMainLooper()), (String) null, false);
        } catch (Throwable th) {
            obj = new AnonymousClass03N(th);
        }
        if (!(obj instanceof AnonymousClass03N)) {
            obj2 = obj;
        }
        A00 = (AnonymousClass03Q) obj2;
    }

    public static final Handler A00(Looper looper) {
        Object newInstance;
        if (Build.VERSION.SDK_INT >= 28) {
            newInstance = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            AnonymousClass00C.A0E(newInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            Class cls = Handler.class;
            try {
                newInstance = cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, true});
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) newInstance;
    }
}
