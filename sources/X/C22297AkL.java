package X;

import java.util.Collection;

/* renamed from: X.AkL  reason: case insensitive filesystem */
public final class C22297AkL extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Collection $elements;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22297AkL(Collection collection) {
        super(1);
        this.$elements = collection;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(this.$elements.contains(obj));
    }
}
