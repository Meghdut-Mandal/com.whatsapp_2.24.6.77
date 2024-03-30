package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.util.Log;

/* renamed from: X.6WR  reason: invalid class name */
public class AnonymousClass6WR {
    public float A00;
    public int A01;
    public Bitmap A02;
    public Bitmap A03;
    public Bitmap A04;
    public Rect A05;
    public C06570Uc A06;
    public BottomSheetBehavior A07;
    public C96014me A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final C18820ts A0G;
    public final int A0H;
    public final int A0I;
    public final Handler A0J = C36341k9.A0H();
    public final View A0K;
    public final View A0L;
    public final View A0M;
    public final CoordinatorLayout A0N;
    public final C06360Th A0O;
    public final RecyclerView A0P;
    public final AnonymousClass1PM A0Q;
    public final C19420v0 A0R;
    public final C1032954s A0S;
    public final C135306cU A0T;
    public final C146806wC A0U;
    public final C19930wk A0V;
    public final Runnable A0W;
    public final String A0X;
    public final AnonymousClass01I A0Y;

    public AnonymousClass6WR(Uri uri, View view, AnonymousClass01I r11, AnonymousClass16L r12, C19420v0 r13, C18820ts r14, C1032954s r15, C135306cU r16, C146806wC r17, C19770wU r18, int i) {
        this.A0Y = r11;
        this.A0G = r14;
        this.A0R = r13;
        this.A0L = view;
        this.A0T = r16;
        this.A01 = i;
        this.A0S = r15;
        this.A0U = r17;
        this.A0Q = r12.A02();
        this.A0V = C36411kG.A0r(r18);
        this.A0O = new C06360Th(view.getContext(), new C162397oW(this, 2));
        this.A0N = (CoordinatorLayout) C012005e.A02(this.A0L, R.id.filter_sheet_container);
        this.A0K = C012005e.A02(this.A0L, R.id.filter_bottom_sheet);
        this.A0P = C90504aG.A0J(this.A0L, R.id.filter_selector);
        this.A0M = C012005e.A02(this.A0L, R.id.media_content);
        this.A00 = 0.28f;
        this.A0X = AnonymousClass000.A0q("-filter", C36381kD.A11(uri));
        this.A0I = r11.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0H = r11.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0W = new C1503474x((Object) r15, (Object) this, (Object) r11, (Object) view, 49);
    }

    public static void A00(AnonymousClass6WR r5) {
        C96014me r52 = r5.A08;
        if (r52 != null) {
            int i = 0;
            while (true) {
                AnonymousClass6WR r2 = r52.A09;
                RecyclerView recyclerView = r2.A0P;
                if (i < recyclerView.getChildCount()) {
                    C97054oK r0 = (C97054oK) recyclerView.A0S(recyclerView.getChildAt(i));
                    if (r0 != null) {
                        ImageView imageView = r0.A02;
                        imageView.setBackgroundResource(0);
                        imageView.setImageDrawable((Drawable) null);
                    }
                    i++;
                } else {
                    new C106855Lp(r52.A01).A02.executeOnExecutor(r2.A0V, new Void[0]);
                    return;
                }
            }
        }
    }

    public static void A01(AnonymousClass6WR r5) {
        if (r5.A04 != null && !r5.A09) {
            AnonymousClass01I r2 = r5.A0Y;
            if (r2.A06.A02 != AnonymousClass01P.DESTROYED) {
                new C162937pO(r2, r5).A02.executeOnExecutor(r5.A0V, new Void[0]);
                r5.A09 = true;
            }
        }
    }

    public static void A02(AnonymousClass6WR r6) {
        Rect rect;
        RecyclerView recyclerView = r6.A0P;
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(recyclerView);
        if (A0a != null) {
            Rect rect2 = r6.A05;
            if (rect2 != null) {
                A0a.leftMargin = rect2.left;
                A0a.rightMargin = rect2.right;
                A0a.topMargin = rect2.top;
                A0a.bottomMargin = rect2.bottom;
            }
            recyclerView.setLayoutParams(A0a);
            recyclerView.A0U = true;
        }
        View view = r6.A0L;
        int width = view.getWidth();
        int height = view.getHeight();
        int dimensionPixelSize = r6.A0Y.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        float f = 0.5f;
        if (width < height) {
            f = 0.28f;
        }
        r6.A00 = f;
        BottomSheetBehavior bottomSheetBehavior = r6.A07;
        if (!(bottomSheetBehavior == null || (rect = r6.A05) == null)) {
            bottomSheetBehavior.A0Y((height - dimensionPixelSize) - rect.bottom, false);
        }
        float f2 = ((float) width) / 2.0f;
        float height2 = ((float) (height - recyclerView.getHeight())) / 2.0f;
        View view2 = r6.A0M;
        view2.setPivotX(f2);
        view2.setPivotY(height2);
        C146806wC r2 = r6.A0U;
        if (r2 != null) {
            DoodleView doodleView = r2.A0N;
            doodleView.setPivotX(f2);
            doodleView.setPivotY(height2);
        }
        BottomSheetBehavior bottomSheetBehavior2 = r6.A07;
        if (bottomSheetBehavior2 != null && bottomSheetBehavior2.A0J == 3) {
            float f3 = 1.0f - r6.A00;
            view2.setScaleX(f3);
            view2.setScaleY(f3);
            if (r2 != null) {
                DoodleView doodleView2 = r2.A0N;
                doodleView2.setScaleX(f3);
                doodleView2.setScaleY(f3);
            }
        }
    }

    public static boolean A03(AnonymousClass6WR r4) {
        BottomSheetBehavior bottomSheetBehavior = r4.A07;
        if (bottomSheetBehavior == null || bottomSheetBehavior.A0J == 4 || r4.A0F) {
            return false;
        }
        C06570Uc r2 = r4.A06;
        if (r2 != null) {
            r2.A03(r4.A0K, 1);
        }
        BottomSheetBehavior bottomSheetBehavior2 = r4.A07;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.A0W(4);
        }
        r4.A0F = true;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r2 == 3) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r4 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r4.A07
            if (r3 == 0) goto L_0x000d
            int r2 = r3.A0J
            r0 = 4
            if (r2 == r0) goto L_0x000d
            r0 = 3
            r1 = 0
            if (r2 != r0) goto L_0x000e
        L_0x000d:
            r1 = 1
        L_0x000e:
            r2 = 0
            if (r1 == 0) goto L_0x001f
            if (r3 == 0) goto L_0x0019
            int r1 = r3.A0J
            r0 = 3
            if (r1 != r0) goto L_0x0019
            return
        L_0x0019:
            android.view.View r0 = r4.A0K
            r0.setVisibility(r2)
            return
        L_0x001f:
            r0 = 1
            r4.A0C = r0
            r4.A0A = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WR.A04():void");
    }

    public void A05() {
        AnonymousClass1PM r5 = this.A0Q;
        if (r5 != null && this.A04 != null) {
            String str = this.A0X;
            Bitmap bitmap = (Bitmap) r5.A09(str);
            this.A03 = bitmap;
            if (bitmap == null) {
                int i = this.A01;
                if (i == 0) {
                    this.A03 = this.A04;
                    r5.A0C(str);
                    return;
                }
                Bitmap A002 = FilterUtils.A00(this.A04, this.A0S, i, true);
                this.A03 = A002;
                if (A002 == null) {
                    this.A03 = this.A04;
                    this.A01 = 0;
                    Log.w("FilterSelectorController/updateFilteredMediaBitmap/filter failed");
                    return;
                }
                r5.A0D(str, A002);
            }
        }
    }

    public void A06(Runnable runnable, Runnable runnable2, int i) {
        AnonymousClass1PM r2;
        if (this.A04 == null || (r2 = this.A0Q) == null) {
            Log.e("FilterSelectorController/startUpdateFilteredMediaBitmapTask/mediaBitmap is null");
            return;
        }
        String str = this.A0X;
        Bitmap bitmap = (Bitmap) r2.A09(str);
        if (i != this.A01 || i == 0) {
            r2.A0C(str);
        }
        if (i != 0) {
            new AnonymousClass5ML(bitmap, this.A0Y, this, runnable, runnable2, i).A02.executeOnExecutor(this.A0V, new Void[0]);
            return;
        }
        this.A03 = this.A04;
        if (runnable != null) {
            runnable.run();
        }
        this.A01 = 0;
        this.A0T.A00();
    }

    public void A07(boolean z) {
        int i;
        BottomSheetBehavior bottomSheetBehavior = this.A07;
        if (bottomSheetBehavior == null || (i = bottomSheetBehavior.A0J) == 4 || i == 3) {
            this.A0K.setVisibility(4);
            return;
        }
        this.A0C = false;
        this.A0A = true;
        this.A0B = z;
    }
}
