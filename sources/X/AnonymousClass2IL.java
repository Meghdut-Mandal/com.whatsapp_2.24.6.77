package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.2IL  reason: invalid class name */
public class AnonymousClass2IL extends AnonymousClass8ZX implements C88244Ry {
    public AnonymousClass005 A00;
    public AnonymousClass005 A01;
    public boolean A02;
    public final C65633Sw A03;
    public final View A04 = findViewById(R.id.bubble_header);

    public void A1Y() {
        A0B(false);
        AnonymousClass2IR.A0d(this, false);
    }

    public void A1f() {
    }

    public void A1i(int i, boolean z) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2IL(Context context, C89004Uw r19, C46962bx r20, C23981Ap r21, AnonymousClass1HA r22, AnonymousClass336 r23) {
        super(context, r19, r20);
        C20810yC r9 = this.A0G;
        AnonymousClass1XY r5 = this.A0U;
        AnonymousClass1X4 r6 = this.A0Z;
        C18820ts r8 = this.A0E;
        AnonymousClass17Y r4 = this.A0R;
        C19770wU r0 = this.A21;
        AnonymousClass1SV r15 = this.A1y;
        this.A03 = new C65633Sw(this, r4, r5, r6, this.A02, r8, r9, this.A04, this.A05, r21, r22, r23, r15, r0);
        A0B(true);
    }

    private void A0B(boolean z) {
        int i;
        C46962bx r3 = (C46962bx) ((AnonymousClass2bU) this.A0K);
        if (z) {
            boolean z2 = false;
            C89004Uw r0 = this.A0c;
            if (r0 != null) {
                z2 = r0.BNW(r3);
                StickerView stickerView = this.A03.A0G;
                if (z2) {
                    stickerView.A01 = new C89154Vl(this, r3, 0);
                } else {
                    stickerView.A01 = null;
                }
            }
            this.A03.A02 = z2;
        }
        C65633Sw r4 = this.A03;
        View.OnLongClickListener onLongClickListener = this.A2W;
        StickerView stickerView2 = r4.A0G;
        stickerView2.setOnLongClickListener(onLongClickListener);
        stickerView2.A02 = this.A02;
        r4.A05(new AnonymousClass31E(this), r3, z);
        if (C66013Ui.A0z(getFMessage())) {
            r4.A03();
        } else if (C37541mm.A09(this)) {
            r4.A04();
        } else {
            r4.A02();
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        ViewGroup viewGroup = this.A07;
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(viewGroup);
        if (r3.A0S() == null && r3.A0V == null) {
            Context context = viewGroup.getContext();
            if (this.A0K.A1J.A02) {
                AnonymousClass00C.A0D(context, 0);
                i = R.drawable.balloon_outgoing_normal_stkr;
            } else {
                AnonymousClass00C.A0D(context, 0);
                i = R.drawable.balloon_incoming_normal_stkr;
            }
            Drawable A0H = C36381kD.A0H(context, i);
            AnonymousClass00C.A08(A0H);
            setDateWrapperBackground(A0H);
        } else {
            setDateWrapperBackground((Drawable) null);
            dimensionPixelSize = -dimensionPixelSize;
        }
        A0a.topMargin = dimensionPixelSize;
        viewGroup.setLayoutParams(A0a);
        if (this.A0d.BLu(r3)) {
            View view = this.A04;
            if (view != null) {
                C36411kG.A19(view, -1);
            }
            View findViewById = findViewById(R.id.sticker_root);
            if (findViewById != null) {
                C36411kG.A19(findViewById, -1);
            }
        }
        A1d();
        A2I(r3);
        if (this.A0G.A0E(1396)) {
            A1e();
        }
    }

    private void setDateWrapperBackground(Drawable drawable) {
        ViewGroup viewGroup = this.A07;
        int dimensionPixelOffset = C36341k9.A0F(viewGroup).getDimensionPixelOffset(R.dimen.f7nameremoved);
        int paddingBottom = viewGroup.getPaddingBottom();
        int paddingTop = viewGroup.getPaddingTop();
        viewGroup.setBackground(drawable);
        viewGroup.setPadding(dimensionPixelOffset, paddingTop, dimensionPixelOffset, paddingBottom);
    }

    public void A1B() {
        ((AnonymousClass1YD) this.A01.get()).A00();
    }

    public boolean A1J() {
        AnonymousClass3S2 r0;
        if (this.A0G.A0E(1396)) {
            C46962bx r1 = (C46962bx) ((AnonymousClass2bU) this.A0K);
            if (!r1.A1J.A02 && (r0 = r1.A05) != null) {
                return r0.A0A;
            }
        }
        return false;
    }

    public boolean A1L() {
        AnonymousClass11F r2;
        AnonymousClass3S2 r0;
        C63563Kn r5 = (C63563Kn) this.A00.get();
        C46962bx r7 = (C46962bx) ((AnonymousClass2bU) this.A0K);
        C64933Qa A06 = AnonymousClass3T1.A06(r7);
        AnonymousClass11F r1 = A06.A00;
        if (r1 == null) {
            return false;
        }
        AnonymousClass141 A012 = r5.A03.A01(r1);
        C19730wQ r02 = r5.A00;
        r02.A0G();
        AnonymousClass142 r03 = r02.A0E;
        if (r03 != null) {
            r2 = r03.A0H;
        } else {
            r2 = null;
        }
        if (A06.A02) {
            return false;
        }
        if ((r7.A1j() || ((r0 = r7.A05) != null && r0.A07)) && !r5.A05.A01(A012, r2) && r5.A00()) {
            return true;
        }
        return false;
    }

    public void A1Z() {
        C65633Sw r1 = this.A03;
        r1.A01 = true;
        AnonymousClass1SV r2 = r1.A0J;
        C18740tg.A06(r2);
        AnonymousClass2bU r4 = r1.A00;
        r2.A0E(r1.A0G, r4, r1.A0I, r4.A1J, false);
    }

    public void A1d() {
        AnonymousClass1RJ r2 = this.A03.A05;
        AnonymousClass1Y4 r0 = this.A04;
        C18740tg.A06(r0);
        A2E(r2, AnonymousClass3SU.A01(r0, (AnonymousClass2bU) this.A0K, r2));
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A0B(A1W);
        }
    }

    public void BuP() {
        this.A03.A0G.A04();
    }

    public C46962bx getFMessage() {
        return (C46962bx) ((AnonymousClass2bU) this.A0K);
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof C46962bx);
        super.setFMessage(r2);
    }

    public boolean A1E() {
        return C37541mm.A08(this);
    }

    public boolean A1K() {
        if (!C37541mm.A09(this) || !this.A0d.BtQ() || ((C46962bx) ((AnonymousClass2bU) this.A0K)).A05 == null) {
            return false;
        }
        return true;
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
}
