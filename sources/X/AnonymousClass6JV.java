package X;

/* renamed from: X.6JV  reason: invalid class name */
public class AnonymousClass6JV {
    public final C130906Mx A00;

    public AnonymousClass6JV(C130906Mx r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public static final void A00(C123305wH r7) {
        String str;
        String str2;
        Class<?> cls;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FbProfileDataFetcher/handleErrorsIfAny Received response code: ");
        int i = r7.A02;
        A0u.append(i);
        A0u.append(", Graph status code: ");
        int i2 = r7.A00;
        A0u.append(i2);
        A0u.append(", Graph Error subcode: ");
        int i3 = r7.A01;
        A0u.append(i3);
        A0u.append(", Exception class: ");
        Exception exc = r7.A03;
        if (exc == null || (cls = exc.getClass()) == null) {
            str = null;
        } else {
            str = cls.getSimpleName();
        }
        A0u.append(str);
        A0u.append(", Exception message: ");
        if (exc != null) {
            str2 = exc.getMessage();
        } else {
            str2 = null;
        }
        C90464aC.A1R(A0u, str2);
        if (i == -1) {
            throw new AnonymousClass5QX((String) null, (Throwable) null, (C05250Oz) null, 3);
        } else if (i == 1) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("Unknown error: ");
            throw new AnonymousClass5VM(AnonymousClass000.A0o(r7.A04, A0u2));
        } else if (i == 2) {
            if (i3 == 459) {
                throw new C107575Qa((String) null, (Throwable) null, (C05250Oz) null, 3);
            } else if (i3 == 467) {
                throw new AnonymousClass5QV((String) null, (Throwable) null, (C05250Oz) null, 3);
            } else if (i3 == 463) {
                throw new AnonymousClass5QT((String) null, (Throwable) null, (C05250Oz) null, 3);
            } else if (i3 == 464) {
                throw new AnonymousClass5QZ((String) null, (Throwable) null, (C05250Oz) null, 3);
            } else if (i2 == 190) {
                throw new AnonymousClass5QW((String) null, (Throwable) null, (C05250Oz) null, 3);
            } else {
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("Unknown error encountered, Code:");
                A0u3.append(i2);
                throw new AnonymousClass5VM(AnonymousClass000.A0r(" Error subcode:", A0u3, i3));
            }
        }
    }
}
