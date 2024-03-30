package X;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9wv  reason: invalid class name and case insensitive filesystem */
public final class C207749wv implements AnonymousClass026 {
    public AnonymousClass9V8 A00;
    public final Set A01 = C36441kJ.A17();
    public final ReentrantLock A02 = new ReentrantLock();
    public final Activity A03;

    /* renamed from: A01 */
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        C198609dr r6;
        C198599dq r2;
        AnonymousClass00C.A0D(windowLayoutInfo, 0);
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            Activity activity = this.A03;
            List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
            ArrayList A13 = C36411kG.A13(displayFeatures);
            for (FoldingFeature foldingFeature : displayFeatures) {
                if (foldingFeature instanceof FoldingFeature) {
                    AnonymousClass00C.A06(foldingFeature);
                    FoldingFeature foldingFeature2 = foldingFeature;
                    AnonymousClass00C.A0D(foldingFeature2, 1);
                    int type = foldingFeature2.getType();
                    if (type == 1) {
                        r6 = C198609dr.A01;
                    } else if (type == 2) {
                        r6 = C198609dr.A02;
                    }
                    int state = foldingFeature2.getState();
                    if (state == 1) {
                        r2 = C198599dq.A01;
                    } else if (state == 2) {
                        r2 = C198599dq.A02;
                    }
                    Rect bounds = foldingFeature2.getBounds();
                    AnonymousClass00C.A08(bounds);
                    AnonymousClass1R6 r10 = new AnonymousClass1R6(bounds);
                    Rect A002 = AnonymousClass1R3.A00.B3H(activity).A00();
                    int i = r10.A00 - r10.A03;
                    if (i != 0 || r10.A02 - r10.A01 != 0) {
                        int i2 = r10.A02 - r10.A01;
                        if (i2 == A002.width() || i == A002.height()) {
                            if (i2 >= A002.width() || i >= A002.height()) {
                                if (i2 != A002.width() || i != A002.height()) {
                                    Rect bounds2 = foldingFeature2.getBounds();
                                    AnonymousClass00C.A08(bounds2);
                                    A13.add(new C208149xj(new AnonymousClass1R6(bounds2), r2, r6));
                                }
                            }
                        }
                    }
                }
            }
            this.A00 = new AnonymousClass9V8(A13);
            for (AnonymousClass026 accept : this.A01) {
                accept.accept(this.A00);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void A00(AnonymousClass026 r3) {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            AnonymousClass9V8 r0 = this.A00;
            if (r0 != null) {
                r3.accept(r0);
            }
            this.A01.add(r3);
        } finally {
            reentrantLock.unlock();
        }
    }

    public C207749wv(Activity activity) {
        this.A03 = activity;
    }
}
