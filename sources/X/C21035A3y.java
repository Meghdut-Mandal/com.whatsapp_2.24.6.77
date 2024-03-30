package X;

/* renamed from: X.A3y  reason: case insensitive filesystem */
public final class C21035A3y implements C23018B0j {
    public static final C21035A3y A00 = new C21035A3y();

    public final boolean ByH(Class cls) {
        return AnonymousClass8EX.class.isAssignableFrom(cls);
    }

    public final C22807AwI ByT(Class cls) {
        IllegalStateException illegalStateException;
        Class<AnonymousClass8EX> cls2 = AnonymousClass8EX.class;
        if (!cls2.isAssignableFrom(cls)) {
            throw AnonymousClass001.A08(C90464aC.A0c("Unsupported message type: ", cls.getName()));
        }
        try {
            Class<? extends U> asSubclass = cls.asSubclass(cls2);
            AnonymousClass8EX r1 = (AnonymousClass8EX) AnonymousClass8EX.zzd.get(asSubclass);
            if (r1 == null) {
                try {
                    Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                    r1 = (AnonymousClass8EX) AnonymousClass8EX.zzd.get(asSubclass);
                    if (r1 == null) {
                        r1 = (AnonymousClass8EX) ((AnonymousClass8EX) C203729od.A02(asSubclass)).A09(6);
                        if (r1 != null) {
                            AnonymousClass8EX.A05(asSubclass, r1);
                        } else {
                            illegalStateException = C165617ti.A0V();
                            throw illegalStateException;
                        }
                    }
                } catch (ClassNotFoundException e) {
                    illegalStateException = new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            return (C22807AwI) r1.A09(3);
        } catch (Exception e2) {
            throw C90524aI.A0e(C90464aC.A0c("Unable to get message info for ", cls.getName()), e2);
        }
    }
}
