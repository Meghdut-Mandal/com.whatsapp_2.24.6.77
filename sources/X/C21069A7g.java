package X;

import com.google.protobuf.UnsafeUtil;

/* renamed from: X.A7g  reason: case insensitive filesystem */
public class C21069A7g implements C23019B0p {
    public static final C21069A7g A00 = new C21069A7g();

    public boolean BNN(Class cls) {
        return C170918Hz.class.isAssignableFrom(cls);
    }

    public AnonymousClass9LW BPr(Class cls) {
        IllegalStateException illegalStateException;
        Class<C170918Hz> cls2 = C170918Hz.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                Class<? extends U> asSubclass = cls.asSubclass(cls2);
                C170918Hz r1 = (C170918Hz) C170918Hz.defaultInstanceMap.get(asSubclass);
                if (r1 == null) {
                    try {
                        Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                        r1 = (C170918Hz) C170918Hz.defaultInstanceMap.get(asSubclass);
                        if (r1 == null) {
                            r1 = (C170918Hz) C170918Hz.A0S((C170918Hz) UnsafeUtil.A00(asSubclass), C023109s.A0S);
                            if (r1 != null) {
                                C170918Hz.defaultInstanceMap.put(asSubclass, r1);
                            } else {
                                illegalStateException = C165617ti.A0V();
                                throw illegalStateException;
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        illegalStateException = new IllegalStateException("Class initialization cannot fail.", e);
                    }
                }
                return (AnonymousClass9LW) C170918Hz.A0S(r1, C023109s.A0C);
            } catch (Exception e2) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Unable to get message info for ");
                throw C90524aI.A0e(AnonymousClass000.A0q(cls.getName(), A0u), e2);
            }
        } else {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("Unsupported message type: ");
            throw AnonymousClass000.A0c(cls.getName(), A0u2);
        }
    }
}
