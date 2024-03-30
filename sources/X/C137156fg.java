package X;

import java.util.Map;

/* renamed from: X.6fg  reason: invalid class name and case insensitive filesystem */
public final class C137156fg implements C158807iG {
    public static final AnonymousClass7bL A03 = new C137206fl(AnonymousClass7WK.A00, AnonymousClass7ZI.A00);
    public C160267kj A00;
    public final Map A01;
    public final Map A02;

    public void Bo0(Object obj) {
        AnonymousClass63D r1 = (AnonymousClass63D) this.A01.get(obj);
        if (r1 != null) {
            r1.A00 = false;
        } else {
            this.A02.remove(obj);
        }
    }

    public C137156fg(Map map) {
        this.A02 = map;
        this.A01 = C36431kI.A1G();
    }

    public void Azk(C161337ma r8, Object obj, C009003v r10, int i) {
        r8.Bun(-1198538093);
        r8.Bum(444418301);
        r8.Buo(207, obj);
        Object A0X = C90494aF.A0X(r8);
        if (A0X == C129736Ig.A00) {
            C160267kj r0 = this.A00;
            if (r0 == null || r0.B2M(obj)) {
                A0X = new AnonymousClass63D(this, obj);
                ((C136916fF) r8).A0R(A0X);
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Type of the key ");
                A0u.append(obj);
                throw AnonymousClass000.A0c(" is not supported. On Android you can only use types which can be stored inside the Bundle.", A0u);
            }
        }
        C136916fF r5 = (C136916fF) r8;
        C136916fF.A0M(r5, false);
        AnonymousClass63D r6 = (AnonymousClass63D) A0X;
        AnonymousClass6Fz.A00(r8, new C120655rr(C112315dh.A00, r6.A01, true), r10, i & 112);
        C132846Vm.A02(r8, AnonymousClass0AJ.A00, new C154927Uc(r6, this, obj));
        r8.B6a();
        C136916fF.A0M(r5, false);
        C136976fO B6Z = r8.B6Z();
        if (B6Z != null) {
            B6Z.A06 = new C155997Yg(this, obj, r10, i);
        }
    }

    public C137156fg() {
        this(C36431kI.A1G());
    }
}
