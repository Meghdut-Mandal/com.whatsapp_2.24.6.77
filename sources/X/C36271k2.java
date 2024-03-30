package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1k2  reason: invalid class name and case insensitive filesystem */
public class C36271k2 implements AnonymousClass004 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C36271k2(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final Object get() {
        int i = this.A02;
        Object obj = this.A00;
        switch (i) {
            case 0:
                return new C44122Lf((C19630wG) obj, (C18820ts) this.A01);
            case 1:
                return C132716Uy.A00((AnonymousClass13R) this.A01, (C20810yC) obj);
            default:
                return new C46342Wn(new Handler(Looper.getMainLooper()), (C21060yb) ((AnonymousClass005) obj).get(), (C21430zE) ((AnonymousClass005) this.A01).get());
        }
    }
}
