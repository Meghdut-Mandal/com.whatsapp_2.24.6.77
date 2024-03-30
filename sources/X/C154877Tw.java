package X;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;

/* renamed from: X.7Tw  reason: invalid class name and case insensitive filesystem */
public final class C154877Tw extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C128416Ce $typefaceRequest;
    public final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154877Tw(FontFamilyResolverImpl fontFamilyResolverImpl, C128416Ce r3) {
        super(1);
        this.this$0 = fontFamilyResolverImpl;
        this.$typefaceRequest = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Typeface B4T;
        C128416Ce r4 = this.$typefaceRequest;
        AnonymousClass6JE r1 = this.this$0.A01;
        C129796Im r3 = r4.A02;
        if (r3 == null || (r3 instanceof C95064jj)) {
            B4T = r1.A00.B4T(r4.A03, r4.A00);
        } else if (r3 instanceof C95074jk) {
            B4T = r1.A00.B4k(r4.A03, (C95074jk) r3, r4.A00);
        } else {
            throw AnonymousClass001.A09("Could not load font");
        }
        return new C138106hJ(B4T);
    }
}
