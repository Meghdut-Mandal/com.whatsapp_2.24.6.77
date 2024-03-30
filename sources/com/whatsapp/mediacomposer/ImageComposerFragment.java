package com.whatsapp.mediacomposer;

import X.AnonymousClass01I;
import X.AnonymousClass0XL;
import X.AnonymousClass16L;
import X.AnonymousClass1GW;
import X.AnonymousClass1GX;
import X.AnonymousClass1PM;
import X.AnonymousClass1X5;
import X.AnonymousClass3K8;
import X.AnonymousClass4TB;
import X.AnonymousClass6OT;
import X.AnonymousClass6QO;
import X.AnonymousClass6VT;
import X.AnonymousClass6WR;
import X.C02460Ak;
import X.C06570Uc;
import X.C1032954s;
import X.C105005Cx;
import X.C119805qU;
import X.C129126Fh;
import X.C132366Tg;
import X.C135306cU;
import X.C135466ck;
import X.C145696uN;
import X.C145716uP;
import X.C146636vv;
import X.C146716w3;
import X.C146806wC;
import X.C157367cq;
import X.C160827le;
import X.C162607or;
import X.C163167pl;
import X.C163177pm;
import X.C164757sK;
import X.C18820ts;
import X.C19420v0;
import X.C19770wU;
import X.C20690y0;
import X.C20810yC;
import X.C225314u;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36441kJ;
import X.C90484aE;
import X.C90514aH;
import X.C90524aI;
import X.C96014me;
import X.C99244su;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ImageComposerFragment extends Hilt_ImageComposerFragment {
    public Bitmap A00;
    public C20690y0 A01;
    public AnonymousClass16L A02;
    public C1032954s A03;
    public ImagePreviewContentLayout A04;
    public AnonymousClass6WR A05;
    public PhotoView A06;
    public boolean A07;
    public boolean A08 = false;
    public boolean A09 = false;
    public AnonymousClass4TB A0A;
    public AnonymousClass4TB A0B;

    public static void A09(ImageComposerFragment imageComposerFragment) {
        AnonymousClass3K8 r0;
        C163167pl r2 = new C163167pl(imageComposerFragment, 0);
        imageComposerFragment.A0B = r2;
        C163177pm r1 = new C163177pm(imageComposerFragment, 0);
        C160827le A1a = imageComposerFragment.A1a();
        if (A1a != null && (r0 = ((MediaComposerActivity) A1a).A0h) != null) {
            r0.A02(r2, r1);
        }
    }

    public void A1N(int i, int i2, Intent intent) {
        int intExtra;
        if (i == 1) {
            if (i2 == -1) {
                Rect rect = (Rect) intent.getParcelableExtra("rect");
                int intExtra2 = intent.getIntExtra("rotate", 0);
                int intExtra3 = intent.getIntExtra("error_message_id", -1);
                C146806wC r0 = this.A0E;
                if (!(r0 == null || rect == null)) {
                    A07(rect, r0.A0O.A07, this, intExtra2, intExtra3);
                }
            } else if (i2 == 0) {
                if (intent == null) {
                    A08((Bundle) null, this);
                } else if (A0h() != null && (intExtra = intent.getIntExtra("error_message_id", -1)) > 0) {
                    this.A02.A0C((C225314u) A0h(), intExtra);
                }
            }
            this.A07 = false;
            return;
        }
        super.A1N(i, i2, intent);
    }

    public static int A06(ImageComposerFragment imageComposerFragment) {
        C160827le A1a;
        Uri uri = imageComposerFragment.A00;
        int i = 0;
        if (uri == null || (A1a = imageComposerFragment.A1a()) == null) {
            return 0;
        }
        String queryParameter = uri.getQueryParameter("rotation");
        if (queryParameter != null) {
            i = Integer.parseInt(queryParameter);
        }
        return (C132366Tg.A01(imageComposerFragment.A00, A1a).A02() + i) % 360;
    }

    public static void A07(Rect rect, RectF rectF, ImageComposerFragment imageComposerFragment, int i, int i2) {
        Uri uri;
        C160827le A1a;
        InputStream A0V;
        int parseInt;
        if (rectF != null && (uri = imageComposerFragment.A00) != null && imageComposerFragment.A0E != null && (A1a = imageComposerFragment.A1a()) != null) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) A1a;
            C132366Tg r4 = mediaComposerActivity.A1r;
            int A022 = r4.A03(uri).A02();
            PhotoView photoView = imageComposerFragment.A06;
            photoView.A0I = null;
            photoView.A04 = 0.0f;
            AnonymousClass6WR r2 = imageComposerFragment.A05;
            r2.A03 = null;
            AnonymousClass1PM r1 = r2.A0Q;
            if (r1 != null) {
                r1.A0C(r2.A0X);
            }
            File A012 = C105005Cx.A01(imageComposerFragment.A00, imageComposerFragment.A01);
            Uri fromFile = Uri.fromFile(A012);
            Uri uri2 = imageComposerFragment.A00;
            int i3 = (A022 + i) % 360;
            AnonymousClass6QO A032 = r4.A03(uri2);
            synchronized (A032) {
                A032.A05 = rect;
            }
            synchronized (A032) {
                A032.A01 = i3;
            }
            synchronized (A032) {
                A032.A08 = A012;
            }
            MediaComposerActivity.A0M(uri2, mediaComposerActivity);
            C146636vv.A00(mediaComposerActivity);
            MediaComposerActivity.A0m(mediaComposerActivity);
            if (imageComposerFragment.A00.getQueryParameter("flip-h") != null) {
                fromFile = C90484aE.A0M(fromFile.buildUpon(), "flip-h", "1");
            }
            int A062 = A06(imageComposerFragment);
            if (A062 != 0) {
                fromFile = C90484aE.A0M(fromFile.buildUpon(), "rotation", Integer.toString(A062));
            }
            try {
                boolean z = imageComposerFragment.A09;
                C20810yC r12 = imageComposerFragment.A0A;
                int i4 = 1576;
                if (z) {
                    i4 = 2654;
                }
                int A072 = r12.A07(i4);
                Bitmap A0e = imageComposerFragment.A0P.A0e(fromFile, A072, A072);
                AnonymousClass6WR r13 = imageComposerFragment.A05;
                r13.A04 = A0e;
                r13.A09 = false;
                r13.A05();
                AnonymousClass6WR r3 = imageComposerFragment.A05;
                AnonymousClass6WR.A01(r3);
                C96014me r0 = r3.A08;
                if (r0 != null) {
                    r0.A06();
                } else {
                    Handler handler = r3.A0J;
                    Runnable runnable = r3.A0W;
                    handler.removeCallbacks(runnable);
                    runnable.run();
                }
                Bitmap bitmap = imageComposerFragment.A05.A03;
                if (bitmap == null) {
                    Log.e("ImageComposerFragment/cropImage/nullBitmap");
                    imageComposerFragment.A02.A06(R.string.f12nameremoved, 1);
                    return;
                }
                imageComposerFragment.A06.A08(bitmap);
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    Uri fromFile2 = Uri.fromFile(r4.A03(imageComposerFragment.A00).A08());
                    A0V = AnonymousClass1GX.A0V(fromFile2, imageComposerFragment.A0P, true);
                    BitmapFactory.decodeStream(A0V, (Rect) null, options);
                    A0V.close();
                    RectF A0L = C90514aH.A0L((float) options.outWidth, options.outHeight);
                    Matrix A0A2 = AnonymousClass1GW.A0A(fromFile2, imageComposerFragment.A04.A0O());
                    if (A0A2 == null) {
                        A0A2 = C90524aI.A0B();
                    }
                    String queryParameter = imageComposerFragment.A00.getQueryParameter("rotation");
                    if (!(queryParameter == null || (parseInt = Integer.parseInt(queryParameter)) == 0)) {
                        A0A2.postRotate((float) parseInt);
                    }
                    A0A2.mapRect(A0L);
                    float f = A0L.left;
                    float f2 = A0L.top;
                    RectF rectF2 = new RectF(rect);
                    A0A2.mapRect(rectF2);
                    rectF2.offset(-f, -f2);
                    float width = rectF.width() / A0L.width();
                    rectF2.left *= width;
                    rectF2.top *= width;
                    rectF2.right *= width;
                    rectF2.bottom *= width;
                    imageComposerFragment.A0E.A0B(rectF2);
                    C146806wC r22 = imageComposerFragment.A0E;
                    AnonymousClass6OT r14 = r22.A0O;
                    r14.A02 = (r14.A02 + i) % 360;
                    AnonymousClass6OT.A01(r14);
                    AnonymousClass6OT.A01(r14);
                    r22.A0N.requestLayout();
                    r22.A0M.A03();
                    return;
                } catch (IOException unused) {
                    if (i2 > 0) {
                        imageComposerFragment.A02.A0C((C225314u) imageComposerFragment.A0h(), i2);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (AnonymousClass1X5 | IOException | OutOfMemoryError e) {
                Log.e("ImageComposerFragment/cropImage", e);
            }
        } else {
            return;
        }
        throw th;
    }

    public static void A08(Bundle bundle, ImageComposerFragment imageComposerFragment) {
        Uri build;
        imageComposerFragment.A06.setTag(imageComposerFragment.A00);
        C160827le A1a = imageComposerFragment.A1a();
        if (A1a != null) {
            Uri uri = imageComposerFragment.A00;
            if (uri == null) {
                build = Uri.EMPTY;
            } else {
                C132366Tg r1 = ((MediaComposerActivity) A1a).A1r;
                File A062 = r1.A03(uri).A06();
                if (A062 == null) {
                    A062 = r1.A03(imageComposerFragment.A00).A08();
                }
                Uri.Builder buildUpon = Uri.fromFile(A062).buildUpon();
                int A063 = A06(imageComposerFragment);
                if (A063 != 0) {
                    buildUpon.appendQueryParameter("rotation", Integer.toString(A063));
                }
                if (imageComposerFragment.A00.getQueryParameter("flip-h") != null) {
                    buildUpon.appendQueryParameter("flip-h", imageComposerFragment.A00.getQueryParameter("flip-h"));
                }
                build = buildUpon.build();
            }
            C145696uN r2 = new C145696uN(build, imageComposerFragment);
            imageComposerFragment.A0A = r2;
            C145716uP r12 = new C145716uP(bundle, imageComposerFragment, A1a);
            AnonymousClass3K8 r0 = ((MediaComposerActivity) A1a).A0h;
            if (r0 != null) {
                r0.A02(r2, r12);
            }
        }
    }

    public static void A0A(ImageComposerFragment imageComposerFragment, boolean z, boolean z2) {
        AnonymousClass6WR r0 = imageComposerFragment.A05;
        if (z) {
            r0.A04();
        } else {
            r0.A07(z2);
        }
        AnonymousClass01I A0h = imageComposerFragment.A0h();
        if (A0h instanceof C157367cq) {
            boolean z3 = !z;
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) ((C157367cq) A0h);
            C146636vv r2 = mediaComposerActivity.A0u;
            boolean A0B2 = mediaComposerActivity.A0s.A0B();
            C119805qU r02 = r2.A04;
            if (z3) {
                if (A0B2) {
                    FilterSwipeView filterSwipeView = r02.A01;
                    TextView textView = filterSwipeView.A00;
                    if (textView.getVisibility() == 0) {
                        AlphaAnimation A0L = C36371kC.A0L();
                        A0L.setDuration(300);
                        textView.startAnimation(A0L);
                        filterSwipeView.setFilterSwipeTextVisibility(4);
                    }
                }
            } else if (A0B2) {
                FilterSwipeView filterSwipeView2 = r02.A01;
                TextView textView2 = filterSwipeView2.A00;
                if (textView2.getVisibility() == 4) {
                    filterSwipeView2.setFilterSwipeTextVisibility(0);
                    AlphaAnimation A0D = C36351kA.A0D();
                    A0D.setDuration(300);
                    textView2.startAnimation(A0D);
                }
            }
        }
    }

    public void A1J() {
        C06570Uc r1;
        this.A04.A01();
        AnonymousClass6WR r2 = this.A05;
        r2.A04 = null;
        r2.A03 = null;
        r2.A02 = null;
        ((C02460Ak) r2.A0K.getLayoutParams()).A00((AnonymousClass0XL) null);
        BottomSheetBehavior bottomSheetBehavior = r2.A07;
        if (!(bottomSheetBehavior == null || (r1 = r2.A06) == null)) {
            bottomSheetBehavior.A0s.remove(r1);
        }
        AnonymousClass6WR.A00(r2);
        C160827le A1a = A1a();
        if (A1a != null) {
            AnonymousClass3K8 r12 = ((MediaComposerActivity) A1a).A0h;
            if (r12 != null) {
                AnonymousClass4TB r0 = this.A0A;
                if (r0 != null) {
                    r12.A01(r0);
                }
                AnonymousClass4TB r02 = this.A0B;
                if (r02 != null) {
                    r12.A01(r02);
                }
            }
            super.A1J();
        }
    }

    public void A1R(Bundle bundle) {
        bundle.putBoolean("handle-crop-image-result", this.A07);
    }

    public boolean A1k() {
        if (AnonymousClass6WR.A03(this.A05) || super.A1k()) {
            return true;
        }
        return false;
    }

    public void A1m(float f, boolean z) {
        ImagePreviewContentLayout imagePreviewContentLayout = this.A04;
        if (z) {
            C90514aH.A0R(imagePreviewContentLayout.animate(), f).setDuration(200);
            C146806wC r0 = this.A0E;
            if (r0 != null) {
                C90514aH.A0R(r0.A0N.animate(), f).setDuration(200);
                return;
            }
            return;
        }
        imagePreviewContentLayout.setScaleX(f);
        this.A04.setScaleY(f);
        C146806wC r02 = this.A0E;
        if (r02 != null) {
            DoodleView doodleView = r02.A0N;
            doodleView.setScaleX(f);
            doodleView.setScaleY(f);
        }
    }

    public void A1n(int i, boolean z) {
        float bottom = (float) this.A04.getBottom();
        float min = Math.min(1.0f - ((bottom - ((float) i)) / bottom), 1.0f);
        float A012 = C36441kJ.A01(this.A04) / 2.0f;
        float intrinsicWidth = (((float) C36341k9.A0G(this).getDisplayMetrics().widthPixels) / ((float) this.A06.getDrawable().getIntrinsicWidth())) * ((float) this.A06.getDrawable().getIntrinsicHeight());
        float A002 = C90524aI.A00(intrinsicWidth, 2.0f, Math.max(0.0f, C36441kJ.A02(this.A04) - intrinsicWidth));
        this.A04.setPivotX(A012);
        this.A04.setPivotY(A002);
        C146806wC r0 = this.A0E;
        if (r0 != null) {
            DoodleView doodleView = r0.A0N;
            doodleView.setPivotX(A012);
            doodleView.setPivotY(A002);
        }
        A1m(min, z);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1S(Bundle bundle, View view) {
        C160827le A1a;
        View view2 = view;
        this.A04 = (ImagePreviewContentLayout) view.findViewById(R.id.media_content);
        super.A1S(bundle, view);
        Uri uri = this.A00;
        if (uri != null && (A1a = A1a()) != null) {
            C135306cU r8 = new C135306cU(this);
            int A012 = C132366Tg.A01(uri, A1a).A01();
            AnonymousClass16L r4 = this.A02;
            C19770wU r10 = this.A0R;
            C1032954s r7 = this.A03;
            C18820ts r6 = this.A07;
            C19420v0 r5 = this.A06;
            this.A05 = new AnonymousClass6WR(this.A00, view2, A0i(), r4, r5, r6, r7, r8, this.A0E, r10, A012);
            this.A06 = (PhotoView) view.findViewById(R.id.photo);
            C146806wC r1 = this.A0E;
            if (r1 != null) {
                this.A04.A00 = r1;
            }
            ImagePreviewContentLayout imagePreviewContentLayout = this.A04;
            imagePreviewContentLayout.A01 = new C146716w3(this);
            C135466ck.A00(imagePreviewContentLayout, this, 11);
            if (bundle == null || !bundle.getBoolean("handle-crop-image-result", false)) {
                A08(bundle, this);
            }
            if (this.A00 == null) {
                A09(this);
            }
        }
    }

    public void A1g(Rect rect) {
        super.A1g(rect);
        if (this.A0F != null) {
            AnonymousClass6WR r4 = this.A05;
            if (!rect.equals(r4.A05)) {
                r4.A05 = new Rect(0, rect.top, 0, rect.bottom);
            }
        }
    }

    public void A1h(AnonymousClass6VT r8, C146636vv r9, C129126Fh r10) {
        super.A1h(r8, r9, r10);
        TitleBarView titleBarView = r10.A0I;
        ImageView imageView = titleBarView.A07;
        if (imageView == null) {
            throw C36331k8.A0d("penTool");
        }
        if (!imageView.isSelected()) {
            ImageView imageView2 = titleBarView.A08;
            if (imageView2 == null) {
                throw C36331k8.A0d("shapeTool");
            } else if (!imageView2.isSelected()) {
                WaTextView waTextView = titleBarView.A0D;
                if (waTextView == null) {
                    throw C36331k8.A0d("textTool");
                } else if (!waTextView.isSelected()) {
                    if (r8.A0B()) {
                        AnonymousClass6WR r4 = this.A05;
                        if (r4.A07 == null) {
                            r4.A07 = new C99244su(r4);
                            View view = r4.A0K;
                            BottomSheetBehavior bottomSheetBehavior = r4.A07;
                            ((C02460Ak) view.getLayoutParams()).A00(bottomSheetBehavior);
                            C162607or r0 = new C162607or(r4, 2);
                            r4.A06 = r0;
                            bottomSheetBehavior.A0Z(r0);
                            if (r4.A07.A0J == 3) {
                                r4.A06.A03(view, 3);
                            }
                            C164757sK.A00(r4.A0N.getViewTreeObserver(), r4, 14);
                        }
                    }
                    boolean A0B2 = r8.A0B();
                    C119805qU r02 = r9.A04;
                    if (A0B2) {
                        FilterSwipeView filterSwipeView = r02.A01;
                        TextView textView = filterSwipeView.A00;
                        if (textView.getVisibility() != 0) {
                            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
                            translateAnimation.setDuration(1);
                            AnimationSet animationSet = new AnimationSet(false);
                            AlphaAnimation A0D = C36351kA.A0D();
                            A0D.setDuration(300);
                            animationSet.addAnimation(A0D);
                            animationSet.addAnimation(translateAnimation);
                            textView.startAnimation(animationSet);
                        }
                        filterSwipeView.setFilterSwipeTextVisibility(0);
                    }
                }
            }
        }
        AnonymousClass6WR r1 = this.A05;
        if (!r1.A09) {
            AnonymousClass6WR.A01(r1);
        }
        C96014me r03 = r1.A08;
        if (r03 == null) {
            r1.A0J.postDelayed(r1.A0W, 500);
        } else {
            r03.A06();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass6WR r2 = this.A05;
        if (r2.A07 != null) {
            C164757sK.A00(r2.A0N.getViewTreeObserver(), r2, 15);
        }
    }
}
