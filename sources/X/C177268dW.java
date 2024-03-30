package X;

import com.whatsapp.infra.graphql.BaseMexCallback;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.8dW  reason: invalid class name and case insensitive filesystem */
public final class C177268dW extends BaseMexCallback implements Future {
    public C177258dV A00;
    public AnonymousClass0AK A01;
    public boolean A02;
    public final AnonymousClass9SW A03;
    public final CountDownLatch A04 = new CountDownLatch(1);

    public C177268dW(C006302t r3) {
        this.A03 = (AnonymousClass9SW) r3.invoke(this);
    }

    public Object A07(long j, TimeUnit timeUnit) {
        AnonymousClass00C.A0D(timeUnit, 1);
        if (!isDone()) {
            this.A03.A00();
            if (!this.A04.await(j, timeUnit)) {
                A05(new TimeoutException());
            }
        }
        AnonymousClass0AK r0 = this.A01;
        if (r0 != null) {
            return r0.value;
        }
        return AnonymousClass00C.A02(new C177308da("Expected a result but it was null", (Throwable) null));
    }

    private final void A00(Object obj) {
        if (this.A01 == null) {
            this.A01 = new AnonymousClass0AK(obj);
            this.A04.countDown();
        }
    }

    public final void A08(TimeUnit timeUnit, C006302t r5) {
        C177258dV r0 = new C177258dV();
        this.A00 = r0;
        r5.invoke(r0);
        A07(32000, timeUnit);
    }

    public boolean isDone() {
        return AnonymousClass000.A1Q((this.A04.getCount() > 0 ? 1 : (this.A04.getCount() == 0 ? 0 : -1)));
    }

    public void A03(C177278dX r1) {
        A00(r1);
        super.A03(r1);
    }

    public void A05(Throwable th) {
        A00(AnonymousClass00C.A02(th));
        super.A05(th);
    }

    public boolean cancel(boolean z) {
        if (isDone()) {
            return false;
        }
        this.A02 = z;
        A00(AnonymousClass00C.A02(C177358df.A00));
        return true;
    }

    public /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        return new AnonymousClass0AK(A07(j, timeUnit));
    }

    public boolean isCancelled() {
        return this.A02;
    }

    public /* bridge */ /* synthetic */ Object get() {
        return new AnonymousClass0AK(A07(32000, TimeUnit.MILLISECONDS));
    }
}
