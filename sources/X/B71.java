package X;

public class B71 extends AY9 {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B71(AnonymousClass8HU r1, int i) {
        super(r1);
        this.A01 = i;
        this.A00 = r1;
    }

    /* renamed from: result  reason: collision with other method in class */
    public Object m17result(int i) {
        if (this.A01 != 0) {
            return result(i);
        }
        return ((AnonymousClass8HU) this.A00).backingMap.getKey(i);
    }

    public AnonymousClass9Y5 result(int i) {
        return ((AnonymousClass8HU) this.A00).backingMap.getEntry(i);
    }
}
