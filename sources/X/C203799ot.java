package X;

import android.content.Context;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9ot  reason: invalid class name and case insensitive filesystem */
public class C203799ot implements C22866AxL {
    public Object A00;
    public final int A01;

    public C203799ot(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ Object get() {
        switch (this.A01) {
            case 0:
                Context context = ((C193819Mz) this.A00).A00;
                Objects.requireNonNull(context);
                return context.getApplicationContext().getCacheDir();
            case 1:
                return this.A00;
            case 2:
                return ((AnimatedFactoryV2Impl) this.A00).A07;
            default:
                AnonymousClass9M7 r2 = (AnonymousClass9M7) this.A00;
                AnonymousClass00C.A0D(r2, 0);
                int i = r2.A02;
                return new AnonymousClass9N3(TimeUnit.SECONDS.toMillis(5), i, Integer.MAX_VALUE, (int) (((float) i) * r2.A00), 50, r2.A01);
        }
    }
}
