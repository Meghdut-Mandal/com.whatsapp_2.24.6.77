package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Set;

/* renamed from: X.2IP  reason: invalid class name */
public class AnonymousClass2IP extends C175028Zj {
    public final FrameLayout A00;
    public final WaTextView A01 = C36401kF.A0Q(this, R.id.view_once_file_size);
    public final ViewOnceDownloadProgressView A02;
    public final ViewGroup A03;
    public final ViewGroup A04;
    public final TextView A05;
    public final TextView A06;
    public final WaTextView A07 = C36401kF.A0Q(this, R.id.view_once_media_type_large);

    private void A0B(AnonymousClass2bU r10, int i) {
        FrameLayout frameLayout = this.A00;
        String valueOf = String.valueOf(frameLayout.getContentDescription());
        String A0E = C66013Ui.A0E(this.A0E, r10.A00);
        String A002 = AnonymousClass3UM.A00(this.A0E, this.A19.A08(r10.A0I));
        frameLayout.setContentDescription(C55782vB.A00(this.A0E, Arrays.asList(i == 2 ? new String[]{valueOf, A002} : new String[]{valueOf, A0E, A002}), false));
    }

    public void A1d() {
        ViewOnceDownloadProgressView viewOnceDownloadProgressView = this.A02;
        AnonymousClass2bU fMessage = getFMessage();
        if (!viewOnceDownloadProgressView.isInEditMode()) {
            AnonymousClass3SU.A01(viewOnceDownloadProgressView.A01, fMessage, viewOnceDownloadProgressView.A04);
        }
    }

    public void A2P(boolean z, int i) {
        WaTextView waTextView = this.A07;
        getContext();
        waTextView.setText(AnonymousClass6YV.A02(getContext().getString(getMediaTypeString())));
    }

    public AnonymousClass2IP(Context context, C89004Uw r7, AnonymousClass2bU r8) {
        super(context, r7, r8);
        FrameLayout A0T = C36441kJ.A0T(this, R.id.view_once_media_container_large);
        this.A00 = A0T;
        this.A02 = (ViewOnceDownloadProgressView) C012005e.A02(this, R.id.view_once_download_large);
        this.A03 = C36411kG.A0O(A0T, R.id.date_wrapper);
        this.A05 = C36391kE.A0O(A0T, R.id.date);
        View view = this.A01;
        this.A04 = C36411kG.A0O(view, R.id.date_wrapper);
        this.A06 = C36391kE.A0O(view, R.id.date);
        A0T.setForeground(getInnerFrameForegroundDrawable());
        A2N();
    }

    public void A1f() {
        C225314u r1;
        AnonymousClass2bU fMessage = getFMessage();
        AnonymousClass4TX r2 = (AnonymousClass4TX) fMessage;
        if (r2.BJ8() == 2) {
            AnonymousClass3T1 r22 = (AnonymousClass3T1) r2;
            AnonymousClass141 A042 = C66013Ui.A04(this.A1C, r22);
            if (A042 != null) {
                boolean z = r22 instanceof C46892bq;
                int i = R.string.f12nameremoved;
                int i2 = R.string.f12nameremoved;
                if (z) {
                    i = R.string.f12nameremoved;
                    i2 = R.string.f12nameremoved;
                }
                C39001qm A002 = AnonymousClass3LW.A00(getContext());
                A002.A0d(i);
                Resources resources = getResources();
                Object[] objArr = new Object[1];
                C36361kB.A1F(this.A0n, A042, objArr, 0);
                C39001qm.A0A(A002, resources.getString(i2, objArr));
                A002.A0r(true);
                C36341k9.A11(A002);
            }
        } else if (this.A02 != null && !C37541mm.A0A(this)) {
        } else {
            if (!fMessage.A1g()) {
                Log.w("conversation/row/viewOnce/no file");
                if (!A2J() && (r1 = (C225314u) C36361kB.A05(this)) != null) {
                    this.A0L.A03(r1);
                    return;
                }
                return;
            }
            AnonymousClass3FI r23 = new AnonymousClass3FI(getContext());
            r23.A0A = true;
            C64933Qa r12 = fMessage.A1J;
            AnonymousClass11F r0 = r12.A00;
            C18740tg.A06(r0);
            r23.A05 = r0;
            r23.A06 = r12;
            r23.A01 = 3;
            C36371kC.A16(r23.A00(), this);
            postDelayed(new C80283v9(this, fMessage, 7), 220);
        }
    }

    public void A2L() {
        super.A2L();
        A1v(getFMessage());
    }

    public void A2N() {
        super.A2N();
        int BJ8 = ((AnonymousClass4TX) getFMessage()).BJ8();
        if (BJ8 == 0) {
            this.A01.setVisibility(8);
            AnonymousClass2bU fMessage = getFMessage();
            int A002 = C66013Ui.A00(fMessage);
            C37541mm.A04(this, fMessage);
            C43432Hm.A0C(this.A02, fMessage, A002, false);
            A2O(this.A00, A002, false);
            A0B(fMessage, A002);
            A1v(fMessage);
        } else if (BJ8 == 1) {
            this.A00.setVisibility(8);
            A2L();
            WaTextView waTextView = this.A02;
            waTextView.setText(R.string.f12nameremoved);
            C36331k8.A0q(getContext(), waTextView, getMediaTypeDescriptionString());
        } else if (BJ8 == 2) {
            this.A01.setVisibility(8);
            AnonymousClass2bU fMessage2 = getFMessage();
            C37541mm.A04(this, fMessage2);
            C43432Hm.A0C(this.A02, fMessage2, 2, false);
            A2O(this.A00, 2, false);
            A0B(fMessage2, 2);
            A1v(fMessage2);
        }
    }

    public void A2O(View view, int i, boolean z) {
        super.A2O(view, i, z);
        if (i == 2) {
            this.A01.setVisibility(8);
            return;
        }
        AnonymousClass2bU fMessage = getFMessage();
        WaTextView waTextView = this.A01;
        waTextView.setText(C66013Ui.A0E(this.A0E, fMessage.A00));
        waTextView.setVisibility(0);
    }

    public TextView getDateView() {
        if (((AnonymousClass4TX) getFMessage()).BJ8() == 0) {
            return this.A05;
        }
        return this.A06;
    }

    public ViewGroup getDateWrapper() {
        if (((AnonymousClass4TX) getFMessage()).BJ8() == 0) {
            return this.A03;
        }
        return this.A04;
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        innerFrameLayouts.add(this.A00);
        return innerFrameLayouts;
    }

    private void setTransitionNames(AnonymousClass2bU r1) {
        C37541mm.A04(this, r1);
    }
}
