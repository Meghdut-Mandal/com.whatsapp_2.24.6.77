package X;

/* renamed from: X.5Z1  reason: invalid class name */
public abstract class AnonymousClass5Z1 {
    public static final Object A00(C100674vP r4, C160377ku r5, String str) {
        if (r5 == null) {
            return null;
        }
        try {
            return AnonymousClass5ZN.A00(AnonymousClass6MO.A01, r5, r4);
        } catch (AnonymousClass5VI e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Exception when evaluating ");
            A0u.append(str);
            AnonymousClass6RS.A00((C1271967i) null, "BloksComponentQueryManager", AnonymousClass000.A0q(" for async component query.", A0u), e);
            return null;
        }
    }
}
