package com.whatsapp.blockbusiness;

import X.AnonymousClass001;
import X.AnonymousClass07B;
import X.AnonymousClass09Y;
import X.AnonymousClass155;
import X.AnonymousClass3M3;
import X.AnonymousClass3PR;
import X.C18800tq;
import X.C18830tt;
import X.C20500xf;
import X.C222813r;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36431kI;
import X.C44122Lf;
import X.C89314Wb;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment;
import com.whatsapp.jid.UserJid;

public final class BlockBusinessActivity extends AnonymousClass155 {
    public C20500xf A00;
    public AnonymousClass3PR A01;
    public UserJid A02;
    public String A03;
    public boolean A04;

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A00 = r2.AzV();
            this.A01 = C27111My.A2S(A0L);
        }
    }

    public void onBackPressed() {
        AnonymousClass3PR r3 = this.A01;
        if (r3 != null) {
            String str = this.A03;
            if (str == null) {
                throw C36331k8.A0d("entryPoint");
            }
            UserJid userJid = this.A02;
            if (userJid == null) {
                throw C36331k8.A0d("userJid");
            }
            C36321k7.A0w(str, userJid);
            AnonymousClass3PR.A00(r3, userJid, str, 2);
            super.onBackPressed();
            return;
        }
        throw C36331k8.A0d("blockFunnelLogger");
    }

    public BlockBusinessActivity(int i) {
        this.A04 = false;
        C89314Wb.A00(this, 26);
    }

    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        String stringExtra = C36431kI.A0F(this, R.layout.f9nameremoved).getStringExtra("jid_extra");
        if (stringExtra != null) {
            boolean booleanExtra = getIntent().getBooleanExtra("third_party_bot", false);
            C222813r r0 = UserJid.Companion;
            this.A02 = C222813r.A01(stringExtra);
            String stringExtra2 = getIntent().getStringExtra("entry_point_extra");
            if (stringExtra2 != null) {
                this.A03 = stringExtra2;
                AnonymousClass3PR r3 = this.A01;
                if (r3 != null) {
                    UserJid userJid = this.A02;
                    if (userJid == null) {
                        throw C36331k8.A0d("userJid");
                    }
                    AnonymousClass3PR.A00(r3, userJid, stringExtra2, 0);
                    UserJid userJid2 = this.A02;
                    if (userJid2 == null) {
                        throw C36331k8.A0d("userJid");
                    }
                    C20500xf r02 = this.A00;
                    if (r02 != null) {
                        if (AnonymousClass3M3.A01(r02, userJid2)) {
                            string = C44122Lf.A02(getApplicationContext(), R.string.f12nameremoved);
                        } else {
                            int i = R.string.f12nameremoved;
                            if (booleanExtra) {
                                i = R.string.f12nameremoved;
                            }
                            string = getString(i);
                        }
                        AnonymousClass07B supportActionBar = getSupportActionBar();
                        if (supportActionBar != null) {
                            supportActionBar.A0U(true);
                            supportActionBar.A0Q(string);
                        }
                        if (bundle == null) {
                            Intent intent = getIntent();
                            AnonymousClass09Y A0O = C36341k9.A0O(this);
                            String str = this.A03;
                            if (str == null) {
                                throw C36331k8.A0d("entryPoint");
                            }
                            boolean booleanExtra2 = intent.getBooleanExtra("show_success_toast_extra", false);
                            boolean booleanExtra3 = intent.getBooleanExtra("show_report_upsell", false);
                            boolean booleanExtra4 = intent.getBooleanExtra("should_delete_chat_post_block", false);
                            boolean booleanExtra5 = intent.getBooleanExtra("should_launch_home_activity_post_block", false);
                            Bundle A07 = AnonymousClass001.A07();
                            A07.putString("jid", stringExtra);
                            A07.putString("entry_point", str);
                            A07.putBoolean("show_success_toast", booleanExtra2);
                            A07.putBoolean("show_report_upsell", booleanExtra3);
                            A07.putBoolean("should_delete_chat_post_block", booleanExtra4);
                            A07.putBoolean("should_launch_home_activity", booleanExtra5);
                            BlockReasonListFragment blockReasonListFragment = new BlockReasonListFragment();
                            blockReasonListFragment.A17(A07);
                            A0O.A0B(blockReasonListFragment, R.id.container);
                            A0O.A03();
                            return;
                        }
                        return;
                    }
                    throw C36331k8.A0d("infraABProps");
                }
                throw C36331k8.A0d("blockFunnelLogger");
            }
            throw AnonymousClass001.A08("Required value was null.");
        }
        throw AnonymousClass001.A08("Required value was null.");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) == 16908332) {
            AnonymousClass3PR r3 = this.A01;
            if (r3 != null) {
                String str = this.A03;
                if (str == null) {
                    throw C36331k8.A0d("entryPoint");
                }
                UserJid userJid = this.A02;
                if (userJid == null) {
                    throw C36331k8.A0d("userJid");
                }
                C36321k7.A0w(str, userJid);
                AnonymousClass3PR.A00(r3, userJid, str, 2);
            } else {
                throw C36331k8.A0d("blockFunnelLogger");
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public BlockBusinessActivity() {
        this(0);
    }
}
