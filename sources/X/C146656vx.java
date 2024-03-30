package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.gallerypicker.PhotoViewPager;
import java.util.HashSet;

/* renamed from: X.6vx  reason: invalid class name and case insensitive filesystem */
public final class C146656vx implements AnonymousClass4R3 {
    public float A00;
    public float A01;
    public AnonymousClass4R3 A02;
    public C157387cs A03;
    public final Context A04;
    public final RecyclerView A05;
    public final C18820ts A06;
    public final PhotoViewPager A07;
    public final C124985z8 A08;
    public final C96024mf A09;
    public final boolean A0A;

    public C146656vx(RecyclerView recyclerView, AnonymousClass1PM r32, C18820ts r33, C1032954s r34, AnonymousClass1H2 r35, C132366Tg r36, AnonymousClass3K8 r37, PhotoViewPager photoViewPager, C25491Gn r39, AnonymousClass6VT r40, C124985z8 r41, AnonymousClass1HA r42, AnonymousClass1GX r43, HashSet hashSet) {
        RecyclerView recyclerView2 = recyclerView;
        AnonymousClass00C.A0D(recyclerView2, 1);
        AnonymousClass1GX r3 = r43;
        AnonymousClass1H2 r10 = r35;
        PhotoViewPager photoViewPager2 = photoViewPager;
        C25491Gn r7 = r39;
        C36321k7.A19(photoViewPager2, r10, r3, r7);
        C18820ts r12 = r33;
        C132366Tg r9 = r36;
        AnonymousClass3K8 r8 = r37;
        AnonymousClass6VT r6 = r40;
        C124985z8 r5 = r41;
        C36321k7.A1C(r5, r8, r12, r9, r6);
        HashSet hashSet2 = hashSet;
        AnonymousClass1PM r17 = r32;
        AnonymousClass1HA r4 = r42;
        C36321k7.A15(hashSet2, r17, r4);
        C1032954s r16 = r34;
        AnonymousClass00C.A0D(r16, 14);
        this.A05 = recyclerView2;
        this.A07 = photoViewPager2;
        this.A08 = r5;
        this.A06 = r12;
        boolean A002 = C111075bh.A00(r6.A01);
        this.A0A = A002;
        Context A0B = C36371kC.A0B(recyclerView2);
        this.A04 = A0B;
        int i = A002 ? R.dimen.f7nameremoved : R.dimen.f7nameremoved;
        AnonymousClass3K8 r21 = r8;
        C25491Gn r22 = r7;
        AnonymousClass6VT r23 = r6;
        C1032954s r18 = r16;
        AnonymousClass1H2 r19 = r10;
        C132366Tg r20 = r9;
        Context context = A0B;
        AnonymousClass1PM r162 = r17;
        C18820ts r172 = r12;
        this.A09 = new C96024mf(context, r162, r172, r18, r19, r20, r21, r22, r23, r5, this, r4, r3, hashSet2, C36361kB.A02(A0B, i));
        recyclerView2.setItemAnimator((C02800By) null);
        recyclerView2.A0U = true;
    }

    public void Bj6(int i) {
        AnonymousClass4R3 r0 = this.A02;
        if (r0 != null) {
            r0.Bj6(i);
        }
    }
}
