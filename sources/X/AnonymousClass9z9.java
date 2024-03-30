package X;

import java.util.Deque;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9z9  reason: invalid class name */
public class AnonymousClass9z9 implements B3Y {
    public static final AnonymousClass9z9 $redex_init_class = null;
    public final B3Y A00;
    public final C197359ba A01;
    public final C207239um A02;

    static {
        TimeUnit.MICROSECONDS.convert(2, TimeUnit.SECONDS);
    }

    public C195899Ws B8a() {
        return this.A00.B8a();
    }

    public long B8i() {
        return this.A00.B8i();
    }

    public void BdN() {
        this.A00.BdN();
    }

    public void BeW() {
        this.A00.BeW();
    }

    public void Bhv() {
        this.A00.Bhv();
    }

    public void BjQ(C206419tN r2, B5Q[] b5qArr, B5T[] b5tArr) {
        this.A00.BjQ(r2, b5qArr, b5tArr);
    }

    public boolean Bon() {
        return this.A00.Bon();
    }

    public void BrV(long j, long j2) {
        this.A00.BrV(j, j2);
    }

    public boolean Bt2(float f, long j, long j2, boolean z) {
        synchronized (this.A01) {
        }
        return this.A00.Bt2(f, j, j2, z);
    }

    public boolean BtX(float f, long j, boolean z, boolean z2) {
        return this.A00.BtX(f, j, z, z2);
    }

    public AnonymousClass9z9(B3Y b3y, C207239um r3, C197359ba r4) {
        this.A00 = b3y;
        Deque deque = C1905298t.A00;
        if (r3.A0H != null) {
            this.A01 = r4;
            this.A02 = r3;
            return;
        }
        throw AnonymousClass001.A08("video source has null video id");
    }
}
