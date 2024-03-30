package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.WaMapView;

/* renamed from: X.2IF  reason: invalid class name */
public class AnonymousClass2IF extends C174768Yj {
    public AnonymousClass1Pp A00;
    public AnonymousClass1P5 A01;
    public final ImageView A02 = C36391kE.A0N(this, R.id.thumb);
    public final View A03;
    public final View A04 = findViewById(R.id.control_frame);
    public final View A05 = findViewById(R.id.live_location_label_holder);
    public final View A06;
    public final View A07 = findViewById(R.id.progress_bar);
    public final View A08;
    public final View A09;
    public final View A0A = findViewById(R.id.thumb_button);
    public final FrameLayout A0B;
    public final ImageView A0C;
    public final ImageView A0D;
    public final ImageView A0E;
    public final TextView A0F = C36391kE.A0P(this, R.id.control_btn);
    public final TextView A0G = C36391kE.A0P(this, R.id.live_location_label);
    public final TextEmojiLabel A0H;
    public final TextEmojiLabel A0I;
    public final ThumbnailButton A0J;
    public final AnonymousClass1RY A0K;
    public final WaMapView A0L;

    public void A1Y() {
        AnonymousClass2IR.A0d(this, false);
        A0B();
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    private void A0B() {
        long A0I2;
        ImageView imageView;
        ImageView imageView2;
        View view;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int A032;
        Resources resources;
        int i;
        int dimensionPixelSize3;
        AnonymousClass141 A012;
        C46902br r10 = (C46902br) this.A0K;
        View view2 = this.A0A;
        View.OnLongClickListener onLongClickListener = this.A2W;
        view2.setOnLongClickListener(onLongClickListener);
        TextEmojiLabel textEmojiLabel = this.A0I;
        C48812i6.A00(textEmojiLabel, r10, this, 44);
        textEmojiLabel.setOnLongClickListener(onLongClickListener);
        View view3 = this.A04;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.A09;
        if (view4 != null) {
            ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(view4);
            A0a.topMargin = 0;
            A0a.bottomMargin = 0;
        }
        this.A0B.setVisibility(0);
        long A002 = C19970wo.A00(this.A19);
        AnonymousClass1P5 r1 = this.A01;
        C18740tg.A06(r1);
        boolean z = r10.A1J.A02;
        if (z) {
            A0I2 = r1.A0J(r10);
        } else {
            A0I2 = r1.A0I(r10);
        }
        boolean A022 = AnonymousClass3ST.A02(this.A19, r10, A0I2);
        boolean A0L2 = this.A0T.A0L();
        View view5 = this.A06;
        if (view5 != null) {
            view5.setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        }
        if (!A022 || A0L2) {
            this.A0C.setVisibility(8);
            imageView = this.A0D;
            imageView.setVisibility(8);
            imageView2 = this.A0E;
            imageView2.setVisibility(8);
        } else {
            this.A0C.setVisibility(0);
            imageView = this.A0D;
            imageView.setVisibility(0);
            imageView2 = this.A0E;
            imageView2.setVisibility(0);
        }
        imageView.clearAnimation();
        imageView2.clearAnimation();
        if (A022 && A0I2 > A002 && !A0L2) {
            Boolean bool = C18750th.A03;
            AlphaAnimation A0D2 = C36351kA.A0D();
            C36381kD.A1D(A0D2, 1000);
            A0D2.setRepeatCount(-1);
            A0D2.setRepeatMode(2);
            C89234Vt.A00(A0D2, this, 7);
            AlphaAnimation A0D3 = C36351kA.A0D();
            A0D3.setDuration(1000);
            A0D3.setStartOffset(300);
            A0D3.setInterpolator(new DecelerateInterpolator());
            A0D3.setRepeatCount(-1);
            A0D3.setRepeatMode(2);
            imageView.startAnimation(A0D2);
            imageView2.startAnimation(A0D3);
        }
        Context A0A2 = C36431kI.A0A(this.A05, this, 0);
        C19730wQ r2 = this.A0T;
        AnonymousClass2XH r12 = this.A0I;
        C18740tg.A06(r12);
        View.OnClickListener A003 = AnonymousClass3ST.A00(A0A2, r2, r12, r10, A022);
        if (!A022 || A0L2) {
            view = this.A08;
            view.setVisibility(8);
            textEmojiLabel.setVisibility(8);
        } else {
            view = this.A08;
            view.setVisibility(0);
            textEmojiLabel.setVisibility(0);
        }
        view2.setOnClickListener(A003);
        String A013 = AnonymousClass3ST.A01(getContext(), this.A0T, this.A19, this.A0E, this.A01, r10, A022);
        TextView textView = this.A0G;
        TextView textView2 = textView;
        textView.setText(A013);
        textView.setTextColor(getSecondaryTextColor());
        View view6 = this.A03;
        if (view6 != null) {
            view6.setVisibility(8);
        }
        WaMapView waMapView = this.A0L;
        WaMapView waMapView2 = waMapView;
        AnonymousClass2XH r122 = this.A0I;
        C18740tg.A06(r122);
        waMapView.A02(r122, r10, A022);
        if (waMapView2.getVisibility() == 0) {
            ThumbnailButton thumbnailButton = this.A0J;
            C19730wQ r13 = this.A0T;
            AnonymousClass1Pp r14 = this.A00;
            C18740tg.A06(r14);
            AnonymousClass1RY r123 = this.A0K;
            AnonymousClass1A5 r15 = this.A1C;
            if (z) {
                A012 = C36381kD.A0T(r13);
            } else {
                UserJid A0L3 = r10.A0L();
                if (A0L3 != null) {
                    A012 = r15.A01(A0L3);
                } else {
                    r14.A06(thumbnailButton, R.drawable.avatar_contact);
                }
            }
            r123.A08(thumbnailButton, A012);
        }
        if (!TextUtils.isEmpty(r10.A03)) {
            setMessageText(r10.A03, this.A0H, r10);
            view.setVisibility(C36351kA.A00(A022 ? 1 : 0));
            Resources resources2 = getResources();
            i = R.dimen.f7nameremoved;
            dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.f7nameremoved);
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            A032 = C36371kC.A03(this, R.dimen.f7nameremoved);
            resources = getResources();
        } else {
            setMessageText("", this.A0H, r10);
            view.setVisibility(8);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            A032 = C36371kC.A03(this, R.dimen.f7nameremoved);
            resources = getResources();
            i = R.dimen.f7nameremoved;
        }
        textEmojiLabel.setPadding(dimensionPixelSize, dimensionPixelSize2, A032, resources.getDimensionPixelSize(i));
        if (view4 != null) {
            boolean isEmpty = TextUtils.isEmpty(r10.A03);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            if (isEmpty) {
                layoutParams.addRule(11);
                layoutParams.addRule(8, R.id.live_location_info_holder);
                view4.setLayoutParams(layoutParams);
                ViewGroup viewGroup = this.A07;
                C36331k8.A0x(viewGroup);
                dimensionPixelSize3 = C36441kJ.A06(getResources(), R.dimen.f7nameremoved, viewGroup.getMeasuredWidth());
            } else {
                layoutParams.addRule(11);
                layoutParams.addRule(3, R.id.live_location_info_holder);
                view4.setLayoutParams(layoutParams);
                dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            }
            boolean A1Y = C36351kA.A1Y(this.A0E);
            ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(textView2);
            if (A1Y) {
                A0a2.rightMargin = dimensionPixelSize3;
            } else {
                A0a2.leftMargin = dimensionPixelSize3;
            }
        }
        TextView textView3 = this.A0F;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        int i2 = r10.A02;
        if (i2 == 1) {
            View view7 = this.A07;
            if (z) {
                view7.setVisibility(0);
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                view2.setOnClickListener((View.OnClickListener) null);
            } else {
                view7.setVisibility(0);
            }
        } else if (!z || i2 == 2 || !A022) {
            View view8 = this.A07;
            if (view8 != null) {
                view8.setVisibility(8);
            }
        } else {
            View view9 = this.A07;
            if (view9 != null) {
                view9.setVisibility(8);
            }
            if (textView3 != null && !this.A0T.A0L()) {
                textView3.setVisibility(0);
                textView3.setText(R.string.f12nameremoved);
                C48742hy.A01(textView3, this, 3);
            }
            if (view3 != null) {
                view3.setVisibility(0);
            }
            view.setVisibility(8);
            textEmojiLabel.setVisibility(8);
            if (!this.A0T.A0L()) {
                C48742hy.A01(view2, this, 3);
            }
        }
        if (waMapView2.getVisibility() == 8) {
            this.A1y.A0D(this.A02, r10, new C53702rk(this, 5));
        }
    }

    public void A1u(AnonymousClass11F r4) {
        AnonymousClass3T1 r1 = this.A0K;
        if (!r1.A1J.A02) {
            UserJid A0L2 = r1.A0L();
            if (r4.equals(A0L2)) {
                this.A0K.A08(this.A0J, this.A1C.A01(A0L2));
            }
        } else if (this.A0T.A0M(r4)) {
            this.A0K.A08(this.A0J, C36381kD.A0T(this.A0T));
        }
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A0B();
        }
    }

    public C46902br getFMessage() {
        return (C46902br) this.A0K;
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof C46902br);
        this.A0K = r2;
    }

    public AnonymousClass2IF(Context context, AnonymousClass1RY r5, C89004Uw r6, C46902br r7) {
        super(context, r6, r7);
        this.A0K = r5;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.map_frame);
        this.A0B = frameLayout;
        this.A0J = (ThumbnailButton) findViewById(R.id.contact_thumbnail);
        this.A03 = findViewById(R.id.contact_thumbnail_overlay);
        this.A06 = findViewById(R.id.message_info_holder);
        this.A09 = findViewById(R.id.text_and_date);
        this.A08 = findViewById(R.id.btn_divider);
        this.A0I = C36401kF.A0P(this, R.id.stop_share_btn);
        TextEmojiLabel A0P = C36401kF.A0P(this, R.id.live_location_caption);
        this.A0H = A0P;
        this.A0C = C36391kE.A0N(this, R.id.live_location_icon_1);
        this.A0D = C36391kE.A0N(this, R.id.live_location_icon_2);
        this.A0E = C36391kE.A0N(this, R.id.live_location_icon_3);
        this.A0L = (WaMapView) findViewById(R.id.map_holder);
        C36321k7.A0r(this.A0G, A0P);
        if (frameLayout != null) {
            frameLayout.setForeground(getLiveLocationFrameForegroundDrawable());
        }
        A0B();
    }

    public boolean A1E() {
        return C37541mm.A08(this);
    }

    public void dispatchSetPressed(boolean z) {
        super.dispatchSetPressed(z);
        FrameLayout frameLayout = this.A0B;
        if (frameLayout != null) {
            frameLayout.setForeground(getLiveLocationFrameForegroundDrawable());
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public Drawable getLiveLocationFrameForegroundDrawable() {
        if (isPressed()) {
            Context context = getContext();
            boolean z = this.A0K.A1J.A02;
            Context context2 = getContext();
            int i = R.attr.f4nameremoved;
            int i2 = R.color.f6nameremoved;
            if (z) {
                i = R.attr.f4nameremoved;
                i2 = R.color.f6nameremoved;
            }
            return AnonymousClass3UF.A02(context, R.drawable.balloon_live_location_incoming_frame, C224514j.A00(context2, i, i2));
        }
        boolean z2 = this.A0K.A1J.A02;
        int i3 = R.drawable.balloon_live_location_incoming_frame;
        if (z2) {
            i3 = R.drawable.balloon_live_location_outgoing_frame;
        }
        Context context3 = getContext();
        boolean z3 = this.A0K.A1J.A02;
        Context context4 = getContext();
        int i4 = R.attr.f4nameremoved;
        int i5 = R.color.f6nameremoved;
        if (z3) {
            i4 = R.attr.f4nameremoved;
            i5 = R.color.f6nameremoved;
        }
        return AnonymousClass3UF.A02(context3, i3, C224514j.A00(context4, i4, i5));
    }

    public int getMainChildMaxWidth() {
        if (C37541mm.A07(this)) {
            return 0;
        }
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }
}
