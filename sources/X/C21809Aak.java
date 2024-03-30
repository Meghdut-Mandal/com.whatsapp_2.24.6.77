package X;

import java.util.List;

/* renamed from: X.Aak  reason: case insensitive filesystem */
public class C21809Aak implements B0N {
    public int A00 = -1;
    public final int A01;
    public final List A02;

    public String readLine() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i < this.A01) {
            return ((C192759Il) this.A02.get(i)).A00;
        }
        return null;
    }

    public C21809Aak(List list) {
        this.A02 = list;
        this.A01 = list.size();
    }
}
