package X;

import android.content.Context;
import android.view.ScaleGestureDetector;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.2XX  reason: invalid class name */
public final class AnonymousClass2XX extends PhotoView {
    public final /* synthetic */ C47512et A00;
    public final /* synthetic */ AnonymousClass3G7 A01;

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        AnonymousClass00C.A0D(scaleGestureDetector, 0);
        C47592fB r0 = this.A01.A01;
        C47592fB.A04(r0, true, true);
        r0.A0G();
        this.A00.A01 = true;
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onScaleBegin(scaleGestureDetector);
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        AnonymousClass00C.A0D(scaleGestureDetector, 0);
        super.onScaleEnd(scaleGestureDetector);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r2 == 3) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r8.A00.A01 = false;
        getParent().requestDisallowInterceptTouchEvent(false);
        r0 = r8.A01.A01;
        X.C47592fB.A03(r0);
        r0.A0H();
        r1 = r8.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r1 == null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        r2 = r8.A00;
        r3 = r8.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r3 != 0.0f) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        r3 = r8.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        r1.A00(r2, r3, (float) (getWidth() / 2), (float) X.C36441kJ.A07(r8), 200);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r9.getPointerCount() == 1) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            r3 = 0
            X.AnonymousClass00C.A0D(r9, r3)
            int r2 = r9.getActionMasked()
            r1 = 1
            r0 = 5
            if (r2 != r0) goto L_0x001e
            int r0 = r9.getPointerCount()
            if (r0 <= r1) goto L_0x0026
            android.view.ViewParent r0 = r8.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0019:
            boolean r0 = super.onTouchEvent(r9)
            return r0
        L_0x001e:
            if (r2 != r1) goto L_0x0026
            int r0 = r9.getPointerCount()
            if (r0 == r1) goto L_0x002f
        L_0x0026:
            X.2et r0 = r8.A00
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0019
            r0 = 3
            if (r2 != r0) goto L_0x0019
        L_0x002f:
            X.2et r0 = r8.A00
            r0.A01 = r3
            android.view.ViewParent r0 = r8.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            X.3G7 r0 = r8.A01
            X.2fB r0 = r0.A01
            X.C47592fB.A03(r0)
            r0.A0H()
            X.3wE r1 = r8.A0L
            if (r1 == 0) goto L_0x0019
            float r2 = r8.A00
            float r3 = r8.A05
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0053
            float r3 = r8.A04
        L_0x0053:
            int r0 = r8.getWidth()
            int r0 = r0 / 2
            float r4 = (float) r0
            int r0 = X.C36441kJ.A07(r8)
            float r5 = (float) r0
            r6 = 200(0xc8, double:9.9E-322)
            r1.A00(r2, r3, r4, r5, r6)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2XX.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2XX(Context context, C47512et r2, AnonymousClass3G7 r3) {
        super(context);
        this.A01 = r3;
        this.A00 = r2;
    }
}
