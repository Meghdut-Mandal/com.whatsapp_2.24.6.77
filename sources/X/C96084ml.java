package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4ml  reason: invalid class name and case insensitive filesystem */
public final class C96084ml extends AnonymousClass0CZ {
    public C115575j6 A00;
    public C160627lJ A01;
    public List A02;

    public C96084ml(C115575j6 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public static final Chip A00(Context context) {
        Chip chip = new Chip(context, (AttributeSet) null);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = dimensionPixelSize;
        marginLayoutParams.rightMargin = dimensionPixelSize;
        chip.setLayoutParams(marginLayoutParams);
        chip.setChipEndPadding(context.getResources().getDimension(R.dimen.f7nameremoved));
        chip.setChipStartPadding(context.getResources().getDimension(R.dimen.f7nameremoved));
        chip.setCloseIconResource(R.drawable.ic_chevron_down);
        return chip;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 2) {
            List list = AnonymousClass0D3.A0I;
            Chip A002 = A00(C36371kC.A0B(viewGroup));
            C160627lJ r0 = this.A01;
            if (r0 != null) {
                return new AnonymousClass51X(A002, r0);
            }
            throw C36331k8.A0d("onItemClickListener");
        } else if (i == 3) {
            List list2 = AnonymousClass0D3.A0I;
            Chip A003 = A00(C36371kC.A0B(viewGroup));
            C160627lJ r02 = this.A01;
            if (r02 != null) {
                return new AnonymousClass51Z(A003, r02);
            }
            throw C36331k8.A0d("onItemClickListener");
        } else if (i == 4) {
            List list3 = AnonymousClass0D3.A0I;
            Chip A004 = A00(C36371kC.A0B(viewGroup));
            C160627lJ r03 = this.A01;
            if (r03 != null) {
                return new AnonymousClass51Y(A004, r03);
            }
            throw C36331k8.A0d("onItemClickListener");
        } else if (i == 6) {
            List list4 = AnonymousClass0D3.A0I;
            View A0K = C36381kD.A0K(LayoutInflater.from(C36371kC.A0B(viewGroup)), R.layout.f9nameremoved);
            AnonymousClass00C.A08(A0K);
            C160627lJ r04 = this.A01;
            if (r04 != null) {
                return new AnonymousClass51c(A0K, r04);
            }
            throw C36331k8.A0d("onItemClickListener");
        } else if (i == 7) {
            C115575j6 r2 = this.A00;
            Chip A005 = A00(C36371kC.A0B(viewGroup));
            C160627lJ r1 = this.A01;
            if (r1 == null) {
                throw C36331k8.A0d("onItemClickListener");
            }
            List list5 = AnonymousClass0D3.A0I;
            return new C1026551a(A005, r1, C36341k9.A0T(r2.A00.A01));
        } else {
            throw C90464aC.A0R("FilterBarAdapter /onCreateViewHolder unhandled view type: ", AnonymousClass000.A0u(), i);
        }
    }

    public int A0J() {
        List list = this.A02;
        if (list != null) {
            return list.size();
        }
        throw C36331k8.A0d("filterListItems");
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r2, int i) {
        C96974oC r22 = (C96974oC) r2;
        AnonymousClass00C.A0D(r22, 0);
        List list = this.A02;
        if (list == null) {
            throw C36331k8.A0d("filterListItems");
        }
        r22.A0B((C125345zl) list.get(i));
    }

    public int getItemViewType(int i) {
        List list = this.A02;
        if (list == null) {
            throw C36331k8.A0d("filterListItems");
        }
        Object obj = list.get(i);
        if (obj instanceof AnonymousClass51Q) {
            return 2;
        }
        if (obj instanceof AnonymousClass51R) {
            return 7;
        }
        if (obj instanceof AnonymousClass51T) {
            return 3;
        }
        if (obj instanceof AnonymousClass51S) {
            return 4;
        }
        if (obj instanceof AnonymousClass51P) {
            return 6;
        }
        throw C36441kJ.A18();
    }
}
