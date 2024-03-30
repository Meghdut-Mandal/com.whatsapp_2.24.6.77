package com.whatsapp.calling.callhistory.group;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00E;
import X.AnonymousClass0XL;
import X.AnonymousClass22g;
import X.AnonymousClass3UF;
import X.C011504z;
import X.C02460Ak;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import X.C36911lV;
import X.C48892iE;
import X.C53842ry;
import X.C53912s6;
import X.C89194Vp;
import X.C89314Wb;
import X.C90104Zc;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class GroupCallParticipantPickerSheet extends GroupCallParticipantPicker {
    public float A00;
    public float A01;
    public ColorDrawable A02;
    public View A03;
    public View A04;
    public BottomSheetBehavior A05;
    public boolean A06;
    public View A07;
    public SearchView A08;
    public boolean A09;
    public final ViewTreeObserver.OnGlobalLayoutListener A0A;

    private void A0w() {
        int size;
        Point point = new Point();
        C36321k7.A0K(this, point);
        Rect A062 = AnonymousClass001.A06();
        C36361kB.A0C(this).getWindowVisibleDisplayFrame(A062);
        float f = (float) (point.y - A062.top);
        this.A01 = f;
        this.A00 = (float) ((int) (f * 0.75f));
        AccessibilityManager A0M = this.A08.A0M();
        if (A0M == null || !A0M.isTouchExplorationEnabled()) {
            int i = (int) (this.A01 * 0.55f);
            int A063 = C36441kJ.A06(getResources(), R.dimen.f7nameremoved, C36361kB.A02(this, R.dimen.f7nameremoved));
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            int i2 = i + ((dimensionPixelSize / 2) - ((i - A063) % dimensionPixelSize));
            ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("jids");
            if (stringArrayListExtra != null && (size = stringArrayListExtra.size()) > 0) {
                i2 = Math.min(i2, A063 + this.A0E.getSelectedContactsLayoutHeight() + (dimensionPixelSize * size));
            }
            this.A05.A0V(i2);
        }
    }

    public static void A0x(GroupCallParticipantPickerSheet groupCallParticipantPickerSheet) {
        groupCallParticipantPickerSheet.A08.A0I("");
        C02460Ak r1 = (C02460Ak) groupCallParticipantPickerSheet.A03.getLayoutParams();
        r1.A00(groupCallParticipantPickerSheet.A05);
        r1.height = (int) groupCallParticipantPickerSheet.A00;
        groupCallParticipantPickerSheet.A03.setLayoutParams(r1);
        groupCallParticipantPickerSheet.A07.setVisibility(0);
        groupCallParticipantPickerSheet.A04.setVisibility(8);
    }

    public static void A0z(GroupCallParticipantPickerSheet groupCallParticipantPickerSheet) {
        C02460Ak r1 = (C02460Ak) groupCallParticipantPickerSheet.A03.getLayoutParams();
        r1.A00((AnonymousClass0XL) null);
        r1.height = -1;
        groupCallParticipantPickerSheet.A03.setLayoutParams(r1);
        groupCallParticipantPickerSheet.A08.A0E();
        groupCallParticipantPickerSheet.A07.setVisibility(8);
        groupCallParticipantPickerSheet.A04.setVisibility(0);
    }

    public void A2F() {
        if (!this.A09) {
            this.A09 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            AnonymousClass22g.A0l(this);
            AnonymousClass22g.A0h(r2, r1, this);
            AnonymousClass22g.A0L(A0L, r2, this);
            AnonymousClass22g.A0O(r2, r1, this);
        }
    }

    public void onBackPressed() {
        if (this.A04.getVisibility() == 0) {
            A0x(this);
        } else {
            this.A05.A0W(5);
        }
    }

    public GroupCallParticipantPickerSheet(int i) {
        this.A09 = false;
        C89314Wb.A00(this, 38);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0w();
        if (this.A04.getVisibility() != 0) {
            ViewGroup.LayoutParams layoutParams = this.A03.getLayoutParams();
            layoutParams.height = (int) this.A00;
            this.A03.setLayoutParams(layoutParams);
        }
        this.A06 = true;
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A0A);
        this.A03.requestLayout();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int A092 = C36391kE.A09(this, R.id.action_bar);
        C36331k8.A0l(this);
        View findViewById = findViewById(R.id.bottom_sheet);
        this.A03 = findViewById;
        this.A05 = BottomSheetBehavior.A02(findViewById);
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A0A);
        this.A05.A0d(true);
        this.A05.A0W(5);
        A0w();
        ViewGroup.LayoutParams layoutParams = this.A03.getLayoutParams();
        layoutParams.height = (int) this.A00;
        this.A03.setLayoutParams(layoutParams);
        getListView().setNestedScrollingEnabled(true);
        View findViewById2 = findViewById(R.id.background);
        C011504z.A06(findViewById2, 2);
        PointF pointF = new PointF();
        C36411kG.A1C(findViewById2, this, pointF, 44);
        C53912s6.A00(findViewById2, pointF, 0);
        ColorDrawable colorDrawable = new ColorDrawable();
        this.A02 = colorDrawable;
        C011504z.A04(colorDrawable, findViewById2);
        AlphaAnimation A0D = C36351kA.A0D();
        C36421kH.A0p(getResources(), A0D, 17694720);
        findViewById2.startAnimation(A0D);
        C89194Vp.A00(this.A05, this, 2);
        this.A07 = findViewById(R.id.title_holder);
        View findViewById3 = findViewById(R.id.search_holder_sheet);
        this.A04 = findViewById3;
        findViewById3.setBackgroundResource(R.drawable.search_background);
        this.A04.setVisibility(A092);
        SearchView searchView = (SearchView) this.A04.findViewById(R.id.search_view);
        this.A08 = searchView;
        searchView.setIconifiedByDefault(false);
        this.A08.setQueryHint(getString(R.string.f12nameremoved));
        C36391kE.A0N(this.A08, R.id.search_mag_icon).setImageDrawable(new C36911lV(AnonymousClass00E.A00(this, R.drawable.ic_back), this));
        this.A08.A06 = new C53842ry(this, 1);
        ImageView A0N = C36391kE.A0N(this.A04, R.id.search_back);
        C36361kB.A13(AnonymousClass3UF.A06(getResources(), getResources().getDrawable(R.drawable.ic_back), R.color.f6nameremoved), A0N, this.A0I);
        C48892iE.A00(A0N, this, 19);
        C36361kB.A17(findViewById(R.id.search_btn), this, 37);
        ArrayList A0u = C36401kF.A0u(getIntent(), UserJid.class, "jids");
        TextView A0Q = C36391kE.A0Q(this, R.id.sheet_title);
        int size = A0u.size();
        int i = R.string.f12nameremoved;
        if (size == 1) {
            i = R.string.f12nameremoved;
        }
        A0Q.setText(i);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean("search")) {
            A0z(this);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("search", AnonymousClass000.A1Q(this.A04.getVisibility()));
    }

    public GroupCallParticipantPickerSheet() {
        this(0);
        this.A0A = new C90104Zc(this, 4);
    }
}
