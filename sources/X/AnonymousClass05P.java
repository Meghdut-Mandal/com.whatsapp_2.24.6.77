package X;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.05P  reason: invalid class name */
public class AnonymousClass05P extends Fragment {
    public static void A00(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            AnonymousClass05Q.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new AnonymousClass05P(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static void A01(Activity activity, AnonymousClass05R r2) {
        if (activity instanceof AnonymousClass012) {
            AnonymousClass01M lifecycle = ((AnonymousClass012) activity).getLifecycle();
            if (lifecycle instanceof AnonymousClass01N) {
                ((AnonymousClass01N) lifecycle).A06(r2);
            }
        }
    }

    private void A02(AnonymousClass05R r3) {
        if (Build.VERSION.SDK_INT < 29) {
            A01(getActivity(), r3);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        A02(AnonymousClass05R.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        A02(AnonymousClass05R.ON_DESTROY);
    }

    public void onPause() {
        super.onPause();
        A02(AnonymousClass05R.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        A02(AnonymousClass05R.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        A02(AnonymousClass05R.ON_START);
    }

    public void onStop() {
        super.onStop();
        A02(AnonymousClass05R.ON_STOP);
    }
}
