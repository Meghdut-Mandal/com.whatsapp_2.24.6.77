package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {221, 426}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* renamed from: X.0lP  reason: invalid class name and case insensitive filesystem */
public final class C14300lP extends AnonymousClass0A1 implements C019408g {
    public final /* synthetic */ AnonymousClass05H $this_debounceInternal;
    public final /* synthetic */ C006302t $timeoutMillisSelector;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14300lP(C023509x r2, C006302t r3, AnonymousClass05H r4) {
        super(3, r2);
        this.$timeoutMillisSelector = r3;
        this.$this_debounceInternal = r4;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        C14300lP r1 = new C14300lP((C023509x) obj3, this.$timeoutMillisSelector, this.$this_debounceInternal);
        r1.L$0 = obj;
        r1.L$1 = obj2;
        return r1.invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00df A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            X.0AO r8 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r7 = r22
            int r0 = r7.label
            r6 = 2
            r13 = 0
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x00e5
            if (r0 == r5) goto L_0x005e
            if (r0 != r6) goto L_0x011e
            java.lang.Object r2 = r7.L$2
            X.0fG r2 = (X.C10810fG) r2
            java.lang.Object r9 = r7.L$1
            X.0r7 r9 = (X.C17330r7) r9
            java.lang.Object r3 = r7.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            X.AnonymousClass0AN.A00(r23)
        L_0x0020:
            java.lang.Object r1 = r2.element
            X.035 r0 = X.C05980Rv.A00
            if (r1 == r0) goto L_0x011b
            X.0fF r11 = new X.0fF
            r11.<init>()
            if (r1 == 0) goto L_0x0073
            X.02t r0 = r7.$timeoutMillisSelector
            X.035 r12 = X.C05980Rv.A01
            if (r1 != r12) goto L_0x0034
            r1 = r4
        L_0x0034:
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r11.element = r0
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r10 < 0) goto L_0x0114
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x0073
            java.lang.Object r0 = r2.element
            if (r0 != r12) goto L_0x004d
            r0 = r4
        L_0x004d:
            r7.L$0 = r3
            r7.L$1 = r9
            r7.L$2 = r2
            r7.L$3 = r11
            r7.label = r5
            java.lang.Object r0 = r3.B6N(r0, r7)
            if (r0 != r8) goto L_0x0071
            return r8
        L_0x005e:
            java.lang.Object r11 = r7.L$3
            X.0fF r11 = (X.C10800fF) r11
            java.lang.Object r2 = r7.L$2
            X.0fG r2 = (X.C10810fG) r2
            java.lang.Object r9 = r7.L$1
            X.0r7 r9 = (X.C17330r7) r9
            java.lang.Object r3 = r7.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            X.AnonymousClass0AN.A00(r23)
        L_0x0071:
            r2.element = r4
        L_0x0073:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C15200mr.A05
            X.02h r0 = r7.getContext()
            X.0mr r10 = new X.0mr
            r10.<init>(r0)
            java.lang.Object r0 = r2.element
            if (r0 == 0) goto L_0x00b9
            long r0 = r11.element
            X.0ky r11 = new X.0ky
            r11.<init>(r4, r2, r3)
            X.0SV r12 = new X.0SV
            r12.<init>(r0)
            X.0lj r1 = X.C14500lj.A00
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            X.AnonymousClass00C.A0E(r1, r0)
            r0 = 3
            X.C07710Yz.A03(r1, r0)
            X.0T5 r0 = new X.0T5
            r0.<init>(r12, r1)
            java.lang.Object r12 = r0.A00
            X.08g r1 = r0.A02
            X.08g r0 = r0.A01
            X.035 r17 = X.AnonymousClass0S5.A02
            X.0UB r15 = new X.0UB
            r16 = r12
            r18 = r11
            r19 = r1
            r20 = r0
            r21 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r0 = 0
            r10.A06(r15, r0)
        L_0x00b9:
            X.0T6 r1 = r9.BEg()
            X.0lE r0 = new X.0lE
            r0.<init>(r4, r2, r3)
            r10.A05(r0, r1)
            r7.L$0 = r3
            r7.L$1 = r9
            r7.L$2 = r2
            r7.L$3 = r4
            r7.label = r6
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C15200mr.A05
            java.lang.Object r0 = r0.get(r10)
            boolean r0 = r0 instanceof X.AnonymousClass0UB
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r0 = X.C15200mr.A01(r7, r10)
        L_0x00dd:
            if (r0 != r8) goto L_0x0020
            return r8
        L_0x00e0:
            java.lang.Object r0 = X.C15200mr.A02(r7, r10)
            goto L_0x00dd
        L_0x00e5:
            X.AnonymousClass0AN.A00(r23)
            java.lang.Object r11 = r7.L$0
            X.040 r11 = (X.AnonymousClass040) r11
            java.lang.Object r3 = r7.L$1
            X.05G r3 = (X.AnonymousClass05G) r3
            X.05H r0 = r7.$this_debounceInternal
            X.0l2 r10 = new X.0l2
            r10.<init>(r4, r0)
            X.03u r9 = X.C008903u.A00
            java.lang.Integer r2 = X.C023109s.A00
            r0 = 0
            X.0iw r1 = new X.0iw
            r1.<init>(r0)
            X.02h r0 = X.AnonymousClass0A3.A01(r9, r11)
            X.0mm r9 = new X.0mm
            r9.<init>(r0, r1)
            r9.A0x(r2, r9, r10)
            X.0fG r2 = new X.0fG
            r2.<init>()
            goto L_0x0020
        L_0x0114:
            java.lang.String r0 = "Debounce timeout should not be negative"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x011b:
            X.0AJ r8 = X.AnonymousClass0AJ.A00
            return r8
        L_0x011e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14300lP.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
