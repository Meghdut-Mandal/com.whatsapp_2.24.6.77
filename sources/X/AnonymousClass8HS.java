package X;

import java.io.Serializable;

/* renamed from: X.8HS  reason: invalid class name */
public abstract class AnonymousClass8HS extends AnonymousClass8HT implements Serializable {
    public static final long serialVersionUID = 0;
    public final transient C20070wy map;
    public final transient int size;

    public AnonymousClass8HS(C20070wy r1, int i) {
        this.map = r1;
        this.size = i;
    }

    public int size() {
        return this.size;
    }

    public C20070wy asMap() {
        return this.map;
    }
}
