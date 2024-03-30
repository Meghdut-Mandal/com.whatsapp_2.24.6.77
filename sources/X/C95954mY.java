package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.4mY  reason: invalid class name and case insensitive filesystem */
public class C95954mY extends AnonymousClass0CZ {
    public final List A00 = AnonymousClass001.A0I();
    public final /* synthetic */ C147406xA A01;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        LayoutInflater A09 = C36331k8.A09(viewGroup);
        if (i == 0) {
            return new C106625Kp(A09.inflate(R.layout.f9nameremoved, viewGroup, false));
        }
        return new C106615Ko(A09.inflate(R.layout.f9nameremoved, viewGroup, false));
    }

    public C95954mY(C147406xA r2) {
        this.A01 = r2;
        A0B(true);
    }

    public int A0J() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        int i2;
        Drawable drawable;
        C96964oB r82 = (C96964oB) r8;
        C1267165e r6 = (C1267165e) this.A00.get(i);
        boolean A1S = AnonymousClass000.A1S(this.A01.A00, r6.A00());
        AnonymousClass3YC r3 = new AnonymousClass3YC(this, r6, 28);
        if (r82 instanceof C106625Kp) {
            C106625Kp r83 = (C106625Kp) r82;
            if (r6 instanceof C106595Km) {
                WaTextView waTextView = r83.A02;
                waTextView.setText(((C106595Km) r6).A02);
                waTextView.setTypeface(r83.A00);
                if (A1S) {
                    drawable = AnonymousClass00E.A00(waTextView.getContext(), R.drawable.shape_avatar_sticker_picker_item);
                } else {
                    drawable = null;
                }
                waTextView.setBackground(drawable);
                waTextView.setTextColor(AnonymousClass00F.A04(waTextView.getContext(), R.color.f6nameremoved));
                waTextView.setSelected(A1S);
                r83.A01.setOnClickListener(r3);
                return;
            }
            throw AnonymousClass001.A08("item should be AvatarHeaderTextItem");
        }
        C106615Ko r84 = (C106615Ko) r82;
        if (r6 instanceof C106605Kn) {
            WaImageView waImageView = r84.A01;
            C106605Kn r62 = (C106605Kn) r6;
            C90474aD.A10(waImageView, r62.A00, A1S);
            waImageView.setOnClickListener(r3);
            View view = r84.A00;
            Context context = view.getContext();
            if (A1S) {
                i2 = C224514j.A00(view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
            } else {
                i2 = R.color.f6nameremoved;
            }
            C36341k9.A0q(context, view, i2);
            waImageView.setContentDescription(r62.A02);
            return;
        }
        throw AnonymousClass001.A08("item should be AvocadoHeaderIconItem");
    }

    public int getItemViewType(int i) {
        if (this.A00.get(i) instanceof C106595Km) {
            return 0;
        }
        return 1;
    }
}
