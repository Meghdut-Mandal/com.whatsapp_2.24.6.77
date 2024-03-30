package X;

import android.net.Uri;
import android.util.Base64;

/* renamed from: X.0WE  reason: invalid class name */
public final class AnonymousClass0WE {
    public static final AnonymousClass0Y9 A00;
    public static final AnonymousClass0Y9 A01;
    public static final AnonymousClass0Y9 A02;
    public static final AnonymousClass0Y9 A03;
    public static final AnonymousClass0Y9 A04;
    public static final AnonymousClass0Y9 A05;
    public static final AnonymousClass0Y9 A06;
    public static final AnonymousClass0Y9 A07;
    public static final AnonymousClass0Y9 A08;
    public static final AnonymousClass0Y9 A09;
    public static final AnonymousClass0Y9 A0A;
    public static final AnonymousClass0Y9 A0B;
    public static final AnonymousClass0Y9 A0C;
    public static final AnonymousClass0Y9 A0D;

    static {
        Uri uri;
        synchronized (AnonymousClass0RM.class) {
            AnonymousClass008 r2 = AnonymousClass0RM.A00;
            uri = (Uri) r2.get("com.google.android.gms.auth_account");
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
                r2.put("com.google.android.gms.auth_account", uri);
            }
        }
        AnonymousClass0WY r1 = new AnonymousClass0WY(uri);
        if ("".isEmpty()) {
            AnonymousClass0WY r4 = new AnonymousClass0WY(true, new AnonymousClass0WY(r1.A02, r1.A00).A00);
            Double valueOf = Double.valueOf(0.0d);
            A00 = new C04760Lx(r4, valueOf, "getTokenRefactor__account_data_service_sample_percentage");
            A01 = new C04750Lw(r4, true, "getTokenRefactor__account_data_service_tokenAPI_usable");
            A02 = new C04740Lv(r4, 20L, "getTokenRefactor__account_manager_timeout_seconds");
            A03 = new C04740Lv(r4, 0L, "getTokenRefactor__android_id_shift");
            A04 = new C04750Lw(r4, false, "getTokenRefactor__authenticator_logic_improved");
            try {
                A05 = new C04770Ly(r4, C06940Vr.A00, AnonymousClass0M7.A00(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)));
                A06 = new C04750Lw(r4, true, "getTokenRefactor__chimera_get_token_evolved");
                A07 = new C04740Lv(r4, 20L, "getTokenRefactor__clear_token_timeout_seconds");
                A08 = new C04740Lv(r4, 20L, "getTokenRefactor__default_task_timeout_seconds");
                A09 = new C04750Lw(r4, false, "getTokenRefactor__gaul_accounts_api_evolved");
                A0A = new C04750Lw(r4, false, "getTokenRefactor__gaul_token_api_evolved");
                A0B = new C04740Lv(r4, 120L, "getTokenRefactor__get_token_timeout_seconds");
                A0C = new C04750Lw(r4, true, "getTokenRefactor__gms_account_authenticator_evolved");
                A0D = new C04760Lx(r4, valueOf, "getTokenRefactor__gms_account_authenticator_sample_percentage");
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        } else {
            throw AnonymousClass001.A09("Cannot set GServices prefix and skip GServices");
        }
    }
}
