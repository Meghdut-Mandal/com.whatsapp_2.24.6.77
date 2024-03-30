package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8TD  reason: invalid class name */
public class AnonymousClass8TD extends C200269h0 implements Iterable {
    public List A00 = AnonymousClass001.A0I();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass8TD)) {
            return false;
        }
        return this.A00.equals(((AnonymousClass8TD) obj).A00);
    }

    public Iterator iterator() {
        return this.A00.iterator();
    }

    public AnonymousClass8TD(Collection collection) {
        for (Object A01 : collection) {
            this.A00.add(C200269h0.A01(A01));
        }
    }

    public String toString() {
        return C165567td.A0Y(C201749kK.A00(this.A00, ",", ""), C90484aE.A0p());
    }
}
