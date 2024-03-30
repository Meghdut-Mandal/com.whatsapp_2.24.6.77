package com.whatsapp.writenfctag;

import X.AnonymousClass000;
import X.AnonymousClass155;
import X.AnonymousClass1Q0;
import X.C18800tq;
import X.C18830tt;
import X.C19430v1;
import X.C36321k7;
import X.C36331k8;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C65743Th;
import X.C89374Wh;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;

public class WriteNfcTagActivity extends AnonymousClass155 {
    public AnonymousClass1Q0 A00;
    public PendingIntent A01;
    public NfcAdapter A02;
    public String A03;
    public String A04;
    public boolean A05;

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = (AnonymousClass1Q0) A0B.A0L.get();
        }
    }

    public WriteNfcTagActivity(int i) {
        this.A05 = false;
        C89374Wh.A00(this, 24);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        C36321k7.A0O(this);
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setText(R.string.f12nameremoved);
        setContentView((View) textView);
        this.A04 = getIntent().getStringExtra("mime");
        this.A03 = getIntent().getStringExtra("data");
        this.A02 = NfcAdapter.getDefaultAdapter(this);
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(getPackageName(), "com.whatsapp.writenfctag.WriteNfcTagActivity");
        A0D.putExtra("mime", (String) null);
        A0D.putExtra("data", (String) null);
        Intent addFlags = A0D.addFlags(536870912);
        int i = 0;
        C65743Th.A05(addFlags, 0);
        if (C65743Th.A02) {
            i = 33554432;
        }
        this.A01 = PendingIntent.getActivity(this, 0, addFlags, i);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if ("android.nfc.action.TAG_DISCOVERED".equals(intent.getAction()) || "android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction())) {
            Tag tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
            NdefMessage ndefMessage = new NdefMessage(new NdefRecord[]{new NdefRecord(2, this.A04.getBytes(Charset.forName("US-ASCII")), (byte[]) null, this.A03.getBytes(Charset.forName("US-ASCII")))});
            int length = ndefMessage.toByteArray().length;
            try {
                Ndef ndef = Ndef.get(tag);
                if (ndef != null) {
                    ndef.connect();
                    if (!ndef.isWritable()) {
                        Log.e("writetag/failure/tag not writable");
                    } else if (ndef.getMaxSize() < length) {
                        Log.e("writetag/failure/tag too small");
                    } else {
                        ndef.writeNdefMessage(ndefMessage);
                    }
                    this.A05.A06(R.string.f12nameremoved, 0);
                    return;
                }
                NdefFormatable ndefFormatable = NdefFormatable.get(tag);
                if (ndefFormatable != null) {
                    try {
                        ndefFormatable.connect();
                        ndefFormatable.format(ndefMessage);
                    } catch (IOException e) {
                        Log.e("writetag/failure/", e);
                    }
                }
                this.A05.A06(R.string.f12nameremoved, 0);
                return;
                Log.i("writetag/success");
                this.A05.A06(R.string.f12nameremoved, 1);
                AnonymousClass1Q0 r2 = this.A00;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(C19430v1.A04);
                r2.A02(Uri.parse(C36381kD.A10(A0u, R.raw.send_message)));
                C36391kE.A1N(this.A08);
                finish();
            } catch (Exception e2) {
                Log.e("writetag/failure/", e2);
            }
        }
    }

    public void onPause() {
        super.onPause();
        this.A02.disableForegroundDispatch(this);
    }

    public void onResume() {
        super.onResume();
        IntentFilter[] intentFilterArr = new IntentFilter[2];
        C36331k8.A1N(new IntentFilter("android.nfc.action.TAG_DISCOVERED"), new IntentFilter("android.nfc.action.NDEF_DISCOVERED"), intentFilterArr);
        this.A02.enableForegroundDispatch(this, this.A01, intentFilterArr, (String[][]) null);
    }

    public WriteNfcTagActivity() {
        this(0);
    }
}
