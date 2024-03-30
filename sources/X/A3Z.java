package X;

public final class A3Z implements C23017B0i {
    public static final A3Z A00 = new A3Z();

    public final boolean ByH(Class cls) {
        return AnonymousClass8DG.class.isAssignableFrom(cls);
    }

    public final C22802AwD ByS(Class cls) {
        IllegalStateException illegalStateException;
        Class<AnonymousClass8DG> cls2 = AnonymousClass8DG.class;
        if (!cls2.isAssignableFrom(cls)) {
            throw AnonymousClass001.A08(C90464aC.A0c("Unsupported message type: ", cls.getName()));
        }
        try {
            Class<? extends U> asSubclass = cls.asSubclass(cls2);
            AnonymousClass8DG r1 = (AnonymousClass8DG) AnonymousClass8DG.zzjr.get(asSubclass);
            if (r1 == null) {
                try {
                    String name = asSubclass.getName();
                    Class.forName(name, true, asSubclass.getClassLoader());
                    r1 = (AnonymousClass8DG) AnonymousClass8DG.zzjr.get(asSubclass);
                    if (r1 == null) {
                        illegalStateException = AnonymousClass001.A09(C90464aC.A0c("Unable to get default instance for: ", name));
                        throw illegalStateException;
                    }
                } catch (ClassNotFoundException e) {
                    illegalStateException = new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            return (C22802AwD) r1.A06(3);
        } catch (Exception e2) {
            throw C90524aI.A0e(C90464aC.A0c("Unable to get message info for ", cls.getName()), e2);
        }
    }
}
