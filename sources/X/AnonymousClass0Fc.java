package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.0Fc  reason: invalid class name */
public final class AnonymousClass0Fc extends C09450cO implements AnonymousClass07X, PopupWindow.OnDismissListener, View.OnKeyListener, AdapterView.OnItemClickListener {
    public int A00;
    public int A01 = 0;
    public View A02;
    public View A03;
    public ViewTreeObserver A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public PopupWindow.OnDismissListener A08;
    public C16990qX A09;
    public final int A0A;
    public final Context A0B;
    public final View.OnAttachStateChangeListener A0C = new C18320sy(this, 1);
    public final ViewTreeObserver.OnGlobalLayoutListener A0D = new C18560tM(this, 1);
    public final C03340Ee A0E;
    public final C016307a A0F;
    public final AnonymousClass0G1 A0G;
    public final int A0H;
    public final int A0I;
    public final boolean A0J;

    public void A07(C016307a r1) {
    }

    public boolean B7R() {
        return false;
    }

    public void Bf3(Parcelable parcelable) {
    }

    public Parcelable Bfg() {
        return null;
    }

    public boolean Bhy(AnonymousClass0FZ r14) {
        AnonymousClass0FZ r9 = r14;
        if (r14.hasVisibleItems()) {
            C06710Ut r6 = new C06710Ut(this.A0B, this.A03, r9, this.A0H, this.A0I, this.A0J);
            C16990qX r1 = this.A09;
            r6.A04 = r1;
            C09450cO r0 = r6.A03;
            if (r0 != null) {
                r0.BqL(r1);
            }
            int size = r14.size();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MenuItem item = r14.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            r6.A05 = z;
            C09450cO r02 = r6.A03;
            if (r02 != null) {
                r02.A08(z);
            }
            r6.A02 = this.A08;
            this.A08 = null;
            this.A0F.A0F(false);
            AnonymousClass0G1 r03 = this.A0G;
            int i2 = r03.A01;
            int BJ0 = r03.BJ0();
            if ((Gravity.getAbsoluteGravity(this.A01, AnonymousClass04F.A01(this.A02)) & 7) == 5) {
                i2 += this.A02.getWidth();
            }
            C09450cO r04 = r6.A03;
            if (r04 == null || !r04.BNH()) {
                if (r6.A01 != null) {
                    C09450cO A002 = r6.A00();
                    A002.A09(true);
                    if ((Gravity.getAbsoluteGravity(r6.A00, AnonymousClass04F.A01(r6.A01)) & 7) == 5) {
                        i2 -= r6.A01.getWidth();
                    }
                    A002.A03(i2);
                    A002.A04(BJ0);
                    int i3 = (int) ((AnonymousClass000.A0X(r6.A08).density * 48.0f) / 2.0f);
                    A002.A00 = new Rect(i2 - i3, BJ0 - i3, i2 + i3, BJ0 + i3);
                    A002.Btc();
                }
            }
            C16990qX r05 = this.A09;
            if (r05 == null) {
                return true;
            }
            r05.Bbv(r14);
            return true;
        }
        return false;
    }

    public void Bwl(boolean z) {
        this.A05 = false;
        C03340Ee r0 = this.A0E;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    public void onDismiss() {
        this.A07 = true;
        this.A0F.close();
        ViewTreeObserver viewTreeObserver = this.A04;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A04 = this.A03.getViewTreeObserver();
            }
            this.A04.removeGlobalOnLayoutListener(this.A0D);
            this.A04 = null;
        }
        this.A03.removeOnAttachStateChangeListener(this.A0C);
        PopupWindow.OnDismissListener onDismissListener = this.A08;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void A03(int i) {
        this.A0G.A01 = i;
    }

    public void A04(int i) {
        this.A0G.Bsg(i);
    }

    public void A08(boolean z) {
        this.A0E.A01 = z;
    }

    public AnonymousClass0F6 BDZ() {
        return this.A0G.A0B;
    }

    public boolean BNH() {
        if (this.A07 || !this.A0G.A0A.isShowing()) {
            return false;
        }
        return true;
    }

    public void BTt(C016307a r2, boolean z) {
        if (r2 == this.A0F) {
            dismiss();
            C16990qX r0 = this.A09;
            if (r0 != null) {
                r0.BTt(r2, z);
            }
        }
    }

    public AnonymousClass0Fc(Context context, View view, C016307a r6, int i, int i2, boolean z) {
        this.A0B = context;
        this.A0F = r6;
        this.A0J = z;
        this.A0E = new C03340Ee(LayoutInflater.from(context), r6, R.layout.f9nameremoved, z);
        this.A0H = i;
        this.A0I = i2;
        Resources resources = context.getResources();
        this.A0A = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.f7nameremoved));
        this.A02 = view;
        this.A0G = new AnonymousClass0G1(context, i, i2);
        r6.A08(context, this);
    }

    public void Btc() {
        View view;
        Rect rect;
        if (BNH()) {
            return;
        }
        if (this.A07 || (view = this.A02) == null) {
            throw AnonymousClass001.A09("StandardMenuPopup cannot be used without an anchor");
        }
        this.A03 = view;
        AnonymousClass0G1 r6 = this.A0G;
        PopupWindow popupWindow = r6.A0A;
        popupWindow.setOnDismissListener(this);
        r6.A07 = this;
        r6.A0F = true;
        popupWindow.setFocusable(true);
        View view2 = this.A03;
        boolean A1W = AnonymousClass000.A1W(this.A04);
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.A04 = viewTreeObserver;
        if (A1W) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0D);
        }
        view2.addOnAttachStateChangeListener(this.A0C);
        r6.A06 = view2;
        r6.A00 = this.A01;
        if (!this.A05) {
            this.A00 = C09450cO.A01(this.A0B, this.A0E, this.A0A);
            this.A05 = true;
        }
        r6.A03(this.A00);
        popupWindow.setInputMethodMode(2);
        Rect rect2 = this.A00;
        if (rect2 != null) {
            rect = new Rect(rect2);
        } else {
            rect = null;
        }
        r6.A05 = rect;
        r6.Btc();
        AnonymousClass0F6 r4 = r6.A0B;
        r4.setOnKeyListener(this);
        if (this.A06) {
            C016307a r3 = this.A0F;
            if (r3.A05 != null) {
                View inflate = LayoutInflater.from(this.A0B).inflate(R.layout.f9nameremoved, r4, false);
                TextView textView = (TextView) inflate.findViewById(16908310);
                if (textView != null) {
                    textView.setText(r3.A05);
                }
                inflate.setEnabled(false);
                r4.addHeaderView(inflate, (Object) null, false);
            }
        }
        r6.Bq4(this.A0E);
        r6.Btc();
    }

    public void dismiss() {
        if (BNH()) {
            this.A0G.dismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void A02(int i) {
        this.A01 = i;
    }

    public void A05(View view) {
        this.A02 = view;
    }

    public void A06(PopupWindow.OnDismissListener onDismissListener) {
        this.A08 = onDismissListener;
    }

    public void A09(boolean z) {
        this.A06 = z;
    }

    public void BqL(C16990qX r1) {
        this.A09 = r1;
    }
}
