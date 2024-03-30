package X;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* renamed from: X.9ie  reason: invalid class name and case insensitive filesystem */
public final class C201019ie {
    public static final Integer A00() {
        String str;
        try {
            return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
        } catch (NoClassDefFoundError unused) {
            str = "Embedding extension version not found";
            Log.d("EmbeddingCompat", str);
            return null;
        } catch (UnsupportedOperationException unused2) {
            str = "Stub Extension";
            Log.d("EmbeddingCompat", str);
            return null;
        }
    }

    public static final boolean A01() {
        String str;
        try {
            if (WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null) {
                return true;
            }
            return false;
        } catch (NoClassDefFoundError unused) {
            str = "Embedding extension version not found";
            Log.d("EmbeddingCompat", str);
            return false;
        } catch (UnsupportedOperationException unused2) {
            str = "Stub Extension";
            Log.d("EmbeddingCompat", str);
            return false;
        }
    }

    public final ActivityEmbeddingComponent A02() {
        ClassLoader classLoader;
        Class[] clsArr;
        InvocationHandler invocationHandler;
        if (A01()) {
            ActivityEmbeddingComponent activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
            if (activityEmbeddingComponent != null) {
                return activityEmbeddingComponent;
            }
            classLoader = C208109xf.class.getClassLoader();
            clsArr = new Class[]{ActivityEmbeddingComponent.class};
            invocationHandler = AX7.A00;
        } else {
            classLoader = C208109xf.class.getClassLoader();
            clsArr = new Class[]{ActivityEmbeddingComponent.class};
            invocationHandler = AX8.A00;
        }
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, clsArr, invocationHandler);
        AnonymousClass00C.A0E(newProxyInstance, "null cannot be cast to non-null type androidx.window.extensions.embedding.ActivityEmbeddingComponent");
        return (ActivityEmbeddingComponent) newProxyInstance;
    }
}
