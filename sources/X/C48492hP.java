package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.status.ContactStatusThumbnail;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2hP  reason: invalid class name and case insensitive filesystem */
public abstract class C48492hP extends C42581z3 {
    public final AnonymousClass1RY A00;
    public final C70143ef A01;
    public final AnonymousClass1Pp A02;
    public final C55662uz A03;
    public final AnonymousClass39Z A04;
    public final AnonymousClass3O2 A05;

    public final void A0D(ImageView imageView, C48032ga r15, boolean z, boolean z2) {
        AnonymousClass3T1 r6;
        boolean z3;
        C48032ga r2 = r15;
        ImageView imageView2 = imageView;
        AnonymousClass00C.A0D(imageView, 1);
        boolean z4 = r15 instanceof C48012gY;
        if (z4) {
            r6 = ((C48012gY) r2).A01;
        } else {
            r6 = ((C48022gZ) r2).A02;
        }
        if (r6 != null) {
            if (z4) {
                z3 = ((C48012gY) r2).A04;
            } else {
                z3 = ((C48022gZ) r2).A04;
            }
            boolean z5 = z;
            if (r6 instanceof C46812bi) {
                if (this.A03 != null) {
                    C46812bi r62 = (C46812bi) r6;
                    AnonymousClass00C.A0D(r62, 0);
                    Context context = imageView.getContext();
                    imageView.setTag("");
                    AnonymousClass00C.A0B(context);
                    int A002 = C55482uh.A00(context, r62);
                    if (z) {
                        imageView.setBackgroundColor(A002);
                        C36391kE.A18(context, imageView, R.drawable.vec_ic_voice_status);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        return;
                    }
                    imageView.setImageBitmap(C55642ux.A00(C55502uj.A00(context, A002)));
                    return;
                }
                throw AnonymousClass001.A09("Audio status loader is not provided");
            } else if (r6 instanceof AnonymousClass2bU) {
                AnonymousClass39Z r9 = this.A04;
                if (r9 != null) {
                    if (z3) {
                        r9.A02.A00(r6);
                    }
                    r9.A04.Bp1(new AnonymousClass755(r6, r9, imageView, 22, z2));
                    return;
                }
                throw AnonymousClass001.A09("Media status loader is not provided");
            } else if (r6 instanceof AnonymousClass2bV) {
                AnonymousClass3O2 r22 = this.A05;
                if (r22 != null) {
                    AnonymousClass2bV r63 = (AnonymousClass2bV) r6;
                    AnonymousClass00C.A0D(r63, 0);
                    imageView.setTag("");
                    Context context2 = imageView.getContext();
                    Drawable drawable = imageView.getDrawable();
                    if (r22.A00.A0E(7899)) {
                        AnonymousClass00C.A0B(context2);
                        ((C19770wU) r22.A02.get()).Boy(new C80743vt(r22, context2, drawable, imageView2, r63, 2, z5));
                        return;
                    }
                    AnonymousClass00C.A0B(context2);
                    C36861lQ A003 = AnonymousClass3O2.A00(context2, drawable, r63, r22, z5);
                    if (A003 != null) {
                        if (imageView instanceof ContactStatusThumbnail) {
                            A003.A00 = ((ThumbnailButton) imageView2).A00 / ((float) 2);
                        }
                        imageView.setImageDrawable(A003);
                        return;
                    }
                    return;
                }
                throw AnonymousClass001.A09("Text status loader is not provided");
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Class type not supported: ");
                C36321k7.A1Z(A0u, r6.getClass().getSimpleName());
            }
        }
    }

    public final void A0E(ContactStatusThumbnail contactStatusThumbnail, C48032ga r10) {
        int i;
        int i2;
        AnonymousClass00C.A0D(contactStatusThumbnail, 1);
        C65663Sz A002 = r10.A00();
        int i3 = 0;
        if (A002 != null) {
            i = A002.A03();
            i3 = A002.A02();
        } else {
            i = 0;
        }
        Map map = contactStatusThumbnail.A05;
        map.clear();
        contactStatusThumbnail.A05(i, i3);
        if (r10 instanceof C48012gY) {
            AnonymousClass3EL r0 = ((C48012gY) r10).A02;
            AnonymousClass3EK r6 = r0.A02;
            Context context = contactStatusThumbnail.getContext();
            int i4 = 0;
            for (Object next : r0.A03) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    throw C36351kA.A0v();
                }
                Set set = r6.A01;
                C64933Qa r1 = ((AnonymousClass3T1) next).A1J;
                if (set.contains(r1)) {
                    i2 = R.color.f6nameremoved;
                } else if (r6.A02.contains(r1)) {
                    i2 = R.color.f6nameremoved;
                } else {
                    i4 = i5;
                }
                C36421kH.A1M(Integer.valueOf(i4), map, AnonymousClass00F.A00(context, i2));
                i4 = i5;
            }
        }
    }

    public C48492hP(View view, AnonymousClass1Pp r2, AnonymousClass1RY r3, C70143ef r4, C55662uz r5, AnonymousClass39Z r6, AnonymousClass3O2 r7) {
        super(view);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r2;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r5;
    }

    public final void A0C(ImageView imageView, AnonymousClass141 r5) {
        boolean A1V = C36371kC.A1V(imageView);
        if (r5.A0H instanceof C177638e7) {
            this.A02.A07(imageView, r5);
        } else {
            this.A00.A06(imageView, this.A01, r5, A1V);
        }
    }
}
