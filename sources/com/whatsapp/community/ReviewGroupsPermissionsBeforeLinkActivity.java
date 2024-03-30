package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass141;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass49O;
import X.AnonymousClass49P;
import X.AnonymousClass4FN;
import X.C000800j;
import X.C001400p;
import X.C18800tq;
import X.C18830tt;
import X.C220412q;
import X.C27731Pn;
import X.C28431Sq;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C66933Xw;
import X.C89324Wc;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

public final class ReviewGroupsPermissionsBeforeLinkActivity extends AnonymousClass155 {
    public C28431Sq A00;
    public AnonymousClass16D A01;
    public C27731Pn A02;
    public C33751fs A03;
    public C220412q A04;
    public boolean A05;
    public final AnonymousClass00T A06;
    public final AnonymousClass00T A07;
    public final AnonymousClass00T A08;

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A04 = C36351kA.A0a(A0B);
            this.A01 = C36341k9.A0R(A0B);
            this.A02 = C36351kA.A0T(A0B);
            this.A00 = C36391kE.A0b(A0B);
            this.A03 = C36361kB.A0X(r1);
        }
    }

    public ReviewGroupsPermissionsBeforeLinkActivity(int i) {
        this.A05 = false;
        C89324Wc.A00(this, 14);
    }

    public void onCreate(Bundle bundle) {
        int i;
        Object[] objArr;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C66933Xw.A00(findViewById(R.id.review_groups_permissions_confirm_button), this, 44);
        C66933Xw.A00(findViewById(R.id.review_groups_permissions_back), this, 45);
        TextView A0Q = C36391kE.A0Q(this, R.id.review_groups_permissions_community_title);
        C220412q r1 = this.A04;
        if (r1 != null) {
            AnonymousClass00T r5 = this.A08;
            String A0D = r1.A0D(C36421kH.A0O(r5));
            AnonymousClass00T r7 = this.A06;
            int size = ((List) C36381kD.A0p(r7)).size();
            Resources resources = getResources();
            if (A0D != null) {
                i = R.plurals.f10nameremoved;
                objArr = AnonymousClass001.A0M();
                AnonymousClass000.A1L(objArr, size, 0);
                objArr[1] = A0D;
            } else {
                i = R.plurals.f10nameremoved;
                objArr = new Object[1];
                AnonymousClass000.A1L(objArr, size, 0);
            }
            String quantityString = resources.getQuantityString(i, size, objArr);
            AnonymousClass00C.A0A(quantityString);
            A0Q.setText(quantityString);
            TextView A0Q2 = C36391kE.A0Q(this, R.id.review_groups_permissions_community_desc);
            int size2 = ((List) C36381kD.A0p(r7)).size();
            boolean A1b = C36331k8.A1b(this.A07);
            Resources resources2 = getResources();
            int i2 = R.plurals.f10nameremoved;
            if (A1b) {
                i2 = R.plurals.f10nameremoved;
            }
            String quantityString2 = resources2.getQuantityString(i2, size2);
            AnonymousClass00C.A0A(quantityString2);
            A0Q2.setText(quantityString2);
            ImageView A0Q3 = C36411kG.A0Q(this, R.id.review_groups_permissions_community_photo);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            AnonymousClass16D r0 = this.A01;
            if (r0 != null) {
                AnonymousClass141 A09 = r0.A04.A09(C36421kH.A0O(r5));
                if (A09 != null) {
                    C27731Pn r12 = this.A02;
                    if (r12 != null) {
                        r12.A05(this, "review-linked-group-permissions").A09(A0Q3, A09, dimensionPixelSize);
                        return;
                    }
                    throw C36331k8.A0d("contactPhotos");
                }
                return;
            }
            throw C36331k8.A0Z();
        }
        throw C36331k8.A0d("chatsCache");
    }

    public static final void A01(ReviewGroupsPermissionsBeforeLinkActivity reviewGroupsPermissionsBeforeLinkActivity) {
        super.onBackPressed();
    }

    public ReviewGroupsPermissionsBeforeLinkActivity() {
        this(0);
        this.A06 = C36431kI.A1I(new AnonymousClass49O(this));
        this.A08 = C001400p.A00(C000800j.PUBLICATION, new AnonymousClass4FN(this));
        this.A07 = C36431kI.A1I(new AnonymousClass49P(this));
    }
}
