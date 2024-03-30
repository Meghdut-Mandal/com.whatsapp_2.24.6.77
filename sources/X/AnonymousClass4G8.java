package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.4G8  reason: invalid class name */
public final class AnonymousClass4G8 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $key = "EXTRA_SAVE_STATE_BUNDLE";
    public final /* synthetic */ Activity $this_bundleArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4G8(Activity activity) {
        super(0);
        this.$this_bundleArg = activity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundleExtra;
        Intent intent = this.$this_bundleArg.getIntent();
        if (intent == null || (bundleExtra = intent.getBundleExtra(this.$key)) == null) {
            return AnonymousClass001.A07();
        }
        return bundleExtra;
    }
}
