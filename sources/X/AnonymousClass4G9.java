package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.4G9  reason: invalid class name */
public final class AnonymousClass4G9 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $key = "country_code";
    public final /* synthetic */ Activity $this_stringArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4G9(Activity activity) {
        super(0);
        this.$this_stringArg = activity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String stringExtra;
        Intent intent = this.$this_stringArg.getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra(this.$key)) != null) {
            return stringExtra;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("No value for ");
        throw AnonymousClass001.A0A(AnonymousClass000.A0q(this.$key, A0u));
    }
}
