package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView;
import java.util.Arrays;

/* renamed from: X.8ZV  reason: invalid class name */
public class AnonymousClass8ZV extends AnonymousClass2IQ {
    public View A00;
    public FrameLayout A01;
    public WaTextView A02;
    public WaTextView A03;
    public ViewOnceDownloadProgressView A04;
    public ViewOnceDownloadProgressView A05;
    public boolean A06;
    public View A07;
    public ViewGroup A08;
    public ViewGroup A09;
    public TextView A0A;
    public TextView A0B;

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    private void A0B() {
        ViewOnceDownloadProgressView viewOnceDownloadProgressView;
        FrameLayout frameLayout;
        View view;
        ViewOnceDownloadProgressView viewOnceDownloadProgressView2;
        View view2;
        FrameLayout frameLayout2;
        C46802bh r8 = (C46802bh) ((AnonymousClass2bU) this.A0K);
        int i = r8.A00;
        if (i != 0) {
            if (i == 1) {
                WaTextView waTextView = this.A02;
                if (waTextView != null && (viewOnceDownloadProgressView2 = this.A04) != null && (view2 = this.A00) != null && (frameLayout2 = this.A01) != null) {
                    waTextView.setText(R.string.f12nameremoved);
                    C36351kA.A15(getResources(), waTextView, R.color.f6nameremoved);
                    waTextView.A0B();
                    C36331k8.A0q(getContext(), waTextView, getViewStateDescription());
                    viewOnceDownloadProgressView2.A00(R.drawable.ic_ephemeral_ring, -1, R.color.f6nameremoved);
                    view2.setVisibility(0);
                    frameLayout2.setVisibility(8);
                    return;
                }
                return;
            } else if (i != 2) {
                return;
            }
        }
        WaTextView waTextView2 = this.A03;
        if (waTextView2 != null && (viewOnceDownloadProgressView = this.A05) != null && (frameLayout = this.A01) != null && (view = this.A00) != null) {
            getContext();
            waTextView2.setText(AnonymousClass6YV.A02(getContext().getString(R.string.f12nameremoved)));
            String string = getContext().getString(getViewStateDescription());
            String A0q = C165607th.A0q(this.A19, this.A0E, r8.A0I);
            C18820ts r2 = this.A0E;
            String[] A1S = C36441kJ.A1S();
            C90494aF.A1H(string, A0q, A1S);
            frameLayout.setContentDescription(C55782vB.A00(r2, Arrays.asList(A1S), false));
            A1v(r8);
            viewOnceDownloadProgressView.A00(R.drawable.ic_viewonce_one, R.drawable.ic_ephemeral_ring, C224314h.A01(getContext(), R.attr.f4nameremoved));
            frameLayout.setOnClickListener(new C48742hy(this, 17));
            frameLayout.setOnLongClickListener(this.A2W);
            frameLayout.setVisibility(0);
            view.setVisibility(8);
        }
    }

    public void A16() {
        if (!this.A06) {
            this.A06 = true;
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
            AnonymousClass8ZJ.A0Y(A0k, r4, r2, this);
        }
    }

    public void A1f() {
        C46802bh r4 = (C46802bh) ((AnonymousClass2bU) this.A0K);
        if (r4.A00 == 2) {
            AnonymousClass141 A042 = C66013Ui.A04(this.A1C, r4);
            if (A042 != null) {
                C39001qm A002 = AnonymousClass3LW.A00(getContext());
                A002.A0d(R.string.f12nameremoved);
                Resources resources = getResources();
                Object[] objArr = new Object[1];
                C36361kB.A1F(this.A0n, A042, objArr, 0);
                C39001qm.A0A(A002, resources.getString(R.string.f12nameremoved, objArr));
                A002.A0r(true);
                C36341k9.A11(A002);
                return;
            }
            return;
        }
        Context context = getContext();
        C64933Qa r3 = r4.A1J;
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(context.getPackageName(), "com.whatsapp.messaging.ViewOnceViewerActivity");
        AnonymousClass3UJ.A00(A0D, r3);
        getContext().startActivity(A0D);
        postDelayed(new C80283v9(this, r4, 8), 220);
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A0B();
        }
    }

    public TextView getDateView() {
        if (((C46802bh) ((AnonymousClass2bU) this.A0K)).A00 == 0) {
            return this.A0B;
        }
        return this.A0A;
    }

    public ViewGroup getDateWrapper() {
        if (((C46802bh) ((AnonymousClass2bU) this.A0K)).A00 == 0) {
            return this.A09;
        }
        return this.A08;
    }

    public C46802bh getFMessage() {
        return (C46802bh) ((AnonymousClass2bU) this.A0K);
    }

    public int getViewStateDescription() {
        int i = ((C46802bh) ((AnonymousClass2bU) this.A0K)).A00;
        if (i == 1 || i != 2) {
            return R.string.f12nameremoved;
        }
        return R.string.f12nameremoved;
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof C46802bh);
        super.setFMessage(r2);
    }

    public AnonymousClass8ZV(Context context, C89004Uw r5, C46802bh r6) {
        super(context, r5, r6);
        A16();
        if (!r6.A1J.A02) {
            this.A07 = C012005e.A02(this, R.id.conversation_row_root);
            FrameLayout frameLayout = (FrameLayout) C012005e.A02(this, R.id.view_once_media_container_large);
            this.A01 = frameLayout;
            this.A09 = C36411kG.A0O(frameLayout, R.id.date_wrapper);
            this.A0B = C36391kE.A0O(this.A01, R.id.date);
            this.A03 = C36401kF.A0Q(this, R.id.view_once_media_type_large);
            this.A05 = (ViewOnceDownloadProgressView) C012005e.A02(this, R.id.view_once_download_large);
            View A022 = C012005e.A02(this, R.id.view_once_media_container_small);
            this.A00 = A022;
            this.A0A = C36391kE.A0O(A022, R.id.date);
            this.A08 = C36411kG.A0O(this.A00, R.id.date_wrapper);
            this.A02 = C36401kF.A0Q(this, R.id.view_once_media_type_small);
            this.A04 = (ViewOnceDownloadProgressView) C012005e.A02(this, R.id.view_once_download_small);
            C36351kA.A19(this, R.id.view_once_file_size);
            this.A01.setForeground(getInnerFrameForegroundDrawable());
            A0B();
        }
    }

    public void A1Y() {
        super.A1Y();
        A0B();
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
