package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import java.util.List;

/* renamed from: X.4dL  reason: invalid class name and case insensitive filesystem */
public class C92224dL extends TouchDelegate {
    public static final Rect A01 = AnonymousClass001.A06();
    public final List A00 = AnonymousClass001.A0I();

    public C92224dL(C92394ds r5, List list) {
        super(A01, r5);
        for (int i = 0; i < list.size(); i++) {
            this.A00.add(new C123095vv(r5, (C124115xc) list.get(i)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012e, code lost:
        if (r15.getAction() == 1) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            java.util.List r4 = r14.A00
            int r3 = r4.size()
            r2 = 1
            int r3 = r3 - r2
        L_0x0008:
            if (r3 < 0) goto L_0x0149
            java.lang.Object r5 = r4.get(r3)
            X.5vv r5 = (X.C123095vv) r5
            if (r5 == 0) goto L_0x013a
            float r0 = r15.getX()
            int r11 = (int) r0
            float r0 = r15.getY()
            int r10 = (int) r0
            int r0 = r15.getAction()
            if (r0 != 0) goto L_0x00c0
            r0 = 0
            r5.A01 = r0
            r5.A00 = r0
            r6 = 0
        L_0x0028:
            X.4ds r1 = r5.A03
            int r0 = r1.getMountItemCount()
            if (r6 >= r0) goto L_0x00c0
            X.4qw r1 = (X.C98134qw) r1
            X.5vq[] r0 = r1.A04
            r9 = r0[r6]
            if (r9 == 0) goto L_0x013e
            com.facebook.rendercore.RenderTreeNode r0 = r9.A01
            X.6Tu r0 = r0.A06
            long r12 = r0.A06()
            X.5xc r7 = r5.A04
            int r0 = r7.A06
            long r0 = (long) r0
            int r8 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0090
            java.lang.Object r9 = r9.A04
            boolean r0 = r9 instanceof android.view.View
            if (r0 == 0) goto L_0x0090
            android.view.View r9 = (android.view.View) r9
            if (r9 == 0) goto L_0x0090
            r5.A01 = r9
            android.graphics.Rect r8 = X.AnonymousClass001.A06()
            r9.getHitRect(r8)
            float r0 = r7.A04
            r1 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0093
            float r0 = r7.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0093
            int r0 = r8.left
            float r1 = (float) r0
            float r0 = r7.A02
            float r1 = r1 - r0
            int r0 = (int) r1
            r8.left = r0
            int r0 = r8.right
            float r1 = (float) r0
            float r0 = r7.A03
        L_0x0078:
            float r1 = r1 + r0
            int r0 = (int) r1
            r8.right = r0
            int r0 = r8.top
            float r1 = (float) r0
            float r0 = r7.A05
            float r1 = r1 - r0
            int r0 = (int) r1
            r8.top = r0
            int r0 = r8.bottom
            float r1 = (float) r0
            float r0 = r7.A00
            float r1 = r1 + r0
            int r0 = (int) r1
            r8.bottom = r0
            r5.A00 = r8
        L_0x0090:
            int r6 = r6 + 1
            goto L_0x0028
        L_0x0093:
            android.content.res.Resources r0 = X.C36341k9.A0F(r9)
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.getLayoutDirection()
            boolean r9 = X.C90514aH.A1V(r0)
            int r0 = r8.left
            float r1 = (float) r0
            if (r9 == 0) goto L_0x00b4
            float r0 = r7.A01
            float r1 = r1 - r0
            int r0 = (int) r1
            r8.left = r0
            int r0 = r8.right
            float r1 = (float) r0
            float r0 = r7.A04
            goto L_0x0078
        L_0x00b4:
            float r0 = r7.A04
            float r1 = r1 - r0
            int r0 = (int) r1
            r8.left = r0
            int r0 = r8.right
            float r1 = (float) r0
            float r0 = r7.A01
            goto L_0x0078
        L_0x00c0:
            android.graphics.Rect r0 = r5.A00
            r9 = 0
            if (r0 == 0) goto L_0x013a
            android.view.View r0 = r5.A01
            if (r0 == 0) goto L_0x013a
            X.4ds r0 = r5.A03
            android.content.Context r0 = r0.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r8 = r0.getScaledTouchSlop()
            android.graphics.Rect r12 = X.AnonymousClass001.A06()
            android.graphics.Rect r0 = r5.A00
            r12.set(r0)
            int r0 = -r8
            r12.inset(r0, r0)
            int r1 = r15.getAction()
            r7 = 1
            r6 = 2
            if (r1 == 0) goto L_0x0131
            if (r1 == r2) goto L_0x011f
            if (r1 == r6) goto L_0x011f
            r0 = 3
            if (r1 != r0) goto L_0x013a
            boolean r1 = r5.A02
        L_0x00f5:
            r5.A02 = r9
        L_0x00f7:
            if (r1 == 0) goto L_0x013a
            if (r7 == 0) goto L_0x0117
            android.view.View r0 = r5.A01
            int r0 = r0.getWidth()
            int r0 = r0 / r6
            float r1 = (float) r0
            android.view.View r0 = r5.A01
            int r0 = r0.getHeight()
            int r0 = r0 / r6
            float r0 = (float) r0
            r15.setLocation(r1, r0)
        L_0x010e:
            android.view.View r0 = r5.A01
            boolean r0 = r0.dispatchTouchEvent(r15)
            if (r0 == 0) goto L_0x013a
            return r2
        L_0x0117:
            int r0 = r8 * 2
            int r0 = -r0
            float r0 = (float) r0
            r15.setLocation(r0, r0)
            goto L_0x010e
        L_0x011f:
            boolean r1 = r5.A02
            if (r1 == 0) goto L_0x012a
            boolean r0 = r12.contains(r11, r10)
            if (r0 != 0) goto L_0x012a
            r7 = 0
        L_0x012a:
            int r0 = r15.getAction()
            if (r0 != r2) goto L_0x00f7
            goto L_0x00f5
        L_0x0131:
            android.graphics.Rect r0 = r5.A00
            boolean r1 = r0.contains(r11, r10)
            r5.A02 = r1
            goto L_0x00f7
        L_0x013a:
            int r3 = r3 + -1
            goto L_0x0008
        L_0x013e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "No MountItem exists at position "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r6)
            throw r0
        L_0x0149:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92224dL.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
