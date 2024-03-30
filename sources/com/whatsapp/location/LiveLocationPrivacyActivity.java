package com.whatsapp.location;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0FM;
import X.AnonymousClass11F;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1A1;
import X.AnonymousClass1P5;
import X.AnonymousClass1RY;
import X.AnonymousClass38X;
import X.AnonymousClass3LW;
import X.AnonymousClass4TK;
import X.C011504z;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19970wo;
import X.C20830yE;
import X.C27731Pn;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36411kG;
import X.C36441kJ;
import X.C37951nT;
import X.C39001qm;
import X.C48752hz;
import X.C54262sf;
import X.C63813Ln;
import X.C64933Qa;
import X.C89344We;
import X.C89594Xd;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LiveLocationPrivacyActivity extends AnonymousClass155 {
    public View A00;
    public ListView A01;
    public AnonymousClass171 A02;
    public AnonymousClass1RY A03;
    public C27731Pn A04;
    public C20830yE A05;
    public C37951nT A06;
    public AnonymousClass1P5 A07;
    public AnonymousClass1A1 A08;
    public View A09;
    public Button A0A;
    public ScrollView A0B;
    public TextView A0C;
    public boolean A0D;
    public final List A0E;
    public final AnonymousClass4TK A0F;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C20830yE r4 = this.A05;
        RequestPermissionActivity.A0B.A0H(this, r4, R.string.f12nameremoved, R.string.f12nameremoved, 0);
        setContentView((int) R.layout.f9nameremoved);
        C36341k9.A0N(this).A0I(R.string.f12nameremoved);
        this.A03 = this.A04.A05(this, "live-location-privacy-activity");
        this.A06 = new C37951nT(this);
        this.A01 = (ListView) findViewById(R.id.list_view);
        View inflate = getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null, false);
        C011504z.A06(inflate, 2);
        this.A0C = C36351kA.A0E(inflate);
        this.A0B = (ScrollView) findViewById(R.id.live_location_not_sharing);
        this.A00 = findViewById(R.id.bottom_button_container);
        this.A0A = (Button) findViewById(R.id.stop_sharing_btn);
        this.A01.addHeaderView(inflate);
        View inflate2 = getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null, false);
        this.A09 = inflate2;
        this.A01.addFooterView(inflate2);
        C89594Xd.A00(this.A01, this, 9);
        this.A01.setAdapter(this.A06);
        this.A01.setOnScrollListener(new C63813Ln(this, getResources().getDimensionPixelSize(R.dimen.f7nameremoved)));
        C48752hz.A00(this.A0A, this, 28);
        A01(this);
        this.A07.A0Z(this.A0F);
    }

    public static void A01(LiveLocationPrivacyActivity liveLocationPrivacyActivity) {
        ArrayList A14;
        List list = liveLocationPrivacyActivity.A0E;
        list.clear();
        AnonymousClass1P5 r8 = liveLocationPrivacyActivity.A07;
        synchronized (r8.A0R) {
            Map A062 = AnonymousClass1P5.A06(r8);
            A14 = C36441kJ.A14(A062.size());
            long A002 = C19970wo.A00(r8.A0D);
            Iterator A0z = AnonymousClass000.A0z(A062);
            while (A0z.hasNext()) {
                AnonymousClass38X r5 = (AnonymousClass38X) A0z.next();
                if (AnonymousClass1P5.A0G(r5.A01, A002)) {
                    AnonymousClass16D r4 = r8.A0A;
                    C64933Qa r3 = r5.A02;
                    AnonymousClass11F r0 = r3.A00;
                    C18740tg.A06(r0);
                    C36361kB.A1O(r4.A08(r0), r3, A14);
                }
            }
        }
        list.addAll(A14);
        liveLocationPrivacyActivity.A06.notifyDataSetChanged();
        boolean isEmpty = list.isEmpty();
        TextView textView = liveLocationPrivacyActivity.A0C;
        if (isEmpty) {
            textView.setVisibility(8);
            liveLocationPrivacyActivity.A09.setVisibility(8);
            liveLocationPrivacyActivity.A01.setVisibility(8);
            liveLocationPrivacyActivity.A0B.setVisibility(0);
            liveLocationPrivacyActivity.A0A.setVisibility(8);
            return;
        }
        C18820ts r52 = liveLocationPrivacyActivity.A00;
        long size = (long) list.size();
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1L(A0L, list.size(), 0);
        textView.setText(r52.A0L(A0L, R.plurals.f10nameremoved, size));
        liveLocationPrivacyActivity.A0C.setVisibility(0);
        liveLocationPrivacyActivity.A09.setVisibility(0);
        liveLocationPrivacyActivity.A0B.setVisibility(8);
        liveLocationPrivacyActivity.A01.setVisibility(0);
        liveLocationPrivacyActivity.A0A.setVisibility(0);
    }

    public void A2F() {
        if (!this.A0D) {
            this.A0D = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A04 = C36351kA.A0T(A0B2);
            this.A02 = C36341k9.A0S(A0B2);
            this.A08 = C36351kA.A0n(A0B2);
            this.A05 = C36351kA.A0X(A0B2);
            this.A07 = C36411kG.A0l(A0B2);
        }
    }

    public Dialog onCreateDialog(int i) {
        if (i != 0) {
            return super.onCreateDialog(i);
        }
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0c(R.string.f12nameremoved);
        A002.A0r(true);
        C39001qm.A07(A002);
        C39001qm.A0B(A002, this, 34, R.string.f12nameremoved);
        AnonymousClass0FM create = A002.create();
        create.A02().A0T(1);
        return create;
    }

    public LiveLocationPrivacyActivity(int i) {
        this.A0D = false;
        C89344We.A00(this, 11);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass1P5 r0 = this.A07;
        r0.A0T.remove(this.A0F);
        AnonymousClass1RY r02 = this.A03;
        if (r02 != null) {
            r02.A02();
        }
    }

    public void onResume() {
        super.onResume();
        LocationSharingService.A02(getApplicationContext(), this.A07);
    }

    public LiveLocationPrivacyActivity() {
        this(0);
        this.A0E = AnonymousClass001.A0I();
        this.A0F = new C54262sf(this, 3);
    }
}
