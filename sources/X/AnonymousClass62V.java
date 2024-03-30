package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.62V  reason: invalid class name */
public class AnonymousClass62V {
    public final /* synthetic */ ARModelMetadataRequest A00;
    public final /* synthetic */ C139456jt A01;
    public final /* synthetic */ CountDownLatch A02;

    public AnonymousClass62V(ARModelMetadataRequest aRModelMetadataRequest, C139456jt r2, CountDownLatch countDownLatch) {
        this.A01 = r2;
        this.A00 = aRModelMetadataRequest;
        this.A02 = countDownLatch;
    }

    public void A00(AnonymousClass5VK r6) {
        if (r6 != null) {
            C139456jt r4 = this.A01;
            r4.A05.set(r6);
            r4.A02.A02.A01(this.A00, r6, r4.A04, false);
        } else {
            C139456jt r1 = this.A01;
            r1.A02.A02.A01(this.A00, (AnonymousClass5VK) null, r1.A04, true);
        }
        this.A02.countDown();
    }
}
