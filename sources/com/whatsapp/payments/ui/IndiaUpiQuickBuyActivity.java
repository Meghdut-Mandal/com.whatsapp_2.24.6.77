package com.whatsapp.payments.ui;

import android.content.Intent;

public class IndiaUpiQuickBuyActivity extends IndiaUpiCheckOrderDetailsActivity {
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1022 || i == 1024 || i2 == 0 || i2 == 252 || i2 == 251 || i2 == 250) {
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
