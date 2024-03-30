package X;

/* renamed from: X.8HR  reason: invalid class name */
public final class AnonymousClass8HR extends AYQ {
    public final C21891AcK biMap;
    public int index;
    public final Object value;

    private void updateIndex() {
        int i = this.index;
        if (i != -1) {
            C21891AcK acK = this.biMap;
            if (i <= acK.size && C1897595l.A00(this.value, acK.values[i])) {
                return;
            }
        }
        this.index = this.biMap.findEntryByValue(this.value);
    }

    public AnonymousClass8HR(C21891AcK acK, int i) {
        this.biMap = acK;
        this.value = acK.values[i];
        this.index = i;
    }

    public Object getKey() {
        return this.value;
    }

    public Object getValue() {
        updateIndex();
        int i = this.index;
        if (i == -1) {
            return AnonymousClass95n.unsafeNull();
        }
        return this.biMap.keys[i];
    }

    public Object setValue(Object obj) {
        updateIndex();
        int i = this.index;
        C21891AcK acK = this.biMap;
        if (i == -1) {
            acK.putInverse(this.value, obj, false);
            return AnonymousClass95n.unsafeNull();
        }
        Object obj2 = acK.keys[i];
        if (C1897595l.A00(obj2, obj)) {
            return obj;
        }
        this.biMap.replaceKeyInEntry(this.index, obj, false);
        return obj2;
    }
}
