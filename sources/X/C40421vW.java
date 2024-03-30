package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.1vW  reason: invalid class name and case insensitive filesystem */
public final class C40421vW extends C02920Ck {
    public C88514Sz A00;
    public AnonymousClass1RY A01;
    public final C009003v A02;
    public final AnonymousClass1Pp A03;
    public final C27731Pn A04;

    public void A0I(RecyclerView recyclerView) {
        AnonymousClass00C.A0D(recyclerView, 0);
        this.A01.A02();
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C42331ye(C36371kC.A0I(C36341k9.A0J(viewGroup, 0), viewGroup, i), this.A00, this.A01, this.A02);
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r9, int i) {
        C42331ye r92 = (C42331ye) r9;
        AnonymousClass00C.A0D(r92, 0);
        Object A0L = A0L(i);
        AnonymousClass00C.A08(A0L);
        AnonymousClass3JW r7 = (AnonymousClass3JW) A0L;
        AnonymousClass00C.A0D(r7, 0);
        AnonymousClass00T r5 = r92.A04;
        C36351kA.A0G(r5).setText(r7.A03);
        AnonymousClass1RY r6 = r92.A01;
        AnonymousClass141 r3 = r7.A02;
        AnonymousClass00T r4 = r92.A02;
        r6.A06((ImageView) C36381kD.A0p(r4), r92.A00, r3, true);
        AnonymousClass00T r32 = r92.A03;
        ((CompoundButton) C36381kD.A0p(r32)).setChecked(r7.A01);
        AnonymousClass3YE.A00(C36361kB.A0I(r32), r7, r92, 1);
        View view = r92.A0H;
        AnonymousClass3YE.A00(view, r7, r92, 2);
        boolean z = r7.A00;
        view.setEnabled(z);
        C36361kB.A0I(r32).setEnabled(z);
        AnonymousClass3UE.A08(C36361kB.A0I(r4), z);
        AnonymousClass3UE.A08(C36361kB.A0I(r5), z);
        AnonymousClass3UE.A08(C36361kB.A0I(r32), z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40421vW(Context context, AnonymousClass1Pp r4, C27731Pn r5, C009003v r6) {
        super((C02830Cb) C40331vK.A00);
        C36321k7.A0z(r4, r5);
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r6;
        this.A01 = r5.A05(context, "adhoc-participant-bottom-sheet");
        this.A00 = new AnonymousClass3U5(r4, 1);
    }

    public int getItemViewType(int i) {
        return R.layout.f9nameremoved;
    }
}
