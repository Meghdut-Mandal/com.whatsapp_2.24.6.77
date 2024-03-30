package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.7YE  reason: invalid class name */
public final class AnonymousClass7YE extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ C1268966b $itemContentFactory;
    public final /* synthetic */ C009003v $measurePolicy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7YE(C1268966b r2, C009003v r3) {
        super(2);
        this.$itemContentFactory = r2;
        this.$measurePolicy = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        long j = ((Constraints) obj2).A00;
        return this.$measurePolicy.invoke(new C137756gf(this.$itemContentFactory, (C161707nL) obj), new Constraints(j));
    }
}
