package X;

import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchService;

/* renamed from: X.3bh  reason: invalid class name and case insensitive filesystem */
public class C68313bh implements TouchService.HitTestCallback {
    public final /* synthetic */ AnonymousClass3OC A00;

    public void hitTestResult(long j, boolean z) {
        this.A00.A03.post(new C81213we(this, 0, j, z));
    }

    public C68313bh(AnonymousClass3OC r1) {
        this.A00 = r1;
    }
}
