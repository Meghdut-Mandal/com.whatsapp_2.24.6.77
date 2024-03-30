package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.whatsapp.ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment;
import com.whatsapp.R;
import com.whatsapp.avatar.privacy.AvatarStickerAllowListPickerActivity;
import com.whatsapp.group.GroupAddBlacklistPickerActivity;
import com.whatsapp.invites.NobodyDeprecatedDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.lastseen.LastSeenBlockListPickerActivity;
import com.whatsapp.profile.AboutStatusBlockListPickerActivity;
import com.whatsapp.profile.ProfilePhotoBlockListPickerActivity;
import com.whatsapp.status.audienceselector.StatusRecipientsActivity;
import com.whatsapp.status.audienceselector.StatusTemporalRecipientsActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.8Ta  reason: invalid class name and case insensitive filesystem */
public abstract class C173788Ta extends AnonymousClass8U4 {
    public MenuItem A00;
    public C19460v5 A01;
    public C183558qz A02;
    public C183448qo A03;
    public AnonymousClass1LI A04;
    public AnonymousClass1NG A05;
    public C24361Cd A06;
    public C229216m A07;
    public AnonymousClass16D A08;
    public AnonymousClass16I A09;
    public AnonymousClass171 A0A;
    public AnonymousClass1RY A0B;
    public C27731Pn A0C;
    public C233117z A0D;
    public AnonymousClass3LE A0E;
    public C230116v A0F;
    public String A0G;
    public ArrayList A0H;
    public List A0I = AnonymousClass001.A0I();
    public Set A0J = C36441kJ.A16();
    public boolean A0K = true;
    public MenuItem A0L;
    public View A0M;
    public final Handler A0N;
    public final C166357vb A0O = new C166357vb(this);
    public final Runnable A0P;
    public final Set A0Q = C36441kJ.A16();
    public final Set A0R;
    public final Set A0S = C36441kJ.A16();
    public final C32001cn A0T;
    public final C226815j A0U;
    public final C24511Cs A0V;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.whatsapp.profile.AboutStatusBlockListPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.whatsapp.profile.ProfilePhotoBlockListPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: com.whatsapp.profile.AboutStatusBlockListPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.whatsapp.profile.AboutStatusBlockListPickerActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            r5 = r10
            X.C36331k8.A0l(r10)
            super.onCreate(r11)
            r0 = 2131626241(0x7f0e0901, float:1.8879713E38)
            r10.setContentView((int) r0)
            androidx.appcompat.widget.Toolbar r8 = X.C36411kG.A0R(r10)
            r10.setSupportActionBar(r8)
            X.1Pn r1 = r10.A0C
            java.lang.String r0 = "content-distribution-recipients-picker"
            X.1RY r0 = r1.A05(r10, r0)
            r10.A0B = r0
            X.0ts r9 = r10.A00
            r0 = 2131433616(0x7f0b1890, float:1.8489023E38)
            android.view.View r6 = r10.findViewById(r0)
            r1 = 0
            X.9oA r7 = new X.9oA
            r7.<init>(r10, r1)
            X.3LE r4 = new X.3LE
            r4.<init>(r5, r6, r7, r8, r9)
            r10.A0E = r4
            android.content.Intent r3 = r10.getIntent()
            java.lang.String r0 = "is_black_list"
            r2 = 1
            boolean r0 = r3.getBooleanExtra(r0, r2)
            r10.A0K = r0
            X.07B r3 = r10.getSupportActionBar()
            X.C18740tg.A06(r3)
            r3.A0U(r2)
            boolean r2 = r10.A0K
            boolean r0 = r10 instanceof com.whatsapp.status.audienceselector.StatusRecipientsActivity
            if (r2 == 0) goto L_0x014c
            if (r0 == 0) goto L_0x0128
            r0 = 2131894531(0x7f122103, float:1.942387E38)
        L_0x0056:
            r3.A0I(r0)
            if (r11 != 0) goto L_0x010f
            X.0yC r2 = r10.A0D
            r0 = 5868(0x16ec, float:8.223E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 != 0) goto L_0x0076
            X.16m r0 = r10.A07
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0076
            r2 = 2131892813(0x7f121a4d, float:1.9420385E38)
            r0 = 2131892812(0x7f121a4c, float:1.9420383E38)
            com.whatsapp.RequestPermissionActivity.A01(r10, r2, r0)
        L_0x0076:
            r0 = 2131429660(0x7f0b091c, float:1.8481E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A0M = r0
            X.C48732hx.A00(r0, r10, r1)
            boolean r0 = r10 instanceof com.whatsapp.profile.ProfilePhotoBlockListPickerActivity
            if (r0 == 0) goto L_0x00bb
            r4 = r5
            com.whatsapp.profile.ProfilePhotoBlockListPickerActivity r4 = (com.whatsapp.profile.ProfilePhotoBlockListPickerActivity) r4
            X.2aU r0 = r4.A00
            X.1Rs r3 = r0.A01()
            r2 = 20
        L_0x0091:
            X.BAA r0 = new X.BAA
            r0.<init>(r4, r2)
            r3.A08(r4, r0)
        L_0x0099:
            r0 = 16908292(0x1020004, float:2.387724E-38)
            X.C36341k9.A13(r10, r0, r1)
            r0 = 2131430909(0x7f0b0dfd, float:1.8483532E38)
            X.C36341k9.A13(r10, r0, r1)
            X.16I r1 = r10.A09
            X.15j r0 = r10.A0U
            r1.registerObserver(r0)
            X.1Cd r1 = r10.A06
            X.1cn r0 = r10.A0T
            r1.registerObserver(r0)
            X.17z r1 = r10.A0D
            X.1Cs r0 = r10.A0V
            r1.registerObserver(r0)
            return
        L_0x00bb:
            boolean r0 = r10 instanceof com.whatsapp.profile.AboutStatusBlockListPickerActivity
            if (r0 == 0) goto L_0x00cb
            r4 = r5
            com.whatsapp.profile.AboutStatusBlockListPickerActivity r4 = (com.whatsapp.profile.AboutStatusBlockListPickerActivity) r4
            X.2aR r0 = r4.A00
            X.1Rs r3 = r0.A01()
            r2 = 18
            goto L_0x0091
        L_0x00cb:
            boolean r0 = r10 instanceof com.whatsapp.lastseen.LastSeenBlockListPickerActivity
            if (r0 == 0) goto L_0x00de
            r3 = r5
            com.whatsapp.lastseen.LastSeenBlockListPickerActivity r3 = (com.whatsapp.lastseen.LastSeenBlockListPickerActivity) r3
            X.2aT r0 = r3.A00
            X.1Rs r2 = r0.A01()
            r0 = 24
            X.BA8.A00(r3, r2, r0)
            goto L_0x0099
        L_0x00de:
            boolean r0 = r10 instanceof com.whatsapp.group.GroupAddBlacklistPickerActivity
            if (r0 == 0) goto L_0x00f1
            r3 = r5
            com.whatsapp.group.GroupAddBlacklistPickerActivity r3 = (com.whatsapp.group.GroupAddBlacklistPickerActivity) r3
            X.2aS r0 = r3.A00
            X.1Rs r2 = r0.A01()
            r0 = 49
            X.BA7.A00(r3, r2, r0)
            goto L_0x0099
        L_0x00f1:
            boolean r0 = r10 instanceof com.whatsapp.avatar.privacy.AvatarStickerAllowListPickerActivity
            if (r0 == 0) goto L_0x010b
            r4 = r5
            com.whatsapp.avatar.privacy.AvatarStickerAllowListPickerActivity r4 = (com.whatsapp.avatar.privacy.AvatarStickerAllowListPickerActivity) r4
            X.2aV r0 = r4.A00
            if (r0 == 0) goto L_0x016b
            X.1Rs r3 = r0.A01()
            X.AlA r2 = new X.AlA
            r2.<init>(r4)
            r0 = 8
            X.BA6.A01(r4, r3, r2, r0)
            goto L_0x0099
        L_0x010b:
            r10.A3l()
            goto L_0x0099
        L_0x010f:
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "selected_jids"
            java.util.ArrayList r0 = r11.getStringArrayList(r0)
            java.util.ArrayList r2 = X.AnonymousClass143.A06(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0076
            java.util.Set r0 = r10.A0S
            r0.addAll(r2)
            goto L_0x0076
        L_0x0128:
            boolean r0 = r10 instanceof com.whatsapp.profile.ProfilePhotoBlockListPickerActivity
            if (r0 == 0) goto L_0x0131
            r0 = 2131893951(0x7f121ebf, float:1.9422693E38)
            goto L_0x0056
        L_0x0131:
            boolean r0 = r10 instanceof com.whatsapp.profile.AboutStatusBlockListPickerActivity
            if (r0 == 0) goto L_0x013a
            r0 = 2131893932(0x7f121eac, float:1.9422654E38)
            goto L_0x0056
        L_0x013a:
            boolean r0 = r10 instanceof com.whatsapp.lastseen.LastSeenBlockListPickerActivity
            if (r0 == 0) goto L_0x0143
            r0 = 2131893943(0x7f121eb7, float:1.9422677E38)
            goto L_0x0056
        L_0x0143:
            boolean r0 = r10 instanceof com.whatsapp.group.GroupAddBlacklistPickerActivity
            if (r0 == 0) goto L_0x0168
            r0 = 2131890049(0x7f120f81, float:1.9414779E38)
            goto L_0x0056
        L_0x014c:
            if (r0 == 0) goto L_0x0153
            r0 = 2131894532(0x7f122104, float:1.9423871E38)
            goto L_0x0056
        L_0x0153:
            boolean r0 = r10 instanceof com.whatsapp.profile.ProfilePhotoBlockListPickerActivity
            if (r0 != 0) goto L_0x0168
            boolean r0 = r10 instanceof com.whatsapp.profile.AboutStatusBlockListPickerActivity
            if (r0 != 0) goto L_0x0168
            boolean r0 = r10 instanceof com.whatsapp.lastseen.LastSeenBlockListPickerActivity
            if (r0 != 0) goto L_0x0168
            boolean r0 = r10 instanceof com.whatsapp.group.GroupAddBlacklistPickerActivity
            if (r0 != 0) goto L_0x0168
            r0 = 2131886595(0x7f120203, float:1.9407773E38)
            goto L_0x0056
        L_0x0168:
            r0 = 0
            goto L_0x0056
        L_0x016b:
            java.lang.String r0 = "stickerAllowListManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173788Ta.onCreate(android.os.Bundle):void");
    }

    public static void A0v(C173788Ta r3) {
        C183558qz r1 = r3.A02;
        if (r1 != null) {
            r1.A0D(true);
            r3.A02 = null;
        }
        C183558qz r12 = new C183558qz(r3, r3.A0H, r3.A0I);
        r3.A02 = r12;
        C36331k8.A1F(r12, r3.A04);
    }

    public static void A0w(C173788Ta r2) {
        boolean A1Z = C36411kG.A1Z(r2.A03);
        C183558qz r0 = r2.A02;
        if (r0 != null) {
            r0.A0D(A1Z);
            r2.A02 = null;
        }
        C183448qo r1 = new C183448qo(r2, r2.A0S);
        r2.A03 = r1;
        C36331k8.A1F(r1, r2.A04);
    }

    public static void A0x(C173788Ta r1, C18800tq r2) {
        C53192qv.A00(r1, new C62503Gk());
        r1.A01 = C19470v6.A00;
        r1.A0C = (C27731Pn) r2.A2E.get();
        r1.A08 = (AnonymousClass16D) r2.A2A.get();
        r1.A0A = (AnonymousClass171) r2.A90.get();
        r1.A05 = (AnonymousClass1NG) r2.A0v.get();
        r1.A06 = (C24361Cd) r2.A1j.get();
        r1.A07 = (C229216m) r2.A27.get();
        r1.A0F = (C230116v) r2.A4P.get();
        r1.A0D = (C233117z) r2.A3w.get();
        r1.A04 = (AnonymousClass1LI) r2.A3Q.get();
        r1.A09 = (AnonymousClass16I) r2.A2B.get();
    }

    public List A3j() {
        if (this instanceof StatusRecipientsActivity) {
            StatusRecipientsActivity statusRecipientsActivity = (StatusRecipientsActivity) this;
            if (statusRecipientsActivity instanceof StatusTemporalRecipientsActivity) {
                return StatusTemporalRecipientsActivity.A0y((StatusTemporalRecipientsActivity) statusRecipientsActivity).A01;
            }
            AnonymousClass16E r0 = statusRecipientsActivity.A03;
            if (r0 != null) {
                return r0.A0A();
            }
            throw C36331k8.A0d("statusStore");
        } else if (!(this instanceof AvatarStickerAllowListPickerActivity)) {
            return C90524aI.A0l();
        } else {
            AnonymousClass2aV r02 = ((AvatarStickerAllowListPickerActivity) this).A00;
            if (r02 != null) {
                return new LinkedList(r02.A04());
            }
            throw C36331k8.A0d("stickerAllowListManager");
        }
    }

    public void A3k() {
        List A15;
        List A0I2;
        boolean z;
        boolean z2;
        int i;
        if (this instanceof StatusRecipientsActivity) {
            StatusRecipientsActivity statusRecipientsActivity = (StatusRecipientsActivity) this;
            if (statusRecipientsActivity instanceof StatusTemporalRecipientsActivity) {
                StatusTemporalRecipientsActivity statusTemporalRecipientsActivity = (StatusTemporalRecipientsActivity) statusRecipientsActivity;
                if (!statusTemporalRecipientsActivity.A3n()) {
                    Intent A0D2 = C36431kI.A0D();
                    C64883Pu r2 = statusTemporalRecipientsActivity.A01;
                    if (r2 != null) {
                        if (statusTemporalRecipientsActivity.A0K) {
                            AnonymousClass3XT r0 = statusTemporalRecipientsActivity.A00;
                            if (r0 != null) {
                                A15 = r0.A01;
                            } else {
                                A15 = AnonymousClass001.A0I();
                            }
                            Set set = statusTemporalRecipientsActivity.A0S;
                            AnonymousClass00C.A07(set);
                            A0I2 = C36441kJ.A15(set);
                            AnonymousClass3XT r02 = statusTemporalRecipientsActivity.A00;
                            if (r02 != null) {
                                z2 = r02.A03;
                            } else {
                                z2 = false;
                            }
                            i = 2;
                        } else {
                            Set set2 = statusTemporalRecipientsActivity.A0S;
                            AnonymousClass00C.A07(set2);
                            A15 = C36441kJ.A15(set2);
                            AnonymousClass3XT r03 = statusTemporalRecipientsActivity.A00;
                            if (r03 != null) {
                                A0I2 = r03.A02;
                                z = r03.A03;
                            } else {
                                A0I2 = AnonymousClass001.A0I();
                                z = false;
                            }
                            i = 1;
                        }
                        AnonymousClass3XT r4 = new AnonymousClass3XT(A15, A0I2, i, z2, false);
                        statusTemporalRecipientsActivity.A00 = r4;
                        r2.A02(A0D2, r4);
                        statusTemporalRecipientsActivity.setResult(-1, A0D2);
                        statusTemporalRecipientsActivity.Bu2(R.string.f12nameremoved, R.string.f12nameremoved);
                        statusTemporalRecipientsActivity.finish();
                        return;
                    }
                    throw C36331k8.A0d("statusAudienceRepository");
                }
            } else if (!statusRecipientsActivity.A3n()) {
                statusRecipientsActivity.setResult(-1, C36431kI.A0D());
                statusRecipientsActivity.Bu2(R.string.f12nameremoved, R.string.f12nameremoved);
                int A002 = C36371kC.A00(statusRecipientsActivity.A0K ? 1 : 0);
                int i2 = -1;
                if (C20800yB.A01(C21000yV.A01, statusRecipientsActivity.A0D, 2531)) {
                    i2 = 0;
                }
                C19770wU r1 = statusRecipientsActivity.A04;
                AnonymousClass3Bu r22 = statusRecipientsActivity.A00;
                if (r22 != null) {
                    C36391kE.A1Q(r22.A00(statusRecipientsActivity, statusRecipientsActivity.A0S, A002, i2, 0, false, false, true, true, true), r1);
                    return;
                }
                throw C36331k8.A0d("factory");
            }
        } else if (this instanceof ProfilePhotoBlockListPickerActivity) {
            ProfilePhotoBlockListPickerActivity profilePhotoBlockListPickerActivity = (ProfilePhotoBlockListPickerActivity) this;
            profilePhotoBlockListPickerActivity.A05.A05(0, R.string.f12nameremoved);
            profilePhotoBlockListPickerActivity.A00.A02(profilePhotoBlockListPickerActivity.A0S).A08(profilePhotoBlockListPickerActivity, new C65973Ue(profilePhotoBlockListPickerActivity, 0));
        } else if (this instanceof AboutStatusBlockListPickerActivity) {
            AboutStatusBlockListPickerActivity aboutStatusBlockListPickerActivity = (AboutStatusBlockListPickerActivity) this;
            aboutStatusBlockListPickerActivity.A05.A05(0, R.string.f12nameremoved);
            aboutStatusBlockListPickerActivity.A00.A02(aboutStatusBlockListPickerActivity.A0S).A08(aboutStatusBlockListPickerActivity, new BAA(aboutStatusBlockListPickerActivity, 19));
        } else if (this instanceof LastSeenBlockListPickerActivity) {
            LastSeenBlockListPickerActivity lastSeenBlockListPickerActivity = (LastSeenBlockListPickerActivity) this;
            lastSeenBlockListPickerActivity.A05.A05(0, R.string.f12nameremoved);
            BA8.A00(lastSeenBlockListPickerActivity, lastSeenBlockListPickerActivity.A00.A02(lastSeenBlockListPickerActivity.A0S), 25);
        } else if (this instanceof GroupAddBlacklistPickerActivity) {
            GroupAddBlacklistPickerActivity groupAddBlacklistPickerActivity = (GroupAddBlacklistPickerActivity) this;
            if (groupAddBlacklistPickerActivity.A01) {
                groupAddBlacklistPickerActivity.Btm(new NobodyDeprecatedDialogFragment());
                return;
            }
            groupAddBlacklistPickerActivity.A05.A05(0, R.string.f12nameremoved);
            BA8.A00(groupAddBlacklistPickerActivity, groupAddBlacklistPickerActivity.A00.A02(groupAddBlacklistPickerActivity.A0S), 0);
        } else {
            AvatarStickerAllowListPickerActivity avatarStickerAllowListPickerActivity = (AvatarStickerAllowListPickerActivity) this;
            avatarStickerAllowListPickerActivity.A05.A05(0, R.string.f12nameremoved);
            AnonymousClass2aV r12 = avatarStickerAllowListPickerActivity.A00;
            if (r12 != null) {
                Set set3 = avatarStickerAllowListPickerActivity.A0S;
                AnonymousClass00C.A07(set3);
                BA6.A01(avatarStickerAllowListPickerActivity, r12.A02(set3), new C22348AlB(avatarStickerAllowListPickerActivity), 9);
                return;
            }
            throw C36331k8.A0d("stickerAllowListManager");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3m() {
        /*
            r8 = this;
            boolean r2 = r8.A0K
            r7 = 0
            r1 = 1
            java.util.Set r6 = r8.A0S
            boolean r0 = r6.isEmpty()
            if (r2 == 0) goto L_0x0039
            if (r0 == 0) goto L_0x0045
            r0 = 2131891590(0x7f121586, float:1.9417904E38)
        L_0x0011:
            java.lang.String r4 = r8.getString(r0)
        L_0x0015:
            android.view.MenuItem r3 = r8.A0L
            if (r3 == 0) goto L_0x002e
            int r2 = r6.size()
            java.util.Set r0 = r8.A0J
            int r1 = r0.size()
            r0 = 2131893933(0x7f121ead, float:1.9422657E38)
            if (r2 != r1) goto L_0x002b
            r0 = 2131895238(0x7f1223c6, float:1.9425303E38)
        L_0x002b:
            r3.setTitle(r0)
        L_0x002e:
            X.07B r0 = r8.getSupportActionBar()
            X.C18740tg.A06(r0)
            r0.A0P(r4)
            return
        L_0x0039:
            if (r0 == 0) goto L_0x003f
            r0 = 2131891591(0x7f121587, float:1.9417906E38)
            goto L_0x0011
        L_0x003f:
            X.0ts r5 = r8.A00
            r4 = 2131755340(0x7f10014c, float:1.9141557E38)
            goto L_0x004a
        L_0x0045:
            X.0ts r5 = r8.A00
            r4 = 2131755339(0x7f10014b, float:1.9141554E38)
        L_0x004a:
            int r0 = r6.size()
            long r2 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r0 = r6.size()
            X.AnonymousClass000.A1L(r1, r0, r7)
            java.lang.String r4 = r5.A0L(r1, r4, r2)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173788Ta.A3m():void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 150) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            Log.i("statusrecipients/permissions denied");
            finish();
        }
    }

    public void onBackPressed() {
        if (this.A0E.A07()) {
            this.A0E.A05(true);
            return;
        }
        Set set = this.A0Q;
        Set set2 = this.A0S;
        if (!set.containsAll(set2) || !set2.containsAll(set)) {
            Btm(new ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment());
        } else {
            finish();
        }
    }

    public boolean onSearchRequested() {
        this.A0E.A06(false);
        return false;
    }

    public C173788Ta() {
        HashSet A16 = C36441kJ.A16();
        this.A0R = A16;
        Objects.requireNonNull(A16);
        this.A0P = new C1497572q(A16, 47);
        this.A0N = C36341k9.A0H();
        this.A0U = new AnonymousClass4W3(this, 0);
        this.A0T = new B78(this, 0);
        this.A0V = new B7E(this, 0);
    }

    public void A3l() {
        A0w(this);
        ListView listView = (ListView) findViewById(16908298);
        View view = new View(this);
        view.setLayoutParams(new AbsListView.LayoutParams(1, getResources().getDimensionPixelSize(R.dimen.f7nameremoved)));
        listView.addFooterView(view, (Object) null, false);
        invalidateOptionsMenu();
        listView.setAdapter(this.A0O);
        listView.setOnItemClickListener(new B89(this, 0));
        A3m();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_action_search);
        this.A00 = icon;
        icon.setShowAsAction(10);
        this.A00.setOnActionExpandListener(new C207309ut(this));
        this.A00.setVisible(C36401kF.A1a(this.A0I));
        MenuItem icon2 = menu.add(0, R.id.menuitem_select_all, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_action_select_all);
        this.A0L = icon2;
        icon2.setShowAsAction(2);
        MenuItem menuItem = this.A0L;
        int size = this.A0S.size();
        int size2 = this.A0J.size();
        int i = R.string.f12nameremoved;
        if (size == size2) {
            i = R.string.f12nameremoved;
        }
        menuItem.setTitle(i);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A09.unregisterObserver(this.A0U);
        this.A06.unregisterObserver(this.A0T);
        this.A0D.unregisterObserver(this.A0V);
        this.A0B.A02();
        C183448qo r0 = this.A03;
        if (r0 != null) {
            r0.A0D(true);
            this.A03 = null;
        }
        C183558qz r02 = this.A02;
        if (r02 != null) {
            r02.A0D(true);
            this.A02 = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId == R.id.menuitem_select_all) {
            Set set = this.A0S;
            if (set.size() != this.A0J.size()) {
                int i = 0;
                while (true) {
                    C166357vb r1 = this.A0O;
                    if (i >= r1.getCount()) {
                        break;
                    }
                    set.add(((AnonymousClass141) r1.A00.get(i)).A06(UserJid.class));
                    i++;
                }
            } else {
                set.clear();
            }
            this.A0O.notifyDataSetChanged();
            A3m();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            Set set2 = this.A0Q;
            Set set3 = this.A0S;
            if (!set2.containsAll(set3) || !set3.containsAll(set2)) {
                Btm(new ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment());
                return true;
            }
            finish();
            return true;
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0E.A03(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Set set = this.A0S;
        if (!set.isEmpty()) {
            bundle.putStringArrayList("selected_jids", AnonymousClass143.A07(set));
        }
        this.A0E.A04(bundle);
    }
}
