package X;

import android.view.Choreographer;

/* renamed from: X.6cT  reason: invalid class name and case insensitive filesystem */
public final class C135296cT implements Choreographer.FrameCallback {
    public final /* synthetic */ C136936fJ A00;
    public final /* synthetic */ C006302t A01;
    public final /* synthetic */ AnonymousClass0AP A02;

    public C135296cT(C136936fJ r1, C006302t r2, AnonymousClass0AP r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void doFrame(long j) {
        Object obj;
        AnonymousClass0AP r2 = this.A02;
        try {
            obj = this.A01.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            obj = C90524aI.A0t(th);
        }
        r2.resumeWith(obj);
    }
}
