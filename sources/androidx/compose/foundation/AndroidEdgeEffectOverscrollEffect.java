package androidx.compose.foundation;

import X.AnonymousClass00T;
import X.AnonymousClass0AJ;
import X.AnonymousClass5RW;
import X.AnonymousClass68N;
import X.AnonymousClass69B;
import X.AnonymousClass6QQ;
import X.AnonymousClass6X0;
import X.C006302t;
import X.C023509x;
import X.C112145dQ;
import X.C112395dp;
import X.C112455dv;
import X.C113525fg;
import X.C114185go;
import X.C120675rt;
import X.C129216Fw;
import X.C133206Xf;
import X.C133336Xx;
import X.C136756ew;
import X.C14960mT;
import X.C153907Qd;
import X.C160257ki;
import X.C161267mT;
import X.C161507n1;
import X.C161927nh;
import X.C90464aC;
import X.C90494aF;
import X.C90514aH;
import X.C92694eO;
import X.C94024hW;
import X.C95034jg;
import X.C95044jh;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import java.util.List;

public final class AndroidEdgeEffectOverscrollEffect implements C160257ki {
    public int A00;
    public long A01;
    public C133206Xf A02;
    public AnonymousClass68N A03;
    public boolean A04;
    public final EdgeEffect A05;
    public final EdgeEffect A06;
    public final EdgeEffect A07;
    public final EdgeEffect A08;
    public final EdgeEffect A09;
    public final EdgeEffect A0A;
    public final EdgeEffect A0B;
    public final EdgeEffect A0C;
    public final AnonymousClass69B A0D;
    public final C161507n1 A0E;
    public final C161267mT A0F;
    public final List A0G;
    public final C006302t A0H;

    public static final EdgeEffect A04(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AnonymousClass6QQ.A02(context);
        }
        return new C92694eO(context);
    }

    public static final void A05(EdgeEffect edgeEffect, float f) {
        if (edgeEffect instanceof C92694eO) {
            C92694eO r2 = (C92694eO) edgeEffect;
            float f2 = r2.A00 + f;
            r2.A00 = f2;
            if (Math.abs(f2) > r2.A01) {
                r2.onRelease();
                return;
            }
            return;
        }
        edgeEffect.onRelease();
    }

    public static final void A06(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31 || edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public static final void A07(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        List list = androidEdgeEffectOverscrollEffect.A0G;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = (EdgeEffect) list.get(i);
            edgeEffect.onRelease();
            if (!edgeEffect.isFinished()) {
                boolean z2 = z;
                z = false;
                if (!z2) {
                }
            }
            z = true;
        }
        if (z) {
            A08(androidEdgeEffectOverscrollEffect);
        }
    }

    public static final void A08(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        int i = androidEdgeEffectOverscrollEffect.A00;
        C161507n1 r1 = androidEdgeEffectOverscrollEffect.A0E;
        if (i == r1.BCn()) {
            r1.Br4(r1.BCn() + 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        if (r12.invoke(r0, r4) == r5) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object B1L(X.C023509x r11, X.C009003v r12, long r13) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.AnonymousClass7AR
            if (r0 == 0) goto L_0x0120
            r4 = r11
            X.7AR r4 = (X.AnonymousClass7AR) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0120
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r7 = r4.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 2
            r2 = 0
            r6 = 1
            r9 = 0
            if (r0 == 0) goto L_0x0082
            if (r0 == r6) goto L_0x007e
            if (r0 != r3) goto L_0x0127
            long r0 = r4.J$0
            java.lang.Object r3 = r4.L$0
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r3 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect) r3
            X.AnonymousClass0AN.A00(r7)
        L_0x002b:
            X.6Wz r7 = (X.C133156Wz) r7
            long r4 = r7.A00
            long r4 = X.C133156Wz.A00(r0, r4)
            r3.A04 = r2
            float r2 = X.C90464aC.A01(r4)
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0072
            android.widget.EdgeEffect r1 = r3.A07
            int r0 = X.C14960mT.A01(r2)
        L_0x0043:
            A06(r1, r0)
        L_0x0046:
            float r2 = X.C90464aC.A00(r4)
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
            android.widget.EdgeEffect r1 = r3.A0B
            int r0 = X.C14960mT.A01(r2)
        L_0x0054:
            A06(r1, r0)
        L_0x0057:
            long r1 = X.C133156Wz.A01
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0060
            A08(r3)
        L_0x0060:
            A07(r3)
        L_0x0063:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0066:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
            android.widget.EdgeEffect r1 = r3.A05
            int r0 = X.C14960mT.A01(r2)
            int r0 = -r0
            goto L_0x0054
        L_0x0072:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            android.widget.EdgeEffect r1 = r3.A09
            int r0 = X.C14960mT.A01(r2)
            int r0 = -r0
            goto L_0x0043
        L_0x007e:
            X.AnonymousClass0AN.A00(r7)
            goto L_0x0063
        L_0x0082:
            X.AnonymousClass0AN.A00(r7)
            long r0 = r10.A01
            boolean r0 = X.AnonymousClass6X0.A03(r0)
            if (r0 == 0) goto L_0x009b
            X.6Wz r0 = new X.6Wz
            r0.<init>(r13)
            r4.label = r6
            java.lang.Object r0 = r12.invoke(r0, r4)
            if (r0 != r5) goto L_0x0063
        L_0x009a:
            return r5
        L_0x009b:
            long r0 = X.C133156Wz.A01
            float r1 = X.C90464aC.A01(r13)
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x010a
            android.widget.EdgeEffect r6 = r10.A07
            float r0 = X.C129216Fw.A00(r6)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x010a
            int r0 = X.C14960mT.A01(r1)
        L_0x00b3:
            A06(r6, r0)
        L_0x00b6:
            float r6 = X.C90464aC.A00(r13)
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f4
            android.widget.EdgeEffect r7 = r10.A0B
            float r0 = X.C129216Fw.A00(r7)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00f4
            int r0 = X.C14960mT.A01(r6)
        L_0x00cc:
            A06(r7, r0)
        L_0x00cf:
            long r0 = X.C90464aC.A0B(r1, r6)
            long r7 = X.C133156Wz.A01
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x00dc
            A08(r10)
        L_0x00dc:
            long r0 = X.C133156Wz.A00(r13, r0)
            X.6Wz r6 = new X.6Wz
            r6.<init>(r0)
            r4.L$0 = r10
            r4.J$0 = r0
            r4.label = r3
            java.lang.Object r7 = r12.invoke(r6, r4)
            if (r7 == r5) goto L_0x009a
            r3 = r10
            goto L_0x002b
        L_0x00f4:
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0108
            android.widget.EdgeEffect r7 = r10.A05
            float r0 = X.C129216Fw.A00(r7)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0108
            int r0 = X.C14960mT.A01(r6)
            int r0 = -r0
            goto L_0x00cc
        L_0x0108:
            r6 = 0
            goto L_0x00cf
        L_0x010a:
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x011e
            android.widget.EdgeEffect r6 = r10.A09
            float r0 = X.C129216Fw.A00(r6)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x011e
            int r0 = X.C14960mT.A01(r1)
            int r0 = -r0
            goto L_0x00b3
        L_0x011e:
            r1 = 0
            goto L_0x00b6
        L_0x0120:
            X.7AR r4 = new X.7AR
            r4.<init>(r10, r11)
            goto L_0x0012
        L_0x0127:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.B1L(X.09x, X.03v, long):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0143, code lost:
        if (r3.isFinished() != false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0164, code lost:
        if (r3.isFinished() != false) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0184, code lost:
        if (r3.isFinished() == false) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x018e, code lost:
        if (r6 == false) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0190, code lost:
        if (r10 == false) goto L_0x0189;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0195  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long B1M(X.C006302t r15, int r16, long r17) {
        /*
            r14 = this;
            long r0 = r14.A01
            boolean r2 = X.AnonymousClass6X0.A03(r0)
            r4 = r17
            if (r2 == 0) goto L_0x0018
            X.6Xf r0 = new X.6Xf
            r0.<init>(r4)
            java.lang.Object r0 = r15.invoke(r0)
            X.6Xf r0 = (X.C133206Xf) r0
            long r0 = r0.A00
            return r0
        L_0x0018:
            boolean r2 = r14.A04
            r10 = 1
            if (r2 != 0) goto L_0x0064
            float r2 = X.AnonymousClass6X0.A01(r0)
            long r2 = X.AnonymousClass5WS.A01(r2, r0)
            android.widget.EdgeEffect r0 = r14.A07
            float r0 = X.C129216Fw.A00(r0)
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0035
            long r0 = X.C133206Xf.A03
            r14.A01(r0, r2)
        L_0x0035:
            android.widget.EdgeEffect r0 = r14.A09
            float r0 = X.C129216Fw.A00(r0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0044
            long r0 = X.C133206Xf.A03
            r14.A02(r0, r2)
        L_0x0044:
            android.widget.EdgeEffect r0 = r14.A0B
            float r0 = X.C129216Fw.A00(r0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0053
            long r0 = X.C133206Xf.A03
            r14.A03(r0, r2)
        L_0x0053:
            android.widget.EdgeEffect r0 = r14.A05
            float r0 = X.C129216Fw.A00(r0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0062
            long r0 = X.C133206Xf.A03
            r14.A00(r0, r2)
        L_0x0062:
            r14.A04 = r10
        L_0x0064:
            X.6Xf r0 = r14.A02
            if (r0 == 0) goto L_0x01c7
            long r2 = r0.A00
        L_0x006a:
            float r0 = X.C133206Xf.A01(r4)
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01c4
            android.widget.EdgeEffect r1 = r14.A0B
            float r0 = X.C129216Fw.A00(r1)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x01be
            android.widget.EdgeEffect r1 = r14.A05
            float r0 = X.C129216Fw.A00(r1)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01c4
            float r7 = r14.A00(r4, r2)
        L_0x008b:
            float r0 = X.C129216Fw.A00(r1)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0096
            r1.onRelease()
        L_0x0096:
            float r0 = X.C133206Xf.A00(r4)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00c2
            android.widget.EdgeEffect r8 = r14.A07
            float r0 = X.C129216Fw.A00(r8)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x01b8
            android.widget.EdgeEffect r8 = r14.A09
            float r0 = X.C129216Fw.A00(r8)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00c2
            float r1 = r14.A02(r4, r2)
        L_0x00b6:
            float r0 = X.C129216Fw.A00(r8)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00c1
            r8.onRelease()
        L_0x00c1:
            r6 = r1
        L_0x00c2:
            long r0 = X.C90464aC.A0B(r6, r7)
            long r7 = X.C133206Xf.A03
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x00cf
            A08(r14)
        L_0x00cf:
            long r6 = X.C133206Xf.A02(r4, r0)
            X.6Xf r8 = new X.6Xf
            r8.<init>(r6)
            java.lang.Object r8 = r15.invoke(r8)
            X.6Xf r8 = (X.C133206Xf) r8
            long r8 = r8.A00
            long r6 = X.C133206Xf.A02(r6, r8)
            r11 = r16
            if (r11 != r10) goto L_0x01b5
            float r10 = X.C133206Xf.A00(r6)
            r13 = -1090519040(0xffffffffbf000000, float:-0.5)
            r12 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x01a5
            r14.A01(r6, r2)
        L_0x00f7:
            r11 = 1
        L_0x00f8:
            float r10 = X.C133206Xf.A01(r6)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0195
            r14.A03(r6, r2)
        L_0x0103:
            r2 = 1
        L_0x0104:
            if (r11 != 0) goto L_0x0108
            if (r2 == 0) goto L_0x01b5
        L_0x0108:
            r10 = 1
        L_0x0109:
            android.widget.EdgeEffect r3 = r14.A07
            boolean r2 = r3.isFinished()
            r7 = 0
            if (r2 != 0) goto L_0x0193
            float r2 = X.C133206Xf.A00(r4)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0193
            float r2 = X.C133206Xf.A00(r4)
            A05(r3, r2)
            boolean r6 = r3.isFinished()
        L_0x0125:
            android.widget.EdgeEffect r3 = r14.A09
            boolean r2 = r3.isFinished()
            if (r2 != 0) goto L_0x0146
            float r2 = X.C133206Xf.A00(r4)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0146
            float r2 = X.C133206Xf.A00(r4)
            A05(r3, r2)
            if (r6 != 0) goto L_0x0145
            boolean r2 = r3.isFinished()
            r6 = 0
            if (r2 == 0) goto L_0x0146
        L_0x0145:
            r6 = 1
        L_0x0146:
            android.widget.EdgeEffect r3 = r14.A0B
            boolean r2 = r3.isFinished()
            if (r2 != 0) goto L_0x0167
            float r2 = X.C133206Xf.A01(r4)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0167
            float r2 = X.C133206Xf.A01(r4)
            A05(r3, r2)
            if (r6 != 0) goto L_0x0166
            boolean r2 = r3.isFinished()
            r6 = 0
            if (r2 == 0) goto L_0x0167
        L_0x0166:
            r6 = 1
        L_0x0167:
            android.widget.EdgeEffect r3 = r14.A05
            boolean r2 = r3.isFinished()
            if (r2 != 0) goto L_0x018e
            float r2 = X.C133206Xf.A01(r4)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x018e
            float r2 = X.C133206Xf.A01(r4)
            A05(r3, r2)
            if (r6 != 0) goto L_0x0186
            boolean r2 = r3.isFinished()
            if (r2 == 0) goto L_0x0190
        L_0x0186:
            A08(r14)
        L_0x0189:
            long r0 = X.C133206Xf.A03(r0, r8)
            return r0
        L_0x018e:
            if (r6 != 0) goto L_0x0186
        L_0x0190:
            if (r10 == 0) goto L_0x0189
            goto L_0x0186
        L_0x0193:
            r6 = 0
            goto L_0x0125
        L_0x0195:
            float r10 = X.C133206Xf.A01(r6)
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 >= 0) goto L_0x01a2
            r14.A00(r6, r2)
            goto L_0x0103
        L_0x01a2:
            r2 = 0
            goto L_0x0104
        L_0x01a5:
            float r10 = X.C133206Xf.A00(r6)
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 >= 0) goto L_0x01b2
            r14.A02(r6, r2)
            goto L_0x00f7
        L_0x01b2:
            r11 = 0
            goto L_0x00f8
        L_0x01b5:
            r10 = 0
            goto L_0x0109
        L_0x01b8:
            float r1 = r14.A01(r4, r2)
            goto L_0x00b6
        L_0x01be:
            float r7 = r14.A03(r4, r2)
            goto L_0x008b
        L_0x01c4:
            r7 = 0
            goto L_0x0096
        L_0x01c7:
            long r0 = r14.A01
            float r2 = X.AnonymousClass6X0.A01(r0)
            long r2 = X.AnonymousClass5WS.A01(r2, r0)
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.B1M(X.02t, int, long):long");
    }

    public boolean BLz() {
        List list = this.A0G;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (C129216Fw.A00((EdgeEffect) list.get(i)) != 0.0f) {
                return true;
            }
        }
        return false;
    }

    public AndroidEdgeEffectOverscrollEffect(Context context, AnonymousClass69B r11) {
        this.A0D = r11;
        EdgeEffect A042 = A04(context);
        this.A0B = A042;
        EdgeEffect A043 = A04(context);
        this.A05 = A043;
        EdgeEffect A044 = A04(context);
        this.A07 = A044;
        EdgeEffect A045 = A04(context);
        this.A09 = A045;
        EdgeEffect[] edgeEffectArr = new EdgeEffect[4];
        edgeEffectArr[0] = A044;
        C90464aC.A1D(A042, A045, A043, edgeEffectArr);
        List A0j = C90494aF.A0j(edgeEffectArr);
        this.A0G = A0j;
        this.A0C = A04(context);
        this.A06 = A04(context);
        this.A08 = A04(context);
        this.A0A = A04(context);
        int size = A0j.size();
        for (int i = 0; i < size; i++) {
            ((EdgeEffect) A0j.get(i)).setColor(C90514aH.A0D(C133336Xx.A06(C114185go.A0G, this.A0D.A00)));
        }
        this.A00 = -1;
        AnonymousClass00T r0 = C113525fg.A01;
        this.A0E = new C94024hW(0);
        this.A01 = AnonymousClass6X0.A02;
        C153907Qd r4 = new C153907Qd(this);
        this.A0H = r4;
        C161267mT r3 = C112145dQ.A00;
        AnonymousClass0AJ r2 = AnonymousClass0AJ.A00;
        AndroidEdgeEffectOverscrollEffect$effectModifier$1 androidEdgeEffectOverscrollEffect$effectModifier$1 = new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, (C023509x) null);
        C120675rt r02 = C112395dp.A00;
        C161267mT Bva = r3.Bva(new SuspendPointerInputElement(r2, androidEdgeEffectOverscrollEffect$effectModifier$1));
        C006302t r22 = C112455dv.A00;
        this.A0F = Bva.Bva(new C95044jh(r4, r22)).Bva(new C95034jg(this, r22));
    }

    private final float A00(long j, long j2) {
        float A002 = C133206Xf.A00(j2);
        long j3 = this.A01;
        float A012 = A002 / AnonymousClass6X0.A01(j3);
        EdgeEffect edgeEffect = this.A05;
        float A003 = (-C129216Fw.A01(edgeEffect, -(C133206Xf.A01(j) / AnonymousClass6X0.A00(j3)), ((float) 1) - A012)) * AnonymousClass6X0.A00(this.A01);
        if (C129216Fw.A00(edgeEffect) != 0.0f) {
            return C133206Xf.A01(j);
        }
        return A003;
    }

    private final float A01(long j, long j2) {
        float A012 = C133206Xf.A01(j2);
        long j3 = this.A01;
        float A002 = A012 / AnonymousClass6X0.A00(j3);
        EdgeEffect edgeEffect = this.A07;
        float A013 = C129216Fw.A01(edgeEffect, C133206Xf.A00(j) / AnonymousClass6X0.A01(j3), ((float) 1) - A002) * AnonymousClass6X0.A01(this.A01);
        if (C129216Fw.A00(edgeEffect) != 0.0f) {
            return C133206Xf.A00(j);
        }
        return A013;
    }

    private final float A02(long j, long j2) {
        float A012 = C133206Xf.A01(j2);
        long j3 = this.A01;
        float A002 = A012 / AnonymousClass6X0.A00(j3);
        EdgeEffect edgeEffect = this.A09;
        float A013 = (-C129216Fw.A01(edgeEffect, -(C133206Xf.A00(j) / AnonymousClass6X0.A01(j3)), A002)) * AnonymousClass6X0.A01(this.A01);
        if (C129216Fw.A00(edgeEffect) != 0.0f) {
            return C133206Xf.A00(j);
        }
        return A013;
    }

    private final float A03(long j, long j2) {
        float A002 = C133206Xf.A00(j2);
        long j3 = this.A01;
        float A012 = A002 / AnonymousClass6X0.A01(j3);
        EdgeEffect edgeEffect = this.A0B;
        float A013 = C129216Fw.A01(edgeEffect, C133206Xf.A01(j) / AnonymousClass6X0.A00(j3), A012) * AnonymousClass6X0.A00(this.A01);
        if (C129216Fw.A00(edgeEffect) != 0.0f) {
            return C133206Xf.A01(j);
        }
        return A013;
    }

    public static final boolean A09(Canvas canvas, EdgeEffect edgeEffect, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C161927nh r9) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        float Bvq = r9.Bvq(((C136756ew) androidEdgeEffectOverscrollEffect.A0D.A01).A00);
        long j = androidEdgeEffectOverscrollEffect.A01;
        canvas.translate(-AnonymousClass6X0.A01(j), (-AnonymousClass6X0.A00(j)) + Bvq);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static final boolean A0A(Canvas canvas, EdgeEffect edgeEffect, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C161927nh r8) {
        float f;
        int save = canvas.save();
        canvas.rotate(270.0f);
        float f2 = -AnonymousClass6X0.A00(androidEdgeEffectOverscrollEffect.A01);
        C136756ew r2 = (C136756ew) androidEdgeEffectOverscrollEffect.A0D.A01;
        if (r8.getLayoutDirection() == AnonymousClass5RW.Ltr) {
            f = r2.A02;
        } else {
            f = r2.A01;
        }
        canvas.translate(f2, r8.Bvq(f));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static final boolean A0B(Canvas canvas, EdgeEffect edgeEffect, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C161927nh r8) {
        float f;
        int save = canvas.save();
        int A012 = C14960mT.A01(AnonymousClass6X0.A01(androidEdgeEffectOverscrollEffect.A01));
        C136756ew r2 = (C136756ew) androidEdgeEffectOverscrollEffect.A0D.A01;
        if (r8.getLayoutDirection() == AnonymousClass5RW.Ltr) {
            f = r2.A01;
        } else {
            f = r2.A02;
        }
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-((float) A012)) + r8.Bvq(f));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public C161267mT BBQ() {
        return this.A0F;
    }
}
