package com.whatsapp.invites;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1RY;
import X.AnonymousClass3Y3;
import X.AnonymousClass3YL;
import X.C012005e;
import X.C18740tg;
import X.C18820ts;
import X.C19730wQ;
import X.C19770wU;
import X.C220412q;
import X.C27731Pn;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C40681vw;
import X.C65383Rv;
import X.C80253v6;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

public final class SMSPreviewInviteBottomSheetFragment extends Hilt_SMSPreviewInviteBottomSheetFragment {
    public AnonymousClass17Y A00;
    public C19730wQ A01;
    public AnonymousClass16D A02;
    public AnonymousClass171 A03;
    public C27731Pn A04;
    public C65383Rv A05;
    public C18820ts A06;
    public C220412q A07;
    public C40681vw A08;
    public AnonymousClass19A A09;
    public C19770wU A0A;
    public boolean A0B = true;
    public boolean A0C;
    public AnonymousClass1RY A0D;
    public final ArrayList A0E = AnonymousClass001.A0I();
    public final ArrayList A0F = AnonymousClass001.A0I();

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        int i;
        String A0n;
        String str;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        View A0G = C36361kB.A0G(view, R.id.container);
        C27731Pn r3 = this.A04;
        if (r3 != null) {
            this.A0D = r3.A05(A0i(), "hybrid-invite-group-participants-activity");
            Bundle A0b = A0b();
            Iterator it = C36431kI.A1F(A0b, UserJid.class, "sms_invites_jids").iterator();
            while (it.hasNext()) {
                this.A0F.add(it.next());
            }
            this.A0B = A0b.getBoolean("all_participants_non_wa_in_request", true);
            TextView A0M = C36341k9.A0M(A0G, R.id.send_invite_title);
            Resources A0G2 = C36341k9.A0G(this);
            ArrayList arrayList = this.A0F;
            String quantityString = A0G2.getQuantityString(R.plurals.f10nameremoved, arrayList.size());
            AnonymousClass00C.A08(quantityString);
            A0M.setText(quantityString);
            AnonymousClass147 A062 = AnonymousClass147.A01.A06(A0b.getString("group_jid"));
            C18740tg.A06(A062);
            AnonymousClass00C.A08(A062);
            TextView A0M2 = C36341k9.A0M(A0G, R.id.send_invite_subtitle);
            if (arrayList.size() == 1) {
                boolean A032 = A03(this, A062);
                int i2 = R.string.f12nameremoved;
                if (A032) {
                    i2 = R.string.f12nameremoved;
                }
                Object[] objArr = new Object[1];
                AnonymousClass16D r1 = this.A02;
                if (r1 != null) {
                    AnonymousClass141 A082 = r1.A08((AnonymousClass11F) arrayList.get(0));
                    if (A082 == null || (str = A082.A0J()) == null) {
                        str = "";
                    }
                    A0n = C36401kF.A0q(this, str, objArr, 0, i2);
                } else {
                    throw C36331k8.A0Z();
                }
            } else {
                if (this.A0B || arrayList.size() <= 1) {
                    boolean A033 = A03(this, A062);
                    i = R.string.f12nameremoved;
                    if (A033) {
                        i = R.string.f12nameremoved;
                    }
                } else {
                    boolean A034 = A03(this, A062);
                    i = R.string.f12nameremoved;
                    if (A034) {
                        i = R.string.f12nameremoved;
                    }
                }
                A0n = A0n(i);
            }
            AnonymousClass00C.A08(A0n);
            A0M2.setText(A0n);
            RecyclerView recyclerView = (RecyclerView) C36361kB.A0G(A0G, R.id.invite_contacts_recycler);
            LinearLayoutManager A0T = C36431kI.A0T();
            A0T.A1f(0);
            recyclerView.setLayoutManager(A0T);
            Context A0a = A0a();
            C220412q r11 = this.A07;
            if (r11 != null) {
                LayoutInflater from = LayoutInflater.from(A0h());
                AnonymousClass00C.A08(from);
                AnonymousClass171 r8 = this.A03;
                if (r8 != null) {
                    C18820ts r10 = this.A06;
                    if (r10 != null) {
                        AnonymousClass1RY r9 = this.A0D;
                        if (r9 == null) {
                            throw C36331k8.A0d("contactPhotoLoader");
                        }
                        C40681vw r5 = new C40681vw(A0a, from, r8, r9, r10, r11);
                        this.A08 = r5;
                        recyclerView.setAdapter(r5);
                        C19770wU r52 = this.A0A;
                        if (r52 != null) {
                            r52.Bp1(new C80253v6(this, 39));
                            AnonymousClass3Y3.A00(C012005e.A02(A0G, R.id.btn_not_now), this, 40);
                            C012005e.A02(A0G, R.id.btn_send_invites).setOnClickListener(new AnonymousClass3YL(this, A0b.getInt("invite_trigger_source"), 12, A062));
                            return;
                        }
                        throw C36321k7.A08();
                    }
                    throw C36321k7.A09();
                }
                throw C36331k8.A0c();
            }
            throw C36331k8.A0d("chatsCache");
        }
        throw C36331k8.A0d("contactPhotos");
    }

    public static final boolean A03(SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment, AnonymousClass147 r2) {
        C220412q r0 = sMSPreviewInviteBottomSheetFragment.A07;
        if (r0 != null) {
            int A052 = r0.A05(r2);
            if (A052 == 1 || A052 == 3) {
                return true;
            }
            return false;
        }
        throw C36331k8.A0d("chatsCache");
    }

    public void A19() {
        super.A19();
        if (!this.A0C) {
            String A0a = C36421kH.A0a(this, R.string.f12nameremoved);
            AnonymousClass17Y r1 = this.A00;
            if (r1 != null) {
                r1.A0F(A0a, 0);
            } else {
                throw C36321k7.A06();
            }
        }
        AnonymousClass01I A0h = A0h();
        if (A0h != null && !A0h.isFinishing()) {
            A0h.finish();
        }
    }

    public void A1H() {
        super.A1H();
        AnonymousClass1RY r1 = this.A0D;
        if (r1 == null) {
            throw C36331k8.A0d("contactPhotoLoader");
        }
        r1.A02();
    }
}
