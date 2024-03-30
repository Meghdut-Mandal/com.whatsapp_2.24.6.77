package X;

/* renamed from: X.7rr  reason: invalid class name and case insensitive filesystem */
public class C164467rr implements AnonymousClass05H {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C164467rr(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = str;
        this.A01 = obj;
    }

    public Object B36(C023509x r6, AnonymousClass05G r7) {
        AnonymousClass05H r4;
        C164257rW r3;
        if (this.A03 != 0) {
            r4 = (AnonymousClass05H) this.A01;
            r3 = new C164257rW(r7, this.A00, this.A02, 1);
        } else {
            r4 = (AnonymousClass05H) this.A00;
            r3 = new C164257rW(this.A01, r7, this.A02, 0);
        }
        return AnonymousClass0AO.A00(r4.B36(r6, r3));
    }
}
