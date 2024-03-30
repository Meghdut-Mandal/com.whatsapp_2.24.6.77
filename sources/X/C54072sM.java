package X;

/* renamed from: X.2sM  reason: invalid class name and case insensitive filesystem */
public abstract class C54072sM {
    public static final Long A00(String str) {
        if (str != null) {
            try {
                return Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                C36321k7.A1P("AxolotlLidJidMigrationUtils/ bad lid:", str, AnonymousClass000.A0u());
            }
        }
        return null;
    }
}
