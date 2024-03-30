package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass03Y;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1RY;
import X.AnonymousClass3TE;
import X.AnonymousClass3Y4;
import X.AnonymousClass4TO;
import X.AnonymousClass4UZ;
import X.C000800j;
import X.C001400p;
import X.C012005e;
import X.C18820ts;
import X.C20380xT;
import X.C20810yC;
import X.C220412q;
import X.C27731Pn;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C44072La;
import X.C62133Ex;
import X.C65073Qp;
import X.C85234Gh;
import X.C85244Gi;
import X.C86334Kn;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.contact.picker.SelectedContactsList;
import com.whatsapp.jid.Jid;
import com.whatsapp.mentions.MentionableEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class InviteNewsletterAdminMessageFragment extends Hilt_InviteNewsletterAdminMessageFragment implements AnonymousClass4UZ {
    public AnonymousClass16D A00;
    public AnonymousClass171 A01;
    public AnonymousClass1RY A02;
    public C27731Pn A03;
    public SelectedContactsList A04;
    public C18820ts A05;
    public C220412q A06;
    public C44072La A07;
    public C20810yC A08;
    public MentionableEntry A09;
    public C62133Ex A0A;
    public C20380xT A0B;
    public C32681e1 A0C;
    public ArrayList A0D = AnonymousClass001.A0I();
    public final AnonymousClass00T A0E = AnonymousClass3TE.A03(this, "arg_from_contacts_picker", false);
    public final AnonymousClass00T A0F;
    public final AnonymousClass00T A0G;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup);
        AnonymousClass00C.A08(inflate);
        return inflate;
    }

    public void A1S(Bundle bundle, View view) {
        String A0o;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        Iterator it = ((List) this.A0F.getValue()).iterator();
        while (it.hasNext()) {
            AnonymousClass11F A0a = C36401kF.A0a(it);
            AnonymousClass16D r0 = this.A00;
            if (r0 != null) {
                AnonymousClass141 A082 = r0.A08(A0a);
                if (A082 != null) {
                    A082.A0x = true;
                    this.A0D.add(A082);
                }
            } else {
                throw C36331k8.A0Z();
            }
        }
        TextView A0P = C36391kE.A0P(view, R.id.newsletter_name);
        C44072La r02 = this.A07;
        if (r02 == null) {
            throw C36331k8.A0d("newsletterInfo");
        }
        A0P.setText(r02.A0K);
        MentionableEntry mentionableEntry = (MentionableEntry) C012005e.A02(view, R.id.admin_invite_caption);
        this.A09 = mentionableEntry;
        if (mentionableEntry != null) {
            Object[] objArr = new Object[1];
            C44072La r03 = this.A07;
            if (r03 == null) {
                throw C36331k8.A0d("newsletterInfo");
            }
            mentionableEntry.setText(C36401kF.A0q(this, r03.A0K, objArr, 0, R.string.f12nameremoved));
        }
        AnonymousClass16D r1 = this.A00;
        if (r1 != null) {
            AnonymousClass141 A083 = r1.A08(C36421kH.A0O(this.A0G));
            if (A083 != null) {
                AnonymousClass1RY r12 = this.A02;
                if (r12 == null) {
                    throw C36331k8.A0d("contactPhotoLoader");
                }
                r12.A08(C36391kE.A0N(view, R.id.newsletter_icon), A083);
            }
            ImageView A0N = C36391kE.A0N(view, R.id.admin_invite_send_button);
            C18820ts r2 = this.A05;
            if (r2 != null) {
                C36361kB.A13(C36381kD.A0H(A0N.getContext(), R.drawable.input_send), A0N, r2);
                AnonymousClass3Y4.A00(A0N, this, 18);
                TextView A0P2 = C36391kE.A0P(view, R.id.admin_invite_title);
                AnonymousClass00T r4 = this.A0E;
                if (C36331k8.A1b(r4)) {
                    A0o = A0n(R.string.f12nameremoved);
                } else {
                    Object[] objArr2 = new Object[1];
                    AnonymousClass171 r13 = this.A01;
                    if (r13 != null) {
                        C36371kC.A1K(r13, (AnonymousClass141) this.A0D.get(0), objArr2, 0);
                        A0o = A0o(R.string.f12nameremoved, objArr2);
                    } else {
                        throw C36331k8.A0c();
                    }
                }
                A0P2.setText(A0o);
                AnonymousClass3Y4.A00(view.findViewById(R.id.admin_invite_close_button), this, 17);
                if (C36331k8.A1b(r4)) {
                    View A0E2 = C36401kF.A0E((ViewStub) C36361kB.A0G(view, R.id.selected_list_stub), R.layout.f9nameremoved);
                    AnonymousClass00C.A0E(A0E2, "null cannot be cast to non-null type com.whatsapp.contact.picker.SelectedContactsList");
                    SelectedContactsList selectedContactsList = (SelectedContactsList) A0E2;
                    this.A04 = selectedContactsList;
                    if (selectedContactsList != null) {
                        selectedContactsList.A08 = this;
                        selectedContactsList.A09 = this.A0D;
                        selectedContactsList.setVisibility(0);
                    }
                    SelectedContactsList selectedContactsList2 = this.A04;
                    if (selectedContactsList2 != null) {
                        C36361kB.A0G(selectedContactsList2, R.id.selected_items_divider).setVisibility(8);
                        return;
                    }
                    return;
                }
                View A0E3 = C36401kF.A0E((ViewStub) C36361kB.A0G(view, R.id.invite_info_stub), R.layout.f9nameremoved);
                AnonymousClass00C.A0E(A0E3, "null cannot be cast to non-null type com.whatsapp.WaTextView");
                TextView textView = (TextView) A0E3;
                C32681e1 r5 = this.A0C;
                if (r5 != null) {
                    Context context = view.getContext();
                    Object[] A0L = AnonymousClass001.A0L();
                    C20380xT r14 = this.A0B;
                    if (r14 != null) {
                        textView.setText(r5.A00(context, C36401kF.A0q(this, r14.A02("360977646301595"), A0L, 0, R.string.f12nameremoved)));
                        C20810yC r04 = this.A08;
                        if (r04 != null) {
                            C36331k8.A10(textView, r04);
                            return;
                        }
                        throw C36321k7.A07();
                    }
                    throw C36331k8.A0d("faqLinkFactory");
                }
                throw C36331k8.A0b();
            }
            throw C36321k7.A09();
        }
        throw C36331k8.A0Z();
    }

    public void B2c(AnonymousClass141 r6) {
        AnonymousClass4TO r1;
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass01I A0h = A0h();
        if ((A0h instanceof AnonymousClass4TO) && (r1 = (AnonymousClass4TO) A0h) != null) {
            r1.BUS(r6);
        }
        ArrayList arrayList = this.A0D;
        arrayList.remove(r6);
        if (arrayList.isEmpty()) {
            A1b();
            return;
        }
        SelectedContactsList selectedContactsList = this.A04;
        if (selectedContactsList != null) {
            selectedContactsList.A09 = arrayList;
        }
        AnonymousClass00T r4 = this.A0F;
        List list = (List) r4.getValue();
        C86334Kn r12 = new C86334Kn(r6);
        AnonymousClass00C.A0D(list, 0);
        AnonymousClass03Y.A0E(list, r12, true);
        SelectedContactsList selectedContactsList2 = this.A04;
        if (selectedContactsList2 != null) {
            List<Jid> list2 = (List) r4.getValue();
            ArrayList A0J = C36321k7.A0J(list2);
            for (Jid A002 : list2) {
                A0J.add(AnonymousClass143.A00(A002));
            }
            if (!A0J.isEmpty()) {
                selectedContactsList2.A07.A06();
            }
        }
    }

    public void Bg7() {
    }

    public void Bg8() {
    }

    public void Bx9() {
    }

    public InviteNewsletterAdminMessageFragment() {
        C000800j r1 = C000800j.NONE;
        this.A0F = C001400p.A00(r1, new C85244Gi(this));
        this.A0G = C001400p.A00(r1, new C85234Gh(this));
    }

    public void A1J() {
        super.A1J();
        this.A04 = null;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        if (((List) this.A0F.getValue()).isEmpty()) {
            A1b();
            return;
        }
        C220412q r1 = this.A06;
        if (r1 != null) {
            C65073Qp A0W = C36371kC.A0W(r1, C36421kH.A0O(this.A0G));
            AnonymousClass00C.A0E(A0W, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
            this.A07 = (C44072La) A0W;
            C27731Pn r2 = this.A03;
            if (r2 != null) {
                this.A02 = r2.A03(A0a(), this, "AddNewsletterAdminInviteFragment");
                return;
            }
            throw C36331k8.A0d("contactPhotos");
        }
        throw C36331k8.A0d("chatsCache");
    }

    public void B5h(ThumbnailButton thumbnailButton, AnonymousClass141 r3, boolean z) {
        C36321k7.A0w(r3, thumbnailButton);
        AnonymousClass1RY r0 = this.A02;
        if (r0 == null) {
            throw C36331k8.A0d("contactPhotoLoader");
        }
        r0.A08(thumbnailButton, r3);
    }
}
