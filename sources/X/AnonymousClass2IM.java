package X;

import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2IM  reason: invalid class name */
public class AnonymousClass2IM extends AnonymousClass8Z1 implements C88244Ry {
    public C20830yE A00;
    public AnonymousClass1Y4 A01;
    public AnonymousClass1ST A02;
    public C23981Ap A03;
    public AnonymousClass1HA A04;
    public AnonymousClass336 A05;
    public List A06;
    public final View A07 = C012005e.A02(this, R.id.bubble_header);
    public final View A08 = C012005e.A02(this, R.id.conversation_row_sticker_album_sticker_container);
    public final ArrayList A09;

    public void A1Y() {
        A0C(false);
        AnonymousClass2IR.A0d(this, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r5 == 100) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1d() {
        /*
            r8 = this;
            r7 = 0
        L_0x0001:
            java.util.ArrayList r1 = r8.A09
            int r0 = r1.size()
            if (r7 >= r0) goto L_0x006d
            java.util.List r0 = r8.A06
            int r0 = r0.size()
            if (r7 >= r0) goto L_0x0068
            java.lang.Object r0 = r1.get(r7)
            X.3Ph r0 = (X.C64753Ph) r0
            X.3Sw r0 = r0.A09
            X.1RJ r6 = r0.A05
            java.util.List r0 = r8.A06
            java.lang.Object r0 = r0.get(r7)
            X.2bU r0 = (X.AnonymousClass2bU) r0
            X.3Qj r1 = X.AnonymousClass2bU.A00(r0)
            boolean r0 = r1.A0f
            if (r0 == 0) goto L_0x006b
            boolean r0 = r1.A0d
            if (r0 != 0) goto L_0x006b
            long r0 = r1.A0E
            int r2 = (int) r0
            X.1Y4 r1 = r8.A01
            java.util.List r0 = r8.A06
            java.lang.Object r0 = r0.get(r7)
            X.2bU r0 = (X.AnonymousClass2bU) r0
            boolean r0 = r1.A09(r0)
            int r5 = r2 / 2
            if (r0 == 0) goto L_0x0046
            int r5 = r5 + 50
        L_0x0046:
            if (r5 == 0) goto L_0x004d
            r0 = 100
            r4 = 0
            if (r5 != r0) goto L_0x004e
        L_0x004d:
            r4 = 1
        L_0x004e:
            int r3 = r8.A2D(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            X.AnonymousClass000.A1C(r8, r1)
            java.lang.String r0 = "#updateProgress"
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r1)
            r1 = 1
            X.4ZN r0 = new X.4ZN
            r0.<init>(r5, r3, r1, r4)
            r6.A08(r0, r2)
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x0001
        L_0x006b:
            r5 = 0
            goto L_0x004d
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IM.A1d():void");
    }

    public boolean A25() {
        return false;
    }

    public boolean A27() {
        return false;
    }

    public int getCapabilities() {
        return 0;
    }

    public int getMainChildMaxWidth() {
        return 0;
    }

    public int getMaxAlbumSize() {
        return 2;
    }

    public int getMinAlbumSize() {
        return 2;
    }

    private void A0B() {
        if (this.A06 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.A09;
                if (i < arrayList.size()) {
                    if (i < this.A06.size()) {
                        C64753Ph r3 = (C64753Ph) arrayList.get(i);
                        C89004Uw r2 = r3.A0D.A0c;
                        if (r2 == null || !r2.BK6()) {
                            C36341k9.A0y(r3.A02);
                        } else {
                            C64753Ph.A00(r3);
                            r3.A02.setSelected(r2.BMT(r3.A07));
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private void A0C(boolean z) {
        AnonymousClass2bU r0;
        if (this.A06 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.A09;
                if (i < arrayList.size()) {
                    int size = this.A06.size();
                    C64753Ph r1 = (C64753Ph) arrayList.get(i);
                    if (i < size) {
                        r0 = (AnonymousClass2bU) this.A06.get(i);
                    } else {
                        r0 = null;
                    }
                    r1.A01(r0, z);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void A1C() {
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            C64753Ph r2 = (C64753Ph) it.next();
            StickerView stickerView = r2.A0A;
            stickerView.clearAnimation();
            r2.A00 = 0.0f;
            stickerView.invalidate();
        }
    }

    public void A1D(C64933Qa r5) {
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            C64753Ph r1 = (C64753Ph) it.next();
            if (r5.equals(r1.A07.A1J)) {
                StickerView stickerView = r1.A0A;
                stickerView.setBackgroundDrawable(new AnonymousClass4VQ(r1));
                C37631mx r2 = new C37631mx(r1);
                r2.setDuration(2400);
                r2.setInterpolator(new AccelerateInterpolator());
                stickerView.startAnimation(r2);
                return;
            }
        }
    }

    public void A1y(AnonymousClass3T1 r5) {
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            C64753Ph r3 = (C64753Ph) it.next();
            AnonymousClass2bU r0 = r3.A07;
            if (r0 != null && AnonymousClass3T1.A0B(r5, r0)) {
                C89004Uw r2 = r3.A0D.A0c;
                if (r2 != null && r2.BK6()) {
                    r3.A02.setSelected(r2.Bvv(r3.A07));
                    return;
                }
                return;
            }
        }
    }

    public void A21(AnonymousClass3T1 r4, int i) {
        if (r4 instanceof AnonymousClass2bU) {
            Iterator it = this.A09.iterator();
            while (it.hasNext()) {
                C64753Ph r1 = (C64753Ph) it.next();
                AnonymousClass2bU r0 = r1.A07;
                if (r0 != null && AnonymousClass3T1.A0B(r4, r0)) {
                    r1.A01 = i;
                    r1.A01((AnonymousClass2bU) r4, false);
                    return;
                }
            }
        }
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        super.A22(this.A0K, z);
        if (z) {
            A0C(false);
        }
        A0B();
    }

    public boolean A2C(C64933Qa r4) {
        List list = this.A06;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C36391kE.A0l(it).A1J.equals(r4)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r5.A0K != r6.get(0)) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2F(java.util.List r6, boolean r7) {
        /*
            r5 = this;
            java.util.List r0 = r5.A06
            r4 = 0
            if (r0 == 0) goto L_0x000e
            X.3T1 r1 = r5.A0K
            java.lang.Object r0 = r6.get(r4)
            r3 = 0
            if (r1 == r0) goto L_0x000f
        L_0x000e:
            r3 = 1
        L_0x000f:
            int r1 = r6.size()
            r0 = 2
            if (r1 == r0) goto L_0x001c
            java.lang.String r0 = "ConversationRowStickerAlbum/setAlbumMessages improper number of stickers in sticker album"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x001c:
            if (r7 != 0) goto L_0x0039
            java.util.List r0 = r5.A06
            if (r0 == 0) goto L_0x0038
            r2 = 0
        L_0x0023:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x0039
            java.util.List r0 = r5.A06
            java.lang.Object r1 = r0.get(r2)
            java.lang.Object r0 = r6.get(r2)
            if (r1 != r0) goto L_0x0038
            int r2 = r2 + 1
            goto L_0x0023
        L_0x0038:
            r7 = 1
        L_0x0039:
            r5.A06 = r6
            X.3T1 r0 = X.C36411kG.A0n(r6, r4)
            super.A22(r0, r7)
            if (r3 != 0) goto L_0x0046
            if (r7 == 0) goto L_0x0049
        L_0x0046:
            r5.A0C(r3)
        L_0x0049:
            r5.A0B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IM.A2F(java.util.List, boolean):void");
    }

    public void BuP() {
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            ((C64753Ph) it.next()).A0A.A04();
        }
    }

    public C51422nn getBubbleType() {
        boolean A0O = this.A0F.A0O(C36411kG.A0n(this.A06, 0).A1J.A00);
        if (!AnonymousClass143.A0G(C36411kG.A0n(this.A06, 0).A1J.A00) || (C36411kG.A0n(this.A06, 0).A1J.A02 && !A0O)) {
            return C51422nn.NONE;
        }
        return C51422nn.CONTACT;
    }

    public AnonymousClass2bU getFMessage() {
        return (AnonymousClass2bU) this.A0K;
    }

    public int getMessageCount() {
        return C36371kC.A06(this.A06);
    }

    public AnonymousClass2IM(Context context, C89004Uw r5, AnonymousClass2bU r6, AnonymousClass1HA r7) {
        super(context, r5, r6);
        ArrayList A0I = AnonymousClass001.A0I();
        this.A09 = A0I;
        this.A04 = r7;
        A0I.add(new C64753Ph(C36441kJ.A0U(this, R.id.sticker_1), this));
        A0I.add(new C64753Ph(C36441kJ.A0U(this, R.id.sticker_2), this));
    }

    public boolean A1E() {
        return C37541mm.A08(this);
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

    public int getReactionsViewVerticalOverlap() {
        return C36411kG.A05(this);
    }
}
