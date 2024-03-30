package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, 182, 183, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
/* renamed from: X.0lO  reason: invalid class name and case insensitive filesystem */
public final class C14290lO extends AnonymousClass0A1 implements C019408g {
    public /* synthetic */ int I$0;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C13120jC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14290lO(C023509x r2, C13120jC r3) {
        super(3, r2);
        this.this$0 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r4 = 5
            r6 = 4
            r7 = 3
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r1) goto L_0x007d
            if (r0 == r5) goto L_0x003f
            if (r0 == r7) goto L_0x0053
            if (r0 == r6) goto L_0x006a
            if (r0 == r4) goto L_0x007d
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x001a:
            X.AnonymousClass0AN.A00(r9)
            java.lang.Object r3 = r8.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            int r0 = r8.I$0
            if (r0 <= 0) goto L_0x0030
            X.0Ne r0 = X.C05070Ne.START
            r8.label = r1
            java.lang.Object r0 = r3.B6N(r0, r8)
        L_0x002d:
            if (r0 != r2) goto L_0x0080
            return r2
        L_0x0030:
            X.0jC r0 = r8.this$0
            long r0 = r0.A00
            r8.L$0 = r3
            r8.label = r5
            java.lang.Object r0 = X.C07330Xf.A00(r8, r0)
            if (r0 != r2) goto L_0x0046
            return r2
        L_0x003f:
            java.lang.Object r3 = r8.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            X.AnonymousClass0AN.A00(r9)
        L_0x0046:
            X.0Ne r0 = X.C05070Ne.STOP
            r8.L$0 = r3
            r8.label = r7
            java.lang.Object r0 = r3.B6N(r0, r8)
            if (r0 != r2) goto L_0x005a
            return r2
        L_0x0053:
            java.lang.Object r3 = r8.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            X.AnonymousClass0AN.A00(r9)
        L_0x005a:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8.L$0 = r3
            r8.label = r6
            java.lang.Object r0 = X.C07330Xf.A00(r8, r0)
            if (r0 != r2) goto L_0x0071
            return r2
        L_0x006a:
            java.lang.Object r3 = r8.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            X.AnonymousClass0AN.A00(r9)
        L_0x0071:
            X.0Ne r1 = X.C05070Ne.STOP_AND_RESET_REPLAY_CACHE
            r0 = 0
            r8.L$0 = r0
            r8.label = r4
            java.lang.Object r0 = r3.B6N(r1, r8)
            goto L_0x002d
        L_0x007d:
            X.AnonymousClass0AN.A00(r9)
        L_0x0080:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14290lO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        int A0I = AnonymousClass000.A0I(obj2);
        C14290lO r1 = new C14290lO((C023509x) obj3, this.this$0);
        r1.L$0 = obj;
        r1.I$0 = A0I;
        return r1.invokeSuspend(AnonymousClass0AJ.A00);
    }
}
