package X;

/* renamed from: X.2Mf  reason: invalid class name */
public final class AnonymousClass2Mf extends AnonymousClass6EV {
    public final C20310xM A00;
    public final AnonymousClass6PZ A01;
    public final AnonymousClass3T1 A02;

    public Object A01(C023509x r13) {
        if (this.A00.getJSONObject("data").optBoolean("disable_cta")) {
            C54292si.A00(this.A00, this.A02);
        }
        long optLong = this.A00.getJSONObject("data").optLong("extension_screen_length", 0);
        Boolean bool = null;
        String optString = this.A00.getJSONObject("data").optString("screen_progress", (String) null);
        boolean optBoolean = this.A00.getJSONObject("data").optBoolean("is_restored", false);
        boolean optBoolean2 = this.A00.getJSONObject("data").optBoolean("is_success", false);
        long optLong2 = this.A00.getJSONObject("data").optLong("sequence_number", 0);
        AnonymousClass6PZ r3 = this.A01;
        Boolean valueOf = Boolean.valueOf(optBoolean2);
        Long l = new Long(optLong);
        if (optString != null) {
            r3.A04 = optString;
        }
        r3.A02 = valueOf;
        r3.A00 = l.longValue();
        AnonymousClass6EA r0 = r3.A01;
        if (r0 != null) {
            r0.A01 = optBoolean;
            r0.A00 = optLong2;
        }
        if (this.A00.getJSONObject("data").has("is_success")) {
            bool = valueOf;
        }
        r3.A02(optString, bool);
        return AnonymousClass0AJ.A00;
    }

    public AnonymousClass2Mf(C20310xM r1, AnonymousClass6PZ r2, AnonymousClass3T1 r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
