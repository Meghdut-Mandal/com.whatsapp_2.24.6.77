package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.chatinfo.view.custom.BusinessChatInfoLayout;
import com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2;
import com.whatsapp.components.ScalingFrameLayout;
import com.whatsapp.wds.components.topbar.WDSToolbar;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.2E6  reason: invalid class name */
public abstract class AnonymousClass2E6 extends AnonymousClass2Vw {
    public int A00;
    public CharSequence A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public View.OnClickListener A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public ListView A0I;
    public TextView A0J;
    public Toolbar A0K;
    public AnonymousClass1LI A0L;
    public AnonymousClass3SF A0M;
    public AnonymousClass4PY A0N;
    public ScalingFrameLayout A0O;
    public AnonymousClass171 A0P;
    public C18820ts A0Q;
    public AnonymousClass1H2 A0R;
    public C20810yC A0S;
    public boolean A0T = false;
    public boolean A0U;
    public View A0V;
    public TextView A0W;
    public TextEmojiLabel A0X;
    public CharSequence A0Y;
    public String A0Z;
    public final ViewTreeObserver.OnGlobalLayoutListener A0a = new C90104Zc(this, 7);

    public AnonymousClass2E6(Context context) {
        super(context, (AttributeSet) null, 0);
        A03(context);
    }

    public int A07(int i) {
        ImageView imageView;
        ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) this;
        if (!(chatInfoLayoutV2 instanceof BusinessChatInfoLayout) || (imageView = chatInfoLayoutV2.A02) == null || imageView.getDrawable() == null) {
            return chatInfoLayoutV2.A08(i);
        }
        return (int) (((float) i) * 0.5625f);
    }

    public abstract int A08(int i);

    public void A09() {
        this.A00 = 0;
        if (this.A0F.getVisibility() != 0) {
            this.A0F.setVisibility(0);
        }
    }

    public void A0G(View view, View view2, Adapter adapter) {
        this.A0I.getViewTreeObserver().addOnGlobalLayoutListener(new C90134Zf(view, view2, adapter, this, 0));
    }

    public abstract int getToolbarColorResId();

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        View view2;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingTop = getPaddingTop();
        int paddingBottom = i6 - getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        if (i6 > i5 || this.A0T) {
            View view3 = this.A0D;
            view3.layout(paddingLeft, paddingTop, paddingRight, view3.getMeasuredHeight() + paddingTop);
            this.A0I.layout(paddingLeft, paddingTop, paddingRight, paddingBottom);
            if (this.A0V != null) {
                int i7 = 1;
                if (C36401kF.A1X(this.A0Q)) {
                    i7 = i5 - 1;
                }
                if (!C36401kF.A1X(this.A0Q)) {
                    i5 = 0;
                }
                this.A0V.layout(i5, 0, i7, getHeight());
                return;
            }
            return;
        }
        if (C36401kF.A1X(this.A0Q)) {
            ListView listView = this.A0I;
            listView.layout(0 + paddingLeft, paddingTop, listView.getMeasuredWidth() + paddingLeft, paddingBottom);
            view = this.A0D;
            view2 = this.A0I;
        } else {
            View view4 = this.A0D;
            view4.layout(paddingLeft, paddingTop, view4.getMeasuredWidth() + paddingLeft, paddingBottom);
            view = this.A0I;
            view2 = this.A0D;
        }
        view.layout(paddingLeft + view2.getMeasuredWidth(), paddingTop, paddingRight, paddingBottom);
    }

    public abstract void setOnPhotoClickListener(View.OnClickListener onClickListener);

    public abstract void setRadius(float f);

    public abstract void setStatusData(C61953Ed r1);

    private void A03(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.f4nameremoved, typedValue, true)) {
            this.A08 = TypedValue.complexToDimensionPixelSize(typedValue.data, C36361kB.A0B(this));
        }
        boolean z = C222013h.A0C;
        Resources resources = getResources();
        int i = R.dimen.f7nameremoved;
        if (z) {
            i = R.dimen.f7nameremoved;
        }
        this.A04 = C36441kJ.A00(resources, i);
    }

    private void A04(CharSequence charSequence) {
        if (this.A0X != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            TextEmojiLabel textEmojiLabel = this.A0X;
            if (isEmpty) {
                textEmojiLabel.setVisibility(8);
            } else {
                textEmojiLabel.setVisibility(0);
                this.A0X.A0I(charSequence);
            }
            this.A0X.setOnClickListener(this.A0B);
            C33521fV.A03(this.A0X, R.string.f12nameremoved);
        }
    }

    private void setSubtitleSingleLine(boolean z) {
        TextView textView = this.A0W;
        if (textView != null) {
            textView.setSingleLine(z);
        }
    }

    public void A06(boolean z) {
        this.A0T = z;
        A0C();
        if (this.A0V == null) {
            this.A0V = getVerticalDivider();
            getOverlay().add(this.A0V);
        }
        View view = this.A0V;
        if (view != null) {
            view.setVisibility(C36351kA.A00(z ? 1 : 0));
        }
    }

    public void A0B() {
        String[] A1S;
        CharSequence charSequence = this.A01;
        if (charSequence != null) {
            String str = this.A0Z;
            C18820ts r2 = this.A0Q;
            if (str == null) {
                A1S = new String[]{charSequence.toString()};
            } else {
                A1S = C36441kJ.A1S();
                A1S[0] = charSequence.toString();
                A1S[1] = this.A0Z;
            }
            this.A0F.setContentDescription(C55782vB.A00(r2, Arrays.asList(A1S), false));
        }
    }

    public void A0C() {
        C134766bZ r0;
        Integer num;
        C134766bZ r02;
        int i;
        View A0L2 = C36411kG.A0L(this.A0I);
        if (A0L2 != null) {
            if (this.A0I.getFirstVisiblePosition() == 0) {
                i = A0L2.getTop();
            } else {
                i = -getHeight();
            }
            setScrollPos(i);
        }
        AnonymousClass4PY r03 = this.A0N;
        if (r03 != null) {
            C69273dG r1 = (C69273dG) ((C54462sz) r03).A00;
            AnonymousClass2E6 r2 = r1.A0l;
            Integer num2 = null;
            if (r1.A0O || r1.A0N || r1.A0M) {
                C207109uZ r04 = r1.A0I;
                if (r04 != null) {
                    C206549ta r22 = r04.A05;
                    if (r1.A0N && C69273dG.A07(r1.A0E)) {
                        if (r22 == null || (r02 = r22.A00) == null) {
                            num = null;
                        } else {
                            num = Integer.valueOf(r02.A00);
                        }
                        r1.A0g.A05(r1.A1D, num, AnonymousClass143.A03(r1.A0A()), 16, 0, r1.A0C());
                        r1.A0N = false;
                    }
                    if (r1.A0O && C69273dG.A07(r1.A0F)) {
                        if (!(r22 == null || (r0 = r22.A01) == null)) {
                            num2 = Integer.valueOf(r0.A00);
                        }
                        r1.A0g.A05(r1.A1D, num2, AnonymousClass143.A03(r1.A0A()), 16, 1, r1.A0C());
                        r1.A0O = false;
                    }
                    if (r1.A0M && C69273dG.A07(r1.A04)) {
                        r1.A0g.A04(r1.A0H, 14, AnonymousClass000.A1V(r1.A0J.A0F));
                        r1.A0M = false;
                    }
                    if (r1.A0N && C69273dG.A07(r1.A0C)) {
                        r1.A0g.A03(r1.A0H, 19);
                        r1.A0N = false;
                    }
                    if (r1.A0O && C69273dG.A07(r1.A0D)) {
                        r1.A0g.A03(r1.A0H, 22);
                        r1.A0O = false;
                        return;
                    }
                    return;
                }
                return;
            }
            r2.A0N = null;
        }
    }

    public void A0F(int i, int i2) {
        this.A06 = i;
        this.A05 = i2;
        if ((getHeight() > getWidth() && this.A02 > 0.0f) || this.A0T) {
            float f = this.A02;
            int i3 = (int) (((float) this.A06) * f * f);
            int i4 = (int) (((float) this.A05) * f * f);
            AnonymousClass1JZ.A05(this.A0H, this.A0Q, i3, i4);
        }
    }

    public View getDataDisclosureCard() {
        ViewStub A0M2 = C36431kI.A0M(this.A0E, R.id.data_disclosure_card_stub);
        if (A0M2 == null) {
            return null;
        }
        return C36401kF.A0E(A0M2, R.layout.f9nameremoved);
    }

    public void setColor(int i) {
        int i2 = (i & 16777215) | (this.A07 & -16777216);
        this.A07 = i2;
        this.A0G.setBackgroundColor(i2);
    }

    public void setPushName(String str) {
        this.A0Y = str;
        A04(str);
    }

    public void setSubtitleText(String str) {
        TextView textView = this.A0W;
        if (textView != null && str != null) {
            this.A0Z = str;
            textView.setText(str);
            this.A0W.setVisibility(C36381kD.A00(TextUtils.isEmpty(str) ? 1 : 0));
            A0B();
        }
    }

    public void setTitleTextMessageYourself(AnonymousClass141 r4) {
        this.A0M.A07(r4, (C65783Tl) null, (List) null, 0.9f);
        AnonymousClass3SF r0 = this.A0M;
        r0.A01.setOnClickListener(this.A0B);
        A0B();
    }

    public void setTitleVerified(boolean z) {
        AnonymousClass3SF r1 = this.A0M;
        int i = 0;
        if (z) {
            i = 2;
        }
        r1.A03(i);
    }

    public void setToolbarIconColorIfNeeded(int i) {
        if (!C222013h.A05 && !AnonymousClass1RC.A0A(getContext())) {
            Drawable navigationIcon = this.A0K.getNavigationIcon();
            Drawable overflowIcon = this.A0K.getOverflowIcon();
            if (navigationIcon != null && overflowIcon != null) {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                overflowIcon.setColorFilter(i, mode);
                navigationIcon.setColorFilter(i, mode);
                this.A0K.setNavigationIcon(navigationIcon);
                this.A0K.setOverflowIcon(overflowIcon);
            }
        }
    }

    private View getVerticalDivider() {
        View view = new View(getContext());
        C36391kE.A1C(getResources(), view, C224514j.A00(view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        return view;
    }

    public void A0A() {
        C28001Qr r3;
        Activity A002 = C18860tw.A00(getContext());
        this.A00 = A002;
        if (A002 != null) {
            getSplitWindowManager().A05(A002, this.A01);
        }
        this.A0G = findViewById(R.id.photo_overlay);
        this.A0H = findViewById(R.id.subject_layout);
        TextView A0O2 = C36391kE.A0O(this, R.id.conversation_contact_name);
        this.A0J = A0O2;
        if (C222013h.A0C) {
            AnonymousClass088.A06(A0O2, R.style.f13nameremoved);
        }
        this.A0M = AnonymousClass3SF.A01(this, this.A0L, R.id.conversation_contact_name);
        C33521fV.A03(this.A0J, R.string.f12nameremoved);
        this.A0O = (ScalingFrameLayout) findViewById(R.id.conversation_contact_name_scaler);
        Toolbar toolbar = (Toolbar) C012005e.A02(this, R.id.toolbar);
        this.A0K = toolbar;
        if ((toolbar instanceof WDSToolbar) && C222013h.A05) {
            if (AnonymousClass1RC.A0A(getContext())) {
                r3 = C51022n1.A00;
            } else {
                r3 = C28011Qs.A00;
            }
            ((WDSToolbar) this.A0K).setIconSet(r3);
            TextView textView = this.A0J;
            Context context = getContext();
            AnonymousClass00C.A0D(context, 0);
            C36331k8.A0r(context, textView, r3.A00);
        }
        AnonymousClass1RA.A01(this.A0K, C27951Qm.GONE);
        TextView A0P2 = C36391kE.A0P(this, R.id.conversation_contact_status);
        this.A0W = A0P2;
        if (A0P2 != null) {
            A0P2.setClickable(false);
        }
        this.A0X = C36401kF.A0P(this, R.id.push_name);
        this.A0D = findViewById(R.id.header);
        this.A0I = (ListView) findViewById(16908298);
        this.A0F = C012005e.A02(this, R.id.header_placeholder);
        this.A03 = this.A0M.A01.getTextSize();
        A0D();
        C90104Zc.A00(this.A0I.getViewTreeObserver(), this, 6);
    }

    public void A0D() {
        Display defaultDisplay = C36361kB.A06(this).getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.A0F.setLayoutParams(new LinearLayout.LayoutParams(-1, A07(point.x)));
    }

    public void A0E(int i) {
        this.A0I = (ListView) C012005e.A02(this, 16908298);
        View inflate = C36351kA.A0C(this).inflate(i, this.A0I, false);
        this.A0E = inflate;
        this.A0I.addHeaderView(inflate, (Object) null, false);
        C011504z.A06(this.A0E, 2);
    }

    public View getBusinessDetailsCard() {
        return this.A0C;
    }

    public int getColor() {
        return this.A07;
    }

    public TextView getContactNameView() {
        return this.A0J;
    }

    public int getToolbarColor() {
        return AnonymousClass00F.A00(getContext(), R.color.f6nameremoved);
    }

    public void onMeasure(int i, int i2) {
        ListView listView;
        int makeMeasureSpec;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (getMeasuredHeight() >= measuredWidth || this.A0T) {
            View view = this.A0F;
            if (!(view == null || view.getVisibility() == 0)) {
                this.A0G.setOnClickListener((View.OnClickListener) null);
                this.A0G.setClickable(false);
                this.A0F.setVisibility(0);
                this.A0I.getViewTreeObserver().addOnGlobalLayoutListener(this.A0a);
            }
            AnonymousClass000.A16(this.A0D, Math.max(this.A08, this.A00), 1073741824, View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824));
            listView = this.A0I;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        } else {
            if (this.A0F.getVisibility() != 8) {
                this.A0G.setOnClickListener(this.A0B);
                C33521fV.A03(this.A0G, R.string.f12nameremoved);
                this.A0G.setClickable(true);
                AnonymousClass3SF r0 = this.A0M;
                r0.A01.setOnClickListener(this.A0B);
                this.A0F.setVisibility(8);
                this.A0I.post(new C81323wp(this, 17));
            }
            int i3 = (int) (((float) measuredWidth) * 0.618f);
            C36421kH.A0w(this.A0D, measuredWidth - i3, 1073741824, i2);
            listView = this.A0I;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        listView.measure(makeMeasureSpec, i2);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.A0B = onClickListener;
    }

    public void setScrollPos(int i) {
        C27951Qm r0;
        if (getWidth() < getHeight() || this.A0T) {
            if (this.A0U) {
                A09();
            }
            this.A0U = false;
            this.A0A = Math.max(this.A0A, ((long) (((((float) (i - this.A09)) / C36441kJ.A02(this)) * 100.0f) - 100.0f)) * -1);
            int max = Math.max(this.A08, A07(getWidth()) + i);
            int A082 = A08(getWidth());
            this.A02 = Math.max(0.0f, ((float) (A082 - max)) / ((float) (A082 - this.A08)));
            TextUtils.TruncateAt ellipsize = this.A0M.A01.getEllipsize();
            int i2 = this.A08 * 2;
            TextEmojiLabel textEmojiLabel = this.A0M.A01;
            if (max < i2) {
                textEmojiLabel.setSingleLine(true);
                AnonymousClass3SF r02 = this.A0M;
                r02.A01.setEllipsize(TextUtils.TruncateAt.END);
                setSubtitleSingleLine(true);
                AnonymousClass000.A0a(this.A0M.A01).setMargins(0, 0, 0, 0);
            } else {
                textEmojiLabel.setSingleLine(false);
                this.A0M.A01.setEllipsize((TextUtils.TruncateAt) null);
                setSubtitleSingleLine(false);
                ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(this.A0M.A01);
                int i3 = this.A08;
                A0a2.setMargins(0, Math.min(i3, max - (i3 * 2)), 0, 0);
            }
            A04(this.A0Y);
            if (ellipsize != this.A0M.A01.getEllipsize()) {
                AnonymousClass3SF r03 = this.A0M;
                r03.A01.setText(this.A01);
                A0B();
            }
            if (this.A00 != max) {
                this.A00 = max;
                int i4 = this.A07 >> 24;
                if (max == this.A08) {
                    if (i4 != -1) {
                        this.A0M.A01.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                        TextView textView = this.A0W;
                        if (textView != null) {
                            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                        }
                    }
                } else if (i4 == -1) {
                    this.A0M.A01.setShadowLayer(1.0f, 1.0f, 1.0f, -10066330);
                    TextView textView2 = this.A0W;
                    if (textView2 != null) {
                        textView2.setShadowLayer(1.0f, 1.0f, 1.0f, -10066330);
                    }
                }
                ChatInfoLayoutV2 chatInfoLayoutV2 = (ChatInfoLayoutV2) this;
                float f = chatInfoLayoutV2.A02;
                float f2 = 1.0f - f;
                int i5 = (int) (f * 255.0f);
                int i6 = (int) (((float) chatInfoLayoutV2.A06) * f * f);
                int i7 = (int) (((float) chatInfoLayoutV2.A05) * f * f);
                float f3 = chatInfoLayoutV2.A03;
                float f4 = (f3 - ((f3 - chatInfoLayoutV2.A04) * f)) / f3;
                boolean z = false;
                int i8 = (f > 0.8f ? 1 : (f == 0.8f ? 0 : -1));
                TextView textView3 = chatInfoLayoutV2.A0J;
                if (i8 > 0) {
                    textView3.setAlpha((float) i5);
                    chatInfoLayoutV2.A0J.setVisibility(0);
                } else {
                    textView3.setVisibility(8);
                }
                ScalingFrameLayout scalingFrameLayout = chatInfoLayoutV2.A0O;
                scalingFrameLayout.A00 = f4;
                AnonymousClass000.A0a(scalingFrameLayout).setMargins(0, 0, 0, 0);
                chatInfoLayoutV2.A07 = (i5 << 24) | (chatInfoLayoutV2.A07 & 16777215);
                chatInfoLayoutV2.A0H();
                chatInfoLayoutV2.A0G.setBackgroundColor(chatInfoLayoutV2.A07);
                if (!AnonymousClass1RC.A0A(chatInfoLayoutV2.getContext()) && !C222013h.A05) {
                    int i9 = (int) (chatInfoLayoutV2.A02 * 255.0f);
                    if (i9 < 111) {
                        i9 = 111;
                    }
                    int i10 = i9 & 255;
                    chatInfoLayoutV2.setToolbarIconColorIfNeeded((i10 << 0) | -16777216 | (i10 << 16) | (i10 << 8));
                }
                AnonymousClass1JZ.A05(chatInfoLayoutV2.A0H, chatInfoLayoutV2.A0Q, i6, i7);
                ChatInfoLayoutV2.A01(chatInfoLayoutV2);
                if (chatInfoLayoutV2.A02 <= 0.95f) {
                    z = true;
                }
                chatInfoLayoutV2.A06 = z;
                ViewGroup.MarginLayoutParams A0a3 = AnonymousClass000.A0a(chatInfoLayoutV2.A02);
                A0a3.setMargins(A0a3.leftMargin, A0a3.topMargin, A0a3.rightMargin, (int) (C36441kJ.A00(chatInfoLayoutV2.getResources(), R.dimen.f7nameremoved) * f2));
                chatInfoLayoutV2.A02.setLayoutParams(A0a3);
                chatInfoLayoutV2.A0G.setLayoutParams(A0a3);
                chatInfoLayoutV2.A04.setAnimationValue(chatInfoLayoutV2.A02);
                ChatInfoLayoutV2.A02(chatInfoLayoutV2);
                Toolbar toolbar = chatInfoLayoutV2.A0K;
                if (chatInfoLayoutV2.A02 > 0.8f) {
                    r0 = C27951Qm.VISIBLE;
                } else {
                    r0 = C27951Qm.GONE;
                }
                AnonymousClass1RA.A01(toolbar, r0);
                chatInfoLayoutV2.requestLayout();
            }
        } else if (!this.A0U) {
            this.A0U = true;
            ChatInfoLayoutV2 chatInfoLayoutV22 = (ChatInfoLayoutV2) this;
            chatInfoLayoutV22.A0F.setVisibility(8);
            chatInfoLayoutV22.A0G.setBackgroundColor(0);
            chatInfoLayoutV22.A0O.setVisibility(8);
            ChatInfoLayoutV2.A01(chatInfoLayoutV22);
            ViewGroup.MarginLayoutParams A0a4 = AnonymousClass000.A0a(chatInfoLayoutV22.A02);
            A0a4.setMargins(0, 0, 0, 0);
            chatInfoLayoutV22.A02.setLayoutParams(A0a4);
            chatInfoLayoutV22.A0G.setLayoutParams(A0a4);
            chatInfoLayoutV22.setToolbarIconColorIfNeeded(chatInfoLayoutV22.getToolbarColor());
        }
    }

    public void setTitleText(String str) {
        CharSequence A042 = AnonymousClass3UG.A04(getContext(), this.A0M.A01.getPaint(), this.A0R, str, 0.9f);
        this.A01 = A042;
        this.A0M.A01.setText(A042);
        AnonymousClass3SF r0 = this.A0M;
        r0.A01.setOnClickListener(this.A0B);
        A0B();
    }

    public void setOnScrollListener(AnonymousClass4PY r1) {
        this.A0N = r1;
    }

    public AnonymousClass2E6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03(context);
    }

    public AnonymousClass2E6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        A03(context);
    }
}
