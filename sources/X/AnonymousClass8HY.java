package X;

/* renamed from: X.8HY  reason: invalid class name */
public final class AnonymousClass8HY extends C21894AcN<K, V, K> {
    public final /* synthetic */ C21891AcK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8HY(C21891AcK acK) {
        super(acK);
        this.this$0 = acK;
    }

    public boolean contains(Object obj) {
        return this.this$0.containsKey(obj);
    }

    public Object forEntry(int i) {
        return this.this$0.keys[i];
    }

    public boolean remove(Object obj) {
        int smearedHash = C20770y8.smearedHash(obj);
        int findEntryByKey = this.this$0.findEntryByKey(obj, smearedHash);
        if (findEntryByKey == -1) {
            return false;
        }
        this.this$0.removeEntryKeyHashKnown(findEntryByKey, smearedHash);
        return true;
    }
}
