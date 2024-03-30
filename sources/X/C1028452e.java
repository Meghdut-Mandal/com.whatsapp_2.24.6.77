package X;

import android.view.View;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.util.Log;

/* renamed from: X.52e  reason: invalid class name and case insensitive filesystem */
public final class C1028452e extends C42631z8 {
    public C143946rN A00;
    public final C32481dg A01;
    public final AnonymousClass171 A02;
    public final AnonymousClass1RY A03;
    public final AnonymousClass1RY A04;
    public final C19970wo A05;
    public final C18820ts A06;
    public final C20810yC A07;
    public final AnonymousClass00T A08;
    public final AnonymousClass00T A09;
    public final AnonymousClass00T A0A;
    public final AnonymousClass00T A0B;
    public final AnonymousClass00T A0C;
    public final AnonymousClass00T A0D;
    public final AnonymousClass00T A0E;
    public final AnonymousClass00T A0F;
    public final AnonymousClass00T A0G;
    public final AnonymousClass00T A0H;
    public final AnonymousClass00T A0I;
    public final AnonymousClass00T A0J;
    public final AnonymousClass00T A0K;
    public final AnonymousClass00T A0L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1028452e(View view, AnonymousClass1LI r7, C32481dg r8, AnonymousClass171 r9, AnonymousClass1RY r10, AnonymousClass1RY r11, C19970wo r12, C18820ts r13, C20810yC r14, AnonymousClass13J r15) {
        super(view);
        AnonymousClass00C.A0D(r15, 1);
        C36321k7.A1A(r7, r12, r14, r9, 2);
        AnonymousClass00C.A0D(r13, 7);
        this.A05 = r12;
        this.A07 = r14;
        this.A02 = r9;
        this.A06 = r13;
        this.A01 = r8;
        this.A03 = r10;
        this.A04 = r11;
        C000800j r1 = C000800j.NONE;
        this.A0L = C001400p.A00(r1, new AnonymousClass7K7(view));
        this.A0C = C001400p.A00(r1, new AnonymousClass7K3(view));
        this.A0E = C001400p.A00(r1, new AnonymousClass7K5(view));
        this.A0A = C001400p.A00(r1, new AnonymousClass7K2(view));
        this.A09 = C001400p.A00(r1, new AnonymousClass7K1(view));
        this.A0D = C001400p.A00(r1, new AnonymousClass7K4(view));
        this.A0H = C001400p.A00(r1, new AnonymousClass7K9(view));
        this.A0G = C001400p.A00(r1, new AnonymousClass7K8(view));
        this.A0K = C001400p.A00(r1, new AnonymousClass7KC(view));
        this.A0J = C001400p.A00(r1, new AnonymousClass7KB(view));
        this.A0F = C001400p.A00(r1, new AnonymousClass7K6(view));
        this.A0B = C001400p.A00(r1, new C153237No(view, r7));
        this.A08 = C001400p.A00(r1, AnonymousClass7QB.A00);
        this.A0I = C001400p.A00(r1, new AnonymousClass7KA(this));
        AnonymousClass00T r4 = this.A0K;
        AnonymousClass00T r2 = this.A08;
        ((View) r4.getValue()).setOnTouchListener((AnonymousClass3Z8) r2.getValue());
        AnonymousClass00T r3 = this.A0J;
        ((View) r3.getValue()).setOnTouchListener((AnonymousClass3Z8) r2.getValue());
        if (this.A01 == null) {
            Log.w("CallsHistoryCallItemViewHolder/setEventListeners event listener is null");
        } else {
            AnonymousClass00T r22 = this.A0C;
            C48892iE.A00((View) r22.getValue(), this, 21);
            ((View) r22.getValue()).setOnLongClickListener(new C89564Xa(this, 4));
            AnonymousClass00T r23 = this.A0E;
            C48892iE.A00((View) r23.getValue(), this, 20);
            ((View) r23.getValue()).setOnLongClickListener(new C89564Xa(this, 3));
            View view2 = this.A0H;
            C48892iE.A00(view2, this, 22);
            view2.setOnLongClickListener(new C89564Xa(this, 5));
            C36361kB.A17((View) r4.getValue(), this, 42);
            C36361kB.A17((View) r3.getValue(), this, 41);
        }
        C34081gQ.A02(view);
    }

    public SelectionCheckView A0C() {
        return (SelectionCheckView) this.A0L.getValue();
    }

    public /* bridge */ /* synthetic */ C34841hj A0B() {
        return this.A00;
    }
}
