package X;

/* renamed from: X.8Mz  reason: invalid class name and case insensitive filesystem */
public final class C172218Mz extends AnonymousClass8NN implements C22901AyD {
    public C172218Mz() {
        super(AnonymousClass8PZ.DEFAULT_INSTANCE);
    }

    public void A0U(Iterable iterable) {
        AnonymousClass8PZ r2 = (AnonymousClass8PZ) C90524aI.A0H(this);
        int i = AnonymousClass8PZ.CURRENTSESSION_FIELD_NUMBER;
        C23122B6c b6c = r2.previousSessions_;
        if (!((C21886AcE) b6c).A00) {
            b6c = C170918Hz.A0A(b6c);
            r2.previousSessions_ = b6c;
        }
        C21071A7i.A0O(iterable, b6c);
    }
}
