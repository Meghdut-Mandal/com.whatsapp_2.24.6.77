package X;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.profile.ProfilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1;

/* renamed from: X.6UU  reason: invalid class name */
public abstract class AnonymousClass6UU {
    public static final boolean A00 = C36371kC.A1T(Build.VERSION.SDK_INT, 22);

    public static final AnonymousClass6CU A00(Intent intent) {
        AnonymousClass00C.A0D(intent, 0);
        int intExtra = intent.getIntExtra("start_transition_status_bar_color", 0);
        int intExtra2 = intent.getIntExtra("return_transition_status_bar_color", intExtra);
        int intExtra3 = intent.getIntExtra("start_transition_navigation_bar_color", 0);
        return new AnonymousClass6CU(intExtra, intExtra3, intExtra2, intent.getIntExtra("return_transition_navigation_bar_color", intExtra3));
    }

    public static final void A01(View view, View view2, Toolbar toolbar, C225314u r11, PhotoView photoView, AnonymousClass6CU r13, boolean z) {
        AnonymousClass00C.A0D(view, 1);
        C36321k7.A17(view2, toolbar, photoView, 2);
        ProfilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1 profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1 = new ProfilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1(r11, photoView);
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        view.setBackground(colorDrawable);
        profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1.A01 = 0.5f;
        profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1.A07 = true;
        profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1.A06 = z;
        profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1.A05 = new C145746uS(colorDrawable, toolbar, r11, r13, z);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((C02460Ak) layoutParams).A00(profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1);
    }

    public static final void A02(C225314u r7, AnonymousClass6CU r8, AnonymousClass68G r9) {
        C92034d1 r1;
        String stringExtra;
        Window window = r7.getWindow();
        Intent intent = r7.getIntent();
        if (A00) {
            window.addFlags(Integer.MIN_VALUE);
            window.requestFeature(12);
            window.requestFeature(13);
            C92014cz r2 = new C92014cz(window, r8, intent.getFloatExtra("start_transition_alpha", 0.0f));
            C92004cy r12 = new C92004cy(window, r8);
            r2.excludeTarget(16908335, true);
            r2.excludeTarget(16908336, true);
            window.setEnterTransition(r2);
            window.setReturnTransition(r12);
            r2.addListener(new C101184x8(window, r7, r9));
            r12.addListener(new C101174x7(r7, r9));
            if (intent.getBooleanExtra("circular_transition", false)) {
                AnonymousClass3CG r3 = new AnonymousClass3CG(r7);
                C92034d1 r13 = new C92034d1(true, false);
                r13.addTarget(r3.A02(R.string.f12nameremoved));
                window.setSharedElementEnterTransition(r13);
                r1 = new C92034d1(false, true);
                stringExtra = r3.A02(R.string.f12nameremoved);
            } else if (intent.hasExtra("circular_return_name")) {
                C92034d1 r14 = new C92034d1(false, false);
                r14.addTarget(intent.getStringExtra("circular_return_name"));
                window.setSharedElementEnterTransition(r14);
                r1 = new C92034d1(false, true);
                stringExtra = intent.getStringExtra("circular_return_name");
            } else {
                return;
            }
            r1.addTarget(stringExtra);
            window.setSharedElementReturnTransition(r1);
        }
    }
}
