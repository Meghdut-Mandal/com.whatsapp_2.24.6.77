package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass0CP;
import X.AnonymousClass171;
import X.AnonymousClass1JZ;
import X.AnonymousClass3UF;
import X.AnonymousClass4UZ;
import X.C012005e;
import X.C1501574e;
import X.C18820ts;
import X.C224514j;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36421kH;
import X.C36441kJ;
import X.C38921qU;
import X.C40561vk;
import X.C42741zP;
import X.C66043Ul;
import X.C66093Uq;
import X.C89134Vj;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.calling.callhistory.group.GroupCallSelectedContactsList;
import com.whatsapp.filter.SmoothScrollLinearLayoutManager;
import java.util.List;

public class SelectedContactsList extends C38921qU {
    public int A00;
    public int A01;
    public AnimatorSet A02;
    public ValueAnimator A03;
    public View A04;
    public RecyclerView A05;
    public AnonymousClass171 A06;
    public C40561vk A07;
    public AnonymousClass4UZ A08;
    public List A09;

    public SelectedContactsList(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getSelectedContactsListLeftPadding() {
        return 0;
    }

    public void A02() {
        AnonymousClass0CP layoutManager;
        RecyclerView recyclerView = this.A05;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            int A0L = layoutManager.A0L();
            View A0R = recyclerView.getLayoutManager().A0R(0);
            if (A0L != 0 && A0R != null) {
                int width = recyclerView.getWidth();
                ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(A0R);
                int width2 = A0R.getWidth() + A0a.leftMargin + A0a.rightMargin;
                int paddingRight = recyclerView.getPaddingRight();
                if (A0L < this.A09.size()) {
                    int i = A0L * width2;
                    if (paddingRight == 0 && width >= i - A0a.leftMargin && width <= i + A0a.rightMargin) {
                        setSelectedContactsListRightPadding(width2 / 2);
                    }
                } else if (paddingRight > 0) {
                    setSelectedContactsListRightPadding(0);
                }
            }
        }
    }

    public void A03(Animator animator) {
        this.A02.play(animator);
        this.A02.start();
    }

    public void setSelectedContactsListRightPadding(int i) {
        RecyclerView recyclerView = this.A05;
        C36381kD.A19(recyclerView, recyclerView.getPaddingLeft(), i);
    }

    public static void A00(View view, View view2, SelectedContactsList selectedContactsList, boolean z) {
        int i;
        selectedContactsList.A02 = C36441kJ.A0C();
        if (z) {
            selectedContactsList.A08.Bx9();
        }
        ValueAnimator valueAnimator = selectedContactsList.A03;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            selectedContactsList.A03.end();
        }
        int[] A1O = C36441kJ.A1O();
        if (!z || view2.getVisibility() != 8) {
            i = 0;
        } else {
            i = view2.getMeasuredHeight();
        }
        A1O[0] = i;
        A1O[1] = selectedContactsList.A01;
        ValueAnimator ofInt = ValueAnimator.ofInt(A1O);
        ofInt.addUpdateListener(new C66093Uq(view));
        ofInt.addListener(new C66043Ul(selectedContactsList));
        ofInt.setDuration(240);
        selectedContactsList.A03(ofInt);
    }

    public int getSelectedContactsLayout() {
        return R.layout.f9nameremoved;
    }

    public int getSelectedContactsLayoutHeight() {
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public void setCallback(AnonymousClass4UZ r1) {
        this.A08 = r1;
    }

    public void setSelectedContacts(List list) {
        this.A09 = list;
    }

    public SelectedContactsList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A04 = C012005e.A02(this, R.id.selected_items_divider);
        RecyclerView recyclerView = (RecyclerView) C012005e.A02(this, R.id.selected_items);
        this.A05 = recyclerView;
        C36421kH.A0y(this.A05, recyclerView, getSelectedContactsListLeftPadding(), this.A05.getPaddingTop(), this.A05.getPaddingRight());
        boolean z = this instanceof GroupCallSelectedContactsList;
        if (z) {
            GroupCallSelectedContactsList groupCallSelectedContactsList = (GroupCallSelectedContactsList) this;
            RecyclerView recyclerView2 = groupCallSelectedContactsList.A05;
            ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(recyclerView2);
            int dimensionPixelSize = groupCallSelectedContactsList.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            if (C36351kA.A1Y(groupCallSelectedContactsList.A02)) {
                A0a.rightMargin = dimensionPixelSize;
            } else {
                A0a.leftMargin = dimensionPixelSize;
            }
            recyclerView2.setLayoutParams(A0a);
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A05.A0t(new C89134Vj(this, dimensionPixelSize2, 1));
        SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager = new SmoothScrollLinearLayoutManager(0);
        smoothScrollLinearLayoutManager.A1f(0);
        this.A05.setLayoutManager(smoothScrollLinearLayoutManager);
        this.A05.setItemAnimator(new C42741zP());
        int selectedContactsLayoutHeight = getSelectedContactsLayoutHeight();
        this.A01 = selectedContactsLayoutHeight;
        setLayoutParams(new RelativeLayout.LayoutParams(-1, selectedContactsLayoutHeight));
        setVisibility(4);
        C40561vk r1 = new C40561vk(this.A06, this);
        this.A07 = r1;
        this.A05.setAdapter(r1);
        if (z) {
            GroupCallSelectedContactsList groupCallSelectedContactsList2 = (GroupCallSelectedContactsList) this;
            groupCallSelectedContactsList2.A00 = (WaImageButton) C012005e.A02(groupCallSelectedContactsList2, R.id.selected_list_action_fab_1);
            groupCallSelectedContactsList2.A01 = (WaImageButton) C012005e.A02(groupCallSelectedContactsList2, R.id.selected_list_action_fab_2);
            groupCallSelectedContactsList2.A00.setVisibility(0);
            groupCallSelectedContactsList2.A01.setVisibility(0);
            AnonymousClass3UF.A0B(context, groupCallSelectedContactsList2.A00, R.drawable.ic_groupcall_voice, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved));
            AnonymousClass3UF.A0B(context, groupCallSelectedContactsList2.A01, R.drawable.ic_groupcall_video, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved));
            groupCallSelectedContactsList2.A00.setContentDescription(groupCallSelectedContactsList2.getResources().getString(R.string.f12nameremoved));
            groupCallSelectedContactsList2.A01.setContentDescription(groupCallSelectedContactsList2.getResources().getString(R.string.f12nameremoved));
            C36361kB.A17(groupCallSelectedContactsList2.A00, groupCallSelectedContactsList2, 38);
            C36361kB.A17(groupCallSelectedContactsList2.A01, groupCallSelectedContactsList2, 39);
            C18820ts r6 = groupCallSelectedContactsList2.A02;
            WaImageButton waImageButton = groupCallSelectedContactsList2.A00;
            int i2 = -groupCallSelectedContactsList2.A00;
            int i3 = dimensionPixelSize2;
            AnonymousClass1JZ.A06(waImageButton, r6, 0, dimensionPixelSize2, i2, i3);
            AnonymousClass1JZ.A06(groupCallSelectedContactsList2.A01, groupCallSelectedContactsList2.A02, 0, dimensionPixelSize2, i2, i3);
            groupCallSelectedContactsList2.A05.postDelayed(new C1501574e(groupCallSelectedContactsList2, 12), 200);
        }
    }

    public SelectedContactsList(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
