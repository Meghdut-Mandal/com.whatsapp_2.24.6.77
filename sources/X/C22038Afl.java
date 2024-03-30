package X;

import android.app.Activity;
import java.lang.reflect.Method;

/* renamed from: X.Afl  reason: case insensitive filesystem */
public final class C22038Afl extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass9QA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22038Afl(AnonymousClass9QA r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Class<?> cls;
        try {
            cls = this.this$0.A00.A00.loadClass("java.util.function.Consumer");
            AnonymousClass00C.A08(cls);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        boolean z = false;
        if (cls != null) {
            Class<?> loadClass = this.this$0.A01.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
            AnonymousClass00C.A08(loadClass);
            Method method = loadClass.getMethod("addWindowLayoutInfoListener", new Class[]{Activity.class, cls});
            Method method2 = loadClass.getMethod("removeWindowLayoutInfoListener", new Class[]{cls});
            AnonymousClass00C.A08(method);
            if (C165597tg.A1T(method)) {
                AnonymousClass00C.A08(method2);
                if (C165597tg.A1T(method2)) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
