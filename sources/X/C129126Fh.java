package X;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;
import java.util.Objects;

/* renamed from: X.6Fh  reason: invalid class name and case insensitive filesystem */
public class C129126Fh {
    public List A00;
    public float A01 = 1.0f;
    public int A02 = -13381889;
    public AnimatorSet A03;
    public Rect A04 = AnonymousClass001.A06();
    public AnonymousClass6FL A05;
    public C146806wC A06;
    public boolean A07;
    public boolean A08;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A0B;
    public CoordinatorLayout A0C;
    public final Animation A0D;
    public final ValueAnimator A0E;
    public final Animation A0F;
    public final AnonymousClass6VT A0G;
    public final C117405mD A0H;
    public final TitleBarView A0I;
    public final C1270866x A0J;

    public void A07(int i) {
        if (i == 2 && C36341k9.A07(this.A0G.A06) == 2) {
            A08(this.A02, this.A01);
            return;
        }
        AnonymousClass6VT r1 = this.A0G;
        if (C36341k9.A07(r1.A06) == i) {
            i = 0;
        }
        r1.A0A(i);
    }

    public AnimatorSet A00(boolean z) {
        float f;
        ImageView imageView;
        long j;
        TimeInterpolator r0;
        AnimatorSet animatorSet = this.A03;
        if (animatorSet != null) {
            animatorSet.end();
        }
        AnimatorSet A0C2 = C36441kJ.A0C();
        this.A00 = AnonymousClass001.A0I();
        TitleBarView titleBarView = this.A0I;
        float shapeToolOffsetX = titleBarView.getShapeToolOffsetX();
        float textToolOffsetX = titleBarView.getTextToolOffsetX();
        float cropToolOffsetX = titleBarView.getCropToolOffsetX();
        C001700s r3 = this.A0G.A06;
        int A072 = C36341k9.A07(r3);
        ImageView imageView2 = titleBarView.A09;
        if (imageView2 == null) {
            throw C36331k8.A0d("undoButton");
        }
        if (imageView2.getVisibility() == 8 || A072 != 1) {
            ImageView imageView3 = titleBarView.A07;
            if (imageView3 == null) {
                throw C36331k8.A0d("penTool");
            }
            float x = imageView3.getX();
            ImageView imageView4 = titleBarView.A09;
            if (imageView4 == null) {
                throw C36331k8.A0d("undoButton");
            }
            f = x - imageView4.getX();
            imageView = titleBarView.A09;
            if (imageView == null) {
                throw C36331k8.A0d("undoButton");
            }
        } else {
            WaTextView waTextView = titleBarView.A0D;
            if (waTextView == null) {
                throw C36331k8.A0d("textTool");
            }
            float x2 = waTextView.getX();
            WaTextView waTextView2 = titleBarView.A0D;
            if (waTextView2 == null) {
                throw C36331k8.A0d("textTool");
            }
            float translationX = x2 - waTextView2.getTranslationX();
            ImageView imageView5 = titleBarView.A09;
            if (imageView5 == null) {
                throw C36331k8.A0d("undoButton");
            }
            f = translationX - imageView5.getX();
            imageView = titleBarView.A09;
            if (imageView == null) {
                throw C36331k8.A0d("undoButton");
            }
        }
        float mediaSettingsToolOffsetX = titleBarView.getMediaSettingsToolOffsetX();
        float magicModToolOffsetX = titleBarView.getMagicModToolOffsetX();
        C111565cU.A00(A01(shapeToolOffsetX, 40, z), this, 26);
        C111565cU.A00(A01(textToolOffsetX, 60, z), this, 27);
        C111565cU.A00(A01(cropToolOffsetX, 20, z), this, 28);
        C111565cU.A00(A01(f - imageView.getTranslationX(), 20, z), this, 29);
        C111565cU.A00(A01(mediaSettingsToolOffsetX, 20, z), this, 30);
        C111565cU.A00(A01(magicModToolOffsetX, 20, z), this, 31);
        float[] fArr = new float[2];
        float f2 = 1.0f;
        float f3 = 0.0f;
        if (z) {
            f3 = 1.0f;
        }
        fArr[0] = f3;
        fArr[1] = C90514aH.A03(z ? 1 : 0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        C111565cU.A00(ofFloat, this, 32);
        ValueAnimator valueAnimator = this.A0E;
        valueAnimator.setDuration(400);
        if (z) {
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new AnonymousClass02K());
            this.A00.add(valueAnimator);
        } else {
            ofFloat.setDuration(500);
        }
        this.A00.add(ofFloat);
        if (!(C36341k9.A07(r3) == 5 || C36341k9.A07(r3) == 2)) {
            float[] fArr2 = new float[2];
            float f4 = 0.0f;
            if (z) {
                f4 = 1.0f;
            }
            fArr2[0] = f4;
            if (z) {
                f2 = 0.0f;
            }
            fArr2[1] = f2;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
            C111565cU.A00(ofFloat2, this, 25);
            long j2 = 100;
            if (z) {
                j = 100;
            } else {
                j = 300;
            }
            ofFloat2.setDuration(j);
            if (z) {
                j2 = 0;
            }
            ofFloat2.setStartDelay(j2);
            if (z) {
                r0 = new AnonymousClass066();
            } else {
                r0 = new AnonymousClass02K();
            }
            ofFloat2.setInterpolator(r0);
            this.A00.add(ofFloat2);
        }
        A0C2.playTogether(this.A00);
        A0C2.addListener(new C162287oL(3, this, z));
        return A0C2;
    }

    public void A02() {
        TitleBarView titleBarView = this.A0I;
        Animation animation = this.A0D;
        View view = titleBarView.A02;
        if (view == null) {
            throw C36331k8.A0d("titleBar");
        }
        view.setVisibility(4);
        View view2 = titleBarView.A02;
        if (view2 == null) {
            throw C36331k8.A0d("titleBar");
        }
        view2.startAnimation(animation);
    }

    public void A03() {
        AnonymousClass6VT r3 = this.A0G;
        boolean z = false;
        int i = 6;
        if (C36341k9.A07(r3.A06) == 6) {
            i = 0;
        }
        r3.A0A(i);
        C146806wC r6 = this.A06;
        if (i == 0) {
            z = true;
        }
        C129126Fh r1 = r6.A0V;
        ImageView imageView = r1.A0I.A05;
        if (imageView == null) {
            return;
        }
        if (z) {
            C38841qJ r0 = r6.A03;
            if (r0 != null) {
                r0.dismiss();
            }
            r6.A03 = null;
            return;
        }
        AnonymousClass01I r4 = r6.A0B;
        Objects.requireNonNull(r1);
        C38841qJ r02 = new C38841qJ(r4, r6.A0C, r6.A0D, new C1503074t((Object) r1, 41));
        r6.A03 = r02;
        r02.showAsDropDown(imageView);
    }

    public void A04() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.A03;
        if (animatorSet2 != null && animatorSet2.isRunning() && this.A07) {
            this.A03.end();
        }
        if (!this.A08 || (animatorSet = this.A03) == null || animatorSet.isRunning()) {
            this.A0I.A01(this.A0F);
        } else {
            this.A03.start();
            this.A07 = false;
        }
        this.A08 = false;
    }

    public void A06(float f, int i, boolean z, boolean z2) {
        this.A02 = i;
        this.A01 = f;
        boolean z3 = false;
        this.A09 = false;
        this.A0A = false;
        int A072 = C36341k9.A07(this.A0G.A06);
        if (A072 == 0) {
            A05(f);
        } else if (A072 == 1) {
            if (i == 0 || !this.A09) {
                C91184bb r0 = this.A0I.A0M;
                if (r0 == null) {
                    throw C36331k8.A0d("penToolDrawable");
                }
                r0.A01(i, f);
            } else {
                ValueAnimator valueAnimator = this.A0E;
                valueAnimator.addUpdateListener(new C111915d3(this, f, i, 0));
                C162337oQ.A00(valueAnimator, this, 24);
                valueAnimator.start();
                this.A09 = false;
                this.A0A = true;
            }
            this.A0I.setPenToolDrawableStrokePreview(z);
        } else if (A072 == 2) {
            A08(i, f);
            if (z && z2) {
                z3 = true;
            }
            this.A0I.setShapeToolDrawableStrokePreview(z3);
        }
    }

    public void A08(int i, float f) {
        if (!this.A0A || i == 0) {
            C91184bb r0 = this.A0I.A0N;
            if (r0 == null) {
                throw C36331k8.A0d("shapeToolDrawable");
            }
            r0.A01(i, f);
            return;
        }
        ValueAnimator valueAnimator = this.A0E;
        valueAnimator.addUpdateListener(new C111915d3(this, f, i, 1));
        C162337oQ.A00(valueAnimator, this, 24);
        AnimatorSet A002 = A00(true);
        this.A03 = A002;
        A002.start();
        this.A07 = true;
    }

    public void A09(boolean z) {
        TitleBarView titleBarView = this.A0I;
        ImageView imageView = titleBarView.A08;
        if (imageView == null) {
            throw C36331k8.A0d("shapeTool");
        }
        imageView.setEnabled(z);
        WaTextView waTextView = titleBarView.A0D;
        if (waTextView == null) {
            throw C36331k8.A0d("textTool");
        }
        waTextView.setEnabled(z);
        ImageView imageView2 = titleBarView.A07;
        if (imageView2 == null) {
            throw C36331k8.A0d("penTool");
        }
        imageView2.setEnabled(z);
    }

    public void A0A(boolean z) {
        TitleBarView titleBarView = this.A0I;
        int i = R.drawable.media_quality_new;
        if (z) {
            i = R.drawable.media_quality_new_active;
        }
        Drawable A002 = AnonymousClass00E.A00(titleBarView.getContext(), i);
        if (A002 != null) {
            C91184bb r0 = titleBarView.A0L;
            if (r0 == null) {
                throw C36331k8.A0d("mediaQualityButtonDrawable");
            }
            r0.A03 = A002;
            r0.invalidateSelf();
        }
        C91184bb r1 = titleBarView.A0L;
        if (r1 == null) {
            throw C36331k8.A0d("mediaQualityButtonDrawable");
        }
        r1.A00(titleBarView.A00);
    }

    public C129126Fh(CoordinatorLayout coordinatorLayout, AnonymousClass6VT r12, C117405mD r13, TitleBarView titleBarView, C1270866x r15) {
        KeyEvent.Callback callback;
        ImageView imageView;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.A0D = alphaAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        this.A0F = alphaAnimation2;
        float[] A0v = C90524aI.A0v();
        // fill-array-data instruction
        A0v[0] = 1061997773;
        A0v[1] = 1065353216;
        this.A0E = ValueAnimator.ofFloat(A0v);
        this.A0C = coordinatorLayout;
        this.A0G = r12;
        this.A0I = titleBarView;
        this.A0H = r13;
        this.A0J = r15;
        alphaAnimation.setDuration(300);
        alphaAnimation2.setDuration(300);
        titleBarView.A0R = this;
        titleBarView.A03 = C36341k9.A0L(titleBarView, R.id.back);
        titleBarView.A0T = (WDSButton) C36361kB.A0G(titleBarView, R.id.done);
        titleBarView.A0A = (RelativeLayout) C36361kB.A0G(titleBarView, R.id.tool_bar_extra);
        titleBarView.A01 = C36361kB.A0G(titleBarView, R.id.media_tools);
        titleBarView.A09 = C36341k9.A0L(titleBarView, R.id.undo);
        titleBarView.A02 = C36361kB.A0G(titleBarView, R.id.title_bar);
        titleBarView.A07 = C36341k9.A0L(titleBarView, R.id.pen);
        titleBarView.A08 = C36341k9.A0L(titleBarView, R.id.shape);
        titleBarView.A0D = C36341k9.A0Q(titleBarView, R.id.text);
        titleBarView.A04 = C36341k9.A0L(titleBarView, R.id.crop);
        titleBarView.A0C = C36341k9.A0Q(titleBarView, R.id.media_quality_tool_tip);
        ViewStub viewStub = (ViewStub) titleBarView.findViewById(R.id.media_upload_quality_settings_stub);
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.f9nameremoved);
        }
        ImageView imageView2 = null;
        if (viewStub != null) {
            callback = viewStub.inflate();
        } else {
            callback = null;
        }
        titleBarView.A06 = callback instanceof ImageView ? (ImageView) callback : imageView2;
        titleBarView.A0M = new C91184bb(C36371kC.A0B(titleBarView), R.drawable.new_pen);
        titleBarView.A0N = new C91184bb(C36371kC.A0B(titleBarView), R.drawable.new_shape);
        titleBarView.A0O = new C91184bb(C36371kC.A0B(titleBarView), R.drawable.new_text);
        titleBarView.A0J = new C91184bb(C36371kC.A0B(titleBarView), R.drawable.new_crop);
        titleBarView.A0P = new C91184bb(C36371kC.A0B(titleBarView), R.drawable.new_undo);
        titleBarView.A0I = new C91184bb(C36371kC.A0B(titleBarView), R.drawable.new_close);
        titleBarView.A0L = new C91184bb(C36371kC.A0B(titleBarView), 0);
        WaTextView waTextView = titleBarView.A0D;
        if (waTextView == null) {
            throw C36331k8.A0d("textTool");
        }
        C36391kE.A1K(waTextView);
        titleBarView.A00 = AnonymousClass00F.A00(titleBarView.getContext(), R.color.f6nameremoved);
        DisplayMetrics displayMetrics = C36341k9.A0F(titleBarView).getDisplayMetrics();
        if (((int) (((float) displayMetrics.widthPixels) / displayMetrics.density)) < 360) {
            ImageView imageView3 = titleBarView.A03;
            if (imageView3 == null) {
                throw C36331k8.A0d("backButton");
            }
            imageView3.setPadding(0, 0, 0, 0);
            ImageView imageView4 = titleBarView.A04;
            if (imageView4 == null) {
                throw C36331k8.A0d("cropTool");
            }
            imageView4.setPadding(0, 0, 0, 0);
            ImageView imageView5 = titleBarView.A09;
            if (imageView5 == null) {
                throw C36331k8.A0d("undoButton");
            }
            imageView5.setPadding(0, 0, 0, 0);
            ImageView imageView6 = titleBarView.A06;
            if (imageView6 != null) {
                imageView6.setPadding(0, 0, 0, 0);
            }
        }
        ImageView imageView7 = titleBarView.A07;
        if (imageView7 == null) {
            throw C36331k8.A0d("penTool");
        }
        C91184bb r0 = titleBarView.A0M;
        if (r0 == null) {
            throw C36331k8.A0d("penToolDrawable");
        }
        imageView7.setImageDrawable(r0);
        ImageView imageView8 = titleBarView.A08;
        if (imageView8 == null) {
            throw C36331k8.A0d("shapeTool");
        }
        C91184bb r02 = titleBarView.A0N;
        if (r02 == null) {
            throw C36331k8.A0d("shapeToolDrawable");
        }
        imageView8.setImageDrawable(r02);
        WaTextView waTextView2 = titleBarView.A0D;
        if (waTextView2 == null) {
            throw C36331k8.A0d("textTool");
        }
        C91184bb r03 = titleBarView.A0O;
        if (r03 == null) {
            throw C36331k8.A0d("textToolDrawable");
        }
        waTextView2.setBackground(r03);
        ImageView imageView9 = titleBarView.A03;
        if (imageView9 == null) {
            throw C36331k8.A0d("backButton");
        }
        C18820ts whatsAppLocale = titleBarView.getWhatsAppLocale();
        C91184bb r1 = titleBarView.A0I;
        if (r1 == null) {
            throw C36331k8.A0d("closeButtonDrawable");
        }
        imageView9.setImageDrawable(new C100744vb(r1, whatsAppLocale));
        ImageView imageView10 = titleBarView.A04;
        if (imageView10 == null) {
            throw C36331k8.A0d("cropTool");
        }
        C91184bb r04 = titleBarView.A0J;
        if (r04 == null) {
            throw C36331k8.A0d("cropToolDrawable");
        }
        imageView10.setImageDrawable(r04);
        ImageView imageView11 = titleBarView.A09;
        if (imageView11 == null) {
            throw C36331k8.A0d("undoButton");
        }
        C91184bb r05 = titleBarView.A0P;
        if (r05 == null) {
            throw C36331k8.A0d("undoButtonDrawable");
        }
        imageView11.setImageDrawable(r05);
        ImageView imageView12 = titleBarView.A06;
        if (imageView12 != null) {
            C91184bb r06 = titleBarView.A0L;
            if (r06 == null) {
                throw C36331k8.A0d("mediaQualityButtonDrawable");
            }
            imageView12.setImageDrawable(r06);
        }
        ImageView imageView13 = titleBarView.A03;
        if (imageView13 == null) {
            throw C36331k8.A0d("backButton");
        }
        C135466ck.A00(imageView13, this, 35);
        WDSButton wDSButton = titleBarView.A0T;
        if (wDSButton == null) {
            throw C36331k8.A0d("doneButton");
        }
        C135466ck.A00(wDSButton, this, 36);
        ImageView imageView14 = titleBarView.A09;
        if (imageView14 == null) {
            throw C36331k8.A0d("undoButton");
        }
        C135466ck.A00(imageView14, this, 29);
        ImageView imageView15 = titleBarView.A09;
        if (imageView15 == null) {
            throw C36331k8.A0d("undoButton");
        }
        imageView15.setOnLongClickListener(new C163337q2(this, 3));
        ImageView imageView16 = titleBarView.A07;
        if (imageView16 == null) {
            throw C36331k8.A0d("penTool");
        }
        C135466ck.A00(imageView16, this, 33);
        ImageView imageView17 = titleBarView.A08;
        if (imageView17 == null) {
            throw C36331k8.A0d("shapeTool");
        }
        C135466ck.A00(imageView17, this, 31);
        ImageView imageView18 = titleBarView.A04;
        if (imageView18 == null) {
            throw C36331k8.A0d("cropTool");
        }
        C135466ck.A00(imageView18, this, 34);
        WaTextView waTextView3 = titleBarView.A0D;
        if (waTextView3 == null) {
            throw C36331k8.A0d("textTool");
        }
        C135466ck.A00(waTextView3, this, 32);
        ImageView imageView19 = titleBarView.A06;
        if (imageView19 != null) {
            C135466ck.A00(imageView19, this, 30);
        }
        if (titleBarView.getAbProps().A0E(4049) && (imageView = titleBarView.A06) != null) {
            imageView.setOnLongClickListener(new C163337q2(this, 4));
        }
    }

    public ValueAnimator A01(float f, long j, boolean z) {
        TimeInterpolator A002;
        float[] A0v = C90524aI.A0v();
        float f2 = -f;
        if (z) {
            f2 = 0.0f;
        }
        A0v[0] = f2;
        if (!z) {
            f = 0.0f;
        }
        A0v[1] = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A0v);
        if (z) {
            ofFloat.setDuration(300);
            A002 = new AnonymousClass02K();
        } else {
            ofFloat.setDuration(500);
            ofFloat.setStartDelay(j);
            A002 = C017907q.A00(0.5f, 1.35f, 0.4f, 1.0f);
        }
        ofFloat.setInterpolator(A002);
        this.A00.add(ofFloat);
        return ofFloat;
    }

    public void A05(float f) {
        A04();
        this.A0G.A0A(0);
        TitleBarView titleBarView = this.A0I;
        titleBarView.setShapeToolDrawableStrokePreview(false);
        titleBarView.setPenToolDrawableStrokePreview(false);
        ImageView imageView = titleBarView.A07;
        if (imageView == null) {
            throw C36331k8.A0d("penTool");
        }
        imageView.setSelected(false);
        WaTextView waTextView = titleBarView.A0D;
        if (waTextView == null) {
            throw C36331k8.A0d("textTool");
        }
        waTextView.setSelected(false);
        ImageView imageView2 = titleBarView.A08;
        if (imageView2 == null) {
            throw C36331k8.A0d("shapeTool");
        }
        imageView2.setSelected(false);
        int i = titleBarView.A00;
        C91184bb r0 = titleBarView.A0N;
        if (r0 == null) {
            throw C36331k8.A0d("shapeToolDrawable");
        }
        r0.A01(i, f);
        C91184bb r1 = titleBarView.A0O;
        if (r1 == null) {
            throw C36331k8.A0d("textToolDrawable");
        }
        r1.A01(titleBarView.A00, f);
        C91184bb r12 = titleBarView.A0M;
        if (r12 == null) {
            throw C36331k8.A0d("penToolDrawable");
        }
        r12.A01(titleBarView.A00, f);
        C91184bb r13 = titleBarView.A0J;
        if (r13 == null) {
            throw C36331k8.A0d("cropToolDrawable");
        }
        r13.A01(titleBarView.A00, f);
        C91184bb r14 = titleBarView.A0P;
        if (r14 == null) {
            throw C36331k8.A0d("undoButtonDrawable");
        }
        r14.A01(titleBarView.A00, f);
        C91184bb r15 = titleBarView.A0I;
        if (r15 == null) {
            throw C36331k8.A0d("closeButtonDrawable");
        }
        r15.A01(titleBarView.A00, f);
        C91184bb r16 = titleBarView.A0L;
        if (r16 == null) {
            throw C36331k8.A0d("mediaQualityButtonDrawable");
        }
        r16.A01(titleBarView.A00, f);
        C91184bb r17 = titleBarView.A0K;
        if (r17 != null) {
            r17.A01(titleBarView.A00, f);
        }
        titleBarView.setBackButtonDrawable(false);
        this.A09 = true;
        this.A0A = true;
        ImageView imageView3 = titleBarView.A07;
        if (imageView3 == null) {
            throw C36331k8.A0d("penTool");
        }
        imageView3.setVisibility(0);
        WaTextView waTextView2 = titleBarView.A0D;
        if (waTextView2 == null) {
            throw C36331k8.A0d("textTool");
        }
        waTextView2.setVisibility(0);
        ImageView imageView4 = titleBarView.A08;
        if (imageView4 == null) {
            throw C36331k8.A0d("shapeTool");
        }
        imageView4.setVisibility(0);
        ImageView imageView5 = titleBarView.A07;
        if (imageView5 == null) {
            throw C36331k8.A0d("penTool");
        }
        float f2 = 1.0f;
        imageView5.setAlpha(1.0f);
        WaTextView waTextView3 = titleBarView.A0D;
        if (waTextView3 == null) {
            throw C36331k8.A0d("textTool");
        }
        waTextView3.setAlpha(1.0f);
        ImageView imageView6 = titleBarView.A04;
        if (imageView6 == null) {
            throw C36331k8.A0d("cropTool");
        }
        imageView6.setAlpha(1.0f);
        ImageView imageView7 = titleBarView.A08;
        if (imageView7 == null) {
            throw C36331k8.A0d("shapeTool");
        }
        imageView7.setAlpha(1.0f);
        ImageView imageView8 = titleBarView.A06;
        if (imageView8 != null) {
            if (!titleBarView.A0X) {
                f2 = 0.4f;
            }
            imageView8.setAlpha(f2);
        }
        ImageView imageView9 = titleBarView.A04;
        if (imageView9 == null) {
            throw C36331k8.A0d("cropTool");
        } else if (imageView9.getVisibility() != 8) {
            ImageView imageView10 = titleBarView.A04;
            if (imageView10 == null) {
                throw C36331k8.A0d("cropTool");
            }
            imageView10.setVisibility(0);
        }
    }
}
