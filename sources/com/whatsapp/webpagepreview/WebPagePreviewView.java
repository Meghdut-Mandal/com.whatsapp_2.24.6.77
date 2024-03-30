package com.whatsapp.webpagepreview;

import X.AnonymousClass000;
import X.AnonymousClass04F;
import X.AnonymousClass076;
import X.AnonymousClass08I;
import X.AnonymousClass0BT;
import X.AnonymousClass1DU;
import X.AnonymousClass1DW;
import X.AnonymousClass1JZ;
import X.AnonymousClass28T;
import X.AnonymousClass28U;
import X.AnonymousClass2bV;
import X.AnonymousClass3MV;
import X.AnonymousClass3TF;
import X.AnonymousClass3TO;
import X.AnonymousClass3UF;
import X.AnonymousClass4V9;
import X.C012005e;
import X.C125045zE;
import X.C145166tS;
import X.C1501674f;
import X.C18750th;
import X.C18820ts;
import X.C20810yC;
import X.C224514j;
import X.C32731e6;
import X.C33511fU;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C36511kQ;
import X.C37351mE;
import X.C38381od;
import X.C601536r;
import X.C63783Lk;
import X.C63933Lz;
import X.C65783Tl;
import X.C89234Vt;
import X.C98394rM;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;

public class WebPagePreviewView extends C38381od implements AnonymousClass4V9 {
    public View A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public FrameLayout A04;
    public FrameLayout A05;
    public ImageView A06;
    public ImageView A07;
    public LinearLayout A08;
    public ProgressBar A09;
    public ShimmerFrameLayout A0A;
    public ShimmerFrameLayout A0B;
    public WaImageView A0C;
    public WaTextView A0D;
    public WaTextView A0E;
    public WaTextView A0F;
    public ThumbnailButton A0G;
    public ThumbnailButton A0H;
    public ThumbnailButton A0I;
    public C18820ts A0J;
    public C32731e6 A0K;
    public AnonymousClass1DW A0L;
    public C20810yC A0M;
    public AnonymousClass1DU A0N;
    public View A0O;
    public View A0P;
    public View A0Q;
    public View A0R;
    public ImageView A0S;
    public ImageView A0T = null;
    public ProgressBar A0U;
    public TextView A0V;
    public final Handler A0W = C36341k9.A0H();
    public final int A0X = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
    public final int A0Y = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);

    public void A0N(AnonymousClass2bV r11, String str) {
        A0G();
        String A032 = this.A0N.A03(r11.A1Y());
        Set BFr = this.A0K.BFr(r11.A0L(), r11, str);
        byte[] A1c = r11.A1c();
        boolean A1V = AnonymousClass000.A1V(BFr);
        int i = r11.A01;
        A0G();
        A07(this.A0I, this, A032, A1c, -1, i, false, A1V, true);
        setImageThumbContentIndicator(i);
    }

    public void setVideoLargeLogo(int i) {
        if (i == 1 || i == 7) {
            this.A06.setVisibility(8);
            return;
        }
        this.A06.animate().cancel();
        this.A06.setVisibility(0);
        this.A06.setImageResource(AnonymousClass3TO.A00(i));
        this.A06.setAlpha(1.0f);
    }

    public static C125045zE A01(long j) {
        C98394rM r3 = new C98394rM();
        C125045zE r2 = r3.A00;
        r2.A0G = false;
        r3.A02(0.75f);
        r3.A06(0);
        r3.A06(j);
        r3.A03(0.3f);
        r3.A05(0.1f);
        r3.A07(300);
        r2.A03 = 0.0f;
        return r3.A01();
    }

    private void A02(int i) {
        A04(this.A0I, this, 0.0f, 500);
        A04(this.A0H, this, 1.0f, 500);
        if (this.A0M.A0E(2652) && i == 1) {
            A04(this.A0C, this, 1.0f, 500);
        }
    }

    public static void A04(View view, WebPagePreviewView webPagePreviewView, float f, int i) {
        view.animate().alpha(f).setDuration((long) i).setListener(new C36511kQ(view, webPagePreviewView, f)).setInterpolator(new AccelerateDecelerateInterpolator());
    }

    public static void A06(C145166tS r13, WebPagePreviewView webPagePreviewView, boolean z) {
        String str;
        int i;
        String str2 = r13.A0F;
        String str3 = r13.A0C;
        if (TextUtils.isEmpty(r13.A09)) {
            str = r13.A0Z;
        } else {
            str = r13.A09;
        }
        String str4 = r13.A0Z;
        Integer num = r13.A07;
        C601536r r0 = r13.A05;
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = -1;
        }
        A0A(webPagePreviewView, num, str2, str3, str, str4, (List) null, i, false, r13 instanceof AnonymousClass28T, false);
        if (z) {
            AlphaAnimation A0D2 = C36351kA.A0D();
            A0D2.setDuration(250);
            C36381kD.A1C(A0D2);
            C89234Vt.A00(A0D2, webPagePreviewView, 18);
            webPagePreviewView.A08.startAnimation(A0D2);
            return;
        }
        webPagePreviewView.A08.animate().setListener((Animator.AnimatorListener) null).cancel();
        webPagePreviewView.A08.setAlpha(1.0f);
        webPagePreviewView.A08.setVisibility(0);
    }

    public static void A08(WebPagePreviewView webPagePreviewView) {
        webPagePreviewView.A0W.removeCallbacksAndMessages((Object) null);
        webPagePreviewView.A0A.A01();
        webPagePreviewView.A0A.setBackground((Drawable) null);
    }

    public static void A09(WebPagePreviewView webPagePreviewView) {
        webPagePreviewView.A0B.A05(A01(1000));
        ShimmerFrameLayout shimmerFrameLayout = webPagePreviewView.A0B;
        Handler handler = webPagePreviewView.A0W;
        handler.removeCallbacksAndMessages((Object) null);
        handler.postDelayed(new C1501674f(shimmerFrameLayout, 10), 300);
    }

    public static void A0A(WebPagePreviewView webPagePreviewView, Integer num, String str, String str2, String str3, String str4, List list, int i, boolean z, boolean z2, boolean z3) {
        String str5;
        boolean A0C2;
        boolean A0G2 = webPagePreviewView.A0L.A0G(str3);
        boolean A012 = C63933Lz.A01(str4);
        boolean A0F2 = webPagePreviewView.A0L.A0F(str4);
        if (A012) {
            str2 = AnonymousClass3MV.A00(webPagePreviewView.getContext(), num, str2, z3);
        }
        if (A0F2 && str4 != null) {
            List<String> pathSegments = Uri.parse(str4).getPathSegments();
            if (pathSegments.size() > 0) {
                boolean equals = ((String) C36391kE.A0t(pathSegments)).equals("video");
                Context context = webPagePreviewView.getContext();
                int i2 = R.string.f12nameremoved;
                if (equals) {
                    i2 = R.string.f12nameremoved;
                }
                String string = context.getString(i2);
                if (string != null) {
                    str = string;
                }
            }
        }
        webPagePreviewView.setImageProgressBarVisibility(false);
        if (i > 0) {
            webPagePreviewView.A0E.setText(R.string.f12nameremoved);
            webPagePreviewView.A0D.setVisibility(8);
        } else {
            webPagePreviewView.setTitleAndSnippet(str, str2, z, list);
        }
        if (z2) {
            Context context2 = webPagePreviewView.getContext();
            StringBuilder sb = new StringBuilder(context2.getString(R.string.f12nameremoved));
            Drawable A022 = AnonymousClass3UF.A02(context2, R.drawable.msg_status_shop, R.color.f6nameremoved);
            WaTextView waTextView = webPagePreviewView.A0F;
            waTextView.setText(C37351mE.A02(waTextView.getPaint(), A022, sb));
        } else {
            if (A012 || A0G2 || A0F2 || TextUtils.isEmpty(str3)) {
                str5 = null;
            } else {
                str5 = C63783Lk.A00(webPagePreviewView.A0N, str3);
            }
            webPagePreviewView.setLinkHostname(str5);
        }
        webPagePreviewView.setLinkGifSize(i);
        LinearLayout linearLayout = webPagePreviewView.A08;
        if (A012) {
            A0C2 = C36351kA.A1Y(webPagePreviewView.A0J);
        } else {
            A0C2 = AnonymousClass1JZ.A0C(str);
        }
        AnonymousClass04F.A05(linearLayout, A0C2 ^ true ? 1 : 0);
    }

    public static void A0B(WebPagePreviewView webPagePreviewView, Integer num, String str, String str2, String str3, String str4, List list, byte[] bArr, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        boolean z7 = z;
        WebPagePreviewView webPagePreviewView2 = webPagePreviewView;
        Integer num2 = num;
        String str5 = str2;
        String str6 = str3;
        String str7 = str4;
        List list2 = list;
        int i3 = i;
        A0A(webPagePreviewView2, num2, str, str5, str6, str7, list2, i3, z7, z5, z6);
        if (!z3) {
            int i4 = i2;
            if (!z2 || z || i > 0) {
                webPagePreviewView.A0G();
                WebPagePreviewView webPagePreviewView3 = webPagePreviewView;
                String str8 = str7;
                A07(webPagePreviewView.A0I, webPagePreviewView3, str8, bArr, i3, i4, z4, z7, true);
                webPagePreviewView2.setImageThumbContentIndicator(i4);
                return;
            }
            webPagePreviewView.A0E();
            if (i4 == 2 || (i4 == 3 && webPagePreviewView.A0M.A0E(4272))) {
                webPagePreviewView.setExternalShareIconOverlayOnThumbnail(webPagePreviewView.A04);
                return;
            }
            return;
        }
        webPagePreviewView.A0H();
    }

    private void setExternalShareIconOverlayOnThumbnail(FrameLayout frameLayout) {
        ImageView imageView = this.A0T;
        if (imageView == null) {
            this.A0T = C36361kB.A0L(this);
            Drawable A002 = AnonymousClass0BT.A00(C36361kB.A09(this), getResources(), R.drawable.play_filled_32);
            this.A0T.setImageDrawable(A002);
            AnonymousClass076.A06(A002, -1);
            ShapeDrawable A0F2 = C36411kG.A0F();
            A0F2.getPaint().setColor(-16777216);
            C36431kI.A1L(A0F2.getPaint());
            A0F2.getPaint().setStrokeWidth(2.0f);
            A0F2.setAlpha(152);
            A0F2.setBounds(0, 0, 128, 128);
            this.A0T.setBackground(A0F2);
            this.A0T.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.A0T.setPadding(32, 32, 32, 32);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(128, 128);
            layoutParams.gravity = 17;
            frameLayout.addView(this.A0T, layoutParams);
            return;
        }
        imageView.setVisibility(0);
    }

    private void setImageThumbContentIndicator(int i) {
        if (this.A0M.A0E(2652)) {
            WaImageView waImageView = this.A0C;
            int i2 = 8;
            if (i == 1) {
                i2 = 0;
            }
            waImageView.setVisibility(i2);
        }
    }

    private void setImageThumbWithBitmap(Bitmap bitmap) {
        this.A0I.setImageBitmap(bitmap);
        this.A0I.setVisibility(0);
    }

    public void A0D() {
        this.A0W.removeCallbacksAndMessages((Object) null);
        this.A0B.A01();
        this.A0B.setVisibility(8);
        this.A0H.setVisibility(8);
    }

    public void A0E() {
        this.A05.setVisibility(8);
        this.A04.setVisibility(0);
        this.A0B.setVisibility(0);
        C38381od.A00(this.A0I, this, 8);
        ImageView imageView = this.A0T;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void A0F() {
        this.A0P.setVisibility(0);
        this.A05.setVisibility(8);
        this.A04.setVisibility(8);
        AnonymousClass1JZ.A05(this.A0E, this.A0J, 0, C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved));
    }

    public void A0G() {
        this.A05.setVisibility(8);
        this.A04.setVisibility(8);
        this.A0B.setVisibility(0);
        C38381od.A00(this.A0I, this, 0);
    }

    public void A0H() {
        this.A05.setVisibility(0);
        this.A04.setVisibility(8);
        this.A0B.setVisibility(0);
        C38381od.A00(this.A0I, this, 8);
    }

    public void A0I(float f, float f2, float f3, float f4) {
        Boolean bool = C18750th.A03;
        this.A09.setAlpha(f);
        this.A00.setAlpha(f2);
        this.A06.setAlpha(f2);
        this.A01.setAlpha(f3);
        this.A02.setAlpha(f4);
    }

    public void A0J(int i, int i2) {
        this.A04.getLayoutParams().width = i;
        C36411kG.A1A(this.A04, i2);
        this.A04.requestLayout();
    }

    public void A0M(C145166tS r18, List list, boolean z, boolean z2) {
        String str;
        int i;
        C145166tS r1 = r18;
        String str2 = r1.A0F;
        String str3 = r1.A0C;
        if (TextUtils.isEmpty(r1.A09)) {
            str = r1.A0Z;
        } else {
            str = r1.A09;
        }
        byte[] bArr = r1.A0Q;
        String str4 = r1.A0Z;
        Integer num = r1.A07;
        C601536r r0 = r1.A05;
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = -1;
        }
        boolean A0J2 = r1.A0J();
        A0B(this, num, str2, str3, str, str4, list, bArr, i, r1.A02, false, z, A0J2, r1 instanceof AnonymousClass28U, r1 instanceof AnonymousClass28T, z2);
    }

    public void A0O(boolean z, boolean z2) {
        ThumbnailButton thumbnailButton;
        if (z2) {
            thumbnailButton = this.A0H;
        } else {
            thumbnailButton = this.A0I;
        }
        int i = 0;
        thumbnailButton.setVisibility(C36351kA.A00(z ? 1 : 0));
        if (this.A0M.A0E(2652) && !z2) {
            WaImageView waImageView = this.A0C;
            if (!z) {
                i = 8;
            }
            waImageView.setVisibility(i);
        }
    }

    public int getTitleSnippetUrlLayoutHeight() {
        return this.A08.getHeight();
    }

    public void setImageCancelClickListener(View.OnClickListener onClickListener) {
        this.A0P.setOnClickListener(onClickListener);
    }

    public void setImageContentBackgroundResource(int i) {
        this.A03.setBackgroundResource(i);
    }

    public void setImageContentClickListener(View.OnClickListener onClickListener) {
        this.A03.setOnClickListener(onClickListener);
    }

    public void setImageContentEnabled(boolean z) {
        this.A03.setEnabled(z);
    }

    public void setImageContentMinimumHeight(int i) {
        this.A03.setMinimumHeight(i);
    }

    public void setImageLargeLogo(int i) {
        ImageView imageView = this.A0S;
        if (i != 0) {
            imageView.setVisibility(0);
            this.A0Q.setVisibility(0);
            ImageView imageView2 = this.A0S;
            int i2 = R.drawable.ic_pip_facebook;
            if (i != 1) {
                i2 = R.drawable.ic_pip_instagram;
                if (i != 2) {
                    i2 = -1;
                }
            }
            imageView2.setImageResource(i2);
            return;
        }
        imageView.setVisibility(8);
        this.A0Q.setVisibility(8);
    }

    public void setImageLargeThumbFrameHeight(int i) {
        C36411kG.A1A(this.A04, i);
    }

    public void setImageLargeThumbWithBackground(int i) {
        this.A0G.setBackgroundColor(i);
        this.A0G.setImageDrawable((Drawable) null);
    }

    public void setImageLargeThumbWithBitmap(Bitmap bitmap) {
        this.A0G.setImageBitmap(bitmap);
        this.A0G.setVisibility(0);
    }

    public void setImagePlayFrameVisibility(boolean z) {
        this.A0R.setVisibility(C36351kA.A00(z ? 1 : 0));
    }

    public void setImageProgressBarVisibility(boolean z) {
        this.A0U.setVisibility(C36351kA.A00(z ? 1 : 0));
    }

    public void setLargeThumbSizeWidthMatchParent(boolean z) {
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
            layoutParams.width = -1;
            this.A05.setLayoutParams(layoutParams);
            return;
        }
        this.A04.getLayoutParams().width = -1;
        this.A04.requestLayout();
    }

    public void setLinkGifSize(int i) {
        View view = this.A0O;
        if (i > 0) {
            view.setVisibility(0);
            this.A0V.setVisibility(0);
            this.A0V.setText(AnonymousClass3TF.A02(this.A0J, (long) i));
            return;
        }
        view.setVisibility(8);
        this.A0V.setVisibility(8);
    }

    public void setLinkSnippet(CharSequence charSequence) {
        WaTextView waTextView = this.A0D;
        if (charSequence == null) {
            waTextView.setVisibility(8);
            return;
        }
        waTextView.setVisibility(0);
        this.A0D.setText(charSequence);
    }

    public void setLinkTitle(CharSequence charSequence) {
        WaTextView waTextView = this.A0E;
        if (charSequence == null) {
            waTextView.setVisibility(8);
            return;
        }
        waTextView.setVisibility(0);
        this.A0E.setText(charSequence);
    }

    public void setLinkTitleTypeface(int i) {
        WaTextView waTextView = this.A0E;
        getContext();
        waTextView.setTypeface(C33511fU.A01(), i);
    }

    public void setVideoLargeThumbFrameHeight(int i) {
        C36411kG.A1A(this.A05, i);
    }

    public void setVideoLargeThumbWithBackground(int i) {
        this.A07.setBackgroundColor(i);
        this.A07.setImageDrawable((Drawable) null);
    }

    public void setVideoLargeThumbWithBitmap(Bitmap bitmap) {
        this.A07.setImageBitmap(bitmap);
        this.A07.setVisibility(0);
    }

    public WebPagePreviewView(Context context) {
        super(context);
        A03(context);
    }

    private void A03(Context context) {
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A03 = C36411kG.A0O(this, R.id.link_preview_content);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C012005e.A02(this, R.id.thumb_frame);
        this.A0B = shimmerFrameLayout;
        shimmerFrameLayout.A01();
        this.A0B.A05((C125045zE) null);
        this.A0I = (ThumbnailButton) C012005e.A02(this, R.id.thumb);
        this.A0H = (ThumbnailButton) C012005e.A02(this, R.id.thumb_cross_fade);
        this.A0C = C36431kI.A0X(this, R.id.thumb_content_indicator);
        this.A0R = C012005e.A02(this, R.id.play_frame_small);
        this.A0U = (ProgressBar) C012005e.A02(this, R.id.progress);
        this.A0P = C012005e.A02(this, R.id.cancel);
        this.A05 = C36441kJ.A0T(this, R.id.large_thumb_frame);
        this.A07 = C36401kF.A0G(this, R.id.large_thumb);
        this.A06 = C36401kF.A0G(this, R.id.logo_button);
        this.A09 = (ProgressBar) C012005e.A02(this, R.id.large_progress);
        this.A00 = C012005e.A02(this, R.id.play_frame);
        this.A01 = C012005e.A02(this, R.id.inline_indication);
        this.A02 = C012005e.A02(this, R.id.inline_layer);
        this.A04 = C36441kJ.A0T(this, R.id.webPagePreviewImageLarge_frame);
        this.A0G = (ThumbnailButton) C012005e.A02(this, R.id.webPagePreviewImageLarge_thumb);
        this.A0S = C36401kF.A0G(this, R.id.webPagePreviewImageLarge_logo_platform);
        this.A0Q = C012005e.A02(this, R.id.webPagePreviewImageLarge_logo_platform_shadow);
        this.A08 = (LinearLayout) C012005e.A02(this, R.id.titleSnippetUrlLayout);
        this.A0E = C36401kF.A0Q(this, R.id.title);
        this.A0D = C36401kF.A0Q(this, R.id.snippet);
        this.A0F = C36401kF.A0Q(this, R.id.url);
        this.A0O = C012005e.A02(this, R.id.gif_size_bullet);
        this.A0V = C36391kE.A0O(this, R.id.gif_size);
        ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) C012005e.A02(this, R.id.full_shimmer_link_preview);
        this.A0A = shimmerFrameLayout2;
        shimmerFrameLayout2.A01();
        this.A0A.A05((C125045zE) null);
        Drawable A012 = AnonymousClass08I.A01(C36381kD.A0H(context, R.drawable.balloon_incoming_frame).mutate());
        AnonymousClass076.A06(A012, C36351kA.A02(getContext(), context, R.attr.f4nameremoved, R.color.f6nameremoved));
        setForeground(A012);
        if (getId() == -1) {
            setId(R.id.link_preview_frame);
        }
    }

    private void A05(WaTextView waTextView, String str, List list, int i) {
        if (!TextUtils.isEmpty(str)) {
            if (str.length() > i) {
                str = str.substring(0, i);
            }
            waTextView.setText(C65783Tl.A01(C36431kI.A0A(waTextView, this, 0), this.A0J, str, list));
            return;
        }
        waTextView.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(com.whatsapp.components.button.ThumbnailButton r8, com.whatsapp.webpagepreview.WebPagePreviewView r9, java.lang.String r10, byte[] r11, int r12, int r13, boolean r14, boolean r15, boolean r16) {
        /*
            boolean r7 = X.C63933Lz.A01(r10)
            r0 = 0
            if (r7 == 0) goto L_0x0009
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0009:
            r8.A01 = r0
            r0 = 0
            r8.setContentDescription(r0)
            r6 = 1
            r2 = 0
            if (r15 != 0) goto L_0x00d6
            if (r12 <= 0) goto L_0x0098
            r9.setImageThumbWithGifDownloadDrawable(r8)
            r0 = r16 ^ 1
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0038
            com.whatsapp.components.button.ThumbnailButton r0 = r9.A0I
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r0 = r1.setListener(r0)
            r0.cancel()
            com.whatsapp.components.button.ThumbnailButton r0 = r9.A0I
            r0.setAlpha(r3)
            com.whatsapp.components.button.ThumbnailButton r1 = r9.A0I
            r0 = 8
            r1.setVisibility(r0)
        L_0x0038:
            android.view.ViewPropertyAnimator r1 = r8.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r0 = r1.setListener(r0)
            r0.cancel()
            r8.setAlpha(r3)
        L_0x0047:
            r5 = 0
        L_0x0048:
            r6 = 0
        L_0x0049:
            int r4 = r9.A0Y
            int r3 = r9.A0X
            if (r7 == 0) goto L_0x0080
            if (r16 == 0) goto L_0x0059
            int r0 = r4 * 2
            int r4 = r0 / 3
            int r0 = r3 * 2
            int r3 = r0 / 3
        L_0x0059:
            android.content.res.Resources r1 = X.C36341k9.A0F(r9)
            r0 = 2131166936(0x7f0706d8, float:1.7948131E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
        L_0x0066:
            r8.setScaleType(r0)
            r8.setPadding(r2, r2, r2, r2)
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r0.width = r4
            X.C36411kG.A1A(r8, r3)
            r8.requestLayout()
            if (r5 == 0) goto L_0x007f
            if (r16 != 0) goto L_0x007f
            r9.A02(r13)
        L_0x007f:
            return
        L_0x0080:
            if (r6 == 0) goto L_0x0090
            android.content.res.Resources r1 = X.C36341k9.A0F(r9)
            r0 = 2131166196(0x7f0703f4, float:1.794663E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            goto L_0x0066
        L_0x0090:
            if (r12 <= 0) goto L_0x0095
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            goto L_0x0066
        L_0x0095:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            goto L_0x0066
        L_0x0098:
            if (r11 == 0) goto L_0x00ce
            int r3 = r9.A0Y
            int r0 = r9.A0X
            X.6Kx r1 = new X.6Kx
            r1.<init>(r3, r0)
            r0 = 0
            X.5sn r0 = X.AnonymousClass6Y8.A08(r0, r1, r11, r2)
            android.graphics.Bitmap r1 = r0.A02
            if (r1 == 0) goto L_0x00ce
            int r0 = r1.getHeight()
            if (r0 == 0) goto L_0x00ce
            int r0 = r1.getWidth()
            if (r0 == 0) goto L_0x00ce
            if (r16 == 0) goto L_0x00bf
            r9.setImageThumbWithBitmap(r1)
        L_0x00bd:
            r5 = 1
            goto L_0x0048
        L_0x00bf:
            com.whatsapp.components.button.ThumbnailButton r0 = r9.A0H
            r0.setImageBitmap(r1)
            com.whatsapp.WaImageView r1 = r9.A0C
            r0 = 0
            r1.setAlpha(r0)
            r9.setImageThumbContentIndicator(r13)
            goto L_0x00bd
        L_0x00ce:
            if (r14 == 0) goto L_0x00d6
            r9.setImageThumbWithCtwaDrawable(r8)
            r5 = 1
            goto L_0x0049
        L_0x00d6:
            if (r16 == 0) goto L_0x00e7
            com.whatsapp.components.button.ThumbnailButton r1 = r9.A0I
            r0 = 0
            r1.setImageDrawable(r0)
            com.whatsapp.components.button.ThumbnailButton r1 = r9.A0I
            r0 = 8
            X.C38381od.A00(r1, r9, r0)
            goto L_0x0047
        L_0x00e7:
            r9.A0D()
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.webpagepreview.WebPagePreviewView.A07(com.whatsapp.components.button.ThumbnailButton, com.whatsapp.webpagepreview.WebPagePreviewView, java.lang.String, byte[], int, int, boolean, boolean, boolean):void");
    }

    private void setImageThumbWithCtwaDrawable(ThumbnailButton thumbnailButton) {
        Drawable A012 = AnonymousClass08I.A01(getResources().getDrawable(R.drawable.ic_group_invite_link));
        AnonymousClass076.A06(A012, getResources().getColor(R.color.f6nameremoved));
        thumbnailButton.setImageDrawable(A012);
        C36391kE.A1C(getResources(), thumbnailButton, C224514j.A00(thumbnailButton.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        thumbnailButton.setVisibility(0);
    }

    private void setImageThumbWithGifDownloadDrawable(ThumbnailButton thumbnailButton) {
        thumbnailButton.setImageDrawable(thumbnailButton.getResources().getDrawable(R.drawable.inline_gif_download));
        C36341k9.A0q(getContext(), thumbnailButton, R.color.f6nameremoved);
        C36331k8.A0q(getContext(), thumbnailButton, R.string.f12nameremoved);
        thumbnailButton.setVisibility(0);
    }

    private void setTitleAndSnippet(String str, String str2, boolean z, List list) {
        if ((!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) && !z) {
            A05(this.A0E, str, list, 150);
            A05(this.A0D, str2, list, 300);
            return;
        }
        this.A0E.setVisibility(8);
        this.A0D.setVisibility(8);
    }

    public void A0K(Bitmap bitmap, boolean z) {
        if (((long) bitmap.getWidth()) * ((long) bitmap.getHeight()) >= 5000000) {
            Log.e("webview/image too large", new Exception());
        }
        if (z) {
            setVideoLargeThumbWithBitmap(bitmap);
        } else {
            setImageLargeThumbWithBitmap(bitmap);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0.A00 <= 0) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0L(X.C145166tS r3) {
        /*
            r2 = this;
            A08(r2)
            X.36r r0 = r3.A05
            if (r0 == 0) goto L_0x000c
            int r0 = r0.A00
            r1 = 1
            if (r0 > 0) goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            r0 = 1
            A06(r3, r2, r0)
            if (r1 == 0) goto L_0x002f
            com.whatsapp.components.button.ThumbnailButton r0 = r2.A0H
            X.C36441kJ.A1D(r0)
            com.whatsapp.components.button.ThumbnailButton r1 = r2.A0H
            r0 = 0
            r1.setAlpha(r0)
            com.whatsapp.components.button.ThumbnailButton r1 = r2.A0H
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.components.button.ThumbnailButton r0 = r2.A0H
            r2.setImageThumbWithGifDownloadDrawable(r0)
            int r0 = r3.A02
            r2.A02(r0)
            return
        L_0x002f:
            A09(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.webpagepreview.WebPagePreviewView.A0L(X.6tS):void");
    }

    public ThumbnailButton getImageLargeThumb() {
        return this.A0G;
    }

    public ThumbnailButton getImageThumb() {
        return this.A0I;
    }

    public WaTextView getSnippetView() {
        return this.A0D;
    }

    public WaTextView getUrlView() {
        return this.A0F;
    }

    public ImageView getVideoLargeThumb() {
        return this.A07;
    }

    public FrameLayout getVideoLargeThumbFrame() {
        return this.A05;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0W.removeCallbacksAndMessages((Object) null);
    }

    public void setLinkHostname(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A0F.setVisibility(8);
            return;
        }
        this.A0F.setVisibility(0);
        if (str.length() > 150) {
            str = str.substring(0, 150);
        }
        this.A0F.setText(str);
    }

    public WebPagePreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03(context);
    }

    public WebPagePreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03(context);
    }
}
