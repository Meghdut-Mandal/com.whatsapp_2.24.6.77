package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.3NO  reason: invalid class name */
public class AnonymousClass3NO {
    public final int A00;
    public final List A01;

    public AnonymousClass3NO(List list) {
        this.A01 = Collections.unmodifiableList(list);
        this.A00 = 0;
    }

    public AnonymousClass3NO(int i) {
        this.A01 = Collections.emptyList();
        this.A00 = i;
    }
}
