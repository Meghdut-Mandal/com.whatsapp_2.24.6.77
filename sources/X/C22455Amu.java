package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.Amu  reason: case insensitive filesystem */
public final class C22455Amu extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Collection $elements;
    public final /* synthetic */ int $index;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22455Amu(Collection collection, int i) {
        super(1);
        this.$index = i;
        this.$elements = collection;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(((List) obj).addAll(this.$index, this.$elements));
    }
}
