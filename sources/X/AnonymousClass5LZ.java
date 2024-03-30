package X;

/* renamed from: X.5LZ  reason: invalid class name */
public final class AnonymousClass5LZ extends AnonymousClass12N {
    public final C002000v A00 = new C002000v(1000);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5LZ(C220112n r3) {
        super(r3);
        AnonymousClass00C.A0D(r3, 1);
        A08();
    }

    public void Bjh(AnonymousClass5SK r3, boolean z) {
        this.A00.A07(-1);
    }

    public String BHv() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AITypeaheadSuggestionsCache - ");
        A0u.append(this.A00.A02());
        return AnonymousClass000.A0q(" items", A0u);
    }
}
