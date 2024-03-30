package X;

import java.io.Closeable;

/* renamed from: X.ATt  reason: case insensitive filesystem */
public abstract class C21653ATt implements Closeable {
    public C191439Cy A00() {
        if (this instanceof AnonymousClass893) {
            return new C191439Cy(((AnonymousClass893) this).A00);
        }
        return new C191439Cy(((AnonymousClass894) this).A02());
    }

    public C21652ATs A01() {
        if (this instanceof AnonymousClass893) {
            return new AnonymousClass891((AnonymousClass893) this);
        }
        return new AnonymousClass892((AnonymousClass894) this);
    }

    public void close() {
        if (this instanceof AnonymousClass894) {
            ((AnonymousClass894) this).A03.close();
        }
    }
}
