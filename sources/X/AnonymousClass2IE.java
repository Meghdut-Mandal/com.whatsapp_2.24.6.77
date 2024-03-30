package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.conversation.carousel.ConversationCarousel;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2IE  reason: invalid class name */
public class AnonymousClass2IE extends C174858Ys {
    public C64723Pe A00;
    public ConversationCarousel A01;
    public AnonymousClass3EP A02;
    public AnonymousClass2HR A03;
    public AnonymousClass1JE A04;
    public AnonymousClass3GO A05;
    public C64933Qa A06 = getFMessage().A1J;
    public AnonymousClass005 A07;
    public int A08;
    public final int A09;
    public final AnonymousClass01z A0A;
    public final C89004Uw A0B;
    public final AnonymousClass3CQ A0C;
    public final View A0D = C012005e.A02(this, R.id.button_div);
    public final InteractiveMessageButton A0E;
    public final InteractiveMessageView A0F;

    private ViewTreeObserver.OnPreDrawListener getOnPreDrawListener() {
        return new C89924Yk(this, 2);
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public void onMeasure(int i, int i2) {
        ConversationCarousel conversationCarousel;
        int i3 = i;
        if (C203369nr.A08(getFMessage())) {
            i3 = View.MeasureSpec.makeMeasureSpec(this.A09, 1073741824);
        }
        int i4 = i2;
        super.onMeasure(i3, i2);
        if (C203369nr.A09(getFMessage()) && (conversationCarousel = this.A01) != null && conversationCarousel.getVisibility() != 8) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            C34081gQ.A06(this.A01, i3, 0, 0, i4, measuredHeight);
            int A002 = measuredHeight + C37541mm.A00(this.A01);
            int A19 = A19(i3, i2, A002);
            this.A08 = A19;
            setMeasuredDimension(measuredWidth, (A002 + A19) - getResources().getDimensionPixelOffset(R.dimen.f7nameremoved));
        }
    }

    public boolean A1E() {
        return AnonymousClass000.A1P(this.A1N.A01(getFMessage()));
    }

    public boolean A2A(AnonymousClass3T1 r4) {
        C207219uk r2 = ((AnonymousClass2bZ) r4).A00;
        if (r2 == null || r2.A00 != 3 || !"review_order".equals(r2.A02())) {
            return !this.A0O;
        }
        return false;
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof AnonymousClass2bZ);
        this.A0K = r2;
    }

    public AnonymousClass2IE(Context context, AnonymousClass01z r6, C89004Uw r7, AnonymousClass3CQ r8, AnonymousClass2bZ r9) {
        super(context, r7, r9);
        View A022;
        this.A0A = r6;
        this.A0C = r8;
        this.A0B = r7;
        InteractiveMessageButton interactiveMessageButton = (InteractiveMessageButton) C012005e.A02(this, R.id.button);
        this.A0E = interactiveMessageButton;
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) C012005e.A02(this, R.id.interactive_view);
        this.A0F = interactiveMessageView;
        interactiveMessageView.setLayoutView(r9.A1J.A02 ^ true ? 1 : 0);
        C65413Ry r2 = (C65413Ry) this.A07.get();
        getFMessage();
        interactiveMessageView.A02(this.A2W, r2);
        interactiveMessageButton.A0E.A00 = r2;
        this.A09 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        A0B();
        if (r2.A05 && (A022 = C012005e.A02(this, R.id.conversation_row_lto_offer_content_holder)) != null) {
            C36361kB.A10(getResources(), A022, R.dimen.f7nameremoved);
        }
    }

    private void A0B() {
        int intValue;
        AnonymousClass2bZ r10 = (AnonymousClass2bZ) getFMessage();
        this.A0F.A03(this, r10);
        if (C203369nr.A09(getFMessage())) {
            HashSet hashSet = this.A04.A01;
            C64933Qa r6 = this.A06;
            if (!hashSet.contains(r6)) {
                this.A05.A00(238890222, "carousel_message_render_tag", getClass().getSimpleName());
                this.A04.A01.add(r6);
                C89924Yk.A00(getViewTreeObserver(), this, 2);
            }
            this.A0E.setVisibility(8);
            this.A0D.setVisibility(8);
            if (this.A01 == null) {
                ConversationCarousel conversationCarousel = new ConversationCarousel(getContext());
                this.A01 = conversationCarousel;
                conversationCarousel.setId(R.id.conversation_row_detached_carousel);
                this.A01.A16();
                this.A01.A0v(new C89144Vk(this, 0));
                addView(this.A01, new ViewGroup.MarginLayoutParams(-1, -2));
            }
            C89004Uw r8 = this.A0B;
            if (r8 != null) {
                this.A03 = new AnonymousClass2HR(getContext(), this.A0A, this.A00, r8, this.A0C.A0B, r10);
                C89014Ux conversationRowCustomizer = r8.getConversationRowCustomizer();
                int i = C36361kB.A0B(this).widthPixels;
                int BEy = conversationRowCustomizer.BEy(getContext(), this.A09.A01());
                ConversationCarousel conversationCarousel2 = this.A01;
                conversationCarousel2.setPaddingRelative(BEy, conversationCarousel2.getPaddingTop(), (i - this.A09) - BEy, conversationCarousel2.getPaddingBottom());
                List list = (List) r10.A01.A00;
                if (list != null) {
                    this.A01.setItemViewCacheSize(list.size());
                }
                this.A01.setAdapter(this.A03);
                AnonymousClass3CQ r0 = this.A0C;
                C64933Qa r1 = r10.A1J;
                AnonymousClass00C.A0D(r1, 0);
                Number A10 = C36441kJ.A10(r1, r0.A00);
                if (A10 == null) {
                    intValue = 0;
                } else {
                    intValue = A10.intValue();
                }
                this.A01.A17(intValue);
            }
            this.A01.setVisibility(0);
        } else {
            ConversationCarousel conversationCarousel3 = this.A01;
            if (conversationCarousel3 != null) {
                conversationCarousel3.setVisibility(8);
            }
            InteractiveMessageButton interactiveMessageButton = this.A0E;
            interactiveMessageButton.setVisibility(0);
            this.A0D.setVisibility(0);
            interactiveMessageButton.A00(this.A0A, this, this.A0B, r10);
        }
        A1z(r10);
    }

    public void A1D(C64933Qa r2) {
        AnonymousClass2IQ A2D = A2D(r2);
        if (A2D != null) {
            A2D.A1D(r2);
        } else {
            super.A1D(r2);
        }
    }

    public boolean A1H() {
        if (C203369nr.A09(getFMessage())) {
            return false;
        }
        return super.A1H();
    }

    public void A1Y() {
        A0B();
        AnonymousClass2IR.A0d(this, false);
    }

    public void A1o(ViewGroup viewGroup, TextView textView, AnonymousClass3T1 r4) {
        if (!C203369nr.A08(getFMessage())) {
            super.A1o(viewGroup, textView, r4);
        }
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, getFMessage());
        super.A22(r2, z);
        if (z || A1W) {
            A0B();
        }
    }

    public boolean A2C(C64933Qa r4) {
        AnonymousClass2HR r1;
        boolean A2C = super.A2C(r4);
        if (A2C || !C203369nr.A09(getFMessage()) || (r1 = this.A03) == null) {
            return A2C;
        }
        AnonymousClass00C.A0D(r4, 0);
        return C36401kF.A1U(r1.A0L(r4));
    }

    public AnonymousClass2IQ A2D(C64933Qa r3) {
        ConversationCarousel conversationCarousel;
        AnonymousClass2HR r1;
        if (!C203369nr.A09(getFMessage()) || (conversationCarousel = this.A01) == null || conversationCarousel.getVisibility() == 8 || (r1 = this.A03) == null) {
            return null;
        }
        AnonymousClass00C.A0D(r3, 0);
        if (r1.A0L(r3) < 0) {
            return null;
        }
        AnonymousClass0D3 A0Q = this.A01.A0Q(this.A03.A0L(r3));
        if (A0Q instanceof AnonymousClass2HU) {
            return ((AnonymousClass2HU) A0Q).A00;
        }
        return null;
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getGlowContentBottom() {
        ConversationCarousel conversationCarousel;
        if (!C203369nr.A09(getFMessage()) || (conversationCarousel = this.A01) == null || conversationCarousel.getVisibility() == 8) {
            return super.getGlowContentBottom();
        }
        return this.A01.getBottom();
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        InteractiveMessageView interactiveMessageView = this.A0F;
        if (interactiveMessageView != null) {
            innerFrameLayouts.add(interactiveMessageView.getInnerFrameLayout());
        }
        return innerFrameLayouts;
    }

    public int getMainChildMaxWidth() {
        if (C203369nr.A09(getFMessage()) || C203369nr.A08(getFMessage())) {
            return this.A09;
        }
        return 0;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        ConversationCarousel conversationCarousel = this.A01;
        if (conversationCarousel != null) {
            Rect A062 = AnonymousClass001.A06();
            conversationCarousel.getHitRect(A062);
            if (A062.contains((int) x, (int) y)) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ConversationCarousel conversationCarousel;
        super.onLayout(z, i, i2, i3, i4);
        if (C203369nr.A09(getFMessage()) && (conversationCarousel = this.A01) != null && conversationCarousel.getVisibility() != 8) {
            int A17 = ((A17() + this.A08) + AnonymousClass000.A0a(this.A01).topMargin) - getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
            int measuredWidth = this.A01.getMeasuredWidth();
            int measuredHeight = this.A01.getMeasuredHeight();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            this.A01.layout(measuredWidth2, A17, measuredWidth + measuredWidth2, measuredHeight + A17);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.A02.A00(getFMessage(), i);
    }
}
