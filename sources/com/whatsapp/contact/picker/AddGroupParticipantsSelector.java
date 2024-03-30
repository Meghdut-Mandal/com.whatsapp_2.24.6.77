package com.whatsapp.contact.picker;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.AnonymousClass07B;
import X.AnonymousClass11F;
import X.AnonymousClass12O;
import X.AnonymousClass141;
import X.AnonymousClass144;
import X.AnonymousClass147;
import X.AnonymousClass17X;
import X.AnonymousClass1LV;
import X.AnonymousClass1N6;
import X.AnonymousClass22g;
import X.AnonymousClass27v;
import X.AnonymousClass313;
import X.AnonymousClass34G;
import X.AnonymousClass3C9;
import X.AnonymousClass3H3;
import X.AnonymousClass3HA;
import X.AnonymousClass3I5;
import X.AnonymousClass3SF;
import X.AnonymousClass4A0;
import X.AnonymousClass4A1;
import X.AnonymousClass4FU;
import X.AnonymousClass4FV;
import X.AnonymousClass4FW;
import X.AnonymousClass4HZ;
import X.AnonymousClass4U0;
import X.AnonymousClass6X6;
import X.C000800j;
import X.C001400p;
import X.C007103b;
import X.C023509x;
import X.C10810fG;
import X.C1503474x;
import X.C18800tq;
import X.C18830tt;
import X.C20350xQ;
import X.C20760y7;
import X.C21010yW;
import X.C220412q;
import X.C223313w;
import X.C232617u;
import X.C27111My;
import X.C27541Op;
import X.C28391Sm;
import X.C32681e1;
import X.C33311f5;
import X.C33521fV;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C39661tC;
import X.C43302Gi;
import X.C50952mu;
import X.C52022ol;
import X.C54252se;
import X.C57062xc;
import X.C62463Gg;
import X.C63153Iy;
import X.C80213v2;
import X.C80273v8;
import X.C835449u;
import X.C835549v;
import X.C835649w;
import X.C835749x;
import X.C835849y;
import X.C835949z;
import X.C85444Hc;
import X.C87854Qk;
import X.C89324Wc;
import X.C89584Xc;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AddGroupParticipantsSelector extends AnonymousClass27v implements AnonymousClass4U0 {
    public static final C63153Iy A0Y = new C63153Iy(new AnonymousClass34G(C52022ol.UNKNOWN, (String) null), (C223313w) null, false);
    public C57062xc A00;
    public AnonymousClass3C9 A01;
    public AnonymousClass1LV A02;
    public C28391Sm A03;
    public AnonymousClass3I5 A04;
    public AnonymousClass313 A05;
    public C220412q A06;
    public C232617u A07;
    public AnonymousClass17X A08;
    public AnonymousClass12O A09;
    public C21010yW A0A;
    public C20350xQ A0B;
    public C27541Op A0C;
    public AnonymousClass3HA A0D;
    public AnonymousClass1N6 A0E;
    public C32681e1 A0F;
    public Map A0G;
    public View A0H;
    public boolean A0I;
    public final Map A0J;
    public final Set A0K;
    public final AnonymousClass00T A0L;
    public final AnonymousClass00T A0M;
    public final AnonymousClass00T A0N;
    public final AnonymousClass00T A0O;
    public final AnonymousClass00T A0P;
    public final AnonymousClass00T A0Q;
    public final AnonymousClass00T A0R;
    public final AnonymousClass00T A0S;
    public final AnonymousClass00T A0T;
    public final AnonymousClass00T A0U;
    public final AnonymousClass00T A0V;
    public final AnonymousClass00T A0W;
    public final C87854Qk A0X;

    public static final void A0x(AddGroupParticipantsSelector addGroupParticipantsSelector, C62463Gg r7, AnonymousClass34G r8, AnonymousClass141 r9) {
        AnonymousClass34G r4 = r8;
        C52022ol r0 = r8.A00;
        C52022ol r3 = C52022ol.PUSH_NAME;
        AnonymousClass141 r5 = r9;
        if (r0 == r3) {
            r7.A02.A0I(addGroupParticipantsSelector.A0B.A0G(r3, r9, 7));
        }
        r7.A03.A04(r4, r5, addGroupParticipantsSelector.A0O, 7, r9.A0O());
    }

    public boolean A2g() {
        return true;
    }

    public void A3s(int i) {
    }

    public void A3v(C62463Gg r14, AnonymousClass141 r15) {
        boolean A0j;
        int i;
        C62463Gg r11 = r14;
        AnonymousClass00C.A0D(r14, 0);
        AnonymousClass141 r8 = r15;
        super.A3v(r14, r15);
        C10810fG r9 = new C10810fG();
        Map map = this.A0J;
        C63153Iy r0 = (C63153Iy) map.get(r15.A0H);
        if (r0 == null) {
            r0 = A0Y;
        }
        AnonymousClass34G r1 = r0.A00;
        r9.element = r1;
        C63153Iy r2 = A0Y;
        if (AnonymousClass00C.A0J(r1, r2.A00)) {
            this.A04.Boy(new C1503474x((Object) r8, (Object) r9, (Object) this, (Object) r11, 29));
        } else {
            A0x(this, r14, (AnonymousClass34G) r9.element, r15);
        }
        AnonymousClass00T r6 = this.A0T;
        if (!C36331k8.A1b(r6) || A0z(this)) {
            A0j = C007103b.A0j(this.A0K, C36431kI.A0h(r15));
        } else {
            C63153Iy r02 = (C63153Iy) map.get(r15.A0H);
            if (r02 == null) {
                r02 = r2;
            }
            C223313w r12 = r02.A01;
            A0j = true;
            if (r12 == null || !this.A0K.contains(r12)) {
                A0j = false;
            }
        }
        C63153Iy r03 = (C63153Iy) map.get(r15.A0H);
        if (r03 == null) {
            r03 = r2;
        }
        boolean z = r03.A02;
        View view = r14.A00;
        C33521fV.A01(view);
        if (A0j || z) {
            boolean A1b = C36331k8.A1b(r6);
            TextEmojiLabel textEmojiLabel = r14.A02;
            if (A1b) {
                i = R.string.f12nameremoved;
            } else {
                i = R.string.f12nameremoved;
            }
            if (!A0j) {
                i = R.string.f12nameremoved;
            }
            textEmojiLabel.setText(i);
            r14.A01.setEnabled(false);
            textEmojiLabel.A0B();
            textEmojiLabel.setVisibility(0);
            AnonymousClass3SF r22 = r14.A03;
            r22.A01.setTextColor(AnonymousClass00F.A00(this, R.color.f6nameremoved));
            if (A0j) {
                view.setOnClickListener((View.OnClickListener) null);
                view.setClickable(false);
                view.setFocusable(true);
                return;
            }
            return;
        }
        r14.A02.A0C();
        AnonymousClass3SF r23 = r14.A03;
        r23.A01.setTextColor(C36351kA.A01(this, R.attr.f4nameremoved, R.color.f6nameremoved));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        if (A0z(r8) != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A42(java.util.ArrayList r9) {
        /*
            r8 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            X.00T r0 = r8.A0Q
            X.147 r5 = X.C36431kI.A0k(r0)
            if (r5 == 0) goto L_0x0098
            X.00T r0 = r8.A0N
            java.lang.Object r4 = r0.getValue()
            X.314 r4 = (X.AnonymousClass314) r4
            androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = X.C33311f5.A00(r8)
            r3 = 5
            X.02h r2 = r0.A01     // Catch:{ CancellationException -> 0x0028 }
            r1 = 0
            com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$3 r0 = new com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$3     // Catch:{ CancellationException -> 0x0028 }
            r0.<init>(r4, r5, r1, r3)     // Catch:{ CancellationException -> 0x0028 }
            java.lang.Object r1 = X.C110515an.A00(r2, r0)     // Catch:{ CancellationException -> 0x0028 }
            X.3I5 r1 = (X.AnonymousClass3I5) r1     // Catch:{ CancellationException -> 0x0028 }
            goto L_0x0035
        L_0x0028:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.00f r0 = X.C000400e.A0D()
            X.3I5 r1 = new X.3I5
            r1.<init>(r0)
        L_0x0035:
            r8.A04 = r1
            X.00T r0 = r1.A01
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            r9.addAll(r0)
            java.util.Iterator r7 = r9.iterator()
        L_0x0046:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0098
            X.141 r6 = X.C36391kE.A0f(r7)
            X.11F r5 = r6.A0H
            if (r5 == 0) goto L_0x0046
            X.171 r1 = r8.A0B
            r0 = 7
            X.34G r4 = r1.A0C(r6, r0)
            X.00T r0 = r8.A0T
            boolean r0 = X.C36331k8.A1b(r0)
            if (r0 == 0) goto L_0x006a
            boolean r1 = A0z(r8)
            r0 = 1
            if (r1 == 0) goto L_0x006b
        L_0x006a:
            r0 = 0
        L_0x006b:
            r3 = 0
            if (r0 == 0) goto L_0x0080
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r0 = com.whatsapp.jid.PhoneUserJid.class
            com.whatsapp.jid.Jid r1 = r6.A06(r0)
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1
            if (r1 == 0) goto L_0x0080
            X.12O r0 = r8.A09
            if (r0 == 0) goto L_0x0091
            X.13w r3 = r0.A09(r1)
        L_0x0080:
            java.util.Map r2 = r8.A0J
            X.1NG r0 = r8.A06
            boolean r1 = X.C36331k8.A1Y(r0, r6)
            X.3Iy r0 = new X.3Iy
            r0.<init>(r4, r3, r1)
            r2.put(r5, r0)
            goto L_0x0046
        L_0x0091:
            java.lang.String r0 = "jidMapRepository"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.AddGroupParticipantsSelector.A42(java.util.ArrayList):void");
    }

    public void A44(List list) {
        AnonymousClass00C.A0D(list, 0);
        String str = this.A0N;
        if (!(str == null || str.length() == 0 || !list.isEmpty())) {
            A43(list);
        }
        super.A44(list);
    }

    public void A47(List list) {
        if (A0z(this)) {
            boolean z = true;
            if (this.A0H == null) {
                AnonymousClass00T r4 = this.A0R;
                this.A0H = C36401kF.A0F(r4);
                ViewGroup A0E2 = C36421kH.A0E(this, R.id.search_no_matches_container);
                if (A0E2 != null) {
                    A0E2.addView(C36401kF.A0F(this.A0S));
                }
                this.A02.addFooterView(C36401kF.A0F(r4), (Object) null, true);
            }
            String str = this.A0N;
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            if (z || !list.isEmpty()) {
                C36341k9.A1R(this.A0R, 0);
                C36341k9.A1R(this.A0S, 8);
            } else {
                C36341k9.A1R(this.A0R, 8);
                C36341k9.A1R(this.A0S, 0);
            }
        }
        super.A47(list);
    }

    public void B2c(AnonymousClass141 r3) {
        AnonymousClass00C.A0D(r3, 0);
        if (!C007103b.A0j(this.A0K, C36431kI.A0h(r3))) {
            super.B2c(r3);
        }
    }

    public void BSF(String str) {
    }

    public /* synthetic */ void BT1(int i) {
    }

    public static final void A0w(TextEmojiLabel textEmojiLabel, AddGroupParticipantsSelector addGroupParticipantsSelector, AnonymousClass147 r9) {
        int i;
        AnonymousClass141 A092 = addGroupParticipantsSelector.A09.A04.A09(r9);
        if (A092 != null) {
            if (A092.A04 == 1) {
                if (C36331k8.A1b(addGroupParticipantsSelector.A0U)) {
                    AnonymousClass00T r2 = addGroupParticipantsSelector.A0L;
                    AnonymousClass3H3 r0 = (AnonymousClass3H3) r2.getValue();
                    if (r0 != null && r0.A05.A0E(7608)) {
                        AnonymousClass3H3 r22 = (AnonymousClass3H3) r2.getValue();
                        Boolean bool = null;
                        if (r22 != null && r22.A05.A0E(7608)) {
                            bool = C36441kJ.A0x(r22.A00());
                        }
                        if (!A0z(addGroupParticipantsSelector)) {
                            C20350xQ r1 = addGroupParticipantsSelector.A0B;
                            if (r1 != null) {
                                int A0O2 = r1.A0O((GroupJid) addGroupParticipantsSelector.A0Q.getValue());
                                if (C36371kC.A1X(bool, true) && A0O2 == 4) {
                                    i = R.string.f12nameremoved;
                                } else if (AnonymousClass00C.A0J(bool, false) && A0O2 == 4) {
                                    i = R.string.f12nameremoved;
                                } else if (AnonymousClass00C.A0J(bool, false) && A0O2 == 1) {
                                    i = R.string.f12nameremoved;
                                } else {
                                    return;
                                }
                            } else {
                                throw C36331k8.A0d("groupChatManager");
                            }
                        } else if (C36371kC.A1X(bool, true)) {
                            i = R.string.f12nameremoved;
                        } else if (C36371kC.A1X(bool, false)) {
                            i = R.string.f12nameremoved;
                        } else {
                            return;
                        }
                    }
                }
                boolean A0z = A0z(addGroupParticipantsSelector);
                i = R.string.f12nameremoved;
                if (A0z) {
                    i = R.string.f12nameremoved;
                }
            } else {
                i = R.string.f12nameremoved;
            }
            String string = addGroupParticipantsSelector.getString(i);
            if (string != null) {
                C32681e1 r12 = addGroupParticipantsSelector.A0F;
                if (r12 != null) {
                    textEmojiLabel.setText(r12.A03(textEmojiLabel.getContext(), new C80273v8(addGroupParticipantsSelector, r9, 6), string, "edit_group_permissions", C36381kD.A01(textEmojiLabel.getContext())));
                    return;
                }
                throw C36331k8.A0b();
            }
        }
    }

    public static final boolean A0z(AddGroupParticipantsSelector addGroupParticipantsSelector) {
        GroupJid groupJid = (GroupJid) addGroupParticipantsSelector.A0Q.getValue();
        if (groupJid == null) {
            return false;
        }
        AnonymousClass17X r0 = addGroupParticipantsSelector.A08;
        if (r0 == null) {
            throw C36331k8.A0d("groupParticipantsManager");
        } else if (r0.A0D(groupJid)) {
            return true;
        } else {
            return false;
        }
    }

    public void A2F() {
        if (!this.A0I) {
            this.A0I = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C36321k7.A0c(r1, this);
            C18830tt r3 = r1.A00;
            C36321k7.A0X(r1, r3, this, C36321k7.A05(r1, r3, this));
            AnonymousClass22g.A0l(this);
            AnonymousClass22g.A0h(r1, r3, this);
            AnonymousClass22g.A0L(A0L2, r1, this);
            this.A0F = C36351kA.A0p(r3);
            this.A06 = C36351kA.A0a(r1);
            this.A0A = C36351kA.A0g(r1);
            this.A09 = C36411kG.A0d(r1);
            this.A00 = (C57062xc) A0L2.A0p.get();
            this.A0B = C36361kB.A0a(r1);
            this.A0G = C27111My.A01(A0L2);
            this.A02 = C36361kB.A0U(r1);
            this.A0E = C36361kB.A0e(r1);
            this.A03 = C18800tq.A4s(r1);
            this.A05 = (AnonymousClass313) r3.A7m.get();
            this.A07 = (C232617u) r1.A3u.get();
            this.A0D = C27111My.A2H(A0L2);
            this.A0C = C36381kD.A0c(r1);
            this.A08 = C36351kA.A0b(r1);
            this.A01 = (AnonymousClass3C9) r1.ALS.get();
        }
    }

    public void A2X() {
        if (this.A0D.A0E(7492)) {
            AnonymousClass1N6 r2 = this.A0E;
            if (r2 != null) {
                r2.A03(C36421kH.A0O(this.A0Q), 90);
            } else {
                throw C36331k8.A0d("navigationTimeSpentManager");
            }
        }
        super.A2X();
    }

    public void A46(List list) {
        String str = this.A0N;
        if (!(str == null || str.length() == 0 || !C36401kF.A1a(list))) {
            list.add(new C43302Gi(C36361kB.A0m(this, R.string.f12nameremoved)));
        }
        super.A46(list);
        A47(list);
    }

    public void BWL(int i, String str) {
        AnonymousClass11F A0O2 = C36421kH.A0O(this.A0Q);
        if (A0O2 != null) {
            AnonymousClass3HA r0 = this.A0D;
            if (r0 != null) {
                r0.A01(this, A0O2, str);
                return;
            }
            throw C36331k8.A0d("groupInviteClickUtils");
        }
    }

    public AddGroupParticipantsSelector(int i) {
        this.A0I = false;
        C89324Wc.A00(this, 28);
    }

    public void onCreate(Bundle bundle) {
        Map map;
        super.onCreate(bundle);
        AnonymousClass144 r1 = (AnonymousClass144) this.A0Q.getValue();
        if (r1 != null) {
            C232617u r0 = this.A07;
            if (r0 != null) {
                AnonymousClass6X6 A092 = r0.A09(r1);
                if (A092 != null) {
                    if (!C36331k8.A1b(this.A0T) || A0z(this)) {
                        map = A092.A08;
                    } else {
                        map = A092.A07;
                    }
                    C20760y7 copyOf = C20760y7.copyOf((Collection) map.keySet());
                    AnonymousClass00C.A0B(copyOf);
                    this.A0K.addAll(copyOf);
                }
                C27541Op r12 = this.A0C;
                if (r12 != null) {
                    r12.A00(this.A0X);
                } else {
                    throw C36331k8.A0d("groupDataChangeListeners");
                }
            } else {
                throw C36331k8.A0d("groupParticipantCache");
            }
        }
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0I(A3j());
        }
        Bx9();
        WDSSearchBar wDSSearchBar = this.A0M;
        if (wDSSearchBar != null) {
            wDSSearchBar.A07.setTrailingButtonIcon(C50952mu.A00);
            wDSSearchBar.A07.setHint((int) R.string.f12nameremoved);
        }
        if (this.A0D.A0E(6356)) {
            C80213v2.A01(this.A04, this, 41);
        }
        C36331k8.A1T(new AddGroupParticipantsSelector$onCreate$4(this, (C023509x) null), C33311f5.A00(this));
    }

    public void onDestroy() {
        super.onDestroy();
        C27541Op r1 = this.A0C;
        if (r1 != null) {
            r1.A01(this.A0X);
            return;
        }
        throw C36331k8.A0d("groupDataChangeListeners");
    }

    public AddGroupParticipantsSelector() {
        this(0);
        this.A0K = C36441kJ.A17();
        this.A0J = C36431kI.A1G();
        this.A0L = C36431kI.A1I(new C835449u(this));
        this.A0U = C36431kI.A1I(new C835949z(this));
        this.A0O = C36431kI.A1I(new C835649w(this));
        C000800j r2 = C000800j.PUBLICATION;
        this.A0Q = C001400p.A00(r2, new AnonymousClass4FU(this));
        this.A0M = C001400p.A00(r2, new C85444Hc(this));
        this.A0T = C001400p.A00(r2, new AnonymousClass4HZ(this));
        this.A0P = C54252se.A00(this, "entry_point", 6);
        this.A0V = C001400p.A00(r2, new AnonymousClass4FV(this));
        this.A0N = C36431kI.A1I(new C835549v(this));
        this.A0S = C36431kI.A1I(new C835849y(this));
        this.A0R = C36431kI.A1I(new C835749x(this));
        this.A0X = new C89584Xc(this, 7);
        this.A0W = C36441kJ.A0a(new AnonymousClass4A0(this), new AnonymousClass4A1(this), new AnonymousClass4FW(this), C36441kJ.A1A(C39661tC.class));
    }
}
