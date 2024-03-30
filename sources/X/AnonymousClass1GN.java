package X;

import com.whatsapp.util.Log;

/* renamed from: X.1GN  reason: invalid class name */
public class AnonymousClass1GN extends AnonymousClass1GM {
    public final AnonymousClass1D5 A00;

    public AnonymousClass1GN(AnonymousClass1D5 r4, C19770wU r5) {
        super(new C18910u1((Object) null, new C36251k0(r5, 15)));
        this.A00 = r4;
    }

    public C101314xL A0A(AnonymousClass4R0 r3, C131516Pj r4) {
        StringBuilder sb = new StringBuilder();
        sb.append("mediauploadqueue/enqueue ");
        sb.append(r4);
        Log.i(sb.toString());
        return (C101314xL) A04(r3, r4);
    }

    /* renamed from: A0B */
    public boolean A08(AnonymousClass4R0 r3) {
        StringBuilder sb = new StringBuilder();
        sb.append("mediauploadqueue/cancel ");
        sb.append(r3);
        Log.i(sb.toString());
        return super.A08(r3);
    }
}
