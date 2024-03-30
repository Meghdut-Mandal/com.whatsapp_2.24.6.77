package X;

/* renamed from: X.6ry  reason: invalid class name and case insensitive filesystem */
public final class C144306ry implements AnonymousClass193 {
    public final /* synthetic */ AnonymousClass1OL A00;
    public final /* synthetic */ AnonymousClass0AP A01;

    public C144306ry(AnonymousClass1OL r1, AnonymousClass0AP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Biq() {
        this.A00.A01.unregisterObserver(this);
        this.A01.resumeWith(new C119485pt(C108095Sd.UNKNOWN, true));
    }

    public void Bir() {
        this.A00.A01.unregisterObserver(this);
        this.A01.resumeWith(new C119485pt(C108095Sd.SYNCD_DELETION_FAILED, false));
    }

    public void Bec() {
    }
}
