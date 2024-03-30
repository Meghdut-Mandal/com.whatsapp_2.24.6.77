package com.whatsapp.accountswitching.secondaryprocess;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass01L;
import X.AnonymousClass75B;
import X.C03570Gk;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36431kI;
import X.C40461va;
import X.C81333wq;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import java.util.Locale;

public final class AccountSwitchingActivity extends AnonymousClass01L {
    public Handler A00;

    public static final void A01(ContentProviderClient contentProviderClient) {
        if (contentProviderClient == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            contentProviderClient.close();
        } else {
            contentProviderClient.release();
        }
    }

    public static final void A07(AccountSwitchingActivity accountSwitchingActivity, boolean z) {
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(accountSwitchingActivity.getPackageName(), "com.whatsapp.Main");
        A0D.putExtra("request_type", accountSwitchingActivity.getIntent().getIntExtra("request_type", 0));
        A0D.putExtra("is_success", z);
        A0D.putExtra("source", accountSwitchingActivity.getIntent().getIntExtra("source", 0));
        A0D.putExtra("inactive_account_num_pending_message_notifs", accountSwitchingActivity.getIntent().getIntExtra("inactive_account_num_pending_message_notifs", 0));
        A0D.putExtra("switching_start_time_ms", accountSwitchingActivity.getIntent().getLongExtra("switching_start_time_ms", 0));
        A0D.putExtra("device_id", accountSwitchingActivity.getIntent().getStringExtra("device_id"));
        A0D.putExtra("phone_id", accountSwitchingActivity.getIntent().getStringExtra("phone_id"));
        if (accountSwitchingActivity.getIntent().hasExtra("phone_id_timestamp")) {
            A0D.putExtra("phone_id_timestamp", accountSwitchingActivity.getIntent().getLongExtra("phone_id_timestamp", 0));
        }
        A0D.setFlags(268468224);
        if (accountSwitchingActivity.getIntent().hasExtra("number_of_accounts")) {
            A0D.putExtra("number_of_accounts", accountSwitchingActivity.getIntent().getIntExtra("number_of_accounts", 0));
            A0D.putExtra("account_language", accountSwitchingActivity.getIntent().getStringExtra("account_language"));
        }
        if (accountSwitchingActivity.getIntent().hasExtra("account_switching_sender_jid")) {
            A0D.putExtra("account_switching_sender_jid", accountSwitchingActivity.getIntent().getStringExtra("account_switching_sender_jid"));
        }
        A0D.putExtra("is_missed_call_notification", accountSwitchingActivity.getIntent().getBooleanExtra("is_missed_call_notification", false));
        A0D.putExtra("should_open_link_companion", accountSwitchingActivity.getIntent().getBooleanExtra("should_open_link_companion", false));
        A0D.putExtra("abandon_add_account_from_back_press", accountSwitchingActivity.getIntent().getBooleanExtra("abandon_add_account_from_back_press", false));
        accountSwitchingActivity.getIntent().removeExtra("request_type");
        accountSwitchingActivity.startActivity(A0D);
        accountSwitchingActivity.finish();
    }

    public static final void A0F(AccountSwitchingActivity accountSwitchingActivity, boolean z) {
        A01(accountSwitchingActivity.getContentResolver().acquireUnstableContentProviderClient("com.whatsapp.accountswitching.AccountSwitchingContentProvider"));
        Handler handler = accountSwitchingActivity.A00;
        if (handler == null) {
            throw C36331k8.A0d("mainThreadHandler");
        }
        handler.post(new AnonymousClass75B(5, (Object) accountSwitchingActivity, z));
    }

    public void onCreate(Bundle bundle) {
        Context baseContext;
        super.onCreate(bundle);
        if (bundle == null) {
            this.A00 = C36341k9.A0H();
            String stringExtra = getIntent().getStringExtra("account_language");
            if (stringExtra == null || stringExtra.length() == 0) {
                baseContext = getBaseContext();
            } else {
                baseContext = getBaseContext();
                AnonymousClass00C.A08(baseContext);
                Locale forLanguageTag = Locale.forLanguageTag(stringExtra);
                if (forLanguageTag != null && !AnonymousClass000.A0U(baseContext).locale.equals(forLanguageTag)) {
                    if (Build.VERSION.SDK_INT < 26) {
                        Resources resources = baseContext.getResources();
                        Configuration configuration = resources.getConfiguration();
                        configuration.locale = forLanguageTag;
                        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                    } else {
                        Configuration configuration2 = new Configuration();
                        configuration2.setLocale(forLanguageTag);
                        baseContext = baseContext.createConfigurationContext(configuration2);
                        AnonymousClass00C.A08(baseContext);
                    }
                }
            }
            int intExtra = getIntent().getIntExtra("request_type", 0);
            if (intExtra == 0) {
                A07(this, false);
                return;
            }
            setContentView((int) R.layout.f9nameremoved);
            RecyclerView recyclerView = (RecyclerView) C36361kB.A0D(this, R.id.conversation_list_shimmer);
            recyclerView.setLayoutManager(new AccountSwitchingActivity$showShimmerTransition$layoutManager$1());
            recyclerView.setAdapter(new C40461va((int) Math.ceil(((double) AnonymousClass000.A0X(this).heightPixels) / ((double) getResources().getDimensionPixelSize(R.dimen.f7nameremoved)))));
            View A0B = C03570Gk.A0B(this, R.id.shimmer);
            AnonymousClass00C.A0E(A0B, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
            ((ShimmerFrameLayout) A0B).A03();
            Handler handler = this.A00;
            if (handler == null) {
                throw C36331k8.A0d("mainThreadHandler");
            }
            handler.post(new C81333wq(this, intExtra, 8, baseContext));
        }
    }
}
