package X;

import java.util.Map;

/* renamed from: X.8HQ  reason: invalid class name */
public final class AnonymousClass8HQ extends AYQ {
    public final Object key;
    public int lastKnownIndex;
    public final /* synthetic */ C21892AcL this$0;

    public AnonymousClass8HQ(C21892AcL acL, int i) {
        this.this$0 = acL;
        this.key = acL.key(i);
        this.lastKnownIndex = i;
    }

    private void updateLastKnownIndex() {
        int i = this.lastKnownIndex;
        if (i == -1 || i >= this.this$0.size() || !C1897595l.A00(this.key, this.this$0.key(this.lastKnownIndex))) {
            this.lastKnownIndex = this.this$0.indexOf(this.key);
        }
    }

    public Object getValue() {
        Map delegateOrNull = this.this$0.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.get(this.key);
        }
        updateLastKnownIndex();
        int i = this.lastKnownIndex;
        if (i == -1) {
            return AnonymousClass95n.unsafeNull();
        }
        return this.this$0.value(i);
    }

    public Object setValue(Object obj) {
        Map delegateOrNull = this.this$0.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.put(this.key, obj);
        }
        updateLastKnownIndex();
        int i = this.lastKnownIndex;
        if (i == -1) {
            this.this$0.put(this.key, obj);
            return AnonymousClass95n.unsafeNull();
        }
        Object access$600 = this.this$0.value(i);
        this.this$0.setValue(this.lastKnownIndex, obj);
        return access$600;
    }

    public Object getKey() {
        return this.key;
    }
}
