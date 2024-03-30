package com.whatsapp.blocklist;

import X.A9Y;
import X.AVW;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.AnonymousClass07B;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass19A;
import X.AnonymousClass1EU;
import X.AnonymousClass1EV;
import X.AnonymousClass1EZ;
import X.AnonymousClass1LI;
import X.AnonymousClass1NG;
import X.AnonymousClass1Pp;
import X.AnonymousClass1RY;
import X.AnonymousClass22g;
import X.AnonymousClass3EB;
import X.AnonymousClass3OM;
import X.AnonymousClass3PR;
import X.AnonymousClass3UF;
import X.AnonymousClass4PI;
import X.AnonymousClass6QB;
import X.AnonymousClass8gB;
import X.AnonymousClass9YX;
import X.B78;
import X.B79;
import X.B7E;
import X.B7M;
import X.B7Y;
import X.B89;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165607th;
import X.C166327vY;
import X.C185908uz;
import X.C18750th;
import X.C18800tq;
import X.C18830tt;
import X.C191509Df;
import X.C192639Hz;
import X.C19600wD;
import X.C196129Xv;
import X.C19770wU;
import X.C19970wo;
import X.C203399nx;
import X.C203539oF;
import X.C20500xf;
import X.C20810yC;
import X.C21010yW;
import X.C22090Agb;
import X.C22091Agc;
import X.C222813r;
import X.C224514j;
import X.C226815j;
import X.C22922AyY;
import X.C23199B9h;
import X.C233117z;
import X.C24361Cd;
import X.C24511Cs;
import X.C24541Cv;
import X.C24681Dj;
import X.C27111My;
import X.C27251Nm;
import X.C27731Pn;
import X.C29121Vk;
import X.C32001cn;
import X.C32681e1;
import X.C32881eL;
import X.C32931eR;
import X.C34021gK;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C37351mE;
import X.C51092nG;
import X.C53192qv;
import X.C53362rC;
import X.C62503Gk;
import X.C65093Qs;
import X.C69473da;
import X.C90514aH;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class BlockList extends AnonymousClass22g {
    public C191509Df A00;
    public AnonymousClass1LI A01;
    public AnonymousClass1NG A02;
    public C24361Cd A03;
    public AnonymousClass1Pp A04;
    public AnonymousClass16D A05;
    public AnonymousClass16I A06;
    public AnonymousClass171 A07;
    public C27731Pn A08;
    public C24541Cv A09;
    public C20500xf A0A;
    public C21010yW A0B;
    public C233117z A0C;
    public AnonymousClass3PR A0D;
    public AnonymousClass190 A0E;
    public C32931eR A0F;
    public C27251Nm A0G;
    public C32881eL A0H;
    public C196129Xv A0I;
    public AnonymousClass1EZ A0J;
    public C29121Vk A0K;
    public AnonymousClass1EV A0L;
    public AnonymousClass1EU A0M;
    public C24681Dj A0N;
    public C32681e1 A0O;
    public boolean A0P;
    public final C32001cn A0Q;
    public final C226815j A0R;
    public final C24511Cs A0S;
    public final Object A0T;
    public final List A0U;
    public final List A0V;
    public final Set A0W;
    public final AnonymousClass00T A0X;
    public final AnonymousClass00T A0Y;

    public boolean onContextItemSelected(MenuItem menuItem) {
        C196129Xv r3;
        AnonymousClass00C.A0D(menuItem, 0);
        ContextMenu.ContextMenuInfo menuInfo = menuItem.getMenuInfo();
        AnonymousClass00C.A0E(menuInfo, "null cannot be cast to non-null type android.widget.AdapterView.AdapterContextMenuInfo");
        Object itemAtPosition = getListView().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) menuInfo).position);
        AnonymousClass00C.A0E(itemAtPosition, "null cannot be cast to non-null type com.whatsapp.blocklist.Blockable");
        C22922AyY ayY = (C22922AyY) itemAtPosition;
        if (menuItem.getItemId() != 0) {
            return super.onContextItemSelected(menuItem);
        }
        int BD9 = ayY.BD9();
        if (BD9 != 0) {
            if (BD9 == 1 && (r3 = this.A0I) != null) {
                C29121Vk r6 = this.A0K;
                if (r6 != null) {
                    r3.A01(this, new C23199B9h(this, 1), r6, ((A9Y) ayY).A00, false);
                } else {
                    throw C36331k8.A0d("paymentsActionManager");
                }
            }
            return true;
        }
        AnonymousClass141 r32 = ((C69473da) ayY).A00;
        AnonymousClass1NG r2 = this.A02;
        if (r2 != null) {
            r2.A0G(this, r32, "block_list", true);
            C20500xf r5 = this.A0A;
            if (r5 != null) {
                C19770wU r8 = this.A04;
                C21010yW r62 = this.A0B;
                if (r62 != null) {
                    C24541Cv r4 = this.A09;
                    if (r4 != null) {
                        C65093Qs.A01(r4, r5, r62, C36351kA.A0j(r32), r8, C36371kC.A0p(), (Integer) null, 2);
                        return true;
                    }
                    throw C36331k8.A0d("lastMessageStore");
                }
                throw C36331k8.A0d("wamRuntime");
            }
            throw C36331k8.A0d("infraABProps");
        }
        throw C36331k8.A0d("blockListManager");
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        String A0H2;
        String A0w;
        boolean A1a = C36341k9.A1a(contextMenu, view);
        AnonymousClass00C.A0D(contextMenuInfo, 2);
        Object itemAtPosition = getListView().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position);
        AnonymousClass00C.A0E(itemAtPosition, "null cannot be cast to non-null type com.whatsapp.blocklist.Blockable");
        C22922AyY ayY = (C22922AyY) itemAtPosition;
        int BD9 = ayY.BD9();
        if (BD9 != 0) {
            if (BD9 == A1a) {
                A0H2 = ((A9Y) ayY).A00;
            }
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        }
        AnonymousClass171 r1 = this.A07;
        if (r1 != null) {
            A0H2 = r1.A0H(((C69473da) ayY).A00);
        } else {
            throw C36331k8.A0d("waContactNames");
        }
        if (ayY instanceof C69473da) {
            AnonymousClass11F r12 = ((C69473da) ayY).A00.A0H;
            if (AnonymousClass143.A0H(r12)) {
                Object[] objArr = new Object[2];
                objArr[0] = A0H2;
                if (this.A0H != null) {
                    UserJid A0b = C36401kF.A0b(r12);
                    AnonymousClass00C.A0E(A0b, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
                    AnonymousClass00C.A0D(A0b, 0);
                    A0w = C36391kE.A0v(this, (Object) null, objArr, A1a, R.string.f12nameremoved);
                    AnonymousClass00C.A0B(A0w);
                    contextMenu.add(0, 0, 0, A0w);
                    super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
                }
                throw C36331k8.A0d("interopUiCache");
            }
        }
        A0w = C36351kA.A0w(this, A0H2, A1a ? 1 : 0, R.string.f12nameremoved);
        AnonymousClass00C.A0B(A0w);
        contextMenu.add(0, 0, 0, A0w);
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass00C.A0D(menu, 0);
        menu.add(0, R.id.menuitem_settings_add_blocked_contact, 0, R.string.f12nameremoved).setIcon(R.drawable.ic_action_add_person).setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    public static final void A0u(BlockList blockList) {
        TextView A0M2 = C36341k9.A0M(blockList.A00, R.id.block_list_primary_text);
        TextView A0M3 = C36341k9.A0M(blockList.A00, R.id.block_list_help);
        TextView A0M4 = C36341k9.A0M(blockList.A00, R.id.block_list_info);
        AnonymousClass1NG r0 = blockList.A02;
        if (r0 == null) {
            throw C36331k8.A0d("blockListManager");
        } else if (r0.A0M()) {
            A0M3.setVisibility(0);
            A0M4.setVisibility(0);
            Drawable A002 = AnonymousClass00E.A00(blockList, R.drawable.ic_add_person_tip);
            if (A002 != null) {
                A0M2.setText(R.string.f12nameremoved);
                String string = blockList.getString(R.string.f12nameremoved);
                A0M3.setText(C37351mE.A01(A0M3.getPaint(), AnonymousClass3UF.A08(A002, AnonymousClass00F.A00(blockList, C224514j.A00(A0M3.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved))), string, "%s"));
                C24681Dj r1 = blockList.A0N;
                if (r1 == null) {
                    throw C36331k8.A0d("disclosureDataManager");
                } else if (C53362rC.A00(r1, blockList.A0W)) {
                    C32681e1 r3 = blockList.A0O;
                    if (r3 != null) {
                        A0M4.setText(r3.A02(blockList, new AVW(blockList, 27), blockList.getString(R.string.f12nameremoved), "third-party-settings"));
                        A0M4.setMovementMethod(new C34021gK(blockList.A0D));
                        return;
                    }
                    throw C36331k8.A0b();
                } else {
                    A0M4.setText(R.string.f12nameremoved);
                }
            } else {
                throw C36381kD.A0l();
            }
        } else {
            A0M3.setVisibility(8);
            boolean A022 = C19600wD.A02(blockList);
            int i = R.string.f12nameremoved;
            if (A022) {
                i = R.string.f12nameremoved;
            }
            A0M2.setText(i);
        }
    }

    public void A2F() {
        if (!this.A0P) {
            this.A0P = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C165567td.A11(r1, this);
            C18830tt r2 = r1.A00;
            C165567td.A0v(r1, r2, this, C36321k7.A05(r1, r2, this));
            C53192qv.A00(this, new C62503Gk());
            this.A0E = C36351kA.A0h(r1);
            this.A0B = C36351kA.A0g(r1);
            this.A0A = r1.AzV();
            this.A08 = C165577te.A0Q(r1);
            this.A04 = C36361kB.A0V(r1);
            this.A05 = C36341k9.A0R(r1);
            this.A07 = C36341k9.A0S(r1);
            this.A0M = C36381kD.A0f(r1);
            this.A02 = C36381kD.A0V(r1);
            this.A09 = (C24541Cv) r1.A4O.get();
            this.A0D = C27111My.A2S(A0L2);
            this.A03 = (C24361Cd) r1.A1j.get();
            this.A0J = C165607th.A0Y(r1);
            this.A0L = C36371kC.A0h(r1);
            this.A0K = C165587tf.A0T(r1);
            this.A00 = (C191509Df) A0L2.A29.get();
            this.A0C = (C233117z) r1.A3w.get();
            this.A01 = (AnonymousClass1LI) r1.A3Q.get();
            this.A0N = (C24681Dj) r1.A6f.get();
            this.A0F = (C32931eR) r1.A4K.get();
            this.A0O = C36351kA.A0p(r2);
            this.A0G = (C27251Nm) r1.A4J.get();
            this.A0H = (C32881eL) r1.A4L.get();
            this.A06 = C165587tf.A0M(r1);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        Intent intent2 = intent;
        if (i != 10) {
            super.onActivityResult(i, i2, intent2);
        } else if (i2 == -1) {
            C222813r r0 = UserJid.Companion;
            if (intent != null) {
                str = intent2.getStringExtra("contact");
            } else {
                str = null;
            }
            UserJid A012 = C222813r.A01(str);
            AnonymousClass16D r02 = this.A05;
            if (r02 != null) {
                AnonymousClass141 A0D2 = r02.A0D(A012);
                if (!A0D2.A0C()) {
                    AnonymousClass3PR r03 = this.A0D;
                    if (r03 != null) {
                        boolean A1a = C36331k8.A1a("block_list", A012);
                        AnonymousClass3PR.A00(r03, A012, "block_list", A1a ? 1 : 0);
                        AnonymousClass1NG r4 = this.A02;
                        if (r4 != null) {
                            AnonymousClass1NG.A03(this, (AnonymousClass4PI) null, r4, (C51092nG) null, A0D2, (Integer) null, (String) null, (String) null, "block_list", A1a, A1a);
                            return;
                        }
                        throw C36331k8.A0d("blockListManager");
                    }
                    throw C36331k8.A0d("blockFunnelLogger");
                } else if (this.A0E != null) {
                    Context applicationContext = getApplicationContext();
                    AnonymousClass11F r42 = A0D2.A0H;
                    AnonymousClass00C.A0E(r42, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                    C20810yC r1 = this.A0D;
                    AnonymousClass00C.A07(r1);
                    startActivity(AnonymousClass190.A0x(applicationContext, (UserJid) r42, "biz_block_list", true, r1.A0E(6185), false, false));
                } else {
                    throw C36331k8.A0d("waIntents");
                }
            } else {
                throw C36331k8.A0d("contactManager");
            }
        } else {
            AnonymousClass3PR r2 = this.A0D;
            if (r2 != null) {
                AnonymousClass3PR.A00(r2, (UserJid) null, "block_list", 2);
                return;
            }
            throw C36331k8.A0d("blockFunnelLogger");
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        C196129Xv r8;
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
            setContentView((int) R.layout.f9nameremoved);
            AnonymousClass1EV r0 = this.A0L;
            if (r0 != null) {
                if (r0.A03()) {
                    AnonymousClass1EZ r02 = this.A0J;
                    if (r02 == null) {
                        throw C36331k8.A0d("paymentAccountSetup");
                    } else if (r02.A0F()) {
                        AnonymousClass1EU r03 = this.A0M;
                        if (r03 != null) {
                            C196129Xv BAH = r03.A05().BAH();
                            this.A0I = BAH;
                            if (BAH != null) {
                                synchronized (BAH) {
                                    StringBuilder A0u = AnonymousClass000.A0u();
                                    A0u.append("PAY: IndiaUpiBlockListManager shouldFetch lastFetched: ");
                                    C36351kA.A1S(A0u, BAH.A00);
                                    if (!BAH.A06.A08().A02()) {
                                        if (BAH.A00 != -1) {
                                            if (C19970wo.A00(BAH.A02) - BAH.A00 >= 86400000) {
                                            }
                                        }
                                        z = true;
                                    }
                                    z = false;
                                }
                                if (z && (r8 = this.A0I) != null) {
                                    C29121Vk r7 = this.A0K;
                                    if (r7 != null) {
                                        C23199B9h b9h = new C23199B9h(this, 0);
                                        Context context = r8.A03.A00;
                                        AnonymousClass17Y r5 = r8.A01;
                                        AnonymousClass19A r4 = r8.A04;
                                        AnonymousClass17Y r16 = r5;
                                        AnonymousClass8gB r14 = new AnonymousClass8gB(context, r16, r4, r8, r8.A05, r8.A07, r7);
                                        C192639Hz r72 = new C192639Hz(r8, b9h);
                                        Log.i("PAY: getBlockedVpas called");
                                        ArrayList A15 = C36441kJ.A15(r14.A03.A00());
                                        for (int i = 0; i < A15.size(); i++) {
                                            A15.set(i, C18750th.A05(C90514aH.A0y((String) A15.get(i))));
                                        }
                                        Collections.sort(A15);
                                        StringBuilder A0u2 = AnonymousClass000.A0u();
                                        Iterator it = A15.iterator();
                                        while (it.hasNext()) {
                                            A0u2.append(AnonymousClass001.A0C(it));
                                        }
                                        String A052 = C18750th.A05(A0u2.toString());
                                        AnonymousClass9YX r6 = r14.A00;
                                        if (r6 != null) {
                                            r6.A02("upi-get-blocked-vpas");
                                        }
                                        AnonymousClass19A r52 = r14.A02;
                                        String A092 = r52.A09();
                                        ArrayList arrayList = C185908uz.A00;
                                        AnonymousClass6QB A0T2 = C36421kH.A0T();
                                        C165567td.A1E(A0T2);
                                        C36331k8.A1D(A0T2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
                                        C36331k8.A1C(A0T2, A092);
                                        AnonymousClass6QB A0a = C165587tf.A0a();
                                        C36331k8.A1D(A0a, "action", "upi-get-blocked-vpas");
                                        if (A052 != null && C203539oF.A0U(A052, 0, true)) {
                                            C36331k8.A1D(A0a, "hash", A052);
                                        }
                                        A0a.A08("2", "version", C185908uz.A00);
                                        C203399nx A0I2 = C165567td.A0I(A0a, A0T2);
                                        r52.A0E(new B7M(r14.A00, r14.A01, r72, r14.A04, r6, r14), A0I2, A092, 204, 0);
                                    } else {
                                        throw C36331k8.A0d("paymentsActionManager");
                                    }
                                }
                            }
                        } else {
                            throw C36331k8.A0d("paymentsManager");
                        }
                    }
                }
                A0u(this);
                A3i((C166327vY) this.A0X.getValue());
                getListView().setEmptyView(findViewById(R.id.block_list_empty));
                getListView().setDivider((Drawable) null);
                getListView().setClipToPadding(false);
                registerForContextMenu(getListView());
                getListView().setOnItemClickListener(new B89(this, 1));
                AnonymousClass16I r1 = this.A06;
                if (r1 != null) {
                    r1.registerObserver(this.A0R);
                    C24361Cd r12 = this.A03;
                    if (r12 != null) {
                        r12.registerObserver(this.A0Q);
                        C233117z r13 = this.A0C;
                        if (r13 != null) {
                            r13.registerObserver(this.A0S);
                            AnonymousClass1NG r15 = this.A02;
                            if (r15 != null) {
                                r15.A0K((AnonymousClass3EB) null);
                                AVW.A00(this.A04, this, 31);
                                return;
                            }
                            throw C36331k8.A0d("blockListManager");
                        }
                        throw C36331k8.A0d("groupParticipantsObservers");
                    }
                    throw C36331k8.A0d("chatStateObservers");
                }
                throw C36331k8.A0d("contactObservers");
            }
            throw C36331k8.A0d("paymentsGatingManager");
        }
        throw C36381kD.A0l();
    }

    public BlockList(int i) {
        this.A0P = false;
        B7Y.A00(this, 9);
    }

    public void onDestroy() {
        super.onDestroy();
        ((AnonymousClass1RY) this.A0Y.getValue()).A02();
        AnonymousClass16I r1 = this.A06;
        if (r1 != null) {
            r1.unregisterObserver(this.A0R);
            C24361Cd r12 = this.A03;
            if (r12 != null) {
                r12.unregisterObserver(this.A0Q);
                C233117z r13 = this.A0C;
                if (r13 != null) {
                    r13.unregisterObserver(this.A0S);
                    return;
                }
                throw C36331k8.A0d("groupParticipantsObservers");
            }
            throw C36331k8.A0d("chatStateObservers");
        }
        throw C36331k8.A0d("contactObservers");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) == R.id.menuitem_settings_add_blocked_contact) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator it = this.A0V.iterator();
            while (it.hasNext()) {
                AnonymousClass11F r0 = C36391kE.A0f(it).A0H;
                if (r0 != null) {
                    A0I2.add(r0.getRawString());
                } else {
                    throw C36381kD.A0l();
                }
            }
            AnonymousClass3PR r3 = this.A0D;
            if (r3 != null) {
                AnonymousClass3PR.A00(r3, (UserJid) null, "block_list", 0);
                if (this.A0E != null) {
                    AnonymousClass3OM r1 = new AnonymousClass3OM(this);
                    r1.A03 = true;
                    r1.A0Z = A0I2;
                    r1.A03 = true;
                    startActivityForResult(AnonymousClass3OM.A02(r1, "com.whatsapp.contact.picker.ContactPicker"), 10);
                    return true;
                }
                throw C36331k8.A0d("waIntents");
            }
            throw C36331k8.A0d("blockFunnelLogger");
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return true;
    }

    public BlockList() {
        this(0);
        this.A0Y = C36431kI.A1I(new C22091Agc(this));
        this.A0X = C36431kI.A1I(new C22090Agb(this));
        this.A0T = C36441kJ.A11();
        this.A0V = AnonymousClass001.A0I();
        this.A0U = AnonymousClass001.A0I();
        this.A0W = C36441kJ.A17();
        this.A0R = new B79(this, 3);
        this.A0Q = new B78(this, 2);
        this.A0S = new B7E(this, 2);
    }
}
