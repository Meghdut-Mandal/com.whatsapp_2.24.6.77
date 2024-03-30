package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1wM  reason: invalid class name and case insensitive filesystem */
public final class C40941wM extends AnonymousClass0CZ {
    public List A00;
    public final C58002zA A01;
    public final C87084Nk A02;
    public final AnonymousClass1RY A03;

    public void A0I(RecyclerView recyclerView) {
        AnonymousClass00C.A0D(recyclerView, 0);
        this.A03.A02();
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        View inflate = C36341k9.A0J(viewGroup, 0).inflate(i, viewGroup, false);
        if (i == R.layout.f9nameremoved) {
            C58002zA r1 = this.A01;
            AnonymousClass00C.A0B(inflate);
            AnonymousClass1RY r3 = this.A03;
            C87084Nk r2 = this.A02;
            List list = AnonymousClass0D3.A0I;
            return new AnonymousClass2DY(inflate, C36361kB.A0S(r1.A00.A01), r2, r3);
        } else if (i == R.layout.f9nameremoved) {
            List list2 = AnonymousClass0D3.A0I;
            AnonymousClass00C.A0B(inflate);
            return new AnonymousClass2DX(inflate);
        } else {
            throw AnonymousClass001.A09("Unsupported view type");
        }
    }

    public int A0J() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r10, int i) {
        ImageView imageView;
        int i2;
        C42511yw r102 = (C42511yw) r10;
        AnonymousClass00C.A0D(r102, 0);
        C16270ot r5 = (C16270ot) this.A00.get(i);
        if (!(r102 instanceof AnonymousClass2DX)) {
            AnonymousClass2DY r103 = (AnonymousClass2DY) r102;
            C69743e1 r52 = (C69743e1) r5;
            AnonymousClass00C.A0D(r52, 0);
            AnonymousClass00T r6 = r103.A05;
            Context context = C36401kF.A0F(r6).getContext();
            if (!r52.A02) {
                boolean z = r52.A03;
                View A0F = C36401kF.A0F(r6);
                if (z) {
                    C36331k8.A0q(context, A0F, R.string.f12nameremoved);
                    imageView = (ImageView) r6.getValue();
                    i2 = R.drawable.vec_ic_voicechat;
                } else {
                    C36331k8.A0q(context, A0F, R.string.f12nameremoved);
                    imageView = (ImageView) r6.getValue();
                    i2 = R.drawable.ic_action_call;
                }
                AnonymousClass3UF.A0B(context, imageView, i2, C224314h.A01(context, R.attr.f4nameremoved));
                AnonymousClass00T r3 = r103.A04;
                C36331k8.A0q(context, C36401kF.A0F(r3), R.string.f12nameremoved);
                AnonymousClass3UF.A0B(context, (ImageView) r3.getValue(), R.drawable.ic_action_videocall, C224314h.A01(context, R.attr.f4nameremoved));
                C36401kF.A0F(r3).setLongClickable(false);
                AnonymousClass141 r2 = r52.A00;
                AnonymousClass3YE.A00(r103.A0H, r103, r52, 6);
                C67113Yo.A00(C36401kF.A0F(r6), r103, r52, r2, 25);
                C67113Yo.A00(C36401kF.A0F(r3), r103, r52, r2, 24);
                C48812i6.A00(C36401kF.A0F(r103.A03), r103, r52, 23);
            } else {
                C36331k8.A0q(context, C36401kF.A0F(r6), R.string.f12nameremoved);
                AnonymousClass3UF.A0B(context, (ImageView) r6.getValue(), R.drawable.vec_ic_close_24, R.color.f6nameremoved);
                AnonymousClass3YE.A00(C36401kF.A0F(r6), r103, r52, 7);
                AnonymousClass00T r62 = r103.A04;
                C36331k8.A0q(context, C36401kF.A0F(r62), R.string.f12nameremoved);
                C36401kF.A0F(r62).setLongClickable(true);
                C33521fV.A05(C36401kF.A0F(r62), R.string.f12nameremoved);
                C36401kF.A0F(r62).setOnClickListener((View.OnClickListener) null);
                C53912s6.A00(C36401kF.A0F(r62), r103, 1);
                AnonymousClass3UF.A0B(context, (ImageView) r62.getValue(), R.drawable.vec_ic_drag_handle_wds, R.color.f6nameremoved);
            }
            AnonymousClass1RY r22 = r103.A01;
            AnonymousClass141 r1 = r52.A00;
            r22.A08((ImageView) r103.A03.getValue(), r1);
            ((AnonymousClass3SF) r103.A02.getValue()).A05(r1);
        }
    }

    public int getItemViewType(int i) {
        Object obj = this.A00.get(i);
        if ((obj instanceof C69743e1) || (obj instanceof C69753e2)) {
            return R.layout.f9nameremoved;
        }
        throw C36441kJ.A18();
    }

    public C40941wM(Context context, C58002zA r3, C87084Nk r4, C27731Pn r5, List list) {
        C36321k7.A0z(r5, r3);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = list;
        this.A03 = r5.A05(context, "favorite-call-list-single");
    }
}
