package X;

import java.util.Iterator;

/* renamed from: X.0ij  reason: invalid class name and case insensitive filesystem */
public final class C12830ij implements C16970qV {
    public final int A00;
    public final CharSequence A01;
    public final C009003v A02;

    public Iterator iterator() {
        return new C12400hz(this);
    }

    public C12830ij(CharSequence charSequence, C009003v r2, int i) {
        this.A01 = charSequence;
        this.A00 = i;
        this.A02 = r2;
    }
}
