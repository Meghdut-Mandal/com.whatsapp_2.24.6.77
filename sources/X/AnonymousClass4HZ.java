package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.4HZ  reason: invalid class name */
public final class AnonymousClass4HZ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ boolean $default = false;
    public final /* synthetic */ String $key = "is_cag_and_community_add";
    public final /* synthetic */ Activity $this_booleanArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4HZ(Activity activity) {
        super(0);
        this.$this_booleanArg = activity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        Intent intent = this.$this_booleanArg.getIntent();
        if (intent != null) {
            z = intent.getBooleanExtra(this.$key, this.$default);
        } else {
            z = this.$default;
        }
        return Boolean.valueOf(z);
    }
}
