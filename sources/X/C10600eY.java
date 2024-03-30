package X;

import java.util.Map;

/* renamed from: X.0eY  reason: invalid class name and case insensitive filesystem */
public final class C10600eY implements C17110qj {
    public static final C10600eY A00 = new C10600eY();

    public final C15980oM ByQ(Class cls) {
        IllegalStateException illegalStateException;
        Class<AnonymousClass0M8> cls2 = AnonymousClass0M8.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                Class<? extends U> asSubclass = cls.asSubclass(cls2);
                Map map = AnonymousClass0M8.zzb;
                if (((AnonymousClass0M8) map.get(asSubclass)) == null) {
                    try {
                        Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                        if (((AnonymousClass0M8) map.get(asSubclass)) == null) {
                            AnonymousClass0Z6.A02(asSubclass);
                            AnonymousClass0M7 r0 = AnonymousClass0M7.zzb;
                            if (r0 != null) {
                                map.put(asSubclass, r0);
                            } else {
                                illegalStateException = new IllegalStateException();
                                throw illegalStateException;
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        illegalStateException = new IllegalStateException("Class initialization cannot fail.", e);
                    }
                }
                Object[] A0L = AnonymousClass001.A0L();
                A0L[0] = "zzd";
                return new C10570eV(AnonymousClass0M7.zzb, A0L);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e2);
            }
        } else {
            throw AnonymousClass001.A08("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
    }

    public final boolean zzc(Class cls) {
        return AnonymousClass0M8.class.isAssignableFrom(cls);
    }
}
