package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.dialogs.DeleteOrArchiveChatDialog;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.invites.PromptSendGroupInviteDialogFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.reactions.ReactionsBottomSheetDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3UX  reason: invalid class name */
public class AnonymousClass3UX implements AnonymousClass04S {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass3UX(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public final void BTH(Object obj) {
        C132446Tt r5;
        C19770wU r0;
        switch (this.A03) {
            case 0:
                C225314u r3 = (C225314u) this.A00;
                AnonymousClass3H1 r2 = (AnonymousClass3H1) this.A01;
                AnonymousClass147 r1 = (AnonymousClass147) this.A02;
                C53622rc r13 = (C53622rc) obj;
                r3.Bnv();
                if (r13 instanceof AnonymousClass2Ex) {
                    r2.A01((AnonymousClass2Ex) r13, r1);
                    return;
                } else if (r13 instanceof AnonymousClass2Ez) {
                    r3.Bu2(R.string.f12nameremoved, R.string.f12nameremoved);
                    return;
                } else if (r13 instanceof AnonymousClass2Ev) {
                    r3.A05.A06(C36421kH.A02(r3), 0);
                    ((AnonymousClass2Ev) r13).A00.invoke();
                    return;
                } else if (r13 instanceof AnonymousClass2Ew) {
                    r2.A00((AnonymousClass2Ew) r13);
                    return;
                } else {
                    return;
                }
            case 1:
                AnonymousClass2IR r52 = (AnonymousClass2IR) this.A00;
                C225314u r4 = (C225314u) this.A01;
                AnonymousClass11F r22 = (AnonymousClass11F) this.A02;
                AnonymousClass11F r132 = (AnonymousClass11F) obj;
                if (r132 != null) {
                    String A0u = C36381kD.A0u(r52.A0l, r52.A0n, r132);
                    String A0D = r52.A0F.A0D(r22);
                    if (A0u != null) {
                        Object[] A0M = AnonymousClass001.A0M();
                        C36331k8.A1N(A0u, A0D, A0M);
                        String string = r4.getString(R.string.f12nameremoved, A0M);
                        View findViewById = r4.A00.findViewById(16908290);
                        if (findViewById == null) {
                            findViewById = r4.A00;
                        }
                        C99304t3 A012 = C99304t3.A01(findViewById, string, -1);
                        A012.A0X(C36351kA.A01(r4, R.attr.f4nameremoved, R.color.f6nameremoved));
                        A012.A0P();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                C225314u r53 = (C225314u) this.A01;
                GroupJid groupJid = (GroupJid) this.A02;
                Map map = (Map) obj;
                if (map != null && map.size() >= 1) {
                    Long l = null;
                    ArrayList A0I = AnonymousClass001.A0I();
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    Iterator A0y = AnonymousClass000.A0y(map);
                    while (A0y.hasNext()) {
                        Map.Entry A11 = AnonymousClass000.A11(A0y);
                        C596034o r23 = (C596034o) A11.getValue();
                        if (r23 != null) {
                            if (l == null) {
                                l = Long.valueOf(r23.A00);
                            }
                            A0I.add(((Jid) A11.getKey()).getRawString());
                            A0I2.add(r23.A01);
                        }
                    }
                    Bundle A032 = PromptSendGroupInviteDialogFragment.A03(AnonymousClass190.A0f(r53, groupJid, l, A0I, A0I2, AnonymousClass001.A0I(), 3), map.keySet(), false);
                    PromptSendGroupInviteDialogFragment promptSendGroupInviteDialogFragment = new PromptSendGroupInviteDialogFragment();
                    A032.putInt("invite_intent_code", -1);
                    promptSendGroupInviteDialogFragment.A17(A032);
                    r53.Btm(promptSendGroupInviteDialogFragment);
                    return;
                }
                return;
            case 3:
                AnonymousClass2IR r54 = (AnonymousClass2IR) this.A00;
                Object obj2 = this.A01;
                AnonymousClass11F r42 = (AnonymousClass11F) this.A02;
                Map map2 = (Map) obj;
                if (map2 != null && map2.size() >= 1) {
                    Map.Entry A112 = AnonymousClass000.A11(AnonymousClass000.A0y(map2));
                    String A0u2 = C36381kD.A0u(r54.A0l, r54.A0n, (AnonymousClass11F) A112.getKey());
                    String A0D2 = r54.A0F.A0D(r42);
                    if (AnonymousClass000.A0I(A112.getValue()) == 409) {
                        r54.A0R.A0H(new C80503vV(r54, obj2, A0u2, A0D2, 0));
                        return;
                    }
                    C20350xQ r12 = r54.A1Q;
                    if (map2.size() > 0) {
                        r12.A0T(3001, map2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                AnonymousClass2K6 r55 = (AnonymousClass2K6) this.A00;
                AnonymousClass3T1 r43 = (AnonymousClass3T1) this.A01;
                C36441kJ.A1F(obj);
                r55.A03.A01(r43, (Long) null, 2);
                AnonymousClass2K6.A00((C225314u) this.A02, r55, r43);
                return;
            case 5:
                DeleteOrArchiveChatDialog deleteOrArchiveChatDialog = (DeleteOrArchiveChatDialog) this.A00;
                AnonymousClass11F r32 = (AnonymousClass11F) this.A01;
                CompoundButton compoundButton = (CompoundButton) this.A02;
                AnonymousClass00C.A0D(compoundButton, 2);
                AnonymousClass00C.A0B(r32);
                boolean isChecked = compoundButton.isChecked();
                deleteOrArchiveChatDialog.A1b();
                C225314u A0L = C36401kF.A0L(deleteOrArchiveChatDialog.A0i());
                AnonymousClass1X4 r02 = deleteOrArchiveChatDialog.A01;
                if (r02 != null) {
                    r5 = new C49882jq(A0L, r02, r32, isChecked);
                    r0 = deleteOrArchiveChatDialog.A04;
                    if (r0 == null) {
                        throw C36321k7.A08();
                    }
                } else {
                    throw C36331k8.A0d("userActions");
                }
                break;
            case 6:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                View view = (View) this.A01;
                TextView textView = (TextView) this.A02;
                Number number = (Number) obj;
                int intValue = number.intValue();
                if (intValue > 0) {
                    view.setVisibility(0);
                    textView.setText(groupChatInfoActivity.A0q.A0M().format(number));
                    Resources resources = groupChatInfoActivity.getResources();
                    Object[] A0L2 = AnonymousClass001.A0L();
                    A0L2[0] = number;
                    textView.setContentDescription(resources.getQuantityString(R.plurals.f10nameremoved, intValue, A0L2));
                    return;
                }
                view.setVisibility(8);
                return;
            case 7:
                ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment = (ReactionsBottomSheetDialogFragment) this.A00;
                C61923Ea r24 = (C61923Ea) this.A01;
                LayoutInflater layoutInflater = (LayoutInflater) this.A02;
                List list = (List) obj;
                if (!list.isEmpty()) {
                    int i = r24.A00;
                    C18820ts r33 = reactionsBottomSheetDialogFragment.A0E;
                    String str = r24.A03;
                    int size = list.size();
                    String[] strArr = C65753Ti.A03;
                    Context context = layoutInflater.getContext();
                    View A0K = C36381kD.A0K(layoutInflater, R.layout.f9nameremoved);
                    C36401kF.A0O(A0K, R.id.reactions_bottom_sheet_tab_emoji_text).A0I(str);
                    C36391kE.A0O(A0K, R.id.reactions_bottom_sheet_tab_counter_text).setText(C65753Ti.A01(context, r33, size));
                    String A013 = C65753Ti.A01(context, r33, size);
                    Resources resources2 = context.getResources();
                    Object[] A0M2 = AnonymousClass001.A0M();
                    C36331k8.A1N(A013, str, A0M2);
                    A0K.setContentDescription(resources2.getQuantityString(R.plurals.f10nameremoved, size, A0M2));
                    ReactionsBottomSheetDialogFragment.A03(A0K, reactionsBottomSheetDialogFragment, i);
                    return;
                }
                return;
            default:
                C224914p r14 = (C224914p) this.A00;
                r5 = (C132446Tt) this.A02;
                ((C001600r) this.A01).A07(r14);
                r0 = r14.A04;
                break;
        }
        C36331k8.A1F(r5, r0);
    }
}
