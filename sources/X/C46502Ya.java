package X;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.ui.delete.DeleteNewsletterActivity;
import com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity;
import com.whatsapp.phonematching.CountryAndPhoneNumberFragment;
import com.whatsapp.phonematching.MatchPhoneNumberFragment;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.2Ya  reason: invalid class name and case insensitive filesystem */
public abstract class C46502Ya extends AnonymousClass24O implements C88904Um, AnonymousClass4OK {
    public C27731Pn A00;
    public AnonymousClass1C4 A01;
    public C30231Zs A02;
    public C61573Co A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(new C84194Ch(this));
    public final AnonymousClass4TQ A05 = new AnonymousClass34N(this, 1);

    public boolean A2g() {
        return true;
    }

    public void B5d() {
    }

    public void BnG(C61573Co r4) {
        AnonymousClass00C.A0D(r4, 0);
        this.A03 = r4;
        C30231Zs r0 = this.A02;
        if (r0 != null) {
            AnonymousClass4TQ r1 = this.A05;
            AnonymousClass00C.A0D(r1, 0);
            r0.A00.add(r1);
            return;
        }
        throw C36331k8.A0d("numberNormalizationManager");
    }

    public void BwN(C61573Co r4) {
        C30231Zs r2 = this.A02;
        if (r2 != null) {
            AnonymousClass4TQ r1 = this.A05;
            AnonymousClass00C.A0D(r1, 0);
            r2.A00.remove(r1);
            this.A03 = null;
            return;
        }
        throw C36331k8.A0d("numberNormalizationManager");
    }

    public static final void A0F(C46502Ya r2) {
        AnonymousClass02E A0L = r2.getSupportFragmentManager().A0L(R.id.phone_matching_container);
        if (A0L != null) {
            AnonymousClass09Y A0O = C36341k9.A0O(r2);
            A0O.A08(A0L);
            A0O.A01();
        }
        DialogFragment dialogFragment = (DialogFragment) r2.getSupportFragmentManager().A0N("owner_action_confirmation");
        if (dialogFragment != null) {
            dialogFragment.A1c();
        }
    }

    public void BUN() {
    }

    public void BaU() {
        A0F(this);
        if (this instanceof NewsletterTransferOwnershipActivity) {
            NewsletterTransferOwnershipActivity newsletterTransferOwnershipActivity = (NewsletterTransferOwnershipActivity) this;
            AnonymousClass00T r3 = newsletterTransferOwnershipActivity.A02;
            r3.getValue();
            AnonymousClass00T r1 = newsletterTransferOwnershipActivity.A04;
            if (r1.getValue() == null || r3.getValue() == null) {
                newsletterTransferOwnershipActivity.finish();
                return;
            }
            newsletterTransferOwnershipActivity.Bu1(R.string.f12nameremoved);
            C62133Ex r2 = newsletterTransferOwnershipActivity.A00;
            if (r2 != null) {
                C28981Uw A0i = C36431kI.A0i(r1);
                AnonymousClass00C.A0E(A0i, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
                UserJid userJid = (UserJid) r3.getValue();
                AnonymousClass00C.A0E(userJid, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                C90434a9 r7 = new C90434a9(newsletterTransferOwnershipActivity, 7);
                C36321k7.A0w(A0i, userJid);
                AnonymousClass1GQ r12 = r2.A06;
                if (C36391kE.A1Z(r12) && r12.A00.A0E(7124)) {
                    AnonymousClass30I r13 = r2.A04;
                    if (r13 != null) {
                        C19770wU A0Z = C36341k9.A0Z(r13.A00.A00);
                        C18800tq r14 = r13.A00.A00;
                        new AnonymousClass8fR(C36391kE.A0g(r14), A0i, userJid, r7, (AnonymousClass4OL) r14.A5l.get(), r14.Azc(), A0Z).A01();
                        return;
                    }
                    throw C36331k8.A0d("newsletterTransferOwnershipHandler");
                }
                return;
            }
            throw C36331k8.A0d("newsletterMultiAdminManager");
        }
        DeleteNewsletterActivity deleteNewsletterActivity = (DeleteNewsletterActivity) this;
        AnonymousClass00T r22 = deleteNewsletterActivity.A04;
        if (r22.getValue() == null) {
            C81123wV.A00(deleteNewsletterActivity.A05, deleteNewsletterActivity, 21);
        }
        deleteNewsletterActivity.Bu1(R.string.f12nameremoved);
        C30131Zi r32 = deleteNewsletterActivity.A02;
        if (r32 != null) {
            C28981Uw A0i2 = C36431kI.A0i(r22);
            AnonymousClass00C.A0E(A0i2, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
            r32.A0B(A0i2, new C90434a9(deleteNewsletterActivity, 3));
            return;
        }
        throw C36331k8.A0d("newsletterManager");
    }

    public void BbB() {
        CountryAndPhoneNumberFragment countryAndPhoneNumberFragment;
        int i;
        AnonymousClass02E A0L = getSupportFragmentManager().A0L(R.id.phone_matching_container);
        if ((A0L instanceof MatchPhoneNumberFragment) && (countryAndPhoneNumberFragment = (CountryAndPhoneNumberFragment) A0L) != null) {
            String string = getString(R.string.f12nameremoved);
            TextView textView = countryAndPhoneNumberFragment.A04;
            if (string != null) {
                i = 0;
            } else {
                i = countryAndPhoneNumberFragment.A00;
            }
            textView.setVisibility(i);
            TextView textView2 = countryAndPhoneNumberFragment.A04;
            if (string == null) {
                string = "";
            }
            textView2.setText(string);
            countryAndPhoneNumberFragment.A07.requestFocus();
        }
    }

    public boolean Bpq(String str, String str2) {
        C36321k7.A0w(str, str2);
        AnonymousClass1C4 r0 = this.A01;
        if (r0 != null) {
            return r0.A06(str, str2);
        }
        throw C36331k8.A0d("sendMethods");
    }

    public void Btz() {
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        String A0x;
        super.onCreate(bundle);
        boolean z = this instanceof NewsletterTransferOwnershipActivity;
        if (z) {
            i = R.layout.f9nameremoved;
        } else {
            i = R.layout.f9nameremoved;
        }
        Toolbar A0O = C36361kB.A0O(this, i);
        if (z) {
            i2 = R.string.f12nameremoved;
        } else {
            i2 = R.string.f12nameremoved;
        }
        A0O.setTitle(i2);
        setSupportActionBar(A0O);
        C36321k7.A0O(this);
        AnonymousClass00T r1 = this.A04;
        if (r1.getValue() == null) {
            finish();
            return;
        }
        AnonymousClass141 r3 = new AnonymousClass141(C36421kH.A0O(r1));
        WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) C36361kB.A0D(this, R.id.icon);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        C27731Pn r12 = this.A00;
        if (r12 != null) {
            r12.A05(this, "owner-action-newsletter").A09(wDSProfilePhoto, r3, dimensionPixelSize);
            if (z) {
                i3 = R.drawable.vec_ic_transfer_ownership;
                i4 = R.color.f6nameremoved;
            } else {
                i3 = R.drawable.ic_action_delete;
                i4 = R.color.f6nameremoved;
            }
            wDSProfilePhoto.setProfileBadge(new C50932ms(new C50902mp(i4, R.color.f6nameremoved), i3));
            AnonymousClass3Y4.A00(C03570Gk.A0B(this, R.id.primary_button), this, 26);
            TextEmojiLabel A0e = C36441kJ.A0e(this, R.id.nl_owner_action_title);
            if (z) {
                NewsletterTransferOwnershipActivity newsletterTransferOwnershipActivity = (NewsletterTransferOwnershipActivity) this;
                Object value = newsletterTransferOwnershipActivity.A03.getValue();
                if (value == null || (A0x = C36321k7.A0A(newsletterTransferOwnershipActivity, value, R.string.f12nameremoved)) == null) {
                    A0x = "";
                }
            } else {
                DeleteNewsletterActivity deleteNewsletterActivity = (DeleteNewsletterActivity) this;
                AnonymousClass141 r13 = new AnonymousClass141(C36421kH.A0O(deleteNewsletterActivity.A04));
                Object[] A0L = AnonymousClass001.A0L();
                AnonymousClass171 r0 = deleteNewsletterActivity.A00;
                if (r0 != null) {
                    A0x = C36351kA.A0x(deleteNewsletterActivity, r0.A0H(r13), A0L, 0, R.string.f12nameremoved);
                } else {
                    throw C36331k8.A0c();
                }
            }
            A0e.A0I(A0x);
            ScrollView scrollView = (ScrollView) C36361kB.A0D(this, R.id.scrollview);
            C90204Zm.A00(scrollView.getViewTreeObserver(), scrollView, C36361kB.A0D(this, R.id.button_container), 9);
            return;
        }
        throw C36331k8.A0d("contactPhotos");
    }
}
