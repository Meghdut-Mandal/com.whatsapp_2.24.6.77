package X;

import com.google.common.collect.Multisets;
import java.util.Iterator;

/* renamed from: X.8Hr  reason: invalid class name and case insensitive filesystem */
public class C170838Hr extends Multisets.EntrySet<E> {
    public final /* synthetic */ C21881Ac7 this$0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C170838Hr(C21881Ac7 ac7) {
        this();
        this.this$0 = ac7;
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof AnonymousClass9Y5)) {
            return false;
        }
        AnonymousClass9Y5 r4 = (AnonymousClass9Y5) obj;
        if (r4.getCount() <= 0 || multiset().count(r4.getElement()) != r4.getCount()) {
            return false;
        }
        return true;
    }

    public Iterator iterator() {
        return this.this$0.entryIterator();
    }

    public boolean remove(Object obj) {
        if (obj instanceof AnonymousClass9Y5) {
            AnonymousClass9Y5 r5 = (AnonymousClass9Y5) obj;
            Object element = r5.getElement();
            int count = r5.getCount();
            if (count != 0) {
                return multiset().setCount(element, count, 0);
            }
        }
        return false;
    }

    public int size() {
        return this.this$0.distinctElements();
    }

    public void clear() {
        multiset().clear();
    }

    public B6T multiset() {
        return this.this$0;
    }

    public C170838Hr() {
    }
}
