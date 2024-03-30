package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass04H;
import X.AnonymousClass11F;
import X.AnonymousClass155;
import X.AnonymousClass15D;
import X.AnonymousClass1AP;
import X.AnonymousClass1BB;
import X.AnonymousClass2M8;
import X.AnonymousClass2MC;
import X.AnonymousClass3GT;
import X.AnonymousClass3HG;
import X.AnonymousClass3HH;
import X.AnonymousClass3UF;
import X.AnonymousClass3UW;
import X.AnonymousClass3ZQ;
import X.AnonymousClass4ZG;
import X.C03570Gk;
import X.C100744vb;
import X.C125405zr;
import X.C133356Xz;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C19770wU;
import X.C27751Pr;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C39541sc;
import X.C39691tK;
import X.C40671vv;
import X.C49922ju;
import X.C53212qx;
import X.C66023Uj;
import X.C68463bw;
import X.C68743cO;
import X.C74263lK;
import X.C78033rS;
import X.C78043rT;
import X.C78053rU;
import X.C88234Rx;
import X.C88314Sf;
import X.C89194Vp;
import X.C89334Wd;
import X.C90104Zc;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import com.whatsapp.gifsearch.GifSearchContainer;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import java.util.Map;

public class GroupProfileEmojiEditor extends AnonymousClass155 implements AnonymousClass15D {
    public static final Map A0N = new C53212qx(1);
    public Bitmap A00;
    public View A01;
    public View A02;
    public ImageView A03;
    public ImageView A04;
    public BottomSheetBehavior A05;
    public KeyboardPopupLayout A06;
    public AnonymousClass3HG A07;
    public C27751Pr A08;
    public EmojiSearchKeyboardContainer A09;
    public EmojiSearchProvider A0A;
    public ExpressionsBottomSheetView A0B;
    public C39541sc A0C;
    public C125405zr A0D;
    public C74263lK A0E;
    public AnonymousClass1BB A0F;
    public AnonymousClass1AP A0G;
    public AnonymousClass3GT A0H;
    public AnonymousClass005 A0I;
    public RecyclerView A0J;
    public C78053rU A0K;
    public boolean A0L;
    public final int[] A0M;

    private void A01() {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
        this.A0J.measure(0, 0);
        int measuredHeight = this.A0J.getMeasuredHeight();
        View view = this.A02;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass3ZQ(this, dimensionPixelOffset, measuredHeight, dimensionPixelOffset2, dimensionPixelOffset3));
        }
    }

    public static void A07(GroupProfileEmojiEditor groupProfileEmojiEditor, int i) {
        View view;
        View view2 = groupProfileEmojiEditor.A01;
        if (view2 != null) {
            C36411kG.A1A(view2, i);
            groupProfileEmojiEditor.A01.requestLayout();
            BottomSheetBehavior bottomSheetBehavior = groupProfileEmojiEditor.A05;
            if (bottomSheetBehavior != null && bottomSheetBehavior.A0J != 5 && groupProfileEmojiEditor.A06 != null && (view = groupProfileEmojiEditor.A02) != null) {
                float height = (float) (view.getHeight() - i);
                groupProfileEmojiEditor.A06.getLayoutParams().height = (int) height;
                groupProfileEmojiEditor.A06.requestLayout();
            }
        }
    }

    public void A2F() {
        if (!this.A0L) {
            this.A0L = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A0I = C18840tu.A00(A0B2.AXj);
            this.A0F = (AnonymousClass1BB) A0B2.A85.get();
            this.A0G = (AnonymousClass1AP) A0B2.A89.get();
            this.A07 = (AnonymousClass3HG) r1.A6g.get();
            this.A08 = C36381kD.A0b(A0B2);
            this.A0A = C36351kA.A0f(r1);
            this.A0D = (C125405zr) r1.A8o.get();
            this.A0E = (C74263lK) r1.A8p.get();
            this.A0H = (AnonymousClass3GT) r1.ACY.get();
        }
    }

    public void Bch(PickerSearchDialogFragment pickerSearchDialogFragment) {
        this.A0K.A02(pickerSearchDialogFragment);
    }

    public void onBackPressed() {
        C74263lK r0 = this.A0E;
        if (r0 != null) {
            AnonymousClass2MC r02 = r0.A06;
            if (r02 == null || !r02.A03()) {
                super.onBackPressed();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        BottomSheetBehavior bottomSheetBehavior;
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        int[] intArray = getResources().getIntArray(R.array.f3nameremoved);
        int[] intArray2 = getResources().getIntArray(R.array.f3nameremoved);
        Object A0r = C36371kC.A0r(A0N, getIntent().getIntExtra("emojiEditorProfileTarget", 1));
        if (A0r == null) {
            A0r = C68463bw.A00;
        }
        this.A0C = (C39541sc) new AnonymousClass04H(new AnonymousClass4ZG(intArray, this, 12), this).A00(C39541sc.class);
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) findViewById(R.id.popup_keyboard_root);
        this.A06 = keyboardPopupLayout;
        keyboardPopupLayout.setKeyboardPopupBackgroundColor(C36351kA.A01(this, R.attr.f4nameremoved, R.color.f6nameremoved));
        Toolbar A0N2 = C36361kB.A0N(this);
        AnonymousClass3UF.A0D(this, A0N2, this.A00, R.color.f6nameremoved);
        setSupportActionBar(A0N2);
        C36381kD.A0O(this).A0I(R.string.f12nameremoved);
        getSupportActionBar().A0X(true);
        getSupportActionBar().A0U(true);
        RecyclerView recyclerView = (RecyclerView) C03570Gk.A0B(this, R.id.colors_recycler);
        this.A0J = recyclerView;
        recyclerView.setAdapter(new C40671vv(this, this.A0C, intArray, intArray2, this.A0M));
        C36351kA.A1F(this.A0J, 0);
        this.A02 = C03570Gk.A0B(this, R.id.coordinator);
        this.A04 = C36431kI.A0P(this, R.id.picturePreview);
        this.A0C.A00.A08(this, new AnonymousClass3UW(A0r, this, 22));
        C39691tK r0 = (C39691tK) C36441kJ.A0b(this).A00(C39691tK.class);
        if (C36401kF.A1V(this)) {
            ExpressionsBottomSheetView expressionsBottomSheetView = (ExpressionsBottomSheetView) C03570Gk.A0B(this, R.id.keyboard_bottom_sheet);
            this.A0B = expressionsBottomSheetView;
            expressionsBottomSheetView.A0F(C36401kF.A0j(), (Integer) null, (Integer) null, 2, 2);
            this.A01 = C03570Gk.A0B(this, R.id.expressions_view_root);
            this.A09 = (EmojiSearchKeyboardContainer) C03570Gk.A0B(this, R.id.expressions_emoji_search_container);
            this.A0B.setVisibility(0);
            BottomSheetBehavior A022 = BottomSheetBehavior.A02(this.A0B);
            this.A05 = A022;
            A022.A0d(false);
            this.A0A.A01((Integer) null);
            this.A05.A0Z(new C89194Vp(this, 7));
            A01();
            this.A05.A0W(4);
            this.A0B.A0A();
            this.A0B.A0D();
            ExpressionsBottomSheetView expressionsBottomSheetView2 = this.A0B;
            if (!(expressionsBottomSheetView2 == null || (bottomSheetBehavior = this.A05) == null || (emojiSearchKeyboardContainer = this.A09) == null)) {
                C74263lK r5 = this.A0E;
                r5.A07 = this;
                r5.A08 = r0;
                r5.A04 = expressionsBottomSheetView2;
                r5.A00 = bottomSheetBehavior;
                r5.A03 = emojiSearchKeyboardContainer;
                Resources resources = getResources();
                expressionsBottomSheetView2.setExpressionsSearchListener(r5.A0E);
                C68743cO r3 = new C68743cO(resources, r5);
                r5.A01 = r3;
                expressionsBottomSheetView2.A01 = r3;
                expressionsBottomSheetView2.A0I = new C78033rS(resources, this, r5);
            }
        } else {
            AnonymousClass1AP r9 = this.A0G;
            C19770wU r11 = this.A04;
            AnonymousClass005 r12 = this.A0I;
            C133356Xz r6 = new C133356Xz(this.A09, this.A0F, r9, this.A0H, r11, r12);
            C78053rU r52 = new C78053rU(r6);
            this.A0K = r52;
            C74263lK r4 = this.A0E;
            KeyboardPopupLayout keyboardPopupLayout2 = this.A06;
            AnonymousClass3HG r32 = this.A07;
            r4.A07 = this;
            r4.A08 = r0;
            r4.A0A = r6;
            r4.A09 = r52;
            r4.A02 = r32;
            AnonymousClass3HH r14 = r4.A0G;
            r14.A00 = this;
            r14.A04 = r4.A02.A02(r4.A0J, r4.A0A);
            r14.A02 = r4.A02.A01();
            r14.A01((ImageButton) null, keyboardPopupLayout2, (WaEditText) C03570Gk.A0B(this, R.id.keyboardInput), C36401kF.A0j(), C36361kB.A0j());
            r14.A06 = true;
            r4.A05 = r14.A00();
            Resources resources2 = getResources();
            C68743cO r33 = new C68743cO(resources2, r4);
            r4.A01 = r33;
            AnonymousClass2M8 r7 = r4.A05;
            r7.A0H(r33);
            C78043rT r34 = new C78043rT(resources2, this, r4, r52);
            r7.A0L(r34);
            r52.A04 = r34;
            AnonymousClass2MC r122 = new AnonymousClass2MC(this, (EmojiSearchContainer) keyboardPopupLayout2.findViewById(R.id.emoji_search_container), r4.A0F, r4.A05, (GifSearchContainer) keyboardPopupLayout2.findViewById(R.id.gif_search_container), r4.A0H);
            r4.A06 = r122;
            r122.A00 = r4;
            r52.A01(r4.A05, (AnonymousClass11F) null, this);
            C133356Xz r35 = r4.A0A;
            r35.A0B.registerObserver(r35.A09);
            C90104Zc.A00(this.A06.getViewTreeObserver(), this, 23);
        }
        C66023Uj.A00(this, r0.A00, 12);
        this.A03 = (ImageView) LayoutInflater.from(this).inflate(R.layout.f9nameremoved, (ViewGroup) this.A00, false);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.done, 0, R.string.f12nameremoved).setIcon(new C100744vb(AnonymousClass3UF.A02(this, R.drawable.action_profile_photo_editor_done, R.color.f6nameremoved), this.A00)).setShowAsAction(2);
        return true;
    }

    public GroupProfileEmojiEditor(int i) {
        this.A0L = false;
        C89334Wd.A00(this, 39);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (C36401kF.A1V(this)) {
            A01();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C74263lK r3 = this.A0E;
        AnonymousClass2M8 r0 = r3.A05;
        if (r0 != null) {
            r0.A0H((C88314Sf) null);
            r0.A0L((C88234Rx) null);
            r0.dismiss();
            r3.A05.A0K();
        }
        C78053rU r02 = r3.A09;
        if (r02 != null) {
            r02.A04 = null;
            r02.A00();
        }
        AnonymousClass2MC r03 = r3.A06;
        if (r03 != null) {
            r03.A00 = null;
        }
        C133356Xz r04 = r3.A0A;
        if (r04 != null) {
            r04.A0B.unregisterObserver(r04.A09);
        }
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = r3.A03;
        if (emojiSearchKeyboardContainer != null) {
            emojiSearchKeyboardContainer.setOnTouchListener((View.OnTouchListener) null);
            emojiSearchKeyboardContainer.A0B = null;
        }
        ExpressionsBottomSheetView expressionsBottomSheetView = r3.A04;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.A0B();
            r3.A04 = null;
        }
        r3.A0A = null;
        r3.A09 = null;
        r3.A06 = null;
        r3.A01 = null;
        r3.A02 = null;
        r3.A05 = null;
        r3.A08 = null;
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer2 = this.A09;
        if (emojiSearchKeyboardContainer2 != null) {
            emojiSearchKeyboardContainer2.setOnTouchListener((View.OnTouchListener) null);
            emojiSearchKeyboardContainer2.A0B = null;
        }
        ExpressionsBottomSheetView expressionsBottomSheetView2 = this.A0B;
        if (expressionsBottomSheetView2 != null) {
            expressionsBottomSheetView2.A0B();
            this.A0B = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.done) {
            C36331k8.A1F(new C49922ju(this, this.A0D), this.A04);
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.done).setVisible(AnonymousClass000.A1V(this.A00));
        return true;
    }

    public void Btk(DialogFragment dialogFragment) {
        Btm(dialogFragment);
    }

    public GroupProfileEmojiEditor() {
        this(0);
        this.A0M = new int[]{R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved};
    }
}
