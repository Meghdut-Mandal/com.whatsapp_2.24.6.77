package X;

import android.content.Context;

/* renamed from: X.6m7  reason: invalid class name and case insensitive filesystem */
public final class C140756m7 implements C160347kr {
    public final int A00;
    public final /* synthetic */ C114845hv A01;
    public final /* synthetic */ C009003v A02;

    public C140756m7(C114845hv r2, C114865hx r3, C009003v r4) {
        this.A01 = r2;
        this.A02 = r4;
        this.A00 = r3.A00.size();
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C157857en r8 = (C157857en) obj4;
        AnonymousClass00C.A0D(context, 0);
        C114845hv r2 = this.A01;
        r2.A00 = context;
        if (r8 != null) {
            try {
                r8.Bjo();
            } catch (Throwable th) {
                r2.A00 = null;
                throw th;
            }
        }
        r2.A00 = null;
    }

    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        C36321k7.A0w(context, obj);
        C114845hv r2 = this.A01;
        C009003v r0 = this.A02;
        r2.A00 = context;
        try {
            return (C157857en) r0.invoke(r2, obj);
        } finally {
            r2.A00 = null;
        }
    }

    public String BB1() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("binder:");
        return AnonymousClass000.A0o(Integer.valueOf(this.A00), A0u);
    }

    public /* bridge */ /* synthetic */ boolean BtZ(Object obj, Object obj2, Object obj3, Object obj4) {
        C36321k7.A0w(obj, obj2);
        return !AnonymousClass6GY.A00(obj, obj2);
    }
}
