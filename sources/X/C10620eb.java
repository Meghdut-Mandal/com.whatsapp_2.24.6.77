package X;

/* renamed from: X.0eb  reason: invalid class name and case insensitive filesystem */
public final class C10620eb implements C17320r6 {
    public final AnonymousClass0QS A00;
    public final C17630rj A01;
    public final AnonymousClass0QW A02;

    public C10620eb(AnonymousClass0QS r1, C17630rj r2, AnonymousClass0QW r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final Object Byh() {
        AnonymousClass0M1 r0 = new AnonymousClass0M1((AnonymousClass0OW) null);
        AnonymousClass0M1.A00(r0);
        return r0.A00;
    }

    public final void Byo(Object obj) {
        ((AnonymousClass0M8) obj).zzc.A01 = false;
        throw AnonymousClass001.A0A("zzb");
    }

    public final void Byr(C07050Wd r3, Object obj, byte[] bArr, int i, int i2) {
        AnonymousClass0M8 r4 = (AnonymousClass0M8) obj;
        if (r4.zzc == AnonymousClass0YB.A04) {
            r4.zzc = AnonymousClass0YB.A00();
        }
        throw null;
    }

    public final boolean Byt(Object obj, Object obj2) {
        if (!((AnonymousClass0M8) obj).zzc.equals(((AnonymousClass0M8) obj2).zzc)) {
            return false;
        }
        return true;
    }

    public final int zza(Object obj) {
        return ((AnonymousClass0M8) obj).zzc.hashCode();
    }

    public final void Byp(Object obj, Object obj2) {
        C07450Xs.A00(obj, obj2);
    }
}
