package X;

/* renamed from: X.5ak  reason: invalid class name and case insensitive filesystem */
public abstract class C110485ak {
    public static final AnonymousClass691 A00(String str, String str2) {
        AnonymousClass00C.A0D(str2, 1);
        byte[] digest = C90504aG.A0s().digest(C36351kA.A1b(C36321k7.A0D(str, str2)));
        AnonymousClass00C.A0B(digest);
        String str3 = "";
        for (byte valueOf : digest) {
            str3 = AnonymousClass000.A0q(C90504aG.A0m("%02x", C90524aI.A0x(Byte.valueOf(valueOf), new Object[1], 0, 1)), AnonymousClass000.A0v(str3));
        }
        return new AnonymousClass691(str3);
    }
}
