package X;

/* renamed from: X.97Y  reason: invalid class name */
public abstract class AnonymousClass97Y {
    public static final C62983Ih A00(Throwable th) {
        String str;
        String A0t;
        Class<?> cls;
        String str2 = null;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        if (th instanceof C167027xC) {
            A0t = "CreateCredentialCancellationException";
        } else if (th instanceof C167007xA) {
            A0t = "CreateCredentialCustomException";
        } else if (th instanceof C167037xD) {
            A0t = "CreateCredentialInterruptedException";
        } else if (th instanceof C167047xE) {
            A0t = "CreateCredentialNoCreateOptionException";
        } else if (th instanceof C167057xF) {
            A0t = "CreateCredentialProviderConfigurationException";
        } else if (th instanceof C167067xG) {
            A0t = "CreateCredentialUnknownException";
        } else if (th instanceof C167077xH) {
            A0t = "CreateCredentialUnsupportedException";
        } else if (th instanceof C167457xt) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("CreatePublicKeyCredentialDomException (");
            A0u.append(((C167457xt) th).domError.A00);
            A0t = AnonymousClass000.A0t(A0u, ')');
        } else if (th instanceof C167017xB) {
            A0t = "CreatePublicKeyCredentialException";
        } else if (th instanceof C1889591l) {
            A0t = "CreateCredentialException";
        } else if (th instanceof C167107xK) {
            A0t = "GetCredentialCancellationException";
        } else if (th instanceof C167087xI) {
            A0t = "GetCredentialCustomException";
        } else if (th instanceof C167117xL) {
            A0t = "GetCredentialInterruptedException";
        } else if (th instanceof C167127xM) {
            A0t = "GetCredentialProviderConfigurationException";
        } else if (th instanceof C167137xN) {
            A0t = "GetCredentialUnknownException";
        } else if (th instanceof C167147xO) {
            A0t = "GetCredentialUnsupportedException";
        } else if (th instanceof C167157xP) {
            A0t = "NoCredentialException";
        } else if (th instanceof C167467xu) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("GetPublicKeyCredentialDomException (");
            A0u2.append(((C167467xu) th).domError.A00);
            A0t = AnonymousClass000.A0t(A0u2, ')');
        } else if (th instanceof C167097xJ) {
            A0t = "GetPublicKeyCredentialException";
        } else if (th instanceof C1889691m) {
            A0t = "GetCredentialException";
        } else {
            StringBuilder A0u3 = AnonymousClass000.A0u();
            A0u3.append("unexpected exception (");
            if (!(th == null || (cls = th.getClass()) == null)) {
                str2 = cls.getCanonicalName();
            }
            A0u3.append(str2);
            A0t = AnonymousClass000.A0t(A0u3, ')');
        }
        return new C62983Ih(A0t, str);
    }
}
