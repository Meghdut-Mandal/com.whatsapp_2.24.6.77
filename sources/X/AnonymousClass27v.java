package X;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet;
import com.whatsapp.calling.favorite.FavoritePicker;
import com.whatsapp.calling.favorite.FavoritePicker$onBlockedItemPressed$1;
import com.whatsapp.calling.favorite.FavoritePickerViewModel;
import com.whatsapp.community.LinkExistingGroups;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import com.whatsapp.contact.picker.ContactsAttachmentSelector;
import com.whatsapp.contact.picker.ListMembersSelector;
import com.whatsapp.contact.picker.SelectedContactsList;
import com.whatsapp.contact.picker.nativecontacts.NativeContactsMultipleContactPicker;
import com.whatsapp.conversation.EditBroadcastRecipientsSelector;
import com.whatsapp.group.EditGroupAdminsSelector;
import com.whatsapp.group.GroupMembersSelector;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector;
import com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity;
import com.whatsapp.payments.ui.PaymentInvitePickerActivity;
import com.whatsapp.registration.NotifyContactsSelector;
import com.whatsapp.wds.components.search.WDSSearchBar;
import com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity;
import com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.27v  reason: invalid class name */
public abstract class AnonymousClass27v extends AnonymousClass22g implements AnonymousClass4UZ, AnonymousClass15Q {
    public ViewGroup A00;
    public BaseAdapter A01;
    public ListView A02;
    public AnonymousClass060 A03;
    public C32601dt A04;
    public AnonymousClass1LI A05;
    public AnonymousClass1NG A06;
    public C24361Cd A07;
    public C229216m A08;
    public AnonymousClass16D A09;
    public AnonymousClass16I A0A;
    public AnonymousClass171 A0B;
    public C27731Pn A0C;
    public AnonymousClass3F6 A0D;
    public SelectedContactsList A0E;
    public C65383Rv A0F;
    public C48992iO A0G;
    public C49112ia A0H;
    public C18820ts A0I;
    public C233117z A0J;
    public C32661dz A0K;
    public C230116v A0L;
    public WDSSearchBar A0M;
    public String A0N;
    public ArrayList A0O;
    public List A0P = AnonymousClass001.A0I();
    public List A0Q = AnonymousClass001.A0I();
    public List A0R = AnonymousClass001.A0I();
    public List A0S;
    public boolean A0T = false;
    public boolean A0U = true;
    public boolean A0V;
    public MenuItem A0W;
    public ViewGroup A0X;
    public C49382j1 A0Y;
    public AnonymousClass1RY A0Z;
    public final AnonymousClass005 A0a = C36431kI.A0x(new C65873Tu(this, 0));
    public final ArrayList A0b = AnonymousClass001.A0I();
    public final List A0c = AnonymousClass001.A0I();
    public final C32001cn A0d = new AnonymousClass4W0(this, 4);
    public final C226815j A0e = AnonymousClass4W3.A00(this, 10);

    public static UnblockDialogFragment A0v(AnonymousClass27v r6, AnonymousClass141 r7, int i) {
        String string = r6.getString(i, new Object[]{r6.A0B.A0H(r7)});
        AnonymousClass1NG r2 = r6.A06;
        Jid A062 = r7.A06(UserJid.class);
        C18740tg.A06(A062);
        return UnblockDialogFragment.A03(new C53472rN(r6, A062, r2, 0), string, R.string.f12nameremoved, false);
    }

    public void A3u(View view, View view2, View view3, View view4) {
        view4.setVisibility(0);
        C36421kH.A0x(view, view2);
        view3.setVisibility(0);
    }

    public void A44(List list) {
        this.A0Y = null;
        if (this.A0V) {
            Bx9();
        }
        this.A0Q.clear();
        C49112ia r1 = new C49112ia(this, list);
        this.A0H = r1;
        C36331k8.A1F(r1, this.A04);
    }

    public void A45(List list) {
        List list2;
        this.A0G = null;
        this.A0P = list;
        A0w();
        if (this.A0U) {
            HashSet A16 = C36441kJ.A16();
            List list3 = this.A0S;
            if (list3 != null && !list3.isEmpty()) {
                Iterator it = this.A0P.iterator();
                while (it.hasNext()) {
                    AnonymousClass141 A0f = C36391kE.A0f(it);
                    Class<AnonymousClass11F> cls = AnonymousClass11F.class;
                    if (this.A0S.contains(A0f.A06(cls))) {
                        A0f.A0x = true;
                        if (!A16.contains(A0f.A06(cls))) {
                            List list4 = this.A0c;
                            list4.add(A0f);
                            A16.add(A0f.A06(cls));
                            if (list4.size() >= A3k()) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            SelectedContactsList selectedContactsList = this.A0E;
            if (!(selectedContactsList == null || (list2 = this.A0S) == null || list2.isEmpty())) {
                selectedContactsList.A07.A06();
            }
            this.A0U = false;
        }
        A3r();
        MenuItem menuItem = this.A0W;
        if (menuItem != null) {
            menuItem.setVisible(C36401kF.A1a(this.A0P));
        }
        SelectedContactsList selectedContactsList2 = this.A0E;
        if (selectedContactsList2 != null) {
            ListView listView = this.A02;
            ViewGroup viewGroup = this.A00;
            boolean z = this.A0V;
            int i = 0;
            if (selectedContactsList2.A09.isEmpty()) {
                i = 4;
            }
            selectedContactsList2.setVisibility(i);
            if (!selectedContactsList2.A09.isEmpty()) {
                SelectedContactsList.A00(listView, viewGroup, selectedContactsList2, z);
            }
        }
    }

    public void A46(List list) {
        this.A0H = null;
        ArrayList arrayList = this.A0b;
        arrayList.clear();
        arrayList.addAll(list);
        this.A01.notifyDataSetChanged();
        A0x();
    }

    public void B5h(ThumbnailButton thumbnailButton, AnonymousClass141 r4, boolean z) {
        AnonymousClass1RY r0 = this.A0Z;
        if (r0 != null) {
            r0.A0B(thumbnailButton, r4, false);
        }
    }

    public void onBackPressed() {
        WDSSearchBar wDSSearchBar = this.A0M;
        if (wDSSearchBar == null || !AnonymousClass000.A1Q(wDSSearchBar.A07.getVisibility())) {
            A3p();
        } else {
            this.A0M.A02(true);
        }
    }

    public static C100744vb A0u(AnonymousClass27v r3) {
        return new C100744vb(AnonymousClass00E.A00(r3, R.drawable.ic_fab_next), r3.A0I);
    }

    private void A0w() {
        C49382j1 r0 = this.A0Y;
        if (r0 != null) {
            r0.A0D(true);
            this.A0Y = null;
        }
        C49112ia r02 = this.A0H;
        if (r02 != null) {
            r02.A0D(true);
            this.A0H = null;
        }
        C49382j1 r1 = new C49382j1(this.A0B, this, this.A0O, this.A0P);
        this.A0Y = r1;
        C36331k8.A1F(r1, this.A04);
    }

    public int A3j() {
        ArrayList A052;
        if ((this instanceof LinkExistingGroupActivity) || (this instanceof GroupMembersSelectorActivity) || (this instanceof NotifyContactsSelector) || (this instanceof PaymentInvitePickerActivity) || (this instanceof InviteNewsletterAdminSelector)) {
            return R.string.f12nameremoved;
        }
        if (this instanceof GroupMembersSelector) {
            Bundle bundleExtra = getIntent().getBundleExtra("fMessageKeyBundle");
            if (bundleExtra == null || (A052 = AnonymousClass3UJ.A05(bundleExtra)) == null || A052.size() != 0) {
                return R.string.f12nameremoved;
            }
            return R.string.f12nameremoved;
        } else if ((this instanceof EditGroupAdminsSelector) || (this instanceof EditBroadcastRecipientsSelector) || (this instanceof NativeContactsMultipleContactPicker) || (this instanceof ListMembersSelector) || (this instanceof ContactsAttachmentSelector)) {
            return R.string.f12nameremoved;
        } else {
            if (this instanceof AddGroupParticipantsSelector) {
                if (C36331k8.A1b(((AddGroupParticipantsSelector) this).A0T)) {
                    return R.string.f12nameremoved;
                }
                return R.string.f12nameremoved;
            } else if ((this instanceof LinkExistingGroups) || (this instanceof FavoritePicker)) {
                return R.string.f12nameremoved;
            } else {
                GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
                if (!(groupCallParticipantPicker instanceof GroupCallParticipantPickerSheet) && !GroupCallParticipantPicker.A14(groupCallParticipantPicker) && GroupCallParticipantPicker.A13(groupCallParticipantPicker)) {
                    return R.string.f12nameremoved;
                }
                return R.string.f12nameremoved;
            }
        }
    }

    public int A3k() {
        AnonymousClass17X r1;
        if (this instanceof LinkExistingGroupActivity) {
            return 1;
        }
        if (this instanceof GroupMembersSelectorActivity) {
            r1 = ((GroupMembersSelectorActivity) this).A01;
            if (r1 == null) {
                throw C36331k8.A0d("groupParticipantsManager");
            }
        } else if ((this instanceof NotifyContactsSelector) || (this instanceof PaymentInvitePickerActivity)) {
            return Integer.MAX_VALUE;
        } else {
            if (this instanceof InviteNewsletterAdminSelector) {
                InviteNewsletterAdminSelector inviteNewsletterAdminSelector = (InviteNewsletterAdminSelector) this;
                int A072 = inviteNewsletterAdminSelector.A0D.A07(6461) - ((List) C36381kD.A0p(inviteNewsletterAdminSelector.A08)).size();
                List list = inviteNewsletterAdminSelector.A06;
                int i = 0;
                if (list != null) {
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    for (Object next : list) {
                        if (((AnonymousClass378) next).A02 == C52382pL.ADMIN) {
                            A0I2.add(next);
                        }
                    }
                    i = A0I2.size();
                }
                return A072 - i;
            } else if (this instanceof GroupMembersSelector) {
                r1 = ((GroupMembersSelector) this).A03;
            } else if (this instanceof EditGroupAdminsSelector) {
                EditGroupAdminsSelector editGroupAdminsSelector = (EditGroupAdminsSelector) this;
                int size = editGroupAdminsSelector.A0P.size();
                if (size == 0) {
                    return Integer.MAX_VALUE;
                }
                AnonymousClass17X r2 = editGroupAdminsSelector.A00;
                String stringExtra = editGroupAdminsSelector.getIntent().getStringExtra("gid");
                C18740tg.A06(stringExtra);
                return Math.min(r2.A01(AnonymousClass147.A01.A06(stringExtra)) - 1, size);
            } else {
                if (!(this instanceof EditBroadcastRecipientsSelector)) {
                    if (this instanceof NativeContactsMultipleContactPicker) {
                        return Integer.MAX_VALUE;
                    }
                    if (!(this instanceof ListMembersSelector)) {
                        if (this instanceof ContactsAttachmentSelector) {
                            return 257;
                        }
                        if (this instanceof AddGroupParticipantsSelector) {
                            AddGroupParticipantsSelector addGroupParticipantsSelector = (AddGroupParticipantsSelector) this;
                            AnonymousClass17X r12 = addGroupParticipantsSelector.A08;
                            if (r12 != null) {
                                return r12.A01(C36431kI.A0k(addGroupParticipantsSelector.A0Q)) - addGroupParticipantsSelector.A0K.size();
                            }
                            throw C36331k8.A0d("groupParticipantsManager");
                        } else if (this instanceof LinkExistingGroups) {
                            return getIntent().getIntExtra("max_groups_allowed_to_link", Integer.MAX_VALUE);
                        } else {
                            if (this instanceof FavoritePicker) {
                                return 100 - ((FavoritePickerViewModel) ((FavoritePicker) this).A04.getValue()).A00;
                            }
                            return this.A0D.A07(862) - 1;
                        }
                    }
                }
                int A042 = this.A06.A04(C21100yf.A1s);
                if (A042 == 0) {
                    return Integer.MAX_VALUE;
                }
                return A042;
            }
        }
        return r1.A01((AnonymousClass147) null) - 1;
    }

    public View A3l() {
        if (this instanceof LinkExistingGroupActivity) {
            View A0E2 = C36361kB.A0E(getLayoutInflater(), this.A02, R.layout.f9nameremoved);
            AnonymousClass00C.A08(A0E2);
            TextView A0M2 = C36341k9.A0M(A0E2, R.id.link_existing_group_picker_title);
            C33511fU.A03(A0M2);
            A0M2.setText(R.string.f12nameremoved);
            View A0G2 = C36361kB.A0G(A0E2, R.id.add_groups_new_group);
            C36351kA.A1E(A0G2, this, 45);
            C33511fU.A03(C36341k9.A0M(A0G2, R.id.create_new_group_text));
            return A0E2;
        } else if (!(this instanceof GroupCallParticipantPicker)) {
            return null;
        } else {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            if (!(groupCallParticipantPicker instanceof GroupCallParticipantPickerSheet) && GroupCallParticipantPicker.A13(groupCallParticipantPicker)) {
                LinearLayout linearLayout = new LinearLayout(groupCallParticipantPicker);
                linearLayout.setOrientation(1);
                View A012 = AnonymousClass3SR.A01(groupCallParticipantPicker, groupCallParticipantPicker.A02, groupCallParticipantPicker.A05, (C19600wD) groupCallParticipantPicker.A05.get());
                FrameLayout A0O2 = C36431kI.A0O(groupCallParticipantPicker, A012);
                C011504z.A06(A0O2, 2);
                List list = groupCallParticipantPicker.A0B;
                list.add(A012);
                linearLayout.addView(A0O2);
                if (!C36421kH.A1V(groupCallParticipantPicker)) {
                    ListView listView = groupCallParticipantPicker.A02;
                    C20810yC r10 = groupCallParticipantPicker.A0D;
                    AnonymousClass17Y r9 = groupCallParticipantPicker.A05;
                    C32661dz r11 = groupCallParticipantPicker.A0K;
                    AnonymousClass00C.A0D(listView, 1);
                    AnonymousClass00C.A0D(r10, 4);
                    C36341k9.A1F(r9, r11);
                    View A022 = AnonymousClass3SR.A02(groupCallParticipantPicker, listView, r9, r10, r11, (AnonymousClass00S) null, 2, 4);
                    C18820ts r1 = groupCallParticipantPicker.A0I;
                    C19460v5 r0 = (C19460v5) groupCallParticipantPicker.A07.get();
                    C36341k9.A1E(r1, 2, r0);
                    AnonymousClass3SR.A03(groupCallParticipantPicker, A022, r0, r1, (AnonymousClass00S) null);
                    FrameLayout A0O3 = C36431kI.A0O(groupCallParticipantPicker, A022);
                    C011504z.A06(A0O3, 2);
                    list.add(A022);
                    linearLayout.addView(A0O3);
                }
                if (((AnonymousClass1QW) groupCallParticipantPicker.A04.get()).A02()) {
                    View A002 = AnonymousClass3SR.A00(groupCallParticipantPicker, groupCallParticipantPicker.A02, (AnonymousClass1NC) groupCallParticipantPicker.A02.get(), groupCallParticipantPicker.A01, new AnonymousClass2A6(groupCallParticipantPicker, 0));
                    FrameLayout A0O4 = C36431kI.A0O(groupCallParticipantPicker, A002);
                    C011504z.A06(A0O4, 2);
                    list.add(A002);
                    linearLayout.addView(A0O4);
                }
                if (linearLayout.getChildCount() == 0) {
                    return null;
                }
                return linearLayout;
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b7, code lost:
        if (X.C36371kC.A1X(r0, true) == false) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A3m() {
        /*
            r13 = this;
            boolean r0 = r13 instanceof com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector
            if (r0 == 0) goto L_0x004d
            r7 = r13
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector r7 = (com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector) r7
            android.view.LayoutInflater r2 = r7.getLayoutInflater()
            r1 = 2131626573(0x7f0e0a4d, float:1.8880386E38)
            r0 = 0
            r6 = 0
            android.view.View r5 = r2.inflate(r1, r0, r6)
            r0 = 2131429590(0x7f0b08d6, float:1.8480857E38)
            android.widget.TextView r4 = X.C36341k9.A0M(r5, r0)
            X.1e1 r0 = r7.A05
            if (r0 == 0) goto L_0x0048
            r3 = 2131890564(0x7f121184, float:1.9415823E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            X.0xT r1 = r7.A04
            if (r1 == 0) goto L_0x0041
            java.lang.String r0 = "360977646301595"
            android.net.Uri r0 = r1.A02(r0)
            java.lang.String r0 = X.C36391kE.A0v(r7, r0, r2, r6, r3)
            android.text.SpannableString r0 = X.C32711e4.A00(r7, r0)
            r4.setText(r0)
            X.0yC r0 = r7.A0D
            X.C36331k8.A10(r4, r0)
            return r5
        L_0x0041:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0048:
            java.lang.RuntimeException r0 = X.C36331k8.A0b()
            throw r0
        L_0x004d:
            boolean r0 = r13 instanceof com.whatsapp.contact.picker.AddGroupParticipantsSelector
            if (r0 == 0) goto L_0x00f9
            r4 = r13
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r4 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r4
            boolean r0 = com.whatsapp.contact.picker.AddGroupParticipantsSelector.A0z(r4)
            if (r0 != 0) goto L_0x00b9
            X.0xQ r1 = r4.A0B
            if (r1 == 0) goto L_0x00f2
            X.00T r5 = r4.A0Q
            java.lang.Object r0 = r5.getValue()
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            int r1 = r1.A0O(r0)
            r0 = 4
            if (r1 == r0) goto L_0x00b9
            X.00T r0 = r4.A0U
            boolean r0 = X.C36331k8.A1b(r0)
            r3 = 1
            if (r0 == 0) goto L_0x00e9
            boolean r0 = com.whatsapp.contact.picker.AddGroupParticipantsSelector.A0z(r4)
            if (r0 != 0) goto L_0x00e9
            X.00T r2 = r4.A0L
            java.lang.Object r0 = r2.getValue()
            X.3H3 r0 = (X.AnonymousClass3H3) r0
            if (r0 == 0) goto L_0x00e9
            X.0yC r1 = r0.A05
            r0 = 7608(0x1db8, float:1.0661E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 != r3) goto L_0x00e9
            X.0xQ r1 = r4.A0B
            if (r1 == 0) goto L_0x00eb
            java.lang.Object r0 = r5.getValue()
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            int r0 = r1.A0O(r0)
            if (r0 != r3) goto L_0x00b9
            java.lang.Object r2 = r2.getValue()
            X.3H3 r2 = (X.AnonymousClass3H3) r2
            if (r2 == 0) goto L_0x00b9
            X.0yC r1 = r2.A05
            r0 = 7608(0x1db8, float:1.0661E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x00e0
            r0 = 0
        L_0x00b3:
            boolean r0 = X.C36371kC.A1X(r0, r3)
            if (r0 != 0) goto L_0x00e9
        L_0x00b9:
            r1 = 1
        L_0x00ba:
            X.00T r0 = r4.A0Q
            X.147 r3 = X.C36431kI.A0k(r0)
            r2 = 0
            if (r3 == 0) goto L_0x00df
            if (r1 == 0) goto L_0x00df
            android.view.LayoutInflater r1 = r4.getLayoutInflater()
            r0 = 2131626573(0x7f0e0a4d, float:1.8880386E38)
            android.view.View r2 = r1.inflate(r0, r2)
            r0 = 2131429590(0x7f0b08d6, float:1.8480857E38)
            com.whatsapp.TextEmojiLabel r1 = X.C36351kA.A0O(r2, r0)
            com.whatsapp.contact.picker.AddGroupParticipantsSelector.A0w(r1, r4, r3)
            X.0yC r0 = r4.A0D
            X.C36331k8.A10(r1, r0)
        L_0x00df:
            return r2
        L_0x00e0:
            boolean r0 = r2.A00()
            java.lang.Boolean r0 = X.C36441kJ.A0x(r0)
            goto L_0x00b3
        L_0x00e9:
            r1 = 0
            goto L_0x00ba
        L_0x00eb:
            java.lang.String r0 = "groupChatManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00f2:
            java.lang.String r0 = "groupChatManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00f9:
            boolean r0 = r13 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 == 0) goto L_0x0125
            r4 = r13
            com.whatsapp.community.LinkExistingGroups r4 = (com.whatsapp.community.LinkExistingGroups) r4
            android.view.View r3 = r4.A00
            java.lang.String r2 = "null cannot be cast to non-null type android.view.View"
            if (r3 != 0) goto L_0x0121
            android.view.LayoutInflater r1 = r4.getLayoutInflater()
            r0 = 2131626573(0x7f0e0a4d, float:1.8880386E38)
            android.view.View r3 = X.C36381kD.A0K(r1, r0)
            r0 = 2131429590(0x7f0b08d6, float:1.8480857E38)
            android.widget.TextView r1 = X.C36391kE.A0O(r3, r0)
            java.lang.String r0 = r4.A3n()
            r1.setText(r0)
            r4.A00 = r3
        L_0x0121:
            X.AnonymousClass00C.A0E(r3, r2)
            return r3
        L_0x0125:
            boolean r0 = r13 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 == 0) goto L_0x01c8
            r9 = r13
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker r9 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker) r9
            boolean r0 = r9 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet
            if (r0 == 0) goto L_0x0132
            r8 = 0
            return r8
        L_0x0132:
            android.view.LayoutInflater r1 = r9.getLayoutInflater()
            r0 = 2131626573(0x7f0e0a4d, float:1.8880386E38)
            android.view.View r8 = X.C36381kD.A0K(r1, r0)
            r0 = 2131429590(0x7f0b08d6, float:1.8480857E38)
            android.widget.TextView r7 = X.C36391kE.A0P(r8, r0)
            boolean r0 = r9.A4A()
            r2 = 1
            r6 = 0
            X.0ts r5 = r9.A0I
            if (r0 == 0) goto L_0x0167
            r4 = 2131755227(0x7f1000db, float:1.9141327E38)
            int r0 = r9.A3k()
            long r0 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r2 = r9.A3k()
            X.AnonymousClass000.A1L(r3, r2, r6)
            java.lang.String r0 = r5.A0L(r3, r4, r0)
            r7.setText(r0)
            return r8
        L_0x0167:
            r4 = 2131755429(0x7f1001a5, float:1.9141737E38)
            int r0 = r9.A3k()
            long r0 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r2 = r9.A3k()
            X.AnonymousClass000.A1L(r3, r2, r6)
            java.lang.String r0 = r5.A0L(r3, r4, r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableStringBuilder r12 = X.C36441kJ.A0P(r0)
            android.text.style.URLSpan[] r11 = X.C36381kD.A1b(r0)
            if (r11 == 0) goto L_0x01bf
            int r10 = r11.length
        L_0x018b:
            if (r6 >= r10) goto L_0x01bf
            r2 = r11[r6]
            java.lang.String r1 = r2.getURL()
            java.lang.String r0 = "learn_more_link"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01bc
            java.lang.String r0 = "GroupCallParticipantPicker/getCustomWarningLayout/learn_more_link link found"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r5 = r12.getSpanStart(r2)
            int r4 = r12.getSpanEnd(r2)
            int r3 = r12.getSpanFlags(r2)
            r12.removeSpan(r2)
            int r2 = X.C36341k9.A05(r9)
            r1 = 0
            X.4Vw r0 = new X.4Vw
            r0.<init>(r9, r9, r2, r1)
            r12.setSpan(r0, r5, r4, r3)
        L_0x01bc:
            int r6 = r6 + 1
            goto L_0x018b
        L_0x01bf:
            r7.setText(r12)
            X.0yC r0 = r9.A0D
            X.C36331k8.A10(r7, r0)
            return r8
        L_0x01c8:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass27v.A3m():android.view.View");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A3n() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof com.whatsapp.contact.picker.ListMembersSelector
            if (r0 == 0) goto L_0x002f
            com.whatsapp.Me r0 = X.C36401kF.A0M(r4)
            X.C18740tg.A06(r0)
            X.0ts r2 = r4.A0I
            X.C18740tg.A06(r0)
            java.lang.String r1 = r0.cc
            java.lang.String r0 = r0.jabber_id
            X.C18740tg.A06(r0)
            java.lang.String r0 = X.C36431kI.A1B(r1, r0)
            java.lang.String r2 = X.C65983Uf.A0D(r2, r1, r0)
            r1 = 32
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r1 = r2.replace(r1, r0)
            r0 = 2131887149(0x7f12042d, float:1.9408897E38)
            java.lang.String r0 = X.C36321k7.A0A(r4, r1, r0)
            return r0
        L_0x002f:
            boolean r0 = r4 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 == 0) goto L_0x007b
            r3 = r4
            com.whatsapp.community.LinkExistingGroups r3 = (com.whatsapp.community.LinkExistingGroups) r3
            X.0yC r1 = r3.A0D
            r0 = 2447(0x98f, float:3.429E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0072
            X.147 r1 = r3.A0A
            if (r1 != 0) goto L_0x0063
            r2 = 0
        L_0x0045:
            X.00T r0 = r3.A0H
            boolean r1 = X.C36331k8.A1b(r0)
            if (r2 == 0) goto L_0x005a
            r0 = 2131890705(0x7f121211, float:1.941611E38)
            if (r1 == 0) goto L_0x0055
            r0 = 2131890708(0x7f121214, float:1.9416115E38)
        L_0x0055:
            java.lang.String r0 = X.C36361kB.A0m(r3, r0)
            return r0
        L_0x005a:
            r0 = 2131890706(0x7f121212, float:1.9416111E38)
            if (r1 == 0) goto L_0x0055
            r0 = 2131890707(0x7f121213, float:1.9416113E38)
            goto L_0x0055
        L_0x0063:
            X.12q r0 = r3.A04
            if (r0 == 0) goto L_0x0074
            X.3Qp r0 = X.C36371kC.A0W(r0, r1)
            if (r0 == 0) goto L_0x0072
            boolean r0 = r0.A0n
            r2 = r0 ^ 1
            goto L_0x0045
        L_0x0072:
            r2 = 1
            goto L_0x0045
        L_0x0074:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x007b:
            boolean r0 = r4 instanceof com.whatsapp.calling.favorite.FavoritePicker
            if (r0 == 0) goto L_0x008b
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131887325(0x7f1204dd, float:1.9409254E38)
            java.lang.String r0 = X.C36381kD.A0s(r1, r0)
            return r0
        L_0x008b:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass27v.A3n():java.lang.String");
    }

    public final ArrayList A3o() {
        List list = this.A0c;
        ArrayList A0r = C36361kB.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(C36371kC.A0d(it));
        }
        return A0r;
    }

    public void A3p() {
        if (this instanceof LinkExistingGroupActivity) {
            LinkExistingGroupActivity linkExistingGroupActivity = (LinkExistingGroupActivity) this;
            AnonymousClass1UN r1 = linkExistingGroupActivity.A02;
            if (r1 == null) {
                throw C36331k8.A0d("xFamilyUserFlowLogger");
            }
            r1.A02("EXIT_GROUP_SELECTION");
            linkExistingGroupActivity.finish();
        } else if (this instanceof GroupCallParticipantPicker) {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            groupCallParticipantPicker.finish();
            if (groupCallParticipantPicker.A49()) {
                AnonymousClass6W1 A012 = AnonymousClass22g.A01(groupCallParticipantPicker);
                C80223v3.A01(A012.A03, A012, 3);
            }
        } else {
            finish();
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.2Gt] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.2Gs] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3q() {
        /*
            r16 = this;
            r12 = r16
            X.2iO r0 = r12.A0G
            boolean r2 = X.C36411kG.A1Z(r0)
            X.2j1 r0 = r12.A0Y
            r1 = 0
            if (r0 == 0) goto L_0x0012
            r0.A0D(r2)
            r12.A0Y = r1
        L_0x0012:
            X.2ia r0 = r12.A0H
            if (r0 == 0) goto L_0x001b
            r0.A0D(r2)
            r12.A0H = r1
        L_0x001b:
            boolean r0 = r12 instanceof com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity
            if (r0 == 0) goto L_0x0052
            r4 = r12
            com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity r4 = (com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity) r4
            X.005 r0 = r4.A03
            if (r0 == 0) goto L_0x008f
            java.lang.Object r6 = X.C36411kG.A0v(r0)
            X.12q r6 = (X.C220412q) r6
            X.171 r3 = r4.A0B
            X.AnonymousClass00C.A07(r3)
            X.0ts r5 = r4.A0I
            X.AnonymousClass00C.A07(r5)
            X.005 r0 = r4.A04
            if (r0 == 0) goto L_0x0088
            java.lang.Object r7 = X.C36411kG.A0v(r0)
            X.0xQ r7 = (X.C20350xQ) r7
            java.util.List r8 = r4.A0c
            X.AnonymousClass00C.A07(r8)
            X.2Gs r2 = new X.2Gs
            r2.<init>(r3, r4, r5, r6, r7, r8)
        L_0x004a:
            r12.A0G = r2
            X.0wU r0 = r12.A04
            X.C36331k8.A1F(r2, r0)
            return
        L_0x0052:
            boolean r0 = r12 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 == 0) goto L_0x0075
            r5 = r12
            com.whatsapp.community.LinkExistingGroups r5 = (com.whatsapp.community.LinkExistingGroups) r5
            X.0yC r9 = r5.A0D
            X.12q r7 = r5.A04
            if (r7 == 0) goto L_0x00a4
            X.0yf r3 = r5.A06
            X.171 r4 = r5.A0B
            X.0ts r6 = r5.A0I
            X.0xQ r10 = r5.A07
            if (r10 == 0) goto L_0x009d
            X.17X r8 = r5.A06
            if (r8 == 0) goto L_0x0096
            java.util.List r11 = r5.A0c
            X.2Gt r2 = new X.2Gt
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x004a
        L_0x0075:
            X.16D r10 = r12.A09
            X.171 r11 = r12.A0B
            X.0ts r13 = r12.A0I
            java.util.List r1 = r12.A0c
            X.16v r0 = r12.A0L
            X.2Gr r2 = new X.2Gr
            r9 = r2
            r14 = r0
            r15 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L_0x004a
        L_0x0088:
            java.lang.String r0 = "groupChatManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x008f:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0096:
            java.lang.String r0 = "groupParticipantsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x009d:
            java.lang.String r0 = "groupChatManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00a4:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass27v.A3q():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r2 == 0) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r1.isEmpty() != false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r2 == 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3r() {
        /*
            r3 = this;
            java.util.List r1 = r3.A0c
            int r2 = r1.size()
            boolean r0 = r3 instanceof com.whatsapp.calling.favorite.FavoritePicker
            if (r0 != 0) goto L_0x000d
            r3.A3s(r2)
        L_0x000d:
            boolean r0 = r3 instanceof com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector
            if (r0 == 0) goto L_0x001a
            if (r2 != 0) goto L_0x0032
        L_0x0013:
            X.060 r1 = r3.A03
        L_0x0015:
            r0 = 1
            r1.A04(r0)
        L_0x0019:
            return
        L_0x001a:
            boolean r0 = r3 instanceof com.whatsapp.contact.picker.AddGroupParticipantsSelector
            if (r0 == 0) goto L_0x0023
            X.060 r1 = r3.A03
            if (r2 != 0) goto L_0x0038
            goto L_0x0015
        L_0x0023:
            java.util.List r0 = r3.A0P
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0032
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0032
            goto L_0x0013
        L_0x0032:
            boolean r0 = r3 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 != 0) goto L_0x0019
            X.060 r1 = r3.A03
        L_0x0038:
            r0 = 1
            r1.A05(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass27v.A3r():void");
    }

    public void A3t(View view, View view2, View view3, View view4) {
        int i;
        C36361kB.A15(view4, view, view2, 8);
        view3.setVisibility(0);
        TextView textView = (TextView) view3;
        if (this instanceof LinkExistingGroupActivity) {
            i = R.string.f12nameremoved;
        } else if (this instanceof PaymentInvitePickerActivity) {
            i = R.string.f12nameremoved;
        } else {
            i = 0;
        }
        Object[] A0L2 = AnonymousClass001.A0L();
        A0L2[0] = this.A0N;
        C36341k9.A0s(this, textView, A0L2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r5.A0x != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3v(X.C62463Gg r4, X.AnonymousClass141 r5) {
        /*
            r3 = this;
            X.1RY r1 = r3.A0Z
            if (r1 == 0) goto L_0x0009
            android.widget.ImageView r0 = r4.A01
            r1.A08(r0, r5)
        L_0x0009:
            X.3SF r1 = r4.A03
            java.util.ArrayList r0 = r3.A0O
            r1.A08(r5, r0)
            android.view.View r2 = r4.A00
            r0 = 28
            X.C67113Yo.A00(r2, r3, r5, r4, r0)
            int r1 = r3.A3k()
            java.util.List r0 = r3.A0c
            int r0 = r0.size()
            if (r1 != r0) goto L_0x002a
            boolean r1 = r5.A0x
            r0 = 1052938076(0x3ec28f5c, float:0.38)
            if (r1 == 0) goto L_0x002c
        L_0x002a:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x002c:
            r2.setAlpha(r0)
            com.whatsapp.components.SelectionCheckView r0 = r4.A04
            r0.setTag(r5)
            r3.A3w(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass27v.A3v(X.3Gg, X.141):void");
    }

    public void A3x(C62183Fc r3) {
        if (AnonymousClass141.A01(r3, this.A0P)) {
            this.A01.notifyDataSetChanged();
            SelectedContactsList selectedContactsList = this.A0E;
            if (selectedContactsList == null) {
                return;
            }
            if (((r3 instanceof C44082Lb) || (r3 instanceof C44092Lc)) && AnonymousClass141.A01(r3, selectedContactsList.A09)) {
                selectedContactsList.A07.A06();
            }
        }
    }

    public void A3y(AnonymousClass141 r8) {
        if (this instanceof GroupMembersSelector) {
            Btm(A0v(this, r8, R.string.f12nameremoved));
        } else if (this instanceof EditBroadcastRecipientsSelector) {
            Btm(A0v(this, r8, R.string.f12nameremoved));
        } else if (this instanceof ListMembersSelector) {
            Btm(A0v(this, r8, R.string.f12nameremoved));
        } else if (this instanceof AddGroupParticipantsSelector) {
            AddGroupParticipantsSelector addGroupParticipantsSelector = (AddGroupParticipantsSelector) this;
            AnonymousClass00C.A0D(r8, 0);
            boolean A1b = C36331k8.A1b(addGroupParticipantsSelector.A0T);
            int i = R.string.f12nameremoved;
            if (A1b) {
                i = R.string.f12nameremoved;
            }
            Object[] objArr = new Object[1];
            C63153Iy r0 = (C63153Iy) addGroupParticipantsSelector.A0J.get(r8.A0H);
            if (r0 == null) {
                r0 = AddGroupParticipantsSelector.A0Y;
            }
            String A0v = C36391kE.A0v(addGroupParticipantsSelector, r0.A00.A01, objArr, 0, i);
            AnonymousClass00C.A0B(A0v);
            C36331k8.A12(UnblockDialogFragment.A03(new C53472rN(addGroupParticipantsSelector, C36381kD.A0e(r8, UserJid.class), addGroupParticipantsSelector.A06, 0), A0v, R.string.f12nameremoved, false), addGroupParticipantsSelector);
        } else if (this instanceof FavoritePicker) {
            FavoritePicker favoritePicker = (FavoritePicker) this;
            AnonymousClass00C.A0D(r8, 0);
            C33311f5.A00(favoritePicker).A00(new FavoritePicker$onBlockedItemPressed$1(favoritePicker, r8, (C023509x) null));
        } else if (this instanceof GroupCallParticipantPicker) {
            C36331k8.A12(A0v(this, r8, R.string.f12nameremoved), this);
        }
    }

    public void A41(String str) {
        if (str == null) {
            str = "";
        }
        this.A0N = str;
        ArrayList A032 = C202859mm.A03(this.A0I, str);
        this.A0O = A032;
        if (A032.isEmpty()) {
            this.A0O = null;
        }
        A0w();
    }

    public void A42(ArrayList arrayList) {
        this.A09.A0i(arrayList);
    }

    public void A43(List list) {
        this.A0Q.clear();
        int A092 = C36391kE.A09(this, R.id.error_text_line1);
        C36341k9.A13(this, R.id.error_text_line2, A092);
        C36341k9.A13(this, R.id.retry_button, A092);
        A0x();
        View findViewById = findViewById(R.id.search_no_matches_container);
        this.A0D.A00(new C70273et(findViewById, this, list), this.A0N);
    }

    public boolean A48(AnonymousClass141 r4) {
        Class<UserJid> cls = UserJid.class;
        if (r4.A06(cls) == null || !this.A06.A0O((UserJid) r4.A06(cls))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0284, code lost:
        if (r2 >= r1) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r7 >= 0) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B2c(X.AnonymousClass141 r10) {
        /*
            r9 = this;
            android.widget.ListView r0 = r9.A02
            android.view.View r6 = r0.findViewWithTag(r10)
            com.whatsapp.components.SelectionCheckView r6 = (com.whatsapp.components.SelectionCheckView) r6
            boolean r0 = r9.A48(r10)
            r5 = 0
            if (r0 == 0) goto L_0x0014
            boolean r0 = r10.A0x
            if (r0 != 0) goto L_0x0014
            r6 = r5
        L_0x0014:
            boolean r0 = r10.A0x
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0175
            r10.A0x = r4
            java.util.List r2 = r9.A0c
            int r7 = r2.indexOf(r10)
            if (r7 >= 0) goto L_0x003d
            r7 = 0
        L_0x0025:
            int r0 = r2.size()
            if (r7 >= r0) goto L_0x0040
            X.11F r1 = r10.A0H
            java.lang.Object r0 = r2.get(r7)
            X.141 r0 = (X.AnonymousClass141) r0
            X.11F r0 = r0.A0H
            boolean r0 = X.C1901797e.A00(r1, r0)
            if (r0 == 0) goto L_0x0171
            if (r7 < 0) goto L_0x0040
        L_0x003d:
            r9.A40(r10, r7)
        L_0x0040:
            if (r6 == 0) goto L_0x0047
            boolean r0 = r10.A0x
            r6.A04(r0, r3)
        L_0x0047:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0062
            r0 = 2131431681(0x7f0b1101, float:1.8485098E38)
            android.view.View r1 = r9.findViewById(r0)
            if (r1 == 0) goto L_0x005b
            r0 = 64
            X.C011504z.A0B(r1, r0, r5)
        L_0x005b:
            boolean r0 = r9.A0V
            if (r0 == 0) goto L_0x0062
            r9.Bx9()
        L_0x0062:
            r9.A3r()
            java.util.List r0 = r9.A0P
            java.util.Iterator r3 = r0.iterator()
        L_0x006b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0087
            X.141 r2 = X.C36391kE.A0f(r3)
            if (r2 == r10) goto L_0x006b
            X.11F r1 = r10.A0H
            X.11F r0 = r2.A0H
            boolean r0 = X.C1901797e.A00(r1, r0)
            if (r0 == 0) goto L_0x006b
            boolean r0 = r10.A0x
            r2.A0x = r0
            r4 = 1
            goto L_0x006b
        L_0x0087:
            if (r4 == 0) goto L_0x008e
            android.widget.BaseAdapter r0 = r9.A01
            r0.notifyDataSetChanged()
        L_0x008e:
            com.whatsapp.contact.picker.SelectedContactsList r3 = r9.A0E
            if (r3 == 0) goto L_0x01c7
            android.view.ViewGroup r5 = r9.A00
            android.widget.ListView r4 = r9.A02
            boolean r1 = r9.A0V
            r3.A02()
            java.util.List r0 = r3.A09
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0149
            r0 = 4
            r3.setVisibility(r0)
            if (r1 == 0) goto L_0x00ae
            X.4UZ r0 = r3.A08
            r0.Bx9()
        L_0x00ae:
            android.animation.AnimatorSet r0 = r3.A02
            if (r0 == 0) goto L_0x00bd
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x00bd
            android.animation.AnimatorSet r0 = r3.A02
            r0.end()
        L_0x00bd:
            int[] r2 = X.C36441kJ.A1O()
            if (r1 == 0) goto L_0x0146
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x0146
            int r1 = r3.A01
            int r0 = r5.getMeasuredHeight()
            int r1 = r1 - r0
        L_0x00d0:
            r0 = 0
            r2[r0] = r1
            android.animation.ValueAnimator r1 = X.C36411kG.A0C(r2, r0)
            r3.A03 = r1
            X.3Uq r0 = new X.3Uq
            r0.<init>(r4)
            r1.addUpdateListener(r0)
            android.animation.ValueAnimator r1 = r3.A03
            X.3Ul r0 = new X.3Ul
            r0.<init>(r3)
            r1.addListener(r0)
            android.animation.ValueAnimator r2 = r3.A03
            r0 = 240(0xf0, double:1.186E-321)
            r2.setDuration(r0)
            boolean r0 = r3 instanceof com.whatsapp.calling.callhistory.group.GroupCallSelectedContactsList
            if (r0 == 0) goto L_0x0140
            r8 = r3
            com.whatsapp.calling.callhistory.group.GroupCallSelectedContactsList r8 = (com.whatsapp.calling.callhistory.group.GroupCallSelectedContactsList) r8
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131168217(0x7f070bd9, float:1.795073E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131168218(0x7f070bda, float:1.7950732E38)
            int r7 = r1.getDimensionPixelSize(r0)
            int r6 = r8.A00
            int r5 = r6 + r2
            X.0ts r0 = r8.A02
            boolean r1 = X.C36351kA.A1Y(r0)
            r4 = 1
            r0 = -1
            if (r1 == 0) goto L_0x011e
            r0 = 1
        L_0x011e:
            int r5 = r5 * r0
            com.whatsapp.WaImageButton r2 = r8.A00
            float r1 = r2.getTranslationX()
            float r0 = (float) r5
            float r1 = r1 + r0
            r2.setTranslationX(r1)
            int r6 = r6 + r7
            X.0ts r0 = r8.A02
            boolean r0 = X.C36351kA.A1Y(r0)
            if (r0 != 0) goto L_0x0134
            r4 = -1
        L_0x0134:
            int r6 = r6 * r4
            com.whatsapp.WaImageButton r2 = r8.A01
            float r1 = r2.getTranslationX()
            float r0 = (float) r6
            float r1 = r1 + r0
            r2.setTranslationX(r1)
        L_0x0140:
            android.animation.ValueAnimator r0 = r3.A03
            r0.start()
            return
        L_0x0146:
            int r1 = r3.A01
            goto L_0x00d0
        L_0x0149:
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0159
            android.animation.ValueAnimator r0 = r3.A03
            if (r0 == 0) goto L_0x0161
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0161
        L_0x0159:
            r0 = 0
            r3.setVisibility(r0)
            com.whatsapp.contact.picker.SelectedContactsList.A00(r4, r5, r3, r1)
            return
        L_0x0161:
            boolean r0 = r10.A0x
            if (r0 == 0) goto L_0x01c7
            androidx.recyclerview.widget.RecyclerView r1 = r3.A05
            java.util.List r0 = r3.A09
            int r0 = X.C36431kI.A07(r0)
            r1.A0h(r0)
            return
        L_0x0171:
            int r7 = r7 + 1
            goto L_0x0025
        L_0x0175:
            int r1 = r9.A3k()
            java.util.List r2 = r9.A0c
            int r0 = r2.size()
            if (r0 != r1) goto L_0x029a
            r7 = r9
            boolean r0 = r9 instanceof com.whatsapp.calling.favorite.FavoritePicker
            if (r0 == 0) goto L_0x01c8
            com.whatsapp.calling.favorite.FavoritePicker r7 = (com.whatsapp.calling.favorite.FavoritePicker) r7
            android.widget.ListView r0 = r7.A02
            android.view.View r8 = r0.findViewWithTag(r10)
            com.whatsapp.components.SelectionCheckView r8 = (com.whatsapp.components.SelectionCheckView) r8
            X.3uJ r6 = new X.3uJ
            r6.<init>(r7)
            X.0ts r5 = r7.A0I
            r4 = 2131755073(0x7f100041, float:1.9141015E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r0 = 100
            boolean r3 = X.C36361kB.A1b(r2, r0)
            r0 = 100
            java.lang.String r2 = r5.A0L(r2, r4, r0)
            X.AnonymousClass00C.A08(r2)
            java.lang.String r0 = "message"
            com.whatsapp.voipcalling.dialogs.MessageDialogFragment r1 = new com.whatsapp.voipcalling.dialogs.MessageDialogFragment
            r1.<init>()
            r1.A01 = r6
            android.os.Bundle r0 = X.C36431kI.A0I(r0, r2)
            r1.A17(r0)
            java.lang.String r0 = "MessageDialogFragment"
            r7.Btn(r1, r0)
            if (r8 == 0) goto L_0x01c7
            r8.A04(r3, r3)
        L_0x01c7:
            return
        L_0x01c8:
            boolean r0 = r9 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 == 0) goto L_0x01e8
            int r1 = r9.A3k()
            X.17Y r6 = r9.A05
            X.0ts r5 = r9.A0I
            r4 = 2131755159(0x7f100097, float:1.914119E38)
            long r2 = (long) r1
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            boolean r1 = X.C36361kB.A1b(r0, r1)
            java.lang.String r0 = r5.A0L(r0, r4, r2)
            r6.A0E(r0, r1)
            return
        L_0x01e8:
            android.widget.ListView r0 = r9.A02
            android.view.View r5 = r0.findViewWithTag(r10)
            com.whatsapp.components.SelectionCheckView r5 = (com.whatsapp.components.SelectionCheckView) r5
            int r4 = r9.A3k()
            X.0ts r3 = r9.A0I
            r6 = r9
            boolean r0 = r9 instanceof com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity
            if (r0 == 0) goto L_0x0214
            r7 = 2131755169(0x7f1000a1, float:1.914121E38)
        L_0x01fe:
            long r0 = (long) r4
            java.lang.Object[] r6 = X.AnonymousClass001.A0L()
            boolean r2 = X.C36361kB.A1b(r6, r4)
            java.lang.String r0 = r3.A0L(r6, r7, r0)
            r9.BO6(r0)
            if (r5 == 0) goto L_0x01c7
            r5.A04(r2, r2)
            return
        L_0x0214:
            boolean r0 = r9 instanceof com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity
            if (r0 != 0) goto L_0x0295
            boolean r0 = r9 instanceof com.whatsapp.registration.NotifyContactsSelector
            if (r0 == 0) goto L_0x0220
            r7 = 2131755247(0x7f1000ef, float:1.9141368E38)
            goto L_0x01fe
        L_0x0220:
            boolean r0 = r9 instanceof com.whatsapp.payments.ui.PaymentInvitePickerActivity
            if (r0 == 0) goto L_0x0228
            r7 = 2131755269(0x7f100105, float:1.9141413E38)
            goto L_0x01fe
        L_0x0228:
            boolean r0 = r9 instanceof com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector
            if (r0 != 0) goto L_0x0295
            boolean r0 = r9 instanceof com.whatsapp.group.GroupMembersSelector
            if (r0 != 0) goto L_0x0295
            boolean r0 = r9 instanceof com.whatsapp.group.EditGroupAdminsSelector
            if (r0 != 0) goto L_0x0295
            boolean r0 = r9 instanceof com.whatsapp.conversation.EditBroadcastRecipientsSelector
            if (r0 != 0) goto L_0x0290
            boolean r0 = r9 instanceof com.whatsapp.contact.picker.nativecontacts.NativeContactsMultipleContactPicker
            if (r0 == 0) goto L_0x023e
            r7 = -1
            goto L_0x01fe
        L_0x023e:
            boolean r0 = r9 instanceof com.whatsapp.contact.picker.ListMembersSelector
            if (r0 != 0) goto L_0x0290
            boolean r0 = r9 instanceof com.whatsapp.contact.picker.ContactsAttachmentSelector
            if (r0 == 0) goto L_0x024a
            r7 = 2131755055(0x7f10002f, float:1.9140978E38)
            goto L_0x01fe
        L_0x024a:
            boolean r0 = r9 instanceof com.whatsapp.contact.picker.AddGroupParticipantsSelector
            if (r0 == 0) goto L_0x025f
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r6 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r6
            X.00T r0 = r6.A0T
            boolean r0 = X.C36331k8.A1b(r0)
            r7 = 2131755160(0x7f100098, float:1.9141191E38)
            if (r0 == 0) goto L_0x01fe
            r7 = 2131755047(0x7f100027, float:1.9140962E38)
            goto L_0x01fe
        L_0x025f:
            boolean r0 = r9 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 == 0) goto L_0x028b
            com.whatsapp.community.LinkExistingGroups r6 = (com.whatsapp.community.LinkExistingGroups) r6
            X.1LV r0 = r6.A02
            if (r0 == 0) goto L_0x02e0
            X.0yC r1 = r0.A06
            r0 = 1990(0x7c6, float:2.789E-42)
            int r2 = r1.A07(r0)
            X.1LV r0 = r6.A02
            if (r0 == 0) goto L_0x02d9
            X.0yC r1 = r0.A06
            r0 = 1238(0x4d6, float:1.735E-42)
            int r1 = r1.A07(r0)
            X.147 r0 = r6.A0A
            if (r0 != 0) goto L_0x0286
            r7 = 2131755171(0x7f1000a3, float:1.9141214E38)
            if (r2 < r1) goto L_0x01fe
        L_0x0286:
            r7 = 2131755170(0x7f1000a2, float:1.9141212E38)
            goto L_0x01fe
        L_0x028b:
            r7 = 2131755159(0x7f100097, float:1.914119E38)
            goto L_0x01fe
        L_0x0290:
            r7 = 2131755023(0x7f10000f, float:1.9140914E38)
            goto L_0x01fe
        L_0x0295:
            r7 = 2131755160(0x7f100098, float:1.9141191E38)
            goto L_0x01fe
        L_0x029a:
            boolean r0 = r9 instanceof com.whatsapp.community.LinkExistingGroups
            if (r0 != 0) goto L_0x02b3
            r0 = 2131433616(0x7f0b1890, float:1.8489023E38)
            android.view.View r1 = r9.findViewById(r0)
            if (r1 == 0) goto L_0x02cd
            r0 = 2131433672(0x7f0b18c8, float:1.8489136E38)
            android.widget.TextView r0 = X.C36391kE.A0P(r1, r0)
            if (r0 == 0) goto L_0x02b3
            X.C36391kE.A1K(r0)
        L_0x02b3:
            r10.A0x = r3
            boolean r0 = r2.add(r10)
            if (r0 == 0) goto L_0x0040
            r9.A3z(r10)
            java.util.List r0 = r9.A0Q
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L_0x0040
            java.util.List r0 = r9.A0R
            X.C36421kH.A1L(r10, r0)
            goto L_0x0040
        L_0x02cd:
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r9.A0M
            if (r0 == 0) goto L_0x02b3
            com.whatsapp.wds.components.search.WDSSearchView r0 = r0.A07
            com.whatsapp.WaEditText r0 = r0.A08
            X.C36391kE.A1K(r0)
            goto L_0x02b3
        L_0x02d9:
            java.lang.String r0 = "communityChatManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02e0:
            java.lang.String r0 = "communityChatManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass27v.B2c(X.141):void");
    }

    public void Bg7() {
        if (this instanceof GroupCallParticipantPicker) {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            ArrayList A0I2 = AnonymousClass001.A0I();
            GroupCallParticipantPicker.A12(groupCallParticipantPicker, A0I2, groupCallParticipantPicker.A3o());
            if (groupCallParticipantPicker.A01.Bub(groupCallParticipantPicker, A0I2, AnonymousClass000.A0I(groupCallParticipantPicker.getIntent().getSerializableExtra("call_from_ui")), false) == 0) {
                GroupCallParticipantPicker.A11(groupCallParticipantPicker);
                C36331k8.A0m(groupCallParticipantPicker);
            }
        }
    }

    public void Bg8() {
        if (this instanceof GroupCallParticipantPicker) {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            ArrayList A0I2 = AnonymousClass001.A0I();
            GroupCallParticipantPicker.A12(groupCallParticipantPicker, A0I2, groupCallParticipantPicker.A3o());
            if (groupCallParticipantPicker.A01.Bub(groupCallParticipantPicker, A0I2, AnonymousClass000.A0I(groupCallParticipantPicker.getIntent().getSerializableExtra("call_from_ui")), true) == 0) {
                GroupCallParticipantPicker.A11(groupCallParticipantPicker);
                C36331k8.A0m(groupCallParticipantPicker);
            }
        }
    }

    public void Bx9() {
        ViewGroup viewGroup;
        int i;
        ViewGroup viewGroup2;
        int i2;
        if (this instanceof AddGroupParticipantsSelector) {
            AddGroupParticipantsSelector addGroupParticipantsSelector = (AddGroupParticipantsSelector) this;
            if (addGroupParticipantsSelector.A0V && addGroupParticipantsSelector.A0c.isEmpty()) {
                String str = addGroupParticipantsSelector.A0N;
                i2 = 0;
                if (str == null || str.length() == 0) {
                    C220412q r1 = addGroupParticipantsSelector.A06;
                    if (r1 == null) {
                        throw C36331k8.A0d("chatsCache");
                    } else if (!r1.A0O(C36421kH.A0O(addGroupParticipantsSelector.A0Q))) {
                        viewGroup2 = addGroupParticipantsSelector.A00;
                        viewGroup2.setVisibility(i2);
                        return;
                    }
                }
            }
            viewGroup2 = addGroupParticipantsSelector.A00;
            i2 = 8;
            viewGroup2.setVisibility(i2);
            return;
        }
        if (!this.A0V || !this.A0c.isEmpty()) {
            viewGroup = this.A00;
            i = 8;
        } else {
            viewGroup = this.A00;
            i = 0;
        }
        viewGroup.setVisibility(i);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        if (adapterContextMenuInfo != null) {
            getListView().getItemAtPosition(adapterContextMenuInfo.position);
        }
    }

    public boolean onSearchRequested() {
        WDSSearchBar wDSSearchBar = this.A0M;
        if (wDSSearchBar == null) {
            return false;
        }
        wDSSearchBar.A01();
        return false;
    }

    private void A0x() {
        boolean A1V;
        View findViewById = findViewById(R.id.contacts_empty_permission_denied);
        View findViewById2 = findViewById(R.id.contacts_empty);
        View findViewById3 = findViewById(R.id.search_no_matches);
        View findViewById4 = findViewById(R.id.init_contacts_progress);
        View findViewById5 = findViewById(R.id.error_text_line1);
        if (!this.A08.A00()) {
            findViewById4.setVisibility(8);
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(8);
        } else {
            if (this instanceof IndiaUpiPaymentInvitePickerActivity) {
                A1V = ((IndiaUpiPaymentInvitePickerActivity) this).A06;
            } else {
                A1V = AnonymousClass000.A1V(this.A0G);
            }
            if (A1V) {
                A3u(findViewById, findViewById2, findViewById3, findViewById4);
            } else if (!TextUtils.isEmpty(this.A0N)) {
                if (this.A0T) {
                    findViewById4.setVisibility(0);
                } else if (findViewById5.getVisibility() != 0) {
                    findViewById3.setVisibility(0);
                    Object[] A0L2 = AnonymousClass001.A0L();
                    A0L2[0] = this.A0N;
                    C36341k9.A0s(this, (TextView) findViewById3, A0L2, R.string.f12nameremoved);
                    findViewById4.setVisibility(8);
                }
                findViewById.setVisibility(8);
                findViewById2.setVisibility(8);
            } else if ((this instanceof LinkExistingGroupActivity) || (this instanceof PaymentInvitePickerActivity)) {
                A3t(findViewById, findViewById2, findViewById3, findViewById4);
            } else {
                findViewById4.setVisibility(8);
                findViewById.setVisibility(8);
                findViewById2.setVisibility(0);
                findViewById3.setVisibility(8);
                if (this instanceof InviteNewsletterAdminSelector) {
                    C36331k8.A0y(findViewById(R.id.contacts_empty));
                    TextView A0Q2 = C36391kE.A0Q(this, R.id.search_no_matches);
                    if (A0Q2 != null) {
                        A0Q2.setVisibility(0);
                        A0Q2.setText(R.string.f12nameremoved);
                    }
                }
            }
        }
        A3r();
    }

    public static void A0y(AnonymousClass27v r3, String str) {
        if (!TextUtils.isEmpty(str)) {
            C65383Rv r2 = r3.A0F;
            int i = 27;
            if (TextUtils.isEmpty(r3.A0N)) {
                i = 26;
            }
            r2.A02(r3, Integer.valueOf(i), str, "sms:");
        }
    }

    public void A3s(int i) {
        String A0L2;
        AnonymousClass07B A0O2 = C36381kD.A0O(this);
        int A3k = A3k();
        C18740tg.A0D(AnonymousClass000.A1R(A3k), "Max contacts must be positive");
        if (A3k == Integer.MAX_VALUE) {
            A0L2 = C36331k8.A0g(this.A0I, i, 0, R.plurals.f10nameremoved);
        } else {
            Object[] A0M2 = AnonymousClass001.A0M();
            C36331k8.A1X(A0M2, i, 0, A3k, 1);
            A0L2 = this.A0I.A0L(A0M2, R.plurals.f10nameremoved, (long) i);
        }
        A0O2.A0P(A0L2);
    }

    public void A3w(C62463Gg r5, AnonymousClass141 r6) {
        boolean z;
        if (!A48(r6) || r6.A0x) {
            if (this instanceof FavoritePicker) {
                z = false;
            } else if (this instanceof GroupCallParticipantPicker) {
                z = C36431kI.A1X(this.A0D);
            } else {
                z = true;
            }
            if (z) {
                if (C36431kI.A1X(this.A0D)) {
                    String A012 = AnonymousClass3SX.A01(this, this.A07, r6);
                    if (!AnonymousClass14B.A0F(A012)) {
                        TextEmojiLabel textEmojiLabel = r5.A02;
                        textEmojiLabel.A0I(A012);
                        textEmojiLabel.setVisibility(0);
                        r5.A01(r6.A0x);
                        return;
                    }
                } else if (r6.A0X != null) {
                    TextEmojiLabel textEmojiLabel2 = r5.A02;
                    textEmojiLabel2.setVisibility(0);
                    textEmojiLabel2.A0I(r6.A0X);
                    String str = r6.A0X;
                    if (str == null) {
                        str = "";
                    }
                    textEmojiLabel2.A0I(str);
                    r5.A01(r6.A0x);
                    return;
                }
            }
            r5.A02.setVisibility(8);
            r5.A01(r6.A0x);
            return;
        }
        r5.A00(getString(R.string.f12nameremoved), true);
    }

    public void A3z(AnonymousClass141 r3) {
        if (A3k() == this.A0c.size()) {
            this.A01.notifyDataSetChanged();
        }
        SelectedContactsList selectedContactsList = this.A0E;
        if (selectedContactsList != null) {
            selectedContactsList.A07.A08(C36431kI.A07(selectedContactsList.A09));
        }
    }

    public void A40(AnonymousClass141 r4, int i) {
        int A3k = A3k();
        List list = this.A0c;
        boolean A1S = AnonymousClass000.A1S(A3k, list.size());
        list.remove(i);
        if (A1S) {
            this.A01.notifyDataSetChanged();
        }
        SelectedContactsList selectedContactsList = this.A0E;
        if (selectedContactsList != null) {
            selectedContactsList.A07.A09(i);
        }
    }

    public void A47(List list) {
        ViewGroup A0E2 = C36421kH.A0E(this, R.id.search_no_matches_container);
        TextView A0Q2 = C36391kE.A0Q(this, R.id.moreText);
        if (TextUtils.isEmpty(this.A0N) || !list.isEmpty()) {
            A0Q2.setVisibility(8);
        } else {
            A0Q2.setVisibility(0);
            C33511fU.A03(A0Q2);
        }
        if (this.A0X == null) {
            FrameLayout frameLayout = new FrameLayout(this);
            this.A0X = frameLayout;
            boolean z = C222013h.A07;
            int i = R.drawable.ic_voip_add_person;
            if (z) {
                i = R.drawable.ic_voip_add_person_filled_wds;
            }
            View A002 = C63713Lc.A00(getLayoutInflater(), (ViewGroup) null, i, R.string.f12nameremoved);
            C48912iG.A00(A002, this, 21);
            C33521fV.A02(A002);
            frameLayout.addView(A002);
            A0E2.addView(this.A0X);
        }
        if (TextUtils.isEmpty(this.A0N) || !list.isEmpty()) {
            this.A0X.setVisibility(8);
        } else {
            this.A0X.setVisibility(0);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2) {
            this.A0K.A01();
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
        if (adapterContextMenuInfo != null) {
            getListView().getItemAtPosition(adapterContextMenuInfo.position);
        }
        return super.onContextItemSelected(menuItem);
    }

    public void onCreate(Bundle bundle) {
        int i;
        boolean z;
        ListView listView;
        int dimensionPixelSize;
        Resources resources;
        int i2;
        Drawable A002;
        int i3;
        int i4;
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        boolean z2 = this instanceof ContactsAttachmentSelector;
        if (z2) {
            boolean A003 = AnonymousClass3MR.A00(this.A0D);
            i = R.layout.f9nameremoved;
            if (A003) {
                i = R.layout.f9nameremoved;
            }
        } else if (this instanceof GroupCallParticipantPickerSheet) {
            i = R.layout.f9nameremoved;
        } else {
            i = R.layout.f9nameremoved;
        }
        setContentView(layoutInflater.inflate(i, (ViewGroup) null));
        C36341k9.A12(this);
        AnonymousClass07B A0O2 = C36381kD.A0O(this);
        A0O2.A0U(true);
        A0O2.A0V(true);
        A0O2.A0I(A3j());
        boolean z3 = this instanceof FavoritePicker;
        if (z3) {
            A0O2.A0P((CharSequence) null);
        }
        this.A0Z = this.A0C.A05(this, "multiple-contact-picker");
        WDSSearchBar wDSSearchBar = (WDSSearchBar) findViewById(R.id.toolbar_holder);
        this.A0M = wDSSearchBar;
        if (wDSSearchBar != null) {
            wDSSearchBar.A07.setOnQueryTextChangeListener(new C89724Xq(this, 1));
            this.A0M.A07.setTrailingButtonIcon(C50942mt.A00);
        }
        ListView listView2 = getListView();
        this.A02 = listView2;
        boolean z4 = this instanceof GroupCallParticipantPicker;
        if (z4) {
            z = false;
        } else {
            z = true;
        }
        listView2.setFastScrollAlwaysVisible(z);
        this.A02.setScrollBarStyle(33554432);
        boolean z5 = this instanceof LinkExistingGroupActivity;
        if (!z5) {
            ViewStub viewStub = (ViewStub) C03570Gk.A0B(this, R.id.selected_list_stub);
            if (z4) {
                i4 = R.layout.f9nameremoved;
            } else {
                i4 = R.layout.f9nameremoved;
            }
            SelectedContactsList selectedContactsList = (SelectedContactsList) C36401kF.A0E(viewStub, i4);
            this.A0E = selectedContactsList;
            selectedContactsList.A08 = this;
            selectedContactsList.A09 = this.A0c;
        }
        if (A3l() != null) {
            this.A02.addHeaderView(A3l(), (Object) null, false);
        }
        List list = this.A0c;
        list.clear();
        if (bundle != null) {
            ArrayList A1F = C36431kI.A1F(bundle, AnonymousClass11F.class, "selected_jids");
            if (!A1F.isEmpty()) {
                Iterator it = A1F.iterator();
                while (it.hasNext()) {
                    AnonymousClass141 A082 = this.A09.A08(C36401kF.A0a(it));
                    if (A082 != null) {
                        A082.A0x = true;
                        list.add(A082);
                    }
                }
            }
        } else {
            this.A0S = C36401kF.A0u(getIntent(), AnonymousClass11F.class, "selected");
        }
        A3q();
        this.A02.setOnScrollListener(new C63813Ln(this));
        this.A02.setFastScrollEnabled(true);
        this.A02.setScrollbarFadingEnabled(true);
        boolean A1X = C36401kF.A1X(this.A0I);
        ListView listView3 = this.A02;
        if (A1X) {
            listView3.setVerticalScrollbarPosition(1);
            listView = this.A02;
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            resources = getResources();
            i2 = R.dimen.f7nameremoved;
        } else {
            listView3.setVerticalScrollbarPosition(2);
            listView = this.A02;
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            resources = getResources();
            i2 = R.dimen.f7nameremoved;
        }
        listView.setPadding(dimensionPixelSize, 0, resources.getDimensionPixelSize(i2), 0);
        C89594Xd.A00(this.A02, this, 3);
        this.A00 = C36421kH.A0E(this, R.id.warning);
        View A3m = A3m();
        if (A3m != null) {
            this.A0V = true;
            this.A00.removeAllViews();
            this.A00.addView(A3m);
        } else {
            String A3n = A3n();
            this.A0V = C36421kH.A1a(A3n);
            C36391kE.A0Q(this, R.id.warning_text).setText(A3n);
        }
        Bx9();
        C37861nK r0 = new C37861nK(this, this, this.A0b);
        this.A01 = r0;
        A3i(r0);
        AnonymousClass060 r1 = (AnonymousClass060) C03570Gk.A0B(this, R.id.next_btn);
        this.A03 = r1;
        if (!z4) {
            if (z5) {
                A002 = A0u(this);
            } else if (this instanceof GroupMembersSelectorActivity) {
                A002 = A0u(this);
            } else {
                if (!(this instanceof NotifyContactsSelector)) {
                    if (this instanceof PaymentInvitePickerActivity) {
                        A002 = A0u(this);
                    } else if (this instanceof InviteNewsletterAdminSelector) {
                        A002 = AnonymousClass00E.A00(this, R.drawable.ic_fab_check);
                        AnonymousClass00C.A0B(A002);
                    } else if (this instanceof GroupMembersSelector) {
                        A002 = A0u(this);
                    } else if (!(this instanceof EditGroupAdminsSelector) && !(this instanceof EditBroadcastRecipientsSelector)) {
                        if (this instanceof NativeContactsMultipleContactPicker) {
                            A002 = A0u(this);
                        } else if (!(this instanceof ListMembersSelector)) {
                            if (z2) {
                                A002 = A0u(this);
                            } else if (!(this instanceof AddGroupParticipantsSelector)) {
                                if (this instanceof LinkExistingGroups) {
                                    A002 = A0u(this);
                                } else if (z3) {
                                    A002 = AnonymousClass00E.A00(this, R.drawable.ic_fab_check_wds);
                                } else {
                                    A002 = null;
                                }
                            }
                        }
                    }
                }
                A002 = AnonymousClass00E.A00(this, R.drawable.ic_fab_check);
            }
            r1.setImageDrawable(A002);
            AnonymousClass060 r12 = this.A03;
            if (!z5 && !(this instanceof GroupMembersSelectorActivity)) {
                if (!(this instanceof NotifyContactsSelector)) {
                    if (!(this instanceof PaymentInvitePickerActivity)) {
                        if (!(this instanceof InviteNewsletterAdminSelector)) {
                            if (!(this instanceof GroupMembersSelector)) {
                                if (!(this instanceof EditGroupAdminsSelector) && !(this instanceof EditBroadcastRecipientsSelector) && !(this instanceof NativeContactsMultipleContactPicker)) {
                                    if (this instanceof ListMembersSelector) {
                                        i3 = R.string.f12nameremoved;
                                    } else if (!z2) {
                                        if (!(this instanceof AddGroupParticipantsSelector)) {
                                            if (!(this instanceof LinkExistingGroups) && !z3) {
                                                i3 = 0;
                                            }
                                        }
                                    }
                                    C36331k8.A0q(this, r12, i3);
                                    C48912iG.A00(this.A03, this, 19);
                                }
                            }
                        }
                    }
                }
                i3 = R.string.f12nameremoved;
                C36331k8.A0q(this, r12, i3);
                C48912iG.A00(this.A03, this, 19);
            }
            i3 = R.string.f12nameremoved;
            C36331k8.A0q(this, r12, i3);
            C48912iG.A00(this.A03, this, 19);
        }
        ((EmptyTellAFriendView) findViewById(R.id.contacts_empty)).setInviteButtonClickListener(new C66943Xx(this, 44));
        C48912iG.A00(findViewById(R.id.button_open_permission_settings), this, 20);
        registerForContextMenu(this.A02);
        A0x();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = C36411kG.A0I(menu).setIcon(R.drawable.ic_action_search);
        this.A0W = icon;
        icon.setShowAsAction(2);
        this.A0W.setVisible(C36401kF.A1a(this.A0P));
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0P.clear();
        this.A0b.clear();
        AnonymousClass1RY r0 = this.A0Z;
        if (r0 != null) {
            r0.A02();
            this.A0Z = null;
        }
        C48992iO r02 = this.A0G;
        if (r02 != null) {
            r02.A0D(true);
            this.A0G = null;
        }
        C49382j1 r03 = this.A0Y;
        if (r03 != null) {
            r03.A0D(true);
            this.A0Y = null;
        }
        C49112ia r04 = this.A0H;
        if (r04 != null) {
            r04.A0D(true);
            this.A0H = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            A3p();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        this.A0A.unregisterObserver(this.A0e);
        this.A07.unregisterObserver(this.A0d);
        this.A0J.unregisterObserver(this.A0a.get());
    }

    public void onResume() {
        super.onResume();
        this.A0A.registerObserver(this.A0e);
        this.A07.registerObserver(this.A0d);
        this.A0J.registerObserver(this.A0a.get());
        this.A01.notifyDataSetChanged();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        List list = this.A0c;
        if (!list.isEmpty()) {
            ArrayList A0r = C36361kB.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C36361kB.A1S(A0r, it);
            }
            bundle.putStringArrayList("selected_jids", AnonymousClass143.A07(A0r));
        }
    }

    public void Bbo(String str) {
        A0y(this, str);
    }
}
