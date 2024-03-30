package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass03S;
import X.AnonymousClass07B;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass144;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1C4;
import X.AnonymousClass1LV;
import X.AnonymousClass22g;
import X.AnonymousClass27v;
import X.AnonymousClass35K;
import X.AnonymousClass3KN;
import X.AnonymousClass3M0;
import X.AnonymousClass49N;
import X.AnonymousClass4U0;
import X.C13540k2;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C19600wD;
import X.C20350xQ;
import X.C20510xg;
import X.C20810yC;
import X.C21100yf;
import X.C220412q;
import X.C24381Cf;
import X.C27111My;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C43302Gi;
import X.C54482t1;
import X.C62463Gg;
import X.C63433Ka;
import X.C65533Sl;
import X.C75133mj;
import X.C81093wS;
import X.C88504Sy;
import X.C89324Wc;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.SortedSet;

public final class LinkExistingGroups extends AnonymousClass27v implements AnonymousClass4U0, C88504Sy {
    public View A00;
    public C19460v5 A01;
    public AnonymousClass1LV A02;
    public MemberSuggestedGroupsManager A03;
    public C220412q A04;
    public C24381Cf A05;
    public AnonymousClass17X A06;
    public C20350xQ A07;
    public C20510xg A08;
    public AnonymousClass190 A09;
    public AnonymousClass147 A0A;
    public AnonymousClass1C4 A0B;
    public C32681e1 A0C;
    public SortedSet A0D;
    public boolean A0E;
    public AnonymousClass147 A0F;
    public boolean A0G;
    public final AnonymousClass00T A0H;

    public void A3w(C62463Gg r8, AnonymousClass141 r9) {
        SortedSet<AnonymousClass3KN> sortedSet;
        TextEmojiLabel textEmojiLabel = r8.A02;
        textEmojiLabel.setSingleLine(false);
        textEmojiLabel.setMaxLines(2);
        AnonymousClass35K r4 = r9.A0J;
        if (r4 == null || !r9.A0G()) {
            super.A3w(r8, r9);
            return;
        }
        int i = r4.A00;
        String str = null;
        if (i == 0) {
            Jid A062 = r9.A06(AnonymousClass147.class);
            if (A062 != null && C36331k8.A1b(this.A0H) && (sortedSet = this.A0D) != null && (!(sortedSet instanceof Collection) || !sortedSet.isEmpty())) {
                for (AnonymousClass3KN r0 : sortedSet) {
                    if (AnonymousClass00C.A0J(r0.A02, A062)) {
                        r8.A00(C36361kB.A0m(this, R.string.f12nameremoved), false);
                        return;
                    }
                }
            }
            textEmojiLabel.setVisibility(0);
            Jid A063 = r9.A06(AnonymousClass144.class);
            if (A063 != null) {
                str = (String) this.A0B.A08.get(A063);
            }
            textEmojiLabel.A0I(str);
            r8.A01(r9.A0x);
        } else if (i == 2 || i == 6) {
            AnonymousClass147 r42 = r4.A01;
            if (r42 != null) {
                Object[] objArr = new Object[1];
                C36371kC.A1K(this.A0B, this.A09.A0D(r42), objArr, 0);
                str = getString(R.string.f12nameremoved, objArr);
            }
            r8.A00(str, false);
        }
    }

    public void A45(List list) {
        AnonymousClass00C.A0D(list, 0);
        if (list.isEmpty()) {
            setResult(-10);
            finish();
            return;
        }
        super.A45(list);
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass35K r0 = C36391kE.A0f(it).A0J;
                if (r0 != null && r0.A00 == 0) {
                    break;
                }
            }
        }
        z = false;
        this.A0E = z;
        if (!z) {
            WaTextView A0Q = C36401kF.A0Q(A3m(), R.id.disclaimer_warning_text);
            C32681e1 r2 = this.A0C;
            if (r2 != null) {
                A0Q.setText(r2.A03(A0Q.getContext(), new C81093wS((Object) this, 14), getString(R.string.f12nameremoved), "create_new_group", C36381kD.A01(A0Q.getContext())));
                C36331k8.A10(A0Q, A0Q.getAbProps());
                return;
            }
            throw C36331k8.A0b();
        }
    }

    public void A46(List list) {
        C13540k2 r2 = new C13540k2();
        r2.add(0, new C43302Gi(C36361kB.A0m(this, R.string.f12nameremoved)));
        r2.addAll(list);
        super.A46(AnonymousClass03S.A00(r2));
    }

    public void B2c(AnonymousClass141 r3) {
        AnonymousClass00C.A0D(r3, 0);
        C20810yC r0 = this.A0D;
        AnonymousClass00C.A07(r0);
        if (AnonymousClass3M0.A00(r3, r0)) {
            Jid A062 = r3.A06(AnonymousClass147.class);
            Objects.requireNonNull(A062);
            this.A0F = (AnonymousClass147) A062;
            C54482t1.A00(this, 1, R.string.f12nameremoved);
            return;
        }
        this.A0F = null;
        super.B2c(r3);
    }

    public void BSF(String str) {
    }

    public void BT0() {
    }

    public /* synthetic */ void BT1(int i) {
    }

    public static final List A0w(LinkExistingGroups linkExistingGroups) {
        List unmodifiableList = Collections.unmodifiableList(linkExistingGroups.A0c);
        ArrayList A13 = C36411kG.A13(unmodifiableList);
        Iterator it = unmodifiableList.iterator();
        while (it.hasNext()) {
            AnonymousClass141 A0f = C36391kE.A0f(it);
            C65533Sl r0 = AnonymousClass147.A01;
            AnonymousClass147 A032 = C65533Sl.A03(A0f.A0H);
            if (A032 != null) {
                A13.add(A032);
            }
        }
        return A13;
    }

    public void A2F() {
        if (!this.A0G) {
            this.A0G = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            AnonymousClass22g.A0l(this);
            AnonymousClass22g.A0h(r2, r1, this);
            AnonymousClass22g.A0L(A0L, r2, this);
            this.A0C = C36351kA.A0p(r1);
            this.A09 = C36351kA.A0h(r2);
            this.A04 = C36351kA.A0a(r2);
            this.A01 = C19470v6.A00;
            this.A0B = C36421kH.A0Q(r2);
            this.A07 = C36361kB.A0a(r2);
            this.A08 = C36431kI.A0e(r2);
            this.A02 = C36361kB.A0U(r2);
            this.A05 = C36371kC.A0Y(r2);
            this.A06 = C36351kA.A0b(r2);
            this.A03 = (MemberSuggestedGroupsManager) r2.A4q.get();
        }
    }

    public void BWL(int i, String str) {
        AnonymousClass147 r12 = this.A0F;
        if (r12 != null) {
            AnonymousClass141 A0D2 = this.A09.A0D(r12);
            C20810yC r14 = this.A0D;
            AnonymousClass00C.A07(r14);
            AnonymousClass17Y r10 = this.A05;
            AnonymousClass00C.A07(r10);
            AnonymousClass1C4 r9 = this.A0B;
            if (r9 != null) {
                C21100yf r8 = this.A06;
                AnonymousClass00C.A07(r8);
                C18820ts r7 = this.A0I;
                AnonymousClass00C.A07(r7);
                AnonymousClass171 r6 = this.A0B;
                AnonymousClass00C.A07(r6);
                AnonymousClass16D r5 = this.A09;
                AnonymousClass00C.A07(r5);
                C20350xQ r4 = this.A07;
                if (r4 != null) {
                    C20510xg r3 = this.A08;
                    if (r3 != null) {
                        C19600wD r2 = this.A07;
                        AnonymousClass00C.A07(r2);
                        C24381Cf r1 = this.A05;
                        if (r1 != null) {
                            AnonymousClass17X r0 = this.A06;
                            if (r0 != null) {
                                C20350xQ r27 = r4;
                                C20810yC r26 = r14;
                                AnonymousClass17X r25 = r0;
                                C24381Cf r24 = r1;
                                C18820ts r23 = r7;
                                AnonymousClass171 r22 = r6;
                                AnonymousClass16D r21 = r5;
                                C19600wD r20 = r2;
                                C21100yf r19 = r8;
                                AnonymousClass17Y r18 = r10;
                                C63433Ka r15 = new C63433Ka((View) null, this, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r3, r12, r9);
                                r15.A00 = new C75133mj(this, A0D2, r12);
                                r15.A00(str);
                                return;
                            }
                            throw C36331k8.A0d("groupParticipantsManager");
                        }
                        throw C36331k8.A0d("conversationObservers");
                    }
                    throw C36331k8.A0d("groupXmppMethods");
                }
                throw C36331k8.A0d("groupChatManager");
            }
            throw C36331k8.A0d("sendMethods");
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 150) {
            if (i != 1007) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 == -1) {
                BUG();
            }
        } else if (i2 != -1) {
            Log.i("LinkExistingGroups/permissions denied");
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        this.A0A = AnonymousClass147.A01.A06(getIntent().getStringExtra("parent_group_jid"));
        super.onCreate(bundle);
        if (bundle == null && !this.A08.A00()) {
            AnonymousClass22g.A0k(this, R.string.f12nameremoved, R.string.f12nameremoved);
        }
        if (C36331k8.A1b(this.A0H)) {
            C81093wS.A01(this.A04, this, 15);
        }
    }

    public LinkExistingGroups(int i) {
        this.A0G = false;
        C89324Wc.A00(this, 10);
    }

    public void A3s(int i) {
        String A0L;
        if (getSupportActionBar() == null) {
            Log.e("LinkExistingGroups/updateTitle/getSupportActionBar is null");
            return;
        }
        int A3k = A3k();
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            if (A3k == Integer.MAX_VALUE) {
                A0L = C36331k8.A0g(this.A0I, i, 0, R.plurals.f10nameremoved);
            } else {
                Object[] A0M = AnonymousClass001.A0M();
                C36331k8.A1X(A0M, i, 0, A3k, 1);
                A0L = this.A0I.A0L(A0M, R.plurals.f10nameremoved, (long) i);
            }
            supportActionBar.A0P(A0L);
        }
    }

    public void BUG() {
        Intent A0D2 = C36431kI.A0D();
        A0D2.putStringArrayListExtra("selected_jids", AnonymousClass143.A07(A0w(this)));
        A0D2.putExtra("is_suggest_mode", C36331k8.A1b(this.A0H));
        C36331k8.A0o(this, A0D2);
    }

    public LinkExistingGroups() {
        this(0);
        this.A0H = C36431kI.A1I(new AnonymousClass49N(this));
    }
}
