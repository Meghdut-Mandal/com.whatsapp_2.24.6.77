package X;

import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.gallery.GalleryRecentsFragment;
import com.whatsapp.gallery.GalleryTabHostFragment;
import java.util.Collection;

/* renamed from: X.1sD  reason: invalid class name and case insensitive filesystem */
public final class C39401sD extends AnonymousClass07T implements C160017kK {
    public final int A00;
    public final AnonymousClass6YT A01;
    public final GalleryTabHostFragment A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Long A0C;
    public final Long A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final AnonymousClass00T A0I = C36431kI.A1I(new C83914Bf(this));
    public final AnonymousClass00T A0J = C36431kI.A1I(new C83924Bg(this));
    public final boolean A0K;
    public final boolean A0L;
    public final Resources A0M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39401sD(Resources resources, AnonymousClass01z r3, AnonymousClass6YT r4, GalleryTabHostFragment galleryTabHostFragment, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, Integer num2, Long l, Long l2, String str, String str2, String str3, String str4, int i, boolean z, boolean z2) {
        super(r3, 0);
        AnonymousClass00C.A0D(resources, 2);
        AnonymousClass00C.A0D(r3, 22);
        this.A02 = galleryTabHostFragment;
        this.A0M = resources;
        this.A00 = i;
        this.A0H = str;
        this.A0L = z;
        this.A01 = r4;
        this.A0E = str2;
        this.A0K = z2;
        this.A0C = l;
        this.A0G = str3;
        this.A0A = num;
        this.A03 = bool;
        this.A0F = str4;
        this.A04 = bool2;
        this.A05 = bool3;
        this.A0D = l2;
        this.A08 = bool4;
        this.A07 = bool5;
        this.A09 = bool6;
        this.A06 = bool7;
        this.A0B = num2;
    }

    public int A0H() {
        return 2;
    }

    public void BsA(C132366Tg r2, Collection collection, Collection collection2) {
        AnonymousClass00C.A0D(collection, 0);
        C36321k7.A0x(collection2, r2);
        ((GalleryRecentsFragment) this.A0J.getValue()).BsA(r2, collection, collection2);
    }

    public CharSequence A0F(int i) {
        Resources resources;
        int i2;
        if (i == 0) {
            resources = this.A0M;
            i2 = R.string.f12nameremoved;
        } else if (i == 1) {
            resources = this.A0M;
            i2 = R.string.f12nameremoved;
        } else {
            throw AnonymousClass000.A0d("Invalid item position: ", AnonymousClass000.A0u(), i);
        }
        return C36381kD.A0s(resources, i2);
    }

    public AnonymousClass02E A0M(int i) {
        AnonymousClass00T r0;
        if (i == 0) {
            r0 = this.A0J;
        } else if (i == 1) {
            r0 = this.A0I;
        } else {
            throw AnonymousClass000.A0d("Invalid item position: ", AnonymousClass000.A0u(), i);
        }
        return (AnonymousClass02E) r0.getValue();
    }

    public void Bn7() {
        ((GalleryRecentsFragment) this.A0J.getValue()).Bn7();
    }

    public void BHA(C132366Tg r2, Collection collection) {
        C36321k7.A0w(collection, r2);
        ((GalleryRecentsFragment) this.A0J.getValue()).BHA(r2, collection);
    }
}
