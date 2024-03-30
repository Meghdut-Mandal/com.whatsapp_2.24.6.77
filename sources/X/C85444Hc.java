package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.4Hc  reason: invalid class name and case insensitive filesystem */
public final class C85444Hc extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $default = null;
    public final /* synthetic */ String $key = "community_name";
    public final /* synthetic */ Activity $this_stringArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85444Hc(Activity activity) {
        super(0);
        this.$this_stringArg = activity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String stringExtra;
        Intent intent = this.$this_stringArg.getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra(this.$key)) == null) {
            return this.$default;
        }
        return stringExtra;
    }
}
