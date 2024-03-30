package X;

/* renamed from: X.7Uc  reason: invalid class name and case insensitive filesystem */
public final class C154927Uc extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Object $key;
    public final /* synthetic */ AnonymousClass63D $registryHolder;
    public final /* synthetic */ C137156fg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154927Uc(AnonymousClass63D r2, C137156fg r3, Object obj) {
        super(1);
        this.this$0 = r3;
        this.$key = obj;
        this.$registryHolder = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z = !this.this$0.A01.containsKey(this.$key);
        Object obj2 = this.$key;
        if (z) {
            this.this$0.A02.remove(obj2);
            this.this$0.A01.put(this.$key, this.$registryHolder);
            return new C136926fH(this.$registryHolder, this.this$0, this.$key);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Key ");
        A0u.append(obj2);
        throw AnonymousClass000.A0c(" was used multiple times ", A0u);
    }
}
