package X;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.01I  reason: invalid class name */
public class AnonymousClass01I extends AnonymousClass01G implements AnonymousClass01H {
    public static final String A05 = "android:support:lifecycle";
    public boolean A00;
    public boolean A01;
    public boolean A02 = true;
    public final AnonymousClass01N A03 = new AnonymousClass01N(this);
    public final AnonymousClass02D A04 = new AnonymousClass02D(new C004401y(this));

    @Deprecated
    public final void A1s() {
    }

    public void A1y(Intent intent, Bundle bundle, AnonymousClass02E r4, int i) {
        if (i == -1) {
            AnonymousClass0XN.A02(this, intent, bundle, -1);
        } else {
            r4.A0t(intent, i, bundle);
        }
    }

    public void A1z(Intent intent, AnonymousClass02E r3, int i) {
        A1y(intent, (Bundle) null, r3, i);
    }

    @Deprecated
    public void A22(AnonymousClass02E r1) {
    }

    private void A01() {
        this.A07.A01.A03(new C18640tU(this, 2), A05);
        B0X(new C18430t9(this, 2));
        A1g(new C18430t9(this, 1));
        A1e(new C18280su(this, 2));
    }

    public static boolean A07(AnonymousClass01z r4, AnonymousClass01P r5) {
        boolean z = false;
        for (AnonymousClass02E r2 : r4.A0T.A04()) {
            if (r2 != null) {
                if (r2.A0K != null) {
                    z |= A07(r2.A0k(), r5);
                }
                C02380Ab r0 = r2.A0N;
                if (r0 != null) {
                    r0.A00();
                    if (r0.A00.A02.compareTo(AnonymousClass01P.STARTED) >= 0) {
                        r2.A0N.A00.A07(r5);
                        z = true;
                    }
                }
                if (r2.A0P.A02.compareTo(AnonymousClass01P.STARTED) >= 0) {
                    r2.A0P.A07(r5);
                    z = true;
                }
            }
        }
        return z;
    }

    public void A1l() {
        do {
        } while (A07(this.A04.A00.A03, AnonymousClass01P.CREATED));
    }

    public void A1r() {
        this.A03.A06(AnonymousClass05R.ON_RESUME);
        AnonymousClass01z r2 = this.A04.A00.A03;
        r2.A0I = false;
        r2.A0J = false;
        r2.A09.A01 = false;
        AnonymousClass01z.A09(r2, 7);
    }

    public /* synthetic */ void A1t() {
        this.A04.A00.A03.A0U();
    }

    public /* synthetic */ void A1u() {
        this.A04.A00.A03.A0U();
    }

    public /* synthetic */ void A1v() {
        C004401y r1 = this.A04.A00;
        r1.A03.A0g((AnonymousClass02E) null, r1, r1);
    }

    public final void A1w(Context context, AttributeSet attributeSet, View view, String str) {
        this.A04.A00.A03.A0R.onCreateView(view, str, context, attributeSet);
    }

    public void A20(C06580Ud r2) {
        AnonymousClass0DZ r0;
        if (r2 != null) {
            r0 = new AnonymousClass0DZ(r2);
        } else {
            r0 = null;
        }
        A05(this, r0);
    }

    public void A21(C06580Ud r2) {
        AnonymousClass0DZ r0;
        if (r2 != null) {
            r0 = new AnonymousClass0DZ(r2);
        } else {
            r0 = null;
        }
        A06(this, r0);
    }

    public AnonymousClass01z getSupportFragmentManager() {
        return this.A04.A00.A03;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.A04.A00.A03.A0U();
        super.onActivityResult(i, i2, intent);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.A04.A00.A03.A0R.onCreateView(view, str, context, attributeSet);
        if (onCreateView == null) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return onCreateView;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.A04.A00.A03.A0U();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        this.A04.A00.A03.A0U();
        super.onResume();
        this.A01 = true;
        this.A04.A00.A03.A0q(true);
    }

    public void onStart() {
        this.A04.A00.A03.A0U();
        super.onStart();
        this.A02 = false;
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass01z r2 = this.A04.A00.A03;
            r2.A0I = false;
            r2.A0J = false;
            r2.A09.A01 = false;
            AnonymousClass01z.A09(r2, 4);
        }
        this.A04.A00.A03.A0q(true);
        this.A03.A06(AnonymousClass05R.ON_START);
        AnonymousClass01z r22 = this.A04.A00.A03;
        r22.A0I = false;
        r22.A0J = false;
        r22.A09.A01 = false;
        AnonymousClass01z.A09(r22, 5);
    }

    public void onStateNotSaved() {
        this.A04.A00.A03.A0U();
    }

    public AnonymousClass01I(int i) {
        super(i);
        A01();
    }

    public /* synthetic */ Bundle A1k() {
        A1l();
        this.A03.A06(AnonymousClass05R.ON_STOP);
        return new Bundle();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!AnonymousClass014.A00(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            String obj = sb.toString();
            printWriter.print(obj);
            printWriter.print("mCreated=");
            printWriter.print(this.A00);
            printWriter.print(" mResumed=");
            printWriter.print(this.A01);
            printWriter.print(" mStopped=");
            printWriter.print(this.A02);
            if (getApplication() != null) {
                C07540Ye.A00(this).A04(obj, fileDescriptor, printWriter, strArr);
            }
            this.A04.A00.A03.A0p(str, fileDescriptor, printWriter, strArr);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A03.A06(AnonymousClass05R.ON_CREATE);
        AnonymousClass01z r2 = this.A04.A00.A03;
        r2.A0I = false;
        r2.A0J = false;
        r2.A09.A01 = false;
        AnonymousClass01z.A09(r2, 1);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A04.A00.A03.A0S();
        this.A03.A06(AnonymousClass05R.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.A04.A00.A03.A0u(menuItem);
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.A01 = false;
        AnonymousClass01z.A09(this.A04.A00.A03, 5);
        this.A03.A06(AnonymousClass05R.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        A1r();
    }

    public void onStop() {
        super.onStop();
        this.A02 = true;
        A1l();
        AnonymousClass01z r2 = this.A04.A00.A03;
        r2.A0J = true;
        r2.A09.A01 = true;
        AnonymousClass01z.A09(r2, 4);
        this.A03.A06(AnonymousClass05R.ON_STOP);
    }

    public static void A03(Activity activity) {
        activity.postponeEnterTransition();
    }

    public static void A04(Activity activity) {
        activity.startPostponedEnterTransition();
    }

    public static void A05(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setEnterSharedElementCallback(sharedElementCallback);
    }

    public static void A06(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setExitSharedElementCallback(sharedElementCallback);
    }

    @Deprecated
    public void A1m() {
        C07540Ye.A00(this);
    }

    public void A1n() {
        AnonymousClass0PG.A00(this);
    }

    @Deprecated
    public void A1o() {
        invalidateOptionsMenu();
    }

    public void A1p() {
        A03(this);
    }

    public void A1q() {
        A04(this);
    }

    @Deprecated
    public void A1x(Intent intent, IntentSender intentSender, Bundle bundle, AnonymousClass02E r20, int i, int i2, int i3, int i4) {
        Activity activity;
        Intent intent2 = intent;
        IntentSender intentSender2 = intentSender;
        Bundle bundle2 = bundle;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (i5 == -1) {
            activity = this;
        } else {
            AnonymousClass02E r5 = r20;
            if (r5.A0K != null) {
                if (AnonymousClass01z.A0E(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Fragment ");
                    sb.append(r5);
                    sb.append(" received the following in startIntentSenderForResult() requestCode: ");
                    sb.append(i5);
                    sb.append(" IntentSender: ");
                    sb.append(intentSender2);
                    sb.append(" fillInIntent: ");
                    sb.append(intent2);
                    sb.append(" options: ");
                    sb.append(bundle2);
                    Log.v("FragmentManager", sb.toString());
                }
                AnonymousClass01z A0l = r5.A0l();
                if (A0l.A04 != null) {
                    if (bundle != null) {
                        if (intent == null) {
                            intent2 = new Intent();
                            intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                        }
                        if (AnonymousClass01z.A0E(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("ActivityOptions ");
                            sb2.append(bundle2);
                            sb2.append(" were added to fillInIntent ");
                            sb2.append(intent2);
                            sb2.append(" for fragment ");
                            sb2.append(r5);
                            Log.v("FragmentManager", sb2.toString());
                        }
                        intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
                    }
                    C06520Tx r0 = new C06520Tx(intentSender2);
                    r0.A02 = intent2;
                    r0.A01 = i7;
                    r0.A00 = i6;
                    C08770bI A002 = r0.A00();
                    A0l.A0B.addLast(new C08750bG(r5.A0W, i5));
                    if (AnonymousClass01z.A0E(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Fragment ");
                        sb3.append(r5);
                        sb3.append("is launching an IntentSender for result ");
                        Log.v("FragmentManager", sb3.toString());
                    }
                    A0l.A04.A01((AnonymousClass0YW) null, A002);
                    return;
                }
                C004401y r02 = A0l.A07;
                if (i5 == -1) {
                    activity = r02.A00;
                } else {
                    throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Fragment ");
                sb4.append(r5);
                sb4.append(" not attached to Activity");
                throw new IllegalStateException(sb4.toString());
            }
        }
        AnonymousClass0XN.A01(activity, intent2, intentSender2, bundle2, -1, i6, i7, i8);
    }

    public AnonymousClass01I() {
        A01();
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.A04.A00.A03.A0R.onCreateView((View) null, str, context, attributeSet);
        if (onCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return onCreateView;
    }
}
