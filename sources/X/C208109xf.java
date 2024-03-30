package X;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.List;
import java.util.Set;

/* renamed from: X.9xf  reason: invalid class name and case insensitive filesystem */
public final class C208109xf implements B0Q {
    public static final C201019ie A03 = new C201019ie();
    public final AnonymousClass9TL A00;
    public final C190969Ba A01;
    public final ActivityEmbeddingComponent A02;

    public C208109xf(C190969Ba r2, AnonymousClass9TL r3, ActivityEmbeddingComponent activityEmbeddingComponent) {
        AnonymousClass00C.A0D(activityEmbeddingComponent, 1);
        this.A02 = activityEmbeddingComponent;
        this.A00 = r3;
        this.A01 = r2;
    }

    public void Bqp(C22767Avd avd) {
        C190969Ba r4 = this.A01;
        ActivityEmbeddingComponent activityEmbeddingComponent = this.A02;
        C019308f A1A = C36441kJ.A1A(List.class);
        C22456Amv amv = new C22456Amv(this, avd);
        ClassLoader classLoader = r4.A00;
        Class<?> loadClass = classLoader.loadClass("java.util.function.Consumer");
        AnonymousClass00C.A08(loadClass);
        AnonymousClass001.A0G(activityEmbeddingComponent.getClass(), loadClass, "setSplitInfoCallback", new Class[1], 0).invoke(activityEmbeddingComponent, new Object[]{C165587tf.A0e(classLoader, "java.util.function.Consumer", new AX4(amv, A1A), new Class[1])});
    }

    public void BsH(Set set) {
        this.A02.setEmbeddingRules(this.A00.A01(set));
    }
}
