package X;

/* renamed from: X.8na  reason: invalid class name and case insensitive filesystem */
public final class C181508na extends C181348nK {
    public C181508na(C64933Qa r2, long j) {
        super(r2, 152, j);
    }

    public final C188518zi A1j() {
        int A1a = A1a();
        Integer valueOf = Integer.valueOf(A1a);
        for (C188518zi r1 : C188518zi.values()) {
            int i = r1.versionId;
            if (valueOf != null && i == A1a) {
                return r1;
            }
        }
        return C188518zi.AUTO_ADD_DISABLED_GROUP_IS_FULL;
    }

    public C181508na(C207209uj r2, long j) {
        super(r2, 152, j);
    }
}
