package X;

public abstract class AUu implements Iterable {
    public final C19460v5 iterableDelegate = C19470v6.A00;

    private Iterable getDelegate() {
        return (Iterable) this.iterableDelegate.A04(this);
    }

    public String toString() {
        return C200359hH.toString(getDelegate());
    }
}
