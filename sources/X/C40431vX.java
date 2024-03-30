package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1vX  reason: invalid class name and case insensitive filesystem */
public final class C40431vX extends C02920Ck {
    public C88514Sz A00;
    public AnonymousClass1RY A01;
    public final C006302t A02;
    public final AnonymousClass1Pp A03;
    public final C27731Pn A04;

    public void A0I(RecyclerView recyclerView) {
        AnonymousClass00C.A0D(recyclerView, 0);
        this.A01.A02();
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        View inflate = C36341k9.A0J(viewGroup, 0).inflate(i, viewGroup, false);
        if (i == R.layout.f9nameremoved) {
            List list = AnonymousClass0D3.A0I;
            AnonymousClass00C.A0B(inflate);
            return new AnonymousClass2DV(inflate, this.A00, this.A01, this.A02);
        } else if (i == R.layout.f9nameremoved) {
            List list2 = AnonymousClass0D3.A0I;
            AnonymousClass00C.A0B(inflate);
            return new AnonymousClass2DU(inflate);
        } else {
            throw AnonymousClass001.A09("Unknown view. Expected Participant View or Header View.");
        }
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        C42501yv r82 = (C42501yv) r8;
        AnonymousClass00C.A0D(r82, 0);
        Object A0L = A0L(i);
        AnonymousClass00C.A08(A0L);
        if (r82 instanceof AnonymousClass2DV) {
            AnonymousClass2DV r83 = (AnonymousClass2DV) r82;
            AnonymousClass2DW r4 = (AnonymousClass2DW) A0L;
            AnonymousClass00C.A0D(r4, 0);
            C36351kA.A0G(r83.A03).setText(r4.A02);
            r83.A01.A06((ImageView) C36381kD.A0p(r83.A02), r83.A00, r4.A00, true);
            Integer num = r4.A01;
            AnonymousClass00T r0 = r83.A04;
            AnonymousClass1RJ r1 = (AnonymousClass1RJ) r0.getValue();
            if (num != null) {
                r1.A03(0);
                ((TextView) C36361kB.A0J(r0)).setText(num.intValue());
            } else {
                r1.A03(8);
            }
            View view = r83.A0H;
            AnonymousClass3YE.A00(view, r4, r83, 3);
            view.setEnabled(!r4.A03);
            return;
        }
        AnonymousClass00C.A0D((Object) null, 0);
        AnonymousClass00C.A08(((AnonymousClass2DU) r82).A00.getValue());
        throw AnonymousClass001.A0A("getStringRes");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40431vX(Context context, AnonymousClass1Pp r4, C27731Pn r5, C006302t r6) {
        super((C02830Cb) C40341vL.A00);
        C36321k7.A0z(r4, r5);
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r6;
        this.A01 = r5.A05(context, "call-messages-bottom-sheet");
        this.A00 = new AnonymousClass3U5(r4, 1);
    }

    public int getItemViewType(int i) {
        if (A0L(i) instanceof AnonymousClass2DW) {
            return R.layout.f9nameremoved;
        }
        throw C36441kJ.A18();
    }
}
