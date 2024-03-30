package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass001;
import X.AnonymousClass012;
import X.AnonymousClass171;
import X.AnonymousClass1QZ;
import X.C129066Eu;
import X.C165167sz;
import X.C18700tb;
import X.C27851Qb;
import X.C27861Qc;
import X.C36341k9;
import X.C36401kF;
import X.C36441kJ;
import X.C48892iE;
import X.C90514aH;
import X.C96104mn;
import X.C97034oI;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.jid.UserJid;

public class FocusViewContainer extends ConstraintLayout implements C18700tb {
    public Rect A00;
    public FrameLayout A01;
    public LinearLayout A02;
    public WaTextView A03;
    public C96104mn A04;
    public C97034oI A05;
    public MenuBottomSheetViewModel A06;
    public AnonymousClass171 A07;
    public AnonymousClass1QZ A08;
    public boolean A09;
    public boolean A0A;

    public static void A00(FocusViewContainer focusViewContainer) {
        FrameLayout frameLayout = focusViewContainer.A01;
        frameLayout.setScaleX(1.0f);
        frameLayout.setScaleY(1.0f);
        frameLayout.setTranslationX(0.0f);
        frameLayout.setTranslationY(0.0f);
        focusViewContainer.A03.animate().alpha(1.0f);
        focusViewContainer.A02.animate().alpha(1.0f);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A08;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A00.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    public void setMenuViewModel(AnonymousClass012 r3, MenuBottomSheetViewModel menuBottomSheetViewModel) {
        this.A06 = menuBottomSheetViewModel;
        C165167sz.A00(r3, menuBottomSheetViewModel.A03, this, 34);
    }

    public FocusViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A09) {
            this.A09 = true;
            C27861Qc r1 = (C27861Qc) ((C27851Qb) generatedComponent());
            this.A04 = (C96104mn) r1.A0L.A3c.get();
            this.A07 = C36341k9.A0S(r1.A0M);
        }
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        this.A03 = C36401kF.A0Q(this, R.id.participant_name);
        this.A01 = C36441kJ.A0T(this, R.id.participant_view_container);
        this.A02 = C90514aH.A0U(this, R.id.menu_list_layout);
        setOnClickListener(new C48892iE(this, 18));
        this.A00 = AnonymousClass001.A06();
    }

    public C97034oI getFocusViewHolder() {
        return this.A05;
    }

    public UserJid getVisiblePeerJid() {
        C97034oI r1;
        if (getVisibility() != 0 || (r1 = this.A05) == null || !r1.A0A()) {
            return null;
        }
        C129066Eu r12 = r1.A05;
        if (!r12.A0J) {
            return r12.A0b;
        }
        return null;
    }

    public FocusViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FocusViewContainer(Context context) {
        this(context, (AttributeSet) null);
    }
}
