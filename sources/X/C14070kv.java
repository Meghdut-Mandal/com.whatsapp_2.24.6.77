package X;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: X.0kv  reason: invalid class name and case insensitive filesystem */
public final class C14070kv extends C14090kx implements C009003v {
    public final /* synthetic */ Iterator $iterator;
    public final /* synthetic */ boolean $partialWindows;
    public final /* synthetic */ boolean $reuseBuffer;
    public final /* synthetic */ int $size;
    public final /* synthetic */ int $step;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14070kv(Iterator it, C023509x r2, int i, int i2, boolean z, boolean z2) {
        super(r2);
        this.$size = i;
        this.$step = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    public final C023509x create(Object obj, C023509x r9) {
        C023509x r2 = r9;
        C14070kv r0 = new C14070kv(this.$iterator, r2, this.$size, this.$step, this.$reuseBuffer, this.$partialWindows);
        r0.L$0 = obj;
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0146, code lost:
        if (r13.$partialWindows == false) goto L_0x017e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0091 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.0AO r12 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r13.label
            r6 = 5
            r5 = 4
            r8 = 3
            r3 = 2
            r9 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0065
            if (r0 == r9) goto L_0x0043
            if (r0 == r3) goto L_0x017b
            if (r0 == r8) goto L_0x002d
            if (r0 == r5) goto L_0x001b
            if (r0 == r6) goto L_0x017b
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x001b:
            java.lang.Object r3 = r13.L$1
            X.0jz r3 = (X.C13510jz) r3
            java.lang.Object r2 = r13.L$0
            X.0hk r2 = (X.C12250hk) r2
            X.AnonymousClass0AN.A00(r14)
            int r0 = r13.$step
            r3.A09(r0)
            goto L_0x0148
        L_0x002d:
            java.lang.Object r7 = r13.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r3 = r13.L$1
            X.0jz r3 = (X.C13510jz) r3
            java.lang.Object r2 = r13.L$0
            X.0hk r2 = (X.C12250hk) r2
            X.AnonymousClass0AN.A00(r14)
            int r0 = r13.$step
            r3.A09(r0)
            goto L_0x00d1
        L_0x0043:
            int r7 = r13.I$0
            java.lang.Object r8 = r13.L$2
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r5 = r13.L$1
            java.util.AbstractCollection r5 = (java.util.AbstractCollection) r5
            java.lang.Object r2 = r13.L$0
            X.0hk r2 = (X.C12250hk) r2
            X.AnonymousClass0AN.A00(r14)
            boolean r0 = r13.$reuseBuffer
            if (r0 == 0) goto L_0x005d
            r5.clear()
        L_0x005b:
            r6 = r7
            goto L_0x0082
        L_0x005d:
            int r0 = r13.$size
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            goto L_0x005b
        L_0x0065:
            X.AnonymousClass0AN.A00(r14)
            java.lang.Object r2 = r13.L$0
            X.0hk r2 = (X.C12250hk) r2
            int r10 = r13.$size
            r1 = r10
            r0 = 1024(0x400, float:1.435E-42)
            if (r10 <= r0) goto L_0x0075
            r1 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            int r7 = r13.$step
            int r7 = r7 - r10
            if (r7 < 0) goto L_0x00c7
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r1)
            r6 = 0
            java.util.Iterator r8 = r13.$iterator
        L_0x0082:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r8.next()
            if (r6 <= 0) goto L_0x00ae
            int r6 = r6 + -1
            goto L_0x0082
        L_0x0091:
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x017e
            boolean r0 = r13.$partialWindows
            if (r0 != 0) goto L_0x00a5
            int r1 = r5.size()
            int r0 = r13.$size
            if (r1 != r0) goto L_0x017e
        L_0x00a5:
            r13.L$0 = r4
            r13.L$1 = r4
            r13.L$2 = r4
            r13.label = r3
            goto L_0x00c3
        L_0x00ae:
            r5.add(r0)
            int r1 = r5.size()
            int r0 = r13.$size
            if (r1 != r0) goto L_0x0082
            r13.L$0 = r2
            r13.L$1 = r5
            r13.L$2 = r8
            r13.I$0 = r7
            r13.label = r9
        L_0x00c3:
            r2.A01(r5, r13)
            return r12
        L_0x00c7:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0 = 0
            X.0jz r3 = new X.0jz
            r3.<init>(r1, r0)
            java.util.Iterator r7 = r13.$iterator
        L_0x00d1:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0144
            java.lang.Object r11 = r7.next()
            int r0 = r3.size()
            int r1 = r3.A02
            if (r0 != r1) goto L_0x00ea
            java.lang.String r0 = "ring buffer is full"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x00ea:
            java.lang.Object[] r10 = r3.A03
            int r9 = r3.A01
            int r0 = r3.size()
            int r9 = r9 + r0
            int r9 = r9 % r1
            r10[r9] = r11
            int r0 = r3.size()
            int r0 = r0 + 1
            r3.A00 = r0
            int r0 = r3.size()
            if (r0 != r1) goto L_0x00d1
            int r0 = r3.size()
            int r9 = r13.$size
            if (r0 >= r9) goto L_0x012d
            int r0 = r1 >> 1
            int r1 = r1 + r0
            int r1 = r1 + 1
            if (r1 <= r9) goto L_0x0114
            r1 = r9
        L_0x0114:
            int r0 = r3.A01
            if (r0 != 0) goto L_0x0126
            java.lang.Object[] r1 = X.AnonymousClass00C.A0K(r10, r1)
        L_0x011c:
            int r0 = r3.size()
            X.0jz r3 = new X.0jz
            r3.<init>(r1, r0)
            goto L_0x00d1
        L_0x0126:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object[] r1 = r3.toArray(r0)
            goto L_0x011c
        L_0x012d:
            boolean r0 = r13.$reuseBuffer
            if (r0 == 0) goto L_0x013e
            r0 = r3
        L_0x0132:
            r13.L$0 = r2
            r13.L$1 = r3
            r13.L$2 = r7
            r13.label = r8
            r2.A01(r0, r13)
            return r12
        L_0x013e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            goto L_0x0132
        L_0x0144:
            boolean r0 = r13.$partialWindows
            if (r0 == 0) goto L_0x017e
        L_0x0148:
            int r1 = r3.size()
            int r0 = r13.$step
            if (r1 <= r0) goto L_0x0167
            boolean r0 = r13.$reuseBuffer
            if (r0 == 0) goto L_0x0161
            r0 = r3
        L_0x0155:
            r13.L$0 = r2
            r13.L$1 = r3
            r13.L$2 = r4
            r13.label = r5
            r2.A01(r0, r13)
            return r12
        L_0x0161:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            goto L_0x0155
        L_0x0167:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x017e
            r13.L$0 = r4
            r13.L$1 = r4
            r13.L$2 = r4
            r13.label = r6
            r2.A01(r3, r13)
            return r12
        L_0x017b:
            X.AnonymousClass0AN.A00(r14)
        L_0x017e:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14070kv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C14070kv) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
