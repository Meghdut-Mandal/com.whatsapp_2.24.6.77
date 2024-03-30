package X;

import android.graphics.PointF;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.conversation.ConversationEntryActionButton;

/* renamed from: X.2L0  reason: invalid class name */
public class AnonymousClass2L0 implements View.OnLongClickListener, View.OnTouchListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public boolean A07;
    public final int A08 = 1;

    public AnonymousClass2L0(View.OnTouchListener onTouchListener, C70803fk r3, Runnable runnable, Runnable runnable2) {
        this.A02 = r3;
        this.A03 = runnable;
        this.A05 = onTouchListener;
        this.A04 = runnable2;
        this.A06 = false;
        this.A07 = false;
        this.A00 = null;
        this.A01 = new Handler();
    }

    public static boolean A01(AnonymousClass2L0 r3) {
        if (!r3.A06) {
            return false;
        }
        C39821ts r0 = ((ConversationEntryActionButton) r3.A02).A03;
        if (r0 != null) {
            r0.A0W(false);
        }
        r3.A00 = null;
        r3.A06 = false;
        r3.A07 = false;
        ((Handler) r3.A01).removeCallbacksAndMessages((Object) null);
        C36411kG.A1O(r3.A04);
        return true;
    }

    public static boolean A02(AnonymousClass2L0 r2) {
        if (!r2.A06) {
            return false;
        }
        r2.A00 = null;
        r2.A06 = false;
        r2.A07 = false;
        ((Handler) r2.A01).removeCallbacksAndMessages((Object) null);
        C36411kG.A1O(r2.A04);
        return true;
    }

    public boolean onLongClick(View view) {
        if (this.A08 != 0) {
            return A02(this);
        }
        return A01(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r1 != 3) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            int r0 = r6.A08
            int r1 = r8.getAction()
            if (r0 == 0) goto L_0x0050
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00db
            if (r1 == r3) goto L_0x003c
            r0 = 2
            if (r1 == r0) goto L_0x001d
            r0 = 3
            if (r1 == r0) goto L_0x0048
        L_0x0014:
            java.lang.Object r0 = r6.A05
            android.view.View$OnTouchListener r0 = (android.view.View.OnTouchListener) r0
            boolean r0 = r0.onTouch(r7, r8)
            return r0
        L_0x001d:
            java.lang.Object r0 = r6.A00
            if (r0 == 0) goto L_0x0014
            java.lang.Object r2 = r6.A02
            X.3fk r2 = (X.C70803fk) r2
            java.lang.Integer r0 = r2.A60
            if (r0 == 0) goto L_0x0014
            float r1 = A00(r8, r6)
            java.lang.Integer r0 = r2.A60
            int r0 = r0.intValue()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            A02(r6)
            goto L_0x0014
        L_0x003c:
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0048
            r0 = 0
            r6.A07 = r0
            java.lang.Object r0 = r6.A03
            X.C36411kG.A1O(r0)
        L_0x0048:
            java.lang.Object r0 = r6.A01
            android.os.Handler r0 = (android.os.Handler) r0
            r0.removeCallbacksAndMessages(r4)
            goto L_0x0014
        L_0x0050:
            r5 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x009c
            if (r1 == r4) goto L_0x0070
            r0 = 2
            if (r1 == r0) goto L_0x007c
            r0 = 3
            if (r1 != r0) goto L_0x0014
            java.lang.Object r0 = r6.A02
            com.whatsapp.conversation.ConversationEntryActionButton r0 = (com.whatsapp.conversation.ConversationEntryActionButton) r0
            X.1ts r0 = r0.A03
            if (r0 == 0) goto L_0x0068
            r0.A0W(r5)
        L_0x0068:
            java.lang.Object r0 = r6.A01
            android.os.Handler r0 = (android.os.Handler) r0
            r0.removeCallbacksAndMessages(r3)
            goto L_0x0014
        L_0x0070:
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0068
            r6.A07 = r5
            java.lang.Object r0 = r6.A03
            X.C36411kG.A1O(r0)
            goto L_0x0068
        L_0x007c:
            java.lang.Object r0 = r6.A00
            if (r0 == 0) goto L_0x0014
            java.lang.Object r2 = r6.A02
            com.whatsapp.conversation.ConversationEntryActionButton r2 = (com.whatsapp.conversation.ConversationEntryActionButton) r2
            java.lang.Integer r0 = r2.A0B
            if (r0 == 0) goto L_0x0014
            float r1 = A00(r8, r6)
            java.lang.Integer r0 = r2.A0B
            int r0 = r0.intValue()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            A01(r6)
            goto L_0x0014
        L_0x009c:
            java.lang.Object r2 = r6.A02
            com.whatsapp.conversation.ConversationEntryActionButton r2 = (com.whatsapp.conversation.ConversationEntryActionButton) r2
            X.1ts r0 = r2.A03
            X.3KZ r1 = r0.A01
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r1.A0D
            if (r0 != 0) goto L_0x00ad
            r5 = 1
        L_0x00ad:
            r6.A06 = r4
            if (r5 != 0) goto L_0x00c2
            java.lang.Integer r0 = r2.A0B
            if (r0 == 0) goto L_0x00c2
            float r1 = r8.getX()
            float r0 = r8.getY()
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r1, r0)
        L_0x00c2:
            r6.A00 = r3
            if (r5 == 0) goto L_0x00c9
            A01(r6)
        L_0x00c9:
            r6.A07 = r4
            java.lang.Object r4 = r6.A01
            android.os.Handler r4 = (android.os.Handler) r4
            r0 = 26
            X.75B r3 = new X.75B
            r3.<init>((int) r0, (java.lang.Object) r6, (boolean) r5)
            long r0 = r2.getShortTapTimeoutMs()
            goto L_0x0116
        L_0x00db:
            r6.A06 = r3
            java.lang.Object r2 = r6.A02
            X.3fk r2 = (X.C70803fk) r2
            java.lang.Integer r0 = r2.A60
            if (r0 == 0) goto L_0x00f2
            float r1 = r8.getX()
            float r0 = r8.getY()
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r1, r0)
        L_0x00f2:
            r6.A00 = r4
            r6.A07 = r3
            java.lang.Object r4 = r6.A01
            android.os.Handler r4 = (android.os.Handler) r4
            r0 = 42
            X.3wT r3 = new X.3wT
            r3.<init>((java.lang.Object) r6, (int) r0)
            X.0yC r1 = r2.A3n
            r0 = 5348(0x14e4, float:7.494E-42)
            int r1 = r1.A07(r0)
            r0 = 50
            int r1 = java.lang.Math.max(r1, r0)
            r0 = 500(0x1f4, float:7.0E-43)
            int r0 = java.lang.Math.min(r1, r0)
            long r0 = (long) r0
        L_0x0116:
            r4.postDelayed(r3, r0)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2L0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public static float A00(MotionEvent motionEvent, AnonymousClass2L0 r4) {
        float x = motionEvent.getX() - ((PointF) r4.A00).x;
        float y = motionEvent.getY() - ((PointF) r4.A00).y;
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }

    public AnonymousClass2L0(View.OnTouchListener onTouchListener, ConversationEntryActionButton conversationEntryActionButton, Runnable runnable, Runnable runnable2) {
        this.A02 = conversationEntryActionButton;
        this.A03 = runnable;
        this.A05 = onTouchListener;
        this.A04 = runnable2;
        this.A06 = false;
        this.A07 = false;
        this.A00 = null;
        this.A01 = new Handler();
    }
}
