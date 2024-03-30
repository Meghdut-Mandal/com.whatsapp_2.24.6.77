package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass3Y8;
import X.AnonymousClass3ZW;
import X.AnonymousClass4VL;
import X.AnonymousClass4XY;
import X.C03570Gk;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C47212e0;
import X.C47262eC;
import X.C89364Wg;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.CheckBox;
import com.whatsapp.R;
import com.whatsapp.collections.MarginCorrectedViewPager;

public class SolidColorWallpaperPreview extends C47212e0 {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public CheckBox A08;
    public MarginCorrectedViewPager A09;
    public boolean A0A;
    public int[] A0B;
    public int[] A0C;
    public boolean A0D;
    public boolean A0E;

    public void onBackPressed() {
        setResult(0, (Intent) null);
        A07(this, this.A09.getCurrentItem());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05 = C03570Gk.A0B(this, R.id.container);
        this.A04 = C03570Gk.A0B(this, R.id.appbar);
        this.A07 = C03570Gk.A0B(this, R.id.transition_view);
        int[] intArray = getResources().getIntArray(R.array.f3nameremoved);
        int length = intArray.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = i;
        }
        Pair A0Q = C36441kJ.A0Q(intArray, iArr);
        this.A0B = (int[]) A0Q.first;
        this.A0C = (int[]) A0Q.second;
        MarginCorrectedViewPager marginCorrectedViewPager = (MarginCorrectedViewPager) C03570Gk.A0B(this, R.id.wallpaper_preview);
        this.A09 = marginCorrectedViewPager;
        marginCorrectedViewPager.setSaveEnabled(false);
        CheckBox checkBox = (CheckBox) C03570Gk.A0B(this, R.id.color_wallpaper_add_doodles);
        this.A08 = checkBox;
        checkBox.setVisibility(0);
        this.A08.setText(R.string.f12nameremoved);
        C47262eC r3 = new C47262eC(this, this);
        r3.A00 = this.A08.isChecked();
        AnonymousClass4XY.A00(this.A08, r3, 21);
        this.A09.setAdapter(r3);
        this.A09.setPageMargin((int) (C36341k9.A00(this) * 15.0f));
        View A0B2 = C03570Gk.A0B(this, R.id.control_holder);
        this.A06 = A0B2;
        A0B2.setBackground(C36381kD.A0H(this, R.drawable.wallpaper_color_confirmation_background));
        AnonymousClass3Y8.A00(C03570Gk.A0B(this, R.id.cancel_button), this, 38);
        A01(getIntent().getIntExtra("scw_preview_color", 0));
        this.A0A = false;
        boolean booleanExtra = getIntent().getBooleanExtra("wallpaper_preview_intent_extra_animate", false);
        this.A0D = booleanExtra;
        if (booleanExtra) {
            overridePendingTransition(0, 0);
            Intent intent = getIntent();
            this.A0A = true;
            this.A09.setScrollEnabled(false);
            this.A07.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass3ZW(this, intent.getIntExtra("wallpaper_preview_intent_extra_x", 0), intent.getIntExtra("wallpaper_preview_intent_extra_y", 0), intent.getIntExtra("wallpaper_preview_intent_extra_width", 0), intent.getIntExtra("wallpaper_preview_intent_extra_height", 0)));
        }
    }

    public static void A07(SolidColorWallpaperPreview solidColorWallpaperPreview, int i) {
        int i2;
        int i3;
        if (solidColorWallpaperPreview.A0D) {
            solidColorWallpaperPreview.A0A = true;
            solidColorWallpaperPreview.A09.setScrollEnabled(false);
            DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
            if (i != solidColorWallpaperPreview.getIntent().getIntExtra("scw_preview_color", -1)) {
                solidColorWallpaperPreview.A02 = 0;
                solidColorWallpaperPreview.A03 = 0;
                i2 = solidColorWallpaperPreview.A09.getWidth() / 2;
                i3 = solidColorWallpaperPreview.A09.getWidth() / 2;
            } else {
                i2 = 0;
                i3 = 0;
            }
            solidColorWallpaperPreview.A09.setPivotX((float) i2);
            solidColorWallpaperPreview.A09.setPivotY((float) i3);
            solidColorWallpaperPreview.A05.setBackgroundColor(0);
            solidColorWallpaperPreview.A09.animate().setDuration(250).alpha(0.0f).scaleX(solidColorWallpaperPreview.A00).scaleY(solidColorWallpaperPreview.A01).translationX((float) solidColorWallpaperPreview.A02).translationY((float) solidColorWallpaperPreview.A03).setInterpolator(decelerateInterpolator).setListener(new AnonymousClass4VL(solidColorWallpaperPreview, 19));
            C36431kI.A0L(solidColorWallpaperPreview.A04, 250).alpha(0.0f).setInterpolator(decelerateInterpolator);
            C36431kI.A0L(solidColorWallpaperPreview.A06, 250).alpha(0.0f).setInterpolator(decelerateInterpolator);
            return;
        }
        solidColorWallpaperPreview.finish();
    }

    public void A2F() {
        if (!this.A0E) {
            this.A0E = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A01 = C36341k9.A0R(A0B2);
            this.A02 = C36341k9.A0S(A0B2);
        }
    }

    public SolidColorWallpaperPreview(int i) {
        this.A0E = false;
        C89364Wg.A00(this, 39);
    }

    private void A01(int i) {
        int i2 = getResources().getIntArray(R.array.f3nameremoved)[i];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.A0B;
            if (i4 >= iArr.length) {
                break;
            } else if (iArr[i4] == i2) {
                i3 = i4;
                break;
            } else {
                i4++;
            }
        }
        this.A09.setCurrentItem(i3);
    }

    public void finish() {
        super.finish();
        if (this.A0D && this.A0A) {
            overridePendingTransition(0, 0);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0, (Intent) null);
        A07(this, this.A09.getCurrentItem());
        return true;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        A01(bundle.getInt("selected_index"));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_index", this.A0C[this.A09.getCurrentItem()]);
    }

    public SolidColorWallpaperPreview() {
        this(0);
        this.A0A = false;
        this.A0D = false;
    }
}
