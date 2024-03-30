package X;

/* renamed from: X.8Hk  reason: invalid class name */
public final class AnonymousClass8Hk<K> extends C20760y7<K> {
    public final transient C23931Ak list;
    public final transient C20070wy map;

    public boolean isPartialView() {
        return true;
    }

    public boolean contains(Object obj) {
        return AnonymousClass000.A1V(this.map.get(obj));
    }

    public int size() {
        return this.map.size();
    }

    public AnonymousClass8Hk(C20070wy r1, C23931Ak r2) {
        this.map = r1;
        this.list = r2;
    }

    public C23931Ak asList() {
        return this.list;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    public C225614x iterator() {
        return asList().iterator();
    }
}
