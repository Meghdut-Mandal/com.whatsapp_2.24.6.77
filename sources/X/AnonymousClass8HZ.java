package X;

/* renamed from: X.8HZ  reason: invalid class name */
public final class AnonymousClass8HZ extends C21894AcN<K, V, V> {
    public final /* synthetic */ C21891AcK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8HZ(C21891AcK acK) {
        super(acK);
        this.this$0 = acK;
    }

    public boolean contains(Object obj) {
        return this.this$0.containsValue(obj);
    }

    public Object forEntry(int i) {
        return this.this$0.values[i];
    }

    public boolean remove(Object obj) {
        int smearedHash = C20770y8.smearedHash(obj);
        int findEntryByValue = this.this$0.findEntryByValue(obj, smearedHash);
        if (findEntryByValue == -1) {
            return false;
        }
        this.this$0.removeEntryValueHashKnown(findEntryByValue, smearedHash);
        return true;
    }
}
