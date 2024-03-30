package com.whatsapp.biz.catalog.view;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass16N;
import X.AnonymousClass17Y;
import X.AnonymousClass1KK;
import X.AnonymousClass1QZ;
import X.AnonymousClass2ZL;
import X.AnonymousClass2ZO;
import X.AnonymousClass2xF;
import X.AnonymousClass3A6;
import X.AnonymousClass4ZA;
import X.AnonymousClass9R0;
import X.AnonymousClass9R1;
import X.C012005e;
import X.C18700tb;
import X.C18740tg;
import X.C18830tt;
import X.C19460v5;
import X.C195119So;
import X.C196089Xp;
import X.C19730wQ;
import X.C19770wU;
import X.C199439fJ;
import X.C202279lS;
import X.C207109uZ;
import X.C207269up;
import X.C21010yW;
import X.C24801Dv;
import X.C29461Ws;
import X.C32691e2;
import X.C36351kA;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import X.C47942gR;
import X.C603337l;
import X.C63553Km;
import X.C69393dS;
import X.C69403dT;
import X.C87034Nf;
import X.C88914Un;
import X.C89034Uz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public class CatalogMediaCard extends FrameLayout implements C18700tb {
    public int A00;
    public int A01;
    public C195119So A02;
    public C196089Xp A03;
    public C87034Nf A04;
    public AnonymousClass16N A05;
    public UserJid A06;
    public AnonymousClass9R1 A07;
    public C47942gR A08;
    public AnonymousClass1QZ A09;
    public Boolean A0A;
    public boolean A0B;
    public C88914Un A0C;
    public String A0D;
    public boolean A0E;

    public CatalogMediaCard(Context context) {
        this(context, (AttributeSet) null);
    }

    public void A03(List list) {
        int i = 5;
        if (this.A0A.booleanValue() && (i = list.size()) > 3) {
            int i2 = i;
            i = 6;
            if (i2 < 6) {
                i = 3;
            }
        }
        this.A08.A08(list, i);
    }

    public void A01() {
        this.A03.A00();
        AnonymousClass16N r4 = this.A05;
        C88914Un[] r3 = {r4.A01, r4.A00};
        int i = 0;
        do {
            C88914Un r0 = r3[i];
            if (r0 != null) {
                r0.cleanup();
            }
            i++;
        } while (i < 2);
        r4.A00 = null;
        r4.A01 = null;
    }

    public void A02(C207109uZ r32, UserJid userJid, String str, boolean z, boolean z2) {
        C69393dS r14;
        UserJid userJid2 = userJid;
        this.A06 = userJid2;
        boolean z3 = z2;
        this.A0E = z3;
        String str2 = str;
        this.A0D = str2;
        AnonymousClass16N r9 = this.A05;
        C63553Km r8 = r9.A07;
        C207109uZ r12 = r32;
        if (r8.A02(r12)) {
            C69393dS r142 = r9.A01;
            C69393dS r143 = r142;
            if (r142 == null) {
                C21010yW r4 = r9.A0G;
                C32691e2 r15 = r9.A05;
                C89034Uz r3 = r9.A0D;
                AnonymousClass2ZO r2 = r9.A0I;
                C69393dS r144 = new C69393dS(r15, r8, r3, this, r9.A0E, r4, r2, r9.A0K);
                r9.A01 = r144;
                r143 = r144;
            }
            C18740tg.A06(r12);
            r143.A00 = r12;
            r14 = r143;
        } else {
            C69403dT r7 = r9.A00;
            if (r7 == null) {
                AnonymousClass17Y r30 = r9.A04;
                C19730wQ r19 = r9.A06;
                C24801Dv r18 = r9.A03;
                C19770wU r17 = r9.A0J;
                C19460v5 r16 = r9.A02;
                C202279lS r152 = r9.A0C;
                C603337l r6 = r9.A0E;
                C29461Ws r5 = r9.A0B;
                AnonymousClass1KK r42 = r9.A08;
                AnonymousClass2ZL r33 = r9.A0A;
                AnonymousClass9R0 r22 = r9.A0H;
                C199439fJ r1 = r9.A0F;
                C19770wU r29 = r17;
                C24801Dv r172 = r18;
                AnonymousClass17Y r182 = r30;
                r7 = new C69403dT(r16, r172, r182, r19, r8, r42, r9.A09, r33, r5, r152, r6, r1, r22, r29);
                r9.A00 = r7;
            }
            r7.A03 = str2;
            r7.A02 = r12;
            r7.A01 = this;
            r7.A00 = getContext();
            C69403dT r145 = r9.A00;
            r145.A04 = z3;
            r14 = r145;
        }
        this.A0C = r14;
        if (z && r14.BJp(userJid2)) {
            this.A0C.BXq(userJid2);
        } else if (this.A0C.BtF()) {
            setVisibility(8);
        } else {
            this.A0C.BKb(userJid2);
            this.A0C.B0f();
            this.A0C.B7E(userJid2, this.A01);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A09;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public String getMediaCardViewErrorText() {
        return this.A08.getError();
    }

    public void setError(int i) {
        this.A08.setError(C36381kD.A0t(this, i));
    }

    public void setupThumbnails(UserJid userJid, int i, List list) {
        C88914Un r1 = this.A0C;
        UserJid userJid2 = this.A06;
        C18740tg.A06(userJid2);
        int BGI = r1.BGI(userJid2);
        if (BGI != this.A00) {
            A03(A00(userJid, C36381kD.A0t(this, i), list, this.A0E));
            this.A00 = BGI;
        }
    }

    public ArrayList A00(UserJid userJid, String str, List list, boolean z) {
        ArrayList A0I = AnonymousClass001.A0I();
        int i = 0;
        int i2 = 0;
        while (true) {
            List list2 = list;
            if (i >= list2.size() || i2 >= 6) {
                return A0I;
            }
            C207269up r6 = (C207269up) list2.get(i);
            if (r6.A01() && !r6.A0F.equals(this.A0D)) {
                i2++;
                A0I.add(new AnonymousClass3A6((Drawable) null, this.A0C.BII(r6, userJid, z), new AnonymousClass4ZA(r6, this, 0), (String) null, str, AnonymousClass000.A0p("thumb-transition-", AnonymousClass000.A0r("_", AnonymousClass000.A0v(r6.A0F), 0), AnonymousClass000.A0u())));
            }
            i++;
        }
        return A0I;
    }

    public C87034Nf getCatalogPreviewItemClickListener() {
        return this.A04;
    }

    public C88914Un getMediaCardViewPresenter() {
        return this.A0C;
    }

    public void setCatalogPreviewItemClickListener(C87034Nf r1) {
        this.A04 = r1;
    }

    public CatalogMediaCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0B) {
            this.A0B = true;
            C18830tt r1 = C36391kE.A0W(generatedComponent()).A00;
            this.A02 = (C195119So) r1.A0y.get();
            this.A05 = r1.A1r();
            this.A07 = (AnonymousClass9R1) r1.A0z.get();
        }
        this.A0A = C36381kD.A0j();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A03);
            this.A0A = Boolean.valueOf(obtainStyledAttributes.getBoolean(0, false));
            obtainStyledAttributes.recycle();
        }
        C47942gR r0 = (C47942gR) C012005e.A02(C36411kG.A0J(C36351kA.A0C(this), this, this.A0A.booleanValue() ? R.layout.f9nameremoved : R.layout.f9nameremoved), R.id.product_catalog_media_card_view);
        this.A08 = r0;
        r0.setTopShadowVisibility(0);
        C36421kH.A0y(this, this.A08, getPaddingLeft(), getPaddingTop(), getPaddingRight());
        this.A03 = new C196089Xp(this.A02, this.A07);
        int thumbnailPixelSize = this.A08.getThumbnailPixelSize();
        this.A01 = thumbnailPixelSize;
        this.A02.A00 = thumbnailPixelSize;
    }

    public CatalogMediaCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
