package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.7a8  reason: invalid class name and case insensitive filesystem */
public final class C156537a8 extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $beyondBoundsItemCount;
    public final /* synthetic */ C156907b9 $contentPadding;
    public final /* synthetic */ C157627dq $horizontalAlignment;
    public final /* synthetic */ C158757iB $horizontalArrangement;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ AnonymousClass00S $itemProviderLambda;
    public final /* synthetic */ boolean $reverseLayout;
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ AnonymousClass7bO $verticalAlignment;
    public final /* synthetic */ C158767iC $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156537a8(C158757iB r2, C158767iC r3, C156907b9 r4, LazyListState lazyListState, C157627dq r6, AnonymousClass7bO r7, AnonymousClass00S r8, int i, boolean z, boolean z2) {
        super(2);
        this.$state = lazyListState;
        this.$isVertical = z;
        this.$contentPadding = r4;
        this.$reverseLayout = z2;
        this.$itemProviderLambda = r8;
        this.$verticalArrangement = r3;
        this.$horizontalArrangement = r2;
        this.$beyondBoundsItemCount = i;
        this.$horizontalAlignment = r6;
        this.$verticalAlignment = r7;
    }

    public static final int A00(C159827jz r2, Object obj, int i) {
        int BCd;
        if (obj != null) {
            C136776ey r1 = (C136776ey) r2;
            int i2 = r1.A01.A00.A00;
            if (i2 == 0 || ((i < i2 && obj.equals(r2.BDL(i))) || (BCd = r1.A02.BCd(obj)) == -1)) {
                return i;
            }
            return BCd;
        }
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: X.09w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v190, resolved type: X.6ex} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: X.09w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v49, resolved type: X.09w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v50, resolved type: X.09w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v51, resolved type: X.09w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v52, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v53, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v54, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v55, resolved type: X.09w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v56, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v58, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v76, resolved type: X.09w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v29, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v30, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v31, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r10v20, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0422, code lost:
        r2 = (X.C156917bA) r12.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0465, code lost:
        if (r22 == null) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r5 == r21) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x04ca, code lost:
        if (r5 != null) goto L_0x04d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04ea, code lost:
        r11 = r11 + 1;
        r2 = r2.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0560, code lost:
        if (r5.isEmpty() == false) goto L_0x0562;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06c6, code lost:
        if (r4 > r1) goto L_0x06c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r19.BMI() != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x04f0, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x04ee, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0523, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013d, code lost:
        if (r5 == r1) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013f, code lost:
        r6 = r4.A01;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0450  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r53, java.lang.Object r54) {
        /*
            r52 = this;
            r1 = r54
            r19 = r53
            r0 = r19
            X.7nK r0 = (X.C161697nK) r0
            r19 = r0
            androidx.compose.ui.unit.Constraints r1 = (androidx.compose.ui.unit.Constraints) r1
            long r0 = r1.A00
            r25 = r0
            r0 = r52
            androidx.compose.foundation.lazy.LazyListState r3 = r0.$state
            boolean r1 = r3.A09
            if (r1 != 0) goto L_0x0020
            boolean r1 = r19.BMI()
            r50 = 0
            if (r1 == 0) goto L_0x0022
        L_0x0020:
            r50 = 1
        L_0x0022:
            boolean r2 = r0.$isVertical
            if (r2 == 0) goto L_0x003c
            X.5RU r5 = X.AnonymousClass5RU.Vertical
        L_0x0028:
            X.5RU r1 = X.AnonymousClass5RU.Vertical
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r5 != r1) goto L_0x003f
            int r1 = androidx.compose.ui.unit.Constraints.A00(r25)
            if (r1 != r4) goto L_0x004c
            java.lang.String r0 = "Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x003c:
            X.5RU r5 = X.AnonymousClass5RU.Horizontal
            goto L_0x0028
        L_0x003f:
            int r1 = androidx.compose.ui.unit.Constraints.A01(r25)
            if (r1 != r4) goto L_0x004c
            java.lang.String r0 = "Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x004c:
            X.7b9 r4 = r0.$contentPadding
            X.5RW r5 = r19.getLayoutDirection()
            if (r2 == 0) goto L_0x0135
            X.6ew r4 = (X.C136756ew) r4
            X.5RW r21 = X.AnonymousClass5RW.Ltr
            r1 = r21
            if (r5 != r1) goto L_0x013f
        L_0x005c:
            float r6 = r4.A02
        L_0x005e:
            r1 = r19
            int r9 = r1.Bor(r6)
            r1 = r21
            if (r2 == 0) goto L_0x012d
            if (r5 != r1) goto L_0x0131
        L_0x006a:
            float r5 = r4.A01
        L_0x006c:
            r1 = r19
            int r7 = r1.Bor(r5)
            float r5 = r4.A03
            int r6 = r1.Bor(r5)
            float r4 = r4.A00
            int r5 = r1.Bor(r4)
            int r15 = r6 + r5
            int r14 = r9 + r7
            if (r2 == 0) goto L_0x0123
            r42 = r15
            boolean r1 = r0.$reverseLayout
            if (r1 != 0) goto L_0x008b
            r5 = r6
        L_0x008b:
            int r42 = r42 - r5
            int r7 = -r14
            int r4 = -r15
            r1 = r25
            long r16 = X.C132746Vb.A01(r7, r4, r1)
            r1 = r19
            r3.A07 = r1
            X.00S r1 = r0.$itemProviderLambda
            java.lang.Object r7 = r1.invoke()
            X.7mw r7 = (X.C161457mw) r7
            r3 = r7
            X.6ey r3 = (X.C136776ey) r3
            X.5na r8 = r3.A00
            int r4 = androidx.compose.ui.unit.Constraints.A01(r16)
            int r2 = androidx.compose.ui.unit.Constraints.A00(r16)
            X.7n1 r1 = r8.A01
            r1.Br4(r4)
            X.7n1 r1 = r8.A00
            r1.Br4(r2)
            boolean r8 = r0.$isVertical
            if (r8 == 0) goto L_0x011a
            X.7iC r1 = r0.$verticalArrangement
            if (r1 == 0) goto L_0x0840
            float r2 = r1.BHm()
        L_0x00c4:
            r1 = r19
            int r40 = r1.Bor(r2)
            X.6ez r1 = r3.A01
            X.6Mk r4 = r1.A00
            int r1 = r4.A00
            r18 = r1
            if (r8 == 0) goto L_0x0114
            int r1 = androidx.compose.ui.unit.Constraints.A00(r25)
            int r1 = r1 - r15
        L_0x00d9:
            boolean r3 = r0.$reverseLayout
            if (r3 == 0) goto L_0x00e2
            if (r1 > 0) goto L_0x00e2
            if (r8 == 0) goto L_0x0112
            int r6 = r6 + r1
        L_0x00e2:
            long r45 = X.C90484aE.A0J(r9, r6)
            X.7dq r9 = r0.$horizontalAlignment
            X.7bO r2 = r0.$verticalAlignment
            androidx.compose.foundation.lazy.LazyListState r6 = r0.$state
            X.65G r20 = new X.65G
            r33 = r20
            r34 = r7
            r35 = r6
            r36 = r19
            r37 = r9
            r38 = r2
            r39 = r18
            r41 = r5
            r43 = r16
            r47 = r8
            r48 = r3
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r47, r48)
            r2 = r20
            long r2 = r2.A00
            r6.A02 = r2
            androidx.compose.runtime.snapshots.Snapshot r10 = X.AnonymousClass6VV.A02()
            goto L_0x0143
        L_0x0112:
            int r9 = r9 + r1
            goto L_0x00e2
        L_0x0114:
            int r1 = androidx.compose.ui.unit.Constraints.A01(r25)
            int r1 = r1 - r14
            goto L_0x00d9
        L_0x011a:
            X.7iB r1 = r0.$horizontalArrangement
            if (r1 == 0) goto L_0x0847
            float r2 = r1.BHm()
            goto L_0x00c4
        L_0x0123:
            r42 = r14
            boolean r1 = r0.$reverseLayout
            r5 = r7
            if (r1 != 0) goto L_0x008b
            r5 = r9
            goto L_0x008b
        L_0x012d:
            if (r5 == r1) goto L_0x006a
            if (r5 != r1) goto L_0x006a
        L_0x0131:
            float r5 = r4.A02
            goto L_0x006c
        L_0x0135:
            X.5RW r21 = X.AnonymousClass5RW.Ltr
            X.6ew r4 = (X.C136756ew) r4
            r1 = r21
            if (r5 == r1) goto L_0x005c
            if (r5 != r1) goto L_0x005c
        L_0x013f:
            float r6 = r4.A01
            goto L_0x005e
        L_0x0143:
            androidx.compose.runtime.snapshots.Snapshot r9 = r10.A06()     // Catch:{ all -> 0x083b }
            X.6SC r6 = r6.A0G     // Catch:{ all -> 0x0836 }
            X.7n1 r2 = r6.A03     // Catch:{ all -> 0x0836 }
            int r3 = r2.BCn()     // Catch:{ all -> 0x0836 }
            java.lang.Object r8 = r6.A00     // Catch:{ all -> 0x0836 }
            int r11 = A00(r7, r8, r3)     // Catch:{ all -> 0x0836 }
            if (r3 == r11) goto L_0x015f
            r2.Br4(r11)     // Catch:{ all -> 0x0836 }
            X.6fc r2 = r6.A02     // Catch:{ all -> 0x0836 }
            r2.A00(r3)     // Catch:{ all -> 0x0836 }
        L_0x015f:
            X.7n1 r2 = r6.A04     // Catch:{ all -> 0x0836 }
            int r6 = r2.BCn()     // Catch:{ all -> 0x0836 }
            X.C1269066c.A00(r9)     // Catch:{ all -> 0x083b }
            r10.A0B()
            androidx.compose.foundation.lazy.LazyListState r3 = r0.$state
            X.76V r2 = r3.A0J
            r23 = r2
            X.5gv r2 = r3.A0I
            X.76e r2 = r2.A00
            int r3 = r2.A00
            if (r3 != 0) goto L_0x0752
            boolean r3 = r23.isEmpty()
            if (r3 == 0) goto L_0x0752
            X.09w r39 = X.C023409w.A00
        L_0x0181:
            boolean r2 = r19.BMI()
            if (r2 != 0) goto L_0x074c
            if (r50 == 0) goto L_0x074c
            androidx.compose.foundation.lazy.LazyListState r2 = r0.$state
            X.6fd r2 = r2.A03
            X.7n5 r2 = r2.A05
            float r10 = X.C90484aE.A02(r2)
        L_0x0193:
            boolean r2 = r0.$isVertical
            r34 = r2
            X.09w r28 = X.C023409w.A00
            X.7iC r2 = r0.$verticalArrangement
            r38 = r2
            X.7iB r2 = r0.$horizontalArrangement
            r37 = r2
            boolean r2 = r0.$reverseLayout
            r36 = r2
            androidx.compose.foundation.lazy.LazyListState r3 = r0.$state
            X.64S r2 = r3.A0F
            r41 = r2
            int r2 = r0.$beyondBoundsItemCount
            r24 = r2
            boolean r31 = r19.BMI()
            X.6ge r2 = r3.A04
            r35 = r2
            X.040 r2 = r3.A08
            if (r2 == 0) goto L_0x0828
            X.7n5 r2 = r3.A0O
            r51 = r2
            X.7aG r32 = new X.7aG
            r43 = r32
            r44 = r19
            r45 = r14
            r46 = r15
            r47 = r25
            r43.<init>(r44, r45, r46, r47)
            r14 = 0
            if (r5 < 0) goto L_0x0821
            if (r42 < 0) goto L_0x081a
            if (r18 > 0) goto L_0x021c
            int r46 = androidx.compose.ui.unit.Constraints.A03(r16)
            int r47 = androidx.compose.ui.unit.Constraints.A02(r16)
            java.util.ArrayList r45 = X.AnonymousClass001.A0I()
            r43 = r41
            r44 = r20
            r48 = r34
            r49 = r31
            r43.A00(r44, r45, r46, r47, r48, r49, r50)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r46)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r47)
            X.7W9 r3 = X.AnonymousClass7W9.A00
            r2 = r32
            java.lang.Object r3 = r2.BKt(r6, r4, r3)
            X.7kl r3 = (X.C160287kl) r3
            int r2 = -r5
            int r1 = r1 + r42
            r5 = 0
            r8 = 0
            X.6ge r4 = new X.6ge
            r9 = 0
            r10 = 0
            r13 = 0
            r15 = 0
            r6 = r3
            r7 = r28
            r11 = r2
            r12 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0211:
            androidx.compose.foundation.lazy.LazyListState r2 = r0.$state
            boolean r1 = r19.BMI()
            r0 = 0
            r2.A01(r4, r1, r0)
            return r4
        L_0x021c:
            r2 = r18
            if (r11 < r2) goto L_0x0223
            int r11 = r18 + -1
            r6 = 0
        L_0x0223:
            int r9 = X.C14960mT.A01(r10)
            int r6 = r6 - r9
            if (r11 != 0) goto L_0x022e
            if (r6 >= 0) goto L_0x022e
            int r9 = r9 + r6
            r6 = 0
        L_0x022e:
            X.02g r7 = new X.02g
            r7.<init>()
            int r2 = -r5
            r23 = r2
            r3 = 0
            if (r40 >= 0) goto L_0x023b
            r3 = r40
        L_0x023b:
            int r3 = r3 + r2
            int r6 = r6 + r3
            r8 = 0
        L_0x023e:
            if (r6 >= 0) goto L_0x0257
            if (r11 <= 0) goto L_0x0257
            int r11 = r11 + -1
            r2 = r20
            X.6ex r4 = r2.A00(r11)
            r7.add(r14, r4)
            int r2 = r4.A02
            int r8 = java.lang.Math.max(r8, r2)
            int r2 = r4.A05
            int r6 = r6 + r2
            goto L_0x023e
        L_0x0257:
            if (r6 >= r3) goto L_0x025b
            int r9 = r9 + r6
            r6 = r3
        L_0x025b:
            int r6 = r6 - r3
            int r27 = r1 + r42
            r22 = r27
            r12 = 0
            r2 = r27
            if (r2 >= r14) goto L_0x0267
            r22 = 0
        L_0x0267:
            int r4 = -r6
            r33 = r11
            r42 = 0
        L_0x026c:
            int r2 = r7.size()
            if (r12 >= r2) goto L_0x028a
            r2 = r22
            if (r4 < r2) goto L_0x027c
            r7.remove(r12)
            r42 = 1
            goto L_0x026c
        L_0x027c:
            int r33 = r33 + 1
            java.lang.Object r2 = r7.get(r12)
            X.6ex r2 = (X.C136766ex) r2
            int r2 = r2.A05
            int r4 = r4 + r2
            int r12 = r12 + 1
            goto L_0x026c
        L_0x028a:
            r12 = r33
            r2 = r18
            if (r12 >= r2) goto L_0x02bd
            r2 = r22
            if (r4 < r2) goto L_0x029c
            if (r4 <= 0) goto L_0x029c
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x02bd
        L_0x029c:
            r2 = r20
            X.6ex r13 = r2.A00(r12)
            int r15 = r13.A05
            int r4 = r4 + r15
            if (r4 > r3) goto L_0x02b3
            int r2 = r18 + -1
            if (r12 == r2) goto L_0x02b3
            int r11 = r33 + 1
            int r6 = r6 - r15
            r42 = 1
        L_0x02b0:
            int r33 = r33 + 1
            goto L_0x028a
        L_0x02b3:
            int r2 = r13.A02
            int r8 = java.lang.Math.max(r8, r2)
            r7.add(r13)
            goto L_0x02b0
        L_0x02bd:
            r3 = r9
            if (r4 >= r1) goto L_0x02e3
            int r3 = r1 - r4
            int r6 = r6 - r3
            int r4 = r4 + r3
        L_0x02c4:
            if (r6 >= r5) goto L_0x02dd
            if (r11 <= 0) goto L_0x02dd
            int r11 = r11 + -1
            r2 = r20
            X.6ex r2 = r2.A00(r11)
            r7.add(r14, r2)
            int r12 = r2.A02
            int r8 = java.lang.Math.max(r8, r12)
            int r2 = r2.A05
            int r6 = r6 + r2
            goto L_0x02c4
        L_0x02dd:
            int r3 = r3 + r9
            if (r6 >= 0) goto L_0x02e3
            int r3 = r3 + r6
            int r4 = r4 + r6
            r6 = 0
        L_0x02e3:
            int r2 = X.C14960mT.A01(r10)
            if (r2 >= 0) goto L_0x035d
            r12 = -1
        L_0x02ea:
            if (r3 >= 0) goto L_0x0358
            r2 = -1
        L_0x02ed:
            if (r12 != r2) goto L_0x0355
            int r2 = X.C14960mT.A01(r10)
            int r12 = java.lang.Math.abs(r2)
            int r2 = java.lang.Math.abs(r3)
            if (r12 < r2) goto L_0x0355
            float r2 = (float) r3
            r30 = r2
        L_0x0300:
            float r10 = r10 - r30
            r2 = 0
            if (r31 == 0) goto L_0x0352
            if (r3 <= r9) goto L_0x0352
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0352
            int r3 = r3 - r9
            float r2 = (float) r3
            float r29 = r2 + r10
        L_0x030f:
            if (r6 < 0) goto L_0x0813
            int r9 = -r6
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L_0x080b
            java.lang.Object[] r3 = r7.A02
            int r2 = r7.A00
            r26 = r3[r2]
            r2 = r26
            X.6ex r2 = (X.C136766ex) r2
            r26 = r2
            if (r5 > 0) goto L_0x0328
            if (r40 >= 0) goto L_0x0362
        L_0x0328:
            int r10 = r7.size()
            r5 = 0
        L_0x032d:
            if (r5 >= r10) goto L_0x0362
            java.lang.Object r2 = r7.get(r5)
            X.6ex r2 = (X.C136766ex) r2
            int r3 = r2.A05
            if (r6 == 0) goto L_0x0362
            if (r3 > r6) goto L_0x0362
            X.AnonymousClass00C.A0D(r7, r14)
            int r2 = X.C36431kI.A07(r7)
            if (r5 == r2) goto L_0x0362
            int r6 = r6 - r3
            int r5 = r5 + 1
            java.lang.Object r26 = r7.get(r5)
            r2 = r26
            X.6ex r2 = (X.C136766ex) r2
            r26 = r2
            goto L_0x032d
        L_0x0352:
            r29 = 0
            goto L_0x030f
        L_0x0355:
            r30 = r10
            goto L_0x0300
        L_0x0358:
            boolean r2 = X.AnonymousClass000.A1R(r3)
            goto L_0x02ed
        L_0x035d:
            boolean r12 = X.AnonymousClass000.A1R(r2)
            goto L_0x02ea
        L_0x0362:
            r2 = r24
            int r3 = X.AnonymousClass001.A02(r11, r2, r14)
            int r5 = r11 + -1
            r10 = 0
            if (r3 > r5) goto L_0x037f
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
        L_0x0371:
            r2 = r20
            X.6ex r2 = r2.A00(r5)
            r10.add(r2)
            if (r5 == r3) goto L_0x037f
            int r5 = r5 + -1
            goto L_0x0371
        L_0x037f:
            int r5 = X.C36431kI.A07(r39)
            if (r5 < 0) goto L_0x03a2
        L_0x0385:
            int r11 = r5 + -1
            r2 = r39
            int r5 = X.C36351kA.A06(r2, r5)
            if (r5 >= r3) goto L_0x039e
            if (r10 != 0) goto L_0x0395
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
        L_0x0395:
            r2 = r20
            X.6ex r2 = r2.A00(r5)
            r10.add(r2)
        L_0x039e:
            if (r11 < 0) goto L_0x03a2
            r5 = r11
            goto L_0x0385
        L_0x03a2:
            if (r10 != 0) goto L_0x03a6
            r10 = r28
        L_0x03a6:
            int r5 = r10.size()
            r3 = 0
        L_0x03ab:
            if (r3 >= r5) goto L_0x03bc
            java.lang.Object r2 = r10.get(r3)
            X.6ex r2 = (X.C136766ex) r2
            int r2 = r2.A02
            int r8 = java.lang.Math.max(r8, r2)
            int r3 = r3 + 1
            goto L_0x03ab
        L_0x03bc:
            java.lang.Object r2 = X.C007103b.A0N(r7)
            X.6ex r2 = (X.C136766ex) r2
            int r2 = r2.A03
            int r2 = r2 + r24
            int r3 = r18 + -1
            int r13 = java.lang.Math.min(r2, r3)
            java.lang.Object r2 = X.C007103b.A0N(r7)
            X.6ex r2 = (X.C136766ex) r2
            int r2 = r2.A03
            r11 = 1
            int r12 = r2 + 1
            r25 = 0
            r5 = r25
            if (r12 > r13) goto L_0x03ef
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
        L_0x03e1:
            r2 = r20
            X.6ex r2 = r2.A00(r12)
            r5.add(r2)
            if (r12 == r13) goto L_0x03ef
            int r12 = r12 + 1
            goto L_0x03e1
        L_0x03ef:
            r24 = 0
            if (r31 == 0) goto L_0x04f0
            if (r35 == 0) goto L_0x04f0
            r2 = r35
            java.util.List r12 = r2.A08
            boolean r2 = X.C36401kF.A1a(r12)
            if (r2 == 0) goto L_0x04f0
            int r11 = X.C36421kH.A06(r12, r11)
        L_0x0403:
            r2 = -1
            if (r2 >= r11) goto L_0x046e
            java.lang.Object r2 = r12.get(r11)
            X.7bA r2 = (X.C156917bA) r2
            X.6ex r2 = (X.C136766ex) r2
            int r2 = r2.A03
            if (r2 <= r13) goto L_0x046b
            if (r11 == 0) goto L_0x0422
            int r2 = r11 + -1
            java.lang.Object r2 = r12.get(r2)
            X.7bA r2 = (X.C156917bA) r2
            X.6ex r2 = (X.C136766ex) r2
            int r2 = r2.A03
            if (r2 > r13) goto L_0x046b
        L_0x0422:
            java.lang.Object r2 = r12.get(r11)
            X.7bA r2 = (X.C156917bA) r2
        L_0x0428:
            java.lang.Object r11 = X.C007103b.A0N(r12)
            X.7bA r11 = (X.C156917bA) r11
            if (r2 == 0) goto L_0x0471
            X.6ex r2 = (X.C136766ex) r2
            int r12 = r2.A03
            r2 = r11
            X.6ex r2 = (X.C136766ex) r2
            int r2 = r2.A03
            int r3 = java.lang.Math.min(r2, r3)
            if (r12 > r3) goto L_0x0471
            if (r5 != 0) goto L_0x0452
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
        L_0x0445:
            r2 = r20
            X.6ex r2 = r2.A00(r12)
            r5.add(r2)
        L_0x044e:
            if (r12 == r3) goto L_0x0471
            int r12 = r12 + 1
        L_0x0452:
            int r15 = r5.size()
            r2 = 0
        L_0x0457:
            if (r2 >= r15) goto L_0x0445
            java.lang.Object r22 = r5.get(r2)
            r14 = r22
            X.6ex r14 = (X.C136766ex) r14
            int r14 = r14.A03
            if (r14 != r12) goto L_0x0468
            if (r22 != 0) goto L_0x044e
            goto L_0x0445
        L_0x0468:
            int r2 = r2 + 1
            goto L_0x0457
        L_0x046b:
            int r11 = r11 + -1
            goto L_0x0403
        L_0x046e:
            r2 = r25
            goto L_0x0428
        L_0x0471:
            r2 = r35
            int r3 = r2.A05
            X.6ex r11 = (X.C136766ex) r11
            int r2 = r11.A00
            int r3 = r3 - r2
            int r2 = r11.A04
            int r3 = r3 - r2
            float r12 = (float) r3
            float r12 = r12 - r30
            r2 = 0
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x04f0
            int r2 = r11.A03
            int r11 = r2 + 1
            r14 = 0
        L_0x048a:
            r2 = r18
            if (r11 >= r2) goto L_0x04f0
            float r2 = (float) r14
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x04f0
            if (r11 > r13) goto L_0x04ac
            int r22 = r7.size()
            r3 = 0
        L_0x049a:
            r2 = r22
            if (r3 >= r2) goto L_0x04e4
            java.lang.Object r2 = r7.get(r3)
            r15 = r2
            X.6ex r15 = (X.C136766ex) r15
            int r15 = r15.A03
            if (r15 == r11) goto L_0x04e6
            int r3 = r3 + 1
            goto L_0x049a
        L_0x04ac:
            if (r5 == 0) goto L_0x04cc
            int r22 = r5.size()
            r3 = 0
        L_0x04b3:
            r2 = r22
            if (r3 >= r2) goto L_0x04c5
            java.lang.Object r2 = r5.get(r3)
            r15 = r2
            X.6ex r15 = (X.C136766ex) r15
            int r15 = r15.A03
            if (r15 == r11) goto L_0x04c7
            int r3 = r3 + 1
            goto L_0x04b3
        L_0x04c5:
            r2 = r25
        L_0x04c7:
            X.6ex r2 = (X.C136766ex) r2
            goto L_0x04e8
        L_0x04ca:
            if (r5 != 0) goto L_0x04d0
        L_0x04cc:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
        L_0x04d0:
            r2 = r20
            X.6ex r2 = r2.A00(r11)
            r5.add(r2)
            int r11 = r11 + 1
            java.lang.Object r2 = X.C007103b.A0N(r5)
            X.6ex r2 = (X.C136766ex) r2
            int r2 = r2.A05
            goto L_0x04ee
        L_0x04e4:
            r2 = r25
        L_0x04e6:
            X.6ex r2 = (X.C136766ex) r2
        L_0x04e8:
            if (r2 == 0) goto L_0x04ca
            int r11 = r11 + 1
            int r2 = r2.A05
        L_0x04ee:
            int r14 = r14 + r2
            goto L_0x048a
        L_0x04f0:
            if (r5 == 0) goto L_0x0504
            java.lang.Object r2 = X.C007103b.A0N(r5)
            X.6ex r2 = (X.C136766ex) r2
            int r2 = r2.A03
            if (r2 <= r13) goto L_0x0504
            java.lang.Object r2 = X.C007103b.A0N(r5)
            X.6ex r2 = (X.C136766ex) r2
            int r13 = r2.A03
        L_0x0504:
            int r11 = r39.size()
        L_0x0508:
            r2 = r24
            if (r2 >= r11) goto L_0x0526
            r3 = r39
            int r3 = X.C36351kA.A06(r3, r2)
            if (r3 <= r13) goto L_0x0523
            if (r5 != 0) goto L_0x051a
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
        L_0x051a:
            r2 = r20
            X.6ex r2 = r2.A00(r3)
            r5.add(r2)
        L_0x0523:
            int r24 = r24 + 1
            goto L_0x0508
        L_0x0526:
            if (r5 != 0) goto L_0x052a
            r5 = r28
        L_0x052a:
            int r11 = r5.size()
            r3 = 0
        L_0x052f:
            if (r3 >= r11) goto L_0x0540
            java.lang.Object r2 = r5.get(r3)
            X.6ex r2 = (X.C136766ex) r2
            int r2 = r2.A02
            int r8 = java.lang.Math.max(r8, r2)
            int r3 = r3 + 1
            goto L_0x052f
        L_0x0540:
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L_0x0803
            java.lang.Object[] r3 = r7.A02
            int r2 = r7.A00
            r3 = r3[r2]
            r2 = r26
            boolean r2 = X.AnonymousClass00C.A0J(r2, r3)
            if (r2 == 0) goto L_0x0562
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x0562
            boolean r2 = r5.isEmpty()
            r22 = 1
            if (r2 != 0) goto L_0x0564
        L_0x0562:
            r22 = 0
        L_0x0564:
            r11 = r4
            if (r34 == 0) goto L_0x0568
            r11 = r8
        L_0x0568:
            r2 = r16
            int r14 = androidx.compose.ui.unit.Constraints.A06(r2, r11)
            if (r34 == 0) goto L_0x0571
            r8 = r4
        L_0x0571:
            int r11 = androidx.compose.ui.unit.Constraints.A05(r2, r8)
            r16 = r14
            if (r34 == 0) goto L_0x057b
            r16 = r11
        L_0x057b:
            r2 = r16
            int r2 = java.lang.Math.min(r2, r1)
            r12 = 0
            r3 = 0
            if (r4 >= r2) goto L_0x058f
            r3 = 1
            if (r9 == 0) goto L_0x058f
            java.lang.String r0 = "non-zero itemsScrollOffset"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x058f:
            int r2 = r7.size()
            int r2 = X.C90524aI.A04(r10, r2)
            int r2 = X.C90524aI.A04(r5, r2)
            java.util.ArrayList r8 = X.C36441kJ.A14(r2)
            if (r3 == 0) goto L_0x05d4
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x07de
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x07de
            int r10 = r7.size()
            int[] r13 = new int[r10]
            r3 = 0
        L_0x05b4:
            if (r3 >= r10) goto L_0x05ca
            r2 = r3
            if (r36 == 0) goto L_0x05bd
            int r2 = r10 - r3
            int r2 = r2 + -1
        L_0x05bd:
            java.lang.Object r2 = r7.get(r2)
            X.6ex r2 = (X.C136766ex) r2
            int r2 = r2.A04
            r13[r3] = r2
            int r3 = r3 + 1
            goto L_0x05b4
        L_0x05ca:
            int[] r9 = new int[r10]
            r2 = 0
        L_0x05cd:
            if (r2 >= r10) goto L_0x0621
            r9[r2] = r12
            int r2 = r2 + 1
            goto L_0x05cd
        L_0x05d4:
            int r16 = r10.size()
            r13 = r9
            r3 = 0
        L_0x05da:
            r2 = r16
            if (r3 >= r2) goto L_0x05f0
            java.lang.Object r2 = r10.get(r3)
            X.6ex r2 = (X.C136766ex) r2
            int r15 = r2.A05
            int r13 = r13 - r15
            r2.A00(r13, r14, r11)
            r8.add(r2)
            int r3 = r3 + 1
            goto L_0x05da
        L_0x05f0:
            int r10 = r7.size()
            r3 = 0
        L_0x05f5:
            if (r3 >= r10) goto L_0x0609
            java.lang.Object r2 = r7.get(r3)
            X.6ex r2 = (X.C136766ex) r2
            r2.A00(r9, r14, r11)
            r8.add(r2)
            int r2 = r2.A05
            int r9 = r9 + r2
            int r3 = r3 + 1
            goto L_0x05f5
        L_0x0609:
            int r3 = r5.size()
        L_0x060d:
            if (r12 >= r3) goto L_0x064d
            java.lang.Object r2 = r5.get(r12)
            X.6ex r2 = (X.C136766ex) r2
            r2.A00(r9, r14, r11)
            r8.add(r2)
            int r2 = r2.A05
            int r9 = r9 + r2
            int r12 = r12 + 1
            goto L_0x060d
        L_0x0621:
            if (r34 == 0) goto L_0x06a1
            if (r38 == 0) goto L_0x07f5
            r5 = r38
            r3 = r19
            r2 = r16
            r5.B1P(r3, r13, r9, r2)
        L_0x062e:
            int r3 = r10 + -1
            X.0mZ r2 = new X.0mZ
            r2.<init>(r12, r3)
            if (r36 == 0) goto L_0x0643
            int r12 = r2.A01
            int r5 = r2.A00
            int r2 = r2.A02
            int r3 = -r2
            X.0fb r2 = new X.0fb
            r2.<init>(r12, r5, r3)
        L_0x0643:
            int r13 = r2.A00
            int r12 = r2.A01
            int r5 = r2.A02
            if (r5 <= 0) goto L_0x067d
            if (r13 <= r12) goto L_0x0681
        L_0x064d:
            r43 = r41
            r44 = r20
            r45 = r8
            r46 = r14
            r47 = r11
            r48 = r34
            r49 = r31
            r43.A00(r44, r45, r46, r47, r48, r49, r50)
            boolean r2 = r28.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x06be
            X.C007103b.A0L(r8)
            int r2 = r28.size()
            r3 = 0
            if (r3 >= r2) goto L_0x06b2
            r0 = r28
            r0.get(r3)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)
            throw r1
        L_0x067d:
            if (r5 >= 0) goto L_0x064d
            if (r12 > r13) goto L_0x064d
        L_0x0681:
            r2 = r9[r13]
            r3 = r13
            if (r36 == 0) goto L_0x068a
            int r3 = r10 - r13
            int r3 = r3 + -1
        L_0x068a:
            java.lang.Object r3 = r7.get(r3)
            X.6ex r3 = (X.C136766ex) r3
            if (r36 == 0) goto L_0x0697
            int r2 = r16 - r2
            int r15 = r3.A04
            int r2 = r2 - r15
        L_0x0697:
            r3.A00(r2, r14, r11)
            r8.add(r3)
            if (r13 == r12) goto L_0x064d
            int r13 = r13 + r5
            goto L_0x0681
        L_0x06a1:
            if (r37 == 0) goto L_0x07fc
            r43 = r37
            r45 = r21
            r46 = r13
            r47 = r9
            r48 = r16
            r43.B1Q(r44, r45, r46, r47, r48)
            goto L_0x062e
        L_0x06b2:
            int r2 = r8.size()
        L_0x06b6:
            if (r3 >= r2) goto L_0x06be
            r8.get(r3)
            int r3 = r3 + 1
            goto L_0x06b6
        L_0x06be:
            r3 = r33
            r2 = r18
            if (r3 < r2) goto L_0x06c8
            r41 = 0
            if (r4 <= r1) goto L_0x06ca
        L_0x06c8:
            r41 = 1
        L_0x06ca:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            X.7Uz r3 = new X.7Uz
            r2 = r51
            r1 = r31
            r3.<init>(r2, r8, r1)
            r1 = r32
            java.lang.Object r11 = r1.BKt(r5, r4, r3)
            X.7kl r11 = (X.C160287kl) r11
            if (r22 != 0) goto L_0x0731
            java.util.ArrayList r12 = X.C36401kF.A0v(r8)
            int r10 = r8.size()
            r9 = 0
        L_0x06ee:
            if (r9 >= r10) goto L_0x0730
            java.lang.Object r5 = r8.get(r9)
            r4 = r5
            X.6ex r4 = (X.C136766ex) r4
            int r3 = r4.A03
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x07ed
            java.lang.Object[] r2 = r7.A02
            int r1 = r7.A00
            r1 = r2[r1]
            X.6ex r1 = (X.C136766ex) r1
            int r1 = r1.A03
            if (r3 < r1) goto L_0x072d
            int r4 = r4.A03
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x07e5
            java.lang.Object[] r3 = r7.A02
            int r2 = r7.A00
            int r1 = X.C90504aG.A0C(r7)
            int r2 = r2 + r1
            java.lang.Object[] r1 = r7.A02
            int r1 = r1.length
            if (r2 < r1) goto L_0x0722
            int r2 = r2 - r1
        L_0x0722:
            r1 = r3[r2]
            X.6ex r1 = (X.C136766ex) r1
            int r1 = r1.A03
            if (r4 > r1) goto L_0x072d
            r12.add(r5)
        L_0x072d:
            int r9 = r9 + 1
            goto L_0x06ee
        L_0x0730:
            r8 = r12
        L_0x0731:
            X.6ge r4 = new X.6ge
            r31 = r4
            r32 = r26
            r33 = r11
            r34 = r8
            r35 = r30
            r36 = r29
            r37 = r6
            r38 = r23
            r39 = r27
            r40 = r18
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            goto L_0x0211
        L_0x074c:
            androidx.compose.foundation.lazy.LazyListState r2 = r0.$state
            float r10 = r2.A00
            goto L_0x0193
        L_0x0752:
            java.util.ArrayList r39 = X.AnonymousClass001.A0I()
            int r12 = r2.A00
            if (r12 == 0) goto L_0x07cb
            r22 = 1
            r8 = 0
            java.lang.Object[] r10 = r2.A01
            r3 = r10[r8]
            X.69C r3 = (X.AnonymousClass69C) r3
            int r9 = r3.A01
            if (r12 <= 0) goto L_0x0775
        L_0x0767:
            r2 = r10[r8]
            X.69C r2 = (X.AnonymousClass69C) r2
            int r13 = r2.A01
            if (r13 >= r9) goto L_0x0771
            int r9 = r2.A01
        L_0x0771:
            int r8 = r8 + 1
            if (r8 < r12) goto L_0x0767
        L_0x0775:
            if (r9 < 0) goto L_0x082f
            int r8 = r3.A00
            if (r12 <= 0) goto L_0x078a
            r3 = 0
        L_0x077c:
            r2 = r10[r3]
            X.69C r2 = (X.AnonymousClass69C) r2
            int r13 = r2.A00
            if (r13 <= r8) goto L_0x0786
            int r8 = r2.A00
        L_0x0786:
            int r3 = r3 + 1
            if (r3 < r12) goto L_0x077c
        L_0x078a:
            int r2 = r4.A00
            int r2 = r2 - r22
            int r2 = java.lang.Math.min(r8, r2)
            X.0mZ r10 = new X.0mZ
            r10.<init>(r9, r2)
        L_0x0797:
            int r12 = r23.size()
            r9 = 0
        L_0x079c:
            if (r9 >= r12) goto L_0x07ce
            r2 = r23
            java.lang.Object r2 = r2.get(r9)
            X.7bE r2 = (X.AnonymousClass7bE) r2
            X.6gi r2 = (X.C137776gi) r2
            java.lang.Object r3 = r2.A04
            X.7n1 r2 = r2.A00
            int r2 = r2.BCn()
            int r8 = A00(r7, r3, r2)
            int r3 = r10.A00
            int r2 = r10.A01
            if (r8 > r2) goto L_0x07bf
            if (r3 > r8) goto L_0x07bf
        L_0x07bc:
            int r9 = r9 + 1
            goto L_0x079c
        L_0x07bf:
            if (r8 < 0) goto L_0x07bc
            int r2 = r4.A00
            if (r8 >= r2) goto L_0x07bc
            r2 = r39
            X.AnonymousClass000.A1F(r2, r8)
            goto L_0x07bc
        L_0x07cb:
            X.0mZ r10 = X.C15020mZ.A00
            goto L_0x0797
        L_0x07ce:
            int r3 = r10.A00
            int r4 = r10.A01
            if (r3 > r4) goto L_0x0181
        L_0x07d4:
            r2 = r39
            X.AnonymousClass000.A1F(r2, r3)
            if (r3 == r4) goto L_0x0181
            int r3 = r3 + 1
            goto L_0x07d4
        L_0x07de:
            java.lang.String r0 = "no extra items"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x07e5:
            java.lang.String r1 = "ArrayDeque is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x07ed:
            java.lang.String r1 = "ArrayDeque is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x07f5:
            java.lang.String r0 = "null verticalArrangement when isVertical == true"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x07fc:
            java.lang.String r0 = "null horizontalArrangement when isVertical == false"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0803:
            java.lang.String r1 = "ArrayDeque is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x080b:
            java.lang.String r1 = "ArrayDeque is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x0813:
            java.lang.String r0 = "negative currentFirstItemScrollOffset"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x081a:
            java.lang.String r0 = "invalid afterContentPadding"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0821:
            java.lang.String r0 = "invalid beforeContentPadding"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0828:
            java.lang.String r0 = "coroutineScope should be not null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x082f:
            java.lang.String r0 = "negative minIndex"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0836:
            r0 = move-exception
            X.C1269066c.A00(r9)     // Catch:{ all -> 0x083b }
            throw r0     // Catch:{ all -> 0x083b }
        L_0x083b:
            r0 = move-exception
            r10.A0B()
            throw r0
        L_0x0840:
            java.lang.String r0 = "null verticalArrangement when isVertical == true"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0847:
            java.lang.String r0 = "null horizontalAlignment when isVertical == false"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C156537a8.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
