package X;

/* renamed from: X.617  reason: invalid class name */
public final class AnonymousClass617 {
    public final C19630wG A00;

    public AnonymousClass617(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final String A00(String str, int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append(C90514aH.A0j(this.A00).getAbsolutePath());
        A0u2.append("/ptt/");
        StringBuilder A0j = C90464aC.A0j(A0u2, A0u);
        A0j.append(str);
        A0j.append(':');
        A0j.append(i);
        C36351kA.A1K(A0j, A0u);
        return AnonymousClass000.A0q(".ggml", A0u);
    }
}
