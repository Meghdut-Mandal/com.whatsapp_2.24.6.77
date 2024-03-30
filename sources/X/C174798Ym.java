package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel;

/* renamed from: X.8Ym  reason: invalid class name and case insensitive filesystem */
public class C174798Ym extends AnonymousClass2IR {
    public boolean A00;
    public final C225314u A01;
    public final AnonymousClass4PI A02 = new C69433dW(this);
    public final SharePhoneNumberRowViewModel A03;
    public final AnonymousClass11F A04;

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    private C20110x2 getSharePhoneNumberBridge() {
        return (C20110x2) ((C20780y9) this.A28.get()).A01(C20110x2.class);
    }

    public void A16() {
        if (!this.A00) {
            this.A00 = true;
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
        }
    }

    public C174798Ym(Context context, C89004Uw r8, AnonymousClass2bN r9) {
        super(context, r8, r9);
        A16();
        setLongClickable(false);
        C225314u r0 = (C225314u) C24801Dv.A01(context, C225314u.class);
        this.A01 = r0;
        this.A03 = (SharePhoneNumberRowViewModel) C36441kJ.A0b(r0).A00(SharePhoneNumberRowViewModel.class);
        C64933Qa r1 = r9.A1J;
        this.A04 = r1.A00;
        setVisibility(8);
        AnonymousClass11F r5 = this.A04;
        if (r5 != null) {
            boolean z = r1.A02;
            SharePhoneNumberRowViewModel sharePhoneNumberRowViewModel = this.A03;
            C28201Rs A0t = C36441kJ.A0t();
            C80403vL.A01(sharePhoneNumberRowViewModel.A04, sharePhoneNumberRowViewModel, r5, A0t, 21);
            A0t.A08(this.A01, new AnonymousClass3UU(1, this, z));
            if (!z) {
                setUpShareCta(r5);
            }
        }
    }

    public static void A0B(C174798Ym r3, AnonymousClass11F r4) {
        r3.getSharePhoneNumberBridge();
        AnonymousClass00C.A0D(r4, 0);
        r3.A01.Btl(C53492rP.A00(r4, 5), "SharePhoneNumberBottomSheet");
    }

    private void setUpShareCta(AnonymousClass11F r5) {
        C012005e.A02(getRootView(), R.id.request_phone_button).setOnClickListener(new C48932iI(C36401kF.A0b(r5), this, r5, 14));
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getMainChildMaxWidth() {
        if (A1G() || !getFMessage().A1J.A02) {
            return getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        }
        return 0;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }
}
