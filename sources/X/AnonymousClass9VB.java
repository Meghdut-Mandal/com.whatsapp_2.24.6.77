package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9VB  reason: invalid class name */
public class AnonymousClass9VB {
    public volatile List A00 = Collections.emptyList();

    public synchronized void A00() {
        this.A00 = Collections.emptyList();
    }

    public synchronized boolean A01(Object obj) {
        if (this.A00.contains(obj)) {
            return false;
        }
        ArrayList A14 = C36441kJ.A14(this.A00.size() + 1);
        A14.addAll(this.A00);
        A14.add(obj);
        this.A00 = Collections.unmodifiableList(A14);
        return true;
    }

    public synchronized boolean A02(Object obj) {
        boolean z;
        z = false;
        if (this.A00.contains(obj)) {
            int size = this.A00.size();
            int i = size - 1;
            ArrayList A14 = C36441kJ.A14(i);
            int indexOf = this.A00.indexOf(obj);
            if (indexOf > 0) {
                A14.addAll(this.A00.subList(0, indexOf));
            }
            z = true;
            if (indexOf < i) {
                A14.addAll(this.A00.subList(indexOf + 1, size));
            }
            this.A00 = Collections.unmodifiableList(A14);
        }
        return z;
    }
}
