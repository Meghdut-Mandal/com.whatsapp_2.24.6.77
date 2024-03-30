package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.animation.TranslateAnimation;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.util.DirectoryMapViewLocationUpdateListener;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;

/* renamed from: X.7SA  reason: invalid class name */
public final class AnonymousClass7SA extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ BusinessDirectorySERPMapViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7SA(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity) {
        super(1);
        this.this$0 = businessDirectorySERPMapViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = this.this$0;
        int A07 = C36411kG.A07((Number) obj);
        if (A07 == 0) {
            DirectoryMapViewLocationUpdateListener directoryMapViewLocationUpdateListener = businessDirectorySERPMapViewActivity.A04;
            if (directoryMapViewLocationUpdateListener != null) {
                directoryMapViewLocationUpdateListener.A00();
                Runnable runnable = businessDirectorySERPMapViewActivity.A09;
                if (runnable != null) {
                    businessDirectorySERPMapViewActivity.A0B.removeCallbacks(runnable);
                }
                C1497172m r3 = new C1497172m(businessDirectorySERPMapViewActivity, 25);
                businessDirectorySERPMapViewActivity.A09 = r3;
                businessDirectorySERPMapViewActivity.A0B.postDelayed(r3, 15000);
            } else {
                throw C36331k8.A0d("locationUpdateListener");
            }
        } else if (A07 == 1) {
            businessDirectorySERPMapViewActivity.A3j(false);
        } else if (A07 == 2) {
            String[] strArr = AnonymousClass1P6.A09;
            AnonymousClass00C.A09(strArr);
            if (!AnonymousClass3US.A09(businessDirectorySERPMapViewActivity, strArr)) {
                C1258661p r2 = businessDirectorySERPMapViewActivity.A05;
                if (r2 != null) {
                    r2.A00(businessDirectorySERPMapViewActivity, new C143566ql(businessDirectorySERPMapViewActivity), 0);
                } else {
                    throw C36331k8.A0d("locationInfoDialogHelper");
                }
            } else {
                AnonymousClass3FM A0T = C90474aD.A0T(businessDirectorySERPMapViewActivity);
                A0T.A02 = R.string.f12nameremoved;
                businessDirectorySERPMapViewActivity.startActivityForResult(A0T.A02(), 34);
            }
        } else if (A07 == 3) {
            DirectoryMapViewLocationUpdateListener directoryMapViewLocationUpdateListener2 = businessDirectorySERPMapViewActivity.A04;
            if (directoryMapViewLocationUpdateListener2 != null) {
                directoryMapViewLocationUpdateListener2.A00();
            } else {
                throw C36331k8.A0d("locationUpdateListener");
            }
        } else if (A07 == 7) {
            businessDirectorySERPMapViewActivity.A3j(true);
        } else if (A07 == 8) {
            boolean A0D = C03570Gk.A0D(businessDirectorySERPMapViewActivity, "android.permission.ACCESS_FINE_LOCATION");
            int i = R.string.f12nameremoved;
            int i2 = R.string.f12nameremoved;
            if (A0D) {
                i = R.string.f12nameremoved;
                i2 = R.string.f12nameremoved;
            }
            C39001qm A00 = AnonymousClass3LW.A00(businessDirectorySERPMapViewActivity);
            A00.A0d(R.string.f12nameremoved);
            A00.A0c(i);
            A00.A0h(new C163367q5(0, businessDirectorySERPMapViewActivity, A0D), i2);
            A00.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
            C36341k9.A11(A00);
        } else if (A07 == 9) {
            C95404kp A3i = businessDirectorySERPMapViewActivity.A3i();
            boolean A0C = A3i.A0N.A0C(A3i.A01);
            if (businessDirectorySERPMapViewActivity.A0A || A0C) {
                Intent A0D2 = C36431kI.A0D();
                if (A0C) {
                    businessDirectorySERPMapViewActivity.setResult(-1, A0D2.putExtra("arg_search_filters", businessDirectorySERPMapViewActivity.A3i().A0N.A01()));
                }
                businessDirectorySERPMapViewActivity.setResult(-1, A0D2.putExtra("arg_location_access_changed", businessDirectorySERPMapViewActivity.A0A));
                businessDirectorySERPMapViewActivity.finish();
            } else {
                businessDirectorySERPMapViewActivity.finishAfterTransition();
            }
        } else if (A07 == 12) {
            RecyclerView recyclerView = businessDirectorySERPMapViewActivity.A02;
            if (recyclerView == null) {
                throw C36331k8.A0d("horizontalBusinessListView");
            } else if (recyclerView.getVisibility() == 0) {
                RecyclerView recyclerView2 = businessDirectorySERPMapViewActivity.A02;
                if (recyclerView2 == null) {
                    throw C36331k8.A0d("horizontalBusinessListView");
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, C36441kJ.A02(recyclerView2));
                translateAnimation.setInterpolator(new C135976dZ());
                translateAnimation.setDuration(300);
                translateAnimation.setAnimationListener(new C163077pc(businessDirectorySERPMapViewActivity, 1));
                RecyclerView recyclerView3 = businessDirectorySERPMapViewActivity.A02;
                if (recyclerView3 == null) {
                    throw C36331k8.A0d("horizontalBusinessListView");
                }
                recyclerView3.startAnimation(translateAnimation);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
