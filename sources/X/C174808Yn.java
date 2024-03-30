package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.TemplateRowContentLayout;
import java.util.List;

/* renamed from: X.8Yn  reason: invalid class name and case insensitive filesystem */
public class C174808Yn extends AnonymousClass2IR {
    public AnonymousClass3EP A00;
    public boolean A01;
    public final AnonymousClass01z A02;
    public final TextEmojiLabel A03 = C36401kF.A0P(this, R.id.title_text_message);
    public final TemplateRowContentLayout A04 = ((TemplateRowContentLayout) findViewById(R.id.template_message_content));

    private void A0B() {
        boolean z;
        int i;
        int i2;
        AnonymousClass2cW r5 = (AnonymousClass2cW) getFMessage();
        List list = r5.A00.A06;
        if (list == null || list.isEmpty()) {
            z = false;
            i = -2;
        } else {
            z = true;
            i = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        }
        View view = this.A0b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
        TemplateRowContentLayout templateRowContentLayout = this.A04;
        templateRowContentLayout.A02(this.A02, this, this.A2Y);
        if (!TextUtils.isEmpty(r5.A0b())) {
            String A0b = r5.A0b();
            TextEmojiLabel textEmojiLabel = this.A03;
            A1s(textEmojiLabel, getFMessage(), A0b, false, true);
            ViewGroup.LayoutParams layoutParams2 = textEmojiLabel.getLayoutParams();
            if (z) {
                i2 = i;
            } else {
                i2 = -1;
                if (A0C(r5)) {
                    i2 = -2;
                }
            }
            layoutParams2.width = i2;
            textEmojiLabel.setLayoutParams(layoutParams2);
            textEmojiLabel.setVisibility(0);
        } else {
            this.A03.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams3 = templateRowContentLayout.getLayoutParams();
        if (!z) {
            i = -2;
            if (A0C(r5)) {
                i = -1;
            }
        }
        layoutParams3.width = i;
        templateRowContentLayout.setLayoutParams(layoutParams3);
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public void A16() {
        if (!this.A01) {
            this.A01 = true;
            C27861Qc A0n = C175108Zr.A0n(this);
            C18800tq r4 = A0n.A0M;
            C27111My A0m = C175108Zr.A0m(r4, A0n, this);
            C18830tt r2 = r4.A00;
            C175108Zr.A0y(r4, r2, r2, this);
            C175108Zr.A11(r4, this);
            C175108Zr.A14(r4, this, C165597tg.A0h(r4));
            C175108Zr.A12(r4, this);
            C175108Zr.A10(r4, r2, this, C175108Zr.A0q(r4));
            C175108Zr.A13(r4, this);
            C19470v6 A0k = C175108Zr.A0k(A0m, r4, r2, this, C165577te.A0U(r4));
            C175108Zr.A0v(A0k, r4, r2, this, C175108Zr.A0o(r4, this));
            C175108Zr.A0w(A0m, r4, r2, this);
            C175108Zr.A0z(r4, r2, A0n, this, C175108Zr.A0p(r2));
            C175108Zr.A0x(A0m, A0n, this);
            C175108Zr.A0u(A0k, r4, r2, A0n, this);
            this.A00 = C27861Qc.A0C(A0n);
        }
    }

    public boolean A1E() {
        AnonymousClass3EA r2 = this.A1e;
        AnonymousClass3T1 fMessage = getFMessage();
        AnonymousClass00C.A0D(fMessage, 0);
        if (r2.A00(fMessage) != null || C175108Zr.A15(this)) {
            return true;
        }
        return false;
    }

    public C174808Yn(Context context, AnonymousClass01z r3, C89004Uw r4, AnonymousClass2cW r5) {
        super(context, r4, r5);
        A16();
        this.A02 = r3;
        A0B();
    }

    private boolean A0C(AnonymousClass2cW r7) {
        float f;
        String A0b = r7.A0b();
        if (TextUtils.isEmpty(A0b)) {
            return false;
        }
        AnonymousClass3F4 r0 = r7.A00;
        String str = r0.A02;
        String str2 = r0.A03;
        float measureText = this.A03.getPaint().measureText(A0b);
        TemplateRowContentLayout templateRowContentLayout = this.A04;
        float measureText2 = templateRowContentLayout.getContentTextView().getPaint().measureText(str);
        if (!TextUtils.isEmpty(str2)) {
            f = templateRowContentLayout.A00.getPaint().measureText(str2);
        } else {
            f = 0.0f;
        }
        if (measureText <= measureText2 || measureText <= f) {
            return false;
        }
        return true;
    }

    public boolean A1M() {
        Long l = ((C88854Uh) getFMessage()).BIE().A00;
        if (l == null || C19970wo.A00(this.A19) >= l.longValue()) {
            return false;
        }
        return true;
    }

    public void A1Y() {
        A0B();
        super.A1Y();
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, getFMessage());
        super.A22(r2, z);
        if (z || A1W) {
            A0B();
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.A00.A00(getFMessage(), i);
    }
}
