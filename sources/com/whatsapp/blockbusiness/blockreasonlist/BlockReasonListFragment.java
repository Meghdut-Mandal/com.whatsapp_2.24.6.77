package com.whatsapp.blockbusiness.blockreasonlist;

import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass098;
import X.AnonymousClass0I2;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1H2;
import X.AnonymousClass1N0;
import X.AnonymousClass1NG;
import X.AnonymousClass3M3;
import X.AnonymousClass3PR;
import X.AnonymousClass6B6;
import X.AnonymousClass7U6;
import X.AnonymousClass7U7;
import X.AnonymousClass9v1;
import X.C007103b;
import X.C012005e;
import X.C1501874h;
import X.C1502274l;
import X.C152187Jn;
import X.C163187pn;
import X.C165147sx;
import X.C19770wU;
import X.C19890wg;
import X.C20500xf;
import X.C20810yC;
import X.C21060yb;
import X.C222813r;
import X.C225314u;
import X.C32681e1;
import X.C33751fs;
import X.C35351iY;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C44122Lf;
import X.C50102kD;
import X.C51092nG;
import X.C90514aH;
import X.C96054mi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.FAQTextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

public final class BlockReasonListFragment extends Hilt_BlockReasonListFragment {
    public CheckBox A00;
    public RecyclerView A01;
    public AnonymousClass17Y A02;
    public C96054mi A03;
    public AnonymousClass16D A04;
    public AnonymousClass171 A05;
    public C33751fs A06;
    public C21060yb A07;
    public AnonymousClass1N0 A08;
    public AnonymousClass1H2 A09;
    public C20500xf A0A;
    public C19890wg A0B;
    public C32681e1 A0C;
    public C19770wU A0D;
    public WDSButton A0E;
    public boolean A0F;
    public Runnable A0G;
    public final AnonymousClass00T A0H = C36431kI.A1I(new C152187Jn(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass171 r0;
        String A0R;
        String A0q;
        AnonymousClass00C.A0D(layoutInflater, 0);
        String A0x = C36411kG.A0x(this);
        if (A0x != null) {
            boolean z = this.A0F;
            int i = R.layout.f9nameremoved;
            if (z) {
                i = R.layout.f9nameremoved;
            }
            View A0Q = C90514aH.A0Q(layoutInflater, viewGroup, i);
            View findViewById = A0Q.findViewById(R.id.block_reason_list);
            RecyclerView recyclerView = (RecyclerView) findViewById;
            recyclerView.getContext();
            C36351kA.A1F(recyclerView, 1);
            if (!this.A0F) {
                AnonymousClass0I2 r2 = new AnonymousClass0I2(recyclerView.getContext());
                Drawable A002 = AnonymousClass00E.A00(recyclerView.getContext(), R.drawable.block_business_divider_gray);
                if (A002 != null) {
                    r2.A00 = A002;
                }
                recyclerView.A0t(r2);
            }
            recyclerView.A0U = true;
            AnonymousClass00C.A08(findViewById);
            this.A01 = recyclerView;
            C012005e.A0a(A0Q.findViewById(R.id.reason_for_blocking), true);
            C222813r r02 = UserJid.Companion;
            UserJid A012 = C222813r.A01(A0x);
            AnonymousClass16D r03 = this.A04;
            if (r03 != null) {
                AnonymousClass141 A0D2 = r03.A0D(A012);
                C20500xf r04 = this.A0A;
                if (r04 != null) {
                    if (AnonymousClass3M3.A01(r04, A012)) {
                        Context A0a = A0a();
                        String str = C44122Lf.A02;
                        if (str == null) {
                            str = A0a.getString(R.string.f12nameremoved);
                            C44122Lf.A02 = str;
                        }
                        A0q = C36401kF.A0q(this, str, C36411kG.A1b(str), 1, R.string.f12nameremoved);
                    } else {
                        boolean z2 = this.A0F;
                        int i2 = R.string.f12nameremoved;
                        if (z2) {
                            i2 = R.string.f12nameremoved;
                        }
                        Object[] objArr = new Object[1];
                        if (A0D2.A0F()) {
                            A0R = A0D2.A0K();
                            if (A0D2.A08 == 1) {
                                AnonymousClass171 r1 = this.A05;
                                if (r1 != null) {
                                    A0R = AnonymousClass171.A03(r1, A0D2, R.string.f12nameremoved);
                                } else {
                                    throw C36331k8.A0d("waContactNames");
                                }
                            }
                            if (A0R == null || A0R.length() <= 0) {
                                r0 = this.A05;
                                if (r0 == null) {
                                    throw C36331k8.A0d("waContactNames");
                                }
                                A0R = r0.A0R(A0D2, -1, true);
                            }
                        } else {
                            r0 = this.A05;
                            if (r0 == null) {
                                throw C36331k8.A0d("waContactNames");
                            }
                            A0R = r0.A0R(A0D2, -1, true);
                        }
                        A0q = C36401kF.A0q(this, A0R, objArr, 0, i2);
                    }
                    AnonymousClass00C.A0B(A0q);
                    FAQTextView fAQTextView = (FAQTextView) A0Q.findViewById(R.id.blocking_info);
                    if (this.A0F) {
                        fAQTextView.setText(A0q);
                    } else {
                        fAQTextView.setEducationTextFromNamedArticle(C36441kJ.A0O(A0q), "chats", "controls-when-messaging-businesses");
                    }
                    this.A00 = (CheckBox) C36361kB.A0F(A0Q, R.id.report_biz_checkbox);
                    UserJid A013 = C222813r.A01(A0x);
                    C20500xf r05 = this.A0A;
                    if (r05 != null) {
                        if (!AnonymousClass3M3.A01(r05, A013) && A0b().getBoolean("show_report_upsell")) {
                            C36341k9.A10(A0Q, R.id.report_biz_setting, 0);
                        }
                        WDSButton wDSButton = (WDSButton) C36361kB.A0F(A0Q, R.id.block_button);
                        this.A0E = wDSButton;
                        if (wDSButton == null) {
                            throw C36331k8.A0d("blockButton");
                        }
                        wDSButton.setOnClickListener(new AnonymousClass9v1(4, A0x, this));
                        WDSButton wDSButton2 = this.A0E;
                        if (wDSButton2 == null) {
                            throw C36331k8.A0d("blockButton");
                        }
                        C20500xf r12 = this.A0A;
                        if (r12 != null) {
                            wDSButton2.setEnabled(AnonymousClass3M3.A01(r12, C222813r.A01(A0x)));
                            C1502274l r13 = new C1502274l(this, A0Q, A0x, 20);
                            C19770wU r06 = this.A0D;
                            if (r06 != null) {
                                r06.Boy(r13);
                                this.A0G = r13;
                                return A0Q;
                            }
                            throw C36321k7.A08();
                        }
                        throw C36331k8.A0d("infraABProps");
                    }
                    throw C36331k8.A0d("infraABProps");
                }
                throw C36331k8.A0d("infraABProps");
            }
            throw C36331k8.A0d("contactManager");
        }
        throw C36381kD.A0k();
    }

    public void A1R(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.A1R(bundle);
        C96054mi r0 = this.A03;
        if (r0 == null) {
            throw C36331k8.A0d("adapter");
        }
        bundle.putInt("selectedItem", r0.A00);
        C96054mi r02 = this.A03;
        if (r02 == null) {
            throw C36331k8.A0d("adapter");
        }
        bundle.putString("text", r02.A01.toString());
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        boolean z = A0b().getBoolean("should_launch_home_activity");
        AnonymousClass00T r4 = this.A0H;
        C165147sx.A02(A0m(), ((BlockReasonListViewModel) r4.getValue()).A01, new AnonymousClass7U6(bundle, this), 42);
        C165147sx.A02(A0m(), ((BlockReasonListViewModel) r4.getValue()).A0E, new AnonymousClass7U7(this, z), 41);
    }

    public static final void A03(BlockReasonListFragment blockReasonListFragment, String str) {
        C51092nG r11;
        BlockReasonListFragment blockReasonListFragment2 = blockReasonListFragment;
        boolean z = blockReasonListFragment2.A0b().getBoolean("show_success_toast");
        CheckBox checkBox = blockReasonListFragment2.A00;
        String str2 = null;
        if (checkBox == null) {
            throw C36331k8.A0d("reportCheckbox");
        }
        boolean isChecked = checkBox.isChecked();
        boolean z2 = blockReasonListFragment2.A0b().getBoolean("should_delete_chat_post_block");
        String string = blockReasonListFragment2.A0b().getString("entry_point");
        if (string != null) {
            AnonymousClass01I A0i = blockReasonListFragment2.A0i();
            AnonymousClass00C.A0E(A0i, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
            C225314u r7 = (C225314u) A0i;
            BlockReasonListViewModel blockReasonListViewModel = (BlockReasonListViewModel) blockReasonListFragment2.A0H.getValue();
            C96054mi r3 = blockReasonListFragment2.A03;
            if (r3 == null) {
                throw C36331k8.A0d("adapter");
            }
            AnonymousClass6B6 r32 = (AnonymousClass6B6) C007103b.A0P(r3.A02, r3.A00);
            if (r32 != null) {
                str2 = r32.A01;
            }
            C96054mi r4 = blockReasonListFragment2.A03;
            if (r4 == null) {
                throw C36331k8.A0d("adapter");
            }
            Integer valueOf = Integer.valueOf(r4.A00);
            String obj = r4.A01.toString();
            C96054mi r33 = blockReasonListFragment2.A03;
            if (r33 == null) {
                throw C36331k8.A0d("adapter");
            }
            AnonymousClass6B6 r34 = (AnonymousClass6B6) C007103b.A0P(r33.A02, r33.A00);
            if (r34 != null) {
                r11 = r34.A00;
            } else {
                r11 = null;
            }
            AnonymousClass00C.A0D(r7, 0);
            C222813r r42 = UserJid.Companion;
            UserJid A012 = C222813r.A01(str);
            AnonymousClass141 A0D2 = blockReasonListViewModel.A06.A0D(A012);
            String str3 = null;
            if (obj != null && !AnonymousClass098.A06(obj)) {
                str3 = obj;
            }
            AnonymousClass3PR r5 = blockReasonListViewModel.A0C;
            int i = 3;
            if (!isChecked) {
                i = 1;
            }
            AnonymousClass3PR.A00(r5, A012, string, i);
            if (z2 || isChecked) {
                C225314u r8 = r7;
                C36391kE.A1Q(new C50102kD(r7, r8, blockReasonListViewModel.A04, new C163187pn(blockReasonListViewModel, 0), r11, blockReasonListViewModel.A07, A0D2, valueOf, str2, str3, string, false, isChecked, z2, true), blockReasonListViewModel.A0F);
                if (isChecked && blockReasonListViewModel.A0A.A0E(6186)) {
                    blockReasonListViewModel.A03.A07(R.string.f12nameremoved, 1);
                    if (!z2) {
                        return;
                    }
                } else if (z2) {
                    AnonymousClass1NG r35 = blockReasonListViewModel.A05;
                    r35.A0J.Boy(new C35351iY((Activity) r7, r35, A0D2));
                } else {
                    return;
                }
                C20810yC r2 = blockReasonListFragment2.A02;
                AnonymousClass00C.A07(r2);
                if (!r2.A0E(6187)) {
                    Intent addFlags = AnonymousClass190.A03(blockReasonListFragment2.A0a()).addFlags(603979776);
                    AnonymousClass00C.A08(addFlags);
                    blockReasonListFragment2.A1C(addFlags);
                    return;
                }
                return;
            }
            AnonymousClass1NG.A03(r7, new C163187pn(blockReasonListViewModel, 1), blockReasonListViewModel.A05, r11, A0D2, valueOf, str2, str3, string, true, z);
            return;
        }
        throw C36381kD.A0k();
    }

    public void A1J() {
        Runnable runnable = this.A0G;
        if (runnable != null) {
            C19770wU r0 = this.A0D;
            if (r0 != null) {
                r0.Bnx(runnable);
            } else {
                throw C36321k7.A08();
            }
        }
        super.A1J();
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        String A0x = C36411kG.A0x(this);
        if (A0x != null) {
            C20810yC r1 = this.A02;
            AnonymousClass00C.A07(r1);
            this.A0F = r1.A0E(6186);
            BlockReasonListViewModel blockReasonListViewModel = (BlockReasonListViewModel) this.A0H.getValue();
            C222813r r0 = UserJid.Companion;
            C1501874h.A01(blockReasonListViewModel.A0F, blockReasonListViewModel, C222813r.A01(A0x), 1);
            return;
        }
        throw C36381kD.A0k();
    }
}
