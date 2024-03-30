package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.3Oc  reason: invalid class name and case insensitive filesystem */
public final class C64473Oc {
    public final AnonymousClass190 A00;

    public C64473Oc(AnonymousClass190 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public static final void A00(Activity activity, Uri uri, AnonymousClass11F r6, int i) {
        C36321k7.A0v(r6, 1, uri);
        AnonymousClass3FR r1 = new AnonymousClass3FR(activity);
        r1.A01 = 1;
        r1.A0D = r6.getRawString();
        r1.A02 = i;
        r1.A0P = true;
        r1.A0N = true;
        r1.A0H = AnonymousClass03T.A02(uri);
        r1.A0O = true;
        r1.A04 = 37;
        Intent A01 = r1.A01();
        A01.putExtra("disable_shared_activity_transition_animation", true);
        activity.startActivity(A01);
    }

    public final void A01(Activity activity, AnonymousClass11F r17, int i) {
        Activity activity2 = activity;
        AnonymousClass11F r3 = r17;
        boolean A1a = C36341k9.A1a(activity2, r3);
        boolean z = A1a;
        Intent A0Z = AnonymousClass190.A0Z(activity2, r3, (AnonymousClass147) null, "", C023409w.A00, A1a ? 1 : 0, i, 37, 0, false, z, false);
        A0Z.putExtra("include_media", A1a);
        A0Z.putExtra("should_hide_caption_view", A1a);
        A0Z.putExtra("disable_shared_activity_transition_animation", A1a);
        activity2.startActivityForResult(A0Z, 22);
    }
}
