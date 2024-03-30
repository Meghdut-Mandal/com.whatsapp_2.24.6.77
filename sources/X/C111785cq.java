package X;

/* renamed from: X.5cq  reason: invalid class name and case insensitive filesystem */
public abstract class C111785cq {
    public static /* synthetic */ boolean A00(C1273567y r4) {
        C37001le r3 = new C37001le();
        boolean z = false;
        try {
            r3.setDataSource(r4.A05.getAbsolutePath());
            try {
                String extractMetadata = r3.extractMetadata(25);
                if (extractMetadata != null && Float.parseFloat(extractMetadata) > 60.0f) {
                    z = true;
                }
                r3.close();
                return z;
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } catch (Exception unused) {
            r3.close();
            return false;
        }
    }
}
