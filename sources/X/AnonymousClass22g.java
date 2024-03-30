package X;

import android.app.Activity;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.whatsapp.audiopicker.AudioPickerActivity;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.documentpicker.DocumentPickerActivity;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.22g  reason: invalid class name */
public abstract class AnonymousClass22g extends AnonymousClass24K implements AnonymousClass4UM {
    public C62503Gk A00;

    public static void A0k(C224914p r3, int i, int i2) {
        if (!r3.isFinishing()) {
            r3.startActivityForResult(AnonymousClass3US.A02(r3, i, i2, false), 150);
        }
    }

    public synchronized void A3i(ListAdapter listAdapter) {
        this.A00.A01(listAdapter);
    }

    public static AnonymousClass6W1 A01(GroupCallParticipantPicker groupCallParticipantPicker) {
        return (AnonymousClass6W1) groupCallParticipantPicker.A06.get();
    }

    public static AnonymousClass141 A07(AnonymousClass2Dr r0, AnonymousClass11F r1) {
        return r0.A0G.A0D(r1);
    }

    public static void A0H(C27111My r1, C18800tq r2, C18830tt r3, C62503Gk r4, AnonymousClass2JG r5) {
        r5.A00 = r4;
        r5.A03 = (AnonymousClass1XY) r2.A7c.get();
        r5.A0C = (C20650xu) r2.A3Z.get();
        r5.A06 = (AnonymousClass16I) r2.A2B.get();
        r5.A04 = (C24361Cd) r2.A1j.get();
        r5.A0D = (AnonymousClass12P) r2.A5G.get();
        r5.A0B = (AnonymousClass1QH) r2.A34.get();
        r5.A0A = (AnonymousClass1A4) r2.A33.get();
        r5.A0G = (C64883Pu) r3.ACT.get();
        r5.A0E = (C233117z) r2.A3w.get();
        r5.A02 = (AnonymousClass3C3) r1.A1Y.get();
        r5.A01 = C19470v6.A00;
        r5.A09 = C27111My.A1b(r1);
    }

    public static void A0J(C27111My r1, C18800tq r2, C18830tt r3, PhoneContactsSelector phoneContactsSelector, C20830yE r5) {
        phoneContactsSelector.A0P = r5;
        phoneContactsSelector.A0U = (C64813Pn) r3.A9Z.get();
        phoneContactsSelector.A08 = (AnonymousClass1KK) r2.A19.get();
        phoneContactsSelector.A0T = (C230116v) r2.A4P.get();
        phoneContactsSelector.A0M = (AnonymousClass3HF) r3.A2h.get();
        phoneContactsSelector.A0N = (AnonymousClass1V6) r2.A4v.get();
        phoneContactsSelector.A0V = C18840tu.A00(r3.A35);
        phoneContactsSelector.A0W = C18840tu.A00(r3.A3o);
        phoneContactsSelector.A0L = (C64953Qc) r3.A6G.get();
        phoneContactsSelector.A06 = (C57072xd) r1.A2v.get();
        phoneContactsSelector.A0R = (C230416y) r2.Adt.get();
        phoneContactsSelector.A0G = (C27761Ps) r2.A2D.get();
    }

    public static void A0K(C27111My r0, C18800tq r1, AnonymousClass2Dr r2) {
        r2.A0B = (AnonymousClass4PW) r0.A2Q.get();
        r2.A0N = (AnonymousClass1EL) r1.A8L.get();
    }

    public static void A0M(C18800tq r1, C18830tt r2, AudioPickerActivity audioPickerActivity, AnonymousClass171 r4) {
        audioPickerActivity.A06 = r4;
        audioPickerActivity.A0G = (C64813Pn) r2.A9Z.get();
        audioPickerActivity.A0A = (AnonymousClass3HF) r2.A2h.get();
        audioPickerActivity.A0B = (AnonymousClass1V6) r1.A4v.get();
        audioPickerActivity.A0H = C18840tu.A00(r2.A35);
        audioPickerActivity.A0I = C18840tu.A00(r2.A3o);
        audioPickerActivity.A09 = (C64953Qc) r2.A6G.get();
    }

    public static void A0O(C18800tq r1, C18830tt r2, GroupCallParticipantPicker groupCallParticipantPicker) {
        groupCallParticipantPicker.A01 = (AnonymousClass1ND) r1.A1N.get();
        groupCallParticipantPicker.A02 = C18840tu.A00(r1.A0C);
        groupCallParticipantPicker.A07 = C18840tu.A00(r1.A5v);
        groupCallParticipantPicker.A04 = C18840tu.A00(r2.A0Z);
        groupCallParticipantPicker.A05 = C18840tu.A00(r1.A24);
        groupCallParticipantPicker.A03 = C18840tu.A00(r2.A1P);
        groupCallParticipantPicker.A06 = C18840tu.A00(r2.A3n);
    }

    public static void A0Q(C18800tq r1, C18830tt r2, AnonymousClass2Dr r3) {
        r3.A00 = new C62503Gk();
        r3.A0Q = (AnonymousClass1FR) r1.A6O.get();
        r3.A0J = (C220412q) r1.A1l.get();
        r3.A03 = (AnonymousClass1X4) r1.A8h.get();
        r3.A0O = (C32641dx) r2.A4F.get();
    }

    public static void A0i(C18800tq r1, C18830tt r2, C20830yE r3, DocumentPickerActivity documentPickerActivity) {
        documentPickerActivity.A0D = r3;
        documentPickerActivity.A0H = (C54352so) r2.A9i.get();
        documentPickerActivity.A0A = (AnonymousClass3HF) r2.A2h.get();
        documentPickerActivity.A0B = (AnonymousClass1V6) r1.A4v.get();
        documentPickerActivity.A0L = C18840tu.A00(r2.A35);
        documentPickerActivity.A0M = C18840tu.A00(r2.A3o);
        documentPickerActivity.A09 = (C64953Qc) r2.A6G.get();
    }

    public static void A0j(C18800tq r1, AnonymousClass2Dr r2) {
        r2.A0L = (C20310xM) r1.A2S.get();
        r2.A0S = (AnonymousClass1A1) r1.A3H.get();
        r2.A0I = (AnonymousClass163) r1.A1k.get();
        r2.A0W = (AnonymousClass1SV) r1.A5I.get();
        r2.A0G = (AnonymousClass16D) r1.A2A.get();
        r2.A05 = (C29461Ws) r1.A1S.get();
        r2.A0D = (C235718z) r1.A1Z.get();
        r2.A0E = (AnonymousClass3L5) r1.A1Y.get();
        r2.A0V = (AnonymousClass1EM) r1.A3l.get();
        r2.A0R = (AnonymousClass1CR) r1.A1i.get();
        r2.A0P = (C24631De) r1.A6J.get();
    }

    public static void A0l(AnonymousClass22g r1) {
        r1.A00 = new C62503Gk();
    }

    public static void A0m(Object obj, Object obj2) {
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) obj;
        if (obj2.equals(groupChatInfoActivity.A1Y)) {
            GroupChatInfoActivity.A1B(groupChatInfoActivity);
        }
    }

    public static void A0n(Object obj, Object obj2) {
        ContactInfoActivity contactInfoActivity = (ContactInfoActivity) obj;
        if (obj2.equals(contactInfoActivity.A3t())) {
            ContactInfoActivity.A12(contactInfoActivity);
        }
    }

    public static boolean A0p(GroupChatInfoActivity groupChatInfoActivity) {
        return groupChatInfoActivity.A0M.A0D(groupChatInfoActivity.A1Y);
    }

    public static boolean A0q(GroupChatInfoActivity groupChatInfoActivity) {
        return groupChatInfoActivity.A0M.A0C(groupChatInfoActivity.A1Y);
    }

    public static boolean A0r(GroupChatInfoActivity groupChatInfoActivity) {
        return groupChatInfoActivity.A0N.A01(groupChatInfoActivity.A0y);
    }

    public void A26() {
        this.A00.A00();
    }

    public ListView getListView() {
        C62503Gk r2 = this.A00;
        if (r2.A01 == null) {
            r2.A02.setContentView(17367060);
        }
        ListView listView = r2.A01;
        C18740tg.A04(listView);
        return listView;
    }

    public void onDestroy() {
        C62503Gk r0 = this.A00;
        r0.A04.removeCallbacks(r0.A05);
        super.onDestroy();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        C62503Gk r2 = this.A00;
        if (r2.A01 == null) {
            r2.A02.setContentView(17367060);
        }
        AnonymousClass4UM r0 = r2.A02;
        C18740tg.A06(r0);
        r0.Bid(bundle);
    }

    public static C28981Uw A0F(NewsletterInfoActivity newsletterInfoActivity) {
        return newsletterInfoActivity.A3t().A0J();
    }

    public static void A0G(Activity activity, Transition transition, TransitionSet transitionSet, View view) {
        transition.addTarget(view);
        transitionSet.addTransition(transition);
        activity.getWindow().setReturnTransition(transitionSet);
    }

    public static void A0I(C27111My r1, C18800tq r2, C18830tt r3, AnonymousClass2Dr r4, AnonymousClass004 r5) {
        r4.A06 = (AnonymousClass9Y1) r5.get();
        r4.A04 = (AnonymousClass9XI) r2.ADM.get();
        r4.A0H = (C20830yE) r2.A9E.get();
        r4.A0K = (C24381Cf) r2.A2M.get();
        r4.A0M = (AnonymousClass17X) r2.A3v.get();
        r4.A02 = (AnonymousClass18S) r3.A05.get();
        r4.A07 = (C199439fJ) r2.A17.get();
        r4.A0T = (AnonymousClass1N6) r2.A5V.get();
        r4.A09 = (AnonymousClass4PV) r1.A2N.get();
        r4.A0Y = C18840tu.A00(r2.A2i);
        r4.A0F = C27111My.A1C(r1);
        r4.A08 = (AnonymousClass4PU) r1.A2O.get();
    }

    public static void A0L(C27111My r0, C18800tq r1, AnonymousClass27v r2) {
        r2.A0D = C27111My.A1F(r0);
        r2.A0J = (C233117z) r1.A3w.get();
        r2.A0L = (C230116v) r1.A4P.get();
        r2.A05 = (AnonymousClass1LI) r1.A3Q.get();
    }

    public static void A0h(C18800tq r1, C18830tt r2, AnonymousClass27v r3) {
        r3.A04 = (C32601dt) r2.A46.get();
        r3.A0F = (C65383Rv) r2.A2M.get();
        r3.A0K = (C32661dz) r1.A0E.get();
        r3.A0C = (C27731Pn) r1.A2E.get();
        r3.A09 = (AnonymousClass16D) r1.A2A.get();
        r3.A0B = (AnonymousClass171) r1.A90.get();
        r3.A06 = (AnonymousClass1NG) r1.A0v.get();
        r3.A0A = (AnonymousClass16I) r1.A2B.get();
        r3.A08 = (C229216m) r1.A27.get();
        r3.A0I = (C18820ts) r1.A9X.get();
        r3.A07 = (C24361Cd) r1.A1j.get();
    }

    public static boolean A0o(ContactInfoActivity contactInfoActivity) {
        return AnonymousClass143.A0H(contactInfoActivity.A3t());
    }

    public static boolean A0s(NewsletterInfoActivity newsletterInfoActivity) {
        return newsletterInfoActivity.A3y().A00(newsletterInfoActivity.A3t());
    }

    public static boolean A0t(NewsletterInfoActivity newsletterInfoActivity) {
        return newsletterInfoActivity.A3t().A0L();
    }

    public void Big() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00.A02 = this;
    }

    public void Bid(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }
}
