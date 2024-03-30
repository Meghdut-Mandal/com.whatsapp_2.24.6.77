package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.contact.picker.SelectedListContactPickerFragment;
import com.whatsapp.contact.picker.VoipContactPickerFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.1w2  reason: invalid class name and case insensitive filesystem */
public final class C40741w2 extends AnonymousClass0CZ {
    public final List A00 = AnonymousClass001.A0I();
    public final /* synthetic */ SelectedListContactPickerFragment A01;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        return new C42141yL(C36371kC.A0J(this.A01.A0c(), viewGroup, R.layout.f9nameremoved, false));
    }

    public C40741w2(SelectedListContactPickerFragment selectedListContactPickerFragment) {
        this.A01 = selectedListContactPickerFragment;
    }

    public int A0J() {
        return this.A00.size();
    }

    public final void A0L(AnonymousClass141 r9) {
        List list = this.A00;
        int indexOf = list.indexOf(r9);
        if (indexOf > -1) {
            list.remove(indexOf);
            A09(indexOf);
        }
        if (list.isEmpty()) {
            SelectedListContactPickerFragment selectedListContactPickerFragment = this.A01;
            selectedListContactPickerFragment.A1g();
            SelectedListContactPickerFragment.A05(selectedListContactPickerFragment, C36341k9.A0G(selectedListContactPickerFragment).getDimensionPixelSize(R.dimen.f7nameremoved), 0);
        }
        SelectedListContactPickerFragment selectedListContactPickerFragment2 = this.A01;
        if (selectedListContactPickerFragment2 instanceof VoipContactPickerFragment) {
            VoipContactPickerFragment voipContactPickerFragment = (VoipContactPickerFragment) selectedListContactPickerFragment2;
            VoipContactPickerFragment.A00(voipContactPickerFragment);
            AnonymousClass6W1 A26 = voipContactPickerFragment.A26();
            Jid A0h = C36411kG.A0h(r9);
            if (A0h == null) {
                Log.e("VoipContactPickerFragment/deselected contact has no jid, skipping log");
            } else {
                boolean A20 = voipContactPickerFragment.A20();
                A26.A03.execute(new AnonymousClass755(A26, A0h, voipContactPickerFragment.A00, 11, A20));
            }
        }
        selectedListContactPickerFragment2.A1l();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r10, int i) {
        C42141yL r102 = (C42141yL) r10;
        AnonymousClass00C.A0D(r102, 0);
        AnonymousClass141 r8 = (AnonymousClass141) this.A00.get(i);
        TextView textView = r102.A01;
        SelectedListContactPickerFragment selectedListContactPickerFragment = this.A01;
        AnonymousClass171 r1 = selectedListContactPickerFragment.A0p;
        String str = null;
        String str2 = null;
        if (r1 != null) {
            str2 = C36381kD.A0v(r1, r8);
        }
        textView.setText(str2);
        AnonymousClass1RY r12 = selectedListContactPickerFragment.A0r;
        if (r12 != null) {
            r12.A0B(r102.A02, r8, false);
        }
        View view = r102.A00;
        AnonymousClass3YE.A00(view, this, r8, 45);
        Context A1D = selectedListContactPickerFragment.A1D();
        if (A1D != null) {
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass171 r0 = selectedListContactPickerFragment.A0p;
            if (r0 != null) {
                str = r0.A0H(r8);
            }
            str = C36391kE.A0v(A1D, str, A0L, 0, R.string.f12nameremoved);
        }
        view.setContentDescription(str);
        C33521fV.A03(view, R.string.f12nameremoved);
    }
}
