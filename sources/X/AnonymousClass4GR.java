package X;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: X.4GR  reason: invalid class name */
public final class AnonymousClass4GR extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $key = "optional_messages";
    public final /* synthetic */ AnonymousClass02E $this_bundleArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4GR(AnonymousClass02E r2) {
        super(0);
        this.$this_bundleArg = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundle;
        Bundle bundle2 = this.$this_bundleArg.A0A;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.$key)) == null) {
            bundle = AnonymousClass001.A07();
        }
        Objects.requireNonNull(bundle, "null cannot be cast to non-null type android.os.Bundle");
        return bundle;
    }
}
