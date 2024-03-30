package X;

import java.util.List;

/* renamed from: X.AnO  reason: case insensitive filesystem */
public final class C22485AnO extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C10770fC $isFetchedAtLeastOnce;
    public final /* synthetic */ AnonymousClass08S $this_apply;
    public final /* synthetic */ C167627yS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22485AnO(AnonymousClass08S r2, C167627yS r3, C10770fC r4) {
        super(1);
        this.$isFetchedAtLeastOnce = r4;
        this.$this_apply = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        List list = (List) obj;
        C10770fC r1 = this.$isFetchedAtLeastOnce;
        boolean z2 = r1.element;
        if (z2 || (list != null && !list.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        r1.element = z;
        C199779fx r12 = (C199779fx) this.$this_apply.A04();
        if (r12 != null) {
            this.$this_apply.A0D(new C199779fx(r12.A00, AnonymousClass000.A1V(list), this.$isFetchedAtLeastOnce.element));
        }
        if (!z2 && this.$isFetchedAtLeastOnce.element) {
            C167627yS r2 = this.this$0;
            String str = r2.A00;
            r2.A00 = null;
            if (str != null) {
                r2.A0T(str);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
