package X;

/* renamed from: X.0eX  reason: invalid class name and case insensitive filesystem */
public final class C10590eX implements C17110qj {
    public final C17110qj[] A00;

    public C10590eX(C17110qj... r1) {
        this.A00 = r1;
    }

    public final C15980oM ByQ(Class cls) {
        C17110qj[] r3 = this.A00;
        int i = 0;
        do {
            C17110qj r1 = r3[i];
            if (r1.zzc(cls)) {
                return r1.ByQ(cls);
            }
            i++;
        } while (i < 2);
        throw AnonymousClass001.A0E("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    public final boolean zzc(Class cls) {
        C17110qj[] r3 = this.A00;
        int i = 0;
        while (!r3[i].zzc(cls)) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }
}
