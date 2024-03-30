package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.4Er  reason: invalid class name and case insensitive filesystem */
public final class C84814Er extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass00S $inFeatureCallback;
    public final /* synthetic */ AnonymousClass1K6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84814Er(AnonymousClass1K6 r2, AnonymousClass00S r3) {
        super(0);
        this.this$0 = r2;
        this.$inFeatureCallback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass1K6 r4 = this.this$0;
        AnonymousClass00S r3 = this.$inFeatureCallback;
        int ordinal = r4.A03.A02().ordinal();
        if (ordinal == 0) {
            Log.e("bonsaionboarding/waitlist/requested/can't be before waitlist after requesting");
        } else if (ordinal == 1) {
            r4.A00.A06(R.string.f12nameremoved, 0);
        } else if (ordinal == 2) {
            r4.A00.A06(R.string.f12nameremoved, 0);
            r3.invoke();
        }
        return AnonymousClass0AJ.A00;
    }
}
