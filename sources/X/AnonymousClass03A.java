package X;

/* renamed from: X.03A  reason: invalid class name */
public final class AnonymousClass03A extends C005502l {
    public static final AnonymousClass03A A00 = new AnonymousClass03A();

    public boolean A04(C005102h r2) {
        return false;
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }

    public C005502l A01(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    public void A03(Runnable runnable, C005102h r4) {
        C13690kH r1 = (C13690kH) r4.get(C13690kH.A01);
        if (r1 != null) {
            r1.A00 = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}
