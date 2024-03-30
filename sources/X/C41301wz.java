package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1wz  reason: invalid class name and case insensitive filesystem */
public final class C41301wz extends C09950dQ {
    public int A00 = 150;
    public int A01 = -1;
    public int A02 = 8;
    public int A03 = -1;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C81193wc A08 = new C81193wc(this);
    public final AnonymousClass4US A09;

    public boolean BZG(MotionEvent motionEvent, RecyclerView recyclerView) {
        AnonymousClass00C.A0D(motionEvent, 1);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            this.A04 = false;
        }
        return this.A04;
    }

    private final void A00(RecyclerView recyclerView, int i) {
        AnonymousClass4V2 r0;
        boolean z;
        if (i != this.A03) {
            AnonymousClass4US r2 = this.A09;
            if (r2.BPU()) {
                if (!this.A05) {
                    r2.Btq();
                }
                z = true;
            } else {
                AnonymousClass0D3 A0R = recyclerView.A0R(i, false);
                if ((A0R instanceof C41841xr) && (r0 = ((C41841xr) A0R).A00.A08) != null) {
                    r2.Bpb(r0);
                    z = false;
                } else {
                    return;
                }
            }
            this.A05 = z;
        }
    }

    private final void A01(RecyclerView recyclerView, int i) {
        AnonymousClass4V2 r1;
        if (i != this.A03) {
            AnonymousClass0D3 A0R = recyclerView.A0R(i, false);
            if ((A0R instanceof C41841xr) && (r1 = ((C41841xr) A0R).A00.A08) != null) {
                this.A09.BwO(r1);
            }
        }
    }

    public C41301wz(AnonymousClass4US r2) {
        this.A09 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x008c, code lost:
        if (r3 > r4) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BjE(android.view.MotionEvent r6, androidx.recyclerview.widget.RecyclerView r7) {
        /*
            r5 = this;
            boolean r0 = X.C36331k8.A1a(r7, r6)
            int r1 = r6.getActionMasked()
            if (r1 == r0) goto L_0x0112
            r0 = 2
            if (r1 == r0) goto L_0x0011
            r0 = 3
            if (r1 == r0) goto L_0x0112
        L_0x0010:
            return
        L_0x0011:
            float r1 = r6.getX()
            float r0 = r6.getY()
            android.view.View r0 = r7.A0O(r1, r0)
            if (r0 == 0) goto L_0x00a7
            int r4 = androidx.recyclerview.widget.RecyclerView.A00(r0)
            r0 = -1
            if (r4 == r0) goto L_0x00a7
            int r3 = r5.A01
            if (r4 == r3) goto L_0x00a7
            int r2 = r5.A03
            if (r2 == r0) goto L_0x00a7
            if (r3 != r0) goto L_0x0042
            int r1 = java.lang.Math.min(r4, r2)
            int r0 = java.lang.Math.max(r4, r2)
            if (r1 > r0) goto L_0x00a5
        L_0x003a:
            r5.A00(r7, r1)
            if (r1 == r0) goto L_0x00a5
            int r1 = r1 + 1
            goto L_0x003a
        L_0x0042:
            if (r2 <= r3) goto L_0x005c
            if (r2 <= r4) goto L_0x005c
        L_0x0046:
            r0 = 1
        L_0x0047:
            r1 = 1
            if (r0 == 0) goto L_0x0071
            if (r2 <= r3) goto L_0x0063
            if (r2 <= r4) goto L_0x0063
            if (r3 > r4) goto L_0x008e
            int r0 = r4 + -1
            if (r3 > r0) goto L_0x00a5
        L_0x0054:
            r5.A01(r7, r3)
            if (r3 == r0) goto L_0x00a5
            int r3 = r3 + 1
            goto L_0x0054
        L_0x005c:
            if (r2 >= r3) goto L_0x0061
            if (r2 >= r4) goto L_0x0061
            goto L_0x0046
        L_0x0061:
            r0 = 0
            goto L_0x0047
        L_0x0063:
            if (r3 < r4) goto L_0x0099
            int r0 = r4 + 1
            if (r0 > r3) goto L_0x00a5
        L_0x0069:
            r5.A01(r7, r3)
            if (r3 == r0) goto L_0x00a5
            int r3 = r3 + -1
            goto L_0x0069
        L_0x0071:
            if (r2 <= r3) goto L_0x007e
            int r2 = r2 - r1
            if (r3 > r2) goto L_0x008a
        L_0x0076:
            r5.A01(r7, r3)
            if (r3 == r2) goto L_0x008a
            int r3 = r3 + 1
            goto L_0x0076
        L_0x007e:
            int r0 = r2 + 1
            if (r0 > r3) goto L_0x008a
        L_0x0082:
            r5.A01(r7, r3)
            if (r3 == r0) goto L_0x008a
            int r3 = r3 + -1
            goto L_0x0082
        L_0x008a:
            int r3 = r5.A03
            if (r3 <= r4) goto L_0x0099
        L_0x008e:
            int r3 = r3 - r1
            if (r4 > r3) goto L_0x00a5
        L_0x0091:
            r5.A00(r7, r3)
            if (r3 == r4) goto L_0x00a5
            int r3 = r3 + -1
            goto L_0x0091
        L_0x0099:
            int r0 = r3 + 1
            if (r0 > r4) goto L_0x00a5
        L_0x009d:
            r5.A00(r7, r0)
            if (r0 == r4) goto L_0x00a5
            int r0 = r0 + 1
            goto L_0x009d
        L_0x00a5:
            r5.A01 = r4
        L_0x00a7:
            float r2 = r6.getY()
            int r1 = r7.getTop()
            int r0 = r5.A00
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00fd
            r1 = 0
        L_0x00b8:
            r5.A07 = r1
            if (r1 == 0) goto L_0x00ee
            float r2 = r6.getY()
            int r1 = r7.getBottom()
            int r0 = r5.A00
            int r1 = r1 - r0
            float r0 = (float) r1
            float r2 = r2 - r0
            int r0 = (int) r2
        L_0x00ca:
            int r0 = java.lang.Math.abs(r0)
            int r1 = r5.A00
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = r0 * 12
            int r0 = r0 / r1
            int r0 = r0 + 8
            r5.A02 = r0
            boolean r0 = r5.A06
            if (r0 != 0) goto L_0x0010
            r0 = 1
            r5.A06 = r0
            X.3wc r1 = r5.A08
            r1.A00 = r7
            android.os.Handler r0 = r7.getHandler()
            r0.post(r1)
            return
        L_0x00ee:
            int r1 = r7.getTop()
            int r0 = r5.A00
            int r1 = r1 + r0
            float r1 = (float) r1
            float r0 = r6.getY()
            float r1 = r1 - r0
            int r0 = (int) r1
            goto L_0x00ca
        L_0x00fd:
            float r2 = r6.getY()
            int r1 = r7.getBottom()
            int r0 = r5.A00
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r1 = 1
            if (r0 >= 0) goto L_0x00b8
            r0 = 0
            r5.A06 = r0
            goto L_0x0122
        L_0x0112:
            r1 = 0
            r5.A04 = r1
            r0 = 8
            r5.A02 = r0
            r5.A05 = r1
            r0 = -1
            r5.A01 = r0
            r5.A03 = r0
            r5.A06 = r1
        L_0x0122:
            android.os.Handler r0 = r7.getHandler()
            X.3wc r1 = r5.A08
            r0.removeCallbacks(r1)
            r0 = 0
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41301wz.BjE(android.view.MotionEvent, androidx.recyclerview.widget.RecyclerView):void");
    }
}
