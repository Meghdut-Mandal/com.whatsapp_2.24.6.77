package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.Editable;
import android.view.View;
import android.widget.ImageButton;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.community.ConversationCommunityViewModel;
import com.whatsapp.conversation.CapturePictureOrVideoDialogFragment;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.28e  reason: invalid class name */
public final class AnonymousClass28e extends AnonymousClass18Q implements AnonymousClass4P8 {
    public int A00;
    public C38891qO A01;
    public AnonymousClass22r A02;
    public final BroadcastReceiver A03;
    public final AnonymousClass01L A04;
    public final C19700wN A05;
    public final C225014r A06;
    public final AnonymousClass17Y A07;
    public final C87484Oz A08;
    public final C19730wQ A09;
    public final AnonymousClass1XY A0A;
    public final AnonymousClass1X4 A0B;
    public final C603337l A0C;
    public final ConversationCommunityViewModel A0D;
    public final C229216m A0E;
    public final AnonymousClass4UO A0F;
    public final C21060yb A0G;
    public final C20830yE A0H;
    public final C19420v0 A0I;
    public final C20810yC A0J;
    public final AnonymousClass11F A0K;
    public final MentionableEntry A0L;
    public final C19890wg A0M;
    public final AnonymousClass1N2 A0N;
    public final C64813Pn A0O;
    public final AnonymousClass1GX A0P;
    public final boolean A0Q;
    public final C20690y0 A0R;
    public final C63553Km A0S;
    public final AnonymousClass1KK A0T;
    public final C64723Pe A0U;
    public final C89034Uz A0V;
    public final AnonymousClass1NG A0W;
    public final C53772rr A0X;
    public final AnonymousClass1V6 A0Y;
    public final C226515g A0Z;
    public final C24341Cb A0a;
    public final C20060wx A0b;
    public final C21010yW A0c;
    public final C54352so A0d;
    public final AnonymousClass2XH A0e;
    public final AnonymousClass1YL A0f;
    public final AnonymousClass39O A0g;
    public final C199029ea A0h;
    public final AnonymousClass1JD A0i;
    public final C88074Rh A0j;
    public final AnonymousClass1G4 A0k;
    public final C88564Te A0l = new C90324Zy(this, 0);

    private void A00() {
        int i;
        String str;
        if (this.A0H.A03(AnonymousClass3TA.A03()) != 0) {
            AnonymousClass01L r4 = this.A04;
            AnonymousClass00C.A0D(r4, 0);
            if (!r4.isFinishing()) {
                if (!C19550w8.A07()) {
                    i = R.string.f12nameremoved;
                } else {
                    boolean A092 = C19550w8.A09();
                    i = R.string.f12nameremoved;
                    if (!A092) {
                        i = R.string.f12nameremoved;
                    }
                }
                r4.startActivityForResult(AnonymousClass3US.A01(r4, R.string.f12nameremoved, i), 807);
            }
        } else if (this.A0a.A04(this.A0Z)) {
            AnonymousClass1V6 r1 = this.A0Y;
            C19420v0 r0 = this.A0I;
            AnonymousClass11F r9 = this.A0K;
            AnonymousClass3UR.A08(r1, r0, r9);
            C20810yC r12 = this.A0J;
            AnonymousClass17Y r8 = this.A07;
            C64813Pn r7 = this.A0O;
            AnonymousClass01L r6 = this.A04;
            r12.A07(2614);
            boolean z = true;
            if (r7 == null || !AnonymousClass3MR.A00(r7.A00)) {
                z = false;
            }
            Intent A0D2 = C36431kI.A0D();
            String packageName = r6.getPackageName();
            if (z) {
                str = "com.whatsapp.documentpicker.AudioPickerBottomSheetActivity";
            } else {
                str = "com.whatsapp.audiopicker.AudioPickerActivity";
            }
            C36331k8.A0u(A0D2, r9, packageName, str);
            try {
                r6.startActivityForResult(A0D2, 5);
                if (r7 != null) {
                    r7.A01(r6);
                }
            } catch (ActivityNotFoundException e) {
                Log.e("mediafileutils/start-activity ", e);
                r8.A06(R.string.f12nameremoved, 0);
            }
        }
    }

    private void A01() {
        AnonymousClass147 A062;
        boolean z;
        Intent A0D2;
        String packageName;
        String str;
        AnonymousClass3T1 quotedMessage = this.A0F.getQuotedMessage();
        boolean A0L2 = this.A09.A0L();
        Bundle bundle = null;
        AnonymousClass01L r3 = this.A04;
        AnonymousClass11F r7 = this.A0K;
        if (!A0L2) {
            if (quotedMessage != null) {
                bundle = C66013Ui.A03(quotedMessage.A1J);
            }
            A062 = C66013Ui.A06(quotedMessage);
            z = this.A0Q;
            boolean A002 = AnonymousClass3MR.A00(this.A0J);
            A0D2 = C36431kI.A0D();
            packageName = r3.getPackageName();
            if (A002) {
                str = "com.whatsapp.contact.picker.PhoneContactsSelectorBottomSheet";
            } else {
                str = "com.whatsapp.contact.picker.PhoneContactsSelector";
            }
        } else {
            if (quotedMessage != null) {
                bundle = C66013Ui.A03(quotedMessage.A1J);
            }
            A062 = C66013Ui.A06(quotedMessage);
            z = this.A0Q;
            boolean A003 = AnonymousClass3MR.A00(this.A0J);
            A0D2 = C36431kI.A0D();
            packageName = r3.getPackageName();
            if (A003) {
                str = "com.whatsapp.contact.picker.ContactsAttachmentSelectorBottomSheet";
            } else {
                str = "com.whatsapp.contact.picker.ContactsAttachmentSelector";
            }
        }
        C36331k8.A0v(A0D2, r7, packageName, str);
        A0D2.putExtra("quoted_message", bundle);
        A0D2.putExtra("quoted_group_jid", AnonymousClass143.A03(A062));
        A0D2.putExtra("has_number_from_url", z);
        r3.startActivityForResult(A0D2, 9);
        this.A0O.A01(r3);
    }

    private void A03() {
        Intent A082;
        String packageName;
        String str;
        AnonymousClass01L r6 = this.A04;
        View currentFocus = r6.getCurrentFocus();
        if (currentFocus != null) {
            this.A0N.A01(currentFocus);
        }
        AnonymousClass3T1 quotedMessage = this.A0F.getQuotedMessage();
        boolean A052 = this.A0e.A05(r6);
        long j = 0;
        Context applicationContext = r6.getApplicationContext();
        String A032 = AnonymousClass143.A03(this.A0K);
        if (A052) {
            if (quotedMessage != null) {
                j = quotedMessage.A1N;
            }
            String A033 = AnonymousClass143.A03(C66013Ui.A06(quotedMessage));
            boolean z = this.A0Q;
            boolean A002 = AnonymousClass3MR.A00(this.A0J);
            A082 = C36401kF.A08(A032);
            A082.putExtra("quoted_message_row_id", j);
            A082.putExtra("quoted_group_jid", A033);
            A082.putExtra("has_number_from_url", z);
            packageName = applicationContext.getPackageName();
            if (A002) {
                str = "com.whatsapp.location.LocationPicker2BottomSheet";
            } else {
                str = "com.whatsapp.location.LocationPicker2";
            }
        } else {
            if (quotedMessage != null) {
                j = quotedMessage.A1N;
            }
            String A034 = AnonymousClass143.A03(C66013Ui.A06(quotedMessage));
            boolean z2 = this.A0Q;
            boolean A003 = AnonymousClass3MR.A00(this.A0J);
            A082 = C36401kF.A08(A032);
            A082.putExtra("quoted_message_row_id", j);
            A082.putExtra("quoted_group_jid", A034);
            A082.putExtra("has_number_from_url", z2);
            packageName = applicationContext.getPackageName();
            if (A003) {
                str = "com.whatsapp.location.LocationPickerBottomSheet";
            } else {
                str = "com.whatsapp.location.LocationPicker";
            }
        }
        A082.setClassName(packageName, str);
        r6.startActivityForResult(A082, 802);
        this.A0O.A01(r6);
    }

    private void A04() {
        if (this.A0H.A04() == C51512nw.DENIED) {
            RequestPermissionActivity.A0B.A0D(this.A04, 809);
        } else if (this.A0a.A04(this.A0Z)) {
            A06();
        }
    }

    private void A05() {
        if (A09(810) && this.A0a.A04(this.A0Z)) {
            C20810yC r1 = this.A0J;
            AnonymousClass17Y r7 = this.A07;
            AnonymousClass01L r6 = this.A04;
            r1.A07(2614);
            Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI);
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            try {
                r6.startActivityForResult(intent, 21);
            } catch (ActivityNotFoundException e) {
                Log.e("mediafileutils/start-activity ", e);
                r7.A06(R.string.f12nameremoved, 0);
            }
        }
    }

    private void A06() {
        long j;
        AnonymousClass3T1 quotedMessage = this.A0F.getQuotedMessage();
        if (quotedMessage == null) {
            j = 0;
        } else {
            j = quotedMessage.A1N;
        }
        AnonymousClass147 A062 = C66013Ui.A06(quotedMessage);
        MentionableEntry mentionableEntry = this.A0L;
        String stringText = mentionableEntry.getStringText();
        List mentions = mentionableEntry.getMentions();
        int i = 1;
        if (this.A00 == 5) {
            i = 20;
        }
        int A072 = this.A0J.A07(2614);
        AnonymousClass01L r2 = this.A04;
        AnonymousClass11F r3 = this.A0K;
        boolean z = this.A0Q;
        int A002 = AnonymousClass3MW.A00(r3);
        boolean A1a = C36341k9.A1a(r2, r3);
        if (stringText == null) {
            stringText = "";
        }
        r2.startActivityForResult(AnonymousClass190.A0Z(r2, r3, A062, stringText, mentions, A072, i, A002, j, z, A1a, false), 22);
    }

    public static void A07(AnonymousClass28e r1) {
        C38891qO r0 = r1.A01;
        if (r0 != null && r0.isShowing()) {
            C38891qO r02 = r1.A01;
            C38891qO.A03(r02);
            C38891qO.A02(r02);
        }
    }

    private boolean A09(int i) {
        int i2;
        if (this.A0H.A0D()) {
            return true;
        }
        AnonymousClass01L r3 = this.A04;
        if (!C19550w8.A07()) {
            i2 = R.string.f12nameremoved;
        } else {
            boolean A092 = C19550w8.A09();
            i2 = R.string.f12nameremoved;
            if (!A092) {
                i2 = R.string.f12nameremoved;
            }
        }
        RequestPermissionActivity.A0F(r3, R.string.f12nameremoved, i2, i);
        return false;
    }

    public void A0A() {
        AnonymousClass01L r7 = this.A04;
        if (RequestPermissionActivity.A0I(r7, this.A0H, 31) && this.A0a.A04(this.A0Z)) {
            C20810yC r1 = this.A0J;
            AnonymousClass17Y r5 = this.A07;
            C20690y0 r9 = this.A0R;
            C19890wg r8 = this.A0M;
            r1.A07(2614);
            Intent putExtra = C36441kJ.A0I("android.media.action.IMAGE_CAPTURE").putExtra("output", AnonymousClass6YY.A01(r7, AnonymousClass3RU.A00(r9, r8, C25471Gl.A0D, ".jpg", 1)));
            putExtra.setFlags(2);
            try {
                r7.startActivityForResult(putExtra, 23);
            } catch (ActivityNotFoundException e) {
                Log.e("mediafileutils/start-activity ", e);
                r5.A06(R.string.f12nameremoved, 0);
            }
        }
    }

    public void A0B() {
        AnonymousClass01L r4 = this.A04;
        if (RequestPermissionActivity.A0I(r4, this.A0H, 32) && this.A0a.A04(this.A0Z)) {
            C20810yC r1 = this.A0J;
            AnonymousClass17Y r3 = this.A07;
            r1.A07(2614);
            try {
                r4.startActivityForResult(C36441kJ.A0I("android.media.action.VIDEO_CAPTURE"), 4);
            } catch (ActivityNotFoundException e) {
                Log.e("mediafileutils/start-activity ", e);
                r3.A06(R.string.f12nameremoved, 0);
            }
        }
    }

    public void A0C(int i, int i2, int i3) {
        long j;
        AnonymousClass1JD r6 = this.A0i;
        int i4 = 2;
        int i5 = i;
        if (i5 != 1) {
            int i6 = 3;
            if (i5 != 2) {
                i4 = 4;
                if (i5 != 3) {
                    i6 = 5;
                    if (i5 != 4) {
                        i4 = 6;
                        if (i5 != 5) {
                            i4 = 1;
                        }
                    }
                }
            }
            i4 = i6;
        }
        if (r6.A01 != 0 && Math.random() * ((double) 650) < 1.0d) {
            r6.A01 = 1;
            r6.A02 = SystemClock.elapsedRealtime();
            r6.A00 = i4;
        }
        AnonymousClass01L r7 = this.A04;
        Intent A0B2 = RequestPermissionActivity.A0B.A0B(r7, this.A0H, 30);
        if (A0B2 != null) {
            int i7 = 804;
            if (i5 != 2) {
                i7 = 803;
                if (i5 != 3) {
                    i7 = 805;
                    if (i5 != 5) {
                        i7 = 30;
                    }
                }
            }
            r7.startActivityForResult(A0B2, i7);
        } else if (this.A0a.A04(this.A0Z)) {
            if (this.A0b.A01() < C36401kF.A04(this.A0J, 3658)) {
                AnonymousClass1V2.A05(r7, this.A06, this.A0c, 5);
            } else {
                AnonymousClass1NG r0 = this.A0W;
                AnonymousClass11F r8 = this.A0K;
                if (C36351kA.A1X(r0, r8)) {
                    AnonymousClass3SJ.A01(r7, 106);
                } else {
                    AnonymousClass3T1 quotedMessage = this.A0F.getQuotedMessage();
                    if (quotedMessage == null) {
                        j = 0;
                    } else {
                        j = quotedMessage.A1N;
                    }
                    String A032 = AnonymousClass143.A03(C66013Ui.A06(quotedMessage));
                    boolean z = this.A0Q;
                    MentionableEntry mentionableEntry = this.A0L;
                    r7.startActivityForResult(AnonymousClass190.A0a(r7, r8, A032, mentionableEntry.getStringText(), mentionableEntry.getMentions(), i5, i2, i3, j, z), 806);
                    this.A0Y.A04();
                    return;
                }
            }
        }
        r6.A00();
    }

    public void A0D(int i, String str) {
        C38891qO r0 = this.A01;
        if (r0 != null) {
            r0.dismiss();
        }
        this.A0h.A01(this.A0K, this.A0F.getQuotedMessage(), this.A0L.getStringText(), str, i, false);
        this.A0O.A01(this.A04);
    }

    public void A0E(Uri uri, Integer num, int i) {
        if (C36351kA.A1X(this.A0W, this.A0K)) {
            AnonymousClass3SJ.A01(this.A04, 106);
            return;
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        if (uri != null) {
            A0I2.add(uri);
        }
        A08(num, A0I2, i, 38);
    }

    public void A0F(View view, int i) {
        View view2 = view;
        AnonymousClass01L r3 = this.A04;
        if (AnonymousClass3SJ.A04(r3)) {
            Log.i("conversation/attachment-popup - activity is ending, bailing...");
            return;
        }
        C20810yC r9 = this.A0J;
        if (C36391kE.A1Y(r9)) {
            AnonymousClass1N2 r2 = this.A0N;
            AnonymousClass01L r11 = r3;
            ImageButton imageButton = (ImageButton) view2;
            AnonymousClass22r r10 = new AnonymousClass22r(r11, imageButton, this.A05, this.A08, this.A0L, this.A0G, this.A0I, r9, r2);
            r10.A0F(this.A0D, this, this.A0K);
            this.A02 = r10;
            return;
        }
        AnonymousClass17Y r5 = this.A07;
        AnonymousClass1N2 r112 = this.A0N;
        AnonymousClass11F r102 = this.A0K;
        int i2 = i;
        C38891qO r22 = new C38891qO(r3, view2, r5, this.A0D, this, this.A0G, r9, r102, r112, AnonymousClass000.A1S(i2, 5));
        this.A01 = r22;
        this.A00 = i2;
        r22.A06(r3);
    }

    public void A0G(String str, boolean z) {
        String str2;
        long j;
        String str3;
        C20810yC r1 = this.A0J;
        AnonymousClass00C.A0D(r1, 0);
        if (!r1.A0E(3223)) {
            C38891qO r0 = this.A01;
            C18740tg.A06(r0);
            r0.dismiss();
        }
        switch (str.hashCode()) {
            case -1367751899:
                if (str.equals("camera")) {
                    if (z) {
                        this.A06.Btm(new CapturePictureOrVideoDialogFragment());
                        return;
                    }
                    A0C(this.A00, AnonymousClass3MW.A00(this.A0K), 8);
                    return;
                }
                break;
            case -1275762953:
                str2 = "quick reply";
                break;
            case -309474065:
                str2 = "product";
                break;
            case -196315310:
                if (str.equals("gallery")) {
                    if (z) {
                        A05();
                        return;
                    } else {
                        A04();
                        return;
                    }
                }
                break;
            case 3446719:
                if (str.equals("poll")) {
                    Editable text = this.A0L.getText();
                    String str4 = "";
                    if (text != null) {
                        int A002 = C63883Lu.A00(text);
                        int A072 = r1.A07(1406);
                        if (A002 > A072) {
                            CharSequence A012 = AnonymousClass3TB.A01(text, 0, text.length(), A072);
                            if (A012 != null) {
                                str4 = A012.toString();
                            }
                        } else {
                            str4 = text.toString();
                        }
                    }
                    C64813Pn r7 = this.A0O;
                    AnonymousClass01L r6 = this.A04;
                    AnonymousClass1N2 r2 = this.A0N;
                    AnonymousClass11F r8 = this.A0K;
                    AnonymousClass3T1 quotedMessage = this.A0F.getQuotedMessage();
                    View currentFocus = r6.getCurrentFocus();
                    if (currentFocus != null) {
                        r2.A01(currentFocus);
                    }
                    if (quotedMessage == null) {
                        j = 0;
                    } else {
                        j = quotedMessage.A1N;
                    }
                    boolean A003 = AnonymousClass3MR.A00(r7.A00);
                    Intent A0D2 = C36431kI.A0D();
                    String packageName = r6.getPackageName();
                    if (A003) {
                        str3 = "com.whatsapp.polls.PollCreatorBottomSheetActivity";
                    } else {
                        str3 = "com.whatsapp.polls.PollCreatorActivity";
                    }
                    C36331k8.A0v(A0D2, r8, packageName, str3);
                    A0D2.putExtra("quoted_message_row_id", j);
                    if (str4 != null) {
                        A0D2.putExtra("entry_string_text", str4);
                    }
                    r6.startActivityForResult(A0D2, 858);
                    r7.A01(r6);
                    return;
                }
                break;
            case 3529462:
                if (str.equals("shop")) {
                    C603337l r12 = this.A0C;
                    AnonymousClass2O1 r3 = new AnonymousClass2O1();
                    r3.A00 = 11;
                    r12.A01.Bls(r3, new C18950u5(1, 1), false);
                    return;
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    A00();
                    return;
                }
                break;
            case 96891546:
                if (str.equals("event")) {
                    if (r1.A0E(3223)) {
                        A0H();
                    }
                    AnonymousClass01L r5 = this.A04;
                    AnonymousClass11F r4 = this.A0K;
                    AnonymousClass3T1 quotedMessage2 = this.A0F.getQuotedMessage();
                    Intent A0D3 = C36431kI.A0D();
                    C36331k8.A0u(A0D3, r4, r5.getPackageName(), "com.whatsapp.events.EventCreationActivity");
                    if (quotedMessage2 != null) {
                        A0D3.putExtra("extra_quoted_message_row_id", quotedMessage2.A1N);
                    }
                    r5.startActivity(A0D3);
                    this.A0O.A01(r5);
                    return;
                }
                break;
            case 106006350:
                str2 = "order";
                break;
            case 861720859:
                if (str.equals("document")) {
                    A02();
                    return;
                }
                break;
            case 951526432:
                if (str.equals("contact")) {
                    if (!this.A0E.A00()) {
                        RequestPermissionActivity.A01(this.A04, R.string.f12nameremoved, R.string.f12nameremoved);
                        return;
                    } else {
                        A01();
                        return;
                    }
                }
                break;
            case 1901043637:
                if (str.equals("location")) {
                    if (RequestPermissionActivity.A0B.A0I(this.A04, this.A0H, this.A0I, 801)) {
                        A03();
                        return;
                    }
                    return;
                }
                break;
        }
        if (str.equals(str2)) {
            return;
        }
        C18740tg.A0D(false, AnonymousClass000.A0p("Wrong attachment type ", str, AnonymousClass000.A0u()));
    }

    public boolean A0H() {
        AnonymousClass22r r0 = this.A02;
        if (r0 == null || !r0.isShowing()) {
            return false;
        }
        this.A02.dismiss();
        return true;
    }

    public boolean BQk(Intent intent, int i, int i2) {
        int i3;
        File file;
        Uri data;
        Uri uri;
        Uri fromFile;
        int i4 = i;
        if (i4 == 801) {
            A03();
        } else {
            int i5 = i2;
            if (i4 == 23 && i2 == 0) {
                C19890wg r1 = this.A0M;
                synchronized (AnonymousClass1GW.class) {
                    if (AnonymousClass1GW.A00 > 0) {
                        SharedPreferences.Editor A0G2 = C36381kD.A0G(r1, C19430v1.A0A);
                        int i6 = AnonymousClass1GW.A00 - 1;
                        AnonymousClass1GW.A00 = i6;
                        A0G2.putInt("file_index", i6);
                        A0G2.apply();
                    }
                }
                return true;
            } else if (C19550w8.A0A() && i2 == 0 && i4 == 809 && this.A0H.A04() == C51512nw.PARTIAL) {
                A06();
                return true;
            } else {
                if (i5 == -1) {
                    if (i4 == 30 || i4 == 804) {
                        i3 = 2;
                    } else if (i4 == 803) {
                        i3 = 3;
                    } else if (i4 == 805) {
                        i3 = 5;
                    } else if (i4 == 31) {
                        A0A();
                        return true;
                    } else if (i4 == 32) {
                        A0B();
                        return true;
                    } else if (i4 == 150) {
                        A01();
                        return true;
                    } else if (i4 == 809) {
                        A04();
                        return true;
                    } else if (i4 == 810) {
                        A05();
                        return true;
                    } else if (i4 == 807) {
                        A00();
                        return true;
                    } else if (i4 == 808) {
                        A02();
                        return true;
                    } else if (i4 != 44) {
                        Intent intent2 = intent;
                        if (i4 == 6 || i4 == 36) {
                            if (intent != null) {
                                C18740tg.A06(intent2);
                                Uri uri2 = (Uri) intent2.getParcelableExtra("uri");
                                if (intent2.hasExtra("file_path")) {
                                    file = new File(intent2.getStringExtra("file_path"));
                                } else {
                                    file = null;
                                }
                                Uri data2 = intent2.getData();
                                ArrayList A0k2 = C36341k9.A0k(intent2);
                                if (uri2 != null) {
                                    String stringExtra = intent2.getStringExtra("caption");
                                    ArrayList A032 = C65713Te.A03(intent2.getStringExtra("mentions"));
                                    Iterator it = A0k2.iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        this.A0A.A04(uri2, this.A06, this.A0F.getQuotedMessage(), file, stringExtra, Collections.singletonList(next), A032, 1, this.A0Q);
                                    }
                                } else if (data2 != null) {
                                    AnonymousClass1XY r15 = this.A0A;
                                    AnonymousClass11F r5 = this.A0K;
                                    AnonymousClass3T1 quotedMessage = this.A0F.getQuotedMessage();
                                    r15.A04(data2, this.A06, quotedMessage, (File) null, (String) null, Collections.singletonList(r5), (List) null, 1, this.A0Q);
                                } else {
                                    ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("android.intent.extra.STREAM");
                                    if (parcelableArrayListExtra != null) {
                                        int size = parcelableArrayListExtra.size();
                                        Iterator it2 = parcelableArrayListExtra.iterator();
                                        while (it2.hasNext()) {
                                            AnonymousClass1XY r152 = this.A0A;
                                            AnonymousClass11F r52 = this.A0K;
                                            AnonymousClass3T1 quotedMessage2 = this.A0F.getQuotedMessage();
                                            C225014r r4 = this.A06;
                                            boolean z = this.A0Q;
                                            r152.A04((Uri) it2.next(), r4, quotedMessage2, (File) null, (String) null, Collections.singletonList(r52), (List) null, size, z);
                                        }
                                    }
                                }
                                if (intent2.getBooleanExtra("clear_message_after_send", false)) {
                                    this.A0L.setText("");
                                }
                                this.A0F.B1Z(5);
                            }
                        } else if (i4 == 5) {
                            C18740tg.A06(intent2);
                            ArrayList parcelableArrayListExtra2 = intent2.getParcelableArrayListExtra("result_uris");
                            if (parcelableArrayListExtra2 == null) {
                                if (intent2.getData() != null) {
                                    parcelableArrayListExtra2 = AnonymousClass001.A0I();
                                    parcelableArrayListExtra2.add(intent2.getData());
                                } else {
                                    Log.w("(conversation|messagereply)/audio/share/failed");
                                    this.A07.A06(R.string.f12nameremoved, 0);
                                }
                            }
                            int size2 = parcelableArrayListExtra2.size();
                            Iterator it3 = parcelableArrayListExtra2.iterator();
                            while (it3.hasNext()) {
                                this.A0P.A0j((Uri) it3.next(), this.A06, new C79233tO(intent2, this, size2));
                                this.A0F.B1Y();
                            }
                        } else if (i4 == 23) {
                            Uri fromFile2 = Uri.fromFile(AnonymousClass3RU.A01(this.A0M));
                            AnonymousClass1GW.A0O(this.A04, fromFile2);
                            ArrayList A0I2 = AnonymousClass001.A0I();
                            if (fromFile2 != null) {
                                A0I2.add(fromFile2);
                            }
                            A08((Integer) null, A0I2, 8, 39);
                            return true;
                        } else if (i4 == 4) {
                            if (intent == null || intent2.getData() == null) {
                                File A012 = AnonymousClass3RU.A01(this.A0M);
                                if (A012.exists()) {
                                    fromFile = Uri.fromFile(A012);
                                    AnonymousClass1GW.A0O(this.A04, fromFile);
                                } else {
                                    C36321k7.A1J(A012, "conversation/video/share/nocapturefile ", AnonymousClass000.A0u());
                                    Log.w("conversation/video/share/failed");
                                    this.A07.A06(R.string.f12nameremoved, 0);
                                    return true;
                                }
                            } else {
                                fromFile = intent2.getData();
                            }
                            if (fromFile != null) {
                                ArrayList A0I3 = AnonymousClass001.A0I();
                                A0I3.add(fromFile);
                                A08((Integer) null, A0I3, 8, 39);
                                return true;
                            }
                            Log.w("conversation/video/share/failed");
                            this.A07.A06(R.string.f12nameremoved, 0);
                            return true;
                        } else if (i4 == 21) {
                            if (intent != null) {
                                ArrayList A0I4 = AnonymousClass001.A0I();
                                ClipData clipData = intent2.getClipData();
                                if (clipData != null) {
                                    for (int i7 = 0; i7 < clipData.getItemCount(); i7++) {
                                        ClipData.Item itemAt = clipData.getItemAt(i7);
                                        if (!(itemAt == null || (uri = itemAt.getUri()) == null)) {
                                            A0I4.add(uri);
                                        }
                                    }
                                }
                                if (A0I4.isEmpty() && (data = intent2.getData()) != null) {
                                    A0I4.add(data);
                                }
                                A08((Integer) null, A0I4, 1, 27);
                                return true;
                            }
                        }
                        if (C36391kE.A1Y(this.A0J)) {
                            A0H();
                            return true;
                        }
                    }
                    A0C(i3, AnonymousClass3MW.A00(this.A0K), 8);
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (X.AnonymousClass3MR.A00(r3.A00) == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02() {
        /*
            r8 = this;
            boolean r0 = X.C19550w8.A07()
            if (r0 != 0) goto L_0x000e
            r0 = 808(0x328, float:1.132E-42)
            boolean r0 = r8.A09(r0)
            if (r0 == 0) goto L_0x0063
        L_0x000e:
            X.1Cb r1 = r8.A0a
            X.15g r0 = r8.A0Z
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0063
            X.01L r5 = r8.A04
            X.11F r7 = r8.A0K
            com.whatsapp.mentions.MentionableEntry r0 = r8.A0L
            java.lang.String r6 = r0.getStringText()
            java.util.List r4 = r0.getMentions()
            X.3Pn r3 = r8.A0O
            if (r3 == 0) goto L_0x0033
            X.0yC r0 = r3.A00
            boolean r1 = X.AnonymousClass3MR.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r5.getPackageName()
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "com.whatsapp.documentpicker.DocumentPickerBottomSheetActivity"
        L_0x0040:
            X.C36331k8.A0u(r2, r7, r1, r0)
            java.lang.String r0 = "caption"
            r2.putExtra(r0, r6)
            boolean r1 = X.C36421kH.A1a(r6)
            java.lang.String r0 = "clear_message_after_send"
            r2.putExtra(r0, r1)
            java.lang.String r1 = X.C65713Te.A01(r4)
            java.lang.String r0 = "mentions"
            r2.putExtra(r0, r1)
            r0 = 6
            r5.startActivityForResult(r2, r0)
            if (r3 == 0) goto L_0x0063
            r3.A01(r5)
        L_0x0063:
            return
        L_0x0064:
            java.lang.String r0 = "com.whatsapp.documentpicker.DocumentPickerActivity"
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass28e.A02():void");
    }

    private void A08(Integer num, ArrayList arrayList, int i, int i2) {
        if (!arrayList.isEmpty()) {
            AnonymousClass01L r3 = this.A04;
            AnonymousClass3FR r4 = new AnonymousClass3FR(r3);
            r4.A0H = arrayList;
            r4.A0D = AnonymousClass143.A03(this.A0K);
            r4.A02 = i;
            r4.A0N = true;
            AnonymousClass6QO r6 = new AnonymousClass6QO((Uri) arrayList.get(0));
            MentionableEntry mentionableEntry = this.A0L;
            r6.A0H(mentionableEntry.getStringText());
            this.A0f.A01(r6.A0D(), mentionableEntry.getMentions());
            r6.A0J(r6.A0D());
            r6.A0G(num);
            AnonymousClass3FR.A00(new C132366Tg(r6), r4);
            AnonymousClass3T1 quotedMessage = this.A0F.getQuotedMessage();
            if (quotedMessage != null) {
                r4.A07 = quotedMessage.A1N;
                r4.A0E = AnonymousClass143.A03(C66013Ui.A06(quotedMessage));
            }
            r4.A04 = i2;
            r3.startActivityForResult(r4.A01(), 22);
            return;
        }
        Log.e("conversation/setuppreview/share-failed");
        this.A07.A06(R.string.f12nameremoved, 0);
    }

    public void onActivityDestroyed(Activity activity) {
        A07(this);
        this.A0k.unregisterObserver(this.A0j);
        AnonymousClass0YC.A00(activity).A01(this.A03);
    }

    public AnonymousClass28e(AnonymousClass01L r17, C19700wN r18, C225014r r19, C20690y0 r20, AnonymousClass17Y r21, C87484Oz r22, C19730wQ r23, AnonymousClass1XY r24, AnonymousClass1X4 r25, C63553Km r26, AnonymousClass1KK r27, C64723Pe r28, C89034Uz r29, C603337l r30, AnonymousClass1NG r31, ConversationCommunityViewModel conversationCommunityViewModel, C229216m r33, AnonymousClass4UO r34, C53772rr r35, AnonymousClass1V6 r36, C226515g r37, C24341Cb r38, C21060yb r39, C20830yE r40, C19420v0 r41, C20060wx r42, C20810yC r43, C21010yW r44, C54352so r45, AnonymousClass11F r46, AnonymousClass2XH r47, AnonymousClass1YL r48, MentionableEntry mentionableEntry, AnonymousClass39O r50, C167527yC r51, AnonymousClass3EV r52, AnonymousClass1JD r53, C19890wg r54, AnonymousClass1G4 r55, AnonymousClass1N2 r56, C64813Pn r57, AnonymousClass1GX r58, boolean z) {
        AnonymousClass4VN r3 = new AnonymousClass4VN(this, 0);
        this.A03 = r3;
        C77513qc r0 = new C77513qc(this);
        this.A0j = r0;
        AnonymousClass01L r5 = r17;
        this.A04 = r5;
        C225014r r6 = r19;
        this.A06 = r6;
        this.A0J = r43;
        this.A07 = r21;
        this.A0N = r56;
        this.A09 = r23;
        this.A0A = r24;
        this.A05 = r18;
        this.A0R = r20;
        this.A0c = r44;
        this.A0V = r29;
        this.A0B = r25;
        this.A0U = r28;
        this.A0f = r48;
        this.A0b = r42;
        this.A0e = r47;
        this.A0C = r30;
        this.A0P = r58;
        this.A0G = r39;
        this.A0W = r31;
        this.A0i = r53;
        this.A0a = r38;
        this.A0E = r33;
        this.A0H = r40;
        this.A0I = r41;
        this.A0S = r26;
        this.A0T = r27;
        AnonymousClass1G4 r4 = r55;
        this.A0k = r4;
        this.A0M = r54;
        this.A0Y = r36;
        this.A0O = r57;
        this.A0F = r34;
        this.A0Z = r37;
        this.A0K = r46;
        this.A0Q = z;
        this.A0L = mentionableEntry;
        this.A0X = r35;
        r4.registerObserver(r0);
        this.A0g = r50;
        this.A0d = r45;
        this.A0D = conversationCommunityViewModel;
        this.A08 = r22;
        C80223v3 A002 = C80223v3.A00(this, 21);
        AnonymousClass3EV r02 = r52;
        AnonymousClass17Y r7 = r02.A00;
        C19730wQ r8 = r02.A01;
        AnonymousClass1EU r11 = r02.A04;
        this.A0h = new C199029ea(r5, r6, r7, r8, r02.A02, r02.A03, r11, r51, A002, (Runnable) null, true);
        AnonymousClass0YC.A00(r5).A02(r3, new IntentFilter("CLOSE_ATTACHMENT_TRAY"));
    }
}
