package X;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.2Hm  reason: invalid class name and case insensitive filesystem */
public abstract class C43432Hm extends AnonymousClass2IQ {
    public int A00 = 0;
    public final View A01 = C012005e.A02(this, R.id.view_once_media_container_small);
    public final WaTextView A02 = C36401kF.A0Q(this, R.id.view_once_media_type_small);
    public final ViewOnceDownloadProgressView A03 = ((ViewOnceDownloadProgressView) C012005e.A02(this, R.id.view_once_download_small));
    public final View A04 = C012005e.A02(this, R.id.conversation_row_root);

    private void A0B() {
        Integer[] numArr = new Integer[5];
        boolean A1b = C36361kB.A1b(numArr, R.string.f12nameremoved);
        AnonymousClass000.A1K(numArr, R.string.f12nameremoved);
        C36331k8.A1V(numArr, R.string.f12nameremoved);
        C36341k9.A1T(numArr, R.string.f12nameremoved);
        C36341k9.A1U(numArr, R.string.f12nameremoved);
        Iterator it = Arrays.asList(numArr).iterator();
        while (it.hasNext()) {
            String A0t = C36381kD.A0t(this, C36341k9.A0A(it));
            SpannableStringBuilder A0P = C36441kJ.A0P(A0t);
            getContext();
            A0P.setSpan(new C37401mJ(), A1b ? 1 : 0, A0t.length(), A1b);
            this.A00 = C36441kJ.A06(getResources(), R.dimen.f7nameremoved, Math.max(this.A00, (int) Layout.getDesiredWidth(A0P, this.A02.getPaint())));
        }
    }

    public void A1Y() {
        AnonymousClass2IR.A0d(this, false);
        A2N();
    }

    public void A2P(boolean z, int i) {
        if (i == 3) {
            WaTextView waTextView = this.A02;
            getContext();
            waTextView.setText(AnonymousClass6YV.A02(getContext().getString(R.string.f12nameremoved)));
            return;
        }
        SpannableStringBuilder A0P = C36441kJ.A0P(getContext().getString(getMediaTypeString()));
        A0P.append(8203).setSpan(new StyleSpan(2), A0P.length() - 1, A0P.length() - 1, 0);
        WaTextView waTextView2 = this.A02;
        waTextView2.setText(A0P);
        C36331k8.A0q(getContext(), waTextView2, getMediaTypeDescriptionString());
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public static void A0C(ViewOnceDownloadProgressView viewOnceDownloadProgressView, AnonymousClass2bU r5, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (i == 0 || i == 1) {
            i2 = R.drawable.ic_viewonce_cancel;
            i3 = R.color.f6nameremoved;
            viewOnceDownloadProgressView.A00(i2, -1, i3);
        } else {
            if (i == 2) {
                if (!z) {
                    i4 = R.drawable.ic_viewonce_one;
                }
                viewOnceDownloadProgressView.A00(R.drawable.ic_viewonce_one, R.drawable.ic_ephemeral_ring, R.color.f6nameremoved);
            } else if (i == 3) {
                i2 = R.drawable.ic_viewonce_retry;
                i3 = C224314h.A01(viewOnceDownloadProgressView.getContext(), R.attr.f4nameremoved);
                viewOnceDownloadProgressView.A00(i2, -1, i3);
            } else {
                if (!z) {
                    i4 = R.drawable.ic_viewonce_download;
                }
                viewOnceDownloadProgressView.A00(R.drawable.ic_viewonce_one, R.drawable.ic_ephemeral_ring, R.color.f6nameremoved);
            }
            viewOnceDownloadProgressView.A00(i4, R.drawable.ic_ephemeral_ring, C224314h.A01(viewOnceDownloadProgressView.getContext(), R.attr.f4nameremoved));
        }
        if (!viewOnceDownloadProgressView.isInEditMode()) {
            AnonymousClass3SU.A01(viewOnceDownloadProgressView.A01, r5, viewOnceDownloadProgressView.A04);
        }
        viewOnceDownloadProgressView.setVisibility(0);
    }

    public void A2L() {
        this.A03.A00(R.drawable.ic_ephemeral_ring, -1, R.color.f6nameremoved);
        WaTextView waTextView = this.A02;
        C36351kA.A15(getResources(), waTextView, R.color.f6nameremoved);
        waTextView.A0B();
        A2M();
        C36331k8.A0q(C36431kI.A0A(this.A01, this, 0), waTextView, getMediaTypeDescriptionString());
    }

    public void A2M() {
        if (this.A00 == 0) {
            A0B();
        }
        this.A02.setWidth(this.A00);
    }

    public void A2N() {
        if (this.A0d.BLu(getFMessage())) {
            C36411kG.A19(this.A04, -1);
        }
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof AnonymousClass2bU);
        super.setFMessage(r2);
    }

    public C43432Hm(Context context, C89004Uw r3, AnonymousClass2bU r4) {
        super(context, r3, r4);
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, getFMessage());
        super.A22(r2, z);
        if (z || A1W) {
            A2N();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2O(android.view.View r4, int r5, boolean r6) {
        /*
            r3 = this;
            X.C33521fV.A01(r4)
            r0 = 1
            X.C011504z.A06(r4, r0)
            if (r5 == 0) goto L_0x0088
            if (r5 == r0) goto L_0x0090
            r2 = 0
            r1 = 2
            if (r5 == r1) goto L_0x006b
            r0 = 3
            if (r5 == r0) goto L_0x0058
            if (r6 != 0) goto L_0x0081
            android.content.Context r1 = r3.getContext()
            int r0 = r3.getMediaTypeDescriptionString()
            X.C36331k8.A0q(r1, r4, r0)
            X.1fX r0 = r3.A09
            r4.setOnClickListener(r0)
            r0 = 2131887288(0x7f1204b8, float:1.9409179E38)
        L_0x0027:
            X.C33521fV.A03(r4, r0)
        L_0x002a:
            X.AnonymousClass2IR.A0W(r4, r3)
            r3.A2P(r6, r5)
            if (r6 == 0) goto L_0x004e
            r0 = 3
            if (r5 != r0) goto L_0x004e
            com.whatsapp.WaTextView r2 = r3.A02
            android.content.res.Resources r1 = r3.getResources()
            android.content.Context r0 = r2.getContext()
            int r0 = X.C36391kE.A04(r0)
        L_0x0043:
            X.C36351kA.A15(r1, r2, r0)
            r2.A0C()
            r0 = 0
            r4.setVisibility(r0)
            return
        L_0x004e:
            com.whatsapp.WaTextView r2 = r3.A02
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131102470(0x7f060b06, float:1.7817379E38)
            goto L_0x0043
        L_0x0058:
            android.content.Context r0 = r3.getContext()
            r1 = 2131893722(0x7f121dda, float:1.9422229E38)
            X.C36331k8.A0q(r0, r4, r1)
            X.1fX r0 = r3.A0A
            r4.setOnClickListener(r0)
            X.C33521fV.A03(r4, r1)
            goto L_0x002a
        L_0x006b:
            if (r6 != 0) goto L_0x0081
            android.content.Context r1 = r3.getContext()
            int r0 = r3.getMediaTypeDescriptionString()
            X.C36331k8.A0q(r1, r4, r0)
            X.1fX r0 = r3.A0B
            r4.setOnClickListener(r0)
            r0 = 2131895662(0x7f12256e, float:1.9426163E38)
            goto L_0x0027
        L_0x0081:
            r4.setOnClickListener(r2)
            X.C011504z.A06(r4, r1)
            goto L_0x002a
        L_0x0088:
            android.content.Context r1 = r3.getContext()
            r0 = 2131894896(0x7f122270, float:1.942461E38)
            goto L_0x0097
        L_0x0090:
            android.content.Context r1 = r3.getContext()
            r0 = 2131894895(0x7f12226f, float:1.9424608E38)
        L_0x0097:
            X.C36331k8.A0q(r1, r4, r0)
            X.1fX r0 = r3.A08
            r4.setOnClickListener(r0)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43432Hm.A2O(android.view.View, int, boolean):void");
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getMediaTypeDescriptionString() {
        AnonymousClass4TX r1 = (AnonymousClass4TX) getFMessage();
        boolean z = r1 instanceof C47012ca;
        int BJ8 = r1.BJ8();
        if (z) {
            if (BJ8 == 1 || BJ8 == 2) {
                return R.string.f12nameremoved;
            }
            return R.string.f12nameremoved;
        } else if (BJ8 == 1 || BJ8 == 2) {
            return R.string.f12nameremoved;
        } else {
            return R.string.f12nameremoved;
        }
    }

    public int getMediaTypeString() {
        AnonymousClass2bU fMessage = getFMessage();
        if (!(fMessage instanceof C47012ca) && (fMessage instanceof C46802bh)) {
            return R.string.f12nameremoved;
        }
        return R.string.f12nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0B();
        A2M();
    }
}
