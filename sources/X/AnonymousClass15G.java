package X;

import android.animation.LayoutTransition;
import android.app.Dialog;
import android.app.assist.AssistContent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.ConversationFragment;
import com.whatsapp.R;
import com.whatsapp.home.ui.HomePlaceholderActivity;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import java.util.concurrent.TimeUnit;

/* renamed from: X.15G  reason: invalid class name */
public abstract class AnonymousClass15G extends AnonymousClass157 implements AnonymousClass158, AnonymousClass159, AnonymousClass15A, AnonymousClass15C, AnonymousClass15D, AnonymousClass15E, AnonymousClass15F {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = 0;
    public Point A03;
    public View A04;
    public AnonymousClass15I A05;
    public AnonymousClass1Q7 A06;
    public AnonymousClass1JL A07;
    public boolean A08 = false;
    public boolean A09 = false;
    public Intent A0A;
    public View A0B;
    public AnonymousClass3A7 A0C;
    public final AnonymousClass026 A0D = new C36101jl(this, 0);

    private void A01() {
        View view;
        Resources resources;
        int i;
        this.A03 = null;
        int i2 = this.A01;
        if (i2 != -1 && (view = this.A04) != null) {
            View findViewById = view.findViewById(i2);
            View findViewById2 = this.A04.findViewById(this.A00);
            double A012 = (double) AnonymousClass1R1.A01(this);
            double A002 = (double) AnonymousClass1R1.A00(this);
            boolean z = false;
            if (Math.max(A012, A002) / Math.min(A012, A002) >= 1.45d) {
                z = true;
            }
            if ((findViewById instanceof LinearLayout) && (findViewById2 instanceof LinearLayout)) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) findViewById2.getLayoutParams();
                Resources resources2 = getResources();
                if (z) {
                    layoutParams.weight = (float) resources2.getInteger(R.integer.f8nameremoved);
                    resources = getResources();
                    i = R.integer.f8nameremoved;
                } else {
                    layoutParams.weight = (float) resources2.getInteger(R.integer.f8nameremoved);
                    resources = getResources();
                    i = R.integer.f8nameremoved;
                }
                layoutParams2.weight = (float) resources.getInteger(i);
                findViewById.setLayoutParams(layoutParams);
                findViewById2.setLayoutParams(layoutParams2);
            }
        }
    }

    public static void A07(AnonymousClass15G r3) {
        View view;
        if (r3.A07.A0C() && (view = r3.A04) != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C90094Zb(r3, 2));
        }
    }

    public static void A0F(AnonymousClass15G r4, int i) {
        View findViewById;
        View view = r4.A04;
        if (view != null && (findViewById = view.findViewById(r4.A01)) != null) {
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.addTransitionListener(new C66073Uo(viewGroup, r4));
            viewGroup.setLayoutTransition(layoutTransition);
            findViewById.setVisibility(i);
        }
    }

    public void A3k() {
        ViewGroup viewGroup;
        View view;
        View view2 = this.A00;
        if (view2 != null && (viewGroup = (ViewGroup) view2.findViewById(this.A00)) != null && (view = this.A0B) != null) {
            viewGroup.removeView(view);
            View view3 = this.A0B;
            if (view3 instanceof AnonymousClass00N) {
                this.A06.A05((AnonymousClass00N) view3);
            }
            this.A0B = null;
        }
    }

    public void A3l() {
        View findViewById;
        boolean A092 = this.A07.A09();
        View view = this.A04;
        if (view != null && A092 && (findViewById = view.findViewById(this.A00)) != null) {
            A3m();
            findViewById.setVisibility(0);
            A01();
            A07(this);
        }
    }

    public void A3m() {
        View view;
        ViewGroup viewGroup;
        if (this.A07.A09() && (view = this.A04) != null && this.A05 != null && (viewGroup = (ViewGroup) view.findViewById(this.A00)) != null) {
            View view2 = this.A0B;
            if (view2 == null || !view2.isAttachedToWindow()) {
                this.A0B = new HomePlaceholderActivity.HomePlaceholderView((Context) this.A05, (AttributeSet) null);
            }
            View view3 = this.A0B;
            if (view3 != null) {
                view3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                viewGroup.setBackgroundResource(C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved));
                if (this.A0B.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.A0B.getParent()).removeView(this.A0B);
                }
                viewGroup.addView(this.A0B);
                View view4 = this.A0B;
                if (view4 instanceof AnonymousClass00N) {
                    this.A06.A04((AnonymousClass00N) view4);
                }
            }
        }
    }

    public Point BAC() {
        View findViewById;
        Point point = this.A03;
        if (point != null) {
            return point;
        }
        View view = this.A04;
        if (!(view == null || (findViewById = view.findViewById(this.A00)) == null)) {
            this.A03 = new Point(findViewById.getWidth(), findViewById.getHeight());
        }
        return this.A03;
    }

    public void BNy(Intent intent) {
        if (this.A07.A09()) {
            AnonymousClass3A7 r7 = this.A0C;
            if (r7 == null) {
                r7 = new AnonymousClass3A7(this.A07, TimeUnit.MILLISECONDS);
                this.A0C = r7;
            }
            r7.A01 = new C81963xv(intent, this);
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = r7.A00;
            long j2 = r7.A02;
            if (uptimeMillis - j < j2) {
                r7.A03.removeCallbacks(r7.A04);
            } else if (SystemClock.uptimeMillis() - j > 3000) {
                r7.A03.post(r7.A04);
                r7.A00 = SystemClock.uptimeMillis();
                return;
            }
            r7.A03.postDelayed(r7.A04, j2);
            r7.A00 = SystemClock.uptimeMillis();
            return;
        }
        startActivity(intent);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        AnonymousClass1JL r1 = this.A07;
        if (r1.A0C()) {
            for (AnonymousClass3L8 A022 : r1.getObservers()) {
                A022.A02();
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void A26() {
        C43472Ht r0;
        if (A3i() != null && (r0 = A3i().A02) != null) {
            r0.A01.A00();
        }
    }

    public void A2L() {
        C43472Ht r0;
        if (A3i() != null && (r0 = A3i().A02) != null) {
            r0.A04.A1v();
        }
    }

    public void A2x(int i) {
        C43472Ht r0;
        if (A3i() != null && (r0 = A3i().A02) != null) {
            C70803fk r1 = r0.A04;
            C39441sH r02 = r1.A1k;
            if (r02 != null) {
                r02.A00.A00();
            }
            C167497y9 r03 = r1.A1r;
            if (r03 != null) {
                r03.A0T();
            }
        }
    }

    public void A3O() {
        if (A3i() != null) {
            A3j();
            A3m();
            this.A07.A07(false);
            return;
        }
        super.A3O();
    }

    public ConversationFragment A3i() {
        return (ConversationFragment) getSupportFragmentManager().A0N("com.whatsapp.HomeActivity.ConversationFragment");
    }

    public void A3j() {
        AnonymousClass02E A0N;
        AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
        if (!isFinishing() && !supportFragmentManager.A0E && !supportFragmentManager.A0r() && (A0N = supportFragmentManager.A0N("com.whatsapp.HomeActivity.ConversationFragment")) != null) {
            AnonymousClass09Y r0 = new AnonymousClass09Y(supportFragmentManager);
            r0.A08(A0N);
            r0.A03();
        }
    }

    public void B0n(AnonymousClass141 r2, AnonymousClass11F r3) {
        if (A3i() != null) {
            A3i().B0n(r2, r3);
        }
    }

    public void BQs(long j, boolean z) {
        if (A3i() != null) {
            A3i().BQs(j, z);
        }
    }

    public void BRT() {
        if (A3i() != null) {
            A3i().BRT();
        }
    }

    public boolean BUQ(AnonymousClass11F r2, int i) {
        C43472Ht r0;
        if (A3i() == null || (r0 = A3i().A02) == null) {
            return true;
        }
        return r0.A04.A2f(r2, i);
    }

    public void BUu(long j, boolean z) {
        if (A3i() != null) {
            A3i().BUu(j, z);
        }
    }

    public void Bch(PickerSearchDialogFragment pickerSearchDialogFragment) {
        if (A3i() != null) {
            A3i().Bch(pickerSearchDialogFragment);
        }
    }

    public void Bih(AnonymousClass0V9 r3) {
        C43472Ht r1;
        super.Bih(r3);
        if (A3i() != null && (r1 = A3i().A02) != null) {
            r1.A00.A09();
            AnonymousClass1Q8 r0 = (AnonymousClass1Q8) r1.A04.A2F;
            r0.A02 = false;
            C88814Ud r02 = r0.A00;
            if (r02 != null) {
                r02.setShouldHideBanner(false);
            }
        }
    }

    public void Bii(AnonymousClass0V9 r3) {
        C43472Ht r1;
        super.Bii(r3);
        if (A3i() != null && (r1 = A3i().A02) != null) {
            r1.A00.A0A();
            AnonymousClass1Q8 r0 = (AnonymousClass1Q8) r1.A04.A2F;
            r0.A02 = true;
            C88814Ud r02 = r0.A00;
            if (r02 != null) {
                r02.setShouldHideBanner(true);
            }
        }
    }

    public void BkD() {
        if (A3i() != null) {
            A3i().BkD();
        }
    }

    public void Btk(DialogFragment dialogFragment) {
        if (A3i() != null) {
            A3i().Btk(dialogFragment);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (A3i() != null) {
            A3i().A1N(i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (A3i() != null) {
            C43472Ht r0 = A3i().A02;
            if (r0 != null) {
                r0.A04.A1s();
                return;
            }
            return;
        }
        super.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A07.A04(this);
        boolean A092 = this.A07.A09();
        int i = configuration.screenWidthDp;
        if (i != this.A02) {
            this.A02 = i;
            if (A092 != this.A08) {
                this.A08 = A092;
                if (A092) {
                    A3l();
                } else {
                    Intent intent = null;
                    AnonymousClass02E A0N = getSupportFragmentManager().A0N("com.whatsapp.HomeActivity.ConversationFragment");
                    if (A0N != null && A0N.A15()) {
                        Intent intent2 = getIntent();
                        AnonymousClass00C.A0D(intent2, 1);
                        intent = AnonymousClass190.A0F(this, 0);
                        AnonymousClass00C.A08(intent);
                        intent.setData(intent2.getData());
                        intent.putExtras(intent2);
                    }
                    this.A03 = null;
                    View view = this.A04;
                    if (view != null) {
                        View findViewById = view.findViewById(this.A00);
                        if (findViewById != null) {
                            A3j();
                            A3k();
                            this.A07.A07(true);
                            findViewById.setVisibility(8);
                        }
                        A07(this);
                    }
                    if (intent != null) {
                        startActivity(intent);
                    }
                }
            }
        }
        if (this.A08) {
            A01();
        }
    }

    public void onContentChanged() {
        C43472Ht r0;
        super.onContentChanged();
        if (A3i() != null && (r0 = A3i().A02) != null) {
            AnonymousClass22h.A00(r0);
            r0.A01.A00();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0A = getIntent();
    }

    public Dialog onCreateDialog(int i) {
        if (A3i() == null) {
            return super.onCreateDialog(i);
        }
        return A3i().A02.A04.A1j(i);
    }

    public void onDestroy() {
        super.onDestroy();
        Intent intent = this.A0A;
        if (intent != null) {
            setIntent(intent);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (A3i() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        C43472Ht r0 = A3i().A02;
        if (r0 != null) {
            return r0.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (A3i() == null) {
            return super.onKeyUp(i, keyEvent);
        }
        C43472Ht r0 = A3i().A02;
        if (r0 != null) {
            return r0.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public void onProvideAssistContent(AssistContent assistContent) {
        super.onProvideAssistContent(assistContent);
        if (A3i() != null) {
            A3i().A1Z(assistContent);
        }
    }

    public void onRestart() {
        C43472Ht r0;
        if (!(A3i() == null || (r0 = A3i().A02) == null)) {
            r0.A04.A1x();
        }
        super.onRestart();
    }

    public void onResume() {
        boolean z;
        View findViewById;
        super.onResume();
        if (this.A07.A0B()) {
            boolean z2 = this.A0A.A01.getBoolean("otp_split_mode_user_choice", true);
            boolean z3 = true;
            if (this.A09) {
                z = true;
            } else {
                View view = this.A04;
                z = false;
                if (!(view == null || (findViewById = view.findViewById(this.A00)) == null)) {
                    if (findViewById.getVisibility() != 0) {
                        z3 = false;
                    }
                    z = z3;
                }
            }
            if (z2 != z) {
                Intent A032 = AnonymousClass190.A03(this);
                A032.addFlags(268468224);
                startActivity(A032);
                overridePendingTransition(R.anim.f1nameremoved, R.anim.f1nameremoved);
            }
        }
    }

    public void onStart() {
        super.onStart();
        this.A07.A05(this, this.A0D);
    }

    public void onStop() {
        super.onStop();
        this.A07.A06(this.A0D);
    }
}
