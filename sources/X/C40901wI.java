package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1wI  reason: invalid class name and case insensitive filesystem */
public final class C40901wI extends AnonymousClass0CZ {
    public AnonymousClass2L7 A00;
    public List A01 = C023409w.A00;
    public final C58482zw A02;
    public final C58492zx A03;
    public final C58512zz A04;
    public final AnonymousClass300 A05;
    public final AnonymousClass1RY A06;
    public final C32111cz A07;
    public final AnonymousClass00T A08;
    public final C58502zy A09;
    public final C28331Sf A0A;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        LayoutInflater A0J = C36341k9.A0J(viewGroup, 0);
        int i2 = R.layout.f9nameremoved;
        int i3 = i;
        if (i3 != 2) {
            if (i3 == 3 || i3 == 4) {
                i2 = R.layout.f9nameremoved;
            } else {
                i2 = R.layout.f9nameremoved;
                if (i3 == 5) {
                    i2 = R.layout.f9nameremoved;
                }
            }
        }
        View inflate = A0J.inflate(i2, viewGroup, false);
        if (i3 == 0) {
            C58482zw r1 = this.A02;
            AnonymousClass00C.A0B(inflate);
            AnonymousClass1RY r7 = this.A06;
            C32111cz r10 = this.A07;
            List list = AnonymousClass0D3.A0I;
            C18800tq r12 = r1.A00.A00;
            AnonymousClass1Pp A0V = C36361kB.A0V(r12);
            C70143ef A7W = C18830tt.A7W(r12.A00);
            return new C48292h1(inflate, C36361kB.A0S(r12), A0V, C36341k9.A0S(r12), r7, C36341k9.A0T(r12), A7W, r10);
        } else if (i3 == 1) {
            C58492zx r13 = this.A03;
            AnonymousClass00C.A0B(inflate);
            AnonymousClass1RY r5 = this.A06;
            C32111cz r8 = this.A07;
            List list2 = AnonymousClass0D3.A0I;
            C18800tq r14 = r13.A00.A00;
            return new C48302h2(inflate, C36361kB.A0V(r14), r5, C18830tt.A7W(r14.A00), C36431kI.A0v(r14), r8, C36351kA.A0q(r14));
        } else if (i3 == 2) {
            AnonymousClass00C.A0B(inflate);
            return new C48362hC(inflate, this.A07);
        } else if (i3 == 5) {
            List list3 = AnonymousClass0D3.A0I;
            AnonymousClass00C.A0B(inflate);
            return new C48322h5(inflate, this.A07);
        } else if (i3 == 4) {
            AnonymousClass300 r15 = this.A05;
            AnonymousClass00C.A0B(inflate);
            AnonymousClass1RY r72 = this.A06;
            C32111cz r9 = this.A07;
            List list4 = AnonymousClass0D3.A0I;
            C18800tq r16 = r15.A00.A00;
            C18830tt r0 = r16.A00;
            C70143ef A7W2 = C18830tt.A7W(r0);
            AnonymousClass1Pp A0V2 = C36361kB.A0V(r16);
            AnonymousClass39Z ADB = C18830tt.ADB(r0);
            AnonymousClass3O2 ADE = C18830tt.ADE(r0);
            C55662uz r102 = new C55662uz();
            return new C48272gz(inflate, C36361kB.A0S(r16), A0V2, C36341k9.A0S(r16), r72, A7W2, r9, r102, ADB, ADE, C36351kA.A0q(r16));
        } else if (i3 == 3) {
            C58512zz r17 = this.A04;
            AnonymousClass00C.A0B(inflate);
            AnonymousClass1RY r73 = this.A06;
            C32111cz r92 = this.A07;
            List list5 = AnonymousClass0D3.A0I;
            C18800tq r18 = r17.A00.A00;
            C18830tt r02 = r18.A00;
            C70143ef A7W3 = C18830tt.A7W(r02);
            AnonymousClass1Pp A0V3 = C36361kB.A0V(r18);
            AnonymousClass39Z ADB2 = C18830tt.ADB(r02);
            AnonymousClass3O2 ADE2 = C18830tt.ADE(r02);
            C55662uz r103 = new C55662uz();
            return new AnonymousClass2h4(inflate, C36361kB.A0S(r18), A0V3, C36341k9.A0S(r18), r73, A7W3, r92, r103, ADB2, ADE2, C36351kA.A0q(r18));
        } else {
            throw AnonymousClass001.A08("View type not supported");
        }
    }

    public int A0J() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r2, int i) {
        C42581z3 r22 = (C42581z3) r2;
        AnonymousClass00C.A0D(r22, 0);
        C36401kF.A1N(r22, this.A01, i);
    }

    public int getItemViewType(int i) {
        C51982oh r0;
        Object obj = this.A01.get(i);
        if (obj instanceof C48022gZ) {
            if (C36331k8.A1b(this.A0A.A02)) {
                r0 = C51982oh.RECT_STATUS_TILE;
            } else {
                r0 = C51982oh.CONTACT_STATUS;
            }
        } else if (obj instanceof C48012gY) {
            if (C36331k8.A1b(this.A0A.A02)) {
                r0 = C51982oh.RECT_MY_STATUS_TILE;
            } else {
                r0 = C51982oh.MY_STATUS;
            }
        } else if (!(obj instanceof C48002gX)) {
            throw C36441kJ.A18();
        } else if (C36331k8.A1b(this.A0A.A02)) {
            r0 = C51982oh.RECT_STATUS_TILE_MUTED;
        } else {
            r0 = C51982oh.MUTED_STATUSES;
        }
        return r0.ordinal();
    }

    public C40901wI(C58482zw r2, C58492zx r3, C58502zy r4, C58512zz r5, AnonymousClass300 r6, AnonymousClass1RY r7, C28331Sf r8, C32111cz r9, C19770wU r10) {
        C36321k7.A1B(r10, r8, r2, r3, r4);
        C36321k7.A13(r5, r6, r7);
        this.A0A = r8;
        this.A02 = r2;
        this.A03 = r3;
        this.A09 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = r9;
        this.A08 = C36431kI.A1I(new AnonymousClass4EE(r10));
    }
}
