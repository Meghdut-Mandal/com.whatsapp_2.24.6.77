package X;

import androidx.compose.ui.text.font.FontFamilyResolverImpl;

/* renamed from: X.7aO  reason: invalid class name and case insensitive filesystem */
public final class C156697aO extends AnonymousClass00R implements C019508h {
    public final /* synthetic */ C138036hA this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156697aO(C138036hA r2) {
        super(4);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object BKu(Object obj, Object obj2, Object obj3, Object obj4) {
        Object value;
        C129796Im r5 = (C129796Im) obj;
        AnonymousClass72W r6 = (AnonymousClass72W) obj2;
        int i = ((AnonymousClass68R) obj3).A00;
        int i2 = ((AnonymousClass68S) obj4).A00;
        FontFamilyResolverImpl fontFamilyResolverImpl = (FontFamilyResolverImpl) this.this$0.A04;
        int i3 = ((C138076hG) fontFamilyResolverImpl.A03).A00;
        if (!(i3 == 0 || i3 == Integer.MAX_VALUE)) {
            int i4 = r6.A00 + i3;
            if (i4 < 1) {
                i4 = 1;
            } else if (i4 > 1000) {
                i4 = 1000;
            }
            r6 = new AnonymousClass72W(i4);
        }
        C161527n3 A00 = FontFamilyResolverImpl.A00(fontFamilyResolverImpl, new C128416Ce(r5, r6, (Object) null, i, i2));
        if (!(A00 instanceof C138106hJ)) {
            AnonymousClass62R r1 = new AnonymousClass62R(A00, this.this$0.A00);
            this.this$0.A00 = r1;
            value = r1.A00;
        } else {
            value = A00.getValue();
        }
        AnonymousClass00C.A0E(value, "null cannot be cast to non-null type android.graphics.Typeface");
        return value;
    }
}
