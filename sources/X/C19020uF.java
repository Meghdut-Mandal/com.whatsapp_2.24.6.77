package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.0uF  reason: invalid class name and case insensitive filesystem */
public final class C19020uF {
    public final int A00;
    public final int A01;
    public final C19040uH A02;
    public final Set A03;
    public final Set A04;
    public final Set A05;

    public String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.A04.toArray()));
        sb.append(">{");
        sb.append(this.A00);
        sb.append(", type=");
        sb.append(this.A01);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.A03.toArray()));
        sb.append("}");
        return sb.toString();
    }

    public C19020uF(C19040uH r2, Set set, Set set2, Set set3, int i, int i2) {
        this.A04 = Collections.unmodifiableSet(set);
        this.A03 = Collections.unmodifiableSet(set2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r2;
        this.A05 = Collections.unmodifiableSet(set3);
    }
}
