package X;

/* renamed from: X.0kt  reason: invalid class name and case insensitive filesystem */
public final class C14060kt extends C13700kJ {
    public final /* synthetic */ Object $receiver$inlined;
    public final /* synthetic */ C009003v $this_createCoroutineUnintercepted$inlined;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14060kt(Object obj, C023509x r2, C009003v r3) {
        super(r2);
        this.$this_createCoroutineUnintercepted$inlined = r3;
        this.$receiver$inlined = obj;
    }

    public Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            AnonymousClass0AN.A00(obj);
            AnonymousClass00C.A0E(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            C009003v r1 = this.$this_createCoroutineUnintercepted$inlined;
            C07710Yz.A03(r1, 2);
            return r1.invoke(this.$receiver$inlined, this);
        } else if (i == 1) {
            this.label = 2;
            AnonymousClass0AN.A00(obj);
            return obj;
        } else {
            throw AnonymousClass001.A09("This coroutine had already completed");
        }
    }
}
