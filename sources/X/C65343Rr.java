package X;

/* renamed from: X.3Rr  reason: invalid class name and case insensitive filesystem */
public class C65343Rr {
    public final AnonymousClass199 A00;
    public final C19970wo A01;

    public static void A00(C65343Rr r3, String str) {
        AnonymousClass199.A04(r3.A00, str, String.valueOf(C19970wo.A00(r3.A01)));
    }

    public static boolean A01(C65343Rr r4, String str) {
        Long A06 = r4.A00.A06(str);
        if (A06 == null || C19970wo.A00(r4.A01) - A06.longValue() > 2592000000L) {
            return false;
        }
        return true;
    }

    public AnonymousClass3AN A02() {
        AnonymousClass3AM r2 = new AnonymousClass3AM();
        if (A01(this, "STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME")) {
            r2.A04 = this.A00.A06("STORAGE_USAGE_MEDIA_SIZE");
        }
        if (A01(this, "STORAGE_USAGE_LARGE_FILES_CACHE_TIME")) {
            AnonymousClass199 r1 = this.A00;
            r2.A03 = r1.A06("STORAGE_USAGE_LARGE_FILES_MEDIA_SIZE");
            r2.A01 = r1.A05("STORAGE_USAGE_LARGE_FILES_COUNT");
            r2.A06 = r1.A08("STORAGE_USAGE_LARGE_FILES_ROW_IDS");
        }
        if (A01(this, "STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME")) {
            AnonymousClass199 r12 = this.A00;
            r2.A02 = r12.A06("STORAGE_USAGE_FORWARDED_FILES_MEDIA_SIZE");
            r2.A00 = r12.A05("STORAGE_USAGE_FORWARDED_FILES_COUNT");
            r2.A05 = r12.A08("STORAGE_USAGE_FORWARDED_FILES_ROW_IDS");
        }
        return new AnonymousClass3AN(r2);
    }

    public C65343Rr(C19970wo r1, AnonymousClass199 r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
