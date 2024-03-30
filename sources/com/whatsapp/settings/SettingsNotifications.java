package com.whatsapp.settings;

import X.AnonymousClass15P;
import X.AnonymousClass1CR;
import X.AnonymousClass1RC;
import X.AnonymousClass2df;
import X.AnonymousClass3LI;
import X.AnonymousClass3LW;
import X.AnonymousClass3PI;
import X.AnonymousClass3SJ;
import X.AnonymousClass3Y7;
import X.AnonymousClass3Y8;
import X.C18800tq;
import X.C18830tt;
import X.C20600xp;
import X.C24501Cr;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import X.C39001qm;
import X.C89364Wg;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class SettingsNotifications extends AnonymousClass2df implements AnonymousClass15P {
    public static final int[] A0r = {R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public SwitchCompat A0A;
    public SwitchCompat A0B;
    public SwitchCompat A0C;
    public SwitchCompat A0D;
    public SwitchCompat A0E;
    public AnonymousClass1CR A0F;
    public AnonymousClass3PI A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public View A0Q;
    public View A0R;
    public View A0S;
    public View A0T;
    public View A0U;
    public View A0V;
    public View A0W;
    public View A0X;
    public View A0Y;
    public View A0Z;
    public ViewGroup A0a;
    public ViewGroup A0b;
    public TextView A0c;
    public TextView A0d;
    public TextView A0e;
    public TextView A0f;
    public TextView A0g;
    public TextView A0h;
    public TextView A0i;
    public TextView A0j;
    public boolean A0k;
    public boolean A0l;
    public String[] A0m;
    public String[] A0n;
    public String[] A0o;
    public String[] A0p;
    public String[] A0q;

    public static int A01(String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0088, code lost:
        r0 = r4.A0n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a9, code lost:
        X.AnonymousClass3SJ.A01(r4, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c0, code lost:
        r1.setText(A0r[r6]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e9, code lost:
        r0 = r4.A0p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00eb, code lost:
        r1.setText(r0[r6]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bgm(int r5, int r6) {
        /*
            r4 = this;
            r3 = 7
            switch(r5) {
                case 9: goto L_0x0005;
                case 10: goto L_0x001a;
                case 11: goto L_0x002e;
                case 12: goto L_0x0061;
                case 13: goto L_0x0075;
                case 14: goto L_0x008b;
                case 15: goto L_0x00c8;
                default: goto L_0x0004;
            }
        L_0x0004:
            return
        L_0x0005:
            r4.A06 = r6
            X.1CR r2 = r4.A0F
            java.lang.String[] r0 = r4.A0q
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "individual_chat_defaults"
            X.AnonymousClass1CR.A0A(r2, r0, r1)
            android.widget.TextView r1 = r4.A0j
            goto L_0x00e9
        L_0x001a:
            r4.A05 = r6
            X.1CR r2 = r4.A0F
            java.lang.String[] r0 = r4.A0o
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "individual_chat_defaults"
            X.AnonymousClass1CR.A08(r2, r0, r1)
            android.widget.TextView r1 = r4.A0i
            goto L_0x0088
        L_0x002e:
            java.lang.String[] r0 = r4.A0m
            r2 = r0[r6]
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "Desire"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "Wildfire"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x004d
        L_0x0044:
            java.lang.String r0 = "00FF00"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x00a9
        L_0x004d:
            r4.A04 = r6
            X.1CR r2 = r4.A0F
            java.lang.String[] r0 = r4.A0m
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "individual_chat_defaults"
            X.AnonymousClass1CR.A07(r2, r0, r1)
            android.widget.TextView r1 = r4.A0h
            goto L_0x00c0
        L_0x0061:
            r4.A03 = r6
            X.1CR r2 = r4.A0F
            java.lang.String[] r0 = r4.A0q
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "group_chat_defaults"
            X.AnonymousClass1CR.A0A(r2, r0, r1)
            android.widget.TextView r1 = r4.A0g
            goto L_0x00e9
        L_0x0075:
            r4.A02 = r6
            X.1CR r2 = r4.A0F
            java.lang.String[] r0 = r4.A0o
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "group_chat_defaults"
            X.AnonymousClass1CR.A08(r2, r0, r1)
            android.widget.TextView r1 = r4.A0f
        L_0x0088:
            java.lang.String[] r0 = r4.A0n
            goto L_0x00eb
        L_0x008b:
            java.lang.String[] r0 = r4.A0m
            r2 = r0[r6]
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "Desire"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00a1
            java.lang.String r0 = "Wildfire"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00ad
        L_0x00a1:
            java.lang.String r0 = "00FF00"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00ad
        L_0x00a9:
            X.AnonymousClass3SJ.A01(r4, r3)
            return
        L_0x00ad:
            r4.A01 = r6
            X.1CR r2 = r4.A0F
            java.lang.String[] r0 = r4.A0m
            r0 = r0[r6]
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "group_chat_defaults"
            X.AnonymousClass1CR.A07(r2, r0, r1)
            android.widget.TextView r1 = r4.A0e
        L_0x00c0:
            int[] r0 = A0r
            r0 = r0[r6]
            r1.setText(r0)
            return
        L_0x00c8:
            r4.A00 = r6
            X.1CR r3 = r4.A0F
            java.lang.String[] r0 = r4.A0q
            r0 = r0[r6]
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "individual_chat_defaults"
            X.3LI r1 = X.AnonymousClass1CR.A02(r3, r0)
            java.lang.String r0 = r1.A0A
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L_0x00e7
            r1.A0A = r2
            X.AnonymousClass1CR.A06(r1, r3)
        L_0x00e7:
            android.widget.TextView r1 = r4.A0d
        L_0x00e9:
            java.lang.String[] r0 = r4.A0p
        L_0x00eb:
            r0 = r0[r6]
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsNotifications.Bgm(int, int):void");
    }

    public Dialog onCreateDialog(int i) {
        C39001qm r2;
        if (i == 7) {
            r2 = AnonymousClass3LW.A00(this);
            r2.A0c(R.string.f12nameremoved);
            r2.A0h((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
        } else if (i != 8) {
            return super.onCreateDialog(i);
        } else {
            r2 = AnonymousClass3LW.A00(this);
            r2.A0c(R.string.f12nameremoved);
            C39001qm.A0F(r2, this, 38, R.string.f12nameremoved);
            r2.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
        }
        return r2.create();
    }

    public static void A07(SettingsNotifications settingsNotifications) {
        View view;
        int i;
        AnonymousClass3LI A0R2 = settingsNotifications.A0F.A0R();
        AnonymousClass3LI A0Q2 = settingsNotifications.A0F.A0Q();
        settingsNotifications.A0J = A0R2.A07();
        settingsNotifications.A06 = A01(A0R2.A08(), settingsNotifications.A0q);
        settingsNotifications.A05 = A01(A0R2.A06(), settingsNotifications.A0o);
        settingsNotifications.A04 = A01(A0R2.A05(), settingsNotifications.A0m);
        settingsNotifications.A0M = A0R2.A0C();
        settingsNotifications.A0I = A0Q2.A07();
        settingsNotifications.A03 = A01(A0Q2.A08(), settingsNotifications.A0q);
        settingsNotifications.A02 = A01(A0Q2.A06(), settingsNotifications.A0o);
        settingsNotifications.A01 = A01(A0Q2.A05(), settingsNotifications.A0m);
        settingsNotifications.A0K = A0Q2.A0C();
        settingsNotifications.A0H = A0R2.A03();
        settingsNotifications.A00 = A01(A0R2.A04(), settingsNotifications.A0q);
        settingsNotifications.A0k = A0R2.A02().A0H;
        settingsNotifications.A0L = A0Q2.A02().A0H;
        AnonymousClass3Y8.A00(settingsNotifications.A0P, settingsNotifications, 2);
        settingsNotifications.A0A.setChecked(settingsNotifications.A09.A2A());
        settingsNotifications.A09.setText(C20600xp.A06(settingsNotifications, settingsNotifications.A0J));
        AnonymousClass3Y8.A00(settingsNotifications.A0X, settingsNotifications, 3);
        int i2 = settingsNotifications.A06;
        if (i2 != -1) {
            settingsNotifications.A0j.setText(settingsNotifications.A0p[i2]);
        }
        AnonymousClass3Y7.A00(settingsNotifications.A0Z, settingsNotifications, 44);
        if (Build.VERSION.SDK_INT >= 29) {
            int A002 = AnonymousClass1RC.A00(settingsNotifications, R.attr.f4nameremoved, R.color.f6nameremoved);
            settingsNotifications.A0c.setTextColor(A002);
            settingsNotifications.A0i.setTextColor(A002);
            settingsNotifications.A0i.setText(R.string.f12nameremoved);
            view = settingsNotifications.A0Y;
            i = 45;
        } else {
            int i3 = settingsNotifications.A05;
            if (i3 != -1) {
                settingsNotifications.A0i.setText(settingsNotifications.A0n[i3]);
            }
            view = settingsNotifications.A0Y;
            i = 46;
        }
        AnonymousClass3Y7.A00(view, settingsNotifications, i);
        int i4 = settingsNotifications.A04;
        if (i4 != -1) {
            settingsNotifications.A0h.setText(A0r[i4]);
        }
        AnonymousClass3Y7.A00(settingsNotifications.A0W, settingsNotifications, 47);
        settingsNotifications.A0V.setVisibility(0);
        settingsNotifications.A0D.setChecked(Boolean.FALSE.equals(Boolean.valueOf(settingsNotifications.A0M)));
        AnonymousClass3Y7.A00(settingsNotifications.A0V, settingsNotifications, 48);
        settingsNotifications.A0b.setVisibility(0);
        settingsNotifications.A0E.setChecked(Boolean.FALSE.equals(Boolean.valueOf(settingsNotifications.A0k)));
        AnonymousClass3Y7.A00(settingsNotifications.A0b, settingsNotifications, 49);
        settingsNotifications.A0a.setVisibility(0);
        settingsNotifications.A0C.setChecked(Boolean.FALSE.equals(Boolean.valueOf(settingsNotifications.A0L)));
        AnonymousClass3Y8.A00(settingsNotifications.A0a, settingsNotifications, 0);
        settingsNotifications.A08.setText(C20600xp.A06(settingsNotifications, settingsNotifications.A0I));
        AnonymousClass3Y8.A00(settingsNotifications.A0S, settingsNotifications, 1);
        int i5 = settingsNotifications.A03;
        if (i5 != -1) {
            settingsNotifications.A0g.setText(settingsNotifications.A0p[i5]);
        }
        AnonymousClass3Y8.A00(settingsNotifications.A0U, settingsNotifications, 4);
        if (Build.VERSION.SDK_INT >= 29) {
            settingsNotifications.A0T.setVisibility(8);
        } else {
            int i6 = settingsNotifications.A02;
            if (i6 != -1) {
                settingsNotifications.A0f.setText(settingsNotifications.A0n[i6]);
            }
            AnonymousClass3Y8.A00(settingsNotifications.A0T, settingsNotifications, 5);
        }
        int i7 = settingsNotifications.A01;
        if (i7 != -1) {
            settingsNotifications.A0e.setText(A0r[i7]);
        }
        AnonymousClass3Y8.A00(settingsNotifications.A0R, settingsNotifications, 6);
        settingsNotifications.A0Q.setVisibility(0);
        settingsNotifications.A0B.setChecked(Boolean.FALSE.equals(Boolean.valueOf(settingsNotifications.A0K)));
        AnonymousClass3Y8.A00(settingsNotifications.A0Q, settingsNotifications, 7);
        settingsNotifications.A07.setText(C20600xp.A06(settingsNotifications, settingsNotifications.A0H));
        AnonymousClass3Y8.A00(settingsNotifications.A0N, settingsNotifications, 8);
        int i8 = settingsNotifications.A00;
        if (i8 != -1) {
            settingsNotifications.A0d.setText(settingsNotifications.A0p[i8]);
        }
        AnonymousClass3Y8.A00(settingsNotifications.A0O, settingsNotifications, 9);
    }

    public void A2F() {
        if (!this.A0l) {
            this.A0l = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A0F = C36371kC.A0j(r2);
            this.A0G = C27111My.A3F(A0L2);
        }
    }

    public SettingsNotifications(int i) {
        this.A0l = false;
        C89364Wg.A00(this, 26);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String A062;
        String str;
        TextView textView;
        super.onActivityResult(i, i2, intent);
        if ((i == 1 || i == 2 || i == 3) && i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null) {
                A062 = RingtoneManager.getRingtone(this, uri).getTitle(this);
                str = uri.toString();
            } else {
                A062 = C20600xp.A06(this, (String) null);
                str = "Silent";
            }
            if (i == 1) {
                this.A0J = str;
                AnonymousClass1CR.A09(this.A0F, "individual_chat_defaults", str);
                textView = this.A09;
            } else if (i != 2) {
                this.A0H = str;
                AnonymousClass1CR r2 = this.A0F;
                AnonymousClass3LI A022 = AnonymousClass1CR.A02(r2, "individual_chat_defaults");
                if (!TextUtils.equals(str, A022.A09)) {
                    A022.A09 = str;
                    AnonymousClass1CR.A06(A022, r2);
                }
                textView = this.A07;
            } else {
                this.A0I = str;
                AnonymousClass1CR.A09(this.A0F, "group_chat_defaults", str);
                textView = this.A08;
            }
            textView.setText(A062);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        C36321k7.A0O(this);
        this.A0P = findViewById(R.id.conversation_sound_setting);
        this.A0A = (SwitchCompat) findViewById(R.id.conversation_sound_switch);
        this.A0X = findViewById(R.id.notification_tone_setting);
        this.A09 = C36391kE.A0Q(this, R.id.selected_notification_tone);
        this.A0Z = findViewById(R.id.vibrate_setting);
        this.A0j = C36391kE.A0Q(this, R.id.selected_vibrate_setting);
        this.A0Y = findViewById(R.id.popup_notification_setting);
        this.A0c = C36391kE.A0Q(this, R.id.popup_notification_setting_title);
        this.A0i = C36391kE.A0Q(this, R.id.selected_popup_notification_setting);
        this.A0W = findViewById(R.id.notification_light_setting);
        this.A0h = C36391kE.A0Q(this, R.id.selected_notification_light_setting);
        this.A0V = findViewById(R.id.high_priority_notifications_setting);
        this.A0D = (SwitchCompat) findViewById(R.id.high_priority_notifications_switch);
        this.A0S = findViewById(R.id.group_notification_tone_setting);
        this.A08 = C36391kE.A0Q(this, R.id.selected_group_notification_tone);
        this.A0U = findViewById(R.id.group_vibrate_setting);
        this.A0g = C36391kE.A0Q(this, R.id.selected_group_vibrate_setting);
        this.A0T = findViewById(R.id.group_popup_notification_setting);
        this.A0f = C36391kE.A0Q(this, R.id.selected_group_popup_notification_setting);
        this.A0R = findViewById(R.id.group_notification_light_setting);
        this.A0e = C36391kE.A0Q(this, R.id.selected_group_notification_light_setting);
        this.A0Q = findViewById(R.id.group_high_priority_notifications_setting);
        this.A0B = (SwitchCompat) findViewById(R.id.group_high_priority_notifications_switch);
        this.A0N = findViewById(R.id.call_tone_setting);
        this.A07 = C36391kE.A0Q(this, R.id.selected_call_tone);
        this.A0O = findViewById(R.id.call_vibrate_setting);
        this.A0d = C36391kE.A0Q(this, R.id.selected_call_vibrate_setting);
        this.A0b = C36421kH.A0E(this, R.id.reaction_notifications_setting);
        this.A0a = C36421kH.A0E(this, R.id.group_reaction_notifications_setting);
        this.A0E = (SwitchCompat) findViewById(R.id.reactions_switch);
        this.A0C = (SwitchCompat) findViewById(R.id.group_reactions_switch);
        Resources resources = getResources();
        this.A0p = resources.getStringArray(R.array.f3nameremoved);
        this.A0q = resources.getStringArray(R.array.f3nameremoved);
        this.A0n = resources.getStringArray(R.array.f3nameremoved);
        this.A0o = resources.getStringArray(R.array.f3nameremoved);
        this.A0m = resources.getStringArray(R.array.f3nameremoved);
        A07(this);
        this.A0G.A02(this.A00, "notifications", C36381kD.A0q(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C36391kE.A1F(menu, R.id.menuitem_reset_notification_settings, R.string.f12nameremoved);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_reset_notification_settings) {
            return super.onOptionsItemSelected(menuItem);
        }
        AnonymousClass3SJ.A01(this, 8);
        return true;
    }

    public void onStart() {
        super.onStart();
        AnonymousClass1CR r2 = this.A0F;
        if (C24501Cr.A00) {
            boolean A0C2 = AnonymousClass1CR.A0C(r2, "individual_chat_defaults");
            boolean A0C3 = AnonymousClass1CR.A0C(r2, "group_chat_defaults");
            if (A0C2 || A0C3) {
                Log.i("settings-jid-notifications/onStart settings-store updated, refreshing ui");
                A07(this);
            }
        }
    }

    public SettingsNotifications() {
        this(0);
    }
}
