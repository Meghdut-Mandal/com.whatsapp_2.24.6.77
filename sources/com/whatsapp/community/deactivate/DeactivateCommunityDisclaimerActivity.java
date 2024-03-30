package com.whatsapp.community.deactivate;

import X.AnonymousClass001;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass19A;
import X.AnonymousClass1RY;
import X.C03570Gk;
import X.C18800tq;
import X.C18830tt;
import X.C27731Pn;
import X.C28431Sq;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C65533Sl;
import X.C66933Xw;
import X.C87154Nr;
import X.C89324Wc;
import X.C89644Xi;
import X.C90204Zm;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class DeactivateCommunityDisclaimerActivity extends AnonymousClass155 implements C87154Nr {
    public View A00;
    public C28431Sq A01;
    public AnonymousClass16D A02;
    public AnonymousClass171 A03;
    public C27731Pn A04;
    public AnonymousClass141 A05;
    public AnonymousClass147 A06;
    public AnonymousClass19A A07;
    public boolean A08;

    public static final void A01(DeactivateCommunityDisclaimerActivity deactivateCommunityDisclaimerActivity) {
        DeactivateCommunityDisclaimerActivity deactivateCommunityDisclaimerActivity2 = deactivateCommunityDisclaimerActivity;
        if (!C36431kI.A1R(deactivateCommunityDisclaimerActivity)) {
            deactivateCommunityDisclaimerActivity2.A37(new C89644Xi(deactivateCommunityDisclaimerActivity2, 2), 0, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
            return;
        }
        AnonymousClass147 r0 = deactivateCommunityDisclaimerActivity.A06;
        if (r0 == null) {
            throw C36331k8.A0d("parentGroupJid");
        }
        DeactivateCommunityConfirmationFragment deactivateCommunityConfirmationFragment = new DeactivateCommunityConfirmationFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("parent_group_jid", r0.getRawString());
        deactivateCommunityConfirmationFragment.A17(A072);
        deactivateCommunityDisclaimerActivity.Btl(deactivateCommunityConfirmationFragment, "DeactivateCommunityDisclaimerActivity");
    }

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A04 = C36351kA.A0T(A0B);
            this.A07 = C36361kB.A0c(A0B);
            this.A02 = C36341k9.A0R(A0B);
            this.A03 = C36341k9.A0S(A0B);
            this.A01 = C36391kE.A0b(A0B);
        }
    }

    public DeactivateCommunityDisclaimerActivity(int i) {
        this.A08 = false;
        C89324Wc.A00(this, 15);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Toolbar A0O = C36361kB.A0O(this, R.layout.f9nameremoved);
        A0O.setTitle((int) R.string.f12nameremoved);
        setSupportActionBar(A0O);
        int A1X = C36341k9.A1X(this);
        String stringExtra = getIntent().getStringExtra("parent_group_jid");
        C65533Sl r0 = AnonymousClass147.A01;
        AnonymousClass147 A042 = C65533Sl.A04(stringExtra);
        this.A06 = A042;
        AnonymousClass16D r02 = this.A02;
        if (r02 != null) {
            this.A05 = r02.A0D(A042);
            this.A00 = C36361kB.A0D(this, R.id.deactivate_community_main_view);
            ImageView imageView = (ImageView) C36361kB.A0D(this, R.id.deactivate_community_disclaimer_photo_view);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            C27731Pn r1 = this.A04;
            if (r1 != null) {
                AnonymousClass1RY A052 = r1.A05(this, "deactivate-community-disclaimer");
                AnonymousClass141 r03 = this.A05;
                if (r03 == null) {
                    throw C36331k8.A0d("parentGroupContact");
                }
                A052.A09(imageView, r03, dimensionPixelSize);
                C66933Xw.A00(C03570Gk.A0B(this, R.id.community_deactivate_disclaimer_continue_button), this, 47);
                TextEmojiLabel A0e = C36441kJ.A0e(this, R.id.deactivate_community_disclaimer_title);
                Object[] objArr = new Object[A1X];
                AnonymousClass171 r12 = this.A03;
                if (r12 != null) {
                    AnonymousClass141 r04 = this.A05;
                    if (r04 == null) {
                        throw C36331k8.A0d("parentGroupContact");
                    }
                    C36361kB.A1F(r12, r04, objArr, 0);
                    A0e.A0I(getString(R.string.f12nameremoved, objArr));
                    ScrollView scrollView = (ScrollView) C36361kB.A0D(this, R.id.deactivate_community_disclaimer_scrollview);
                    C90204Zm.A00(scrollView.getViewTreeObserver(), scrollView, C36361kB.A0D(this, R.id.community_deactivate_disclaimer_continue_button_container), 9);
                    return;
                }
                throw C36331k8.A0c();
            }
            throw C36331k8.A0d("contactPhotos");
        }
        throw C36331k8.A0Z();
    }

    public DeactivateCommunityDisclaimerActivity() {
        this(0);
    }
}
