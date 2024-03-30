package X;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* renamed from: X.3nl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C75763nl implements AnonymousClass4RA {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass11F A02;
    public final /* synthetic */ C28371Sj A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C75763nl(Context context, AnonymousClass11F r2, C28371Sj r3, int i, boolean z) {
        this.A03 = r3;
        this.A01 = context;
        this.A00 = i;
        this.A02 = r2;
        this.A04 = z;
    }

    public final void Bek(SpannableStringBuilder spannableStringBuilder, C80163ux r19, int i, int i2) {
        C28371Sj r2 = this.A03;
        Context context = this.A01;
        int i3 = this.A00;
        AnonymousClass11F r14 = this.A02;
        boolean z = this.A04;
        C19730wQ r8 = r2.A00;
        C220412q r11 = r2.A06;
        AnonymousClass005 r15 = r2.A08;
        int i4 = i2;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        spannableStringBuilder2.setSpan(new AnonymousClass21q(context, r8, r2.A01, r2.A02, r11, r2.A07, r19, r14, r15, i3), i, i4, 33);
        if (z) {
            context.getApplicationContext();
            spannableStringBuilder2.setSpan(new C37401mJ(), i + 1, i4, 33);
        }
    }
}
