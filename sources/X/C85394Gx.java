package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;

/* renamed from: X.4Gx  reason: invalid class name and case insensitive filesystem */
public final class C85394Gx extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $key = "newsletter-appeal-data";
    public final /* synthetic */ Activity $this_parcelableArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85394Gx(Activity activity) {
        super(0);
        this.$this_parcelableArg = activity;
    }

    public final Object invoke() {
        Parcelable parcelable;
        boolean A09 = C19550w8.A09();
        Intent intent = this.$this_parcelableArg.getIntent();
        if (!A09) {
            if (intent != null) {
                parcelable = intent.getParcelableExtra(this.$key);
            } else {
                parcelable = null;
            }
            if (parcelable instanceof AnonymousClass3X9) {
                return parcelable;
            }
            return null;
        } else if (intent != null) {
            return intent.getParcelableExtra(this.$key, AnonymousClass3X9.class);
        } else {
            return null;
        }
    }
}