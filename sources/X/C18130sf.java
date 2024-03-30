package X;

import android.view.View;

/* renamed from: X.0sf  reason: invalid class name and case insensitive filesystem */
public class C18130sf extends C06760Uy {
    public final int A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        super(r3, r2, 0, 28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        super(r2, r3, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        return;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18130sf(int r5) {
        /*
            r4 = this;
            r4.A00 = r5
            switch(r5) {
                case 0: goto L_0x0011;
                case 1: goto L_0x0021;
                case 2: goto L_0x0017;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            r2 = 2131434558(0x7f0b1c3e, float:1.8490933E38)
        L_0x000a:
            r1 = 28
            r0 = 0
            r4.<init>(r3, r2, r0, r1)
            return
        L_0x0011:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            r2 = 2131434564(0x7f0b1c44, float:1.8490945E38)
            goto L_0x000a
        L_0x0017:
            r3 = 2131434566(0x7f0b1c46, float:1.849095E38)
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r1 = 64
            r0 = 30
            goto L_0x002a
        L_0x0021:
            r3 = 2131434559(0x7f0b1c3f, float:1.8490935E38)
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r1 = 8
            r0 = 28
        L_0x002a:
            r4.<init>(r2, r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18130sf.<init>(int):void");
    }

    public /* bridge */ /* synthetic */ Object A01(View view) {
        boolean A06;
        switch (this.A00) {
            case 0:
                A06 = AnonymousClass07R.A06(view);
                break;
            case 1:
                return AnonymousClass07R.A01(view);
            case 2:
                return AnonymousClass0VO.A00(view);
            default:
                A06 = AnonymousClass07R.A05(view);
                break;
        }
        return Boolean.valueOf(A06);
    }

    public /* bridge */ /* synthetic */ void A03(View view, Object obj) {
        switch (this.A00) {
            case 0:
                AnonymousClass07R.A04(view, AnonymousClass000.A1X(obj));
                return;
            case 1:
                AnonymousClass07R.A02(view, (CharSequence) obj);
                return;
            case 2:
                AnonymousClass0VO.A01(view, (CharSequence) obj);
                return;
            default:
                AnonymousClass07R.A03(view, AnonymousClass000.A1X(obj));
                return;
        }
    }
}
