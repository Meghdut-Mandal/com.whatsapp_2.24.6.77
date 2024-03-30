package X;

import java.lang.reflect.Method;

/* renamed from: X.Afk  reason: case insensitive filesystem */
public final class C22037Afk extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass9QA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22037Afk(AnonymousClass9QA r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Class<?> loadClass = this.this$0.A01.loadClass("androidx.window.extensions.WindowExtensions");
        AnonymousClass00C.A08(loadClass);
        boolean z = false;
        Method method = loadClass.getMethod("getWindowLayoutComponent", new Class[0]);
        Class<?> loadClass2 = this.this$0.A01.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        AnonymousClass00C.A08(loadClass2);
        AnonymousClass00C.A08(method);
        if (C165597tg.A1T(method) && method.getReturnType().equals(loadClass2)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
