package X;

/* renamed from: X.8HP  reason: invalid class name */
public final class AnonymousClass8HP extends AYQ {
    public int index;
    public final Object key;
    public final /* synthetic */ C21891AcK this$0;

    public AnonymousClass8HP(C21891AcK acK, int i) {
        this.this$0 = acK;
        this.key = acK.keys[i];
        this.index = i;
    }

    public void updateIndex() {
        int i = this.index;
        if (i != -1) {
            C21891AcK acK = this.this$0;
            if (i <= acK.size && C1897595l.A00(acK.keys[i], this.key)) {
                return;
            }
        }
        this.index = this.this$0.findEntryByKey(this.key);
    }

    public Object getKey() {
        return this.key;
    }

    public Object getValue() {
        updateIndex();
        int i = this.index;
        if (i == -1) {
            return AnonymousClass95n.unsafeNull();
        }
        return this.this$0.values[i];
    }

    public Object setValue(Object obj) {
        updateIndex();
        int i = this.index;
        C21891AcK acK = this.this$0;
        if (i == -1) {
            acK.put(this.key, obj);
            return AnonymousClass95n.unsafeNull();
        }
        Object obj2 = acK.values[i];
        if (C1897595l.A00(obj2, obj)) {
            return obj;
        }
        this.this$0.replaceValueInEntry(this.index, obj, false);
        return obj2;
    }
}
