package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.TextAndDateLayout;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2IJ  reason: invalid class name */
public class AnonymousClass2IJ extends AnonymousClass8ZT {
    public AnonymousClass30M A00;
    public C64723Pe A01;
    public AnonymousClass36M A02;
    public int A03;
    public boolean A04;
    public final ConversationRowImage$RowImageView A05;
    public final View A06;
    public final ViewGroup A07;
    public final LinearLayout A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextAndDateLayout A0B;
    public final C160527l9 A0C = new C53702rk(this, 7);
    public final AnonymousClass1RJ A0D;
    public final AnonymousClass1RJ A0E;
    public final AnonymousClass1RJ A0F;
    public final AnonymousClass1RJ A0G;
    public final TextEmojiLabel A0H;

    public void A1Y() {
        AnonymousClass2IR.A0d(this, false);
        A0B(false);
    }

    private void A0B(boolean z) {
        int A002;
        C46852bm r3 = (C46852bm) ((AnonymousClass2bU) this.A0K);
        C65013Qj A003 = AnonymousClass2bU.A00(r3);
        if (z) {
            this.A09.setTag(Collections.singletonList(r3));
        }
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A05;
        conversationRowImage$RowImageView.setImageBitmap((Bitmap) null);
        conversationRowImage$RowImageView.setImageData(new C65013Qj(A003));
        conversationRowImage$RowImageView.setInAlbum(false);
        conversationRowImage$RowImageView.setFullWidth(C37541mm.A07(this));
        conversationRowImage$RowImageView.setPaddingOnTopOnly(true);
        if (C66013Ui.A0z(getFMessage())) {
            View view = this.A06;
            view.setVisibility(0);
            AnonymousClass1RJ r9 = this.A0G;
            AnonymousClass1RJ r10 = this.A0D;
            TextView textView = this.A09;
            AnonymousClass2IQ.A0P(view, textView, r9, r10, true, !z);
            C36331k8.A0q(getContext(), conversationRowImage$RowImageView, R.string.f12nameremoved);
            if (r3.A1J.A02) {
                conversationRowImage$RowImageView.setOnClickListener(this.A0B);
            } else {
                conversationRowImage$RowImageView.setOnClickListener((View.OnClickListener) null);
            }
            C33541fX r6 = this.A08;
            textView.setOnClickListener(r6);
            r9.A05(r6);
        } else {
            boolean A092 = C37541mm.A09(this);
            View view2 = this.A06;
            if (A092) {
                view2.setVisibility(8);
                AnonymousClass1RJ r92 = this.A0G;
                AnonymousClass1RJ r102 = this.A0D;
                TextView textView2 = this.A09;
                AnonymousClass2IQ.A0P(view2, textView2, r92, r102, false, false);
                C36331k8.A0q(getContext(), conversationRowImage$RowImageView, R.string.f12nameremoved);
                C33541fX r62 = this.A0B;
                textView2.setOnClickListener(r62);
                conversationRowImage$RowImageView.setOnClickListener(r62);
            } else {
                view2.setVisibility(0);
                AnonymousClass1RJ r93 = this.A0G;
                AnonymousClass1RJ r103 = this.A0D;
                TextView textView3 = this.A09;
                AnonymousClass2IQ.A0P(view2, textView3, r93, r103, false, !z);
                conversationRowImage$RowImageView.setContentDescription((CharSequence) null);
                if (!C54732tQ.A00(getFMessage())) {
                    textView3.setText(R.string.f12nameremoved);
                    textView3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload, 0, 0, 0);
                    textView3.setOnClickListener(this.A0A);
                    conversationRowImage$RowImageView.setOnClickListener(this.A0B);
                } else {
                    A1r(textView3, (Integer) null, Collections.singletonList(r3), r3.A00);
                    textView3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
                    C33541fX r63 = this.A09;
                    textView3.setOnClickListener(r63);
                    conversationRowImage$RowImageView.setOnClickListener(r63);
                }
            }
        }
        A1d();
        AnonymousClass2IR.A0W(conversationRowImage$RowImageView, this);
        SpannableString A004 = this.A01.A00(r3);
        String str = r3.A09;
        String str2 = r3.A02;
        String str3 = r3.A05;
        Resources A0F2 = C36341k9.A0F(this);
        TextEmojiLabel textEmojiLabel = this.A0H;
        textEmojiLabel.setTextSize(this.A0r.A03(getResources(), -1));
        textEmojiLabel.A0C();
        textEmojiLabel.setTextColor(getSecondaryTextColor());
        textEmojiLabel.setVisibility(8);
        TextAndDateLayout textAndDateLayout = this.A0B;
        textAndDateLayout.setMaxTextLineCount(2);
        textAndDateLayout.invalidate();
        boolean isEmpty = TextUtils.isEmpty(str);
        AnonymousClass1RJ r94 = this.A0F;
        if (!isEmpty) {
            TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) C36391kE.A0L(r94, 0);
            textEmojiLabel2.setTextSize(getTextFontSize());
            textEmojiLabel2.setAutoLinkMask(0);
            textEmojiLabel2.setLinksClickable(false);
            textEmojiLabel2.setFocusable(false);
            textEmojiLabel2.setLongClickable(false);
            setMessageText(str, textEmojiLabel2, r3);
        } else {
            r94.A03(8);
        }
        boolean z2 = r3.A1J.A02;
        if (z2 || C131806Qs.A01(r3)) {
            this.A0E.A03(8);
            this.A07.setVisibility(0);
        } else if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            View A0L = C36391kE.A0L(this.A0E, 0);
            TextEmojiLabel A0O = C36401kF.A0O(A0L, R.id.product_body);
            TextEmojiLabel A0O2 = C36401kF.A0O(A0L, R.id.product_footer);
            C012005e.A02(A0L, R.id.product_content_date_layout);
            if (!TextUtils.isEmpty(str2)) {
                setMessageText(str2, A0O, r3);
                A0O.setVisibility(0);
            } else {
                A0O.setVisibility(8);
            }
            if (!TextUtils.isEmpty(str3)) {
                A1s(A0O2, r3, str3, true, false);
                A0O2.setVisibility(0);
            } else {
                A0O2.setVisibility(8);
            }
            this.A07.setVisibility(8);
        } else {
            this.A0E.A03(8);
        }
        A1v(r3);
        if (!TextUtils.isEmpty(A004) || this.A03 > 0) {
            textEmojiLabel.setMinLines(this.A03);
            TextEmojiLabel textEmojiLabel3 = textEmojiLabel;
            textEmojiLabel3.A0H(C65783Tl.A00, A004, getHighlightTerms(), 300, false);
            textEmojiLabel.setVisibility(0);
        } else if (!TextUtils.isEmpty(str)) {
            r94.A03(8);
            textAndDateLayout.setMaxTextLineCount(1);
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.A0J(str, (List) null, 150, false);
            textEmojiLabel.setTextSize(getTextFontSize());
            textEmojiLabel.A0A();
            C36351kA.A15(A0F2, textEmojiLabel, C224514j.A00(textEmojiLabel.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        }
        conversationRowImage$RowImageView.setOutgoing(z2);
        conversationRowImage$RowImageView.A0F = false;
        C65013Qj r4 = A003;
        int i = r4.A0A;
        if (i == 0 || (A002 = r4.A06) == 0) {
            i = 100;
            A002 = AnonymousClass1SV.A00(r3, 100);
            if (A002 <= 0) {
                i = C65123Qv.A01(getContext());
                A002 = (i * 9) / 16;
            }
        }
        conversationRowImage$RowImageView.A04(i, A002);
        C36411kG.A1D(conversationRowImage$RowImageView);
        if (!z && this.A04) {
            this.A1y.A0H(r3);
        }
        this.A04 = false;
        this.A1y.A0C(conversationRowImage$RowImageView, r3, this.A0C);
        this.A02.A00.A0E(3544);
        this.A02.A00.A0E(3545);
        A1z(r3);
    }

    public void A1Z() {
        AnonymousClass3T1 r3 = this.A0K;
        this.A04 = true;
        this.A1y.A0H(r3);
        this.A1y.A0C(this.A05, r3, this.A0C);
    }

    public void A1d() {
        AnonymousClass1RJ r2 = this.A0G;
        AnonymousClass1Y4 r0 = this.A04;
        C18740tg.A06(r0);
        A2E(r2, AnonymousClass3SU.A01(r0, (AnonymousClass2bU) this.A0K, r2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r1 == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1f() {
        /*
            r6 = this;
            X.0yE r0 = r6.A02
            if (r0 == 0) goto L_0x000b
            boolean r0 = X.C37541mm.A0A(r6)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            X.3T1 r5 = r6.A0K
            X.2bU r5 = (X.AnonymousClass2bU) r5
            X.2bm r5 = (X.C46852bm) r5
            X.3Qj r4 = X.AnonymousClass2bU.A00(r5)
            X.3Qa r0 = r5.A1J
            boolean r3 = r0.A02
            if (r3 != 0) goto L_0x0020
            boolean r0 = r4.A0V
            if (r0 != 0) goto L_0x0020
            return
        L_0x0020:
            java.io.File r0 = r4.A0I
            r2 = 0
            if (r0 == 0) goto L_0x002c
            boolean r1 = r0.exists()
            r0 = 1
            if (r1 != 0) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            X.C37541mm.A03(r4, r5, r3)
            if (r0 != 0) goto L_0x003e
            boolean r0 = r6.A2J()
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "viewmessage/ no file to download from receiver side"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x003e:
            com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r0 = r6.A05
            r6.A1n(r0, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IJ.A1f():void");
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A0B(A1W);
        }
    }

    public int getBroadcastDrawableId() {
        if (AnonymousClass2bU.A02((AnonymousClass2bU) this.A0K)) {
            return R.drawable.broadcast_status_icon_onmedia;
        }
        return R.drawable.broadcast_status_icon;
    }

    public TextView getDateView() {
        C46852bm r1 = (C46852bm) ((AnonymousClass2bU) this.A0K);
        if ((TextUtils.isEmpty(r1.A02) && TextUtils.isEmpty(r1.A05)) || r1.A1J.A02 || C131806Qs.A01(r1)) {
            return this.A0A;
        }
        AnonymousClass1RJ r0 = this.A0E;
        if (r0 != null) {
            return C36391kE.A0O(r0.A01(), R.id.date);
        }
        return null;
    }

    public ViewGroup getDateWrapper() {
        C46852bm r1 = (C46852bm) ((AnonymousClass2bU) this.A0K);
        if ((TextUtils.isEmpty(r1.A02) && TextUtils.isEmpty(r1.A05)) || r1.A1J.A02 || C131806Qs.A01(r1)) {
            return this.A07;
        }
        AnonymousClass1RJ r0 = this.A0E;
        if (r0 != null) {
            return C36411kG.A0O(r0.A01(), R.id.date_wrapper);
        }
        return null;
    }

    public C46852bm getFMessage() {
        return (C46852bm) ((AnonymousClass2bU) this.A0K);
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof C46852bm);
        super.setFMessage(r2);
    }

    public AnonymousClass2IJ(Context context, C89004Uw r6, C46852bm r7, int i) {
        super(context, r6, r7);
        this.A03 = i;
        this.A09 = C36391kE.A0O(this, R.id.control_btn);
        this.A05 = (ConversationRowImage$RowImageView) C012005e.A02(this, R.id.image);
        AnonymousClass1RJ A0X = C36341k9.A0X(this, R.id.progress_bar);
        this.A0G = A0X;
        A0X.A07(C79463tl.A00);
        this.A0D = C36341k9.A0X(this, R.id.cancel_download);
        this.A06 = C012005e.A02(this, R.id.control_frame);
        TextEmojiLabel A0O = C36401kF.A0O(this, R.id.caption);
        this.A0H = A0O;
        this.A0B = (TextAndDateLayout) C012005e.A02(this, R.id.text_and_date);
        TextEmojiLabel A0P = C36401kF.A0P(this, R.id.view_product_btn);
        this.A0F = C36341k9.A0X(this, R.id.product_title_view_stub);
        this.A0E = C36341k9.A0X(this, R.id.product_content_layout_view_stub);
        this.A07 = C36411kG.A0O(this, R.id.date_wrapper);
        this.A0A = C36391kE.A0O(this, R.id.date);
        LinearLayout linearLayout = (LinearLayout) C012005e.A02(this, R.id.product_message_view);
        this.A08 = linearLayout;
        C36331k8.A1A(this.A0G, A0O);
        A0O.setAutoLinkMask(0);
        A0O.setLinksClickable(false);
        A0O.setFocusable(false);
        A0O.setLongClickable(false);
        if (A0P != null) {
            A0P.A0I(getContext().getString(R.string.f12nameremoved));
        }
        AnonymousClass2IR.A0W(linearLayout, this);
        C66953Xy.A00(linearLayout, this, 43);
        A0B(true);
    }

    public boolean A1E() {
        return C37541mm.A08(this);
    }

    public boolean A1K() {
        if (!C37541mm.A09(this) || !this.A0d.BtQ()) {
            return false;
        }
        return true;
    }

    public void dispatchSetPressed(boolean z) {
        super.dispatchSetPressed(z);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A05;
        boolean isPressed = isPressed();
        if (conversationRowImage$RowImageView.A0I != isPressed) {
            conversationRowImage$RowImageView.A0I = isPressed;
            ConversationRowImage$RowImageView.A01(conversationRowImage$RowImageView);
            conversationRowImage$RowImageView.invalidate();
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getMainChildMaxWidth() {
        if (C37541mm.A07(this)) {
            return 0;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int i = 72;
        if (this.A0O) {
            i = 100;
        }
        return Math.min(dimensionPixelSize, AnonymousClass3R4.A01(getContext(), i));
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
