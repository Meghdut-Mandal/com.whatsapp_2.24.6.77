package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Collections;

/* renamed from: X.1fJ  reason: invalid class name and case insensitive filesystem */
public class C33431fJ implements C31751cK {
    public AnonymousClass11F A00;
    public final int A01;
    public final C32641dx A02;
    public final C19460v5 A03;
    public final C19460v5 A04;
    public final C19460v5 A05;
    public final AnonymousClass17Y A06;
    public final C19730wQ A07;
    public final AnonymousClass1X4 A08;
    public final C29411Wn A09;
    public final AnonymousClass1KK A0A;
    public final AnonymousClass1T4 A0B;
    public final AnonymousClass1LV A0C;
    public final C20230xE A0D;
    public final AnonymousClass16D A0E;
    public final C20430xY A0F;
    public final AnonymousClass1Y3 A0G;
    public final C33421fI A0H;
    public final C33411fH A0I;
    public final C19970wo A0J;
    public final C19420v0 A0K;
    public final C220412q A0L;
    public final AnonymousClass17X A0M;
    public final C20500xf A0N;
    public final C20350xQ A0O;
    public final AnonymousClass1CF A0P;
    public final C28361Si A0Q;
    public final AnonymousClass1CR A0R;
    public final C32661dz A0S;
    public final C32811eE A0T;
    public final AnonymousClass13J A0U;
    public final C19770wU A0V;
    public final WeakReference A0W;
    public final WeakReference A0X;

    public void BYZ() {
    }

    public void BYa() {
    }

    public void A00() {
        UserJid userJid;
        if (this.A00 != null) {
            this.A0F.A08();
            AnonymousClass141 A0D2 = this.A0E.A0D(this.A00);
            if (A0D2.A0C() && (userJid = (UserJid) A0D2.A06(UserJid.class)) != null) {
                this.A0A.A0E(this, userJid, (String) null);
            }
            this.A0S.A01();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.view.Menu r8, X.AnonymousClass11F r9, boolean r10, boolean r11) {
        /*
            r7 = this;
            java.lang.ref.WeakReference r0 = r7.A0W
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto L_0x002a
            r7.A00 = r9
            X.16D r0 = r7.A0E
            X.141 r4 = r0.A0D(r9)
            boolean r0 = r9 instanceof X.AnonymousClass146
            r3 = 0
            if (r0 == 0) goto L_0x002b
            X.0xQ r0 = r7.A0O
            java.util.Set r0 = r0.A15
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x002a
            r2 = 2131431623(0x7f0b10c7, float:1.848498E38)
            r1 = 2131888719(0x7f120a4f, float:1.9412081E38)
        L_0x0027:
            r8.add(r3, r2, r3, r1)
        L_0x002a:
            return
        L_0x002b:
            boolean r5 = r9 instanceof X.C177618e5
            if (r5 != 0) goto L_0x0038
            r2 = 2131431622(0x7f0b10c6, float:1.8484978E38)
            r0 = 2131886418(0x7f120152, float:1.9407414E38)
            r8.add(r3, r2, r3, r0)
        L_0x0038:
            X.3IL r0 = r4.A0F
            if (r0 != 0) goto L_0x00cd
            boolean r0 = X.AnonymousClass143.A0G(r9)
            if (r0 == 0) goto L_0x009a
            r4 = 2131431624(0x7f0b10c8, float:1.8484982E38)
            X.1LV r2 = r7.A0C
            r0 = r9
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r2 = r2.A0H(r0)
            r0 = 2131890172(0x7f120ffc, float:1.9415028E38)
            if (r2 == 0) goto L_0x0056
            r0 = 2131886486(0x7f120196, float:1.9407552E38)
        L_0x0056:
            r8.add(r3, r4, r3, r0)
        L_0x0059:
            boolean r0 = X.AnonymousClass143.A0G(r9)
            if (r0 == 0) goto L_0x00d4
            android.os.Parcelable$Creator r0 = X.AnonymousClass147.CREATOR
            X.147 r2 = X.C65533Sl.A03(r9)
            X.C18740tg.A06(r2)
            X.0xQ r0 = r7.A0O
            boolean r0 = r0.A0q(r2)
            if (r0 == 0) goto L_0x0087
            X.17X r0 = r7.A0M
            boolean r4 = r0.A0C(r2)
            r2 = 2131431623(0x7f0b10c7, float:1.848498E38)
            r0 = 2131888719(0x7f120a4f, float:1.9412081E38)
            if (r4 == 0) goto L_0x0084
            r2 = 2131431625(0x7f0b10c9, float:1.8484984E38)
            r0 = 2131889452(0x7f120d2c, float:1.9413568E38)
        L_0x0084:
            r8.add(r3, r2, r3, r0)
        L_0x0087:
            X.0v5 r2 = r7.A04
            boolean r0 = r2.A05()
            if (r0 == 0) goto L_0x010b
            r2.A02()
            java.lang.String r1 = "getMenuItemLabelId"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x009a:
            if (r5 == 0) goto L_0x00a3
            r4 = 2131431624(0x7f0b10c8, float:1.8484982E38)
            r0 = 2131890779(0x7f12125b, float:1.941626E38)
            goto L_0x0056
        L_0x00a3:
            X.0wQ r0 = r7.A07
            boolean r0 = r0.A0L()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0059
            X.0xf r0 = r7.A0N
            boolean r0 = X.AnonymousClass3M3.A01(r0, r9)
            if (r0 != 0) goto L_0x0059
            X.1CF r0 = r7.A0P
            boolean r0 = r0.A02(r9)
            if (r0 != 0) goto L_0x0059
            r2 = 2131431616(0x7f0b10c0, float:1.8484966E38)
            r0 = 2131886384(0x7f120130, float:1.9407345E38)
            r8.add(r3, r2, r3, r0)
            r4 = 2131431617(0x7f0b10c1, float:1.8484968E38)
            r0 = 2131886394(0x7f12013a, float:1.9407366E38)
            goto L_0x0056
        L_0x00cd:
            r4 = 2131431621(0x7f0b10c5, float:1.8484976E38)
            r0 = 2131895674(0x7f12257a, float:1.9426188E38)
            goto L_0x0056
        L_0x00d4:
            r2 = 2131431623(0x7f0b10c7, float:1.848498E38)
            if (r5 == 0) goto L_0x00f2
            r0 = 2131888726(0x7f120a56, float:1.9412095E38)
            r8.add(r3, r2, r3, r0)
            X.0v5 r2 = r7.A04
            boolean r0 = r2.A05()
            if (r0 == 0) goto L_0x010b
            r2.A02()
            java.lang.String r1 = "getMenuItemLabelId"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x00f2:
            r0 = 2131888706(0x7f120a42, float:1.9412055E38)
            r8.add(r3, r2, r3, r0)
            X.0v5 r2 = r7.A04
            boolean r0 = r2.A05()
            if (r0 == 0) goto L_0x010b
            r2.A02()
            java.lang.String r1 = "getMenuItemLabelId"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x010b:
            X.12q r4 = r7.A0L
            boolean r0 = r4.A0N(r9)
            if (r0 == 0) goto L_0x01ad
            r2 = 2131431636(0x7f0b10d4, float:1.8485007E38)
            r0 = 2131895160(0x7f122378, float:1.9425145E38)
            if (r5 == 0) goto L_0x011e
            r0 = 2131895158(0x7f122376, float:1.9425141E38)
        L_0x011e:
            java.lang.String r0 = r1.getString(r0)
            r8.add(r3, r2, r3, r0)
        L_0x0125:
            if (r11 == 0) goto L_0x0148
            X.0v0 r6 = r7.A0K
            boolean r5 = X.AnonymousClass1DH.A02(r6, r4, r9)
            X.1CR r2 = r7.A0R
            java.lang.String r0 = r9.getRawString()
            X.3LI r0 = X.AnonymousClass1CR.A02(r2, r0)
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0181
            if (r5 != 0) goto L_0x0181
            r1 = 2131431631(0x7f0b10cf, float:1.8484997E38)
            r0 = 2131890985(0x7f121329, float:1.9416677E38)
            r8.add(r3, r1, r3, r0)
        L_0x0148:
            boolean r0 = r4.A0N(r9)
            if (r0 != 0) goto L_0x016d
            if (r10 == 0) goto L_0x016d
            X.1CR r1 = r7.A0R
            java.lang.String r0 = r9.getRawString()
            X.3LI r0 = X.AnonymousClass1CR.A02(r1, r0)
            boolean r2 = r0.A0I
            r1 = 2131431634(0x7f0b10d2, float:1.8485003E38)
            r0 = 2131890990(0x7f12132e, float:1.9416687E38)
            if (r2 == 0) goto L_0x016a
            r1 = 2131431641(0x7f0b10d9, float:1.8485017E38)
            r0 = 2131891003(0x7f12133b, float:1.9416714E38)
        L_0x016a:
            r8.add(r3, r1, r3, r0)
        L_0x016d:
            int r0 = r4.A02(r9)
            r2 = 2131431629(0x7f0b10cd, float:1.8484993E38)
            r1 = 2131890910(0x7f1212de, float:1.9416525E38)
            if (r0 == 0) goto L_0x0027
            r2 = 2131431628(0x7f0b10cc, float:1.848499E38)
            r1 = 2131890909(0x7f1212dd, float:1.9416523E38)
            goto L_0x0027
        L_0x0181:
            r0 = 2131891002(0x7f12133a, float:1.9416712E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r0)
            boolean r0 = X.AnonymousClass1DH.A02(r6, r4, r9)
            if (r0 == 0) goto L_0x01a6
            r0 = 2131101126(0x7f0605c6, float:1.7814653E38)
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r0 = r2.length()
            r2.setSpan(r1, r3, r0, r3)
        L_0x01a6:
            r0 = 2131431640(0x7f0b10d8, float:1.8485015E38)
            r8.add(r3, r0, r3, r2)
            goto L_0x0148
        L_0x01ad:
            if (r5 == 0) goto L_0x01b7
            r2 = 2131431618(0x7f0b10c2, float:1.848497E38)
            r0 = 2131886508(0x7f1201ac, float:1.9407597E38)
            goto L_0x011e
        L_0x01b7:
            boolean r0 = r4.A0M(r9)
            if (r0 == 0) goto L_0x0125
            boolean r0 = r4.A0Q(r9)
            if (r0 != 0) goto L_0x0125
            r2 = 2131431618(0x7f0b10c2, float:1.848497E38)
            r0 = 2131886509(0x7f1201ad, float:1.9407599E38)
            goto L_0x011e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33431fJ.A01(android.view.Menu, X.11F, boolean, boolean):void");
    }

    public boolean A02(MenuItem menuItem, AnonymousClass02E r15, AnonymousClass01I r16) {
        C19770wU r3;
        Runnable runnable;
        Intent A0q;
        AnonymousClass01z r7 = (AnonymousClass01z) this.A0X.get();
        if (!(r7 == null || this.A00 == null)) {
            AnonymousClass01I r4 = r16;
            if (menuItem.getItemId() == R.id.menuitem_conversations_contact_info) {
                AnonymousClass141 A0D2 = this.A0E.A0D(this.A00);
                if (A0D2.A0F != null) {
                    r4.startActivity(new AnonymousClass190().A1V(r4, A0D2));
                }
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_delete) {
                C33411fH r0 = this.A0I;
                AnonymousClass11F r32 = this.A00;
                r0.A07.A01(r32, new C79213tM(r7, r0, r32));
                return true;
            } else {
                AnonymousClass02E r9 = r15;
                if (menuItem.getItemId() == R.id.menuitem_conversations_group_leave) {
                    AnonymousClass11F r1 = this.A00;
                    Parcelable.Creator creator = AnonymousClass147.CREATOR;
                    AnonymousClass147 A032 = C65533Sl.A03(r1);
                    if (A032 != null) {
                        C33411fH r5 = this.A0I;
                        ProgressDialogFragment A033 = ProgressDialogFragment.A03(R.string.f12nameremoved, R.string.f12nameremoved);
                        A033.A1i(r7, (String) null);
                        C19770wU r12 = r5.A08;
                        AnonymousClass1YR r11 = r5.A06;
                        r12.Box(new C49422j5(new AnonymousClass4ZJ(r7, A033, A032, 1), r9, r5.A02, r11, Collections.singleton(A032)), new Object[0]);
                        return true;
                    }
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_add_new_contact) {
                    AnonymousClass141 A0D3 = this.A0E.A0D(this.A00);
                    C32811eE r72 = this.A0T;
                    if (C20800yB.A01(C21000yV.A02, r72.A00, 913)) {
                        r72.A05(r4.getSupportFragmentManager(), A0D3, this.A00);
                        r4.getSupportFragmentManager().A0l(new C67763aR(r4, this), r4, "request_bottom_sheet_fragment");
                    } else {
                        Intent A034 = r72.A03(A0D3, this.A00, true);
                        C18740tg.A06(r4);
                        A034.setComponent(A034.resolveActivity(r4.getPackageManager()));
                        if (A034.getComponent() != null) {
                            r15.startActivityForResult(A034, this.A01);
                        } else {
                            Log.w("conversations/context system contact list could not found");
                            this.A06.A06(R.string.f12nameremoved, 0);
                            return true;
                        }
                    }
                    this.A0S.A03(true, 7);
                    return true;
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_add_to_existing_contact) {
                    try {
                        r15.startActivityForResult(this.A0T.A03(this.A0E.A0D(this.A00), this.A00, false), this.A01);
                        this.A0S.A03(false, 7);
                        return true;
                    } catch (ActivityNotFoundException unused) {
                        this.A06.A06(R.string.f12nameremoved, 0);
                        return true;
                    }
                } else if (menuItem.getItemId() == R.id.menuitem_conversations_pin) {
                    return this.A0H.A01(this.A00);
                } else {
                    if (menuItem.getItemId() == R.id.menuitem_conversations_unpin) {
                        C33421fI r52 = this.A0H;
                        AnonymousClass11F r42 = this.A00;
                        AnonymousClass00C.A0D(r42, 0);
                        r52.A05.Boy(new C35681j5(r52, r42, 14));
                        return true;
                    } else if (menuItem.getItemId() == R.id.menuitem_conversations_mute) {
                        AnonymousClass3RD.A02(C51992oi.CHAT_LIST_SCREEN, Collections.singleton(this.A00)).A1f(r7, (String) null);
                        return true;
                    } else {
                        if (menuItem.getItemId() == R.id.menuitem_conversations_unmute) {
                            AnonymousClass11F r33 = this.A00;
                            if (AnonymousClass1DH.A02(this.A0K, this.A0L, r33)) {
                                AnonymousClass1DH.A00(r4, r4.findViewById(R.id.result_list), this.A08, this.A00, 0);
                                return true;
                            }
                            r3 = this.A0V;
                            runnable = new C35691j6(this, 23);
                        } else if (menuItem.getItemId() == R.id.menuitem_conversations_archive) {
                            C33411fH r6 = this.A0I;
                            AnonymousClass11F r43 = this.A00;
                            r6.A05.A08(r43, 0, true);
                            r3 = r6.A08;
                            runnable = new C35321iV(r6, r43, 0, 47);
                        } else if (menuItem.getItemId() == R.id.menuitem_conversations_unarchive) {
                            C33411fH r02 = this.A0I;
                            r02.A05.A08(this.A00, 0, false);
                            return true;
                        } else if (menuItem.getItemId() == R.id.menuitem_conversations_mark_read) {
                            this.A0G.A01(this.A00, 1, true, true);
                            this.A0Q.A09();
                            return true;
                        } else if (menuItem.getItemId() == R.id.menuitem_conversations_mark_unread) {
                            this.A0G.A03(this.A00, true);
                            return true;
                        } else if (menuItem.getItemId() == R.id.menuitem_conversations_create_shortcuit) {
                            this.A09.A05(this.A0E.A0D(this.A00));
                            return true;
                        } else if (menuItem.getItemId() == R.id.menuitem_conversations_group_info) {
                            AnonymousClass141 A0D4 = this.A0E.A0D(this.A00);
                            if (A0D4.A0H instanceof C177618e5) {
                                C18740tg.A06(r4);
                                A0q = AnonymousClass190.A0p(r4, A0D4.A0H, true);
                            } else {
                                AnonymousClass11F r53 = this.A00;
                                if (AnonymousClass143.A0G(r53)) {
                                    AnonymousClass1LV r13 = this.A0C;
                                    if (r13.A0H((GroupJid) r53)) {
                                        AnonymousClass147 A022 = r13.A02((AnonymousClass147) this.A00);
                                        if (A022 == null || !this.A0D.Bkz(r4, r4.findViewById(R.id.result_list), A022)) {
                                            return false;
                                        }
                                        return true;
                                    }
                                }
                                A0q = AnonymousClass190.A0q(r4, A0D4.A0H, true, false, true);
                                AnonymousClass3M9.A01(A0q, r4.getClass().getSimpleName());
                            }
                            C05290Pd.A00(r4, A0q, (Bundle) null);
                            return true;
                        } else {
                            C19460v5 r14 = this.A04;
                            if (r14.A05()) {
                                menuItem.getItemId();
                                r14.A02();
                                throw new NullPointerException("getMenuItemLabelId");
                            }
                        }
                        r3.Boy(runnable);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public C33431fJ(Context context, AnonymousClass01z r3, C19460v5 r4, C19460v5 r5, C19460v5 r6, AnonymousClass17Y r7, C19730wQ r8, AnonymousClass1X4 r9, C29411Wn r10, AnonymousClass1KK r11, AnonymousClass1T4 r12, AnonymousClass1LV r13, C20230xE r14, AnonymousClass16D r15, C20430xY r16, AnonymousClass1Y3 r17, C33421fI r18, C33411fH r19, C19970wo r20, C19420v0 r21, C220412q r22, AnonymousClass17X r23, C20500xf r24, C20350xQ r25, AnonymousClass1CF r26, C32641dx r27, C28361Si r28, AnonymousClass1CR r29, C32661dz r30, C32811eE r31, AnonymousClass13J r32, C19770wU r33, int i) {
        this.A0W = new WeakReference(context);
        this.A0X = new WeakReference(r3);
        this.A0J = r20;
        this.A04 = r4;
        this.A06 = r7;
        this.A07 = r8;
        this.A0V = r33;
        this.A0L = r22;
        this.A05 = r5;
        this.A08 = r9;
        this.A0N = r24;
        this.A0E = r15;
        this.A0U = r32;
        this.A02 = r27;
        this.A0O = r25;
        this.A03 = r6;
        this.A0S = r30;
        this.A0R = r29;
        this.A09 = r10;
        this.A0T = r31;
        this.A0F = r16;
        this.A0Q = r28;
        this.A0K = r21;
        this.A0C = r13;
        this.A0H = r18;
        this.A0A = r11;
        this.A0B = r12;
        this.A0G = r17;
        this.A0D = r14;
        this.A0M = r23;
        this.A0I = r19;
        this.A0P = r26;
        this.A01 = i;
    }
}
