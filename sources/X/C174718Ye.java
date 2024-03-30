package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8Ye  reason: invalid class name and case insensitive filesystem */
public class C174718Ye extends AnonymousClass2IR {
    public TextView A00;
    public boolean A01;
    public final C225314u A02;
    public final SharePhoneNumberRowViewModel A03;

    public boolean A1G() {
        return true;
    }

    public boolean A25() {
        return false;
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    private C20120x3 getPhoneNumberSharedBridge() {
        return (C20120x3) ((C20780y9) this.A28.get()).A01(C20120x3.class);
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
        }
    }

    public C174718Ye(Context context, C89004Uw r9, AnonymousClass2bE r10) {
        super(context, r9, r10);
        A16();
        C225314u r0 = (C225314u) C24801Dv.A01(context, C225314u.class);
        this.A02 = r0;
        this.A03 = (SharePhoneNumberRowViewModel) C36441kJ.A0b(r0).A00(SharePhoneNumberRowViewModel.class);
        C64933Qa r02 = r10.A1J;
        boolean z = r02.A02;
        AnonymousClass11F r4 = r02.A00;
        setBackground((Drawable) null);
        setLongClickable(false);
        if (r4 != null) {
            if (z) {
                SharePhoneNumberRowViewModel sharePhoneNumberRowViewModel = this.A03;
                C28201Rs A0t = C36441kJ.A0t();
                C80403vL.A01(sharePhoneNumberRowViewModel.A04, sharePhoneNumberRowViewModel, r4, A0t, 19);
                BA7.A01(this.A02, A0t, this, 46);
            } else if (r4 instanceof UserJid) {
                setOnClickListener(new AnonymousClass3YF(this, r4, 36));
            }
        }
        TextView A0O = C36391kE.A0O(this, R.id.info);
        this.A00 = A0O;
        if (z) {
            A0O.setText(R.string.f12nameremoved);
            setVisibility(0);
        } else if (r4 != null) {
            setVisibility(8);
            SharePhoneNumberRowViewModel sharePhoneNumberRowViewModel2 = this.A03;
            C28201Rs A0t2 = C36441kJ.A0t();
            C80403vL.A01(sharePhoneNumberRowViewModel2.A04, sharePhoneNumberRowViewModel2, r4, A0t2, 21);
            BA7.A01(this.A02, A0t2, this, 47);
        }
    }

    public /* synthetic */ void A2D(C43862Kc r4) {
        getPhoneNumberSharedBridge();
        this.A02.Btl(C53482rO.A00(r4.A00, r4.A01), "ConversationRowSharePhoneNumber");
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
}
