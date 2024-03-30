package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Bu  reason: invalid class name and case insensitive filesystem */
public final class C02760Bu {
    public int A00;
    public int A01;
    public C02900Ci A02;
    public AnonymousClass0OK A03;
    public ArrayList A04 = null;
    public final ArrayList A05;
    public final ArrayList A06 = new ArrayList();
    public final List A07;
    public final /* synthetic */ RecyclerView A08;

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01de, code lost:
        if (r5.A08 == false) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x024c, code lost:
        r4.A04 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02d1, code lost:
        if (r4.A07 != r10.A0E(r4.A04)) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x031a, code lost:
        if (r4 == null) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x031c, code lost:
        r4.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00be, code lost:
        if ((r1 & 4) == 0) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0321 A[EDGE_INSN: B:263:0x0321->B:197:0x0321 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0D3 A03(int r25, long r26) {
        /*
            r24 = this;
            r9 = 0
            r7 = r24
            r8 = r25
            if (r25 < 0) goto L_0x0414
            androidx.recyclerview.widget.RecyclerView r6 = r7.A08
            X.0C4 r5 = r6.A0y
            int r0 = r5.A00()
            if (r8 >= r0) goto L_0x0414
            boolean r0 = r5.A08
            r15 = 0
            r17 = 1
            r22 = r26
            if (r0 == 0) goto L_0x010a
            java.util.ArrayList r11 = r7.A04
            if (r11 == 0) goto L_0x010a
            int r10 = r11.size()
            if (r10 == 0) goto L_0x010a
            r3 = 0
            r2 = 0
        L_0x0026:
            if (r2 >= r10) goto L_0x00d5
            java.lang.Object r4 = r11.get(r2)
            X.0D3 r4 = (X.AnonymousClass0D3) r4
            int r0 = r4.A00
            r0 = r0 & 32
            if (r0 != 0) goto L_0x00d1
            int r1 = r4.A05
            r0 = -1
            if (r1 != r0) goto L_0x003b
            int r1 = r4.A04
        L_0x003b:
            if (r1 != r8) goto L_0x00d1
        L_0x003d:
            r1 = 32
            int r0 = r4.A00
            r1 = r1 | r0
            r4.A00 = r1
        L_0x0044:
            r16 = 1
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0076
            r0 = 8192(0x2000, float:1.14794E-41)
            int r2 = r4.A00
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0076
            r0 = 8192(0x2000, float:1.14794E-41)
            int r0 = ~r0
            r2 = r2 & r0
            r4.A00 = r2
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0076
            r1 = r2 & 14
            r0 = r2 & 4
            if (r0 != 0) goto L_0x0068
            r0 = r1 & 4
            if (r0 != 0) goto L_0x0068
            r4.A04()
        L_0x0068:
            r4.A05()
            X.0Tr r0 = new X.0Tr
            r0.<init>()
            r0.A00(r4)
            r6.A0s(r0, r4)
        L_0x0076:
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x00b0
            boolean r0 = r4.A0A()
            if (r0 == 0) goto L_0x00b0
            r4.A05 = r8
        L_0x0082:
            r3 = 0
        L_0x0083:
            android.view.View r2 = r4.A0H
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            if (r1 != 0) goto L_0x00a2
            android.view.ViewGroup$LayoutParams r1 = r6.generateDefaultLayoutParams()
        L_0x008f:
            X.0D2 r1 = (X.AnonymousClass0D2) r1
            r2.setLayoutParams(r1)
        L_0x0094:
            r1.A00 = r4
            if (r16 == 0) goto L_0x009f
            if (r3 == 0) goto L_0x009f
        L_0x009a:
            r0 = r17
            r1.A02 = r0
            return r4
        L_0x009f:
            r17 = 0
            goto L_0x009a
        L_0x00a2:
            boolean r0 = r6.checkLayoutParams(r1)
            if (r0 != 0) goto L_0x00ad
            android.view.ViewGroup$LayoutParams r1 = r6.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
            goto L_0x008f
        L_0x00ad:
            X.0D2 r1 = (X.AnonymousClass0D2) r1
            goto L_0x0094
        L_0x00b0:
            boolean r0 = r4.A0A()
            if (r0 == 0) goto L_0x00c0
            int r1 = r4.A00
            r0 = r1 & 2
            if (r0 != 0) goto L_0x00c0
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0082
        L_0x00c0:
            X.0CE r0 = r6.A0D
            int r20 = r0.A04(r8, r9)
            r18 = r7
            r19 = r4
            r21 = r8
            boolean r3 = A00(r18, r19, r20, r21, r22)
            goto L_0x0083
        L_0x00d1:
            int r2 = r2 + 1
            goto L_0x0026
        L_0x00d5:
            X.0CZ r2 = r6.A0G
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x010a
            X.0CE r0 = r6.A0D
            int r1 = r0.A04(r8, r9)
            if (r1 <= 0) goto L_0x010a
            int r0 = r2.A0J()
            if (r1 >= r0) goto L_0x010a
            X.0CZ r0 = r6.A0G
            long r11 = r0.A0E(r1)
        L_0x00ef:
            if (r3 >= r10) goto L_0x010a
            java.util.ArrayList r0 = r7.A04
            java.lang.Object r4 = r0.get(r3)
            X.0D3 r4 = (X.AnonymousClass0D3) r4
            int r0 = r4.A00
            r0 = r0 & 32
            if (r0 != 0) goto L_0x0107
            long r0 = r4.A07
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0107
            goto L_0x003d
        L_0x0107:
            int r3 = r3 + 1
            goto L_0x00ef
        L_0x010a:
            r16 = 0
            java.util.ArrayList r2 = r7.A05
            int r3 = r2.size()
            r12 = 0
            r1 = 0
        L_0x0114:
            if (r1 >= r3) goto L_0x013e
            java.lang.Object r4 = r2.get(r1)
            X.0D3 r4 = (X.AnonymousClass0D3) r4
            int r0 = r4.A00
            r0 = r0 & 32
            if (r0 != 0) goto L_0x013b
            int r10 = r4.A05
            r0 = -1
            if (r10 != r0) goto L_0x0129
            int r10 = r4.A04
        L_0x0129:
            if (r10 != r8) goto L_0x013b
            int r0 = r4.A00
            r0 = r0 & 4
            if (r0 != 0) goto L_0x013b
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x01cf
            int r0 = r4.A00
            r0 = r0 & 8
            if (r0 == 0) goto L_0x01cf
        L_0x013b:
            int r1 = r1 + 1
            goto L_0x0114
        L_0x013e:
            X.0CI r11 = r6.A0E
            java.util.List r14 = r11.A02
            int r13 = r14.size()
            r4 = 0
        L_0x0147:
            if (r4 >= r13) goto L_0x019b
            java.lang.Object r10 = r14.get(r4)
            android.view.View r10 = (android.view.View) r10
            X.0D3 r3 = androidx.recyclerview.widget.RecyclerView.A04(r10)
            int r1 = r3.A05
            r0 = -1
            if (r1 != r0) goto L_0x015a
            int r1 = r3.A04
        L_0x015a:
            if (r1 != r8) goto L_0x0198
            int r0 = r3.A00
            r0 = r0 & 4
            if (r0 != 0) goto L_0x0198
            int r0 = r3.A00
            r0 = r0 & 8
            if (r0 != 0) goto L_0x0198
            if (r10 == 0) goto L_0x019b
            X.0D3 r4 = androidx.recyclerview.widget.RecyclerView.A04(r10)
            X.0CG r0 = r11.A01
            X.0CH r0 = (X.AnonymousClass0CH) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            int r3 = r0.indexOfChild(r10)
            if (r3 < 0) goto L_0x03ad
            X.0CJ r1 = r11.A00
            boolean r0 = r1.A06(r3)
            if (r0 == 0) goto L_0x0396
            r1.A03(r3)
            X.AnonymousClass0CI.A02(r10, r11)
            int r1 = r11.A05(r10)
            r0 = -1
            if (r1 == r0) goto L_0x0378
            r11.A08(r1)
            r7.A08(r10)
            r1 = 8224(0x2020, float:1.1524E-41)
            goto L_0x01d1
        L_0x0198:
            int r4 = r4 + 1
            goto L_0x0147
        L_0x019b:
            java.util.ArrayList r10 = r7.A06
            int r3 = r10.size()
        L_0x01a1:
            if (r12 >= r3) goto L_0x01f7
            java.lang.Object r4 = r10.get(r12)
            X.0D3 r4 = (X.AnonymousClass0D3) r4
            int r0 = r4.A00
            r0 = r0 & 4
            if (r0 != 0) goto L_0x01c8
            int r1 = r4.A05
            r0 = -1
            if (r1 != r0) goto L_0x01b6
            int r1 = r4.A04
        L_0x01b6:
            if (r1 != r8) goto L_0x01c8
            android.view.View r1 = r4.A0H
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x01cb
            android.view.ViewParent r1 = r1.getParent()
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0B
            if (r1 == r0) goto L_0x01cb
        L_0x01c8:
            int r12 = r12 + 1
            goto L_0x01a1
        L_0x01cb:
            r10.remove(r12)
            goto L_0x01d6
        L_0x01cf:
            r1 = 32
        L_0x01d1:
            int r0 = r4.A00
            r1 = r1 | r0
            r4.A00 = r1
        L_0x01d6:
            int r0 = r4.A00
            r0 = r0 & 8
            if (r0 == 0) goto L_0x02a3
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0044
        L_0x01e0:
            r1 = 4
            int r0 = r4.A00
            r1 = r1 | r0
            r4.A00 = r1
            X.0Bu r0 = r4.A08
            if (r0 == 0) goto L_0x0299
            android.view.View r0 = r4.A0H
            r6.removeDetachedView(r0, r9)
            X.0Bu r0 = r4.A08
            r0.A0A(r4)
        L_0x01f4:
            r7.A09(r4)
        L_0x01f7:
            X.0CE r0 = r6.A0D
            int r3 = r0.A04(r8, r9)
            if (r3 < 0) goto L_0x03c4
            X.0CZ r0 = r6.A0G
            int r0 = r0.A0J()
            if (r3 >= r0) goto L_0x03c4
            X.0CZ r0 = r6.A0G
            int r10 = r0.getItemViewType(r3)
            X.0CZ r1 = r6.A0G
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x02d8
            long r13 = r1.A0E(r3)
            int r11 = r2.size()
        L_0x021b:
            int r11 = r11 + -1
            if (r11 < 0) goto L_0x026a
            java.lang.Object r4 = r2.get(r11)
            X.0D3 r4 = (X.AnonymousClass0D3) r4
            long r0 = r4.A07
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 != 0) goto L_0x021b
            int r0 = r4.A00
            r0 = r0 & 32
            if (r0 != 0) goto L_0x021b
            int r0 = r4.A01
            if (r10 != r0) goto L_0x0250
            r1 = 32
            int r0 = r4.A00
            r1 = r1 | r0
            r4.A00 = r1
            r0 = r1 & 8
            if (r0 == 0) goto L_0x024c
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x024c
            r0 = 14
            int r0 = ~r0
            r1 = r1 & r0
            r0 = 2
            r0 = r0 | r1
            r4.A00 = r0
        L_0x024c:
            r4.A04 = r3
            goto L_0x0044
        L_0x0250:
            r2.remove(r11)
            android.view.View r0 = r4.A0H
            r6.removeDetachedView(r0, r9)
            X.0D3 r1 = androidx.recyclerview.widget.RecyclerView.A04(r0)
            r1.A08 = r15
            r1.A0F = r9
            int r0 = r1.A00
            r0 = r0 & -33
            r1.A00 = r0
            r7.A09(r1)
            goto L_0x021b
        L_0x026a:
            java.util.ArrayList r11 = r7.A06
            int r2 = r11.size()
        L_0x0270:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x02d8
            java.lang.Object r4 = r11.get(r2)
            X.0D3 r4 = (X.AnonymousClass0D3) r4
            long r0 = r4.A07
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 != 0) goto L_0x0270
            android.view.View r1 = r4.A0H
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x0291
            android.view.ViewParent r1 = r1.getParent()
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0B
            if (r1 == r0) goto L_0x0291
            goto L_0x0270
        L_0x0291:
            int r0 = r4.A01
            if (r10 != r0) goto L_0x02d5
            r11.remove(r2)
            goto L_0x024c
        L_0x0299:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x01f4
            r0 = r1 & -33
            r4.A00 = r0
            goto L_0x01f4
        L_0x02a3:
            int r1 = r4.A04
            if (r1 < 0) goto L_0x03f6
            X.0CZ r0 = r6.A0G
            int r0 = r0.A0J()
            if (r1 >= r0) goto L_0x03f6
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x02c1
            X.0CZ r1 = r6.A0G
            int r0 = r4.A04
            int r1 = r1.getItemViewType(r0)
            int r0 = r4.A01
            if (r1 == r0) goto L_0x02c1
            goto L_0x01e0
        L_0x02c1:
            X.0CZ r10 = r6.A0G
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x0044
            long r0 = r4.A07
            int r3 = r4.A04
            long r10 = r10.A0E(r3)
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x01e0
            goto L_0x0044
        L_0x02d5:
            r7.A06(r2)
        L_0x02d8:
            X.0Ci r0 = r7.A02
            if (r0 != 0) goto L_0x02e3
            X.0Ci r0 = new X.0Ci
            r0.<init>()
            r7.A02 = r0
        L_0x02e3:
            android.util.SparseArray r0 = r0.A01
            java.lang.Object r0 = r0.get(r10)
            X.0D1 r0 = (X.AnonymousClass0D1) r0
            if (r0 == 0) goto L_0x0321
            java.util.ArrayList r4 = r0.A03
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0321
            int r3 = r4.size()
        L_0x02f9:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0321
            java.lang.Object r2 = r4.get(r3)
            X.0D3 r2 = (X.AnonymousClass0D3) r2
            android.view.View r1 = r2.A0H
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x0314
            android.view.ViewParent r1 = r1.getParent()
            androidx.recyclerview.widget.RecyclerView r0 = r2.A0B
            if (r1 == r0) goto L_0x0314
            goto L_0x02f9
        L_0x0314:
            java.lang.Object r4 = r4.remove(r3)
            X.0D3 r4 = (X.AnonymousClass0D3) r4
            if (r4 == 0) goto L_0x0321
            r4.A06()
            goto L_0x0076
        L_0x0321:
            long r11 = java.lang.System.nanoTime()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r26 > r1 ? 1 : (r26 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0343
            X.0Ci r0 = r7.A02
            X.0D1 r0 = X.C02900Ci.A00(r0, r10)
            long r0 = r0.A02
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0343
            long r2 = r11 + r0
            int r0 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1))
            if (r0 < 0) goto L_0x0343
            return r15
        L_0x0343:
            X.0CZ r0 = r6.A0G
            X.0D3 r4 = r0.A05(r6, r10)
            android.view.View r0 = r4.A0H
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.A05(r0)
            if (r1 == 0) goto L_0x0358
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r4.A0C = r0
        L_0x0358:
            long r2 = java.lang.System.nanoTime()
            X.0Ci r0 = r7.A02
            long r2 = r2 - r11
            X.0D1 r12 = X.C02900Ci.A00(r0, r10)
            long r0 = r12.A02
            r13 = 0
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r10 == 0) goto L_0x0374
            r13 = 4
            long r0 = r0 / r13
            r10 = 3
            long r0 = r0 * r10
            long r2 = r2 / r13
            long r0 = r0 + r2
            r2 = r0
        L_0x0374:
            r12.A02 = r2
            goto L_0x0076
        L_0x0378:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "layout index should not be -1 after unhiding a view:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r6.A0T()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0396:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "trying to unhide a view that was not hidden"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x03ad:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "view is not a child, cannot hide "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x03c4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Inconsistency detected. Invalid item position "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "(offset:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ").state:"
            r1.append(r0)
            int r0 = r5.A00()
            r1.append(r0)
            java.lang.String r0 = r6.A0T()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x03f6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Inconsistency detected. Invalid view holder adapter position"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r6.A0T()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x0414:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Invalid item position "
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = "("
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = "). Item count:"
            r2.append(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r7.A08
            X.0C4 r0 = r1.A0y
            int r0 = r0.A00()
            r2.append(r0)
            java.lang.String r0 = r1.A0T()
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02760Bu.A03(int, long):X.0D3");
    }

    public C02760Bu(RecyclerView recyclerView) {
        this.A08 = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.A05 = arrayList;
        this.A07 = Collections.unmodifiableList(arrayList);
        this.A01 = 2;
        this.A00 = 2;
    }

    public static boolean A00(C02760Bu r10, AnonymousClass0D3 r11, int i, int i2, long j) {
        RecyclerView recyclerView = r10.A08;
        r11.A0B = recyclerView;
        int i3 = r11.A01;
        long nanoTime = System.nanoTime();
        if (j != Long.MAX_VALUE) {
            long j2 = C02900Ci.A00(r10.A02, i3).A01;
            if (j2 != 0 && nanoTime + j2 >= j) {
                return false;
            }
        }
        AnonymousClass0CZ r3 = recyclerView.A0G;
        r11.A04 = i;
        if (r3.A00) {
            r11.A07 = r3.A0E(i);
        }
        r11.A00 = (r11.A00 & (~519)) | 1;
        Method method = C000600g.A03;
        AnonymousClass00h.A01("RV OnBindView");
        r3.A0D(r11, r11.A05(), i);
        List list = r11.A0D;
        if (list != null) {
            list.clear();
        }
        r11.A00 &= -1025;
        View view = r11.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof AnonymousClass0D2) {
            ((AnonymousClass0D2) layoutParams).A01 = true;
        }
        AnonymousClass00h.A00();
        long nanoTime2 = System.nanoTime() - nanoTime;
        AnonymousClass0D1 A002 = C02900Ci.A00(r10.A02, r11.A01);
        long j3 = A002.A01;
        if (j3 != 0) {
            nanoTime2 = ((j3 / 4) * 3) + (nanoTime2 / 4);
        }
        A002.A01 = nanoTime2;
        AccessibilityManager accessibilityManager = recyclerView.A0w;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            if (C011504z.A00(view) == 0) {
                C011504z.A06(view, 1);
            }
            AnonymousClass0CK r0 = recyclerView.A0N;
            if (r0 != null) {
                C011705b A0m = r0.A0m();
                if (A0m instanceof AnonymousClass0CL) {
                    AnonymousClass0CL r02 = (AnonymousClass0CL) A0m;
                    C011705b A052 = C012005e.A05(view);
                    if (!(A052 == null || A052 == r02)) {
                        r02.A00.put(view, A052);
                    }
                }
                C012005e.A0V(view, A0m);
            }
        }
        if (!recyclerView.A0y.A08) {
            return true;
        }
        r11.A05 = i2;
        return true;
    }

    public int A01(int i) {
        if (i >= 0) {
            RecyclerView recyclerView = this.A08;
            AnonymousClass0C4 r1 = recyclerView.A0y;
            if (i < r1.A00()) {
                if (r1.A08) {
                    return recyclerView.A0D.A04(i, 0);
                }
                return i;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid position ");
        sb.append(i);
        sb.append(". State item count is ");
        RecyclerView recyclerView2 = this.A08;
        sb.append(recyclerView2.A0y.A00());
        sb.append(recyclerView2.A0T());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public void A04() {
        ArrayList arrayList = this.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            A06(size);
        }
        arrayList.clear();
        AnonymousClass0C3 r2 = this.A08.A0F;
        int[] iArr = r2.A03;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        r2.A00 = 0;
    }

    public void A05() {
        int i;
        AnonymousClass0CP r0 = this.A08.A0I;
        if (r0 != null) {
            i = r0.A02;
        } else {
            i = 0;
        }
        this.A00 = this.A01 + i;
        ArrayList arrayList = this.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0 && arrayList.size() > this.A00) {
                A06(size);
            } else {
                return;
            }
        }
    }

    public void A06(int i) {
        ArrayList arrayList = this.A06;
        A0B((AnonymousClass0D3) arrayList.get(i), true);
        arrayList.remove(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (X.C011504z.A0A(r2) == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.AnonymousClass0D3 r11) {
        /*
            r10 = this;
            X.0Bu r1 = r11.A08
            r0 = 0
            if (r1 == 0) goto L_0x0006
            r0 = 1
        L_0x0006:
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x00ea
            android.view.View r2 = r11.A0H
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != 0) goto L_0x00ea
            int r1 = r11.A00
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0038
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            r1.append(r0)
            r1.append(r11)
            androidx.recyclerview.widget.RecyclerView r0 = r10.A08
            java.lang.String r0 = r0.A0T()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0038:
            boolean r0 = r11.A09()
            if (r0 != 0) goto L_0x00cd
            r0 = r1 & 16
            if (r0 != 0) goto L_0x0049
            boolean r0 = X.C011504z.A0A(r2)
            r9 = 1
            if (r0 != 0) goto L_0x004a
        L_0x0049:
            r9 = 0
        L_0x004a:
            androidx.recyclerview.widget.RecyclerView r8 = r10.A08
            X.0CZ r0 = r8.A0G
            if (r0 == 0) goto L_0x0088
            if (r9 == 0) goto L_0x0088
            boolean r0 = r0.A0G(r11)
            if (r0 == 0) goto L_0x0088
        L_0x0058:
            int r2 = r10.A00
            if (r2 <= 0) goto L_0x00b3
            r1 = 526(0x20e, float:7.37E-43)
            int r0 = r11.A00
            r1 = r1 & r0
            if (r1 != 0) goto L_0x00b3
            java.util.ArrayList r7 = r10.A06
            int r6 = r7.size()
            if (r6 < r2) goto L_0x0070
            r10.A06(r3)
            int r6 = r6 + -1
        L_0x0070:
            if (r6 <= 0) goto L_0x00b9
            X.0C3 r5 = r8.A0F
            int r4 = r11.A04
            int[] r3 = r5.A03
            if (r3 == 0) goto L_0x0095
            int r0 = r5.A00
            int r2 = r0 * 2
            r1 = 0
        L_0x007f:
            if (r1 >= r2) goto L_0x0095
            r0 = r3[r1]
            if (r0 == r4) goto L_0x00b9
            int r1 = r1 + 2
            goto L_0x007f
        L_0x0088:
            int r0 = r11.A00
            r0 = r0 & 16
            if (r0 != 0) goto L_0x00bd
            boolean r0 = X.C011504z.A0A(r2)
            if (r0 != 0) goto L_0x00bd
            goto L_0x0058
        L_0x0095:
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x00b7
            java.lang.Object r0 = r7.get(r6)
            X.0D3 r0 = (X.AnonymousClass0D3) r0
            int r4 = r0.A04
            int[] r3 = r5.A03
            if (r3 == 0) goto L_0x00b7
            int r0 = r5.A00
            int r2 = r0 * 2
            r1 = 0
        L_0x00aa:
            if (r1 >= r2) goto L_0x00b7
            r0 = r3[r1]
            if (r0 == r4) goto L_0x0095
            int r1 = r1 + 2
            goto L_0x00aa
        L_0x00b3:
            r10.A0B(r11, r4)
            goto L_0x00be
        L_0x00b7:
            int r6 = r6 + 1
        L_0x00b9:
            r7.add(r6, r11)
            r3 = 1
        L_0x00bd:
            r4 = 0
        L_0x00be:
            X.0Bv r0 = r8.A11
            r0.A05(r11)
            if (r3 != 0) goto L_0x00cc
            if (r4 != 0) goto L_0x00cc
            if (r9 == 0) goto L_0x00cc
            r0 = 0
            r11.A0B = r0
        L_0x00cc:
            return
        L_0x00cd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            r1.append(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r10.A08
            java.lang.String r0 = r0.A0T()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00ea:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Scrapped or attached views may not be recycled. isScrap:"
            r2.append(r0)
            X.0Bu r1 = r11.A08
            r0 = 0
            if (r1 == 0) goto L_0x00fa
            r0 = 1
        L_0x00fa:
            r2.append(r0)
            java.lang.String r0 = " isAttached:"
            r2.append(r0)
            android.view.View r0 = r11.A0H
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x010b
            r3 = 1
        L_0x010b:
            r2.append(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r10.A08
            java.lang.String r0 = r0.A0T()
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02760Bu.A09(X.0D3):void");
    }

    public void A0A(AnonymousClass0D3 r2) {
        ArrayList arrayList;
        if (r2.A0F) {
            arrayList = this.A04;
        } else {
            arrayList = this.A05;
        }
        arrayList.remove(r2);
        r2.A08 = null;
        r2.A0F = false;
        r2.A00 &= -33;
    }

    public void A07(View view) {
        AnonymousClass0D3 A042 = RecyclerView.A04(view);
        if ((A042.A00 & 256) != 0) {
            this.A08.removeDetachedView(view, false);
        }
        C02760Bu r0 = A042.A08;
        if (r0 != null) {
            r0.A0A(A042);
        } else {
            int i = A042.A00;
            if ((i & 32) != 0) {
                A042.A00 = i & -33;
            }
        }
        A09(A042);
        RecyclerView recyclerView = this.A08;
        if (recyclerView.A0H == null) {
            return;
        }
        if ((A042.A00 & 16) != 0 || C011504z.A0A(A042.A0H)) {
            recyclerView.A0H.A0C(A042);
        }
    }

    public void A08(View view) {
        ArrayList arrayList;
        C02800By r1;
        AnonymousClass0D3 A042 = RecyclerView.A04(view);
        int i = A042.A00;
        if ((12 & i) != 0 || (i & 2) == 0 || (r1 = this.A08.A0H) == null || r1.A0E(A042, A042.A05())) {
            int i2 = A042.A00;
            if ((i2 & 4) != 0 && (i2 & 8) == 0) {
                RecyclerView recyclerView = this.A08;
                if (!recyclerView.A0G.A00) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                    sb.append(recyclerView.A0T());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            A042.A08 = this;
            A042.A0F = false;
            arrayList = this.A05;
        } else {
            arrayList = this.A04;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.A04 = arrayList;
            }
            A042.A08 = this;
            A042.A0F = true;
        }
        arrayList.add(A042);
    }

    public void A0B(AnonymousClass0D3 r6, boolean z) {
        C011705b r0;
        RecyclerView.A0F(r6);
        View view = r6.A0H;
        RecyclerView recyclerView = this.A08;
        AnonymousClass0CK r02 = recyclerView.A0N;
        if (r02 != null) {
            C011705b A0m = r02.A0m();
            if (A0m instanceof AnonymousClass0CL) {
                r0 = (C011705b) ((AnonymousClass0CL) A0m).A00.remove(view);
            } else {
                r0 = null;
            }
            C012005e.A0V(view, r0);
        }
        if (z) {
            C16730q0 r03 = recyclerView.A0M;
            if (r03 != null) {
                r03.BkT(r6);
            }
            AnonymousClass0CZ r04 = recyclerView.A0G;
            if (r04 != null) {
                r04.A0K(r6);
            }
            if (recyclerView.A0y != null) {
                recyclerView.A11.A05(r6);
            }
        }
        r6.A0B = null;
        C02900Ci r3 = this.A02;
        if (r3 == null) {
            r3 = new C02900Ci();
            this.A02 = r3;
        }
        int i = r6.A01;
        ArrayList arrayList = C02900Ci.A00(r3, i).A03;
        if (((AnonymousClass0D1) r3.A01.get(i)).A00 > arrayList.size()) {
            r6.A06();
            arrayList.add(r6);
        }
    }

    public View A02(int i) {
        return A03(i, Long.MAX_VALUE).A0H;
    }
}
