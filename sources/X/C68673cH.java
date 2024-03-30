package X;

import android.app.Activity;

/* renamed from: X.3cH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68673cH implements C22908AyK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C68673cH(Activity activity, String str, int i) {
        this.A01 = activity;
        this.A02 = str;
        this.A00 = i;
    }

    public final void BTc() {
        Activity activity = this.A01;
        activity.startActivity(AnonymousClass190.A1F(activity.getApplicationContext(), this.A02, (String) null, this.A00));
    }
}
