package X;

/* renamed from: X.8Hp  reason: invalid class name and case insensitive filesystem */
public class C170818Hp extends AnonymousClass9Y5 {
    public final Object key;
    public int lastKnownIndex;
    public final /* synthetic */ C203649oT this$0;

    public C170818Hp(C203649oT r2, int i) {
        this.this$0 = r2;
        this.key = r2.keys[i];
        this.lastKnownIndex = i;
    }

    public void updateLastKnownIndex() {
        int i = this.lastKnownIndex;
        if (i != -1) {
            C203649oT r2 = this.this$0;
            if (i < r2.size() && C1897595l.A00(this.key, r2.keys[i])) {
                return;
            }
        }
        this.lastKnownIndex = this.this$0.indexOf(this.key);
    }

    public int getCount() {
        updateLastKnownIndex();
        int i = this.lastKnownIndex;
        if (i == -1) {
            return 0;
        }
        return this.this$0.values[i];
    }

    public Object getElement() {
        return this.key;
    }
}
