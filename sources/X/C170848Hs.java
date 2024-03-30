package X;

import com.google.common.collect.Multisets;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8Hs  reason: invalid class name and case insensitive filesystem */
public class C170848Hs extends Multisets.ElementSet<E> {
    public final /* synthetic */ C21881Ac7 this$0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C170848Hs(C21881Ac7 ac7) {
        this();
        this.this$0 = ac7;
    }

    public Iterator iterator() {
        return this.this$0.elementIterator();
    }

    public void clear() {
        multiset().clear();
    }

    public boolean contains(Object obj) {
        return multiset().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return multiset().containsAll(collection);
    }

    public boolean isEmpty() {
        return multiset().isEmpty();
    }

    public B6T multiset() {
        return this.this$0;
    }

    public boolean remove(Object obj) {
        return AnonymousClass000.A1R(multiset().remove(obj, Integer.MAX_VALUE));
    }

    public int size() {
        return multiset().entrySet().size();
    }

    public C170848Hs() {
    }
}
