package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel;
import com.whatsapp.calling.views.VoipCallControlRingingDotsIndicator;

/* renamed from: X.52q  reason: invalid class name and case insensitive filesystem */
public class C1029452q extends C97014oG {
    public C1029752t A00;
    public final View A01;
    public final ImageView A02;
    public final AnonymousClass3SF A03;
    public final AnonymousClass171 A04;
    public final C88514Sz A05;
    public final AnonymousClass1RY A06;
    public final AnonymousClass1RJ A07;
    public final AnonymousClass1RJ A08;
    public final AnonymousClass1RJ A09;
    public final Runnable A0A = new C1501574e(this, 14);
    public final C21060yb A0B;

    public static void A00(View view, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(C017907q.A00(0.0f, 0.0f, 0.6f, 1.0f));
        alphaAnimation.setDuration(750);
        alphaAnimation.setRepeatCount(1);
        alphaAnimation.setRepeatMode(2);
        view.startAnimation(alphaAnimation);
    }

    public static void A01(C1029452q r6) {
        View A012;
        r6.A02.setAlpha(0.3f);
        r6.A01.setAlpha(0.3f);
        r6.A09.A03(8);
        AnonymousClass1RJ r3 = r6.A08;
        if (r3.A00() != 0) {
            C36391kE.A0L(r3, 0).setAlpha(0.0f);
            r3.A01().animate().setDuration(500).alpha(1.0f).start();
        }
        if (C90504aG.A1V(r6.A0B)) {
            A012 = r6.A0H;
        } else {
            A012 = r3.A01();
        }
        C48892iE.A00(A012, r6, 25);
        View view = r6.A0H;
        AnonymousClass3UE.A06(view, C36411kG.A0w(view.getResources(), r6.A03.A01.getText(), AnonymousClass001.A0L(), 0, R.string.f12nameremoved), (String) null);
    }

    public static void A02(C1029452q r12) {
        r12.A08.A03(8);
        AnonymousClass1RJ r4 = r12.A09;
        r4.A03(0);
        View view = r12.A0H;
        view.setContentDescription(C36411kG.A0w(view.getResources(), r12.A03.A01.getText(), AnonymousClass001.A0L(), 0, R.string.f12nameremoved));
        ParticipantsListViewModel participantsListViewModel = r12.A00;
        if (!(participantsListViewModel == null || participantsListViewModel.A04.A05().A06 == null)) {
            if (C90494aF.A1U(participantsListViewModel.A0A, Boolean.FALSE)) {
                r4.A01().postDelayed(new C1501574e(r12, 15), 2000);
            }
        }
        C92554eA r5 = new C92554eA((VoipCallControlRingingDotsIndicator) r4.A01(), 0.14f, 0.66f, 800, 100, 1500);
        r5.setRepeatCount(-1);
        C162657ow.A00(r5, r12, 0);
        r4.A01().startAnimation(r5);
    }

    public boolean A0A() {
        return AnonymousClass000.A1V(this.A00);
    }

    public void A0C() {
        this.A01.clearAnimation();
        this.A02.clearAnimation();
        View view = this.A09.A00;
        if (view != null) {
            view.clearAnimation();
        }
    }

    public C1029452q(View view, AnonymousClass1LI r4, ParticipantsListViewModel participantsListViewModel, AnonymousClass171 r6, C88514Sz r7, AnonymousClass1RY r8, C21060yb r9) {
        super(view, participantsListViewModel);
        this.A01 = C012005e.A02(view, R.id.name);
        this.A04 = r6;
        this.A0B = r9;
        this.A05 = r7;
        this.A06 = r8;
        this.A03 = AnonymousClass3SF.A01(view, r4, R.id.name);
        this.A02 = C36401kF.A0G(view, R.id.avatar);
        this.A07 = C36341k9.A0X(view, R.id.connect_icon_stub);
        this.A08 = C36341k9.A0X(view, R.id.ring_btn_stub);
        this.A09 = C36341k9.A0X(view, R.id.ringing_dots_stub);
    }
}
