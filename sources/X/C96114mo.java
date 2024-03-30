package X;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.calling.PeerAvatarLayout;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.List;

/* renamed from: X.4mo  reason: invalid class name and case insensitive filesystem */
public class C96114mo extends AnonymousClass0CZ {
    public final List A00 = AnonymousClass001.A0I();
    public final /* synthetic */ PeerAvatarLayout A01;

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        if (i == 1) {
            List list = AnonymousClass0D3.A0I;
            return new C96654ng(A00(), this);
        } else if (i == 2) {
            List list2 = AnonymousClass0D3.A0I;
            return new C96664nh(A00(), this);
        } else {
            throw C90514aH.A0s("PeerAvatarLayout/onCreateViewHolder invalid item type");
        }
    }

    public C96114mo(PeerAvatarLayout peerAvatarLayout) {
        this.A01 = peerAvatarLayout;
    }

    private C93064fW A00() {
        int i;
        PeerAvatarLayout peerAvatarLayout = this.A01;
        C93064fW r3 = new C93064fW(peerAvatarLayout.getContext());
        r3.A00 = peerAvatarLayout.A04;
        int i2 = peerAvatarLayout.A01;
        if (!(i2 == 0 || (i = peerAvatarLayout.A00) == 0)) {
            ThumbnailButton thumbnailButton = r3.A02;
            thumbnailButton.A00 = (float) C36371kC.A03(r3, i2);
            thumbnailButton.A02 = C36381kD.A05(r3, i);
        }
        return r3;
    }

    public int A0J() {
        return this.A00.size();
    }

    public void BSE(AnonymousClass0D3 r7, int i) {
        List list = this.A00;
        if (((C161227mP) list.get(i)).BD8() != 1) {
            if (r7 instanceof C96664nh) {
                List list2 = AnonymousClass0D3.A0I;
                C93064fW r3 = ((C96664nh) r7).A00;
                A01(r3, i, 2);
                String charSequence = C90474aD.A0V(r3, ((C69663dt) list.get(i)).A00).toString();
                r3.A02.setVisibility(8);
                ((TextView) C36391kE.A0L(r3.A03, 0)).setText(charSequence);
            }
        } else if (r7 instanceof C96654ng) {
            List list3 = AnonymousClass0D3.A0I;
            C93064fW r5 = ((C96654ng) r7).A00;
            A01(r5, i, 1);
            PeerAvatarLayout peerAvatarLayout = this.A01;
            C88514Sz r32 = peerAvatarLayout.A07;
            if (r32 != null) {
                AnonymousClass1RY r2 = peerAvatarLayout.A08;
                AnonymousClass141 r0 = ((C69653ds) list.get(i)).A00;
                ThumbnailButton thumbnailButton = r5.A02;
                r2.A06(thumbnailButton, r32, r0, true);
                thumbnailButton.setVisibility(0);
                C36391kE.A1K((TextView) C36391kE.A0L(r5.A03, 8));
            }
        }
    }

    public int getItemViewType(int i) {
        return ((C161227mP) this.A00.get(i)).BD8();
    }

    private void A01(C93064fW r8, int i, int i2) {
        int A002;
        r8.clearAnimation();
        List list = this.A00;
        int size = list.size();
        boolean A1S = AnonymousClass000.A1S(i2, 2);
        int A003 = r8.A00(size);
        if (A1S) {
            AnonymousClass1RJ r4 = r8.A03;
            r4.A02().height = (int) (((float) A003) - r8.A02.A00);
            ((TextView) r4.A01()).setMinWidth((int) (((double) A003) * 1.5d));
        } else {
            ThumbnailButton thumbnailButton = r8.A02;
            ViewGroup.LayoutParams layoutParams = thumbnailButton.getLayoutParams();
            layoutParams.height = A003;
            layoutParams.width = A003;
            thumbnailButton.setLayoutParams(layoutParams);
            thumbnailButton.A01 = ((float) (A003 + 1)) / 2.0f;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (i != 0) {
            int size2 = list.size();
            if (size2 <= 1) {
                A002 = 0;
            } else {
                A002 = (int) (((double) r8.A00(size2)) * 0.2d);
            }
            int i3 = -A002;
            if (C36401kF.A1X(this.A01.A0A)) {
                layoutParams2.rightMargin = i3;
            } else {
                layoutParams2.leftMargin = i3;
            }
        }
        r8.setLayoutParams(layoutParams2);
        PeerAvatarLayout peerAvatarLayout = this.A01;
        float f = (float) (peerAvatarLayout.A02 - (peerAvatarLayout.A03 * i));
        r8.setElevation(f);
        r8.setElevation(f);
    }
}
