package X;

import android.view.Choreographer;

/* renamed from: X.6cS  reason: invalid class name and case insensitive filesystem */
public final class C135286cS implements Choreographer.FrameCallback {
    public final /* synthetic */ C006302t A00;
    public final /* synthetic */ AnonymousClass0AP A01;

    public C135286cS(C006302t r1, AnonymousClass0AP r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void doFrame(long j) {
        Object obj;
        AnonymousClass0AP r2 = this.A01;
        C136956fL r0 = C136956fL.A01;
        try {
            obj = this.A00.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            obj = C90524aI.A0t(th);
        }
        r2.resumeWith(obj);
    }
}
