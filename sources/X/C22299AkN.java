package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.AkN  reason: case insensitive filesystem */
public final class C22299AkN extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Collection $elements;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22299AkN(Collection collection) {
        super(1);
        this.$elements = collection;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(((List) obj).retainAll(this.$elements));
    }
}
