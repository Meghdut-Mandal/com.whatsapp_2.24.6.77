package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.76T  reason: invalid class name */
public class AnonymousClass76T implements Iterator, AnonymousClass00W {
    public int A00;
    public Object A01;
    public final Map A02;

    public boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A02.size());
    }

    public AnonymousClass76T(Object obj, Map map) {
        this.A01 = obj;
        this.A02 = map;
    }

    public Object next() {
        if (hasNext()) {
            Object obj = this.A01;
            this.A00++;
            Object obj2 = this.A02.get(obj);
            if (obj2 != null) {
                this.A01 = ((C129936Jb) obj2).A00;
                return obj;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Hash code of an element (");
            A0u.append(obj);
            throw new ConcurrentModificationException(AnonymousClass000.A0q(") has changed after it was added to the persistent set.", A0u));
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }
}
