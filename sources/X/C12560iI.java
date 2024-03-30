package X;

/* renamed from: X.0iI  reason: invalid class name and case insensitive filesystem */
public final class C12560iI implements AnonymousClass00T {
    public AnonymousClass04R A00;
    public final AnonymousClass00S A01;
    public final AnonymousClass00S A02;
    public final AnonymousClass00S A03;
    public final C019108d A04;

    public boolean BM2() {
        return AnonymousClass000.A1V(this.A00);
    }

    public /* bridge */ /* synthetic */ Object getValue() {
        AnonymousClass04R r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass04H r2 = new AnonymousClass04H((AnonymousClass04G) this.A02.invoke(), (AnonymousClass04J) this.A03.invoke(), (AnonymousClass04K) this.A01.invoke());
        C019108d r1 = this.A04;
        AnonymousClass00C.A0D(r1, 0);
        Class BDB = ((C019208e) r1).BDB();
        AnonymousClass00C.A0E(BDB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        AnonymousClass04R A002 = r2.A00(BDB);
        this.A00 = A002;
        return A002;
    }

    public C12560iI(AnonymousClass00S r1, AnonymousClass00S r2, AnonymousClass00S r3, C019108d r4) {
        this.A04 = r4;
        this.A03 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }
}
