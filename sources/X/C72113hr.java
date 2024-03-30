package X;

/* renamed from: X.3hr  reason: invalid class name and case insensitive filesystem */
public final class C72113hr implements AnonymousClass15z {
    public /* synthetic */ void B7n(C224114e r1, AnonymousClass38H r2, C65063Qo r3) {
    }

    public /* synthetic */ void B7s(C224114e r2, AnonymousClass38H r3, C65063Qo r4) {
        AnonymousClass00C.A0D(r4, 0);
        C63843Lq.A01(r4, "bot_plugin_metadata");
    }

    public void B7q(AnonymousClass38H r7, C65063Qo r8) {
        C63573Ko A01 = C63573Ko.A01(r8);
        C64563Om[] r4 = new C64563Om[9];
        C52502pX A02 = C52502pX.A02(A01);
        C63573Ko.A0Q(A01, A02, "search_provider", r4, C63573Ko.A0h(A01, A02, r4) ? 1 : 0);
        C63573Ko.A08(A01, A02, "plugin_type", r4);
        A01.A02 = "thumbnail_cdn_url";
        C52502pX r2 = C52502pX.TEXT;
        C63573Ko.A0U(A01, r2, r4);
        C63573Ko.A0A(A01, r2, "profile_photo_cdn_url", r4);
        C63573Ko.A0B(A01, r2, "search_provider_url", r4);
        C63573Ko.A0C(A01, A02, "reference_index", r4);
        r4[7] = C52502pX.A00(A01, "profile_photo_thumbnail");
        C63573Ko.A0E(A01, r2, "search_query", r4);
        r8.A0B("bot_plugin_metadata", r4);
    }
}
