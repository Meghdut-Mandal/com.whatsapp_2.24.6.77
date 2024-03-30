package X;

import android.graphics.Rect;
import java.lang.reflect.Method;

/* renamed from: X.Afj  reason: case insensitive filesystem */
public final class C22036Afj extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass9QA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22036Afj(AnonymousClass9QA r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Class<?> loadClass = this.this$0.A01.loadClass("androidx.window.extensions.layout.FoldingFeature");
        AnonymousClass00C.A08(loadClass);
        boolean z = false;
        Method method = loadClass.getMethod("getBounds", new Class[0]);
        Method method2 = loadClass.getMethod("getType", new Class[0]);
        Method method3 = loadClass.getMethod("getState", new Class[0]);
        AnonymousClass00C.A08(method);
        Class BDB = C36441kJ.A1A(Rect.class).BDB();
        AnonymousClass00C.A0E(BDB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        if (method.getReturnType().equals(BDB) && C165597tg.A1T(method)) {
            AnonymousClass00C.A08(method2);
            Class cls = Integer.TYPE;
            Class BDB2 = C36441kJ.A1A(cls).BDB();
            AnonymousClass00C.A0E(BDB2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            if (method2.getReturnType().equals(BDB2) && C165597tg.A1T(method2)) {
                AnonymousClass00C.A08(method3);
                Class BDB3 = C36441kJ.A1A(cls).BDB();
                AnonymousClass00C.A0E(BDB3, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
                if (method3.getReturnType().equals(BDB3) && C165597tg.A1T(method3)) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
