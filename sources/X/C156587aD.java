package X;

import android.graphics.Typeface;
import android.text.Spannable;

/* renamed from: X.7aD  reason: invalid class name and case insensitive filesystem */
public final class C156587aD extends AnonymousClass00R implements C019408g {
    public final /* synthetic */ C019508h $resolveTypeface;
    public final /* synthetic */ Spannable $this_setFontAttributes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156587aD(Spannable spannable, C019508h r3) {
        super(3);
        this.$this_setFontAttributes = spannable;
        this.$resolveTypeface = r3;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        AnonymousClass6FJ r10 = (AnonymousClass6FJ) obj;
        int A0I = AnonymousClass000.A0I(obj2);
        int A0I2 = AnonymousClass000.A0I(obj3);
        Spannable spannable = this.$this_setFontAttributes;
        C019508h r8 = this.$resolveTypeface;
        C129796Im r4 = r10.A05;
        AnonymousClass72W r3 = r10.A08;
        if (r3 == null) {
            r3 = AnonymousClass72W.A03;
        }
        AnonymousClass68R r0 = r10.A06;
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = 0;
        }
        AnonymousClass68R r2 = new AnonymousClass68R(i);
        AnonymousClass68S r02 = r10.A07;
        if (r02 != null) {
            i2 = r02.A00;
        } else {
            i2 = 1;
        }
        spannable.setSpan(new C91954ct((Typeface) r8.BKu(r4, r3, r2, new AnonymousClass68S(i2))), A0I, A0I2, 33);
        return AnonymousClass0AJ.A00;
    }
}
