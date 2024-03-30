package X;

import java.util.concurrent.Callable;

/* renamed from: X.76j  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1507276j implements Callable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C1493370u A01;

    public /* synthetic */ C1507276j(C1493370u r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }

    public final Object call() {
        int i;
        C1493370u r2 = this.A01;
        float f = this.A00;
        if (!r2.A0G.get()) {
            i = -6;
        } else {
            r2.A0E.setCornerRadius(f);
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
