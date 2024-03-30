package X;

import java.util.NoSuchElementException;

/* renamed from: X.21W  reason: invalid class name */
public class AnonymousClass21W extends C225614x {
    public boolean done;
    public final /* synthetic */ Object val$value;

    public AnonymousClass21W(Object obj) {
        this.val$value = obj;
    }

    public boolean hasNext() {
        return !this.done;
    }

    public Object next() {
        if (!this.done) {
            this.done = true;
            return this.val$value;
        }
        throw new NoSuchElementException();
    }
}
