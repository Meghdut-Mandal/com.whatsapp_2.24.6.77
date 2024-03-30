package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass147;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1LV;
import X.AnonymousClass3LW;
import X.AnonymousClass3QK;
import X.AnonymousClass3YE;
import X.AnonymousClass4FI;
import X.C000800j;
import X.C001400p;
import X.C19420v0;
import X.C19600wD;
import X.C20350xQ;
import X.C20810yC;
import X.C222013h;
import X.C27591Ow;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C46332Wm;
import X.C48892iE;
import X.C55862vJ;
import X.C87884Qn;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

public final class CommunityAddMembersBottomSheet extends Hilt_CommunityAddMembersBottomSheet implements C87884Qn {
    public LinearLayout A00;
    public LinearLayout A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public AnonymousClass17Y A06;
    public AnonymousClass1LV A07;
    public C19600wD A08;
    public C19420v0 A09;
    public C20810yC A0A;
    public C20350xQ A0B;
    public C27591Ow A0C;
    public AnonymousClass19A A0D;
    public String A0E;
    public final AnonymousClass00T A0F = C001400p.A00(C000800j.NONE, new AnonymousClass4FI(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        LinearLayout linearLayout;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        Context A1D = A1D();
        if (A1D != null) {
            C19600wD r0 = this.A08;
            if (r0 == null) {
                throw C36331k8.A0d("connectivityStateProvider");
            } else if (!r0.A09()) {
                Log.e("CommunityAddMembersBottomSheet/ no network access");
                C39001qm A002 = AnonymousClass3LW.A00(A1D);
                A002.A0p(A0n(R.string.f12nameremoved));
                C39001qm.A04(this, A002);
                A002.A0b();
                A1b();
                return;
            }
        }
        C36391kE.A0P(view, R.id.community_add_members_title).setText(R.string.f12nameremoved);
        if (C222013h.A07) {
            C36391kE.A0N(view, R.id.add_member_image).setImageResource(R.drawable.ic_voip_add_person_filled_wds);
        }
        TextView A0P = C36391kE.A0P(A0d(), R.id.add_members_action_item_text);
        this.A03 = A0P;
        if (A0P != null) {
            A0P.setText(R.string.f12nameremoved);
        }
        this.A00 = C36441kJ.A0U(A0d(), R.id.add_members_action);
        AnonymousClass1LV r1 = this.A07;
        if (r1 != null) {
            AnonymousClass00T r2 = this.A0F;
            AnonymousClass3QK A0L = C36421kH.A0L(r1, C36431kI.A0k(r2));
            GroupJid groupJid = null;
            if (A0L != null) {
                groupJid = A0L.A02;
            }
            if (!(!(groupJid instanceof AnonymousClass147) || groupJid == null || (linearLayout = this.A00) == null)) {
                AnonymousClass3YE.A00(linearLayout, this, groupJid, 19);
            }
            C20350xQ r02 = this.A0B;
            if (r02 != null) {
                String A1A = C36431kI.A1A(r2.getValue(), r02.A14);
                if (A1A == null) {
                    Log.i("CommunityAddMembersBottomSheet/invitelink/sendgetlink");
                    C20810yC r5 = this.A0A;
                    if (r5 != null) {
                        AnonymousClass17Y r4 = this.A06;
                        if (r4 != null) {
                            AnonymousClass19A r8 = this.A0D;
                            if (r8 != null) {
                                C27591Ow r7 = this.A0C;
                                if (r7 != null) {
                                    new C46332Wm(r4, r5, this, r7, r8, false).A07(C36431kI.A0k(r2));
                                    return;
                                }
                                throw C36331k8.A0d("mexGraphqlClient");
                            }
                            throw C36331k8.A0d("messageClient");
                        }
                        throw C36321k7.A06();
                    }
                    throw C36321k7.A07();
                }
                A03(A1A);
                return;
            }
            throw C36331k8.A0d("groupChatManager");
        }
        throw C36331k8.A0d("communityChatManager");
    }

    private final void A03(String str) {
        if (this.A0F != null) {
            this.A0E = AnonymousClass000.A0p("https://chat.whatsapp.com/", str, AnonymousClass000.A0u());
            TextView A0P = C36391kE.A0P(A0d(), R.id.link);
            this.A04 = A0P;
            if (A0P != null) {
                String str2 = this.A0E;
                if (str2 == null) {
                    throw C36331k8.A0d("linkUri");
                }
                A0P.setText(str2);
            }
            this.A01 = C36441kJ.A0U(A0d(), R.id.link_btn);
            int dimensionPixelSize = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
            LinearLayout linearLayout = this.A01;
            if (linearLayout != null) {
                linearLayout.setPadding(linearLayout.getPaddingLeft(), dimensionPixelSize, linearLayout.getPaddingRight(), dimensionPixelSize);
            }
            LinearLayout linearLayout2 = this.A01;
            if (linearLayout2 != null) {
                C48892iE.A00(linearLayout2, this, 43);
            }
            this.A05 = C36391kE.A0P(A0d(), R.id.share_link_action_item_text);
            String A0a = C36421kH.A0a(this, R.string.f12nameremoved);
            TextView textView = this.A05;
            if (textView != null) {
                C36381kD.A1E(textView, this, new Object[]{A0a}, R.string.f12nameremoved);
            }
            this.A02 = C36441kJ.A0U(A0d(), R.id.share_via_whatsapp_action);
            Object[] objArr = new Object[1];
            String str3 = this.A0E;
            if (str3 == null) {
                throw C36331k8.A0d("linkUri");
            }
            String A0q = C36401kF.A0q(this, str3, objArr, 0, R.string.f12nameremoved);
            AnonymousClass00C.A08(A0q);
            LinearLayout linearLayout3 = this.A02;
            if (linearLayout3 != null) {
                C36421kH.A14(linearLayout3, this, A0q, 8);
            }
        }
    }

    public void A1H() {
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            linearLayout.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
        this.A04 = null;
        LinearLayout linearLayout2 = this.A00;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener((View.OnClickListener) null);
        }
        this.A00 = null;
        this.A03 = null;
        LinearLayout linearLayout3 = this.A02;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener((View.OnClickListener) null);
        }
        this.A02 = null;
        this.A05 = null;
        super.A1H();
    }

    public void A1N(int i, int i2, Intent intent) {
        if ((i == 105 || i == 106) && i2 == -1) {
            A1b();
        }
    }

    public void BZi(String str, int i, boolean z) {
        StringBuilder A0u = AnonymousClass000.A0u();
        if (str != null) {
            C36321k7.A1Q("CommunityAddMembersBottomSheet/invitelink/gotcode/", str, A0u);
            C20350xQ r2 = this.A0B;
            if (r2 != null) {
                r2.A14.put(this.A0F.getValue(), str);
                A03(str);
                return;
            }
            throw C36331k8.A0d("groupChatManager");
        }
        C36321k7.A1T("CommunityAddMembersBottomSheet/invitelink/failed/", A0u, i);
        int A002 = C55862vJ.A00(i, true);
        AnonymousClass17Y r1 = this.A06;
        if (r1 != null) {
            r1.A04(A002, 0);
            return;
        }
        throw C36321k7.A06();
    }

    public void onCancel(DialogInterface dialogInterface) {
        A1b();
    }
}
